package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uha implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uha f35667a;
    private static final ugi0 descriptor;

    static {
        uha uhaVar = new uha();
        f35667a = uhaVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.card_football.CardFootballTeamResponse", uhaVar, 3);
        zna0Var.j("GK", true);
        zna0Var.j("Def", true);
        zna0Var.j("Att", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wha.d;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wha.d;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list3 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new wha(i, list, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wha whaVar = (wha) obj;
        whaVar.getClass();
        List list = whaVar.c;
        List list2 = whaVar.b;
        List list3 = whaVar.f39157a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wha.d;
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
