package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c2h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2h f3622a;
    private static final ugi0 descriptor;

    static {
        c2h c2hVar = new c2h();
        f3622a = c2hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.lastmatches.CyberLastMatchesStatisticResponse", c2hVar, 2);
        zna0Var.j("teams", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) e2h.c[0].getValue()), mrv.j0(z1h.f43619a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = e2h.c;
        boolean z = true;
        int i = 0;
        List list = null;
        b2h b2hVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                b2hVar = (b2h) bldVarA.e(ugi0Var, 1, z1h.f43619a, b2hVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new e2h(i, list, b2hVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e2h e2hVar = (e2h) obj;
        e2hVar.getClass();
        b2h b2hVar = e2hVar.b;
        List list = e2hVar.f7085a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = e2h.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || b2hVar != null) {
            cldVarA.p(ugi0Var, 1, z1h.f43619a, b2hVar);
        }
        cldVarA.c(ugi0Var);
    }
}
