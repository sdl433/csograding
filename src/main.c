#include <stdio.h>
#include <jni.h>
#include "Main.h"

JNIEXPORT void JNICALL Java_Main_helloC(JNIEnv *env, jobject javaobj)
{
	printf("Hello World: From C");
	return;
}
