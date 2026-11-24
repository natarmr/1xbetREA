package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class mdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mdj f21599a;
    public static final mdj b;
    public static final mdj c;
    public static final /* synthetic */ mdj[] d;

    static {
        mdj mdjVar = new mdj("YEAR", 0);
        f21599a = mdjVar;
        mdj mdjVar2 = new mdj("MONTH", 1);
        b = mdjVar2;
        mdj mdjVar3 = new mdj("DAY", 2);
        c = mdjVar3;
        d = new mdj[]{mdjVar, mdjVar2, mdjVar3};
    }

    public static mdj valueOf(String str) {
        return (mdj) Enum.valueOf(mdj.class, str);
    }

    public static mdj[] values() {
        return (mdj[]) d.clone();
    }
}
