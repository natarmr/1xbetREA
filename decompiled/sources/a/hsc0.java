package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hsc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hsc0 f13575a;
    private static final ugi0 descriptor;

    static {
        hsc0 hsc0Var = new hsc0();
        f13575a = hsc0Var;
        zna0 zna0Var = new zna0("org.xplatform.promo.impl.promocodes.data.models.PromoShopResponse", hsc0Var, 8);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("minBet", true);
        zna0Var.j("description", true);
        zna0Var.j("category", true);
        zna0Var.j("categoryName", true);
        zna0Var.j("numFS", true);
        zna0Var.j("gameId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        Long l2 = null;
        String str3 = null;
        Integer num2 = null;
        Long l3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
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
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    break;
                case 7:
                    l3 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l3);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new jsc0(i, l, str, num, str2, l2, str3, num2, l3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jsc0 jsc0Var = (jsc0) obj;
        jsc0Var.getClass();
        Long l = jsc0Var.h;
        Integer num = jsc0Var.g;
        String str = jsc0Var.f;
        Long l2 = jsc0Var.e;
        String str2 = jsc0Var.d;
        Integer num2 = jsc0Var.c;
        String str3 = jsc0Var.b;
        Long l3 = jsc0Var.f17046a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
