package cr.ac.labcalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    var proceso: TextView ?= null
    var num1: Double = 0.0
    var num2: Double = 0.0
    var resultado: Double = 0.0
    var cantNumeros: Int = 0
    var operacion: Char = ' '
    var obtenerNumero1: String = ""
    var obtenerNumero2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        proceso = findViewById(R.id.Proceso)

        val buttonC: Button = findViewById(R.id.buttonC)
        buttonC.setOnClickListener{ buttonCClick()}

        val buttonPorcentaje: Button = findViewById(R.id.buttonPorcentaje)
        buttonPorcentaje.setOnClickListener{buttonPorcentajeClick()}

        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener{buttonDivideClick()}

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener{ button7Click()}

        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener{ button8Click()}

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener{ button9Click()}

        val buttonX: Button = findViewById(R.id.buttonX)
        buttonX.setOnClickListener{ buttonXClick() }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{ button4Click()}

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener{ button5Click() }

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener{ button6Click() }

        val buttonMenos: Button = findViewById(R.id.buttonMenos)
        buttonMenos.setOnClickListener{ buttonMenosClick() }

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener{ button1Click() }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener{ button2Click() }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener{ button3Click() }

        val buttonMas: Button = findViewById(R.id.buttonMas)
        buttonMas.setOnClickListener{ buttonMasClick() }

        val button0: Button = findViewById(R.id.button0)
        button0.setOnClickListener{ button0Click() }

        val buttonComa: Button = findViewById(R.id.buttonComa)
       buttonComa.setOnClickListener{ buttonComaClick() }

        val buttonIgual: Button = findViewById(R.id.buttonIgual)
        buttonIgual.setOnClickListener{ buttonIgualClick() }

    }

    private fun buttonCClick() {
        this.num1=0.0
        this.num2=0.0
        this.resultado=0.0
        this.proceso?.text = "0"
        this.cantNumeros=0
        this.operacion=' '
        this.obtenerNumero1=""
        this.obtenerNumero2=""
    }

    private fun buttonPorcentajeClick() {
        proceso?.append("%")
        operacion='%'
        cantNumeros++
    }

    private fun buttonDivideClick(){
        proceso?.append("/")
        operacion='/'
        cantNumeros++
    }

    private fun button7Click() {

       if(cantNumeros==0){

           if(num1==0.0){
               obtenerNumero1 = "7"
               proceso?.text = "7"
           }
           else{
               obtenerNumero1 += "7"
               proceso?.append("7")
           }
           num1=obtenerNumero1.toDouble()
       }
        else{
           obtenerNumero2 += "7"
           num2=obtenerNumero2.toDouble()
           proceso?.append("7")
       }
    }

    private fun button8Click() {
        if(cantNumeros==0){

            if(num1==0.0){
                obtenerNumero1 = "8"
                proceso?.text = "8"
            }
            else{
                obtenerNumero1 += "8"
                proceso?.append("8")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "8"
            num2=obtenerNumero2.toDouble()
            proceso?.append("8")
        }
    }

    private fun button9Click() {
        if(cantNumeros==0){

            if(num1==0.0){
                obtenerNumero1 = "9"
                proceso?.text = "9"
            }
            else{
                obtenerNumero1 += "9"
                proceso?.append("9")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "9"
            num2=obtenerNumero2.toDouble()
            proceso?.append("9")
        }
    }

    private fun buttonXClick(){
            proceso?.append("x")
            operacion='x'
            cantNumeros++
    }

    private fun button4Click() {
        if(cantNumeros==0){

            if(num1==0.0){
                obtenerNumero1 = "4"
                proceso?.text = "4"
            }
            else{
                obtenerNumero1 += "4"
                proceso?.append("4")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "4"
            num2=obtenerNumero2.toDouble()
            proceso?.append("4")
        }
    }

    private fun button5Click() {
        if(cantNumeros==0){

            if(num1==0.0){
                obtenerNumero1 = "5"
                proceso?.text = "5"
            }
            else{
                obtenerNumero1 += "5"
                proceso?.append("5")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "5"
            num2=obtenerNumero2.toDouble()
            proceso?.append("5")
        }
    }

    private fun button6Click() {
        if(cantNumeros==0){

            if(num1==0.0){
                obtenerNumero1 = "6"
                proceso?.text = "6"
            }
            else{
                obtenerNumero1 += "6"
                proceso?.append("6")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "6"
            num2=obtenerNumero2.toDouble()
            proceso?.append("6")
        }
    }

    private fun buttonMenosClick() {
        operacion='-'
        proceso?.append("-")
        cantNumeros++
    }

    private fun button1Click() {
        if(cantNumeros==0){

            if(num1==0.0){
                obtenerNumero1 = "1"
                proceso?.text = "1"
            }
            else{
                obtenerNumero1 += "1"
                proceso?.append("1")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "1"
            num2=obtenerNumero2.toDouble()
            proceso?.append("1")
        }
    }

    private fun button2Click() {
        if(cantNumeros==0){

            if(num1==0.0){
                obtenerNumero1 = "2"
                proceso?.text = "2"
            }
            else{
                obtenerNumero1 += "2"
                proceso?.append("2")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "2"
            num2=obtenerNumero2.toDouble()
            proceso?.append("2")
        }
    }

    private fun button3Click() {
        if(cantNumeros==0){

            if(num1==0.0){
                obtenerNumero1 = "3"
                proceso?.text = "3"
            }
            else{
                obtenerNumero1 += "3"
                proceso?.append("3")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "3"
            num2=obtenerNumero2.toDouble()
            proceso?.append("3")
        }
    }

    private fun buttonMasClick() {
        operacion='+'
        proceso?.append("+")
        cantNumeros++
    }

    private fun button0Click() {
        if(cantNumeros==0){
            if(num1==0.0){
                obtenerNumero1 = "0"
                proceso?.text = "0"
            }
            else{
                obtenerNumero1 += "0"
                proceso?.append("0")
            }
            num1=obtenerNumero1.toDouble()
        }
        else{
            obtenerNumero2 += "0"
            num2=obtenerNumero2.toDouble()
            proceso?.append("0")
        }
    }

    private fun buttonComaClick() {
       if(cantNumeros==0){
           obtenerNumero1+="."
           proceso?.append(".")
       }
       else{
           obtenerNumero2+="."
           proceso?.append(".")
       }
    }

    private fun buttonIgualClick() {

        if(operacion=='/'){
            if(num2!=0.0){
                resultado=num1/num2
                proceso?.text = resultado.toString()
                num1=resultado
                num2=0.0
                obtenerNumero2="0"
            }
            else{
                proceso?.text = "Syntak Error"
            }
        }
        else if(operacion=='x'){
            resultado=num1*num2
            proceso?.text = resultado.toString()
            num1=resultado
            num2=0.0
            obtenerNumero2="0"
        }
        else if(operacion=='+'){
            resultado=num1+num2
            proceso?.text = resultado.toString()
            num1=resultado
            num2=0.0
            obtenerNumero2="0"
        }
        else if(operacion=='-'){
            resultado=num1-num2
            proceso?.text = resultado.toString()
            num1=resultado
            num2=0.0
            obtenerNumero2="0"
        }
        else if(operacion=='%'){
            resultado=num1*100/num2
            proceso?.text = resultado.toString() + "%"
            num1=resultado
            num2=0.0
            obtenerNumero2="0"
        }

    }




}

