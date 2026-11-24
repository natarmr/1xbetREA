package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xiq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xiq0 f40958a;
    private static final ugi0 descriptor;

    static {
        xiq0 xiq0Var = new xiq0();
        f40958a = xiq0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits_ne.impl.data.models.responses.TimeLimitResponse", xiq0Var, 10);
        zna0Var.j("limitType", true);
        zna0Var.j("freeValue", true);
        zna0Var.j("limitState", true);
        zna0Var.j("endsAt", true);
        zna0Var.j("limitValue", true);
        zna0Var.j("needApprove", true);
        zna0Var.j("pendingValue", true);
        zna0Var.j("pendingEndsAt", true);
        zna0Var.j("availableValues", true);
        zna0Var.j("freeValueConfiguration", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jjq0.k;
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0(ysm0.f43175a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(tbl.f33669a), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0(s8r.f31815a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = jjq0.k;
        u8r u8rVar = null;
        List list = null;
        boolean z = true;
        Long l = null;
        int i = 0;
        Integer num = null;
        Boolean bool = null;
        String str = null;
        Long l2 = null;
        Double d = null;
        Boolean bool2 = null;
        Long l3 = null;
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
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    d = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool2);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    l3 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l3);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    u8rVar = (u8r) bldVarA.e(ugi0Var, 9, s8r.f31815a, u8rVar);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new jjq0(i, num, bool, str, l2, d, bool2, l3, l, list, u8rVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jjq0 jjq0Var = (jjq0) obj;
        jjq0Var.getClass();
        u8r u8rVar = jjq0Var.j;
        List list = jjq0Var.i;
        Long l = jjq0Var.h;
        Long l2 = jjq0Var.g;
        Boolean bool = jjq0Var.f;
        Double d = jjq0Var.e;
        Long l3 = jjq0Var.d;
        String str = jjq0Var.c;
        Boolean bool2 = jjq0Var.b;
        Integer num = jjq0Var.f16631a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jjq0.k;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || u8rVar != null) {
            cldVarA.p(ugi0Var, 9, s8r.f31815a, u8rVar);
        }
        cldVarA.c(ugi0Var);
    }
}
