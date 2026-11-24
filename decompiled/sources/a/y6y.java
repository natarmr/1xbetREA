package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y6y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42123a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ a8q0 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String j;

    public /* synthetic */ y6y(String str, long j, a8q0 a8q0Var, pz40 pz40Var, pz40 pz40Var2, Function1 function1, Function1 function2, boolean z, String str2, byte b) {
        this.f42123a = b;
        this.b = str;
        this.c = j;
        this.d = a8q0Var;
        this.e = pz40Var;
        this.f = pz40Var2;
        this.g = function1;
        this.h = function2;
        this.i = z;
        this.j = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42123a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        final String str = this.j;
        Function1 function1 = this.h;
        long j = this.c;
        String str2 = this.b;
        boolean z = false;
        final byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    y9q0 y9q0VarJ = g1t0.j();
                    zfn zfnVar = zaq0.b;
                    y9q0 y9q0VarA = y9q0.a(y9q0VarJ, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744446);
                    pvf pvfVar = new pvf(str2, j, (byte) 2);
                    skk0 skk0Var = new skk0(((ThemeColors) fetVar.k(zfnVar)).getPrimary());
                    uly ulyVar = new uly(0, null, 9, 0, 123);
                    mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                    final a8q0 a8q0Var = this.d;
                    boolean zG = fetVar.g(a8q0Var);
                    final pz40 pz40Var = this.e;
                    boolean zG2 = zG | fetVar.g(pz40Var);
                    final pz40 pz40Var2 = this.f;
                    boolean zG3 = zG2 | fetVar.g(pz40Var2);
                    final Function1 function2 = this.g;
                    boolean zG4 = zG3 | fetVar.g(function2);
                    Object objP = fetVar.P();
                    if (zG4 || objP == cl5Var) {
                        final byte b3 = 0;
                        objP = new Function1() { // from class: a.a7y
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                byte b4 = b3;
                                pz40 pz40Var3 = pz40Var2;
                                pz40 pz40Var4 = pz40Var;
                                Function1 function3 = function2;
                                a8q0 a8q0Var2 = a8q0Var;
                                iqq iqqVar = (iqq) obj3;
                                iqqVar.getClass();
                                switch (b4) {
                                    case 0:
                                        if (iqqVar.b() && a8q0Var2.f440a.b.length() > 0 && !((Boolean) pz40Var4.getValue()).booleanValue() && ((Boolean) pz40Var3.getValue()).booleanValue()) {
                                            pz40Var3.setValue(Boolean.FALSE);
                                            pz40Var4.setValue(Boolean.TRUE);
                                        }
                                        if (function3 != null) {
                                            function3.invoke(Boolean.valueOf(iqqVar.b()));
                                        }
                                        break;
                                    default:
                                        if (iqqVar.b() && a8q0Var2.f440a.b.length() > 0 && !((Boolean) pz40Var4.getValue()).booleanValue() && ((Boolean) pz40Var3.getValue()).booleanValue()) {
                                            pz40Var3.setValue(Boolean.FALSE);
                                            pz40Var4.setValue(Boolean.TRUE);
                                        }
                                        if (function3 != null) {
                                            function3.invoke(Boolean.valueOf(iqqVar.b()));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarB0 = j120.b0(mm40VarY, (Function1) objP);
                    boolean zG5 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    Object obj3 = objP2;
                    if (zG5 || objP2 == cl5Var) {
                        i1y i1yVar = new i1y(function1, (byte) 6);
                        fetVar.o0(i1yVar);
                        obj3 = i1yVar;
                    }
                    final boolean z2 = z ? 1 : 0;
                    z96.a(a8q0Var, (Function1) obj3, mm40VarB0, this.i, false, y9q0VarA, ulyVar, null, true, 0, 0, pvfVar, null, null, skk0Var, u1c.M(1459890999, new xdr() { // from class: a.b7y
                        @Override // a.xdr
                        public final Object F(Object obj4, Object obj5, Object obj6) {
                            boolean z3;
                            boolean z4;
                            fet fetVar2;
                            byte b4 = z2;
                            Function0 function0 = e7z.u1;
                            Object obj7 = ukd.f35823a;
                            a8q0 a8q0Var2 = a8q0Var;
                            switch (b4) {
                                case 0:
                                    Function2 function3 = (Function2) obj4;
                                    fet fetVar3 = (fet) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    function3.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= fetVar3.i(function3) ? 4 : 2;
                                    }
                                    int i = iIntValue2;
                                    if (fetVar3.U(i & 1, (i & 19) != 18)) {
                                        Object objP3 = fetVar3.P();
                                        if (objP3 == obj7) {
                                            objP3 = androidx.compose.runtime.e.b(0);
                                            fetVar3.o0(objP3);
                                        }
                                        cgk0 cgk0Var = (cgk0) objP3;
                                        jm40 jm40Var2 = jm40.b;
                                        mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
                                        tj30 tj30VarC = zq8.c(gqw0.e, false);
                                        int iHashCode = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM = fetVar3.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarL);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(function0);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        shd shdVar = gqw0.x;
                                        jpm0.o(fetVar3, tj30VarC, shdVar);
                                        shd shdVar2 = gqw0.w;
                                        jpm0.o(fetVar3, bh90VarM, shdVar2);
                                        Integer numValueOf = Integer.valueOf(iHashCode);
                                        shd shdVar3 = gqw0.y;
                                        jpm0.o(fetVar3, numValueOf, shdVar3);
                                        jpm0.n(fetVar3);
                                        shd shdVar4 = gqw0.v;
                                        jpm0.o(fetVar3, mm40VarC0, shdVar4);
                                        if (a8q0Var2.f440a.b.length() == 0) {
                                            fetVar3.e0(1001788778);
                                            mm40 mm40VarN = s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                                            Object objP4 = fetVar3.P();
                                            if (objP4 == obj7) {
                                                objP4 = new nw6(cgk0Var, (byte) 21);
                                                fetVar3.o0(objP4);
                                            }
                                            mm40 mm40VarD0 = ro4.d0(mm40VarN, (Function1) objP4);
                                            ((g1t0) fetVar3.k(j1t0.e)).getClass();
                                            v8q0.a(str, mm40VarD0, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary60(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar3, 0, 24960, 110584);
                                            Object objP5 = fetVar3.P();
                                            if (objP5 == obj7) {
                                                objP5 = new nw6(cgk0Var, (byte) 23);
                                                fetVar3.o0(objP5);
                                            }
                                            mm40 mm40VarP = ffb0.P(jm40Var2, (Function1) objP5);
                                            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                                            int iHashCode2 = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM2 = fetVar3.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarP);
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(function0);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC2, shdVar);
                                            jpm0.o(fetVar3, bh90VarM2, shdVar2);
                                            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC1, shdVar4);
                                            function3.invoke(fetVar3, Integer.valueOf(i & 14));
                                            z3 = true;
                                            fetVar3.r(true);
                                            fetVar3.r(false);
                                        } else {
                                            z3 = true;
                                            fetVar3.e0(1002726249);
                                            h97.q(i & 14, fetVar3, function3, false);
                                        }
                                        fetVar3.r(z3);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    Function2 function4 = (Function2) obj4;
                                    fet fetVar4 = (fet) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    function4.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar4.i(function4) ? 4 : 2;
                                    }
                                    int i2 = iIntValue3;
                                    if (fetVar4.U(i2 & 1, (i2 & 19) != 18)) {
                                        Object objP6 = fetVar4.P();
                                        if (objP6 == obj7) {
                                            objP6 = androidx.compose.runtime.e.b(0);
                                            fetVar4.o0(objP6);
                                        }
                                        cgk0 cgk0Var2 = (cgk0) objP6;
                                        jm40 jm40Var3 = jm40.b;
                                        mm40 mm40VarD2 = o7k0.d(jm40Var3, 1.0f);
                                        zcl zclVar2 = qmk.f28987a;
                                        mm40 mm40VarL2 = s5x0.L(mm40VarD2, 8.0f, 0.0f, 2);
                                        tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                                        int iHashCode3 = Long.hashCode(fetVar4.T);
                                        bh90 bh90VarM3 = fetVar4.m();
                                        mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarL2);
                                        mkd.c0.getClass();
                                        fetVar4.i0();
                                        if (fetVar4.S) {
                                            fetVar4.l(function0);
                                        } else {
                                            fetVar4.r0();
                                        }
                                        shd shdVar5 = gqw0.x;
                                        jpm0.o(fetVar4, tj30VarC3, shdVar5);
                                        shd shdVar6 = gqw0.w;
                                        jpm0.o(fetVar4, bh90VarM3, shdVar6);
                                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                                        shd shdVar7 = gqw0.y;
                                        jpm0.o(fetVar4, numValueOf2, shdVar7);
                                        jpm0.n(fetVar4);
                                        shd shdVar8 = gqw0.v;
                                        jpm0.o(fetVar4, mm40VarC2, shdVar8);
                                        if (a8q0Var2.f440a.b.length() == 0) {
                                            fetVar4.e0(400254148);
                                            mm40 mm40VarN2 = s5x0.N(jm40Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                                            Object objP7 = fetVar4.P();
                                            if (objP7 == obj7) {
                                                objP7 = new nw6(cgk0Var2, (byte) 22);
                                                fetVar4.o0(objP7);
                                            }
                                            mm40 mm40VarD1 = ro4.d0(mm40VarN2, (Function1) objP7);
                                            ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                            v8q0.a(str, mm40VarD1, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary60(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar4, 0, 24960, 110584);
                                            fet fetVar5 = fetVar4;
                                            Object objP8 = fetVar5.P();
                                            if (objP8 == obj7) {
                                                objP8 = new nw6(cgk0Var2, (byte) 24);
                                                fetVar5.o0(objP8);
                                            }
                                            mm40 mm40VarP2 = ffb0.P(jm40Var3, (Function1) objP8);
                                            tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                                            int iHashCode4 = Long.hashCode(fetVar5.T);
                                            bh90 bh90VarM4 = fetVar5.m();
                                            mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarP2);
                                            fetVar5.i0();
                                            if (fetVar5.S) {
                                                fetVar5.l(function0);
                                            } else {
                                                fetVar5.r0();
                                            }
                                            jpm0.o(fetVar5, tj30VarC4, shdVar5);
                                            jpm0.o(fetVar5, bh90VarM4, shdVar6);
                                            vqd.u(iHashCode4, fetVar5, shdVar7, fetVar5);
                                            jpm0.o(fetVar5, mm40VarC3, shdVar8);
                                            function4.invoke(fetVar5, Integer.valueOf(i2 & 14));
                                            z4 = true;
                                            fetVar5.r(true);
                                            fetVar5.r(false);
                                            fetVar2 = fetVar5;
                                        } else {
                                            fet fetVar6 = fetVar4;
                                            z4 = true;
                                            fetVar6.e0(401199307);
                                            h97.q(i2 & 14, fetVar6, function4, false);
                                            fetVar2 = fetVar6;
                                        }
                                        fetVar2.r(z4);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 102236160, 196608, 13968);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    y9q0 y9q0VarJ2 = g1t0.j();
                    zfn zfnVar2 = zaq0.b;
                    y9q0 y9q0VarA2 = y9q0.a(y9q0VarJ2, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744446);
                    pvf pvfVar2 = new pvf(str2, j, (byte) 1);
                    skk0 skk0Var2 = new skk0(((ThemeColors) fetVar2.k(zfnVar2)).getPrimary());
                    uly ulyVar2 = new uly(0, null, 9, 0, 123);
                    mm40 mm40VarY2 = o7k0.y(jm40Var, null, 3);
                    final a8q0 a8q0Var2 = this.d;
                    boolean zG6 = fetVar2.g(a8q0Var2);
                    final pz40 pz40Var3 = this.e;
                    boolean zG7 = zG6 | fetVar2.g(pz40Var3);
                    final pz40 pz40Var4 = this.f;
                    boolean zG8 = zG7 | fetVar2.g(pz40Var4);
                    final Function1 function3 = this.g;
                    boolean zG9 = zG8 | fetVar2.g(function3);
                    Object objP3 = fetVar2.P();
                    if (zG9 || objP3 == cl5Var) {
                        final byte b4 = 1;
                        objP3 = new Function1() { // from class: a.a7y
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b5 = b4;
                                pz40 pz40Var5 = pz40Var4;
                                pz40 pz40Var6 = pz40Var3;
                                Function1 function4 = function3;
                                a8q0 a8q0Var3 = a8q0Var2;
                                iqq iqqVar = (iqq) obj4;
                                iqqVar.getClass();
                                switch (b5) {
                                    case 0:
                                        if (iqqVar.b() && a8q0Var3.f440a.b.length() > 0 && !((Boolean) pz40Var6.getValue()).booleanValue() && ((Boolean) pz40Var5.getValue()).booleanValue()) {
                                            pz40Var5.setValue(Boolean.FALSE);
                                            pz40Var6.setValue(Boolean.TRUE);
                                        }
                                        if (function4 != null) {
                                            function4.invoke(Boolean.valueOf(iqqVar.b()));
                                        }
                                        break;
                                    default:
                                        if (iqqVar.b() && a8q0Var3.f440a.b.length() > 0 && !((Boolean) pz40Var6.getValue()).booleanValue() && ((Boolean) pz40Var5.getValue()).booleanValue()) {
                                            pz40Var5.setValue(Boolean.FALSE);
                                            pz40Var6.setValue(Boolean.TRUE);
                                        }
                                        if (function4 != null) {
                                            function4.invoke(Boolean.valueOf(iqqVar.b()));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40VarB1 = j120.b0(mm40VarY2, (Function1) objP3);
                    boolean zG10 = fetVar2.g(function1);
                    Object objP4 = fetVar2.P();
                    Object obj4 = objP4;
                    if (zG10 || objP4 == cl5Var) {
                        i1y i1yVar2 = new i1y(function1, (byte) 7);
                        fetVar2.o0(i1yVar2);
                        obj4 = i1yVar2;
                    }
                    z96.a(a8q0Var2, (Function1) obj4, mm40VarB1, this.i, false, y9q0VarA2, ulyVar2, null, true, 0, 0, pvfVar2, null, null, skk0Var2, u1c.M(1956592149, new xdr() { // from class: a.b7y
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            boolean z3;
                            boolean z4;
                            fet fetVar3;
                            byte b5 = b2;
                            Function0 function0 = e7z.u1;
                            Object obj8 = ukd.f35823a;
                            a8q0 a8q0Var3 = a8q0Var2;
                            switch (b5) {
                                case 0:
                                    Function2 function4 = (Function2) obj5;
                                    fet fetVar4 = (fet) obj6;
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    function4.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar4.i(function4) ? 4 : 2;
                                    }
                                    int i = iIntValue3;
                                    if (fetVar4.U(i & 1, (i & 19) != 18)) {
                                        Object objP5 = fetVar4.P();
                                        if (objP5 == obj8) {
                                            objP5 = androidx.compose.runtime.e.b(0);
                                            fetVar4.o0(objP5);
                                        }
                                        cgk0 cgk0Var = (cgk0) objP5;
                                        jm40 jm40Var2 = jm40.b;
                                        mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
                                        tj30 tj30VarC = zq8.c(gqw0.e, false);
                                        int iHashCode = Long.hashCode(fetVar4.T);
                                        bh90 bh90VarM = fetVar4.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarL);
                                        mkd.c0.getClass();
                                        fetVar4.i0();
                                        if (fetVar4.S) {
                                            fetVar4.l(function0);
                                        } else {
                                            fetVar4.r0();
                                        }
                                        shd shdVar = gqw0.x;
                                        jpm0.o(fetVar4, tj30VarC, shdVar);
                                        shd shdVar2 = gqw0.w;
                                        jpm0.o(fetVar4, bh90VarM, shdVar2);
                                        Integer numValueOf = Integer.valueOf(iHashCode);
                                        shd shdVar3 = gqw0.y;
                                        jpm0.o(fetVar4, numValueOf, shdVar3);
                                        jpm0.n(fetVar4);
                                        shd shdVar4 = gqw0.v;
                                        jpm0.o(fetVar4, mm40VarC0, shdVar4);
                                        if (a8q0Var3.f440a.b.length() == 0) {
                                            fetVar4.e0(1001788778);
                                            mm40 mm40VarN = s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                                            Object objP6 = fetVar4.P();
                                            if (objP6 == obj8) {
                                                objP6 = new nw6(cgk0Var, (byte) 21);
                                                fetVar4.o0(objP6);
                                            }
                                            mm40 mm40VarD0 = ro4.d0(mm40VarN, (Function1) objP6);
                                            ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                            v8q0.a(str, mm40VarD0, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary60(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar4, 0, 24960, 110584);
                                            Object objP7 = fetVar4.P();
                                            if (objP7 == obj8) {
                                                objP7 = new nw6(cgk0Var, (byte) 23);
                                                fetVar4.o0(objP7);
                                            }
                                            mm40 mm40VarP = ffb0.P(jm40Var2, (Function1) objP7);
                                            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                                            int iHashCode2 = Long.hashCode(fetVar4.T);
                                            bh90 bh90VarM2 = fetVar4.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarP);
                                            fetVar4.i0();
                                            if (fetVar4.S) {
                                                fetVar4.l(function0);
                                            } else {
                                                fetVar4.r0();
                                            }
                                            jpm0.o(fetVar4, tj30VarC2, shdVar);
                                            jpm0.o(fetVar4, bh90VarM2, shdVar2);
                                            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
                                            jpm0.o(fetVar4, mm40VarC1, shdVar4);
                                            function4.invoke(fetVar4, Integer.valueOf(i & 14));
                                            z3 = true;
                                            fetVar4.r(true);
                                            fetVar4.r(false);
                                        } else {
                                            z3 = true;
                                            fetVar4.e0(1002726249);
                                            h97.q(i & 14, fetVar4, function4, false);
                                        }
                                        fetVar4.r(z3);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                                default:
                                    Function2 function5 = (Function2) obj5;
                                    fet fetVar5 = (fet) obj6;
                                    int iIntValue4 = ((Integer) obj7).intValue();
                                    function5.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= fetVar5.i(function5) ? 4 : 2;
                                    }
                                    int i2 = iIntValue4;
                                    if (fetVar5.U(i2 & 1, (i2 & 19) != 18)) {
                                        Object objP8 = fetVar5.P();
                                        if (objP8 == obj8) {
                                            objP8 = androidx.compose.runtime.e.b(0);
                                            fetVar5.o0(objP8);
                                        }
                                        cgk0 cgk0Var2 = (cgk0) objP8;
                                        jm40 jm40Var3 = jm40.b;
                                        mm40 mm40VarD2 = o7k0.d(jm40Var3, 1.0f);
                                        zcl zclVar2 = qmk.f28987a;
                                        mm40 mm40VarL2 = s5x0.L(mm40VarD2, 8.0f, 0.0f, 2);
                                        tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                                        int iHashCode3 = Long.hashCode(fetVar5.T);
                                        bh90 bh90VarM3 = fetVar5.m();
                                        mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarL2);
                                        mkd.c0.getClass();
                                        fetVar5.i0();
                                        if (fetVar5.S) {
                                            fetVar5.l(function0);
                                        } else {
                                            fetVar5.r0();
                                        }
                                        shd shdVar5 = gqw0.x;
                                        jpm0.o(fetVar5, tj30VarC3, shdVar5);
                                        shd shdVar6 = gqw0.w;
                                        jpm0.o(fetVar5, bh90VarM3, shdVar6);
                                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                                        shd shdVar7 = gqw0.y;
                                        jpm0.o(fetVar5, numValueOf2, shdVar7);
                                        jpm0.n(fetVar5);
                                        shd shdVar8 = gqw0.v;
                                        jpm0.o(fetVar5, mm40VarC2, shdVar8);
                                        if (a8q0Var3.f440a.b.length() == 0) {
                                            fetVar5.e0(400254148);
                                            mm40 mm40VarN2 = s5x0.N(jm40Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                                            Object objP9 = fetVar5.P();
                                            if (objP9 == obj8) {
                                                objP9 = new nw6(cgk0Var2, (byte) 22);
                                                fetVar5.o0(objP9);
                                            }
                                            mm40 mm40VarD1 = ro4.d0(mm40VarN2, (Function1) objP9);
                                            ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                            v8q0.a(str, mm40VarD1, ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary60(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar5, 0, 24960, 110584);
                                            fet fetVar6 = fetVar5;
                                            Object objP10 = fetVar6.P();
                                            if (objP10 == obj8) {
                                                objP10 = new nw6(cgk0Var2, (byte) 24);
                                                fetVar6.o0(objP10);
                                            }
                                            mm40 mm40VarP2 = ffb0.P(jm40Var3, (Function1) objP10);
                                            tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                                            int iHashCode4 = Long.hashCode(fetVar6.T);
                                            bh90 bh90VarM4 = fetVar6.m();
                                            mm40 mm40VarC3 = kbc.c0(fetVar6, mm40VarP2);
                                            fetVar6.i0();
                                            if (fetVar6.S) {
                                                fetVar6.l(function0);
                                            } else {
                                                fetVar6.r0();
                                            }
                                            jpm0.o(fetVar6, tj30VarC4, shdVar5);
                                            jpm0.o(fetVar6, bh90VarM4, shdVar6);
                                            vqd.u(iHashCode4, fetVar6, shdVar7, fetVar6);
                                            jpm0.o(fetVar6, mm40VarC3, shdVar8);
                                            function5.invoke(fetVar6, Integer.valueOf(i2 & 14));
                                            z4 = true;
                                            fetVar6.r(true);
                                            fetVar6.r(false);
                                            fetVar3 = fetVar6;
                                        } else {
                                            fet fetVar7 = fetVar5;
                                            z4 = true;
                                            fetVar7.e0(401199307);
                                            h97.q(i2 & 14, fetVar7, function5, false);
                                            fetVar3 = fetVar7;
                                        }
                                        fetVar3.r(z4);
                                    } else {
                                        fetVar5.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), fetVar2, 102236160, 196608, 13968);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
