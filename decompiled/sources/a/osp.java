package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class osp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final osp f25793a;
    private static final ugi0 descriptor;

    static {
        osp ospVar = new osp();
        f25793a = ospVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.game.data.fight.model.FightCornerStatsResponse", ospVar, 3);
        zna0Var.j("stats", true);
        zna0Var.j("additionalStats", true);
        zna0Var.j("statsByRound", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = qsp.d;
        return new jiy[]{mrv.j0(vup.f38059a), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = qsp.d;
        boolean z = true;
        int i = 0;
        xup xupVar = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                xupVar = (xup) bldVarA.e(ugi0Var, 0, vup.f38059a, xupVar);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new qsp(i, xupVar, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qsp qspVar = (qsp) obj;
        qspVar.getClass();
        List list = qspVar.c;
        List list2 = qspVar.b;
        xup xupVar = qspVar.f29268a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = qsp.d;
        if (cldVarA.u(ugi0Var) || xupVar != null) {
            cldVarA.p(ugi0Var, 0, vup.f38059a, xupVar);
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
