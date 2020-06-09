#include <iostream>
using namespace std;
int numero,reciduo,capicua=0,comparador;
int main()
{
	cout<<"Ingrese numero"<<endl;
	cin>>numero;
	comparador=numero;
	while(comparador>0)
	{
		reciduo=comparador%10;
		comparador=comparador/10;
		capicua=capicua*10+reciduo;
	}
	if(capicua==numero)
	{
		cout<<"Si es capicua"<<endl; //no reconoce la vocal con tilde 
	}
	else
	{
		cout<<"No es capicua"<<endl;
	}
}