package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uiq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uiq0 f35745a;
    private static final ugi0 descriptor;

    static {
        uiq0 uiq0Var = new uiq0();
        f35745a = uiq0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits_africa.impl.data.models.responses.TimeLimitResponse", uiq0Var, 9);
        zna0Var.j("limitType", true);
        zna0Var.j("endsAt", true);
        zna0Var.j("limitValue", true);
        zna0Var.j("freeValue", true);
        zna0Var.j("changeAvailable", true);
        zna0Var.j("deleteAvailable", true);
        zna0Var.j("limitState", true);
        zna0Var.j("availableValues", true);
        zna0Var.j("setWithoutValue", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = gjq0.j;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(s710.f31729a);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = gjq0.j;
        Boolean bool = null;
        boolean z = true;
        List list = null;
        int i = 0;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool2);
                    i |= 8;
                    break;
                case 4:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool3);
                    i |= 16;
                    break;
                case 5:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool4);
                    i |= 32;
                    break;
                case 6:
                    str = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str);
                    i |= 64;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new gjq0(i, num, l, num2, bool2, bool3, bool4, str, list, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gjq0 gjq0Var = (gjq0) obj;
        gjq0Var.getClass();
        Boolean bool = gjq0Var.i;
        List list = gjq0Var.h;
        String str = gjq0Var.g;
        Boolean bool2 = gjq0Var.f;
        Boolean bool3 = gjq0Var.e;
        Boolean bool4 = gjq0Var.d;
        Integer num = gjq0Var.c;
        Long l = gjq0Var.b;
        Integer num2 = gjq0Var.f11413a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = gjq0.j;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
