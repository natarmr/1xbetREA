package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gtg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gtg0 f11879a;
    public static final gtg0 b;
    public static final gtg0 c;
    public static final /* synthetic */ gtg0[] d;

    static {
        gtg0 gtg0Var = new gtg0("NON_ACTIVE", 0);
        f11879a = gtg0Var;
        gtg0 gtg0Var2 = new gtg0("OPENING", 1);
        b = gtg0Var2;
        gtg0 gtg0Var3 = new gtg0("OPEN", 2);
        c = gtg0Var3;
        d = new gtg0[]{gtg0Var, gtg0Var2, gtg0Var3, new gtg0("CLOSED", 3)};
    }

    public static gtg0 valueOf(String str) {
        return (gtg0) Enum.valueOf(gtg0.class, str);
    }

    public static gtg0[] values() {
        return (gtg0[]) d.clone();
    }
}
