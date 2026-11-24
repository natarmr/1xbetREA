package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class le60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final le60 f19885a;
    public static final le60 b;
    public static final /* synthetic */ le60[] c;

    static {
        le60 le60Var = new le60("None", 0);
        f19885a = le60Var;
        le60 le60Var2 = new le60("Full", 1);
        b = le60Var2;
        c = new le60[]{le60Var, le60Var2};
    }

    public static le60 valueOf(String str) {
        return (le60) Enum.valueOf(le60.class, str);
    }

    public static le60[] values() {
        return (le60[]) c.clone();
    }
}
