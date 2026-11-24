package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vlb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vlb f37613a;
    private static final ugi0 descriptor;

    static {
        vlb vlbVar = new vlb();
        f37613a = vlbVar;
        zna0 zna0Var = new zna0("org.xplatform.feed.popular.data.models.ChampsBarResponse", vlbVar, 8);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("sportId", true);
        zna0Var.j("name", true);
        zna0Var.j("image", true);
        zna0Var.j("cyberType", true);
        zna0Var.j("isDuelChamp", true);
        zna0Var.j("nameEng", true);
        zna0Var.j("countryImage", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(sm8.f32432a), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
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
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new xlb(i, l, l2, str, str2, num, bool, str3, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xlb xlbVar = (xlb) obj;
        xlbVar.getClass();
        String str = xlbVar.h;
        String str2 = xlbVar.g;
        Boolean bool = xlbVar.f;
        Integer num = xlbVar.e;
        String str3 = xlbVar.d;
        String str4 = xlbVar.c;
        Long l = xlbVar.b;
        Long l2 = xlbVar.f41063a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
