package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xyl f41710a;
    public static final xyl b;
    public static final /* synthetic */ xyl[] c;

    static {
        xyl xylVar = new xyl("HORIZONTAL", 0);
        f41710a = xylVar;
        xyl xylVar2 = new xyl("VERTICAL", 1);
        b = xylVar2;
        c = new xyl[]{xylVar, xylVar2};
    }

    public static xyl valueOf(String str) {
        return (xyl) Enum.valueOf(xyl.class, str);
    }

    public static xyl[] values() {
        return (xyl[]) c.clone();
    }
}
