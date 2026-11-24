package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j5p implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j5p f15943a;
    private static final ugi0 descriptor;

    static {
        j5p j5pVar = new j5p();
        f15943a = j5pVar;
        zna0 zna0Var = new zna0("org.xplatform.favorites.core.data.model.sync.FavoriteChampResponse", j5pVar, 14);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("sportName", true);
        zna0Var.j("image", true);
        zna0Var.j("country", true);
        zna0Var.j("isCyber", true);
        zna0Var.j("cyberType", true);
        zna0Var.j("gamesCount", true);
        zna0Var.j("isTop", true);
        zna0Var.j("isNew", true);
        zna0Var.j("globalChampId", true);
        zna0Var.j("hasLiveGame", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ7 = mrv.j0(sm8Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        Long l2 = null;
        Integer num2 = null;
        int i = 0;
        Boolean bool3 = null;
        String str = null;
        Long l3 = null;
        Long l4 = null;
        String str2 = null;
        String str3 = null;
        Long l5 = null;
        Boolean bool4 = null;
        boolean z = true;
        Long l6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l6;
                    z = false;
                    bool2 = bool2;
                    l3 = l3;
                    l6 = l;
                    bool = bool;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l6);
                    i |= 1;
                    str = str;
                    bool2 = bool2;
                    l3 = l3;
                    l6 = l;
                    bool = bool;
                    break;
                case 1:
                    bool = bool;
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    l3 = l3;
                    bool = bool;
                    break;
                case 2:
                    bool = bool;
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    str = str;
                    bool = bool;
                    break;
                case 3:
                    l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                    i |= 8;
                    str = str;
                    l3 = l3;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i |= 16;
                    str = str;
                    l3 = l3;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    str = str;
                    l3 = l3;
                    break;
                case 6:
                    l5 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l5);
                    i |= 64;
                    str = str;
                    l3 = l3;
                    break;
                case 7:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool4);
                    i |= 128;
                    str = str;
                    l3 = l3;
                    break;
                case 8:
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    str = str;
                    l3 = l3;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    str = str;
                    l3 = l3;
                    break;
                case 10:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool2);
                    i |= 1024;
                    str = str;
                    l3 = l3;
                    break;
                case 11:
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i |= 2048;
                    str = str;
                    l3 = l3;
                    break;
                case 12:
                    l2 = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l2);
                    i |= 4096;
                    str = str;
                    l3 = l3;
                    break;
                case 13:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool3);
                    i |= 8192;
                    str = str;
                    l3 = l3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool5 = bool;
        Long l7 = l6;
        bldVarA.c(ugi0Var);
        return new l5p(i, l7, str, l3, l4, str2, str3, l5, bool4, num2, num, bool2, bool5, l2, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l5p l5pVar = (l5p) obj;
        l5pVar.getClass();
        Boolean bool = l5pVar.n;
        Long l = l5pVar.m;
        Boolean bool2 = l5pVar.l;
        Boolean bool3 = l5pVar.k;
        Integer num = l5pVar.j;
        Integer num2 = l5pVar.i;
        Boolean bool4 = l5pVar.h;
        Long l2 = l5pVar.g;
        String str = l5pVar.f;
        String str2 = l5pVar.e;
        Long l3 = l5pVar.d;
        Long l4 = l5pVar.c;
        String str3 = l5pVar.b;
        Long l5 = l5pVar.f19469a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
