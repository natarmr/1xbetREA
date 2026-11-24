package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gt40 f11864a;
    public static final gt40 b;
    public static final gt40 c;
    public static final /* synthetic */ gt40[] d;

    static {
        gt40 gt40Var = new gt40("CONTENT", 0);
        f11864a = gt40Var;
        gt40 gt40Var2 = new gt40("TITLE", 1);
        b = gt40Var2;
        gt40 gt40Var3 = new gt40("CHIPS", 2);
        c = gt40Var3;
        d = new gt40[]{gt40Var, gt40Var2, gt40Var3};
    }

    public static gt40 valueOf(String str) {
        return (gt40) Enum.valueOf(gt40.class, str);
    }

    public static gt40[] values() {
        return (gt40[]) d.clone();
    }
}
