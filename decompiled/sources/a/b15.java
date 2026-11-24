package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b15 f1791a;
    public static final b15 b;
    public static final /* synthetic */ b15[] c;

    static {
        b15 b15Var = new b15("PRIMARY_ON_WHITE_BACKGROUND", 0);
        f1791a = b15Var;
        b15 b15Var2 = new b15("WHITE_ON_PRIMARY_BACKGROUND", 1);
        b = b15Var2;
        c = new b15[]{b15Var, b15Var2};
    }

    public static b15 valueOf(String str) {
        return (b15) Enum.valueOf(b15.class, str);
    }

    public static b15[] values() {
        return (b15[]) c.clone();
    }
}
