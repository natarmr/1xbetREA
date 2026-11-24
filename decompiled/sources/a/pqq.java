package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pqq extends lm40 implements bqq {
    @Override // a.bqq
    public final void n(zpq zpqVar) {
        View viewW = dyb.W(this);
        zpqVar.c(this.f20279a.n && dyb.W(this).hasFocusable());
        View viewFindFocus = viewW.findFocus();
        if (viewFindFocus != null) {
            zpqVar.b(spq.a(viewFindFocus, viewW));
        }
    }
}
