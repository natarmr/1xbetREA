package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sjg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sjg f32302a;
    private static final ugi0 descriptor;

    static {
        sjg sjgVar = new sjg();
        f32302a = sjgVar;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.data.CyberConfig", sjgVar, 13);
        zna0Var.j("hasCyberCyberStreamTab", true);
        zna0Var.j("hasCyberSport", true);
        zna0Var.j("hasCyberOnboarding", true);
        zna0Var.j("hasCyberRealTab", true);
        zna0Var.j("hasCyberVirtualTab", true);
        zna0Var.j("isNewFeedGame2", true);
        zna0Var.j("isNewFeedFavourite", true);
        zna0Var.j("isNewTimeLine", true);
        zna0Var.j("cyberGeneralChampID", true);
        zna0Var.j("cyberGeneralChampSportsID", true);
        zna0Var.j("cyberGeneralChampSportsDate", true);
        zna0Var.j("cyberGeneralChampSportsChampID", true);
        zna0Var.j("hltvChampIds", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ujg.n;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0((jiy) a8zVarArr[10].getValue()), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0((jiy) a8zVarArr[12].getValue())};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Integer, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ?? r1;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ujg.n;
        List list = null;
        List list2 = null;
        List list3 = null;
        Integer num = null;
        List list4 = null;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    list4 = list4;
                    list = list;
                    break;
                case 0:
                    bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                    i |= 1;
                    list4 = list4;
                    list = list;
                    break;
                case 1:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool2);
                    i |= 2;
                    list4 = list4;
                    bool = bool;
                    break;
                case 2:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool3);
                    i |= 4;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 3:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool4);
                    i |= 8;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 4:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool5);
                    i |= 16;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 5:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool6);
                    i |= 32;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 6:
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool7);
                    i |= 64;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 7:
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool8);
                    i |= 128;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 9:
                    list3 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
                    i |= 512;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 10:
                    list2 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
                    i |= 1024;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    bool = bool;
                    bool2 = bool2;
                    break;
                case 12:
                    list4 = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list4);
                    i |= 4096;
                    bool = bool;
                    bool2 = bool2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list5 = list;
        List list6 = list4;
        Boolean bool9 = bool;
        bldVarA.c(ugi0Var);
        ujg ujgVar = new ujg();
        if ((i & 1) == 0) {
            r1 = 0;
            ujgVar.f35777a = null;
        } else {
            r1 = 0;
            ujgVar.f35777a = bool9;
        }
        if ((i & 2) == 0) {
            ujgVar.b = r1;
        } else {
            ujgVar.b = bool2;
        }
        if ((i & 4) == 0) {
            ujgVar.c = r1;
        } else {
            ujgVar.c = bool3;
        }
        if ((i & 8) == 0) {
            ujgVar.d = r1;
        } else {
            ujgVar.d = bool4;
        }
        if ((i & 16) == 0) {
            ujgVar.e = r1;
        } else {
            ujgVar.e = bool5;
        }
        if ((i & 32) == 0) {
            ujgVar.f = r1;
        } else {
            ujgVar.f = bool6;
        }
        if ((i & 64) == 0) {
            ujgVar.g = r1;
        } else {
            ujgVar.g = bool7;
        }
        if ((i & 128) == 0) {
            ujgVar.h = r1;
        } else {
            ujgVar.h = bool8;
        }
        if ((i & 256) == 0) {
            ujgVar.i = r1;
        } else {
            ujgVar.i = num;
        }
        if ((i & 512) == 0) {
            ujgVar.j = r1;
        } else {
            ujgVar.j = list3;
        }
        if ((i & 1024) == 0) {
            ujgVar.k = r1;
        } else {
            ujgVar.k = list2;
        }
        if ((i & 2048) == 0) {
            ujgVar.l = r1;
        } else {
            ujgVar.l = list5;
        }
        if ((i & 4096) == 0) {
            ujgVar.m = r1;
            return ujgVar;
        }
        ujgVar.m = list6;
        return ujgVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ujg ujgVar = (ujg) obj;
        ujgVar.getClass();
        List list = ujgVar.m;
        List list2 = ujgVar.l;
        List list3 = ujgVar.k;
        List list4 = ujgVar.j;
        Integer num = ujgVar.i;
        Boolean bool = ujgVar.h;
        Boolean bool2 = ujgVar.g;
        Boolean bool3 = ujgVar.f;
        Boolean bool4 = ujgVar.e;
        Boolean bool5 = ujgVar.d;
        Boolean bool6 = ujgVar.c;
        Boolean bool7 = ujgVar.b;
        Boolean bool8 = ujgVar.f35777a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ujg.n;
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
