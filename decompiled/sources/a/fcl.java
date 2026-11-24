package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fcl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pek f9318a;
    public static final fcl b;
    public static final fcl c;
    public static final fcl d;
    public static final fcl e;
    public static final /* synthetic */ fcl[] f;

    static {
        fcl fclVar = new fcl("THICK_LINE", 0);
        b = fclVar;
        fcl fclVar2 = new fcl("THICK_LINE_WITH_ICON", 1);
        c = fclVar2;
        fcl fclVar3 = new fcl("THIN_LINE", 2);
        d = fclVar3;
        fcl fclVar4 = new fcl("CIRCLE", 3);
        e = fclVar4;
        f = new fcl[]{fclVar, fclVar2, fclVar3, fclVar4};
        f9318a = new pek();
    }

    public static fcl valueOf(String str) {
        return (fcl) Enum.valueOf(fcl.class, str);
    }

    public static fcl[] values() {
        return (fcl[]) f.clone();
    }
}
