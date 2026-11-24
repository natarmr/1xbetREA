package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class gmn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f11548a = new zfn(new a7n0((byte) 16), (byte) 0);

    public static final void a(mm40 mm40Var, yjj0 yjj0Var, long j, long j2, float f, float f2, dn8 dn8Var, ugd ugdVar, fet fetVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i2 & 2) != 0) {
            yjj0Var = jd8.n;
        }
        if ((i2 & 8) != 0) {
            j2 = v4d.b(j, fetVar);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            dn8Var = null;
        }
        zfn zfnVar = f11548a;
        float f3 = f + ((ycl) fetVar.k(zfnVar)).f42389a;
        obc.e(new l5d0[]{yde.f42431a.a(new y3d(j2)), zfnVar.a(new ycl(f3))}, u1c.M(421772006, new emn0(mm40Var, yjj0Var, j, f3, dn8Var, f2, ugdVar), fetVar), fetVar, 56);
    }

    public static final void b(Function0 function0, mm40 mm40Var, boolean z, yjj0 yjj0Var, long j, long j2, float f, float f2, gy40 gy40Var, ugd ugdVar, fet fetVar, int i, int i2) {
        gy40 gy40Var2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        float f4 = (i2 & 128) != 0 ? 0.0f : f2;
        if (gy40Var == null) {
            fetVar.e0(-1701037204);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            fetVar.r(false);
            gy40Var2 = (gy40) objP;
        } else {
            fetVar.e0(2023337163);
            fetVar.r(false);
            gy40Var2 = gy40Var;
        }
        zfn zfnVar = f11548a;
        float f5 = ((ycl) fetVar.k(zfnVar)).f42389a + f3;
        obc.e(new l5d0[]{yde.f42431a.a(new y3d(j2)), zfnVar.a(new ycl(f5))}, u1c.M(849208527, new fmn0(mm40Var, yjj0Var, j, f5, null, gy40Var2, z2, function0, f4, ugdVar), fetVar), fetVar, 56);
    }

    public static final mm40 c(mm40 mm40Var, yjj0 yjj0Var, long j, dn8 dn8Var, float f) {
        yjj0 yjj0Var2;
        mm40 mm40VarV;
        mm40 mm40VarT = jm40.b;
        if (f > 0.0f) {
            yjj0Var2 = yjj0Var;
            mm40VarV = i4w0.V(mm40VarT, 0.0f, 0.0f, 0.0f, f, yjj0Var2, 124895);
        } else {
            yjj0Var2 = yjj0Var;
            mm40VarV = mm40VarT;
        }
        mm40 mm40VarE = mm40Var.e(mm40VarV);
        if (dn8Var != null) {
            mm40VarT = i120.T(mm40VarT, dn8Var.f6356a, dn8Var.b, yjj0Var2);
        }
        return lgb.J(i120.Q(mm40VarE.e(mm40VarT), j, yjj0Var2), yjj0Var2);
    }

    public static final long d(long j, float f, fet fetVar) {
        t4d t4dVar = (t4d) fetVar.k(v4d.f36771a);
        boolean zBooleanValue = ((Boolean) fetVar.k(v4d.b)).booleanValue();
        long j2 = t4dVar.p;
        int i = y3d.h;
        if (h2t0.a(j, j2) && zBooleanValue) {
            return ycl.b(f, 0.0f) ? j2 : fbc.L(y3d.c(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, t4dVar.t), j2);
        }
        return j;
    }
}
