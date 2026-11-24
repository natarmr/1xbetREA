package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0u0 f33139a;
    private static final ugi0 descriptor;

    static {
        t0u0 t0u0Var = new t0u0();
        f33139a = t0u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.valorant.impl.data.model.matches.match.ValorantStatisticMatchesMatchTeamResponse", t0u0Var, 3);
        zna0Var.j("score", true);
        zna0Var.j("isWinner", true);
        zna0Var.j("players", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(sm8.f32432a), mrv.j0((jiy) v0u0.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = v0u0.d;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Boolean bool = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new v0u0(i, bool, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        v0u0 v0u0Var = (v0u0) obj;
        v0u0Var.getClass();
        List list = v0u0Var.c;
        Boolean bool = v0u0Var.b;
        Integer num = v0u0Var.f36600a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = v0u0.d;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
