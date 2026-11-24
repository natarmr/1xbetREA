package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fc40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fc40 f9292a;
    private static final ugi0 descriptor;

    static {
        fc40 fc40Var = new fc40();
        f9292a = fc40Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.meta_heroes.data.model.MetaHeroesResponse", fc40Var, 1);
        zna0Var.j("positions", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) hc40.b[0].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = hc40.b;
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
        return new hc40(i, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hc40 hc40Var = (hc40) obj;
        hc40Var.getClass();
        Map map = hc40Var.f12802a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = hc40.b;
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
