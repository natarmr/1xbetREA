package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.javax.sip.message.Response;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class dub {
    public static final void A(mm40 mm40Var, ivm ivmVar, ivm ivmVar2, mpm mpmVar, String str, String str2, a4x a4xVar, String str3, zum zumVar, boolean z, fet fetVar, int i) {
        int i2;
        String str4;
        String str5;
        fet fetVar2;
        k6z k6zVar;
        a4xVar.getClass();
        str3.getClass();
        fetVar.g0(50776090);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ivmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(ivmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(mpmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g("") ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            str4 = str;
            i2 |= fetVar.g(str4) ? 131072 : 65536;
        } else {
            str4 = str;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.g(a4xVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            str5 = str3;
            i2 |= fetVar.g(str5) ? 67108864 : 33554432;
        } else {
            str5 = str3;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar.g(zumVar) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, ((306783379 & i2) == 306783378 && ((fetVar.h(z) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            if (z) {
                fetVar.e0(1551199041);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1551199965);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            k6z k6zVar2 = k6zVar;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 0.0f, 12.0f, 12.0f, 2);
            int i3 = i2;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            if (str4.length() <= 0 && str5.length() <= 0 && !(zumVar instanceof yum)) {
                fetVar2 = fetVar;
                fetVar2.e0(-623479214);
                fetVar2.r(false);
            } else {
                fetVar.e0(-623681024);
                int i4 = i3 >> 15;
                G(null, str4, str5, zumVar, fetVar, ((i3 >> 9) & 1008) | (i4 & 7168) | (i4 & 57344));
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            obc.d(bmd.n.a(k6zVar2), u1c.M(-1872857904, new zw8((Object) ivmVar, (Object) ivmVar2, (Object) mpmVar, z, a4xVar, str2, (byte) 5), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bcc(mm40Var, (Object) ivmVar, (Object) ivmVar2, (Object) mpmVar, str, str2, a4xVar, str3, zumVar, z, i, (byte) 5);
        }
    }

    public static final void B(mm40 mm40Var, y0n y0nVar, y0n y0nVar2, mpm mpmVar, String str, r0n r0nVar, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        mpmVar.getClass();
        str.getClass();
        fetVar.g0(-1370040471);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(y0nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y0nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(mpmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(r0nVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(z) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar2 = (k6z) fetVar.k(zfnVar);
            if (z) {
                fetVar.e0(1946083248);
                k6zVar = (k6z) fetVar.k(zfnVar);
                fetVar.r(false);
            } else {
                fetVar.e0(1946084172);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(zfnVar.a(k6zVar), u1c.M(2087742121, new ntm(mm40Var, (Object) y0nVar, mpmVar, z, (Object) y0nVar2, (Object) r0nVar, str, k6zVar2, (byte) 2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, (Object) y0nVar, (Object) y0nVar2, (Object) mpmVar, str, (Object) r0nVar, z, i, (byte) 9);
        }
    }

    public static final void C(mm40 mm40Var, wce wceVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        function1.getClass();
        fetVar.g0(419325065);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(wceVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            mm40 mm40VarN = s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            mdm mdmVar = wceVar.f38920a;
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ylm(function1, (byte) 14);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) wceVar, (Object) function1, i, i2, (byte) 22);
        }
    }

    public static final void D(mm40 mm40Var, lqr lqrVar, fet fetVar, int i) {
        y9q0 y9q0VarU;
        StaticColors staticColors;
        long jM94getGamesTextVictory0d7_KjU;
        y9q0 y9q0VarU2;
        long jM94getGamesTextVictory0d7_KjU2;
        y9q0 y9q0VarU3;
        long jM94getGamesTextVictory0d7_KjU3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-138925426);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(lqrVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var, 256.0f, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            j0x.b(a8k0.F(R.drawable.bg_football_zones, 0, fetVar2), null, o7k0.p(jm40Var, 256.0f, 36.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            mm40 mm40VarL = s5x0.L(o7k0.p(jm40Var, 256.0f, 28.0f), 20.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            l3w0 l3w0Var = lqrVar.f20498a;
            l3w0 l3w0Var2 = lqrVar.c;
            l3w0 l3w0Var3 = lqrVar.b;
            String value = l3w0Var.getValue();
            boolean z2 = l3w0Var instanceof h3w0;
            if (z2) {
                pz40 pz40Var = s6t0.f31722a;
                y9q0VarU = g1t0.m();
            } else if (!(l3w0Var instanceof j3w0)) {
                t9f.b();
                return;
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                y9q0VarU = g1t0.u();
            }
            y9q0 y9q0Var = y9q0VarU;
            if (z2) {
                staticColors = StaticColors.INSTANCE;
                jM94getGamesTextVictory0d7_KjU = staticColors.m123getWhite0d7_KjU();
            } else if (!(l3w0Var instanceof j3w0)) {
                t9f.b();
                return;
            } else {
                staticColors = StaticColors.INSTANCE;
                jM94getGamesTextVictory0d7_KjU = staticColors.m94getGamesTextVictory0d7_KjU();
            }
            StaticColors staticColors2 = staticColors;
            v8q0.a(value, mm40VarA, jM94getGamesTextVictory0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 130040);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
            String value2 = l3w0Var3.getValue();
            boolean z3 = l3w0Var3 instanceof h3w0;
            if (z3) {
                y9q0VarU2 = g1t0.m();
            } else {
                if (!(l3w0Var3 instanceof j3w0)) {
                    t9f.b();
                    return;
                }
                y9q0VarU2 = g1t0.u();
            }
            y9q0 y9q0Var2 = y9q0VarU2;
            if (z3) {
                jM94getGamesTextVictory0d7_KjU2 = staticColors2.m123getWhite0d7_KjU();
            } else {
                if (!(l3w0Var3 instanceof j3w0)) {
                    t9f.b();
                    return;
                }
                jM94getGamesTextVictory0d7_KjU2 = staticColors2.m94getGamesTextVictory0d7_KjU();
            }
            v8q0.a(value2, mm40VarA2, jM94getGamesTextVictory0d7_KjU2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var2, fetVar, 0, 0, 130040);
            mm40 mm40VarA3 = zhg0Var.a(1.0f, jm40Var, true);
            String value3 = l3w0Var2.getValue();
            boolean z4 = l3w0Var2 instanceof h3w0;
            if (z4) {
                y9q0VarU3 = g1t0.m();
            } else {
                if (!(l3w0Var2 instanceof j3w0)) {
                    t9f.b();
                    return;
                }
                y9q0VarU3 = g1t0.u();
            }
            y9q0 y9q0Var3 = y9q0VarU3;
            if (z4) {
                jM94getGamesTextVictory0d7_KjU3 = staticColors2.m123getWhite0d7_KjU();
            } else {
                if (!(l3w0Var2 instanceof j3w0)) {
                    t9f.b();
                    return;
                }
                jM94getGamesTextVictory0d7_KjU3 = staticColors2.m94getGamesTextVictory0d7_KjU();
            }
            v8q0.a(value3, mm40VarA3, jM94getGamesTextVictory0d7_KjU3, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var3, fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, lqrVar, i, (byte) 23);
        }
    }

    public static final void E(mm40 mm40Var, o2s o2sVar, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        mm40 mm40Var2;
        ugd ugdVar5;
        ugd ugdVar6;
        ugd ugdVar7;
        o2sVar.getClass();
        fetVar.g0(632768717);
        int i2 = i | (fetVar.g(o2sVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            Activity activityS = j120.S((Context) fetVar.k(dy2.b));
            int iU = activityS != null ? j120.U(activityS) : 0;
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(24.0f, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new p1d(fB, o2sVar));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            mm40Var2 = mm40Var;
            mm40 mm40VarE0 = o2e.e0(mm40Var2, "GAME_CLASSIC_ROOT_TAG");
            boolean zE = fetVar.e(iU);
            Object objP2 = fetVar.P();
            byte b = 2;
            if (zE || objP2 == cl5Var) {
                objP2 = new mq8(iU, b);
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar6 = ugdVar3;
            ugdVar6.F(new coc("BACKGROUND_ID"), fetVar, 48);
            ugdVar7 = ugdVar4;
            ugdVar7.F(new coc("TOOLBAR_ID"), fetVar, 48);
            ugdVar5 = ugdVar;
            ugdVar5.F(new coc("INFORMATION_BOARD_ID"), fetVar, 48);
            coc cocVar = new coc("MARKETS_ID");
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new ufp(l7m0Var, (byte) 5);
                fetVar.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(cocVar, (Function1) objP3);
            mm40 mm40VarV = cjx.V(jm40.b, o2sVar.k, null);
            boolean z = (i2 & 112) == 32;
            Object objP4 = fetVar.P();
            if (z || objP4 == cl5Var) {
                objP4 = new l2s(o2sVar, (byte) 2);
                fetVar.o0(objP4);
            }
            ugdVar2.O(mm40VarT, mm40VarV, (Function1) objP4, fetVar, 3072);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            ugdVar5 = ugdVar;
            ugdVar6 = ugdVar3;
            ugdVar7 = ugdVar4;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var2, o2sVar, ugdVar5, ugdVar2, ugdVar6, ugdVar7, i, (byte) 19);
        }
    }

    public static final void F(i8m i8mVar, xcz xczVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-2049788526);
        int i2 = i | (fetVar.g(i8mVar) ? 4 : 2) | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ynk(function1, b);
                fetVar.o0(objP);
            }
            qzb.o(mm40VarN, i8mVar, h8m.f12633a, xczVar, (Function1) objP, fetVar, ((i2 << 3) & 112) | 384 | ((i2 << 6) & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(i8mVar, xczVar, function1, i, (byte) 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [a.jm40] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [a.mm40] */
    public static final void G(mm40 mm40Var, String str, String str2, zum zumVar, fet fetVar, int i) {
        String str3;
        String str4;
        ?? r1;
        fet fetVar2 = fetVar;
        fetVar2.g0(-106714359);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i2 |= fetVar2.g(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(zumVar) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            if (str4.length() > 0) {
                fetVar2.e0(143056708);
                j6n.h(str4, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 9) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(143203741);
                fetVar2.r(false);
            }
            if (zumVar instanceof yum) {
                fetVar2.e0(143301887);
                rcb.x(null, ((yum) zumVar).f43275a, h2m.c, nsm0.y(fgm.b), true, null, fetVar, 384);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(143586653);
                fetVar2.r(false);
            }
            v8q0.a(str3, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            r1 = jm40Var;
        } else {
            fetVar2.X();
            r1 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qvm(r1, str, str2, zumVar, i, (byte) 0);
        }
    }

    public static final void H(String str, int i, k6z k6zVar, fet fetVar, int i2) {
        fetVar.g0(-449203991);
        int i3 = (fetVar.g(str) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16) | (fetVar.e(k6zVar.ordinal()) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            obc.d(bmd.n.a(k6zVar), u1c.M(-209459799, new v((byte) 7, i, str), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hum(str, i, k6zVar, i2, (byte) 1);
        }
    }

    public static final void I(r0n r0nVar, fet fetVar, int i) {
        fetVar.g0(2021993339);
        int i2 = (fetVar.g(r0nVar) ? 4 : 2) | i;
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if (r0nVar instanceof o0n) {
            fetVar.e0(1810386175);
            fetVar.r(false);
        } else {
            boolean z = r0nVar instanceof p0n;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(287488618);
                p0n p0nVar = (p0n) r0nVar;
                fgm fgmVar = p0nVar.b;
                boolean zE = fetVar.e(fgmVar.ordinal()) | fetVar.f(p0nVar.f26160a);
                Object objP = fetVar.P();
                if (zE || objP == ukd.f35823a) {
                    objP = new c8n(nsm0.y(fgmVar), new w7n(new a8n(), u1c.O(p0nVar), true, 0, false, null, 56));
                    fetVar.o0(objP);
                }
                v7n.c(o2e.e0(mrv.k0(jm40Var, i9k0.f14392a), "EVENT_CARD_TIMER_INFO"), (c8n) objP, null, fetVar, 4);
                fetVar.r(false);
            } else {
                if (!(r0nVar instanceof q0n)) {
                    throw b1j.f(1810384613, fetVar, false);
                }
                fetVar.e0(288216405);
                j6n.h("VAR", oro0.f25744a, mrv.k0(jm40Var, l9k0.f19657a), 0, 0, fetVar, 438, 24);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mxm(r0nVar, i, (byte) 9);
        }
    }

    public static final void J(xk80 xk80Var, omm ommVar, float f, fet fetVar, int i) {
        fetVar.g0(558787168);
        int i2 = i | (fetVar.g(xk80Var) ? 4 : 2) | (fetVar.g(ommVar) ? 32 : 16) | (fetVar.d(f) ? 256 : 128) | (fetVar.h(true) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            q5x.e(xk80Var, o7k0.w(jm40.b, null, false, 3), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1064507103, new u57(ommVar, f), fetVar), fetVar, (i2 & 14) | 48, 24576, 16380);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mmm(xk80Var, ommVar, f, i);
        }
    }

    public static final void K(mm40 mm40Var, q7m q7mVar, a4x a4xVar, fet fetVar, int i) {
        fetVar.g0(-1242509440);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(q7mVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            ntb.o(null, q7mVar, fetVar, i2 & 112, 1);
            fetVar.e0(427021490);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                vzb.g(o7k0.d(jm40.b, 1.0f), (l8m) it.next(), fetVar, 6);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, q7mVar, a4xVar, i, (byte) 29);
        }
    }

    public static final void L(mm40 mm40Var, xk80 xk80Var, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        long secondary20;
        fetVar.g0(610953591);
        int i2 = i | 6 | (fetVar.g(xk80Var) ? 32 : 16);
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(jr8.f16991a.b(o7k0.d(o7k0.e(mm40Var2, 40.0f), 1.0f), gqw0.h), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ndm(b);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(702100588);
            int iN = xk80Var.n();
            for (int i3 = 0; i3 < iN; i3++) {
                if (xk80Var.k() == i3) {
                    fetVar.e0(-1999125468);
                    secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                    z = false;
                } else {
                    z = false;
                    fetVar.e0(-1999124472);
                    secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20();
                }
                fetVar.r(z);
                zcl zclVar2 = qmk.f28987a;
                zq8.a(0, fetVar, o7k0.n(i120.Q(twn.l(gqw0.l, lgb.J(s5x0.K(mm40Var2, 3.0f, 6.0f), vgg0.f37379a)), secondary20, jd8.n), 6.0f));
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var2, xk80Var, i, (byte) 16);
        }
    }

    public static final void M(mm40 mm40Var, uj60 uj60Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(422000034);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.h(true) ? 32 : 16) | (fetVar2.g(uj60Var) ? 256 : 128) | (fetVar2.h(true) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarD, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), 16.0f, 0.0f, 2);
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            String str = uj60Var.c;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarL, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.q(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            String str2 = uj60Var.d;
            if (str2 == null || str2.length() == 0) {
                fetVar2.e0(-94289238);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-94998456);
                fetVar2.e0(-94944020);
                mm40 mm40VarV = cjx.V(jm40Var, x0x.a0(fetVar2), null);
                fetVar2.r(false);
                mm40 mm40VarA0 = wha0.a0(o7k0.d(s5x0.L(o7k0.w(jm40Var, null, false, 3), 16.0f, 0.0f, 2), 1.0f).e(mm40VarV), wha0.T(fetVar2), false, 14);
                String str3 = uj60Var.d;
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                v8q0.a(str3, mm40VarA0, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.k(), fetVar2, 0, 0, 130040);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, uj60Var, i, (byte) 13);
        }
    }

    public static final void N(mm40 mm40Var, omm ommVar, xk80 xk80Var, Function1 function1, fet fetVar, int i) {
        int i2;
        Object obj;
        fetVar.g0(-1465774031);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = ommVar;
            i2 |= fetVar.g(obj) ? 32 : 16;
        } else {
            obj = ommVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xk80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zG = ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 896) == 256) | fetVar.g(w6kVar) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                eqk eqkVar = new eqk((Object) w6kVar, obj, function1, (Object) xk80Var, (byte) 19);
                fetVar.o0(eqkVar);
                objP = eqkVar;
            }
            x4n0.a(mm40VarD, (Function2) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 14, i, (Object) mm40Var, (Object) ommVar, (Object) xk80Var, (Object) function1);
        }
    }

    public static final void O(mm40 mm40Var, ivm ivmVar, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        String str = ivmVar.d;
        fetVar.g0(-675370832);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ivmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarG = o7k0.g(jm40Var, 18.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarG);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str2 = ivmVar.f15451a;
            y9q0 y9q0VarM = g1t0.m();
            zfn zfnVar = zaq0.b;
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarM, fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(860896998, new i3l(ivmVar, (byte) 24), fetVar2), fetVar2, 56);
            if (str.length() > 0) {
                fetVar2.e0(-368375800);
                v8q0.a(str, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110584);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-368039140);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 15, i, mm40Var, (Object) ivmVar, z);
        }
    }

    public static final void P(int i, int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(197011493);
        int i3 = (fetVar.e(i) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            tdc.e(new rpe(i), ipe.f15159a, mm40Var2, fetVar2, 432, 0);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(i, i2, mm40Var2);
        }
    }

    public static final void Q(mm40 mm40Var, d280 d280Var, fet fetVar, int i) {
        fetVar.g0(210200637);
        int i2 = (fetVar.g(d280Var) ? 32 : 16) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.h, d280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            }
            kkb.p(0, fetVar, mm40Var, (Function0) objP2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gum(mm40Var, d280Var, i, b);
        }
    }

    public static final void R(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-1948755882);
        int i3 = i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            v8q0.a(str, o2e.e0(mm40Var, "OPPONENT_NAME_TEXT"), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, (i3 >> 3) & 14, ((i3 >> 6) & 14) | 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new poh(mm40Var, str, i, i2, (byte) 2);
        }
    }

    public static final void S(mm40 mm40Var, ivm ivmVar, ivm ivmVar2, mpm mpmVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-246851267);
        int i2 = i | 6 | (fetVar.g(ivmVar) ? 32 : 16) | (fetVar.g(ivmVar2) ? 256 : 128) | (fetVar.g(mpmVar) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = q8a.k0(o7k0.d(jm40Var, 1.0f), enx.b);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            O(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ivmVar, true, fetVar, (i2 & 112) | 384);
            f(null, mpmVar, z, fetVar, (i2 >> 6) & 1008);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            O(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ivmVar2, false, fetVar, ((i2 >> 3) & 112) | 384);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 11, i, mm40Var2, (Object) ivmVar, (Object) ivmVar2, (Object) mpmVar, z);
        }
    }

    public static final void T(n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(805157924);
        byte b = 2;
        int i2 = (fetVar.g(n0xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            mm40 mm40VarN2 = o7k0.n(jm40Var, 32.0f);
            uc9.c(mm40VarN2, mm40VarN2, n0xVar, Integer.valueOf(R.drawable.ic_glyph_circle_globe), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), null, null, gqw0.B, null, fetVar, ((i2 << 6) & 896) | 12582912, 352);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, b);
        }
    }

    public static final void U(g6l g6lVar, mm40 mm40Var, fet fetVar, int i) {
        g6lVar.getClass();
        fetVar.g0(271030307);
        byte b = 2;
        int i2 = i | (fetVar.g(g6lVar) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mbc.f(mm40Var, 0.0f, 0.0f, u1c.M(1671154910, new f6l(g6lVar, b2), fetVar), null, null, null, null, null, u1c.M(693738273, new f6l(g6lVar, b3), fetVar), u1c.M(-2091207198, new f6l(g6lVar, b), fetVar), fetVar, ((i2 >> 3) & 14) | 196608, 432, 2014);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(g6lVar, mm40Var, i, (byte) 16);
        }
    }

    public static final void V(int i, fet fetVar) {
        fetVar.g0(-1843784661);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 320.0f), 1.0f);
            zcl zclVar2 = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svj(i, (byte) 12);
        }
    }

    public static final void W(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2;
        String str2;
        fetVar.g0(-713027550);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new i5b(b);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            str2 = str;
            k7x.a(str2, null, knx.Q(mm40Var, (xdr) objP), gqw0.A, null, fetVar2, ((i2 >> 3) & 14) | 1572912, 1976);
        } else {
            fetVar2 = fetVar;
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 17);
        }
    }

    public static final void X(String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(644624295);
        int i2 = i | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarN, 1.0f, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            n05 n05Var = new n05(qmk.r, qmk.w, idm0.t(1));
            f2q0 f2q0Var = new f2q0(3);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, textPrimary, n05Var, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 1, 0, null, g1t0.p(), fetVar, (i2 & 14) | 48, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 20, i, str);
        }
    }

    public static final void Y(q7m q7mVar, float f, fet fetVar, int i) {
        fetVar.g0(1828668570);
        byte b = 2;
        int i2 = (fetVar.g(q7mVar) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ntb.o(o7k0.s(jm40.b, f), q7mVar, fetVar, (i2 << 3) & 112, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rx7(b, f, i, q7mVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    public static final void Z(xcz xczVar, lh80 lh80Var, l7m l7mVar, fet fetVar, int i) {
        xcz xczVar2;
        int i2;
        lh80 lh80Var2;
        float f;
        fetVar.g0(-1480575724);
        if ((i & 6) == 0) {
            xczVar2 = xczVar;
            i2 = (fetVar.g(xczVar2) ? 4 : 2) | i;
        } else {
            xczVar2 = xczVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            lh80Var2 = lh80Var;
            i2 |= fetVar.g(lh80Var2) ? 32 : 16;
        } else {
            lh80Var2 = lh80Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7mVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            a4x a4xVar = l7mVar.d;
            a4x a4xVar2 = l7mVar.e;
            int size = a4xVar.size() - a4xVar2.size();
            int i3 = i2 >> 6;
            g9q0 g9q0VarN = pym0.n(fetVar);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean zG = ((((i3 & 14) ^ 6) > 4 && fetVar.g(l7mVar)) || (i3 & 6) == 4) | fetVar.g(y9q0VarG) | fetVar.g(w6kVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (size > 0) {
                    a4x a4xVar3 = l7mVar.d;
                    if (a4xVar2.isEmpty()) {
                        f = 8.0f;
                        zcl zclVar = qmk.f28987a;
                        objP = new vpm0(0.0f, 0.0f);
                    } else {
                        f = 8.0f;
                        int size2 = a4xVar2.size() - 1;
                        float fR0 = w6kVar.r0((int) (g9q0.b(g9q0VarN, new j83(((q7m) CollectionsKt.d0(a4xVar2)).f28257a), y9q0VarG, 0, false, 1, 0L, null, null, null, 2028).c >> 32));
                        IntRange intRange = new IntRange(size2, q3d.i(a4xVar3), 1);
                        zcl zclVar2 = qmk.f28987a;
                        Iterator it = intRange.iterator();
                        float fK0 = 0.0f;
                        while (((kkx) it).c) {
                            fK0 += k0((f7m) CollectionsKt.W(((bkx) it).nextInt(), a4xVar3));
                        }
                        zcl zclVar3 = qmk.f28987a;
                        float f2 = (size * 8.0f) + fK0;
                        float f3 = ((ycl) l1e0.h(new ycl(fR0), new ycl(k0((f7m) CollectionsKt.W(size2, a4xVar3))), new ycl(f2))).f42389a;
                        ycl yclVar = new ycl((f2 - f3) - 8.0f);
                        ycl yclVar2 = new ycl(0.0f);
                        if (yclVar.compareTo(yclVar2) < 0) {
                            yclVar = yclVar2;
                        }
                        objP = new vpm0(f3, yclVar.f42389a);
                    }
                } else {
                    f = 8.0f;
                    zcl zclVar4 = qmk.f28987a;
                    objP = new vpm0(0.0f, 0.0f);
                }
                fetVar.o0(objP);
            } else {
                cl5Var = cl5Var;
                f = 8.0f;
            }
            Object obj = (vpm0) objP;
            zcl zclVar5 = qmk.f28987a;
            qw3 qw3Var = new qw3(f, true, new jf4((byte) 14));
            boolean zE = ((i2 & 896) == 256) | fetVar.e(size) | fetVar.g(obj);
            Object objP2 = fetVar.P();
            byte b = 3;
            if (zE || objP2 == cl5Var) {
                objP2 = new g18(l7mVar, size, obj, b);
                fetVar.o0(objP2);
            }
            int i4 = i2 << 3;
            b8k0.f(null, xczVar2, lh80Var2, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, (i4 & 112) | 12582912 | (i4 & 896), 361);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j7m(xczVar, lh80Var, l7mVar, i, (byte) 1);
        }
    }

    public static final void a(uj60 uj60Var, fet fetVar, int i) {
        fetVar.g0(1848694796);
        int i2 = i | (fetVar.g(uj60Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Integer num = uj60Var.b;
            fetVar.e0(101121271);
            pm80 pm80VarF = a8k0.F(num.intValue(), 0, fetVar);
            fetVar.r(false);
            k7x.b(uj60Var.f35762a.a(), null, i120.Q(ny9.O(1.6666666f, o7k0.d(jm40.b, 1.0f), false), ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), jd8.n), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(uj60Var, i, (byte) 15);
        }
    }

    public static final void a0(lc00 lc00Var, m9s m9sVar, qxv qxvVar, ctf0 ctf0Var, long j, boolean z) {
        h1h f1hVar;
        f1h f1hVar2;
        m9sVar.getClass();
        ctf0Var.getClass();
        long j2 = m9sVar.v - (j / 1000);
        boolean z2 = 1 <= j2 && j2 < 6000000;
        int i = qxvVar.f29507a;
        boolean z3 = qxvVar.e;
        int i2 = qxvVar.b;
        boolean z4 = i > i2;
        if (z2) {
            f1hVar = new f1h(ctf0Var.b.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0)));
        } else {
            if (z3 && z4) {
                f1hVar2 = new f1h(ctf0Var.b.a(R.string.player_won_v2, Arrays.copyOf(new Object[]{m9sVar.i}, 1)));
            } else if (z3 && i == i2) {
                f1hVar = new f1h(ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[0], 0)));
            } else if (z3) {
                f1hVar2 = new f1h(ctf0Var.b.a(R.string.player_won_v2, Arrays.copyOf(new Object[]{m9sVar.j}, 1)));
            } else {
                qqs qqsVar = m9sVar.h;
                long j3 = qqsVar.h;
                if (znq0.f(j3) > 0) {
                    long jF = znq0.f(j3);
                    znq0 znq0Var = qqsVar.k;
                    f1hVar = new g1h(znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null, jF);
                } else {
                    f1hVar = new f1h("");
                }
            }
            f1hVar = f1hVar2;
        }
        String str = m9sVar.i;
        String str2 = m9sVar.j;
        String strValueOf = String.valueOf(i);
        String strValueOf2 = String.valueOf(i2);
        uxv uxvVar = qxvVar.c;
        i1h i1hVar = new i1h(uxvVar.f36461a, uxvVar.b, uxvVar.c);
        uxv uxvVar2 = qxvVar.d;
        lc00Var.add(new j1h(f1hVar, str, str2, strValueOf, strValueOf2, i1hVar, new i1h(uxvVar2.f36461a, uxvVar2.b, uxvVar2.c), (!z3 || i >= i2) ? 1.0f : 0.5f, (!z3 || i <= i2) ? 1.0f : 0.5f, z));
    }

    public static final void b(mm40 mm40Var, omm ommVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        cl5 cl5Var;
        fetVar.g0(-785818830);
        int i2 = i | (fetVar.g(ommVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            mm40 mm40VarQ = i120.Q(mm40Var2, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            byte b = 2;
            mm40 mm40VarL = s5x0.L(s5x0.N(mm40VarQ, 0.0f, 16.0f, 0.0f, 8.0f, 5), 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            wul wulVar = ommVar.b;
            jm40 jm40Var2 = jm40.b;
            cl5 cl5Var2 = ukd.f35823a;
            if (wulVar != null) {
                fetVar.e0(135475935);
                jm40Var = jm40Var2;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                wul wulVar2 = ommVar.b;
                oe9 oe9Var = oe9.f25112a;
                wul wulVarA = wul.a(61, wulVar2);
                boolean z = (i2 & 896) == 256;
                Object objP = fetVar.P();
                if (z || objP == cl5Var2) {
                    objP = new ylm(function1, b);
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                cl5Var = cl5Var2;
                qzb.n(mm40VarD, wulVarA, function0, fetVar, 6, 0);
                fetVar.r(false);
            } else {
                jm40Var = jm40Var2;
                cl5Var = cl5Var2;
                fetVar.e0(135820934);
                fetVar.r(false);
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            wul wulVar3 = ommVar.c;
            oe9 oe9Var2 = oe9.f25112a;
            wul wulVarA2 = wul.a(61, wulVar3);
            boolean z2 = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ylm(function1, (byte) 3);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarD2, wulVarA2, (Function0) objP2, fetVar, 6, 0);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var2, ommVar, function1, i, (byte) 12);
        }
    }

    public static final void b0(String str, StringBuilder sb) {
        if (sb.length() <= 0 || str.length() <= 0) {
            return;
        }
        sb.append(". ".concat(str));
    }

    public static final void c(jnh jnhVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1719653858);
        int i2 = i | (fetVar2.g(jnhVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 132.0f), 100.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f);
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
            X(jnhVar.b, fetVar2, 0);
            T(jnhVar.c, fetVar2, 0);
            fetVar2.r(true);
            String str = jnhVar.d;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            n05 n05Var = new n05(idm0.t(12), idm0.t(14), idm0.t(1));
            f2q0 f2q0Var = new f2q0(3);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD2, secondary, n05Var, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 48, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yfg(jnhVar, i, (byte) 5);
        }
    }

    public static final String c0(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        if (str.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
            sb.setLength(0);
            sb.append(str);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str, '/'));
        }
        return sb.toString();
    }

    public static final void d(boa boaVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1492940403);
        int i2 = (fetVar.g(boaVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ynk(function1, b);
                fetVar.o0(objP);
            }
            ntr.m(mm40VarN, boaVar, (Function1) objP, fetVar, (i2 << 3) & 112, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(boaVar, function1, i, (byte) 7);
        }
    }

    public static final a1g d0(gmq gmqVar, gmq gmqVar2, gmq gmqVar3, gmq gmqVar4, gmq gmqVar5, aer aerVar) {
        return new a1g(new gmq[]{gmqVar, gmqVar2, gmqVar3, gmqVar4, gmqVar5}, aerVar, (byte) 24);
    }

    public static final void e(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1484727056);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            if (a4xVar.isEmpty()) {
                fetVar2.e0(664504424);
                fetVar2.r(false);
            } else {
                fetVar2.e0(663780791);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1049704769, new eup(a4xVar, (byte) 11), fetVar2), fetVar2, 56);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(664562394);
                jm40Var = jm40Var2;
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i2 >> 6) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(664801032);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pea(mm40Var2, a4xVar, str, i, (byte) 2);
        }
    }

    public static final a1g e0(gmq gmqVar, gmq gmqVar2, gmq gmqVar3, gmq gmqVar4, zdr zdrVar) {
        return new a1g(new gmq[]{gmqVar, gmqVar2, gmqVar3, gmqVar4}, zdrVar, (byte) 23);
    }

    public static final void f(mm40 mm40Var, mpm mpmVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-612909691);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mpmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            n4c.l(jr8.f16991a.b(jm40Var, gqw0.e), mpmVar, z, fetVar, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 14, i, mm40Var2, (Object) mpmVar, z);
        }
    }

    public static final a1g f0(gmq gmqVar, gmq gmqVar2, gmq gmqVar3, ydr ydrVar) {
        return new a1g(new gmq[]{gmqVar, gmqVar2, gmqVar3}, ydrVar, (byte) 22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void g(mm40 mm40Var, z1d z1dVar, f3d f3dVar, fet fetVar, int i) {
        int i2;
        f3d f3dVar2;
        float f;
        ?? r5;
        z1dVar.getClass();
        fetVar.g0(-215150059);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(z1dVar) : fetVar.i(z1dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f3dVar2 = f3dVar;
            i2 |= fetVar.g(f3dVar2) ? 256 : 128;
        } else {
            f3dVar2 = f3dVar;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float fD = f3dVar2.d();
            float f2 = 1.0f - fD;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            ohk ohkVar = z1dVar.d;
            String str = z1dVar.c;
            String str2 = z1dVar.b;
            int iOrdinal = ohkVar.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                f = 168.0f;
            } else if (iOrdinal == 1) {
                zcl zclVar2 = qmk.f28987a;
                f = 216.0f;
            } else if (iOrdinal != 2) {
                t9f.b();
                return;
            } else {
                zcl zclVar3 = qmk.f28987a;
                f = 196.0f;
            }
            mm40 mm40VarE = o7k0.e(mm40Var, f);
            boolean zD = fetVar.d(fD);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zD || objP == obj) {
                objP = new f54(fD, (byte) 7);
                fetVar.o0(objP);
            }
            mm40 mm40VarM = rq8.M(mm40VarE, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            pm80 pm80VarF = a8k0.F(z1dVar.e, 0, fetVar);
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            float f3 = f2;
            k7x.b(z1dVar.f43611a, null, jr8Var.a(jm40Var), pm80VarF, pm80VarF, pm80VarF, null, null, null, null, gqw0.A, null, fetVar, 299056, 6, 31680);
            if (str2.length() > 0) {
                fetVar.e0(908724774);
                r5 = 0;
                W(0, fetVar, jr8Var.b(jm40Var, gqw0.g), str2);
                fetVar.r(false);
            } else {
                r5 = 0;
                fetVar.e0(908891027);
                fetVar.r(false);
            }
            if (str.length() > 0) {
                fetVar.e0(908946951);
                W(r5, fetVar, jr8Var.b(jm40Var, gqw0.i), str);
                fetVar.r(r5);
            } else {
                fetVar.e0(909112243);
                fetVar.r(r5);
            }
            mm40 mm40VarN = epv0.N(jr8Var.a(jm40Var), f3);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new e6c((byte) 24);
                fetVar.o0(objP2);
            }
            zq8.a(0, fetVar, rq8.L(mm40VarN, (Function1) objP2));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, z1dVar, f3dVar, i, (byte) 4);
        }
    }

    public static final boolean g0(long j, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (j == ((xcp) it.next()).b.a()) {
                return true;
            }
        }
        return false;
    }

    public static final void h(add addVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        addVar.getClass();
        fetVar.g0(1767318619);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(addVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            if (addVar.d) {
                fetVar.e0(1881115170);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1881116094);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(140445595, new cnc(addVar, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(addVar, i, (byte) 17);
        }
    }

    public static final yjj0 h0(boolean z, boolean z2) {
        if (z && z2) {
            zcl zclVar = qmk.f28987a;
            return vgg0.a(16.0f);
        }
        if (z) {
            zcl zclVar2 = qmk.f28987a;
            return vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
        }
        if (!z2) {
            return jd8.n;
        }
        zcl zclVar3 = qmk.f28987a;
        return vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
    }

    public static final void i(String str, String str2, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        fet fetVar2;
        fetVar.g0(1048880716);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pm80 pm80VarF = a8k0.F(R.drawable.discipline_block_placeholder, 0, fetVar);
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(320.0f, fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new bok(fB);
                fetVar.o0(objP);
            }
            qge qgeVar = (qge) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 320.0f), 1.0f);
            zcl zclVar2 = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), "DISCIPLINE_BLOCK_BOX");
            tj30 tj30VarC = zq8.c(gqw0.h, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1987002862, new znk(str, pm80VarF, qgeVar, b), fetVar), fetVar, 56);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.d, gqw0.m, fetVar, 6);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            long j = qmk.w;
            long j2 = qmk.y;
            kc5.N(str2, o2e.e0(o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), 1.0f), 40.0f), "DISCIPLINE_BLOCK_BOX_TEXT"), jM123getWhite0d7_KjU, null, null, 0L, j, j2, null, null, 0L, null, 2, false, 1, 0, false, null, new y9q0(0L, j2, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), 0.0f, fetVar, (i2 >> 3) & 14, 1597440, 0, 3063608);
            fetVar2 = fetVar;
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar2, 6);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aok(str, str2, ugdVar2, i, (byte) 0);
        }
    }

    public static final String i0(d0t d0tVar, dmr dmrVar) {
        Object next;
        String str;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        return (cmrVar == null || (str = cmrVar.b) == null) ? "" : str;
    }

    public static final void j(final ooh0 ooh0Var, Function0 function0, final Function1 function1, final boolean z, final boolean z2, mm40 mm40Var, fet fetVar, int i) {
        final byte b;
        fet fetVar2 = fetVar;
        ooh0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-888501340);
        int i2 = i | (fetVar2.g(ooh0Var) ? 4 : 2) | (fetVar2.i(function0) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.h(z2) ? 16384 : 8192) | (fetVar2.g(mm40Var) ? 131072 : 65536);
        final byte b2 = 0;
        if (!fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar2.X();
        } else if (ooh0Var instanceof koh0) {
            fetVar2.e0(540378028);
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            vtb.g((koh0) ooh0Var, function0, i120.Q(mm40Var, backgroundContent, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), fetVar2, i2 & 126);
            fetVar2.r(false);
        } else {
            boolean z3 = ooh0Var instanceof loh0;
            cl5 cl5Var = ukd.f35823a;
            if (z3) {
                fetVar2.e0(540858621);
                boolean z4 = ((loh0) ooh0Var).f;
                ugd ugdVarM = u1c.M(-661182318, new Function2() { // from class: a.nxf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        ooh0 ooh0Var2 = ooh0Var;
                        boolean z5 = z;
                        boolean z6 = z2;
                        fet fetVar3 = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b3) {
                            case 0:
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    loh0 loh0Var = (loh0) ooh0Var2;
                                    fre0.a(new dh(!z5, !z6, loh0Var.c, loh0Var.e), fetVar3, 0);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    moh0 moh0Var = (moh0) ooh0Var2;
                                    fre0.a(new dh(!z5, !z6, moh0Var.c, moh0Var.e), fetVar3, 0);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2);
                ugd ugdVarM2 = u1c.M(-1079756888, new xdr() { // from class: a.oxf
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = b2;
                        ooh0 ooh0Var2 = ooh0Var;
                        mm40 mm40Var2 = (mm40) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b3) {
                            case 0:
                                mm40Var2.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(mm40Var2) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    loh0 loh0Var = (loh0) ooh0Var2;
                                    xkb.g(new jie(loh0Var.g, loh0Var.h, loh0Var.d), mm40Var2, fetVar3, (iIntValue << 3) & 112);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                mm40Var2.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(mm40Var2) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    moh0 moh0Var = (moh0) ooh0Var2;
                                    xkb.g(new jie(moh0Var.g, moh0Var.i, moh0Var.d), mm40Var2, fetVar3, (iIntValue << 3) & 112);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2);
                mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), h0(z, z2));
                boolean z5 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object objP = fetVar2.P();
                if (z5 || objP == cl5Var) {
                    objP = new Function0() { // from class: a.pxf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (b2) {
                                case 0:
                                    function1.invoke(ooh0Var);
                                    break;
                                default:
                                    function1.invoke(ooh0Var);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP);
                }
                wvb.h(432, ugdVarM, ugdVarM2, fetVar2, y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28), z4);
                fetVar2.r(false);
            } else {
                if (!(ooh0Var instanceof moh0)) {
                    throw b1j.f(848715670, fetVar2, false);
                }
                fetVar2.e0(542237501);
                boolean z6 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
                Object objP2 = fetVar2.P();
                if (z6 || objP2 == cl5Var) {
                    b = 1;
                    objP2 = new Function0() { // from class: a.pxf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (b) {
                                case 0:
                                    function1.invoke(ooh0Var);
                                    break;
                                default:
                                    function1.invoke(ooh0Var);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP2);
                } else {
                    b = 1;
                }
                moh0 moh0Var = (moh0) ooh0Var;
                wwb.d((Function0) objP2, moh0Var.f, moh0Var.h, u1c.M(378642045, new Function2() { // from class: a.nxf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b;
                        ooh0 ooh0Var2 = ooh0Var;
                        boolean z7 = z;
                        boolean z8 = z2;
                        fet fetVar3 = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b3) {
                            case 0:
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    loh0 loh0Var = (loh0) ooh0Var2;
                                    fre0.a(new dh(!z7, !z8, loh0Var.c, loh0Var.e), fetVar3, 0);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    moh0 moh0Var2 = (moh0) ooh0Var2;
                                    fre0.a(new dh(!z7, !z8, moh0Var2.c, moh0Var2.e), fetVar3, 0);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2), u1c.M(-920615661, new xdr() { // from class: a.oxf
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = b;
                        ooh0 ooh0Var2 = ooh0Var;
                        mm40 mm40Var2 = (mm40) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b3) {
                            case 0:
                                mm40Var2.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(mm40Var2) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    loh0 loh0Var = (loh0) ooh0Var2;
                                    xkb.g(new jie(loh0Var.g, loh0Var.h, loh0Var.d), mm40Var2, fetVar3, (iIntValue << 3) & 112);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                mm40Var2.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(mm40Var2) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    moh0 moh0Var2 = (moh0) ooh0Var2;
                                    xkb.g(new jie(moh0Var2.g, moh0Var2.i, moh0Var2.d), mm40Var2, fetVar3, (iIntValue << 3) & 112);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2), i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), h0(z, z2)), fetVar2, 27648);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qxf(ooh0Var, function0, function1, z, z2, mm40Var, i);
        }
    }

    public static final long j0(ctf0 ctf0Var, boolean z) {
        return z ? fbc.d(ctf0Var.a(R.color.static_green)) : fbc.d(ctf0.b(R.attr.uikitTextPrimary, ctf0Var));
    }

    public static final void k(mm40 mm40Var, knh knhVar, xcz xczVar, float f, fet fetVar, int i) {
        xcz xczVar2;
        float f2;
        xcz xczVarA;
        int i2;
        float f3;
        fetVar.g0(626455090);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(knhVar) ? 32 : 16) | 1152;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                i2 = i3 & (-8065);
                f3 = xfn.a(fetVar).c;
            } else {
                fetVar.X();
                xczVarA = xczVar;
                i2 = i3 & (-8065);
                f3 = f;
            }
            fetVar.s();
            fetVar.e0(1091011657);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f3, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new hfg(knhVar, (byte) 22);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, xczVarA, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            fetVar.r(false);
            xczVar2 = xczVarA;
            f2 = f3;
        } else {
            fetVar.X();
            xczVar2 = xczVar;
            f2 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a2d(mm40Var, (Object) knhVar, xczVar2, f2, i, (byte) 2);
        }
    }

    public static final float k0(f7m f7mVar) {
        a4x a4xVar;
        wqg wqgVar = (f7mVar == null || (a4xVar = f7mVar.f9064a) == null) ? null : (wqg) CollectionsKt.firstOrNull(a4xVar);
        l9m l9mVar = wqgVar instanceof l9m ? (l9m) wqgVar : null;
        if (l9mVar == null) {
            return kbm.f18020a;
        }
        if (l9mVar instanceof l9m) {
            return k9m.f17920a;
        }
        t9f.b();
        return 0.0f;
    }

    public static final void l(mm40 mm40Var, a4x a4xVar, float f, Function1 function1, fet fetVar, int i) {
        a4xVar.getClass();
        fetVar.g0(-1489938173);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.d(f) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | 24576;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 176.0f), 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 11);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a2d(mm40Var, (Object) a4xVar, f, (wdr) function1, i, (byte) 3);
        }
    }

    public static final boolean l0(mk50 mk50Var) {
        u0m0 u0m0Var = (u0m0) CollectionsKt.firstOrNull(mk50Var.l);
        if (u0m0Var == null) {
            return true;
        }
        lho lhoVar = u0m0Var.i;
        return (lhoVar != lho.GAME_STATUS_RESULT || mk50Var.f21928a.length() == 0 || mk50Var.b.length() == 0) && lhoVar != lho.GAME_STATUS_LIVE;
    }

    public static final void m(mm40 mm40Var, f7m f7mVar, fet fetVar, int i) {
        fetVar.g0(751778893);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(f7mVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            fetVar.e0(-726287444);
            Iterator<E> it = f7mVar.f9064a.iterator();
            while (it.hasNext()) {
                ntb.o(null, (wqg) it.next(), fetVar, 0, 1);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, f7mVar, i, (byte) 7);
        }
    }

    public static final boolean m0(d0t d0tVar) {
        d0tVar.getClass();
        return d0tVar.z && d0tVar.s != 0;
    }

    public static final void n(float f, l7m l7mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(916885616);
        if ((i & 6) == 0) {
            i2 = (fetVar.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7mVar) ? 32 : 16;
        }
        int i3 = i2;
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.b;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            xcz xczVarA2 = ddz.a(0, 0, fetVar, 0, 3);
            boolean zG = fetVar.g(xczVarA2) | fetVar.h(z) | fetVar.g(xczVarA);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new r91((Object) xczVarA2, z, (Object) xczVarA, (byte) 10);
                fetVar.o0(objP);
            }
            bch0 bch0VarP = piz.P((Function1) objP, fetVar);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 8.0f, 0.0f, 11);
            mm40 mm40VarA = fbh0.a(s5x0.N(jm40.b, f, 0.0f, 0.0f, 0.0f, 14), bch0VarP, ma80.b, false, null, 60);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            int i4 = (i3 << 3) & 896;
            Z(xczVarA, lh80VarU, l7mVar, fetVar, i4);
            o(xczVarA2, lh80VarU, l7mVar, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i7m(b, f, i, l7mVar);
        }
    }

    public static final t480 n0(d0t d0tVar, ctf0 ctf0Var) {
        ubr ubrVar = d0tVar.p.B;
        String strI0 = i0(d0tVar, dmr.e);
        if (strI0.length() == 0) {
            strI0 = String.valueOf(ubrVar.f35394a);
        }
        String strI1 = i0(d0tVar, dmr.f);
        if (strI1.length() == 0) {
            strI1 = String.valueOf(ubrVar.b);
        }
        List listSplit$default = StringsKt__StringsKt.split$default(i0(d0tVar, dmr.t), new String[]{Separators.SEMICOLON}, false, 0, 6, null);
        String str = (String) CollectionsKt.firstOrNull(listSplit$default);
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        String str2 = (String) CollectionsKt.f0(listSplit$default);
        Pair pair = (intOrNull == null || str2 == null) ? new Pair(0, "") : new Pair(intOrNull, Separators.SP.concat(ctf0Var.b.a(R.string.cricket_current_over, Arrays.copyOf(new Object[]{str2}, 1))));
        int iIntValue = ((Number) pair.f46059a).intValue();
        String str3 = (String) pair.b;
        if (iIntValue == 1) {
            strI0 = ohs0.n(strI0, str3);
        } else if (iIntValue == 2) {
            strI1 = ohs0.n(strI1, str3);
        }
        return new t480(strI0, strI1);
    }

    public static final void o(xcz xczVar, lh80 lh80Var, l7m l7mVar, fet fetVar, int i) {
        xcz xczVar2;
        int i2;
        fetVar.g0(708222883);
        if ((i & 6) == 0) {
            xczVar2 = xczVar;
            i2 = (fetVar.g(xczVar2) ? 4 : 2) | i;
        } else {
            xczVar2 = xczVar;
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(lh80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7mVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new edl(l7mVar, b);
                fetVar.o0(objP);
            }
            int i3 = i2 << 3;
            b8k0.f(null, xczVar2, lh80Var, false, null, null, null, false, null, (Function1) objP, fetVar, (i3 & 112) | 12582912 | (i3 & 896), 377);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j7m(xczVar, lh80Var, l7mVar, i, (byte) 0);
        }
    }

    public static final bhj o0(chj chjVar, boolean z, int i) {
        chjVar.getClass();
        long j = chjVar.f4362a;
        String str = chjVar.b;
        List list = chjVar.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jij jijVar = (jij) it.next();
            jijVar.getClass();
            double d = jijVar.f16577a;
            String str2 = jijVar.b;
            long j2 = jijVar.c;
            String str3 = jijVar.d;
            String str4 = jijVar.e;
            int i2 = jijVar.f;
            int i3 = jijVar.g;
            long j3 = j;
            Iterator it2 = it;
            long j4 = jijVar.j;
            long j5 = jijVar.k;
            String str5 = jijVar.l;
            String str6 = jijVar.m;
            String str7 = jijVar.n;
            long j6 = jijVar.p;
            long j7 = jijVar.q;
            long j8 = jijVar.r;
            long j9 = jijVar.s;
            double d2 = jijVar.t;
            long j10 = jijVar.u;
            long j11 = jijVar.v;
            String str8 = jijVar.w;
            String str9 = jijVar.x;
            arrayList.add(new qhj(d, str2, j2, str3, str4, jijVar.h, jijVar.i, i2, i3, j4, j5, str5, str6, str7, jijVar.o, j6, j7, j8, j9, d2, j10, j11, str8, str9, StringsKt.W(str4) ? str3 : kng0.l(str3, " - ", str4), z, jijVar.y, jijVar.z, jijVar.A, jijVar.B));
            it = it2;
            j = j3;
        }
        return new bhj(i + 1, j, str, CollectionsKt.A0(arrayList, new vt5((byte) 23)), chjVar.d);
    }

    public static final void p(gok gokVar, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        gokVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(1885511986);
        int i2 = (fetVar.g(gokVar) ? 4 : 2) | i | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (gokVar instanceof eok) {
            fetVar.e0(1705520229);
            eok eokVar = (eok) gokVar;
            i(eokVar.b(), eokVar.getTitle(), u1c.M(-165319506, new xnk(gokVar, function1, qdzVar), fetVar), fetVar, 384);
            fetVar.r(false);
        } else if (gokVar instanceof fok) {
            fetVar.e0(1706592302);
            V(0, fetVar);
            fetVar.r(false);
        } else {
            fetVar.e0(1706630928);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xnk(gokVar, qdzVar, function1, i);
        }
    }

    public static final x6n p0(ufp0 ufp0Var) {
        String str = ufp0Var.f35586a;
        String str2 = ufp0Var.b;
        int i = ufp0Var.c;
        String str3 = ufp0Var.d;
        List<y3n0> list = ufp0Var.e;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (y3n0 y3n0Var : list) {
            y3n0Var.getClass();
            arrayList.add(new f5n(y3n0Var.f41961a, y3n0Var.b));
        }
        return new x6n(str, str2, i, str3, dyb.r0(arrayList));
    }

    public static final void q(mm40 mm40Var, gol golVar, sh1 sh1Var, Function0 function0, Function1 function1, fet fetVar, int i) {
        int i2;
        golVar.getClass();
        fetVar.g0(-1330827706);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(golVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(sh1Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (golVar instanceof eol) {
            fetVar.e0(155291746);
            int iOrdinal = sh1Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(155419156);
                t(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(155716818);
                r(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw b1j.f(974840736, fetVar, false);
                }
                fetVar.e0(155419156);
                t(mm40Var, (eol) golVar, function0, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                fetVar.r(false);
            } else {
                fetVar.e0(156016867);
                v(mm40Var, (eol) golVar, function1, fetVar, ((i2 >> 6) & 896) | (i2 & 126));
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            if (!golVar.equals(fol.f9886a)) {
                throw b1j.f(974838817, fetVar, false);
            }
            fetVar.e0(156364780);
            int iOrdinal2 = sh1Var.ordinal();
            if (iOrdinal2 == 0) {
                fetVar.e0(156500498);
                u(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (iOrdinal2 == 1) {
                fetVar.e0(156673168);
                s(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    throw b1j.f(974875350, fetVar, false);
                }
                fetVar.e0(156500498);
                u(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                fetVar.e0(156847729);
                w(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            }
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnl(mm40Var, golVar, sh1Var, function0, function1, i, (byte) 3);
        }
    }

    public static final mim0 q0(mk50 mk50Var, ctf0 ctf0Var, v5l0 v5l0Var, boolean z) {
        ctf0Var.getClass();
        v5l0Var.getClass();
        List list = mk50Var.l;
        ArrayList arrayList = mk50Var.r;
        cys0 cys0Var = mk50Var.m;
        u0m0 u0m0Var = (u0m0) CollectionsKt.firstOrNull(list);
        long j = 0;
        long j2 = u0m0Var != null ? u0m0Var.k : 0L;
        boolean zH = ctf0Var.h();
        String str = u0m0Var != null ? u0m0Var.l : null;
        String str2 = str == null ? "" : str;
        String str3 = u0m0Var != null ? u0m0Var.m : null;
        String str4 = str3 == null ? "" : str3;
        boolean zL0 = l0(mk50Var);
        String strW = a8k0.w(mk50Var.f, mk50Var.n, cys0Var);
        String strW2 = a8k0.w(mk50Var.g, mk50Var.o, cys0Var);
        if (cys0Var != cys0.b && u0m0Var != null) {
            j = u0m0Var.h;
        }
        long j3 = j;
        int i = 0;
        if (list.size() > 1) {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                int i4 = ((u5h0) it.next()).c;
                if (i4 == 1) {
                    i2++;
                }
                if (i4 == 2) {
                    i3++;
                }
            }
            if (i2 > i3) {
                i = 1;
            } else if (i3 > i2) {
                i = 2;
            }
        } else if (u0m0Var != null) {
            i = u0m0Var.j;
        }
        int i5 = i;
        String str5 = mk50Var.f21928a;
        String str6 = mk50Var.b;
        String str7 = mk50Var.h;
        String str8 = mk50Var.i;
        k1m0 k1m0Var = mk50Var.p;
        String str9 = k1m0Var.f17533a;
        String str10 = k1m0Var.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it2) {
            u5h0 u5h0Var = (u5h0) it2.next();
            arrayList2.add(new Pair(u5h0Var.f35095a, u5h0Var.b));
            str7 = str7;
        }
        kbo kboVar = new kbo(str5, strW, str6, strW2, str7, str8, str2, str4, zL0, str9, str10, j3, i5, zH, arrayList2);
        if ((cys0Var == cys0.f || cys0Var == cys0.g) && !z) {
            cys0Var = cys0.f5194a;
        }
        cys0 cys0Var2 = cys0Var;
        boolean z2 = mk50Var.q;
        oim0 oim0Var = oim0.f25320a;
        if (z2) {
            return vtb.j0(j2, cys0Var2, kboVar, v5l0Var, ctf0Var, oim0Var);
        }
        u0m0 u0m0Var2 = (u0m0) CollectionsKt.firstOrNull(list);
        return (u0m0Var2 == null || u0m0Var2.i == lho.GAME_STATUS_LINE) ? ntb.c0(j2, cys0Var2, kboVar, v5l0Var, oim0Var) : wwb.S(j2, cys0Var2, kboVar, v5l0Var, ctf0Var, oim0Var);
    }

    public static final void r(mm40 mm40Var, eol eolVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-686888644);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 120.0f), 60.0f);
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new tnl(eolVar, pz40Var, (byte) 5);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE, false, (Function1) objP2);
            boolean z2 = (i2 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new unl(function0, (byte) 2);
                fetVar.o0(objP3);
            }
            mm40 mm40VarQ = i120.Q(lgb.J(y860.W(mm40VarA, null, null, false, null, (Function0) objP3, 28), vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            n0x n0xVar = eolVar.b;
            o0x o0xVar = eolVar.g;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new cml(pz40Var, (byte) 13);
                fetVar.o0(objP4);
            }
            Function0 function1 = (Function0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 8);
                fetVar.o0(objP5);
            }
            j0x.b(lv00.T(n0xVar, o0xVar, function1, (Function0) objP5, fetVar, 3456, 0), null, mm40VarQ, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnl(mm40Var, eolVar, function0, i, (byte) 6);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final a.jsp r0(a.msp r42, a.qsp r43) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dub.r0(a.msp, a.qsp):a.jsp");
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(697481744);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 120.0f), 60.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    public static final rsp s0(vsp vspVar) {
        xsp xspVar;
        jsp jspVarR0;
        Long l;
        e8v0 e8v0Var = vspVar.c;
        uup uupVar = vspVar.g;
        msp mspVar = vspVar.f;
        msp mspVar2 = vspVar.e;
        f7v0 f7v0VarY = e8v0Var != null ? xsm0.y(e8v0Var) : f7v0.f9077a;
        atp atpVar = vspVar.d;
        jsp jspVarR1 = null;
        if (atpVar != null) {
            Integer num = atpVar.f1441a;
            String str = atpVar.b;
            if (str == null || StringsKt.W(str)) {
                str = null;
            }
            String str2 = atpVar.c;
            if (str2 == null || StringsKt.W(str2)) {
                str2 = null;
            }
            String str3 = atpVar.d;
            if (Intrinsics.d(str3, "RED")) {
                if (mspVar2 != null) {
                    l = mspVar2.f22330a;
                } else {
                    l = null;
                }
            } else if (!Intrinsics.d(str3, "BLUE") || mspVar == null) {
                l = null;
            } else {
                l = mspVar.f22330a;
            }
            xspVar = new xsp(num, str, str2, l);
        } else {
            xspVar = null;
        }
        if (mspVar2 != null) {
            jspVarR0 = r0(mspVar2, uupVar != null ? uupVar.f36311a : null);
        } else {
            jspVarR0 = null;
        }
        if (mspVar != null) {
            jspVarR1 = r0(mspVar, uupVar != null ? uupVar.b : null);
        }
        return new rsp(f7v0VarY, xspVar, tx3.z(new jsp[]{jspVarR0, jspVarR1}));
    }

    public static final void t(mm40 mm40Var, eol eolVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1174230166);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarO = ny9.O(2.0f, o2e.e0(mm40Var, "AggregatorProviderImage"), false);
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new tnl(eolVar, pz40Var, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarO, false, (Function1) objP2);
            boolean z2 = (i2 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new unl(function0, (byte) 1);
                fetVar.o0(objP3);
            }
            mm40 mm40VarW = y860.W(mm40VarA, null, null, false, null, (Function0) objP3, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40VarW, vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            n0x n0xVar = eolVar.b;
            o0x o0xVar = eolVar.g;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new cml(pz40Var, (byte) 11);
                fetVar.o0(objP4);
            }
            Function0 function1 = (Function0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 12);
                fetVar.o0(objP5);
            }
            j0x.b(lv00.T(n0xVar, o0xVar, function1, (Function0) objP5, fetVar, 3456, 0), null, mm40VarQ, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rnl(mm40Var, eolVar, function0, i, (byte) 7);
        }
    }

    public static final xem t0(d0t d0tVar) {
        int i = d0tVar.p.g;
        boolean z = i == 1;
        boolean z2 = i == 2;
        if (z) {
            return vem.f37292a;
        }
        return z2 ? wem.f39025a : tem.f33827a;
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-844986206);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarO = ny9.O(2.0f, mm40Var, false);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarO), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 14);
        }
    }

    public static final vcm0 u0(otc otcVar) {
        otcVar.getClass();
        List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.u0(otcVar.e).toString(), new String[]{" : "}, false, 2, 2, null);
        String str = otcVar.b;
        long j = otcVar.i;
        long j2 = otcVar.d;
        String str2 = otcVar.e;
        String str3 = (String) CollectionsKt.firstOrNull(listSplit$default);
        if (str3 == null) {
            str3 = "0";
        }
        String str4 = (String) CollectionsKt.f0(listSplit$default);
        if (str4 == null) {
            str4 = "0";
        }
        y6p0 y6p0VarU = xcm0.u(otcVar.f);
        y6p0 y6p0VarU2 = xcm0.u(otcVar.g);
        lho lhoVar = otcVar.c;
        lho lhoVar2 = lho.GAME_STATUS_RESULT;
        boolean z = true;
        if (lhoVar != lhoVar2 && lhoVar != lho.GAME_STATUS_LIVE) {
            z = false;
        }
        String str5 = otcVar.h;
        boolean z2 = lhoVar == lhoVar2;
        boolean z3 = lhoVar == lho.GAME_STATUS_LIVE;
        String str6 = (String) CollectionsKt.firstOrNull(r18);
        String str7 = str6 == null ? "0" : str6;
        String str8 = (String) CollectionsKt.f0(listSplit$default);
        return new vcm0(str, j, "", j2, str2, str3, str4, y6p0VarU, y6p0VarU2, 0, 0, z, str5, z2, z3, str7, str8 == null ? "0" : str8);
    }

    public static final void v(mm40 mm40Var, eol eolVar, Function1 function1, fet fetVar, int i) {
        int i2;
        h4d h4dVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-968070180);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(eolVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            boolean z = eolVar.c;
            boolean zH = fetVar2.h(z);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP = j120.h(2.0f, z ? primary : backgroundContent);
                fetVar2.o0(objP);
            }
            dn8 dn8Var = (dn8) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 112;
            boolean z3 = z2 | (i3 == 32);
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new nk1(function1, eolVar, b);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, (Function0) objP3, 28);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.T(i120.Q(lgb.J(mm40VarW, vgg0.a(16.0f)), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), dn8Var.f6356a, dn8Var.b, vgg0.a(16.0f)), 2.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            mm40 mm40VarO = ny9.O(2.0f, o7k0.d(jm40.b, 1.0f), false);
            boolean z4 = i3 == 32;
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new tnl(eolVar, pz40Var, (byte) 3);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarJ2 = lgb.J(pai0.a(mm40VarO, false, (Function1) objP4), vgg0.a(14.0f));
            n0x n0xVar = eolVar.b;
            o0x o0xVar = eolVar.g;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 9);
                fetVar2.o0(objP5);
            }
            Function0 function0 = (Function0) objP5;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new cml(pz40Var, (byte) 10);
                fetVar2.o0(objP6);
            }
            mz3 mz3VarT = lv00.T(n0xVar, o0xVar, function0, (Function0) objP6, fetVar2, 3456, 0);
            pge pgeVar = gqw0.A;
            if (z) {
                h4dVar = null;
            } else {
                float[] fArrA = g4d.a();
                g4d.b(fArrA);
                h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA));
                h4dVar2.b = fArrA;
                h4dVar = h4dVar2;
            }
            fetVar2 = fetVar;
            j0x.b(mz3VarT, null, mm40VarJ2, null, pgeVar, 0.0f, h4dVar, fetVar2, 24624, 40);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new snl(mm40Var, eolVar, function1, i, (byte) 3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final e0u v0(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new d0u(charSequence, (byte) 3);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new h0u(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new d0u(charSequence, (byte) 1);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new b0u(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new d0u(charSequence, (byte) 4);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new d0u(charSequence, (byte) 2);
                }
                break;
        }
        if (!kotlin.text.c.x(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new d0u(charSequence, str);
        }
        int i = rpu.b;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!kotlin.text.c.x(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new t7r();
            }
            int i2 = rpu.b;
            return ntb.G(str, string);
        } catch (t7r unused) {
            return new d0u(string, str);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(544909841);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thd((byte) 17);
                fetVar.o0(objP);
            }
            mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarQ), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 15);
        }
    }

    public static final Object w0(jbi0 jbi0Var, Object obj) {
        Object objF = jbi0Var.f(obj);
        if (!(objF instanceof ytb)) {
            return Unit.f46060a;
        }
        return ((ztb) eeq.U(kotlin.coroutines.g.f46065a, new yxa((Object) jbi0Var, obj, (yje) null, (byte) 29))).f44949a;
    }

    public static final void x(mm40 mm40Var, final mvl mvlVar, final Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        final Function1 function3;
        ljc ljcVar = jd8.n;
        mvlVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        long j = y3d.f;
        int i3 = i2 & 8;
        cl5 cl5Var = ukd.f35823a;
        if (i3 != 0) {
            Object objP = fetVar.P();
            if (objP == cl5Var) {
                objP = new xjl((byte) 9);
                fetVar.o0(objP);
            }
            function1 = (Function1) objP;
        }
        if ((i2 & 16) != 0) {
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new xjl((byte) 10);
                fetVar.o0(objP2);
            }
            function3 = (Function1) objP2;
        } else {
            function3 = function2;
        }
        final byte b = 2;
        final byte b2 = 0;
        if (mvlVar instanceof kvl) {
            fetVar.e0(-674922558);
            mm40 mm40VarQ = i120.Q(mm40Var, j, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, 4.0f, 0.0f, 2);
            rqm rqmVar = ((kvl) mvlVar).h;
            boolean zG = fetVar.g(function1) | fetVar.g(mvlVar);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new Function0() { // from class: a.bul
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b2) {
                            case 0:
                                function1.invoke(mvlVar);
                                break;
                            case 1:
                                function1.invoke(mvlVar);
                                break;
                            case 2:
                                function1.invoke(mvlVar);
                                break;
                            default:
                                function1.invoke(mvlVar);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            boolean zG2 = fetVar.g(function3) | fetVar.g(mvlVar);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == cl5Var) {
                final byte b3 = 1;
                objP4 = new Function0() { // from class: a.bul
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b3) {
                            case 0:
                                function3.invoke(mvlVar);
                                break;
                            case 1:
                                function3.invoke(mvlVar);
                                break;
                            case 2:
                                function3.invoke(mvlVar);
                                break;
                            default:
                                function3.invoke(mvlVar);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP4);
            }
            obc.q(mm40VarL, rqmVar, false, null, function0, null, (Function0) objP4, null, fetVar, 384, 168);
            fetVar.r(false);
            return;
        }
        if (!(mvlVar instanceof lvl)) {
            throw b1j.f(-575962401, fetVar, false);
        }
        fetVar.e0(-674481087);
        mm40 mm40VarQ2 = i120.Q(mm40Var, j, ljcVar);
        zcl zclVar2 = qmk.f28987a;
        mm40 mm40VarL2 = s5x0.L(mm40VarQ2, 16.0f, 0.0f, 2);
        rqm rqmVar2 = ((lvl) mvlVar).f;
        boolean zG3 = fetVar.g(function1) | fetVar.g(mvlVar);
        Object objP5 = fetVar.P();
        if (zG3 || objP5 == cl5Var) {
            objP5 = new Function0() { // from class: a.bul
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (b) {
                        case 0:
                            function1.invoke(mvlVar);
                            break;
                        case 1:
                            function1.invoke(mvlVar);
                            break;
                        case 2:
                            function1.invoke(mvlVar);
                            break;
                        default:
                            function1.invoke(mvlVar);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(objP5);
        }
        Function0 function4 = (Function0) objP5;
        boolean zG4 = fetVar.g(function3) | fetVar.g(mvlVar);
        Object objP6 = fetVar.P();
        if (zG4 || objP6 == cl5Var) {
            final byte b4 = 3;
            objP6 = new Function0() { // from class: a.bul
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (b4) {
                        case 0:
                            function3.invoke(mvlVar);
                            break;
                        case 1:
                            function3.invoke(mvlVar);
                            break;
                        case 2:
                            function3.invoke(mvlVar);
                            break;
                        default:
                            function3.invoke(mvlVar);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(objP6);
        }
        obc.q(mm40VarL2, rqmVar2, false, null, function4, null, (Function0) objP6, null, fetVar, 384, 168);
        fetVar.r(false);
    }

    public static final LinkedHashMap x0(List list) {
        if (list == null) {
            list = iun.f15405a;
        }
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (htp htpVar : list) {
            String str = htpVar.f13645a;
            String str2 = htpVar.b;
            linkedHashMap.put(str, str2 != null ? StringsKt.toIntOrNull(str2) : null);
        }
        return linkedHashMap;
    }

    public static final void y(mm40 mm40Var, l7m l7mVar, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        l7mVar.getClass();
        a4x a4xVar = l7mVar.c;
        fetVar.g0(-1879555625);
        int i2 = i | 6 | (fetVar.g(l7mVar) ? 32 : 16) | 384;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            l8m l8mVar = (l8m) CollectionsKt.firstOrNull(a4xVar);
            if ((l8mVar != null ? l8mVar.f19611a : null) != null) {
                f = k9m.f17920a;
            } else {
                zcl zclVar = qmk.f28987a;
                f = 0.0f;
            }
            zcl zclVar2 = qmk.f28987a;
            float f2 = 116.0f + f + 16.0f;
            mm40Var2 = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.d(mm40Var2, 1.0f), vgg0.a(18.0f));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarL = s5x0.L(s5x0.N(i120.Q(mm40VarJ, StaticColors.INSTANCE.m73getBlack400d7_KjU(), vgg0.a(18.0f)), 8.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 8.0f, 1);
            boolean zD = fetVar.d(f2);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new b2d(f2, (byte) 2);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            vtb.u(o7k0.d(s5x0.N(mm40Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), 1.0f), l7mVar.f19566a, fetVar, 384);
            n(f2, l7mVar, fetVar, i2 & 112);
            K(s5x0.N(mm40Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), l7mVar.b, a4xVar, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var2, l7mVar, i, (byte) 6);
        }
    }

    public static final Bundle y0(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static final void z(mm40 mm40Var, omm ommVar, xk80 xk80Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        omm ommVar2;
        xk80 xk80Var2;
        Function1 function2;
        fet fetVar2;
        ommVar.getClass();
        function1.getClass();
        fetVar.g0(427864891);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ommVar) ? 32 : 16) | (fetVar.g(xk80Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            mm40Var2 = mm40Var;
            ommVar2 = ommVar;
            xk80Var2 = xk80Var;
            function2 = function1;
            fetVar2 = fetVar;
            N(mm40Var2, ommVar2, xk80Var2, function2, fetVar2, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896) | ((i2 << 3) & 57344));
        } else {
            mm40Var2 = mm40Var;
            ommVar2 = ommVar;
            xk80Var2 = xk80Var;
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            Function1 function3 = function2;
            yfe0VarU.d = new eqk((byte) 20, i, (Object) mm40Var2, (Object) ommVar2, (Object) xk80Var2, (Object) function3);
        }
    }
}
