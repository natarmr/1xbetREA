package a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class xtm0 extends x26 {
    public final tz5 q;
    public final String r;
    public final boolean s;
    public final e4d t;
    public h2u0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public xtm0(bb10 bb10Var, tz5 tz5Var, wkj0 wkj0Var) {
        int iE = hne.E(wkj0Var.g);
        Paint.Cap cap = iE != 0 ? iE != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iE2 = hne.E(wkj0Var.h);
        super(bb10Var, tz5Var, cap, iE2 != 0 ? iE2 != 1 ? iE2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, wkj0Var.i, wkj0Var.e, wkj0Var.f, wkj0Var.c, wkj0Var.b);
        this.q = tz5Var;
        this.r = wkj0Var.f39310a;
        this.s = wkj0Var.j;
        sz5 sz5VarF0 = wkj0Var.d.f0();
        this.t = (e4d) sz5VarF0;
        sz5VarF0.a(this);
        tz5Var.f(sz5VarF0);
    }

    @Override // a.x26, a.uky
    public final void g(zn00 zn00Var, Object obj) {
        super.g(zn00Var, obj);
        PointF pointF = nb10.f23218a;
        e4d e4dVar = this.t;
        if (obj == 2) {
            e4dVar.j(zn00Var);
            return;
        }
        if (obj == nb10.I) {
            h2u0 h2u0Var = this.u;
            tz5 tz5Var = this.q;
            if (h2u0Var != null) {
                tz5Var.o(h2u0Var);
            }
            h2u0 h2u0Var2 = new h2u0(zn00Var, null);
            this.u = h2u0Var2;
            h2u0Var2.a(this);
            tz5Var.f(e4dVar);
        }
    }

    @Override // a.qde
    public final String getName() {
        return this.r;
    }

    @Override // a.x26, a.thl
    public final void h(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        if (this.s) {
            return;
        }
        e4d e4dVar = this.t;
        int iL = e4dVar.l(e4dVar.c.b(), e4dVar.c());
        sty styVar = this.i;
        styVar.setColor(iL);
        h2u0 h2u0Var = this.u;
        if (h2u0Var != null) {
            styVar.setColorFilter((ColorFilter) h2u0Var.e());
        }
        super.h(canvas, matrix, i, kilVar);
    }
}
