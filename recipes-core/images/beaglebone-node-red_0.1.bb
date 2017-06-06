require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL_append = " \
      nodejs node-red kernel-modules \
"
