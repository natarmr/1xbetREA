package a;

import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class zej {
    public static final zej c;
    public static final /* synthetic */ zej[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44255a;
    public final Set b;

    static {
        mdj mdjVar = mdj.f21599a;
        mdj mdjVar2 = mdj.b;
        zej zejVar = new zej("MONTH_YEAR", 0, "MMMM y", tx3.l0(new mdj[]{mdjVar, mdjVar2}));
        c = zejVar;
        d = new zej[]{zejVar, new zej("DAY_MONTH_YEAR", 1, "d MMMM y", tx3.l0(new mdj[]{mdjVar, mdjVar2, mdj.c}))};
    }

    public zej(String str, int i, String str2, Set set) {
        super(str, i);
        this.f44255a = str2;
        this.b = set;
    }

    public static zej valueOf(String str) {
        return (zej) Enum.valueOf(zej.class, str);
    }

    public static zej[] values() {
        return (zej[]) d.clone();
    }
}
