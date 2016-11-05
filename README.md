# Seman 4: Menus y Fragment
> - Menus: 
> - Fragmnet: Adapter, View Holder, Libreria CircularImageView
> - Java Mail: Libreria javamail

## Agragando Menus
** 1. Crea un menú de opciones que muestre el Item “Contacto” y el Item “Acerca De” **

- xml  Menu de Opciones
```xml
    <menu
      xmlns:android="http://schemas.android.com/apk/res/android">
      <!-- Menu Contacto: Enviar Email -->
      <item android:id="@+id/mContacto"
          android:title="@string/menu_contacto"
          android:orderInCategory="100">
      </item>
      <!-- Menu About: Bio del Desarrollador -->
      <item android:id="@+id/mAbout"
          android:title="@string/menu_about"
          android:orderInCategory="101">
      </item>
    </menu>
```
- java: Creamos un menú a nuestra aplicacion Principal.
**3. Your Fragment should extend SupportFragment：**
`java
public class ListaMascotas extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mContacto:
                Intent intent1 = new Intent(this, Contacto.class);
                startActivity(intent1);
                break;
            case R.id.mAbout:
                Intent intent2 = new Intent(this, About.class);
                startActivity(intent2);
                break;
        }return super.onOptionsItemSelected(item);
    }
}
``


