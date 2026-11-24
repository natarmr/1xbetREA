package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xo10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xo10 f41194a;
    private static final ugi0 descriptor;

    static {
        xo10 xo10Var = new xo10();
        f41194a = xo10Var;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.MBlockResponse", xo10Var, 1);
        zna0Var.j(CommonConstant.ReqAccessTokenParam.STATE_LABEL, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new zo10(i, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zo10 zo10Var = (zo10) obj;
        zo10Var.getClass();
        String str = zo10Var.f44697a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
