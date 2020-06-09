# BeakerX: Beaker kernel groovy for Jupyter  

### Build and Install (linux and mac)

```
cd ./java-dist
conda env create -n beakerx -f configuration.yml
conda activate beakerx # For conda versions prior to 4.6, run: source activate beakerx
(pip install -r requirements.txt --verbose)
beakerx_kernel_java install
cd ..
```