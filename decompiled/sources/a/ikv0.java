package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ikv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ikv0 f14948a;
    public static final ikv0 b;
    public static final ikv0 c;
    public static final /* synthetic */ ikv0[] d;

    static {
        ikv0 ikv0Var = new ikv0("WIN", 0);
        f14948a = ikv0Var;
        ikv0 ikv0Var2 = new ikv0("LOSE", 1);
        b = ikv0Var2;
        ikv0 ikv0Var3 = new ikv0("DRAW", 2);
        c = ikv0Var3;
        d = new ikv0[]{ikv0Var, ikv0Var2, ikv0Var3};
    }

    public static ikv0 valueOf(String str) {
        return (ikv0) Enum.valueOf(ikv0.class, str);
    }

    public static ikv0[] values() {
        return (ikv0[]) d.clone();
    }
}
