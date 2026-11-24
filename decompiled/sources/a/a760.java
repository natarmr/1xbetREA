package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a760 f350a;
    public static final a760 b;
    public static final a760 c;
    public static final a760 d;
    public static final /* synthetic */ a760[] e;

    static {
        a760 a760Var = new a760("MATCH_EVENT", 0);
        f350a = a760Var;
        a760 a760Var2 = new a760("MATCH_EVENT_FAVORITE", 1);
        b = a760Var2;
        a760 a760Var3 = new a760("INDICATOR", 2);
        c = a760Var3;
        a760 a760Var4 = new a760("SOUND", 3);
        d = a760Var4;
        e = new a760[]{a760Var, a760Var2, a760Var3, a760Var4};
    }

    public static a760 valueOf(String str) {
        return (a760) Enum.valueOf(a760.class, str);
    }

    public static a760[] values() {
        return (a760[]) e.clone();
    }
}
