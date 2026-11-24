package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fc9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fc9 f9300a;
    private static final ugi0 descriptor;

    static {
        fc9 fc9Var = new fc9();
        f9300a = fc9Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BuilderGameRequest", fc9Var, 3);
        zna0Var.j("GameId", false);
        zna0Var.j("Key", false);
        zna0Var.j("Events", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, lb9.f19743a, hc9.d[2].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = hc9.d;
        int i = 0;
        long jR = 0;
        nb9 nb9Var = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                nb9Var = (nb9) bldVarA.m(ugi0Var, 1, lb9.f19743a, nb9Var);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new hc9(i, jR, nb9Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hc9 hc9Var = (hc9) obj;
        hc9Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = hc9.d;
        cldVarA.n(ugi0Var, 0, hc9Var.f12809a);
        cldVarA.m(ugi0Var, 1, lb9.f19743a, hc9Var.b);
        cldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), hc9Var.c);
        cldVarA.c(ugi0Var);
    }
}
