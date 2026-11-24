package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zd60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zd60 f44198a;
    public static final zd60 b;
    public static final zd60 c;
    public static final /* synthetic */ zd60[] d;

    static {
        zd60 zd60Var = new zd60("NO_OP", 0);
        f44198a = zd60Var;
        zd60 zd60Var2 = new zd60("ADD", 1);
        b = zd60Var2;
        zd60 zd60Var3 = new zd60("REMOVE", 2);
        c = zd60Var3;
        d = new zd60[]{zd60Var, zd60Var2, zd60Var3};
    }

    public static zd60 valueOf(String str) {
        return (zd60) Enum.valueOf(zd60.class, str);
    }

    public static zd60[] values() {
        return (zd60[]) d.clone();
    }
}
