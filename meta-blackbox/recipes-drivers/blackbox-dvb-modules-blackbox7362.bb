SUMMARY = "Hardware drivers for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"

INHIBIT_PACKAGE_STRIP = "1"

inherit module

KV = "3.14.21"
SRCDATE = "20150703"

SRC_URI[md5sum] = "7ddae71259b09dbbb8cdf6030cb0f4b8"
SRC_URI[sha256sum] = "b2c45484711f3d6eeb4ba878cc6a33cee0b29f2a9fe94bdd2d524798f9314ad1"

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
