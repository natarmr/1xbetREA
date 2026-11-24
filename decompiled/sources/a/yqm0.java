package a;

import android.net.Uri;
import android.os.Looper;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yqm0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mm40 mm40Var, ArrayList arrayList, fet fetVar, int i) {
        byte b;
        fet fetVar2;
        String str;
        fet fetVar3 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar3.g0(893343580);
        int i2 = i | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.g(arrayList) ? 32 : 16);
        boolean z = false;
        boolean z2 = true;
        if (fetVar3.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z3 = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar4);
            jpm0.o(fetVar3, bh90VarM, shdVar3);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), shdVar2);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, shdVar);
            fetVar3.e0(-1521419597);
            Iterator it = arrayList.iterator();
            fet fetVar4 = fetVar3;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (StringsKt.O(str2, "Capacity", z2)) {
                    str = "VENUE_CAPACITY";
                } else if (StringsKt.O(str2, "Architect", z2)) {
                    str = "VENUE_ARCHITECT";
                } else {
                    str = StringsKt.O(str2, "Opened", z2) ? "VENUE_DATE" : "";
                }
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar4, 48);
                int iHashCode2 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM2 = fetVar4.m();
                jm40 jm40Var = jm40.b;
                mm40 mm40VarC1 = kbc.c0(fetVar4, jm40Var);
                mkd.c0.getClass();
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(pcyVar);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, thg0VarA, shdVar4);
                jpm0.o(fetVar4, bh90VarM2, shdVar3);
                jpm0.o(fetVar4, Integer.valueOf(iHashCode2), shdVar2);
                jpm0.n(fetVar4);
                jpm0.o(fetVar4, mm40VarC1, shdVar);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(jm40Var, 8.0f);
                Object objP = fetVar4.P();
                if (objP == ukd.f35823a) {
                    objP = new d4u0((byte) 3);
                    fetVar4.o0(objP);
                }
                p8a.k(mm40VarN, (Function1) objP, fetVar4, 48);
                mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), str);
                pz40 pz40Var = s6t0.f31722a;
                v8q0.a(str2, mm40VarE0, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
                fet fetVar5 = fetVar;
                fetVar5.r(true);
                z = false;
                z2 = true;
                shdVar2 = shdVar2;
                shdVar = shdVar;
                shdVar4 = shdVar4;
                shdVar3 = shdVar3;
                pcyVar = pcyVar;
                fetVar4 = fetVar5;
            }
            boolean z4 = z2;
            fetVar4.r(z);
            fetVar4.r(z4);
            b = z4;
            fetVar2 = fetVar4;
        } else {
            b = 1;
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rva(mm40Var, arrayList, i, b);
        }
    }

    public static final void b(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(620278623);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            xcz xczVarA2 = ddz.a(0, 0, fetVar, 0, 3);
            sjj sjjVarA = wzk0.a(fetVar);
            boolean zG = fetVar.g(sjjVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new iuj(sjjVarA);
                fetVar.o0(objP);
            }
            iuj iujVar = (iuj) objP;
            boolean zG2 = fetVar.g(xczVarA) | fetVar.g(xczVarA2);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new szn0(xczVarA, xczVarA2, b);
                fetVar.o0(objP2);
            }
            ugdVar.O(fbh0.a(mm40Var, piz.P((Function1) objP2, fetVar), ma80.f21447a, false, iujVar, 44), xczVarA, xczVarA2, fetVar, 3072);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var, ugdVar, i, (byte) 9);
        }
    }

    public static final void c(final dep0 dep0Var, fet fetVar, final int i) {
        final byte b;
        fet fetVar2 = fetVar;
        String str = dep0Var.b;
        fetVar2.g0(520929071);
        int i2 = (fetVar2.g(dep0Var) ? 4 : 2) | i;
        final byte b2 = 0;
        if (!fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            b = 1;
            fetVar2.X();
        } else {
            if (!dep0Var.f5961a) {
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2(dep0Var, i, b2) { // from class: a.cep0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f4224a;
                        public final /* synthetic */ dep0 b;

                        {
                            this.f4224a = b2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.f4224a;
                            dep0 dep0Var2 = this.b;
                            fet fetVar3 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    yqm0.c(dep0Var2, fetVar3, x8x.L(1));
                                    break;
                                default:
                                    yqm0.c(dep0Var2, fetVar3, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            long j = dep0Var.d;
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarH = dw9.h(1.0f, i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), true);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
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
            String strW = rsm0.w(R.string.team_gold, 0, fetVar2);
            zx7 zx7Var2 = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarN2 = epv0.N(s5x0.N(jr8Var.b(jm40Var, zx7Var2), 8.0f, 0.0f, 0.0f, 0.0f, 14), dep0Var.c);
            StaticColors staticColors = StaticColors.INSTANCE;
            b = 1;
            v8q0.a(strW, mm40VarN2, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.b(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (str.length() > 0) {
                fetVar2.e0(-1830039292);
                qxw.o(fetVar2, o7k0.s(jm40Var, 6.0f));
                mm40 mm40VarS = i120.S(i120.Q(o7k0.m(o7k0.e(jm40Var, 24.0f), 2), kkg.f, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f, dep0Var.e, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                v8q0.a(str, s5x0.L(jr8Var.b(jm40Var, gqw0.e), 6.0f, 0.0f, 2), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.b(), fetVar2, 0, 24576, 114680);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1829067721);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new Function2(dep0Var, i, b) { // from class: a.cep0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f4224a;
                public final /* synthetic */ dep0 b;

                {
                    this.f4224a = b;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f4224a;
                    dep0 dep0Var2 = this.b;
                    fet fetVar3 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            yqm0.c(dep0Var2, fetVar3, x8x.L(1));
                            break;
                        default:
                            yqm0.c(dep0Var2, fetVar3, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(l7m0 l7m0Var, Function0 function0, fet fetVar, int i) {
        l7m0Var.getClass();
        function0.getClass();
        fetVar.g0(-362950422);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            WeakHashMap weakHashMap = djv0.w;
            m8x.y(j120.k0(jm40.b, zcm0.i(fetVar).g), null, u1c.M(802226287, new rxf(l7m0Var, function0), fetVar), null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(2137774777, new v7i0(l7m0Var, b), fetVar), fetVar, 805306752, 442);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rxf(l7m0Var, function0, i, (byte) 2);
        }
    }

    public static final void e(final wks0 wks0Var, final Function0 function0, final Function1 function1, fet fetVar, int i) {
        wks0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1295243409);
        int i2 = i | (fetVar.g(wks0Var) ? 4 : 2);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            rqm rqmVar = new rqm((vui0) new tui0(rsm0.w(wks0Var.c, 0, fetVar), null), (pui0) null, (pvi0) new nvi0(wks0Var.b), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.vks0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b) {
                            case 0:
                                TransferTimeFilterUiModel transferTimeFilterUiModel = wks0Var.f39323a;
                                if (transferTimeFilterUiModel instanceof TransferTimeFilterUiModel.CustomTime) {
                                    function0.invoke();
                                } else {
                                    function1.invoke(transferTimeFilterUiModel);
                                }
                                break;
                            default:
                                TransferTimeFilterUiModel transferTimeFilterUiModel2 = wks0Var.f39323a;
                                if (transferTimeFilterUiModel2 instanceof TransferTimeFilterUiModel.CustomTime) {
                                    function0.invoke();
                                } else {
                                    function1.invoke(transferTimeFilterUiModel2);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            b = i3 == 4 ? (byte) 1 : (byte) 0;
            Object objP2 = fetVar.P();
            if (b != 0 || objP2 == cl5Var) {
                objP2 = new Function0() { // from class: a.vks0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b2) {
                            case 0:
                                TransferTimeFilterUiModel transferTimeFilterUiModel = wks0Var.f39323a;
                                if (transferTimeFilterUiModel instanceof TransferTimeFilterUiModel.CustomTime) {
                                    function0.invoke();
                                } else {
                                    function1.invoke(transferTimeFilterUiModel);
                                }
                                break;
                            default:
                                TransferTimeFilterUiModel transferTimeFilterUiModel2 = wks0Var.f39323a;
                                if (transferTimeFilterUiModel2 instanceof TransferTimeFilterUiModel.CustomTime) {
                                    function0.invoke();
                                } else {
                                    function1.invoke(transferTimeFilterUiModel2);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            obc.q(mm40VarD, rqmVar, true, null, function2, null, (Function0) objP2, null, fetVar, 390, 168);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(wks0Var, function0, function1, i, (byte) 12);
        }
    }

    public static final void f(mm40 mm40Var, o6u0 o6u0Var, Function0 function0, fet fetVar, int i) {
        o6u0Var.getClass();
        function0.getClass();
        fetVar.g0(-864402897);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o6u0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            zrm zrmVar = o6u0Var.d;
            ArrayList arrayList = o6u0Var.e;
            agc.r(null, zrmVar, null, null, null, null, null, fetVar, 0, 125);
            if (arrayList.isEmpty()) {
                fetVar.e0(-1963542577);
                fetVar.r(false);
            } else {
                fetVar.e0(-1963815501);
                zcl zclVar = qmk.f28987a;
                a(s5x0.N(s5x0.N(jm40Var, 16.0f, 0.0f, 8.0f, 0.0f, 10), 0.0f, 0.0f, 0.0f, 14.0f, 7), arrayList, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
            zq8.a(0, fetVar, y860.W(jr8.f16991a.a(jm40Var), null, null, false, null, function0, 28));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var, o6u0Var, function0, i, (byte) 14);
        }
    }

    public static final void g(mm40 mm40Var, m1v0 m1v0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        m1v0Var.getClass();
        fetVar2.g0(-398072136);
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i | (fetVar2.g(m1v0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            nw3 nw3Var = uc9.e;
            x5d x5dVarA = w5d.a(nw3Var, gqw0.n, fetVar2, 54);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 12.0f, 1);
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.j, fetVar2, 6);
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
            if (m1v0Var.c) {
                fetVar2.e0(956999566);
                h(0, 1, fetVar2, null, m1v0Var.f21028a, m1v0Var.b);
                fetVar2.r(false);
            } else {
                fetVar2.e0(957155248);
                fetVar2.r(false);
            }
            if (m1v0Var.e) {
                fetVar2.e0(957201562);
                h(0, 0, fetVar2, s5x0.N(jm40Var, 24.0f, 0.0f, 0.0f, 0.0f, 14), Integer.valueOf(R.drawable.ic_weather_windy), m1v0Var.d);
                fetVar2.r(false);
            } else {
                fetVar2.e0(957437968);
                fetVar2.r(false);
            }
            if (m1v0Var.g) {
                fetVar2.e0(957488312);
                h(0, 0, fetVar2, s5x0.N(jm40Var, 24.0f, 0.0f, 0.0f, 0.0f, 14), Integer.valueOf(R.drawable.ic_weather_pressure), m1v0Var.f);
                fetVar2.r(false);
            } else {
                fetVar2.e0(957726640);
                fetVar2.r(false);
            }
            if (m1v0Var.i) {
                fetVar2.e0(957776984);
                h(0, 0, fetVar2, s5x0.N(jm40Var, 24.0f, 0.0f, 0.0f, 0.0f, 14), Integer.valueOf(R.drawable.ic_weather_humidity), m1v0Var.h);
                fetVar2.r(false);
            } else {
                fetVar2.e0(958015312);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            jcb.v(null, 0.0f, ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator60(), fetVar, 0, 3);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onu0(mm40Var, m1v0Var, i, (byte) 5);
        }
    }

    public static final void h(int i, int i2, fet fetVar, mm40 mm40Var, Integer num, String str) {
        int i3;
        mm40 mm40Var2;
        fet fetVar2;
        Unit unit;
        fet fetVar3 = fetVar;
        fetVar3.g0(1113368152);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i5 = i3 | (fetVar3.g(num) ? 32 : 16) | (fetVar3.g(str) ? 256 : 128);
        if (fetVar3.U(i5 & 1, (i5 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var3 = i4 != 0 ? jm40Var : mm40Var;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            mm40 mm40Var4 = mm40Var3;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarN);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (num == null) {
                fetVar3.e0(-1828845724);
                fetVar3.r(false);
                unit = null;
                fetVar2 = fetVar3;
            } else {
                fetVar3.e0(-1828845723);
                dww.c(a8k0.F(num.intValue(), (i5 >> 3) & 14, fetVar3), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), fetVar3, 56, 0);
                fetVar2 = fetVar3;
                fetVar2.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar2.e0(-1828591585);
                zq8.a(0, fetVar2, o7k0.n(jm40Var, 24.0f));
                fetVar2.r(false);
            } else {
                fetVar2.e0(356646770);
                fetVar2.r(false);
            }
            mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            y9q0 y9q0VarA = y9q0.a(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679);
            pz40 pz40Var = s6t0.f31722a;
            fet fetVar4 = fetVar2;
            v8q0.a(str, mm40VarN2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarA, fetVar4, (i5 >> 6) & 14, 0, 131064);
            fetVar3 = fetVar4;
            fetVar3.r(true);
            mm40Var2 = mm40Var4;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var2, (Object) num, (Object) str, i, i2, (byte) 19);
        }
    }

    public static Object i(duo0 duo0Var) {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jf4.n("await must not be called on the UI thread");
            return null;
        }
        u6w0 u6w0Var = (u6w0) duo0Var;
        synchronized (u6w0Var.f35157a) {
            z = u6w0Var.b;
        }
        if (z) {
            if (duo0Var.d()) {
                return duo0Var.c();
            }
            throw new ExecutionException(duo0Var.b());
        }
        jrd jrdVar = new jrd((byte) 1);
        u6w0 u6w0Var2 = (u6w0) duo0Var;
        u6w0Var2.e(new e6w0(muo0.c.b, (nh60) jrdVar));
        u6w0Var2.a(jrdVar);
        jrdVar.b.await();
        if (duo0Var.d()) {
            return duo0Var.c();
        }
        throw new ExecutionException(duo0Var.b());
    }

    public static final LinkedHashMap j(List list) {
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ojh ojhVar = (ojh) it.next();
            linkedHashMap.put(ojhVar.f25359a, new ycl(lxr0.b(ojhVar.f.size())));
        }
        return linkedHashMap;
    }

    public static u6w0 k(Callable callable) {
        ThreadPoolExecutor threadPoolExecutor = muo0.c.f22422a;
        fuo0 fuo0Var = new fuo0();
        try {
            threadPoolExecutor.execute(new mfr((Object) fuo0Var, (Object) callable, (byte) 18));
        } catch (Exception e) {
            fuo0Var.a(e);
        }
        return fuo0Var.f10174a;
    }

    public static final ugi0 l(ugi0 ugi0Var, qaj qajVar) {
        ugi0 ugi0VarL;
        jiy jiyVarD;
        ugi0Var.getClass();
        qajVar.getClass();
        if (!Intrinsics.d(ugi0Var.l(), ygi0.b)) {
            return ugi0Var.isInline() ? l(ugi0Var.g(0), qajVar) : ugi0Var;
        }
        sgy sgyVarM = ulb.M(ugi0Var);
        ugi0 descriptor = null;
        if (sgyVarM != null && (jiyVarD = qajVar.d(sgyVarM, iun.f15405a)) != null) {
            descriptor = jiyVarD.getDescriptor();
        }
        return (descriptor == null || (ugi0VarL = l(descriptor, qajVar)) == null) ? ugi0Var : ugi0VarL;
    }

    public static final v2 m(kiy kiyVar, kiy kiyVar2, boolean z) {
        wsy wsyVarW;
        kiyVar.getClass();
        kiyVar2.getClass();
        if (!aao0.f538a) {
            v2 v2Var = (v2) kiyVar;
            v2 v2Var2 = (v2) kiyVar2;
            return v2Var.equals(v2Var2) ? v2Var : new jkq(v2Var, v2Var2, z, null);
        }
        wsy wsyVar = ((wdk) kiyVar).b;
        wsyVar.getClass();
        kzj0 kzj0Var = (kzj0) wsyVar;
        wsy wsyVar2 = ((wdk) kiyVar2).b;
        wsyVar2.getClass();
        kzj0 kzj0Var2 = (kzj0) wsyVar2;
        if (z) {
            wsyVarW = new dae0(kzj0Var, kzj0Var2);
            ysy.f43192a.b(kzj0Var, kzj0Var2);
        } else {
            wsyVarW = ucx.W(kzj0Var, kzj0Var2);
        }
        return new wdk(wsyVarW, null);
    }

    public static final b9a0 n(jjy jjyVar, int i, ajy ajyVar) {
        wiy wiyVarO = o(jjyVar, i, ajyVar);
        Object obj = null;
        String str = wiyVarO != null ? wiyVarO.f39240a : null;
        for (Object obj2 : jjyVar.b) {
            if (((b9a0) obj2).f2199a.equals(str)) {
                obj = obj2;
                break;
            }
        }
        return (b9a0) obj;
    }

    public static final wiy o(jjy jjyVar, int i, ajy ajyVar) {
        List list;
        fjy fjyVar = (fjy) CollectionsKt.W(i, jjyVar.d);
        Object obj = null;
        if (fjyVar == null || (list = fjyVar.b) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((wiy) obj2).b == ajyVar) {
                obj = obj2;
                break;
            }
        }
        return (wiy) obj;
    }

    public static final String p(b9a0 b9a0Var) {
        String string;
        bzu bzuVar;
        if (b9a0Var != null) {
            String str = b9a0Var.f;
            if (StringsKt.O(str, "playerlogo", false)) {
                bzuVar = new bzu((byte) 23);
                bzuVar.g(str);
            } else {
                bzuVar = new bzu((byte) 23);
                bzuVar.g("playerlogo");
                bzuVar.g(str);
            }
            string = ((StringBuilder) bzuVar.b).toString();
        } else {
            string = null;
        }
        return string == null ? "" : string;
    }

    public static final String q(b9a0 b9a0Var) {
        String str = b9a0Var != null ? b9a0Var.b : null;
        return str == null ? "" : str;
    }

    public static final pip0 r(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (!str4.equals("0")) {
            int i = 0;
            while (true) {
                if (i >= str3.length()) {
                    if (StringsKt.toIntOrNull(str4) != null) {
                        z4 = true;
                        break;
                    }
                } else if (Character.isLetter(str3.charAt(i))) {
                    i++;
                }
                z4 = false;
                break;
            }
        }
        z4 = false;
        break;
        if (z3 && z2 && z) {
            return pip0.DEFAULT;
        }
        if (z3) {
            return pip0.INACTIVE;
        }
        if (z4) {
            return pip0.CHANGED;
        }
        if (StringsKt.toIntOrNull(str2) != null) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (Character.isLetter(str.charAt(i2))) {
                }
            }
            return pip0.DEFAULT;
        }
        if (StringsKt.toIntOrNull(str) != null) {
            for (int i3 = 0; i3 < str2.length(); i3++) {
                if (Character.isLetter(str2.charAt(i3))) {
                }
            }
            return pip0.CHANGED;
        }
        if (!str.equals(str2) && !str2.equals("0")) {
            return pip0.CHANGED;
        }
        if (z2) {
            return z ? pip0.DEFAULT : pip0.INACTIVE;
        }
        return pip0.DEFAULT;
    }

    public static final Object s(r660 r660Var, iiy iiyVar) {
        r660Var.getClass();
        iiyVar.getClass();
        return r660Var.invoke();
    }

    public static final jrv0 t(vby vbyVar, ugi0 ugi0Var) {
        ugi0Var.getClass();
        c3x c3xVarL = ugi0Var.l();
        if (c3xVarL instanceof tua0) {
            return jrv0.POLY_OBJ;
        }
        if (Intrinsics.d(c3xVarL, aum0.c)) {
            return jrv0.LIST;
        }
        if (!Intrinsics.d(c3xVarL, aum0.d)) {
            return jrv0.OBJ;
        }
        ugi0 ugi0VarL = l(ugi0Var.g(0), vbyVar.b);
        c3x c3xVarL2 = ugi0VarL.l();
        if ((c3xVarL2 instanceof zvb0) || Intrinsics.d(c3xVarL2, zgi0.b)) {
            return jrv0.MAP;
        }
        throw xww.d(ugi0VarL);
    }

    public static final File u(Uri uri) {
        uri.getClass();
        if (!Intrinsics.d(uri.getScheme(), "file")) {
            hny.v(uri, "Uri lacks 'file' scheme: ");
            return null;
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        hny.v(uri, "Uri path is null: ");
        return null;
    }

    public static int v(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    int i3 = 0;
                    while (i < length2) {
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 < 2048) {
                            i3 += (127 - cCharAt2) >>> 31;
                        } else {
                            i3 += 2;
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i) < 65536) {
                                    throw new nlw0("Unpaired surrogate at index " + i + " of " + length2);
                                }
                                i++;
                            }
                        }
                        i++;
                    }
                    i2 += i3;
                    break;
                } catch (nlw0 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        jf4.o(h97.h(((long) i2) + 4294967296L, "UTF-8 length does not fit in int: "));
        return 0;
    }
}
