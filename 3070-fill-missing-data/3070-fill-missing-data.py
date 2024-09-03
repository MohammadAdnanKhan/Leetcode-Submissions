import pandas as pd
import numpy as np

def fillMissingValues(products: pd.DataFrame) -> pd.DataFrame:
    products['quantity']=products['quantity'].replace(np.nan,0)
    return products