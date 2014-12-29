SUMMARY = "Utilities for transponder & dvb-s blindscan"
SECTION = "base"
PRIORITY = "optional"
RDEPENDS_${PN} = "ncurses"

PACKAGE_ARCH = "${MACHINE_ARCH}"

LICENSE = "CLOSED"

PACKAGES = "blackbox-blindscan-dvbs-utils blackbox-blindscan-dvbs-utils-dbg blackbox-blindscan-dvbc-utils blackbox-blindscan-dvbc-utils-dbg"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_blackbox-blindscan-dvbs-utils += "virtual/blindscan-dvbs"
RPROVIDES_blackbox-blindscan-dvbc-utils += "virtual/blindscan-dvbc"

SRC_URI = "file://tda1002x file://blackbox_blindscan"

PV = "2.1"
PR = "r5"

S = "${WORKDIR}/"

FILES_blackbox-blindscan-dvbs-utils = "${bindir}/*_blindscan"
FILES_blackbox-blindscan-dvbc-utils = "${bindir}/tda1002x"
FILES_blackbox-blindscan-dvbs-utils-dbg = "${bindir}/.debug/*_blindscan"
FILES_blackbox-blindscan-dvbc-utils-dbg = "${bindir}/.debug/tda1002x"

do_install() {
    install -d ${D}/${bindir}/
    install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
    install -m 0755 "${S}/blackbox_blindscan" "${D}/${bindir}"
}
