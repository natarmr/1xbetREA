package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jcc0 f16269a;
    public static final jcc0 b;
    public static final jcc0 c;
    public static final /* synthetic */ jcc0[] d;

    static {
        jcc0 jcc0Var = new jcc0("AVAILABLE", 0);
        f16269a = jcc0Var;
        jcc0 jcc0Var2 = new jcc0("NOT_AVAILABLE", 1);
        b = jcc0Var2;
        jcc0 jcc0Var3 = new jcc0("UNDEFINED", 2);
        c = jcc0Var3;
        d = new jcc0[]{jcc0Var, jcc0Var2, jcc0Var3};
    }

    public static jcc0 valueOf(String str) {
        return (jcc0) Enum.valueOf(jcc0.class, str);
    }

    public static jcc0[] values() {
        return (jcc0[]) d.clone();
    }
}
