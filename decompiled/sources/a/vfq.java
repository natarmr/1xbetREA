package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vfq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vfq f37346a;
    private static final ugi0 descriptor;

    static {
        vfq vfqVar = new vfq();
        f37346a = vfqVar;
        zna0 zna0Var = new zna0("org.xplatform.social.impl.socials.firebase_auth.entity.FirebaseEntity", vfqVar, 11);
        zna0Var.j("name", true);
        zna0Var.j("iss", true);
        zna0Var.j("aud", true);
        zna0Var.j("auth_time", true);
        zna0Var.j("user_id", true);
        zna0Var.j("sub", true);
        zna0Var.j("iat", true);
        zna0Var.j("exp", true);
        zna0Var.j("email", true);
        zna0Var.j("email_verified", true);
        zna0Var.j("firebase", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0(dfq.f6011a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        ffq ffqVar = null;
        Boolean bool = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
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
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    break;
                case 7:
                    num3 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num3);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                case 9:
                    bool = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool);
                    i |= 512;
                    break;
                case 10:
                    ffqVar = (ffq) bldVarA.e(ugi0Var, 10, dfq.f6011a, ffqVar);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new xfq(i, str2, str3, str4, num, str5, str6, num2, num3, str, bool, ffqVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xfq xfqVar = (xfq) obj;
        xfqVar.getClass();
        ffq ffqVar = xfqVar.k;
        Boolean bool = xfqVar.j;
        String str = xfqVar.i;
        Integer num = xfqVar.h;
        Integer num2 = xfqVar.g;
        String str2 = xfqVar.f;
        String str3 = xfqVar.e;
        Integer num3 = xfqVar.d;
        String str4 = xfqVar.c;
        String str5 = xfqVar.b;
        String str6 = xfqVar.f40803a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || ffqVar != null) {
            cldVarA.p(ugi0Var, 10, dfq.f6011a, ffqVar);
        }
        cldVarA.c(ugi0Var);
    }
}
