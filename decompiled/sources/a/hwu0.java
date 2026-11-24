package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hwu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hwu0 f13783a;
    public static final hwu0 b;
    public static final /* synthetic */ hwu0[] c;

    static {
        hwu0 hwu0Var = new hwu0("CONFIRM_OPERATION", 0);
        f13783a = hwu0Var;
        hwu0 hwu0Var2 = new hwu0("OPEN_PAYMENTS", 1);
        b = hwu0Var2;
        c = new hwu0[]{hwu0Var, hwu0Var2};
    }

    public static hwu0 valueOf(String str) {
        return (hwu0) Enum.valueOf(hwu0.class, str);
    }

    public static hwu0[] values() {
        return (hwu0[]) c.clone();
    }
}
