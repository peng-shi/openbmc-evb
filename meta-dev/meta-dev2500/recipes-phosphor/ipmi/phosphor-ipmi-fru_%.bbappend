DEPENDS += " dev2500-yaml-config"

EXTRA_OECONF += " \
    YAML_GEN=${STAGING_DIR_HOST}${datadir}/dev2500-yaml-config/ipmi-fru-read.yaml \
    PROP_YAML=${STAGING_DIR_HOST}${datadir}/dev2500-yaml-config/ipmi-extra-properties.yaml \
    "
