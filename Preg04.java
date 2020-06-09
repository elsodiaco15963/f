#include <iostream>
using namespace std;
int numero, contador=0,i,suma=0,final;
main()
{
	cout<<"Ingrese numero"<<endl;
	cin>>numero;
	for(i=1;i<=numero/2;i++)
	{
		if(numero%i==0)
		{
			contador++;
			suma=suma+i;
			cout<<i<<" "<<endl;
		}
	}
	cout<<"La suma de los divisores es :"<<suma<<endl;
	if(numero==suma)
	{
		cout<<"Si es perfecto"<<endl;
	}
	else
	{
		cout<<"No es perfecto"<<endl;
	}
}