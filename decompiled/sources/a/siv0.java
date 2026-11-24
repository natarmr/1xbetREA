package a;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class siv0 extends riv0 {
    public static final xiv0 x = xiv0.h(WindowInsets.CONSUMED, null);

    public siv0(xiv0 xiv0Var, WindowInsets windowInsets) {
        super(xiv0Var, windowInsets);
    }

    @Override // a.qiv0, a.miv0, a.uiv0
    public pfx i(int i) {
        return pfx.d(this.c.getInsets(wiv0.a(i)));
    }

    @Override // a.qiv0, a.miv0, a.uiv0
    public pfx j(int i) {
        return pfx.d(this.c.getInsetsIgnoringVisibility(wiv0.a(i)));
    }

    @Override // a.qiv0, a.miv0, a.uiv0
    public boolean u(int i) {
        return this.c.isVisible(wiv0.a(i));
    }

    public siv0(xiv0 xiv0Var, siv0 siv0Var) {
        super(xiv0Var, siv0Var);
    }

    @Override // a.miv0, a.uiv0
    public void p(View view) {
    }
}
