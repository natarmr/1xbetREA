package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y3t implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3t f41969a;
    private static final ugi0 descriptor;

    static {
        y3t y3tVar = new y3t();
        f41969a = y3tVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.common.models.games_by_champ.GamesByChampLineResponse", y3tVar, 3);
        zna0Var.j("liga", true);
        zna0Var.j("gamesCount", true);
        zna0Var.j("games", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(xlz.f41098a), mrv.j0(okx.f25427a), mrv.j0((jiy) a4t.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = a4t.d;
        boolean z = true;
        int i = 0;
        hmz hmzVar = null;
        Integer num = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                hmzVar = (hmz) bldVarA.e(ugi0Var, 0, xlz.f41098a, hmzVar);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new a4t(i, hmzVar, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a4t a4tVar = (a4t) obj;
        a4tVar.getClass();
        List list = a4tVar.c;
        Integer num = a4tVar.b;
        hmz hmzVar = a4tVar.f239a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = a4t.d;
        if (cldVarA.u(ugi0Var) || hmzVar != null) {
            cldVarA.p(ugi0Var, 0, xlz.f41098a, hmzVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
