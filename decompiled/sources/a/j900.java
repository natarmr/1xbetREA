package a;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j900 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16114a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iE;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((xhe0) this.k.get(i2)).f40887a;
            hhe0 hhe0Var = (hhe0) view3.getLayoutParams();
            if (view3 != view && !hhe0Var.f13060a.k() && (iE = (hhe0Var.f13060a.e() - this.d) * this.e) >= 0 && iE < i) {
                view2 = view3;
                if (iE == 0) {
                    break;
                } else {
                    i = iE;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((hhe0) view2.getLayoutParams()).f13060a.e();
        }
    }

    public final View b(msj msjVar) {
        List list = this.k;
        if (list == null) {
            View viewE = msjVar.e(this.d);
            this.d += this.e;
            return viewE;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((xhe0) this.k.get(i)).f40887a;
            hhe0 hhe0Var = (hhe0) view.getLayoutParams();
            if (!hhe0Var.f13060a.k() && this.d == hhe0Var.f13060a.e()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
