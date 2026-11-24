package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ldo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ldo f19860a;
    private static final ugi0 descriptor;

    static {
        ldo ldoVar = new ldo();
        f19860a = ldoVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.bets_on_players.impl.data.model.EventGroupResponse.GameEvent.EventParamsResponse", ldoVar, 2);
        zna0Var.j("params", true);
        zna0Var.j("playerNames", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ndo.c;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ndo.c;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ndo(i, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ndo ndoVar = (ndo) obj;
        ndoVar.getClass();
        List list = ndoVar.b;
        List list2 = ndoVar.f23344a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ndo.c;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
