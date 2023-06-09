require conf/machine/include/riscv/arch-riscv.inc

TUNEVALID[riscv64] = "Enable 64-bit RISC-V optimizations"
TUNEVALID[riscv32] = "Enable 32-bit RISC-V optimizations"

TUNEVALID[riscv64nf] = "Enable 64-bit RISC-V optimizations no floating point"
TUNEVALID[riscv32nf] = "Enable 32-bit RISC-V optimizations no floating point"

TUNEVALID[riscv64nc] = "Enable 64-bit RISC-V optimizations without compressed instructions"

TUNEVALID[bigendian] = "Big endian mode"

AVAILTUNES += "riscv64 riscv32 riscv64nc riscv64nf riscv32nf"

# Default
TUNE_FEATURES:tune-riscv64 = "riscv64"
TUNE_ARCH:tune-riscv64 = "riscv64"
TUNE_PKGARCH:tune-riscv64 = "riscv64"
PACKAGE_EXTRA_ARCHS:tune-riscv64 = "riscv64"

TUNE_FEATURES:tune-riscv32 = "riscv32"
TUNE_ARCH:tune-riscv32 = "riscv32"
TUNE_PKGARCH:tune-riscv32 = "riscv32"
PACKAGE_EXTRA_ARCHS:tune-riscv32 = "riscv32"

# No float
TUNE_FEATURES:tune-riscv64nf = "${TUNE_FEATURES:tune-riscv64} riscv64nf"
TUNE_ARCH:tune-riscv64nf = "riscv64"
TUNE_PKGARCH:tune-riscv64nf = "riscv64nf"
PACKAGE_EXTRA_ARCHS:tune-riscv64nf = "riscv64nf"

TUNE_FEATURES:tune-riscv32nf = "${TUNE_FEATURES:tune-riscv32} riscv32nf"
TUNE_ARCH:tune-riscv32nf = "riscv32"
TUNE_PKGARCH:tune-riscv32nf = "riscv32nf"
PACKAGE_EXTRA_ARCHS:tune-riscv32nf = "riscv32nf"

# no compressed
TUNE_FEATURES:tune-riscv64nc = "${TUNE_FEATURES:tune-riscv64} riscv64nc"
TUNE_ARCH:tune-riscv64nc = "riscv64"
TUNE_PKGARCH:tune-riscv64nc = "riscv64nc"
PACKAGE_EXTRA_ARCHS:tune-riscv64nc = "riscv64nc"
