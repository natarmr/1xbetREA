package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rzd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rzd0 f31355a;
    private static final ugi0 descriptor;

    static {
        rzd0 rzd0Var = new rzd0();
        f31355a = rzd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.rainbow.impl.data.model.matches.match.RainbowStatisticMatchesMatchResponse", rzd0Var, 5);
        zna0Var.j("map", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("rounds", true);
        zna0Var.j("operatorBans", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = tzd0.f;
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        d0e0 d0e0Var = d0e0.f5264a;
        return new jiy[]{jiyVarJ0, mrv.j0(d0e0Var), mrv.j0(d0e0Var), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = tzd0.f;
        boolean z = true;
        int i = 0;
        String str = null;
        f0e0 f0e0Var = null;
        f0e0 f0e0Var2 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                f0e0Var = (f0e0) bldVarA.e(ugi0Var, 1, d0e0.f5264a, f0e0Var);
                i |= 2;
            } else if (iF == 2) {
                f0e0Var2 = (f0e0) bldVarA.e(ugi0Var, 2, d0e0.f5264a, f0e0Var2);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new tzd0(i, str, f0e0Var, f0e0Var2, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tzd0 tzd0Var = (tzd0) obj;
        tzd0Var.getClass();
        List list = tzd0Var.e;
        List list2 = tzd0Var.d;
        f0e0 f0e0Var = tzd0Var.c;
        f0e0 f0e0Var2 = tzd0Var.b;
        String str = tzd0Var.f34799a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = tzd0.f;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || f0e0Var2 != null) {
            cldVarA.p(ugi0Var, 1, d0e0.f5264a, f0e0Var2);
        }
        if (cldVarA.u(ugi0Var) || f0e0Var != null) {
            cldVarA.p(ugi0Var, 2, d0e0.f5264a, f0e0Var);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
