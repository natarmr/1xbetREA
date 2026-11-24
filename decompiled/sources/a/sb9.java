package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sb9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sb9 f31920a;
    private static final ugi0 descriptor;

    static {
        sb9 sb9Var = new sb9();
        f31920a = sb9Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BuilderCouponGameResponse", sb9Var, 4);
        zna0Var.j("GameId", true);
        zna0Var.j("Key", true);
        zna0Var.j("Events", true);
        zna0Var.j("GameTypeName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(ob9.f24967a), mrv.j0((jiy) ub9.e[2].getValue()), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ub9.e;
        boolean z = true;
        int i = 0;
        Long l = null;
        qb9 qb9Var = null;
        List list = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                qb9Var = (qb9) bldVarA.e(ugi0Var, 1, ob9.f24967a, qb9Var);
                i |= 2;
            } else if (iF == 2) {
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ub9(i, l, qb9Var, list, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ub9 ub9Var = (ub9) obj;
        ub9Var.getClass();
        String str = ub9Var.d;
        List list = ub9Var.c;
        qb9 qb9Var = ub9Var.b;
        Long l = ub9Var.f35369a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ub9.e;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || qb9Var != null) {
            cldVarA.p(ugi0Var, 1, ob9.f24967a, qb9Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
