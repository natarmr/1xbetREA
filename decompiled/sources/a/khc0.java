package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class khc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final khc0 f18285a;
    private static final ugi0 descriptor;

    static {
        khc0 khc0Var = new khc0();
        f18285a = khc0Var;
        zna0 zna0Var = new zna0("org.xplatform.promo.impl.core.data.models.PromoDataItemResponse", khc0Var, 10);
        zna0Var.j("promoCodeName", true);
        zna0Var.j("conditions", true);
        zna0Var.j("amount", true);
        zna0Var.j("currency", true);
        zna0Var.j("dateOfUse", true);
        zna0Var.j("dateOfUseBefore", true);
        zna0Var.j("section", true);
        zna0Var.j("promoName", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j(ParameterNames.ID, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mhc0.k;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(tbl.f33669a);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ4 = mrv.j0(s710Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = mhc0.k;
        Long l = null;
        Integer num = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        List list = null;
        Double d = null;
        String str3 = null;
        Long l2 = null;
        Long l3 = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    l3 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l3);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new mhc0(i, str2, list, d, str3, l2, l3, num2, str, num, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mhc0 mhc0Var = (mhc0) obj;
        mhc0Var.getClass();
        Long l = mhc0Var.j;
        Integer num = mhc0Var.i;
        String str = mhc0Var.h;
        Integer num2 = mhc0Var.g;
        Long l2 = mhc0Var.f;
        Long l3 = mhc0Var.e;
        String str2 = mhc0Var.d;
        Double d = mhc0Var.c;
        List list = mhc0Var.b;
        String str3 = mhc0Var.f21785a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mhc0.k;
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
