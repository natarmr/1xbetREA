package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wu10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wu10 f39771a;
    private static final ugi0 descriptor;

    static {
        wu10 wu10Var = new wu10();
        f39771a = wu10Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.linelive.data.models.MainFeedLiveSportsResponse", wu10Var, 9);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("gamesCount", true);
        zna0Var.j("isNew", true);
        zna0Var.j("tabs", true);
        zna0Var.j("name", true);
        zna0Var.j("nameEng", true);
        zna0Var.j("isCyber", true);
        zna0Var.j("timeName", true);
        zna0Var.j("timesName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = yu10.j;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ2 = mrv.j0(sm8Var);
        jiy jiyVarJ3 = mrv.j0((jiy) a8zVarArr[3].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = yu10.j;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        Boolean bool2 = null;
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
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
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
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new yu10(i, l, l2, bool, list, str3, str4, bool2, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yu10 yu10Var = (yu10) obj;
        yu10Var.getClass();
        String str = yu10Var.i;
        String str2 = yu10Var.h;
        Boolean bool = yu10Var.g;
        String str3 = yu10Var.f;
        String str4 = yu10Var.e;
        List list = yu10Var.d;
        Boolean bool2 = yu10Var.c;
        Long l = yu10Var.b;
        Long l2 = yu10Var.f43247a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = yu10.j;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
