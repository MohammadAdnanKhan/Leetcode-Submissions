import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    result = students[students['student_id']==101]
    return result[['name','age']]