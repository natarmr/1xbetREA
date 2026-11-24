package a;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class pe6 extends da0 {
    public final boolean b;
    public final rd6 c;
    public final yj5 d;
    public String e = "";
    public boolean f;

    public pe6(boolean z, rd6 rd6Var, yj5 yj5Var) {
        this.b = z;
        this.c = rd6Var;
        this.d = yj5Var;
    }

    @Override // a.da0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        String string = editable.toString();
        if (string.length() > 0) {
            if (string.length() == 0) {
                v4i0.o("Char sequence is empty.");
                return;
            } else if (string.charAt(0) == '.') {
                string = "0".concat(string);
            }
        }
        if (string.length() > 0 && this.b && !this.f) {
            Double dI = kotlin.text.b.i(string);
            double dDoubleValue = dI != null ? dI.doubleValue() : 0.0d;
            Double dI2 = kotlin.text.b.i(this.e);
            if (dDoubleValue > (dI2 != null ? dI2.doubleValue() : 0.0d)) {
                this.c.invoke(this.e);
                string = this.e;
            }
        }
        this.d.invoke(string);
    }
}
