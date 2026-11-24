package a;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qfx extends oyc {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public qfx(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // a.oyc
    public final void f(div0 div0Var) {
        this.c.setTranslationY(0.0f);
    }

    @Override // a.oyc
    public final void g(div0 div0Var) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // a.oyc
    public final xiv0 h(xiv0 xiv0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            div0 div0Var = (div0) it.next();
            if ((div0Var.f6156a.d() & 8) != 0) {
                this.c.setTranslationY(n73.c(this.e, div0Var.f6156a.c(), 0));
                break;
            }
        }
        return xiv0Var;
    }

    @Override // a.oyc
    public final hcp0 i(div0 div0Var, hcp0 hcp0Var) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return hcp0Var;
    }
}
