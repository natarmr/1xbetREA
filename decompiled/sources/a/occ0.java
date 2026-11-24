package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class occ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final occ0 f25021a;
    public static final occ0 b;
    public static final occ0 c;
    public static final /* synthetic */ occ0[] d;

    static {
        occ0 occ0Var = new occ0("LEGACY", 0);
        f25021a = occ0Var;
        occ0 occ0Var2 = new occ0("LOTTERY", 1);
        b = occ0Var2;
        occ0 occ0Var3 = new occ0("UNDEFINED", 2);
        c = occ0Var3;
        d = new occ0[]{occ0Var, occ0Var2, occ0Var3};
    }

    public static occ0 valueOf(String str) {
        return (occ0) Enum.valueOf(occ0.class, str);
    }

    public static occ0[] values() {
        return (occ0[]) d.clone();
    }
}
