package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class uyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uyl f36494a;
    public static final uyl b;
    public static final /* synthetic */ uyl[] c;

    static {
        uyl uylVar = new uyl("SINGLE", 0);
        f36494a = uylVar;
        uyl uylVar2 = new uyl("MULTI", 1);
        uyl uylVar3 = new uyl("BUTTON", 2);
        b = uylVar3;
        c = new uyl[]{uylVar, uylVar2, uylVar3};
    }

    public static uyl valueOf(String str) {
        return (uyl) Enum.valueOf(uyl.class, str);
    }

    public static uyl[] values() {
        return (uyl[]) c.clone();
    }
}
