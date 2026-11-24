package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ymp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ymp0 f42902a;
    public static final ymp0 b;
    public static final /* synthetic */ ymp0[] c;

    static {
        ymp0 ymp0Var = new ymp0("INCOMING", 0);
        f42902a = ymp0Var;
        ymp0 ymp0Var2 = new ymp0("OUTGOING", 1);
        b = ymp0Var2;
        c = new ymp0[]{ymp0Var, ymp0Var2};
    }

    public static ymp0 valueOf(String str) {
        return (ymp0) Enum.valueOf(ymp0.class, str);
    }

    public static ymp0[] values() {
        return (ymp0[]) c.clone();
    }
}
