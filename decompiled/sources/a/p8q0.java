package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p8q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8q0 f26571a;
    public static final p8q0 b;
    public static final p8q0 c;
    public static final p8q0 d;
    public static final /* synthetic */ p8q0[] e;

    static {
        p8q0 p8q0Var = new p8q0("StartInput", 0);
        f26571a = p8q0Var;
        p8q0 p8q0Var2 = new p8q0("StopInput", 1);
        b = p8q0Var2;
        p8q0 p8q0Var3 = new p8q0("ShowKeyboard", 2);
        c = p8q0Var3;
        p8q0 p8q0Var4 = new p8q0("HideKeyboard", 3);
        d = p8q0Var4;
        e = new p8q0[]{p8q0Var, p8q0Var2, p8q0Var3, p8q0Var4};
    }

    public static p8q0 valueOf(String str) {
        return (p8q0) Enum.valueOf(p8q0.class, str);
    }

    public static p8q0[] values() {
        return (p8q0[]) e.clone();
    }
}
