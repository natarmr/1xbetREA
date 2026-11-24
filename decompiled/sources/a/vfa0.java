package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vfa0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vfa0 f37321a;
    private static final ugi0 descriptor;

    static {
        vfa0 vfa0Var = new vfa0();
        f37321a = vfa0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.betting.PlayersDuelModel.DuelGame", vfa0Var, 2);
        zna0Var.j("team1Ids", false);
        zna0Var.j("team2Ids", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xfa0.d;
        return new jiy[]{a8zVarArr[0].getValue(), a8zVarArr[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xfa0.d;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new xfa0(i, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xfa0 xfa0Var = (xfa0) obj;
        xfa0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xfa0.d;
        cldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), xfa0Var.b);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), xfa0Var.c);
        cldVarA.c(ugi0Var);
    }
}
