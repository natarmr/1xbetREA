package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mix implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mix f21867a;
    private static final ugi0 descriptor;

    static {
        mix mixVar = new mix();
        f21867a = mixVar;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.model.InstallEventRequest", mixVar, 5);
        zna0Var.j("deviceId", false);
        zna0Var.j("bTag", false);
        zna0Var.j(Payload.TYPE, false);
        zna0Var.j("os", false);
        zna0Var.j("bundle", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, mrv.j0(ysm0Var), mrv.j0(ysm0Var), ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String str = null;
        String str2 = null;
        String strX2 = null;
        String strX3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else if (iF == 3) {
                strX2 = bldVarA.x(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                strX3 = bldVarA.x(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new oix(i, strX, str, str2, strX2, strX3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        oix oixVar = (oix) obj;
        oixVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, oixVar.f25332a);
        ysm0 ysm0Var = ysm0.f43175a;
        cldVarA.p(ugi0Var, 1, ysm0Var, oixVar.b);
        cldVarA.p(ugi0Var, 2, ysm0Var, oixVar.c);
        cldVarA.z(ugi0Var, 3, oixVar.d);
        cldVarA.z(ugi0Var, 4, oixVar.e);
        cldVarA.c(ugi0Var);
    }
}
