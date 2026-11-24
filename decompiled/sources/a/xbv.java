package a;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xbv implements thl, oz5, vky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40618a;
    public final boolean b;
    public final tz5 c;
    public final u710 d = new u710((Object) null);
    public final u710 e = new u710((Object) null);
    public final Path f;
    public final sty g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final ubv k;
    public final e4d l;
    public final ubv m;
    public final ubv n;
    public h2u0 o;
    public h2u0 p;
    public final bb10 q;
    public final int r;
    public sz5 s;
    public float t;

    public xbv(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var, wbv wbvVar) {
        Path path = new Path();
        this.f = path;
        this.g = new sty(1, (byte) 0);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = tz5Var;
        this.f40618a = wbvVar.g;
        this.b = wbvVar.h;
        this.q = bb10Var;
        this.j = wbvVar.f38898a;
        path.setFillType(wbvVar.b);
        this.r = (int) (fa10Var.b() / 32.0f);
        sz5 sz5VarF0 = wbvVar.c.f0();
        this.k = (ubv) sz5VarF0;
        sz5VarF0.a(this);
        tz5Var.f(sz5VarF0);
        sz5 sz5VarF1 = wbvVar.d.f0();
        this.l = (e4d) sz5VarF1;
        sz5VarF1.a(this);
        tz5Var.f(sz5VarF1);
        sz5 sz5VarF2 = wbvVar.e.f0();
        this.m = (ubv) sz5VarF2;
        sz5VarF2.a(this);
        tz5Var.f(sz5VarF2);
        sz5 sz5VarF3 = wbvVar.f.f0();
        this.n = (ubv) sz5VarF3;
        sz5VarF3.a(this);
        tz5Var.f(sz5VarF3);
        if (tz5Var.l() != null) {
            hlq hlqVarF0 = ((v33) tz5Var.l().f29996a).f0();
            this.s = hlqVarF0;
            hlqVarF0.a(this);
            tz5Var.f(this.s);
        }
    }

    @Override // a.oz5
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // a.qde
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            qde qdeVar = (qde) list2.get(i);
            if (qdeVar instanceof b290) {
                this.i.add((b290) qdeVar);
            }
        }
    }

    @Override // a.uky
    public final void d(tky tkyVar, int i, ArrayList arrayList, tky tkyVar2) {
        ah40.g(tkyVar, i, arrayList, tkyVar2, this);
    }

    @Override // a.thl
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((b290) arrayList.get(i)).c(), matrix);
                i++;
            }
        }
    }

    public final int[] f(int[] iArr) {
        h2u0 h2u0Var = this.p;
        if (h2u0Var != null) {
            Integer[] numArr = (Integer[]) h2u0Var.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // a.uky
    public final void g(zn00 zn00Var, Object obj) {
        PointF pointF = nb10.f23218a;
        if (obj == 4) {
            this.l.j(zn00Var);
            return;
        }
        ColorFilter colorFilter = nb10.I;
        tz5 tz5Var = this.c;
        if (obj == colorFilter) {
            h2u0 h2u0Var = this.o;
            if (h2u0Var != null) {
                tz5Var.o(h2u0Var);
            }
            h2u0 h2u0Var2 = new h2u0(zn00Var, null);
            this.o = h2u0Var2;
            h2u0Var2.a(this);
            tz5Var.f(this.o);
            return;
        }
        if (obj == nb10.J) {
            h2u0 h2u0Var3 = this.p;
            if (h2u0Var3 != null) {
                tz5Var.o(h2u0Var3);
            }
            this.d.a();
            this.e.a();
            h2u0 h2u0Var4 = new h2u0(zn00Var, null);
            this.p = h2u0Var4;
            h2u0Var4.a(this);
            tz5Var.f(this.p);
            return;
        }
        if (obj == nb10.e) {
            sz5 sz5Var = this.s;
            if (sz5Var != null) {
                sz5Var.j(zn00Var);
                return;
            }
            h2u0 h2u0Var5 = new h2u0(zn00Var, null);
            this.s = h2u0Var5;
            h2u0Var5.a(this);
            tz5Var.f(this.s);
        }
    }

    @Override // a.qde
    public final String getName() {
        return this.f40618a;
    }

    @Override // a.thl
    public final void h(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((b290) arrayList.get(i2)).c(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        ubv ubvVar = this.k;
        ubv ubvVar2 = this.n;
        ubv ubvVar3 = this.m;
        if (i3 == 1) {
            long jI = i();
            u710 u710Var = this.d;
            linearGradient = (LinearGradient) u710Var.b(jI);
            if (linearGradient == null) {
                PointF pointF = (PointF) ubvVar3.e();
                PointF pointF2 = (PointF) ubvVar2.e();
                tbv tbvVar = (tbv) ubvVar.e();
                int[] iArrF = f(tbvVar.b);
                float[] fArr2 = tbvVar.f33687a;
                if (iArrF.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrF[0], iArrF[0]};
                } else {
                    iArr2 = iArrF;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                u710Var.f(linearGradient, jI);
            }
        } else {
            long jI2 = i();
            u710 u710Var2 = this.e;
            RadialGradient radialGradient = (RadialGradient) u710Var2.b(jI2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) ubvVar3.e();
                PointF pointF4 = (PointF) ubvVar2.e();
                tbv tbvVar2 = (tbv) ubvVar.e();
                int[] iArrF2 = f(tbvVar2.b);
                float[] fArr3 = tbvVar2.f33687a;
                if (iArrF2.length < 2) {
                    iArr = new int[]{iArrF2[0], iArrF2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrF2;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                u710Var2.f(radialGradient2, jI2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        sty styVar = this.g;
        styVar.setShader(linearGradient);
        h2u0 h2u0Var = this.o;
        if (h2u0Var != null) {
            styVar.setColorFilter((ColorFilter) h2u0Var.e());
        }
        sz5 sz5Var = this.s;
        if (sz5Var != null) {
            float fFloatValue = ((Float) sz5Var.e()).floatValue();
            if (fFloatValue == 0.0f) {
                styVar.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                styVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float fIntValue = ((Integer) this.l.e()).intValue() / 100.0f;
        styVar.setAlpha(ah40.c((int) (i * fIntValue)));
        if (kilVar != null) {
            kilVar.a((int) (fIntValue * 255.0f), styVar);
        }
        canvas.drawPath(path, styVar);
    }

    public final int i() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
