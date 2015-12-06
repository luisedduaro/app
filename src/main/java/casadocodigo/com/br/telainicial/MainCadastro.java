package casadocodigo.com.br.telainicial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainCadastro extends AppCompatActivity {


    private EditText editTextNome;
    private EditText editTextEmail;
    private EditText editTextEndereco;
    private Spinner spinnerCidade;
    private Spinner spinnerBairro;
    private Button buttonSalvar;
    private Button buttonCancelar;

    ArrayAdapter <CharSequence> adaptadorCidade = ArrayAdapter.createFromResource(getApplicationContext(),
            R.array.cidades_arrays, android.R.layout.simple_spinner_item);
    ArrayAdapter <CharSequence> adaptadorBairro = ArrayAdapter.createFromResource(getApplicationContext(),
            R.array.bairro_arrays, android.R.layout.simple_spinner_item);


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastro);


        buttonSalvar = (Button)findViewById(R.id.buttonPesquisar);
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextNome = (EditText) findViewById(R.id.editTextNome);
                editTextEmail = (EditText) findViewById(R.id.editText);
                editTextEndereco = (EditText) findViewById(R.id.editTextEndereco);
                spinnerCidade = (Spinner) findViewById(R.id.spinnerTipoDeBusca);
                spinnerBairro = (Spinner) findViewById(R.id.spinnerBairroDados);

            }
        });
        buttonCancelar = (Button)findViewById(R.id.buttonCancelar);
        buttonCancelar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplication(), MainCadastro.class));

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_cadastro, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
