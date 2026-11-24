package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wx40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wx40 f39914a;
    public static final wx40 b;
    public static final /* synthetic */ wx40[] c;

    static {
        wx40 wx40Var = new wx40("READ_ONLY", 0);
        f39914a = wx40Var;
        wx40 wx40Var2 = new wx40("MUTABLE", 1);
        b = wx40Var2;
        c = new wx40[]{wx40Var, wx40Var2};
    }

    public static wx40 valueOf(String str) {
        return (wx40) Enum.valueOf(wx40.class, str);
    }

    public static wx40[] values() {
        return (wx40[]) c.clone();
    }
}
