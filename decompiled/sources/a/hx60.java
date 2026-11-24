package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hx60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hx60 f13800a;
    private static final ugi0 descriptor;

    static {
        hx60 hx60Var = new hx60();
        f13800a = hx60Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.OneXGamesFavoritesResponse", hx60Var, 1);
        zna0Var.j("favoriteGames", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) jx60.b[0].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jx60.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new jx60(i, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jx60 jx60Var = (jx60) obj;
        jx60Var.getClass();
        List list = jx60Var.f17289a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jx60.b;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
