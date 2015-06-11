SUMMARY = "7Led Display Control"
MAINTAINER = "Blackbox Team"
SECTION = "base"
LICENSE = "proprietary"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

PV = "1.0"
PR = "r4"

SRC_URI="file://enigma2-plugin-systemplugins-7ledcontrol.tar.gz"
        
S = "${WORKDIR}"

FILES_${PN} = "/usr/*"

do_install() {
    cp -rp ${S}/usr ${D}/
}