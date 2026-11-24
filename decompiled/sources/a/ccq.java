package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ccq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ccq f4124a;
    private static final ugi0 descriptor;

    static {
        ccq ccqVar = new ccq();
        f4124a = ccqVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.fin_bet.impl.data.model.FinanceGraphResponse", ccqVar, 7);
        zna0Var.j("FinInstrument", true);
        zna0Var.j("Points", true);
        zna0Var.j("CloseTime", true);
        zna0Var.j("OpenTime", true);
        zna0Var.j("RemainingTime", true);
        zna0Var.j("RemainingTimeMobile", true);
        zna0Var.j("StartLevel", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ecq.h;
        jiy jiyVarJ0 = mrv.j0(hcq.f12836a);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(klq.f18504a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ecq.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        jcq jcqVar = null;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Float f = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jcqVar = (jcq) bldVarA.e(ugi0Var, 0, hcq.f12836a, jcqVar);
                    i |= 1;
                    break;
                case 1:
                    list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num4);
                    i |= 32;
                    break;
                case 6:
                    f = (Float) bldVarA.e(ugi0Var, 6, klq.f18504a, f);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ecq(i, jcqVar, list, num, num2, num3, num4, f);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ecq ecqVar = (ecq) obj;
        ecqVar.getClass();
        Float f = ecqVar.g;
        Integer num = ecqVar.f;
        Integer num2 = ecqVar.e;
        Integer num3 = ecqVar.d;
        Integer num4 = ecqVar.c;
        List list = ecqVar.b;
        jcq jcqVar = ecqVar.f7578a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ecq.h;
        if (cldVarA.u(ugi0Var) || jcqVar != null) {
            cldVarA.p(ugi0Var, 0, hcq.f12836a, jcqVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 6, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
