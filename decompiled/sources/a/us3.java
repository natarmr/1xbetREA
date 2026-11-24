package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class us3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f36191a;
    public final n0o0 b = maz.b(new f33(29));
    public final n0o0 c = maz.b(new a13(this, 19));

    public us3(us00 us00Var) {
        this.f36191a = us00Var;
    }

    public final String a() {
        us00 us00Var = this.f36191a;
        String string = us00Var.getString(R.string.app_name);
        string.getClass();
        String string2 = us00Var.getString(R.string.bonus_str_v2, string);
        string2.getClass();
        return string2;
    }

    public final String b() {
        String string = c().toString();
        us00 us00Var = this.f36191a;
        String string2 = us00Var.getString(R.string.app_name);
        string2.getClass();
        String string3 = us00Var.getString(R.string.app_version, string2, string);
        string3.getClass();
        return string3;
    }

    public final go3 c() {
        return (go3) this.b.getValue();
    }
}
