package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class uwl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uwl f36398a;
    public static final uwl b;
    public static final /* synthetic */ uwl[] c;
    public static final /* synthetic */ c0o d;

    static {
        uwl uwlVar = new uwl("SHIMMER", 0);
        f36398a = uwlVar;
        uwl uwlVar2 = new uwl("DEFAULT_ITEM", 1);
        b = uwlVar2;
        uwl[] uwlVarArr = {uwlVar, uwlVar2};
        c = uwlVarArr;
        d = new c0o(uwlVarArr);
    }

    public static uwl valueOf(String str) {
        return (uwl) Enum.valueOf(uwl.class, str);
    }

    public static uwl[] values() {
        return (uwl[]) c.clone();
    }
}
