package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yqj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yqj0 f43078a;
    private static final ugi0 descriptor;

    static {
        yqj0 yqj0Var = new yqj0();
        f43078a = yqj0Var;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.post_game.data.short_game.model.ShortGameResponse", yqj0Var, 2);
        zna0Var.j("teams", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) crj0.c[0].getValue()), mrv.j0(erj0.f8284a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = crj0.c;
        boolean z = true;
        int i = 0;
        List list = null;
        grj0 grj0Var = null;
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
                grj0Var = (grj0) bldVarA.e(ugi0Var, 1, erj0.f8284a, grj0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new crj0(i, list, grj0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        crj0 crj0Var = (crj0) obj;
        crj0Var.getClass();
        grj0 grj0Var = crj0Var.b;
        List list = crj0Var.f4848a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = crj0.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || grj0Var != null) {
            cldVarA.p(ugi0Var, 1, erj0.f8284a, grj0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
