package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s8b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s8b0 f31793a;
    public static final s8b0 b;
    public static final s8b0 c;
    public static final /* synthetic */ s8b0[] d;

    static {
        s8b0 s8b0Var = new s8b0("INIT", 0);
        f31793a = s8b0Var;
        s8b0 s8b0Var2 = new s8b0("REOPEN_FRAGMENT", 1);
        b = s8b0Var2;
        s8b0 s8b0Var3 = new s8b0("INTERNET_OK", 2);
        c = s8b0Var3;
        d = new s8b0[]{s8b0Var, s8b0Var2, s8b0Var3};
    }

    public static s8b0 valueOf(String str) {
        return (s8b0) Enum.valueOf(s8b0.class, str);
    }

    public static s8b0[] values() {
        return (s8b0[]) d.clone();
    }
}
