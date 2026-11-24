package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ae60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ae60 f713a;
    public static final ae60 b;
    public static final ae60 c;
    public static final /* synthetic */ ae60[] d;

    static {
        ae60 ae60Var = new ae60("NO_OP", 0);
        f713a = ae60Var;
        ae60 ae60Var2 = new ae60("ADD", 1);
        b = ae60Var2;
        ae60 ae60Var3 = new ae60("REMOVE", 2);
        c = ae60Var3;
        d = new ae60[]{ae60Var, ae60Var2, ae60Var3};
    }

    public static ae60 valueOf(String str) {
        return (ae60) Enum.valueOf(ae60.class, str);
    }

    public static ae60[] values() {
        return (ae60[]) d.clone();
    }
}
