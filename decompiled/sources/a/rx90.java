package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rx90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rx90 f31254a;
    private static final ugi0 descriptor;

    static {
        rx90 rx90Var = new rx90();
        f31254a = rx90Var;
        zna0 zna0Var = new zna0("org.xplatform.data.betting.sport_game.responses.PlayZoneConfigResponse", rx90Var, 1);
        zna0Var.j("sport", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) wx90.b[0].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wx90.b;
        boolean z = true;
        int i = 0;
        vx90[] vx90VarArr = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                vx90VarArr = (vx90[]) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), vx90VarArr);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new wx90(i, vx90VarArr);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wx90 wx90Var = (wx90) obj;
        wx90Var.getClass();
        vx90[] vx90VarArr = wx90Var.f39922a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wx90.b;
        if (cldVarA.u(ugi0Var) || vx90VarArr != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), vx90VarArr);
        }
        cldVarA.c(ugi0Var);
    }
}
