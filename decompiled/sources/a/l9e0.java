package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l9e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9e0 f19648a;
    private static final ugi0 descriptor;

    static {
        l9e0 l9e0Var = new l9e0();
        f19648a = l9e0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.rating.impl.rating_statistic.data.model.RatingValueColResponse", l9e0Var, 13);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("contentType", true);
        zna0Var.j("contentIconType", true);
        zna0Var.j("isExpand", true);
        zna0Var.j("expandId", true);
        zna0Var.j("expandRowCount", true);
        zna0Var.j("group", true);
        zna0Var.j("isOffset", true);
        zna0Var.j("value", true);
        zna0Var.j("competitorId", true);
        zna0Var.j("pareCompetitorId", true);
        zna0Var.j("rowSpan", true);
        zna0Var.j("colSpan", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = p9e0.n;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(rie.f30539a);
        jiy jiyVarJ2 = mrv.j0(kee.f18150a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ3 = mrv.j0(sm8Var);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(sm8Var);
        jiy jiyVarJ8 = mrv.j0((jiy) a8zVarArr[8].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = p9e0.n;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        Integer num2 = null;
        Boolean bool = null;
        int i = 0;
        Integer num3 = null;
        qie qieVar = null;
        jee jeeVar = null;
        Boolean bool2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str = str;
                    num = num;
                    break;
                case 0:
                    num3 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num3);
                    i |= 1;
                    str = str;
                    num = num;
                    break;
                case 1:
                    num = num;
                    qieVar = (qie) bldVarA.e(ugi0Var, 1, rie.f30539a, qieVar);
                    i |= 2;
                    num3 = num3;
                    num = num;
                    break;
                case 2:
                    jeeVar = (jee) bldVarA.e(ugi0Var, 2, kee.f18150a, jeeVar);
                    i |= 4;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 3:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool2);
                    i |= 8;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 5:
                    num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                    i |= 32;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 6:
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i |= 64;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 7:
                    bool = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool);
                    i |= 128;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 8:
                    list = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 9:
                    str2 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str2);
                    i |= 512;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 11:
                    num = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num);
                    i |= 2048;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                case 12:
                    num2 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num2);
                    i |= 4096;
                    num3 = num3;
                    qieVar = qieVar;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str3 = str;
        bldVarA.c(ugi0Var);
        return new p9e0(i, num3, qieVar, jeeVar, bool2, num4, num5, num6, bool, list, str2, str3, num, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p9e0 p9e0Var = (p9e0) obj;
        p9e0Var.getClass();
        Integer num = p9e0Var.m;
        Integer num2 = p9e0Var.l;
        String str = p9e0Var.k;
        String str2 = p9e0Var.j;
        List list = p9e0Var.i;
        Boolean bool = p9e0Var.h;
        Integer num3 = p9e0Var.g;
        Integer num4 = p9e0Var.f;
        Integer num5 = p9e0Var.e;
        Boolean bool2 = p9e0Var.d;
        jee jeeVar = p9e0Var.c;
        qie qieVar = p9e0Var.b;
        Integer num6 = p9e0Var.f26602a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = p9e0.n;
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || qieVar != null) {
            cldVarA.p(ugi0Var, 1, rie.f30539a, qieVar);
        }
        if (cldVarA.u(ugi0Var) || jeeVar != null) {
            cldVarA.p(ugi0Var, 2, kee.f18150a, jeeVar);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
