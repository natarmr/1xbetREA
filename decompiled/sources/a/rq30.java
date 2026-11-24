package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class rq30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rq30 f30912a;
    public static final rq30 b;
    public static final /* synthetic */ rq30[] c;

    static {
        rq30 rq30Var = new rq30("DECLARED", 0);
        f30912a = rq30Var;
        rq30 rq30Var2 = new rq30("INHERITED", 1);
        b = rq30Var2;
        c = new rq30[]{rq30Var, rq30Var2};
    }

    public static rq30 valueOf(String str) {
        return (rq30) Enum.valueOf(rq30.class, str);
    }

    public static rq30[] values() {
        return (rq30[]) c.clone();
    }
}
