package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ogt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ogt0 f25236a;
    private static final ugi0 descriptor;

    static {
        ogt0 ogt0Var = new ogt0();
        f25236a = ogt0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.upcoming_events.data.models.UpcomingEventsResponse", ogt0Var, 4);
        zna0Var.j("players", true);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = qgt0.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(jgt0.f16497a), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = qgt0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        lgt0 lgt0Var = null;
        Integer num = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                lgt0Var = (lgt0) bldVarA.e(ugi0Var, 1, jgt0.f16497a, lgt0Var);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new qgt0(i, list, lgt0Var, num, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qgt0 qgt0Var = (qgt0) obj;
        qgt0Var.getClass();
        List list = qgt0Var.d;
        Integer num = qgt0Var.c;
        lgt0 lgt0Var = qgt0Var.b;
        List list2 = qgt0Var.f28703a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = qgt0.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || lgt0Var != null) {
            cldVarA.p(ugi0Var, 1, jgt0.f16497a, lgt0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
