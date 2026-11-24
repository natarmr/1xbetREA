package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zd70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zd70 f44200a;
    public static final zd70 b;
    public static final zd70 c;
    public static final /* synthetic */ zd70[] d;

    static {
        zd70 zd70Var = new zd70("X2_X5", 0);
        f44200a = zd70Var;
        zd70 zd70Var2 = new zd70("X5_X50", 1);
        b = zd70Var2;
        zd70 zd70Var3 = new zd70("X50", 2);
        c = zd70Var3;
        d = new zd70[]{zd70Var, zd70Var2, zd70Var3};
    }

    public static zd70 valueOf(String str) {
        return (zd70) Enum.valueOf(zd70.class, str);
    }

    public static zd70[] values() {
        return (zd70[]) d.clone();
    }
}
