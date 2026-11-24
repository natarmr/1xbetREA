package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class tf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf6 f33852a;
    public static final /* synthetic */ tf6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    tf6 EF0;

    static {
        tf6 tf6Var = new tf6("Theme", 0);
        tf6 tf6Var2 = new tf6("Static", 1);
        f33852a = tf6Var2;
        b = new tf6[]{tf6Var, tf6Var2};
    }

    public static tf6 valueOf(String str) {
        return (tf6) Enum.valueOf(tf6.class, str);
    }

    public static tf6[] values() {
        return (tf6[]) b.clone();
    }
}
