package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class umb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final umb f35912a;
    private static final ugi0 descriptor;

    static {
        umb umbVar = new umb();
        f35912a = umbVar;
        zna0 zna0Var = new zna0("org.xplatform.results.impl.data.models.ChampsResultsResponse.SubChamp", umbVar, 6);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("image", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("countEvent", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        Long l2 = null;
        Long l3 = null;
        Integer num = null;
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
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
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
                    num = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new wmb(i, l, str, str2, l2, l3, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wmb wmbVar = (wmb) obj;
        wmbVar.getClass();
        Integer num = wmbVar.f;
        Long l = wmbVar.e;
        Long l2 = wmbVar.d;
        String str = wmbVar.c;
        String str2 = wmbVar.b;
        Long l3 = wmbVar.f39397a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
