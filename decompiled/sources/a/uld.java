package a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uld extends tz5 {
    public sz5 D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final me60 I;
    public final y78 J;
    public float K;
    public boolean L;
    public final nil M;

    public uld(bb10 bb10Var, y5z y5zVar, List list, fa10 fa10Var) {
        tz5 tz5Var;
        tz5 uldVar;
        String str;
        super(bb10Var, y5zVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new me60();
        this.J = new y78((byte) 10);
        this.L = true;
        v33 v33Var = y5zVar.s;
        if (v33Var != null) {
            hlq hlqVarF0 = v33Var.f0();
            this.D = hlqVarF0;
            f(hlqVarF0);
            this.D.a(this);
        } else {
            this.D = null;
        }
        u710 u710Var = new u710(fa10Var.j.size());
        int size = list.size() - 1;
        tz5 tz5Var2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < u710Var.h(); i++) {
                    tz5 tz5Var3 = (tz5) u710Var.b(u710Var.e(i));
                    if (tz5Var3 != null && (tz5Var = (tz5) u710Var.b(tz5Var3.p.f)) != null) {
                        tz5Var3.t = tz5Var;
                    }
                }
                kki kkiVar = this.p.x;
                if (kkiVar != null) {
                    this.M = new nil(this, this, kkiVar);
                    return;
                }
                return;
            }
            y5z y5zVar2 = (y5z) list.get(size);
            int iE = hne.E(y5zVar2.e);
            if (iE == 0) {
                uldVar = new uld(bb10Var, y5zVar2, (List) fa10Var.c.get(y5zVar2.g), fa10Var);
            } else if (iE == 1) {
                uldVar = new tkk0(bb10Var, y5zVar2);
            } else if (iE == 2) {
                uldVar = new k0x(bb10Var, y5zVar2);
            } else if (iE == 3) {
                uldVar = new h860(bb10Var, y5zVar2);
            } else if (iE == 4) {
                uldVar = new mkj0(bb10Var, y5zVar2, this, fa10Var);
            } else if (iE != 5) {
                switch (y5zVar2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                        break;
                    default:
                        str = "null";
                        break;
                }
                xv00.b("Unknown layer type ".concat(str));
                uldVar = null;
            } else {
                uldVar = new x8q0(bb10Var, y5zVar2);
            }
            if (uldVar != null) {
                u710Var.f(uldVar, uldVar.p.d);
                if (tz5Var2 != null) {
                    tz5Var2.s = uldVar;
                    tz5Var2 = null;
                } else {
                    this.E.add(0, uldVar);
                    int iE2 = hne.E(y5zVar2.u);
                    if (iE2 == 1 || iE2 == 2) {
                        tz5Var2 = uldVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // a.tz5, a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((tz5) arrayList.get(size)).e(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // a.tz5, a.uky
    public final void g(zn00 zn00Var, Object obj) {
        super.g(zn00Var, obj);
        if (obj == nb10.C) {
            h2u0 h2u0Var = new h2u0(zn00Var, null);
            this.D = h2u0Var;
            h2u0Var.a(this);
            f(this.D);
            return;
        }
        nil nilVar = this.M;
        if (obj == 5 && nilVar != null) {
            nilVar.c.j(zn00Var);
            return;
        }
        if (obj == nb10.E && nilVar != null) {
            nilVar.c(zn00Var);
            return;
        }
        if (obj == nb10.F && nilVar != null) {
            nilVar.e.j(zn00Var);
            return;
        }
        if (obj == nb10.G && nilVar != null) {
            nilVar.f.j(zn00Var);
        } else {
            if (obj != nb10.H || nilVar == null) {
                return;
            }
            nilVar.g.j(zn00Var);
        }
    }

    @Override // a.tz5
    public final void k(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        Canvas canvasE;
        boolean z = false;
        nil nilVar = this.M;
        boolean z2 = (kilVar == null && nilVar == null) ? false : true;
        bb10 bb10Var = this.o;
        boolean z3 = bb10Var.s;
        ArrayList<tz5> arrayList = this.E;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && bb10Var.t)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (nilVar != null) {
            kilVar = nilVar.b(matrix, i2);
        }
        boolean z4 = this.L;
        y5z y5zVar = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(y5zVar.c)) {
            rectF.set(0.0f, 0.0f, y5zVar.o, y5zVar.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (tz5 tz5Var : arrayList) {
                RectF rectF2 = this.H;
                tz5Var.e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        me60 me60Var = this.I;
        if (z) {
            y78 y78Var = this.J;
            y78Var.c = null;
            y78Var.b = i;
            if (kilVar != null) {
                if (Color.alpha(kilVar.d) > 0) {
                    y78Var.c = kilVar;
                } else {
                    y78Var.c = null;
                }
                kilVar = null;
            }
            canvasE = me60Var.e(canvas, rectF, y78Var);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((tz5) arrayList.get(size)).h(canvasE, matrix, i2, kilVar);
            }
        }
        if (z) {
            me60Var.c();
        }
        canvas.restore();
    }

    @Override // a.tz5
    public final void p(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((tz5) arrayList2.get(i2)).d(tkyVar, i, arrayList, tkyVar2);
            i2++;
        }
    }

    @Override // a.tz5
    public final void q(boolean z) {
        super.q(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((tz5) it.next()).q(z);
        }
    }

    @Override // a.tz5
    public final void r(float f) {
        this.K = f;
        super.r(f);
        sz5 sz5Var = this.D;
        y5z y5zVar = this.p;
        if (sz5Var != null) {
            fa10 fa10Var = this.o.f2286a;
            f = ((((Float) sz5Var.e()).floatValue() * y5zVar.b.n) - y5zVar.b.l) / ((fa10Var.m - fa10Var.l) + 0.01f);
        }
        if (this.D == null) {
            float f2 = y5zVar.n;
            fa10 fa10Var2 = y5zVar.b;
            f -= f2 / (fa10Var2.m - fa10Var2.l);
        }
        if (y5zVar.m != 0.0f && !"__container".equals(y5zVar.c)) {
            f /= y5zVar.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((tz5) arrayList.get(size)).r(f);
        }
    }
}
