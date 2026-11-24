package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hnh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hnh0 f13353a;
    public static final hnh0 b;
    public static final hnh0 c;
    public static final /* synthetic */ hnh0[] d;

    static {
        hnh0 hnh0Var = new hnh0("CONFERENCE", 0);
        f13353a = hnh0Var;
        hnh0 hnh0Var2 = new hnh0("DIVISION", 1);
        b = hnh0Var2;
        hnh0 hnh0Var3 = new hnh0("NONE", 2);
        c = hnh0Var3;
        d = new hnh0[]{hnh0Var, hnh0Var2, hnh0Var3};
    }

    public static hnh0 valueOf(String str) {
        return (hnh0) Enum.valueOf(hnh0.class, str);
    }

    public static hnh0[] values() {
        return (hnh0[]) d.clone();
    }
}
