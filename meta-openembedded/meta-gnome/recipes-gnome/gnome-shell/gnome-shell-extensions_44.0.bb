SUMMARY = "GNOME Shell Extensions"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4cb3a392cbf81a9e685ec13b88c4c101"

GNOMEBASEBUILDCLASS = "meson"

inherit gnomebase gettext gsettings features_check

REQUIRED_DISTRO_FEATURES = "x11 polkit systemd pam gobject-introspection-data"

SRC_URI[archive.sha256sum] = "8c345e72f31a1e37f55063e0b15997301b01194ed698772fd87aeb50cbb101ab"

EXTRA_OEMESON += " \
    -Dextension_set=all \
    -Dclassic_mode=true \
"

RDEPENDS:${PN} += "gnome-shell"

FILES:${PN} += " \
    ${datadir}/gnome-shell \
    ${datadir}/gnome-session \
    ${datadir}/wayland-sessions \
    ${datadir}/xsessions \
"
