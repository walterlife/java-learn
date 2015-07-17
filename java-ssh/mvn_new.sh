#!/usr/bin/env bash
########################################################################
#    File Name: mvn_new.sh
# 
#       Author: Shootao Shanghai,Inc.
#         Mail: walter@shootao.com
# Created Time: Wed 15 Jul 2015 09:19:35 PM CST
#  Description: ...
# 
########################################################################
set -euo pipefail
if [ $# != 1 ]; then
    echo "usage: $0 projectName!!!"
    exit
fi

pname=$1
mvn archetype:generate -DarchetypeCatalog=internal -DgroupId=com.walterlife.blog -DartifactId="${pname}" -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
