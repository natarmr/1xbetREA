package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public class ixk0 {
    public static final ixk0 b;
    public static final ixk0 c;
    public static final ixk0 d;
    public static final hxk0 e;
    public static final /* synthetic */ ixk0[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15546a;

    static {
        ixk0 ixk0Var = new ixk0("NULL", 0, null);
        b = ixk0Var;
        ixk0 ixk0Var2 = new ixk0("INDEX", 1, -1);
        c = ixk0Var2;
        ixk0 ixk0Var3 = new ixk0("FALSE", 2, Boolean.FALSE);
        d = ixk0Var3;
        hxk0 hxk0Var = new hxk0("MAP_GET_OR_DEFAULT", 3, null);
        e = hxk0Var;
        f = new ixk0[]{ixk0Var, ixk0Var2, ixk0Var3, hxk0Var};
    }

    public ixk0(String str, int i, Object obj) {
        super(str, i);
        this.f15546a = obj;
    }

    public static ixk0 valueOf(String str) {
        return (ixk0) Enum.valueOf(ixk0.class, str);
    }

    public static ixk0[] values() {
        return (ixk0[]) f.clone();
    }
}
