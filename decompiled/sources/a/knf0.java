package a;

/* JADX INFO: loaded from: classes3.dex */
public final class knf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f18584a;
    public final q7d0 b;
    public final wsb0 c;
    public final mmy d;
    public Integer e;
    public Long f;
    public final n0o0 g;

    public knf0(us00 us00Var, q7d0 q7d0Var, wsb0 wsb0Var, mmy mmyVar) {
        q7d0Var.getClass();
        wsb0Var.getClass();
        this.f18584a = us00Var;
        this.b = q7d0Var;
        this.c = wsb0Var;
        this.d = mmyVar;
        this.g = maz.b(new tie0(this, (byte) 19));
    }

    public final String a() {
        q7d0 q7d0Var = this.b;
        boolean z = axq.z(q7d0Var, "FAKE_APP_GUID_ENABLED", false);
        n0o0 n0o0Var = this.g;
        if (!z) {
            return (String) n0o0Var.getValue();
        }
        String string = q7d0Var.a().getString("FAKE_APP_GUID", "");
        return string == null ? (String) n0o0Var.getValue() : string;
    }

    public final int b() {
        Integer num = this.e;
        return num != null ? num.intValue() : ua80.c(this.b, "COUNTRY_ID_PREFS_KEY", 225);
    }

    public final String c() {
        String strC = q7d0.c(this.b, "ISO_CODE_KEY");
        return strC == null ? "" : strC;
    }

    public final lnf0 d() {
        return new lnf0(c(), b());
    }

    public final boolean e() {
        return kotlin.text.c.x(c(), "ru", true);
    }
}
