package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p83 f26536a;
    public static final p83 b;
    public static final /* synthetic */ p83[] c;

    static {
        p83 p83Var = new p83("JAVA", 0);
        f26536a = p83Var;
        p83 p83Var2 = new p83("KOTLIN", 1);
        b = p83Var2;
        c = new p83[]{p83Var, p83Var2};
    }

    public static p83 valueOf(String str) {
        return (p83) Enum.valueOf(p83.class, str);
    }

    public static p83[] values() {
        return (p83[]) c.clone();
    }
}
