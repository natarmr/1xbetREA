package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class v0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0v0 f36601a;
    public static final v0v0 b;
    public static final /* synthetic */ v0v0[] c;

    static {
        v0v0 v0v0Var = new v0v0("RIGHT_TOP", 0);
        f36601a = v0v0Var;
        v0v0 v0v0Var2 = new v0v0("LEFT_TOP", 1);
        b = v0v0Var2;
        c = new v0v0[]{v0v0Var, v0v0Var2};
    }

    public static v0v0 valueOf(String str) {
        return (v0v0) Enum.valueOf(v0v0.class, str);
    }

    public static v0v0[] values() {
        return (v0v0[]) c.clone();
    }
}
