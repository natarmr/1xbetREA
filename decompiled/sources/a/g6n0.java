package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g6n0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g6n0 f10776a;
    private static final ugi0 descriptor;

    static {
        g6n0 g6n0Var = new g6n0();
        f10776a = g6n0Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.subscriptions.data.models.SubscribeToGameRequest", g6n0Var, 3);
        zna0Var.j("ConstId", false);
        zna0Var.j("RequestSource", false);
        zna0Var.j("PeriodSubs", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, okx.f25427a, l6n0.d[2].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = l6n0.d;
        int i = 0;
        int iJ = 0;
        long jR = 0;
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
                iJ = bldVarA.j(ugi0Var, 1);
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
        return new l6n0(i, iJ, jR, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l6n0 l6n0Var = (l6n0) obj;
        l6n0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = l6n0.d;
        cldVarA.n(ugi0Var, 0, l6n0Var.f19515a);
        cldVarA.i(1, l6n0Var.b, ugi0Var);
        cldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), l6n0Var.c);
        cldVarA.c(ugi0Var);
    }
}
