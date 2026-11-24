package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wgr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wgr f39130a;
    private static final ugi0 descriptor;

    static {
        wgr wgrVar = new wgr();
        f39130a = wgrVar;
        zna0 zna0Var = new zna0("GPWebAppSetGameBonusVer2", wgrVar, 3);
        zna0Var.j("requestId", true);
        zna0Var.j("bonus", true);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(nir.f23603a), ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        pir pirVar = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                pirVar = (pir) bldVarA.e(ugi0Var, 1, nir.f23603a, pirVar);
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
        return new ygr(i, str, pirVar, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ygr ygrVar = (ygr) obj;
        ygrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(ygrVar, cldVarA, ugi0Var);
        String str = ygrVar.d;
        pir pirVar = ygrVar.c;
        if (cldVarA.u(ugi0Var) || pirVar != null) {
            cldVarA.p(ugi0Var, 1, nir.f23603a, pirVar);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSetGameBonusVer2")) {
            cldVarA.z(ugi0Var, 2, str);
        }
        cldVarA.c(ugi0Var);
    }
}
