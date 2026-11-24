package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class t34 extends Exception {
    public t34(String str, q34 q34Var) {
        super(str + Separators.SP + q34Var);
    }

    public t34(q34 q34Var) {
        this("Unhandled input format:", q34Var);
    }
}
