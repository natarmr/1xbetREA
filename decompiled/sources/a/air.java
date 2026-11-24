package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class air implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final air f937a;
    private static final ugi0 descriptor;

    static {
        air airVar = new air();
        f937a = airVar;
        zna0 zna0Var = new zna0("GPWebAppShowGameState", airVar, 4);
        zna0Var.j("requestId", true);
        zna0Var.j(CommonConstant.ReqAccessTokenParam.STATE_LABEL, false);
        zna0Var.j("bonusIsActive", false);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = cir.f;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), a8zVarArr[1].getValue(), sm8.f32432a, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = cir.f;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        String str = null;
        tir tirVar = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                tirVar = (tir) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), tirVar);
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
        return new cir(i, str, tirVar, zB, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cir cirVar = (cir) obj;
        cirVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(cirVar, cldVarA, ugi0Var);
        jiy jiyVar = (jiy) cir.f[1].getValue();
        tir tirVar = cirVar.c;
        String str = cirVar.e;
        cldVarA.m(ugi0Var, 1, jiyVar, tirVar);
        cldVarA.x(ugi0Var, 2, cirVar.d);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "GPWebAppShowGameState")) {
            cldVarA.z(ugi0Var, 3, str);
        }
        cldVarA.c(ugi0Var);
    }
}
