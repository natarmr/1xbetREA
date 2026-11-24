package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1p0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1p0 f26215a;
    private static final ugi0 descriptor;

    static {
        p1p0 p1p0Var = new p1p0();
        f26215a = p1p0Var;
        zna0 zna0Var = new zna0("org.xplatform.favorites.impl.data.teambet.models.TeamBetStatisticDataResponse", p1p0Var, 3);
        zna0Var.j("overall", true);
        zna0Var.j("indicators", true);
        zna0Var.j("lastGames", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(d1p0.f5320a), mrv.j0(t0p0.f33130a), mrv.j0((jiy) r1p0.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = r1p0.d;
        boolean z = true;
        int i = 0;
        f1p0 f1p0Var = null;
        v0p0 v0p0Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                f1p0Var = (f1p0) bldVarA.e(ugi0Var, 0, d1p0.f5320a, f1p0Var);
                i |= 1;
            } else if (iF == 1) {
                v0p0Var = (v0p0) bldVarA.e(ugi0Var, 1, t0p0.f33130a, v0p0Var);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new r1p0(i, f1p0Var, v0p0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        r1p0 r1p0Var = (r1p0) obj;
        r1p0Var.getClass();
        List list = r1p0Var.c;
        v0p0 v0p0Var = r1p0Var.b;
        f1p0 f1p0Var = r1p0Var.f29693a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = r1p0.d;
        if (cldVarA.u(ugi0Var) || f1p0Var != null) {
            cldVarA.p(ugi0Var, 0, d1p0.f5320a, f1p0Var);
        }
        if (cldVarA.u(ugi0Var) || v0p0Var != null) {
            cldVarA.p(ugi0Var, 1, t0p0.f33130a, v0p0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
