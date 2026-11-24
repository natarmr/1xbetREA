package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class y0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0m f41813a;
    public static final y0m b;
    public static final /* synthetic */ y0m[] c;

    static {
        y0m y0mVar = new y0m("LARGE", 0);
        f41813a = y0mVar;
        y0m y0mVar2 = new y0m("SMALL", 1);
        b = y0mVar2;
        c = new y0m[]{y0mVar, y0mVar2};
    }

    public static y0m valueOf(String str) {
        return (y0m) Enum.valueOf(y0m.class, str);
    }

    public static y0m[] values() {
        return (y0m[]) c.clone();
    }
}
