package a;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sl6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sl6 f32382a;
    private static final ugi0 descriptor;

    static {
        sl6 sl6Var = new sl6();
        f32382a = sl6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.game_info.BetBuilderStatisticScoreResponse", sl6Var, 1);
        zna0Var.j("main", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) ul6.b[0].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ul6.b;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                map = (Map) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new ul6(i, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ul6 ul6Var = (ul6) obj;
        ul6Var.getClass();
        Map map = ul6Var.f35857a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ul6.b;
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
