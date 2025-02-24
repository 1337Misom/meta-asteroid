SUMMARY = "Geoclue provider for libqmi"
HOMEPAGE = "https://github.com/1337Misom/geoclue-provider-libqmi"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/1337Misom/geoclue-provider-libqmi.git;protocol=https;branch=main"

PV = "+git"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

DEPENDS = "libqrtr-glib libqmi geoclue"

inherit cmake pkgconfig

EXTRA_OECMAKE = ""
FILES:${PN} += "/usr/share/dbus-1 /usr/share/geoclue-providers /usr/libexec"
