package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kys0 f26171a;
    public static final p0v0 b;
    public static final p0v0 c;
    public static final /* synthetic */ p0v0[] d;

    static {
        p0v0 p0v0Var = new p0v0("NONE", 0);
        b = p0v0Var;
        p0v0 p0v0Var2 = new p0v0("ADD_BALANCE", 1);
        c = p0v0Var2;
        d = new p0v0[]{p0v0Var, p0v0Var2};
        f26171a = new kys0((byte) 11);
    }

    public static p0v0 valueOf(String str) {
        return (p0v0) Enum.valueOf(p0v0.class, str);
    }

    public static p0v0[] values() {
        return (p0v0[]) d.clone();
    }
}
