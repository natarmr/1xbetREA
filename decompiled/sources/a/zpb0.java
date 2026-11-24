package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zpb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zpb0 f44753a;
    public static final zpb0 b;
    public static final /* synthetic */ zpb0[] c;

    static {
        zpb0 zpb0Var = new zpb0("START", 0);
        f44753a = zpb0Var;
        zpb0 zpb0Var2 = new zpb0("CENTER", 1);
        b = zpb0Var2;
        c = new zpb0[]{zpb0Var, zpb0Var2};
    }

    public static zpb0 valueOf(String str) {
        return (zpb0) Enum.valueOf(zpb0.class, str);
    }

    public static zpb0[] values() {
        return (zpb0[]) c.clone();
    }
}
