package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class va20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final va20 f37064a;
    public static final va20 b;
    public static final va20 c;
    public static final /* synthetic */ va20[] d;

    static {
        va20 va20Var = new va20("OPTION", 0);
        f37064a = va20Var;
        va20 va20Var2 = new va20("ACTION", 1);
        b = va20Var2;
        va20 va20Var3 = new va20("POINT", 2);
        c = va20Var3;
        d = new va20[]{va20Var, va20Var2, va20Var3};
    }

    public static va20 valueOf(String str) {
        return (va20) Enum.valueOf(va20.class, str);
    }

    public static va20[] values() {
        return (va20[]) d.clone();
    }
}
