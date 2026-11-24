package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w65 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w65 f38610a;
    private static final ugi0 descriptor;

    static {
        w65 w65Var = new w65();
        f38610a = w65Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.AvailableFreeSpinsResponse.OfferSpinsResponse", w65Var, 11);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("gameInfo", true);
        zna0Var.j("productInfo", true);
        zna0Var.j("conditionsReceivingWin", true);
        zna0Var.j("cntSpins", true);
        zna0Var.j("cntUsed", true);
        zna0Var.j("secondsToExpire", true);
        zna0Var.j("winningAmount", true);
        zna0Var.j("currency", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("paymentType", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(t65.f33399a);
        jiy jiyVarJ2 = mrv.j0(z65.f43848a);
        jiy jiyVarJ3 = mrv.j0(q65.f28184a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(tbl.f33669a), mrv.j0(ysm0.f43175a), mrv.j0(onm0.f25554a), mrv.j0(oa90.f24918a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        na90 na90Var = null;
        nnm0 nnm0Var = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Long l = null;
        v65 v65Var = null;
        b75 b75Var = null;
        s65 s65Var = null;
        Integer num = null;
        Integer num2 = null;
        Long l2 = null;
        Double d = null;
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
                    v65Var = (v65) bldVarA.e(ugi0Var, 1, t65.f33399a, v65Var);
                    i |= 2;
                    break;
                case 2:
                    b75Var = (b75) bldVarA.e(ugi0Var, 2, z65.f43848a, b75Var);
                    i |= 4;
                    break;
                case 3:
                    s65Var = (s65) bldVarA.e(ugi0Var, 3, q65.f28184a, s65Var);
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
                    l2 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l2);
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
                case 9:
                    nnm0Var = (nnm0) bldVarA.e(ugi0Var, 9, onm0.f25554a, nnm0Var);
                    i |= 512;
                    break;
                case 10:
                    na90Var = (na90) bldVarA.e(ugi0Var, 10, oa90.f24918a, na90Var);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new y65(i, l, v65Var, b75Var, s65Var, num, num2, l2, d, str, nnm0Var, na90Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y65 y65Var = (y65) obj;
        y65Var.getClass();
        na90 na90Var = y65Var.k;
        nnm0 nnm0Var = y65Var.j;
        String str = y65Var.i;
        Double d = y65Var.h;
        Long l = y65Var.g;
        Integer num = y65Var.f;
        Integer num2 = y65Var.e;
        s65 s65Var = y65Var.d;
        b75 b75Var = y65Var.c;
        v65 v65Var = y65Var.b;
        Long l2 = y65Var.f42079a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || v65Var != null) {
            cldVarA.p(ugi0Var, 1, t65.f33399a, v65Var);
        }
        if (cldVarA.u(ugi0Var) || b75Var != null) {
            cldVarA.p(ugi0Var, 2, z65.f43848a, b75Var);
        }
        if (cldVarA.u(ugi0Var) || s65Var != null) {
            cldVarA.p(ugi0Var, 3, q65.f28184a, s65Var);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || nnm0Var != null) {
            cldVarA.p(ugi0Var, 9, onm0.f25554a, nnm0Var);
        }
        if (cldVarA.u(ugi0Var) || na90Var != null) {
            cldVarA.p(ugi0Var, 10, oa90.f24918a, na90Var);
        }
        cldVarA.c(ugi0Var);
    }
}
