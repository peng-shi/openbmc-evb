SUMMARY = "dav1d AV1 decoder"
DESCRIPTION = "Targeted to be small, portable and fast."
HOMEPAGE = "https://code.videolan.org/videolan/dav1d"
SECTION = "multimedia"
LICENSE = "BSD-2-Clause"

LIC_FILES_CHKSUM = "file://COPYING;md5=c8055cfe7548dfdaa3a6dc45d8793669"

SRC_URI = "git://code.videolan.org/videolan/dav1d.git;protocol=https;branch=master"
SRCREV = "9593e625b75d498d1edea544da21ea764b98d507"

S = "${WORKDIR}/git"

DEPENDS:append:x86 = " nasm-native"
DEPENDS:append:x86-64 = " nasm-native"

inherit meson
