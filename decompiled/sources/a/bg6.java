package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bg6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bg6 f2539a;
    private static final ugi0 descriptor;

    static {
        bg6 bg6Var = new bg6();
        f2539a = bg6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.BetBuilderEventsRequest.GameEventsGroupRequest", bg6Var, 2);
        zna0Var.j("key", false);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{eg6.f7747a, dg6.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = dg6.c;
        boolean z = true;
        int i = 0;
        gg6 gg6Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                gg6Var = (gg6) bldVarA.m(ugi0Var, 0, eg6.f7747a, gg6Var);
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
        return new dg6(i, gg6Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dg6 dg6Var = (dg6) obj;
        dg6Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = dg6.c;
        cldVarA.m(ugi0Var, 0, eg6.f7747a, dg6Var.f6032a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), dg6Var.b);
        cldVarA.c(ugi0Var);
    }
}
