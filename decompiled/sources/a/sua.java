package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final class sua implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a4x f32811a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nek d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ xak f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function1 j;

    public sua(a4x a4xVar, Function2 function2, boolean z, nek nekVar, Function1 function1, xak xakVar, Function2 function3, Function1 function4, Function1 function5, Function1 function6) {
        this.f32811a = a4xVar;
        this.b = function2;
        this.c = z;
        this.d = nekVar;
        this.e = function1;
        this.f = xakVar;
        this.g = function3;
        this.h = function4;
        this.i = function5;
        this.j = function6;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        final byte b = 1;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            cja cjaVar = (cja) this.f32811a.get(iIntValue);
            fetVar.e0(-655222461);
            mm40 mm40VarC = g9z.c(g9zVar);
            if (cjaVar != null) {
                boolean z2 = cjaVar instanceof jia;
                Function2 function2 = this.b;
                if (z2) {
                    fetVar.e0(533054104);
                    rsr0.r(mm40VarC, ((jia) cjaVar).f16564a, function2, fetVar, 0, 0);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (cjaVar instanceof lfa) {
                    fetVar.e0(-654968851);
                    dj8.o(mm40VarC, (lfa) cjaVar, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (cjaVar instanceof xja) {
                        fetVar.e0(533064518);
                        rsr0.r(mm40VarC, xja.c, null, fetVar, 0, 4);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else {
                        boolean z3 = cjaVar instanceof soa;
                        Function1 function1 = this.e;
                        boolean z4 = this.c;
                        if (z3) {
                            fetVar.e0(533068775);
                            mm40 mm40VarI = wha0.I(mm40VarC, z4, fetVar);
                            nek nekVar = this.d;
                            nekVar.getClass();
                            z = false;
                            gmn0.a(mm40VarI, null, ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), 0L, 0.0f, 0.0f, null, u1c.M(-320581934, new zb8((soa) cjaVar, nekVar, function1, (byte) 26), fetVar), fetVar, 12582912, 122);
                            fetVar = fetVar;
                            fetVar.r(false);
                        } else {
                            z = false;
                            if (cjaVar instanceof ara) {
                                fetVar.e0(533078980);
                                mm40 mm40VarI2 = wha0.I(mm40VarC, z4, fetVar);
                                xak xakVar = this.f;
                                xakVar.getClass();
                                gmn0.a(mm40VarI2, null, ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), 0L, 0.0f, 0.0f, null, u1c.M(778250022, new zb8((ara) cjaVar, xakVar, function1, (byte) 27), fetVar), fetVar, 12582912, 122);
                                fetVar = fetVar;
                                fetVar.r(false);
                            } else {
                                boolean z5 = cjaVar instanceof joa;
                                cl5 cl5Var = ukd.f35823a;
                                if (z5) {
                                    fetVar.e0(533088711);
                                    final joa joaVar = (joa) cjaVar;
                                    Object objP = fetVar.P();
                                    if (objP == cl5Var) {
                                        final byte b2 = z ? (byte) 1 : (byte) 0;
                                        objP = jgk0.b(new Function0() { // from class: a.goa
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                byte b3 = b2;
                                                joa joaVar2 = joaVar;
                                                switch (b3) {
                                                    case 0:
                                                        return joaVar2.c;
                                                    default:
                                                        return joaVar2.b;
                                                }
                                            }
                                        });
                                        fetVar.o0(objP);
                                    }
                                    l7m0 l7m0Var = (l7m0) objP;
                                    Object objP2 = fetVar.P();
                                    if (objP2 == cl5Var) {
                                        objP2 = jgk0.b(new Function0() { // from class: a.goa
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                byte b3 = b;
                                                joa joaVar2 = joaVar;
                                                switch (b3) {
                                                    case 0:
                                                        return joaVar2.c;
                                                    default:
                                                        return joaVar2.b;
                                                }
                                            }
                                        });
                                        fetVar.o0(objP2);
                                    }
                                    zcl zclVar = qmk.f28987a;
                                    ny9.e(s5x0.N(mm40VarC, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, u1c.M(-2093131189, new g54(l7m0Var, this.g, joaVar, (l7m0) objP2, (byte) 7), fetVar), u1c.M(1218842730, new awh(joaVar, (byte) 15), fetVar), fetVar, 27648, 6);
                                    fetVar.r(false);
                                } else if (cjaVar instanceof yoa) {
                                    fetVar.e0(533095447);
                                    final yoa yoaVar = (yoa) cjaVar;
                                    final byte b3 = z ? (byte) 1 : (byte) 0;
                                    ny9.e(mm40VarC, null, u1c.M(-1805194402, new ydr() { // from class: a.uoa
                                        @Override // a.ydr
                                        public final Object j(Object obj5, Object obj6, Object obj7, Object obj8) {
                                            int i2;
                                            byte b4 = b3;
                                            yoa yoaVar2 = yoaVar;
                                            y5d y5dVar = (y5d) obj5;
                                            switch (b4) {
                                                case 0:
                                                    mm40 mm40Var = (mm40) obj6;
                                                    fet fetVar2 = (fet) obj7;
                                                    int iD = dw9.d((Integer) obj8, y5dVar, mm40Var);
                                                    if ((iD & 6) == 0) {
                                                        i2 = (fetVar2.g(y5dVar) ? 4 : 2) | iD;
                                                    } else {
                                                        i2 = iD;
                                                    }
                                                    if ((iD & 48) == 0) {
                                                        i2 |= fetVar2.g(mm40Var) ? 32 : 16;
                                                    }
                                                    if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                                                        zcl zclVar2 = qmk.f28987a;
                                                        msm0.f(y5dVar.b(s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), true), yoaVar2.f42975a, fetVar2, 0);
                                                    } else {
                                                        fetVar2.X();
                                                    }
                                                    break;
                                                default:
                                                    mm40 mm40Var2 = (mm40) obj6;
                                                    fet fetVar3 = (fet) obj7;
                                                    int iD2 = dw9.d((Integer) obj8, y5dVar, mm40Var2);
                                                    if ((iD2 & 48) == 0) {
                                                        iD2 |= fetVar3.g(mm40Var2) ? 32 : 16;
                                                    }
                                                    if (fetVar3.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                        ccq0.e(mm40Var2, yoaVar2.b, fetVar3);
                                                    } else {
                                                        fetVar3.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar), u1c.M(-1541497377, new ydr() { // from class: a.uoa
                                        @Override // a.ydr
                                        public final Object j(Object obj5, Object obj6, Object obj7, Object obj8) {
                                            int i2;
                                            byte b4 = b;
                                            yoa yoaVar2 = yoaVar;
                                            y5d y5dVar = (y5d) obj5;
                                            switch (b4) {
                                                case 0:
                                                    mm40 mm40Var = (mm40) obj6;
                                                    fet fetVar2 = (fet) obj7;
                                                    int iD = dw9.d((Integer) obj8, y5dVar, mm40Var);
                                                    if ((iD & 6) == 0) {
                                                        i2 = (fetVar2.g(y5dVar) ? 4 : 2) | iD;
                                                    } else {
                                                        i2 = iD;
                                                    }
                                                    if ((iD & 48) == 0) {
                                                        i2 |= fetVar2.g(mm40Var) ? 32 : 16;
                                                    }
                                                    if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                                                        zcl zclVar2 = qmk.f28987a;
                                                        msm0.f(y5dVar.b(s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), true), yoaVar2.f42975a, fetVar2, 0);
                                                    } else {
                                                        fetVar2.X();
                                                    }
                                                    break;
                                                default:
                                                    mm40 mm40Var2 = (mm40) obj6;
                                                    fet fetVar3 = (fet) obj7;
                                                    int iD2 = dw9.d((Integer) obj8, y5dVar, mm40Var2);
                                                    if ((iD2 & 48) == 0) {
                                                        iD2 |= fetVar3.g(mm40Var2) ? 32 : 16;
                                                    }
                                                    if (fetVar3.U(iD2 & 1, (iD2 & 145) != 144)) {
                                                        ccq0.e(mm40Var2, yoaVar2.b, fetVar3);
                                                    } else {
                                                        fetVar3.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar), fetVar, 27648, 6);
                                    fetVar.r(false);
                                } else {
                                    boolean z6 = cjaVar instanceof sia;
                                    Function1 function3 = this.h;
                                    mm40 mm40VarR = jm40.b;
                                    if (z6) {
                                        fetVar.e0(533098996);
                                        sia siaVar = (sia) cjaVar;
                                        boolean zG = fetVar.g(function3);
                                        Object objP3 = fetVar.P();
                                        if (zG || objP3 == cl5Var) {
                                            objP3 = new qr0(function3, (byte) 21);
                                            fetVar.o0(objP3);
                                        }
                                        Function1 function4 = (Function1) objP3;
                                        function4.getClass();
                                        pz40 pz40VarF = androidx.compose.runtime.e.f(siaVar.f32252a, fetVar);
                                        pz40 pz40VarF2 = androidx.compose.runtime.e.f(siaVar.b, fetVar);
                                        zcl zclVar2 = qmk.f28987a;
                                        mm40 mm40VarN = s5x0.N(mm40VarC, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                        if (((mmo) pz40VarF2.getValue()).c) {
                                            mm40VarR = knm0.r(mm40VarR);
                                        }
                                        ny9.e(mm40VarN.e(mm40VarR), null, u1c.M(340864156, new tia(function4, pz40VarF, pz40VarF2, (byte) 1), fetVar), u1c.M(-1699810949, new awh(siaVar, (byte) 7), fetVar), fetVar, 27648, 6);
                                        fetVar.r(false);
                                    } else if (cjaVar instanceof waa) {
                                        fetVar.e0(533107375);
                                        kc5.H(mm40VarC, (waa) cjaVar, function2, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (cjaVar instanceof aka) {
                                        fetVar.e0(533114695);
                                        aka akaVar = (aka) cjaVar;
                                        boolean zG2 = fetVar.g(function3);
                                        Object objP4 = fetVar.P();
                                        if (zG2 || objP4 == cl5Var) {
                                            objP4 = new qr0(function3, (byte) 22);
                                            fetVar.o0(objP4);
                                        }
                                        cfx0.e(mm40VarC, akaVar, this.i, (Function1) objP4, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (cjaVar instanceof jna) {
                                        fetVar.e0(533124791);
                                        jna jnaVar = (jna) cjaVar;
                                        boolean zG3 = fetVar.g(function3);
                                        Object objP5 = fetVar.P();
                                        if (zG3 || objP5 == cl5Var) {
                                            objP5 = new qr0(function3, (byte) 23);
                                            fetVar.o0(objP5);
                                        }
                                        Function1 function5 = (Function1) objP5;
                                        function5.getClass();
                                        pz40 pz40VarF3 = androidx.compose.runtime.e.f(jnaVar.f16803a, fetVar);
                                        pz40 pz40VarF4 = androidx.compose.runtime.e.f(jnaVar.b, fetVar);
                                        zcl zclVar3 = qmk.f28987a;
                                        mm40 mm40VarN2 = s5x0.N(mm40VarC, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                        if (((mmo) pz40VarF4.getValue()).c) {
                                            mm40VarR = knm0.r(mm40VarR);
                                        }
                                        ny9.e(mm40VarN2.e(mm40VarR), null, u1c.M(1629095039, new tia(pz40VarF3, pz40VarF4, function5), fetVar), u1c.M(1268635328, new awh(jnaVar, (byte) 13), fetVar), fetVar, 27648, 6);
                                        fetVar.r(false);
                                    } else if (cjaVar instanceof jja) {
                                        fetVar.e0(-652733937);
                                        jja jjaVar = (jja) cjaVar;
                                        boolean zG4 = fetVar.g(function3);
                                        Object objP6 = fetVar.P();
                                        if (zG4 || objP6 == cl5Var) {
                                            objP6 = new qr0(function3, (byte) 24);
                                            fetVar.o0(objP6);
                                        }
                                        Function1 function6 = (Function1) objP6;
                                        Function1 function7 = this.j;
                                        boolean zG5 = fetVar.g(function7);
                                        Object objP7 = fetVar.P();
                                        if (zG5 || objP7 == cl5Var) {
                                            objP7 = new qr0(function7, (byte) 25);
                                            fetVar.o0(objP7);
                                        }
                                        Function1 function8 = (Function1) objP7;
                                        function6.getClass();
                                        function8.getClass();
                                        pz40 pz40VarF5 = androidx.compose.runtime.e.f(jjaVar.f16611a.b, fetVar);
                                        zcl zclVar4 = qmk.f28987a;
                                        mm40 mm40VarN3 = s5x0.N(mm40VarC, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                        if (((mmo) pz40VarF5.getValue()).c) {
                                            mm40VarR = knm0.r(mm40VarR);
                                        }
                                        ny9.e(mm40VarN3.e(mm40VarR), null, u1c.M(-344011552, new g54((Object) jjaVar, function8, function6, pz40VarF5, (byte) 5), fetVar), u1c.M(941050977, new awh(jjaVar, (byte) 9), fetVar), fetVar, 27648, 6);
                                        fetVar.r(false);
                                    } else if (cjaVar instanceof wka) {
                                        fetVar.e0(533146571);
                                        j47.Q(mm40VarC, (wka) cjaVar, function2, fetVar, 0);
                                        fetVar.r(false);
                                    }
                                }
                            }
                        }
                    }
                    fetVar.r(z);
                }
                z = false;
                fetVar.r(z);
            } else {
                z = false;
            }
            throw b1j.f(533054980, fetVar, z);
        }
        fetVar.X();
        return Unit.f46060a;
    }
}
