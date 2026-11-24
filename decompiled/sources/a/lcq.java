package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lcq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lcq f19811a;
    private static final ugi0 descriptor;

    static {
        lcq lcqVar = new lcq();
        f19811a = lcqVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.fin_bet.impl.data.model.FinanceObjectResponse", lcqVar, 4);
        zna0Var.j("CurrentPrice", true);
        zna0Var.j("Events", true);
        zna0Var.j("Instrument", true);
        zna0Var.j("Suspended", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(klq.f18504a), mrv.j0((jiy) ncq.e[1].getValue()), mrv.j0(hcq.f12836a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ncq.e;
        boolean z = true;
        int i = 0;
        Float f = null;
        List list = null;
        jcq jcqVar = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                f = (Float) bldVarA.e(ugi0Var, 0, klq.f18504a, f);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                jcqVar = (jcq) bldVarA.e(ugi0Var, 2, hcq.f12836a, jcqVar);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ncq(i, f, list, jcqVar, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ncq ncqVar = (ncq) obj;
        ncqVar.getClass();
        Boolean bool = ncqVar.d;
        jcq jcqVar = ncqVar.c;
        List list = ncqVar.b;
        Float f = ncqVar.f23306a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ncq.e;
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 0, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || jcqVar != null) {
            cldVarA.p(ugi0Var, 2, hcq.f12836a, jcqVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
