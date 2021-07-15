#!/bin/bash
echo "Write out commit:"
read commit
git add .
git commit -m "$commit"
git push -u origin fabric