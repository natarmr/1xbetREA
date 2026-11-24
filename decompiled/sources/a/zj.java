package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zj f44462a;
    public static final zj b;
    public static final /* synthetic */ zj[] c;

    static {
        zj zjVar = new zj("Pass", 0);
        f44462a = zjVar;
        zj zjVar2 = new zj("Bet", 1);
        b = zjVar2;
        c = new zj[]{zjVar, zjVar2};
    }

    public static zj valueOf(String str) {
        return (zj) Enum.valueOf(zj.class, str);
    }

    public static zj[] values() {
        return (zj[]) c.clone();
    }
}
