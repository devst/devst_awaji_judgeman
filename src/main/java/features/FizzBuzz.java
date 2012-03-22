package features;

/**
 * FizzBuzz。
 * 指定した正の整数が 3で割り切れる場合は "Fizz" 5で割り切れる場合は "Buzz" 3と5で割り切れる場合は"FizzBuzz"
 * 3でも5でも割り切れない場合は、その数字 を文字列として答えを返す。
 */
public interface FizzBuzz {

	String fizzBuzz(int i);
}
