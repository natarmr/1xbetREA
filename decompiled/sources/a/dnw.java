package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dnw implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dnw f6391a;
    private static final ugi0 descriptor;

    static {
        dnw dnwVar = new dnw();
        f6391a = dnwVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.horse_menu.data.model.HorseMenuResponse", dnwVar, 3);
        zna0Var.j("sportId", true);
        zna0Var.j("horses", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0((jiy) fnw.d[1].getValue()), mrv.j0(emw.f8066a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fnw.d;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        gmw gmwVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                gmwVar = (gmw) bldVarA.e(ugi0Var, 2, emw.f8066a, gmwVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new fnw(i, num, list, gmwVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fnw fnwVar = (fnw) obj;
        fnwVar.getClass();
        gmw gmwVar = fnwVar.c;
        List list = fnwVar.b;
        Integer num = fnwVar.f9858a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fnw.d;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || gmwVar != null) {
            cldVarA.p(ugi0Var, 2, emw.f8066a, gmwVar);
        }
        cldVarA.c(ugi0Var);
    }
}
