package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zw4 implements jvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zw4 f45089a;
    public static final zw4 b;
    public static final zw4 c;
    public static final /* synthetic */ zw4[] d;
    public static final /* synthetic */ c0o e;

    static {
        zw4 zw4Var = new zw4("WAITING", 0);
        f45089a = zw4Var;
        zw4 zw4Var2 = new zw4("ACTIVATED", 1);
        b = zw4Var2;
        zw4 zw4Var3 = new zw4("CANCELED", 2);
        c = zw4Var3;
        zw4[] zw4VarArr = {zw4Var, zw4Var2, zw4Var3};
        d = zw4VarArr;
        e = new c0o(zw4VarArr);
    }

    public static zw4 valueOf(String str) {
        return (zw4) Enum.valueOf(zw4.class, str);
    }

    public static zw4[] values() {
        return (zw4[]) d.clone();
    }
}
