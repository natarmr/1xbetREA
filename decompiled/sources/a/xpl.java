package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xpl f41275a;
    public static final xpl b;
    public static final xpl c;
    public static final /* synthetic */ xpl[] d;

    static {
        xpl xplVar = new xpl("PREPARE", 0);
        f41275a = xplVar;
        xpl xplVar2 = new xpl("ACTIVE", 1);
        b = xplVar2;
        xpl xplVar3 = new xpl("ENDED", 2);
        c = xplVar3;
        d = new xpl[]{xplVar, xplVar2, xplVar3};
    }

    public static xpl valueOf(String str) {
        return (xpl) Enum.valueOf(xpl.class, str);
    }

    public static xpl[] values() {
        return (xpl[]) d.clone();
    }
}
