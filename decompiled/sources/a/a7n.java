package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a7n f379a;
    public static final /* synthetic */ a7n[] b;

    static {
        a7n a7nVar = new a7n("Unspecified", 0);
        f379a = a7nVar;
        b = new a7n[]{a7nVar, new a7n("Content", 1), new a7n("Ltr", 2), new a7n("Rtl", 3), new a7n("ContentOrLtr", 4), new a7n("ContentOrRtl", 5), new a7n("Layout", 6)};
    }

    public static a7n valueOf(String str) {
        return (a7n) Enum.valueOf(a7n.class, str);
    }

    public static a7n[] values() {
        return (a7n[]) b.clone();
    }

    public final int a(k6z k6zVar) {
        k6zVar.getClass();
        switch (ordinal()) {
            case 0:
                return 0;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                int iOrdinal = k6zVar.ordinal();
                if (iOrdinal == 0) {
                    return 1;
                }
                if (iOrdinal == 1) {
                    return 2;
                }
                t9f.b();
                return 0;
            default:
                t9f.b();
                return 0;
        }
    }
}
