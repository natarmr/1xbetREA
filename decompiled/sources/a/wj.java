package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class wj extends w46 {
    public final ActionMenuDialogParams b;
    public final i1w0 c;
    public final yfm0 d;
    public final duj e;
    public final atz f;
    public final oif0 g;
    public final es h;
    public final atz i;
    public final gl5 j;
    public final njt0 k;
    public final z8u l;
    public final ivn m;
    public final b3c n;
    public final ctf0 o;
    public final xr p;
    public final n1d q;
    public final cad r;
    public final cl5 s;
    public final evz t;
    public final gua u;
    public final boolean v;
    public final p7m0 w;
    public final qoj0 x;

    /* JADX WARN: Multi-variable type inference failed */
    public wj(ActionMenuDialogParams actionMenuDialogParams, i1w0 i1w0Var, yfm0 yfm0Var, duj dujVar, atz atzVar, oif0 oif0Var, nku nkuVar, es esVar, atz atzVar2, gl5 gl5Var, njt0 njt0Var, z8u z8uVar, lbu lbuVar, ivn ivnVar, b3c b3cVar, ctf0 ctf0Var, mne mneVar, xr xrVar, reu reuVar, n1d n1dVar, cad cadVar, cl5 cl5Var, evz evzVar, gua guaVar, hwt hwtVar, pru pruVar) {
        ctf0Var.getClass();
        guaVar.getClass();
        this.b = actionMenuDialogParams;
        this.c = i1w0Var;
        this.d = yfm0Var;
        this.e = dujVar;
        this.f = atzVar;
        this.g = oif0Var;
        this.h = esVar;
        this.i = atzVar2;
        this.j = gl5Var;
        this.k = njt0Var;
        this.l = z8uVar;
        this.m = ivnVar;
        this.n = b3cVar;
        this.o = ctf0Var;
        this.p = xrVar;
        this.q = n1dVar;
        this.r = cadVar;
        this.s = cl5Var;
        this.t = evzVar;
        this.u = guaVar;
        this.v = lbuVar.j();
        udl0 udl0Var = pruVar.a().h1;
        boolean z = actionMenuDialogParams.g;
        boolean z2 = actionMenuDialogParams.i;
        boolean z3 = actionMenuDialogParams.l;
        long j = actionMenuDialogParams.d;
        boolean z4 = false;
        Object[] objArr = 0;
        byte b = 1;
        if (j != 0 && j != -1) {
            z4 = true;
        }
        this.w = q7m0.a(new yi(z, z2, false, z3, false, false, z4, false, (!actionMenuDialogParams.k || lbuVar.j()) ? z4 : true, ((g8n0) b3cVar.f1895a.b).c(j) != null ? true : z4, actionMenuDialogParams.h, actionMenuDialogParams.j, null, actionMenuDialogParams.n, !Intrinsics.d(hwtVar.f13781a.a(udl0Var), fua.b(udl0Var))));
        this.x = ckb.F();
        yje yjeVar = null;
        sac.V(jiu0.a(this), oj.f25335a, null, mneVar.c, new nj(this, yjeVar, (byte) 3), 10);
        byte b2 = 4;
        sac.T(new fnq(nkuVar.a(), new uj(this, yjeVar, objArr == true ? 1 : 0), b2), jiu0.a(this), new pd(2, yjeVar, b));
        sac.V(jiu0.a(this), qj.f28813a, null, null, new nj(this, yjeVar, (byte) 7), 14);
        sac.T(new fnq(reuVar.b(), new uj(this, yjeVar, b), b2), d5c.S(jiu0.a(this), mneVar.c), vj.h);
        sac.V(jiu0.a(this), pj.f27063a, null, mneVar.c, new nj(this, yjeVar, (byte) 5), 10);
    }

    public final void w(FragmentScreen fragmentScreen, boolean z, boolean z2) {
        byte b = 0;
        this.c.d(new cj(z2, fragmentScreen, z, b));
        qjj.W(jiu0.a(this), null, null, new nj(this, null, b), 3);
    }
}
