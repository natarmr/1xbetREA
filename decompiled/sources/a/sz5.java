package a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sz5 {
    public final pz5 c;
    public zn00 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33053a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public sz5(List list) {
        pz5 rz5Var;
        if (list.isEmpty()) {
            rz5Var = new gl5((byte) 2);
        } else {
            rz5Var = list.size() == 1 ? new rz5(list) : new qz5(list);
        }
        this.c = rz5Var;
    }

    public final void a(oz5 oz5Var) {
        this.f33053a.add(oz5Var);
    }

    public float b() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float fE = this.c.e();
        this.h = fE;
        return fE;
    }

    public final float c() {
        Interpolator interpolator;
        cmy cmyVarB = this.c.b();
        if (cmyVarB == null || cmyVarB.c() || (interpolator = cmyVarB.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        cmy cmyVarB = this.c.b();
        if (cmyVarB.c()) {
            return 0.0f;
        }
        return (this.d - cmyVarB.b()) / (cmyVarB.a() - cmyVarB.b());
    }

    public Object e() {
        float fD = d();
        zn00 zn00Var = this.e;
        pz5 pz5Var = this.c;
        if (zn00Var == null && pz5Var.a(fD) && !k()) {
            return this.f;
        }
        cmy cmyVarB = pz5Var.b();
        Interpolator interpolator = cmyVarB.e;
        Interpolator interpolator2 = cmyVarB.f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(cmyVarB, c()) : g(cmyVarB, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(cmy cmyVar, float f);

    public Object g(cmy cmyVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f33053a;
            if (i >= arrayList.size()) {
                return;
            }
            ((oz5) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        pz5 pz5Var = this.c;
        if (pz5Var.isEmpty()) {
            return;
        }
        float fD = this.g;
        if (fD == -1.0f) {
            fD = pz5Var.d();
            this.g = fD;
        }
        float f2 = fD;
        if (f < fD) {
            if (f2 == -1.0f) {
                f = pz5Var.d();
                this.g = f;
            } else {
                f = f2;
            }
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (pz5Var.c(f)) {
            h();
        }
    }

    public final void j(zn00 zn00Var) {
        zn00 zn00Var2 = this.e;
        if (zn00Var2 != null) {
            zn00Var2.getClass();
        }
        this.e = zn00Var;
    }

    public boolean k() {
        return false;
    }
}
