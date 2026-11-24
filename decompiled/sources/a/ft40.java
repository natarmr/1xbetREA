package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ft40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ft40 f10093a;
    public static final ft40 b;
    public static final ft40 c;
    public static final /* synthetic */ ft40[] d;

    static {
        ft40 ft40Var = new ft40("NAVIGATION_BAR", 0);
        f10093a = ft40Var;
        ft40 ft40Var2 = new ft40("BACKGROUND", 1);
        b = ft40Var2;
        ft40 ft40Var3 = new ft40("TOP_INFO", 2);
        c = ft40Var3;
        d = new ft40[]{ft40Var, ft40Var2, ft40Var3};
    }

    public static ft40 valueOf(String str) {
        return (ft40) Enum.valueOf(ft40.class, str);
    }

    public static ft40[] values() {
        return (ft40[]) d.clone();
    }
}
