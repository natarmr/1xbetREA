package a;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tiv0 extends siv0 {
    public tiv0(xiv0 xiv0Var, WindowInsets windowInsets) {
        super(xiv0Var, windowInsets);
    }

    @Override // a.miv0, a.uiv0
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(wiv0.a(i));
    }

    @Override // a.miv0, a.uiv0
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(wiv0.a(i));
    }

    public tiv0(xiv0 xiv0Var, tiv0 tiv0Var) {
        super(xiv0Var, tiv0Var);
    }

    @Override // a.miv0, a.uiv0
    public void q() {
    }
}
