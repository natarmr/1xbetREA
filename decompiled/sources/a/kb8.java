package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kb8 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kb8 f18000a;
    private static final ugi0 descriptor;

    static {
        kb8 kb8Var = new kb8();
        f18000a = kb8Var;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.model.BodyReq", kb8Var, 12);
        zna0Var.j("DevNumberType", true);
        zna0Var.j("BundleId", true);
        zna0Var.j("Channel", true);
        zna0Var.j("AppsFlyerId", true);
        zna0Var.j("Tag", true);
        zna0Var.j("Reff", true);
        zna0Var.j("Os", true);
        zna0Var.j("EventType", true);
        zna0Var.j("DevNumber", true);
        zna0Var.j("PlayerId", true);
        zna0Var.j("Pb", true);
        zna0Var.j("PromoCode", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        String str2 = null;
        Long l = null;
        boolean z = true;
        String str3 = null;
        int i = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str = str;
                    break;
                case 0:
                    str4 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i |= 1;
                    z = z;
                    str = str;
                    break;
                case 1:
                    str5 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str5);
                    i |= 2;
                    z = z;
                    str4 = str4;
                    break;
                case 2:
                    str6 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str6);
                    i |= 4;
                    z = z;
                    str4 = str4;
                    break;
                case 3:
                    str7 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str7);
                    i |= 8;
                    z = z;
                    str4 = str4;
                    break;
                case 4:
                    str8 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str8);
                    i |= 16;
                    z = z;
                    str4 = str4;
                    break;
                case 5:
                    num = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num);
                    i |= 32;
                    z = z;
                    str4 = str4;
                    break;
                case 6:
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    z = z;
                    str4 = str4;
                    break;
                case 7:
                    num3 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num3);
                    i |= 128;
                    z = z;
                    str4 = str4;
                    break;
                case 8:
                    str3 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str3);
                    i |= 256;
                    z = z;
                    str4 = str4;
                    break;
                case 9:
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i |= 512;
                    z = z;
                    str4 = str4;
                    break;
                case 10:
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i |= 1024;
                    z = z;
                    str4 = str4;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    z = z;
                    str4 = str4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new mb8(i, str4, str5, str6, str7, str8, num, num2, num3, str3, l, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mb8 mb8Var = (mb8) obj;
        mb8Var.getClass();
        String str = mb8Var.l;
        String str2 = mb8Var.k;
        Long l = mb8Var.j;
        String str3 = mb8Var.i;
        Integer num = mb8Var.h;
        Integer num2 = mb8Var.g;
        Integer num3 = mb8Var.f;
        String str4 = mb8Var.e;
        String str5 = mb8Var.d;
        String str6 = mb8Var.c;
        String str7 = mb8Var.b;
        String str8 = mb8Var.f21495a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
