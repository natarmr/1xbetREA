package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uxd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uxd0 f36436a;
    private static final ugi0 descriptor;

    static {
        uxd0 uxd0Var = new uxd0();
        f36436a = uxd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.rainbowsix.RainbowSixPlayersResponse", uxd0Var, 7);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("realName", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("country", true);
        zna0Var.j("countryImageS3", true);
        zna0Var.j("stats", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(xxd0.f41653a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zxd0 zxd0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i |= 32;
                    break;
                case 6:
                    zxd0Var = (zxd0) bldVarA.e(ugi0Var, 6, xxd0.f41653a, zxd0Var);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new wxd0(i, l, str, str2, str3, str4, str5, zxd0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wxd0 wxd0Var = (wxd0) obj;
        wxd0Var.getClass();
        zxd0 zxd0Var = wxd0Var.g;
        String str = wxd0Var.f;
        String str2 = wxd0Var.e;
        String str3 = wxd0Var.d;
        String str4 = wxd0Var.c;
        String str5 = wxd0Var.b;
        Long l = wxd0Var.f39927a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || zxd0Var != null) {
            cldVarA.p(ugi0Var, 6, xxd0.f41653a, zxd0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
