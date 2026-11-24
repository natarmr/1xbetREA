package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i3v0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3v0 f14116a;
    private static final ugi0 descriptor;

    static {
        i3v0 i3v0Var = new i3v0();
        f14116a = i3v0Var;
        zna0 zna0Var = new zna0("org.xplatform.feature.office.payment.impl.presentation.WebPaymentJsInterface.OpenInBrowserData", i3v0Var, 1);
        zna0Var.j(RemoteMessageConst.Notification.URL, true);
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
        return new k3v0(i, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k3v0 k3v0Var = (k3v0) obj;
        k3v0Var.getClass();
        String str = k3v0Var.f17638a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
