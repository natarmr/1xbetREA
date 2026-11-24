package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fd10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fd10 f9337a;
    public static final fd10 b;
    public static final fd10 c;
    public static final /* synthetic */ fd10[] d;

    static {
        fd10 fd10Var = new fd10("MENU", 0);
        f9337a = fd10Var;
        fd10 fd10Var2 = new fd10("DEEPLINK", 1);
        b = fd10Var2;
        fd10 fd10Var3 = new fd10("BET_HISTORY", 2);
        c = fd10Var3;
        d = new fd10[]{fd10Var, fd10Var2, fd10Var3};
    }

    public static fd10 valueOf(String str) {
        return (fd10) Enum.valueOf(fd10.class, str);
    }

    public static fd10[] values() {
        return (fd10[]) d.clone();
    }
}
