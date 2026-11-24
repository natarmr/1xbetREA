package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rc10 implements jvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rc10 f30217a;
    public static final rc10 b;
    public static final rc10 c;
    public static final /* synthetic */ rc10[] d;
    public static final /* synthetic */ c0o e;

    static {
        rc10 rc10Var = new rc10("ACCEPTED", 0);
        f30217a = rc10Var;
        rc10 rc10Var2 = new rc10("PAYOUT", 1);
        b = rc10Var2;
        rc10 rc10Var3 = new rc10("REFUND", 2);
        c = rc10Var3;
        rc10[] rc10VarArr = {rc10Var, rc10Var2, rc10Var3};
        d = rc10VarArr;
        e = new c0o(rc10VarArr);
    }

    public static rc10 valueOf(String str) {
        return (rc10) Enum.valueOf(rc10.class, str);
    }

    public static rc10[] values() {
        return (rc10[]) d.clone();
    }
}
