package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class od8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final od8 f25064a;
    public static final od8 b;
    public static final od8 c;
    public static final od8 d;
    public static final /* synthetic */ od8[] e;

    static {
        od8 od8Var = new od8("TOP", 0);
        f25064a = od8Var;
        od8 od8Var2 = new od8("MIDDLE", 1);
        b = od8Var2;
        od8 od8Var3 = new od8("BOTTOM", 2);
        c = od8Var3;
        od8 od8Var4 = new od8("SINGLE", 3);
        d = od8Var4;
        e = new od8[]{od8Var, od8Var2, od8Var3, od8Var4};
    }

    public static od8 valueOf(String str) {
        return (od8) Enum.valueOf(od8.class, str);
    }

    public static od8[] values() {
        return (od8[]) e.clone();
    }
}
