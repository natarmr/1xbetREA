package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qgr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qgr f28699a;
    private static final ugi0 descriptor;

    static {
        qgr qgrVar = new qgr();
        f28699a = qgrVar;
        zna0 zna0Var = new zna0("GPWebAppSetDemoStatus", qgrVar, 3);
        zna0Var.j("requestId", true);
        zna0Var.j(CommonConstant.KEY_STATUS, false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = sgr.e;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), a8zVarArr[1].getValue(), ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = sgr.e;
        boolean z = true;
        int i = 0;
        String str = null;
        rir rirVar = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                rirVar = (rir) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), rirVar);
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
        return new sgr(i, str, rirVar, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sgr sgrVar = (sgr) obj;
        sgrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(sgrVar, cldVarA, ugi0Var);
        jiy jiyVar = (jiy) sgr.e[1].getValue();
        rir rirVar = sgrVar.c;
        String str = sgrVar.d;
        cldVarA.m(ugi0Var, 1, jiyVar, rirVar);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppSetDemoStatus")) {
            cldVarA.z(ugi0Var, 2, str);
        }
        cldVarA.c(ugi0Var);
    }
}
