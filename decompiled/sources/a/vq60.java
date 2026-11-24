package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vq60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vq60 f37842a;
    private static final ugi0 descriptor;

    static {
        vq60 vq60Var = new vq60();
        f37842a = vq60Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.OneXGamesActionsWorkStatusResponse", vq60Var, 2);
        zna0Var.j("actionId", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(ce70.f4198a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        be70 be70Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                be70Var = (be70) bldVarA.e(ugi0Var, 1, ce70.f4198a, be70Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new xq60(i, num, be70Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xq60 xq60Var = (xq60) obj;
        xq60Var.getClass();
        be70 be70Var = xq60Var.b;
        Integer num = xq60Var.f41302a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || be70Var != null) {
            cldVarA.p(ugi0Var, 1, ce70.f4198a, be70Var);
        }
        cldVarA.c(ugi0Var);
    }
}
