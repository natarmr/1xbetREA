package a;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class tk80 extends efk0 {
    public oa80 d;
    public oa80 e;

    public static int h(View view, pa80 pa80Var) {
        return ((pa80Var.e(view) / 2) + pa80Var.g(view)) - ((pa80Var.n() / 2) + pa80Var.m());
    }

    public static View i(androidx.recyclerview.widget.b bVar, pa80 pa80Var) {
        int I = bVar.I();
        View view = null;
        if (I == 0) {
            return null;
        }
        int iN = (pa80Var.n() / 2) + pa80Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = bVar.H(i2);
            int iAbs = Math.abs(((pa80Var.e(viewH) / 2) + pa80Var.g(viewH)) - iN);
            if (iAbs < i) {
                view = viewH;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // a.efk0
    public final int[] c(androidx.recyclerview.widget.b bVar, View view) {
        int[] iArr = new int[2];
        if (bVar.q()) {
            iArr[0] = h(view, j(bVar));
        } else {
            iArr[0] = 0;
        }
        if (bVar.r()) {
            iArr[1] = h(view, k(bVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // a.efk0
    public final she0 d(androidx.recyclerview.widget.b bVar) {
        if (bVar instanceof rhe0) {
            return new wmo(this, this.f7722a.getContext(), (byte) 1);
        }
        return null;
    }

    @Override // a.efk0
    public View e(androidx.recyclerview.widget.b bVar) {
        if (bVar.r()) {
            return i(bVar, k(bVar));
        }
        if (bVar.q()) {
            return i(bVar, j(bVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.efk0
    public final int f(androidx.recyclerview.widget.b bVar, int i, int i2) {
        PointF pointFA;
        int iS = bVar.S();
        if (iS != 0) {
            View view = null;
            pa80 pa80VarK = bVar.r() ? k(bVar) : bVar.q() ? j(bVar) : null;
            if (pa80VarK != null) {
                int I = bVar.I();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < I; i5++) {
                    View viewH = bVar.H(i5);
                    if (viewH != null) {
                        int iH = h(viewH, pa80VarK);
                        if (iH <= 0 && iH > i4) {
                            view2 = viewH;
                            i4 = iH;
                        }
                        if (iH >= 0 && iH < i3) {
                            view = viewH;
                            i3 = iH;
                        }
                    }
                }
                boolean z2 = !bVar.q() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return androidx.recyclerview.widget.b.T(view);
                }
                if (!z2 && view2 != null) {
                    return androidx.recyclerview.widget.b.T(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int iT = androidx.recyclerview.widget.b.T(view);
                    int iS2 = bVar.S();
                    if ((bVar instanceof rhe0) && (pointFA = ((rhe0) bVar).a(iS2 - 1)) != null && (pointFA.x < 0.0f || pointFA.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = iT + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iS) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public final pa80 j(androidx.recyclerview.widget.b bVar) {
        oa80 oa80Var = this.e;
        if (oa80Var != null && ((androidx.recyclerview.widget.b) oa80Var.b) == bVar) {
            return oa80Var;
        }
        oa80 oa80Var2 = new oa80(bVar, (byte) 0);
        this.e = oa80Var2;
        return oa80Var2;
    }

    public final pa80 k(androidx.recyclerview.widget.b bVar) {
        oa80 oa80Var = this.d;
        if (oa80Var != null && ((androidx.recyclerview.widget.b) oa80Var.b) == bVar) {
            return oa80Var;
        }
        oa80 oa80Var2 = new oa80(bVar, (byte) 1);
        this.d = oa80Var2;
        return oa80Var2;
    }
}
