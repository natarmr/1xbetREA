package a;

/* JADX INFO: loaded from: classes3.dex */
public final class e41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f7161a;

    public e41(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f7161a = s1pVar;
                break;
            case 2:
                this.f7161a = s1pVar;
                break;
            case 3:
                this.f7161a = s1pVar;
                break;
            case 4:
                this.f7161a = s1pVar;
                break;
            default:
                this.f7161a = s1pVar;
                break;
        }
    }

    public void a(o31 o31Var) {
        String str;
        int iOrdinal = o31Var.ordinal();
        if (iOrdinal == 0) {
            str = "take_part";
        } else if (iOrdinal == 1) {
            str = "later";
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            str = "ignore";
        }
        this.f7161a.a(tx3.l0(new k1p[]{new i1p(530, (byte) 2), new j1p(str, (byte) 0)}), 11991L);
    }

    public void b(String str, String str2) {
        this.f7161a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(str2, (byte) 1)}), 3291L);
    }

    public void c(Integer num, String str) {
        s1p s1pVar = this.f7161a;
        if (num != null) {
            s1pVar.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new i1p(num)}), 3127L);
        } else {
            b1j.v(str, s1pVar, 3127L);
        }
    }

    public void e(qun0 qun0Var) {
        this.f7161a.a(cui0.b(new j1p(qun0Var.f29353a, (byte) 0)), 12665L);
    }

    public void f(String str) {
        b1j.v(str, this.f7161a, 11984L);
    }
}
