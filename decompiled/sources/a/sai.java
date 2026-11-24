package a;

/* JADX INFO: loaded from: classes3.dex */
public final class sai implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pai f31889a;

    public sai(pai paiVar) {
        this.f31889a = paiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        esg0 esg0Var = (esg0) this.f31889a.b;
        oeg0 oeg0Var = (oeg0) esg0Var.f8326a;
        ctf0 ctf0Var = (ctf0) esg0Var.b;
        mne mneVarH = ((psc) ((cad) esg0Var.c).b).h();
        x1x.x(mneVarH);
        jr0 jr0VarH = ((i7i) ((ehf0) esg0Var.d).b).h();
        x1x.x(jr0VarH);
        xoc xocVar = new xoc(jr0VarH, false);
        gw8 gw8Var = (gw8) esg0Var.e;
        return new e09(vzg0Var, oeg0Var, ctf0Var, mneVarH, xocVar, new gut(new do20(gw8Var)), new gut(new do20(gw8Var)));
    }
}
