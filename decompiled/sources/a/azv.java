package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class azv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final azv f1740a;
    public static final azv b;
    public static final azv c;
    public static final azv d;
    public static final azv e;
    public static final azv f;
    public static final /* synthetic */ azv[] g;

    static {
        azv azvVar = new azv("ENG", 0);
        f1740a = azvVar;
        azv azvVar2 = new azv("US", 1);
        b = azvVar2;
        azv azvVar3 = new azv("HONG", 2);
        c = azvVar3;
        azv azvVar4 = new azv("IND", 3);
        d = azvVar4;
        azv azvVar5 = new azv("MAL", 4);
        e = azvVar5;
        azv azvVar6 = new azv("DEC", 5);
        f = azvVar6;
        g = new azv[]{azvVar, azvVar2, azvVar3, azvVar4, azvVar5, azvVar6};
    }

    public static azv valueOf(String str) {
        return (azv) Enum.valueOf(azv.class, str);
    }

    public static azv[] values() {
        return (azv[]) g.clone();
    }
}
