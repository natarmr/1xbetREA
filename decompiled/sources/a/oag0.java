package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class oag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ oag0[] f24927a;
    public static final /* synthetic */ c0o b;

    /* JADX INFO: Fake field, exist only in values array */
    oag0 EF5;

    static {
        oag0[] oag0VarArr = {new oag0("UNSPECIFIED", 0), new oag0("MUST_USE", 1), new oag0("EXPLICITLY_IGNORABLE", 2)};
        f24927a = oag0VarArr;
        b = new c0o(oag0VarArr);
    }

    public static oag0 valueOf(String str) {
        return (oag0) Enum.valueOf(oag0.class, str);
    }

    public static oag0[] values() {
        return (oag0[]) f24927a.clone();
    }
}
