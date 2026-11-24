package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class os2 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final os2 f25764a;
    private static final ugi0 descriptor;

    static {
        os2 os2Var = new os2();
        f25764a = os2Var;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.model.AnalyticsEventRequest", os2Var, 1);
        zna0Var.j(RemoteMessageConst.DATA, false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{rs2.f31014a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        xs2 xs2Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                xs2Var = (xs2) bldVarA.m(ugi0Var, 0, rs2.f31014a, xs2Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new qs2(i, xs2Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qs2 qs2Var = (qs2) obj;
        qs2Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, rs2.f31014a, qs2Var.f29238a);
        cldVarA.c(ugi0Var);
    }
}
