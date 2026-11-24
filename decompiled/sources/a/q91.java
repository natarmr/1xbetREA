package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q91 f28325a;
    public static final q91 b;
    public static final q91 c;
    public static final q91 d;
    public static final /* synthetic */ q91[] e;

    static {
        q91 q91Var = new q91("DEFAULT", 0);
        f28325a = q91Var;
        q91 q91Var2 = new q91("DEEPLINK", 1);
        b = q91Var2;
        q91 q91Var3 = new q91("PUSH", 2);
        c = q91Var3;
        q91 q91Var4 = new q91("MESSAGES", 3);
        d = q91Var4;
        e = new q91[]{q91Var, q91Var2, q91Var3, q91Var4};
    }

    public static q91 valueOf(String str) {
        return (q91) Enum.valueOf(q91.class, str);
    }

    public static q91[] values() {
        return (q91[]) e.clone();
    }
}
