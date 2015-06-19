SUMMARY = "Hardware drivers for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"

INHIBIT_PACKAGE_STRIP = "1"

inherit module

KV = "3.14.21"
SRCDATE = "20150617"

SRC_URI[md5sum] = "03c212796a69f87af59410554db47dce"
SRC_URI[sha256sum] = "f4a4e1065e947e98f8bf765571bd1a00235b438d45691b877363110ba0cb52a4"

SRC_URI = "http://unibox.to/feeds/eco/development/drivers/linuxdvb_7362-${KV}-${SRCDATE}.tar.gz"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
    install -d ${D}/lib/modules/${KV}/extra
    install -d ${D}/${sysconfdir}/modules-load.d
    for i in linuxdvb; do
        install -m 0755 ${WORKDIR}/$i.ko ${D}/lib/modules/${KV}/extra
        echo $i >> ${D}/${sysconfdir}/modules-load.d/_${MACHINE}.conf
    done
}

FILES_${PN} += "${sysconfdir}/modules-load.d/_${MACHINE}.conf"
