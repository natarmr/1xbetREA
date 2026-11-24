package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f07 f8705a;
    public static final f07 b;
    public static final f07 c;
    public static final f07 d;
    public static final /* synthetic */ f07[] e;

    static {
        f07 f07Var = new f07("AUTO_SUB", 0);
        f8705a = f07Var;
        f07 f07Var2 = new f07("OPTION_BET", 1);
        b = f07Var2;
        f07 f07Var3 = new f07("EACH_WAY", 2);
        c = f07Var3;
        f07 f07Var4 = new f07("POLY_BET", 3);
        d = f07Var4;
        e = new f07[]{f07Var, f07Var2, f07Var3, f07Var4};
    }

    public static f07 valueOf(String str) {
        return (f07) Enum.valueOf(f07.class, str);
    }

    public static f07[] values() {
        return (f07[]) e.clone();
    }
}
