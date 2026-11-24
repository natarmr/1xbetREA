package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zf6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zf6 f44287a;
    private static final ugi0 descriptor;

    static {
        zf6 zf6Var = new zf6();
        f44287a = zf6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.BetBuilderEventsRequest", zf6Var, 2);
        zna0Var.j("gameId", false);
        zna0Var.j("eventsByGames", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, kg6.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = kg6.c;
        long jR = 0;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new kg6(i, jR, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kg6 kg6Var = (kg6) obj;
        kg6Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = kg6.c;
        cldVarA.n(ugi0Var, 0, kg6Var.f18225a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), kg6Var.b);
        cldVarA.c(ugi0Var);
    }
}
