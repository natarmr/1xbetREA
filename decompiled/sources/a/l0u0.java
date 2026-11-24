package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l0u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0u0 f19219a;
    private static final ugi0 descriptor;

    static {
        l0u0 l0u0Var = new l0u0();
        f19219a = l0u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.valorant.impl.data.model.matches.match.ValorantStatisticMatchesMatchResponse", l0u0Var, 4);
        zna0Var.j("map", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("economyGraph", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = n0u0.e;
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        t0u0 t0u0Var = t0u0.f33139a;
        return new jiy[]{jiyVarJ0, mrv.j0(t0u0Var), mrv.j0(t0u0Var), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = n0u0.e;
        boolean z = true;
        int i = 0;
        String str = null;
        v0u0 v0u0Var = null;
        v0u0 v0u0Var2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                v0u0Var = (v0u0) bldVarA.e(ugi0Var, 1, t0u0.f33139a, v0u0Var);
                i |= 2;
            } else if (iF == 2) {
                v0u0Var2 = (v0u0) bldVarA.e(ugi0Var, 2, t0u0.f33139a, v0u0Var2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new n0u0(i, str, v0u0Var, v0u0Var2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n0u0 n0u0Var = (n0u0) obj;
        n0u0Var.getClass();
        List list = n0u0Var.d;
        v0u0 v0u0Var = n0u0Var.c;
        v0u0 v0u0Var2 = n0u0Var.b;
        String str = n0u0Var.f22719a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = n0u0.e;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || v0u0Var2 != null) {
            cldVarA.p(ugi0Var, 1, t0u0.f33139a, v0u0Var2);
        }
        if (cldVarA.u(ugi0Var) || v0u0Var != null) {
            cldVarA.p(ugi0Var, 2, t0u0.f33139a, v0u0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
