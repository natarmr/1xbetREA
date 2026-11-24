package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class sw6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rw90 f32905a = new rw90(true);
    public static final float b = 0.09f;

    public static final void a(mm40 mm40Var, final sx6 sx6Var, rln0 rln0Var, nke nkeVar, final lx6 lx6Var, final prm prmVar, final String str, final Function0 function0, final Function0 function1, final Function0 function2, final Function1 function3, Function1 function4, fet fetVar, final int i) {
        nke nkeVar2;
        final Function1 function5;
        final mm40 mm40Var2;
        pcy pcyVar;
        shd shdVar;
        shd shdVar2;
        cl5 cl5Var;
        boolean z;
        Function0 function6;
        boolean z2;
        Function0 function7;
        rln0 rln0Var2 = rln0Var;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(1465188750);
        int i2 = i | 6 | (fetVar2.g(sx6Var) ? 32 : 16) | (fetVar2.g(rln0Var2) ? 256 : 128) | (fetVar2.g(nkeVar) ? 2048 : 1024) | (fetVar2.e(lx6Var.ordinal()) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i2 |= fetVar2.g(prmVar) ? 131072 : 65536;
        }
        int i3 = i2 | (fetVar2.g(str) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i3 |= fetVar2.i(function0) ? 8388608 : 4194304;
        }
        int i4 = i3 | (fetVar2.i(function1) ? 67108864 : 33554432) | (fetVar2.i(function2) ? 536870912 : 268435456);
        int i5 = (fetVar2.i(function3) ? 4 : 2) | (fetVar2.i(function4) ? 32 : 16);
        if (fetVar2.U(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = epv0.N(o7k0.d(jm40Var, 1.0f), lx6Var == lx6.c ? 0.5f : 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarN, 16.0f, 0.0f, 2);
            xx7 xx7Var = gqw0.n;
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar5);
            jpm0.n(fetVar2);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar6);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.h, gqw0.k, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar3);
            jpm0.o(fetVar2, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar6);
            boolean z4 = nkeVar.f23677a;
            cl5 cl5Var2 = ukd.f35823a;
            if (z4) {
                fetVar2.e0(722988329);
                boolean z5 = nkeVar.c;
                if (function1 == null) {
                    fetVar2.e0(723186264);
                    Object objP = fetVar2.P();
                    if (objP == cl5Var2) {
                        objP = new lg6((byte) 21);
                        fetVar2.o0(objP);
                    }
                    function7 = (Function0) objP;
                    z2 = false;
                    fetVar2.r(false);
                } else {
                    z2 = false;
                    fetVar2.e0(993159418);
                    fetVar2.r(false);
                    function7 = function1;
                }
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                pcyVar = pcyVar2;
                b(R.drawable.ic_glyph_minus_small, 0, fetVar, null, function7, z5);
                fetVar2 = fetVar;
                fetVar2.r(z2);
            } else {
                pcyVar = pcyVar2;
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                fetVar2.e0(723219930);
                fetVar2.r(false);
            }
            mm40 mm40VarL2 = s5x0.L(dw9.h(1.0f, o7k0.e(r19, 52.0f), true), 12.0f, 0.0f, 2);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarL2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar3);
            jpm0.o(fetVar2, bh90VarM3, shdVar4);
            vqd.u(iHashCode3, fetVar2, shdVar, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar2);
            int i6 = i4 >> 6;
            c(null, sx6Var, lx6Var, sx6Var.c, str, function0, function3, fetVar2, (i4 & 112) | (i6 & 896) | (57344 & i6) | (458752 & i6) | ((i5 << 18) & 3670016));
            fetVar2 = fetVar;
            wvb.o(null, 4.0f, 0L, fetVar2, 0, 5);
            int iOrdinal = lx6Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar2.e0(1802545585);
                int i7 = i6 & 14;
                rln0Var2 = rln0Var;
                g(rln0Var2, fetVar2, i7);
                fetVar2.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(1443617603, fetVar2, false);
                }
                fetVar2.e0(1802682636);
                mm40 mm40VarP = o7k0.p(jm40Var, 96.0f, 14.0f);
                zcl zclVar2 = qmk.c;
                ugg0 ugg0Var = vgg0.f37379a;
                zq8.a(0, fetVar2, i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary10(), jd8.n));
                fetVar2.r(false);
                rln0Var2 = rln0Var;
            }
            fetVar2.r(true);
            nkeVar2 = nkeVar;
            if (nkeVar2.b) {
                fetVar2.e0(724627020);
                boolean z6 = nkeVar2.d;
                if (function2 == null) {
                    fetVar2.e0(724822072);
                    Object objP2 = fetVar2.P();
                    cl5Var = cl5Var2;
                    if (objP2 == cl5Var) {
                        objP2 = new lg6((byte) 22);
                        fetVar2.o0(objP2);
                    }
                    function6 = (Function0) objP2;
                    z = false;
                    fetVar2.r(false);
                } else {
                    cl5Var = cl5Var2;
                    z = false;
                    fetVar2.e0(993212217);
                    fetVar2.r(false);
                    function6 = function2;
                }
                b(R.drawable.ic_glyph_plus_small, 0, fetVar, null, function6, z6);
                fetVar2 = fetVar;
                fetVar2.r(z);
            } else {
                cl5Var = cl5Var2;
                fetVar2.e0(724855738);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            wvb.o(null, 10.0f, 0L, fetVar2, 0, 5);
            if (prmVar == null) {
                fetVar2.e0(-559305556);
                fetVar2.r(false);
                function5 = function4;
            } else {
                fetVar2.e0(-559305555);
                mm40 mm40VarD2 = o7k0.d(r19, 1.0f);
                boolean z7 = (i5 & 112) == 32;
                Object objP3 = fetVar2.P();
                if (z7 || objP3 == cl5Var) {
                    function5 = function4;
                    objP3 = new uo6(function5, (byte) 9);
                    fetVar2.o0(objP3);
                } else {
                    function5 = function4;
                }
                qcc.k(mm40VarD2, prmVar, (Function1) objP3, fetVar, 6, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = r19;
        } else {
            nkeVar2 = nkeVar;
            function5 = function4;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final nke nkeVar3 = nkeVar2;
            final rln0 rln0Var3 = rln0Var2;
            yfe0VarU.d = new Function2() { // from class: a.qw6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    sw6.a(mm40Var2, sx6Var, rln0Var3, nkeVar3, lx6Var, prmVar, str, function0, function1, function2, function3, function5, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(754982359);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                wul wulVar = new wul(nul.e, oe9.c, new te9(i), z, false, false);
                fetVar.o0(wulVar);
                objP = wulVar;
            }
            int i4 = 6 | ((i3 >> 3) & 896);
            jm40 jm40Var = jm40.b;
            qzb.n(jm40Var, (wul) objP, function0, fetVar, i4, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, i, z, function0, i2, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03be  */
    /* JADX WARN: Code duplicated, block: B:116:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x03da  */
    /* JADX WARN: Code duplicated, block: B:121:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:123:0x040a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0472  */
    /* JADX WARN: Code duplicated, block: B:127:0x0474  */
    /* JADX WARN: Code duplicated, block: B:130:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:132:0x04d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r13v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r13v6, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v7, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v31 */
    public static final void c(mm40 mm40Var, sx6 sx6Var, lx6 lx6Var, boolean z, String str, Function0 function0, Function1 function1, fet fetVar, int i) {
        lx6 lx6Var2;
        sx6 sx6Var2;
        mm40 mm40Var2;
        ?? r13;
        long jB;
        boolean z2;
        long secondary20;
        boolean z3;
        Object obj;
        pz40 pz40Var;
        jm40 jm40Var;
        shd shdVar;
        shd shdVar2;
        ?? r15;
        ?? r0;
        cl5 cl5Var;
        a8q0 a8q0Var;
        Function1 function2;
        long jC;
        ?? r11;
        ?? r14;
        Object objP;
        Object obj2;
        fet fetVar2 = fetVar;
        l7m0 l7m0Var = sx6Var.f32959a;
        fetVar2.g0(-101525609);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(sx6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.e(lx6Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function1) ? 1048576 : 524288;
        }
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            Object[] objArr = new Object[0];
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            Object obj3 = objP2;
            if (objP2 == cl5Var2) {
                lg6 lg6Var = new lg6((byte) 27);
                fetVar2.o0(lg6Var);
                obj3 = lg6Var;
            }
            pz40 pz40Var2 = (pz40) e9x.Q(objArr, (Function0) obj3, fetVar2, 48);
            Object[] objArr2 = new Object[0];
            Object objP3 = fetVar2.P();
            Object obj4 = objP3;
            if (objP3 == cl5Var2) {
                lg6 lg6Var2 = new lg6((byte) 28);
                fetVar2.o0(lg6Var2);
                obj4 = lg6Var2;
            }
            pz40 pz40Var3 = (pz40) e9x.Q(objArr2, (Function0) obj4, fetVar2, 48);
            if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                fetVar2.e0(-891999490);
                jB = afn0.m(fetVar2).getSecondary60();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-891948495);
                afn0.v(fetVar2).getClass();
                jB = g1t0.j().b();
                fetVar2.r(false);
            }
            long j = jB;
            afn0.v(fetVar2).getClass();
            smk0 smk0VarA = smk0.a(g1t0.j().f42262a, afn0.m(fetVar2).getCommerce(), null, 65534);
            a8q0 a8q0Var2 = (a8q0) l7m0Var.getValue();
            Boolean bool = (Boolean) pz40Var3.getValue();
            bool.booleanValue();
            boolean zG = ((i2 & 3670016) == 1048576) | fetVar2.g(pz40Var3);
            Object objP4 = fetVar2.P();
            Object obj5 = objP4;
            if (zG || objP4 == cl5Var2) {
                ua4 ua4Var = new ua4(function1, pz40Var3, null, (byte) 2);
                fetVar2.o0(ua4Var);
                obj5 = ua4Var;
            }
            m0x0.t(fetVar2, bool, (Function2) obj5);
            zcl zclVar = qmk.f28987a;
            if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                fetVar2.e0(1218171527);
                secondary20 = afn0.m(fetVar2).getPrimaryHighlight();
                z2 = false;
            } else {
                z2 = false;
                fetVar2.e0(1218172802);
                secondary20 = afn0.m(fetVar2).getSecondary20();
            }
            fetVar2.r(z2);
            long j2 = secondary20;
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarA = o7k0.A(s5x0.L(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(i120.S(jm40Var2, 1.0f, j2, ugg0Var2), 32.0f)), afn0.m(fetVar2).getBackgroundGroupSecondary(), jd8.n), 6.0f, 0.0f, 2), null, 3);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar5);
            jpm0.n(fetVar2);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar6);
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var2) {
                z3 = false;
                cgk0 cgk0VarB = androidx.compose.runtime.e.b(0);
                fetVar2.o0(cgk0VarB);
                obj = cgk0VarB;
            } else {
                z3 = false;
                obj = objP5;
            }
            cgk0 cgk0Var = (cgk0) obj;
            if (a8q0Var2.f440a.b.length() == 0) {
                fetVar2.e0(-1973647561);
                Object objP6 = fetVar2.P();
                Object obj6 = objP6;
                if (objP6 == cl5Var2) {
                    nw6 nw6Var = new nw6(cgk0Var, (byte) 5);
                    fetVar2.o0(nw6Var);
                    obj6 = nw6Var;
                }
                mm40 mm40VarD0 = ro4.d0(jm40Var2, (Function1) obj6);
                j83 j83VarB = phu0.B(sx6Var.b, sx6Var.e, smk0VarA);
                afn0.v(fetVar2).getClass();
                y9q0 y9q0VarJ = g1t0.j();
                afn0.v(fetVar2).getClass();
                nrq nrqVar = g1t0.j().f42262a.f;
                long secondary60 = afn0.m(fetVar2).getSecondary60();
                long j3 = qmk.o;
                afn0.v(fetVar2).getClass();
                pz40Var = pz40Var2;
                boolean z5 = z3;
                jm40Var = jm40Var2;
                shdVar = shdVar3;
                shdVar2 = shdVar6;
                v8q0.b(j83VarB, mm40VarD0, secondary60, new n05(j3, g1t0.j().f42262a.b, idm0.s(0.25d)), 0L, nrqVar, 0L, null, 0L, 2, false, 1, 0, null, null, y9q0VarJ, fetVar, 48, 24960, 241520);
                fet fetVar3 = fetVar;
                fetVar3.r(z5);
                r0 = z5;
                r15 = fetVar3;
            } else {
                pz40Var = pz40Var2;
                jm40Var = jm40Var2;
                shdVar = shdVar3;
                boolean z6 = z3;
                shdVar2 = shdVar6;
                fet fetVar4 = fetVar2;
                fetVar4.e0(-1972744004);
                fetVar4.r(z6);
                cgk0Var.m(z6 ? 1 : 0);
                r0 = z6;
                r15 = fetVar4;
            }
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, r15, 54);
            int iHashCode2 = Long.hashCode(r15.T);
            bh90 bh90VarM2 = r15.m();
            mm40 mm40VarC1 = kbc.c0(r15, jm40Var);
            r15.i0();
            if (r15.S) {
                r15.l(pcyVar);
            } else {
                r15.r0();
            }
            jpm0.o(r15, thg0VarA, shdVar);
            jpm0.o(r15, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, r15, shdVar5, r15);
            mm40 mm40VarQ = knx.Q(o7k0.u(ohs0.i(r15, mm40VarC1, shdVar2, 1.0f, r0), pkd.e(cgk0Var.l(), r15), 0.0f, 2), new ahd((byte) 22));
            int i3 = i2;
            pz40 pz40Var4 = pz40Var;
            ?? r3 = ((((r15.g(a8q0Var2) ? 1 : 0) | (r15.g(pz40Var3) ? 1 : 0)) | ((i3 & 7168) == 2048 ? 1 : r0)) == true ? 1 : 0) | (r15.g(pz40Var4) ? 1 : 0) | ((i3 & 458752) == 131072 ? 1 : r0);
            Object objP7 = r15.P();
            if (r3 == 0) {
                cl5Var = cl5Var2;
                if (objP7 != cl5Var) {
                    a8q0Var = a8q0Var2;
                }
                mm40 mm40VarB0 = j120.b0(mm40VarQ, (Function1) objP7);
                if (function1 == null) {
                    r15.e0(218123315);
                    objP = r15.P();
                    obj2 = objP;
                    if (objP == cl5Var) {
                        h26 h26Var = new h26((byte) 15);
                        r15.o0(h26Var);
                        obj2 = h26Var;
                    }
                    function2 = (Function1) obj2;
                    r15.r(r0);
                } else {
                    r15.e0(-962795616);
                    r15.r(r0);
                    function2 = function1;
                }
                afn0.v(r15).getClass();
                y9q0 y9q0VarQ = g1t0.q();
                lx6Var2 = lx6Var;
                if (lx6Var2 == lx6.b) {
                    r15.e0(-962788876);
                    jC = afn0.m(r15).getWarning();
                    r15.r(r0);
                } else {
                    jC = rz4.c(r15, -962787880, r15, r0);
                }
                y9q0 y9q0VarA = y9q0.a(y9q0VarQ, jC, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                sx6Var2 = sx6Var;
                qvf qvfVar = new qvf(sx6Var2.e, smk0.a(smk0VarA, 0L, new j56(b), 65279), str, j);
                skk0 skk0Var = new skk0(afn0.m(r15).getPrimary());
                uly ulyVar = new uly(0, null, 9, 0, 123);
                if (lx6Var2 != lx6.c) {
                    r11 = 1;
                } else {
                    r11 = r0;
                }
                z96.a(a8q0Var, function2, mm40VarB0, r11, false, y9q0VarA, ulyVar, null, true, 0, 0, qvfVar, null, null, skk0Var, null, fetVar, 102236160, 0, 46736);
                r14 = fetVar;
                if (((a8q0) l7m0Var.getValue()).f440a.b.length() > 0) {
                    r14.e0(219034064);
                    dww.c(a8k0.F(R.drawable.ic_glyph_edit, r0, r14), null, o7k0.n(jm40Var, 16.0f), afn0.m(r14).getPrimary(), r14, 56, 0);
                    r14.r(r0);
                } else {
                    r14.e0(219298773);
                    r14.r(r0);
                }
                r14.r(true);
                r14.r(true);
                mm40Var2 = jm40Var;
                r13 = r14;
            } else {
                cl5Var = cl5Var2;
            }
            a8q0Var = a8q0Var2;
            cw6 cw6Var = new cw6(a8q0Var, z, function0, pz40Var3, pz40Var4, (byte) 0);
            r15.o0(cw6Var);
            objP7 = cw6Var;
            mm40 mm40VarB1 = j120.b0(mm40VarQ, (Function1) objP7);
            if (function1 == null) {
                r15.e0(218123315);
                objP = r15.P();
                obj2 = objP;
                if (objP == cl5Var) {
                    h26 h26Var2 = new h26((byte) 15);
                    r15.o0(h26Var2);
                    obj2 = h26Var2;
                }
                function2 = (Function1) obj2;
                r15.r(r0);
            } else {
                r15.e0(-962795616);
                r15.r(r0);
                function2 = function1;
            }
            afn0.v(r15).getClass();
            y9q0 y9q0VarQ2 = g1t0.q();
            lx6Var2 = lx6Var;
            if (lx6Var2 == lx6.b) {
                r15.e0(-962788876);
                jC = afn0.m(r15).getWarning();
                r15.r(r0);
            } else {
                jC = rz4.c(r15, -962787880, r15, r0);
            }
            y9q0 y9q0VarA2 = y9q0.a(y9q0VarQ2, jC, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
            sx6Var2 = sx6Var;
            qvf qvfVar2 = new qvf(sx6Var2.e, smk0.a(smk0VarA, 0L, new j56(b), 65279), str, j);
            skk0 skk0Var2 = new skk0(afn0.m(r15).getPrimary());
            uly ulyVar2 = new uly(0, null, 9, 0, 123);
            if (lx6Var2 != lx6.c) {
                r11 = 1;
            } else {
                r11 = r0;
            }
            z96.a(a8q0Var, function2, mm40VarB1, r11, false, y9q0VarA2, ulyVar2, null, true, 0, 0, qvfVar2, null, null, skk0Var2, null, fetVar, 102236160, 0, 46736);
            r14 = fetVar;
            if (((a8q0) l7m0Var.getValue()).f440a.b.length() > 0) {
                r14.e0(219034064);
                dww.c(a8k0.F(R.drawable.ic_glyph_edit, r0, r14), null, o7k0.n(jm40Var, 16.0f), afn0.m(r14).getPrimary(), r14, 56, 0);
                r14.r(r0);
            } else {
                r14.e0(219298773);
                r14.r(r0);
            }
            r14.r(true);
            r14.r(true);
            mm40Var2 = jm40Var;
            r13 = r14;
        } else {
            lx6Var2 = lx6Var;
            sx6Var2 = sx6Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
            r13 = fetVar2;
        }
        yfe0 yfe0VarU = r13.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var2, sx6Var2, lx6Var2, z, str, function0, function1, i, (byte) 1);
        }
    }

    public static final void d(String str, fet fetVar, int i) {
        fetVar.g0(445765080);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, i2 & 14, 24960, 109562);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 12, i, str);
        }
    }

    public static final void e(String str, String str2, fet fetVar, int i) {
        fetVar.g0(-1631906707);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jwb.p(null, uc9.e, null, gqw0.j, 2, 0, u1c.M(33049192, new ew6(str, str2, (byte) 1), fetVar), fetVar, 1600560, 37);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 1, i, str, str2);
        }
    }

    public static final void f(String str, String str2, xdr xdrVar, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-97880506);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(str2) ? 32 : 16) | 384;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xdrVar = u1c.M(-1997986779, new h0(str2, (byte) 2), fetVar);
            fetVar2 = fetVar;
            jwb.p(null, uc9.e, null, gqw0.j, 2, 0, u1c.M(-1776625535, new qb(str, xdrVar, str2, (byte) 20), fetVar), fetVar2, 1600560, 37);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        xdr xdrVar2 = xdrVar;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2(str, str2, xdrVar2, i, (byte) 18);
        }
    }

    public static final void g(rln0 rln0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1161279445);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(rln0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if (rln0Var instanceof nln0) {
            fetVar.e0(-285471879);
            nln0 nln0Var = (nln0) rln0Var;
            f(nln0Var.f23737a, nln0Var.b, null, fetVar, 0);
            fetVar.r(false);
        } else if (rln0Var instanceof jln0) {
            fetVar.e0(-285247842);
            String str = ((jln0) rln0Var).f16725a;
            if (str.length() > 0) {
                fetVar.e0(-285192414);
                d(str, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-285120339);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            if (!(rln0Var instanceof mln0)) {
                throw b1j.f(-701947439, fetVar, false);
            }
            fetVar.e0(-285058618);
            mln0 mln0Var = (mln0) rln0Var;
            e(mln0Var.f22000a, mln0Var.b, fetVar, 0);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(rln0Var, i, (byte) 7);
        }
    }
}
