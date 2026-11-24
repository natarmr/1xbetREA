package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zwr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zwr0 f45122a;
    public static final zwr0 b;
    public static final zwr0 c;
    public static final /* synthetic */ zwr0[] d;

    static {
        zwr0 zwr0Var = new zwr0("SELECTED", 0);
        f45122a = zwr0Var;
        zwr0 zwr0Var2 = new zwr0("ACTIVE", 1);
        b = zwr0Var2;
        zwr0 zwr0Var3 = new zwr0("NOT_SELECTED", 2);
        c = zwr0Var3;
        d = new zwr0[]{zwr0Var, zwr0Var2, zwr0Var3};
    }

    public static zwr0 valueOf(String str) {
        return (zwr0) Enum.valueOf(zwr0.class, str);
    }

    public static zwr0[] values() {
        return (zwr0[]) d.clone();
    }
}
