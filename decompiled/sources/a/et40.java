package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class et40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final et40 f8360a;
    public static final et40 b;
    public static final et40 c;
    public static final /* synthetic */ et40[] d;

    static {
        et40 et40Var = new et40("CONTENT", 0);
        f8360a = et40Var;
        et40 et40Var2 = new et40("TITLE", 1);
        b = et40Var2;
        et40 et40Var3 = new et40("CHIPS", 2);
        c = et40Var3;
        d = new et40[]{et40Var, et40Var2, et40Var3};
    }

    public static et40 valueOf(String str) {
        return (et40) Enum.valueOf(et40.class, str);
    }

    public static et40[] values() {
        return (et40[]) d.clone();
    }
}
