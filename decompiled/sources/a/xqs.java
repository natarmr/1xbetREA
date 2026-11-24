package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class xqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xqs f41338a;
    public static final xqs b;
    public static final /* synthetic */ xqs[] c;

    static {
        xqs xqsVar = new xqs("INFORMATION", 0);
        f41338a = xqsVar;
        xqs xqsVar2 = new xqs("BROADCASTING", 1);
        b = xqsVar2;
        c = new xqs[]{xqsVar, xqsVar2};
    }

    public static xqs valueOf(String str) {
        return (xqs) Enum.valueOf(xqs.class, str);
    }

    public static xqs[] values() {
        return (xqs[]) c.clone();
    }
}
