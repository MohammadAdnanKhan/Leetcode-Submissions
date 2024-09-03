import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    new=weather.pivot_table(index='month',columns='city',values='temperature')
    return new
    