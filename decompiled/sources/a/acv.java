package a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class acv extends x26 {
    public h2u0 A;
    public final String q;
    public final boolean r;
    public final u710 s;
    public final u710 t;
    public final RectF u;
    public final int v;
    public final int w;
    public final ubv x;
    public final ubv y;
    public final ubv z;

    /* JADX WARN: Illegal instructions before constructor call */
    public acv(bb10 bb10Var, tz5 tz5Var, zbv zbvVar) {
        Paint.Join join;
        Paint.Join join2;
        int iE = hne.E(zbvVar.h);
        Paint.Cap cap = iE != 0 ? iE != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iE2 = hne.E(zbvVar.i);
        Object obj = null;
        if (iE2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iE2 != 1) {
                if (iE2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(bb10Var, tz5Var, cap, join2, zbvVar.j, zbvVar.d, zbvVar.g, zbvVar.k, zbvVar.l);
                this.s = new u710(obj);
                this.t = new u710(obj);
                this.u = new RectF();
                this.q = zbvVar.f44135a;
                this.v = zbvVar.b;
                this.r = zbvVar.m;
                this.w = (int) (bb10Var.f2286a.b() / 32.0f);
                sz5 sz5VarF0 = zbvVar.c.f0();
                this.x = (ubv) sz5VarF0;
                sz5VarF0.a(this);
                tz5Var.f(sz5VarF0);
                sz5 sz5VarF1 = zbvVar.e.f0();
                this.y = (ubv) sz5VarF1;
                sz5VarF1.a(this);
                tz5Var.f(sz5VarF1);
                sz5 sz5VarF2 = zbvVar.f.f0();
                this.z = (ubv) sz5VarF2;
                sz5VarF2.a(this);
                tz5Var.f(sz5VarF2);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(bb10Var, tz5Var, cap, join2, zbvVar.j, zbvVar.d, zbvVar.g, zbvVar.k, zbvVar.l);
        this.s = new u710(obj);
        this.t = new u710(obj);
        this.u = new RectF();
        this.q = zbvVar.f44135a;
        this.v = zbvVar.b;
        this.r = zbvVar.m;
        this.w = (int) (bb10Var.f2286a.b() / 32.0f);
        sz5 sz5VarF3 = zbvVar.c.f0();
        this.x = (ubv) sz5VarF3;
        sz5VarF3.a(this);
        tz5Var.f(sz5VarF3);
        sz5 sz5VarF4 = zbvVar.e.f0();
        this.y = (ubv) sz5VarF4;
        sz5VarF4.a(this);
        tz5Var.f(sz5VarF4);
        sz5 sz5VarF5 = zbvVar.f.f0();
        this.z = (ubv) sz5VarF5;
        sz5VarF5.a(this);
        tz5Var.f(sz5VarF5);
    }

    public final int[] f(int[] iArr) {
        h2u0 h2u0Var = this.A;
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

    @Override // a.x26, a.uky
    public final void g(zn00 zn00Var, Object obj) {
        super.g(zn00Var, obj);
        if (obj == nb10.J) {
            h2u0 h2u0Var = this.A;
            tz5 tz5Var = this.f;
            if (h2u0Var != null) {
                tz5Var.o(h2u0Var);
            }
            h2u0 h2u0Var2 = new h2u0(zn00Var, null);
            this.A = h2u0Var2;
            h2u0Var2.a(this);
            tz5Var.f(this.A);
        }
    }

    @Override // a.qde
    public final String getName() {
        return this.q;
    }

    @Override // a.x26, a.thl
    public final void h(Canvas canvas, Matrix matrix, int i, kil kilVar) {
        Shader shader;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        e(this.u, matrix, false);
        int i2 = this.v;
        ubv ubvVar = this.x;
        ubv ubvVar2 = this.z;
        ubv ubvVar3 = this.y;
        if (i2 == 1) {
            long jI = i();
            u710 u710Var = this.s;
            shader = (LinearGradient) u710Var.b(jI);
            if (shader == null) {
                PointF pointF = (PointF) ubvVar3.e();
                PointF pointF2 = (PointF) ubvVar2.e();
                tbv tbvVar = (tbv) ubvVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(tbvVar.b), tbvVar.f33687a, Shader.TileMode.CLAMP);
                u710Var.f(radialGradient, jI);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            u710 u710Var2 = this.t;
            shader = (RadialGradient) u710Var2.b(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) ubvVar3.e();
                PointF pointF4 = (PointF) ubvVar2.e();
                tbv tbvVar2 = (tbv) ubvVar.e();
                int[] iArrF = f(tbvVar2.b);
                float[] fArr = tbvVar2.f33687a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrF, fArr, Shader.TileMode.CLAMP);
                u710Var2.f(radialGradient, jI2);
                shader = radialGradient;
            }
        }
        this.i.setShader(shader);
        super.h(canvas, matrix, i, kilVar);
    }

    public final int i() {
        float f = this.y.d;
        float f2 = this.w;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.z.d * f2);
        int iRound3 = Math.round(this.x.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
