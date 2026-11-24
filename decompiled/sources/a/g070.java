package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g070 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g070 f10445a;
    private static final ugi0 descriptor;

    static {
        g070 g070Var = new g070();
        f10445a = g070Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.OneXGamesPreviewResponseOld.GP", g070Var, 14);
        zna0Var.j("CRID", true);
        zna0Var.j("GTN", true);
        zna0Var.j("MWC", true);
        zna0Var.j("INF", true);
        zna0Var.j("GF", true);
        zna0Var.j("GT", true);
        zna0Var.j("GCB", true);
        zna0Var.j("BonAdAc", true);
        zna0Var.j("BONACC", true);
        zna0Var.j("FIF", true);
        zna0Var.j("BON", true);
        zna0Var.j("IDA", true);
        zna0Var.j("UM", true);
        zna0Var.j("FS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) i070.o[0].getValue());
        jiy jiyVarJ1 = mrv.j0(okx.f25427a);
        jiy jiyVarJ2 = mrv.j0(tbl.f33669a);
        jiy jiyVarJ3 = mrv.j0(ysm0.f43175a);
        jiy jiyVarJ4 = mrv.j0(ics.f14549a);
        jiy jiyVarJ5 = mrv.j0(s710.f31729a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = i070.o;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        int i = 0;
        Boolean bool7 = null;
        Integer num = null;
        Double d = null;
        String str = null;
        hcs hcsVar = null;
        Long l = null;
        Boolean bool8 = null;
        boolean z = true;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    list = list2;
                    z = false;
                    bool2 = bool2;
                    d = d;
                    list2 = list;
                    bool = bool;
                    break;
                case 0:
                    list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
                    i |= 1;
                    num = num;
                    bool2 = bool2;
                    d = d;
                    list2 = list;
                    bool = bool;
                    break;
                case 1:
                    bool = bool;
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    d = d;
                    bool = bool;
                    break;
                case 2:
                    bool = bool;
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    num = num;
                    bool = bool;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    num = num;
                    d = d;
                    break;
                case 4:
                    hcsVar = (hcs) bldVarA.e(ugi0Var, 4, ics.f14549a, hcsVar);
                    i |= 16;
                    num = num;
                    d = d;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    num = num;
                    d = d;
                    break;
                case 6:
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool8);
                    i |= 64;
                    num = num;
                    d = d;
                    break;
                case 7:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool6);
                    i |= 128;
                    num = num;
                    d = d;
                    break;
                case 8:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool4);
                    i |= 256;
                    num = num;
                    d = d;
                    break;
                case 9:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool3);
                    i |= 512;
                    num = num;
                    d = d;
                    break;
                case 10:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool2);
                    i |= 1024;
                    num = num;
                    d = d;
                    break;
                case 11:
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i |= 2048;
                    num = num;
                    d = d;
                    break;
                case 12:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool5);
                    i |= 4096;
                    num = num;
                    d = d;
                    break;
                case 13:
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool7);
                    i |= 8192;
                    num = num;
                    d = d;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool9 = bool;
        List list3 = list2;
        bldVarA.c(ugi0Var);
        return new i070(i, list3, num, d, str, hcsVar, l, bool8, bool6, bool4, bool3, bool2, bool9, bool5, bool7);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        i070 i070Var = (i070) obj;
        i070Var.getClass();
        Boolean bool = i070Var.n;
        Boolean bool2 = i070Var.m;
        Boolean bool3 = i070Var.l;
        Boolean bool4 = i070Var.k;
        Boolean bool5 = i070Var.j;
        Boolean bool6 = i070Var.i;
        Boolean bool7 = i070Var.h;
        Boolean bool8 = i070Var.g;
        Long l = i070Var.f;
        hcs hcsVar = i070Var.e;
        String str = i070Var.d;
        Double d = i070Var.c;
        Integer num = i070Var.b;
        List list = i070Var.f13936a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = i070.o;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || hcsVar != null) {
            cldVarA.p(ugi0Var, 4, ics.f14549a, hcsVar);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
