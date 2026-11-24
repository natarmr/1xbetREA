package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wgf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wgf f39114a;
    private static final ugi0 descriptor;

    static {
        wgf wgfVar = new wgf();
        f39114a = wgfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.crystal.CrystalResponse", wgfVar, 5);
        zna0Var.j("Status", true);
        zna0Var.j("CurStep", true);
        zna0Var.j("Info", true);
        zna0Var.j("Matrix", true);
        zna0Var.j("Period", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ahf.f;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(yff.f42539a), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ahf.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        agf agfVar = null;
        List list = null;
        Integer num3 = null;
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
                agfVar = (agf) bldVarA.e(ugi0Var, 2, yff.f42539a, agfVar);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new ahf(i, num, num2, agfVar, list, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ahf ahfVar = (ahf) obj;
        ahfVar.getClass();
        Integer num = ahfVar.e;
        List list = ahfVar.d;
        agf agfVar = ahfVar.c;
        Integer num2 = ahfVar.b;
        Integer num3 = ahfVar.f872a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ahf.f;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || agfVar != null) {
            cldVarA.p(ugi0Var, 2, yff.f42539a, agfVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
