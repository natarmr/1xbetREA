package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tiq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tiq0 f34018a;
    private static final ugi0 descriptor;

    static {
        tiq0 tiq0Var = new tiq0();
        f34018a = tiq0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.rs.impl.data.models.responses.TimeLimitResponse", tiq0Var, 14);
        zna0Var.j("limitType", true);
        zna0Var.j("currency", true);
        zna0Var.j("limitMeasure", true);
        zna0Var.j("endsAt", true);
        zna0Var.j("limitValue", true);
        zna0Var.j("freeValue", true);
        zna0Var.j("changeAvailable", true);
        zna0Var.j("deleteAvailable", true);
        zna0Var.j("limitState", true);
        zna0Var.j("pendingValue", true);
        zna0Var.j("pendingEndsAt", true);
        zna0Var.j("availableValues", true);
        zna0Var.j("activeLimitValue", true);
        zna0Var.j("setWithoutValue", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = fjq0.o;
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(ul.f35850a), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fjq0.o;
        List list = null;
        Long l = null;
        Long l2 = null;
        String str = null;
        yl ylVar = null;
        Boolean bool = null;
        int i = 0;
        Boolean bool2 = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        Long l4 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        boolean z = true;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num2;
                    z = false;
                    l = l;
                    str3 = str3;
                    num2 = num;
                    list = list;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    str2 = str2;
                    l = l;
                    str3 = str3;
                    num2 = num;
                    list = list;
                    break;
                case 1:
                    list = list;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    str3 = str3;
                    list = list;
                    break;
                case 2:
                    list = list;
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    str2 = str2;
                    list = list;
                    break;
                case 3:
                    l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                    i |= 8;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 4:
                    l4 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l4);
                    i |= 16;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 5:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool3);
                    i |= 32;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 6:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool4);
                    i |= 64;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 7:
                    bool = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool);
                    i |= 128;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 9:
                    l2 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l2);
                    i |= 512;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 10:
                    l = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l);
                    i |= 1024;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 12:
                    ylVar = (yl) bldVarA.e(ugi0Var, 12, ul.f35850a, ylVar);
                    i |= 4096;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 13:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i |= 8192;
                    str2 = str2;
                    str3 = str3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list2 = list;
        Integer num3 = num2;
        bldVarA.c(ugi0Var);
        return new fjq0(i, num3, str2, str3, l3, l4, bool3, bool4, bool, str, l2, l, list2, ylVar, bool2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fjq0 fjq0Var = (fjq0) obj;
        fjq0Var.getClass();
        Boolean bool = fjq0Var.n;
        yl ylVar = fjq0Var.m;
        List list = fjq0Var.l;
        Long l = fjq0Var.k;
        Long l2 = fjq0Var.j;
        String str = fjq0Var.i;
        Boolean bool2 = fjq0Var.h;
        Boolean bool3 = fjq0Var.g;
        Boolean bool4 = fjq0Var.f;
        Long l3 = fjq0Var.e;
        Long l4 = fjq0Var.d;
        String str2 = fjq0Var.c;
        String str3 = fjq0Var.b;
        Integer num = fjq0Var.f9656a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fjq0.o;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || ylVar != 0) {
            cldVarA.p(ugi0Var, 12, ul.f35850a, ylVar);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
