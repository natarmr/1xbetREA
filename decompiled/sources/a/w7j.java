package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w7j implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w7j f38675a;
    private static final ugi0 descriptor;

    static {
        w7j w7jVar = new w7j();
        f38675a = w7jVar;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.daily_tournament.data.model.DailyWinnerResponse", w7jVar, 2);
        zna0Var.j("DT", true);
        zna0Var.j("US", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(y7j.f42154a), mrv.j0((jiy) e8j.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = e8j.c;
        boolean z = true;
        int i = 0;
        a8j a8jVar = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                a8jVar = (a8j) bldVarA.e(ugi0Var, 0, y7j.f42154a, a8jVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new e8j(i, a8jVar, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e8j e8jVar = (e8j) obj;
        e8jVar.getClass();
        List list = e8jVar.b;
        a8j a8jVar = e8jVar.f7374a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = e8j.c;
        if (cldVarA.u(ugi0Var) || a8jVar != null) {
            cldVarA.p(ugi0Var, 0, y7j.f42154a, a8jVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
