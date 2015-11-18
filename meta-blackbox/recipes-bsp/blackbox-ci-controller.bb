DESCRIPTION="blackbox ci controller"
LICENSE = "CLOSED"
require conf/license/license-close.inc

PR = "r13"
PV = "0.1"

SRC_URI="file://blackbox-ci-controller \
	file://blackbox-ci-controller.sh \
	file://root.pem file://customer.pem file://device.pem \
"

#INITSCRIPT_NAME = "${PN}"
#INITSCRIPT_PARAMS = "defaults 50"

INHIBIT_PACKAGE_STRIP = "1"

#inherit update-rc.d

do_install() {
	install -d ${D}/etc/ssl/certs
	install -m 0755 ${WORKDIR}/customer.pem ${D}/etc/ssl/certs/customer.pem
	install -m 0755 ${WORKDIR}/device.pem ${D}/etc/ssl/certs/device.pem
	install -m 0755 ${WORKDIR}/root.pem ${D}/etc/ssl/certs/root.pem
	
	install -d ${D}/usr/bin
	install -m 0755 ${WORKDIR}/blackbox-ci-controller ${D}/usr/bin/blackbox-ci-controller
	install -d ${D}/etc/init.d
	install -m 0755 ${WORKDIR}/${PN}.sh ${D}/etc/init.d/${PN}
}
	
PACKAGE_ARCH = "${MACHINE_ARCH}"
 
