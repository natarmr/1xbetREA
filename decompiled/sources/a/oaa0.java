package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class oaa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oaa0 f24920a;
    public static final oaa0 b;
    public static final /* synthetic */ oaa0[] c;

    static {
        oaa0 oaa0Var = new oaa0("PLAYER", 0);
        f24920a = oaa0Var;
        oaa0 oaa0Var2 = new oaa0("REFEREE", 1);
        b = oaa0Var2;
        c = new oaa0[]{oaa0Var, oaa0Var2};
    }

    public static oaa0 valueOf(String str) {
        return (oaa0) Enum.valueOf(oaa0.class, str);
    }

    public static oaa0[] values() {
        return (oaa0[]) c.clone();
    }
}
