DEPENDS += " dev2500-yaml-config"
EXTRA_OEMESON += " \
     -Dsensor-yaml-gen=${STAGING_DIR_HOST}${datadir}/dev2500-yaml-config/ipmi-sensors.yaml \
     -Dfru-yaml-gen=${STAGING_DIR_HOST}${datadir}/dev2500-yaml-config/ipmi-fru-read.yaml \
     -Dinvsensor-yaml-gen=${STAGING_DIR_HOST}${datadir}/dev2500-yaml-config/ipmi-inventory-sensors.yaml \
     "

EXTRA_OECONF += " \
    SENSOR_YAML_GEN=${STAGING_DIR_HOST}${datadir}/dev2500-yaml-config/ipmi-sensors.yaml \
    INVSENSOR_YAML_GEN=${STAGING_DIR_HOST}${datadir}/dev2500-yaml-config/ipmi-inventory-sensors.yaml \
    FRU_YAML_GEN=${STAGING_DIR_HOST}${datadir}/dev2500-yaml-config/ipmi-fru-read.yaml \
    "