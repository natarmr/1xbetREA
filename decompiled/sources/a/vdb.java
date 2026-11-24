package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleDice;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vdb {
    public static final void A(mm40 mm40Var, cml0 cml0Var, boolean z, Function1 function1, fet fetVar, int i) {
        float f;
        ugd ugdVarM;
        function1.getClass();
        fetVar.g0(1304582552);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(cml0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (cml0Var instanceof xll0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, cml0Var, (byte) 15);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
            if (cml0Var instanceof zll0) {
                fetVar.e0(-339530493);
                ugdVarM = u1c.M(-1078831265, new d0n((Object) (fetVar.k(bmd.n) == k6z.b ? v0v0.b : v0v0.f36601a), (Object) cml0Var, (byte) 8), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-338871154);
                fetVar.r(false);
                ugdVarM = null;
            }
            a8k0.n(mm40VarW, f, 0L, ugdVarM, u1c.M(-1856806215, new d0n((Object) cml0Var, (Object) function1, (byte) 9), fetVar), u1c.M(1401150680, new jv1((Object) cml0Var, z, (byte) 19), fetVar), b34.i, fetVar, 1794048, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 2, i, (Object) mm40Var, (Object) cml0Var, (Object) function1, z);
        }
    }

    public static final void B(int i, fet fetVar) {
        fetVar.g0(-504810102);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            jcb.l(o7k0.e(wha0.a0(cjx.V(s5x0.N(jm40.b, 0.0f, 28.0f, 0.0f, 0.0f, 13), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14), 68.0f), new mdm(R.string.lottie_prophylaxis, pdm.c, null, R.drawable.ic_glyph_circle_favourite_secondary_60, 0, R.string.nothing_found, 0, 0, 0L, 0L, 724), false, null, fetVar, 0, 12);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svj(i, (byte) 26);
        }
    }

    public static final void C(j8o0 j8o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1245203881);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(j8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = n6o.f23004a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4) | fetVar.i(list);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m((Object) context, (Object) j8o0Var, (Object) list, (byte) 15);
                fetVar.o0(objP3);
            }
            y860.f(xdrVar, null, (Function1) objP3, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(j8o0Var, i, (byte) 29);
        }
    }

    public static final void D(mm40 mm40Var, lmo lmoVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fet fetVar2 = fetVar;
        lmoVar.getClass();
        function1.getClass();
        fetVar2.g0(-1005367061);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar2.g(lmoVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i6 = i5;
        if (fetVar2.U(i6 & 1, (i6 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i4 != 0 ? jm40Var : mm40Var2;
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(lmoVar.c), fetVar2);
            l7m0 l7m0VarB = d43.b(((Boolean) pz40VarF.getValue()).booleanValue() ? 180.0f : 0.0f, ro4.m0(300, 0, null, 6), null, null, fetVar2, 48, 28);
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var3, 1.0f), null, false, 3);
            boolean zG = fetVar2.g(pz40VarF) | ((i6 & 896) == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new rw1(function1, pz40VarF, (byte) 3);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW2 = y860.W(mm40VarW, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = ((Boolean) pz40VarF.getValue()).booleanValue() ? lmoVar.b : lmoVar.f20306a;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new mmn((byte) 20);
                fetVar2.o0(objP2);
            }
            ay3.f(str, null, (Function1) objP2, null, null, null, j2e.b, fetVar, 1573248, 58);
            m78 m78Var = new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f);
            boolean zG2 = fetVar.g(l7m0VarB);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new x1d(l7m0VarB, (byte) 29);
                fetVar.o0(objP3);
            }
            k7x.a(Integer.valueOf(R.drawable.ic_glyph_chevron_down_small), null, i4w0.T(mm40VarN, (Function1) objP3), null, m78Var, fetVar, 48, 1784);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hmo(mm40Var3, lmoVar, function1, i, i2, (byte) 1);
        }
    }

    public static final void E(mm40 mm40Var, t7p t7pVar, Function0 function0, Function0 function1, Function1 function2, Function0 function3, fet fetVar, int i, int i2) {
        Function0 function4;
        fet fetVar2 = fetVar;
        int i3 = i2 & 4;
        cl5 cl5Var = ukd.f35823a;
        if (i3 != 0) {
            Object objP = fetVar2.P();
            if (objP == cl5Var) {
                objP = new r4p((byte) 4);
                fetVar2.o0(objP);
            }
            function0 = (Function0) objP;
        }
        if ((i2 & 8) != 0) {
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new r4p((byte) 5);
                fetVar2.o0(objP2);
            }
            function1 = (Function0) objP2;
        }
        Function0 function5 = function1;
        if ((i2 & 16) != 0) {
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new e4p((byte) 10);
                fetVar2.o0(objP3);
            }
            function2 = (Function1) objP3;
        }
        Function1 function6 = function2;
        if ((i2 & 32) != 0) {
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new r4p((byte) 6);
                fetVar2.o0(objP4);
            }
            function4 = (Function0) objP4;
        } else {
            function4 = function3;
        }
        if (!(t7pVar instanceof r7p)) {
            if (!(t7pVar instanceof s7p)) {
                throw b1j.f(1317599026, fetVar2, false);
            }
            fetVar2.e0(-2103687225);
            ieb.v(mm40Var, (s7p) t7pVar, fetVar2, i & 126);
            fetVar2.r(false);
            return;
        }
        fetVar2.e0(-2104041524);
        r7p r7pVar = (r7p) t7pVar;
        int i4 = i & 524286;
        function0.getClass();
        function5.getClass();
        function6.getClass();
        function4.getClass();
        if (r7pVar instanceof p7p) {
            fetVar2.e0(2085920569);
            slb.f(mm40Var, (p7p) r7pVar, function0, function5, function6, function4, fetVar2, i4, 0);
            fetVar2 = fetVar2;
            fetVar2.r(false);
        } else {
            Function0 function7 = function0;
            Function0 function8 = function4;
            if (r7pVar instanceof o7p) {
                fetVar2.e0(2086362133);
                ieb.i(mm40Var, (o7p) r7pVar, function7, function5, function8, fetVar2, i & 8190);
                fetVar2.r(false);
            } else {
                if (!(r7pVar instanceof q7p)) {
                    throw b1j.f(898568932, fetVar2, false);
                }
                fetVar2.e0(2086727623);
                d9x.z(mm40Var, (q7p) r7pVar, function7, function5, function8, fetVar2, i & 8190);
                fetVar2.r(false);
            }
        }
        fetVar2.r(false);
    }

    public static final void F(jjl jjlVar, gjl gjlVar, final Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        long backgroundContent;
        long jM123getWhite0d7_KjU;
        long jM123getWhite0d7_KjU2;
        long jM75getBlack600d7_KjU;
        long jM75getBlack600d7_KjU2;
        long jM123getWhite0d7_KjU3;
        boolean z;
        fet fetVar2 = fetVar;
        jjlVar.getClass();
        y3d y3dVar = jjlVar.e;
        gjlVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1851649340);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(jjlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(gjlVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = fetVar2.k(bmd.n) == k6z.b;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP);
            }
            final agk0 agk0Var = (agk0) objP;
            boolean z3 = z2;
            l7m0 l7m0VarB = d43.b(agk0Var.l(), ro4.m0(Response.BAD_REQUEST, 0, new zsf(0.0f, 0.0f, 0.5f, 1.0f), 2), null, null, fetVar, 48, 28);
            float fFloatValue = z3 ? -((Number) l7m0VarB.getValue()).floatValue() : ((Number) l7m0VarB.getValue()).floatValue();
            boolean zH = fetVar.h(z3);
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(z3 ? R.drawable.ic_glyph_reload_rtl : R.drawable.ic_glyph_reload);
                fetVar.o0(objP2);
            }
            final cgk0 cgk0Var = (cgk0) objP2;
            String str = jjlVar.c;
            boolean zG = fetVar.g(y3dVar);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                if (y3dVar != null) {
                    backgroundContent = y3dVar.f41946a;
                } else {
                    pz40 pz40Var = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                }
                objP3 = dw9.e(backgroundContent, fetVar);
            }
            long j = ((y3d) objP3).f41946a;
            int i4 = i3 & 112;
            boolean z4 = i4 == 32;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM123getWhite0d7_KjU = s6t0.b().f33626a.getSecondary();
                } else {
                    pz40 pz40Var3 = s6t0.f31722a;
                    jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP4 = dw9.e(jM123getWhite0d7_KjU, fetVar);
            }
            long j2 = ((y3d) objP4).f41946a;
            boolean z5 = i4 == 32;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var4 = s6t0.f31722a;
                    jM123getWhite0d7_KjU2 = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var5 = s6t0.f31722a;
                    jM123getWhite0d7_KjU2 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP5 = dw9.e(jM123getWhite0d7_KjU2, fetVar);
            }
            final long j3 = ((y3d) objP5).f41946a;
            boolean z6 = i4 == 32;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var6 = s6t0.f31722a;
                    jM75getBlack600d7_KjU = s6t0.b().f33626a.getSecondaryButtonBackground();
                } else {
                    pz40 pz40Var7 = s6t0.f31722a;
                    jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
                }
                objP6 = dw9.e(jM75getBlack600d7_KjU, fetVar);
            }
            final long j4 = ((y3d) objP6).f41946a;
            boolean z7 = i4 == 32;
            Object objP7 = fetVar.P();
            if (z7 || objP7 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var8 = s6t0.f31722a;
                    jM75getBlack600d7_KjU2 = s6t0.b().f33626a.getBackground();
                } else {
                    pz40 pz40Var9 = s6t0.f31722a;
                    jM75getBlack600d7_KjU2 = StaticColors.INSTANCE.m75getBlack600d7_KjU();
                }
                objP7 = dw9.e(jM75getBlack600d7_KjU2, fetVar);
            }
            long j5 = ((y3d) objP7).f41946a;
            boolean z8 = i4 == 32;
            Object objP8 = fetVar.P();
            if (z8 || objP8 == cl5Var) {
                if (gjlVar == gjl.f11403a) {
                    pz40 pz40Var10 = s6t0.f31722a;
                    jM123getWhite0d7_KjU3 = s6t0.b().f33626a.getTextPrimary();
                } else {
                    pz40 pz40Var11 = s6t0.f31722a;
                    jM123getWhite0d7_KjU3 = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                objP8 = dw9.e(jM123getWhite0d7_KjU3, fetVar);
            }
            long j6 = ((y3d) objP8).f41946a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 16.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            final float f = fFloatValue;
            w9x.l(48.0f, 48.0f, u1c.M(-612278974, new Function2() { // from class: a.whq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    fet fetVar3 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                        zcl zclVar2 = qmk.f28987a;
                        jm40 jm40Var2 = jm40.b;
                        mm40 mm40VarE0 = o2e.e0(i120.Q(lgb.J(o7k0.n(s5x0.N(jm40Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), 32.0f), vgg0.a(10.0f)), j4, jd8.n), "UPDATE_ACCOUNT_BTN");
                        Object objP9 = fetVar3.P();
                        cl5 cl5Var2 = ukd.f35823a;
                        if (objP9 == cl5Var2) {
                            objP9 = dw9.j(fetVar3);
                        }
                        gy40 gy40Var = (gy40) objP9;
                        Function0 function3 = function0;
                        boolean zG2 = fetVar3.g(function3);
                        Object objP10 = fetVar3.P();
                        if (zG2 || objP10 == cl5Var2) {
                            objP10 = new zhq(function3, agk0Var, (byte) 0);
                            fetVar3.o0(objP10);
                        }
                        mm40 mm40VarW = y860.W(mm40VarE0, gy40Var, null, false, null, (Function0) objP10, 28);
                        tj30 tj30VarC = zq8.c(gqw0.e, false);
                        int iHashCode2 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM2 = fetVar3.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarW);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(e7z.u1);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                        dww.b(jpm0.t(cgk0Var.l(), 6, fetVar3), null, a8k0.I(o7k0.n(jm40Var2, 20.0f), f), j3, fetVar3, 48, 0);
                        fetVar3.r(true);
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 384, 0);
            fetVar2 = fetVar;
            w9x.l(48.0f, 0.0f, u1c.M(385458475, new xhq(j5, function1, jjlVar, j6, j2), fetVar), fetVar2, 384, 2);
            if (str != null) {
                fetVar2.e0(174364376);
                z = true;
                qzb.n(ig.a(fetVar2, o7k0.u(o7k0.e(jm40Var, 32.0f), 0.0f, 160.0f, 1)), new wul(iul.e, oe9.b, new ue9(str), true, false, false), function2, fetVar2, (i3 >> 6) & 896, 0);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(174996714);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yhq(jjlVar, gjlVar, function0, function1, function2, i, (byte) 0);
        }
    }

    public static final void G(fak0 fak0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        ugd ugdVarM;
        ugd ugdVarM2;
        ugd ugdVarM3;
        ugd ugdVarM4;
        ugd ugdVarM5;
        ugd ugdVar;
        function1.getClass();
        fetVar.g0(-835982594);
        byte b = 2;
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fak0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean zG = fetVar.g(fak0Var.c) | (i3 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ecd((byte) 1, fak0Var, function1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z = i3 == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                fetVar.o0(function1);
                objP2 = function1;
            }
            Function1 function2 = (Function1) objP2;
            byte b3 = 3;
            if (fak0Var.b.isEmpty()) {
                fetVar.e0(1758814088);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(1758586238);
                ugdVarM = u1c.M(1371224755, new fcd(fak0Var, b3), fetVar);
                fetVar.r(false);
            }
            if (fak0Var.l.length() > 0) {
                fetVar.e0(1759228744);
                ugdVarM2 = u1c.M(945830004, new fcd(fak0Var, b2), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(1759723752);
                fetVar.r(false);
                ugdVarM2 = null;
            }
            if (fak0Var.k instanceof p180) {
                fetVar.e0(1760303080);
                fetVar.r(false);
                ugdVarM3 = null;
            } else {
                fetVar.e0(1759874381);
                ugdVarM3 = u1c.M(1428828756, new fcd(fak0Var, (byte) 5), fetVar);
                fetVar.r(false);
            }
            if (fak0Var.q) {
                fetVar.e0(1760424569);
                ugdVarM4 = u1c.M(1980546096, new fcd(fak0Var, (byte) 6), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(1760810984);
                fetVar.r(false);
                ugdVarM4 = null;
            }
            if (fak0Var.j.isEmpty()) {
                fetVar.e0(1765731304);
                fetVar.r(false);
                ugdVarM5 = null;
            } else {
                fetVar.e0(1761079010);
                ugdVarM5 = u1c.M(555703517, new fcd(fak0Var, (byte) 7), fetVar);
                fetVar.r(false);
            }
            if (fak0Var.p.length() > 0) {
                fetVar.e0(1766087680);
                ugd ugdVarM6 = u1c.M(-1357514488, new gcd(b, fak0Var, function1), fetVar);
                fetVar.r(false);
                ugdVar = ugdVarM6;
            } else {
                fetVar.e0(1767205416);
                fetVar.r(false);
                ugdVar = null;
            }
            Q(function0, ugdVarM, u1c.M(498275137, new gcd(b3, fak0Var, function2), fetVar), ugdVarM2, ugdVarM3, ugdVarM4, ugdVarM5, ugdVar, fetVar, (i2 & 14) | 12585984);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hcd(fak0Var, function1, i, (byte) 1);
        }
    }

    public static final void H(tsv tsvVar, float f, Function2 function2, ugd ugdVar, fet fetVar, int i) {
        int i2;
        ugd ugdVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1637259063);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar2.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(tsvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            String strQ = w6x.q(tsvVar.b, " · \u200e", tsvVar.c);
            mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            int i4 = i2;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            feb.y(tsvVar.f34481a, f, fetVar2, (i4 >> 3) & 112);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 32.0f, 0.0f, 2);
            x5d x5dVarA2 = w5d.a(uc9.e, xx7Var, fetVar2, 6);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarG);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            v8q0.a(strQ, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            if (function2 == null) {
                fetVar2.e0(1066525664);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-658332607);
                h97.q((i4 >> 9) & 14, fetVar2, function2, false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 0.0f, 8.0f, 1), false, fetVar2, 6, 4);
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar2, Integer.valueOf((i4 >> 12) & 14));
            zq8.a(0, fetVar2, o7k0.e(jm40Var, 6.0f));
            fetVar2.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2(tsvVar, f, function2, ugdVar2, i);
        }
    }

    public static final void I(vqh vqhVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        float f;
        fetVar.g0(-1170540864);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(vqhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 34.0f);
            if (vqhVar != null) {
                boolean z = vqhVar instanceof tqh;
                if (!z) {
                    f = vqhVar instanceof uqh ? 4.0f : 2.0f;
                }
                x5d x5dVarA = w5d.a(new qw3(f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
                if (z) {
                    fetVar.e0(-1004984317);
                    tqh tqhVar = (tqh) vqhVar;
                    String str = tqhVar.g;
                    String str2 = tqhVar.f;
                    if (str2.length() > 0) {
                        fetVar.e0(-1004937290);
                        J(str2, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1004823892);
                        fetVar.r(false);
                    }
                    if (str.length() > 0) {
                        fetVar.e0(-1004751228);
                        J(str, ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU(), fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1004559028);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                    fetVar2 = fetVar;
                } else {
                    if (!(vqhVar instanceof uqh)) {
                        throw b1j.f(-32421005, fetVar, false);
                    }
                    fetVar.e0(-1004475824);
                    String str3 = ((uqh) vqhVar).f;
                    if (str3.length() > 0) {
                        fetVar.e0(-1004417637);
                        fetVar2 = fetVar;
                        j6n.h(str3, lso0.f20590a, null, 0, 0, fetVar2, 48, 28);
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar;
                        fetVar2.e0(-1004216788);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                }
                fetVar2.r(true);
            }
            t9f.b();
            return;
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(vqhVar, i, (byte) 29);
        }
    }

    public static final void J(String str, long j, fet fetVar, int i) {
        fetVar.g0(-1651131563);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            int i3 = i2 << 3;
            P(null, str, j, g1t0.g(), qmk.o, 1, fetVar, (i3 & 112) | 196608 | (i3 & 896));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bs0(str, j, i, (byte) 2);
        }
    }

    public static final void K(int i, fet fetVar) {
        fetVar.g0(1679742075);
        if (fetVar.U(i & 1, i != 0)) {
            sj3.m(0, 0L, fetVar, null);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svj(i, (byte) 27);
        }
    }

    public static final void L(String str, fet fetVar, int i) {
        int i2;
        fetVar.g0(1750232389);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 22.0f);
            zfn zfnVar = m8m0.f21378a;
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.S(i120.Q(mm40VarE, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f, ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 6.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            P(null, str, jM123getWhite0d7_KjU, g1t0.a(), qmk.p, 1, fetVar, ((i2 << 3) & 112) | 196608);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v(b, i, str);
        }
    }

    public static final void M(int i, fet fetVar, mm40 mm40Var, c280 c280Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-301357074);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(c280Var) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            fetVar2.e0(-2095219555);
            boolean zG = fetVar2.g(c280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            fetVar2.r(false);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, y9q0VarM, fetVar2, (i2 >> 3) & 14, 24960, 109554);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxm(mm40Var2, str, c280Var, i, (byte) 1);
        }
    }

    public static final void N(mm40 mm40Var, w1n w1nVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2;
        mm40 mm40Var3;
        fetVar.g0(-760697670);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(w1nVar) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            mm40 mm40VarN = jm40.b;
            mm40Var3 = i4 != 0 ? mm40VarN : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var3, 24.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            d280 d280Var = w1nVar.b;
            d280 d280Var2 = w1nVar.c;
            cl5 cl5Var = ukd.f35823a;
            if (d280Var != null) {
                fetVar.e0(769699118);
                boolean z = (i5 & 112) == 32;
                Object objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new wsm(w1nVar, (byte) 4);
                    fetVar.o0(objP);
                }
                kkb.p(1, fetVar, null, (Function0) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(769997028);
                fetVar.r(false);
            }
            if (d280Var2 != null) {
                fetVar.e0(770048488);
                mm40 mm40VarN2 = d280Var != null ? s5x0.N(mm40VarN, 2.0f, 0.0f, 0.0f, 0.0f, 14) : mm40VarN;
                boolean z2 = (i5 & 112) == 32;
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new wsm(w1nVar, (byte) 5);
                    fetVar.o0(objP2);
                }
                kkb.p(0, fetVar, mm40VarN2, (Function0) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(770567428);
                fetVar.r(false);
            }
            if (d280Var != null || d280Var2 != null) {
                mm40VarN = s5x0.N(mm40VarN, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            }
            mm40 mm40Var4 = mm40VarN;
            String str = w1nVar.f38410a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            long j = qmk.p;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            kc5.N(str, mm40Var4, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.d().f42262a.b, null, null, 0L, null, 2, false, 2, 0, false, null, y9q0VarD, 0.0f, fetVar, 0, 1597440, 0, 3063608);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ysm(mm40Var3, w1nVar, i, i2, (byte) 1);
        }
    }

    public static final void O(mm40 mm40Var, v1n v1nVar, fet fetVar, int i) {
        v1n v1nVar2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1753829012);
        int i2 = i | 6 | (fetVar2.g(v1nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 32.0f);
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 12.0f), 1.0f);
            String str = v1nVar.f36641a;
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.e0(-157790353);
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            fetVar2.r(false);
            v1nVar2 = v1nVar;
            pzb.n(null, ttm0.L(3, v1nVar2.b), new y3d(textPrimary), fetVar2, 0, 1);
            fetVar2.e0(-157471921);
            long textPrimary2 = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            fetVar2.r(false);
            pzb.n(null, ttm0.L(3, v1nVar2.c), new y3d(textPrimary2), fetVar2, 0, 1);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            v1nVar2 = v1nVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var2, v1nVar2, i, (byte) 22);
        }
    }

    public static final void P(mm40 mm40Var, final String str, final long j, final y9q0 y9q0Var, final long j2, final int i, fet fetVar, final int i2) {
        String str2;
        y9q0 y9q0Var2;
        int i3;
        final mm40 mm40Var2;
        fetVar.g0(-1040732334);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            y9q0Var2 = y9q0Var;
            i4 |= fetVar.g(y9q0Var2) ? 2048 : 1024;
        } else {
            y9q0Var2 = y9q0Var;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 = i;
            i4 |= fetVar.e(i3) ? 131072 : 65536;
        } else {
            i3 = i;
        }
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            n05 n05Var = new n05(j2, qmk.q, qmk.n);
            boolean z = (i4 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new f15((byte) 4, j);
                fetVar.o0(objP);
            }
            n4d n4dVar = (n4d) objP;
            y9q0 y9q0VarA = y9q0.a(y9q0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447);
            int i5 = ((i4 >> 3) & 14) | 24576;
            int i6 = i4 << 3;
            int i7 = i5 | (i6 & 112) | (i6 & 3670016);
            jm40 jm40Var = jm40.b;
            aad.e(str2, jm40Var, y9q0VarA, null, 2, false, i3, 0, n4dVar, n05Var, fetVar, i7, 168);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.rqh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vdb.P(mm40Var2, str, j, y9q0Var, j2, i, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void Q(Function0 function0, Function2 function2, ugd ugdVar, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, fet fetVar, int i) {
        int i2;
        boolean z;
        Object obj;
        boolean z2;
        Function2 function8 = function7;
        ugd ugdVar2 = cjx.j;
        fetVar.g0(255526385);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function6) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar.i(function8) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, (306783379 & i2) != 306783378)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            ycl yclVar = new ycl(8.0f);
            if (function2 != null) {
                yclVar = null;
            }
            int i4 = i2;
            mm40 mm40VarW = y860.W(s5x0.N(jm40Var, 0.0f, yclVar != null ? yclVar.f42389a : 0.0f, 0.0f, 0.0f, 13), null, null, false, null, function0, 28);
            boolean zF = ((i4 & 896) == 256) | fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                z = true;
                Object icdVar = new icd(backgroundContent, function2, true ? 1 : 0);
                fetVar.o0(icdVar);
                obj = icdVar;
            } else {
                z = true;
                obj = objP;
            }
            mm40 mm40VarK = rq8.K(mm40VarW, (Function1) obj);
            ycl yclVar2 = new ycl(8.0f);
            if (function2 != null) {
                yclVar2 = null;
            }
            mm40 mm40VarN = s5x0.N(mm40VarK, 0.0f, yclVar2 != null ? yclVar2.f42389a : 0.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            if (function2 == null) {
                fetVar.e0(-168880610);
                fetVar.r(false);
            } else {
                fetVar.e0(687288899);
                h97.q((i4 >> 6) & 14, fetVar, function2, false);
            }
            ugdVar.invoke(fetVar, Integer.valueOf((i4 >> 9) & 14));
            ugdVar2.invoke(fetVar, Integer.valueOf((i4 >> 21) & 14));
            if (function3 == null) {
                fetVar.e0(-168777442);
                z2 = false;
                fetVar.r(false);
            } else {
                z2 = false;
                fetVar.e0(687292227);
                h97.q((i4 >> 12) & 14, fetVar, function3, false);
            }
            if (function4 == null) {
                fetVar.e0(-168735778);
                fetVar.r(z2);
            } else {
                fetVar.e0(687293571);
                h97.q((i4 >> 15) & 14, fetVar, function4, z2);
            }
            if (function5 == null) {
                fetVar.e0(-168696098);
                fetVar.r(z2);
            } else {
                fetVar.e0(687294851);
                h97.q((i4 >> 18) & 14, fetVar, function5, z2);
            }
            if (function6 == null) {
                fetVar.e0(-168661378);
                fetVar.r(z2);
            } else {
                fetVar.e0(687295971);
                h97.q((i4 >> 24) & 14, fetVar, function6, z2);
            }
            if (function7 == null) {
                fetVar.e0(-168621698);
                fetVar.r(z2);
                function8 = function7;
            } else {
                fetVar.e0(687297251);
                function8 = function7;
                h97.q((i4 >> 27) & 14, fetVar, function8, z2);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ff4(function0, function2, ugdVar, function3, function4, function5, function6, function8, i);
        }
    }

    public static final void R(String str, boolean z, r0n r0nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1586280154);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(r0nVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            if (str.length() > 0) {
                fetVar.e0(-415800936);
                L(str, fetVar, i2 & 14);
                fetVar.r(false);
            } else {
                fetVar.e0(-415745198);
                fetVar.r(false);
            }
            if (r0nVar instanceof p0n) {
                fetVar.e0(-415638186);
                p0n p0nVar = (p0n) r0nVar;
                fgm fgmVar = p0nVar.b;
                boolean zE = fetVar.e(fgmVar.ordinal()) | fetVar.f(p0nVar.f26160a);
                Object objP = fetVar.P();
                if (zE || objP == ukd.f35823a) {
                    objP = new c8n(fgmVar == fgm.b ? r7n.c : r7n.f29985a, new w7n(new z7n(), u1c.O(p0nVar), true, 0, !z, null, 40));
                    fetVar.o0(objP);
                }
                v7n.c(null, (c8n) objP, null, fetVar, 5);
                fetVar.r(false);
            } else {
                fetVar.e0(-414842478);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((Object) str, z, (Object) r0nVar, i, (byte) 6);
        }
    }

    public static final void S(oe oeVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1535598706);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(oeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else {
            if (oeVar == null || !(oeVar instanceof oe)) {
                throw b1j.f(-1758390678, fetVar, false);
            }
            fetVar.e0(1324500939);
            String str = oeVar.f25098a;
            String str2 = oeVar.b;
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            paq0.b(null, str, str2, textPrimary, g1t0.w(), qmk.y, qmk.r, 0.0f, fetVar, 0, 129);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(oeVar, i, (byte) 7);
        }
    }

    public static final void T(lc00 lc00Var, m9s m9sVar, ctf0 ctf0Var, uiv uivVar) {
        m9sVar.getClass();
        ctf0Var.getClass();
        List list = uivVar.f35751a;
        if (list.isEmpty()) {
            return;
        }
        lsm0 lsm0Var = ctf0Var.b;
        hjm hjmVar = new hjm(lsm0Var.a(R.string.round_history, Arrays.copyOf(new Object[0], 0)), new njm(127), new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), null, null, null, false, null, null, false, null, null, 8184);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ziv zivVar = (ziv) obj;
            String str = zivVar.d;
            Boolean bool = zivVar.f;
            int i3 = zivVar.b;
            String str2 = str + i3 + i;
            String strA = lsm0Var.a(R.string.guilty_gear_round_v2, Arrays.copyOf(new Object[]{String.valueOf(i3)}, 1));
            String str3 = (String) CollectionsKt.firstOrNull(m9sVar.m);
            if (str3 == null) {
                str3 = "";
            }
            n0x n0xVar = new n0x(vsm0.t(str3));
            Boolean bool2 = Boolean.TRUE;
            ejv ejvVar = new ejv(n0xVar, Intrinsics.d(bool, bool2), bool != null);
            String str4 = (String) CollectionsKt.firstOrNull(m9sVar.n);
            ejv ejvVar2 = new ejv(new n0x(vsm0.t(str4 != null ? str4 : "")), Intrinsics.d(bool, Boolean.FALSE), bool != null);
            rdj rdjVar = rdj.f30294a;
            arrayList.add(new djv(str2, ejvVar, ejvVar2, strA, new yiv(lsm0Var.a(R.string.winner, Arrays.copyOf(new Object[0], 0)), zivVar.d, lsm0Var.a(R.string.mortal_kombat_type_win, Arrays.copyOf(new Object[0], 0)), zivVar.e, lsm0Var.a(R.string.mortal_kombat_finishing_off, Arrays.copyOf(new Object[0], 0)), zivVar.f44456a), rdj.h(new znq0(zivVar.c), ykq0.UNIQUE_2, bool2, null, 248)));
            i = i2;
        }
        lc00Var.add(new fjv(hjmVar, dyb.o0(arrayList)));
    }

    public static final mm40 U(long j, mm40 mm40Var) {
        zcl zclVar = qmk.g;
        ugg0 ugg0Var = vgg0.f37379a;
        ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
        return s5x0.J(i120.S(lgb.J(o7k0.e(mm40Var, 36.0f), ugg0Var2), 1.0f, j, ugg0Var2), 8.0f);
    }

    public static final void V(EventCardMiddleDice eventCardMiddleDice, jyr jyrVar) {
        eventCardMiddleDice.setFirstPlayerName(jyrVar.f17374a);
        gyr gyrVar = jyrVar.b;
        eventCardMiddleDice.setFirstPlayerTopFirstScore(gyrVar.f12144a);
        eventCardMiddleDice.setFirstPlayerTopSecondScore(gyrVar.b);
        eventCardMiddleDice.setFirstPlayerTopResult(gyrVar.c);
        gyr gyrVar2 = jyrVar.c;
        eventCardMiddleDice.setFirstPlayerBottomFirstScore(gyrVar2.f12144a);
        eventCardMiddleDice.setFirstPlayerBottomSecondScore(gyrVar2.b);
        eventCardMiddleDice.setFirstPlayerBottomResult(gyrVar2.c);
    }

    public static final void W(EventCardMiddleDice eventCardMiddleDice, kyr kyrVar) {
        eventCardMiddleDice.setSecondPlayerName(kyrVar.f19120a);
        gyr gyrVar = kyrVar.b;
        eventCardMiddleDice.setSecondPlayerTopFirstScore(gyrVar.f12144a);
        eventCardMiddleDice.setSecondPlayerTopSecondScore(gyrVar.b);
        eventCardMiddleDice.setSecondPlayerTopResult(gyrVar.c);
        gyr gyrVar2 = kyrVar.c;
        eventCardMiddleDice.setSecondPlayerBottomFirstScore(gyrVar2.f12144a);
        eventCardMiddleDice.setSecondPlayerBottomSecondScore(gyrVar2.b);
        eventCardMiddleDice.setSecondPlayerBottomResult(gyrVar2.c);
    }

    public static final void X(wm40 wm40Var, LinkedHashSet linkedHashSet, cr30 cr30Var, boolean z) {
        for (vjj vjjVar : uvw.t(cr30Var, cek.o, 2)) {
            if (vjjVar instanceof wm40) {
                wm40 wm40VarP1 = (wm40) vjjVar;
                if (wm40VarP1.Q()) {
                    g950 name = wm40VarP1.getName();
                    name.getClass();
                    foc focVarD = cr30Var.d(name, ux50.d);
                    wm40VarP1 = focVarD instanceof wm40 ? (wm40) focVarD : focVarD instanceof tfk ? ((tfk) focVarD).p1() : null;
                }
                if (wm40VarP1 != null) {
                    int i = oek.f25126a;
                    Iterator it = wm40VarP1.h().b().iterator();
                    while (it.hasNext()) {
                        if (oek.o((wsy) it.next(), wm40Var.o1())) {
                            linkedHashSet.add(wm40VarP1);
                            break;
                        }
                    }
                    if (z) {
                        cr30 cr30VarJ0 = wm40VarP1.j0();
                        cr30VarJ0.getClass();
                        X(wm40Var, linkedHashSet, cr30VarJ0, z);
                    }
                }
            }
        }
    }

    public static final String Y(String str, String str2, tv6 tv6Var, ctf0 ctf0Var, xte xteVar, boolean z) {
        ctf0Var.getClass();
        String str3 = (xteVar == xte.COMPACT_ACCENT_MARKET || xteVar == xte.BIG_TEAM_LOGO_ACCENT_TEAM) && z ? "Live, " : null;
        if (str3 == null) {
            str3 = "";
        }
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long j = tv6Var.f34584a;
        String str4 = tv6Var.b;
        String str5 = tv6Var.c;
        String strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
        if (xteVar == xte.COEF_WITH_BIG_ACCENT_TEAM) {
            String str6 = strG.length() > 0 ? ", " : null;
            if (str6 == null) {
                str6 = "";
            }
            StringBuilder sb = new StringBuilder(strG.concat(str6));
            if (str5.length() == 0 && str4.length() > 0) {
                sb.append(str4.concat(Separators.SP));
            } else if (str5.length() > 0) {
                sb.append(str5);
            } else {
                sb.append(ctf0Var.f(R.string.main_game, new Object[0]));
            }
            strG = sb.toString();
        }
        String strN = ohs0.n(strG, Z(tv6Var.d));
        String strZ = str.length() == 0 ? Z(str2) : null;
        return ua80.i(str3, strN, strZ != null ? strZ : "", Z(str));
    }

    public static final String Z(String str) {
        String str2 = str.length() > 0 ? ", " : null;
        if (str2 == null) {
            str2 = "";
        }
        return kng0.k(str2, str);
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final g3w a0(kzv kzvVar, ctf0 ctf0Var, boolean z) {
        String strA;
        String str = kzvVar.l;
        ctf0Var.getClass();
        if (!z || str.length() <= 0) {
            strA = kzvVar.g == i0w.i ? ctf0Var.b.a(R.string.sell_coefficient_with_dots, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = w6x.r(new Object[0], 0, ctf0Var.b, R.string.optional_coef, Separators.COLON);
        }
        if (!z || str.length() <= 0) {
            str = kzvVar.i;
        }
        g3w g3wVar = new g3w(strA, kng0.k("\u200e", str));
        if (str.length() > 0) {
            return g3wVar;
        }
        return null;
    }

    public static final void b(mm40 mm40Var, o0x o0xVar, int i, long j, y3d y3dVar, y3d y3dVar2, y3d y3dVar3, fet fetVar, int i2) {
        boolean z;
        long jM125getWhite100d7_KjU;
        fetVar.g0(-782949766);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o0xVar) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024) | (fetVar.g(y3dVar) ? 16384 : 8192) | (fetVar.g(y3dVar2) ? 131072 : 65536) | (fetVar.g(y3dVar3) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            long j2 = y3dVar3 != null ? y3dVar3.f41946a : y3d.f;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            if (y3dVar2 == null) {
                fetVar.e0(-795430399);
                jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
                z = false;
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(-795431608);
                fetVar.r(false);
                jM125getWhite100d7_KjU = y3dVar2.f41946a;
            }
            mm40 mm40VarJ = s5x0.J(i120.S(mm40VarQ, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, z);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            d(o0xVar, i, y3dVar, j, fetVar, ((i3 >> 3) & 126) | ((i3 >> 6) & 896) | (i3 & 7168));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jp(mm40Var, o0xVar, i, j, y3dVar, y3dVar2, y3dVar3, i2);
        }
    }

    public static final i3h0 b0(iv10 iv10Var, iwm0 iwm0Var, boolean z, boolean z2) {
        int i;
        String str;
        Pair pair;
        Pair pair2;
        String str2 = iv10Var.l;
        cnq0 cnq0Var = iv10Var.k;
        String str3 = iv10Var.j;
        String str4 = iv10Var.e;
        String str5 = iv10Var.f15422a;
        cso csoVar = iv10Var.c;
        jzm0 jzm0Var = iwm0Var.e;
        nbr nbrVar = iwm0Var.d;
        List list = iwm0Var.c;
        cso csoVar2 = iwm0Var.b;
        String str6 = iwm0Var.f15497a;
        if (!z || list.isEmpty()) {
            list = iv10Var.b;
        }
        if (!z || nbrVar.equals(new nbr(0, 0))) {
            nbrVar = iv10Var.o;
        }
        if (!z || jzm0Var.equals(new jzm0("", ""))) {
            jzm0Var = iv10Var.h;
        }
        if (!z || (i = iwm0Var.f) == 0) {
            i = iv10Var.i;
        }
        if (!z2) {
            List list2 = list;
            int i2 = i;
            String str7 = str5;
            nbr nbrVar2 = nbrVar;
            jzm0 jzm0Var2 = jzm0Var;
            if (z && str6.length() != 0) {
                str7 = str6;
            }
            if (z) {
                str = str7;
                if (!csoVar2.equals(new cso(new ldx(0.0d, 0, 0, ""), new ndf(new wcv0("", ""))))) {
                    csoVar = csoVar2;
                }
            } else {
                str = str7;
            }
            return new i3h0(str, list2, csoVar, nbrVar2, jzm0Var2, i2, iv10Var.d, str4, str3, cnq0Var, str2, iv10Var.p);
        }
        ldx ldxVar = csoVar2.f4900a;
        wcv0 wcv0Var = csoVar2.b.f23336a;
        String str8 = wcv0Var.f38944a;
        int i3 = i;
        wcv0 wcv0Var2 = csoVar.b.f23336a;
        jzm0 jzm0Var3 = jzm0Var;
        String str9 = wcv0Var2.f38944a;
        nbr nbrVar3 = nbrVar;
        boolean z3 = str8.length() > 0;
        boolean z4 = str9.length() > 0;
        if (z3) {
            pair2 = new Pair(str8, wcv0Var.b);
        } else {
            if (str6.length() > 0) {
                List listSplit$default = StringsKt__StringsKt.split$default(str6, new String[]{"-"}, false, 0, 6, null);
                String str10 = (String) CollectionsKt.W(0, listSplit$default);
                if (str10 == null) {
                    str10 = "";
                }
                String str11 = (String) CollectionsKt.W(1, listSplit$default);
                pair = new Pair(str10, str11 != null ? str11 : "");
            } else if (z4) {
                pair2 = new Pair(str9, wcv0Var2.b);
            } else {
                List listSplit$default2 = StringsKt__StringsKt.split$default(str5, new String[]{"-"}, false, 0, 6, null);
                String str12 = (String) CollectionsKt.W(0, listSplit$default2);
                if (str12 == null) {
                    str12 = "";
                }
                String str13 = (String) CollectionsKt.W(1, listSplit$default2);
                pair = new Pair(str12, str13 != null ? str13 : "");
            }
            pair2 = pair;
        }
        if (ldxVar.d.length() <= 0 || ldxVar.f19875a == 0) {
            ldxVar = csoVar.f4900a;
        }
        Object obj = pair2.f46059a;
        Object obj2 = pair2.b;
        return new i3h0(obj + " - " + obj2, list, new cso(ldxVar, new ndf(new wcv0((String) obj, (String) obj2))), nbrVar3, jzm0Var3, i3, iv10Var.d, str4, str3, cnq0Var, str2, iv10Var.p);
    }

    public static final void c(mm40 mm40Var, m0x m0xVar, int i, long j, String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1612463289);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(m0xVar) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024) | (fetVar2.g(str) ? 16384 : 8192) | (fetVar2.g(null) ? 131072 : 65536);
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarU = U(((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU(), mm40Var);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarU);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i4 = i3 >> 9;
            d(m0xVar, i, null, j, fetVar2, ((i3 >> 3) & 126) | (i4 & 896) | (i3 & 7168));
            fetVar2 = fetVar2;
            f(i4 & 112, 1, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, null, str);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg(mm40Var, m0xVar, i, j, str, i2);
        }
    }

    public static final iwe c0(m97 m97Var, q4f q4fVar) {
        m97Var.getClass();
        q4fVar.getClass();
        List listJ = q3d.j(q4f.c, q4f.m);
        if (m97Var.s) {
            return iwe.f;
        }
        if (m97Var.d) {
            return iwe.b;
        }
        if (m97Var.v) {
            return iwe.e;
        }
        if (!m97Var.x || listJ.contains(q4fVar)) {
            return (!m97Var.e || listJ.contains(q4fVar)) ? iwe.f15485a : iwe.c;
        }
        return iwe.d;
    }

    public static final void d(final o0x o0xVar, final int i, final y3d y3dVar, final long j, fet fetVar, final int i2) {
        o0x o0xVar2;
        int i3;
        fetVar.g0(-402748827);
        if ((i2 & 6) == 0) {
            o0xVar2 = o0xVar;
            i3 = (fetVar.g(o0xVar2) ? 4 : 2) | i2;
        } else {
            o0xVar2 = o0xVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(y3dVar) ? 256 : 128;
        }
        int i4 = i3 | (fetVar.f(j) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i5 = i4 << 6;
            rq8.b(o7k0.n(jm40Var, 20.0f), o7k0.n(jm40Var, 20.0f), o0xVar2, i, new y3d(j), y3dVar, null, gqw0.B, null, fetVar, (i5 & 7168) | (i5 & 896) | 12582912 | ((i4 << 3) & 57344) | ((i4 << 9) & 458752), 320);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.k2m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vdb.d(o0xVar, i, y3dVar, j, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final String d0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return (StringsKt.W(str) || kotlin.text.c.x(str2, str, true)) ? str2 : kng0.l(str, ": \u200e", str2);
    }

    public static final void e(mm40 mm40Var, String str, y3d y3dVar, y3d y3dVar2, fet fetVar, int i) {
        fetVar.g0(-329787805);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(y3dVar) ? 256 : 128) | (fetVar.g(null) ? 2048 : 1024) | (fetVar.g(y3dVar2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            long j = y3dVar.f41946a;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            fetVar.e0(901512497);
            fetVar.r(false);
            mm40 mm40VarJ = s5x0.J(i120.S(mm40VarQ, 1.0f, y3dVar2.f41946a, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-67732190);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            fetVar.r(false);
            f(i2 & 112, 1, jM123getWhite0d7_KjU, fetVar, null, str);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 12, i, (Object) mm40Var, (Object) str, (Object) y3dVar, (Object) y3dVar2);
        }
    }

    public static Set e0() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final void f(int i, int i2, long j, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        long j2;
        mm40 mm40Var2;
        fetVar.g0(-1104128254);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i3 |= fetVar.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarE0 = o2e.e0(mm40Var2, "BADGE_LABEL_TEXT");
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE0, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, ((i3 >> 3) & 14) | (i3 & 896), 24960, 110584);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l2m(mm40Var2, str, j, i, i2, (byte) 0);
        }
    }

    public static final String f0(tv6 tv6Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        String str = tv6Var.c;
        String str2 = tv6Var.e;
        String str3 = tv6Var.b;
        if (str.length() > 0) {
            return str;
        }
        if (str3.length() > 0) {
            return str3;
        }
        return str2.length() > 0 ? str2 : ctf0Var.f(R.string.main_game, new Object[0]);
    }

    public static final void g(mm40 mm40Var, v6n v6nVar, y3d y3dVar, y3d y3dVar2, fet fetVar, int i) {
        long jM125getWhite100d7_KjU;
        fetVar.g0(-986264492);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(v6nVar) ? 32 : 16) | (fetVar.g(y3dVar) ? 256 : 128) | (fetVar.g(y3dVar2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            long j = y3dVar2 != null ? y3dVar2.f41946a : y3d.f;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            if (y3dVar == null) {
                fetVar.e0(1387611131);
                jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(1387609922);
                fetVar.r(false);
                jM125getWhite100d7_KjU = y3dVar.f41946a;
            }
            mm40 mm40VarJ = s5x0.J(i120.S(mm40VarQ, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            h(v6nVar, fetVar, (i2 >> 3) & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 13, i, (Object) mm40Var, (Object) v6nVar, (Object) y3dVar, (Object) y3dVar2);
        }
    }

    public static final int g0(iwe iweVar, String str) {
        int iOrdinal;
        str.getClass();
        if ((str.length() > 0 && iweVar != iwe.f15485a && iweVar != iwe.c) || (iOrdinal = iweVar.ordinal()) == 1) {
            return R.style.Widget_DSMarket_Coupon_Blocked;
        }
        if (iOrdinal == 2) {
            return R.style.Widget_DSMarket_Coupon_Dependent;
        }
        if (iOrdinal != 3) {
            return (iOrdinal == 4 || iOrdinal == 5) ? R.style.Widget_DSMarket_Coupon_Blocked : R.style.Widget_DSMarket_Coupon_Default;
        }
        return R.style.Widget_DSMarket_Coupon_Unavailable;
    }

    public static final void h(v6n v6nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-144956026);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(v6nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new m2m(v6nVar, (byte) 0);
                fetVar.o0(objP);
            }
            kkb.p(1, fetVar, null, (Function0) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n2m(v6nVar, i);
        }
    }

    public static final String h0(iwe iweVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        int iOrdinal = iweVar.ordinal();
        if (iOrdinal == 1) {
            return ctf0Var.f(R.string.locked_coupon, new Object[0]);
        }
        if (iOrdinal == 2) {
            return ctf0Var.f(R.string.dependent_coupon, new Object[0]);
        }
        if (iOrdinal == 3) {
            return ctf0Var.f(R.string.only_for_single_coupon_type_allowed, new Object[0]);
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? "" : ctf0Var.f(R.string.completed, new Object[0]);
        }
        return ctf0Var.f(R.string.locked_coupon, new Object[0]);
    }

    public static final void i(mm40 mm40Var, u6n u6nVar, String str, fet fetVar, int i) {
        fetVar.g0(25062189);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(u6nVar) ? 32 : 16) | (fetVar.g(str) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarU = U(((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU(), mm40Var);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarU);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            h(u6nVar, fetVar, i3 & 14);
            f(i3 & 112, 1, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fetVar, null, str);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, u6nVar, str, i, (byte) 24);
        }
    }

    public static final wpf i0(int i) {
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return wpf.c;
                    }
                }
            }
            return wpf.b;
        }
        return wpf.f39542a;
    }

    public static final void j(String str, fet fetVar, int i) {
        fetVar.g0(18928777);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 28.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            long jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            P(null, str, jM130getWhite600d7_KjU, g1t0.d(), qmk.p, 2, fetVar, ((i2 << 3) & 112) | 196608);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 23, i, str);
        }
    }

    public static final void j0(Fragment fragment, String str, Function1 function1) {
        fragment.getClass();
        fragment.n0().r().u0(str, fragment, new sa4(function1, (byte) 2));
    }

    public static final void k(mm40 mm40Var, final g3w g3wVar, fet fetVar, int i) {
        g3wVar.getClass();
        fetVar.g0(1698926030);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(g3wVar) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zG = fetVar.g(g3wVar.f10632a + "COMPACT_TITLE_REMEMBER_ID");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ugd(654446174, true, new Function2() { // from class: a.lad
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b;
                        jm40 jm40Var = jm40.b;
                        g3w g3wVar2 = g3wVar;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    v8q0.a(g3wVar2.f10632a, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    v8q0.a(g3wVar2.b, o2e.e0(mrv.k0(jm40Var, "DESCRIPTION_TEXT"), "CoefficientInfoTestTag"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar3), fetVar3, 48, 24960, 110588);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean zG2 = fetVar.g(g3wVar.b + "COMPACT_DESCRIPTION_REMEMBER_ID");
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ugd(732567263, true, new Function2() { // from class: a.lad
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        jm40 jm40Var = jm40.b;
                        g3w g3wVar2 = g3wVar;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    v8q0.a(g3wVar2.f10632a, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    v8q0.a(g3wVar2.b, o2e.e0(mrv.k0(jm40Var, "DESCRIPTION_TEXT"), "CoefficientInfoTestTag"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar3), fetVar3, 48, 24960, 110588);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                fetVar.o0(objP2);
            }
            hmw0.j(mm40VarD, function2, (Function2) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, g3wVar, i, (byte) 26);
        }
    }

    public static xzs0 k0(List list, vzs0 vzs0Var, vjj vjjVar, ArrayList arrayList) {
        if (vzs0Var == null) {
            a(1);
            throw null;
        }
        if (vjjVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        xzs0 xzs0VarL0 = l0(list, vzs0Var, vjjVar, arrayList, null);
        if (xzs0VarL0 != null) {
            return xzs0VarL0;
        }
        c99.l("Substitution failed");
        return null;
    }

    public static final void l(final aig aigVar, xhg xhgVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(937770997);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar.g(aigVar) : fetVar.i(aigVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xhgVar) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            imm immVar = xhgVar.f40889a;
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && fetVar.i(aigVar));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.fjg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b2;
                        aig aigVar2 = aigVar;
                        switch (b4) {
                            case 0:
                                aigVar2.x(ihg.f14778a);
                                break;
                            default:
                                aigVar2.x(jhg.f16524a);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && fetVar.i(aigVar));
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ocg(aigVar, b3);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && fetVar.i(aigVar));
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ocg(aigVar, b);
                fetVar.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            if (i3 == 4 || ((i2 & 8) != 0 && fetVar.i(aigVar))) {
                b2 = 1;
            }
            Object objP4 = fetVar.P();
            if (b2 != 0 || objP4 == cl5Var) {
                objP4 = new Function0() { // from class: a.fjg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        aig aigVar2 = aigVar;
                        switch (b4) {
                            case 0:
                                aigVar2.x(ihg.f14778a);
                                break;
                            default:
                                aigVar2.x(jhg.f16524a);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP4);
            }
            hlm.c(null, immVar, null, function0, null, function1, function2, null, (Function0) objP4, null, null, null, fetVar, 0, 0, 3733);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(aigVar, xhgVar, i, (byte) 14);
        }
    }

    public static xzs0 l0(List list, vzs0 vzs0Var, vjj vjjVar, List list2, boolean[] zArr) {
        if (vzs0Var == null) {
            a(6);
            throw null;
        }
        if (vjjVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            hzs0 hzs0Var = (hzs0) it.next();
            int i2 = i + 1;
            izs0 izs0VarR1 = izs0.r1(i, hzs0Var.getAnnotations(), vjjVar, hzs0Var.D(), hzs0Var.getName(), hzs0Var.t(), hzs0Var.q());
            map.put(hzs0Var.h(), new q4m0(izs0VarR1.I()));
            map2.put(hzs0Var, izs0VarR1);
            list2.add(izs0VarR1);
            i = i2;
        }
        r4m0 r4m0Var = new r4m0(map, (byte) 1);
        xzs0 xzs0VarE = xzs0.e(vzs0Var, r4m0Var);
        xzs0 xzs0VarE2 = xzs0.e(new daa(vzs0Var, (byte) 1), r4m0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hzs0 hzs0Var2 = (hzs0) it2.next();
            izs0 izs0Var = (izs0) map2.get(hzs0Var2);
            for (wsy wsyVar : hzs0Var2.getUpperBounds()) {
                foc focVarN = wsyVar.S().n();
                wsy wsyVarH = (((focVarN instanceof hzs0) && vsm0.u((hzs0) focVarN, null, null)) ? xzs0VarE : xzs0VarE2).h(wsyVar, t3u0.e);
                if (wsyVarH == null) {
                    return null;
                }
                if (wsyVarH != wsyVar && zArr != null) {
                    zArr[0] = true;
                }
                if (izs0Var.m) {
                    jf4.n("Type parameter descriptor is already initialized: ".concat(izs0Var.t1()));
                    return null;
                }
                if (!bdx.k0(wsyVarH)) {
                    izs0Var.l.add(wsyVarH);
                }
            }
            if (izs0Var.m) {
                jf4.n("Type parameter descriptor is already initialized: ".concat(izs0Var.t1()));
                return null;
            }
            izs0Var.m = true;
        }
        return xzs0VarE;
    }

    public static final void m(aig aigVar, i4 i4Var, kwj kwjVar, a4x a4xVar, fet fetVar, int i) {
        int i2;
        Object obj;
        a4x a4xVar2;
        int i3;
        aigVar.getClass();
        a4xVar.getClass();
        fetVar.g0(1139049638);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(aigVar) : fetVar.i(aigVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = i4Var;
            i2 |= fetVar.g(obj) ? 32 : 16;
        } else {
            obj = i4Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(kwjVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            a4xVar2 = a4xVar;
            i2 |= fetVar.g(a4xVar2) ? 2048 : 1024;
        } else {
            a4xVar2 = a4xVar;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (a4xVar2.size() == 2) {
            fetVar.e0(-1108590920);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            float f = xfn.a(fetVar).e;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, f, 8.0f);
            a6g a6gVar = new a6g(kwjVar, xk80.class, "currentPage", "getCurrentPage()I", 0, (byte) 3);
            boolean zI = fetVar.i(vneVar) | ((i2 & 896) == 256) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(aigVar))) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                i3 = i2;
                dc0 dc0Var = new dc0((Object) vneVar, (Object) aigVar, obj, (Object) kwjVar, (byte) 23);
                fetVar.o0(dc0Var);
                objP2 = dc0Var;
            } else {
                i3 = i2;
            }
            ibc.o(mm40VarK, a4xVar2, gxh0.f12078a, false, a6gVar, (Function1) objP2, fetVar, ((i3 >> 6) & 112) | 384, 8);
            fetVar.r(false);
        } else {
            fetVar.e0(-1107910532);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 21, i, (Object) aigVar, (Object) i4Var, (Object) kwjVar, (Object) a4xVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final udb m0(ydb ydbVar) {
        ydbVar.getClass();
        Integer num = ydbVar.f42425a;
        ?? arrayList = 0;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        String str = ydbVar.b;
        if (str == null) {
            str = "";
        }
        List<ceb> list = ydbVar.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (ceb cebVar : list) {
                cebVar.getClass();
                String str2 = cebVar.b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = cebVar.f4202a;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new zdb(str2, str3));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new udb(str, arrayList, iIntValue);
    }

    public static final void n(final mm40 mm40Var, final jhh jhhVar, final Function1 function1, fet fetVar, final int i) {
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        fet fetVar2 = fetVar;
        a4x a4xVar = jhhVar.b;
        mm40Var.getClass();
        function1.getClass();
        fetVar2.g0(1455235411);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(jhhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar2.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2() { // from class: a.ygh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        int i4 = i;
                        Function1 function3 = function1;
                        jhh jhhVar2 = jhhVar;
                        mm40 mm40Var2 = mm40Var;
                        fet fetVar3 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b2) {
                            case 0:
                                vdb.n(mm40Var2, jhhVar2, function3, fetVar3, x8x.L(i4 | 1));
                                break;
                            default:
                                vdb.n(mm40Var2, jhhVar2, function3, fetVar3, x8x.L(i4 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mw3 mw3Var = uc9.c;
                xx7 xx7Var = gqw0.m;
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
                mkd.c0.getClass();
                fetVar2.i0();
                boolean z = fetVar2.S;
                pcy pcyVar = e7z.u1;
                if (z) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(fetVar2, x5dVarA, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar2, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar2, numValueOf, shdVar3);
                jpm0.n(fetVar2);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar2, mm40VarC0, shdVar4);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                y7m y7mVar = new y7m(new c8m(jhhVar.f16525a, rv00.m));
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var2 = jm40Var;
                int i4 = i3;
                wwb.j(mm40VarD, y7mVar, 4.0f, null, null, fetVar2, 6, 56);
                mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                Iterator itO = h97.o(fetVar2, mm40VarC1, shdVar4, 821414032, a4xVar);
                while (itO.hasNext()) {
                    ihh ihhVar = (ihh) itO.next();
                    zrm zrmVar = ihhVar.b;
                    int i5 = i4;
                    boolean zG = fetVar2.g(ihhVar) | ((i5 & 896) == 256);
                    Object objP = fetVar2.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new vef(function1, ihhVar, (byte) 10);
                        fetVar2.o0(objP);
                    }
                    jm40 jm40Var3 = jm40Var2;
                    agc.r(jm40Var3, zrmVar, (Function0) objP, null, null, null, null, fetVar, 6, 120);
                    jm40Var2 = jm40Var3;
                    fetVar2 = fetVar;
                    i4 = i5;
                }
                ohs0.x(fetVar2, false, true, true);
            }
            yfe0VarU.d = function2;
        }
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2() { // from class: a.ygh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i6 = i;
                    Function1 function3 = function1;
                    jhh jhhVar2 = jhhVar;
                    mm40 mm40Var2 = mm40Var;
                    fet fetVar3 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            vdb.n(mm40Var2, jhhVar2, function3, fetVar3, x8x.L(i6 | 1));
                            break;
                        default:
                            vdb.n(mm40Var2, jhhVar2, function3, fetVar3, x8x.L(i6 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0274  */
    /* JADX WARN: Code duplicated, block: B:105:0x027f  */
    /* JADX WARN: Code duplicated, block: B:108:0x02af  */
    /* JADX WARN: Code duplicated, block: B:110:0x02de  */
    /* JADX WARN: Code duplicated, block: B:118:0x0312  */
    /* JADX WARN: Code duplicated, block: B:121:0x031a  */
    /* JADX WARN: Code duplicated, block: B:123:0x031f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0326  */
    /* JADX WARN: Code duplicated, block: B:127:0x0329  */
    /* JADX WARN: Code duplicated, block: B:133:0x033d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0340  */
    /* JADX WARN: Code duplicated, block: B:136:0x0343  */
    /* JADX WARN: Code duplicated, block: B:139:0x0355  */
    /* JADX WARN: Code duplicated, block: B:140:0x035f  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:170:0x043d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0440  */
    /* JADX WARN: Code duplicated, block: B:173:0x0466  */
    /* JADX WARN: Code duplicated, block: B:174:0x047a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0498  */
    /* JADX WARN: Code duplicated, block: B:180:0x049b  */
    /* JADX WARN: Code duplicated, block: B:192:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:194:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:197:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:198:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:201:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:203:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:206:0x0503  */
    /* JADX WARN: Code duplicated, block: B:207:0x0505  */
    /* JADX WARN: Code duplicated, block: B:211:0x050e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0519  */
    /* JADX WARN: Code duplicated, block: B:216:0x052a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0533  */
    /* JADX WARN: Code duplicated, block: B:221:0x053e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0552 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:225:0x0554  */
    /* JADX WARN: Code duplicated, block: B:226:0x0559  */
    /* JADX WARN: Code duplicated, block: B:227:0x055e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0579  */
    /* JADX WARN: Code duplicated, block: B:232:0x057f  */
    /* JADX WARN: Code duplicated, block: B:236:0x0598  */
    /* JADX WARN: Code duplicated, block: B:237:0x059f  */
    /* JADX WARN: Code duplicated, block: B:240:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:245:0x05bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x05c3 A[Catch: Exception -> 0x05cc, TRY_LEAVE, TryCatch #0 {Exception -> 0x05cc, blocks: (B:238:0x05a5, B:242:0x05b5, B:247:0x05c0, B:248:0x05c3), top: B:569:0x05a5 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:256:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:259:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:260:0x0602  */
    /* JADX WARN: Code duplicated, block: B:263:0x060e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0612  */
    /* JADX WARN: Code duplicated, block: B:267:0x0636  */
    /* JADX WARN: Code duplicated, block: B:269:0x063e  */
    /* JADX WARN: Code duplicated, block: B:270:0x064c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x065d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0698  */
    /* JADX WARN: Code duplicated, block: B:278:0x069e  */
    /* JADX WARN: Code duplicated, block: B:302:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:309:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:310:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:313:0x070f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0712  */
    /* JADX WARN: Code duplicated, block: B:316:0x0716  */
    /* JADX WARN: Code duplicated, block: B:318:0x0721  */
    /* JADX WARN: Code duplicated, block: B:321:0x072b  */
    /* JADX WARN: Code duplicated, block: B:322:0x072e  */
    /* JADX WARN: Code duplicated, block: B:325:0x073e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0741  */
    /* JADX WARN: Code duplicated, block: B:329:0x076e  */
    /* JADX WARN: Code duplicated, block: B:333:0x077a  */
    /* JADX WARN: Code duplicated, block: B:336:0x0784  */
    /* JADX WARN: Code duplicated, block: B:340:0x0790  */
    /* JADX WARN: Code duplicated, block: B:343:0x079a  */
    /* JADX WARN: Code duplicated, block: B:347:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:350:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:355:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:357:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:358:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:360:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:361:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:364:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:365:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:368:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:369:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:372:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:376:0x0807  */
    /* JADX WARN: Code duplicated, block: B:379:0x0811  */
    /* JADX WARN: Code duplicated, block: B:383:0x081d  */
    /* JADX WARN: Code duplicated, block: B:386:0x0827  */
    /* JADX WARN: Code duplicated, block: B:390:0x0833  */
    /* JADX WARN: Code duplicated, block: B:393:0x0854  */
    /* JADX WARN: Code duplicated, block: B:396:0x085d  */
    /* JADX WARN: Code duplicated, block: B:399:0x0867  */
    /* JADX WARN: Code duplicated, block: B:402:0x0870  */
    /* JADX WARN: Code duplicated, block: B:404:0x0873 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:406:0x0878  */
    /* JADX WARN: Code duplicated, block: B:413:0x088c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:415:0x0891  */
    /* JADX WARN: Code duplicated, block: B:423:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:425:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:426:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:427:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:500:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:515:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:550:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:554:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:560:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:563:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:564:0x0ba4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01da  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:96:0x0208  */
    /* JADX WARN: Code duplicated, block: B:98:0x020c  */
    public static final vte n0(wue wueVar, boolean z, boolean z2, xte xteVar, ate ateVar, boolean z3, ctf0 ctf0Var) {
        slz slzVar;
        na30 na30Var;
        String str;
        boolean z4;
        String str2;
        slz slzVar2;
        String str3;
        boolean z5;
        boolean z6;
        String str4;
        String str5;
        String str6;
        i3h0 i3h0Var;
        xte xteVar2;
        cue aueVar;
        long j;
        long j2;
        m97 m97Var;
        na30 na30Var2;
        long j3;
        String strO;
        qu6 qu6Var;
        tv6 tv6Var;
        slz slzVar3;
        String str7;
        String str8;
        long j4;
        String str9;
        long j5;
        xte xteVar3;
        cnq0 cnq0Var;
        int i;
        boolean z7;
        boolean z8;
        boolean z9;
        ctf0 ctf0Var2;
        String str10;
        String str11;
        slz slzVar4;
        String strR;
        String strL;
        StringBuilder sb;
        String str12;
        String strA;
        String strConcat;
        String strConcat2;
        String str13;
        String strK;
        wue wueVar2;
        String str14;
        xte xteVar4;
        String str15;
        String strK2;
        String str16;
        String str17;
        String strF0;
        int iOrdinal;
        String strQ;
        int i2;
        String str18;
        double d;
        String str19;
        String str20;
        j0d j0dVar;
        boolean z10;
        hel0 hel0Var;
        String str21;
        long j6;
        String string;
        int i3;
        List list;
        String str22;
        i3h0 i3h0Var2;
        String str23;
        String str24;
        String str25;
        hel0 hel0Var2;
        String str26;
        String str27;
        yse useVar;
        yse xseVar;
        ctf0 ctf0Var3;
        int i4;
        String strL2;
        String strA2;
        String strA3;
        List list2;
        long j7;
        boolean z11;
        int i5;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        hf90 hf90Var;
        String str28;
        hf90 hf90Var2;
        String str29;
        hf90 hf90Var3;
        String str30;
        hf90 hf90Var4;
        String str31;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        hf90 hf90Var5;
        String str32;
        hf90 hf90Var6;
        String str33;
        hf90 hf90Var7;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        pip0 pip0Var;
        pip0 pip0Var2;
        vjp0 vjp0Var;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        String strValueOf5;
        String strValueOf6;
        String strValueOf7;
        Object obj;
        int i6;
        String strValueOf8;
        String strValueOf9;
        String strValueOf10;
        String strValueOf11;
        heu0 heu0Var;
        pip0 pip0VarQ;
        hf90 hf90Var8;
        String str39;
        pip0 pip0VarQ2;
        String str40;
        int iIntValue;
        String strJ0;
        Integer intOrNull;
        String strValueOf12;
        String strJ1;
        Integer intOrNull2;
        boolean z20;
        double d2;
        String strK3;
        wueVar.getClass();
        ctf0Var.getClass();
        m97 m97Var2 = wueVar.b;
        String str41 = wueVar.j;
        fho fhoVar = wueVar.i;
        p5t p5tVar = wueVar.h;
        q4f q4fVar = wueVar.d;
        iwe iweVarC0 = c0(m97Var2, q4fVar);
        qu6 qu6Var2 = wueVar.f39789a;
        String str42 = qu6Var2.v;
        String str43 = qu6Var2.p;
        String str44 = qu6Var2.q;
        String str45 = qu6Var2.m;
        String str46 = qu6Var2.j;
        tv6 tv6Var2 = qu6Var2.u;
        long j8 = qu6Var2.e;
        boolean z21 = qu6Var2.w == uoy.LIVE && !m97Var2.s;
        boolean z22 = xteVar == xte.CHAMP_NAME_ACCENT_COEF || xteVar == xte.BIG_TEAM_LOGO_ACCENT_TEAM || xteVar == xte.SMALL_TEAM_LOGO_ACCENT_COEF;
        iv10 iv10VarH = p5tVar != null ? p5tVar.z : l7x.H();
        String str47 = iv10VarH.j;
        String str48 = iv10VarH.e;
        iwm0 iwm0Var = p5tVar != null ? p5tVar.A : new iwm0("", new cso(new ldx(0.0d, 0, 0, ""), new ndf(new wcv0("", ""))), iun.f15405a, new nbr(0, 0), new jzm0("", ""), 0);
        boolean z23 = !Intrinsics.d(p5tVar != null ? Long.valueOf(p5tVar.f26422a) : null, p5tVar != null ? Long.valueOf(p5tVar.c) : null);
        long j9 = m97Var2.t;
        long j10 = m97Var2.t;
        i3h0 i3h0VarB0 = b0(iv10VarH, iwm0Var, z23, vtb.b0(j8, j9));
        i3h0 i3h0VarB1 = b0(wueVar.f, wueVar.g, z23, vtb.b0(j8, j10));
        String str49 = p5tVar != null ? p5tVar.v.f12320a : str46;
        String str50 = p5tVar != null ? p5tVar.w.f12320a : str45;
        String strQ2 = p5tVar != null ? p5tVar.x.f7170a : qu6Var2.n;
        if (strQ2.length() == 0) {
            String str51 = str50.length() > 0 ? " - " : null;
            if (str51 == null) {
                str51 = "";
            }
            strQ2 = w6x.q(str49, str51, str50);
        }
        if (p5tVar != null) {
            slzVar = p5tVar.u;
        } else {
            str44.getClass();
            slzVar = new slz(0, 0, "", str44, false);
        }
        if (p5tVar != null) {
            na30Var = p5tVar.y;
        } else {
            String str52 = qu6Var2.o;
            str52.getClass();
            na30Var = new na30(str52, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        }
        String str53 = na30Var.c;
        String str54 = na30Var.f;
        String str55 = na30Var.e;
        na30 na30Var3 = na30Var;
        String str56 = p5tVar != null ? p5tVar.z.t.f9453a.f10387a : null;
        if (str56 == null) {
            str56 = "";
        }
        boolean z24 = z21 != 0 && z22;
        try {
            try {
                if (z22 != 0) {
                    str = str56;
                    z4 = slzVar.equals(new slz(0, 0, "", "", false)) ? false : true;
                    if (p5tVar != null) {
                        str2 = p5tVar.l;
                    } else {
                        str2 = null;
                    }
                    if (z22 == 0) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    slzVar2 = slzVar;
                    if (p5tVar != null) {
                        str3 = p5tVar.e;
                    } else {
                        str3 = null;
                    }
                    if (z22 == 0) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (r4 == 176) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (p5tVar != null) {
                        z6 = p5tVar.r;
                    } else {
                        z6 = false;
                    }
                    if (z5) {
                        str4 = str3;
                        str5 = str2;
                        str6 = str53;
                        i3h0Var = i3h0VarB0;
                        xteVar2 = xteVar;
                        aueVar = new aue(strQ2);
                    } else {
                        String str57 = qu6Var2.h;
                        str4 = str3;
                        String str58 = qu6Var2.i;
                        str5 = str2;
                        String str59 = qu6Var2.k;
                        str6 = str53;
                        String str60 = qu6Var2.l;
                        int i7 = qu6Var2.A;
                        i3h0Var = i3h0VarB0;
                        ohs0.z(str46, str57, str58, str45, str59);
                        str60.getClass();
                        strK3 = mym0.k(str46, str55, z3);
                        String strK4 = mym0.k(str45, str54, z3);
                        if (strK3.length() > 0 || strK4.length() <= 0) {
                            xteVar2 = xteVar;
                            aueVar = new aue(strK3);
                        } else {
                            xteVar2 = xteVar;
                            aueVar = new bue(strK3, strK4, ipm0.m(i7, xteVar2, q3d.j(ipm0.l(str57), ipm0.l(str58))), ipm0.m(i7, xteVar2, q3d.j(ipm0.l(str59), ipm0.l(str60))));
                        }
                    }
                    cue cueVar = aueVar;
                    long j11 = qu6Var2.f29333a;
                    j = qu6Var2.x;
                    j2 = qu6Var2.c;
                    long j12 = qu6Var2.b;
                    long j13 = qu6Var2.e;
                    long j14 = m97Var2.t;
                    if (!z24) {
                        m97Var = m97Var2;
                        na30Var2 = na30Var3;
                        j3 = r4;
                        strO = strQ2;
                        qu6Var = qu6Var2;
                        tv6Var = tv6Var2;
                        slzVar3 = slzVar2;
                        str7 = str54;
                        str8 = str;
                        j4 = j;
                        str9 = str4;
                        String str61 = str5;
                        j5 = j2;
                        xteVar3 = xteVar2;
                        cnq0Var = iv10VarH.k;
                        i = cnq0Var.f4668a;
                        if (str48.length() > 0 && i <= 0 && str47.length() <= 0) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (str6.length() > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (xteVar3 == xte.BIG_TEAM_LOGO_ACCENT_TEAM) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!z7 || z8) {
                            ctf0Var2 = ctf0Var;
                            if (z9) {
                                str10 = "Live, ";
                            } else {
                                str10 = null;
                            }
                            if (str10 == null) {
                                str10 = "";
                            }
                            String strConcat3 = str10.concat(str6);
                            str11 = iv10VarH.l;
                            if (str47.length() == 0) {
                                na30Var2 = na30Var2;
                                slzVar4 = slzVar3;
                                strL = "";
                            } else {
                                if (cy7.c() || !z3) {
                                    slzVar4 = slzVar3;
                                    strR = kotlin.text.c.r(kotlin.text.c.r(str47, "-", Separators.COLON, false), Separators.COMMA, ", ", false);
                                } else {
                                    List listSplit$default = StringsKt__StringsKt.split$default(str47, new String[]{Separators.COMMA}, false, 0, 6, null);
                                    ArrayList arrayList = new ArrayList(r3d.q(listSplit$default, 10));
                                    Iterator it = listSplit$default.iterator();
                                    while (it.hasNext()) {
                                        List listSplit$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"-"}, false, 0, 6, null);
                                        arrayList.add(((String) CollectionsKt.d0(listSplit$default2)) + Separators.COLON + ((String) CollectionsKt.U(listSplit$default2)));
                                        it = it;
                                        slzVar3 = slzVar3;
                                    }
                                    slzVar4 = slzVar3;
                                    strR = cy7.e(arrayList.isEmpty() ? "" : CollectionsKt.b0(new ah30(arrayList), ", ", null, null, null, 62));
                                }
                                strL = kng0.l(Separators.LPAREN, strR, Separators.RPAREN);
                            }
                            sb = new StringBuilder(str48);
                            if (str48.length() > 0 && (str11.length() > 0 || i > 0 || strL.length() > 0)) {
                                sb.append(", ");
                            }
                            sb.append(str11);
                            if (str11.length() > 0 && (i > 0 || strL.length() > 0)) {
                                sb.append(", ");
                            }
                            if (i == 0) {
                                strConcat2 = "";
                            } else {
                                long j15 = i;
                                str12 = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j15 / 60), Long.valueOf(j15 % 60)}, 2));
                                if (cnq0Var.b == -1) {
                                    strA = ctf0Var2.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{str12}, 1));
                                } else {
                                    strA = ctf0Var2.b.a(R.string.time_passed_period_v2, Arrays.copyOf(new Object[]{str12}, 1));
                                }
                                strConcat = Separators.SP.concat(str8);
                                if (str8.length() <= 0) {
                                    strConcat = null;
                                }
                                if (strConcat == null) {
                                    strConcat = "";
                                }
                                strConcat2 = strA.concat(strConcat);
                            }
                            sb.append(strConcat2);
                            if (i > 0 && strL.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(strL);
                            String string2 = sb.toString();
                            if (z8 || string2.length() <= 0) {
                                str13 = null;
                            } else {
                                str13 = ", ";
                            }
                            if (str13 == null) {
                                str13 = "";
                            }
                            strK = b1j.k(strConcat3, str13, string2, Z(tv6Var.d), Z(str9));
                        } else {
                            strK = Y(str9, str61, tv6Var, ctf0Var, xteVar3, true);
                            ctf0Var2 = ctf0Var;
                        }
                        if (z4) {
                            String str62 = slzVar4.c;
                            String str63 = na30Var2.f23172a;
                            wueVar2 = wueVar;
                            str14 = wueVar2.c;
                            xteVar4 = xteVar;
                            if (xteVar4 != xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                                str14 = null;
                            }
                            if (str14 == null) {
                                str14 = "";
                            }
                            str62.getClass();
                            str63.getClass();
                            if (str14.length() > 0) {
                                str15 = ". ";
                            } else {
                                str15 = "";
                            }
                            strK2 = b1j.k(str14, str15, str62, str63.length() <= 0 ? "" : ". ", str63);
                        } else {
                            wueVar2 = wueVar;
                            xteVar4 = xteVar;
                            strK2 = str44;
                        }
                        strK2.getClass();
                        if (!z5) {
                            strO = xbc.O(str49, str50, str55, z3, str7);
                        }
                        str41.getClass();
                        if (xteVar4 == xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                            str16 = str43;
                            str17 = str42;
                            strF0 = d0(str16, str17);
                        } else {
                            str16 = str43;
                            str17 = str42;
                            strF0 = f0(tv6Var, ctf0Var2);
                        }
                        String str64 = strF0;
                        str64.getClass();
                        iOrdinal = xteVar4.ordinal();
                        if (iOrdinal != 3) {
                            strQ = w6x.q(f0(tv6Var, ctf0Var2), ", ", d0(str16, str17));
                        } else if (iOrdinal != 4) {
                            strQ = d0(str16, str17);
                        } else {
                            strQ = f0(tv6Var, ctf0Var2);
                        }
                        strQ.getClass();
                        String strH0 = h0(iweVarC0, ctf0Var2);
                        if (iweVarC0 != iwe.f) {
                            i2 = R.attr.uikitStaticRed;
                        } else {
                            i2 = R.attr.uikitSecondary;
                        }
                        int iG0 = g0(iweVarC0, str41);
                        m97 m97Var3 = m97Var;
                        str18 = m97Var3.n;
                        str18.getClass();
                        d = m97Var3.l;
                        str19 = wueVar2.e;
                        if (str19.length() == 0) {
                            str20 = "0";
                            z20 = true;
                        } else {
                            str20 = "0";
                            z20 = false;
                        }
                        d2 = Double.parseDouble(sj3.j0(str19, str20));
                        if (d <= d2 && !z20 && !z) {
                            j0dVar = j0d.b;
                        } else if (d < d2 || z20 || z) {
                            j0dVar = j0d.f15678a;
                        } else {
                            j0dVar = j0d.c;
                        }
                        if (z2 || q4fVar == q4f.m) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        str21 = strQ;
                        j6 = j3;
                        if (j6 != 0) {
                            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                            rz4.s(j6, ".svg", bzuVarD);
                            string = ((StringBuilder) bzuVarD.b).toString();
                        } else {
                            string = "";
                        }
                        if (xteVar4 == xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                            i3 = R.attr.uikitBackground;
                        } else {
                            i3 = R.attr.uikitSecondary;
                        }
                        hel0Var = new hel0(string, i3);
                        rse rseVarE0 = vbc.e0(ateVar.f1428a);
                        String str65 = xteVar4.f41462a;
                        list = i3h0VarB1.b;
                        str22 = i3h0VarB1.f14096a;
                        i3h0Var2 = i3h0Var;
                        str23 = i3h0Var2.f14096a;
                        int i8 = i2;
                        if (z21 != 0) {
                            list2 = i3h0Var2.b;
                            if (str23.length() == 0 && !z6) {
                                hel0Var2 = hel0Var;
                                str25 = str18;
                                j7 = j10;
                                if (vtb.b0(j6, j7)) {
                                    wcv0 wcv0Var = i3h0Var2.c.b.f23336a;
                                    String str66 = wcv0Var.f38944a;
                                    String str67 = wcv0Var.b;
                                    wcv0 wcv0Var2 = i3h0VarB1.c.b.f23336a;
                                    useVar = new tse(str66, vtb.X(ctf0Var2, i3h0Var2, 1), pzb.Q(str66, wcv0Var2.f38944a), str67, vtb.X(ctf0Var2, i3h0Var2, 2), pzb.Q(str67, wcv0Var2.b));
                                    str24 = Separators.SP;
                                    str26 = str41;
                                    str27 = "";
                                } else if ((j6 != 4 || j6 == 10 || j6 == 6 || j6 == 29 || j6 == 5 || j6 == 32 || j6 == 239 || j6 == 16 || j6 == 30 || j6 == 200 || j6 == 282 || j6 == 21 || j6 == 286) && xteVar4 == xte.BIG_TEAM_LOGO_ACCENT_TEAM) {
                                    if (str22.length() == 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    jzm0 jzm0Var = i3h0VarB1.e;
                                    String str68 = jzm0Var.f17422a;
                                    String str69 = jzm0Var.b;
                                    jzm0 jzm0Var2 = i3h0Var2.e;
                                    i5 = i3h0Var2.f;
                                    String str70 = jzm0Var2.f17422a;
                                    String str71 = jzm0Var2.b;
                                    if (i5 == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (i5 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    pip0 pip0VarR = yqm0.r(str68, str70, str69, str71, z12, z13, z11);
                                    if (i5 == 2) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (i5 != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    g3h0 g3h0Var = new g3h0(ctf0Var2.f(R.string.tennis_game_column, new Object[0]), str70, pip0VarR, str71, yqm0.r(str69, str71, str68, str70, z14, z15, z11));
                                    hf90Var = (hf90) CollectionsKt.f0(list);
                                    if (hf90Var != null || (strValueOf7 = String.valueOf(hf90Var.b)) == null) {
                                        str28 = "";
                                    } else {
                                        str28 = strValueOf7;
                                    }
                                    hf90Var2 = (hf90) CollectionsKt.f0(list);
                                    if (hf90Var2 != null || (strValueOf6 = String.valueOf(hf90Var2.c)) == null) {
                                        str29 = "";
                                    } else {
                                        str29 = strValueOf6;
                                    }
                                    hf90Var3 = (hf90) CollectionsKt.f0(list2);
                                    if (hf90Var3 != null || (strValueOf5 = String.valueOf(hf90Var3.b)) == null) {
                                        str30 = "";
                                    } else {
                                        str30 = strValueOf5;
                                    }
                                    hf90Var4 = (hf90) CollectionsKt.f0(list2);
                                    if (hf90Var4 != null || (strValueOf4 = String.valueOf(hf90Var4.c)) == null) {
                                        str31 = "";
                                    } else {
                                        str31 = strValueOf4;
                                    }
                                    if (i5 == 1) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (i5 != 0) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    pip0 pip0VarR2 = yqm0.r(str28, str30, str29, str31, z16, z17, z11);
                                    if (i5 == 2) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    String str72 = str29;
                                    String str73 = str28;
                                    String str74 = str31;
                                    String str75 = str30;
                                    if (i5 != 0) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    pip0 pip0VarR3 = yqm0.r(str72, str74, str73, str75, z18, z19, z11);
                                    hf90Var5 = (hf90) CollectionsKt.f0(list2);
                                    if (hf90Var5 != null || (strValueOf3 = String.valueOf(hf90Var5.f12962a)) == null) {
                                        str32 = "";
                                    } else {
                                        str32 = strValueOf3;
                                    }
                                    hf90Var6 = (hf90) CollectionsKt.f0(list2);
                                    if (hf90Var6 != null || (strValueOf2 = String.valueOf(hf90Var6.b)) == null) {
                                        str33 = "";
                                    } else {
                                        str33 = strValueOf2;
                                    }
                                    hf90Var7 = (hf90) CollectionsKt.f0(list2);
                                    if (hf90Var7 != null || (strValueOf = String.valueOf(hf90Var7.c)) == null) {
                                        str34 = "";
                                    } else {
                                        str34 = strValueOf;
                                    }
                                    g3h0 g3h0Var2 = new g3h0(str32, str33, pip0VarR2, str34, pip0VarR3);
                                    List listSplit$default3 = StringsKt__StringsKt.split$default(str22, new String[]{"-"}, false, 0, 6, null);
                                    List listSplit$default4 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                                    str35 = (String) CollectionsKt.W(0, listSplit$default3);
                                    if (str35 == null) {
                                        str35 = str20;
                                    }
                                    str36 = (String) CollectionsKt.W(0, listSplit$default4);
                                    if (str36 == null) {
                                        str36 = str20;
                                    }
                                    str37 = (String) CollectionsKt.W(1, listSplit$default3);
                                    if (str37 == null) {
                                        str37 = str20;
                                    }
                                    str38 = (String) CollectionsKt.W(1, listSplit$default4);
                                    if (str38 == null) {
                                        str38 = str20;
                                    }
                                    pip0Var = (!z11 || str35.equals(str36) || str36.equals(str20)) ? pip0.DEFAULT : pip0.CHANGED;
                                    pip0 pip0Var3 = pip0Var;
                                    pip0Var2 = (!z11 || str37.equals(str38) || str38.equals(str20)) ? pip0.DEFAULT : pip0.CHANGED;
                                    g3h0 g3h0Var3 = new g3h0(ctf0Var2.f(R.string.total_tennis_column, new Object[0]), str36, pip0Var3, str38, pip0Var2);
                                    if (i5 == 1) {
                                        vjp0Var = vjp0.b;
                                    } else if (i5 != 2) {
                                        vjp0Var = vjp0.f37541a;
                                    } else {
                                        vjp0Var = vjp0.c;
                                    }
                                    xseVar = new xse(g3h0Var, g3h0Var2, g3h0Var3, vjp0Var);
                                    str24 = Separators.SP;
                                    str21 = str21;
                                    str26 = str41;
                                    str27 = "";
                                } else {
                                    if (j6 == 40) {
                                        Iterator it2 = xkb.P().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            Object next = it2.next();
                                            Iterator it3 = it2;
                                            yxg yxgVar = (yxg) next;
                                            long j16 = j7;
                                            if (j6 == yxgVar.b && (j16 == yxgVar.f43419a || j16 == 0)) {
                                                obj = next;
                                                break;
                                            }
                                            it2 = it3;
                                            j7 = j16;
                                        }
                                        yxg yxgVar2 = (yxg) obj;
                                        if (yxgVar2 == null) {
                                            yxgVar2 = vtg.d;
                                        }
                                        if (yxgVar2.c == 1) {
                                            int i9 = i3h0Var2.l;
                                            int i10 = i3h0Var2.g;
                                            switch (i9) {
                                                case 1:
                                                    i6 = 1;
                                                    break;
                                                case 2:
                                                case 3:
                                                    i6 = 2;
                                                    break;
                                                case 4:
                                                case 5:
                                                    i6 = 3;
                                                    break;
                                                case 6:
                                                case 7:
                                                    i6 = 4;
                                                    break;
                                                default:
                                                    i6 = 0;
                                                    break;
                                            }
                                            List listSplit$default5 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                                            int i11 = i10 - 1;
                                            hf90 hf90Var9 = (hf90) CollectionsKt.W(i11, list);
                                            if (hf90Var9 == null || (strValueOf8 = String.valueOf(hf90Var9.b)) == null) {
                                                strValueOf8 = str20;
                                            }
                                            hf90 hf90Var10 = (hf90) CollectionsKt.W(i11, list2);
                                            if (hf90Var10 == null || (strValueOf9 = String.valueOf(hf90Var10.b)) == null) {
                                                strValueOf9 = str20;
                                            }
                                            hf90 hf90Var11 = (hf90) CollectionsKt.W(i11, list);
                                            if (hf90Var11 == null || (strValueOf10 = String.valueOf(hf90Var11.c)) == null) {
                                                strValueOf10 = str20;
                                            }
                                            hf90 hf90Var12 = (hf90) CollectionsKt.W(i11, list2);
                                            if (hf90Var12 == null || (strValueOf11 = String.valueOf(hf90Var12.c)) == null) {
                                                strValueOf11 = str20;
                                            }
                                            String str76 = (String) CollectionsKt.firstOrNull(listSplit$default5);
                                            heu0 heu0Var2 = new heu0((str76 == null || (strJ1 = sj3.j0(str76, str20)) == null || (intOrNull2 = StringsKt.toIntOrNull(strJ1)) == null) ? 0 : intOrNull2.intValue(), i6);
                                            if (strValueOf8.equals(strValueOf9)) {
                                                str24 = Separators.SP;
                                                heu0Var = heu0Var2;
                                                str26 = str41;
                                                str27 = "";
                                            } else {
                                                iun iunVar = iun.f15405a;
                                                ldx ldxVar = new ldx(0.0d, 0, 0, "");
                                                heu0Var = heu0Var2;
                                                str26 = str41;
                                                str24 = Separators.SP;
                                                str27 = "";
                                                if (!i3h0VarB1.equals(new i3h0("", iunVar, new cso(ldxVar, new ndf(new wcv0(str27, str27))), new nbr(0, 0), new jzm0(str27, str27), 0, 0, "", "", new cnq0(0, 0, false), "", 0))) {
                                                    pip0VarQ = pzb.Q(strValueOf9, strValueOf8);
                                                }
                                                pip0 pip0Var4 = pip0VarQ;
                                                hf90Var8 = (hf90) CollectionsKt.W(i11, list2);
                                                if (hf90Var8 != null || (strValueOf12 = String.valueOf(hf90Var8.c)) == null) {
                                                    str39 = str20;
                                                } else {
                                                    str39 = strValueOf12;
                                                }
                                                if (!strValueOf11.equals(strValueOf10) || i3h0VarB1.equals(new i3h0("", iun.f15405a, new cso(new ldx(0.0d, 0, 0, ""), new ndf(new wcv0(str27, str27))), new nbr(0, 0), new jzm0(str27, str27), 0, 0, "", "", new cnq0(0, 0, false), "", 0))) {
                                                    pip0VarQ2 = pip0.DEFAULT;
                                                } else {
                                                    pip0VarQ2 = pzb.Q(strValueOf11, strValueOf10);
                                                }
                                                pip0 pip0Var5 = pip0VarQ2;
                                                str40 = (String) CollectionsKt.W(1, listSplit$default5);
                                                if (str40 != null || (strJ0 = sj3.j0(str40, str20)) == null || (intOrNull = StringsKt.toIntOrNull(strJ0)) == null) {
                                                    iIntValue = 0;
                                                } else {
                                                    iIntValue = intOrNull.intValue();
                                                }
                                                useVar = new use(strValueOf9, heu0Var, pip0Var4, str39, pip0Var5, new heu0(iIntValue, i6), !list2.isEmpty());
                                            }
                                            pip0VarQ = pip0.DEFAULT;
                                            pip0 pip0Var6 = pip0VarQ;
                                            hf90Var8 = (hf90) CollectionsKt.W(i11, list2);
                                            if (hf90Var8 != null) {
                                                str39 = str20;
                                            } else {
                                                str39 = str20;
                                            }
                                            if (strValueOf11.equals(strValueOf10)) {
                                                pip0VarQ2 = pip0.DEFAULT;
                                            } else {
                                                pip0VarQ2 = pip0.DEFAULT;
                                            }
                                            pip0 pip0Var7 = pip0VarQ2;
                                            str40 = (String) CollectionsKt.W(1, listSplit$default5);
                                            if (str40 != null) {
                                                iIntValue = 0;
                                            } else {
                                                iIntValue = 0;
                                            }
                                            useVar = new use(strValueOf9, heu0Var, pip0Var6, str39, pip0Var7, new heu0(iIntValue, i6), !list2.isEmpty());
                                        }
                                    }
                                    str24 = Separators.SP;
                                    str21 = str21;
                                    str26 = str41;
                                    str27 = "";
                                    List listSplit$default6 = StringsKt__StringsKt.split$default(str22, new String[]{"-"}, false, 0, 6, null);
                                    List listSplit$default7 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                                    String str77 = (String) CollectionsKt.W(0, listSplit$default6);
                                    if (str77 == null) {
                                        str77 = str20;
                                    }
                                    String str78 = (String) CollectionsKt.W(0, listSplit$default7);
                                    if (str78 == null) {
                                        str78 = str20;
                                    }
                                    String str79 = (String) CollectionsKt.W(1, listSplit$default6);
                                    if (str79 == null) {
                                        str79 = str20;
                                    }
                                    String str80 = (String) CollectionsKt.W(1, listSplit$default7);
                                    if (str80 == null) {
                                        str80 = str20;
                                    }
                                    String str81 = (String) CollectionsKt.firstOrNull(listSplit$default7);
                                    if (str81 != null) {
                                        str20 = str81;
                                    }
                                    xseVar = new vse(str20, (str77.equals(str78) || str22.length() <= 0) ? pip0.DEFAULT : pzb.Q(str78, str77), str80, (str79.equals(str80) || str22.length() <= 0) ? pip0.DEFAULT : pzb.Q(str80, str79));
                                }
                            } else {
                                str24 = Separators.SP;
                                str25 = str18;
                                hel0Var2 = hel0Var;
                                str26 = str41;
                                str27 = "";
                                useVar = wse.f39686a;
                            }
                            xseVar = useVar;
                        } else {
                            str24 = Separators.SP;
                            str25 = str18;
                            hel0Var2 = hel0Var;
                            str26 = str41;
                            str27 = "";
                            useVar = wse.f39686a;
                            xseVar = useVar;
                        }
                        if (fhoVar != fho.b) {
                            ctf0Var3 = ctf0Var;
                            strL2 = str27;
                            i4 = 0;
                        } else if (xteVar4 != xte.COEF_WITH_BIG_ACCENT_TEAM || xteVar4 == xte.BIG_TEAM_LOGO_ACCENT_TEAM) {
                            ctf0Var3 = ctf0Var;
                            i4 = 0;
                            strL2 = kng0.l(ctf0Var3.b.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), str24, ctf0Var3.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            i4 = 0;
                            ctf0Var3 = ctf0Var;
                            strL2 = ctf0Var3.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0));
                        }
                        if (fhoVar != fho.c) {
                            strA2 = str27;
                        } else {
                            strA2 = ctf0Var3.b.a(R.string.option_bet_label, Arrays.copyOf(new Object[i4], i4));
                        }
                        if (fhoVar != fho.d) {
                            strA3 = str27;
                        } else {
                            strA3 = ctf0Var3.b.a(R.string.each_way, Arrays.copyOf(new Object[i4], i4));
                        }
                        return new vte(j11, j4, j5, j12, j13, j14, j12, z21, strK, strK2, strO, str26, str64, str21, strH0, i8, iG0, str25, j0dVar, z10, hel0Var2, str65, xseVar, cueVar, strL2, strA2, strA3, ctf0Var3.b.a(R.string.seka_state_live, Arrays.copyOf(new Object[i4], i4)), z3, qu6Var.x, rseVarE0);
                    }
                    m97Var = m97Var2;
                    na30Var2 = na30Var3;
                    j4 = j;
                    j3 = j8;
                    strO = strQ2;
                    j5 = j2;
                    qu6Var = qu6Var2;
                    tv6Var = tv6Var2;
                    slzVar3 = slzVar2;
                    str7 = str54;
                    strK = Y(str4, str5, tv6Var, ctf0Var, xteVar2, z21);
                    ctf0Var2 = ctf0Var;
                    na30Var2 = na30Var2;
                    slzVar4 = slzVar3;
                    str49 = str49;
                    if (z4) {
                        wueVar2 = wueVar;
                        xteVar4 = xteVar;
                        strK2 = str44;
                    } else {
                        String str610 = slzVar4.c;
                        String str611 = na30Var2.f23172a;
                        wueVar2 = wueVar;
                        str14 = wueVar2.c;
                        xteVar4 = xteVar;
                        if (xteVar4 != xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                            str14 = null;
                        }
                        if (str14 == null) {
                            str14 = "";
                        }
                        str610.getClass();
                        str611.getClass();
                        if (str14.length() > 0) {
                            str15 = ". ";
                        } else {
                            str15 = "";
                        }
                        strK2 = b1j.k(str14, str15, str610, str611.length() <= 0 ? "" : ". ", str611);
                    }
                    strK2.getClass();
                    if (!z5) {
                        strO = xbc.O(str49, str50, str55, z3, str7);
                    }
                    str41.getClass();
                    if (xteVar4 == xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                        str16 = str43;
                        str17 = str42;
                        strF0 = d0(str16, str17);
                    } else {
                        str16 = str43;
                        str17 = str42;
                        strF0 = f0(tv6Var, ctf0Var2);
                    }
                    String str612 = strF0;
                    str612.getClass();
                    iOrdinal = xteVar4.ordinal();
                    if (iOrdinal != 3) {
                        strQ = w6x.q(f0(tv6Var, ctf0Var2), ", ", d0(str16, str17));
                    } else if (iOrdinal != 4) {
                        strQ = d0(str16, str17);
                    } else {
                        strQ = f0(tv6Var, ctf0Var2);
                    }
                    strQ.getClass();
                    String strH1 = h0(iweVarC0, ctf0Var2);
                    if (iweVarC0 != iwe.f) {
                        i2 = R.attr.uikitStaticRed;
                    } else {
                        i2 = R.attr.uikitSecondary;
                    }
                    int iG1 = g0(iweVarC0, str41);
                    m97 m97Var4 = m97Var;
                    str18 = m97Var4.n;
                    str18.getClass();
                    d = m97Var4.l;
                    str19 = wueVar2.e;
                    if (str19.length() == 0) {
                        str20 = "0";
                        z20 = true;
                    } else {
                        str20 = "0";
                        z20 = false;
                    }
                    d2 = Double.parseDouble(sj3.j0(str19, str20));
                    if (d <= d2) {
                        if (d < d2) {
                            j0dVar = j0d.f15678a;
                        } else {
                            j0dVar = j0d.f15678a;
                        }
                    } else if (d < d2) {
                        j0dVar = j0d.f15678a;
                    } else {
                        j0dVar = j0d.f15678a;
                    }
                    if (z2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    str21 = strQ;
                    j6 = j3;
                    if (j6 != 0) {
                        bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j6, ".svg", bzuVarD2);
                        string = ((StringBuilder) bzuVarD2.b).toString();
                    } else {
                        string = "";
                    }
                    if (xteVar4 == xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                        i3 = R.attr.uikitBackground;
                    } else {
                        i3 = R.attr.uikitSecondary;
                    }
                    hel0Var = new hel0(string, i3);
                    rse rseVarE1 = vbc.e0(ateVar.f1428a);
                    String str613 = xteVar4.f41462a;
                    list = i3h0VarB1.b;
                    str22 = i3h0VarB1.f14096a;
                    i3h0Var2 = i3h0Var;
                    str23 = i3h0Var2.f14096a;
                    int i12 = i2;
                    if (z21 != 0) {
                        list2 = i3h0Var2.b;
                        if (str23.length() == 0) {
                            str24 = Separators.SP;
                            str25 = str18;
                            hel0Var2 = hel0Var;
                            str26 = str41;
                            str27 = "";
                            useVar = wse.f39686a;
                            xseVar = useVar;
                        } else {
                            hel0Var2 = hel0Var;
                            str25 = str18;
                            j7 = j10;
                            if (vtb.b0(j6, j7)) {
                                wcv0 wcv0Var3 = i3h0Var2.c.b.f23336a;
                                String str614 = wcv0Var3.f38944a;
                                String str615 = wcv0Var3.b;
                                wcv0 wcv0Var4 = i3h0VarB1.c.b.f23336a;
                                useVar = new tse(str614, vtb.X(ctf0Var2, i3h0Var2, 1), pzb.Q(str614, wcv0Var4.f38944a), str615, vtb.X(ctf0Var2, i3h0Var2, 2), pzb.Q(str615, wcv0Var4.b));
                                str24 = Separators.SP;
                                str26 = str41;
                                str27 = "";
                            } else if (j6 != 4) {
                                if (str22.length() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                jzm0 jzm0Var3 = i3h0VarB1.e;
                                String str616 = jzm0Var3.f17422a;
                                String str617 = jzm0Var3.b;
                                jzm0 jzm0Var4 = i3h0Var2.e;
                                i5 = i3h0Var2.f;
                                String str710 = jzm0Var4.f17422a;
                                String str711 = jzm0Var4.b;
                                if (i5 == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (i5 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                pip0 pip0VarR4 = yqm0.r(str616, str710, str617, str711, z12, z13, z11);
                                if (i5 == 2) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i5 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                g3h0 g3h0Var4 = new g3h0(ctf0Var2.f(R.string.tennis_game_column, new Object[0]), str710, pip0VarR4, str711, yqm0.r(str617, str711, str616, str710, z14, z15, z11));
                                hf90Var = (hf90) CollectionsKt.f0(list);
                                if (hf90Var != null) {
                                    str28 = "";
                                } else {
                                    str28 = "";
                                }
                                hf90Var2 = (hf90) CollectionsKt.f0(list);
                                if (hf90Var2 != null) {
                                    str29 = "";
                                } else {
                                    str29 = "";
                                }
                                hf90Var3 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var3 != null) {
                                    str30 = "";
                                } else {
                                    str30 = "";
                                }
                                hf90Var4 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var4 != null) {
                                    str31 = "";
                                } else {
                                    str31 = "";
                                }
                                if (i5 == 1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (i5 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                pip0 pip0VarR5 = yqm0.r(str28, str30, str29, str31, z16, z17, z11);
                                if (i5 == 2) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                String str712 = str29;
                                String str713 = str28;
                                String str714 = str31;
                                String str715 = str30;
                                if (i5 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                pip0 pip0VarR6 = yqm0.r(str712, str714, str713, str715, z18, z19, z11);
                                hf90Var5 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var5 != null) {
                                    str32 = "";
                                } else {
                                    str32 = "";
                                }
                                hf90Var6 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var6 != null) {
                                    str33 = "";
                                } else {
                                    str33 = "";
                                }
                                hf90Var7 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var7 != null) {
                                    str34 = "";
                                } else {
                                    str34 = "";
                                }
                                g3h0 g3h0Var5 = new g3h0(str32, str33, pip0VarR5, str34, pip0VarR6);
                                List listSplit$default8 = StringsKt__StringsKt.split$default(str22, new String[]{"-"}, false, 0, 6, null);
                                List listSplit$default9 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                                str35 = (String) CollectionsKt.W(0, listSplit$default8);
                                if (str35 == null) {
                                    str35 = str20;
                                }
                                str36 = (String) CollectionsKt.W(0, listSplit$default9);
                                if (str36 == null) {
                                    str36 = str20;
                                }
                                str37 = (String) CollectionsKt.W(1, listSplit$default8);
                                if (str37 == null) {
                                    str37 = str20;
                                }
                                str38 = (String) CollectionsKt.W(1, listSplit$default9);
                                if (str38 == null) {
                                    str38 = str20;
                                }
                                if (!z11) {
                                    pip0Var = pip0.DEFAULT;
                                }
                                pip0 pip0Var8 = pip0Var;
                                if (!z11) {
                                    pip0Var2 = pip0.DEFAULT;
                                }
                                g3h0 g3h0Var6 = new g3h0(ctf0Var2.f(R.string.total_tennis_column, new Object[0]), str36, pip0Var8, str38, pip0Var2);
                                if (i5 == 1) {
                                    vjp0Var = vjp0.b;
                                } else if (i5 != 2) {
                                    vjp0Var = vjp0.f37541a;
                                } else {
                                    vjp0Var = vjp0.c;
                                }
                                xseVar = new xse(g3h0Var4, g3h0Var5, g3h0Var6, vjp0Var);
                                str24 = Separators.SP;
                                str21 = str21;
                                str26 = str41;
                                str27 = "";
                            } else {
                                if (str22.length() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                jzm0 jzm0Var5 = i3h0VarB1.e;
                                String str618 = jzm0Var5.f17422a;
                                String str619 = jzm0Var5.b;
                                jzm0 jzm0Var6 = i3h0Var2.e;
                                i5 = i3h0Var2.f;
                                String str716 = jzm0Var6.f17422a;
                                String str717 = jzm0Var6.b;
                                if (i5 == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (i5 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                pip0 pip0VarR7 = yqm0.r(str618, str716, str619, str717, z12, z13, z11);
                                if (i5 == 2) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i5 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                g3h0 g3h0Var7 = new g3h0(ctf0Var2.f(R.string.tennis_game_column, new Object[0]), str716, pip0VarR7, str717, yqm0.r(str619, str717, str618, str716, z14, z15, z11));
                                hf90Var = (hf90) CollectionsKt.f0(list);
                                if (hf90Var != null) {
                                    str28 = "";
                                } else {
                                    str28 = "";
                                }
                                hf90Var2 = (hf90) CollectionsKt.f0(list);
                                if (hf90Var2 != null) {
                                    str29 = "";
                                } else {
                                    str29 = "";
                                }
                                hf90Var3 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var3 != null) {
                                    str30 = "";
                                } else {
                                    str30 = "";
                                }
                                hf90Var4 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var4 != null) {
                                    str31 = "";
                                } else {
                                    str31 = "";
                                }
                                if (i5 == 1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (i5 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                pip0 pip0VarR8 = yqm0.r(str28, str30, str29, str31, z16, z17, z11);
                                if (i5 == 2) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                String str718 = str29;
                                String str719 = str28;
                                String str7110 = str31;
                                String str7111 = str30;
                                if (i5 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                pip0 pip0VarR9 = yqm0.r(str718, str7110, str719, str7111, z18, z19, z11);
                                hf90Var5 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var5 != null) {
                                    str32 = "";
                                } else {
                                    str32 = "";
                                }
                                hf90Var6 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var6 != null) {
                                    str33 = "";
                                } else {
                                    str33 = "";
                                }
                                hf90Var7 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var7 != null) {
                                    str34 = "";
                                } else {
                                    str34 = "";
                                }
                                g3h0 g3h0Var8 = new g3h0(str32, str33, pip0VarR8, str34, pip0VarR9);
                                List listSplit$default10 = StringsKt__StringsKt.split$default(str22, new String[]{"-"}, false, 0, 6, null);
                                List listSplit$default11 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                                str35 = (String) CollectionsKt.W(0, listSplit$default10);
                                if (str35 == null) {
                                    str35 = str20;
                                }
                                str36 = (String) CollectionsKt.W(0, listSplit$default11);
                                if (str36 == null) {
                                    str36 = str20;
                                }
                                str37 = (String) CollectionsKt.W(1, listSplit$default10);
                                if (str37 == null) {
                                    str37 = str20;
                                }
                                str38 = (String) CollectionsKt.W(1, listSplit$default11);
                                if (str38 == null) {
                                    str38 = str20;
                                }
                                if (!z11) {
                                    pip0Var = pip0.DEFAULT;
                                }
                                pip0 pip0Var9 = pip0Var;
                                if (!z11) {
                                    pip0Var2 = pip0.DEFAULT;
                                }
                                g3h0 g3h0Var9 = new g3h0(ctf0Var2.f(R.string.total_tennis_column, new Object[0]), str36, pip0Var9, str38, pip0Var2);
                                if (i5 == 1) {
                                    vjp0Var = vjp0.b;
                                } else if (i5 != 2) {
                                    vjp0Var = vjp0.f37541a;
                                } else {
                                    vjp0Var = vjp0.c;
                                }
                                xseVar = new xse(g3h0Var7, g3h0Var8, g3h0Var9, vjp0Var);
                                str24 = Separators.SP;
                                str21 = str21;
                                str26 = str41;
                                str27 = "";
                            }
                            xseVar = useVar;
                        }
                    } else {
                        str24 = Separators.SP;
                        str25 = str18;
                        hel0Var2 = hel0Var;
                        str26 = str41;
                        str27 = "";
                        useVar = wse.f39686a;
                        xseVar = useVar;
                    }
                    if (fhoVar != fho.b) {
                        ctf0Var3 = ctf0Var;
                        strL2 = str27;
                        i4 = 0;
                    } else if (xteVar4 != xte.COEF_WITH_BIG_ACCENT_TEAM) {
                        ctf0Var3 = ctf0Var;
                        i4 = 0;
                        strL2 = kng0.l(ctf0Var3.b.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), str24, ctf0Var3.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                    } else {
                        ctf0Var3 = ctf0Var;
                        i4 = 0;
                        strL2 = kng0.l(ctf0Var3.b.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), str24, ctf0Var3.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                    }
                    if (fhoVar != fho.c) {
                        strA2 = str27;
                    } else {
                        strA2 = ctf0Var3.b.a(R.string.option_bet_label, Arrays.copyOf(new Object[i4], i4));
                    }
                    if (fhoVar != fho.d) {
                        strA3 = str27;
                    } else {
                        strA3 = ctf0Var3.b.a(R.string.each_way, Arrays.copyOf(new Object[i4], i4));
                    }
                    return new vte(j11, j4, j5, j12, j13, j14, j12, z21, strK, strK2, strO, str26, str612, str21, strH1, i12, iG1, str25, j0dVar, z10, hel0Var2, str613, xseVar, cueVar, strL2, strA2, strA3, ctf0Var3.b.a(R.string.seka_state_live, Arrays.copyOf(new Object[i4], i4)), z3, qu6Var.x, rseVarE1);
                }
                str = str56;
                if (!z24) {
                    m97Var = m97Var2;
                    na30Var2 = na30Var3;
                    j3 = r4;
                    strO = strQ2;
                    qu6Var = qu6Var2;
                    tv6Var = tv6Var2;
                    slzVar3 = slzVar2;
                    str7 = str54;
                    str8 = str;
                    j4 = j;
                    str9 = str4;
                    String str620 = str5;
                    j5 = j2;
                    xteVar3 = xteVar2;
                    cnq0Var = iv10VarH.k;
                    i = cnq0Var.f4668a;
                    if (str48.length() > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (str6.length() > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (xteVar3 == xte.BIG_TEAM_LOGO_ACCENT_TEAM) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z7) {
                    }
                    ctf0Var2 = ctf0Var;
                    if (z9) {
                        str10 = "Live, ";
                    } else {
                        str10 = null;
                    }
                    if (str10 == null) {
                        str10 = "";
                    }
                    String strConcat4 = str10.concat(str6);
                    str11 = iv10VarH.l;
                    if (str47.length() == 0) {
                        na30Var2 = na30Var2;
                        slzVar4 = slzVar3;
                        strL = "";
                    } else {
                        if (cy7.c()) {
                            slzVar4 = slzVar3;
                            strR = kotlin.text.c.r(kotlin.text.c.r(str47, "-", Separators.COLON, false), Separators.COMMA, ", ", false);
                        } else {
                            slzVar4 = slzVar3;
                            strR = kotlin.text.c.r(kotlin.text.c.r(str47, "-", Separators.COLON, false), Separators.COMMA, ", ", false);
                        }
                        strL = kng0.l(Separators.LPAREN, strR, Separators.RPAREN);
                    }
                    sb = new StringBuilder(str48);
                    if (str48.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(str11);
                    if (str11.length() > 0) {
                        sb.append(", ");
                    }
                    if (i == 0) {
                        strConcat2 = "";
                    } else {
                        long j17 = i;
                        str12 = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j17 / 60), Long.valueOf(j17 % 60)}, 2));
                        if (cnq0Var.b == -1) {
                            strA = ctf0Var2.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{str12}, 1));
                        } else {
                            strA = ctf0Var2.b.a(R.string.time_passed_period_v2, Arrays.copyOf(new Object[]{str12}, 1));
                        }
                        strConcat = Separators.SP.concat(str8);
                        if (str8.length() <= 0) {
                            strConcat = null;
                        }
                        if (strConcat == null) {
                            strConcat = "";
                        }
                        strConcat2 = strA.concat(strConcat);
                    }
                    sb.append(strConcat2);
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(strL);
                    String string3 = sb.toString();
                    if (z8) {
                        str13 = null;
                    } else {
                        str13 = null;
                    }
                    if (str13 == null) {
                        str13 = "";
                    }
                    strK = b1j.k(strConcat4, str13, string3, Z(tv6Var.d), Z(str9));
                    if (z4) {
                        wueVar2 = wueVar;
                        xteVar4 = xteVar;
                        strK2 = str44;
                    } else {
                        String str6110 = slzVar4.c;
                        String str6111 = na30Var2.f23172a;
                        wueVar2 = wueVar;
                        str14 = wueVar2.c;
                        xteVar4 = xteVar;
                        if (xteVar4 != xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                            str14 = null;
                        }
                        if (str14 == null) {
                            str14 = "";
                        }
                        str6110.getClass();
                        str6111.getClass();
                        if (str14.length() > 0) {
                            str15 = ". ";
                        } else {
                            str15 = "";
                        }
                        strK2 = b1j.k(str14, str15, str6110, str6111.length() <= 0 ? "" : ". ", str6111);
                    }
                    strK2.getClass();
                    if (!z5) {
                        strO = xbc.O(str49, str50, str55, z3, str7);
                    }
                    str41.getClass();
                    if (xteVar4 == xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                        str16 = str43;
                        str17 = str42;
                        strF0 = d0(str16, str17);
                    } else {
                        str16 = str43;
                        str17 = str42;
                        strF0 = f0(tv6Var, ctf0Var2);
                    }
                    String str6112 = strF0;
                    str6112.getClass();
                    iOrdinal = xteVar4.ordinal();
                    if (iOrdinal != 3) {
                        strQ = w6x.q(f0(tv6Var, ctf0Var2), ", ", d0(str16, str17));
                    } else if (iOrdinal != 4) {
                        strQ = d0(str16, str17);
                    } else {
                        strQ = f0(tv6Var, ctf0Var2);
                    }
                    strQ.getClass();
                    String strH2 = h0(iweVarC0, ctf0Var2);
                    if (iweVarC0 != iwe.f) {
                        i2 = R.attr.uikitStaticRed;
                    } else {
                        i2 = R.attr.uikitSecondary;
                    }
                    int iG2 = g0(iweVarC0, str41);
                    m97 m97Var5 = m97Var;
                    str18 = m97Var5.n;
                    str18.getClass();
                    d = m97Var5.l;
                    str19 = wueVar2.e;
                    if (str19.length() == 0) {
                        str20 = "0";
                        z20 = true;
                    } else {
                        str20 = "0";
                        z20 = false;
                    }
                    d2 = Double.parseDouble(sj3.j0(str19, str20));
                    if (d <= d2) {
                        if (d < d2) {
                            j0dVar = j0d.f15678a;
                        } else {
                            j0dVar = j0d.f15678a;
                        }
                    } else if (d < d2) {
                        j0dVar = j0d.f15678a;
                    } else {
                        j0dVar = j0d.f15678a;
                    }
                    if (z2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    str21 = strQ;
                    j6 = j3;
                    if (j6 != 0) {
                        bzu bzuVarD3 = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j6, ".svg", bzuVarD3);
                        string = ((StringBuilder) bzuVarD3.b).toString();
                    } else {
                        string = "";
                    }
                    if (xteVar4 == xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                        i3 = R.attr.uikitBackground;
                    } else {
                        i3 = R.attr.uikitSecondary;
                    }
                    hel0Var = new hel0(string, i3);
                    rse rseVarE2 = vbc.e0(ateVar.f1428a);
                    String str6113 = xteVar4.f41462a;
                    list = i3h0VarB1.b;
                    str22 = i3h0VarB1.f14096a;
                    i3h0Var2 = i3h0Var;
                    str23 = i3h0Var2.f14096a;
                    int i13 = i2;
                    if (z21 != 0) {
                        list2 = i3h0Var2.b;
                        if (str23.length() == 0) {
                            str24 = Separators.SP;
                            str25 = str18;
                            hel0Var2 = hel0Var;
                            str26 = str41;
                            str27 = "";
                            useVar = wse.f39686a;
                            xseVar = useVar;
                        } else {
                            hel0Var2 = hel0Var;
                            str25 = str18;
                            j7 = j10;
                            if (vtb.b0(j6, j7)) {
                                wcv0 wcv0Var5 = i3h0Var2.c.b.f23336a;
                                String str6114 = wcv0Var5.f38944a;
                                String str6115 = wcv0Var5.b;
                                wcv0 wcv0Var6 = i3h0VarB1.c.b.f23336a;
                                useVar = new tse(str6114, vtb.X(ctf0Var2, i3h0Var2, 1), pzb.Q(str6114, wcv0Var6.f38944a), str6115, vtb.X(ctf0Var2, i3h0Var2, 2), pzb.Q(str6115, wcv0Var6.b));
                                str24 = Separators.SP;
                                str26 = str41;
                                str27 = "";
                            } else if (j6 != 4) {
                                if (str22.length() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                jzm0 jzm0Var7 = i3h0VarB1.e;
                                String str6116 = jzm0Var7.f17422a;
                                String str6117 = jzm0Var7.b;
                                jzm0 jzm0Var8 = i3h0Var2.e;
                                i5 = i3h0Var2.f;
                                String str7112 = jzm0Var8.f17422a;
                                String str7113 = jzm0Var8.b;
                                if (i5 == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (i5 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                pip0 pip0VarR10 = yqm0.r(str6116, str7112, str6117, str7113, z12, z13, z11);
                                if (i5 == 2) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i5 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                g3h0 g3h0Var10 = new g3h0(ctf0Var2.f(R.string.tennis_game_column, new Object[0]), str7112, pip0VarR10, str7113, yqm0.r(str6117, str7113, str6116, str7112, z14, z15, z11));
                                hf90Var = (hf90) CollectionsKt.f0(list);
                                if (hf90Var != null) {
                                    str28 = "";
                                } else {
                                    str28 = "";
                                }
                                hf90Var2 = (hf90) CollectionsKt.f0(list);
                                if (hf90Var2 != null) {
                                    str29 = "";
                                } else {
                                    str29 = "";
                                }
                                hf90Var3 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var3 != null) {
                                    str30 = "";
                                } else {
                                    str30 = "";
                                }
                                hf90Var4 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var4 != null) {
                                    str31 = "";
                                } else {
                                    str31 = "";
                                }
                                if (i5 == 1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (i5 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                pip0 pip0VarR11 = yqm0.r(str28, str30, str29, str31, z16, z17, z11);
                                if (i5 == 2) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                String str7114 = str29;
                                String str7115 = str28;
                                String str7116 = str31;
                                String str7117 = str30;
                                if (i5 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                pip0 pip0VarR12 = yqm0.r(str7114, str7116, str7115, str7117, z18, z19, z11);
                                hf90Var5 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var5 != null) {
                                    str32 = "";
                                } else {
                                    str32 = "";
                                }
                                hf90Var6 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var6 != null) {
                                    str33 = "";
                                } else {
                                    str33 = "";
                                }
                                hf90Var7 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var7 != null) {
                                    str34 = "";
                                } else {
                                    str34 = "";
                                }
                                g3h0 g3h0Var11 = new g3h0(str32, str33, pip0VarR11, str34, pip0VarR12);
                                List listSplit$default12 = StringsKt__StringsKt.split$default(str22, new String[]{"-"}, false, 0, 6, null);
                                List listSplit$default13 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                                str35 = (String) CollectionsKt.W(0, listSplit$default12);
                                if (str35 == null) {
                                    str35 = str20;
                                }
                                str36 = (String) CollectionsKt.W(0, listSplit$default13);
                                if (str36 == null) {
                                    str36 = str20;
                                }
                                str37 = (String) CollectionsKt.W(1, listSplit$default12);
                                if (str37 == null) {
                                    str37 = str20;
                                }
                                str38 = (String) CollectionsKt.W(1, listSplit$default13);
                                if (str38 == null) {
                                    str38 = str20;
                                }
                                if (!z11) {
                                    pip0Var = pip0.DEFAULT;
                                }
                                pip0 pip0Var10 = pip0Var;
                                if (!z11) {
                                    pip0Var2 = pip0.DEFAULT;
                                }
                                g3h0 g3h0Var12 = new g3h0(ctf0Var2.f(R.string.total_tennis_column, new Object[0]), str36, pip0Var10, str38, pip0Var2);
                                if (i5 == 1) {
                                    vjp0Var = vjp0.b;
                                } else if (i5 != 2) {
                                    vjp0Var = vjp0.f37541a;
                                } else {
                                    vjp0Var = vjp0.c;
                                }
                                xseVar = new xse(g3h0Var10, g3h0Var11, g3h0Var12, vjp0Var);
                                str24 = Separators.SP;
                                str21 = str21;
                                str26 = str41;
                                str27 = "";
                            } else {
                                if (str22.length() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                jzm0 jzm0Var9 = i3h0VarB1.e;
                                String str6118 = jzm0Var9.f17422a;
                                String str6119 = jzm0Var9.b;
                                jzm0 jzm0Var10 = i3h0Var2.e;
                                i5 = i3h0Var2.f;
                                String str7118 = jzm0Var10.f17422a;
                                String str7119 = jzm0Var10.b;
                                if (i5 == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (i5 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                pip0 pip0VarR13 = yqm0.r(str6118, str7118, str6119, str7119, z12, z13, z11);
                                if (i5 == 2) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i5 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                g3h0 g3h0Var13 = new g3h0(ctf0Var2.f(R.string.tennis_game_column, new Object[0]), str7118, pip0VarR13, str7119, yqm0.r(str6119, str7119, str6118, str7118, z14, z15, z11));
                                hf90Var = (hf90) CollectionsKt.f0(list);
                                if (hf90Var != null) {
                                    str28 = "";
                                } else {
                                    str28 = "";
                                }
                                hf90Var2 = (hf90) CollectionsKt.f0(list);
                                if (hf90Var2 != null) {
                                    str29 = "";
                                } else {
                                    str29 = "";
                                }
                                hf90Var3 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var3 != null) {
                                    str30 = "";
                                } else {
                                    str30 = "";
                                }
                                hf90Var4 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var4 != null) {
                                    str31 = "";
                                } else {
                                    str31 = "";
                                }
                                if (i5 == 1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (i5 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                pip0 pip0VarR14 = yqm0.r(str28, str30, str29, str31, z16, z17, z11);
                                if (i5 == 2) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                String str71110 = str29;
                                String str71111 = str28;
                                String str71112 = str31;
                                String str71113 = str30;
                                if (i5 != 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                pip0 pip0VarR15 = yqm0.r(str71110, str71112, str71111, str71113, z18, z19, z11);
                                hf90Var5 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var5 != null) {
                                    str32 = "";
                                } else {
                                    str32 = "";
                                }
                                hf90Var6 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var6 != null) {
                                    str33 = "";
                                } else {
                                    str33 = "";
                                }
                                hf90Var7 = (hf90) CollectionsKt.f0(list2);
                                if (hf90Var7 != null) {
                                    str34 = "";
                                } else {
                                    str34 = "";
                                }
                                g3h0 g3h0Var14 = new g3h0(str32, str33, pip0VarR14, str34, pip0VarR15);
                                List listSplit$default14 = StringsKt__StringsKt.split$default(str22, new String[]{"-"}, false, 0, 6, null);
                                List listSplit$default15 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                                str35 = (String) CollectionsKt.W(0, listSplit$default14);
                                if (str35 == null) {
                                    str35 = str20;
                                }
                                str36 = (String) CollectionsKt.W(0, listSplit$default15);
                                if (str36 == null) {
                                    str36 = str20;
                                }
                                str37 = (String) CollectionsKt.W(1, listSplit$default14);
                                if (str37 == null) {
                                    str37 = str20;
                                }
                                str38 = (String) CollectionsKt.W(1, listSplit$default15);
                                if (str38 == null) {
                                    str38 = str20;
                                }
                                if (!z11) {
                                    pip0Var = pip0.DEFAULT;
                                }
                                pip0 pip0Var11 = pip0Var;
                                if (!z11) {
                                    pip0Var2 = pip0.DEFAULT;
                                }
                                g3h0 g3h0Var15 = new g3h0(ctf0Var2.f(R.string.total_tennis_column, new Object[0]), str36, pip0Var11, str38, pip0Var2);
                                if (i5 == 1) {
                                    vjp0Var = vjp0.b;
                                } else if (i5 != 2) {
                                    vjp0Var = vjp0.f37541a;
                                } else {
                                    vjp0Var = vjp0.c;
                                }
                                xseVar = new xse(g3h0Var13, g3h0Var14, g3h0Var15, vjp0Var);
                                str24 = Separators.SP;
                                str21 = str21;
                                str26 = str41;
                                str27 = "";
                            }
                            xseVar = useVar;
                        }
                    } else {
                        str24 = Separators.SP;
                        str25 = str18;
                        hel0Var2 = hel0Var;
                        str26 = str41;
                        str27 = "";
                        useVar = wse.f39686a;
                        xseVar = useVar;
                    }
                    if (fhoVar != fho.b) {
                        ctf0Var3 = ctf0Var;
                        strL2 = str27;
                        i4 = 0;
                    } else if (xteVar4 != xte.COEF_WITH_BIG_ACCENT_TEAM) {
                        ctf0Var3 = ctf0Var;
                        i4 = 0;
                        strL2 = kng0.l(ctf0Var3.b.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), str24, ctf0Var3.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                    } else {
                        ctf0Var3 = ctf0Var;
                        i4 = 0;
                        strL2 = kng0.l(ctf0Var3.b.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), str24, ctf0Var3.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                    }
                    if (fhoVar != fho.c) {
                        strA2 = str27;
                    } else {
                        strA2 = ctf0Var3.b.a(R.string.option_bet_label, Arrays.copyOf(new Object[i4], i4));
                    }
                    if (fhoVar != fho.d) {
                        strA3 = str27;
                    } else {
                        strA3 = ctf0Var3.b.a(R.string.each_way, Arrays.copyOf(new Object[i4], i4));
                    }
                    return new vte(j11, j4, j5, j12, j13, j14, j12, z21, strK, strK2, strO, str26, str6112, str21, strH2, i13, iG2, str25, j0dVar, z10, hel0Var2, str6113, xseVar, cueVar, strL2, strA2, strA3, ctf0Var3.b.a(R.string.seka_state_live, Arrays.copyOf(new Object[i4], i4)), z3, qu6Var.x, rseVarE2);
                }
                m97Var = m97Var2;
                na30Var2 = na30Var3;
                j4 = j;
                j3 = j8;
                strO = strQ2;
                j5 = j2;
                qu6Var = qu6Var2;
                tv6Var = tv6Var2;
                slzVar3 = slzVar2;
                str7 = str54;
                strK = Y(str4, str5, tv6Var, ctf0Var, xteVar2, z21);
                ctf0Var2 = ctf0Var;
                d2 = Double.parseDouble(sj3.j0(str19, str20));
                if (d <= d2) {
                    if (d < d2) {
                        j0dVar = j0d.f15678a;
                    } else {
                        j0dVar = j0d.f15678a;
                    }
                } else if (d < d2) {
                    j0dVar = j0d.f15678a;
                } else {
                    j0dVar = j0d.f15678a;
                }
            } catch (Exception unused) {
                j0dVar = j0d.f15678a;
            }
            if (str19.length() == 0) {
                str20 = "0";
                z20 = true;
            } else {
                str20 = "0";
                z20 = false;
            }
        } catch (Exception unused2) {
            strK2 = strK2;
            str20 = "0";
        }
        if (p5tVar != null) {
            str2 = p5tVar.l;
        } else {
            str2 = null;
        }
        if (z22 == 0) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        slzVar2 = slzVar;
        if (p5tVar != null) {
            str3 = p5tVar.e;
        } else {
            str3 = null;
        }
        if (z22 == 0) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (r4 == 176) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (p5tVar != null) {
            z6 = p5tVar.r;
        } else {
            z6 = false;
        }
        if (z5) {
            String str510 = qu6Var2.h;
            str4 = str3;
            String str511 = qu6Var2.i;
            str5 = str2;
            String str512 = qu6Var2.k;
            str6 = str53;
            String str621 = qu6Var2.l;
            int i14 = qu6Var2.A;
            i3h0Var = i3h0VarB0;
            ohs0.z(str46, str510, str511, str45, str512);
            str621.getClass();
            strK3 = mym0.k(str46, str55, z3);
            String strK5 = mym0.k(str45, str54, z3);
            if (strK3.length() > 0) {
                xteVar2 = xteVar;
                aueVar = new aue(strK3);
            } else {
                xteVar2 = xteVar;
                aueVar = new aue(strK3);
            }
        } else {
            str4 = str3;
            str5 = str2;
            str6 = str53;
            i3h0Var = i3h0VarB0;
            xteVar2 = xteVar;
            aueVar = new aue(strQ2);
        }
        cue cueVar2 = aueVar;
        long j18 = qu6Var2.f29333a;
        j = qu6Var2.x;
        j2 = qu6Var2.c;
        long j19 = qu6Var2.b;
        long j110 = qu6Var2.e;
        long j111 = m97Var2.t;
        na30Var2 = na30Var2;
        slzVar4 = slzVar3;
        str49 = str49;
        if (z4) {
            wueVar2 = wueVar;
            xteVar4 = xteVar;
            strK2 = str44;
        } else {
            String str61110 = slzVar4.c;
            String str61111 = na30Var2.f23172a;
            wueVar2 = wueVar;
            str14 = wueVar2.c;
            xteVar4 = xteVar;
            if (xteVar4 != xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
                str14 = null;
            }
            if (str14 == null) {
                str14 = "";
            }
            str61110.getClass();
            str61111.getClass();
            if (str14.length() > 0) {
                str15 = ". ";
            } else {
                str15 = "";
            }
            strK2 = b1j.k(str14, str15, str61110, str61111.length() <= 0 ? "" : ". ", str61111);
        }
        strK2.getClass();
        if (!z5) {
            strO = xbc.O(str49, str50, str55, z3, str7);
        }
        str41.getClass();
        if (xteVar4 == xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
            str16 = str43;
            str17 = str42;
            strF0 = d0(str16, str17);
        } else {
            str16 = str43;
            str17 = str42;
            strF0 = f0(tv6Var, ctf0Var2);
        }
        String str61112 = strF0;
        str61112.getClass();
        iOrdinal = xteVar4.ordinal();
        if (iOrdinal != 3) {
            strQ = w6x.q(f0(tv6Var, ctf0Var2), ", ", d0(str16, str17));
        } else if (iOrdinal != 4) {
            strQ = d0(str16, str17);
        } else {
            strQ = f0(tv6Var, ctf0Var2);
        }
        strQ.getClass();
        String strH3 = h0(iweVarC0, ctf0Var2);
        if (iweVarC0 != iwe.f) {
            i2 = R.attr.uikitStaticRed;
        } else {
            i2 = R.attr.uikitSecondary;
        }
        int iG3 = g0(iweVarC0, str41);
        m97 m97Var6 = m97Var;
        str18 = m97Var6.n;
        str18.getClass();
        d = m97Var6.l;
        str19 = wueVar2.e;
        if (z2) {
            z10 = false;
        } else {
            z10 = false;
        }
        str21 = strQ;
        j6 = j3;
        if (j6 != 0) {
            bzu bzuVarD4 = rz4.d("static", "svg", "sports_v2");
            rz4.s(j6, ".svg", bzuVarD4);
            string = ((StringBuilder) bzuVarD4.b).toString();
        } else {
            string = "";
        }
        if (xteVar4 == xte.SMALL_TEAM_LOGO_ACCENT_COEF) {
            i3 = R.attr.uikitBackground;
        } else {
            i3 = R.attr.uikitSecondary;
        }
        hel0Var = new hel0(string, i3);
        rse rseVarE3 = vbc.e0(ateVar.f1428a);
        String str61113 = xteVar4.f41462a;
        list = i3h0VarB1.b;
        str22 = i3h0VarB1.f14096a;
        i3h0Var2 = i3h0Var;
        str23 = i3h0Var2.f14096a;
        int i15 = i2;
        if (z21 != 0) {
            list2 = i3h0Var2.b;
            if (str23.length() == 0) {
                str24 = Separators.SP;
                str25 = str18;
                hel0Var2 = hel0Var;
                str26 = str41;
                str27 = "";
                useVar = wse.f39686a;
                xseVar = useVar;
            } else {
                hel0Var2 = hel0Var;
                str25 = str18;
                j7 = j10;
                if (vtb.b0(j6, j7)) {
                    wcv0 wcv0Var7 = i3h0Var2.c.b.f23336a;
                    String str61114 = wcv0Var7.f38944a;
                    String str61115 = wcv0Var7.b;
                    wcv0 wcv0Var8 = i3h0VarB1.c.b.f23336a;
                    useVar = new tse(str61114, vtb.X(ctf0Var2, i3h0Var2, 1), pzb.Q(str61114, wcv0Var8.f38944a), str61115, vtb.X(ctf0Var2, i3h0Var2, 2), pzb.Q(str61115, wcv0Var8.b));
                    str24 = Separators.SP;
                    str26 = str41;
                    str27 = "";
                } else if (j6 != 4) {
                    if (str22.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jzm0 jzm0Var11 = i3h0VarB1.e;
                    String str61116 = jzm0Var11.f17422a;
                    String str61117 = jzm0Var11.b;
                    jzm0 jzm0Var12 = i3h0Var2.e;
                    i5 = i3h0Var2.f;
                    String str71114 = jzm0Var12.f17422a;
                    String str71115 = jzm0Var12.b;
                    if (i5 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i5 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    pip0 pip0VarR16 = yqm0.r(str61116, str71114, str61117, str71115, z12, z13, z11);
                    if (i5 == 2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i5 != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    g3h0 g3h0Var16 = new g3h0(ctf0Var2.f(R.string.tennis_game_column, new Object[0]), str71114, pip0VarR16, str71115, yqm0.r(str61117, str71115, str61116, str71114, z14, z15, z11));
                    hf90Var = (hf90) CollectionsKt.f0(list);
                    if (hf90Var != null) {
                        str28 = "";
                    } else {
                        str28 = "";
                    }
                    hf90Var2 = (hf90) CollectionsKt.f0(list);
                    if (hf90Var2 != null) {
                        str29 = "";
                    } else {
                        str29 = "";
                    }
                    hf90Var3 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var3 != null) {
                        str30 = "";
                    } else {
                        str30 = "";
                    }
                    hf90Var4 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var4 != null) {
                        str31 = "";
                    } else {
                        str31 = "";
                    }
                    if (i5 == 1) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i5 != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    pip0 pip0VarR17 = yqm0.r(str28, str30, str29, str31, z16, z17, z11);
                    if (i5 == 2) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    String str71116 = str29;
                    String str71117 = str28;
                    String str71118 = str31;
                    String str71119 = str30;
                    if (i5 != 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    pip0 pip0VarR18 = yqm0.r(str71116, str71118, str71117, str71119, z18, z19, z11);
                    hf90Var5 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var5 != null) {
                        str32 = "";
                    } else {
                        str32 = "";
                    }
                    hf90Var6 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var6 != null) {
                        str33 = "";
                    } else {
                        str33 = "";
                    }
                    hf90Var7 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var7 != null) {
                        str34 = "";
                    } else {
                        str34 = "";
                    }
                    g3h0 g3h0Var17 = new g3h0(str32, str33, pip0VarR17, str34, pip0VarR18);
                    List listSplit$default16 = StringsKt__StringsKt.split$default(str22, new String[]{"-"}, false, 0, 6, null);
                    List listSplit$default17 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                    str35 = (String) CollectionsKt.W(0, listSplit$default16);
                    if (str35 == null) {
                        str35 = str20;
                    }
                    str36 = (String) CollectionsKt.W(0, listSplit$default17);
                    if (str36 == null) {
                        str36 = str20;
                    }
                    str37 = (String) CollectionsKt.W(1, listSplit$default16);
                    if (str37 == null) {
                        str37 = str20;
                    }
                    str38 = (String) CollectionsKt.W(1, listSplit$default17);
                    if (str38 == null) {
                        str38 = str20;
                    }
                    if (!z11) {
                        pip0Var = pip0.DEFAULT;
                    }
                    pip0 pip0Var12 = pip0Var;
                    if (!z11) {
                        pip0Var2 = pip0.DEFAULT;
                    }
                    g3h0 g3h0Var18 = new g3h0(ctf0Var2.f(R.string.total_tennis_column, new Object[0]), str36, pip0Var12, str38, pip0Var2);
                    if (i5 == 1) {
                        vjp0Var = vjp0.b;
                    } else if (i5 != 2) {
                        vjp0Var = vjp0.f37541a;
                    } else {
                        vjp0Var = vjp0.c;
                    }
                    xseVar = new xse(g3h0Var16, g3h0Var17, g3h0Var18, vjp0Var);
                    str24 = Separators.SP;
                    str21 = str21;
                    str26 = str41;
                    str27 = "";
                } else {
                    if (str22.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jzm0 jzm0Var13 = i3h0VarB1.e;
                    String str61118 = jzm0Var13.f17422a;
                    String str61119 = jzm0Var13.b;
                    jzm0 jzm0Var14 = i3h0Var2.e;
                    i5 = i3h0Var2.f;
                    String str711110 = jzm0Var14.f17422a;
                    String str711111 = jzm0Var14.b;
                    if (i5 == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i5 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    pip0 pip0VarR19 = yqm0.r(str61118, str711110, str61119, str711111, z12, z13, z11);
                    if (i5 == 2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i5 != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    g3h0 g3h0Var19 = new g3h0(ctf0Var2.f(R.string.tennis_game_column, new Object[0]), str711110, pip0VarR19, str711111, yqm0.r(str61119, str711111, str61118, str711110, z14, z15, z11));
                    hf90Var = (hf90) CollectionsKt.f0(list);
                    if (hf90Var != null) {
                        str28 = "";
                    } else {
                        str28 = "";
                    }
                    hf90Var2 = (hf90) CollectionsKt.f0(list);
                    if (hf90Var2 != null) {
                        str29 = "";
                    } else {
                        str29 = "";
                    }
                    hf90Var3 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var3 != null) {
                        str30 = "";
                    } else {
                        str30 = "";
                    }
                    hf90Var4 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var4 != null) {
                        str31 = "";
                    } else {
                        str31 = "";
                    }
                    if (i5 == 1) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i5 != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    pip0 pip0VarR110 = yqm0.r(str28, str30, str29, str31, z16, z17, z11);
                    if (i5 == 2) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    String str711112 = str29;
                    String str711113 = str28;
                    String str711114 = str31;
                    String str711115 = str30;
                    if (i5 != 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    pip0 pip0VarR111 = yqm0.r(str711112, str711114, str711113, str711115, z18, z19, z11);
                    hf90Var5 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var5 != null) {
                        str32 = "";
                    } else {
                        str32 = "";
                    }
                    hf90Var6 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var6 != null) {
                        str33 = "";
                    } else {
                        str33 = "";
                    }
                    hf90Var7 = (hf90) CollectionsKt.f0(list2);
                    if (hf90Var7 != null) {
                        str34 = "";
                    } else {
                        str34 = "";
                    }
                    g3h0 g3h0Var110 = new g3h0(str32, str33, pip0VarR110, str34, pip0VarR111);
                    List listSplit$default18 = StringsKt__StringsKt.split$default(str22, new String[]{"-"}, false, 0, 6, null);
                    List listSplit$default19 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                    str35 = (String) CollectionsKt.W(0, listSplit$default18);
                    if (str35 == null) {
                        str35 = str20;
                    }
                    str36 = (String) CollectionsKt.W(0, listSplit$default19);
                    if (str36 == null) {
                        str36 = str20;
                    }
                    str37 = (String) CollectionsKt.W(1, listSplit$default18);
                    if (str37 == null) {
                        str37 = str20;
                    }
                    str38 = (String) CollectionsKt.W(1, listSplit$default19);
                    if (str38 == null) {
                        str38 = str20;
                    }
                    if (!z11) {
                        pip0Var = pip0.DEFAULT;
                    }
                    pip0 pip0Var13 = pip0Var;
                    if (!z11) {
                        pip0Var2 = pip0.DEFAULT;
                    }
                    g3h0 g3h0Var111 = new g3h0(ctf0Var2.f(R.string.total_tennis_column, new Object[0]), str36, pip0Var13, str38, pip0Var2);
                    if (i5 == 1) {
                        vjp0Var = vjp0.b;
                    } else if (i5 != 2) {
                        vjp0Var = vjp0.f37541a;
                    } else {
                        vjp0Var = vjp0.c;
                    }
                    xseVar = new xse(g3h0Var19, g3h0Var110, g3h0Var111, vjp0Var);
                    str24 = Separators.SP;
                    str21 = str21;
                    str26 = str41;
                    str27 = "";
                }
                xseVar = useVar;
            }
        } else {
            str24 = Separators.SP;
            str25 = str18;
            hel0Var2 = hel0Var;
            str26 = str41;
            str27 = "";
            useVar = wse.f39686a;
            xseVar = useVar;
        }
        if (fhoVar != fho.b) {
            ctf0Var3 = ctf0Var;
            strL2 = str27;
            i4 = 0;
        } else if (xteVar4 != xte.COEF_WITH_BIG_ACCENT_TEAM) {
            ctf0Var3 = ctf0Var;
            i4 = 0;
            strL2 = kng0.l(ctf0Var3.b.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), str24, ctf0Var3.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
        } else {
            ctf0Var3 = ctf0Var;
            i4 = 0;
            strL2 = kng0.l(ctf0Var3.b.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), str24, ctf0Var3.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
        }
        if (fhoVar != fho.c) {
            strA2 = str27;
        } else {
            strA2 = ctf0Var3.b.a(R.string.option_bet_label, Arrays.copyOf(new Object[i4], i4));
        }
        if (fhoVar != fho.d) {
            strA3 = str27;
        } else {
            strA3 = ctf0Var3.b.a(R.string.each_way, Arrays.copyOf(new Object[i4], i4));
        }
        return new vte(j18, j4, j5, j19, j110, j111, j19, z21, strK, strK2, strO, str26, str61112, str21, strH3, i15, iG3, str25, j0dVar, z10, hel0Var2, str61113, xseVar, cueVar2, strL2, strA2, strA3, ctf0Var3.b.a(R.string.seka_state_live, Arrays.copyOf(new Object[i4], i4)), z3, qu6Var.x, rseVarE3);
    }

    public static final void o(mm40 mm40Var, sqh sqhVar, fet fetVar, int i) {
        int i2;
        sqhVar.getClass();
        fetVar.g0(-1236520651);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(sqhVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String str = sqhVar.c;
            String str2 = sqhVar.d;
            if (str.length() <= 0 && str2.length() <= 0) {
                fetVar.e0(748809581);
                fetVar.r(false);
            } else {
                fetVar.e0(748029249);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
                if (str.length() > 0) {
                    fetVar.e0(306399888);
                    J(str, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(306565180);
                    fetVar.r(false);
                }
                if (str2.length() > 0) {
                    fetVar.e0(306633256);
                    J(str2, ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU(), fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(306806236);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, sqhVar, i, (byte) 21);
        }
    }

    public static final mlr o0(jic0 jic0Var) {
        return new mlr(jic0Var.d, jic0Var.g, jic0Var.f, 0L, "", jic0Var.e, jic0Var.c, (String) null, false, false, false, jic0Var.h, jic0Var.j, jic0Var.i, false, (List) iun.f15405a, false, 131200);
    }

    public static final void p(mm40 mm40Var, vqh vqhVar, boolean z, fet fetVar, int i) {
        vqhVar.getClass();
        fetVar.g0(1252182902);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(vqhVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 132.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            j(vqhVar.a(), fetVar, 0);
            int i3 = i2 >> 3;
            R(vqhVar.b(), z, vqhVar.d(), fetVar, i3 & 112);
            I(vqhVar, fetVar, i3 & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 8, i, mm40Var, (Object) vqhVar, z);
        }
    }

    public static final void q(mm40 mm40Var, y9n y9nVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1867066996);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(y9nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Float fValueOf = Float.valueOf(0.0f);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarP = i120.P(o7k0.d(mm40Var, 1.0f), yk5.k((Pair[]) Arrays.copyOf(new Pair[]{new Pair(fValueOf, new y3d(((StaticColors) fetVar2.k(zfnVar)).m78getBlack800d7_KjU())), new Pair(Float.valueOf(0.5f), new y3d(((StaticColors) fetVar2.k(zfnVar)).m78getBlack800d7_KjU())), new Pair(Float.valueOf(1.0f), new y3d(((StaticColors) fetVar2.k(zfnVar)).m121getTransparent0d7_KjU()))}, 3), 0L, 0L, 14), null, 6);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            h83 h83Var = new h83();
            int iG = h83Var.g(new smk0(((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), g1t0.e().f42262a.b, null, null, null, g1t0.e().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500));
            try {
                h83Var.c(y9nVar.f42257a + Separators.SP);
                h83Var.d(iG);
                int iG2 = h83Var.g(new smk0(((StaticColors) fetVar2.k(zfnVar)).m93getGamesCoefficient0d7_KjU(), g1t0.l().f42262a.b, null, null, null, g1t0.l().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500));
                try {
                    h83Var.c(y9nVar.b);
                    h83Var.d(iG2);
                    j83 j83VarH = h83Var.h();
                    zcl zclVar = qmk.f28987a;
                    v8q0.b(j83VarH, s5x0.M(jm40.b, 8.0f, 4.0f, 8.0f, 6.0f), 0L, null, 0L, null, 0L, null, 0L, 2, false, 3, 0, null, null, null, fetVar, 0, 24960, 503804);
                    fetVar2 = fetVar;
                    fetVar2.r(true);
                } catch (Throwable th) {
                    h83Var.d(iG2);
                    throw th;
                }
            } catch (Throwable th2) {
                h83Var.d(iG);
                throw th2;
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, y9nVar, i, (byte) 27);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(756684511);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarV = cjx.V(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), a8k0.G(xczVarA, fetVar), null);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ys4(l7m0Var, function1, (byte) 7);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 8);
        }
    }

    public static final void s(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(836746041);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (((oxk) l7m0Var.getValue()).b) {
            fetVar.e0(-488679004);
            K(0, fetVar);
            fetVar.r(false);
        } else if (((oxk) l7m0Var.getValue()).c.isEmpty()) {
            fetVar.e0(-488597722);
            B(0, fetVar);
            fetVar.r(false);
        } else {
            fetVar.e0(-488555469);
            r(l7m0Var, function1, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 7);
        }
    }

    public static final void t(String str, fet fetVar, int i) {
        str.getClass();
        fetVar.g0(-1052135692);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 28.0f, 0L, fetVar, 0, 5);
            wwb.i(null, str, 0L, 0, 0L, fetVar, (i2 << 3) & 112, 29);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk(b, i, str);
        }
    }

    public static final void u(mm40 mm40Var, String str, oe oeVar, le leVar, Function0 function0, fet fetVar, int i) {
        int i2;
        String str2;
        pcy pcyVar;
        oe oeVar2 = oeVar;
        fet fetVar2 = fetVar;
        str.getClass();
        oeVar2.getClass();
        fetVar2.g0(1800082451);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= fetVar2.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(oeVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(leVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function0) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = leVar != null ? new wul(leVar.b, oe9.b, leVar.f19878a, true, leVar.c, false) : null;
                fetVar2.o0(objP);
            }
            wul wulVar = (wul) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 56.0f), 1.0f), "DS_ACCOUNT_INFO_LARGE_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE1 = o2e.e0(jm40Var, "DS_ACCOUNT_INFO_LABEL");
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            int i3 = i2;
            v8q0.a(str2, mm40VarE1, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, ((i2 >> 3) & 14) | 48, 24960, 110584);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.c(jm40Var, 1.0f), true);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarH);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            int i4 = i3 >> 6;
            oeVar2 = oeVar;
            S(oeVar2, fetVar2, i4 & 14);
            fetVar2.r(true);
            if (wulVar != null) {
                fetVar2.e0(-178772476);
                qzb.n(o7k0.u(jm40Var, 0.0f, 160.0f, 1), wulVar, function0, fetVar2, i4 & 896, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-178552407);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) str, (Object) oeVar2, (Object) leVar, function0, i, (byte) 15);
        }
    }

    public static final void v(mm40 mm40Var, gx1 gx1Var, asl aslVar, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        int i4;
        Function0 function1;
        Function0 function2;
        fetVar.g0(-800280136);
        if ((i & 6) == 0) {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (fetVar.e(gx1Var.ordinal()) ? 32 : 16) | (fetVar.g(aslVar) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
        } else {
            i4 = i5 | (fetVar.i(function0) ? 2048 : 1024);
        }
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            if (i6 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new knl((byte) 11);
                    fetVar.o0(objP);
                }
                function2 = (Function0) objP;
            } else {
                function2 = function0;
            }
            int iOrdinal = gx1Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-270055922);
                int i7 = i4 & 14;
                int i8 = i4 >> 3;
                j120.e(mm40Var, aslVar, function2, fetVar, (i8 & 896) | i7 | (i8 & 112));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-270049490);
                int i9 = i4 & 14;
                int i10 = i4 >> 3;
                fx1.a(mm40Var, aslVar, function2, fetVar, (i10 & 896) | i9 | (i10 & 112));
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(-270042628);
                int i11 = i4 & 14;
                int i12 = i4 >> 3;
                kx1.a(mm40Var, aslVar, function2, fetVar, (i12 & 896) | i11 | (i12 & 112));
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(-270057270, fetVar, false);
                }
                fetVar.e0(-270035266);
                int i13 = i4 & 14;
                int i14 = i4 >> 3;
                ix1.a(mm40Var, aslVar, function2, fetVar, (i14 & 896) | i13 | (i14 & 112));
                fetVar.r(false);
            }
            function1 = function2;
        } else {
            fetVar.X();
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lph(mm40Var, gx1Var, aslVar, function1, i, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x016b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0176  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void w(mm40 mm40Var, t2m t2mVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        Object obj;
        boolean z;
        mm40 mm40Var3;
        Object obj2;
        yfe0 yfe0VarU;
        Object obj3;
        mm40 mm40VarO;
        boolean z2;
        boolean z3;
        Object objP;
        fet fetVar2 = fetVar;
        t2mVar.getClass();
        fetVar2.g0(-310112298);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(t2mVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                obj = function1;
                i3 |= fetVar2.i(obj) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                if (i4 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i5 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
                if (obj3 != null) {
                    fetVar2.e0(-80637398);
                    if ((i3 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i3 & 112) == 32);
                    objP = fetVar2.P();
                    if (z3 || objP == ukd.f35823a) {
                        objP = new lrk(obj3, t2mVar, b);
                        fetVar2.o0(objP);
                    }
                    mm40VarO = feb.O(mm40Var3, (Function0) objP);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-80536524);
                    fetVar2.r(false);
                    mm40VarO = mm40Var3;
                }
                if (t2mVar instanceof r2m) {
                    fetVar2.e0(-1665162635);
                    r2m r2mVar = (r2m) t2mVar;
                    g(mm40VarO, r2mVar.b, r2mVar.c, r2mVar.d, fetVar2, 0);
                    fetVar2.r(false);
                } else if (t2mVar instanceof s2m) {
                    fetVar2.e0(-1665153741);
                    s2m s2mVar = (s2m) t2mVar;
                    i(mm40VarO, s2mVar.b, s2mVar.c, fetVar2, 0);
                    fetVar2.r(false);
                } else if (t2mVar instanceof o2m) {
                    fetVar2.e0(-1665138200);
                    o2m o2mVar = (o2m) t2mVar;
                    b(mm40VarO, o2mVar.b, o2mVar.c, o2mVar.d, o2mVar.e, o2mVar.f, o2mVar.g, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (t2mVar instanceof p2m) {
                    fetVar2.e0(-1665124611);
                    p2m p2mVar = (p2m) t2mVar;
                    c(mm40VarO, p2mVar.b, p2mVar.c, p2mVar.d, p2mVar.e, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    if (t2mVar instanceof q2m) {
                        throw b1j.f(-1665162537, fetVar2, false);
                    }
                    fetVar2.e0(-1665093506);
                    q2m q2mVar = (q2m) t2mVar;
                    e(mm40VarO, q2mVar.f28006a, q2mVar.b, q2mVar.c, fetVar2, 0);
                    fetVar2.r(false);
                }
                obj2 = obj3;
            } else {
                fetVar2.X();
                mm40Var3 = mm40Var2;
                obj2 = obj;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new z23(mm40Var3, (Object) t2mVar, obj2, i, i2, (byte) 7);
            }
        }
        i3 |= 384;
        obj = function1;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i3 & 1, z)) {
            if (i4 != 0) {
                mm40Var3 = jm40.b;
            } else {
                mm40Var3 = mm40Var2;
            }
            if (i5 != 0) {
                obj3 = null;
            } else {
                obj3 = obj;
            }
            if (obj3 != null) {
                fetVar2.e0(-80637398);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i3 & 112) == 32);
                objP = fetVar2.P();
                if (z3) {
                    objP = new lrk(obj3, t2mVar, b);
                    fetVar2.o0(objP);
                } else {
                    objP = new lrk(obj3, t2mVar, b);
                    fetVar2.o0(objP);
                }
                mm40VarO = feb.O(mm40Var3, (Function0) objP);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-80536524);
                fetVar2.r(false);
                mm40VarO = mm40Var3;
            }
            if (t2mVar instanceof r2m) {
                fetVar2.e0(-1665162635);
                r2m r2mVar2 = (r2m) t2mVar;
                g(mm40VarO, r2mVar2.b, r2mVar2.c, r2mVar2.d, fetVar2, 0);
                fetVar2.r(false);
            } else if (t2mVar instanceof s2m) {
                fetVar2.e0(-1665153741);
                s2m s2mVar2 = (s2m) t2mVar;
                i(mm40VarO, s2mVar2.b, s2mVar2.c, fetVar2, 0);
                fetVar2.r(false);
            } else if (t2mVar instanceof o2m) {
                fetVar2.e0(-1665138200);
                o2m o2mVar2 = (o2m) t2mVar;
                b(mm40VarO, o2mVar2.b, o2mVar2.c, o2mVar2.d, o2mVar2.e, o2mVar2.f, o2mVar2.g, fetVar, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else if (t2mVar instanceof p2m) {
                fetVar2.e0(-1665124611);
                p2m p2mVar2 = (p2m) t2mVar;
                c(mm40VarO, p2mVar2.b, p2mVar2.c, p2mVar2.d, p2mVar2.e, fetVar, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (t2mVar instanceof q2m) {
                    throw b1j.f(-1665162537, fetVar2, false);
                }
                fetVar2.e0(-1665093506);
                q2m q2mVar2 = (q2m) t2mVar;
                e(mm40VarO, q2mVar2.f28006a, q2mVar2.b, q2mVar2.c, fetVar2, 0);
                fetVar2.r(false);
            }
            obj2 = obj3;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
            obj2 = obj;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(mm40Var3, (Object) t2mVar, obj2, i, i2, (byte) 7);
        }
    }

    public static final void x(mm40 mm40Var, oem oemVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z2;
        fetVar.g0(-399554148);
        int i2 = i | 6 | (fetVar.g(oemVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarS = i120.S(o7k0.n(jm40Var2, 24.0f), 1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator(), vgg0.a(6.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (oemVar != null) {
                fetVar.e0(1184081153);
                pm80 pm80VarF = a8k0.F(oemVar.f25129a, 0, fetVar);
                mm40 mm40VarN = o7k0.n(jm40Var2, 20.0f);
                boolean z3 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objP = fetVar.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new x9((Object) oemVar, z, (byte) 19);
                    fetVar.o0(objP);
                }
                z2 = true;
                jm40Var = jm40Var2;
                j0x.b(pm80VarF, null, i4w0.T(mm40VarN, (Function1) objP), null, null, 0.0f, null, fetVar, 56, 120);
                fetVar.r(false);
            } else {
                jm40Var = jm40Var2;
                z2 = true;
                fetVar.e0(1184541472);
                fetVar.r(false);
            }
            fetVar.r(z2);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 19, i, mm40Var2, (Object) oemVar, z);
        }
    }

    public static final void y(mm40 mm40Var, s1n s1nVar, fet fetVar, int i) {
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1158859644);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(s1nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar = (k6z) fetVar2.k(zfnVar);
            k6z k6zVar2 = s1nVar.g ? k6zVar : k6z.f17794a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            mm40 mm40VarN2 = s5x0.N(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), 0.0f, 0.0f, 4.0f, 0.0f, 11);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 4.0f, 5);
            String str = s1nVar.d.f17257a;
            if (str == null) {
                str = "";
            }
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN3, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            N(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), s1nVar.f31465a, fetVar2, 0, 0);
            N(null, s1nVar.b, fetVar2, 0, 1);
            fetVar2.r(true);
            O(null, s1nVar.c, fetVar2, 0);
            fetVar2.r(true);
            obc.d(zfnVar.a(k6zVar2), u1c.M(-1260235086, new p5m(s1nVar, k6zVar, (byte) 20), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, s1nVar, i, (byte) 21);
        }
    }

    public static final void z(mm40 mm40Var, aym aymVar, fet fetVar, int i) {
        fet fetVar2;
        String str = aymVar.e;
        String str2 = aymVar.d;
        fetVar.g0(-981408072);
        byte b = 16;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(aymVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            M(0, fetVar, null, aymVar.b, aymVar.f1675a);
            if (str2.length() <= 0 && str.length() <= 0 && aymVar.c.length() <= 0) {
                fetVar2 = fetVar;
                fetVar2.e0(1880451060);
                fetVar2.r(false);
            } else {
                fetVar.e0(1880223303);
                fetVar2 = fetVar;
                sj3.p(6, 0, fetVar2, jm40.b, aymVar.c, str2, str);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, aymVar, i, b);
        }
    }
}
