package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class gdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gdj f11106a;
    public static final gdj b;
    public static final /* synthetic */ gdj[] c;

    static {
        gdj gdjVar = new gdj("DAY_MONTH", 0);
        f11106a = gdjVar;
        gdj gdjVar2 = new gdj("MONTH_YEAR", 1);
        b = gdjVar2;
        c = new gdj[]{gdjVar, gdjVar2};
    }

    public static gdj valueOf(String str) {
        return (gdj) Enum.valueOf(gdj.class, str);
    }

    public static gdj[] values() {
        return (gdj[]) c.clone();
    }
}
