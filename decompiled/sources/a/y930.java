package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class y930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y930 f42225a;
    public static final y930 b;
    public static final y930 c;
    public static final /* synthetic */ y930[] d;

    static {
        y930 y930Var = new y930("COMPRESSED", 0);
        f42225a = y930Var;
        y930 y930Var2 = new y930("NORMAL", 1);
        b = y930Var2;
        y930 y930Var3 = new y930("EXPANDED", 2);
        c = y930Var3;
        d = new y930[]{y930Var, y930Var2, y930Var3};
    }

    public static y930 valueOf(String str) {
        return (y930) Enum.valueOf(y930.class, str);
    }

    public static y930[] values() {
        return (y930[]) d.clone();
    }
}
