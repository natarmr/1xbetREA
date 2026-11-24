package a;

import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bfb {
    public static final void A(final c4i c4iVar, fet fetVar, final int i) {
        yfe0 yfe0VarU;
        Function2 function2;
        long jM130getWhite600d7_KjU;
        long jM130getWhite600d7_KjU2;
        fetVar.g0(-403007395);
        int i2 = (fetVar.g(c4iVar) ? 4 : 2) | i;
        final byte b = 1;
        final byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            o0x o0xVar = c4iVar.c;
            if (o0xVar == null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2(c4iVar, i, b2) { // from class: a.crh

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f4845a;
                        public final /* synthetic */ c4i b;

                        {
                            this.f4845a = b2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.f4845a;
                            c4i c4iVar2 = this.b;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    bfb.A(c4iVar2, fetVar2, x8x.L(1));
                                    break;
                                default:
                                    bfb.A(c4iVar2, fetVar2, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
                zfn zfnVar = m8m0.f21378a;
                long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m125getWhite100d7_KjU();
                zcl zclVar2 = qmk.e;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarS = i120.S(mm40VarN, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
                mm40 mm40VarN2 = o7k0.n(jm40Var, 20.0f);
                m0x m0xVar = c4iVar.d;
                Integer numValueOf = Integer.valueOf(m0xVar != null ? m0xVar.f20977a : R.drawable.ic_sport_boxing_champs_228);
                y3d y3dVar = c4iVar.f;
                if (y3dVar == null) {
                    fetVar.e0(-1724982326);
                    jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m130getWhite600d7_KjU();
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1724984279);
                    fetVar.r(false);
                    jM130getWhite600d7_KjU = y3dVar.f41946a;
                }
                y3d y3dVar2 = new y3d(jM130getWhite600d7_KjU);
                y3d y3dVar3 = c4iVar.e;
                if (y3dVar3 == null) {
                    fetVar.e0(-1724979606);
                    jM130getWhite600d7_KjU2 = ((StaticColors) fetVar.k(zfnVar)).m130getWhite600d7_KjU();
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1724981218);
                    fetVar.r(false);
                    jM130getWhite600d7_KjU2 = y3dVar3.f41946a;
                }
                uc9.c(mm40VarN2, null, o0xVar, numValueOf, y3dVar2, new y3d(jM130getWhite600d7_KjU2), null, gqw0.B, null, fetVar, 12582912, 322);
                fetVar.r(true);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2(c4iVar, i, b) { // from class: a.crh

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f4845a;
                public final /* synthetic */ c4i b;

                {
                    this.f4845a = b;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f4845a;
                    c4i c4iVar2 = this.b;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            bfb.A(c4iVar2, fetVar2, x8x.L(1));
                            break;
                        default:
                            bfb.A(c4iVar2, fetVar2, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void B(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(2124080038);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 18.0f);
            long j = ijg.b0;
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarQ, 1.0f, ((StaticColors) fetVar2.k(zfnVar)).m113getRed0d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 0.0f, 2);
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
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.c(), fetVar2, (i2 >> 3) & 14, 24576, 114682);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    public static final void C(String str, String str2, fet fetVar, int i) {
        String str3;
        jm40 jm40Var;
        ?? r15;
        fetVar.g0(-692327736);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.M(mm40VarD, 12.0f, 12.0f, 12.0f, 12.0f), "HEADER_BLOCK_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (StringsKt.W(str)) {
                fetVar.e0(444057712);
                fetVar.r(false);
                jm40Var = jm40Var2;
                r15 = 0;
            } else {
                fetVar.e0(443433713);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                jm40Var = jm40Var2;
                r15 = 0;
                aad.e(str, o2e.e0(jm40Var2, "PRIZE_AMOUNT"), y9q0.a(g1t0.p(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 1, 0, null, new n05(qmk.u, qmk.w, qmk.n), fetVar, (i2 & 14) | 1794096, 392);
                fetVar.r(false);
            }
            if (str2 == null || StringsKt.W(str2)) {
                str3 = str2;
                fetVar.e0(445452464);
                fetVar.r(r15);
            } else {
                fetVar.e0(444137816);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    objP = androidx.compose.runtime.e.a(0.0f);
                    fetVar.o0(objP);
                }
                agk0 agk0Var = (agk0) objP;
                Object objP2 = fetVar.P();
                if (objP2 == obj) {
                    objP2 = androidx.compose.runtime.e.b(r15);
                    fetVar.o0(objP2);
                }
                cgk0 cgk0Var = (cgk0) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP3);
                }
                pz40 pz40Var = (pz40) objP3;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarA = y9q0.a(g1t0.v(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678);
                n05 n05Var = new n05(qmk.t, qmk.s, qmk.n);
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new kh0(agk0Var, cgk0Var, pz40Var, (byte) 10);
                    fetVar.o0(objP4);
                }
                mm40 mm40VarE1 = o2e.e0(pai0.a(jm40Var, r15, (Function1) objP4), "HEADER_TOURNAMENT_TITLE");
                Object objP5 = fetVar.P();
                if (objP5 == obj) {
                    objP5 = new kh0(agk0Var, cgk0Var, pz40Var, (byte) 11);
                    fetVar.o0(objP5);
                }
                str3 = str2;
                aad.e(str3, mm40VarE1, y9q0VarA, (Function1) objP5, 2, false, 2, 0, null, n05Var, fetVar, ((i2 >> 3) & 14) | 1600512, Response.UNSUPPORTED_URI_SCHEME);
                fetVar.r(r15);
            }
            fetVar.r(true);
        } else {
            str = str;
            str3 = str2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 4, i, str, str3);
        }
    }

    public static final void D(mm40 mm40Var, py1 py1Var, Function0 function0, fet fetVar, int i) {
        int i2;
        py1 py1Var2;
        Function0 function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(1499294519);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(py1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "TIMER_HEADER_BLOCK");
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 26.0f);
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_quick_bet_inactive, 0, fetVar2), null, o2e.e0(o7k0.n(jm40Var, 16.0f), "TIMER_HEADER_BLOCK_ICON"), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            String str = py1Var.k;
            kdm kdmVar = py1Var.l;
            Date date = kdmVar.b;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            y9q0 y9q0VarA = y9q0.a(g1t0.h(), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678);
            fetVar2 = fetVar;
            aad.e(str, o2e.e0(jm40Var, "TIMER_NAME"), y9q0VarA, null, 2, false, 1, 0, null, null, fetVar2, 1794096, 904);
            boolean zG = fetVar2.g(date);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = Boolean.valueOf(!(date != null && date.getTime() == 0));
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            boolean z2 = kdmVar.c - System.currentTimeMillis() <= 0;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = fetVar2.h(z2) | fetVar2.h(zBooleanValue) | ((i3 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (zH || objP2 == cl5Var) {
                function1 = function0;
                objP2 = new fsl(z2, zBooleanValue, function1, null, (byte) 2);
                fetVar2.o0(objP2);
            } else {
                function1 = function0;
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP2);
            if (zBooleanValue) {
                fetVar2.e0(1038587248);
                py1Var2 = py1Var;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1731340450, new cxj(py1Var2, function1, (byte) 20), fetVar2), fetVar2, 56);
                fetVar2.r(false);
            } else {
                py1Var2 = py1Var;
                fetVar2.e0(1039283973);
                fetVar2.r(r18);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            py1Var2 = py1Var;
            function1 = function0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) py1Var2, (Object) function1, i, (byte) 4);
        }
    }

    public static final void E(mm40 mm40Var, float f, fet fetVar, int i) {
        fetVar.g0(552315629);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | 48;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.f17794a;
            zfn zfnVar = m8m0.f21378a;
            long jM75getBlack600d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m75getBlack600d7_KjU();
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU();
            zq8.a(0, fetVar, i120.P(mm40Var, yk5.h(new Pair[]{new Pair(Float.valueOf(0.0f), new y3d(jM75getBlack600d7_KjU)), new Pair(Float.valueOf(z ? 0.0f : 0.39999998f), new y3d(jM75getBlack600d7_KjU)), new Pair(Float.valueOf(z ? 0.6f : 1.0f), new y3d(jM121getTransparent0d7_KjU)), new Pair(Float.valueOf(1.0f), new y3d(jM121getTransparent0d7_KjU))}, 0.0f, 0.0f, 14), null, 6));
            f = 0.6f;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esl(mm40Var, f, i, (byte) 3);
        }
    }

    public static final void F(mm40 mm40Var, int i, long j, boolean z, Function0 function0, fet fetVar, int i2, int i3) {
        boolean z2;
        int i4;
        mm40 mm40Var2;
        int i5;
        boolean z3;
        mm40 mm40Var3;
        fetVar.g0(671184425);
        long jM123getWhite0d7_KjU = j;
        int i6 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (((i3 & 4) == 0 && fetVar.f(jM123getWhite0d7_KjU)) ? 256 : 128);
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (fetVar.h(z2) ? 2048 : 1024);
        }
        int i8 = i4 | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i8 & 1, (i8 & 9363) != 9362)) {
            fetVar.Z();
            int i9 = i2 & 1;
            jm40 jm40Var = jm40.b;
            if (i9 == 0 || fetVar.B()) {
                if ((i3 & 4) != 0) {
                    jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                    i8 &= -897;
                }
                if (i7 != 0) {
                    i5 = i8;
                    mm40Var3 = jm40Var;
                    z3 = true;
                } else {
                    i5 = i8;
                    z3 = z2;
                    mm40Var3 = jm40Var;
                }
            } else {
                fetVar.X();
                if ((i3 & 4) != 0) {
                    i8 &= -897;
                }
                i5 = i8;
                z3 = z2;
                mm40Var3 = mm40Var;
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(o7k0.n(mm40Var3, 36.0f), null, null, z3, null, function0, 24);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
            mm40 mm40Var4 = mm40Var3;
            int i10 = i5;
            long jM126getWhite200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            long j2 = jM123getWhite0d7_KjU;
            mm40 mm40VarQ = i120.Q(mm40VarN, jM126getWhite200d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            dww.c(a8k0.F(i, (i10 >> 3) & 14, fetVar), null, o7k0.n(jm40Var, 20.0f), j2, fetVar, 56 | ((i10 << 3) & 7168), 0);
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = mm40Var4;
            z2 = z3;
            jM123getWhite0d7_KjU = j2;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwm(mm40Var2, i, jM123getWhite0d7_KjU, z2, function0, i2, i3);
        }
    }

    public static void G(nr nrVar, bh9 bh9Var, k3e k3eVar, f7m0 f7m0Var, String str) throws ch9 {
        str.getClass();
        switch (str) {
            case "centerVertically":
                String strB = bh9Var.B(str);
                k3e k3eVarC = strB.equals("parent") ? f7m0Var.c(0) : f7m0Var.c(strB);
                k3eVar.p(k3eVarC);
                k3eVar.e(k3eVarC);
                return;
            case "center":
                String strB2 = bh9Var.B(str);
                k3e k3eVarC2 = strB2.equals("parent") ? f7m0Var.c(0) : f7m0Var.c(strB2);
                k3eVar.o(k3eVarC2);
                k3eVar.i(k3eVarC2);
                k3eVar.p(k3eVarC2);
                k3eVar.e(k3eVarC2);
                return;
            case "custom":
                xg9 xg9VarZ = bh9Var.z(str);
                bh9 bh9Var2 = xg9VarZ instanceof bh9 ? (bh9) xg9VarZ : null;
                if (bh9Var2 == null) {
                    return;
                }
                for (String str2 : bh9Var2.E()) {
                    xg9 xg9VarO = bh9Var2.o(str2);
                    if (xg9VarO instanceof zg9) {
                        k3eVar.i0.put(str2, Float.valueOf(xg9VarO.e()));
                    } else if (xg9VarO instanceof eh9) {
                        long jF0 = f0(xg9VarO.c());
                        if (jF0 != -1) {
                            k3eVar.h0.put(str2, Integer.valueOf((int) jF0));
                        }
                    }
                }
                return;
            case "rotationX":
                k3eVar.z = nrVar.f(bh9Var.o(str));
                return;
            case "rotationY":
                k3eVar.A = nrVar.f(bh9Var.o(str));
                return;
            case "rotationZ":
                k3eVar.B = nrVar.f(bh9Var.o(str));
                return;
            case "translationX":
                k3eVar.C = f7m0Var.f9065a.g(nrVar.f(bh9Var.o(str)));
                return;
            case "translationY":
                k3eVar.D = f7m0Var.f9065a.g(nrVar.f(bh9Var.o(str)));
                return;
            case "translationZ":
                k3eVar.E = f7m0Var.f9065a.g(nrVar.f(bh9Var.o(str)));
                return;
            case "height":
                k3eVar.e0 = h0(bh9Var, str, f7m0Var, f7m0Var.f9065a);
                return;
            case "motion":
                xg9 xg9VarO2 = bh9Var.o(str);
                if (xg9VarO2 instanceof bh9) {
                    bh9 bh9Var3 = (bh9) xg9VarO2;
                    i0t0 i0t0Var = new i0t0();
                    for (String str3 : bh9Var3.E()) {
                        str3.getClass();
                        switch (str3) {
                            case "stagger":
                                i0t0Var.a(bh9Var3.t(str3), Response.BUSY_EVERYWHERE);
                                break;
                            case "easing":
                                i0t0Var.c(Response.DECLINE, bh9Var3.B(str3));
                                break;
                            case "quantize":
                                xg9 xg9VarO3 = bh9Var3.o(str3);
                                if (xg9VarO3 instanceof vg9) {
                                    vg9 vg9Var = (vg9) xg9VarO3;
                                    int size = vg9Var.e.size();
                                    if (size > 0) {
                                        i0t0Var.b(610, vg9Var.v(0));
                                        if (size > 1) {
                                            i0t0Var.c(611, vg9Var.A(1));
                                            if (size > 2) {
                                                i0t0Var.a(vg9Var.s(2), 602);
                                            }
                                        }
                                    }
                                    break;
                                } else {
                                    xg9 xg9VarO4 = bh9Var3.o(str3);
                                    if (xg9VarO4 == null) {
                                        StringBuilder sbT = kng0.t("no int found for key <", str3, ">, found [");
                                        sbT.append(xg9VarO4.g());
                                        sbT.append("] : ");
                                        sbT.append(xg9VarO4);
                                        throw new ch9(sbT.toString(), bh9Var3);
                                    }
                                    i0t0Var.b(610, xg9VarO4.f());
                                    break;
                                }
                                break;
                            case "pathArc":
                                String strB3 = bh9Var3.B(str3);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i = 0;
                                while (true) {
                                    if (i >= 6) {
                                        i = -1;
                                    } else if (!strArr[i].equals(strB3)) {
                                        i++;
                                    }
                                }
                                if (i != -1) {
                                    i0t0Var.b(607, i);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + strB3 + Separators.QUOTE);
                                    break;
                                }
                                break;
                            case "relativeTo":
                                i0t0Var.c(605, bh9Var3.B(str3));
                                break;
                        }
                    }
                    k3eVar.j0 = i0t0Var;
                    return;
                }
                return;
            case "pivotX":
                k3eVar.x = nrVar.f(bh9Var.o(str));
                return;
            case "pivotY":
                k3eVar.y = nrVar.f(bh9Var.o(str));
                return;
            case "scaleX":
                k3eVar.G = nrVar.f(bh9Var.o(str));
                return;
            case "scaleY":
                k3eVar.H = nrVar.f(bh9Var.o(str));
                return;
            case "hRtlBias":
                float f = nrVar.f(bh9Var.o(str));
                if (!f7m0Var.b) {
                    f = 1.0f - f;
                }
                k3eVar.h = f;
                return;
            case "vWeight":
                k3eVar.g = nrVar.f(bh9Var.o(str));
                return;
            case "alpha":
                k3eVar.F = nrVar.f(bh9Var.o(str));
                return;
            case "hBias":
                k3eVar.h = nrVar.f(bh9Var.o(str));
                return;
            case "vBias":
                k3eVar.i = nrVar.f(bh9Var.o(str));
                return;
            case "width":
                k3eVar.d0 = h0(bh9Var, str, f7m0Var, f7m0Var.f9065a);
                return;
            case "hWeight":
                k3eVar.f = nrVar.f(bh9Var.o(str));
                return;
            case "centerHorizontally":
                String strB4 = bh9Var.B(str);
                k3e k3eVarC3 = strB4.equals("parent") ? f7m0Var.c(0) : f7m0Var.c(strB4);
                k3eVar.o(k3eVarC3);
                k3eVar.i(k3eVarC3);
                return;
            case "visibility":
                switch (bh9Var.B(str)) {
                    case "invisible":
                        k3eVar.I = (byte) 4;
                        k3eVar.F = 0.0f;
                        return;
                    case "gone":
                        k3eVar.I = (byte) 8;
                        return;
                    case "visible":
                        k3eVar.I = (byte) 0;
                        return;
                    default:
                        return;
                }
            default:
                g0(nrVar, bh9Var, k3eVar, f7m0Var, str);
                return;
        }
    }

    public static final void H(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((pxx) yfu0Var).e.setEnabled(((vkv) cpVar.u()).c);
        ((pxx) yfu0Var).c.setAlpha(((vkv) cpVar.u()).c ? 1.0f : 0.5f);
    }

    public static final void I(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((pxx) yfu0Var).d.setChecked(((vkv) cpVar.u()).e);
        pxx pxxVar = (pxx) yfu0Var;
        DsCellMiddleTitle dsCellMiddleTitle = pxxVar.c;
        Context context = cpVar.w;
        boolean z = ((vkv) cpVar.u()).e;
        int i = R.attr.uikitPrimary;
        dsCellMiddleTitle.setTitleTextColor(m5d.b(z ? R.attr.uikitPrimary : R.attr.uikitTextPrimary, context));
        DsCellLeftIcon dsCellLeftIcon = pxxVar.b;
        if (!((vkv) cpVar.u()).e) {
            i = R.attr.uikitSecondary;
        }
        dsCellLeftIcon.setIconTint(m5d.b(i, context));
    }

    public static final String J(ctf0 ctf0Var, boolean z) {
        return ctf0Var.f(z ? R.string.test_on : R.string.test_off, new Object[0]);
    }

    public static final imm K(ctf0 ctf0Var) {
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.balance_management_title, Arrays.copyOf(new Object[0], 0)), ha50.THREE_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
    }

    public static final int L(wsy wsyVar) {
        wsyVar.getClass();
        t83 t83VarO0 = wsyVar.getAnnotations().O0(i4m0.q);
        if (t83VarO0 == null) {
            return 0;
        }
        r2e r2eVar = (r2e) xp20.d(t83VarO0.c(), j4m0.e);
        r2eVar.getClass();
        return ((Number) ((vkx) r2eVar).f29728a).intValue();
    }

    public static final i4 M(i9p i9pVar, ctf0 ctf0Var, mdm mdmVar) {
        gun gunVar = new gun(mdmVar);
        h4t h4tVar = new h4t(ctf0Var.b.a(R.string.recommend, Arrays.copyOf(new Object[0], 0)));
        List<pbv> list = i9pVar.g;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (pbv pbvVar : list) {
            List list2 = i9pVar.i;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((pbv) it.next()).f26728a));
            }
            arrayList.add(ulb.i0(pbvVar, ctf0Var, CollectionsKt.P0(arrayList2), i9pVar.d));
        }
        return dyb.g0(gunVar, h4tVar, new uee0(new ftr(dyb.r0(arrayList))));
    }

    public static final kzj0 N(ary aryVar, g93 g93Var, wsy wsyVar, List list, ArrayList arrayList, wsy wsyVar2, boolean z) {
        wm40 wm40VarK;
        g93 i93Var = ujn.c;
        aryVar.getClass();
        list.getClass();
        wsyVar2.getClass();
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (wsyVar != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wsy wsyVar3 = (wsy) it.next();
            wsyVar3.getClass();
            arrayList3.add(new q4m0(wsyVar3));
        }
        arrayList2.addAll(arrayList3);
        q4m0 q4m0Var = wsyVar != null ? new q4m0(wsyVar) : null;
        if (q4m0Var != null) {
            arrayList2.add(q4m0Var);
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            wsy wsyVar4 = (wsy) obj;
            wsyVar4.getClass();
            arrayList2.add(new q4m0(wsyVar4));
            i = i2;
        }
        arrayList2.add(new q4m0(wsyVar2));
        int size = list.size() + arrayList.size() + (wsyVar == null ? 0 : 1);
        if (z) {
            wm40VarK = aryVar.w(size);
        } else {
            g950 g950Var = j4m0.f15892a;
            wm40VarK = aryVar.k("Function" + size);
        }
        if (wsyVar != null) {
            swq swqVar = i4m0.p;
            if (!g93Var.z0(swqVar)) {
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                ArrayList arrayListP0 = CollectionsKt.p0(g93Var, new tc9(aryVar, swqVar, lunVar));
                g93Var = arrayListP0.isEmpty() ? i93Var : new i93(arrayListP0, (byte) 0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            swq swqVar2 = i4m0.q;
            if (!g93Var.z0(swqVar2)) {
                ArrayList arrayListP1 = CollectionsKt.p0(g93Var, new tc9(aryVar, swqVar2, wp20.b(new Pair(j4m0.e, new vkx(size2)))));
                if (!arrayListP1.isEmpty()) {
                    i93Var = new i93(arrayListP1, (byte) 0);
                }
                g93Var = i93Var;
            }
        }
        return ucx.f0(gnm0.u(g93Var), wm40VarK, arrayList2);
    }

    public static final g950 O(wsy wsyVar) {
        String str;
        wsyVar.getClass();
        t83 t83VarO0 = wsyVar.getAnnotations().O0(i4m0.r);
        if (t83VarO0 != null) {
            Object objW0 = CollectionsKt.w0(t83VarO0.c().values());
            htm0 htm0Var = objW0 instanceof htm0 ? (htm0) objW0 : null;
            if (htm0Var != null && (str = (String) htm0Var.f29728a) != null) {
                if (!g950.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return g950.e(str);
                }
            }
        }
        return null;
    }

    public static final gbn P(Function1 function1) {
        return new gbn(new sfc((byte) 15), new tad(3, (byte) 0), new trb(function1, (byte) 16), qja.k);
    }

    public static final List Q(wsy wsyVar) {
        wsyVar.getClass();
        X(wsyVar);
        int iL = L(wsyVar);
        if (iL == 0) {
            return iun.f15405a;
        }
        List listSubList = wsyVar.J().subList(0, iL);
        ArrayList arrayList = new ArrayList(r3d.q(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((pzs0) it.next()).b());
        }
        return arrayList;
    }

    public static final String R(long j, ctf0 ctf0Var) {
        ctf0Var.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        return rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 48);
    }

    public static final wer S(twq twqVar) {
        if (!twqVar.d() || twqVar.c()) {
            return null;
        }
        yer yerVar = yer.c;
        swq swqVarB = twqVar.i().b();
        String strB = twqVar.g().b();
        strB.getClass();
        yerVar.getClass();
        xer xerVarA = yerVar.a(swqVarB, strB);
        if (xerVarA != null) {
            return xerVarA.f40756a;
        }
        return null;
    }

    public static final int T(long j) {
        if (j == 232) {
            return R.drawable.cybergame_synthetic_golf_first_bg;
        }
        if (j == 245) {
            return R.drawable.cybergame_synthetic_collisions_first_bg;
        }
        if (j == 246) {
            return R.drawable.cybergame_synthetic_slides_first_bg;
        }
        if (j == 248) {
            return R.drawable.cybergame_synthetic_waves_first_bg;
        }
        if (j == 244) {
            return R.drawable.cybergame_synthetic_billiards_first_bg;
        }
        return -1;
    }

    public static final int U(long j) {
        if (j == 232) {
            return R.drawable.cybergame_synthetic_golf_second_bg;
        }
        if (j == 245) {
            return R.drawable.cybergame_synthetic_collisions_second_bg;
        }
        if (j == 246) {
            return R.drawable.cybergame_synthetic_slides_second_bg;
        }
        if (j == 248) {
            return R.drawable.cybergame_synthetic_waves_second_bg;
        }
        if (j == 244) {
            return R.drawable.cybergame_synthetic_billiards_second_bg;
        }
        return -1;
    }

    public static final wsy V(wsy wsyVar) {
        wsyVar.getClass();
        X(wsyVar);
        if (wsyVar.getAnnotations().O0(i4m0.p) == null) {
            return null;
        }
        return ((pzs0) wsyVar.J().get(L(wsyVar))).b();
    }

    public static final List W(wsy wsyVar) {
        wsyVar.getClass();
        X(wsyVar);
        List listJ = wsyVar.J();
        return listJ.subList(((!X(wsyVar) || wsyVar.getAnnotations().O0(i4m0.p) == null) ? 0 : 1) + L(wsyVar), listJ.size() - 1);
    }

    public static final boolean X(wsy wsyVar) {
        wer werVarS;
        wsyVar.getClass();
        foc focVarN = wsyVar.S().n();
        if (focVarN == null) {
            return false;
        }
        if ((focVarN instanceof wm40) && ary.K(focVarN)) {
            int i = rek.f30339a;
            twq twqVarF = oek.f(focVarN);
            twqVarF.getClass();
            werVarS = S(twqVarF);
        } else {
            werVarS = null;
        }
        return Intrinsics.d(werVarS, ser.d) || Intrinsics.d(werVarS, ver.d);
    }

    public static final boolean Y(wsy wsyVar) {
        wsyVar.getClass();
        foc focVarN = wsyVar.S().n();
        wer werVarS = null;
        if (focVarN != null && (focVarN instanceof wm40) && ary.K(focVarN)) {
            int i = rek.f30339a;
            twq twqVarF = oek.f(focVarN);
            twqVarF.getClass();
            werVarS = S(twqVarF);
        }
        return Intrinsics.d(werVarS, ver.d);
    }

    public static final String Z(huo0 huo0Var) {
        huo0Var.getClass();
        if (huo0Var instanceof wdt) {
            pn40 pn40Var = pn40.f27267a;
            return pn40.i(((wdt) huo0Var).f38989a.e, 2);
        }
        if (huo0Var instanceof ydt) {
            pn40 pn40Var2 = pn40.f27267a;
            return pn40.i(((ydt) huo0Var).f42456a.e, 0);
        }
        if (huo0Var instanceof xdt) {
            pn40 pn40Var3 = pn40.f27267a;
            return pn40.i(((xdt) huo0Var).f40712a.e, 2);
        }
        if (!(huo0Var instanceof zdt)) {
            return "";
        }
        pn40 pn40Var4 = pn40.f27267a;
        return pn40.i(((zdt) huo0Var).f44224a.e, 0);
    }

    public static final void a(py1 py1Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(537784144);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(py1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            String str = py1Var.f;
            String str2 = py1Var.j;
            C(str, py1Var.g, fetVar, 0);
            if (str2.length() > 0) {
                fetVar.e0(769303642);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                acb.q(0, fetVar, o2e.e0(s5x0.N(mm40VarD, 12.0f, 0.0f, 12.0f, 0.0f, 10), "DATE_TIME_LABEL"), str2);
                fetVar.r(false);
            } else {
                fetVar.e0(769582332);
                fetVar.r(false);
            }
            o050.b(py1Var.q, function0, function1, fetVar, i2 & 1008);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hsl(py1Var, function0, function1, i, (byte) 1);
        }
    }

    public static final String a0(huo0 huo0Var) {
        huo0Var.getClass();
        if (huo0Var instanceof wdt) {
            return ((wdt) huo0Var).f38989a.b;
        }
        return huo0Var instanceof xdt ? ((xdt) huo0Var).f40712a.b : "";
    }

    public static final void b(py1 py1Var, Function0 function0, fet fetVar, int i) {
        int i2;
        py1 py1Var2;
        Function0 function1;
        fetVar.g0(-417362224);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(py1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            boolean z = fetVar.k(bmd.n) == k6z.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.e(o7k0.d(jm40Var, 1.0f), 136.0f), ugg0Var2);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarJ2 = lgb.J(jr8Var.a(jm40Var), ugg0Var2);
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new z((byte) 18, z);
                fetVar.o0(objP);
            }
            k7x.b(py1Var.c, null, o2e.e0(i4w0.T(mm40VarJ2, (Function1) objP), "TOURNAMENT_IMAGE"), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar), null, null, null, null, gqw0.A, null, fetVar, 299056, 6, 31680);
            E(lgb.J(jr8Var.a(jm40Var), ugg0Var2), 0.0f, fetVar, 0);
            py1Var2 = py1Var;
            function1 = function0;
            D(s5x0.N(jr8Var.b(jm40Var, zx7Var), 12.0f, 12.0f, 12.0f, 0.0f, 8), py1Var2, function1, fetVar, (i3 << 3) & 1008);
            mm40 mm40VarN = s5x0.N(jr8Var.b(jm40Var, gqw0.g), 12.0f, 0.0f, 12.0f, 16.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
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
            dtb.q(null, py1Var2.r, fetVar, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            py1Var2 = py1Var;
            function1 = function0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) py1Var2, (Object) function1, i, (byte) 4);
        }
    }

    public static final String b0(huo0 huo0Var) {
        huo0Var.getClass();
        if (huo0Var instanceof wdt) {
            pn40 pn40Var = pn40.f27267a;
            return pn40.i(((wdt) huo0Var).f38989a.d, 2);
        }
        if (huo0Var instanceof ydt) {
            pn40 pn40Var2 = pn40.f27267a;
            return pn40.i(((ydt) huo0Var).f42456a.d, 0);
        }
        if (huo0Var instanceof xdt) {
            pn40 pn40Var3 = pn40.f27267a;
            return pn40.i(((xdt) huo0Var).f40712a.d, 2);
        }
        if (!(huo0Var instanceof zdt)) {
            return "";
        }
        pn40 pn40Var4 = pn40.f27267a;
        return pn40.i(((zdt) huo0Var).f44224a.d, 0);
    }

    public static final void c(py1 py1Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1620557580);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(py1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            zcl zclVar2 = qmk.i;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar2, zclVar2, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            a(py1Var, function0, function1, fetVar, i2 & 1022);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hsl(py1Var, function0, function1, i, (byte) 0);
        }
    }

    public static final void c0(thy thyVar) {
        njq.q.getClass();
        c0o c0oVar = yq30.c;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            arrayList.add(((yq30) y2Var.next()).f43057a);
        }
    }

    public static final void d(v3i v3iVar, String str, Function1 function1, fet fetVar, int i) {
        long jM123getWhite0d7_KjU;
        f2i f2iVar = v3iVar.f36733a;
        fetVar.g0(291871045);
        int i2 = i | (fetVar.g(v3iVar) ? 4 : 2) | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            d2i d2iVar = f2iVar instanceof d2i ? (d2i) f2iVar : null;
            boolean z = fetVar.k(bmd.n) == k6z.b;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 36.0f);
            tj30 tj30VarC = zq8.c(z ? gqw0.f11754a : gqw0.c, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = f2iVar instanceof e2i ? R.drawable.ic_glyph_video_zone : R.drawable.ic_glyph_broadcast;
            if (d2iVar != null) {
                fetVar.e0(1268723782);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
            } else {
                fetVar.e0(1268724964);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            }
            fetVar.r(false);
            long j = jM123getWhite0d7_KjU;
            boolean z2 = d2iVar == null;
            boolean z3 = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new drh(function1, v3iVar, (byte) 0);
                fetVar.o0(objP);
            }
            F(null, i3, j, z2, (Function0) objP, fetVar, 0, 1);
            if (d2iVar == null || str.length() <= 0) {
                fetVar.e0(676132131);
                fetVar.r(false);
            } else {
                fetVar.e0(675930321);
                B(i2 & 112, fetVar, ffb0.R(jm40Var, z ? -6.0f : 6.0f, 0.0f, 2), str);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(v3iVar, str, function1, i, (byte) 4);
        }
    }

    public static final pmi d0(thy thyVar) {
        ljq ljqVar = njq.e;
        ljqVar.getClass();
        c0o c0oVar = fm40.g;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            arrayList.add(((fm40) y2Var.next()).f9767a);
        }
        return new pmi(thyVar, ljqVar, c0oVar, arrayList);
    }

    public static final void e(mm40 mm40Var, slp slpVar, hh80 hh80Var, j700 j700Var, zcz zczVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        xcz xczVar;
        Object yxaVar;
        zczVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1440023553);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(slpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(hh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(zczVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            xcz xczVarA = zczVar.a("CHAMP_LAZY_LIST_STATE" + j700Var, fetVar);
            wom womVarF = mom.f(fetVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Boolean boolValueOf = Boolean.valueOf(slpVar.f);
            boolean zG = ((i3 & 112) == 32) | fetVar.g(xczVarA) | fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                xczVar = xczVarA;
                yxaVar = new yxa((Object) slpVar, (Object) xczVar, (Object) pz40VarF, (yje) null, (byte) 6);
                fetVar.o0(yxaVar);
            } else {
                xczVar = xczVarA;
                yxaVar = objP;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) yxaVar);
            boolean z = slpVar.d;
            boolean z2 = (458752 & i3) == 131072;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new n19(function1, (byte) 28);
                fetVar.o0(objP2);
            }
            mom.c(mm40Var, z, womVarF, null, false, null, (Function0) objP2, null, u1c.M(17257878, new qb(xczVar, (Object) hh80Var, function2, (byte) 5), fetVar), fetVar, (i3 & 14) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) slpVar, (Object) hh80Var, (Object) j700Var, (Object) zczVar, (Object) function1, (Object) function2, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    public static void e0(int i, f7m0 f7m0Var, nr nrVar, vg9 vg9Var) throws ch9 {
        String strC;
        mbb mbbVar = i == 0 ? (zkw) f7m0Var.f(1) : (hcu0) f7m0Var.f(2);
        xg9 xg9VarM = vg9Var.m(1);
        if (xg9VarM instanceof vg9) {
            vg9 vg9Var2 = (vg9) xg9VarM;
            if (vg9Var2.e.size() < 1) {
                return;
            }
            for (int i2 = 0; i2 < vg9Var2.e.size(); i2++) {
                mbbVar.q(vg9Var2.A(i2));
            }
            if (vg9Var.e.size() > 2) {
                xg9 xg9VarM2 = vg9Var.m(2);
                if (xg9VarM2 instanceof bh9) {
                    bh9 bh9Var = (bh9) xg9VarM2;
                    for (String str : bh9Var.E()) {
                        str.getClass();
                        if (str.equals("style")) {
                            xg9 xg9VarO = bh9Var.o(str);
                            if (xg9VarO instanceof vg9) {
                                vg9 vg9Var3 = (vg9) xg9VarO;
                                if (vg9Var3.e.size() > 1) {
                                    strC = vg9Var3.A(0);
                                    mbbVar.o0 = vg9Var3.s(1);
                                } else {
                                    strC = xg9VarO.c();
                                }
                            } else {
                                strC = xg9VarO.c();
                            }
                            if (strC.equals("packed")) {
                                mbbVar.u0 = d7m0.c;
                            } else if (strC.equals("spread_inside")) {
                                mbbVar.u0 = d7m0.b;
                            } else {
                                mbbVar.u0 = d7m0.f5600a;
                            }
                        } else {
                            g0(nrVar, bh9Var, mbbVar, f7m0Var, str);
                        }
                    }
                }
            }
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-484259200);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            long jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarN, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 21);
        }
    }

    public static long f0(String str) {
        if (!str.startsWith(Separators.POUND)) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF".concat(strSubstring);
        }
        return Long.parseLong(strSubstring, 16);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:103:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:109:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:111:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:112:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:120:0x0414  */
    /* JADX WARN: Code duplicated, block: B:86:0x0349  */
    /* JADX WARN: Code duplicated, block: B:89:0x0363  */
    /* JADX WARN: Code duplicated, block: B:91:0x036b  */
    /* JADX WARN: Code duplicated, block: B:93:0x037f  */
    /* JADX WARN: Code duplicated, block: B:96:0x039b  */
    /* JADX WARN: Code duplicated, block: B:99:0x03a0  */
    public static final void g(mm40 mm40Var, zls zlsVar, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2;
        zls zlsVar2;
        pcy pcyVar;
        cl5 cl5Var;
        shd shdVar;
        shd shdVar2;
        fet fetVar2;
        w6k w6kVar;
        mm40 mm40VarK;
        cl5 cl5Var2;
        Object dgVar;
        cl5 cl5Var3;
        char c;
        fet fetVar3;
        pz40 pz40Var;
        cl5 cl5Var4;
        String strW;
        boolean zH;
        Object objP;
        cl5 cl5Var5;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        Object objP2;
        float f;
        fet fetVar4 = fetVar;
        fetVar4.g0(1342052073);
        if ((i & 6) == 0) {
            i2 = (fetVar4.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar4.g(zlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar4.i(function1) ? 256 : 128;
        }
        int i4 = i2;
        if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
            String str = zlsVar.f44596a;
            boolean z4 = zlsVar.b;
            boolean zG = fetVar4.g(str);
            Object objP3 = fetVar4.P();
            cl5 cl5Var6 = ukd.f35823a;
            if (zG || objP3 == cl5Var6) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar4.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            boolean zG2 = fetVar4.g(str);
            Object objP4 = fetVar4.P();
            if (zG2 || objP4 == cl5Var6) {
                objP4 = androidx.compose.runtime.e.e(new ycl(Float.NaN));
                fetVar4.o0(objP4);
            }
            pz40 pz40Var3 = (pz40) objP4;
            boolean zG3 = fetVar4.g(str);
            Object objP5 = fetVar4.P();
            if (zG3 || objP5 == cl5Var6) {
                objP5 = androidx.compose.runtime.e.e(new ycl(Float.NaN));
                fetVar4.o0(objP5);
            }
            pz40 pz40Var4 = (pz40) objP5;
            w6k w6kVar2 = (w6k) fetVar4.k(bmd.h);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar4, 48);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarD);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z5 = fetVar4.S;
            pcy pcyVar2 = e7z.u1;
            if (z5) {
                fetVar4.l(pcyVar2);
            } else {
                fetVar4.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar5);
            jpm0.n(fetVar4);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar6);
            boolean zB = ycl.b(((ycl) pz40Var3.getValue()).f42389a, Float.NaN);
            jm40 jm40Var = jm40.b;
            if (zB) {
                pcyVar = pcyVar2;
                cl5Var = cl5Var6;
                shdVar = shdVar3;
                shdVar2 = shdVar4;
                fetVar2 = fetVar4;
                w6kVar = w6kVar2;
                fetVar2.e0(-540134845);
                fetVar2.r(false);
                mm40VarK = jm40Var;
            } else {
                fetVar4.e0(-540685715);
                if (z4) {
                    shdVar = shdVar3;
                    if (!ycl.b(((ycl) pz40Var4.getValue()).f42389a, Float.NaN)) {
                        f = ((ycl) pz40Var4.getValue()).f42389a;
                    }
                    cl5Var = cl5Var6;
                    pcyVar = pcyVar2;
                    w6kVar = w6kVar2;
                    shdVar2 = shdVar4;
                    fetVar2 = fetVar;
                    mm40VarK = lgb.K(o7k0.e(jm40Var, ((ycl) d43.a(f, ro4.m0(250, 0, ihn.f14788a, 2), "gameMarketInfoContentHeight", fetVar, 384, 8).getValue()).f42389a));
                    fetVar2.r(false);
                } else {
                    shdVar = shdVar3;
                }
                f = ((ycl) pz40Var3.getValue()).f42389a;
                cl5Var = cl5Var6;
                pcyVar = pcyVar2;
                w6kVar = w6kVar2;
                shdVar2 = shdVar4;
                fetVar2 = fetVar;
                mm40VarK = lgb.K(o7k0.e(jm40Var, ((ycl) d43.a(f, ro4.m0(250, 0, ihn.f14788a, 2), "gameMarketInfoContentHeight", fetVar, 384, 8).getValue()).f42389a));
                fetVar2.r(false);
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = s5x0.N(mm40VarD2, 0.0f, 0.0f, 0.0f, 12.0f, 7).e(mm40VarK);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar6);
            mm40 mm40VarV = o7k0.v(o7k0.d(jm40Var, 1.0f), gqw0.j, true);
            String str2 = zlsVar.f44596a;
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            int i5 = (ycl.b(((ycl) r13.getValue()).f42389a, Float.NaN) && z4 == 0) ? 5 : Integer.MAX_VALUE;
            int i6 = i4 & 112;
            boolean zG4 = fetVar2.g(w6kVar) | fetVar2.g(pz40Var3) | (i6 == 32) | fetVar2.g(pz40Var2) | fetVar2.g(r23);
            Object objP6 = fetVar2.P();
            if (zG4) {
                cl5Var2 = cl5Var;
            } else {
                cl5Var2 = cl5Var;
                if (objP6 != cl5Var2) {
                    dgVar = objP6;
                    cl5Var3 = cl5Var2;
                    fetVar3 = fetVar2;
                    c = ' ';
                    pz40Var = pz40Var2;
                }
                fet fetVar5 = fetVar3;
                cl5Var4 = cl5Var3;
                v8q0.a(str2, mm40VarV, secondary, null, 0L, null, null, null, 0L, null, 0L, 1, false, i5, 0, (Function1) dgVar, y9q0Var, fetVar5, 48, 384, 45048);
                fetVar4 = fetVar5;
                if (((Boolean) pz40Var.getValue()).booleanValue() || z4) {
                    fetVar4.e0(76115645);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(75527513);
                    zq8.a(0, fetVar4, i120.P(o7k0.e(o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), 1.0f), 24.0f), yk5.n(q3d.j(new y3d(((ThemeColors) fetVar4.k(zfnVar)).getBackground0()), new y3d(((ThemeColors) fetVar4.k(zfnVar)).getBackgroundContent())), 0.0f, 0.0f, 14), null, 6));
                    fetVar4.r(false);
                }
                fetVar4.r(true);
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    fetVar4.e0(-538032084);
                    if (z4) {
                        fetVar4.e0(-538015995);
                        strW = rsm0.w(R.string.collapse, 0, fetVar4);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-537948601);
                        strW = rsm0.w(R.string.expand, 0, fetVar4);
                        fetVar4.r(false);
                    }
                    zH = fetVar4.h(z4);
                    objP = fetVar4.P();
                    if (zH) {
                        cl5Var5 = cl5Var4;
                    } else {
                        cl5Var5 = cl5Var4;
                        if (objP == cl5Var5) {
                        }
                        wul wulVar = (wul) objP;
                        mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        if ((i4 & 896) == 256) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i6 == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | z;
                        objP2 = fetVar4.P();
                        if (!z3 || objP2 == cl5Var5) {
                            zlsVar2 = zlsVar;
                            function2 = function1;
                            objP2 = new gmo(function2, zlsVar2, (byte) 25);
                            fetVar4.o0(objP2);
                        } else {
                            zlsVar2 = zlsVar;
                            function2 = function1;
                        }
                        qzb.n(mm40VarN, wulVar, (Function0) objP2, fetVar4, 0, 0);
                        fetVar4.r(false);
                    }
                    nul nulVar = nul.e;
                    oe9 oe9Var = oe9.c;
                    if (z4) {
                        i3 = R.drawable.ic_glyph_chevron_up_small;
                    } else {
                        i3 = R.drawable.ic_glyph_chevron_down_small;
                    }
                    wul wulVar2 = new wul(nulVar, oe9Var, new ve9(strW, i3), true, false, false);
                    fetVar4.o0(wulVar2);
                    objP = wulVar2;
                    wul wulVar3 = (wul) objP;
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    if ((i4 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i6 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | z;
                    objP2 = fetVar4.P();
                    if (z3) {
                        zlsVar2 = zlsVar;
                        function2 = function1;
                        objP2 = new gmo(function2, zlsVar2, (byte) 25);
                        fetVar4.o0(objP2);
                    } else {
                        zlsVar2 = zlsVar;
                        function2 = function1;
                        objP2 = new gmo(function2, zlsVar2, (byte) 25);
                        fetVar4.o0(objP2);
                    }
                    qzb.n(mm40VarN2, wulVar3, (Function0) objP2, fetVar4, 0, 0);
                    fetVar4.r(false);
                } else {
                    zlsVar2 = zlsVar;
                    function2 = function1;
                    fetVar4.e0(-536933661);
                    fetVar4.r(false);
                }
                fetVar4.r(true);
            }
            cl5Var3 = cl5Var2;
            w6k w6kVar3 = w6kVar;
            c = ' ';
            fetVar3 = fetVar2;
            dgVar = new dg(w6kVar3, zlsVar, pz40Var3, pz40Var2, pz40Var4, (byte) 20);
            pz40Var = pz40Var2;
            fetVar3.o0(dgVar);
            fet fetVar6 = fetVar3;
            cl5Var4 = cl5Var3;
            v8q0.a(str2, mm40VarV, secondary, null, 0L, null, null, null, 0L, null, 0L, 1, false, i5, 0, (Function1) dgVar, y9q0Var, fetVar6, 48, 384, 45048);
            fetVar4 = fetVar6;
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar4.e0(76115645);
                fetVar4.r(false);
            } else {
                fetVar4.e0(76115645);
                fetVar4.r(false);
            }
            fetVar4.r(true);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar4.e0(-538032084);
                if (z4) {
                    fetVar4.e0(-538015995);
                    strW = rsm0.w(R.string.collapse, 0, fetVar4);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(-537948601);
                    strW = rsm0.w(R.string.expand, 0, fetVar4);
                    fetVar4.r(false);
                }
                zH = fetVar4.h(z4);
                objP = fetVar4.P();
                if (zH) {
                    cl5Var5 = cl5Var4;
                    if (objP == cl5Var5) {
                    }
                    wul wulVar4 = (wul) objP;
                    mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    if ((i4 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i6 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | z;
                    objP2 = fetVar4.P();
                    if (z3) {
                        zlsVar2 = zlsVar;
                        function2 = function1;
                        objP2 = new gmo(function2, zlsVar2, (byte) 25);
                        fetVar4.o0(objP2);
                    } else {
                        zlsVar2 = zlsVar;
                        function2 = function1;
                        objP2 = new gmo(function2, zlsVar2, (byte) 25);
                        fetVar4.o0(objP2);
                    }
                    qzb.n(mm40VarN3, wulVar4, (Function0) objP2, fetVar4, 0, 0);
                    fetVar4.r(false);
                } else {
                    cl5Var5 = cl5Var4;
                }
                nul nulVar2 = nul.e;
                oe9 oe9Var2 = oe9.c;
                if (z4) {
                    i3 = R.drawable.ic_glyph_chevron_up_small;
                } else {
                    i3 = R.drawable.ic_glyph_chevron_down_small;
                }
                wul wulVar5 = new wul(nulVar2, oe9Var2, new ve9(strW, i3), true, false, false);
                fetVar4.o0(wulVar5);
                objP = wulVar5;
                wul wulVar6 = (wul) objP;
                mm40 mm40VarN4 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                if ((i4 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                if (i6 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z;
                objP2 = fetVar4.P();
                if (z3) {
                    zlsVar2 = zlsVar;
                    function2 = function1;
                    objP2 = new gmo(function2, zlsVar2, (byte) 25);
                    fetVar4.o0(objP2);
                } else {
                    zlsVar2 = zlsVar;
                    function2 = function1;
                    objP2 = new gmo(function2, zlsVar2, (byte) 25);
                    fetVar4.o0(objP2);
                }
                qzb.n(mm40VarN4, wulVar6, (Function0) objP2, fetVar4, 0, 0);
                fetVar4.r(false);
            } else {
                zlsVar2 = zlsVar;
                function2 = function1;
                fetVar4.e0(-536933661);
                fetVar4.r(false);
            }
            fetVar4.r(true);
        } else {
            function2 = function1;
            zlsVar2 = zlsVar;
            fetVar4.X();
        }
        yfe0 yfe0VarU = fetVar4.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) zlsVar2, (Object) function2, i, (byte) 10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:133:0x0213  */
    /* JADX WARN: Code duplicated, block: B:168:0x028b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0146  */
    public static void g0(nr nrVar, bh9 bh9Var, k3e k3eVar, f7m0 f7m0Var, String str) throws ch9 {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = f7m0Var.b;
        vg9 vg9VarR = bh9Var.r(str);
        if (vg9VarR == null || vg9VarR.e.size() <= 1) {
            byte b = 3;
            String strC = bh9Var.C(str);
            if (strC != null) {
                k3e k3eVarC = strC.equals("parent") ? f7m0Var.c(0) : f7m0Var.c(strC);
                str.getClass();
                switch (str.hashCode()) {
                    case -1720785339:
                        if (!str.equals("baseline")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case -1383228885:
                        if (!str.equals("bottom")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 100571:
                        if (!str.equals("end")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 115029:
                        if (!str.equals("top")) {
                            b = -1;
                        }
                        break;
                    case 109757538:
                        if (!str.equals("start")) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        f7m0Var.b(k3eVar.f17612a);
                        f7m0Var.b(k3eVarC.f17612a);
                        k3eVar.k0 = 15;
                        k3eVar.X = k3eVarC;
                        break;
                    case 1:
                        k3eVar.e(k3eVarC);
                        break;
                    case 2:
                        if (!z4) {
                            k3eVar.k0 = 1;
                            k3eVar.J = k3eVarC;
                        } else {
                            k3eVar.k0 = 4;
                            k3eVar.M = k3eVarC;
                        }
                        break;
                    case 3:
                        k3eVar.p(k3eVarC);
                        break;
                    case 4:
                        if (!z4) {
                            k3eVar.k0 = 4;
                            k3eVar.M = k3eVarC;
                        } else {
                            k3eVar.k0 = 1;
                            k3eVar.J = k3eVarC;
                        }
                        break;
                }
            }
            return;
        }
        String strA = vg9VarR.A(0);
        xg9 xg9VarW = vg9VarR.w(1);
        String strC2 = xg9VarW instanceof eh9 ? xg9VarW.c() : null;
        float fG = vg9VarR.e.size() > 2 ? f7m0Var.f9065a.g(nrVar.f(vg9VarR.w(2))) : 0.0f;
        float fG2 = vg9VarR.e.size() > 3 ? f7m0Var.f9065a.g(nrVar.f(vg9VarR.w(3))) : 0.0f;
        k3e k3eVarC2 = strA.equals("parent") ? f7m0Var.c(0) : f7m0Var.c(strA);
        str.getClass();
        switch (str) {
            case "baseline":
                strC2.getClass();
                switch (strC2) {
                    case "baseline":
                        f7m0Var.b(k3eVar.f17612a);
                        f7m0Var.b(k3eVarC2.f17612a);
                        k3eVar.k0 = 15;
                        k3eVar.X = k3eVarC2;
                        break;
                    case "bottom":
                        f7m0Var.b(k3eVar.f17612a);
                        k3eVar.k0 = 17;
                        k3eVar.Z = k3eVarC2;
                        break;
                    case "top":
                        f7m0Var.b(k3eVar.f17612a);
                        k3eVar.k0 = 16;
                        k3eVar.Y = k3eVarC2;
                        break;
                }
                z = false;
                z2 = true;
                break;
            case "circular":
                float f = nrVar.f(vg9VarR.m(1));
                float fG3 = vg9VarR.e.size() > 2 ? f7m0Var.f9065a.g(nrVar.f(vg9VarR.w(2))) : 0.0f;
                k3eVar.a0 = k3eVar.j(k3eVarC2);
                k3eVar.b0 = f;
                k3eVar.c0 = fG3;
                k3eVar.k0 = 20;
                z = false;
                z2 = true;
                break;
            case "bottom":
                strC2.getClass();
                switch (strC2) {
                    case "baseline":
                        f7m0Var.b(k3eVarC2.f17612a);
                        k3eVar.k0 = 14;
                        k3eVar.W = k3eVarC2;
                        break;
                    case "bottom":
                        k3eVar.e(k3eVarC2);
                        break;
                    case "top":
                        k3eVar.k0 = 12;
                        k3eVar.U = k3eVarC2;
                        break;
                }
                z = false;
                z2 = true;
                break;
            case "end":
                z2 = !z4;
                z = true;
                break;
            case "top":
                strC2.getClass();
                switch (strC2) {
                    case "baseline":
                        f7m0Var.b(k3eVarC2.f17612a);
                        k3eVar.k0 = 11;
                        k3eVar.T = k3eVarC2;
                        break;
                    case "bottom":
                        k3eVar.k0 = 10;
                        k3eVar.S = k3eVarC2;
                        break;
                    case "top":
                        k3eVar.p(k3eVarC2);
                        break;
                }
                z = false;
                z2 = true;
                break;
            case "left":
                z = true;
                z2 = true;
                break;
            case "right":
                z = true;
                z2 = false;
                break;
            case "start":
                z2 = z4;
                z = true;
                break;
            default:
                z = false;
                z2 = true;
                break;
        }
        if (z) {
            strC2.getClass();
            switch (strC2) {
                case "end":
                    z3 = !z4;
                    break;
                case "right":
                    z3 = false;
                    break;
                case "start":
                    z3 = z4;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z2) {
                if (z3) {
                    k3eVar.k0 = 1;
                    k3eVar.J = k3eVarC2;
                } else {
                    k3eVar.k0 = 2;
                    k3eVar.K = k3eVarC2;
                }
            } else if (z3) {
                k3eVar.k0 = 3;
                k3eVar.L = k3eVarC2;
            } else {
                k3eVar.k0 = 4;
                k3eVar.M = k3eVarC2;
            }
        }
        k3eVar.l(Float.valueOf(fG)).n(Float.valueOf(fG2));
    }

    public static final void h(mm40 mm40Var, o2r0 o2r0Var, xcz xczVar, Function1 function1, fet fetVar, int i) {
        o2r0Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-380559087);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o2r0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            bvl bvlVar = o2r0Var.f24546a;
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new omf(function1, (byte) 20);
                fetVar.o0(objP);
            }
            ju70.p(mm40Var, bvlVar, xczVar, 0.0f, (Function1) objP, fetVar, i2 & 910, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 21, i, (Object) mm40Var, (Object) o2r0Var, (Object) xczVar, (Object) function1);
        }
    }

    public static tmk h0(bh9 bh9Var, String str, f7m0 f7m0Var, b0l0 b0l0Var) throws ch9 {
        xg9 xg9VarO = bh9Var.o(str);
        tmk tmkVarE = tmk.e(0);
        if (xg9VarO instanceof eh9) {
            return i0(xg9VarO.c());
        }
        if (xg9VarO instanceof zg9) {
            return tmk.e(f7m0Var.d(Float.valueOf(b0l0Var.g(bh9Var.t(str)))));
        }
        if (xg9VarO instanceof bh9) {
            bh9 bh9Var2 = (bh9) xg9VarO;
            String strC = bh9Var2.C("value");
            if (strC != null) {
                tmkVarE = i0(strC);
            }
            xg9 xg9VarZ = bh9Var2.z("min");
            if (xg9VarZ != null) {
                if (xg9VarZ instanceof zg9) {
                    int iD = f7m0Var.d(Float.valueOf(b0l0Var.g(((zg9) xg9VarZ).e())));
                    if (iD >= 0) {
                        tmkVarE.b = iD;
                    }
                } else if (xg9VarZ instanceof eh9) {
                    tmkVarE.b = -2;
                }
            }
            xg9 xg9VarZ2 = bh9Var2.z("max");
            if (xg9VarZ2 != null) {
                if (xg9VarZ2 instanceof zg9) {
                    int iD2 = f7m0Var.d(Float.valueOf(b0l0Var.g(((zg9) xg9VarZ2).e())));
                    if (tmkVarE.c >= 0) {
                        tmkVarE.c = iD2;
                        return tmkVarE;
                    }
                } else if ((xg9VarZ2 instanceof eh9) && tmkVarE.f34197a) {
                    tmkVarE.g = tmk.i;
                    tmkVarE.c = Integer.MAX_VALUE;
                }
            }
        }
        return tmkVarE;
    }

    public static final void i(pwv0 pwv0Var, kkh kkhVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1658854970);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(pwv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kkhVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String name = zei.class.getName();
            Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new lhf(application, kkhVar, (byte) 9);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 3);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP2 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar.o0(objP2);
            }
            Object obj2 = ((kgd) objP2).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.cyber.section.impl.tournament_bracket.di.dialog.CyberTournamentBracketMatchDialogComponent");
                return;
            } else {
                k3t0 k3t0VarY = n4c.Y(sre0.f32672a.b(wjh.class), null, new fiu0(Collections.singletonMap(wjh.class, ((zei) obj2).g)), fetVar, 14);
                pwv0Var.a(u1c.M(2137248765, new sd8(kkhVar, (byte) 21), fetVar));
                pwv0Var.d(u1c.M(-868371267, new rgh(kkhVar, k3t0VarY, b), fetVar));
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(pwv0Var, kkhVar, i, b2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static tmk i0(String str) {
        tmk tmkVarE = tmk.e(0);
        byte b = -1;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    b = 0;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    b = 1;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    b = 2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    b = 3;
                }
                break;
        }
        String str2 = tmk.j;
        switch (b) {
            case 0:
                return tmk.g(tmk.i);
            case 1:
                return new tmk(tmk.k);
            case 2:
                return tmk.g(str2);
            case 3:
                return tmk.h();
            default:
                if (str.endsWith(Separators.PERCENT)) {
                    float f = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    tmk tmkVar = new tmk(tmk.l);
                    tmkVar.e = f;
                    tmkVar.f34197a = true;
                    tmkVar.c = 0;
                    return tmkVar;
                }
                if (!str.contains(Separators.COLON)) {
                    return tmkVarE;
                }
                tmk tmkVar2 = new tmk(tmk.m);
                tmkVar2.d = str;
                tmkVar2.g = str2;
                tmkVar2.f34197a = true;
                return tmkVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v26 */
    public static final void j(mm40 mm40Var, long j, boolean z, zqh zqhVar, Function1 function1, fet fetVar, int i) {
        long j2;
        boolean z2;
        mm40 mm40Var2;
        Object obj;
        jm40 jm40Var;
        ?? r2;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        zqhVar.getClass();
        function1.getClass();
        fetVar.g0(388008152);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            j2 = j;
            i4 |= fetVar.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i4 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i4 |= fetVar.g(zqhVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= fetVar.i(function1) ? 16384 : 8192;
        }
        byte b = 1;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(Long.valueOf(j2), fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z2), fetVar);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = new x96(function1, pz40VarF, pz40VarF2, b);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            i4i i4iVar = zqhVar.f44806a;
            u3i u3iVar = i4iVar.d;
            c4i c4iVar = i4iVar.b;
            u3i u3iVar2 = i4iVar.f;
            u3i u3iVar3 = i4iVar.e;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 36.0f), 8.0f, 0.0f, 4.0f, 0.0f, 10);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            A(c4iVar, fetVar, 0);
            if (i4iVar.f14147a) {
                fetVar.e0(221686027);
                x(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(221719662);
                fetVar.r(false);
            }
            f(0, fetVar, new x7z(1.0f, true), c4iVar.f3727a);
            if (u3iVar instanceof v3i) {
                fetVar.e0(221933221);
                d((v3i) u3iVar, zqhVar.b, function2, fetVar, 384);
                fetVar.r(false);
            } else {
                fetVar.e0(222126382);
                fetVar.r(false);
            }
            if (u3iVar2 instanceof x3i) {
                fetVar.e0(222219382);
                int iOrdinal = ((x3i) u3iVar2).f40219a.ordinal();
                if (iOrdinal != 0) {
                    z3 = true;
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    i3 = R.drawable.ic_glyph_favourite_inactive;
                } else {
                    z3 = true;
                    i3 = R.drawable.ic_glyph_favourite_active;
                }
                int i5 = i3;
                boolean zG = fetVar.g(u3iVar2);
                Object objP2 = fetVar.P();
                if (zG || objP2 == obj2) {
                    z4 = false;
                    objP2 = new arh(function2, u3iVar2, (byte) 0);
                    fetVar.o0(objP2);
                } else {
                    z4 = false;
                }
                Function0 function0 = (Function0) objP2;
                obj = obj2;
                jm40Var = jm40Var2;
                boolean z5 = z4;
                F(null, i5, 0L, false, function0, fetVar, 0, 13);
                fetVar.r(z5);
                r2 = z5;
            } else {
                obj = obj2;
                jm40Var = jm40Var2;
                r2 = 0;
                z3 = true;
                fetVar.e0(222580718);
                fetVar.r(false);
            }
            if (r25 instanceof z3i) {
                fetVar.e0(222682088);
                int iOrdinal2 = r25.f43719a.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = R.drawable.ic_glyph_notification_active;
                } else {
                    if (iOrdinal2 != z3) {
                        t9f.b();
                        return;
                    }
                    i2 = R.drawable.ic_glyph_notification_inactive;
                }
                int i6 = i2;
                boolean zG2 = fetVar.g(r25);
                Object objP3 = fetVar.P();
                if (zG2 || objP3 == obj) {
                    objP3 = new brh(function2, u3iVar3, r2);
                    fetVar.o0(objP3);
                }
                F(null, i6, 0L, false, (Function0) objP3, fetVar, 0, 13);
                fetVar.r(r2);
            } else {
                fetVar.e0(223056878);
                fetVar.r(r2);
            }
            fetVar.r(z3);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u5h(mm40Var2, j, z2, zqhVar, function1, i, (byte) 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    public static void j0(int i, f7m0 f7m0Var, String str, bh9 bh9Var) throws ch9 {
        ArrayList<String> arrayListE = bh9Var.E();
        k3e k3eVarC = f7m0Var.c(str);
        if (i == 0) {
            f7m0Var.e(0, str);
        } else {
            f7m0Var.e(1, str);
        }
        boolean z = f7m0Var.b || i == 0;
        siv sivVar = (siv) k3eVarC.c;
        boolean z2 = false;
        boolean z3 = true;
        float fT = 0.0f;
        for (String str2 : arrayListE) {
            str2.getClass();
            switch (str2) {
                case "percent":
                    vg9 vg9VarR = bh9Var.r(str2);
                    if (vg9VarR == null) {
                        fT = bh9Var.t(str2);
                        z2 = true;
                        z3 = true;
                        break;
                    } else {
                        if (vg9VarR.e.size() > 1) {
                            String strA = vg9VarR.A(0);
                            float fS = vg9VarR.s(1);
                            switch (strA) {
                                case "end":
                                    z3 = !z;
                                    break;
                                case "left":
                                    z3 = true;
                                    fT = fS;
                                    z2 = true;
                                    continue;
                                    break;
                                case "right":
                                    z3 = false;
                                    break;
                                case "start":
                                    z3 = z;
                                    break;
                            }
                            fT = fS;
                        }
                        z2 = true;
                        break;
                    }
                    break;
                case "end":
                    fT = f7m0Var.f9065a.g(bh9Var.t(str2));
                    z3 = !z;
                    break;
                case "left":
                    fT = f7m0Var.f9065a.g(bh9Var.t(str2));
                    z3 = true;
                    break;
                case "right":
                    fT = f7m0Var.f9065a.g(bh9Var.t(str2));
                    z3 = false;
                    break;
                case "start":
                    fT = f7m0Var.f9065a.g(bh9Var.t(str2));
                    z3 = z;
                    break;
            }
        }
        if (z2) {
            if (z3) {
                sivVar.d = -1;
                sivVar.e = -1;
                sivVar.f = fT;
                return;
            } else {
                sivVar.d = -1;
                sivVar.e = -1;
                sivVar.f = 1.0f - fT;
                return;
            }
        }
        if (z3) {
            sivVar.d = sivVar.f32280a.d(Float.valueOf(fT));
            sivVar.e = -1;
            sivVar.f = 0.0f;
        } else {
            Float fValueOf = Float.valueOf(fT);
            sivVar.d = -1;
            sivVar.e = sivVar.f32280a.d(fValueOf);
            sivVar.f = 0.0f;
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var, List list, Function1 function1) {
        list.getClass();
        function1.getClass();
        fetVar.g0(1776685906);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(list) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.g(s5x0.N(mm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 0.0f, 10240.0f, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f));
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rb(list, function1, (byte) 7);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarQ, null, null, null, null, null, false, null, (Function1) objP, fetVar, 12582912, 382);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tp4(mm40Var, list, function1, i);
        }
    }

    public static void k0(f7m0 f7m0Var, nr nrVar, String str, bh9 bh9Var) throws ch9 {
        k3e k3eVarC = f7m0Var.c(str);
        tmk tmkVar = k3eVarC.d0;
        Iterator it = bh9Var.E().iterator();
        while (it.hasNext()) {
            G(nrVar, bh9Var, k3eVarC, f7m0Var, (String) it.next());
        }
    }

    public static final void l(mm40 mm40Var, c1l c1lVar, fet fetVar, int i) {
        c1lVar.getClass();
        fetVar.g0(-531685965);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(c1lVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, i120.Q(mm40Var, c1lVar.f3577a, vgg0.f37379a));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var, c1lVar, i, (byte) 13);
        }
    }

    public static final boolean l0(long j) {
        uen uenVar = wen.b;
        long jL = j - wen.l(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), bfn.SECONDS);
        return 1 <= jL && jL < 21600;
    }

    public static final void m(mm40 mm40Var, cc0 cc0Var, akl aklVar, Function1 function1, fet fetVar, int i) {
        cc0Var.getClass();
        fetVar.g0(-739990339);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(cc0Var.ordinal()) ? 32 : 16) | (fetVar.g(aklVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            int iOrdinal = cc0Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1015242510);
                q8a.g(o2e.e0(mm40Var, "DS_BANNER_LINE_STYLE"), aklVar, function1, fetVar, (i2 >> 3) & 1008);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1015518131);
                jeb.k(o2e.e0(mm40Var, "DS_BANNER_BACKGROUND_COMPACT_STYLE"), aklVar, function1, fetVar, (i2 >> 3) & 1008);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(1015816537);
                uc9.l(o2e.e0(mm40Var, "DS_BANNER_BACKGROUND_LINE_STYLE"), aklVar, function1, fetVar, (i2 >> 3) & 1008);
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(1016105023);
                ny9.j(o2e.e0(mm40Var, "DS_BANNER_CARD_COMPACT_STYLE"), aklVar, function1, fetVar, (i2 >> 3) & 1008);
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(1833864290, fetVar, false);
                }
                fetVar.e0(1016385573);
                p8a.o(o2e.e0(mm40Var, "DS_BANNER_CARD_LINE_STYLE"), aklVar, function1, fetVar, (i2 >> 3) & 1008);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 2, i, (Object) mm40Var, (Object) cc0Var, (Object) aklVar, (Object) function1);
        }
    }

    public static final void m0(thy thyVar, mjq mjqVar) {
        mjqVar.getClass();
        c0o c0oVar = oag0.b;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            arrayList.add(new ijq(mjqVar, ((oag0) y2Var.next()).ordinal()));
        }
    }

    public static final void n(mm40 mm40Var, py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        py1Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(375664508);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(py1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            int i3 = i2 >> 3;
            b(py1Var, function2, fetVar, ((i2 >> 9) & 112) | (i3 & 14));
            c(py1Var, function0, function1, fetVar, i3 & 1022);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bsl(mm40Var, py1Var, function0, function1, function2, i, (byte) 4);
        }
    }

    public static final z5w n0(e4f e4fVar) {
        e4fVar.getClass();
        switch (e4fVar.ordinal()) {
            case 0:
                return z5w.b;
            case 1:
                return z5w.c;
            case 2:
                return z5w.d;
            case 3:
                return z5w.e;
            case 4:
                return z5w.f;
            case 5:
                return z5w.g;
            case 6:
                return z5w.h;
            case 7:
                return z5w.i;
            case 8:
                return z5w.j;
            case 9:
                return z5w.k;
            case 10:
                return z5w.l;
            case 11:
                return z5w.v;
            default:
                t9f.b();
                return null;
        }
    }

    public static final void o(t4m t4mVar, fet fetVar, int i) {
        int i2;
        s4m s4mVar = t4mVar.b;
        fetVar.g0(-654238996);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(t4mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
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
            s4m s4mVar2 = t4mVar.c;
            vdb.w(null, s4mVar.f31614a, null, fetVar, 0, 5);
            vdb.w(null, s4mVar.b, null, fetVar, 0, 5);
            qxw.o(fetVar, new x7z(1.0f, true));
            vdb.w(null, s4mVar2.b, null, fetVar, 0, 5);
            vdb.w(null, s4mVar2.f31614a, null, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(t4mVar, i, (byte) 12);
        }
    }

    public static final srf o0(pqf pqfVar) {
        pqfVar.getClass();
        boolean z = pqfVar.i;
        return new srf(egm0.f(pqfVar.f27413a, z), egm0.e(pqfVar.g, z), egm0.f(String.valueOf(pqfVar.b), z), egm0.f(String.valueOf(pqfVar.c), z), egm0.f(String.valueOf(pqfVar.d), z), egm0.f(String.valueOf(pqfVar.e), z), egm0.f(String.valueOf(pqfVar.f), z), ckb.c0(pqfVar));
    }

    public static final void p(mm40 mm40Var, t4m t4mVar, rah0 rah0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        rah0Var.getClass();
        fetVar.g0(939737036);
        int i2 = i | 6 | (fetVar.g(t4mVar) ? 32 : 16) | (fetVar.g(rah0Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(16.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, jM73getBlack400d7_KjU, ugg0VarA), 8.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            o(t4mVar, fetVar, (i2 >> 3) & 14);
            q4m.b(null, t4mVar, rah0Var, fetVar, i2 & 1008);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var2, t4mVar, rah0Var, i, (byte) 27);
        }
    }

    public static final ArrayList p0(geu0 geu0Var, boolean z) {
        ArrayList arrayListN0 = CollectionsKt.N0(StringsKt__StringsKt.split$default(kotlin.text.c.r(kotlin.text.c.r(z ? geu0Var.c : geu0Var.d, "[", "", false), "]", "", false), new String[]{Separators.COMMA}, false, 0, 6, null));
        if (arrayListN0.size() < 3) {
            int size = 3 - arrayListN0.size();
            for (int i = 0; i < size; i++) {
                arrayListN0.add("");
            }
        }
        return arrayListN0;
    }

    public static final void q(mm40 mm40Var, ghm ghmVar, Function1 function1, fet fetVar) {
        ghmVar.getClass();
        if (ghmVar instanceof dhm) {
            fetVar.e0(685060540);
            gkb.p(mm40Var, (dhm) ghmVar, function1, fetVar, 0);
            fetVar.r(false);
        } else if (ghmVar instanceof ehm) {
            fetVar.e0(685066278);
            kkb.t(0, fetVar, mm40Var, ((ehm) ghmVar).f7814a);
            fetVar.r(false);
        } else {
            if (!(ghmVar instanceof fhm)) {
                throw b1j.f(685058757, fetVar, false);
            }
            fetVar.e0(685071368);
            hkb.q(0, fetVar, mm40Var);
            fetVar.r(false);
        }
    }

    public static final String q0(eeu0 eeu0Var, ctf0 ctf0Var) {
        int iOrdinal = eeu0Var.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.f(R.string.empty_str, new Object[0]);
        }
        if (iOrdinal == 1) {
            return ctf0Var.f(R.string.sum_sum_victory_formula, new Object[0]);
        }
        if (iOrdinal == 2) {
            return ctf0Var.f(R.string.sum_mult_victory_formula, new Object[0]);
        }
        if (iOrdinal == 3) {
            return ctf0Var.f(R.string.mult_sum_victory_formula, new Object[0]);
        }
        if (iOrdinal == 4) {
            return ctf0Var.f(R.string.mult_mult_victory_formula, new Object[0]);
        }
        t9f.b();
        return null;
    }

    public static final void r(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        a4xVar.getClass();
        fetVar.g0(1133407612);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            y(i2 & 126, fetVar, a4xVar, mm40Var);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 5);
        }
    }

    public static final geu0 r0(d0t d0tVar) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        rqs rqsVar = d0tVar.p;
        List list = rqsVar.n;
        Iterator it = rqsVar.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmr.x);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        if (str == null) {
            str = "";
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((cmr) next2).f4620a != dmr.y);
        cmr cmrVar2 = (cmr) next2;
        String str2 = cmrVar2 != null ? cmrVar2.b : null;
        if (str2 == null) {
            str2 = "";
        }
        Iterator it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (((cmr) next3).f4620a != dmr.r);
        cmr cmrVar3 = (cmr) next3;
        String str3 = cmrVar3 != null ? cmrVar3.b : null;
        if (str3 == null) {
            str3 = "";
        }
        Iterator it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (((cmr) next4).f4620a != dmr.s);
        cmr cmrVar4 = (cmr) next4;
        String str4 = cmrVar4 != null ? cmrVar4.b : null;
        String str5 = str4 != null ? str4 : "";
        wcy wcyVarC = vdx.f37253a;
        byte b = 15;
        if (wcyVarC == null) {
            wcyVarC = qxw.c(new f8l0(b));
            vdx.f37253a = wcyVarC;
        }
        deu0 deu0Var = eeu0.Companion;
        eeu0 eeu0Var = (eeu0) wcyVarC.b(mrv.j0(deu0Var.serializer()), str);
        if (eeu0Var == null) {
            eeu0Var = eeu0.b;
        }
        wcy wcyVarC2 = vdx.f37253a;
        if (wcyVarC2 == null) {
            wcyVarC2 = qxw.c(new f8l0(b));
            vdx.f37253a = wcyVarC2;
        }
        eeu0 eeu0Var2 = (eeu0) wcyVarC2.b(mrv.j0(deu0Var.serializer()), str2);
        if (eeu0Var2 == null) {
            eeu0Var2 = eeu0.b;
        }
        return new geu0(eeu0Var, eeu0Var2, str3, str5);
    }

    public static final void s(mm40 mm40Var, fym fymVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(799097613);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(fymVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), 80.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarG);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -1567496867, false);
            String str = fymVar.f10364a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 5, 0, null, g1t0.d(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 18, i, mm40Var, fymVar);
        }
    }

    public static final pmi s0(thy thyVar) {
        ljq ljqVar = njq.d;
        ljqVar.getClass();
        c0o c0oVar = nuu0.g;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            arrayList.add(((nuu0) y2Var.next()).f24162a);
        }
        return new pmi(thyVar, ljqVar, c0oVar, arrayList);
    }

    public static final void t(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1129079352);
        int i2 = i | 6;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(epv0.N(lgb.J(o7k0.e(mm40VarD, 92.0f), vgg0.a(16.0f)), 0.5f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 21);
        }
    }

    public static final void u(mm40 mm40Var, ra10 ra10Var, fet fetVar, int i) {
        fetVar.g0(-1174430576);
        int i2 = i | 6 | (fetVar.g(ra10Var) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bvn(ra10Var, b);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            vbw0.y(6, 0, fetVar, jm40Var, (Function1) objP);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cvn(mm40Var, ra10Var, i, b);
        }
    }

    public static final void v(mm40 mm40Var, bms bmsVar, Function1 function1, fet fetVar, int i) {
        bmsVar.getClass();
        fetVar.g0(1587835671);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(bmsVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (bmsVar instanceof zls) {
            fetVar.e0(1196695792);
            g(mm40Var, (zls) bmsVar, function1, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!(bmsVar instanceof ams)) {
                throw b1j.f(1196694277, fetVar, false);
            }
            fetVar.e0(1196700843);
            z(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, bmsVar, function1, i, (byte) 3);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        byte b;
        fetVar.g0(-930638735);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            boolean zF = fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new dls(b2, backgroundContent);
                fetVar.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(rq8.K(mm40Var, (Function1) objP), xfn.a(fetVar).e, 0.0f, 2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 8.0f, 5), 38.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), fqj0VarD0));
            mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarP = o7k0.p(jm40Var, 80.0f, 14.0f);
            zcl zclVar3 = qmk.e;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarP), fqj0VarD0));
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.p(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 128.0f, 16.0f)), fqj0VarD0, fetVar, 0, true);
            fetVar.r(true);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            b = 0;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13), 1.0f), 16.0f)), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13), 1.0f), 16.0f)), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13), 1.0f), 16.0f)), fqj0VarD0));
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 14.0f, 5), 1.0f), 16.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            b = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, b);
        }
    }

    public static final void x(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1801962400);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
            long j = ijg.b0;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarS = i120.S(mm40VarQ, 1.0f, ((StaticColors) fetVar.k(zfnVar)).m113getRed0d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_live_indicator, 0, fetVar), null, o7k0.n(jm40Var, 20.0f), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i, (byte) 26);
        }
    }

    public static final void y(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-440367758);
        int i2 = (i & 6) == 0 ? (fetVar2.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mbc.o(zfi0.f44303a, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 10.0f, 7), false, fetVar2, 6, 4);
            fet fetVar3 = fetVar2;
            fetVar3.e0(530783814);
            int i3 = 0;
            for (Object obj : a4xVar) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                iem iemVar = (iem) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(iemVar);
                sb.append(i3);
                fetVar3.b0(-1160904521, sb.toString());
                String string = StringsKt.v0(iemVar.f14640a).toString();
                String string2 = StringsKt.v0(iemVar.b).toString();
                zfn zfnVar = zaq0.b;
                smk0 smk0Var = new smk0(((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary(), g1t0.d().f42262a.b, null, null, null, g1t0.d().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500);
                smk0 smk0Var2 = new smk0(((ThemeColors) fetVar3.k(zfnVar)).getSecondary(), g1t0.g().f42262a.b, null, null, null, g1t0.g().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500);
                zcl zclVar2 = qmk.f28987a;
                s5x0.a(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 14.0f, 5), string, string2, smk0Var, smk0Var2, fetVar, 0);
                fetVar.r(false);
                fetVar3 = fetVar;
                i3 = i4;
            }
            fetVar2 = fetVar3;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 6);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(276888856);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            fetVar.e0(-1636542831);
            for (int i3 = 0; i3 < 4; i3++) {
                mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                qxw.o(fetVar, xbc.c0(i120.Q(lgb.J(o7k0.e(mm40VarD2, 14.0f), vgg0.a(360.0f)), ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU(), jd8.n), vbc.d0(null, fetVar, 0, 1)));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 29);
        }
    }
}
