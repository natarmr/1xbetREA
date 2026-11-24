package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kgr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kgr f18253a;
    private static final ugi0 descriptor;

    static {
        kgr kgrVar = new kgr();
        f18253a = kgrVar;
        zna0 zna0Var = new zna0("GPWebAppSetBalance", kgrVar, 4);
        zna0Var.j("requestId", true);
        zna0Var.j("accountId", false);
        zna0Var.j("balance", false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), s710.f31729a, tbl.f33669a, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        String str = null;
        String strX = null;
        long jR = 0;
        double dT = 0.0d;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                dT = bldVarA.t(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new mgr(i, str, jR, dT, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mgr mgrVar = (mgr) obj;
        mgrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(mgrVar, cldVarA, ugi0Var);
        long j = mgrVar.c;
        String str = mgrVar.e;
        cldVarA.n(ugi0Var, 1, j);
        cldVarA.j(ugi0Var, 2, mgrVar.d);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSetBalance")) {
            cldVarA.z(ugi0Var, 3, str);
        }
        cldVarA.c(ugi0Var);
    }
}
