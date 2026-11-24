package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xim f40952a;
    public static final xim b;
    public static final xim c;
    public static final xim d;
    public static final /* synthetic */ xim[] e;

    static {
        xim ximVar = new xim("Circle", 0);
        f40952a = ximVar;
        xim ximVar2 = new xim("SquareS", 1);
        b = ximVar2;
        xim ximVar3 = new xim("SquareL", 2);
        c = ximVar3;
        xim ximVar4 = new xim("Rectangle", 3);
        d = ximVar4;
        e = new xim[]{ximVar, ximVar2, ximVar3, ximVar4};
    }

    public static xim valueOf(String str) {
        return (xim) Enum.valueOf(xim.class, str);
    }

    public static xim[] values() {
        return (xim[]) e.clone();
    }
}
