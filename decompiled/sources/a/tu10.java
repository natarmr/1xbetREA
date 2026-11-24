package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tu10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tu10 f34531a;
    private static final ugi0 descriptor;

    static {
        tu10 tu10Var = new tu10();
        f34531a = tu10Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.linelive.data.models.MainFeedLineSportsResponse", tu10Var, 8);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("nameEng", true);
        zna0Var.j("isCyber", true);
        zna0Var.j("isNew", true);
        zna0Var.j("timeName", true);
        zna0Var.j("timesName", true);
        zna0Var.j("gamesCount", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var)};
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
        String str2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str3 = null;
        String str4 = null;
        Long l2 = null;
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
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                    i |= 8;
                    break;
                case 4:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str4);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l2);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new vu10(i, l, str, str2, bool, bool2, str3, str4, l2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vu10 vu10Var = (vu10) obj;
        vu10Var.getClass();
        Long l = vu10Var.h;
        String str = vu10Var.g;
        String str2 = vu10Var.f;
        Boolean bool = vu10Var.e;
        Boolean bool2 = vu10Var.d;
        String str3 = vu10Var.c;
        String str4 = vu10Var.b;
        Long l2 = vu10Var.f38032a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
