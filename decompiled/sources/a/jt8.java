package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jt8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jt8 f17087a;
    public static final jt8 b;
    public static final /* synthetic */ jt8[] c;

    static {
        jt8 jt8Var = new jt8("UPPER", 0);
        f17087a = jt8Var;
        jt8 jt8Var2 = new jt8("BOTTOM", 1);
        b = jt8Var2;
        c = new jt8[]{jt8Var, jt8Var2};
    }

    public static jt8 valueOf(String str) {
        return (jt8) Enum.valueOf(jt8.class, str);
    }

    public static jt8[] values() {
        return (jt8[]) c.clone();
    }
}
