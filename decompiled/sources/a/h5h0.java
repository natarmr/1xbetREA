package a;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h5h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h5h0 f12479a;
    private static final ugi0 descriptor;

    static {
        h5h0 h5h0Var = new h5h0();
        f12479a = h5h0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.mainfeed.ScoreStatisticResponse", h5h0Var, 1);
        zna0Var.j("main", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) l5h0.b[0].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = l5h0.b;
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
        return new l5h0(i, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l5h0 l5h0Var = (l5h0) obj;
        l5h0Var.getClass();
        Map map = l5h0Var.f19456a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = l5h0.b;
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
