package a;

/* JADX INFO: loaded from: classes5.dex */
public final class umi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gji f35920a;

    public umi(gji gjiVar) {
        this.f35920a = gjiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        Object value;
        ali aliVar = (ali) this.f35920a.c;
        ctf0 ctf0Var = (ctf0) aliVar.f1068a;
        mne mneVarH = ((psc) ((cad) aliVar.b).b).h();
        x1x.x(mneVarH);
        ctf0Var.getClass();
        v970 v970Var = new v970(null, new fq60((byte) 22), new v510(ctf0Var, (byte) 25), cvm0.p(mneVarH.f22085a, mneVarH.b), null);
        String str = (String) vzg0Var.a("OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_BALANCE");
        if (str == null) {
            str = "";
        }
        String str2 = (String) vzg0Var.a("OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_TOTAL_SUM");
        String str3 = str2 != null ? str2 : "";
        Boolean bool = (Boolean) vzg0Var.a("OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_EXIT_ENABLE");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        p7m0 p7m0Var = v970Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            v970Var.f.getClass();
        } while (!p7m0Var.m(value, new q970(str, str3, zBooleanValue)));
        return v970Var;
    }
}
