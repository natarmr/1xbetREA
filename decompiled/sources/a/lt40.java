package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lt40 f20613a;
    public static final lt40 b;
    public static final lt40 c;
    public static final /* synthetic */ lt40[] d;

    static {
        lt40 lt40Var = new lt40("CONTENT", 0);
        f20613a = lt40Var;
        lt40 lt40Var2 = new lt40("TITLE", 1);
        b = lt40Var2;
        lt40 lt40Var3 = new lt40("CHIPS", 2);
        c = lt40Var3;
        d = new lt40[]{lt40Var, lt40Var2, lt40Var3};
    }

    public static lt40 valueOf(String str) {
        return (lt40) Enum.valueOf(lt40.class, str);
    }

    public static lt40[] values() {
        return (lt40[]) d.clone();
    }
}
