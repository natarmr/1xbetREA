package a;

import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class j6d extends w5 {
    public final wcu0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public j6d(wcu0 wcu0Var) {
        LinearLayout linearLayout = wcu0Var.b;
        linearLayout.getClass();
        super(linearLayout);
        this.u = wcu0Var;
    }

    @Override // a.w5
    public final void t() {
        wcu0 wcu0Var = this.u;
        wcu0Var.d.setText("");
        wcu0Var.c.setText("");
    }
}
