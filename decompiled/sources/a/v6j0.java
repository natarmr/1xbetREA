package a;

/* JADX INFO: loaded from: classes3.dex */
public final class v6j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f36880a;
    public final n0o0 b = maz.b(new goi0(this, 1));

    public v6j0(q7d0 q7d0Var) {
        this.f36880a = q7d0Var;
    }

    public final long a() {
        return this.f36880a.a().getLong("INSTALLATION_APP_DATE", 0L);
    }

    public final int b() {
        return this.f36880a.a().getInt("NIGHT_MODE_TURN_OFF_HOURS", 9);
    }

    public final int c() {
        return this.f36880a.a().getInt("NIGHT_MODE_TURN_OFF_MINUTES", 0);
    }

    public final int d() {
        return this.f36880a.a().getInt("NIGHT_MODE_TURN_ON_HOURS", 18);
    }

    public final int e() {
        return this.f36880a.a().getInt("NIGHT_MODE_TURN_ON_MINUTES", 0);
    }

    public final boolean f() {
        return this.f36880a.a().getBoolean("NIGHT_MODE_TIME_TABLE", false);
    }

    public final uaq0 g() {
        int i = this.f36880a.a().getInt("THEME", -100);
        uaq0.f35345a.getClass();
        return s9m0.d(i);
    }

    public final qz40 h() {
        return (qz40) this.b.getValue();
    }
}
