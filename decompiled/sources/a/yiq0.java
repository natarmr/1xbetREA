package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yiq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yiq0 f42707a;
    private static final ugi0 descriptor;

    static {
        yiq0 yiq0Var = new yiq0();
        f42707a = yiq0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.ie.impl.data.models.responses.TimeLimitResponse", yiq0Var, 11);
        zna0Var.j("limitType", true);
        zna0Var.j("endsAt", true);
        zna0Var.j("limitValue", true);
        zna0Var.j("needApprove", true);
        zna0Var.j("freeValue", true);
        zna0Var.j("changeAvailable", true);
        zna0Var.j("deleteAvailable", true);
        zna0Var.j("limitState", true);
        zna0Var.j("availableValues", true);
        zna0Var.j("activeLimitValue", true);
        zna0Var.j("setWithoutValue", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = kjq0.l;
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        jiy jiyVarJ1 = mrv.j0(s710.f31729a);
        jiy jiyVarJ2 = mrv.j0(tbl.f33669a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0(vl.f37598a), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = kjq0.l;
        Boolean bool = null;
        zl zlVar = null;
        List list = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Integer num = null;
        Long l = null;
        Double d = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool2);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool3);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool4);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool5);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    zlVar = (zl) bldVarA.e(ugi0Var, 9, vl.f37598a, zlVar);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new kjq0(i, num, l, d, bool2, bool3, bool4, bool5, str, list, zlVar, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kjq0 kjq0Var = (kjq0) obj;
        kjq0Var.getClass();
        Boolean bool = kjq0Var.k;
        zl zlVar = kjq0Var.j;
        List list = kjq0Var.i;
        String str = kjq0Var.h;
        Boolean bool2 = kjq0Var.g;
        Boolean bool3 = kjq0Var.f;
        Boolean bool4 = kjq0Var.e;
        Boolean bool5 = kjq0Var.d;
        Double d = kjq0Var.c;
        Long l = kjq0Var.b;
        Integer num = kjq0Var.f18400a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = kjq0.l;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
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
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || zlVar != null) {
            cldVarA.p(ugi0Var, 9, vl.f37598a, zlVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
