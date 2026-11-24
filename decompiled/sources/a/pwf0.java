package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class pwf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pwf0 f27709a;
    public static final pwf0 b;
    public static final pwf0 c;
    public static final /* synthetic */ pwf0[] d;

    static {
        pwf0 pwf0Var = new pwf0("DEFAULT", 0);
        f27709a = pwf0Var;
        pwf0 pwf0Var2 = new pwf0("FROM_LOGIN", 1);
        b = pwf0Var2;
        pwf0 pwf0Var3 = new pwf0("FROM_CHANGE_PASSWORD", 2);
        c = pwf0Var3;
        d = new pwf0[]{pwf0Var, pwf0Var2, pwf0Var3};
    }

    public static pwf0 valueOf(String str) {
        return (pwf0) Enum.valueOf(pwf0.class, str);
    }

    public static pwf0[] values() {
        return (pwf0[]) d.clone();
    }
}
