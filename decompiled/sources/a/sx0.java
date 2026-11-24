package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sx0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sx0 f32949a;
    private static final ugi0 descriptor;

    static {
        sx0 sx0Var = new sx0();
        f32949a = sx0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorGamesRawResponse", sx0Var, 3);
        zna0Var.j(RemoteMessageConst.DATA, true);
        zna0Var.j("ErrorId", true);
        zna0Var.j("Message", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(fx0.f10285a), okx.f25427a, mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        hx0 hx0Var = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                hx0Var = (hx0) bldVarA.e(ugi0Var, 0, fx0.f10285a, hx0Var);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ux0(i, hx0Var, iJ, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ux0 ux0Var = (ux0) obj;
        ux0Var.getClass();
        String str = ux0Var.c;
        int i = ux0Var.b;
        hx0 hx0Var = ux0Var.f36417a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || hx0Var != null) {
            cldVarA.p(ugi0Var, 0, fx0.f10285a, hx0Var);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(1, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
