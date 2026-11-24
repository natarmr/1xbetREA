package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'l' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class r0m {
    public static final r0m l;
    public static final r0m m;
    public static final r0m n;
    public static final r0m o;
    public static final r0m p;
    public static final r0m q;
    public static final r0m r;
    public static final /* synthetic */ r0m[] s;
    public static final /* synthetic */ c0o t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f29637a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final boolean g;
    public final int h;
    public final int i;
    public final Integer j;
    public final Integer k;

    static {
        Integer numValueOf = Integer.valueOf(R.drawable.rounded_full);
        Integer numValueOf2 = Integer.valueOf(R.attr.uikitPrimary);
        Integer numValueOf3 = Integer.valueOf(R.dimen.size_2);
        Integer numValueOf4 = Integer.valueOf(R.attr.uikitBackgroundContent);
        r0m r0mVar = new r0m("PRIMARY", 0, 99, R.style.TextStyle_Caption_Bold_S_PrimaryForeground, numValueOf, numValueOf2, numValueOf3, numValueOf4, true, R.dimen.size_18, R.dimen.size_18, null, null);
        l = r0mVar;
        r0m r0mVar2 = new r0m("RED", 1, 99, R.style.TextStyle_Caption_Bold_S_StaticWhite, numValueOf, Integer.valueOf(R.attr.uikitStaticRed), numValueOf3, numValueOf4, true, R.dimen.size_18, R.dimen.size_18, null, null);
        m = r0mVar2;
        r0m r0mVar3 = new r0m("WHITE", 2, 99, R.style.TextStyle_Caption_Bold_S_StaticBlack, Integer.valueOf(R.drawable.rounded_full_white_with_padding), Integer.valueOf(R.attr.uikitStaticWhite), null, null, true, R.dimen.size_18, R.dimen.size_18, null, null);
        Integer numValueOf5 = Integer.valueOf(R.dimen.size_1);
        Integer numValueOf6 = Integer.valueOf(R.attr.uikitSeparator60);
        Integer numValueOf7 = Integer.valueOf(R.dimen.space_6);
        r0m r0mVar4 = new r0m("STROKE", 3, 9999, R.style.TextStyle_Text_Regular_Secondary, numValueOf, null, numValueOf5, numValueOf6, false, R.dimen.size_24, R.dimen.size_24, numValueOf7, numValueOf7);
        Integer numValueOf8 = Integer.valueOf(R.attr.uikitBackgroundGroup);
        r0m r0mVar5 = new r0m("SECONDARY", 4, 9999, R.style.TextStyle_Text_Regular_Secondary, numValueOf, numValueOf8, null, null, false, R.dimen.size_24, R.dimen.size_24, numValueOf7, numValueOf7);
        n = r0mVar5;
        r0m r0mVar6 = new r0m("SECONDARY_ACCORDION", 5, 9999, R.style.TextStyle_Text_Regular_Secondary, numValueOf, numValueOf8, null, null, false, R.dimen.size_24, R.dimen.size_24, numValueOf7, Integer.valueOf(R.dimen.space_4));
        o = r0mVar6;
        r0m r0mVar7 = new r0m("ROUNDED", 6, 9999, R.style.TextStyle_Caption_Bold_S_PrimaryForeground, numValueOf, numValueOf2, numValueOf3, numValueOf4, false, R.dimen.size_20, R.dimen.size_20, numValueOf7, numValueOf7);
        p = r0mVar7;
        r0m r0mVar8 = new r0m("RED_CARD", 7, 9, R.style.TextStyle_Caption_Medium_M_StaticWhite, Integer.valueOf(R.drawable.ic_game_red_card), numValueOf2, null, null, true, R.dimen.size_16, R.dimen.size_16, null, null);
        q = r0mVar8;
        r0m r0mVar9 = new r0m("CLEAR", 8, 9999, R.style.TextStyle_Headline_Regular_Secondary, Integer.valueOf(R.drawable.circle_background_with_padding), numValueOf2, null, null, false, R.dimen.size_24, R.dimen.size_8, null, null);
        r = r0mVar9;
        r0m[] r0mVarArr = {r0mVar, r0mVar2, r0mVar3, r0mVar4, r0mVar5, r0mVar6, r0mVar7, r0mVar8, r0mVar9};
        s = r0mVarArr;
        t = new c0o(r0mVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r0m(String str, int i, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i4, int i5, Integer num5, Integer num6) {
        super(str, i);
        this.f29637a = i2;
        this.b = i3;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
        this.g = z;
        this.h = i4;
        this.i = i5;
        this.j = num5;
        this.k = num6;
    }

    public static r0m valueOf(String str) {
        return (r0m) Enum.valueOf(r0m.class, str);
    }

    public static r0m[] values() {
        return (r0m[]) s.clone();
    }
}
