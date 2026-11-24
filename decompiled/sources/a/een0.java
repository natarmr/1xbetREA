package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class een0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final een0 f7681a;
    public static final een0 b;
    public static final een0 c;
    public static final een0 d;
    public static final /* synthetic */ een0[] e;

    static {
        een0 een0Var = new een0("SHIMMERS", 0);
        f7681a = een0Var;
        een0 een0Var2 = new een0("CONTENT_ERROR", 1);
        b = een0Var2;
        een0 een0Var3 = new een0("TEAMS", 2);
        c = een0Var3;
        een0 een0Var4 = new een0("EMPTY", 3);
        d = een0Var4;
        e = new een0[]{een0Var, een0Var2, een0Var3, een0Var4};
    }

    public static een0 valueOf(String str) {
        return (een0) Enum.valueOf(een0.class, str);
    }

    public static een0[] values() {
        return (een0[]) e.clone();
    }
}
