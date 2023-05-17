FILESEXTRAPATHS:append := ":${THISDIR}/${PN}"
SRC_URI:append = " file://dev2500-baseboard.json \
                   file://dev2500-chassis.json"

do_install:append() {
     rm -f ${D}${datadir}/entity-manager/configurations/*.json
     install -d ${D}${datadir}/entity-manager/configurations
     install -m 0444 ${WORKDIR}/dev2500-baseboard.json ${D}${datadir}/entity-manager/configurations
     install -m 0444 ${WORKDIR}/dev2500-chassis.json ${D}${datadir}/entity-manager/configurations
}
