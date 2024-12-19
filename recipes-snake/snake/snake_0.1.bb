# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "file://src file://include file://build file://Makefile file://COPYING"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

DEPENDS = "ncurses"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile () {
    mkdir build
    oe_runmake
}

do_install () {
    install -d ${D}${bindir}
    install -m 0755 snake ${D}${bindir}
}

