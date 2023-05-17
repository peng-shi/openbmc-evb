DESCRIPTION = "A python library for manipulating kickstart files"
HOMEPAGE = "http://fedoraproject.org/wiki/pykickstart"
LICENSE = "GPL-2.0-or-later"

LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

DEPENDS = "python3"
RDEPENDS:${PN} = "python3 \
                  python3-requests \
                  python3-six \
"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/rhinstaller/pykickstart.git;protocol=https;branch=master \
           file://0001-support-authentication-for-kickstart.patch \
           file://0002-pykickstart-parser.py-add-lock-for-readKickstart-and.patch \
           file://0003-comment-out-sections-shutdown-and-environment-in-gen.patch \
           file://0004-load.py-retry-to-invoke-request-with-timeout.patch \
           "
SRCREV = "fa2f233f735a082dccaf03c234238f7d8ce93fa1"

UPSTREAM_CHECK_GITTAGREGEX = "r(?P<pver>\d+(\.\d+)+(-\d+)*)"

inherit setuptools3
PIP_INSTALL_PACKAGE = "pykickstart"
PIP_INSTALL_DIST_PATH = "${S}/dist"
