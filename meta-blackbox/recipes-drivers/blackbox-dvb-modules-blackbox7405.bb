KV = "3.14.21"
SRCDATE = "20151107"

RDEPENDS_${PN} += "blackbox7405-mac-check"

SRC_URI[md5sum] = "03b8ba76bb0530a94419562703682ff9"
SRC_URI[sha256sum] = "bdcb0a1cd010750284270f42cdaedff14e5db96824146917dae52d6c5e049ac7"

SRC_URI = "http://unibox.to/feeds/eco/development/drivers/linuxdvb_7405-${KV}-${SRCDATE}.tar.gz"

require blackbox7405-dvb-modules.inc
