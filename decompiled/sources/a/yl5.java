package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yl5 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yl5 f42824a;
    private static final ugi0 descriptor;

    static {
        yl5 yl5Var = new yl5();
        f42824a = yl5Var;
        zna0 zna0Var = new zna0("org.xplatform.balance.data.model.BalanceResponse", yl5Var, 10);
        zna0Var.j("Id", true);
        zna0Var.j("Money", true);
        zna0Var.j("HasLineRestrict", true);
        zna0Var.j("HasLiveRestrict", true);
        zna0Var.j("CurrencyId", true);
        zna0Var.j("Points", true);
        zna0Var.j("Type", true);
        zna0Var.j("Alias", true);
        zna0Var.j("Name", true);
        zna0Var.j("OpenBonusExists", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        jiy jiyVarJ1 = mrv.j0(tbl.f33669a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ2 = mrv.j0(sm8Var);
        jiy jiyVarJ3 = mrv.j0(sm8Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Long l = null;
        Double d = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
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
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool2);
                    i |= 4;
                    break;
                case 3:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
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
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new am5(i, l, d, bool2, bool3, num, num2, num3, str2, str, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        am5 am5Var = (am5) obj;
        am5Var.getClass();
        Boolean bool = am5Var.j;
        String str = am5Var.i;
        String str2 = am5Var.h;
        Integer num = am5Var.g;
        Integer num2 = am5Var.f;
        Integer num3 = am5Var.e;
        Boolean bool2 = am5Var.d;
        Boolean bool3 = am5Var.c;
        Double d = am5Var.b;
        Long l = am5Var.f1093a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
