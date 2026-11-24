package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rjk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rjk0 f30599a;
    private static final ugi0 descriptor;

    static {
        rjk0 rjk0Var = new rjk0();
        f30599a = rjk0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.SocketAuthorizationRequest.RequestPayload", rjk0Var, 10);
        zna0Var.j("AppGuid", true);
        zna0Var.j("BundleId", true);
        zna0Var.j("Referral", true);
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
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), ysm0Var, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str3 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str3);
                    i |= 1;
                    break;
                case 1:
                    str4 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str4);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
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
                    strX = bldVarA.x(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i |= 256;
                    break;
                case 9:
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new tjk0(i, str3, str4, num, num2, str5, str6, str7, strX, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tjk0 tjk0Var = (tjk0) obj;
        tjk0Var.getClass();
        String str = tjk0Var.j;
        String str2 = tjk0Var.i;
        String str3 = tjk0Var.h;
        String str4 = tjk0Var.g;
        String str5 = tjk0Var.f;
        String str6 = tjk0Var.e;
        Integer num = tjk0Var.d;
        Integer num2 = tjk0Var.c;
        String str7 = tjk0Var.b;
        String str8 = tjk0Var.f34052a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str3, "")) {
            cldVarA.z(ugi0Var, 7, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
