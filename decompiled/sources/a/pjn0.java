package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pjn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pjn0 f27099a;
    public static final pjn0 b;
    public static final pjn0 c;
    public static final pjn0 d;
    public static final pjn0 e;
    public static final /* synthetic */ pjn0[] f;

    static {
        pjn0 pjn0Var = new pjn0("NONE", 0);
        f27099a = pjn0Var;
        pjn0 pjn0Var2 = new pjn0("ONLINE_CALL", 1);
        b = pjn0Var2;
        pjn0 pjn0Var3 = new pjn0("CALL_BACK", 2);
        c = pjn0Var3;
        pjn0 pjn0Var4 = new pjn0("CALL_BACK_HISTORY", 3);
        d = pjn0Var4;
        pjn0 pjn0Var5 = new pjn0("SUPPORT_CHAT", 4);
        e = pjn0Var5;
        f = new pjn0[]{pjn0Var, pjn0Var2, pjn0Var3, pjn0Var4, pjn0Var5};
    }

    public static pjn0 valueOf(String str) {
        return (pjn0) Enum.valueOf(pjn0.class, str);
    }

    public static pjn0[] values() {
        return (pjn0[]) f.clone();
    }
}
