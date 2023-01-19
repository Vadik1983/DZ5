/* Задача 38: Задайте массив вещественных чисел. 
Найдите разницу между максимальным и минимальным элементов массива.
[3 7 22 2 78] -> 76*/

double[] array = GetRandomArray(8, 0, 100);
Console.WriteLine($"[{String.Join(", ", array)}]");
//double maxNum = MaxNum(array);
double minNum = MinNum(array);
/////////////////////////////////////////////


double[] GetRandomArray(int size, double minValue, double maxValue)
{
	double[] result = new double[size];
	var rnd = new Random();
	for(double i = 0; i < size; i++)
	{
		result[(int)i] = rnd.Next((int)minValue, (int)maxValue);
	}
	return result;
}



/*double MaxNum(double[] array)
{ 
double max = int.MinValue;
for (int i = 0; i < array.Length; i++)
{
    if (array[i] > max)
    {
        max = array[i];
    }

}
Console.WriteLine(max);
return max;

}*/

double MinNum(double[] array)
{ 
double min = int.MinValue;
for (int i = 0; i < array.Length; i++)
{
    for (int j = i + 1; j < array.Length; j++)
    { 
        if (array[i] < array[j]) min = array[i];
        else min = array[j];
    }
}
Console.WriteLine(min);
return min;
}