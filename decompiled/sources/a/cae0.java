package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class cae0 extends vzs0 {
    public static final fay c;
    public static final fay d;
    public final hcp0 b = new hcp0(new xi70());

    static {
        b0t0 b0t0Var = b0t0.b;
        c = fay.a(xvw.Y(b0t0Var, false, null, 5), gay.c, false, null, null, 61);
        d = fay.a(xvw.Y(b0t0Var, false, null, 5), gay.b, false, null, null, 61);
    }

    @Override // a.vzs0
    public final pzs0 d(wsy wsyVar) {
        wsyVar.getClass();
        return new q4m0(h(wsyVar, new fay(b0t0.b, false, false, null, 62)));
    }

    public final Pair g(kzj0 kzj0Var, wm40 wm40Var, fay fayVar) {
        if (kzj0Var.S().getParameters().isEmpty()) {
            return new Pair(kzj0Var, Boolean.FALSE);
        }
        if (ary.z(kzj0Var)) {
            pzs0 pzs0Var = (pzs0) kzj0Var.J().get(0);
            t3u0 t3u0VarA = pzs0Var.a();
            wsy wsyVarB = pzs0Var.b();
            wsyVarB.getClass();
            return new Pair(ucx.g0(kzj0Var.K(), kzj0Var.S(), kotlin.collections.a.c(new q4m0(h(wsyVarB, fayVar), t3u0VarA)), kzj0Var.U()), Boolean.FALSE);
        }
        if (bdx.k0(kzj0Var)) {
            return new Pair(f2o.c(c2o.n, kzj0Var.S().toString()), Boolean.FALSE);
        }
        cr30 cr30VarJ = wm40Var.J(this);
        cr30VarJ.getClass();
        ays0 ays0VarK = kzj0Var.K();
        iys0 iys0VarH = wm40Var.h();
        iys0VarH.getClass();
        List<hzs0> parameters = wm40Var.h().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(parameters, 10));
        for (hzs0 hzs0Var : parameters) {
            hzs0Var.getClass();
            hcp0 hcp0Var = this.b;
            arrayList.add(xi70.c(hzs0Var, fayVar, hcp0Var, hcp0Var.m(hzs0Var, fayVar)));
        }
        return new Pair(ucx.i0(ays0VarK, iys0VarH, arrayList, kzj0Var.U(), cr30VarJ, new caz(wm40Var, this, kzj0Var, fayVar)), Boolean.TRUE);
    }

    public final wsy h(wsy wsyVar, fay fayVar) {
        foc focVarN = wsyVar.S().n();
        if (focVarN instanceof hzs0) {
            fayVar.getClass();
            return h(this.b.m((hzs0) focVarN, fay.a(fayVar, null, true, null, null, 59)), fayVar);
        }
        if (!(focVarN instanceof wm40)) {
            udk.e(focVarN, "Unexpected declaration kind: ");
            return null;
        }
        foc focVarN2 = thb.Z(wsyVar).S().n();
        if (!(focVarN2 instanceof wm40)) {
            c99.o("For some reason declaration for upper bound is not a class but \"", focVarN2, "\" while for lower it's \"", focVarN, 34);
            return null;
        }
        Pair pairG = g(thb.P(wsyVar), (wm40) focVarN, c);
        kzj0 kzj0Var = (kzj0) pairG.f46059a;
        boolean zBooleanValue = ((Boolean) pairG.b).booleanValue();
        Pair pairG2 = g(thb.Z(wsyVar), (wm40) focVarN2, d);
        kzj0 kzj0Var2 = (kzj0) pairG2.f46059a;
        return (zBooleanValue || ((Boolean) pairG2.b).booleanValue()) ? new dae0(kzj0Var, kzj0Var2) : ucx.W(kzj0Var, kzj0Var2);
    }
}
