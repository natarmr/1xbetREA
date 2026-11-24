package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzi implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzi f45254a;
    private static final ugi0 descriptor;

    static {
        zzi zziVar = new zzi();
        f45254a = zziVar;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.daily_tournament.data.model.DailyPrizeResponse", zziVar, 2);
        zna0Var.j("PZ", true);
        zna0Var.j("TI", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) e0j.c[0].getValue()), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = e0j.c;
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
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
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new e0j(i, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e0j e0jVar = (e0j) obj;
        e0jVar.getClass();
        Integer num = e0jVar.b;
        List list = e0jVar.f6992a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = e0j.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
