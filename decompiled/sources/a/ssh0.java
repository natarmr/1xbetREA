package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ssh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ssh0 f32726a;
    public static final ssh0 b;
    public static final ssh0 c;
    public static final ssh0 d;
    public static final ssh0 e;
    public static final ssh0 f;
    public static final /* synthetic */ ssh0[] g;

    static {
        ssh0 ssh0Var = new ssh0("PHONE_NUMBER", 0);
        f32726a = ssh0Var;
        ssh0 ssh0Var2 = new ssh0("CHANGE_PASSWORD", 1);
        b = ssh0Var2;
        ssh0 ssh0Var3 = new ssh0("SECRET_QUESTION", 2);
        c = ssh0Var3;
        ssh0 ssh0Var4 = new ssh0("TWO_FACTOR", 3);
        d = ssh0Var4;
        ssh0 ssh0Var5 = new ssh0("PERSONAL_DATA", 4);
        e = ssh0Var5;
        ssh0 ssh0Var6 = new ssh0("EMAIL_LOGIN", 5);
        f = ssh0Var6;
        g = new ssh0[]{ssh0Var, ssh0Var2, ssh0Var3, ssh0Var4, ssh0Var5, ssh0Var6};
    }

    public static ssh0 valueOf(String str) {
        return (ssh0) Enum.valueOf(ssh0.class, str);
    }

    public static ssh0[] values() {
        return (ssh0[]) g.clone();
    }
}
