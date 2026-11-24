package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5m f277a;
    public static final /* synthetic */ a5m[] b;

    static {
        a5m a5mVar = new a5m("Numeric", 0);
        f277a = a5mVar;
        b = new a5m[]{a5mVar, new a5m("Percent", 1)};
    }

    public static a5m valueOf(String str) {
        return (a5m) Enum.valueOf(a5m.class, str);
    }

    public static a5m[] values() {
        return (a5m[]) b.clone();
    }
}
