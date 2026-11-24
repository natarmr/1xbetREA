package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b7d implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b7d f2102a;
    private static final ugi0 descriptor;

    static {
        b7d b7dVar = new b7d();
        f2102a = b7dVar;
        zna0 zna0Var = new zna0("org.xplatform.core.data.CombinedGameResult", b7dVar, 2);
        zna0Var.j("oneXGames", false);
        zna0Var.j("bonusGames", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{n070.f22688a, d7d.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = d7d.c;
        boolean z = true;
        int i = 0;
        p070 p070Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                p070Var = (p070) bldVarA.m(ugi0Var, 0, n070.f22688a, p070Var);
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
        return new d7d(i, p070Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d7d d7dVar = (d7d) obj;
        d7dVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = d7d.c;
        cldVarA.m(ugi0Var, 0, n070.f22688a, d7dVar.f5589a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), d7dVar.b);
        cldVarA.c(ugi0Var);
    }
}
