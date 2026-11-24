package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ngr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ngr f23497a;
    private static final ugi0 descriptor;

    static {
        ngr ngrVar = new ngr();
        f23497a = ngrVar;
        zna0 zna0Var = new zna0("GPWebAppSetDemo", ngrVar, 4);
        zna0Var.j("requestId", true);
        zna0Var.j("gameId", false);
        zna0Var.j(CommonConstant.KEY_STATUS, false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), s710.f31729a, sm8.f32432a, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        boolean zB = false;
        String str = null;
        String strX = null;
        long jR = 0;
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
                zB = bldVarA.B(ugi0Var, 2);
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
        return new pgr(i, jR, str, strX, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pgr pgrVar = (pgr) obj;
        pgrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(pgrVar, cldVarA, ugi0Var);
        long j = pgrVar.c;
        String str = pgrVar.e;
        cldVarA.n(ugi0Var, 1, j);
        cldVarA.x(ugi0Var, 2, pgrVar.d);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSetDemo")) {
            cldVarA.z(ugi0Var, 3, str);
        }
        cldVarA.c(ugi0Var);
    }
}
