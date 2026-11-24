package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y9o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s64 f42259a;
    public final y3v b;

    public y9o0(s64 s64Var, y3v y3vVar) {
        this.f42259a = s64Var;
        this.b = y3vVar;
    }

    public final void a(String str) {
        b1j.v(str, this.f42259a.f31684a, 12348L);
        kt2 kt2Var = (kt2) this.b.b;
        jo20 jo20Var = new jo20();
        if (str.length() > 0) {
            jo20Var.put("error_code", str);
        }
        kt2Var.a("session_error_logout", jo20Var.b());
    }
}
