package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dxq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dxq0 f6859a;
    private static final ugi0 descriptor;

    static {
        dxq0 dxq0Var = new dxq0();
        f6859a = dxq0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.top_players.data.models.Top10PlayersResponse", dxq0Var, 2);
        zna0Var.j("players", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) fxq0.c[0].getValue()), mrv.j0(p3r0.f26313a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fxq0.c;
        boolean z = true;
        int i = 0;
        List list = null;
        r3r0 r3r0Var = null;
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
                r3r0Var = (r3r0) bldVarA.e(ugi0Var, 1, p3r0.f26313a, r3r0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new fxq0(i, list, r3r0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fxq0 fxq0Var = (fxq0) obj;
        fxq0Var.getClass();
        r3r0 r3r0Var = fxq0Var.b;
        List list = fxq0Var.f10322a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fxq0.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || r3r0Var != null) {
            cldVarA.p(ugi0Var, 1, p3r0.f26313a, r3r0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
