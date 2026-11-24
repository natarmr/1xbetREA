package a;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class qhg0 extends w5 {
    public final bdu0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public qhg0(bdu0 bdu0Var) {
        FrameLayout frameLayout = bdu0Var.b;
        frameLayout.getClass();
        super(frameLayout);
        this.u = bdu0Var;
    }

    @Override // a.w5
    public final void t() {
        this.u.c.setText("");
    }
}
