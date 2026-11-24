package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xqo f41331a;
    public static final xqo b;
    public static final /* synthetic */ xqo[] c;

    static {
        xqo xqoVar = new xqo("LINE", 0);
        f41331a = xqoVar;
        xqo xqoVar2 = new xqo("LIVE", 1);
        b = xqoVar2;
        c = new xqo[]{xqoVar, xqoVar2};
    }

    public static xqo valueOf(String str) {
        return (xqo) Enum.valueOf(xqo.class, str);
    }

    public static xqo[] values() {
        return (xqo[]) c.clone();
    }
}
