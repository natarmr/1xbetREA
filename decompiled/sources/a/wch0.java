package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class wch0 extends Exception {
    public wch0(String str, ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        super(arrayIndexOutOfBoundsException.getMessage() + Separators.SEMICOLON + str);
    }
}
