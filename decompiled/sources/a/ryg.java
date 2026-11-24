package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ryg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ryg f31312a;
    private static final ugi0 descriptor;

    static {
        ryg rygVar = new ryg();
        f31312a = rygVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.leaderboard.data.model.CyberGamesDisciplineLeaderBoardResponse", rygVar, 4);
        zna0Var.j("ranking", true);
        zna0Var.j("organizations", true);
        zna0Var.j("availableYears", true);
        zna0Var.j("lngSideLeft", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = tyg.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(zxg.f45156a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = tyg.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        byg bygVar = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else if (iF == 2) {
                bygVar = (byg) bldVarA.e(ugi0Var, 2, zxg.f45156a, bygVar);
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
        return new tyg(i, list, list2, bygVar, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tyg tygVar = (tyg) obj;
        tygVar.getClass();
        Boolean bool = tygVar.d;
        byg bygVar = tygVar.c;
        List list = tygVar.b;
        List list2 = tygVar.f34753a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = tyg.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bygVar != null) {
            cldVarA.p(ugi0Var, 2, zxg.f45156a, bygVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
