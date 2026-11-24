package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nq4 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nq4 f23940a;
    private static final ugi0 descriptor;

    static {
        nq4 nq4Var = new nq4();
        f23940a = nq4Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.notifications.AuthenticatorNotificationV2Response", nq4Var, 16);
        zna0Var.j("appGuid", true);
        zna0Var.j("key", true);
        zna0Var.j("iv", true);
        zna0Var.j("code", true);
        zna0Var.j("createdAt", true);
        zna0Var.j("expiredAt", true);
        zna0Var.j("expiryTimeSec", true);
        zna0Var.j("completedAt", true);
        zna0Var.j("ip", true);
        zna0Var.j("operatingSystemId", true);
        zna0Var.j("os", true);
        zna0Var.j("location", true);
        zna0Var.j("operationApprovalId", true);
        zna0Var.j("operationType", true);
        zna0Var.j("randomString", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ4 = mrv.j0(s710Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        String str2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        Integer num2 = null;
        String str7 = null;
        Integer num3 = null;
        String str8 = null;
        Long l = null;
        Long l2 = null;
        Integer num4 = null;
        Long l3 = null;
        boolean z = true;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str9;
                    z = false;
                    str4 = str4;
                    l = l;
                    str9 = str;
                    str3 = str3;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str9);
                    i |= 1;
                    str4 = str4;
                    str8 = str8;
                    l = l;
                    str9 = str;
                    str3 = str3;
                    break;
                case 1:
                    str2 = str8;
                    str10 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str10);
                    i |= 2;
                    str11 = str11;
                    str8 = str2;
                    l = l;
                    str3 = str3;
                    break;
                case 2:
                    str2 = str8;
                    str11 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str11);
                    i |= 4;
                    str8 = str2;
                    l = l;
                    str3 = str3;
                    break;
                case 3:
                    str3 = str3;
                    l = l;
                    str8 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str8);
                    i |= 8;
                    l = l;
                    str3 = str3;
                    break;
                case 4:
                    str3 = str3;
                    l = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l);
                    i |= 16;
                    str8 = str8;
                    str3 = str3;
                    break;
                case 5:
                    l2 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l2);
                    i |= 32;
                    str8 = str8;
                    l = l;
                    break;
                case 6:
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
                    i |= 64;
                    str8 = str8;
                    l = l;
                    break;
                case 7:
                    l3 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l3);
                    i |= 128;
                    str8 = str8;
                    l = l;
                    break;
                case 8:
                    str6 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str6);
                    i |= 256;
                    str8 = str8;
                    l = l;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    str8 = str8;
                    l = l;
                    break;
                case 10:
                    str4 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str4);
                    i |= 1024;
                    str8 = str8;
                    l = l;
                    break;
                case 11:
                    str3 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str3);
                    i |= 2048;
                    str8 = str8;
                    l = l;
                    break;
                case 12:
                    str5 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str5);
                    i |= 4096;
                    str8 = str8;
                    l = l;
                    break;
                case 13:
                    num2 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num2);
                    i |= 8192;
                    str8 = str8;
                    l = l;
                    break;
                case 14:
                    str7 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str7);
                    i |= 16384;
                    str8 = str8;
                    l = l;
                    break;
                case 15:
                    num3 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num3);
                    i |= 32768;
                    str8 = str8;
                    l = l;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str12 = str3;
        Long l4 = l;
        String str13 = str9;
        String str14 = str10;
        String str15 = str11;
        bldVarA.c(ugi0Var);
        return new pq4(i, str13, str14, str15, str8, l4, l2, num4, l3, str6, num, str4, str12, str5, num2, str7, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pq4 pq4Var = (pq4) obj;
        pq4Var.getClass();
        Integer num = pq4Var.p;
        String str = pq4Var.o;
        Integer num2 = pq4Var.n;
        String str2 = pq4Var.m;
        String str3 = pq4Var.l;
        String str4 = pq4Var.k;
        Integer num3 = pq4Var.j;
        String str5 = pq4Var.i;
        Long l = pq4Var.h;
        Integer num4 = pq4Var.g;
        Long l2 = pq4Var.f;
        Long l3 = pq4Var.e;
        String str6 = pq4Var.d;
        String str7 = pq4Var.c;
        String str8 = pq4Var.b;
        String str9 = pq4Var.f27397a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
