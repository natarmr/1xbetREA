package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class rhi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rhi0 f30492a;
    public static final rhi0 b;
    public static final /* synthetic */ rhi0[] c;
    public static final /* synthetic */ c0o d;

    static {
        rhi0 rhi0Var = new rhi0("MAIN", 0);
        f30492a = rhi0Var;
        rhi0 rhi0Var2 = new rhi0("STAGE", 1);
        b = rhi0Var2;
        rhi0[] rhi0VarArr = {rhi0Var, rhi0Var2};
        c = rhi0VarArr;
        d = new c0o(rhi0VarArr);
    }

    public static rhi0 valueOf(String str) {
        return (rhi0) Enum.valueOf(rhi0.class, str);
    }

    public static rhi0[] values() {
        return (rhi0[]) c.clone();
    }
}
