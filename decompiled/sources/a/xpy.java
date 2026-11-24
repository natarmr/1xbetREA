package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xpy f41288a;
    public static final xpy b;
    public static final xpy c;
    public static final xpy d;
    public static final /* synthetic */ xpy[] e;

    static {
        xpy xpyVar = new xpy("RETURNS_CONSTANT", 0);
        f41288a = xpyVar;
        xpy xpyVar2 = new xpy("CALLS", 1);
        b = xpyVar2;
        xpy xpyVar3 = new xpy("RETURNS_NOT_NULL", 2);
        c = xpyVar3;
        xpy xpyVar4 = new xpy("RETURNS_RESULT_OF", 3);
        d = xpyVar4;
        e = new xpy[]{xpyVar, xpyVar2, xpyVar3, xpyVar4};
    }

    public static xpy valueOf(String str) {
        return (xpy) Enum.valueOf(xpy.class, str);
    }

    public static xpy[] values() {
        return (xpy[]) e.clone();
    }
}
