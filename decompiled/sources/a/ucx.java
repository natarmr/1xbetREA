package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.animation.LinearInterpolator;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ucx {
    public static final void A(vdm0 vdm0Var, boolean z, fet fetVar, int i) {
        fetVar.g0(1230208163);
        int i2 = (fetVar.g(vdm0Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(o7k0.g(mm40VarD, 0.0f, 182.0f, 1), 8.0f, 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 54);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (vdm0Var instanceof tdm0) {
                fetVar.e0(346444600);
                F((tdm0) vdm0Var, z, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (vdm0Var instanceof qdm0) {
                fetVar.e0(346448528);
                w((qdm0) vdm0Var, z, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (vdm0Var instanceof sdm0) {
                fetVar.e0(346454059);
                u((sdm0) vdm0Var, z, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (vdm0Var instanceof udm0) {
                fetVar.e0(346459609);
                P((udm0) vdm0Var, z, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!(vdm0Var instanceof pdm0)) {
                    throw b1j.f(346443021, fetVar, false);
                }
                fetVar.e0(346465331);
                b((pdm0) vdm0Var, fetVar, i2 & 14);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20((Object) vdm0Var, z, i, (byte) 9);
        }
    }

    public static final void B(mm40 mm40Var, jlb0 jlb0Var, fet fetVar, int i) {
        jlb0Var.getClass();
        fetVar.g0(-1207450591);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jlb0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(wha0.a0(mm40Var, wha0.T(fetVar), false, 14), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 32.0f, 5);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            tsm tsmVar = jlb0Var.f16708a;
            if (tsmVar == null) {
                fetVar.e0(-36197392);
                fetVar.r(false);
            } else {
                fetVar.e0(-36197391);
                hic.m(null, tsmVar, null, null, null, null, fetVar, 0, 125);
                fetVar.r(false);
            }
            mm40 mm40VarN2 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            a4x a4xVar = jlb0Var.b;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new peb0((byte) 5);
                fetVar.o0(objP);
            }
            slb.e(384, fetVar, a4xVar, mm40VarN2, (Function1) objP);
            fetVar.e0(-1248085056);
            for (int i3 = 0; i3 < 2; i3++) {
                h(0, fetVar, null);
            }
            fetVar.r(false);
            fetVar.e0(-1248083071);
            for (int i4 = 0; i4 < 2; i4++) {
                a(0, fetVar, null);
            }
            fetVar.r(false);
            fetVar.e0(-1248081025);
            for (int i5 = 0; i5 < 2; i5++) {
                g(null, jlb0Var.c, fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) jlb0Var, i, (byte) 11);
        }
    }

    public static final void C(int i, u12 u12Var, ugd ugdVar, xdr xdrVar, fet fetVar, mm40 mm40Var, d9d0 d9d0Var, Function0 function0, boolean z, boolean z2) {
        ugd ugdVar2;
        u12 u12Var2;
        xdr xdrVarM;
        mm40 mm40Var2;
        mm40 mm40Var3;
        function0.getClass();
        fetVar.g0(206462336);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.g(d9d0Var) ? 2048 : 1024) | 24576 | (fetVar.i(function0) ? 131072 : 65536) | 1572864;
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                u12Var2 = gqw0.f11754a;
                xdrVarM = u1c.M(548370522, new o3m((Object) d9d0Var, z, (byte) 5), fetVar);
                mm40Var3 = jm40.b;
            } else {
                fetVar.X();
                u12Var2 = u12Var;
                xdrVarM = xdrVar;
                mm40Var3 = mm40Var;
            }
            fetVar.s();
            mm40 mm40VarN = idx.N(mm40Var3, z, d9d0Var, z2, function0);
            tj30 tj30VarC = zq8.c(u12Var2, false);
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
            jr8 jr8Var = jr8.f16991a;
            ugdVar2 = ugdVar;
            ugdVar2.F(jr8Var, fetVar, 54);
            xdrVarM.F(jr8Var, fetVar, 54);
            fetVar.r(true);
            mm40Var2 = mm40Var3;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            u12Var2 = u12Var;
            xdrVarM = xdrVar;
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iad(mm40Var2, z, z2, d9d0Var, u12Var2, function0, xdrVarM, ugdVar2, i);
        }
    }

    public static final void D(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(615984576);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2);
            mw3 mw3Var = uc9.d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
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
            zcl zclVar = qmk.f28987a;
            k7x.b(str, null, o2e.e0(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), 24.0f), "FirstLogoTeamTestTag"), null, pm80VarF, null, null, null, null, null, null, null, fetVar2, ((i2 >> 3) & 14) | 32816, 0, 32744);
            fetVar2 = fetVar;
            k7x.b(str2, null, o2e.e0(o7k0.n(jm40Var, 24.0f), "SecondLogoTeamTestTag"), null, pm80VarF, null, null, null, null, null, null, null, fetVar2, ((i2 >> 6) & 14) | 32816, 0, 32744);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var2, str, str2, i, (byte) 19);
        }
    }

    public static final void E(mm40 mm40Var, j83 j83Var, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        j83Var.getClass();
        fetVar.g0(688997028);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j83Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.b(j83Var, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 2, 0, null, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 18) & 234881024) | 24576, 245758);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3h0(mm40Var, j83Var, y9q0Var, i, (byte) 4);
        }
    }

    public static final void F(tdm0 tdm0Var, boolean z, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-430861814);
        int i2 = (fetVar.g(tdm0Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-1741337871);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1741336947);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(bmd.n.a(k6zVar), u1c.M(-283783872, new ds60(tdm0Var, (byte) 29), fetVar), fetVar, 56);
            L(tdm0Var.g, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bg00(tdm0Var, z, i);
        }
    }

    public static final void G(String str, long j, fet fetVar, int i) {
        int i2;
        fetVar.g0(-542211370);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, o7k0.u(jm40.b, 0.0f, 144.0f, 1), j, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, g1t0.a().f42262a.c, g1t0.a().f42262a.f, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, (i2 & 14) | ((i2 << 3) & 896), 24960, 109360);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w9m(str, j, i, (byte) 7);
        }
    }

    public static final void H(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-2098923255);
        int i2 = i | 6 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(s5x0.M(jm40Var, 24.0f, 10.0f, 24.0f, 18.0f), 1.0f), "SeeAllHistoryTitleComponentTestTag");
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new l3c0(function0, (byte) 10);
                fetVar.o0(objP);
            }
            v8q0.a(rsm0.w(R.string.see_all_transactions_history, 0, fetVar), phu0.F(mm40VarE0, null, null, false, null, (Function0) objP, fetVar, 0, 15), ((ThemeColors) fetVar.k(zaq0.b)).getSecondaryButtonForeground(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 109560);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var2, function0, i, (byte) 13);
        }
    }

    public static final void I(final z8j0 z8j0Var, final Function1 function1, fet fetVar, int i) {
        pvi0 evi0Var;
        z8j0Var.getClass();
        function1.getClass();
        fetVar.g0(-1687658423);
        int i2 = i | (fetVar.g(z8j0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        final byte b = 1;
        final byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 60.0f);
            boolean zI = z8j0Var.i();
            String title = z8j0Var.getTitle();
            zfn zfnVar = zaq0.b;
            tui0 tui0Var = new tui0(title, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()));
            nui0 nui0Var = new nui0(Integer.valueOf(z8j0Var.b()), null, new m0x(z8j0Var.b(), null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, null, 0.0f, 242);
            if (z8j0Var instanceof f8j0) {
                fetVar.e0(-143864288);
                evi0Var = new jvi0(((f8j0) z8j0Var).b, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()));
                fetVar.r(false);
            } else {
                fetVar.e0(-143674630);
                evi0Var = new evi0(z8j0Var.l(), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()));
                fetVar.r(false);
            }
            rqm rqmVar = new rqm(tui0Var, nui0Var, evi0Var, (d4d) null, (tvi0) null, (wui0) null, zI, (e900) null, 376);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.d8j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        z8j0 z8j0Var2 = z8j0Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                z8j0Var2.getClass();
                                function2.invoke(new gbj0(z8j0Var2));
                                break;
                            default:
                                z8j0Var2.getClass();
                                function2.invoke(new gbj0(z8j0Var2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i5 = (i3 == 32 ? (byte) 1 : (byte) 0) | (i4 == 4 ? (byte) 1 : (byte) 0);
            Object objP2 = fetVar.P();
            if (i5 != 0 || objP2 == cl5Var) {
                objP2 = new Function0() { // from class: a.d8j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b;
                        z8j0 z8j0Var2 = z8j0Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                z8j0Var2.getClass();
                                function2.invoke(new gbj0(z8j0Var2));
                                break;
                            default:
                                z8j0Var2.getClass();
                                function2.invoke(new gbj0(z8j0Var2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            obc.q(mm40VarE, rqmVar, false, null, function0, (Function0) objP2, null, null, fetVar, 0, 204);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) z8j0Var, function1, i, (byte) 17);
        }
    }

    public static final void J(int i, fet fetVar) {
        int i2;
        fetVar.g0(274621471);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i & 3072) == 0) {
            i3 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        boolean z = false;
        if (!fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            fetVar.X();
            yfe0 yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new u49((byte) 24, i, z);
                return;
            }
            return;
        }
        fetVar.Z();
        if ((i & 1) == 0 || fetVar.B()) {
            elj0.a(oek0.c, fetVar);
            v4d.d(oek0.b, fetVar);
            v4d.d(oek0.e, fetVar);
            u4d u4dVar = oek0.f25127a;
            v4d.d(u4dVar, fetVar);
            v4d.d(u4dVar, fetVar);
            v4d.d(oek0.d, fetVar);
        } else {
            fetVar.X();
        }
        fetVar.s();
        throw null;
    }

    public static final void K(mm40 mm40Var, bum bumVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-2094937668);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bumVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(s5x0.N(o7k0.e(mm40VarD, 58.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            sem semVar = bumVar.h;
            boolean zEquals = semVar.equals(pem.f26861a);
            jm40 jm40Var = jm40.b;
            if (zEquals || semVar.equals(qem.f28591a)) {
                fetVar.e0(1706486900);
                jeb.r(s5x0.L(jm40Var, 4.0f, 0.0f, 2), semVar instanceof pem ? bhm.f2615a : bhm.b, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!semVar.equals(rem.f30342a)) {
                    throw b1j.f(1717610239, fetVar, false);
                }
                fetVar.e0(1717630596);
                fetVar.r(false);
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            O(bumVar.g, bumVar.i, fetVar, 0);
            r(bumVar.f3238a, bumVar.d, bumVar.b, bumVar.c, bumVar.e, bumVar.f, fetVar, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) bumVar, i, (byte) 5);
        }
    }

    public static final void L(mom0 mom0Var, fet fetVar, int i) {
        String strQ;
        fet fetVar2 = fetVar;
        fetVar2.g0(991131611);
        int i2 = i | (fetVar2.g(mom0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            if (mom0Var instanceof kom0) {
                strQ = ((kom0) mom0Var).f18638a;
            } else if (mom0Var instanceof jom0) {
                strQ = ((jom0) mom0Var).f16866a;
            } else if (!(mom0Var instanceof lom0)) {
                t9f.b();
                return;
            } else {
                lom0 lom0Var = (lom0) mom0Var;
                strQ = w6x.q(lom0Var.f20400a, Separators.SP, lom0Var.b);
            }
            if (strQ.length() > 0) {
                fetVar2.e0(-1097980662);
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                n05 n05Var = new n05(qmk.p, qmk.q, qmk.n);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(strQ, o7k0.d(jm40.b, 1.0f), jM123getWhite0d7_KjU, n05Var, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.h(), fetVar, 48, 24960, 109552);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1097485561);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds60(mom0Var, i, (byte) 28);
        }
    }

    public static final void M(mm40 mm40Var, String str, w6n w6nVar, fet fetVar, int i, int i2) {
        int i3;
        fetVar.g0(-1911572931);
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
            i3 |= fetVar.e(w6nVar.ordinal()) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qw80((Object) w6nVar, (Object) str, (byte) 10);
                fetVar.o0(objP);
            }
            kkb.p(0, fetVar, mm40Var, (Function0) objP);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040(mm40Var2, (Object) str, (Object) w6nVar, i, i2, (byte) 6);
        }
    }

    public static final void N(znp0 znp0Var, boolean z, int i, zx7 zx7Var, fet fetVar, int i2) {
        int i3;
        String str = znp0Var.d;
        fetVar.g0(-39512280);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(znp0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(zx7Var) ? 2048 : 1024;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            if (z) {
                fetVar.e0(-1647422686);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
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
                w6n w6nVar = w6n.j;
                M(null, str, w6nVar, fetVar, 384, 1);
                zcl zclVar = qmk.f28987a;
                qxw.o(fetVar, o7k0.e(jm40Var, 4.0f));
                M(null, znp0Var.e, w6nVar, fetVar, 384, 1);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(-1646933599);
                M(null, str, w6n.f, fetVar, 384, 1);
                fetVar.r(false);
            }
            if (i > 0) {
                fetVar.e0(-1646756062);
                d(i, (i4 >> 3) & 112, fetVar, jr8.f16991a.b(jm40Var, zx7Var));
                fetVar.r(false);
            } else {
                fetVar.e0(-1646585004);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sda(znp0Var, z, i, zx7Var, i2);
        }
    }

    public static final void O(String str, qtm qtmVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1863969429);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(qtmVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40.b, 1.0f), 14.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            if (qtmVar == null) {
                fetVar2.e0(-1010917668);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1010917667);
                rcb.x(null, ulb.b0(qtmVar), h2m.f12341a, nsm0.y(fgm.b), true, null, fetVar2, 384);
                fetVar2.r(false);
            }
            f1t0.a(null, str, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), 0L, fetVar, (i2 << 3) & 112, 438265);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(str, qtmVar, i, (byte) 18);
        }
    }

    public static final void P(udm0 udm0Var, boolean z, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-1105236083);
        int i2 = (fetVar.g(udm0Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(-1274947852);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1274946928);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1212621517, new zf00(udm0Var, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20((Object) udm0Var, z, i, (byte) 8);
        }
    }

    public static final void Q(bb30 bb30Var, fet fetVar, int i) {
        fetVar.g0(-1065231641);
        int i2 = (fetVar.g(bb30Var) ? 32 : 16) | i;
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            U(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bb30Var.c, bb30Var.f2290a);
            n4c.l(null, new lpm(opm.f25648a, new hpm(0L, 3)), false, fetVar, 5);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            U(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bb30Var.d, bb30Var.b);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b120(bb30Var, i, b);
        }
    }

    public static final void R(cb30 cb30Var, fet fetVar, int i) {
        fetVar.g0(1927105351);
        int i2 = (fetVar.g(cb30Var) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true, cb30Var.f4044a, cb30Var.c, cb30Var.d, fetVar, 48);
            n4c.l(null, new lpm(opm.f25648a, new hpm(0L, 3)), false, fetVar, 5);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, cb30Var.b, cb30Var.e, cb30Var.f, fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b120(cb30Var, i, (byte) 17);
        }
    }

    public static final void S(znp0 znp0Var, znp0 znp0Var2, int i, int i2, mpm mpmVar, fet fetVar, int i3) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-500728226);
        int i4 = i3 | (fetVar2.g(znp0Var) ? 4 : 2) | (fetVar2.g(znp0Var2) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.e(i2) ? 2048 : 1024) | (fetVar2.g(mpmVar) ? 16384 : 8192);
        if (fetVar2.U(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z = znp0Var.f && znp0Var2.f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            String str = znp0Var.b;
            zfn zfnVar = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            long j = qmk.q;
            long j2 = qmk.r;
            long j3 = qmk.n;
            n05 n05Var = new n05(j, j2, j3);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, zhg0Var.a(1.0f, jm40Var, true), jM123getWhite0d7_KjU, n05Var, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar2, 0, 24960, 109552);
            zq8.a(0, fetVar2, o7k0.s(jm40Var, 8.0f));
            int i5 = (i4 & 14) | 3072 | (i4 & 896);
            fetVar2 = fetVar2;
            boolean z3 = z;
            N(znp0Var, z3, i, gqw0.i, fetVar2, i5);
            fetVar2.r(true);
            n4c.l(s5x0.L(jm40Var, 8.0f, 0.0f, 2), mpmVar, true, fetVar2, 0);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarA2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA3, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            int i6 = i4 >> 3;
            N(znp0Var2, z3, i2, gqw0.g, fetVar2, (i6 & 14) | 3072 | (i6 & 896));
            zq8.a(0, fetVar2, o7k0.s(jm40Var, 8.0f));
            String str2 = znp0Var2.b;
            long jM123getWhite0d7_KjU2 = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            n05 n05Var2 = new n05(j, j2, j3);
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, zhg0Var.a(1.0f, jm40Var, true), jM123getWhite0d7_KjU2, n05Var2, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar2, 0, 24960, 109552);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6(znp0Var, znp0Var2, i, i2, mpmVar, i3);
        }
    }

    public static final void T(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1681951242);
        int i2 = i | 6;
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(o7k0.f(mm40VarD, 124.0f, 182.0f), 8.0f, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            String strW = rsm0.w(R.string.statistic_empty_data, 0, fetVar2);
            long j = qmk.u;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(strW, null, jM123getWhite0d7_KjU, null, j, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, 0, 24960, 109546);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var2, i, (byte) 15);
        }
    }

    public static final void U(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-119717867);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new l00(str, (byte) 7);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), 28.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            v8q0.a(str2, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar2, ((i2 >> 6) & 14) | 48, 24576, 113660);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 10);
        }
    }

    public static final List V(g9m0 g9m0Var, int i, int i2, ArrayList arrayList, MutableIntList mutableIntList, int i3, int i4, int i5, boolean z, Function1 function1) {
        int i6;
        MutableIntList mutableIntList2;
        int i7;
        Object obj;
        int i8;
        if (g9m0Var == null || arrayList.isEmpty() || (i6 = mutableIntList.b) == 0) {
            return iun.f15405a;
        }
        int i9 = -1;
        int i10 = 0;
        if (i2 - i < 0 || i6 == 0) {
            mutableIntList2 = IntListKt.f45341a;
        } else {
            IntRange intRangeO = l1e0.o(0, i6);
            int i11 = intRangeO.f46068a;
            int i12 = intRangeO.b;
            int iC = -1;
            if (i11 <= i12) {
                while (mutableIntList.c(i11) <= i) {
                    iC = mutableIntList.c(i11);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            if (iC == -1) {
                mutableIntList2 = IntListKt.f45341a;
            } else {
                MutableIntList mutableIntList3 = IntListKt.f45341a;
                mutableIntList2 = new MutableIntList(1);
                mutableIntList2.a(iC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj2 = arrayList.get(i13);
            int index = ((kbz) obj2).getIndex();
            int[] iArr = mutableIntList.f45342a;
            int i14 = mutableIntList.b;
            for (int i15 = i10; i15 < i14; i15++) {
                if (iArr[i15] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
            i13++;
            i10 = 0;
        }
        int[] iArr2 = mutableIntList2.f45342a;
        int i16 = mutableIntList2.b;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = i9;
                    break;
                }
                if (((kbz) it.next()).getIndex() == i18) {
                    break;
                }
                i19++;
            }
            kbz kbzVar = i19 == i9 ? (kbz) function1.invoke(Integer.valueOf(i18)) : (kbz) arrayList.remove(i19);
            int iZ = j120.Z(kbzVar, z);
            if (i19 == i9) {
                i17 = i17;
                i7 = Integer.MIN_VALUE;
            } else {
                long jI = kbzVar.i(0);
                i7 = (int) (z ? jI & 4294967295L : jI >> 32);
            }
            int size2 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((kbz) obj).getIndex() != i18) {
                    break;
                }
                i20++;
            }
            kbz kbzVar2 = (kbz) obj;
            if (kbzVar2 != null) {
                long jI2 = kbzVar2.i(0);
                i8 = (int) (z ? jI2 & 4294967295L : jI2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iZ);
            }
            kbzVar.e();
            kbzVar.a(iMax, 0, i4, i5);
            arrayList2.add(kbzVar);
            i17++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static final tft0 W(kzj0 kzj0Var, kzj0 kzj0Var2) {
        kzj0Var.getClass();
        kzj0Var2.getClass();
        return kzj0Var.equals(kzj0Var2) ? kzj0Var : new mkq(kzj0Var, kzj0Var2);
    }

    public static final dxh0 X(sff0 sff0Var) {
        sff0Var.getClass();
        int iOrdinal = sff0Var.g.x.ordinal();
        if (iOrdinal == 0) {
            return axh0.f1625a;
        }
        if (iOrdinal == 1) {
            return zwh0.f45106a;
        }
        if (iOrdinal == 2) {
            return cxh0.f5122a;
        }
        if (iOrdinal == 3) {
            return bxh0.f3376a;
        }
        t9f.b();
        return null;
    }

    public static final String Y(ti0 ti0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (ti0Var instanceof si0) {
            return ((si0) ti0Var).f32239a;
        }
        if (!(ti0Var instanceof ri0)) {
            return "";
        }
        switch (((ri0) ti0Var).f30514a.ordinal()) {
            case 0:
                return ctf0Var.b.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
            case 1:
                return ctf0Var.b.a(R.string.recommendation, Arrays.copyOf(new Object[0], 0));
            case 2:
                return ctf0Var.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0));
            case 3:
                return ctf0Var.b.a(R.string.viewed_games, Arrays.copyOf(new Object[0], 0));
            case 4:
                return ctf0Var.b.a(R.string.slots_popular, Arrays.copyOf(new Object[0], 0));
            case 5:
                return ctf0Var.b.a(R.string.live_casino_popular, Arrays.copyOf(new Object[0], 0));
            case 6:
                return ctf0Var.b.a(R.string.crash_aggregator_popular_title, Arrays.copyOf(new Object[0], 0));
            case 7:
                return ctf0Var.b.a(R.string.aggregator_top_games_header, Arrays.copyOf(new Object[0], 0));
            case 8:
                return ctf0Var.b.a(R.string.news_catalog, Arrays.copyOf(new Object[0], 0));
            case 9:
                return ctf0Var.b.a(R.string.aggregator_tournament_month_header, Arrays.copyOf(new Object[0], 0));
            case 10:
                return ctf0Var.b.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0));
            default:
                t9f.b();
                return null;
        }
    }

    public static final boolean Z(v310 v310Var) {
        List list;
        List list2;
        n410 n410Var = v310Var.b;
        List<s410> list3 = v310Var.f36713a.r;
        if (n410Var.r.size() != 5 || list3.size() != 5) {
            return true;
        }
        List<s410> list4 = n410Var.r;
        if (list4 == null || !list4.isEmpty()) {
            for (s410 s410Var : list4) {
                if (!s410Var.o.isEmpty() && ((list = s410Var.o) == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((o410) it.next()).b.length() == 0) {
                            }
                        }
                    }
                }
                if (s410Var.p.b.length() == 0) {
                    return true;
                }
            }
        }
        if (list3 != null && list3.isEmpty()) {
            return false;
        }
        for (s410 s410Var2 : list3) {
            if (!s410Var2.o.isEmpty() && ((list2 = s410Var2.o) == null || !list2.isEmpty())) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((o410) it2.next()).b.length() == 0) {
                        }
                    }
                }
            }
            if (s410Var2.p.b.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-864432045);
        int i2 = i | 6;
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b2)), gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            nkb.h(null, new ijm(), kjm.f18392a, null, null, null, fetVar2, 384, 57);
            ngv ngvVar = new ngv(3);
            mm40 mm40VarD2 = o7k0.d(o7k0.e(jm40Var, 210.0f), 1.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b2));
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                b = 7;
                objP = new peb0(b);
                fetVar2.o0(objP);
            } else {
                b = 7;
            }
            g8x.h(ngvVar, mm40VarD2, null, lh80VarT, qw3Var, qw3Var2, null, false, null, (Function1) objP, fetVar, 100663296, 6, 660);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var2, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[LOOP:1: B:78:0x0101->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[LOOP:6: B:30:0x0061->B:135:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107  */
    public static final boolean a0(v310 v310Var) {
        Iterator it;
        Iterator it2;
        n410 n410Var = v310Var.b;
        List<s410> list = v310Var.f36713a.r;
        if (n410Var.r.size() != 5 || list.size() != 5) {
            return true;
        }
        List<s410> list2 = n410Var.r;
        if (list2 == null || !list2.isEmpty()) {
            for (s410 s410Var : list2) {
                List list3 = s410Var.q;
                List list4 = s410Var.r;
                if (list3 != null && list3.isEmpty()) {
                    if (list4 == null) {
                    }
                    it = list4.iterator();
                    while (it.hasNext()) {
                        if (((z410) it.next()).c) {
                        }
                    }
                    return true;
                }
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        if (list4 == null && list4.isEmpty()) {
                            return true;
                        }
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (((z410) it.next()).c) {
                            }
                        }
                        return true;
                    }
                    if (((z410) it3.next()).c) {
                    }
                }
                List list5 = s410Var.q;
                if (list5 == null || !list5.isEmpty()) {
                    Iterator it4 = list5.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((z410) it4.next()).b.length() == 0) {
                            }
                        }
                    }
                }
                if (list4 != null && list4.isEmpty()) {
                    return true;
                }
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    if (((z410) it5.next()).b.length() == 0) {
                    }
                }
                return true;
            }
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (s410 s410Var2 : list) {
            List list6 = s410Var2.q;
            List list7 = s410Var2.r;
            if (list6 != null && list6.isEmpty()) {
                if (list7 == null) {
                }
                it2 = list7.iterator();
                while (it2.hasNext()) {
                    if (((z410) it2.next()).c) {
                    }
                }
                return true;
            }
            Iterator it6 = list6.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    if (list7 == null && list7.isEmpty()) {
                        return true;
                    }
                    it2 = list7.iterator();
                    while (it2.hasNext()) {
                        if (((z410) it2.next()).c) {
                        }
                    }
                    return true;
                }
                if (((z410) it6.next()).c) {
                }
            }
            List list8 = s410Var2.q;
            if (list8 == null || !list8.isEmpty()) {
                Iterator it7 = list8.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        if (((z410) it7.next()).b.length() == 0) {
                        }
                    }
                }
            }
            if (list7 != null && list7.isEmpty()) {
                return true;
            }
            Iterator it8 = list7.iterator();
            while (it8.hasNext()) {
                if (((z410) it8.next()).b.length() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void b(pdm0 pdm0Var, fet fetVar, int i) {
        fetVar.g0(1260163570);
        int i2 = (fetVar.g(pdm0Var) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            f(pdm0Var.f26815a, fetVar, 0);
            sj3.e(null, pdm0Var, fetVar, (i2 << 3) & 112);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, o7k0.e(jm40Var, 12.0f));
            L(pdm0Var.e, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bv90(pdm0Var, i, b);
        }
    }

    public static final boolean b0(v310 v310Var) {
        v310Var.getClass();
        n410 n410Var = v310Var.b;
        List<s410> list = v310Var.f36713a.r;
        if (n410Var.r.size() != 5 || list.size() != 5) {
            return true;
        }
        List<s410> list2 = n410Var.r;
        if (list2 == null || !list2.isEmpty()) {
            for (s410 s410Var : list2) {
                if (s410Var.g == -1 || s410Var.h == -1 || s410Var.i == -1 || s410Var.j == -1) {
                    return true;
                }
            }
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (s410 s410Var2 : list) {
            if (s410Var2.g == -1 || s410Var2.h == -1 || s410Var2.i == -1 || s410Var2.j == -1) {
                return true;
            }
        }
        return false;
    }

    public static final void c(final String str, final int i, final int i2, fet fetVar, final int i3) {
        int i4;
        fetVar.g0(405216160);
        if ((i3 & 6) == 0) {
            i4 = i3 | (fetVar.g(str) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i5 = i4 | (fetVar.e(i) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            mm40 mm40VarY = o7k0.y(jm40.b, null, 3);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            n05 n05Var = new n05(qmk.q, qmk.r, qmk.n);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarY, jM123getWhite0d7_KjU, n05Var, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, i2, 0, null, g1t0.m(), fetVar, (i5 & 14) | 48, ((i5 >> 3) & 14) | 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.av90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i3 | 1);
                    ucx.c(str, i, i2, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final boolean c0(List list) {
        list.getClass();
        if (list.isEmpty() || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v310 v310Var = (v310) it.next();
            List list2 = v310Var.b.r;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((s410) it2.next()).f31582a != 0) {
                        List list3 = v310Var.f36713a.r;
                        if (list3 != null && list3.isEmpty()) {
                            break;
                        }
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            if (((s410) it3.next()).f31582a != 0) {
                                return false;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return true;
    }

    public static final void d(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(1070839809);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dx2(i, (byte) 28);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            dwi0.b((Function1) objP, mm40Var2, null, fetVar2, (i3 << 3) & 112, 4);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s48(i, i2, mm40Var2);
        }
    }

    public static final gbn d0(Function0 function0, Function1 function1) {
        return new gbn(new t4c0((byte) 10), new o5c0(3, (byte) 6), new ya4(function1, function0, (byte) 4), x4c0.i);
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1100696080);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarA0 = wha0.a0(cjx.V(mm40Var, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(o7k0.e(o7k0.s(s5x0.N(mm40VarA0, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f), 4.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSeparator(), vgg0.f37379a));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 10);
        }
    }

    public static final void e0(RecyclerView recyclerView, int i) {
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int i2 = i - 2;
        if (linearLayoutManager == null || linearLayoutManager.h1() != i2) {
            return;
        }
        recyclerView.A0(recyclerView.getRight(), 0, new LinearInterpolator(), 1000, false);
    }

    public static final void f(String str, fet fetVar, int i) {
        fetVar.g0(-28364896);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            n05 n05Var = new n05(qmk.p, qmk.q, qmk.n);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, jM123getWhite0d7_KjU, n05Var, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.h(), fetVar, (i2 & 14) | 48, 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 9, i, str);
        }
    }

    public static final kzj0 f0(ays0 ays0Var, wm40 wm40Var, List list) {
        ays0Var.getClass();
        wm40Var.getClass();
        list.getClass();
        iys0 iys0VarH = wm40Var.h();
        iys0VarH.getClass();
        return g0(ays0Var, iys0VarH, list, false);
    }

    public static final void g(mm40 mm40Var, npo npoVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-723284402);
        int i2 = i | 6 | (fetVar2.e(npoVar.ordinal()) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            nkb.h(null, new ijm(), kjm.f18392a, null, null, null, fetVar2, 384, 57);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new yr80(npoVar, (byte) 27);
                fetVar2.o0(objP);
            }
            b8k0.f(mm40VarD2, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 12582918, 362);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ykb0(mm40Var2, npoVar, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a A[PHI: r1
  0x006a: PHI (r1v10 a.cr30) = (r1v9 a.cr30), (r1v11 a.cr30) binds: [B:33:0x0087, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    public static kzj0 g0(ays0 ays0Var, iys0 iys0Var, List list, boolean z) {
        cr30 cr30VarJ;
        wm40 wm40Var;
        cr30 cr30VarK;
        cr30 cr30Var;
        ays0Var.getClass();
        iys0Var.getClass();
        list.getClass();
        if (ays0Var.isEmpty() && list.isEmpty() && !z && iys0Var.n() != null) {
            foc focVarN = iys0Var.n();
            focVarN.getClass();
            kzj0 kzj0VarI = focVarN.I();
            kzj0VarI.getClass();
            return kzj0VarI;
        }
        foc focVarN2 = iys0Var.n();
        if (focVarN2 instanceof hzs0) {
            cr30VarJ = ((hzs0) focVarN2).I().y();
        } else {
            if (focVarN2 instanceof wm40) {
                int i = rek.f30339a;
                ym40 ym40VarC = oek.c(focVarN2);
                ym40VarC.getClass();
                rek.h(ym40VarC);
                cty ctyVar = cty.b0;
                if (list.isEmpty()) {
                    wm40 wm40Var2 = (wm40) focVarN2;
                    wm40Var = wm40Var2 instanceof wm40 ? wm40Var2 : null;
                    if (wm40Var == null || (cr30VarK = wm40Var.l0(ctyVar)) == null) {
                        cr30VarJ = wm40Var2.k0();
                        cr30VarJ.getClass();
                    } else {
                        cr30Var = cr30VarK;
                    }
                } else {
                    wm40 wm40Var3 = (wm40) focVarN2;
                    vzs0 vzs0VarA = lys0.b.a(iys0Var, list);
                    wm40Var = wm40Var3 instanceof wm40 ? wm40Var3 : null;
                    if (wm40Var == null || (cr30VarK = wm40Var.K(vzs0VarA, ctyVar)) == null) {
                        cr30VarJ = wm40Var3.J(vzs0VarA);
                        cr30VarJ.getClass();
                    } else {
                        cr30Var = cr30VarK;
                    }
                }
                return i0(ays0Var, iys0Var, list, z, cr30Var, new zsy(ays0Var, iys0Var, list, z));
            }
            if (focVarN2 instanceof tfk) {
                u1o u1oVar = u1o.SCOPE_FOR_ABBREVIATION_TYPE;
                String str = ((tfk) focVarN2).getName().f10896a;
                str.getClass();
                cr30VarJ = f2o.a(u1oVar, true, str);
            } else {
                if (!(iys0Var instanceof xmx)) {
                    c99.n("Unsupported classifier: ", focVarN2, " for constructor: ", iys0Var);
                    return null;
                }
                cr30VarJ = jpm0.j("member scope for intersection type", ((xmx) iys0Var).b);
            }
        }
        cr30Var = cr30VarJ;
        return i0(ays0Var, iys0Var, list, z, cr30Var, new zsy(ays0Var, iys0Var, list, z));
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(957029922);
        int i2 = i | 6;
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            nkb.h(null, new ijm(), kjm.f18392a, null, null, null, fetVar2, 384, 57);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new peb0((byte) 6);
                fetVar2.o0(objP);
            }
            mm40Var2 = jm40Var;
            b8k0.f(mm40VarD2, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 817889286, 362);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var2, i, (byte) 6);
        }
    }

    public static final kzj0 h0(cr30 cr30Var, ays0 ays0Var, iys0 iys0Var, List list, boolean z) {
        ays0Var.getClass();
        iys0Var.getClass();
        list.getClass();
        cr30Var.getClass();
        lzj0 lzj0Var = new lzj0(iys0Var, list, z, cr30Var, new zsy(cr30Var, ays0Var, iys0Var, list, z));
        return ays0Var.isEmpty() ? lzj0Var : new nzj0(lzj0Var, ays0Var);
    }

    public static final scx i(jiy jiyVar, String str) {
        return new scx(str, new tcx(jiyVar));
    }

    public static final kzj0 i0(ays0 ays0Var, iys0 iys0Var, List list, boolean z, cr30 cr30Var, Function1 function1) {
        ays0Var.getClass();
        iys0Var.getClass();
        list.getClass();
        cr30Var.getClass();
        lzj0 lzj0Var = new lzj0(iys0Var, list, z, cr30Var, function1);
        return ays0Var.isEmpty() ? lzj0Var : new nzj0(lzj0Var, ays0Var);
    }

    public static final void j(mm40 mm40Var, zy6 zy6Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2049312620);
        int i2 = i | 6 | (fetVar2.g(zy6Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long background = afn0.m(fetVar2).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, background, ljcVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            mm40 mm40VarQ2 = i120.Q(jm40Var, afn0.m(fetVar2).getBackground(), ljcVar);
            long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ3 = i120.Q(mm40VarQ2, backgroundContent, vgg0.a(20.0f));
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ3);
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
            mm40 mm40VarQ4 = i120.Q(lgb.J(i120.Q(o7k0.e(o7k0.d(jm40Var, 1.0f), 20.0f), afn0.m(fetVar2).getBackground(), ljcVar), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), afn0.m(fetVar2).getBackgroundContent(), ljcVar);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ4);
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
            e(0, fetVar2, jr8.f16991a.b(jm40Var, gqw0.b));
            fetVar2.r(true);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarN = s5x0.N(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), 16.0f, 20.0f, 16.0f, 0.0f, 8);
            long backgroundContent2 = afn0.m(fetVar2).getBackgroundContent();
            zcl zclVar2 = qmk.g;
            mm40 mm40VarQ5 = i120.Q(mm40VarN, backgroundContent2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ5);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            mm40 mm40VarL = s5x0.L(ohs0.i(fetVar2, mm40VarC3, shdVar4, 1.0f, true), 0.0f, 4.0f, 1);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar4);
            v8q0.a(zy6Var.d, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), afn0.m(fetVar).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110590);
            v8q0.a(zy6Var.e, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 6.0f, 5), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.l(), afn0.m(fetVar).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
            fetVar.r(true);
            v8q0.a(zy6Var.c, null, 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.r(), afn0.m(fetVar).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 109566);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var2, zy6Var, i, (byte) 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final rq20 j0(f5h f5hVar) {
        ?? arrayList;
        List<fah> list;
        f5hVar.getClass();
        h2g h2gVar = f5hVar.A;
        h2g h2gVar2 = f5hVar.B;
        String str = h2gVar != null ? h2gVar.f12331a : null;
        String str2 = str == null ? "" : str;
        String str3 = h2gVar2 != null ? h2gVar2.f12331a : null;
        String str4 = str3 == null ? "" : str3;
        String str5 = (String) CollectionsKt.firstOrNull(d5c.P(h2gVar));
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) CollectionsKt.firstOrNull(d5c.P(h2gVar2));
        String str8 = str7 == null ? "" : str7;
        jch jchVar = f5hVar.I;
        if (jchVar == null || (list = jchVar.b) == null) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (fah fahVar : list) {
                Integer num = fahVar.f9207a;
                String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
                if (strValueOf == null) {
                    strValueOf = "";
                }
                Integer num2 = fahVar.b;
                String strValueOf2 = num2 != null ? String.valueOf(num2.intValue()) : null;
                if (strValueOf2 == null) {
                    strValueOf2 = "";
                }
                Integer num3 = fahVar.c;
                String strValueOf3 = num3 != null ? String.valueOf(num3.intValue()) : null;
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                arrayList.add(new ve90(strValueOf, strValueOf2, strValueOf3, false));
            }
        }
        return new rq20(str2, str4, str6, arrayList, str8);
    }

    public static final void k(ra00 ra00Var, float f, float f2, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(370498036);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(ra00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            gfm0 gfm0Var = new gfm0(a8k0.F(ra00Var.s(), 0, fetVar2), null);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            fetVar2.b0(1501343929, ra00Var.a());
            p8a.e(jr8.f16991a.a(jm40Var), ra00Var.a(), gfm0Var, gfm0Var, gqw0.A, fetVar2, 196608, 4);
            fetVar2.r(false);
            if (ra00Var instanceof pa00) {
                fetVar2.e0(-702560606);
                pzb.u((pa00) ra00Var, f, f2, function1, function2, fetVar2, i3 & 65534);
                fetVar2.r(false);
            } else {
                if (!(ra00Var instanceof qa00)) {
                    throw b1j.f(1501355163, fetVar2, false);
                }
                fetVar2.e0(-702227852);
                g8x.s((qa00) ra00Var, f, f2, function1, fetVar2, i3 & 8190);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jbd(ra00Var, f, f2, function1, function2, i, (byte) 1);
        }
    }

    public static final oas k0(h06 h06Var) {
        List listL0;
        ArrayList arrayList;
        List list;
        List list2;
        List list3;
        a280 a280Var;
        Long l = (h06Var == null || (list3 = h06Var.c) == null || (a280Var = (a280) CollectionsKt.firstOrNull(list3)) == null) ? null : a280Var.f113a;
        String str = h06Var != null ? h06Var.f12218a : null;
        if (h06Var == null || (list2 = h06Var.c) == null) {
            listL0 = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Long l2 = ((a280) it.next()).f113a;
                if (l2 != null) {
                    arrayList2.add(l2);
                }
            }
            listL0 = CollectionsKt.L0(arrayList2);
        }
        if (h06Var == null || (list = h06Var.c) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = ((a280) it2.next()).c;
                arrayList3.add(str2 != null ? StringsKt.p0(str2, Separators.SLASH, str2) : "");
            }
            arrayList = arrayList3;
        }
        return new oas(l, str, listL0, arrayList, h06Var != null ? h06Var.b : null);
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        String str4;
        String str5;
        fet fetVar2;
        mm40 mm40Var2;
        float f;
        boolean z;
        fetVar.g0(-1309453662);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= fetVar.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            str5 = str3;
            i2 |= fetVar.g(str5) ? 2048 : 1024;
        } else {
            str5 = str3;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, shdVar4, 1.0f, true);
            int i3 = i2;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVarI);
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
            if (StringsKt.W(str)) {
                f = 1.0f;
                fetVar2 = fetVar;
                z = false;
                fetVar2.e0(8375430);
                fetVar2.r(false);
            } else {
                fetVar.e0(8186640);
                f = 1.0f;
                z = false;
                v8q0.a(str, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar), fetVar, ((i3 >> 3) & 14) | 48, 0, 131068);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            if (StringsKt.W(str4)) {
                fetVar2.e0(8623430);
                fetVar2.r(z);
            } else {
                fetVar2.e0(8436562);
                fet fetVar3 = fetVar2;
                v8q0.a(str4, o7k0.d(jm40Var, f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar3, ((i3 >> 6) & 14) | 48, 0, 131068);
                fetVar2 = fetVar3;
                fetVar2.r(z);
            }
            fetVar2.r(true);
            if (StringsKt.W(str5)) {
                fetVar2.e0(-1276634820);
                fetVar2.r(z);
            } else {
                fetVar2.e0(-1277050282);
                mm40 mm40VarR = o7k0.r(jm40Var, 0.0f, 0.0f, 168.0f, 11);
                qrq qrqVar = j1t0.f15753a;
                long j = qmk.r;
                fet fetVar4 = fetVar2;
                v8q0.a(str5, mm40VarR, 0L, new n05(qmk.p, j, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar4, (i3 >> 9) & 14, 24960, 110580);
                fetVar2 = fetVar4;
                fetVar2.r(z);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a0n(mm40Var2, str, str2, str3, i, (byte) 4);
        }
    }

    public static final oas l0(j380 j380Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Long l;
        List list;
        List list2;
        List list3;
        c680 c680Var;
        Integer numValueOf = null;
        Long l2 = (j380Var == null || (list3 = j380Var.c) == null || (c680Var = (c680) CollectionsKt.firstOrNull(list3)) == null) ? null : c680Var.f3806a;
        String str = j380Var != null ? j380Var.f15818a : null;
        if (j380Var == null || (list2 = j380Var.c) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Long l3 = ((c680) it.next()).f3806a;
                arrayList.add(Long.valueOf(l3 != null ? l3.longValue() : 0L));
            }
        }
        if (j380Var == null || (list = j380Var.c) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = ((c680) it2.next()).c;
                arrayList2.add(str2 != null ? StringsKt.p0(str2, Separators.SLASH, str2) : "");
            }
        }
        if (j380Var != null && (l = j380Var.b) != null) {
            numValueOf = Integer.valueOf((int) l.longValue());
        }
        return new oas(l2, str, arrayList, arrayList2, numValueOf);
    }

    public static final void m(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, Function1 function1, Function1 function2, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, Function1 function3, fet fetVar, int i) {
        int i2;
        Function1 function4 = function2;
        l7m0Var.getClass();
        function1.getClass();
        function4.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        xdrVar3.getClass();
        function3.getClass();
        fetVar.g0(872163244);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(xdrVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 38347923) != 38347922)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            function4 = function2;
            c030.a(mm40Var, l7m0Var, null, xczVar, u1c.M(475830566, new vz20(xdrVar2, xdrVar3, function3, b), fetVar), u1c.M(988966714, new kgx(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), function1, function2, (byte) 4), fetVar), u1c.M(515858899, new xz20(xdrVar, function1, function4, b), fetVar), rq8.g, rq8.h, fetVar, (i3 & 14) | 115040256 | (i3 & 112) | ((i3 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yz20(mm40Var, l7m0Var, xczVar, function1, function4, xdrVar, xdrVar2, xdrVar3, function3, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static final jda0 m0(sda0 sda0Var) {
        ?? arrayList;
        sda0Var.getClass();
        nda0 nda0Var = sda0Var.f32024a;
        kda0 kda0VarP0 = nda0Var != null ? bdx.p0(nda0Var) : new kda0(-1, "", "", "", "", "", false);
        List<iea0> list = sda0Var.b;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (iea0 iea0Var : list) {
                iea0Var.getClass();
                String str = iea0Var.f14623a;
                if (str == null) {
                    str = "";
                }
                Long l = iea0Var.b;
                long jLongValue = l != null ? l.longValue() : -1L;
                nda0 nda0Var2 = iea0Var.c;
                kda0 kda0VarP1 = nda0Var2 != null ? bdx.p0(nda0Var2) : new kda0(-1, "", "", "", "", "", false);
                dea0 dea0Var = iea0Var.d;
                aea0 aea0VarU = dea0Var != null ? idx.U(dea0Var) : new aea0(-1L, "", "", "", fks0.Empty, false);
                dea0 dea0Var2 = iea0Var.e;
                arrayList.add(new fea0(str, jLongValue, kda0VarP1, aea0VarU, dea0Var2 != null ? idx.U(dea0Var2) : new aea0(-1L, "", "", "", fks0.Empty, false)));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new jda0(kda0VarP0, arrayList);
    }

    public static final void n(mm40 mm40Var, db30 db30Var, fet fetVar, int i) {
        fetVar.g0(-1939180939);
        int i2 = i | 6 | (fetVar.g(db30Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-359110859, new b120(db30Var), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var, db30Var, i, (byte) 3);
        }
    }

    public static final zxj0 n0(BetZip betZip) {
        zfa0 xfa0Var;
        betZip.getClass();
        long j = betZip.m;
        long j2 = betZip.o;
        String str = betZip.t;
        String str2 = betZip.A;
        String str3 = betZip.u;
        double d = betZip.b;
        double d2 = betZip.d;
        uoy uoyVar = betZip.l;
        long j3 = betZip.f46426a;
        long j4 = betZip.c;
        boolean z = betZip.x;
        String str4 = betZip.g;
        if (str4 == null) {
            str4 = "";
        }
        PlayersDuelZip playersDuelZip = betZip.s;
        String str5 = str4;
        iun iunVar = iun.f15405a;
        if (Intrinsics.d(playersDuelZip, new PlayersDuelZip(iunVar, iunVar))) {
            xfa0Var = yfa0.INSTANCE;
        } else {
            List list = playersDuelZip.f46428a;
            if (list == null) {
                list = iun.f15405a;
            }
            List list2 = playersDuelZip.b;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            xfa0Var = new xfa0(list, list2);
        }
        return new zxj0(j, j2, str, str2, str3, d, d2, str5, uoyVar, j3, j4, z, xfa0Var);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0206  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    public static final void o(mm40 mm40Var, kb30 kb30Var, String str, String str2, String str3, a4x a4xVar, fet fetVar, int i) {
        a4x a4xVar2;
        fet fetVar2;
        shd shdVar;
        shd shdVar2;
        jm40 jm40Var;
        boolean z;
        boolean z2;
        shd shdVar3;
        fet fetVar3;
        ?? r10;
        fet fetVar4;
        fet fetVar5;
        fet fetVar6 = fetVar;
        w6x.x(a4xVar, str2, str3);
        fetVar6.g0(-151800730);
        int i2 = i | (fetVar6.g(mm40Var) ? 4 : 2) | (fetVar6.g(kb30Var) ? 32 : 16) | (fetVar6.g(str) ? 256 : 128) | (fetVar6.g(str2) ? 2048 : 1024) | (fetVar6.g(str3) ? 16384 : 8192) | (fetVar6.g(a4xVar) ? 131072 : 65536);
        if (fetVar6.U(i2 & 1, (74899 & i2) != 74898)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar6, 0);
            int iHashCode = Long.hashCode(fetVar6.T);
            bh90 bh90VarM = fetVar6.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar6, jm40Var2);
            mkd.c0.getClass();
            fetVar6.i0();
            boolean z3 = fetVar6.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar6.l(pcyVar);
            } else {
                fetVar6.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar6, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar6, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar6, numValueOf, shdVar6);
            jpm0.n(fetVar6);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar6, mm40VarC0, shdVar7);
            boolean z4 = kb30Var instanceof gb30;
            if (z4 || str.length() > 0 || str2.length() > 0 || !a4xVar.isEmpty()) {
                fetVar6.e0(-1485872872);
                zcl zclVar = qmk.f28987a;
                zq8.a(0, fetVar6, o7k0.e(jm40Var2, 8.0f));
                fetVar6.r(false);
            } else {
                fetVar6.e0(-1485817134);
                fetVar6.r(false);
            }
            zcl zclVar2 = qmk.f28987a;
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar6, 0);
            int iHashCode2 = Long.hashCode(fetVar6.T);
            bh90 bh90VarM2 = fetVar6.m();
            mm40 mm40VarC1 = kbc.c0(fetVar6, mm40Var);
            fetVar6.i0();
            if (fetVar6.S) {
                fetVar6.l(pcyVar);
            } else {
                fetVar6.r0();
            }
            jpm0.o(fetVar6, x5dVarA2, shdVar4);
            jpm0.o(fetVar6, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar6, shdVar6, fetVar6);
            jpm0.o(fetVar6, mm40VarC1, shdVar7);
            if (z4) {
                gb30 gb30Var = (gb30) kb30Var;
                if (gb30Var.c) {
                    fetVar6.e0(-1931900851);
                    if (gb30Var.f10997a.length() > 0) {
                        fetVar6.e0(-1931816748);
                        mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                        String str4 = gb30Var.f10997a;
                        y9q0 y9q0VarN = ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar6);
                        shdVar3 = shdVar4;
                        z2 = false;
                        z = true;
                        shdVar = shdVar7;
                        jm40Var = jm40Var2;
                        shdVar2 = shdVar6;
                        v8q0.a(str4, mm40VarD, 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, y9q0VarN, fetVar6, 48, 24960, 109564);
                        fet fetVar7 = fetVar6;
                        fetVar7.r(false);
                        fetVar5 = fetVar7;
                    } else {
                        shdVar = shdVar7;
                        shdVar2 = shdVar6;
                        jm40Var = jm40Var2;
                        z = true;
                        z2 = false;
                        fet fetVar8 = fetVar6;
                        shdVar3 = shdVar4;
                        fetVar8.e0(-1931441400);
                        fetVar8.r(false);
                        fetVar5 = fetVar8;
                    }
                    n(null, gb30Var.b, fetVar5, z2 ? 1 : 0);
                    fetVar5.r(z2);
                    fetVar3 = fetVar5;
                } else {
                    pcyVar = pcyVar;
                    xx7Var = xx7Var;
                    shdVar = shdVar7;
                    shdVar2 = shdVar6;
                    jm40Var = jm40Var2;
                    z = true;
                    z2 = false;
                    fet fetVar9 = fetVar6;
                    shdVar3 = shdVar4;
                    fetVar9.e0(-1931352120);
                    fetVar9.r(false);
                    fetVar3 = fetVar9;
                }
            } else {
                pcyVar = pcyVar;
                xx7Var = xx7Var;
                shdVar = shdVar7;
                shdVar2 = shdVar6;
                jm40Var = jm40Var2;
                z = true;
                z2 = false;
                fet fetVar10 = fetVar6;
                shdVar3 = shdVar4;
                fetVar10.e0(-1931352120);
                fetVar10.r(false);
                fetVar3 = fetVar10;
            }
            if (str2.length() <= 0 && str.length() <= 0) {
                boolean z5 = z2;
                fet fetVar11 = fetVar3;
                fetVar11.e0(-1931108088);
                fetVar11.r(z5);
                fetVar4 = fetVar11;
                r10 = z5;
            } else {
                fetVar3.e0(-1931282990);
                boolean z6 = z2 ? 1 : 0;
                fet fetVar12 = fetVar3;
                l((i2 >> 3) & 8176, fetVar12, null, str, str2, str3);
                fet fetVar13 = fetVar12;
                fetVar13.r(z6);
                fetVar4 = fetVar13;
                r10 = z6;
            }
            x5d x5dVarA3 = w5d.a(new qw3(4.0f, z, new jf4((byte) 14)), xx7Var, fetVar4, r10);
            int iHashCode3 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM3 = fetVar4.m();
            mm40 mm40VarC2 = kbc.c0(fetVar4, jm40Var);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, x5dVarA3, shdVar3);
            jpm0.o(fetVar4, bh90VarM3, shdVar5);
            vqd.u(iHashCode3, fetVar4, shdVar2, fetVar4);
            a4xVar2 = a4xVar;
            Iterator itO = h97.o(fetVar4, mm40VarC2, shdVar, -1682198261, a4xVar2);
            while (itO.hasNext()) {
                x680 x680Var = (x680) itO.next();
                fetVar4.b0(-1737161595, x680Var.f40350a);
                wdx.h(x680Var.b, x680Var.c, u1c.M(-414290969, new elm(x680Var, (byte) 29), fetVar4), fetVar4, 384);
                fetVar4.r(r10);
            }
            fetVar4.r(r10);
            fetVar4.r(z);
            fetVar4.r(z);
            fetVar4.r(z);
            fetVar2 = fetVar4;
        } else {
            a4xVar2 = a4xVar;
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, kb30Var, str, str2, str3, a4xVar2, i, (byte) 21);
        }
    }

    public static final wll0 o0(d2w d2wVar, int i, ctf0 ctf0Var, Set set, boolean z, boolean z2, v5l0 v5l0Var, wcb wcbVar, vvs vvsVar, String str, oho ohoVar, v12 v12Var, boolean z3) {
        d2wVar.getClass();
        ctf0Var.getClass();
        set.getClass();
        v5l0Var.getClass();
        str.getClass();
        ohoVar.getClass();
        boolean zContains = set.contains(Long.valueOf(d2wVar.b()));
        String strA = wcbVar != null ? wcbVar.a(d2wVar.d(), d2wVar.g()) : null;
        if (strA == null) {
            strA = "";
        }
        lla llaVarG0 = s0x.g0(d2wVar, i, ctf0Var, zContains, z, z2, v5l0Var, strA, str, z3);
        if (llaVarG0 != null) {
            return new wll0(llaVarG0, vvsVar, vvw.J(ohoVar), v12Var);
        }
        return null;
    }

    public static final void p(gl40 gl40Var, sek sekVar, bek bekVar, z5s z5sVar, xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        gl40Var.getClass();
        sekVar.getClass();
        bekVar.getClass();
        xexVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(430033806);
        byte b = 16;
        int i2 = i | (fetVar.g(gl40Var) ? 4 : 2) | (fetVar.g(sekVar) ? 32 : 16) | (fetVar.g(bekVar) ? 256 : 128) | (fetVar.g(z5sVar) ? 2048 : 1024) | (fetVar.g(xexVar) ? 16384 : 8192) | (fetVar.g(cyberBottomSheetParams) ? 131072 : 65536) | (fetVar.g(qdzVar) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = 29360128 & i2;
            boolean z = i3 == 8388608;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new m040(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 8388608;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new m040(function1, (byte) 17);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            l7m0 l7m0Var = gl40Var.f11473a;
            l7m0 l7m0Var2 = gl40Var.b;
            l7m0 l7m0Var3 = gl40Var.c;
            l7m0 l7m0Var4 = gl40Var.d;
            l7m0 l7m0Var5 = gl40Var.e;
            l7m0 l7m0Var6 = gl40Var.f;
            l7m0 l7m0Var7 = gl40Var.g;
            boolean z3 = i3 == 8388608;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new m040(function1, (byte) 18);
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean z4 = i3 == 8388608;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new m040(function1, (byte) 19);
                fetVar.o0(objP4);
            }
            Function0 function3 = (Function0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new ec40((byte) 3);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean z5 = i3 == 8388608;
            Object objP6 = fetVar.P();
            if (z5 || objP6 == cl5Var) {
                objP6 = new m040(function1, (byte) 20);
                fetVar.o0(objP6);
            }
            Function0 function5 = (Function0) objP6;
            boolean z6 = i3 == 8388608;
            Object objP7 = fetVar.P();
            if (z6 || objP7 == cl5Var) {
                objP7 = new rp30(function1, (byte) 11);
                fetVar.o0(objP7);
            }
            Function1 function6 = (Function1) objP7;
            boolean z7 = i3 == 8388608;
            Object objP8 = fetVar.P();
            boolean z8 = z7;
            byte b2 = 12;
            if (z8 || objP8 == cl5Var) {
                objP8 = new rp30(function1, b2);
                fetVar.o0(objP8);
            }
            Function1 function7 = (Function1) objP8;
            boolean z9 = i3 == 8388608;
            Object objP9 = fetVar.P();
            if (z9 || objP9 == cl5Var) {
                objP9 = new rp30(function1, (byte) 8);
                fetVar.o0(objP9);
            }
            Function1 function8 = (Function1) objP9;
            boolean z10 = i3 == 8388608;
            Object objP10 = fetVar.P();
            if (z10 || objP10 == cl5Var) {
                objP10 = new rp30(function1, (byte) 9);
                fetVar.o0(objP10);
            }
            int i4 = (i2 << 18) & 2143289344;
            int i5 = i2 >> 12;
            mrv.x(l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, false, function2, function3, function4, function5, function6, function7, function8, (Function1) objP10, u1c.M(-1864006821, new rkb(function1, qdzVar, (byte) 5), fetVar), fetVar, i4, (i5 & 14) | 1572864 | (i5 & 112), 12288);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6((Object) gl40Var, sekVar, bekVar, z5sVar, (Object) xexVar, (Object) cyberBottomSheetParams, (Object) qdzVar, function1, i, (byte) 7);
        }
    }

    public static final z6m0 p0(b7m0 b7m0Var) {
        b7m0Var.getClass();
        int iOrdinal = b7m0Var.ordinal();
        if (iOrdinal == 0) {
            return z6m0.c;
        }
        if (iOrdinal == 1) {
            return z6m0.f43877a;
        }
        if (iOrdinal == 2) {
            return z6m0.b;
        }
        t9f.b();
        return null;
    }

    public static final void q(za30 za30Var, fet fetVar, int i) {
        za30 za30Var2 = za30Var;
        fetVar.g0(735019399);
        int i2 = i | (fetVar.g(za30Var2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(za30Var2.f44050a, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 3, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, 0, 24576, 113660);
            n4c.l(null, new lpm(opm.f25648a, new hpm(0L, 3)), false, fetVar, 5);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            za30Var2 = za30Var;
            v8q0.a(za30Var2.b, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 3, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, 0, 24576, 114684);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b120(za30Var2, i, (byte) 19);
        }
    }

    public static final void r(String str, String str2, String str3, long j, String str4, long j2, fet fetVar, int i) {
        fet fetVar2;
        long j3;
        long j4;
        String str5;
        String str6 = str4;
        fetVar.g0(2075751031);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(str3) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024) | (fetVar.g(str6) ? 16384 : 8192) | (fetVar.f(j2) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, null), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVarI);
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
            mm40 mm40VarE = o7k0.e(jm40Var, 14.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar2 = zaq0.b;
            f1t0.a(null, str, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, y9q0VarD, 0L, fetVar, (i2 << 3) & 112, 438265);
            fetVar.r(true);
            mm40 mm40VarE2 = o7k0.e(jm40Var, 14.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            f1t0.a(null, str2, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, g1t0.d(), 0L, fetVar, i2 & 112, 438265);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40 mm40VarE3 = o7k0.e(jm40Var, 32.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, false, null), gqw0.o, fetVar2, 48);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarE3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar4);
            mm40 mm40VarE4 = o7k0.e(jm40Var, 14.0f);
            zx7 zx7Var2 = gqw0.f;
            tj30 tj30VarC3 = zq8.c(zx7Var2, false);
            int iHashCode6 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM6 = fetVar2.m();
            mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarE4);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar);
            jpm0.o(fetVar2, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC5, shdVar4);
            str5 = str3;
            j3 = j;
            G(str5, j3, fetVar2, (i2 >> 6) & 126);
            fetVar2.r(true);
            mm40 mm40VarE5 = o7k0.e(jm40Var, 14.0f);
            tj30 tj30VarC4 = zq8.c(zx7Var2, false);
            int iHashCode7 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM7 = fetVar2.m();
            mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarE5);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC4, shdVar);
            jpm0.o(fetVar2, bh90VarM7, shdVar2);
            vqd.u(iHashCode7, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC6, shdVar4);
            int i3 = (i2 >> 12) & 126;
            str6 = str4;
            j4 = j2;
            G(str6, j4, fetVar2, i3);
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2 = fetVar;
            j3 = j;
            j4 = j2;
            str5 = str3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d15(i, j3, j4, str, str2, str5, str6);
        }
    }

    public static final void s(yf60 yf60Var, Function0 function0, fet fetVar, int i) {
        yf60Var.getClass();
        function0.getClass();
        fetVar.g0(2130837672);
        int i2 = (fetVar.g(yf60Var) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        byte b = 6;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = yf60Var instanceof wf60;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(168633737);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(s5x0.L(s5x0.N(jm40Var, 0.0f, 24.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).c, 0.0f, 2), 60.0f);
                m0x m0xVar = new m0x(R.drawable.ic_glyph_cyber_rainbow_six_swap, null, 6);
                StaticColors staticColors = StaticColors.INSTANCE;
                obc.q(mm40VarE, new rqm((vui0) new tui0(((wf60) yf60Var).f39055a, new y3d(staticColors.m123getWhite0d7_KjU())), (pui0) new nui0(Integer.valueOf(R.drawable.ic_round_placeholder), null, m0xVar, null, null, new pc5(new y3d(staticColors.m125getWhite100d7_KjU())), 360.0f, 154), (pvi0) new fvi0(new y3d(staticColors.m123getWhite0d7_KjU())), d4d.STATIC_WHITE10, (tvi0) null, (wui0) null, false, (e900) null, Response.NOT_ACCEPTABLE_HERE), false, null, function0, null, null, null, fetVar, (i2 << 9) & 57344, 236);
                fetVar.r(false);
            } else {
                if (!yf60Var.equals(xf60.f40778a)) {
                    throw b1j.f(-964392947, fetVar, false);
                }
                fetVar.e0(169810962);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(s5x0.L(s5x0.N(jm40Var, 0.0f, 24.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).c, 0.0f, 2), 60.0f);
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(yf60Var, function0, i, b);
        }
    }

    public static final void t(ab30 ab30Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1751005237);
        int i2 = i | (fetVar2.g(ab30Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 20.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(ab30Var.f561a, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, 48, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b120(ab30Var, i, (byte) 16);
        }
    }

    public static final void u(sdm0 sdm0Var, boolean z, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-146158834);
        int i2 = (fetVar.g(sdm0Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(1275286485);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1275287409);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(bmd.n.a(k6zVar), u1c.M(-753393256, new tf00(sdm0Var, b), fetVar), fetVar, 56);
            L(sdm0Var.d, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20((Object) sdm0Var, z, i, (byte) 10);
        }
    }

    public static final void v(String str, String str2, int i, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1699871257);
        int i4 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
            w6n w6nVar = w6n.h;
            zcl zclVar = qmk.f28987a;
            M(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), str, w6nVar, fetVar, ((i4 << 3) & 112) | 384, 0);
            i3 = i;
            c(str2, 5, i3, fetVar, ((i4 >> 3) & 14) | 384);
            fetVar.r(true);
        } else {
            i3 = i;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph((byte) 8, i3, i2, str, str2);
        }
    }

    public static final void w(qdm0 qdm0Var, boolean z, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-660839387);
        int i2 = (fetVar.g(qdm0Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(588514380);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(588515304);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(bmd.n.a(k6zVar), u1c.M(-640642085, new xf00(qdm0Var, b), fetVar), fetVar, 56);
            L(qdm0Var.c, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20((Object) qdm0Var, z, i, (byte) 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r27v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v6, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v8, types: [a.fet] */
    public static final void x(mm40 mm40Var, boolean z, String str, String str2, String str3, fet fetVar, int i) {
        String str4;
        ?? r6;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        pcy pcyVar;
        ?? r0;
        ?? r7;
        byte b;
        boolean z2;
        ?? r8;
        String str5 = str3;
        fetVar.g0(452397533);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str5) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            thg0 thg0VarA = shg0.a(z ? uc9.b : uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar6);
            jpm0.n(fetVar);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar7);
            if (z) {
                fetVar.e0(664083866);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                zcl zclVar = qmk.f28987a;
                int i3 = (i2 >> 6) & 14;
                pcyVar = pcyVar2;
                shdVar = shdVar7;
                shdVar2 = shdVar6;
                shdVar3 = shdVar4;
                r0 = 0;
                v8q0.a(str, s5x0.N(x7zVar, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 3, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, i3, 24576, 113660);
                fet fetVar2 = fetVar;
                fetVar2.r(false);
                r7 = fetVar2;
            } else {
                fet fetVar3 = fetVar;
                shdVar = shdVar7;
                shdVar2 = shdVar6;
                shdVar3 = shdVar4;
                pcyVar = pcyVar2;
                r0 = 0;
                fetVar3.e0(664384969);
                fetVar3.r(false);
                r7 = fetVar3;
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, r7, r0);
            int iHashCode2 = Long.hashCode(r7.T);
            bh90 bh90VarM2 = r7.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(r7, jm40Var);
            r7.i0();
            if (r7.S) {
                r7.l(pcyVar);
            } else {
                r7.r0();
            }
            jpm0.o(r7, x5dVarA, shdVar3);
            jpm0.o(r7, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, r7, shdVar2, r7);
            jpm0.o(r7, mm40VarC1, shdVar);
            ?? r2 = (i2 & 7168) == 2048 ? 1 : r0;
            Object objP = r7.P();
            byte b2 = 5;
            Object obj = ukd.f35823a;
            if (r2 != 0 || objP == obj) {
                str4 = str2;
                objP = new l00(str4, b2);
                r7.o0(objP);
            } else {
                str4 = str2;
            }
            kkb.p(1, r7, null, (Function0) objP);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            ?? r10 = (57344 & i2) == 16384 ? 1 : r0;
            Object objP2 = r7.P();
            if (r10 != 0 || objP2 == obj) {
                str5 = str3;
                b = 6;
                objP2 = new l00(str5, b);
                r7.o0(objP2);
            } else {
                str5 = str3;
                b = 6;
            }
            kkb.p(r0, r7, mm40VarN, (Function0) objP2);
            r7.r(true);
            if (z) {
                z2 = true;
                r7.e0(665647785);
                r7.r(r0);
                r8 = r7;
            } else {
                r7.e0(665342838);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                ?? r27 = r7;
                z2 = true;
                v8q0.a(str, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 3, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), r7), r27, (i2 >> b) & 14, 24576, 113660);
                ?? r9 = r27;
                r9.r(r0);
                r8 = r9;
            }
            r8.r(z2);
            r6 = r8;
        } else {
            fet fetVar4 = fetVar;
            str4 = str2;
            fetVar4.X();
            r6 = fetVar4;
        }
        yfe0 yfe0VarU = r6.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(mm40Var, z, str, str4, str5, i);
        }
    }

    public static final void y(mm40 mm40Var, sx80 sx80Var, boolean z, Function0 function0, fet fetVar, int i) {
        Function0 function1 = function0;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(326077064);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(sx80Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new a2z(function1, (byte) 25);
                fetVar2.o0(objP);
            }
            mm40 mm40VarO = feb.O(mm40Var, (Function0) objP);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarO);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 64.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
            n0x n0xVar = sx80Var.c;
            m0x m0xVar = sx80Var.d;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            pge pgeVar = gqw0.B;
            mm40 mm40VarN2 = o7k0.n(jm40Var, 36.0f);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            lgb.w(jr8Var.b(mm40VarN2, zx7Var), jr8Var.b(o7k0.n(jm40Var, 36.0f), zx7Var), n0xVar, m0xVar, secondary, null, null, pgeVar, fetVar, 12582912, 96);
            fetVar.r(true);
            mm40 mm40VarE0 = o2e.e0(s5x0.L(jm40Var, 8.0f, 0.0f, 2).e(new x7z(1.0f, true)), "PARTNER_TOP_INFO_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            boolean z4 = false;
            v8q0.a(sx80Var.f32964a, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 110586);
            v8q0.a(sx80Var.b, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40 mm40VarN3 = o7k0.n(jm40Var, 40.0f);
            zb zbVar = new zb(null, null, 7);
            if (i3 == 2048) {
                z4 = true;
            }
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                function1 = function0;
                objP2 = new a2z(function1, (byte) 26);
                fetVar2.o0(objP2);
            } else {
                function1 = function0;
            }
            acb.n(zbVar, z, (Function0) objP2, mm40VarN3, fetVar2, (i2 >> 3) & 112, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 26, i, (Object) mm40Var, (Object) sx80Var, (Object) function1, z);
        }
    }

    public static final void z(mm40 mm40Var, zdm0 zdm0Var, boolean z, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        zdm0Var.getClass();
        fetVar.g0(1621267323);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zdm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            hew0.e(s5x0.K(mm40VarD, qmk.a(fetVar).c, 8.0f), vgg0.a(12.0f), jar0.P(((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), fetVar), null, u1c.M(1474249325, new o3m((Object) zdm0Var, z, (byte) 4), fetVar), fetVar2, 196608, 24);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sf00(mm40Var2, zdm0Var, z, i, (byte) 1);
        }
    }
}
