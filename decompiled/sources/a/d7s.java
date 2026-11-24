package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final class d7s implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5609a = 2;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public d7s(a4x a4xVar, float f, Map map, Function1 function1, pz40 pz40Var) {
        this.b = a4xVar;
        this.d = f;
        this.e = map;
        this.c = function1;
        this.f = pz40Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:103:0x0218  */
    /* JADX WARN: Code duplicated, block: B:105:0x021d  */
    /* JADX WARN: Code duplicated, block: B:106:0x022f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0235  */
    /* JADX WARN: Code duplicated, block: B:109:0x025f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0263  */
    /* JADX WARN: Code duplicated, block: B:112:0x028d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0291  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:123:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:127:0x030b  */
    /* JADX WARN: Code duplicated, block: B:129:0x030f  */
    /* JADX WARN: Code duplicated, block: B:130:0x031f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0323  */
    /* JADX WARN: Code duplicated, block: B:133:0x0342  */
    /* JADX WARN: Code duplicated, block: B:135:0x0348  */
    /* JADX WARN: Code duplicated, block: B:136:0x0365  */
    /* JADX WARN: Code duplicated, block: B:138:0x036b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x018f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198  */
    /* JADX WARN: Code duplicated, block: B:84:0x019b  */
    /* JADX WARN: Code duplicated, block: B:85:0x019d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:96:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e5  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        yje yjeVar;
        int i2;
        fet fetVar2;
        int i3;
        float f;
        boolean z;
        boolean z2;
        float f2;
        float f3;
        float f4;
        jm40 jm40Var;
        float f5;
        float f6;
        float f7;
        mm40 mm40VarM;
        fet fetVar3;
        int i4;
        byte b = this.f5609a;
        jm40 jm40Var2 = jm40.b;
        a4x a4xVar = this.b;
        float f8 = this.d;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 3;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Function1 function1 = this.c;
        final byte b3 = 0;
        final byte b4 = 1;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (fetVar4.g(g9zVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar4.e(iIntValue) ? 32 : 16;
                }
                if (fetVar4.U(i & 1, (i & 147) != 146)) {
                    haj hajVar = (haj) a4xVar.get(iIntValue);
                    fetVar4.e0(-2010962353);
                    Object objP = fetVar4.P();
                    yje yjeVar2 = null;
                    if (objP == cl5Var) {
                        mm40 mm40VarL = s5x0.L(o7k0.w(g9zVar.d(1.0f), null, false, 3), f8, 0.0f, 2);
                        fetVar4.o0(mm40VarL);
                        objP = mm40VarL;
                    }
                    mm40 mm40Var = (mm40) objP;
                    if (hajVar != null) {
                        if (hajVar instanceof z9j) {
                            fetVar4.e0(1459159171);
                            z9j z9jVar = (z9j) hajVar;
                            pz40 pz40VarF = androidx.compose.runtime.e.f(z9jVar.c, fetVar4);
                            long jM76getBlack700d7_KjU = ((StaticColors) fetVar4.k(m8m0.f21378a)).m76getBlack700d7_KjU();
                            hkb.h(mm40Var, u1c.M(-1244424849, new zis(jM76getBlack700d7_KjU, z9jVar, b4), fetVar4), u1c.M(-1589340594, new zis((Object) pz40VarF, jM76getBlack700d7_KjU, (byte) 2), fetVar4), x4d0.c, fetVar4, 28038, 2);
                            fetVar = fetVar4;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar4;
                            if (hajVar instanceof aaj) {
                                fetVar.e0(1459166265);
                                final aaj aajVar = (aaj) hajVar;
                                boolean zG = fetVar.g(function1) | fetVar.g(hajVar);
                                Object objP2 = fetVar.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new c7s(function1, hajVar, (byte) 0);
                                    fetVar.o0(objP2);
                                }
                                final Function1 function2 = (Function1) objP2;
                                boolean zG2 = fetVar.g(function1);
                                Object objP3 = fetVar.P();
                                if (zG2 || objP3 == cl5Var) {
                                    objP3 = new fzg(function1, (byte) 26);
                                    fetVar.o0(objP3);
                                }
                                final Function1 function3 = (Function1) objP3;
                                function2.getClass();
                                function3.getClass();
                                final pz40 pz40VarF2 = androidx.compose.runtime.e.f(aajVar.c, fetVar);
                                final long jM76getBlack700d7_KjU2 = ((StaticColors) fetVar.k(m8m0.f21378a)).m76getBlack700d7_KjU();
                                ugd ugdVarM = u1c.M(-516165133, new zis(jM76getBlack700d7_KjU2, aajVar, b2), fetVar);
                                ugd ugdVarM2 = u1c.M(-1499158510, new ydr() { // from class: a.v0z
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        mm40 mm40Var2 = (mm40) obj8;
                                        fet fetVar5 = (fet) obj9;
                                        int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar5.g(mm40Var2) ? 32 : 16;
                                        }
                                        if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                            kr00.a(u1c.M(-545702987, new si6(mm40Var2, pz40VarF2, aajVar, jM76getBlack700d7_KjU2, function3), fetVar5), fetVar5, 6);
                                        } else {
                                            fetVar5.X();
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar);
                                final byte b5 = 0;
                                hkb.h(mm40Var, ugdVarM, ugdVarM2, u1c.M(1812815409, new ydr() { // from class: a.w0z
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        int i5;
                                        int i6;
                                        byte b6 = b5;
                                        cl5 cl5Var2 = ukd.f35823a;
                                        long j = jM76getBlack700d7_KjU2;
                                        byte b7 = 4;
                                        Object obj11 = function2;
                                        haj hajVar2 = aajVar;
                                        switch (b6) {
                                            case 0:
                                                kmo kmoVar = ((aaj) hajVar2).d;
                                                Function1 function4 = (Function1) obj11;
                                                y5d y5dVar = (y5d) obj7;
                                                mm40 mm40Var2 = (mm40) obj8;
                                                fet fetVar5 = (fet) obj9;
                                                int iD = dw9.d((Integer) obj10, y5dVar, mm40Var2);
                                                if ((iD & 6) == 0) {
                                                    i5 = (fetVar5.g(y5dVar) ? 4 : 2) | iD;
                                                } else {
                                                    i5 = iD;
                                                }
                                                if ((iD & 48) == 0) {
                                                    i5 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                                }
                                                if (!fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                                                    fetVar5.X();
                                                } else if (kmoVar == null) {
                                                    fetVar5.e0(665153161);
                                                    fetVar5.r(false);
                                                } else {
                                                    fetVar5.e0(665153162);
                                                    pz40 pz40VarF3 = androidx.compose.runtime.e.f(kmoVar, fetVar5);
                                                    mm40 mm40VarA = y5dVar.a(mm40Var2, gqw0.n);
                                                    zcl zclVar = qmk.f28987a;
                                                    mm40 mm40VarN = s5x0.N(mm40VarA, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                                    boolean zF = fetVar5.f(j);
                                                    Object objP4 = fetVar5.P();
                                                    if (zF || objP4 == cl5Var2) {
                                                        objP4 = new dls((byte) 14, j);
                                                        fetVar5.o0(objP4);
                                                    }
                                                    mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP4);
                                                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                                                    int iHashCode = Long.hashCode(fetVar5.T);
                                                    bh90 bh90VarM = fetVar5.m();
                                                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarK);
                                                    mkd.c0.getClass();
                                                    fetVar5.i0();
                                                    if (fetVar5.S) {
                                                        fetVar5.l(e7z.u1);
                                                    } else {
                                                        fetVar5.r0();
                                                    }
                                                    jpm0.o(fetVar5, tj30VarC, gqw0.x);
                                                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                                                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                                                    jpm0.n(fetVar5);
                                                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                                                    rcb.F(jm40.b, (kmo) pz40VarF3.getValue(), function4, fetVar5, 6, 0);
                                                    fetVar5.r(true);
                                                    fetVar5.r(false);
                                                }
                                                break;
                                            case 1:
                                                caj cajVar = (caj) hajVar2;
                                                pz40 pz40Var = (pz40) obj11;
                                                mm40 mm40Var3 = (mm40) obj8;
                                                fet fetVar6 = (fet) obj9;
                                                int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                if ((iD2 & 48) == 0) {
                                                    iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                    kr00.a(u1c.M(536645582, new ds8(mm40Var3, cajVar, jM76getBlack700d7_KjU2, pz40Var, (byte) 4), fetVar6), fetVar6, 6);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                break;
                                            default:
                                                kmo kmoVar2 = ((caj) hajVar2).b;
                                                Function1 function5 = (Function1) obj11;
                                                y5d y5dVar2 = (y5d) obj7;
                                                mm40 mm40Var4 = (mm40) obj8;
                                                fet fetVar7 = (fet) obj9;
                                                int iD3 = dw9.d((Integer) obj10, y5dVar2, mm40Var4);
                                                if ((iD3 & 6) == 0) {
                                                    i6 = (fetVar7.g(y5dVar2) ? 4 : 2) | iD3;
                                                } else {
                                                    i6 = iD3;
                                                }
                                                if ((iD3 & 48) == 0) {
                                                    i6 |= fetVar7.g(mm40Var4) ? 32 : 16;
                                                }
                                                if (!fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                    fetVar7.X();
                                                } else if (kmoVar2 == null) {
                                                    fetVar7.e0(-1341868984);
                                                    fetVar7.r(false);
                                                } else {
                                                    fetVar7.e0(-1341868983);
                                                    pz40 pz40VarF4 = androidx.compose.runtime.e.f(kmoVar2, fetVar7);
                                                    mm40 mm40VarA2 = y5dVar2.a(mm40Var4, gqw0.n);
                                                    zcl zclVar2 = qmk.f28987a;
                                                    mm40 mm40VarN2 = s5x0.N(mm40VarA2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                                    boolean zF2 = fetVar7.f(j);
                                                    Object objP5 = fetVar7.P();
                                                    if (zF2 || objP5 == cl5Var2) {
                                                        objP5 = new r2a0(b7, j);
                                                        fetVar7.o0(objP5);
                                                    }
                                                    rcb.F(rq8.K(mm40VarN2, (Function1) objP5), (kmo) pz40VarF4.getValue(), function5, fetVar7, 0, 0);
                                                    fetVar7.r(false);
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), fetVar, 28038, 2);
                                fetVar.r(false);
                            } else if (hajVar instanceof caj) {
                                fetVar.e0(-2009904541);
                                final caj cajVar = (caj) hajVar;
                                boolean zG3 = fetVar.g(function1) | fetVar.g(hajVar);
                                Object objP4 = fetVar.P();
                                if (zG3 || objP4 == cl5Var) {
                                    objP4 = new c7s(function1, hajVar, (byte) 1);
                                    fetVar.o0(objP4);
                                }
                                final Function1 function4 = (Function1) objP4;
                                function4.getClass();
                                final pz40 pz40VarF3 = androidx.compose.runtime.e.f(cajVar.f4013a, fetVar);
                                pz40 pz40Var = s6t0.f31722a;
                                final long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
                                final byte b6 = 1;
                                ugd ugdVarM3 = u1c.M(-1075450901, new ydr() { // from class: a.w0z
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        int i5;
                                        int i6;
                                        byte b7 = b6;
                                        cl5 cl5Var2 = ukd.f35823a;
                                        long j = jM75getBlack600d7_KjU;
                                        byte b8 = 4;
                                        Object obj11 = pz40VarF3;
                                        haj hajVar2 = cajVar;
                                        switch (b7) {
                                            case 0:
                                                kmo kmoVar = ((aaj) hajVar2).d;
                                                Function1 function5 = (Function1) obj11;
                                                y5d y5dVar = (y5d) obj7;
                                                mm40 mm40Var2 = (mm40) obj8;
                                                fet fetVar5 = (fet) obj9;
                                                int iD = dw9.d((Integer) obj10, y5dVar, mm40Var2);
                                                if ((iD & 6) == 0) {
                                                    i5 = (fetVar5.g(y5dVar) ? 4 : 2) | iD;
                                                } else {
                                                    i5 = iD;
                                                }
                                                if ((iD & 48) == 0) {
                                                    i5 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                                }
                                                if (!fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                                                    fetVar5.X();
                                                } else if (kmoVar == null) {
                                                    fetVar5.e0(665153161);
                                                    fetVar5.r(false);
                                                } else {
                                                    fetVar5.e0(665153162);
                                                    pz40 pz40VarF4 = androidx.compose.runtime.e.f(kmoVar, fetVar5);
                                                    mm40 mm40VarA = y5dVar.a(mm40Var2, gqw0.n);
                                                    zcl zclVar = qmk.f28987a;
                                                    mm40 mm40VarN = s5x0.N(mm40VarA, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                                    boolean zF = fetVar5.f(j);
                                                    Object objP5 = fetVar5.P();
                                                    if (zF || objP5 == cl5Var2) {
                                                        objP5 = new dls((byte) 14, j);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP5);
                                                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                                                    int iHashCode = Long.hashCode(fetVar5.T);
                                                    bh90 bh90VarM = fetVar5.m();
                                                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarK);
                                                    mkd.c0.getClass();
                                                    fetVar5.i0();
                                                    if (fetVar5.S) {
                                                        fetVar5.l(e7z.u1);
                                                    } else {
                                                        fetVar5.r0();
                                                    }
                                                    jpm0.o(fetVar5, tj30VarC, gqw0.x);
                                                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                                                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                                                    jpm0.n(fetVar5);
                                                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                                                    rcb.F(jm40.b, (kmo) pz40VarF4.getValue(), function5, fetVar5, 6, 0);
                                                    fetVar5.r(true);
                                                    fetVar5.r(false);
                                                }
                                                break;
                                            case 1:
                                                caj cajVar2 = (caj) hajVar2;
                                                pz40 pz40Var2 = (pz40) obj11;
                                                mm40 mm40Var3 = (mm40) obj8;
                                                fet fetVar6 = (fet) obj9;
                                                int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                if ((iD2 & 48) == 0) {
                                                    iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                    kr00.a(u1c.M(536645582, new ds8(mm40Var3, cajVar2, jM75getBlack600d7_KjU, pz40Var2, (byte) 4), fetVar6), fetVar6, 6);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                break;
                                            default:
                                                kmo kmoVar2 = ((caj) hajVar2).b;
                                                Function1 function6 = (Function1) obj11;
                                                y5d y5dVar2 = (y5d) obj7;
                                                mm40 mm40Var4 = (mm40) obj8;
                                                fet fetVar7 = (fet) obj9;
                                                int iD3 = dw9.d((Integer) obj10, y5dVar2, mm40Var4);
                                                if ((iD3 & 6) == 0) {
                                                    i6 = (fetVar7.g(y5dVar2) ? 4 : 2) | iD3;
                                                } else {
                                                    i6 = iD3;
                                                }
                                                if ((iD3 & 48) == 0) {
                                                    i6 |= fetVar7.g(mm40Var4) ? 32 : 16;
                                                }
                                                if (!fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                    fetVar7.X();
                                                } else if (kmoVar2 == null) {
                                                    fetVar7.e0(-1341868984);
                                                    fetVar7.r(false);
                                                } else {
                                                    fetVar7.e0(-1341868983);
                                                    pz40 pz40VarF5 = androidx.compose.runtime.e.f(kmoVar2, fetVar7);
                                                    mm40 mm40VarA2 = y5dVar2.a(mm40Var4, gqw0.n);
                                                    zcl zclVar2 = qmk.f28987a;
                                                    mm40 mm40VarN2 = s5x0.N(mm40VarA2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                                    boolean zF2 = fetVar7.f(j);
                                                    Object objP6 = fetVar7.P();
                                                    if (zF2 || objP6 == cl5Var2) {
                                                        objP6 = new r2a0(b8, j);
                                                        fetVar7.o0(objP6);
                                                    }
                                                    rcb.F(rq8.K(mm40VarN2, (Function1) objP6), (kmo) pz40VarF5.getValue(), function6, fetVar7, 0, 0);
                                                    fetVar7.r(false);
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar);
                                final byte b7 = 2;
                                hkb.h(mm40Var, null, ugdVarM3, u1c.M(-2112567478, new ydr() { // from class: a.w0z
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        int i5;
                                        int i6;
                                        byte b8 = b7;
                                        cl5 cl5Var2 = ukd.f35823a;
                                        long j = jM75getBlack600d7_KjU;
                                        byte b9 = 4;
                                        Object obj11 = function4;
                                        haj hajVar2 = cajVar;
                                        switch (b8) {
                                            case 0:
                                                kmo kmoVar = ((aaj) hajVar2).d;
                                                Function1 function5 = (Function1) obj11;
                                                y5d y5dVar = (y5d) obj7;
                                                mm40 mm40Var2 = (mm40) obj8;
                                                fet fetVar5 = (fet) obj9;
                                                int iD = dw9.d((Integer) obj10, y5dVar, mm40Var2);
                                                if ((iD & 6) == 0) {
                                                    i5 = (fetVar5.g(y5dVar) ? 4 : 2) | iD;
                                                } else {
                                                    i5 = iD;
                                                }
                                                if ((iD & 48) == 0) {
                                                    i5 |= fetVar5.g(mm40Var2) ? 32 : 16;
                                                }
                                                if (!fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                                                    fetVar5.X();
                                                } else if (kmoVar == null) {
                                                    fetVar5.e0(665153161);
                                                    fetVar5.r(false);
                                                } else {
                                                    fetVar5.e0(665153162);
                                                    pz40 pz40VarF4 = androidx.compose.runtime.e.f(kmoVar, fetVar5);
                                                    mm40 mm40VarA = y5dVar.a(mm40Var2, gqw0.n);
                                                    zcl zclVar = qmk.f28987a;
                                                    mm40 mm40VarN = s5x0.N(mm40VarA, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                                    boolean zF = fetVar5.f(j);
                                                    Object objP5 = fetVar5.P();
                                                    if (zF || objP5 == cl5Var2) {
                                                        objP5 = new dls((byte) 14, j);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP5);
                                                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                                                    int iHashCode = Long.hashCode(fetVar5.T);
                                                    bh90 bh90VarM = fetVar5.m();
                                                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarK);
                                                    mkd.c0.getClass();
                                                    fetVar5.i0();
                                                    if (fetVar5.S) {
                                                        fetVar5.l(e7z.u1);
                                                    } else {
                                                        fetVar5.r0();
                                                    }
                                                    jpm0.o(fetVar5, tj30VarC, gqw0.x);
                                                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                                                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                                                    jpm0.n(fetVar5);
                                                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                                                    rcb.F(jm40.b, (kmo) pz40VarF4.getValue(), function5, fetVar5, 6, 0);
                                                    fetVar5.r(true);
                                                    fetVar5.r(false);
                                                }
                                                break;
                                            case 1:
                                                caj cajVar2 = (caj) hajVar2;
                                                pz40 pz40Var2 = (pz40) obj11;
                                                mm40 mm40Var3 = (mm40) obj8;
                                                fet fetVar6 = (fet) obj9;
                                                int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                if ((iD2 & 48) == 0) {
                                                    iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                    kr00.a(u1c.M(536645582, new ds8(mm40Var3, cajVar2, jM75getBlack600d7_KjU, pz40Var2, (byte) 4), fetVar6), fetVar6, 6);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                break;
                                            default:
                                                kmo kmoVar2 = ((caj) hajVar2).b;
                                                Function1 function6 = (Function1) obj11;
                                                y5d y5dVar2 = (y5d) obj7;
                                                mm40 mm40Var4 = (mm40) obj8;
                                                fet fetVar7 = (fet) obj9;
                                                int iD3 = dw9.d((Integer) obj10, y5dVar2, mm40Var4);
                                                if ((iD3 & 6) == 0) {
                                                    i6 = (fetVar7.g(y5dVar2) ? 4 : 2) | iD3;
                                                } else {
                                                    i6 = iD3;
                                                }
                                                if ((iD3 & 48) == 0) {
                                                    i6 |= fetVar7.g(mm40Var4) ? 32 : 16;
                                                }
                                                if (!fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                    fetVar7.X();
                                                } else if (kmoVar2 == null) {
                                                    fetVar7.e0(-1341868984);
                                                    fetVar7.r(false);
                                                } else {
                                                    fetVar7.e0(-1341868983);
                                                    pz40 pz40VarF5 = androidx.compose.runtime.e.f(kmoVar2, fetVar7);
                                                    mm40 mm40VarA2 = y5dVar2.a(mm40Var4, gqw0.n);
                                                    zcl zclVar2 = qmk.f28987a;
                                                    mm40 mm40VarN2 = s5x0.N(mm40VarA2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                                    boolean zF2 = fetVar7.f(j);
                                                    Object objP6 = fetVar7.P();
                                                    if (zF2 || objP6 == cl5Var2) {
                                                        objP6 = new r2a0(b9, j);
                                                        fetVar7.o0(objP6);
                                                    }
                                                    rcb.F(rq8.K(mm40VarN2, (Function1) objP6), (kmo) pz40VarF5.getValue(), function6, fetVar7, 0, 0);
                                                    fetVar7.r(false);
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), fetVar, 27654, 6);
                                fetVar.r(false);
                            } else if (hajVar instanceof gaj) {
                                fetVar.e0(-2009426242);
                                final gaj gajVar = (gaj) hajVar;
                                pz40 pz40Var2 = s6t0.f31722a;
                                final long jM75getBlack600d7_KjU2 = StaticColors.INSTANCE.m75getBlack600d7_KjU();
                                hkb.h(mm40Var, u1c.M(1758618002, new ydr() { // from class: a.uwl0
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        byte b8 = b3;
                                        cl5 cl5Var2 = ukd.f35823a;
                                        gaj gajVar2 = gajVar;
                                        long j = jM75getBlack600d7_KjU2;
                                        y5d y5dVar = (y5d) obj7;
                                        switch (b8) {
                                            case 0:
                                                mm40 mm40Var2 = (mm40) obj8;
                                                fet fetVar5 = (fet) obj9;
                                                int iD = dw9.d((Integer) obj10, y5dVar, mm40Var2);
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var2) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    boolean zF = fetVar5.f(j);
                                                    Object objP5 = fetVar5.P();
                                                    if (zF || objP5 == cl5Var2) {
                                                        objP5 = new r2a0((byte) 11, j);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    n6x.g(0, fetVar5, gajVar2.e, rq8.K(mm40Var2, (Function1) objP5));
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            default:
                                                mm40 mm40Var3 = (mm40) obj8;
                                                fet fetVar6 = (fet) obj9;
                                                int iD2 = dw9.d((Integer) obj10, y5dVar, mm40Var3);
                                                if ((iD2 & 48) == 0) {
                                                    iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                    boolean zF2 = fetVar6.f(j);
                                                    Object objP6 = fetVar6.P();
                                                    if (zF2 || objP6 == cl5Var2) {
                                                        objP6 = new r2a0((byte) 12, j);
                                                        fetVar6.o0(objP6);
                                                    }
                                                    mm40 mm40VarK = rq8.K(mm40Var3, (Function1) objP6);
                                                    zcl zclVar = qmk.f28987a;
                                                    n2x.o(s5x0.N(mm40VarK, 0.0f, 8.0f, 0.0f, 16.0f, 5), gajVar2.b, gajVar2.c, gajVar2.d, gajVar2.f10968a, fetVar6, 0);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), u1c.M(1951549203, new ydr() { // from class: a.uwl0
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        byte b8 = b4;
                                        cl5 cl5Var2 = ukd.f35823a;
                                        gaj gajVar2 = gajVar;
                                        long j = jM75getBlack600d7_KjU2;
                                        y5d y5dVar = (y5d) obj7;
                                        switch (b8) {
                                            case 0:
                                                mm40 mm40Var2 = (mm40) obj8;
                                                fet fetVar5 = (fet) obj9;
                                                int iD = dw9.d((Integer) obj10, y5dVar, mm40Var2);
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar5.g(mm40Var2) ? 32 : 16;
                                                }
                                                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                                                    boolean zF = fetVar5.f(j);
                                                    Object objP5 = fetVar5.P();
                                                    if (zF || objP5 == cl5Var2) {
                                                        objP5 = new r2a0((byte) 11, j);
                                                        fetVar5.o0(objP5);
                                                    }
                                                    n6x.g(0, fetVar5, gajVar2.e, rq8.K(mm40Var2, (Function1) objP5));
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                            default:
                                                mm40 mm40Var3 = (mm40) obj8;
                                                fet fetVar6 = (fet) obj9;
                                                int iD2 = dw9.d((Integer) obj10, y5dVar, mm40Var3);
                                                if ((iD2 & 48) == 0) {
                                                    iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                    boolean zF2 = fetVar6.f(j);
                                                    Object objP6 = fetVar6.P();
                                                    if (zF2 || objP6 == cl5Var2) {
                                                        objP6 = new r2a0((byte) 12, j);
                                                        fetVar6.o0(objP6);
                                                    }
                                                    mm40 mm40VarK = rq8.K(mm40Var3, (Function1) objP6);
                                                    zcl zclVar = qmk.f28987a;
                                                    n2x.o(s5x0.N(mm40VarK, 0.0f, 8.0f, 0.0f, 16.0f, 5), gajVar2.b, gajVar2.c, gajVar2.d, gajVar2.f10968a, fetVar6, 0);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar), u1c.M(2144480404, new csw((Object) gajVar, (byte) 16), fetVar), fetVar, 28038, 2);
                                fetVar.r(false);
                            } else {
                                byte b8 = 6;
                                if (hajVar instanceof y9j) {
                                    fetVar.e0(-2009215628);
                                    y9j y9jVar = (y9j) hajVar;
                                    int i5 = y9jVar.b;
                                    xak xakVar = (xak) obj6;
                                    nek nekVar = (nek) obj5;
                                    boolean zG4 = fetVar.g(function1);
                                    Object objP5 = fetVar.P();
                                    if (zG4 || objP5 == cl5Var) {
                                        objP5 = new fzg(function1, (byte) 27);
                                        fetVar.o0(objP5);
                                    }
                                    Function1 function5 = (Function1) objP5;
                                    boolean zG5 = fetVar.g(function1);
                                    Object objP6 = fetVar.P();
                                    if (zG5 || objP6 == cl5Var) {
                                        objP6 = new cnn(function1, (byte) 6);
                                        fetVar.o0(objP6);
                                    }
                                    Function0 function0 = (Function0) objP6;
                                    boolean zG6 = fetVar.g(function1);
                                    Object objP7 = fetVar.P();
                                    if (zG6 || objP7 == cl5Var) {
                                        objP7 = new cnn(function1, (byte) 7);
                                        fetVar.o0(objP7);
                                    }
                                    Function0 function6 = (Function0) objP7;
                                    xakVar.getClass();
                                    nekVar.getClass();
                                    function5.getClass();
                                    function0.getClass();
                                    function6.getClass();
                                    pbz pbzVar = (pbz) fetVar.k(hu90.f13669a);
                                    boolean zG7 = fetVar.g(pbzVar);
                                    Object objP8 = fetVar.P();
                                    if (zG7 || objP8 == cl5Var) {
                                        objP8 = new r39(pbzVar, (byte) 0);
                                        fetVar.o0(objP8);
                                    }
                                    m0x0.o(pbzVar, (Function1) objP8, fetVar);
                                    boolean zG8 = fetVar.g(y9jVar);
                                    Object objP9 = fetVar.P();
                                    if (zG8 || objP9 == cl5Var) {
                                        objP9 = new vb8(y9jVar, (byte) 16);
                                        fetVar.o0(objP9);
                                    }
                                    kwj kwjVarB = zk80.b(i5, (Function0) objP9, fetVar, 0, 2);
                                    Integer numValueOf = Integer.valueOf(i5);
                                    boolean zG9 = fetVar.g(kwjVarB) | fetVar.g(y9jVar);
                                    Object objP10 = fetVar.P();
                                    if (zG9 || objP10 == cl5Var) {
                                        objP10 = new d09(kwjVarB, y9jVar, yjeVar2, b8);
                                        fetVar.o0(objP10);
                                    }
                                    m0x0.t(fetVar, numValueOf, (Function2) objP10);
                                    long jM76getBlack700d7_KjU3 = ((StaticColors) fetVar.k(m8m0.f21378a)).m76getBlack700d7_KjU();
                                    mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
                                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                                    int iHashCode = Long.hashCode(fetVar.T);
                                    bh90 bh90VarM = fetVar.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                                    mkd.c0.getClass();
                                    fetVar.i0();
                                    if (fetVar.S) {
                                        fetVar.l(e7z.u1);
                                    } else {
                                        fetVar.r0();
                                    }
                                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                    jpm0.n(fetVar);
                                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                    zcl zclVar = qmk.k;
                                    ugg0 ugg0Var = vgg0.f37379a;
                                    jm40 jm40Var3 = jm40.b;
                                    mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var3);
                                    boolean zF = fetVar.f(jM76getBlack700d7_KjU3);
                                    Object objP11 = fetVar.P();
                                    if (zF || objP11 == cl5Var) {
                                        objP11 = new bx((byte) 14, jM76getBlack700d7_KjU3);
                                        fetVar.o0(objP11);
                                    }
                                    mm40 mm40VarJ = s5x0.J(o7k0.d(rq8.K(mm40VarI, (Function1) objP11), 1.0f), 4.0f);
                                    boolean zF2 = fetVar.f(jM76getBlack700d7_KjU3);
                                    Object objP12 = fetVar.P();
                                    if (zF2 || objP12 == cl5Var) {
                                        objP12 = new bx((byte) 15, jM76getBlack700d7_KjU3);
                                        fetVar.o0(objP12);
                                    }
                                    q5x.e(kwjVarB, ny9.O(1.7777778f, rq8.K(mm40VarJ, (Function1) objP12), false), null, null, 0, 8.0f, null, null, false, null, null, null, null, u1c.M(2035376393, new t39(y9jVar, nekVar, function0, xakVar, function6), fetVar), fetVar, 100663296, 24576, 16092);
                                    if (y9jVar.d) {
                                        fetVar.e0(1217152481);
                                        mm40 mm40VarE = o7k0.u(s5x0.N(jm40Var3, 0.0f, 2.0f, 0.0f, 0.0f, 13), 0.0f, 448.0f, 1).e(new wkw(gqw0.n));
                                        dxh0 dxh0Var = y9jVar.e;
                                        a4x a4xVar2 = y9jVar.f;
                                        boolean zG10 = fetVar.g(kwjVarB);
                                        Object objP13 = fetVar.P();
                                        if (zG10 || objP13 == cl5Var) {
                                            objP13 = new s39(kwjVarB, (byte) 1);
                                            fetVar.o0(objP13);
                                        }
                                        Function0 function7 = (Function0) objP13;
                                        boolean zG11 = fetVar.g(function5);
                                        Object objP14 = fetVar.P();
                                        if (zG11 || objP14 == cl5Var) {
                                            objP14 = new xz8(function5, (byte) 4);
                                            fetVar.o0(objP14);
                                        }
                                        ibc.n(mm40VarE, a4xVar2, fxh0.f10310a, dxh0Var, false, function7, (Function1) objP14, fetVar, 384, 16);
                                        fetVar.r(false);
                                    } else {
                                        fetVar.e0(1217647706);
                                        fetVar.r(false);
                                    }
                                    fetVar.r(true);
                                    fetVar.r(false);
                                } else if (hajVar instanceof baj) {
                                    fetVar.e0(-2008527707);
                                    baj bajVar = (baj) hajVar;
                                    boolean zG12 = fetVar.g(function1);
                                    Object objP15 = fetVar.P();
                                    if (zG12 || objP15 == cl5Var) {
                                        objP15 = new fzg(function1, (byte) 28);
                                        fetVar.o0(objP15);
                                    }
                                    Function1 function8 = (Function1) objP15;
                                    a4x a4xVar3 = bajVar.f2259a;
                                    function8.getClass();
                                    xcz xczVarA = ddz.a(q3d.i(a4xVar3), 0, fetVar, 0, 2);
                                    pz40 pz40VarD = vcc.D(xczVarA.g, fetVar);
                                    pz40 pz40VarA0 = v3c.a0(Integer.valueOf(a4xVar3.size()), new Object[0], fetVar, 0);
                                    pz40 pz40VarA1 = v3c.a0(Boolean.FALSE, new Object[0], fetVar, 6);
                                    boolean zG13 = fetVar.g(xczVarA) | fetVar.g(pz40VarA1) | fetVar.g(pz40VarD);
                                    Object objP16 = fetVar.P();
                                    if (zG13 || objP16 == cl5Var) {
                                        yjeVar = null;
                                        objP16 = new rua(xczVarA, pz40VarA1, pz40VarD, yjeVar, (byte) 3);
                                        fetVar.o0(objP16);
                                    } else {
                                        yjeVar = null;
                                    }
                                    m0x0.t(fetVar, xczVarA, (Function2) objP16);
                                    boolean zG14 = fetVar.g(xczVarA) | fetVar.g(pz40VarA0) | fetVar.g(pz40VarA1);
                                    Object objP17 = fetVar.P();
                                    if (zG14 || objP17 == cl5Var) {
                                        objP17 = new rf30(xczVarA, pz40VarA0, pz40VarA1, yjeVar, (byte) 2);
                                        fetVar.o0(objP17);
                                    }
                                    m0x0.t(fetVar, xczVarA, (Function2) objP17);
                                    long jM76getBlack700d7_KjU4 = ((StaticColors) fetVar.k(m8m0.f21378a)).m76getBlack700d7_KjU();
                                    boolean zF3 = fetVar.f(jM76getBlack700d7_KjU4);
                                    Object objP18 = fetVar.P();
                                    if (zF3 || objP18 == cl5Var) {
                                        objP18 = new dls((byte) 23, jM76getBlack700d7_KjU4);
                                        fetVar.o0(objP18);
                                    }
                                    hkb.h(rq8.K(mm40Var, (Function1) objP18), null, u1c.M(-1301345209, new n82(bajVar, xczVarA, function8, (byte) 17), fetVar), null, fetVar, 3072, 22);
                                    fetVar.r(false);
                                } else if (hajVar instanceof faj) {
                                    fetVar.e0(-2008139618);
                                    faj fajVar = (faj) hajVar;
                                    boolean zG15 = fetVar.g(function1);
                                    Object objP19 = fetVar.P();
                                    if (zG15 || objP19 == cl5Var) {
                                        objP19 = new fzg(function1, (byte) 29);
                                        fetVar.o0(objP19);
                                    }
                                    cww.m(mm40Var, fajVar, (Function1) objP19, fetVar, 6);
                                    fetVar.r(false);
                                }
                            }
                        }
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar4;
                    }
                    throw b1j.f(1459159363, fetVar, false);
                }
                fetVar4.X();
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                Function2 function9 = (Function2) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar5.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar5.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar5.U(i2 & 1, (i2 & 147) != 146)) {
                    jax jaxVar = (jax) a4xVar.get(iIntValue3);
                    fetVar5.e0(604192788);
                    Object objP20 = fetVar5.P();
                    if (objP20 == cl5Var) {
                        mm40 mm40VarL2 = s5x0.L(o7k0.w(g9zVar2.d(1.0f), null, false, 3), f8, 0.0f, 2);
                        fetVar5.o0(mm40VarL2);
                        objP20 = mm40VarL2;
                    }
                    mm40 mm40Var2 = (mm40) objP20;
                    if (jaxVar != null) {
                        if (jaxVar instanceof dax) {
                            fetVar5.e0(1266425226);
                            final dax daxVar = (dax) jaxVar;
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarD = o7k0.d(s5x0.L(mm40Var2, 8.0f, 0.0f, 2), 1.0f);
                            ugd ugdVarM4 = u1c.M(990938523, new ydr() { // from class: a.mad
                                /* JADX WARN: Code duplicated, block: B:59:0x01e3  */
                                @Override // a.ydr
                                public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                    byte b9 = b3;
                                    dax daxVar2 = daxVar;
                                    final byte b10 = 3;
                                    char c = 1;
                                    final byte b11 = 0;
                                    switch (b9) {
                                        case 0:
                                            mm40 mm40Var3 = (mm40) obj8;
                                            fet fetVar6 = (fet) obj9;
                                            int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar6.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD & 1, (iD & 145) != 144)) {
                                                pz40 pz40VarF4 = androidx.compose.runtime.e.f(daxVar2.f5773a, fetVar6);
                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                                bh90 bh90VarM2 = fetVar6.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var3);
                                                mkd.c0.getClass();
                                                fetVar6.i0();
                                                boolean z3 = fetVar6.S;
                                                pcy pcyVar = e7z.u1;
                                                if (z3) {
                                                    fetVar6.l(pcyVar);
                                                } else {
                                                    fetVar6.r0();
                                                }
                                                shd shdVar = gqw0.x;
                                                jpm0.o(fetVar6, tj30VarC, shdVar);
                                                shd shdVar2 = gqw0.w;
                                                jpm0.o(fetVar6, bh90VarM2, shdVar2);
                                                Integer numValueOf2 = Integer.valueOf(iHashCode2);
                                                shd shdVar3 = gqw0.y;
                                                jpm0.o(fetVar6, numValueOf2, shdVar3);
                                                jpm0.n(fetVar6);
                                                shd shdVar4 = gqw0.v;
                                                jpm0.o(fetVar6, mm40VarC1, shdVar4);
                                                final fad fadVar = (fad) pz40VarF4.getValue();
                                                if (fadVar == null) {
                                                    fetVar6.e0(-54251107);
                                                    fetVar6.r(false);
                                                } else {
                                                    boolean z4 = fadVar instanceof dad;
                                                    jm40 jm40Var4 = jm40.b;
                                                    if (z4) {
                                                        fetVar6.e0(-55153269);
                                                        thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar6, 0);
                                                        int iHashCode3 = Long.hashCode(fetVar6.T);
                                                        bh90 bh90VarM3 = fetVar6.m();
                                                        mm40 mm40VarC2 = kbc.c0(fetVar6, jm40Var4);
                                                        fetVar6.i0();
                                                        if (fetVar6.S) {
                                                            fetVar6.l(pcyVar);
                                                        } else {
                                                            fetVar6.r0();
                                                        }
                                                        jpm0.o(fetVar6, thg0VarA, shdVar);
                                                        jpm0.o(fetVar6, bh90VarM3, shdVar2);
                                                        vqd.u(iHashCode3, fetVar6, shdVar3, fetVar6);
                                                        jpm0.o(fetVar6, mm40VarC2, shdVar4);
                                                        j83 j83Var = ((dad) fadVar).f5741a;
                                                        ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                                        v8q0.b(j83Var, jm40Var4, ((ThemeColors) fetVar6.k(zaq0.b)).getTextPrimary(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, g1t0.d(), fetVar6, 48, 24960, 240632);
                                                        fetVar6 = fetVar6;
                                                        fetVar6.r(true);
                                                        fetVar6.r(false);
                                                    } else if (fadVar instanceof ead) {
                                                        fetVar6.e0(-54612753);
                                                        ugd ugdVarM5 = u1c.M(1557081660, new xdr() { // from class: a.nad
                                                            @Override // a.xdr
                                                            public final Object F(Object obj11, Object obj12, Object obj13) {
                                                                byte b12 = b11;
                                                                fad fadVar2 = fadVar;
                                                                yhg0 yhg0Var = (yhg0) obj11;
                                                                fet fetVar7 = (fet) obj12;
                                                                int iIntValue5 = ((Integer) obj13).intValue();
                                                                switch (b12) {
                                                                    case 0:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.f(yhg0Var, ((ead) fadVar2).f7459a.f16461a, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.b(yhg0Var, ((ead) fadVar2).f7459a.b, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.d(yhg0Var, ((ead) fadVar2).f7459a.c, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.e(yhg0Var, ((ead) fadVar2).f7459a.d, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar6);
                                                        final char c2 = c == true ? 1 : 0;
                                                        final byte b12 = 2;
                                                        x1x.j(jm40Var4, ugdVarM5, u1c.M(-599045763, new xdr() { // from class: a.nad
                                                            @Override // a.xdr
                                                            public final Object F(Object obj11, Object obj12, Object obj13) {
                                                                byte b13 = c2;
                                                                fad fadVar2 = fadVar;
                                                                yhg0 yhg0Var = (yhg0) obj11;
                                                                fet fetVar7 = (fet) obj12;
                                                                int iIntValue5 = ((Integer) obj13).intValue();
                                                                switch (b13) {
                                                                    case 0:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.f(yhg0Var, ((ead) fadVar2).f7459a.f16461a, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.b(yhg0Var, ((ead) fadVar2).f7459a.b, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.d(yhg0Var, ((ead) fadVar2).f7459a.c, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.e(yhg0Var, ((ead) fadVar2).f7459a.d, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar6), u1c.M(1539794110, new xdr() { // from class: a.nad
                                                            @Override // a.xdr
                                                            public final Object F(Object obj11, Object obj12, Object obj13) {
                                                                byte b13 = b12;
                                                                fad fadVar2 = fadVar;
                                                                yhg0 yhg0Var = (yhg0) obj11;
                                                                fet fetVar7 = (fet) obj12;
                                                                int iIntValue5 = ((Integer) obj13).intValue();
                                                                switch (b13) {
                                                                    case 0:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.f(yhg0Var, ((ead) fadVar2).f7459a.f16461a, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.b(yhg0Var, ((ead) fadVar2).f7459a.b, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.d(yhg0Var, ((ead) fadVar2).f7459a.c, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.e(yhg0Var, ((ead) fadVar2).f7459a.d, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar6), u1c.M(-616333313, new xdr() { // from class: a.nad
                                                            @Override // a.xdr
                                                            public final Object F(Object obj11, Object obj12, Object obj13) {
                                                                byte b13 = b10;
                                                                fad fadVar2 = fadVar;
                                                                yhg0 yhg0Var = (yhg0) obj11;
                                                                fet fetVar7 = (fet) obj12;
                                                                int iIntValue5 = ((Integer) obj13).intValue();
                                                                switch (b13) {
                                                                    case 0:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.f(yhg0Var, ((ead) fadVar2).f7459a.f16461a, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.b(yhg0Var, ((ead) fadVar2).f7459a.b, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.d(yhg0Var, ((ead) fadVar2).f7459a.c, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.e(yhg0Var, ((ead) fadVar2).f7459a.d, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar6), fetVar6, 28086);
                                                        fetVar6.r(false);
                                                    } else {
                                                        fetVar6.e0(-54251107);
                                                        fetVar6.r(false);
                                                    }
                                                }
                                                fetVar6.r(true);
                                            } else {
                                                fetVar6.X();
                                            }
                                            return Unit.f46060a;
                                        default:
                                            mm40 mm40Var4 = (mm40) obj8;
                                            fet fetVar7 = (fet) obj9;
                                            int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var4);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar7.g(mm40Var4) ? 32 : 16;
                                            }
                                            if (fetVar7.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                sad sadVar = daxVar2.b;
                                                int i6 = iD2 >> 3;
                                                if (sadVar instanceof pad) {
                                                    fetVar7.e0(-1929228897);
                                                    feb.d(mm40Var4, (pad) sadVar, fetVar7, i6 & 14);
                                                    fetVar7.r(false);
                                                } else if (sadVar instanceof rad) {
                                                    fetVar7.e0(-1929223836);
                                                    jeb.d(mm40Var4, (rad) sadVar, fetVar7, i6 & 14);
                                                    fetVar7.r(false);
                                                } else {
                                                    if (!(sadVar instanceof qad)) {
                                                        throw b1j.f(-1929230654, fetVar7, false);
                                                    }
                                                    fetVar7.e0(-1929218818);
                                                    ieb.j(mm40Var4, (qad) sadVar, fetVar7, i6 & 14);
                                                    fetVar7.r(false);
                                                }
                                            } else {
                                                fetVar7.X();
                                            }
                                            return Unit.f46060a;
                                    }
                                }
                            }, fetVar5);
                            ugd ugdVarM5 = u1c.M(-1094904292, new ydr() { // from class: a.mad
                                /* JADX WARN: Code duplicated, block: B:59:0x01e3  */
                                @Override // a.ydr
                                public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                    byte b9 = b4;
                                    dax daxVar2 = daxVar;
                                    final byte b10 = 3;
                                    char c = 1;
                                    final byte b11 = 0;
                                    switch (b9) {
                                        case 0:
                                            mm40 mm40Var3 = (mm40) obj8;
                                            fet fetVar6 = (fet) obj9;
                                            int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                            if ((iD & 48) == 0) {
                                                iD |= fetVar6.g(mm40Var3) ? 32 : 16;
                                            }
                                            if (fetVar6.U(iD & 1, (iD & 145) != 144)) {
                                                pz40 pz40VarF4 = androidx.compose.runtime.e.f(daxVar2.f5773a, fetVar6);
                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                                bh90 bh90VarM2 = fetVar6.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var3);
                                                mkd.c0.getClass();
                                                fetVar6.i0();
                                                boolean z3 = fetVar6.S;
                                                pcy pcyVar = e7z.u1;
                                                if (z3) {
                                                    fetVar6.l(pcyVar);
                                                } else {
                                                    fetVar6.r0();
                                                }
                                                shd shdVar = gqw0.x;
                                                jpm0.o(fetVar6, tj30VarC, shdVar);
                                                shd shdVar2 = gqw0.w;
                                                jpm0.o(fetVar6, bh90VarM2, shdVar2);
                                                Integer numValueOf2 = Integer.valueOf(iHashCode2);
                                                shd shdVar3 = gqw0.y;
                                                jpm0.o(fetVar6, numValueOf2, shdVar3);
                                                jpm0.n(fetVar6);
                                                shd shdVar4 = gqw0.v;
                                                jpm0.o(fetVar6, mm40VarC1, shdVar4);
                                                final fad fadVar = (fad) pz40VarF4.getValue();
                                                if (fadVar == null) {
                                                    fetVar6.e0(-54251107);
                                                    fetVar6.r(false);
                                                } else {
                                                    boolean z4 = fadVar instanceof dad;
                                                    jm40 jm40Var4 = jm40.b;
                                                    if (z4) {
                                                        fetVar6.e0(-55153269);
                                                        thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar6, 0);
                                                        int iHashCode3 = Long.hashCode(fetVar6.T);
                                                        bh90 bh90VarM3 = fetVar6.m();
                                                        mm40 mm40VarC2 = kbc.c0(fetVar6, jm40Var4);
                                                        fetVar6.i0();
                                                        if (fetVar6.S) {
                                                            fetVar6.l(pcyVar);
                                                        } else {
                                                            fetVar6.r0();
                                                        }
                                                        jpm0.o(fetVar6, thg0VarA, shdVar);
                                                        jpm0.o(fetVar6, bh90VarM3, shdVar2);
                                                        vqd.u(iHashCode3, fetVar6, shdVar3, fetVar6);
                                                        jpm0.o(fetVar6, mm40VarC2, shdVar4);
                                                        j83 j83Var = ((dad) fadVar).f5741a;
                                                        ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                                        v8q0.b(j83Var, jm40Var4, ((ThemeColors) fetVar6.k(zaq0.b)).getTextPrimary(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, g1t0.d(), fetVar6, 48, 24960, 240632);
                                                        fetVar6 = fetVar6;
                                                        fetVar6.r(true);
                                                        fetVar6.r(false);
                                                    } else if (fadVar instanceof ead) {
                                                        fetVar6.e0(-54612753);
                                                        ugd ugdVarM6 = u1c.M(1557081660, new xdr() { // from class: a.nad
                                                            @Override // a.xdr
                                                            public final Object F(Object obj11, Object obj12, Object obj13) {
                                                                byte b13 = b11;
                                                                fad fadVar2 = fadVar;
                                                                yhg0 yhg0Var = (yhg0) obj11;
                                                                fet fetVar7 = (fet) obj12;
                                                                int iIntValue5 = ((Integer) obj13).intValue();
                                                                switch (b13) {
                                                                    case 0:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.f(yhg0Var, ((ead) fadVar2).f7459a.f16461a, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.b(yhg0Var, ((ead) fadVar2).f7459a.b, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.d(yhg0Var, ((ead) fadVar2).f7459a.c, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.e(yhg0Var, ((ead) fadVar2).f7459a.d, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar6);
                                                        final byte c2 = c == true ? 1 : 0;
                                                        final byte b12 = 2;
                                                        x1x.j(jm40Var4, ugdVarM6, u1c.M(-599045763, new xdr() { // from class: a.nad
                                                            @Override // a.xdr
                                                            public final Object F(Object obj11, Object obj12, Object obj13) {
                                                                byte b13 = c2;
                                                                fad fadVar2 = fadVar;
                                                                yhg0 yhg0Var = (yhg0) obj11;
                                                                fet fetVar7 = (fet) obj12;
                                                                int iIntValue5 = ((Integer) obj13).intValue();
                                                                switch (b13) {
                                                                    case 0:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.f(yhg0Var, ((ead) fadVar2).f7459a.f16461a, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.b(yhg0Var, ((ead) fadVar2).f7459a.b, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.d(yhg0Var, ((ead) fadVar2).f7459a.c, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.e(yhg0Var, ((ead) fadVar2).f7459a.d, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar6), u1c.M(1539794110, new xdr() { // from class: a.nad
                                                            @Override // a.xdr
                                                            public final Object F(Object obj11, Object obj12, Object obj13) {
                                                                byte b13 = b12;
                                                                fad fadVar2 = fadVar;
                                                                yhg0 yhg0Var = (yhg0) obj11;
                                                                fet fetVar7 = (fet) obj12;
                                                                int iIntValue5 = ((Integer) obj13).intValue();
                                                                switch (b13) {
                                                                    case 0:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.f(yhg0Var, ((ead) fadVar2).f7459a.f16461a, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.b(yhg0Var, ((ead) fadVar2).f7459a.b, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.d(yhg0Var, ((ead) fadVar2).f7459a.c, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.e(yhg0Var, ((ead) fadVar2).f7459a.d, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar6), u1c.M(-616333313, new xdr() { // from class: a.nad
                                                            @Override // a.xdr
                                                            public final Object F(Object obj11, Object obj12, Object obj13) {
                                                                byte b13 = b10;
                                                                fad fadVar2 = fadVar;
                                                                yhg0 yhg0Var = (yhg0) obj11;
                                                                fet fetVar7 = (fet) obj12;
                                                                int iIntValue5 = ((Integer) obj13).intValue();
                                                                switch (b13) {
                                                                    case 0:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.f(yhg0Var, ((ead) fadVar2).f7459a.f16461a, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.b(yhg0Var, ((ead) fadVar2).f7459a.b, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.d(yhg0Var, ((ead) fadVar2).f7459a.c, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        yhg0Var.getClass();
                                                                        if ((iIntValue5 & 6) == 0) {
                                                                            iIntValue5 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                                                        }
                                                                        if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                                                            vsm0.e(yhg0Var, ((ead) fadVar2).f7459a.d, fetVar7, iIntValue5 & 14);
                                                                        } else {
                                                                            fetVar7.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar6), fetVar6, 28086);
                                                        fetVar6.r(false);
                                                    } else {
                                                        fetVar6.e0(-54251107);
                                                        fetVar6.r(false);
                                                    }
                                                }
                                                fetVar6.r(true);
                                            } else {
                                                fetVar6.X();
                                            }
                                            return Unit.f46060a;
                                        default:
                                            mm40 mm40Var4 = (mm40) obj8;
                                            fet fetVar7 = (fet) obj9;
                                            int iD2 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var4);
                                            if ((iD2 & 48) == 0) {
                                                iD2 |= fetVar7.g(mm40Var4) ? 32 : 16;
                                            }
                                            if (fetVar7.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                sad sadVar = daxVar2.b;
                                                int i6 = iD2 >> 3;
                                                if (sadVar instanceof pad) {
                                                    fetVar7.e0(-1929228897);
                                                    feb.d(mm40Var4, (pad) sadVar, fetVar7, i6 & 14);
                                                    fetVar7.r(false);
                                                } else if (sadVar instanceof rad) {
                                                    fetVar7.e0(-1929223836);
                                                    jeb.d(mm40Var4, (rad) sadVar, fetVar7, i6 & 14);
                                                    fetVar7.r(false);
                                                } else {
                                                    if (!(sadVar instanceof qad)) {
                                                        throw b1j.f(-1929230654, fetVar7, false);
                                                    }
                                                    fetVar7.e0(-1929218818);
                                                    ieb.j(mm40Var4, (qad) sadVar, fetVar7, i6 & 14);
                                                    fetVar7.r(false);
                                                }
                                            } else {
                                                fetVar7.X();
                                            }
                                            return Unit.f46060a;
                                    }
                                }
                            }, fetVar5);
                            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar5, 0);
                            int iHashCode2 = Long.hashCode(fetVar5.T);
                            bh90 bh90VarM2 = fetVar5.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarD);
                            mkd.c0.getClass();
                            fetVar5.i0();
                            if (fetVar5.S) {
                                fetVar5.l(e7z.u1);
                            } else {
                                fetVar5.r0();
                            }
                            jpm0.o(fetVar5, x5dVarA2, gqw0.x);
                            jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                            jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                            jpm0.n(fetVar5);
                            jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                            mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var2, 1.0f), null, false, 3);
                            fetVar5.e0(1311223361);
                            y5d y5dVar = y5d.f42040a;
                            ugdVarM4.j(y5dVar, mm40VarW2, fetVar5, 438);
                            fetVar5.r(false);
                            ugdVarM5.j(y5dVar, mm40VarW2, fetVar5, 438);
                            fetVar5.r(true);
                            fetVar5.r(false);
                            fetVar2 = fetVar5;
                        } else if (jaxVar instanceof hax) {
                            fetVar5.e0(1266431381);
                            hax haxVar = (hax) jaxVar;
                            boolean zG16 = fetVar5.g(function9) | fetVar5.g(jaxVar);
                            Object objP21 = fetVar5.P();
                            if (zG16 || objP21 == cl5Var) {
                                objP21 = new n9x(function9, jaxVar, (byte) 0);
                                fetVar5.o0(objP21);
                            }
                            Function1 function10 = (Function1) objP21;
                            function10.getClass();
                            t9x.d(mm40Var2, null, u1c.M(-82844501, new dsw(androidx.compose.runtime.e.f(haxVar.f12746a, fetVar5), (byte) 2), fetVar5), u1c.M(495921644, new d2s(haxVar, function10, (byte) 20), fetVar5), fetVar5, 27654, 6);
                            fetVar2 = fetVar5;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar5;
                            if (jaxVar instanceof iax) {
                                fetVar2.e0(1266442434);
                                final iax iaxVar = (iax) jaxVar;
                                final byte b9 = 2;
                                t9x.d(mm40Var2, u1c.M(402553460, new ydr() { // from class: a.twl0
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        int i6;
                                        byte b10 = b3;
                                        iax iaxVar2 = iaxVar;
                                        switch (b10) {
                                            case 0:
                                                mm40 mm40Var3 = (mm40) obj8;
                                                fet fetVar6 = (fet) obj9;
                                                int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar6.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar6.U(iD & 1, (iD & 145) != 144)) {
                                                    d7x.q((iD >> 3) & 14, fetVar6, iaxVar2.f, mm40Var3);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                break;
                                            case 1:
                                                y5d y5dVar2 = (y5d) obj7;
                                                mm40 mm40Var4 = (mm40) obj8;
                                                fet fetVar7 = (fet) obj9;
                                                int iD2 = dw9.d((Integer) obj10, y5dVar2, mm40Var4);
                                                if ((iD2 & 6) == 0) {
                                                    i6 = (fetVar7.g(y5dVar2) ? 4 : 2) | iD2;
                                                } else {
                                                    i6 = iD2;
                                                }
                                                if ((iD2 & 48) == 0) {
                                                    i6 |= fetVar7.g(mm40Var4) ? 32 : 16;
                                                }
                                                if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                    b34.e(y5dVar2, iaxVar2.f14459a != null, null, kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(857141883, new nhl0(iaxVar2, mm40Var4, (byte) 7), fetVar7), fetVar7, (i6 & 14) | 1600512, 18);
                                                } else {
                                                    fetVar7.X();
                                                }
                                                break;
                                            default:
                                                mm40 mm40Var5 = (mm40) obj8;
                                                fet fetVar8 = (fet) obj9;
                                                int iD3 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var5);
                                                if ((iD3 & 48) == 0) {
                                                    iD3 |= fetVar8.g(mm40Var5) ? 32 : 16;
                                                }
                                                if (fetVar8.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                    x2x.v(mm40Var5, iaxVar2.c, iaxVar2.d, iaxVar2.e, iaxVar2.b, fetVar8, (iD3 >> 3) & 14);
                                                } else {
                                                    fetVar8.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2), u1c.M(571697235, new ydr() { // from class: a.twl0
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        int i6;
                                        byte b10 = b4;
                                        iax iaxVar2 = iaxVar;
                                        switch (b10) {
                                            case 0:
                                                mm40 mm40Var3 = (mm40) obj8;
                                                fet fetVar6 = (fet) obj9;
                                                int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar6.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar6.U(iD & 1, (iD & 145) != 144)) {
                                                    d7x.q((iD >> 3) & 14, fetVar6, iaxVar2.f, mm40Var3);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                break;
                                            case 1:
                                                y5d y5dVar2 = (y5d) obj7;
                                                mm40 mm40Var4 = (mm40) obj8;
                                                fet fetVar7 = (fet) obj9;
                                                int iD2 = dw9.d((Integer) obj10, y5dVar2, mm40Var4);
                                                if ((iD2 & 6) == 0) {
                                                    i6 = (fetVar7.g(y5dVar2) ? 4 : 2) | iD2;
                                                } else {
                                                    i6 = iD2;
                                                }
                                                if ((iD2 & 48) == 0) {
                                                    i6 |= fetVar7.g(mm40Var4) ? 32 : 16;
                                                }
                                                if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                    b34.e(y5dVar2, iaxVar2.f14459a != null, null, kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(857141883, new nhl0(iaxVar2, mm40Var4, (byte) 7), fetVar7), fetVar7, (i6 & 14) | 1600512, 18);
                                                } else {
                                                    fetVar7.X();
                                                }
                                                break;
                                            default:
                                                mm40 mm40Var5 = (mm40) obj8;
                                                fet fetVar8 = (fet) obj9;
                                                int iD3 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var5);
                                                if ((iD3 & 48) == 0) {
                                                    iD3 |= fetVar8.g(mm40Var5) ? 32 : 16;
                                                }
                                                if (fetVar8.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                    x2x.v(mm40Var5, iaxVar2.c, iaxVar2.d, iaxVar2.e, iaxVar2.b, fetVar8, (iD3 >> 3) & 14);
                                                } else {
                                                    fetVar8.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2), u1c.M(740841010, new ydr() { // from class: a.twl0
                                    @Override // a.ydr
                                    public final Object j(Object obj7, Object obj8, Object obj9, Object obj10) {
                                        int i6;
                                        byte b10 = b9;
                                        iax iaxVar2 = iaxVar;
                                        switch (b10) {
                                            case 0:
                                                mm40 mm40Var3 = (mm40) obj8;
                                                fet fetVar6 = (fet) obj9;
                                                int iD = dw9.d((Integer) obj10, (y5d) obj7, mm40Var3);
                                                if ((iD & 48) == 0) {
                                                    iD |= fetVar6.g(mm40Var3) ? 32 : 16;
                                                }
                                                if (fetVar6.U(iD & 1, (iD & 145) != 144)) {
                                                    d7x.q((iD >> 3) & 14, fetVar6, iaxVar2.f, mm40Var3);
                                                } else {
                                                    fetVar6.X();
                                                }
                                                break;
                                            case 1:
                                                y5d y5dVar2 = (y5d) obj7;
                                                mm40 mm40Var4 = (mm40) obj8;
                                                fet fetVar7 = (fet) obj9;
                                                int iD2 = dw9.d((Integer) obj10, y5dVar2, mm40Var4);
                                                if ((iD2 & 6) == 0) {
                                                    i6 = (fetVar7.g(y5dVar2) ? 4 : 2) | iD2;
                                                } else {
                                                    i6 = iD2;
                                                }
                                                if ((iD2 & 48) == 0) {
                                                    i6 |= fetVar7.g(mm40Var4) ? 32 : 16;
                                                }
                                                if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                                                    b34.e(y5dVar2, iaxVar2.f14459a != null, null, kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(857141883, new nhl0(iaxVar2, mm40Var4, (byte) 7), fetVar7), fetVar7, (i6 & 14) | 1600512, 18);
                                                } else {
                                                    fetVar7.X();
                                                }
                                                break;
                                            default:
                                                mm40 mm40Var5 = (mm40) obj8;
                                                fet fetVar8 = (fet) obj9;
                                                int iD3 = dw9.d((Integer) obj10, (y5d) obj7, mm40Var5);
                                                if ((iD3 & 48) == 0) {
                                                    iD3 |= fetVar8.g(mm40Var5) ? 32 : 16;
                                                }
                                                if (fetVar8.U(iD3 & 1, (iD3 & 145) != 144)) {
                                                    x2x.v(mm40Var5, iaxVar2.c, iaxVar2.d, iaxVar2.e, iaxVar2.b, fetVar8, (iD3 >> 3) & 14);
                                                } else {
                                                    fetVar8.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2), fetVar2, 28038, 2);
                                fetVar2.r(false);
                            } else if (jaxVar instanceof fax) {
                                fetVar2.e0(1266448228);
                                fax faxVar = (fax) jaxVar;
                                boolean zG17 = fetVar2.g(function9) | fetVar2.g(jaxVar);
                                Object objP22 = fetVar2.P();
                                if (zG17 || objP22 == cl5Var) {
                                    objP22 = new n9x(function9, jaxVar, (byte) 1);
                                    fetVar2.o0(objP22);
                                }
                                Function1 function11 = (Function1) objP22;
                                function11.getClass();
                                t9x.d(mm40Var2, u1c.M(-1093476783, new csw(faxVar, b4), fetVar2), u1c.M(-829779758, new d2s(androidx.compose.runtime.e.f(faxVar.c, fetVar2), function1, (byte) 3), fetVar2), u1c.M(-566082733, new d2s(faxVar, function11, (byte) 5), fetVar2), fetVar2, 28038, 2);
                                fetVar2.r(false);
                            } else if (jaxVar instanceof gax) {
                                fetVar2.e0(1266460924);
                                t9x.d(mm40Var2, null, u1c.M(-1004186489, new d2s((gax) jaxVar, (Function1) obj5, (byte) 11), fetVar2), null, fetVar2, 3078, 22);
                                fetVar2.r(false);
                            } else if (jaxVar instanceof eax) {
                                fetVar2.e0(1266468358);
                                eax eaxVar = (eax) jaxVar;
                                t9x.d(mm40Var2, u1c.M(1344017229, new csw(eaxVar, b3), fetVar2), u1c.M(1593295630, new dsw(androidx.compose.runtime.e.f(eaxVar.c, fetVar2), b3), fetVar2), ro4.e, fetVar2, 28038, 2);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar5;
                    }
                    throw b1j.f(1266423798, fetVar2, false);
                }
                fetVar5.X();
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                pz40 pz40Var3 = (pz40) obj5;
                Map map = (Map) obj6;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar6.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar6.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar6.U(i3 & 1, (i3 & 147) != 146)) {
                    y0f0 y0f0Var = (y0f0) a4xVar.get(iIntValue5);
                    fetVar6.e0(344911798);
                    y0f0 y0f0Var2 = (y0f0) CollectionsKt.W(iIntValue5 - 1, (a4x) pz40Var3.getValue());
                    y0f0 y0f0Var3 = (y0f0) CollectionsKt.W(iIntValue5 + 1, (a4x) pz40Var3.getValue());
                    if (iIntValue5 == 0) {
                        zcl zclVar3 = qmk.f28987a;
                    } else {
                        if (y0f0Var2 == null || !m2x.y(y0f0Var2)) {
                            zcl zclVar4 = qmk.f28987a;
                            f = 8.0f;
                        } else {
                            zcl zclVar5 = qmk.f28987a;
                        }
                        if (y0f0Var2 == null && m2x.y(y0f0Var2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        b4 = (y0f0Var3 == null && m2x.y(y0f0Var3)) ? (byte) 1 : (byte) 0;
                        z2 = y0f0Var instanceof tpa0;
                        if (z) {
                            f2 = 0.0f;
                        } else {
                            f2 = 16.0f;
                        }
                        if (b4 == 0) {
                            f3 = 16.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (z2) {
                            f4 = 0.0f;
                        } else {
                            f4 = 16.0f;
                        }
                        jm40Var = jm40.b;
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        if (z) {
                            f5 = 0.0f;
                        } else {
                            f5 = 12.0f;
                        }
                        mm40 mm40VarQ = i120.Q(s5x0.L(s5x0.N(mm40VarD2, 0.0f, f5, 0.0f, 0.0f, 13), f8, 0.0f, 2), ((ThemeColors) fetVar6.k(zaq0.b)).getBackgroundContent(), vgg0.b(f2, f2, f3, f3));
                        if (z) {
                            f6 = 12.0f;
                        } else {
                            f6 = 16.0f;
                        }
                        if (b4 == 0) {
                            f7 = 16.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        mm40VarM = s5x0.M(mm40VarQ, f4, f6, f4, f7);
                        if (y0f0Var == null) {
                            fetVar3 = fetVar6;
                        } else {
                            if (y0f0Var instanceof izj0) {
                                fetVar6.e0(-2067064187);
                                ufx.n(cww.p(fetVar6, mm40VarM), (izj0) y0f0Var, (cqq) map.get(y0f0Var.getKey()), this.c, fetVar6, 0);
                                fetVar3 = fetVar6;
                                fetVar3.r(false);
                            } else {
                                fetVar3 = fetVar6;
                                if (y0f0Var instanceof l9q0) {
                                    fetVar3.e0(-2067053284);
                                    u4n0.h(mm40VarM, (l9q0) y0f0Var, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof qfc0) {
                                    fetVar3.e0(-2067045432);
                                    uvw.i(cww.p(fetVar3, mm40VarM), (qfc0) y0f0Var, (cqq) map.get(y0f0Var.getKey()), this.c, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof l090) {
                                    fetVar3.e0(-2067034397);
                                    vdx.o(cww.p(fetVar3, mm40VarM), (l090) y0f0Var, (cqq) map.get(y0f0Var.getKey()), this.c, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof q090) {
                                    fetVar3.e0(-2067023230);
                                    ydx.m(mm40VarM, (q090) y0f0Var, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof jsn) {
                                    fetVar3.e0(-2067015276);
                                    acb.t(mm40VarM, (jsn) y0f0Var, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof egt) {
                                    fetVar3.e0(-2067009004);
                                    qcc.t(mm40VarM, (egt) y0f0Var, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof tpa0) {
                                    fetVar3.e0(-2067001212);
                                    g7x.h(mm40VarM, (tpa0) y0f0Var, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof wl90) {
                                    fetVar3.e0(-2066993376);
                                    u7x.h(cww.p(fetVar3, mm40VarM), (wl90) y0f0Var, (cqq) map.get(y0f0Var.getKey()), this.c, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof he8) {
                                    fetVar3.e0(-2066982797);
                                    o2e.j(mm40VarM, (he8) y0f0Var, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof szb) {
                                    fetVar3.e0(-2066975334);
                                    float f9 = this.d;
                                    pzb.a(s5x0.N(jm40Var, f9, f, f9, 0.0f, 8), (szb) y0f0Var, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof n02) {
                                    fetVar3.e0(-2066962661);
                                    float f10 = this.d;
                                    nia0.f(s5x0.N(jm40Var, f10, f, f10, 0.0f, 8), (n02) y0f0Var, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (y0f0Var instanceof gjk0) {
                                    fetVar3.e0(-2066950011);
                                    uvw.l(s5x0.L(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), f8, 0.0f, 2), (gjk0) y0f0Var, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                }
                            }
                            fetVar3.r(false);
                        }
                        fetVar3.e0(-2066938977);
                        fetVar3.r(false);
                        fetVar3.r(false);
                    }
                    f = 12.0f;
                    if (y0f0Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (y0f0Var3 == null) {
                    }
                    z2 = y0f0Var instanceof tpa0;
                    if (z) {
                        f2 = 16.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (b4 == 0) {
                        f3 = 16.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (z2) {
                        f4 = 0.0f;
                    } else {
                        f4 = 16.0f;
                    }
                    jm40Var = jm40.b;
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    if (z) {
                        f5 = 12.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    mm40 mm40VarQ2 = i120.Q(s5x0.L(s5x0.N(mm40VarD3, 0.0f, f5, 0.0f, 0.0f, 13), f8, 0.0f, 2), ((ThemeColors) fetVar6.k(zaq0.b)).getBackgroundContent(), vgg0.b(f2, f2, f3, f3));
                    if (z) {
                        f6 = 16.0f;
                    } else {
                        f6 = 12.0f;
                    }
                    if (b4 == 0) {
                        f7 = 16.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    mm40VarM = s5x0.M(mm40VarQ2, f4, f6, f4, f7);
                    if (y0f0Var == null) {
                        fetVar3 = fetVar6;
                    } else {
                        if (y0f0Var instanceof izj0) {
                            fetVar6.e0(-2067064187);
                            ufx.n(cww.p(fetVar6, mm40VarM), (izj0) y0f0Var, (cqq) map.get(y0f0Var.getKey()), this.c, fetVar6, 0);
                            fetVar3 = fetVar6;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar6;
                            if (y0f0Var instanceof l9q0) {
                                fetVar3.e0(-2067053284);
                                u4n0.h(mm40VarM, (l9q0) y0f0Var, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof qfc0) {
                                fetVar3.e0(-2067045432);
                                uvw.i(cww.p(fetVar3, mm40VarM), (qfc0) y0f0Var, (cqq) map.get(y0f0Var.getKey()), this.c, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof l090) {
                                fetVar3.e0(-2067034397);
                                vdx.o(cww.p(fetVar3, mm40VarM), (l090) y0f0Var, (cqq) map.get(y0f0Var.getKey()), this.c, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof q090) {
                                fetVar3.e0(-2067023230);
                                ydx.m(mm40VarM, (q090) y0f0Var, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof jsn) {
                                fetVar3.e0(-2067015276);
                                acb.t(mm40VarM, (jsn) y0f0Var, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof egt) {
                                fetVar3.e0(-2067009004);
                                qcc.t(mm40VarM, (egt) y0f0Var, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof tpa0) {
                                fetVar3.e0(-2067001212);
                                g7x.h(mm40VarM, (tpa0) y0f0Var, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof wl90) {
                                fetVar3.e0(-2066993376);
                                u7x.h(cww.p(fetVar3, mm40VarM), (wl90) y0f0Var, (cqq) map.get(y0f0Var.getKey()), this.c, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof he8) {
                                fetVar3.e0(-2066982797);
                                o2e.j(mm40VarM, (he8) y0f0Var, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof szb) {
                                fetVar3.e0(-2066975334);
                                float f11 = this.d;
                                pzb.a(s5x0.N(jm40Var, f11, f, f11, 0.0f, 8), (szb) y0f0Var, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof n02) {
                                fetVar3.e0(-2066962661);
                                float f12 = this.d;
                                nia0.f(s5x0.N(jm40Var, f12, f, f12, 0.0f, 8), (n02) y0f0Var, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (y0f0Var instanceof gjk0) {
                                fetVar3.e0(-2066950011);
                                uvw.l(s5x0.L(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), f8, 0.0f, 2), (gjk0) y0f0Var, function1, fetVar3, 0);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    }
                    fetVar3.e0(-2066938977);
                    fetVar3.r(false);
                    fetVar3.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                g9zVar4.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar7.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar7.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar7.U(i4 & 1, (i4 & 147) != 146)) {
                    deo0 deo0Var = (deo0) ((List) obj6).get(iIntValue7);
                    fetVar7.e0(835117059);
                    mm40 mm40VarD4 = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40VarD4, 80.0f);
                    boolean zG18 = fetVar7.g(deo0Var);
                    Object objP23 = fetVar7.P();
                    if (zG18 || objP23 == cl5Var) {
                        objP23 = new qeo0(deo0Var, (byte) 1);
                        fetVar7.o0(objP23);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarE2, (Function1) objP23);
                    boolean zG19 = fetVar7.g(function1) | fetVar7.g(deo0Var);
                    Object objP24 = fetVar7.P();
                    if (zG19 || objP24 == cl5Var) {
                        objP24 = new reo0(function1, deo0Var, (byte) 1);
                        fetVar7.o0(objP24);
                    }
                    r8x.r(s5x0.N(yyw.W(0, 1, fetVar7, mm40VarK, (Function0) objP24, false), 0.0f, 0.0f, this.d, 0.0f, 11), deo0Var, this.b, (ucr0) obj5, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
        }
    }

    public d7s(a4x a4xVar, Function1 function1, xak xakVar, nek nekVar, float f) {
        this.b = a4xVar;
        this.c = function1;
        this.e = xakVar;
        this.f = nekVar;
        this.d = f;
    }

    public d7s(a4x a4xVar, Function2 function2, Function1 function1, Function1 function3, float f) {
        this.b = a4xVar;
        this.e = function2;
        this.c = function1;
        this.f = function3;
        this.d = f;
    }

    public d7s(List list, Function1 function1, float f, a4x a4xVar, ucr0 ucr0Var) {
        this.e = list;
        this.c = function1;
        this.d = f;
        this.b = a4xVar;
        this.f = ucr0Var;
    }
}
