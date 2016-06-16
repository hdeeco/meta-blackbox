KV = "3.14.21"
SRCDATE = "20160616"

RDEPENDS_${PN} += "blackbox7405-mac-check"

SRC_URI[md5sum] = "0753865679f48930f39a99b801d2e72b"
SRC_URI[sha256sum] = "76b1d5703e74c98adc0c424335673ca987367ef332591f8814c12702391f6082"

SRC_URI = "file://linuxdvb_7405-${KV}-${SRCDATE}.tar.gz"

require blackbox7405-dvb-modules.inc
