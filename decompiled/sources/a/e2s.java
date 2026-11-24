package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e2s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7101a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ e2s(mm40 mm40Var, l7m0 l7m0Var, byte b) {
        this.f7101a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7101a;
        boolean z = false;
        l7m0 l7m0Var = this.c;
        mm40 mm40Var = this.b;
        final byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                xak xakVar = j2s.b2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nw3 nw3Var = uc9.e;
                    l7m0Var.getClass();
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    ynd yndVar = (ynd) l7m0Var.getValue();
                    if (yndVar == null) {
                        fetVar.e0(-1178525647);
                        fetVar.r(false);
                    } else if (yndVar instanceof und) {
                        fetVar.e0(1485980308);
                        b34.m(mm40VarE, (und) yndVar, fetVar, 0);
                        fetVar.r(false);
                    } else if (yndVar instanceof snd) {
                        fetVar.e0(1485983926);
                        final snd sndVar = (snd) yndVar;
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarJ = s5x0.J(mm40VarE, 8.0f);
                        qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                        final byte b3 = z ? (byte) 1 : (byte) 0;
                        kc5.T(mm40VarJ, qw3Var, u1c.M(-1147771757, new ydr() { // from class: a.pnd
                            @Override // a.ydr
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i;
                                byte b4 = b3;
                                final snd sndVar2 = sndVar;
                                final byte b5 = 0;
                                switch (b4) {
                                    case 0:
                                        boolean z2 = true;
                                        j83 j83Var = sndVar2.h;
                                        mm40 mm40Var2 = (mm40) obj4;
                                        fet fetVar2 = (fet) obj5;
                                        int iD = dw9.d((Integer) obj6, (y5d) obj3, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                        }
                                        if ((iD & 145) == 144) {
                                            z2 = false;
                                        }
                                        if (!fetVar2.U(iD & 1, z2)) {
                                            fetVar2.X();
                                        } else if (j83Var.b.length() > 0) {
                                            fetVar2.e0(-1033694588);
                                            vic.a(mm40Var2, j83Var, fetVar2, (iD >> 3) & 14);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(-1033530257);
                                            fetVar2.r(false);
                                        }
                                        break;
                                    default:
                                        y5d y5dVar = (y5d) obj3;
                                        mm40 mm40Var3 = (mm40) obj4;
                                        fet fetVar3 = (fet) obj5;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        y5dVar.getClass();
                                        mm40Var3.getClass();
                                        if ((iIntValue2 & 6) == 0) {
                                            i = (fetVar3.g(y5dVar) ? 4 : 2) | iIntValue2;
                                        } else {
                                            i = iIntValue2;
                                        }
                                        if ((iIntValue2 & 48) == 0) {
                                            i |= fetVar3.g(mm40Var3) ? 32 : 16;
                                        }
                                        if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                            mm40 mm40VarB = y5dVar.b(o7k0.d(mm40Var3, 1.0f), true);
                                            zcl zclVar2 = qmk.f28987a;
                                            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar3, 0);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarB);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(e7z.u1);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, x5dVarA, gqw0.x);
                                            jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                            jpm0.n(fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                            zfn zfnVar = cn80.b;
                                            w6n w6nVar = w6n.k;
                                            l5d0 l5d0VarA = zfnVar.a(w6nVar);
                                            zfn zfnVar2 = egp0.f7775a;
                                            zx7 zx7Var = gqw0.d;
                                            l5d0 l5d0VarA2 = zfnVar2.a(zx7Var);
                                            zfn zfnVar3 = egp0.c;
                                            zfn zfnVar4 = j1t0.e;
                                            ((g1t0) fetVar3.k(zfnVar4)).getClass();
                                            l5d0 l5d0VarA3 = zfnVar3.a(g1t0.h());
                                            zfn zfnVar5 = egp0.b;
                                            l5d0 l5d0VarK = dw9.k(5, zfnVar5);
                                            zfn zfnVar6 = cn80.f4642a;
                                            zfn zfnVar7 = bmd.n;
                                            l5d0 l5d0VarA4 = zfnVar6.a(fetVar3.k(zfnVar7));
                                            zfn zfnVar8 = kcp0.f18071a;
                                            l5d0 l5d0VarA5 = zfnVar8.a(null);
                                            zfn zfnVar9 = egp0.d;
                                            l5d0 l5d0VarA6 = zfnVar9.a(2);
                                            zfn zfnVar10 = kcp0.c;
                                            Boolean bool = Boolean.TRUE;
                                            obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, l5d0VarK, l5d0VarA4, l5d0VarA5, l5d0VarA6, zfnVar10.a(bool)}, u1c.M(-1072699062, new Function2() { // from class: a.qnd
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj7, Object obj8) {
                                                    byte b6 = b5;
                                                    cl5 cl5Var = ukd.f35823a;
                                                    jm40 jm40Var = jm40.b;
                                                    snd sndVar3 = sndVar2;
                                                    switch (b6) {
                                                        case 0:
                                                            fet fetVar4 = (fet) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                                                zcl zclVar3 = qmk.f28987a;
                                                                mm40 mm40VarE2 = o7k0.e(mm40VarD, 24.0f);
                                                                mdp0 mdp0Var = sndVar3.b;
                                                                boolean z3 = sndVar3.f32488a == cex.f4233a;
                                                                String str = sndVar3.d;
                                                                boolean z4 = sndVar3.e;
                                                                Object objP = fetVar4.P();
                                                                if (objP == cl5Var) {
                                                                    objP = new shd((byte) 18);
                                                                    fetVar4.o0(objP);
                                                                }
                                                                dtb.c(mm40VarE2, mdp0Var, z3, str, z4, (Function2) objP, fetVar4, 196608);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        default:
                                                            fet fetVar5 = (fet) obj7;
                                                            int iIntValue4 = ((Integer) obj8).intValue();
                                                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                                                                zcl zclVar4 = qmk.f28987a;
                                                                mm40 mm40VarE3 = o7k0.e(mm40VarD2, 24.0f);
                                                                mdp0 mdp0Var2 = sndVar3.c;
                                                                boolean z5 = sndVar3.f32488a == cex.b;
                                                                String str2 = sndVar3.f;
                                                                boolean z6 = sndVar3.g;
                                                                Object objP2 = fetVar5.P();
                                                                if (objP2 == cl5Var) {
                                                                    objP2 = new shd((byte) 17);
                                                                    fetVar5.o0(objP2);
                                                                }
                                                                dtb.c(mm40VarE3, mdp0Var2, z5, str2, z6, (Function2) objP2, fetVar5, 196608);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3), fetVar3, 48);
                                            mbc.o(xfi0.f40792a, o7k0.d(jm40.b, 1.0f), true, fetVar3, 438, 0);
                                            l5d0 l5d0VarA7 = zfnVar.a(w6nVar);
                                            l5d0 l5d0VarA8 = zfnVar2.a(zx7Var);
                                            ((g1t0) fetVar3.k(zfnVar4)).getClass();
                                            final byte b6 = 1;
                                            obc.e(new l5d0[]{l5d0VarA7, l5d0VarA8, zfnVar3.a(g1t0.h()), dw9.k(5, zfnVar5), zfnVar6.a(fetVar3.k(zfnVar7)), zfnVar8.a(null), zfnVar9.a(2), zfnVar10.a(bool)}, u1c.M(-234245055, new Function2() { // from class: a.qnd
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj7, Object obj8) {
                                                    byte b7 = b6;
                                                    cl5 cl5Var = ukd.f35823a;
                                                    jm40 jm40Var = jm40.b;
                                                    snd sndVar3 = sndVar2;
                                                    switch (b7) {
                                                        case 0:
                                                            fet fetVar4 = (fet) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                                                zcl zclVar3 = qmk.f28987a;
                                                                mm40 mm40VarE2 = o7k0.e(mm40VarD, 24.0f);
                                                                mdp0 mdp0Var = sndVar3.b;
                                                                boolean z3 = sndVar3.f32488a == cex.f4233a;
                                                                String str = sndVar3.d;
                                                                boolean z4 = sndVar3.e;
                                                                Object objP = fetVar4.P();
                                                                if (objP == cl5Var) {
                                                                    objP = new shd((byte) 18);
                                                                    fetVar4.o0(objP);
                                                                }
                                                                dtb.c(mm40VarE2, mdp0Var, z3, str, z4, (Function2) objP, fetVar4, 196608);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        default:
                                                            fet fetVar5 = (fet) obj7;
                                                            int iIntValue4 = ((Integer) obj8).intValue();
                                                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                                                                zcl zclVar4 = qmk.f28987a;
                                                                mm40 mm40VarE3 = o7k0.e(mm40VarD2, 24.0f);
                                                                mdp0 mdp0Var2 = sndVar3.c;
                                                                boolean z5 = sndVar3.f32488a == cex.b;
                                                                String str2 = sndVar3.f;
                                                                boolean z6 = sndVar3.g;
                                                                Object objP2 = fetVar5.P();
                                                                if (objP2 == cl5Var) {
                                                                    objP2 = new shd((byte) 17);
                                                                    fetVar5.o0(objP2);
                                                                }
                                                                dtb.c(mm40VarE3, mdp0Var2, z5, str2, z6, (Function2) objP2, fetVar5, 196608);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3), fetVar3, 48);
                                            fetVar3.r(true);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), u1c.M(118299028, new ydr() { // from class: a.pnd
                            @Override // a.ydr
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i;
                                byte b4 = b2;
                                final snd sndVar2 = sndVar;
                                final byte b5 = 0;
                                switch (b4) {
                                    case 0:
                                        boolean z2 = true;
                                        j83 j83Var = sndVar2.h;
                                        mm40 mm40Var2 = (mm40) obj4;
                                        fet fetVar2 = (fet) obj5;
                                        int iD = dw9.d((Integer) obj6, (y5d) obj3, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                        }
                                        if ((iD & 145) == 144) {
                                            z2 = false;
                                        }
                                        if (!fetVar2.U(iD & 1, z2)) {
                                            fetVar2.X();
                                        } else if (j83Var.b.length() > 0) {
                                            fetVar2.e0(-1033694588);
                                            vic.a(mm40Var2, j83Var, fetVar2, (iD >> 3) & 14);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(-1033530257);
                                            fetVar2.r(false);
                                        }
                                        break;
                                    default:
                                        y5d y5dVar = (y5d) obj3;
                                        mm40 mm40Var3 = (mm40) obj4;
                                        fet fetVar3 = (fet) obj5;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        y5dVar.getClass();
                                        mm40Var3.getClass();
                                        if ((iIntValue2 & 6) == 0) {
                                            i = (fetVar3.g(y5dVar) ? 4 : 2) | iIntValue2;
                                        } else {
                                            i = iIntValue2;
                                        }
                                        if ((iIntValue2 & 48) == 0) {
                                            i |= fetVar3.g(mm40Var3) ? 32 : 16;
                                        }
                                        if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                            mm40 mm40VarB = y5dVar.b(o7k0.d(mm40Var3, 1.0f), true);
                                            zcl zclVar2 = qmk.f28987a;
                                            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar3, 0);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarB);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(e7z.u1);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, x5dVarA, gqw0.x);
                                            jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                            jpm0.n(fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                            zfn zfnVar = cn80.b;
                                            w6n w6nVar = w6n.k;
                                            l5d0 l5d0VarA = zfnVar.a(w6nVar);
                                            zfn zfnVar2 = egp0.f7775a;
                                            zx7 zx7Var = gqw0.d;
                                            l5d0 l5d0VarA2 = zfnVar2.a(zx7Var);
                                            zfn zfnVar3 = egp0.c;
                                            zfn zfnVar4 = j1t0.e;
                                            ((g1t0) fetVar3.k(zfnVar4)).getClass();
                                            l5d0 l5d0VarA3 = zfnVar3.a(g1t0.h());
                                            zfn zfnVar5 = egp0.b;
                                            l5d0 l5d0VarK = dw9.k(5, zfnVar5);
                                            zfn zfnVar6 = cn80.f4642a;
                                            zfn zfnVar7 = bmd.n;
                                            l5d0 l5d0VarA4 = zfnVar6.a(fetVar3.k(zfnVar7));
                                            zfn zfnVar8 = kcp0.f18071a;
                                            l5d0 l5d0VarA5 = zfnVar8.a(null);
                                            zfn zfnVar9 = egp0.d;
                                            l5d0 l5d0VarA6 = zfnVar9.a(2);
                                            zfn zfnVar10 = kcp0.c;
                                            Boolean bool = Boolean.TRUE;
                                            obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, l5d0VarK, l5d0VarA4, l5d0VarA5, l5d0VarA6, zfnVar10.a(bool)}, u1c.M(-1072699062, new Function2() { // from class: a.qnd
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj7, Object obj8) {
                                                    byte b7 = b5;
                                                    cl5 cl5Var = ukd.f35823a;
                                                    jm40 jm40Var = jm40.b;
                                                    snd sndVar3 = sndVar2;
                                                    switch (b7) {
                                                        case 0:
                                                            fet fetVar4 = (fet) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                                                zcl zclVar3 = qmk.f28987a;
                                                                mm40 mm40VarE2 = o7k0.e(mm40VarD, 24.0f);
                                                                mdp0 mdp0Var = sndVar3.b;
                                                                boolean z3 = sndVar3.f32488a == cex.f4233a;
                                                                String str = sndVar3.d;
                                                                boolean z4 = sndVar3.e;
                                                                Object objP = fetVar4.P();
                                                                if (objP == cl5Var) {
                                                                    objP = new shd((byte) 18);
                                                                    fetVar4.o0(objP);
                                                                }
                                                                dtb.c(mm40VarE2, mdp0Var, z3, str, z4, (Function2) objP, fetVar4, 196608);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        default:
                                                            fet fetVar5 = (fet) obj7;
                                                            int iIntValue4 = ((Integer) obj8).intValue();
                                                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                                                                zcl zclVar4 = qmk.f28987a;
                                                                mm40 mm40VarE3 = o7k0.e(mm40VarD2, 24.0f);
                                                                mdp0 mdp0Var2 = sndVar3.c;
                                                                boolean z5 = sndVar3.f32488a == cex.b;
                                                                String str2 = sndVar3.f;
                                                                boolean z6 = sndVar3.g;
                                                                Object objP2 = fetVar5.P();
                                                                if (objP2 == cl5Var) {
                                                                    objP2 = new shd((byte) 17);
                                                                    fetVar5.o0(objP2);
                                                                }
                                                                dtb.c(mm40VarE3, mdp0Var2, z5, str2, z6, (Function2) objP2, fetVar5, 196608);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3), fetVar3, 48);
                                            mbc.o(xfi0.f40792a, o7k0.d(jm40.b, 1.0f), true, fetVar3, 438, 0);
                                            l5d0 l5d0VarA7 = zfnVar.a(w6nVar);
                                            l5d0 l5d0VarA8 = zfnVar2.a(zx7Var);
                                            ((g1t0) fetVar3.k(zfnVar4)).getClass();
                                            final byte b6 = 1;
                                            obc.e(new l5d0[]{l5d0VarA7, l5d0VarA8, zfnVar3.a(g1t0.h()), dw9.k(5, zfnVar5), zfnVar6.a(fetVar3.k(zfnVar7)), zfnVar8.a(null), zfnVar9.a(2), zfnVar10.a(bool)}, u1c.M(-234245055, new Function2() { // from class: a.qnd
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj7, Object obj8) {
                                                    byte b7 = b6;
                                                    cl5 cl5Var = ukd.f35823a;
                                                    jm40 jm40Var = jm40.b;
                                                    snd sndVar3 = sndVar2;
                                                    switch (b7) {
                                                        case 0:
                                                            fet fetVar4 = (fet) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                                                zcl zclVar3 = qmk.f28987a;
                                                                mm40 mm40VarE2 = o7k0.e(mm40VarD, 24.0f);
                                                                mdp0 mdp0Var = sndVar3.b;
                                                                boolean z3 = sndVar3.f32488a == cex.f4233a;
                                                                String str = sndVar3.d;
                                                                boolean z4 = sndVar3.e;
                                                                Object objP = fetVar4.P();
                                                                if (objP == cl5Var) {
                                                                    objP = new shd((byte) 18);
                                                                    fetVar4.o0(objP);
                                                                }
                                                                dtb.c(mm40VarE2, mdp0Var, z3, str, z4, (Function2) objP, fetVar4, 196608);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        default:
                                                            fet fetVar5 = (fet) obj7;
                                                            int iIntValue4 = ((Integer) obj8).intValue();
                                                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                                                                zcl zclVar4 = qmk.f28987a;
                                                                mm40 mm40VarE3 = o7k0.e(mm40VarD2, 24.0f);
                                                                mdp0 mdp0Var2 = sndVar3.c;
                                                                boolean z5 = sndVar3.f32488a == cex.b;
                                                                String str2 = sndVar3.f;
                                                                boolean z6 = sndVar3.g;
                                                                Object objP2 = fetVar5.P();
                                                                if (objP2 == cl5Var) {
                                                                    objP2 = new shd((byte) 17);
                                                                    fetVar5.o0(objP2);
                                                                }
                                                                dtb.c(mm40VarE3, mdp0Var2, z5, str2, z6, (Function2) objP2, fetVar5, 196608);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3), fetVar3, 48);
                                            fetVar3.r(true);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, 3456, 0);
                        fetVar.r(false);
                    } else if (yndVar instanceof yod) {
                        fetVar.e0(1485987672);
                        final yod yodVar = (yod) yndVar;
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarJ2 = s5x0.J(mm40VarE, 8.0f);
                        final byte b4 = z ? (byte) 1 : (byte) 0;
                        kc5.T(mm40VarJ2, nw3Var, u1c.M(-1045955250, new ydr() { // from class: a.wod
                            @Override // a.ydr
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i;
                                byte b5 = b4;
                                final yod yodVar2 = yodVar;
                                final byte b6 = 0;
                                char c = 1;
                                switch (b5) {
                                    case 0:
                                        j83 j83Var = yodVar2.c;
                                        mm40 mm40Var2 = (mm40) obj4;
                                        fet fetVar2 = (fet) obj5;
                                        int iD = dw9.d((Integer) obj6, (y5d) obj3, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                        }
                                        if (!fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                            fetVar2.X();
                                        } else if (j83Var.b.length() > 0) {
                                            fetVar2.e0(-65047573);
                                            vic.a(mm40Var2, j83Var, fetVar2, (iD >> 3) & 14);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(-64885164);
                                            fetVar2.r(false);
                                        }
                                        break;
                                    default:
                                        y5d y5dVar = (y5d) obj3;
                                        mm40 mm40Var3 = (mm40) obj4;
                                        fet fetVar3 = (fet) obj5;
                                        int iD2 = dw9.d((Integer) obj6, y5dVar, mm40Var3);
                                        final byte b7 = 2;
                                        if ((iD2 & 6) == 0) {
                                            i = (fetVar3.g(y5dVar) ? 4 : 2) | iD2;
                                        } else {
                                            i = iD2;
                                        }
                                        if ((iD2 & 48) == 0) {
                                            i |= fetVar3.g(mm40Var3) ? 32 : 16;
                                        }
                                        if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                            mm40 mm40VarB = y5dVar.b(o7k0.d(mm40Var3, 1.0f), true);
                                            ugd ugdVarM = u1c.M(-1809799503, new xdr() { // from class: a.xod
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    byte b8 = b6;
                                                    pcy pcyVar = e7z.u1;
                                                    yod yodVar3 = yodVar2;
                                                    switch (b8) {
                                                        case 0:
                                                            mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                                int iHashCode = Long.hashCode(fetVar4.T);
                                                                bh90 bh90VarM = fetVar4.m();
                                                                mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var4);
                                                                mkd.c0.getClass();
                                                                fetVar4.i0();
                                                                if (fetVar4.S) {
                                                                    fetVar4.l(pcyVar);
                                                                } else {
                                                                    fetVar4.r0();
                                                                }
                                                                jpm0.o(fetVar4, tj30VarC, gqw0.x);
                                                                jpm0.o(fetVar4, bh90VarM, gqw0.w);
                                                                jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                                                                jpm0.n(fetVar4);
                                                                jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                                                                v8q0.a(yodVar3.f42979a, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 109562);
                                                                fetVar4.r(true);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar3 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), yodVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                        default:
                                                            mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                                                bh90 bh90VarM2 = fetVar6.m();
                                                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var5);
                                                                mkd.c0.getClass();
                                                                fetVar6.i0();
                                                                if (fetVar6.S) {
                                                                    fetVar6.l(pcyVar);
                                                                } else {
                                                                    fetVar6.r0();
                                                                }
                                                                jpm0.o(fetVar6, tj30VarC2, gqw0.x);
                                                                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                                                jpm0.n(fetVar6);
                                                                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                                                v8q0.a(yodVar3.b, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                                fetVar6.r(true);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3);
                                            final char c2 = c == true ? 1 : 0;
                                            ay3.m(mm40VarB, q3d.j(ugdVarM, u1c.M(2026532274, new xdr() { // from class: a.xod
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    byte b8 = c2;
                                                    pcy pcyVar = e7z.u1;
                                                    yod yodVar3 = yodVar2;
                                                    switch (b8) {
                                                        case 0:
                                                            mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                                int iHashCode = Long.hashCode(fetVar4.T);
                                                                bh90 bh90VarM = fetVar4.m();
                                                                mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var4);
                                                                mkd.c0.getClass();
                                                                fetVar4.i0();
                                                                if (fetVar4.S) {
                                                                    fetVar4.l(pcyVar);
                                                                } else {
                                                                    fetVar4.r0();
                                                                }
                                                                jpm0.o(fetVar4, tj30VarC, gqw0.x);
                                                                jpm0.o(fetVar4, bh90VarM, gqw0.w);
                                                                jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                                                                jpm0.n(fetVar4);
                                                                jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                                                                v8q0.a(yodVar3.f42979a, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 109562);
                                                                fetVar4.r(true);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar3 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), yodVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                        default:
                                                            mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                                                bh90 bh90VarM2 = fetVar6.m();
                                                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var5);
                                                                mkd.c0.getClass();
                                                                fetVar6.i0();
                                                                if (fetVar6.S) {
                                                                    fetVar6.l(pcyVar);
                                                                } else {
                                                                    fetVar6.r0();
                                                                }
                                                                jpm0.o(fetVar6, tj30VarC2, gqw0.x);
                                                                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                                                jpm0.n(fetVar6);
                                                                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                                                v8q0.a(yodVar3.b, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                                fetVar6.r(true);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3), u1c.M(1567896755, new xdr() { // from class: a.xod
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    byte b8 = b7;
                                                    pcy pcyVar = e7z.u1;
                                                    yod yodVar3 = yodVar2;
                                                    switch (b8) {
                                                        case 0:
                                                            mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                                int iHashCode = Long.hashCode(fetVar4.T);
                                                                bh90 bh90VarM = fetVar4.m();
                                                                mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var4);
                                                                mkd.c0.getClass();
                                                                fetVar4.i0();
                                                                if (fetVar4.S) {
                                                                    fetVar4.l(pcyVar);
                                                                } else {
                                                                    fetVar4.r0();
                                                                }
                                                                jpm0.o(fetVar4, tj30VarC, gqw0.x);
                                                                jpm0.o(fetVar4, bh90VarM, gqw0.w);
                                                                jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                                                                jpm0.n(fetVar4);
                                                                jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                                                                v8q0.a(yodVar3.f42979a, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 109562);
                                                                fetVar4.r(true);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar3 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), yodVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                        default:
                                                            mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                                                bh90 bh90VarM2 = fetVar6.m();
                                                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var5);
                                                                mkd.c0.getClass();
                                                                fetVar6.i0();
                                                                if (fetVar6.S) {
                                                                    fetVar6.l(pcyVar);
                                                                } else {
                                                                    fetVar6.r0();
                                                                }
                                                                jpm0.o(fetVar6, tj30VarC2, gqw0.x);
                                                                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                                                jpm0.n(fetVar6);
                                                                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                                                v8q0.a(yodVar3.b, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                                fetVar6.r(true);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3)), fetVar3);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), u1c.M(-600417939, new ydr() { // from class: a.wod
                            @Override // a.ydr
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i;
                                byte b5 = b2;
                                final yod yodVar2 = yodVar;
                                final byte b6 = 0;
                                char c = 1;
                                switch (b5) {
                                    case 0:
                                        j83 j83Var = yodVar2.c;
                                        mm40 mm40Var2 = (mm40) obj4;
                                        fet fetVar2 = (fet) obj5;
                                        int iD = dw9.d((Integer) obj6, (y5d) obj3, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                        }
                                        if (!fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                            fetVar2.X();
                                        } else if (j83Var.b.length() > 0) {
                                            fetVar2.e0(-65047573);
                                            vic.a(mm40Var2, j83Var, fetVar2, (iD >> 3) & 14);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(-64885164);
                                            fetVar2.r(false);
                                        }
                                        break;
                                    default:
                                        y5d y5dVar = (y5d) obj3;
                                        mm40 mm40Var3 = (mm40) obj4;
                                        fet fetVar3 = (fet) obj5;
                                        int iD2 = dw9.d((Integer) obj6, y5dVar, mm40Var3);
                                        final byte b7 = 2;
                                        if ((iD2 & 6) == 0) {
                                            i = (fetVar3.g(y5dVar) ? 4 : 2) | iD2;
                                        } else {
                                            i = iD2;
                                        }
                                        if ((iD2 & 48) == 0) {
                                            i |= fetVar3.g(mm40Var3) ? 32 : 16;
                                        }
                                        if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                            mm40 mm40VarB = y5dVar.b(o7k0.d(mm40Var3, 1.0f), true);
                                            ugd ugdVarM = u1c.M(-1809799503, new xdr() { // from class: a.xod
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    byte b8 = b6;
                                                    pcy pcyVar = e7z.u1;
                                                    yod yodVar3 = yodVar2;
                                                    switch (b8) {
                                                        case 0:
                                                            mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                                int iHashCode = Long.hashCode(fetVar4.T);
                                                                bh90 bh90VarM = fetVar4.m();
                                                                mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var4);
                                                                mkd.c0.getClass();
                                                                fetVar4.i0();
                                                                if (fetVar4.S) {
                                                                    fetVar4.l(pcyVar);
                                                                } else {
                                                                    fetVar4.r0();
                                                                }
                                                                jpm0.o(fetVar4, tj30VarC, gqw0.x);
                                                                jpm0.o(fetVar4, bh90VarM, gqw0.w);
                                                                jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                                                                jpm0.n(fetVar4);
                                                                jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                                                                v8q0.a(yodVar3.f42979a, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 109562);
                                                                fetVar4.r(true);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar3 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), yodVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                        default:
                                                            mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                                                bh90 bh90VarM2 = fetVar6.m();
                                                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var5);
                                                                mkd.c0.getClass();
                                                                fetVar6.i0();
                                                                if (fetVar6.S) {
                                                                    fetVar6.l(pcyVar);
                                                                } else {
                                                                    fetVar6.r0();
                                                                }
                                                                jpm0.o(fetVar6, tj30VarC2, gqw0.x);
                                                                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                                                jpm0.n(fetVar6);
                                                                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                                                v8q0.a(yodVar3.b, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                                fetVar6.r(true);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3);
                                            final byte c2 = c == true ? 1 : 0;
                                            ay3.m(mm40VarB, q3d.j(ugdVarM, u1c.M(2026532274, new xdr() { // from class: a.xod
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    byte b8 = c2;
                                                    pcy pcyVar = e7z.u1;
                                                    yod yodVar3 = yodVar2;
                                                    switch (b8) {
                                                        case 0:
                                                            mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                                int iHashCode = Long.hashCode(fetVar4.T);
                                                                bh90 bh90VarM = fetVar4.m();
                                                                mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var4);
                                                                mkd.c0.getClass();
                                                                fetVar4.i0();
                                                                if (fetVar4.S) {
                                                                    fetVar4.l(pcyVar);
                                                                } else {
                                                                    fetVar4.r0();
                                                                }
                                                                jpm0.o(fetVar4, tj30VarC, gqw0.x);
                                                                jpm0.o(fetVar4, bh90VarM, gqw0.w);
                                                                jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                                                                jpm0.n(fetVar4);
                                                                jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                                                                v8q0.a(yodVar3.f42979a, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 109562);
                                                                fetVar4.r(true);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar3 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), yodVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                        default:
                                                            mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                                                bh90 bh90VarM2 = fetVar6.m();
                                                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var5);
                                                                mkd.c0.getClass();
                                                                fetVar6.i0();
                                                                if (fetVar6.S) {
                                                                    fetVar6.l(pcyVar);
                                                                } else {
                                                                    fetVar6.r0();
                                                                }
                                                                jpm0.o(fetVar6, tj30VarC2, gqw0.x);
                                                                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                                                jpm0.n(fetVar6);
                                                                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                                                v8q0.a(yodVar3.b, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                                fetVar6.r(true);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3), u1c.M(1567896755, new xdr() { // from class: a.xod
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    byte b8 = b7;
                                                    pcy pcyVar = e7z.u1;
                                                    yod yodVar3 = yodVar2;
                                                    switch (b8) {
                                                        case 0:
                                                            mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                tj30 tj30VarC = zq8.c(gqw0.e, false);
                                                                int iHashCode = Long.hashCode(fetVar4.T);
                                                                bh90 bh90VarM = fetVar4.m();
                                                                mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var4);
                                                                mkd.c0.getClass();
                                                                fetVar4.i0();
                                                                if (fetVar4.S) {
                                                                    fetVar4.l(pcyVar);
                                                                } else {
                                                                    fetVar4.r0();
                                                                }
                                                                jpm0.o(fetVar4, tj30VarC, gqw0.x);
                                                                jpm0.o(fetVar4, bh90VarM, gqw0.w);
                                                                jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                                                                jpm0.n(fetVar4);
                                                                jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                                                                v8q0.a(yodVar3.f42979a, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 109562);
                                                                fetVar4.r(true);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar3 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), yodVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            break;
                                                        default:
                                                            mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                                                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                                                bh90 bh90VarM2 = fetVar6.m();
                                                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var5);
                                                                mkd.c0.getClass();
                                                                fetVar6.i0();
                                                                if (fetVar6.S) {
                                                                    fetVar6.l(pcyVar);
                                                                } else {
                                                                    fetVar6.r0();
                                                                }
                                                                jpm0.o(fetVar6, tj30VarC2, gqw0.x);
                                                                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                                                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                                                jpm0.n(fetVar6);
                                                                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                                                v8q0.a(yodVar3.b, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar6, 0, 24960, 109562);
                                                                fetVar6.r(true);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar3)), fetVar3);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, 3504, 0);
                        fetVar.r(false);
                    } else if (yndVar instanceof kpd) {
                        fetVar.e0(1485991568);
                        final kpd kpdVar = (kpd) yndVar;
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarJ3 = s5x0.J(mm40VarE, 8.0f);
                        final byte b5 = z ? (byte) 1 : (byte) 0;
                        kc5.T(mm40VarJ3, nw3Var, u1c.M(-1434002200, new ydr() { // from class: a.hpd
                            @Override // a.ydr
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i;
                                byte b6 = b5;
                                final kpd kpdVar2 = kpdVar;
                                final byte b7 = 0;
                                char c = 1;
                                switch (b6) {
                                    case 0:
                                        j83 j83Var = kpdVar2.c;
                                        mm40 mm40Var2 = (mm40) obj4;
                                        fet fetVar2 = (fet) obj5;
                                        int iD = dw9.d((Integer) obj6, (y5d) obj3, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                        }
                                        if (!fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                            fetVar2.X();
                                        } else if (j83Var.b.length() > 0) {
                                            fetVar2.e0(1680225809);
                                            vic.a(mm40Var2, j83Var, fetVar2, (iD >> 3) & 14);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(1680388218);
                                            fetVar2.r(false);
                                        }
                                        break;
                                    default:
                                        y5d y5dVar = (y5d) obj3;
                                        mm40 mm40Var3 = (mm40) obj4;
                                        fet fetVar3 = (fet) obj5;
                                        int iD2 = dw9.d((Integer) obj6, y5dVar, mm40Var3);
                                        final byte b8 = 2;
                                        if ((iD2 & 6) == 0) {
                                            i = (fetVar3.g(y5dVar) ? 4 : 2) | iD2;
                                        } else {
                                            i = iD2;
                                        }
                                        if ((iD2 & 48) == 0) {
                                            i |= fetVar3.g(mm40Var3) ? 32 : 16;
                                        }
                                        if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                            zcl zclVar4 = qmk.f28987a;
                                            mm40 mm40VarB = y5dVar.b(o7k0.d(s5x0.N(mm40Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), true);
                                            ugd ugdVarM = u1c.M(146633547, new xdr() { // from class: a.ipd
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    w6n w6nVar;
                                                    w6n w6nVar2;
                                                    byte b9 = b7;
                                                    final kpd kpdVar3 = kpdVar2;
                                                    final byte b10 = 1;
                                                    switch (b9) {
                                                        case 0:
                                                            final mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                zfn zfnVar = cn80.b;
                                                                udp0 udp0Var = kpdVar3.f18668a;
                                                                if (udp0Var instanceof ycp0) {
                                                                    w6nVar = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA = zfnVar.a(w6nVar);
                                                                l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.f);
                                                                zfn zfnVar2 = egp0.c;
                                                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                                obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar2.a(g1t0.n()), dw9.k(6, egp0.b), cn80.f4642a.a(fetVar4.k(bmd.n)), kcp0.c.a(Boolean.TRUE), kcp0.f18071a.a(null), egp0.d.a(3)}, u1c.M(-1109567477, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = b10;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar5 = (fet) obj10;
                                                                                int iIntValue3 = ((Integer) obj11).intValue();
                                                                                if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                    udp0 udp0Var2 = kpdVar4.b;
                                                                                    Object objP = fetVar5.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar5.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var2, (Function2) objP, fetVar5, 384, 0);
                                                                                } else {
                                                                                    fetVar5.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar6 = (fet) obj10;
                                                                                int iIntValue4 = ((Integer) obj11).intValue();
                                                                                if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar6.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar6.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var3, (Function2) objP2, fetVar6, 384, 0);
                                                                                } else {
                                                                                    fetVar6.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar4), fetVar4, 48);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            return Unit.f46060a;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar5 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), kpdVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            return Unit.f46060a;
                                                        default:
                                                            final mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                zfn zfnVar3 = cn80.b;
                                                                udp0 udp0Var2 = kpdVar3.f18668a;
                                                                if (udp0Var2 instanceof ycp0) {
                                                                    w6nVar2 = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var2 instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar2 = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA3 = zfnVar3.a(w6nVar2);
                                                                l5d0 l5d0VarA4 = egp0.f7775a.a(gqw0.d);
                                                                zfn zfnVar4 = egp0.c;
                                                                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                                                l5d0[] l5d0VarArr = {l5d0VarA3, l5d0VarA4, zfnVar4.a(g1t0.n()), dw9.k(5, egp0.b), cn80.f4642a.a(fetVar6.k(bmd.n)), kcp0.c.a(Boolean.FALSE), kcp0.f18071a.a(null), egp0.d.a(3)};
                                                                final Object[] objArr = null == true ? 1 : 0;
                                                                obc.e(l5d0VarArr, u1c.M(-1572092915, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = objArr;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar6), fetVar6, 48);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            return Unit.f46060a;
                                                    }
                                                }
                                            }, fetVar3);
                                            final char c2 = c == true ? 1 : 0;
                                            ay3.m(mm40VarB, q3d.j(ugdVarM, u1c.M(-84629172, new xdr() { // from class: a.ipd
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    w6n w6nVar;
                                                    w6n w6nVar2;
                                                    byte b9 = c2;
                                                    final kpd kpdVar3 = kpdVar2;
                                                    final byte b10 = 1;
                                                    switch (b9) {
                                                        case 0:
                                                            final mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                zfn zfnVar = cn80.b;
                                                                udp0 udp0Var = kpdVar3.f18668a;
                                                                if (udp0Var instanceof ycp0) {
                                                                    w6nVar = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA = zfnVar.a(w6nVar);
                                                                l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.f);
                                                                zfn zfnVar2 = egp0.c;
                                                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                                obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar2.a(g1t0.n()), dw9.k(6, egp0.b), cn80.f4642a.a(fetVar4.k(bmd.n)), kcp0.c.a(Boolean.TRUE), kcp0.f18071a.a(null), egp0.d.a(3)}, u1c.M(-1109567477, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = b10;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar4), fetVar4, 48);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            return Unit.f46060a;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar5 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), kpdVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            return Unit.f46060a;
                                                        default:
                                                            final mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                zfn zfnVar3 = cn80.b;
                                                                udp0 udp0Var2 = kpdVar3.f18668a;
                                                                if (udp0Var2 instanceof ycp0) {
                                                                    w6nVar2 = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var2 instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar2 = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA3 = zfnVar3.a(w6nVar2);
                                                                l5d0 l5d0VarA4 = egp0.f7775a.a(gqw0.d);
                                                                zfn zfnVar4 = egp0.c;
                                                                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                                                l5d0[] l5d0VarArr = {l5d0VarA3, l5d0VarA4, zfnVar4.a(g1t0.n()), dw9.k(5, egp0.b), cn80.f4642a.a(fetVar6.k(bmd.n)), kcp0.c.a(Boolean.FALSE), kcp0.f18071a.a(null), egp0.d.a(3)};
                                                                final byte objArr = null == true ? 1 : 0;
                                                                obc.e(l5d0VarArr, u1c.M(-1572092915, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = objArr;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar6), fetVar6, 48);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            return Unit.f46060a;
                                                    }
                                                }
                                            }, fetVar3), u1c.M(-315891891, new xdr() { // from class: a.ipd
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    w6n w6nVar;
                                                    w6n w6nVar2;
                                                    byte b9 = b8;
                                                    final kpd kpdVar3 = kpdVar2;
                                                    final byte b10 = 1;
                                                    switch (b9) {
                                                        case 0:
                                                            final mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                zfn zfnVar = cn80.b;
                                                                udp0 udp0Var = kpdVar3.f18668a;
                                                                if (udp0Var instanceof ycp0) {
                                                                    w6nVar = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA = zfnVar.a(w6nVar);
                                                                l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.f);
                                                                zfn zfnVar2 = egp0.c;
                                                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                                obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar2.a(g1t0.n()), dw9.k(6, egp0.b), cn80.f4642a.a(fetVar4.k(bmd.n)), kcp0.c.a(Boolean.TRUE), kcp0.f18071a.a(null), egp0.d.a(3)}, u1c.M(-1109567477, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = b10;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar4), fetVar4, 48);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            return Unit.f46060a;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar5 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), kpdVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            return Unit.f46060a;
                                                        default:
                                                            final mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                zfn zfnVar3 = cn80.b;
                                                                udp0 udp0Var2 = kpdVar3.f18668a;
                                                                if (udp0Var2 instanceof ycp0) {
                                                                    w6nVar2 = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var2 instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar2 = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA3 = zfnVar3.a(w6nVar2);
                                                                l5d0 l5d0VarA4 = egp0.f7775a.a(gqw0.d);
                                                                zfn zfnVar4 = egp0.c;
                                                                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                                                l5d0[] l5d0VarArr = {l5d0VarA3, l5d0VarA4, zfnVar4.a(g1t0.n()), dw9.k(5, egp0.b), cn80.f4642a.a(fetVar6.k(bmd.n)), kcp0.c.a(Boolean.FALSE), kcp0.f18071a.a(null), egp0.d.a(3)};
                                                                final byte objArr = null == true ? 1 : 0;
                                                                obc.e(l5d0VarArr, u1c.M(-1572092915, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = objArr;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar6), fetVar6, 48);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            return Unit.f46060a;
                                                    }
                                                }
                                            }, fetVar3)), fetVar3);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), u1c.M(-482170361, new ydr() { // from class: a.hpd
                            @Override // a.ydr
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i;
                                byte b6 = b2;
                                final kpd kpdVar2 = kpdVar;
                                final byte b7 = 0;
                                char c = 1;
                                switch (b6) {
                                    case 0:
                                        j83 j83Var = kpdVar2.c;
                                        mm40 mm40Var2 = (mm40) obj4;
                                        fet fetVar2 = (fet) obj5;
                                        int iD = dw9.d((Integer) obj6, (y5d) obj3, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                        }
                                        if (!fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                            fetVar2.X();
                                        } else if (j83Var.b.length() > 0) {
                                            fetVar2.e0(1680225809);
                                            vic.a(mm40Var2, j83Var, fetVar2, (iD >> 3) & 14);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(1680388218);
                                            fetVar2.r(false);
                                        }
                                        break;
                                    default:
                                        y5d y5dVar = (y5d) obj3;
                                        mm40 mm40Var3 = (mm40) obj4;
                                        fet fetVar3 = (fet) obj5;
                                        int iD2 = dw9.d((Integer) obj6, y5dVar, mm40Var3);
                                        final byte b8 = 2;
                                        if ((iD2 & 6) == 0) {
                                            i = (fetVar3.g(y5dVar) ? 4 : 2) | iD2;
                                        } else {
                                            i = iD2;
                                        }
                                        if ((iD2 & 48) == 0) {
                                            i |= fetVar3.g(mm40Var3) ? 32 : 16;
                                        }
                                        if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                            zcl zclVar4 = qmk.f28987a;
                                            mm40 mm40VarB = y5dVar.b(o7k0.d(s5x0.N(mm40Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), true);
                                            ugd ugdVarM = u1c.M(146633547, new xdr() { // from class: a.ipd
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    w6n w6nVar;
                                                    w6n w6nVar2;
                                                    byte b9 = b7;
                                                    final kpd kpdVar3 = kpdVar2;
                                                    final byte b10 = 1;
                                                    switch (b9) {
                                                        case 0:
                                                            final mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                zfn zfnVar = cn80.b;
                                                                udp0 udp0Var = kpdVar3.f18668a;
                                                                if (udp0Var instanceof ycp0) {
                                                                    w6nVar = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA = zfnVar.a(w6nVar);
                                                                l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.f);
                                                                zfn zfnVar2 = egp0.c;
                                                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                                obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar2.a(g1t0.n()), dw9.k(6, egp0.b), cn80.f4642a.a(fetVar4.k(bmd.n)), kcp0.c.a(Boolean.TRUE), kcp0.f18071a.a(null), egp0.d.a(3)}, u1c.M(-1109567477, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = b10;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar4), fetVar4, 48);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            return Unit.f46060a;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar5 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), kpdVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            return Unit.f46060a;
                                                        default:
                                                            final mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                zfn zfnVar3 = cn80.b;
                                                                udp0 udp0Var2 = kpdVar3.f18668a;
                                                                if (udp0Var2 instanceof ycp0) {
                                                                    w6nVar2 = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var2 instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar2 = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA3 = zfnVar3.a(w6nVar2);
                                                                l5d0 l5d0VarA4 = egp0.f7775a.a(gqw0.d);
                                                                zfn zfnVar4 = egp0.c;
                                                                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                                                l5d0[] l5d0VarArr = {l5d0VarA3, l5d0VarA4, zfnVar4.a(g1t0.n()), dw9.k(5, egp0.b), cn80.f4642a.a(fetVar6.k(bmd.n)), kcp0.c.a(Boolean.FALSE), kcp0.f18071a.a(null), egp0.d.a(3)};
                                                                final byte objArr = null == true ? 1 : 0;
                                                                obc.e(l5d0VarArr, u1c.M(-1572092915, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = objArr;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar6), fetVar6, 48);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            return Unit.f46060a;
                                                    }
                                                }
                                            }, fetVar3);
                                            final byte c2 = c == true ? 1 : 0;
                                            ay3.m(mm40VarB, q3d.j(ugdVarM, u1c.M(-84629172, new xdr() { // from class: a.ipd
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    w6n w6nVar;
                                                    w6n w6nVar2;
                                                    byte b9 = c2;
                                                    final kpd kpdVar3 = kpdVar2;
                                                    final byte b10 = 1;
                                                    switch (b9) {
                                                        case 0:
                                                            final mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                zfn zfnVar = cn80.b;
                                                                udp0 udp0Var = kpdVar3.f18668a;
                                                                if (udp0Var instanceof ycp0) {
                                                                    w6nVar = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA = zfnVar.a(w6nVar);
                                                                l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.f);
                                                                zfn zfnVar2 = egp0.c;
                                                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                                obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar2.a(g1t0.n()), dw9.k(6, egp0.b), cn80.f4642a.a(fetVar4.k(bmd.n)), kcp0.c.a(Boolean.TRUE), kcp0.f18071a.a(null), egp0.d.a(3)}, u1c.M(-1109567477, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = b10;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar4), fetVar4, 48);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            return Unit.f46060a;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar5 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), kpdVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            return Unit.f46060a;
                                                        default:
                                                            final mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                zfn zfnVar3 = cn80.b;
                                                                udp0 udp0Var2 = kpdVar3.f18668a;
                                                                if (udp0Var2 instanceof ycp0) {
                                                                    w6nVar2 = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var2 instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar2 = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA3 = zfnVar3.a(w6nVar2);
                                                                l5d0 l5d0VarA4 = egp0.f7775a.a(gqw0.d);
                                                                zfn zfnVar4 = egp0.c;
                                                                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                                                l5d0[] l5d0VarArr = {l5d0VarA3, l5d0VarA4, zfnVar4.a(g1t0.n()), dw9.k(5, egp0.b), cn80.f4642a.a(fetVar6.k(bmd.n)), kcp0.c.a(Boolean.FALSE), kcp0.f18071a.a(null), egp0.d.a(3)};
                                                                final byte objArr = null == true ? 1 : 0;
                                                                obc.e(l5d0VarArr, u1c.M(-1572092915, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = objArr;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar6), fetVar6, 48);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            return Unit.f46060a;
                                                    }
                                                }
                                            }, fetVar3), u1c.M(-315891891, new xdr() { // from class: a.ipd
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // a.xdr
                                                public final Object F(Object obj7, Object obj8, Object obj9) {
                                                    w6n w6nVar;
                                                    w6n w6nVar2;
                                                    byte b9 = b8;
                                                    final kpd kpdVar3 = kpdVar2;
                                                    final byte b10 = 1;
                                                    switch (b9) {
                                                        case 0:
                                                            final mm40 mm40Var4 = (mm40) obj7;
                                                            fet fetVar4 = (fet) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            mm40Var4.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= fetVar4.g(mm40Var4) ? 4 : 2;
                                                            }
                                                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                zfn zfnVar = cn80.b;
                                                                udp0 udp0Var = kpdVar3.f18668a;
                                                                if (udp0Var instanceof ycp0) {
                                                                    w6nVar = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA = zfnVar.a(w6nVar);
                                                                l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.f);
                                                                zfn zfnVar2 = egp0.c;
                                                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                                obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar2.a(g1t0.n()), dw9.k(6, egp0.b), cn80.f4642a.a(fetVar4.k(bmd.n)), kcp0.c.a(Boolean.TRUE), kcp0.f18071a.a(null), egp0.d.a(3)}, u1c.M(-1109567477, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = b10;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var4, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar4), fetVar4, 48);
                                                            } else {
                                                                fetVar4.X();
                                                            }
                                                            return Unit.f46060a;
                                                        case 1:
                                                            fet fetVar5 = (fet) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((mm40) obj7).getClass();
                                                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                zcl zclVar5 = qmk.f28987a;
                                                                n4c.l(s5x0.L(jm40.b, 8.0f, 0.0f, 2), kpdVar3.d, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), fetVar5, 0);
                                                            } else {
                                                                fetVar5.X();
                                                            }
                                                            return Unit.f46060a;
                                                        default:
                                                            final mm40 mm40Var5 = (mm40) obj7;
                                                            fet fetVar6 = (fet) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            mm40Var5.getClass();
                                                            if ((iIntValue4 & 6) == 0) {
                                                                iIntValue4 |= fetVar6.g(mm40Var5) ? 4 : 2;
                                                            }
                                                            if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                                                zfn zfnVar3 = cn80.b;
                                                                udp0 udp0Var2 = kpdVar3.f18668a;
                                                                if (udp0Var2 instanceof ycp0) {
                                                                    w6nVar2 = w6n.k;
                                                                } else {
                                                                    if (!(udp0Var2 instanceof sdp0)) {
                                                                        t9f.b();
                                                                        return null;
                                                                    }
                                                                    w6nVar2 = w6n.f;
                                                                }
                                                                l5d0 l5d0VarA3 = zfnVar3.a(w6nVar2);
                                                                l5d0 l5d0VarA4 = egp0.f7775a.a(gqw0.d);
                                                                zfn zfnVar4 = egp0.c;
                                                                ((g1t0) fetVar6.k(j1t0.e)).getClass();
                                                                l5d0[] l5d0VarArr = {l5d0VarA3, l5d0VarA4, zfnVar4.a(g1t0.n()), dw9.k(5, egp0.b), cn80.f4642a.a(fetVar6.k(bmd.n)), kcp0.c.a(Boolean.FALSE), kcp0.f18071a.a(null), egp0.d.a(3)};
                                                                final byte objArr = null == true ? 1 : 0;
                                                                obc.e(l5d0VarArr, u1c.M(-1572092915, new Function2() { // from class: a.jpd
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        byte b11 = objArr;
                                                                        cl5 cl5Var = ukd.f35823a;
                                                                        kpd kpdVar4 = kpdVar3;
                                                                        switch (b11) {
                                                                            case 0:
                                                                                fet fetVar7 = (fet) obj10;
                                                                                int iIntValue5 = ((Integer) obj11).intValue();
                                                                                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                                    udp0 udp0Var3 = kpdVar4.b;
                                                                                    Object objP = fetVar7.P();
                                                                                    if (objP == cl5Var) {
                                                                                        objP = new shd((byte) 25);
                                                                                        fetVar7.o0(objP);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var3, (Function2) objP, fetVar7, 384, 0);
                                                                                } else {
                                                                                    fetVar7.X();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                fet fetVar8 = (fet) obj10;
                                                                                int iIntValue6 = ((Integer) obj11).intValue();
                                                                                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                                    udp0 udp0Var4 = kpdVar4.f18668a;
                                                                                    Object objP2 = fetVar8.P();
                                                                                    if (objP2 == cl5Var) {
                                                                                        objP2 = new shd((byte) 24);
                                                                                        fetVar8.o0(objP2);
                                                                                    }
                                                                                    kcp0.a(mm40Var5, udp0Var4, (Function2) objP2, fetVar8, 384, 0);
                                                                                } else {
                                                                                    fetVar8.X();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.f46060a;
                                                                    }
                                                                }, fetVar6), fetVar6, 48);
                                                            } else {
                                                                fetVar6.X();
                                                            }
                                                            return Unit.f46060a;
                                                    }
                                                }
                                            }, fetVar3)), fetVar3);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, 3504, 0);
                        fetVar.r(false);
                    } else if (yndVar instanceof opd) {
                        fetVar.e0(1485996153);
                        final opd opdVar = (opd) yndVar;
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarJ4 = s5x0.J(mm40VarE, 8.0f);
                        qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                        final byte b6 = z ? (byte) 1 : (byte) 0;
                        kc5.T(mm40VarJ4, qw3Var2, u1c.M(1540431432, new ydr() { // from class: a.npd
                            @Override // a.ydr
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i;
                                byte b7 = b6;
                                opd opdVar2 = opdVar;
                                switch (b7) {
                                    case 0:
                                        j83 j83Var = opdVar2.b;
                                        mm40 mm40Var2 = (mm40) obj4;
                                        fet fetVar2 = (fet) obj5;
                                        int iD = dw9.d((Integer) obj6, (y5d) obj3, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                        }
                                        if (!fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                            fetVar2.X();
                                        } else if (j83Var.b.length() > 0) {
                                            fetVar2.e0(-732694351);
                                            vic.a(mm40Var2, j83Var, fetVar2, (iD >> 3) & 14);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(-732531942);
                                            fetVar2.r(false);
                                        }
                                        break;
                                    default:
                                        y5d y5dVar = (y5d) obj3;
                                        mm40 mm40Var3 = (mm40) obj4;
                                        fet fetVar3 = (fet) obj5;
                                        int iD2 = dw9.d((Integer) obj6, y5dVar, mm40Var3);
                                        if ((iD2 & 6) == 0) {
                                            i = (fetVar3.g(y5dVar) ? 4 : 2) | iD2;
                                        } else {
                                            i = iD2;
                                        }
                                        if ((iD2 & 48) == 0) {
                                            i |= fetVar3.g(mm40Var3) ? 32 : 16;
                                        }
                                        if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                            mm40 mm40VarB = y5dVar.b(mm40Var3, true);
                                            tj30 tj30VarC = zq8.c(gqw0.e, false);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarB);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(e7z.u1);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC, gqw0.x);
                                            jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                            jpm0.n(fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                            v8q0.a(opdVar2.f25635a, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), new n05(qmk.q, qmk.v, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.t, null, j1t0.c, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar3, 0, 24960, 109554);
                                            fetVar3.r(true);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), u1c.M(-1853467929, new ydr() { // from class: a.npd
                            @Override // a.ydr
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i;
                                byte b7 = b2;
                                opd opdVar2 = opdVar;
                                switch (b7) {
                                    case 0:
                                        j83 j83Var = opdVar2.b;
                                        mm40 mm40Var2 = (mm40) obj4;
                                        fet fetVar2 = (fet) obj5;
                                        int iD = dw9.d((Integer) obj6, (y5d) obj3, mm40Var2);
                                        if ((iD & 48) == 0) {
                                            iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                                        }
                                        if (!fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                            fetVar2.X();
                                        } else if (j83Var.b.length() > 0) {
                                            fetVar2.e0(-732694351);
                                            vic.a(mm40Var2, j83Var, fetVar2, (iD >> 3) & 14);
                                            fetVar2.r(false);
                                        } else {
                                            fetVar2.e0(-732531942);
                                            fetVar2.r(false);
                                        }
                                        break;
                                    default:
                                        y5d y5dVar = (y5d) obj3;
                                        mm40 mm40Var3 = (mm40) obj4;
                                        fet fetVar3 = (fet) obj5;
                                        int iD2 = dw9.d((Integer) obj6, y5dVar, mm40Var3);
                                        if ((iD2 & 6) == 0) {
                                            i = (fetVar3.g(y5dVar) ? 4 : 2) | iD2;
                                        } else {
                                            i = iD2;
                                        }
                                        if ((iD2 & 48) == 0) {
                                            i |= fetVar3.g(mm40Var3) ? 32 : 16;
                                        }
                                        if (fetVar3.U(i & 1, (i & 147) != 146)) {
                                            mm40 mm40VarB = y5dVar.b(mm40Var3, true);
                                            tj30 tj30VarC = zq8.c(gqw0.e, false);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarB);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(e7z.u1);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC, gqw0.x);
                                            jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                            jpm0.n(fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                            v8q0.a(opdVar2.f25635a, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), new n05(qmk.q, qmk.v, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.t, null, j1t0.c, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar3, 0, 24960, 109554);
                                            fetVar3.r(true);
                                        } else {
                                            fetVar3.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, 3456, 0);
                        fetVar.r(false);
                    } else {
                        if (!(yndVar instanceof epd)) {
                            throw b1j.f(1485978562, fetVar, false);
                        }
                        fetVar.e0(1486000113);
                        zcl zclVar5 = qmk.f28987a;
                        kc5.T(s5x0.N(s5x0.L(mm40VarE, 8.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13), nw3Var, null, u1c.M(2064369169, new awh((epd) yndVar, (byte) 24), fetVar), fetVar, 3120, 4);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                jiq0.f(x8x.L(1), (fet) obj, mm40Var, l7m0Var);
                return Unit.f46060a;
            case 2:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zdx.d(6, fetVar2, mm40Var, l7m0Var);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ghm0.m(6, fetVar3, mm40Var, l7m0Var);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zdx.d(6, fetVar4, mm40Var, l7m0Var);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ghm0.m(6, fetVar5, mm40Var, l7m0Var);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                t9x.o(x8x.L(7), (fet) obj, mm40Var, l7m0Var);
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                o050.I(x8x.L(1), (fet) obj, mm40Var, l7m0Var);
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                btm0.j(x8x.L(1), (fet) obj, mm40Var, l7m0Var);
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ghm0.m(x8x.L(7), (fet) obj, mm40Var, l7m0Var);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ e2s(mm40 mm40Var, l7m0 l7m0Var, int i, byte b) {
        this.f7101a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
    }
}
