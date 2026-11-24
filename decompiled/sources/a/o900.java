package a;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o900 extends efk0 {
    public oa80 d;
    public oa80 e;

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
            pa80 pa80VarJ = j(bVar);
            iArr[0] = ((pa80VarJ.e(view) / 2) + pa80VarJ.g(view)) - ((pa80VarJ.n() / 2) + pa80VarJ.m());
        } else {
            iArr[0] = 0;
        }
        if (!bVar.r()) {
            iArr[1] = 0;
            return iArr;
        }
        pa80 pa80VarK = k(bVar);
        iArr[1] = ((pa80VarK.e(view) / 2) + pa80VarK.g(view)) - ((pa80VarK.n() / 2) + pa80VarK.m());
        return iArr;
    }

    @Override // a.efk0
    public final View e(androidx.recyclerview.widget.b bVar) {
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
        int iS;
        View viewE;
        int iT;
        int i3;
        PointF pointFA;
        int iH;
        int iH2;
        if ((bVar instanceof rhe0) && (iS = bVar.S()) != 0 && (viewE = e(bVar)) != null && (iT = androidx.recyclerview.widget.b.T(viewE)) != -1 && (pointFA = ((rhe0) bVar).a((i3 = iS - 1))) != null) {
            if (bVar.q()) {
                iH = h(bVar, j(bVar), i, 0);
                if (pointFA.x < 0.0f) {
                    iH = -iH;
                }
            } else {
                iH = 0;
            }
            if (bVar.r()) {
                iH2 = h(bVar, k(bVar), 0, i2);
                if (pointFA.y < 0.0f) {
                    iH2 = -iH2;
                }
            } else {
                iH2 = 0;
            }
            if (bVar.r()) {
                iH = iH2;
            }
            if (iH != 0) {
                int i4 = iT + iH;
                int i5 = i4 >= 0 ? i4 : 0;
                return i5 >= iS ? i3 : i5;
            }
        }
        return -1;
    }

    public final int h(androidx.recyclerview.widget.b bVar, pa80 pa80Var, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int I = bVar.I();
        float f = 1.0f;
        if (I != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < I; i5++) {
                View viewH = bVar.H(i5);
                int iT = androidx.recyclerview.widget.b.T(viewH);
                if (iT != -1) {
                    if (iT < i4) {
                        view = viewH;
                        i4 = iT;
                    }
                    if (iT > i3) {
                        view2 = viewH;
                        i3 = iT;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(pa80Var.d(view), pa80Var.d(view2)) - Math.min(pa80Var.g(view), pa80Var.g(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
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
