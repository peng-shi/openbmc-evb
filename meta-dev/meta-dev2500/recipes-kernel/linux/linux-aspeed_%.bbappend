FILESEXTRAPATHS:prepend := "${THISDIR}/linux-aspeed:"
SRC_URI += "file://dev2500.cfg \
            file://aspeed-bmc-dev2500.dts "


do_configure:append() {

    dts="../aspeed-bmc-dev2500.dts"

    if [ ! -f $dts ]; then
        echo $dts" does not exist"
    else
        cp ../aspeed-bmc-dev2500.dts  ./source/arch/arm/boot/dts/
    fi
}