package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vmi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gji f37675a;

    public vmi(gji gjiVar) {
        this.f37675a = gjiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        Object value;
        ali aliVar = (ali) this.f37675a.c;
        mne mneVarH = ((psc) ((cad) aliVar.b).b).h();
        x1x.x(mneVarH);
        ctf0 ctf0Var = (ctf0) aliVar.f1068a;
        ctf0Var.getClass();
        vc70 vc70Var = new vc70(null, new fq60((byte) 23), new v510(ctf0Var, (byte) 26), cvm0.p(mneVarH.c, mneVarH.f22085a), null);
        Boolean bool = (Boolean) vzg0Var.a("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_BUNDLE_DEMO_AVAILABLE");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        p7m0 p7m0Var = vc70Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            vc70Var.f.getClass();
        } while (!p7m0Var.m(value, new qc70(zBooleanValue)));
        return vc70Var;
    }
}
