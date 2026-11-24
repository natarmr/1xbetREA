package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y4k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y4k f42006a;
    private static final ugi0 descriptor;

    static {
        y4k y4kVar = new y4k();
        f42006a = y4kVar;
        zna0 zna0Var = new zna0("org.xplatform.favorites.core.data.model.games.DeleteFavoriteGamesRequest", y4kVar, 2);
        zna0Var.j("gameIds", false);
        zna0Var.j("subscribe", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{a5k.c[0].getValue(), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = a5k.c;
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new a5k(i, bool, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a5k a5kVar = (a5k) obj;
        a5kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) a5k.c[0].getValue(), a5kVar.f273a);
        Boolean bool = a5kVar.b;
        if (bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
