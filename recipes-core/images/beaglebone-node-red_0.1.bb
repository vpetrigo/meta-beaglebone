require recipes-core/images/core-image-base.bb

IMAGE_INSTALL_append = " \
      nodejs node-red kernel-modules \
      node-red-init-script node-red-user \
      node-red-contrib-aws node-red-contrib-noble \
"
