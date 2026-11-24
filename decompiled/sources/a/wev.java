package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wev f39038a;
    public static final wev b;
    public static final /* synthetic */ wev[] c;

    static {
        wev wevVar = new wev("NUMBER", 0);
        f39038a = wevVar;
        wev wevVar2 = new wev("PERCENT", 1);
        b = wevVar2;
        c = new wev[]{wevVar, wevVar2};
    }

    public static wev valueOf(String str) {
        return (wev) Enum.valueOf(wev.class, str);
    }

    public static wev[] values() {
        return (wev[]) c.clone();
    }
}
