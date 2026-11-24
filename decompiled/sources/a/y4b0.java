package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class y4b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y4b0 f41994a;
    public static final y4b0 b;
    public static final y4b0 c;
    public static final /* synthetic */ y4b0[] d;

    static {
        y4b0 y4b0Var = new y4b0("INIT", 0);
        f41994a = y4b0Var;
        y4b0 y4b0Var2 = new y4b0("REOPEN_FRAGMENT", 1);
        b = y4b0Var2;
        y4b0 y4b0Var3 = new y4b0("INTERNET_OK", 2);
        c = y4b0Var3;
        d = new y4b0[]{y4b0Var, y4b0Var2, y4b0Var3};
    }

    public static y4b0 valueOf(String str) {
        return (y4b0) Enum.valueOf(y4b0.class, str);
    }

    public static y4b0[] values() {
        return (y4b0[]) d.clone();
    }
}
