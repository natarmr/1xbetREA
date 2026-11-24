package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ldw implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ldw f19873a;
    private static final ugi0 descriptor;

    static {
        ldw ldwVar = new ldw();
        f19873a = ldwVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.hltv_awards.data.model.HltvAwardsNominationResponse", ldwVar, 8);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("title", true);
        zna0Var.j("feedGameId", true);
        zna0Var.j("marketId", true);
        zna0Var.j("nominationLogo", true);
        zna0Var.j("nominationImage", true);
        zna0Var.j("nominees", true);
        zna0Var.j("previousWinners", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ndw.i;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ndw.i;
        Object obj = null;
        boolean z = true;
        List list = null;
        Long l = null;
        String str = null;
        Long l2 = null;
        Long l3 = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
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
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                    i |= 4;
                    break;
                case 3:
                    l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ndw(i, l, str, l2, l3, str2, str3, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ndw ndwVar = (ndw) obj;
        ndwVar.getClass();
        List list = ndwVar.h;
        List list2 = ndwVar.g;
        String str = ndwVar.f;
        String str2 = ndwVar.e;
        Long l = ndwVar.d;
        Long l2 = ndwVar.c;
        String str3 = ndwVar.b;
        Long l3 = ndwVar.f23354a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ndw.i;
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
