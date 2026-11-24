package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class aoo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s9m0 f1212a;
    public static final aoo0 b;
    public static final aoo0 c;
    public static final aoo0 d;
    public static final /* synthetic */ aoo0[] e;

    static {
        aoo0 aoo0Var = new aoo0("COLOR_SELECTION_ICONS", 0);
        b = aoo0Var;
        aoo0 aoo0Var2 = new aoo0("BUBBLE_SELECTION_ICONS", 1);
        c = aoo0Var2;
        aoo0 aoo0Var3 = new aoo0("COLOR_SELECTION_TEXT", 2);
        d = aoo0Var3;
        e = new aoo0[]{aoo0Var, aoo0Var2, aoo0Var3};
        f1212a = new s9m0();
    }

    public static aoo0 valueOf(String str) {
        return (aoo0) Enum.valueOf(aoo0.class, str);
    }

    public static aoo0[] values() {
        return (aoo0[]) e.clone();
    }
}
