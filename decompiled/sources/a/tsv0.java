package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tsv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tsv0 f34482a;
    public static final tsv0 b;
    public static final tsv0 c;
    public static final tsv0 d;
    public static final /* synthetic */ tsv0[] e;

    static {
        tsv0 tsv0Var = new tsv0("Bottom", 0);
        f34482a = tsv0Var;
        tsv0 tsv0Var2 = new tsv0("Middle", 1);
        b = tsv0Var2;
        tsv0 tsv0Var3 = new tsv0("Top", 2);
        c = tsv0Var3;
        tsv0 tsv0Var4 = new tsv0("DragHandle", 3);
        d = tsv0Var4;
        e = new tsv0[]{tsv0Var, tsv0Var2, tsv0Var3, tsv0Var4};
    }

    public static tsv0 valueOf(String str) {
        return (tsv0) Enum.valueOf(tsv0.class, str);
    }

    public static tsv0[] values() {
        return (tsv0[]) e.clone();
    }
}
