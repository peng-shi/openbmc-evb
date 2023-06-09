SUMMARY = "Simple, fast, extensible JSON encoder/decoder for Python"
HOMEPAGE = "http://cheeseshop.python.org/pypi/simplejson"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

SRC_URI[sha256sum] = "6277f60848a7d8319d27d2be767a7546bc965535b28070e310b3a9af90604a4c"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-netserver \
    ${PYTHON_PN}-numbers \
"

PACKAGES =+ "${PN}-tests"
RDEPENDS:${PN}-tests = "${PN} ${PYTHON_PN}-unittest"
FILES:${PN}-tests+= " \
    ${PYTHON_SITEPACKAGES_DIR}/simplejson/tests \
    ${PYTHON_SITEPACKAGES_DIR}/simplejson/tool.py* \
"

BBCLASSEXTEND = "native nativesdk"
