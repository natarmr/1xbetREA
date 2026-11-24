package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xhr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xhr f40909a;
    private static final ugi0 descriptor;

    static {
        xhr xhrVar = new xhr();
        f40909a = xhrVar;
        zna0 zna0Var = new zna0("GPWebAppShowGameBonus", xhrVar, 3);
        zna0Var.j("requestId", true);
        zna0Var.j("bonus", true);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(qbv.f28457a), ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        sbv sbvVar = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                sbvVar = (sbv) bldVarA.e(ugi0Var, 1, qbv.f28457a, sbvVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new zhr(i, str, sbvVar, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zhr zhrVar = (zhr) obj;
        zhrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(zhrVar, cldVarA, ugi0Var);
        String str = zhrVar.d;
        sbv sbvVar = zhrVar.c;
        if (cldVarA.u(ugi0Var) || sbvVar != null) {
            cldVarA.p(ugi0Var, 1, qbv.f28457a, sbvVar);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppShowGameBonus")) {
            cldVarA.z(ugi0Var, 2, str);
        }
        cldVarA.c(ugi0Var);
    }
}
