package a;

import org.xplatform.uikit.compose.color.StaticColors;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class bbc {
    public static final bbc c;
    public static final bbc d;
    public static final bbc e;
    public static final bbc f;
    public static final bbc g;
    public static final bbc h;
    public static final bbc i;
    public static final /* synthetic */ bbc[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2301a;
    public final long b;

    static {
        pz40 pz40Var = s6t0.f31722a;
        bbc bbcVar = new bbc("Primary", s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getSecondary(), 0);
        c = bbcVar;
        bbc bbcVar2 = new bbc("PrimaryActionLeft", s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary(), 1);
        d = bbcVar2;
        bbc bbcVar3 = new bbc("Secondary", s6t0.b().f33626a.getPrimaryForeground(), s6t0.b().f33626a.getSecondary(), 2);
        e = bbcVar3;
        bbc bbcVar4 = new bbc("SecondaryActionLeft", s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary(), 3);
        f = bbcVar4;
        bbc bbcVar5 = new bbc("Tertiary", s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary(), 4);
        g = bbcVar5;
        long primaryForeground = s6t0.b().f33626a.getPrimaryForeground();
        StaticColors staticColors = StaticColors.INSTANCE;
        bbc bbcVar6 = new bbc("Overlay", primaryForeground, staticColors.m130getWhite600d7_KjU(), 5);
        h = bbcVar6;
        bbc bbcVar7 = new bbc("OverlayActionLeft", staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU(), 6);
        i = bbcVar7;
        j = new bbc[]{bbcVar, bbcVar2, bbcVar3, bbcVar4, bbcVar5, bbcVar6, bbcVar7};
    }

    public bbc(String str, long j2, long j3, int i2) {
        super(str, i2);
        this.f2301a = j2;
        this.b = j3;
    }

    public static bbc valueOf(String str) {
        return (bbc) Enum.valueOf(bbc.class, str);
    }

    public static bbc[] values() {
        return (bbc[]) j.clone();
    }
}
