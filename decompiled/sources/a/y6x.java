package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6x f42121a;
    public static final y6x b;
    public static final y6x c;
    public static final /* synthetic */ y6x[] d;

    static {
        y6x y6xVar = new y6x("Yes", 0);
        f42121a = y6xVar;
        y6x y6xVar2 = new y6x("No", 1);
        b = y6xVar2;
        y6x y6xVar3 = new y6x("NotInitialized", 2);
        c = y6xVar3;
        d = new y6x[]{y6xVar, y6xVar2, y6xVar3};
    }

    public static y6x valueOf(String str) {
        return (y6x) Enum.valueOf(y6x.class, str);
    }

    public static y6x[] values() {
        return (y6x[]) d.clone();
    }
}
