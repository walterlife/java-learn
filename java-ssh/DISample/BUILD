#!/usr/bin/env bash
########################################################################
#    File Name: BUILD.sh
# 
#       Author: Shootao Shanghai,Inc.
#         Mail: walter@shootao.com
# Created Time: Thu 16 Jul 2015 07:20:01 PM CST
#  Description: ...
# 
########################################################################
set -euo pipefail

FG_GRAY="\033[0;37m"
FG_RED="\033[0;31m"
FG_GREEN="\033[0;32m"
FG_BLUE="\033[0;34m"
FG_YELLOW="\033[0;33m"
FG_LIGHT_RED="\033[1;31m"
FG_LIGHT_YELLOW="\033[1;33m"
FG_LIGHT_GREEN="\033[1;32m"
FG_LIGHT_BLUE="\033[0;34m"
FG_LIGHT_GRAY="\033[1;37m"
 
BG_GRAY="\e[47m"   # 将背景色设置为灰色 
BG_BLACK="\e[40m"  # 将背景色设置为黑色
BG_RED="\e[41m"    # 将背景色设置为红色 
BG_GREEN="\e[42m"  # 将背景色设置为红色 
BG_YELLOW="\e[43m" # 将背景色设置为淡红色
BG_BLUE="\e[46m"   # 将背景色设置为淡蓝色
BG_LIGHT_RED="\e[41m"       # 将背景色设置为红色
BG_LIGHT_GREEN="\e[42m"     # 将背景色设置为绿色
BG_LIGHT_BLUE="\e[44m"      # 将背景色设置为蓝色
BG_LIGHT_PINK="\e[45m"      # 将背景色设置为紫色
 
END="\033[0;00m"

pwd=${PWD}
pwd=${pwd##*/}

echo -e "${FG_YELLOW}BEGIN COMPLIE AND PACKAGE PROJECT${END}" 
mvn clean package  
echo -e "${FG_YELLOW}END COMPLIE AND PACKAGE PROJECT${END}" 

echo -e "${FG_YELLOW}BEGIN EXECUTE PROJECT${END}" 
java -jar $(find ./target/ -name "$pwd*jar")
echo -e "${FG_YELLOW}END EXECUTE PROJECT${END}" 


