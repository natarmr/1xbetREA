package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d7b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7b0 f5587a;
    public static final d7b0 b;
    public static final d7b0 c;
    public static final /* synthetic */ d7b0[] d;

    static {
        d7b0 d7b0Var = new d7b0("INIT", 0);
        f5587a = d7b0Var;
        d7b0 d7b0Var2 = new d7b0("REOPEN_FRAGMENT", 1);
        b = d7b0Var2;
        d7b0 d7b0Var3 = new d7b0("INTERNET_OK", 2);
        c = d7b0Var3;
        d = new d7b0[]{d7b0Var, d7b0Var2, d7b0Var3};
    }

    public static d7b0 valueOf(String str) {
        return (d7b0) Enum.valueOf(d7b0.class, str);
    }

    public static d7b0[] values() {
        return (d7b0[]) d.clone();
    }
}
