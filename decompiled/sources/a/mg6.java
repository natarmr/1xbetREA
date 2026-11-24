package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mg6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mg6 f21727a;
    private static final ugi0 descriptor;

    static {
        mg6 mg6Var = new mg6();
        f21727a = mg6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.BetBuilderEventsResponse", mg6Var, 2);
        zna0Var.j("key", true);
        zna0Var.j("value", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(og6.f25202a), mrv.j0((jiy) ah6.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ah6.c;
        boolean z = true;
        int i = 0;
        qg6 qg6Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                qg6Var = (qg6) bldVarA.e(ugi0Var, 0, og6.f25202a, qg6Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ah6(i, qg6Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ah6 ah6Var = (ah6) obj;
        ah6Var.getClass();
        List list = ah6Var.b;
        qg6 qg6Var = ah6Var.f858a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ah6.c;
        if (cldVarA.u(ugi0Var) || qg6Var != null) {
            cldVarA.p(ugi0Var, 0, og6.f25202a, qg6Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
