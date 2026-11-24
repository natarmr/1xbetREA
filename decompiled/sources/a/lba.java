package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lba implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lba f19745a;
    private static final ugi0 descriptor;

    static {
        lba lbaVar = new lba();
        f19745a = lbaVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.card_basketball.CardBasketballResponse", lbaVar, 5);
        zna0Var.j("Status", true);
        zna0Var.j("C1", true);
        zna0Var.j("C2", true);
        zna0Var.j("T1", true);
        zna0Var.j("T2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = nba.f;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = nba.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new nba(i, num, num2, num3, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nba nbaVar = (nba) obj;
        nbaVar.getClass();
        List list = nbaVar.e;
        List list2 = nbaVar.d;
        Integer num = nbaVar.c;
        Integer num2 = nbaVar.b;
        Integer num3 = nbaVar.f23231a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = nba.f;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
