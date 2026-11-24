package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xde f40689a;
    public static final xde b;
    public static final /* synthetic */ xde[] c;

    static {
        xde xdeVar = new xde("VIEW_APPEAR", 0);
        f40689a = xdeVar;
        xde xdeVar2 = new xde("VIEW_DISAPPEAR", 1);
        b = xdeVar2;
        c = new xde[]{xdeVar, xdeVar2};
    }

    public static xde valueOf(String str) {
        return (xde) Enum.valueOf(xde.class, str);
    }

    public static xde[] values() {
        return (xde[]) c.clone();
    }
}
