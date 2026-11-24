package a;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class vp7 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37792a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ wdr g;

    public vp7(List list, aq7 aq7Var, Context context, boolean z, mm40 mm40Var, Function1 function1) {
        this.b = list;
        this.d = aq7Var;
        this.e = context;
        this.c = z;
        this.f = mm40Var;
        this.g = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String string;
        u3i z3iVar;
        Object q4nVar;
        Object gjl0Var;
        String string2;
        String str;
        v5l0 v5l0Var;
        ynm xnmVar;
        bjl0 ajl0Var;
        String string3;
        String string4;
        int i2;
        byte b = this.f37792a;
        Object obj5 = this.e;
        boolean z = this.c;
        wdr wdrVar = this.g;
        Object obj6 = this.f;
        List list = this.b;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) wdrVar;
                aq7 aq7Var = (aq7) obj7;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    g1k0 g1k0Var = (g1k0) list.get(iIntValue);
                    fetVar.e0(591949236);
                    j1k0 j1k0Var = g1k0Var.f10517a;
                    long j = j1k0Var.l;
                    boolean z2 = j != 0;
                    v5l0 v5l0Var2 = aq7Var.g;
                    Context context = (Context) obj5;
                    String str2 = g1k0Var.d;
                    long j2 = j1k0Var.k;
                    long j3 = j1k0Var.p;
                    boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
                    long j4 = j1k0Var.j;
                    boolean zH = fetVar.h(zIs24HourFormat) | fetVar.f(j4);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zH || objP == cl5Var) {
                        rdj rdjVar = rdj.f30294a;
                        objP = rdj.g(new znq0(j4), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56);
                        fetVar.o0(objP);
                    }
                    String str3 = (String) objP;
                    boolean z3 = g1k0Var.b;
                    boolean z4 = g1k0Var.c;
                    String str4 = j1k0Var.h;
                    boolean z5 = z2;
                    if (j3 != 0) {
                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j3, ".svg", bzuVarD);
                        string = ((StringBuilder) bzuVarD.b).toString();
                    } else {
                        string = "";
                    }
                    c4i c4iVar = new c4i(str4, false, new n0x(string), new m0x(R.drawable.sport_new, null, 6), new y3d(qcc.S(R.attr.uikitSecondary80, fetVar)), 34);
                    if (!z4 || j1k0Var.n) {
                        z3iVar = a4i.f224a;
                    } else {
                        z3iVar = new z3i(z3 ? gtj.f11884a : gtj.b);
                    }
                    int iOrdinal = v5l0Var2.ordinal();
                    if (iOrdinal == 1) {
                        q4nVar = new q4n(c4iVar, z3iVar);
                    } else if (iOrdinal == 2) {
                        q4nVar = new p4n(c4iVar, z3iVar);
                    } else if (iOrdinal != 3) {
                        q4nVar = iOrdinal != 4 ? new m4n(c4iVar, z3iVar) : new n4n(c4iVar, z3iVar);
                    } else {
                        q4nVar = new o4n(c4iVar, str3, z3iVar);
                    }
                    j1k0 j1k0Var2 = g1k0Var.f10517a;
                    String str5 = j1k0Var2.f15740a;
                    long j5 = j1k0Var2.k;
                    Object obj8 = q4nVar;
                    hjl0 hjl0Var = new hjl0(new c280(vsm0.s(j1k0Var2.c, j1k0Var2.b), R.drawable.ic_glyph_placeholder_player), str5);
                    String str6 = j1k0Var2.d;
                    hjl0 hjl0Var2 = new hjl0(new c280(vsm0.s(j1k0Var2.f, j1k0Var2.e), R.drawable.ic_glyph_placeholder_player), str6);
                    boolean zIs24HourFormat2 = DateFormat.is24HourFormat(context);
                    long j6 = j1k0Var2.j;
                    boolean zH2 = fetVar.h(zIs24HourFormat2) | fetVar.f(j6);
                    Object objP2 = fetVar.P();
                    if (zH2 || objP2 == cl5Var) {
                        rdj rdjVar2 = rdj.f30294a;
                        objP2 = rdj.g(new znq0(j6), efj.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(context)), false, 56);
                        fetVar.o0(objP2);
                    }
                    String str7 = (String) objP2;
                    boolean zH3 = fetVar.h(zIs24HourFormat2) | fetVar.f(j5) | fetVar.h(z);
                    Object objP3 = fetVar.P();
                    if (zH3 || objP3 == cl5Var) {
                        if (z) {
                            objP3 = "";
                        } else {
                            rdj rdjVar3 = rdj.f30294a;
                            objP3 = rdj.g(new znq0(j5), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat2), false, 56);
                        }
                        fetVar.o0(objP3);
                    }
                    String str8 = (String) objP3;
                    int iOrdinal2 = v5l0Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        gjl0Var = new gjl0(str7, j1k0Var2.f15740a, str6);
                    } else if (iOrdinal2 == 2) {
                        gjl0Var = new fjl0(hjl0Var, hjl0Var2, str7);
                    } else if (iOrdinal2 == 3) {
                        gjl0Var = new ejl0(hjl0Var, hjl0Var2);
                    } else if (iOrdinal2 != 4) {
                        if (z) {
                            string4 = "";
                        } else {
                            string4 = context.getString(R.string.start_bet_time_v2, str8);
                            string4.getClass();
                        }
                        gjl0Var = new cjl0(hjl0Var, hjl0Var2, dyb.r0(q3d.j(str7, string4)));
                    } else {
                        gjl0Var = new djl0(hjl0Var, hjl0Var2, str7);
                    }
                    boolean zIs24HourFormat3 = DateFormat.is24HourFormat(context);
                    double d = j1k0Var.q;
                    boolean zH4 = fetVar.h(zIs24HourFormat3) | fetVar.f(j2) | fetVar.h(z);
                    Object objP4 = fetVar.P();
                    if (zH4 || objP4 == cl5Var) {
                        if (z) {
                            objP4 = "";
                        } else {
                            rdj rdjVar4 = rdj.f30294a;
                            objP4 = rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat3), false, 56);
                        }
                        fetVar.o0(objP4);
                    }
                    String str9 = (String) objP4;
                    if (z) {
                        string2 = "";
                    } else {
                        string2 = context.getString(R.string.start_bet_time_v2, str9);
                        string2.getClass();
                    }
                    String string5 = d == 0.0d ? context.getString(R.string.max_refund_sum) : context.getString(R.string.bonus_amount_title);
                    string5.getClass();
                    String string6 = d == 0.0d ? context.getString(R.string.placeholder_variant_3, String.valueOf(j1k0Var.o), str2) : context.getString(R.string.placeholder_variant_3, String.valueOf(d), str2);
                    string6.getClass();
                    if (z) {
                        str = "";
                        xnmVar = new vnm(str, str);
                        v5l0Var = v5l0Var2;
                    } else {
                        str = "";
                        v5l0Var = v5l0Var2;
                        if (v5l0Var == v5l0.LARGE_CARD_LARGE_SPORT_ICON) {
                            xnmVar = new vnm(string6, string5);
                        } else {
                            xnmVar = (v5l0Var == v5l0.LARGE_CARD_WATERMARK || v5l0Var == v5l0.LARGE_CARD_LARGE_TEAM_LOGO) ? new xnm(string6, string5, string2) : new wnm(string6, string5, string2);
                        }
                    }
                    int iOrdinal3 = v5l0Var.ordinal();
                    if (iOrdinal3 == 1) {
                        ajl0Var = new ajl0(j, (q4n) obj8, (gjl0) gjl0Var, xnmVar);
                    } else if (iOrdinal3 == 2) {
                        ajl0Var = new zil0(j, (p4n) obj8, (fjl0) gjl0Var, xnmVar);
                    } else if (iOrdinal3 != 3) {
                        ajl0Var = iOrdinal3 != 4 ? new wil0(j, (m4n) obj8, (cjl0) gjl0Var, xnmVar) : new xil0(j, (n4n) obj8, (djl0) gjl0Var, xnmVar);
                    } else {
                        if (j3 != 0) {
                            bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                            rz4.s(j3, ".svg", bzuVarD2);
                            string3 = ((StringBuilder) bzuVarD2.b).toString();
                        } else {
                            string3 = str;
                        }
                        ajl0Var = new yil0(j, new n0x(string3), (o4n) obj8, (ejl0) gjl0Var, xnmVar);
                    }
                    bjl0 bjl0Var = ajl0Var;
                    boolean z6 = aq7Var.h;
                    mm40 mm40Var = (mm40) obj6;
                    boolean zI = fetVar.i(j1k0Var) | fetVar.i(g1k0Var) | fetVar.h(z5) | fetVar.g(function1);
                    Object objP5 = fetVar.P();
                    if (zI || objP5 == cl5Var) {
                        objP5 = new up7(j1k0Var, g1k0Var, z5, function1);
                        fetVar.o0(objP5);
                    }
                    Function1 function2 = (Function1) objP5;
                    function2.getClass();
                    fetVar.e0(-461472663);
                    vic.i(mm40Var, bjl0Var, z6, function2, fetVar, 0);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ugd ugdVar = (ugd) obj7;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    zgx zgxVar = (zgx) list.get(iIntValue3);
                    fetVar2.e0(1798091567);
                    if (iIntValue3 != 0) {
                        fetVar2.e0(1798086513);
                        ugdVar.F(g9zVar2, fetVar2, Integer.valueOf(i2 & 14));
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1798127836);
                        fetVar2.r(false);
                    }
                    if (zgxVar == null) {
                        throw b1j.f(-1743110250, fetVar2, false);
                    }
                    fetVar2.e0(-1743108311);
                    n2x.d(3456, u1c.M(-443585388, new lgx((ugd) obj6, zgxVar, iIntValue3, g9zVar2), fetVar2), u1c.M(-589482973, new ggc(zgxVar, (ugd) wdrVar, (byte) 2), fetVar2), fetVar2, g9z.b(g9zVar2, jm40.b, null, 7), zgxVar.f44365a.e);
                    fetVar2.r(false);
                    if (z && iIntValue3 == q3d.i((List) ((pz40) obj5).getValue())) {
                        fetVar2.e0(1798740241);
                        ugdVar.F(g9zVar2, fetVar2, Integer.valueOf(i2 & 14));
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1798781564);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }

    public vp7(List list, ugd ugdVar, boolean z, pz40 pz40Var, ugd ugdVar2, ugd ugdVar3) {
        this.b = list;
        this.d = ugdVar;
        this.c = z;
        this.e = pz40Var;
        this.f = ugdVar2;
        this.g = ugdVar3;
    }
}
