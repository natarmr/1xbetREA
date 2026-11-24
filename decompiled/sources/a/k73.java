package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k73 f17799a;
    public static final k73 b;
    public static final /* synthetic */ k73[] c;

    static {
        k73 k73Var = new k73("INITIAL", 0);
        f17799a = k73Var;
        k73 k73Var2 = new k73("COMBINATIONS", 1);
        b = k73Var2;
        c = new k73[]{k73Var, k73Var2};
    }

    public static k73 valueOf(String str) {
        return (k73) Enum.valueOf(k73.class, str);
    }

    public static k73[] values() {
        return (k73[]) c.clone();
    }
}
