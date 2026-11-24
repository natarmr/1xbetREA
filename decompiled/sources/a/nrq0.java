package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nrq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nrq0 f24017a;
    public static final nrq0 b;
    public static final /* synthetic */ nrq0[] c;

    static {
        nrq0 nrq0Var = new nrq0("START", 0);
        f24017a = nrq0Var;
        nrq0 nrq0Var2 = new nrq0("CENTER", 1);
        b = nrq0Var2;
        c = new nrq0[]{nrq0Var, nrq0Var2};
    }

    public static nrq0 valueOf(String str) {
        return (nrq0) Enum.valueOf(nrq0.class, str);
    }

    public static nrq0[] values() {
        return (nrq0[]) c.clone();
    }
}
