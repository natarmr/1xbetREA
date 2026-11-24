package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xjk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xjk0 f40989a;
    private static final ugi0 descriptor;

    static {
        xjk0 xjk0Var = new xjk0();
        f40989a = xjk0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.SocketAuthorizationWithTokenRequest.RequestPayload", xjk0Var, 9);
        zna0Var.j("AppGuid", true);
        zna0Var.j("BundleId", true);
        zna0Var.j("Whence", true);
        zna0Var.j("OS", true);
        zna0Var.j("OSVersion", true);
        zna0Var.j("Language", true);
        zna0Var.j("AccessToken", true);
        zna0Var.j("ReconnectionToken", true);
        zna0Var.j("LastReceivedMessageId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str8);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new zjk0(i, str2, str3, num, str4, str5, str6, str7, str8, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zjk0 zjk0Var = (zjk0) obj;
        zjk0Var.getClass();
        String str = zjk0Var.i;
        String str2 = zjk0Var.h;
        String str3 = zjk0Var.g;
        String str4 = zjk0Var.f;
        String str5 = zjk0Var.e;
        String str6 = zjk0Var.d;
        Integer num = zjk0Var.c;
        String str7 = zjk0Var.b;
        String str8 = zjk0Var.f44485a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
