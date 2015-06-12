KV = "3.14.21"
SRCDATE = "20150612"

RDEPENDS_${PN} += "blackbox7405-mac-check"

SRC_URI[md5sum] = "073ceb63f09424b25daa83202d1451e5"
SRC_URI[sha256sum] = "782eae915651e137ed93f650192784ebb7abc72980c157e799e2fad640005887"

SRC_URI = "http://unibox.to/feeds/eco/development/drivers/linuxdvb_7405-${KV}-${SRCDATE}.tar.gz"

require blackbox7405-dvb-modules.inc
