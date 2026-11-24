package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yn40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yn40 f42920a;
    private static final ugi0 descriptor;

    static {
        yn40 yn40Var = new yn40();
        f42920a = yn40Var;
        zna0 zna0Var = new zna0("org.xplatform.limits_ne.impl.data.models.responses.MoneyLimitResponse", yn40Var, 10);
        zna0Var.j("limitType", true);
        zna0Var.j("currency", true);
        zna0Var.j("freeValue", true);
        zna0Var.j("limitState", true);
        zna0Var.j("endsAt", true);
        zna0Var.j("limitValue", true);
        zna0Var.j("needApprove", true);
        zna0Var.j("pendingValue", true);
        zna0Var.j("pendingEndsAt", true);
        zna0Var.j("freeValueConfiguration", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ2 = mrv.j0(sm8Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(s710Var), mrv.j0(tbl.f33669a), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(m8r.f21383a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        o8r o8rVar = null;
        boolean z = true;
        Long l = null;
        int i = 0;
        Integer num = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        Long l2 = null;
        Double d = null;
        Boolean bool2 = null;
        Long l3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    break;
                case 7:
                    l3 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l3);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l);
                    i |= 256;
                    break;
                case 9:
                    o8rVar = (o8r) bldVarA.e(ugi0Var, 9, m8r.f21383a, o8rVar);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new ko40(i, num, str, bool, str2, l2, d, bool2, l3, l, o8rVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ko40 ko40Var = (ko40) obj;
        ko40Var.getClass();
        o8r o8rVar = ko40Var.j;
        Long l = ko40Var.i;
        Long l2 = ko40Var.h;
        Boolean bool = ko40Var.g;
        Double d = ko40Var.f;
        Long l3 = ko40Var.e;
        String str = ko40Var.d;
        Boolean bool2 = ko40Var.c;
        String str2 = ko40Var.b;
        Integer num = ko40Var.f18613a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || o8rVar != null) {
            cldVarA.p(ugi0Var, 9, m8r.f21383a, o8rVar);
        }
        cldVarA.c(ugi0Var);
    }
}
