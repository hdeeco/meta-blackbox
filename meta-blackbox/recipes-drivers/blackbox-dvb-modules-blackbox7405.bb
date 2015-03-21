KV = "3.14.21"
SRCDATE = "20150321"

RDEPENDS_${PN} += "blackbox7405-mac-check"

SRC_URI[md5sum] = "9e82e58c46e6c7d353318ef3356caab7"
SRC_URI[sha256sum] = "4f8007e7f84373cd8cb266b11f7f78fa443d6c512c301182add7bf36bdd68346"

SRC_URI = "http://unibox.to/feeds/eco/development/drivers/linuxdvb_7405-${KV}-${SRCDATE}.tar.gz"

require blackbox7405-dvb-modules.inc
