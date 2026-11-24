package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f4b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f4b0 f8906a;
    public static final f4b0 b;
    public static final /* synthetic */ f4b0[] c;

    static {
        f4b0 f4b0Var = new f4b0("LIVE", 0);
        f8906a = f4b0Var;
        f4b0 f4b0Var2 = new f4b0("LINE", 1);
        b = f4b0Var2;
        c = new f4b0[]{f4b0Var, f4b0Var2};
    }

    public static f4b0 valueOf(String str) {
        return (f4b0) Enum.valueOf(f4b0.class, str);
    }

    public static f4b0[] values() {
        return (f4b0[]) c.clone();
    }
}
