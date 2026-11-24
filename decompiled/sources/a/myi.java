package a;

import org.xplatform.ufc.api.game.UfcPostGameParams;

/* JADX INFO: loaded from: classes6.dex */
public final class myi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nyi f22604a;

    public myi(nyi nyiVar) {
        this.f22604a = nyiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        oyi oyiVar = (oyi) this.f22604a.c;
        String str = oyiVar.f26061a;
        mne mneVarH = ((psc) oyiVar.b.b).h();
        x1x.x(mneVarH);
        UfcPostGameParams ufcPostGameParams = oyiVar.c;
        a7q a7qVarH = ((v7i) oyiVar.d.b).h();
        j3c j3cVarV = oyiVar.e.V();
        x1x.x(j3cVarV);
        m1e m1eVar = oyiVar.f;
        oeg0 oeg0Var = oyiVar.g;
        ctf0 ctf0Var = oyiVar.h;
        a1d a1dVar = oyiVar.i;
        return new a6t0(vzg0Var, str, mneVarH, ufcPostGameParams, a7qVarH, j3cVarV, m1eVar, oeg0Var, ctf0Var, ((qv2) a1dVar.b).i(), ((dbi) oyiVar.j.f3330a).B(), oyiVar.k, ((qv2) a1dVar.b).g(), new kys0((byte) 1), oyiVar.l, oyiVar.m, new dgu(new reu((p5t0) oyiVar.t.get()), new b8u((d4t0) oyiVar.u.get()), new e1u((d4t0) oyiVar.u.get()), new reu((nov) oyiVar.v.get())), oyiVar.p, oyiVar.q);
    }
}
