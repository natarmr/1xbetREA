package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e4g implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e4g f7180a;
    private static final ugi0 descriptor;

    static {
        e4g e4gVar = new e4g();
        f7180a = e4gVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.cs.CyberCSMatchesStatisticResponse", e4gVar, 5);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("tournamentId", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("matches", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = g4g.f;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        t8h t8hVar = t8h.f33510a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(t8hVar), mrv.j0(t8hVar), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = g4g.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        v8h v8hVar = null;
        v8h v8hVar2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                v8hVar = (v8h) bldVarA.e(ugi0Var, 2, t8h.f33510a, v8hVar);
                i |= 4;
            } else if (iF == 3) {
                v8hVar2 = (v8h) bldVarA.e(ugi0Var, 3, t8h.f33510a, v8hVar2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new g4g(i, num, num2, v8hVar, v8hVar2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        g4g g4gVar = (g4g) obj;
        g4gVar.getClass();
        List list = g4gVar.e;
        v8h v8hVar = g4gVar.d;
        v8h v8hVar2 = g4gVar.c;
        Integer num = g4gVar.b;
        Integer num2 = g4gVar.f10664a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = g4g.f;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || v8hVar2 != null) {
            cldVarA.p(ugi0Var, 2, t8h.f33510a, v8hVar2);
        }
        if (cldVarA.u(ugi0Var) || v8hVar != null) {
            cldVarA.p(ugi0Var, 3, t8h.f33510a, v8hVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
