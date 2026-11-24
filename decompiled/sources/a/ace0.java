package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ace0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ace0 f624a;
    public static final ace0 b;
    public static final ace0 c;
    public static final ace0 d;
    public static final ace0 e;
    public static final /* synthetic */ ace0[] f;

    static {
        ace0 ace0Var = new ace0("CONTINUE", 0);
        f624a = ace0Var;
        ace0 ace0Var2 = new ace0("LOGOUT", 1);
        b = ace0Var2;
        ace0 ace0Var3 = new ace0("EXIT", 2);
        c = ace0Var3;
        ace0 ace0Var4 = new ace0("CONTINUE_CHECKBOX", 3);
        d = ace0Var4;
        ace0 ace0Var5 = new ace0("LOGOUT_CHECKBOX", 4);
        e = ace0Var5;
        f = new ace0[]{ace0Var, ace0Var2, ace0Var3, ace0Var4, ace0Var5};
    }

    public static ace0 valueOf(String str) {
        return (ace0) Enum.valueOf(ace0.class, str);
    }

    public static ace0[] values() {
        return (ace0[]) f.clone();
    }
}
