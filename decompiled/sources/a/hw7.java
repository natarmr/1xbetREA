package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hw7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13756a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ long j;

    public /* synthetic */ hw7(ekw ekwVar, boolean z, jih jihVar, long j, long j2, List list, List list2, sip sipVar, boolean z2) {
        this.f13756a = (byte) 2;
        this.c = ekwVar;
        this.b = z;
        this.e = jihVar;
        this.h = j;
        this.j = j2;
        this.f = list;
        this.i = list2;
        this.g = sipVar;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar;
        fet fetVar2;
        byte b = this.f13756a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        boolean z = this.b;
        zhg0 zhg0Var = zhg0.f44392a;
        boolean z2 = this.d;
        Object obj3 = this.g;
        Object obj4 = this.i;
        Object obj5 = this.f;
        long j = this.j;
        Object obj6 = this.e;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                t33 t33Var = (t33) obj3;
                String str3 = (String) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, false);
                    boolean zH = fetVar3.h(z) | fetVar3.g(function0);
                    Object objP = fetVar3.P();
                    if (zH || objP == cl5Var) {
                        objP = new jw7(z, function0, (byte) 0);
                        fetVar3.o0(objP);
                    }
                    mm40 mm40VarW = y860.W(mm40VarA, null, null, false, null, (Function0) objP, 28);
                    yx7 yx7Var = gqw0.k;
                    thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar3, 48);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarW);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    long j2 = this.h;
                    if (z2) {
                        fetVar3.e0(-141809874);
                        mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, false);
                        Pair pair = new Pair(str, str2);
                        Object objP2 = fetVar3.P();
                        if (objP2 == cl5Var) {
                            objP2 = new nk7((byte) 5);
                            fetVar3.o0(objP2);
                        }
                        ay3.f(pair, mm40VarA2, (Function1) objP2, null, null, null, u1c.M(-1228949722, new bw7(str3, j, (byte) 0), fetVar3), fetVar3, 1573248, 56);
                        fetVar = fetVar3;
                        mm40 mm40VarB = zhg0Var.b(yx7Var, jm40Var);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = o7k0.n(s5x0.N(mm40VarB, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f);
                        boolean zI = fetVar.i(t33Var);
                        Object objP3 = fetVar.P();
                        if (zI || objP3 == cl5Var) {
                            objP3 = new m53(t33Var, (byte) 1);
                            fetVar.o0(objP3);
                        }
                        dww.c(a8k0.F(R.drawable.ic_glyph_reload, 0, fetVar), null, o2e.e0(i4w0.T(mm40VarN, (Function1) objP3), "ADVANCEBET_RELOAD_ICON"), j2, fetVar, 56, 0);
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar3;
                        fetVar.e0(-138846584);
                        mm40 mm40VarB2 = zhg0Var.b(yx7Var, jm40Var);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN2 = o7k0.n(s5x0.N(mm40VarB2, 0.0f, 0.0f, 4.0f, 0.0f, 11), 16.0f);
                        boolean zI2 = fetVar.i(t33Var);
                        Object objP4 = fetVar.P();
                        if (zI2 || objP4 == cl5Var) {
                            objP4 = new m53(t33Var, (byte) 3);
                            fetVar.o0(objP4);
                        }
                        dww.c(a8k0.F(R.drawable.ic_glyph_reload, 0, fetVar), null, i4w0.T(mm40VarN2, (Function1) objP4), j2, fetVar, 56, 0);
                        mm40 mm40VarA3 = zhg0Var.a(1.0f, jm40Var, false);
                        Pair pair2 = new Pair(str, str2);
                        Object objP5 = fetVar.P();
                        if (objP5 == cl5Var) {
                            objP5 = new nk7((byte) 7);
                            fetVar.o0(objP5);
                        }
                        ay3.f(pair2, mm40VarA3, (Function1) objP5, null, null, null, u1c.M(-694384593, new bw7(j, str3, (byte) 2), fetVar), fetVar, 1573248, 56);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 1:
                Function0 function1 = (Function0) obj7;
                String str4 = (String) obj6;
                String str5 = (String) obj5;
                t33 t33Var2 = (t33) obj3;
                String str6 = (String) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarA4 = zhg0Var.a(1.0f, jm40Var, false);
                    boolean zH2 = fetVar4.h(z) | fetVar4.g(function1);
                    Object objP6 = fetVar4.P();
                    if (zH2 || objP6 == cl5Var) {
                        objP6 = new jw7(z, function1, (byte) 1);
                        fetVar4.o0(objP6);
                    }
                    mm40 mm40VarW2 = y860.W(mm40VarA4, null, null, false, null, (Function0) objP6, 28);
                    yx7 yx7Var2 = gqw0.k;
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var2, fetVar4, 48);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarW2);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    long j3 = this.h;
                    if (z2) {
                        fetVar4.e0(1363775290);
                        mm40 mm40VarA5 = zhg0Var.a(1.0f, jm40Var, false);
                        Pair pair3 = new Pair(str4, str5);
                        Object objP7 = fetVar4.P();
                        if (objP7 == cl5Var) {
                            objP7 = new nk7((byte) 6);
                            fetVar4.o0(objP7);
                        }
                        ay3.f(pair3, mm40VarA5, (Function1) objP7, null, null, null, u1c.M(2039845069, new bw7(str6, j, (byte) 1), fetVar4), fetVar4, 1573248, 56);
                        fetVar2 = fetVar4;
                        mm40 mm40VarB3 = zhg0Var.b(yx7Var2, jm40Var);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarN3 = o7k0.n(s5x0.N(mm40VarB3, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f);
                        boolean zI3 = fetVar2.i(t33Var2);
                        Object objP8 = fetVar2.P();
                        if (zI3 || objP8 == cl5Var) {
                            objP8 = new m53(t33Var2, (byte) 2);
                            fetVar2.o0(objP8);
                        }
                        dww.c(a8k0.F(R.drawable.ic_glyph_reload, 0, fetVar2), null, i4w0.T(mm40VarN3, (Function1) objP8), j3, fetVar2, 56, 0);
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar4;
                        fetVar2.e0(1366628065);
                        mm40 mm40VarB4 = zhg0Var.b(yx7Var2, jm40Var);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarN4 = o7k0.n(s5x0.N(mm40VarB4, 0.0f, 0.0f, 4.0f, 0.0f, 11), 16.0f);
                        boolean zI4 = fetVar2.i(t33Var2);
                        Object objP9 = fetVar2.P();
                        if (zI4 || objP9 == cl5Var) {
                            objP9 = new m53(t33Var2, (byte) 4);
                            fetVar2.o0(objP9);
                        }
                        dww.c(a8k0.F(R.drawable.ic_glyph_reload, 0, fetVar2), null, i4w0.T(mm40VarN4, (Function1) objP9), j3, fetVar2, 56, 0);
                        mm40 mm40VarA6 = zhg0Var.a(1.0f, jm40Var, false);
                        Pair pair4 = new Pair(str4, str5);
                        Object objP10 = fetVar2.P();
                        if (objP10 == cl5Var) {
                            objP10 = new nk7((byte) 8);
                            fetVar2.o0(objP10);
                        }
                        ay3.f(pair4, mm40VarA6, (Function1) objP10, null, null, null, u1c.M(-1885018282, new bw7(j, str6, (byte) 3), fetVar2), fetVar2, 1573248, 56);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                ekw ekwVar = (ekw) obj7;
                zjw zjwVar = (zjw) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zjwVar.h);
                CyberGamesPage cyberGamesPage = ekwVar.f7971a;
                linkedHashMap.put(cyberGamesPage, (jih) obj6);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zjwVar.m);
                linkedHashMap2.put(cyberGamesPage, Long.valueOf(this.h));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(zjwVar.n);
                linkedHashMap3.put(cyberGamesPage, Long.valueOf(j));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(zjwVar.o);
                linkedHashMap4.put(cyberGamesPage, (List) obj5);
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(zjwVar.p);
                linkedHashMap5.put(cyberGamesPage, (List) obj4);
                LinkedHashMap linkedHashMapP = xp20.p(zjwVar.l);
                linkedHashMapP.put(cyberGamesPage, (sip) obj3);
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(zjwVar.q);
                linkedHashMap6.put(cyberGamesPage, Boolean.valueOf(z2));
                return zjw.a(zjwVar, null, ekwVar, linkedHashMap, this.b, null, false, linkedHashMapP, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, 394815);
        }
    }

    public /* synthetic */ hw7(boolean z, Function0 function0, boolean z2, String str, String str2, t33 t33Var, long j, String str3, long j2, byte b) {
        this.f13756a = b;
        this.b = z;
        this.c = function0;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = t33Var;
        this.h = j;
        this.i = str3;
        this.j = j2;
    }
}
