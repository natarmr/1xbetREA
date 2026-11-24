package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ul60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ul60 f35858a;
    private static final ugi0 descriptor;

    static {
        ul60 ul60Var = new ul60();
        f35858a = ul60Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.team.impl.team_statistic.data.models.OneTeamStatisticResponse", ul60Var, 3);
        zna0Var.j("teams", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) wl60.d[0].getValue()), mrv.j0(okx.f25427a), mrv.j0(mlp0.f22004a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wl60.d;
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        olp0 olp0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                olp0Var = (olp0) bldVarA.e(ugi0Var, 2, mlp0.f22004a, olp0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new wl60(i, list, num, olp0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wl60 wl60Var = (wl60) obj;
        wl60Var.getClass();
        olp0 olp0Var = wl60Var.c;
        Integer num = wl60Var.b;
        List list = wl60Var.f39338a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wl60.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || olp0Var != null) {
            cldVarA.p(ugi0Var, 2, mlp0.f22004a, olp0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
