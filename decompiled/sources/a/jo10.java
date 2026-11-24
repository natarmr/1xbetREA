package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jo10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jo10 f16836a;
    public static final jo10 b;
    public static final jo10 c;
    public static final /* synthetic */ jo10[] d;

    static {
        jo10 jo10Var = new jo10("MAIN", 0);
        f16836a = jo10Var;
        jo10 jo10Var2 = new jo10("RESULT", 1);
        b = jo10Var2;
        jo10 jo10Var3 = new jo10("NONE", 2);
        c = jo10Var3;
        d = new jo10[]{jo10Var, jo10Var2, jo10Var3};
    }

    public static jo10 valueOf(String str) {
        return (jo10) Enum.valueOf(jo10.class, str);
    }

    public static jo10[] values() {
        return (jo10[]) d.clone();
    }
}
