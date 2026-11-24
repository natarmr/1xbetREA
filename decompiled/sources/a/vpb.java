package a;

import android.text.Editable;

/* JADX INFO: loaded from: classes5.dex */
public final class vpb extends da0 {
    public final /* synthetic */ xpb b;

    public vpb(xpb xpbVar) {
        this.b = xpbVar;
    }

    @Override // a.da0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        gl5 gl5Var = xpb.S1;
        this.b.H0().A(editable.toString());
    }
}
