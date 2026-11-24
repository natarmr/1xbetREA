package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i4b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i4b0 f14140a;
    public static final i4b0 b;
    public static final i4b0 c;
    public static final /* synthetic */ i4b0[] d;

    static {
        i4b0 i4b0Var = new i4b0("INIT", 0);
        f14140a = i4b0Var;
        i4b0 i4b0Var2 = new i4b0("REOPEN_FRAGMENT", 1);
        b = i4b0Var2;
        i4b0 i4b0Var3 = new i4b0("INTERNET_OK", 2);
        c = i4b0Var3;
        d = new i4b0[]{i4b0Var, i4b0Var2, i4b0Var3};
    }

    public static i4b0 valueOf(String str) {
        return (i4b0) Enum.valueOf(i4b0.class, str);
    }

    public static i4b0[] values() {
        return (i4b0[]) d.clone();
    }
}
