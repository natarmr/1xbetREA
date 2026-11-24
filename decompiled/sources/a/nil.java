package a;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class nil implements oz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tz5 f23594a;
    public final tz5 b;
    public final e4d c;
    public final hlq d;
    public final hlq e;
    public final hlq f;
    public final hlq g;
    public Matrix h;

    public nil(tz5 tz5Var, tz5 tz5Var2, kki kkiVar) {
        this.b = tz5Var;
        this.f23594a = tz5Var2;
        sz5 sz5VarF0 = ((u33) kkiVar.e).f0();
        this.c = (e4d) sz5VarF0;
        sz5VarF0.a(this);
        tz5Var2.f(sz5VarF0);
        hlq hlqVarF0 = ((v33) kkiVar.b).f0();
        this.d = hlqVarF0;
        hlqVarF0.a(this);
        tz5Var2.f(hlqVarF0);
        hlq hlqVarF1 = ((v33) kkiVar.c).f0();
        this.e = hlqVarF1;
        hlqVarF1.a(this);
        tz5Var2.f(hlqVarF1);
        hlq hlqVarF2 = ((v33) kkiVar.d).f0();
        this.f = hlqVarF2;
        hlqVarF2.a(this);
        tz5Var2.f(hlqVarF2);
        hlq hlqVarF3 = ((v33) kkiVar.f).f0();
        this.g = hlqVarF3;
        hlqVarF3.a(this);
        tz5Var2.f(hlqVarF3);
    }

    @Override // a.oz5
    public final void a() {
        this.b.a();
    }

    public final kil b(Matrix matrix, int i) {
        float fL = this.e.l() * 0.017453292f;
        float fFloatValue = ((Float) this.f.e()).floatValue();
        double d = fL;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.g.e()).floatValue();
        int iIntValue = ((Integer) this.c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        kil kilVar = new kil();
        kilVar.f18344a = fFloatValue2 * 0.33f;
        kilVar.b = fSin;
        kilVar.c = fCos;
        kilVar.d = iArgb;
        kilVar.e = null;
        kilVar.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.f23594a.w.e().invert(this.h);
        kilVar.c(this.h);
        return kilVar;
    }

    public final void c(zn00 zn00Var) {
        this.d.j(new mil(zn00Var));
    }
}
