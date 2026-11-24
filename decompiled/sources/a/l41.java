package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l41 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l41 f19382a;
    private static final ugi0 descriptor;

    static {
        l41 l41Var = new l41();
        f19382a = l41Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorJackpotResponse", l41Var, 9);
        zna0Var.j("campaignId", true);
        zna0Var.j("iterationId", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("secondsToStart", true);
        zna0Var.j("secondsToEnd", true);
        zna0Var.j("name", true);
        zna0Var.j("currentJackpot", true);
        zna0Var.j("totalAmountJackpots", true);
        zna0Var.j("currency", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(tbl.f33669a), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        String str = null;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        Long l2 = null;
        Long l3 = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i = 0;
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
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    break;
                case 4:
                    l3 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l3);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str3);
                    i |= 64;
                    break;
                case 7:
                    d = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d);
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
        return new n41(i, l, num, num2, l2, l3, str2, str3, d, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n41 n41Var = (n41) obj;
        n41Var.getClass();
        String str = n41Var.i;
        Double d = n41Var.h;
        String str2 = n41Var.g;
        String str3 = n41Var.f;
        Long l = n41Var.e;
        Long l2 = n41Var.d;
        Integer num = n41Var.c;
        Integer num2 = n41Var.b;
        Long l3 = n41Var.f22876a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
