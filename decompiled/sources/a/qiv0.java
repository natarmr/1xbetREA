package a;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class qiv0 extends piv0 {
    public static final xiv0 w = xiv0.h(WindowInsets.CONSUMED, null);

    public qiv0(xiv0 xiv0Var, WindowInsets windowInsets) {
        super(xiv0Var, windowInsets);
    }

    @Override // a.miv0, a.uiv0
    public pfx i(int i) {
        return pfx.d(this.c.getInsets(viv0.a(i)));
    }

    @Override // a.miv0, a.uiv0
    public pfx j(int i) {
        return pfx.d(this.c.getInsetsIgnoringVisibility(viv0.a(i)));
    }

    @Override // a.miv0, a.uiv0
    public boolean u(int i) {
        return this.c.isVisible(viv0.a(i));
    }

    public qiv0(xiv0 xiv0Var, qiv0 qiv0Var) {
        super(xiv0Var, qiv0Var);
    }

    @Override // a.miv0, a.uiv0
    public final void d(View view) {
    }
}
