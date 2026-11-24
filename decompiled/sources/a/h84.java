package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h84 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h84 f12608a;
    private static final ugi0 descriptor;

    static {
        h84 h84Var = new h84();
        f12608a = h84Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.security.AuthHistoryResponse.AuthHistoryResponseItem", h84Var, 11);
        zna0Var.j("City", true);
        zna0Var.j("Country", true);
        zna0Var.j("DateTime", true);
        zna0Var.j("IP", true);
        zna0Var.j("OS", true);
        zna0Var.j("IdOs", true);
        zna0Var.j("NameWhence", true);
        zna0Var.j("SessionId", true);
        zna0Var.j("Whence", true);
        zna0Var.j("Current", true);
        zna0Var.j("HasAuthenticator", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(s710.f31729a);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        Integer num2 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
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
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str6);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                case 9:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool2);
                    i |= 512;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new j84(i, str, str2, l, str3, str4, num2, str5, str6, num, bool2, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j84 j84Var = (j84) obj;
        j84Var.getClass();
        Boolean bool = j84Var.k;
        Boolean bool2 = j84Var.j;
        Integer num = j84Var.i;
        String str = j84Var.h;
        String str2 = j84Var.g;
        Integer num2 = j84Var.f;
        String str3 = j84Var.e;
        String str4 = j84Var.d;
        Long l = j84Var.c;
        String str5 = j84Var.b;
        String str6 = j84Var.f16068a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
