package edu.gatech.seclass.calculator;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements android.view.View.OnClickListener {
	
	TextView txt;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn10;
	Button btn12;
	Button btn13;
	Button btn11;
	Button btn14;
	Button btn15;
	long operand1 = 0;
	long operand2 = 0;
	long result = 0;
	String operator = "";
	String input = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
		Button btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(this);
		Button btn3 = (Button) findViewById(R.id.button3);
		btn3.setOnClickListener(this);
		Button btn4 = (Button) findViewById(R.id.button4);
		btn4.setOnClickListener(this);
		Button btn5 = (Button) findViewById(R.id.button5);
		btn5.setOnClickListener(this);
		Button btn6 = (Button) findViewById(R.id.button6);
		btn6.setOnClickListener(this);
		Button btn7 = (Button) findViewById(R.id.button7);
		btn7.setOnClickListener(this);
		Button btn8 = (Button) findViewById(R.id.button8);
		btn8.setOnClickListener(this);
		Button btn9 = (Button) findViewById(R.id.button9);
		btn9.setOnClickListener(this);
		Button btn0 = (Button) findViewById(R.id.button10);
		btn0.setOnClickListener(this);
		Button btnC = (Button) findViewById(R.id.button11);
		btnC.setOnClickListener(this);
		Button btnSum = (Button) findViewById(R.id.button12);
		btnSum.setOnClickListener(this);
		Button btnMinus = (Button) findViewById(R.id.button13);
		btnMinus.setOnClickListener(this);
		Button btnMulti = (Button) findViewById(R.id.button14);
		btnMulti.setOnClickListener(this);
		Button btnEqual = (Button) findViewById(R.id.button15);
		btnEqual.setOnClickListener(this);
		txt = (TextView) findViewById(R.id.textView1);
		
	}

	public void onClick(View view) {
		
		switch (view.getId()) {
		case R.id.button1:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button2:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button3:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button4:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button5:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button6:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button7:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button8:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button9:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button10:
			if ((Long.parseLong(txt.getText().toString()) == 0) || (input == "")) {
				txt.setText("");
			}
			txt.setText(txt.getText().toString() + ((Button) view).getText().toString());
			input = txt.getText().toString();
			txt.setText(input);
			break;
		case R.id.button11:
			operand1 = 0;
			operand2 = 0;
			operator = "";
			txt.setText(Long.toString(operand1));
			break;
		case R.id.button12:
			operand1 = Long.parseLong(txt.getText().toString());
			input = "";
			operator = "+";
			operand2 = 0;
			break;
		case R.id.button13:
			operand1 = Long.parseLong(txt.getText().toString());
			input = "";
			operator = "-";
			operand2 = 0;
			break;
		case R.id.button14:
			operand1 = Long.parseLong(txt.getText().toString());
			input = "";
			operator = "*";
			operand2 = 0;
			break;
		case R.id.button15:
			operand2 = Long.parseLong(txt.getText().toString());
			if (operator == "+") {
				result = operand1 + operand2;
				txt.setText(Long.toString(result));
			}
			else if (operator == "-") {
				result = operand1 - operand2;
				txt.setText(Long.toString(result));
			}
			else if (operator == "*") {
				result = operand1 * operand2;
				txt.setText(Long.toString(result));
			}
			else if (operator == "") {
				txt.setText(txt.getText());
			}
			operand1 = 0;
			operand2 = 0;
			operator = "";
			input = "";
			break;
		}		
	}
}
