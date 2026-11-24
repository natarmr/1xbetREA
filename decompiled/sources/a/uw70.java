package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uw70 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uw70 f36381a;
    private static final ugi0 descriptor;

    static {
        uw70 uw70Var = new uw70();
        f36381a = uw70Var;
        zna0 zna0Var = new zna0("org.xplatform.promotions.web_view.webview_messages.OpenPromopageDataMessage", uw70Var, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(xw70.f41597a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        zw70 zw70Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                zw70Var = (zw70) bldVarA.e(ugi0Var, 0, xw70.f41597a, zw70Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new ww70(i, zw70Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ww70 ww70Var = (ww70) obj;
        ww70Var.getClass();
        zw70 zw70Var = ww70Var.f39875a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || zw70Var != null) {
            cldVarA.p(ugi0Var, 0, xw70.f41597a, zw70Var);
        }
        cldVarA.c(ugi0Var);
    }
}
