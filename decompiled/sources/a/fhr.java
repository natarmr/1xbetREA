package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fhr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fhr f9555a;
    private static final ugi0 descriptor;

    static {
        fhr fhrVar = new fhr();
        f9555a = fhrVar;
        zna0 zna0Var = new zna0("GPWebAppSetPageTitle", fhrVar, 3);
        zna0Var.j("requestId", true);
        zna0Var.j("title", false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new hhr(str, i, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hhr hhrVar = (hhr) obj;
        hhrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(hhrVar, cldVarA, ugi0Var);
        String str = hhrVar.c;
        String str2 = hhrVar.d;
        cldVarA.z(ugi0Var, 1, str);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "GPWebAppSetPageTitle")) {
            cldVarA.z(ugi0Var, 2, str2);
        }
        cldVarA.c(ugi0Var);
    }
}
