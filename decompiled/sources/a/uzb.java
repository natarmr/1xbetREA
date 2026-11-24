package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalFieldView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uzb {
    public static final void A(zhf zhfVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-321927706);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(zhfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = x4o.f40276a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(clzVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(zhfVar, clzVar, (byte) 5);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = (i3 == 4) | fetVar.i(clzVar);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(zhfVar, clzVar, b);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, zhfVar, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(zhfVar, i, (byte) 27);
        }
    }

    public static final void A0(a1o0 a1o0Var, zhf zhfVar) {
        CrystalFieldView crystalFieldView = a1o0Var.h;
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!crystalFieldView.isLaidOut() || crystalFieldView.isLayoutRequested()) {
            crystalFieldView.addOnLayoutChangeListener(new djl(a1o0Var, zhfVar, (byte) 2));
        } else {
            crystalFieldView.setCrystalGameState(zhfVar.c);
        }
    }

    public static final void B(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fet fetVar2;
        fetVar.g0(-969740909);
        int i4 = i2 & 1;
        byte b = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            v3c.u(mm40Var2, lv00.d, lv00.e, lv00.f, fetVar2, (i3 & 14) | 28032, 2);
            mm40Var = mm40Var2;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s84(mm40Var, i, i2, b);
        }
    }

    public static final void B0(a1o0 a1o0Var, zhf zhfVar) {
        TextView textView = a1o0Var.f;
        TextView textView2 = a1o0Var.g;
        shf shfVar = zhfVar.b;
        textView.setText(shfVar.f32208a);
        boolean z = shfVar.d;
        textView.setVisibility(z ? 0 : 8);
        textView2.setText(shfVar.b);
        textView2.setVisibility(z ? 0 : 8);
        a1o0Var.i.setPlayersName(shfVar);
        TextView textView3 = a1o0Var.e;
        textView3.setText(shfVar.c);
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        a3e a3eVar = (a3e) layoutParams;
        textView3.setGravity(textView.getVisibility() == 0 ? 17 : 3);
        textView3.setLayoutParams(a3eVar);
    }

    public static final void C(mm40 mm40Var, diw diwVar, qdz qdzVar, g5h g5hVar, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        g5h g5hVar2;
        float f;
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(790591615);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(diwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.e(g5hVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40Var2 = mm40Var;
            xcz xczVarB = qdzVar.b(diwVar.f6157a, new x2w((byte) 13), fetVar, i3 & 896);
            g5hVar2 = g5hVar;
            if (g5hVar2 == g5h.EVENT_FOCUS) {
                fetVar.e0(-1085420346);
                fetVar.r(false);
                zcl zclVar = qmk.f28987a;
                f = 8.0f;
            } else {
                fetVar.e0(-1085384882);
                zcl zclVar2 = qmk.f28987a;
                f = qmk.a(fetVar).c;
                fetVar.r(false);
            }
            bvl bvlVar = diwVar.b;
            boolean z = (57344 & i3) == 16384;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dht(function1, (byte) 18);
                fetVar.o0(objP);
            }
            ju70.p(mm40Var2, bvlVar, xczVarB, f, (Function1) objP, fetVar, i3 & 14, 0);
            mm40Var = mm40Var2;
        } else {
            g5hVar2 = g5hVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, diwVar, qdzVar, g5hVar2, function1, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    public static final void C0(dpi0 dpi0Var, oz10 oz10Var, boolean z) {
        int i = 0;
        boolean z2 = cy7.c() && z;
        List listT0 = oz10Var.f;
        if (z2) {
            listT0 = CollectionsKt.t0(listT0);
        }
        int i2 = z2 ? 0 : q3d.i(listT0);
        for (Object obj : listT0) {
            int i3 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            te90 te90Var = (te90) obj;
            if (i == i2) {
                int i4 = gql0.f11739a;
                int i5 = oz10Var.o;
                if (i5 <= 0) {
                    v0(dpi0Var, te90Var, z);
                } else if (i5 == 1) {
                    t0(dpi0Var, te90Var, z);
                } else {
                    u0(dpi0Var, te90Var, z);
                }
            } else {
                v0(dpi0Var, te90Var, z);
            }
            if (i != listT0.size() - 1) {
                W(dpi0Var, Separators.COMMA);
                W(dpi0Var, Separators.SP);
            }
            i = i3;
        }
    }

    public static final void D(mm40 mm40Var, List list, hzc0 hzc0Var, hh80 hh80Var, boolean z, Integer num, Function2 function2, fet fetVar, int i) {
        int i2;
        hzc0 hzc0Var2;
        Function2 function3;
        Object bomVar;
        ngv ngvVar;
        fetVar.g0(899866126);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            hzc0Var2 = hzc0Var;
            i2 |= fetVar.g(hzc0Var2) ? 256 : 128;
        } else {
            hzc0Var2 = hzc0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(num) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function3 = function2;
            i2 |= fetVar.i(function3) ? 1048576 : 524288;
        } else {
            function3 = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 599187) != 599186)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 272.0f);
            mm40 mm40VarE = o7k0.e(mm40Var, (list.size() > 1 || z) ? 184.0f : 88.0f);
            ngv ngvVar2 = new ngv((list.size() > 1 || z) ? 2 : 1);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = !z;
            boolean zG = ((57344 & i2) == 16384) | fetVar.g(mm40VarS) | ((i2 & 896) == 256) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(list))) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                ngvVar = ngvVar2;
                bomVar = new bom(z, list, mm40VarS, hzc0Var2, num, function3, (byte) 1);
                fetVar.o0(bomVar);
            } else {
                bomVar = objP;
                ngvVar = ngvVar2;
            }
            g8x.h(ngvVar, mm40VarE, null, hh80Var, qw3Var2, qw3Var, null, z2, null, (Function1) bomVar, fetVar, i2 & 7168, 0, 660);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new com(mm40Var, list, hzc0Var, hh80Var, z, num, function2, i, (byte) 1);
        }
    }

    public static final void D0(dpi0 dpi0Var, oz10 oz10Var, boolean z) {
        String str = oz10Var.g;
        boolean z2 = oz10Var.h;
        boolean z3 = oz10Var.j;
        String str2 = oz10Var.i;
        if (str.length() <= 0 && str2.length() <= 0) {
            return;
        }
        if (cy7.c() && z) {
            V(dpi0Var, str2, g0(z3));
            W(dpi0Var, "-");
            V(dpi0Var, str, g0(z2));
            W(dpi0Var, Separators.COLON);
            return;
        }
        W(dpi0Var, Separators.COLON);
        V(dpi0Var, str, g0(z2));
        W(dpi0Var, "-");
        V(dpi0Var, str2, g0(z3));
    }

    public static final void E(mm40 mm40Var, j0n j0nVar, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-383407068);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(j0nVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 8.0f, 5);
            mpm mpmVar = j0nVar.d;
            g0n g0nVar = j0nVar.b;
            K(mm40VarN, mpmVar, j0nVar.f15689a, fetVar2, 0);
            if (g0nVar instanceof e0n) {
                fetVar2.e0(-789609610);
                e0n e0nVar = (e0n) g0nVar;
                rcb.x(null, e0nVar.f6996a, h2m.c, e0nVar.b, e0nVar.d, null, fetVar, 384);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str = e0nVar.c;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                z = true;
                v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                if (Intrinsics.d(g0nVar, f0n.f8723a)) {
                    fetVar2.e0(-788781879);
                    j6n.h("VAR", oro0.f25744a, null, 0, 0, fetVar2, 54, 28);
                    fetVar2.r(false);
                } else {
                    if (g0nVar != null) {
                        throw b1j.f(1914188546, fetVar2, false);
                    }
                    fetVar2.e0(-788613518);
                    fetVar2.r(false);
                }
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 28, i, mm40Var, j0nVar);
        }
    }

    public static final egd E0(j6z j6zVar, float f, float f2, float f3, float f4, int i) {
        j6zVar.getClass();
        int iB = si30.b(((int) (j6zVar.g() >> 32)) + f + f3);
        if (iB < 0) {
            iB = 0;
        }
        int iB2 = si30.b(((int) (j6zVar.g() & 4294967295L)) + f2 + f4);
        rkx rkxVar = new rkx(iB, iB2 >= 0 ? iB2 : 0);
        j6z j6zVarU = j6zVar.U();
        float fIntBitsToFloat = Float.intBitsToFloat((int) ((j6zVarU != null ? j6zVarU.I(j6zVar, 0L) : 0L) >> 32)) - f;
        j6z j6zVarU2 = j6zVar.U();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) ((j6zVarU2 != null ? j6zVarU2.I(j6zVar, 0L) : 0L) & 4294967295L)) - f2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6zVar.Y(0L) >> 32)) - f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6zVar.Y(0L) & 4294967295L)) - f2)) & 4294967295L);
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6zVar.G(0L) >> 32)) - f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6zVar.G(0L) & 4294967295L)) - f2)) & 4294967295L);
        jge0 jge0VarW = k7x.C(j6zVar).w(j6zVar, true);
        pge0 pge0Var = new pge0(jge0VarW.f16474a - f, jge0VarW.b - f2, jge0VarW.c + f3, jge0VarW.d + f4);
        jge0 jge0VarZ = k7x.z(j6zVar, true);
        return new egd(rkxVar, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, pge0Var, new pge0(jge0VarZ.f16474a - f, jge0VarZ.b - f2, jge0VarZ.c + f3, jge0VarZ.d + f4), i, j6zVar.h());
    }

    public static final void F(mm40 mm40Var, boolean z, ows0 ows0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        int i2 = ows0Var.b;
        fetVar2.g0(-1002193271);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ows0Var) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
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
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new b0n(ows0Var, (byte) 2);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            if (i2 > 0) {
                fetVar2.e0(2132135190);
                tdc.e(new rpe(i2), ipe.f15159a, ffb0.Q(jr8.f16991a.b(jm40Var, z ? gqw0.i : gqw0.g), z ? 3.0f : -3.0f, 2.0f), fetVar2, 48, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(2132756957);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            kc5.N(ows0Var.f25981a, o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 36.0f), 0L, null, null, 0L, qmk.q, g1t0.m().f42262a.b, null, null, 0L, gqw0.e, 2, false, 2, 0, false, null, y9q0.a(ibm0.t(g1t0.l(), fetVar2), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), 0.0f, fetVar, 0, 1600512, 0, 3055420);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c0n(mm40Var, z, ows0Var, i, (byte) 2);
        }
    }

    public static final void G(mm40 mm40Var, String str, a4x a4xVar, String str2, boolean z, fet fetVar, int i) {
        int i2;
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1946551398);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(a4xVar) : fetVar2.i(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            int i3 = i2 >> 3;
            v8q0.a(str3, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar2, i3 & 14, 24960, 110586);
            m((i3 & 112) | ((i2 >> 6) & 896), fetVar2, a4xVar, null, z);
            if (str2.length() > 0) {
                fetVar2.e0(1192130494);
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                v8q0.a(str2, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 9) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(1192386430);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtm(mm40Var, str, a4xVar, str2, z, i, (byte) 1);
        }
    }

    public static final wif G0(djf djfVar) {
        njf njfVar;
        njf njfVar2;
        Integer num;
        Integer num2;
        Object next;
        Object next2;
        List list = djfVar.f6183a;
        List list2 = djfVar.c;
        int iIntValue = 0;
        vjf vjfVar = list != null ? (vjf) CollectionsKt.W(0, list) : null;
        vjf vjfVar2 = list != null ? (vjf) CollectionsKt.W(1, list) : null;
        if (list2 != null) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.d(vjfVar != null ? vjfVar.f37525a : null, ((njf) next2).f23632a));
            njfVar = (njf) next2;
        } else {
            njfVar = null;
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.d(vjfVar2 != null ? vjfVar2.f37525a : null, ((njf) next).f23632a));
            njfVar2 = (njf) next;
        } else {
            njfVar2 = null;
        }
        List list3 = njfVar != null ? njfVar.c : null;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        List list4 = njfVar2 != null ? njfVar2.c : null;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        ArrayList arrayListN0 = n0(djfVar, njfVar);
        ArrayList arrayListN1 = n0(djfVar, njfVar2);
        sjf sjfVarC0 = wzb.C0(vjfVar);
        sjf sjfVarC1 = wzb.C0(vjfVar2);
        ArrayList arrayList = new ArrayList(r3d.q(arrayListN0, 10));
        Iterator it3 = arrayListN0.iterator();
        while (it3.hasNext()) {
            arrayList.add(vzb.n0((ajf) it3.next(), list3));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListN1, 10));
        Iterator it4 = arrayListN1.iterator();
        while (it4.hasNext()) {
            arrayList2.add(vzb.n0((ajf) it4.next(), list4));
        }
        String str = njfVar != null ? njfVar.f23632a : null;
        if (str == null) {
            str = "";
        }
        int iIntValue2 = (njfVar == null || (num2 = njfVar.b) == null) ? 0 : num2.intValue();
        ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
        Iterator it5 = list3.iterator();
        while (it5.hasNext()) {
            arrayList3.add(feb.i0((kjf) it5.next()));
        }
        hjf hjfVar = new hjf(str, arrayList3, iIntValue2);
        String str2 = njfVar2 != null ? njfVar2.f23632a : null;
        String str3 = str2 != null ? str2 : "";
        if (njfVar2 != null && (num = njfVar2.b) != null) {
            iIntValue = num.intValue();
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
        Iterator it6 = list4.iterator();
        while (it6.hasNext()) {
            arrayList4.add(feb.i0((kjf) it6.next()));
        }
        return new wif(sjfVarC0, sjfVarC1, arrayList, arrayList2, hjfVar, new hjf(str3, arrayList4, iIntValue));
    }

    public static final void H(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-2129025047);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(a4xVar) ? 2048 : 1024) | (fetVar.g(a4xVar2) ? 16384 : 8192) | (fetVar.g(str3) ? 131072 : 65536) | (fetVar.g(str4) ? 1048576 : 524288) | (fetVar.g(kpmVar) ? 8388608 : 4194304) | (fetVar.h(z) ? 67108864 : 33554432);
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 >> 3;
            int i4 = i2 >> 6;
            G(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str, a4xVar, str3, true, fetVar, (i2 & 112) | 24576 | (i3 & 896) | (i4 & 7168));
            n4c.l(null, kpmVar, z, fetVar, 1);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            G(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str2, a4xVar2, str4, false, fetVar, (i3 & 112) | 24576 | (i4 & 896) | ((i2 >> 9) & 7168));
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ctm(mm40Var2, str, str2, a4xVar, a4xVar2, str3, str4, kpmVar, z, i);
        }
    }

    public static final gul H0(int i) {
        if (i == 0) {
            return gul.e;
        }
        if (i == 1) {
            return gul.f;
        }
        if (i == 2) {
            return gul.g;
        }
        if (i != 3) {
            return i != 4 ? gul.e : gul.i;
        }
        return gul.h;
    }

    public static final void I(mm40 mm40Var, hzc0 hzc0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-601083929);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(hzc0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(lgb.J(mm40Var, vgg0.a(16.0f)), 88.0f), vbc.d0(vqm.f37862a, fetVar, 0, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(mm40Var, hzc0Var, i, b);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x02b5: RETURN (r1v0 ?? I:??[OBJECT, ARRAY]) (LINE:107)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final a.mxp I0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x02b5: RETURN (r1v0 ?? I:??[OBJECT, ARRAY]) (LINE:107)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r47v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */

    public static final void J(mm40 mm40Var, n0x n0xVar, izc0 izc0Var, Integer num, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        long secondary20;
        long secondary40;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.A;
        fetVar2.g0(1225416021);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(n0xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(izc0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        int i3 = i2;
        byte b = 1;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var2, 80.0f), vgg0.a(12.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objA = n0xVar.a();
            boolean z = ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new f8m(b, n0xVar, pz40Var, function1);
                fetVar2.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(objA, (Function1) objP2, null, fetVar2, 0, 26);
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar2.e0(-852461613);
                jm40Var = jm40Var2;
                fetVar2 = fetVar;
                j0x.b(mz3VarX, null, mm40VarJ, null, pgeVar, 0.0f, null, fetVar2, 24624, 104);
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2 = fetVar2;
                if (num != null) {
                    fetVar2.e0(-852201864);
                    j0x.b(a8k0.F(num.intValue(), (i3 >> 9) & 14, fetVar2), null, mm40VarJ, null, pgeVar, 0.0f, null, fetVar2, 24632, 104);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-851918617);
                    boolean z2 = izc0Var instanceof gzc0;
                    if (z2) {
                        fetVar2.e0(803809372);
                        secondary20 = afn0.p(fetVar2).m125getWhite100d7_KjU();
                        fetVar2.r(false);
                    } else {
                        if (!(izc0Var instanceof hzc0)) {
                            throw b1j.f(803805994, fetVar2, false);
                        }
                        fetVar2.e0(803812416);
                        secondary20 = afn0.m(fetVar2).getSecondary20();
                        fetVar2.r(false);
                    }
                    mm40 mm40VarQ = i120.Q(mm40VarJ, secondary20, jd8.n);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_sand_clock, 0, fetVar2);
                    if (z2) {
                        fetVar2.e0(1273912181);
                        secondary40 = afn0.p(fetVar2).m129getWhite400d7_KjU();
                        fetVar2.r(false);
                    } else {
                        if (!(izc0Var instanceof hzc0)) {
                            throw b1j.f(1273908919, fetVar2, false);
                        }
                        fetVar2.e0(1273915097);
                        secondary40 = afn0.m(fetVar2).getSecondary40();
                        fetVar2.r(false);
                    }
                    dww.c(pm80VarF, null, jr8.f16991a.b(o7k0.n(jm40Var, 40.0f), gqw0.e), secondary40, fetVar, 56, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, (Object) n0xVar, (Object) izc0Var, (Object) num, (Object) function1, i, (byte) 20);
        }
    }

    public static final y9q0 J0(aw20 aw20Var) {
        aw20Var.getClass();
        int iOrdinal = aw20Var.f1552a.ordinal();
        if (iOrdinal == 0) {
            return new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
        }
        if (iOrdinal == 1) {
            return new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109);
        }
        if (iOrdinal == 2) {
            return new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109);
        }
        if (iOrdinal == 3) {
            return new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109);
        }
        if (iOrdinal == 4) {
            return new y9q0(0L, qmk.w, null, j1t0.b, 0L, null, 0, 0, qmk.I, 16646109);
        }
        t9f.b();
        return null;
    }

    public static final void K(mm40 mm40Var, mpm mpmVar, boolean z, fet fetVar, int i) {
        fetVar.g0(535666116);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mpmVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n4c.l(mm40Var, mpmVar, z, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwm(mm40Var, mpmVar, z, i, (byte) 3);
        }
    }

    public static final y0n K0(bca bcaVar) {
        return new y0n(0, bcaVar.b, bcaVar.f2346a);
    }

    public static final void L(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-888125483);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 48.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 64.0f), 12.0f);
            zcl zclVar3 = qmk.m;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, b);
        }
    }

    public static final byp L0(eyp eypVar) {
        Float f;
        Integer num;
        return new byp((eypVar == null || (f = eypVar.b) == null) ? -1.0f : f.floatValue(), (eypVar == null || (num = eypVar.f8637a) == null) ? -1 : num.intValue());
    }

    public static final void M(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(306170153);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(r2n.f29744a) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            if (str2.length() > 0) {
                fetVar2.e0(1290302428);
                j6n.h(str2, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 6) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1290449461);
                fetVar2.r(false);
            }
            fetVar2.e0(-928201071);
            fetVar2.r(false);
            long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i, (byte) 24);
        }
    }

    public static final ArrayList M0(List list, z9s z9sVar) {
        boolean z;
        Iterator it;
        Iterator it2;
        boolean z2;
        long j;
        boolean z3;
        list.getClass();
        z9sVar.getClass();
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            d0t d0tVarA = (d0t) it3.next();
            List list2 = d0tVarA.K;
            List list3 = d0tVarA.k;
            long j2 = d0tVarA.x;
            List list4 = z9sVar.c;
            List list5 = z9sVar.b;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, i));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                BetGroupZip betGroupZipA = (BetGroupZip) it4.next();
                List<BetZip> list6 = betGroupZipA.f;
                ArrayList arrayList3 = new ArrayList(r3d.q(list6, i));
                for (BetZip betZip : list6) {
                    if (list4 != null && list4.isEmpty()) {
                        it = it3;
                        it2 = it4;
                        z2 = false;
                        break;
                    }
                    Iterator it5 = list4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            it = it3;
                            it2 = it4;
                            z2 = false;
                            break;
                        }
                        m97 m97Var = ((pbs0) it5.next()).b;
                        it = it3;
                        it2 = it4;
                        if (m97Var.f21398a == betZip.m && m97Var.h == betZip.f46426a && m97Var.k == betZip.d && m97Var.f == betZip.o) {
                            z2 = true;
                            break;
                        }
                        it3 = it;
                        it4 = it2;
                    }
                    if (list5 != null && list5.isEmpty()) {
                        j = j2;
                        z3 = false;
                        break;
                    }
                    Iterator it6 = list5.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            j = j2;
                            z3 = false;
                            break;
                        }
                        ru6 ru6Var = (ru6) it6.next();
                        j = j2;
                        if (ru6Var.d == betZip.m && ru6Var.h == betZip.f46426a && ru6Var.f == betZip.d) {
                            if (ru6Var.g == betZip.o) {
                                z3 = true;
                                break;
                            }
                        }
                        it6 = it6;
                        j2 = j;
                    }
                    if (z2 != betZip.w || z3 != betZip.y) {
                        long j3 = betZip.f46426a;
                        boolean z4 = z2;
                        boolean z5 = z3;
                        double d = betZip.b;
                        long j4 = betZip.c;
                        double d2 = betZip.d;
                        String str = betZip.e;
                        boolean z6 = betZip.f;
                        String str2 = betZip.g;
                        String str3 = betZip.h;
                        BetPlayerZip betPlayerZip = betZip.i;
                        int i2 = betZip.j;
                        long j5 = betZip.k;
                        uoy uoyVar = betZip.l;
                        long j6 = betZip.m;
                        int i3 = betZip.n;
                        long j7 = betZip.o;
                        boolean z7 = betZip.p;
                        long j8 = betZip.q;
                        boolean z8 = betZip.r;
                        PlayersDuelZip playersDuelZip = betZip.s;
                        String str4 = betZip.t;
                        String str5 = betZip.u;
                        izc izcVar = betZip.v;
                        boolean z9 = betZip.x;
                        boolean z10 = betZip.z;
                        String str6 = betZip.A;
                        boolean z11 = betZip.B;
                        boolean z12 = betZip.Y;
                        String str7 = betZip.Z;
                        boolean z13 = betZip.f1;
                        boolean z14 = betZip.g1;
                        boolean z15 = betZip.h1;
                        EventParams eventParams = betZip.i1;
                        str.getClass();
                        str2.getClass();
                        str3.getClass();
                        betPlayerZip.getClass();
                        uoyVar.getClass();
                        playersDuelZip.getClass();
                        str4.getClass();
                        str5.getClass();
                        izcVar.getClass();
                        str6.getClass();
                        str7.getClass();
                        eventParams.getClass();
                        betZip = new BetZip(j3, d, j4, d2, str, z6, str2, str3, betPlayerZip, i2, j5, uoyVar, j6, i3, j7, z7, j8, z8, playersDuelZip, str4, str5, izcVar, z4, z9, z5, z10, str6, z11, z12, str7, z13, z14, z15, eventParams);
                    }
                    arrayList3.add(betZip);
                    it3 = it;
                    it4 = it2;
                    j2 = j;
                }
                Iterator it7 = it3;
                Iterator it8 = it4;
                long j9 = j2;
                if (!arrayList3.equals(betGroupZipA.f)) {
                    betGroupZipA = BetGroupZip.a(betGroupZipA, arrayList3, false, 479);
                }
                arrayList2.add(betGroupZipA);
                it3 = it7;
                it4 = it8;
                j2 = j9;
                i = 10;
            }
            Iterator it9 = it3;
            long j10 = j2;
            boolean zContains = z9sVar.f44035a.contains(Long.valueOf(j10));
            List list7 = z9sVar.f;
            if (list7 != null && list7.isEmpty()) {
                z = false;
                break;
            }
            Iterator it10 = list7.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    z = false;
                    break;
                }
                if (((ots) it10.next()).f25844a == j10) {
                    z = true;
                    break;
                }
            }
            ArrayList arrayListM0 = M0(list3, z9sVar);
            if (zContains != d0tVarA.E || z != d0tVarA.D || !arrayList2.equals(d0tVarA.K) || !arrayListM0.equals(list3)) {
                d0tVarA = d0t.a(d0tVarA, arrayListM0, z, zContains, false, false, arrayList2, -1610613761, 16367);
            }
            arrayList.add(d0tVarA);
            it3 = it9;
            i = 10;
        }
        return arrayList;
    }

    public static final void N(mm40 mm40Var, String str, izc0 izc0Var, String str2, fet fetVar, int i) {
        mm40 mm40Var2;
        long textPrimary;
        long secondary;
        fet fetVar2 = fetVar;
        fetVar2.g0(1140435510);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(izc0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            xx7 xx7Var = gqw0.m;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarL = g1t0.l();
            boolean z = izc0Var instanceof gzc0;
            if (z) {
                fetVar2.e0(-1577151899);
                textPrimary = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar2.r(false);
            } else {
                if (!(izc0Var instanceof hzc0)) {
                    throw b1j.f(-1577154929, fetVar2, false);
                }
                fetVar2.e0(-1577149301);
                textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                fetVar2.r(false);
            }
            v8q0.a(str, o2e.e0(jm40Var, "PROMOTION_TITLE_TEXT"), textPrimary, new n05(qmk.q, qmk.r, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarL, fetVar2, ((i2 >> 3) & 14) | 48, 24960, 110576);
            if (str2 == null || str2.length() == 0) {
                fetVar2 = fetVar2;
                mm40Var2 = jm40Var;
                fetVar2.e0(-1646114462);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1646613531);
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                y9q0 y9q0VarG = g1t0.g();
                if (z) {
                    fetVar2.e0(-1577130329);
                    secondary = ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                    fetVar2.r(false);
                } else {
                    if (!(izc0Var instanceof hzc0)) {
                        throw b1j.f(-1577133477, fetVar2, false);
                    }
                    fetVar2.e0(-1577127543);
                    secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                    fetVar2.r(false);
                }
                mm40Var2 = jm40Var;
                v8q0.a(str2, o2e.e0(mm40Var2, "PROMOTION_SUBTITLE_TEXT"), secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarG, fetVar2, ((i2 >> 9) & 14) | 48, 24960, 110584);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 15, i, (Object) mm40Var2, (Object) str, (Object) izc0Var, (Object) str2);
        }
    }

    public static final void O(mm40 mm40Var, List list, hzc0 hzc0Var, hh80 hh80Var, boolean z, Integer num, Function2 function2, fet fetVar, int i) {
        int i2;
        hzc0 hzc0Var2;
        boolean z2;
        Function2 function3;
        fetVar.g0(746530144);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            hzc0Var2 = hzc0Var;
            i2 |= fetVar.g(hzc0Var2) ? 256 : 128;
        } else {
            hzc0Var2 = hzc0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(num) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function3 = function2;
            i2 |= fetVar.i(function3) ? 1048576 : 524288;
        } else {
            function3 = function2;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((57344 & i3) == 16384) | ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(list))) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                bom bomVar = new bom(z2, list, mm40VarD, hzc0Var2, num, function3, (byte) 0);
                fetVar.o0(bomVar);
                objP = bomVar;
            }
            b8k0.e(mm40Var, null, hh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 14) | ((i3 >> 3) & 896), 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new com(mm40Var, list, hzc0Var, hh80Var, z, num, function2, i, (byte) 0);
        }
    }

    public static wu9 P(kzj kzjVar) {
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            kzjVar.invokeOnCompletion(new fne(tu9Var, kzjVar, (byte) 0));
            tu9Var.f34540a = "Deferred.asListenableFuture";
            return wu9Var;
        } catch (Exception e) {
            wu9Var.b(e);
            return wu9Var;
        }
    }

    public static final String Q(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        String strConcat = "ufcStatistic/v1/image/".concat(str);
        if (strConcat.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
            sb.setLength(0);
            sb.append(strConcat);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strConcat, '/'));
        }
        return sb.toString();
    }

    public static final float R(sjj sjjVar, float f, float f2) {
        glq glqVar = sjjVar.f32306a;
        p73 p73Var = new p73(0.0f);
        int iB = p73Var.b();
        int i = 0;
        while (i < iB) {
            p73Var.e(glqVar.i(i == 0 ? f : 0.0f, i == 0 ? f2 : 0.0f), i);
            i++;
        }
        return p73Var.f26486a;
    }

    public static final void S(dpi0 dpi0Var) {
        if (dpi0Var.k()) {
            W(dpi0Var, Separators.COMMA);
            W(dpi0Var, Separators.SP);
        }
    }

    public static final void T(i8z i8zVar, htr htrVar, Function2 function2, Function1 function1, Function1 function3) {
        i8zVar.getClass();
        htrVar.getClass();
        if (htrVar instanceof ftr) {
            a4x a4xVar = ((ftr) htrVar).f10128a;
            i8zVar.e(a4xVar.size(), new v2m(xdx.E(a4xVar, new aim((byte) 21)), (byte) 16), new a8(new f4m((byte) 15), a4xVar, (byte) 11), new ctl((Object) new aim((byte) 22), (Object) a4xVar, (byte) 17), new ugd(-2091135074, true, new vll(a4xVar, htrVar, function2, function1, function3)));
            return;
        }
        if (!(htrVar instanceof gtr)) {
            t9f.b();
        } else {
            final int i = i0() == 3 ? 12 : 8;
            i8z.f(i8zVar, i, null, null, new ugd(811581122, true, new ydr() { // from class: a.san
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    fet fetVar = (fet) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((k8z) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                    }
                    if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        jcb.e(o7k0.d(s5x0.I(jm40.b, uzb.e0(iIntValue, i)), 1.0f), n9n.f23149a, null, null, null, fetVar, 48, 28);
                    } else {
                        fetVar.X();
                    }
                    return Unit.f46060a;
                }
            }), 14);
        }
    }

    public static /* synthetic */ void U(i8z i8zVar, htr htrVar, Function2 function2, Function1 function1, xz8 xz8Var, int i) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            xz8Var = null;
        }
        T(i8zVar, htrVar, function2, function1, xz8Var);
    }

    public static final void V(dpi0 dpi0Var, String str, long j) {
        dpi0Var.getClass();
        str.getClass();
        h83 h83Var = new h83();
        long j2 = y3d.g;
        long j3 = daq0.c;
        smk0 smk0Var = new smk0(j, j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0.b, null, null, 17424);
        h83Var.c(str);
        ((h83) dpi0Var.f6468a).b(kng0.c(h83Var.f12607a, h83Var, smk0Var, 0));
    }

    public static void W(dpi0 dpi0Var, String str) {
        pz40 pz40Var = s6t0.f31722a;
        V(dpi0Var, str, StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    public static m9s X() {
        iun iunVar = iun.f15405a;
        return new m9s(0L, 0L, iunVar, iunVar, "", "", new ka30(""), new qqs("", "", iunVar, 0, 0, 0, "", 0L, false, false, null, "", false, 0, new oqs(0, 0), 0), "", "", "", "", iunVar, iunVar, 0L, 0L, null, false, false, "", "", 0L, 0L, false, sip.b, "", 0L, 0, false, 0, "", false, "", iunVar, bqg.f3028a, 0, false, boh.UNKNOWN, null, false);
    }

    public static sjj Y(int i) {
        float f = (i & 1) != 0 ? 1.0f : 0.7f;
        yx3 yx3Var = new yx3();
        yx3Var.f43402a = Math.max(1.0E-7f, Math.abs(0.1f));
        yx3Var.b = Math.max(1.0E-4f, f) * (-4.2f);
        return new sjj(yx3Var);
    }

    public static final nqq Z(nqq nqqVar) {
        nqq nqqVarH = ((ypq) vcc.a0(nqqVar).getFocusOwner()).h();
        if (nqqVarH == null || !nqqVarH.n) {
            return null;
        }
        return nqqVarH;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0180  */
    /* JADX WARN: Code duplicated, block: B:102:0x0183  */
    /* JADX WARN: Code duplicated, block: B:105:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0193  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:114:0x0201  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0112  */
    /* JADX WARN: Code duplicated, block: B:75:0x0136  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x013f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0170  */
    /* JADX WARN: Code duplicated, block: B:95:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x0178  */
    /* JADX WARN: Code duplicated, block: B:98:0x017a  */
    public static final void a(mm40 mm40Var, final long j, b7h b7hVar, boolean z, String str, Function1 function1, fet fetVar, final int i, final int i2) {
        mm40 mm40Var2;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        int i6;
        boolean z3;
        Function1 function2;
        b7h b7hVar2;
        final mm40 mm40Var3;
        final boolean z4;
        final String str3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        int i9;
        boolean z7;
        boolean z8;
        Object objP;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objP2;
        int i11;
        fet fetVar2 = fetVar;
        b7hVar.getClass();
        function1.getClass();
        fetVar2.g0(-1402586955);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.g(b7hVar) ? 256 : 128;
        }
        int i13 = i2 & 8;
        if (i13 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= fetVar2.h(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (fetVar2.g(str2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if (fetVar2.i(function1)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i6 = i3;
                if ((74899 & i6) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar2.U(i6 & 1, z3)) {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i13 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    }
                    mm40 mm40VarD = o7k0.d(mm40Var4, 1.0f);
                    zcl zclVar = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarM = s5x0.M(i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 8.0f, 8.0f, 8.0f, 2.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
                    i7 = i6 & 458752;
                    if (i7 == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i8 = i6 & 112;
                    if (i8 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z13 = z5 | z6;
                    i9 = i6 & 896;
                    if (i9 == 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z13 | z7;
                    objP = fetVar2.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (!z8 || objP == cl5Var) {
                        i10 = 131072;
                        v5h v5hVar = new v5h(function1, j, b7hVar, (byte) 0);
                        fetVar2.o0(v5hVar);
                        objP = v5hVar;
                    } else {
                        i10 = 131072;
                    }
                    Function0 function0 = (Function0) objP;
                    if (i7 == i10) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i8 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z14 = z9 | z10;
                    if (i9 == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z14 | z11;
                    objP2 = fetVar2.P();
                    if (!z12 || objP2 == cl5Var) {
                        v5h v5hVar2 = new v5h(function1, j, b7hVar, (byte) 1);
                        function2 = function1;
                        fetVar2.o0(v5hVar2);
                        objP2 = v5hVar2;
                    } else {
                        function2 = function1;
                    }
                    c(b7hVar, z2, str2, function0, (Function0) objP2, fetVar2, (i6 >> 6) & 1022);
                    b7hVar2 = b7hVar;
                    boolean z15 = b7hVar2.c;
                    pzn pznVarB = v6h.b();
                    alo aloVarA = v6h.a();
                    ugd ugdVarM = u1c.M(-691486717, new ab4((Object) b7hVar2, (Object) function2, (byte) 29), fetVar2);
                    y5d y5dVar = y5d.f42040a;
                    b34.e(y5dVar, z15, null, pznVarB, aloVarA, null, ugdVarM, fetVar2, 1572870, 18);
                    fetVar2 = fetVar;
                    b34.e(y5dVar, !b7hVar2.c, null, v6h.b(), v6h.a(), null, ohq0.b, fetVar2, 1572870, 18);
                    fetVar2.r(true);
                    mm40Var3 = mm40Var4;
                } else {
                    function2 = function1;
                    b7hVar2 = b7hVar;
                    fetVar2.X();
                    mm40Var3 = mm40Var2;
                }
                z4 = z2;
                str3 = str2;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final Function1 function3 = function2;
                    final b7h b7hVar3 = b7hVar2;
                    yfe0VarU.d = new Function2() { // from class: a.w5h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uzb.a(mm40Var3, j, b7hVar3, z4, str3, function3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 24576;
            str2 = str;
            if ((196608 & i) == 0) {
                if (fetVar2.i(function1)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i6 = i3;
            if ((74899 & i6) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar2.U(i6 & 1, z3)) {
                if (i12 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i13 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    str2 = null;
                }
                mm40 mm40VarD2 = o7k0.d(mm40Var4, 1.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                mm40 mm40VarM2 = s5x0.M(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD2), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 8.0f, 8.0f, 8.0f, 2.0f);
                x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                i7 = i6 & 458752;
                if (i7 == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                i8 = i6 & 112;
                if (i8 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z16 = z5 | z6;
                i9 = i6 & 896;
                if (i9 == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z16 | z7;
                objP = fetVar2.P();
                cl5 cl5Var2 = ukd.f35823a;
                if (z8) {
                    i10 = 131072;
                    v5h v5hVar3 = new v5h(function1, j, b7hVar, (byte) 0);
                    fetVar2.o0(v5hVar3);
                    objP = v5hVar3;
                } else {
                    i10 = 131072;
                    v5h v5hVar4 = new v5h(function1, j, b7hVar, (byte) 0);
                    fetVar2.o0(v5hVar4);
                    objP = v5hVar4;
                }
                Function0 function4 = (Function0) objP;
                if (i7 == i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i8 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z17 = z9 | z10;
                if (i9 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z17 | z11;
                objP2 = fetVar2.P();
                if (z12) {
                    v5h v5hVar5 = new v5h(function1, j, b7hVar, (byte) 1);
                    function2 = function1;
                    fetVar2.o0(v5hVar5);
                    objP2 = v5hVar5;
                } else {
                    v5h v5hVar6 = new v5h(function1, j, b7hVar, (byte) 1);
                    function2 = function1;
                    fetVar2.o0(v5hVar6);
                    objP2 = v5hVar6;
                }
                c(b7hVar, z2, str2, function4, (Function0) objP2, fetVar2, (i6 >> 6) & 1022);
                b7hVar2 = b7hVar;
                boolean z18 = b7hVar2.c;
                pzn pznVarB2 = v6h.b();
                alo aloVarA2 = v6h.a();
                ugd ugdVarM2 = u1c.M(-691486717, new ab4((Object) b7hVar2, (Object) function2, (byte) 29), fetVar2);
                y5d y5dVar2 = y5d.f42040a;
                b34.e(y5dVar2, z18, null, pznVarB2, aloVarA2, null, ugdVarM2, fetVar2, 1572870, 18);
                fetVar2 = fetVar;
                b34.e(y5dVar2, !b7hVar2.c, null, v6h.b(), v6h.a(), null, ohq0.b, fetVar2, 1572870, 18);
                fetVar2.r(true);
                mm40Var3 = mm40Var4;
            } else {
                function2 = function1;
                b7hVar2 = b7hVar;
                fetVar2.X();
                mm40Var3 = mm40Var2;
            }
            z4 = z2;
            str3 = str2;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final Function1 function5 = function2;
                final b7h b7hVar4 = b7hVar2;
                yfe0VarU.d = new Function2() { // from class: a.w5h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uzb.a(mm40Var3, j, b7hVar4, z4, str3, function5, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (fetVar2.g(str2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if (fetVar2.i(function1)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i6 = i3;
            if ((74899 & i6) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar2.U(i6 & 1, z3)) {
                if (i12 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i13 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    str2 = null;
                }
                mm40 mm40VarD3 = o7k0.d(mm40Var4, 1.0f);
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var3 = vgg0.f37379a;
                mm40 mm40VarM3 = s5x0.M(i120.Q(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD3), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 8.0f, 8.0f, 8.0f, 2.0f);
                x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarM3);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA3, gqw0.x);
                jpm0.o(fetVar2, bh90VarM3, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode3), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC2, gqw0.v);
                i7 = i6 & 458752;
                if (i7 == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                i8 = i6 & 112;
                if (i8 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z19 = z5 | z6;
                i9 = i6 & 896;
                if (i9 == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z19 | z7;
                objP = fetVar2.P();
                cl5 cl5Var3 = ukd.f35823a;
                if (z8) {
                    i10 = 131072;
                    v5h v5hVar7 = new v5h(function1, j, b7hVar, (byte) 0);
                    fetVar2.o0(v5hVar7);
                    objP = v5hVar7;
                } else {
                    i10 = 131072;
                    v5h v5hVar8 = new v5h(function1, j, b7hVar, (byte) 0);
                    fetVar2.o0(v5hVar8);
                    objP = v5hVar8;
                }
                Function0 function6 = (Function0) objP;
                if (i7 == i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i8 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z110 = z9 | z10;
                if (i9 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z110 | z11;
                objP2 = fetVar2.P();
                if (z12) {
                    v5h v5hVar9 = new v5h(function1, j, b7hVar, (byte) 1);
                    function2 = function1;
                    fetVar2.o0(v5hVar9);
                    objP2 = v5hVar9;
                } else {
                    v5h v5hVar10 = new v5h(function1, j, b7hVar, (byte) 1);
                    function2 = function1;
                    fetVar2.o0(v5hVar10);
                    objP2 = v5hVar10;
                }
                c(b7hVar, z2, str2, function6, (Function0) objP2, fetVar2, (i6 >> 6) & 1022);
                b7hVar2 = b7hVar;
                boolean z111 = b7hVar2.c;
                pzn pznVarB3 = v6h.b();
                alo aloVarA3 = v6h.a();
                ugd ugdVarM3 = u1c.M(-691486717, new ab4((Object) b7hVar2, (Object) function2, (byte) 29), fetVar2);
                y5d y5dVar3 = y5d.f42040a;
                b34.e(y5dVar3, z111, null, pznVarB3, aloVarA3, null, ugdVarM3, fetVar2, 1572870, 18);
                fetVar2 = fetVar;
                b34.e(y5dVar3, !b7hVar2.c, null, v6h.b(), v6h.a(), null, ohq0.b, fetVar2, 1572870, 18);
                fetVar2.r(true);
                mm40Var3 = mm40Var4;
            } else {
                function2 = function1;
                b7hVar2 = b7hVar;
                fetVar2.X();
                mm40Var3 = mm40Var2;
            }
            z4 = z2;
            str3 = str2;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final Function1 function7 = function2;
                final b7h b7hVar5 = b7hVar2;
                yfe0VarU.d = new Function2() { // from class: a.w5h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uzb.a(mm40Var3, j, b7hVar5, z4, str3, function7, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 24576;
        str2 = str;
        if ((196608 & i) == 0) {
            if (fetVar2.i(function1)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        i6 = i3;
        if ((74899 & i6) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar2.U(i6 & 1, z3)) {
            if (i12 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i13 != 0) {
                z2 = true;
            }
            if (i4 != 0) {
                str2 = null;
            }
            mm40 mm40VarD4 = o7k0.d(mm40Var4, 1.0f);
            zcl zclVar4 = qmk.i;
            ugg0 ugg0Var4 = vgg0.f37379a;
            mm40 mm40VarM4 = s5x0.M(i120.Q(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarD4), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 8.0f, 8.0f, 8.0f, 2.0f);
            x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarM4);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA4, gqw0.x);
            jpm0.o(fetVar2, bh90VarM4, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode4), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC3, gqw0.v);
            i7 = i6 & 458752;
            if (i7 == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            i8 = i6 & 112;
            if (i8 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z112 = z5 | z6;
            i9 = i6 & 896;
            if (i9 == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z112 | z7;
            objP = fetVar2.P();
            cl5 cl5Var4 = ukd.f35823a;
            if (z8) {
                i10 = 131072;
                v5h v5hVar11 = new v5h(function1, j, b7hVar, (byte) 0);
                fetVar2.o0(v5hVar11);
                objP = v5hVar11;
            } else {
                i10 = 131072;
                v5h v5hVar12 = new v5h(function1, j, b7hVar, (byte) 0);
                fetVar2.o0(v5hVar12);
                objP = v5hVar12;
            }
            Function0 function8 = (Function0) objP;
            if (i7 == i10) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i8 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z113 = z9 | z10;
            if (i9 == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z113 | z11;
            objP2 = fetVar2.P();
            if (z12) {
                v5h v5hVar13 = new v5h(function1, j, b7hVar, (byte) 1);
                function2 = function1;
                fetVar2.o0(v5hVar13);
                objP2 = v5hVar13;
            } else {
                v5h v5hVar14 = new v5h(function1, j, b7hVar, (byte) 1);
                function2 = function1;
                fetVar2.o0(v5hVar14);
                objP2 = v5hVar14;
            }
            c(b7hVar, z2, str2, function8, (Function0) objP2, fetVar2, (i6 >> 6) & 1022);
            b7hVar2 = b7hVar;
            boolean z114 = b7hVar2.c;
            pzn pznVarB4 = v6h.b();
            alo aloVarA4 = v6h.a();
            ugd ugdVarM4 = u1c.M(-691486717, new ab4((Object) b7hVar2, (Object) function2, (byte) 29), fetVar2);
            y5d y5dVar4 = y5d.f42040a;
            b34.e(y5dVar4, z114, null, pznVarB4, aloVarA4, null, ugdVarM4, fetVar2, 1572870, 18);
            fetVar2 = fetVar;
            b34.e(y5dVar4, !b7hVar2.c, null, v6h.b(), v6h.a(), null, ohq0.b, fetVar2, 1572870, 18);
            fetVar2.r(true);
            mm40Var3 = mm40Var4;
        } else {
            function2 = function1;
            b7hVar2 = b7hVar;
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        z4 = z2;
        str3 = str2;
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final Function1 function9 = function2;
            final b7h b7hVar6 = b7hVar2;
            yfe0VarU.d = new Function2() { // from class: a.w5h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uzb.a(mm40Var3, j, b7hVar6, z4, str3, function9, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final jge0 a0(nqq nqqVar) {
        s460 s460Var;
        if (nqqVar.n && (s460Var = nqqVar.h) != null) {
            j6z j6zVarC = k7x.C(s460Var);
            if (!j6zVarC.h()) {
                j6zVarC = null;
            }
            if (j6zVarC != null) {
                return nqqVar.c1(j6zVarC);
            }
        }
        return jge0.e;
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        fet fetVar2;
        Function0 function1;
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-1060322559);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            l7m0 l7m0VarB = d43.b(z ? 180.0f : 0.0f, v6h.f36877a, null, null, fetVar, 0, 28);
            mm40Var2 = jm40.b;
            d(mm40Var2, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), function0, u1c.M(848834824, new cw0(l7m0VarB, (byte) 4), fetVar), fetVar, (i2 & 14) | 3072 | (i2 & 896), 0);
            function1 = function0;
            fetVar2 = fetVar;
        } else {
            fetVar2 = fetVar;
            function1 = function0;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, z, function1, i, (byte) 5);
        }
    }

    public static final void b0(dpi0 dpi0Var, String str) {
        if (dpi0Var.k()) {
            W(dpi0Var, ". ");
        }
        W(dpi0Var, str);
    }

    public static final void c(b7h b7hVar, boolean z, String str, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        Function0 function2;
        fetVar.g0(-720845086);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(b7hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(o7k0.g(mm40VarD, 30.0f, 0.0f, 2), null, null, z, null, function0, 24);
            function2 = function0;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str2 = b7hVar.b;
            boolean z2 = b7hVar.c;
            j(6, fetVar, str2, b7hVar.e);
            if (str != null && !StringsKt.W(str)) {
                fetVar.e0(-1132614945);
                h((i3 >> 3) & 112, fetVar, null, str);
                fetVar.r(false);
                fetVar2 = fetVar;
            } else if (z2) {
                fetVar2 = fetVar;
                fetVar2.e0(-751082660);
                fetVar2.r(false);
            } else {
                fetVar.e0(-1132611883);
                fetVar2 = fetVar;
                tdc.e(new rpe(b7hVar.f), new fpe(null, false, 3), null, fetVar2, 0, 4);
                fetVar2.r(false);
            }
            if (z) {
                fetVar2.e0(-751050420);
                e(b7hVar.d, function1, fetVar2, (i3 >> 9) & 112);
                b((i3 >> 3) & 896, fetVar2, 0, function2, z2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-750850532);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            function2 = function0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((byte) 4, i, (wdr) function1, (Object) b7hVar, (Object) str, (Object) function2, z);
        }
    }

    public static final nqq c0(nqq nqqVar) {
        boolean z = nqqVar.f20279a.n;
        if (z) {
            if (!z) {
                xcx.b("visitChildren called on an unattached node");
            }
            xz40 xz40Var = new xz40(new lm40[16]);
            lm40 lm40Var = nqqVar.f20279a;
            lm40 lm40Var2 = lm40Var.f;
            if (lm40Var2 == null) {
                vcc.v(xz40Var, lm40Var);
            } else {
                xz40Var.b(lm40Var2);
            }
            while (true) {
                int i = xz40Var.c;
                if (i == 0) {
                    break;
                }
                lm40 lm40VarV = (lm40) xz40Var.k(i - 1);
                if ((lm40VarV.d & 1024) == 0) {
                    vcc.v(xz40Var, lm40VarV);
                } else {
                    while (lm40VarV != null) {
                        if ((lm40VarV.c & 1024) != 0) {
                            xz40 xz40Var2 = null;
                            while (lm40VarV != null) {
                                if (lm40VarV instanceof nqq) {
                                    nqq nqqVar2 = (nqq) lm40VarV;
                                    if (nqqVar2.f20279a.n) {
                                        int iOrdinal = nqqVar2.e1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return nqqVar2;
                                        }
                                        if (iOrdinal != 3) {
                                            t9f.b();
                                            return null;
                                        }
                                    }
                                } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                    int i2 = 0;
                                    for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                        if ((lm40Var3.c & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                lm40VarV = lm40Var3;
                                            } else {
                                                if (xz40Var2 == null) {
                                                    xz40Var2 = new xz40(new lm40[16]);
                                                }
                                                if (lm40VarV != null) {
                                                    xz40Var2.b(lm40VarV);
                                                    lm40VarV = null;
                                                }
                                                xz40Var2.b(lm40Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                lm40VarV = vcc.V(xz40Var2);
                            }
                            break;
                        }
                        lm40VarV = lm40VarV.f;
                    }
                }
            }
        }
        return null;
    }

    public static final void d(mm40 mm40Var, long j, Function0 function0, ugd ugdVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fetVar.g0(1077340282);
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
            i3 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(i120.Q(o7k0.n(mm40Var3, 30.0f), j, vgg0.f37379a), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v((i3 >> 9) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u5h(mm40Var3, j, function0, ugdVar, i, i2);
        }
    }

    public static final dex d0(int i) {
        if (i != 1) {
            return i != 2 ? dex.c : dex.b;
        }
        return dex.f5973a;
    }

    public static final void e(boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        long background;
        fetVar.g0(1029364873);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(1377170576);
                background = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
            } else {
                fetVar.e0(1377171571);
                background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            }
            fetVar.r(false);
            d(null, background, function0, u1c.M(479059216, new obg(b2, z), fetVar), fetVar, ((i2 << 3) & 896) | 3072, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5h(z, function0, i, b);
        }
    }

    public static final lh80 e0(int i, int i2) {
        float f;
        float f2;
        float f3;
        int iI0 = i0();
        float f4 = 4.0f;
        if (i / iI0 == 0) {
            f = 0.0f;
        } else {
            zcl zclVar = qmk.f28987a;
            f = 4.0f;
        }
        if (i % iI0 == 0) {
            f2 = 0.0f;
        } else {
            zcl zclVar2 = qmk.f28987a;
            f2 = 4.0f;
        }
        if ((i + 1) % iI0 == 0) {
            f3 = 0.0f;
        } else {
            zcl zclVar3 = qmk.f28987a;
            f3 = 4.0f;
        }
        if (i2 - i <= iI0) {
            f4 = 0.0f;
        } else {
            zcl zclVar4 = qmk.f28987a;
        }
        return new lh80(f2, f, f3, f4);
    }

    public static final void f(mm40 mm40Var, b7h b7hVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        b7hVar.getClass();
        function1.getClass();
        fetVar.g0(-709520699);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(b7hVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            a7h a7hVar = b7hVar.g;
            fetVar.e0(-1796802035);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var3);
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
            fetVar.e0(701173565);
            for (d4n d4nVar : a7hVar.f369a) {
                boolean z = b7hVar.h;
                int i6 = i5 & 896;
                boolean z2 = i6 == 256;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z2 || objP == cl5Var) {
                    objP = new omf(function1, (byte) 25);
                    fetVar.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                boolean z3 = i6 == 256;
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new omf(function1, (byte) 26);
                    fetVar.o0(objP2);
                }
                agc.t(null, d4nVar, z, function2, (Function1) objP2, fetVar, 0, 1);
            }
            ohs0.x(fetVar, false, true, false);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var2, (Object) b7hVar, function1, i, i2, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:130:0x0207  */
    /* JADX WARN: Code duplicated, block: B:153:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:97:0x017d  */
    public static final j83 f0(ctf0 ctf0Var, d3h0 d3h0Var, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        izm0 izm0Var;
        List listD;
        int i;
        ctf0Var.getClass();
        str2.getClass();
        str3.getClass();
        d3h0Var.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        int i2 = 0;
        if (z) {
            W(dpi0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
        } else {
            if (str.length() > 0) {
                W(dpi0Var, str);
            }
            if (str2.length() > 0 && !kotlin.text.c.l(StringsKt.u0(str4).toString(), StringsKt.u0(str2).toString())) {
                if (dpi0Var.k()) {
                    W(dpi0Var, Separators.SP);
                }
                W(dpi0Var, str2);
            }
            if (str4.length() > 0) {
                S(dpi0Var);
                W(dpi0Var, str4);
            }
            if (d3h0Var instanceof pz10) {
                pz10 pz10Var = (pz10) d3h0Var;
                if (!pz10Var.d().isEmpty()) {
                    S(dpi0Var);
                    W(dpi0Var, Separators.LPAREN);
                    W(dpi0Var, "\u2066");
                    if (pz10Var instanceof kz10) {
                        kz10 kz10Var = (kz10) pz10Var;
                        boolean z3 = cy7.c() && z2;
                        List listT0 = kz10Var.f;
                        if (z3) {
                            listT0 = CollectionsKt.t0(listT0);
                        }
                        int i3 = z3 ? 0 : q3d.i(listT0);
                        for (Object obj : listT0) {
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            te90 te90Var = (te90) obj;
                            if (i2 == i3) {
                                int i5 = gql0.f11739a;
                                int i6 = kz10Var.g;
                                if (i6 <= 0) {
                                    v0(dpi0Var, te90Var, z2);
                                } else if (i6 == 1) {
                                    t0(dpi0Var, te90Var, z2);
                                } else {
                                    u0(dpi0Var, te90Var, z2);
                                }
                            } else {
                                v0(dpi0Var, te90Var, z2);
                            }
                            if (i2 != listT0.size() - 1) {
                                W(dpi0Var, Separators.COMMA);
                                W(dpi0Var, Separators.SP);
                            }
                            i2 = i4;
                        }
                    } else if (pz10Var instanceof lz10) {
                        List listT1 = ((lz10) pz10Var).f;
                        if (cy7.c() && z2) {
                            listT1 = CollectionsKt.t0(listT1);
                        }
                        for (Object obj2 : listT1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            v0(dpi0Var, (te90) obj2, z2);
                            if (i2 != listT1.size() - 1) {
                                W(dpi0Var, Separators.COMMA);
                                W(dpi0Var, Separators.SP);
                            }
                            i2 = i7;
                        }
                    } else if (pz10Var instanceof mz10) {
                        mz10 mz10Var = (mz10) pz10Var;
                        boolean z4 = cy7.c() && z2;
                        List listT2 = mz10Var.f;
                        if (z4) {
                            listT2 = CollectionsKt.t0(listT2);
                        }
                        int i8 = z4 ? 0 : q3d.i(listT2);
                        for (Object obj3 : listT2) {
                            int i9 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            te90 te90Var2 = (te90) obj3;
                            if (i2 == i8) {
                                int i10 = gql0.f11739a;
                                int i11 = mz10Var.g;
                                if (i11 <= 0) {
                                    v0(dpi0Var, te90Var2, z2);
                                } else if (i11 == 1) {
                                    t0(dpi0Var, te90Var2, z2);
                                } else {
                                    u0(dpi0Var, te90Var2, z2);
                                }
                            } else {
                                v0(dpi0Var, te90Var2, z2);
                            }
                            if (i2 != listT2.size() - 1) {
                                W(dpi0Var, Separators.COMMA);
                                W(dpi0Var, Separators.SP);
                            }
                            i2 = i9;
                        }
                    } else {
                        if (!(pz10Var instanceof oz10)) {
                            t9f.b();
                            return null;
                        }
                        if (cy7.c() && z2) {
                            oz10 oz10Var = (oz10) pz10Var;
                            D0(dpi0Var, oz10Var, z2);
                            C0(dpi0Var, oz10Var, z2);
                        } else {
                            oz10 oz10Var2 = (oz10) pz10Var;
                            C0(dpi0Var, oz10Var2, z2);
                            D0(dpi0Var, oz10Var2, z2);
                        }
                    }
                    W(dpi0Var, "\u2069");
                    W(dpi0Var, Separators.RPAREN);
                } else if (d3h0Var instanceof izm0) {
                    izm0Var = (izm0) d3h0Var;
                    if (!izm0Var.d().isEmpty()) {
                        S(dpi0Var);
                        W(dpi0Var, Separators.LPAREN);
                        W(dpi0Var, "\u2066");
                        if (cy7.c() || !z2) {
                            listD = izm0Var.d();
                        } else {
                            listD = CollectionsKt.t0(izm0Var.d());
                        }
                        for (Object obj4 : listD) {
                            i = i2 + 1;
                            if (i2 >= 0) {
                                q3d.p();
                                throw null;
                            }
                            v0(dpi0Var, (te90) obj4, z2);
                            if (i2 != listD.size() - 1) {
                                W(dpi0Var, Separators.COMMA);
                                W(dpi0Var, Separators.SP);
                            }
                            i2 = i;
                        }
                        W(dpi0Var, "\u2069");
                        W(dpi0Var, Separators.RPAREN);
                    }
                }
            } else if (d3h0Var instanceof izm0) {
                izm0Var = (izm0) d3h0Var;
                if (!izm0Var.d().isEmpty()) {
                    S(dpi0Var);
                    W(dpi0Var, Separators.LPAREN);
                    W(dpi0Var, "\u2066");
                    if (cy7.c()) {
                        listD = izm0Var.d();
                    } else {
                        listD = izm0Var.d();
                    }
                    while (r4.hasNext()) {
                        i = i2 + 1;
                        if (i2 >= 0) {
                            q3d.p();
                            throw null;
                        }
                        v0(dpi0Var, (te90) obj4, z2);
                        if (i2 != listD.size() - 1) {
                            W(dpi0Var, Separators.COMMA);
                            W(dpi0Var, Separators.SP);
                        }
                        i2 = i;
                    }
                    W(dpi0Var, "\u2069");
                    W(dpi0Var, Separators.RPAREN);
                }
            }
            if (str3.length() > 0) {
                S(dpi0Var);
                W(dpi0Var, str3);
            }
        }
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-982816093);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_red_fire, 0, fetVar), null, o7k0.n(jm40Var, 18.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar2, 56, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 12);
        }
    }

    public static final long g0(boolean z) {
        if (z) {
            return StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        pz40 pz40Var = s6t0.f31722a;
        return StaticColors.INSTANCE.m123getWhite0d7_KjU();
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-1949874616);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float fB = bdl.b(((yez) ((rhv0) fetVar.k(bmd.u))).a()) * 0.3f;
            jm40 jm40Var = jm40.b;
            str2 = str;
            v8q0.a(str2, o7k0.u(jm40Var, 0.0f, fB, 1), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110584);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var2, str2, i, (byte) 6);
        }
    }

    public static final long h0(List list, CyberGamesPage cyberGamesPage, Map map) {
        list.getClass();
        cyberGamesPage.getClass();
        if (list.isEmpty()) {
            return -1L;
        }
        Long l = (Long) map.get(cyberGamesPage);
        if (l != null && l.longValue() != -1) {
            long jLongValue = l.longValue();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    eih eihVar = (eih) it.next();
                    long j = eihVar.f7859a;
                    if (j == 40) {
                        j = eihVar.b;
                    }
                    if (j == jLongValue) {
                        return l.longValue();
                    }
                }
            }
        }
        eih eihVar2 = (eih) CollectionsKt.U(list);
        long j2 = eihVar2.f7859a;
        return j2 == 40 ? eihVar2.b : j2;
    }

    public static final void i(mm40 mm40Var, b7h b7hVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(616975470);
        int i2 = i | 6 | (fetVar2.g(b7hVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (b7hVar.e) {
                fetVar2.e0(-1534775837);
                g(0, fetVar2, null);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1534724904);
                fetVar2.r(false);
            }
            v8q0.a(b7hVar.b, new x7z(1.0f, true), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(mm40Var2, b7hVar, i, (byte) 26);
        }
    }

    public static final int i0() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return ((float) displayMetrics.widthPixels) / displayMetrics.density >= 560.0f ? 3 : 2;
    }

    public static final void j(int i, fet fetVar, String str, boolean z) {
        fet fetVar2 = fetVar;
        fetVar2.g0(564002359);
        int i2 = i | (fetVar.g(str) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, x7zVar);
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
            if (z) {
                fetVar2.e0(2007374714);
                g(0, fetVar2, null);
                fetVar2.r(false);
            } else {
                fetVar2.e0(2007425647);
                fetVar2.r(false);
            }
            v8q0.a(str, new x7z(1.0f, true), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, (i2 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5h(str, z, i, (byte) 0);
        }
    }

    public static final j83 j0(nz10 nz10Var) {
        h83 h83Var = new h83();
        String strA = nz10Var.a();
        strA.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(g0(nz10Var.j()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(strA);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x0142  */
    /* JADX WARN: Code duplicated, block: B:44:0x0152  */
    /* JADX WARN: Code duplicated, block: B:47:0x015f  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void k(int i, int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        String str3;
        String str4;
        boolean z;
        fet fetVar2;
        mm40 mm40Var2;
        String str5;
        yfe0 yfe0VarU;
        str.getClass();
        fetVar.g0(1507090087);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            str3 = str;
            i3 |= fetVar.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                str4 = str2;
                i3 |= fetVar.g(str4) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i4 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.k;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
                zfn zfnVar = zaq0.b;
                mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n), 12.0f, 12.0f);
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
                int i5 = i3 >> 3;
                v8q0.a(str3, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, qmk.s, null, null, j1t0.c, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar, i5 & 14, 0, 261992);
                fetVar2 = fetVar;
                if (str5 != null || StringsKt.W(str5)) {
                    fetVar2.e0(-1876063073);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1876140914);
                    h(i5 & 112, fetVar2, null, str5);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                mm40Var2 = mm40Var;
                str5 = str4;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new r5h(mm40Var2, str, str5, i, i2, (byte) 0);
            }
        }
        i3 |= 384;
        str4 = str2;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            if (i4 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD2);
            zfn zfnVar2 = zaq0.b;
            mm40 mm40VarK2 = s5x0.K(i120.Q(mm40VarE2, ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent(), jd8.n), 12.0f, 12.0f);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            int i6 = i3 >> 3;
            v8q0.a(str3, ohs0.i(fetVar, mm40VarC1, gqw0.v, 1.0f, true), ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, qmk.s, null, null, j1t0.c, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar, i6 & 14, 0, 261992);
            fetVar2 = fetVar;
            if (str5 != null) {
                fetVar2.e0(-1876063073);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1876063073);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var2;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
            str5 = str4;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5h(mm40Var2, str, str5, i, i2, (byte) 0);
        }
    }

    public static final j83 k0(te90 te90Var) {
        te90Var.getClass();
        h83 h83Var = new h83();
        String str = te90Var.b;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(g0(te90Var.c), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void l(int i, fet fetVar) {
        int i2;
        fetVar.g0(1550622555);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i, (byte) 9);
        }
    }

    public static final j83 l0(nz10 nz10Var) {
        h83 h83Var = new h83();
        String strB = nz10Var.b();
        strB.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(g0(nz10Var.i()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(strB);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void m(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, boolean z) {
        fetVar.g0(-187341270);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            Object objK = fetVar.k(zfnVar);
            k6z k6zVar = k6z.b;
            boolean z2 = objK == k6zVar;
            if (z2 != z) {
                k6zVar = k6z.f17794a;
            }
            obc.d(zfnVar.a(k6zVar), u1c.M(-1345205910, new hwm(b, ozb.b0(a4xVar, fetVar, (i2 >> 3) & 14), z2), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvm(mm40Var2, a4xVar, z, i, (byte) 1);
        }
    }

    public static final j83 m0(te90 te90Var) {
        h83 h83Var = new h83();
        String str = te90Var.d;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(g0(te90Var.e), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void n(mm40 mm40Var, nsk nskVar, l7m0 l7m0Var, float f, float f2, float f3, Function1 function1, Function1 function2, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        nskVar.getClass();
        l7m0Var.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        fetVar.g0(962365092);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nskVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.d(f3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function0) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
            float fB = pkd.b(f + f3, fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                Object rqkVar = new rqk(fB, !nskVar.c);
                fetVar.o0(rqkVar);
                objP2 = rqkVar;
            }
            qge qgeVar = (qge) objP2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            fbn fbnVar = new fbn(new za3(f, f3, (byte) 12));
            fbn fbnVar2 = new fbn(new za3(f2, f3, (byte) 13));
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            Object objP4 = fetVar.P();
            Object obj2 = objP4;
            if (objP4 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            n6x.b(fbnVar, fbnVar2, fFloatValue, false, false, false, mm40VarD, pz40Var2, nie0Var2, lwfVar, u1c.M(284503157, new qqk(pz40Var2, lwfVar, nie0Var2, nskVar, l7m0Var, pz40Var, function1, function2, qgeVar, jM121getTransparent0d7_KjU, function0), fetVar), fetVar, 24576);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xpk(mm40Var2, nskVar, l7m0Var, f, f2, f3, function1, function2, function0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public static final ArrayList n0(djf djfVar, njf njfVar) {
        ?? arrayList;
        ajf ajfVar;
        Object next;
        List list;
        if (njfVar == null || (list = njfVar.c) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((kjf) it.next()).f18383a);
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (String str : arrayList) {
            List list2 = djfVar.b;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.d(((ajf) next).f972a, str));
                ajfVar = (ajf) next;
            } else {
                ajfVar = null;
            }
            arrayList2.add(ajfVar);
        }
        return arrayList2;
    }

    public static final void o(e8l e8lVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1964366410);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(e8lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 4.0f, 5);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new n2l((byte) 12);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new n2l((byte) 13);
                fetVar.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            Object objP4 = fetVar.P();
            byte b = 14;
            if (objP4 == cl5Var) {
                objP4 = new n2l(b);
                fetVar.o0(objP4);
            }
            Function1 function3 = (Function1) objP4;
            boolean zI = fetVar.i(vneVar) | ((i2 & 14) == 4);
            Object objP5 = fetVar.P();
            if (zI || objP5 == cl5Var) {
                objP5 = new ngh(e8lVar, vneVar, (byte) 21);
                fetVar.o0(objP5);
            }
            dwi0.c(function1, mm40VarN, function2, function3, (Function1) objP5, fetVar, 3462, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(e8lVar, i, (byte) 5);
        }
    }

    public static final znq0 o0(anq0 anq0Var) {
        boolean z = anq0Var.b;
        long j = anq0Var.d;
        long j2 = anq0Var.e;
        if (!z) {
            return new znq0(j2 + j);
        }
        long j3 = j2 - j;
        if (j3 < 0) {
            j3 = 0;
        }
        return new znq0(j3);
    }

    public static final void p(mm40 mm40Var, jpl jplVar, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(2056627180);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jplVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (jplVar instanceof hpl) {
            fetVar.e0(733776102);
            hpl hplVar = (hpl) jplVar;
            String str = hplVar.c;
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            q(mm40Var, !(str == null || str.length() == 0), hplVar, f, f2, function1, fetVar, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            fetVar.r(false);
        } else {
            if (!(jplVar instanceof ipl)) {
                throw b1j.f(733773564, fetVar, false);
            }
            fetVar.e0(733790546);
            int i5 = i2 & 14;
            int i6 = i2 >> 3;
            r(mm40Var, f, f2, fetVar, (i6 & 896) | i5 | (i6 & 112));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n04(mm40Var, (tpl) jplVar, f, f2, function1, i, (byte) 3);
        }
    }

    public static final String p0(HistoryTypeModel historyTypeModel, ctf0 ctf0Var, f8w f8wVar, String str) {
        ctf0Var.getClass();
        str.getClass();
        switch (historyTypeModel.ordinal()) {
            case 0:
                return f8wVar == f8w.b ? ctf0Var.b.a(R.string.special_events_my_bets, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.history_bet, Arrays.copyOf(new Object[0], 0));
            case 1:
                return ctf0Var.b.a(R.string.toto_history_without_name_v2, Arrays.copyOf(new Object[]{str}, 1));
            case 2:
                return ctf0Var.b.a(R.string.history_autobet, Arrays.copyOf(new Object[0], 0));
            case 3:
                return ctf0Var.b.a(R.string.unreleased_bets, Arrays.copyOf(new Object[0], 0));
            case 4:
                return ctf0Var.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
            case 5:
                return ctf0Var.b.a(R.string.history_casino, Arrays.copyOf(new Object[0], 0));
            case 6:
                return ctf0Var.b.a(R.string.jackpot_history_name, Arrays.copyOf(new Object[0], 0));
            case 7:
                return ctf0Var.b.a(R.string.lotto_history_title, Arrays.copyOf(new Object[0], 0));
            default:
                t9f.b();
                return null;
        }
    }

    public static final void q(mm40 mm40Var, boolean z, hpl hplVar, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        float f3;
        float f4;
        fet fetVar2;
        int i3;
        float f5;
        boolean z2;
        fet fetVar3 = fetVar;
        fetVar3.g0(1313774170);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.g(hplVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f3 = f2;
            i2 |= fetVar3.d(f3) ? 16384 : 8192;
        } else {
            f3 = f2;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar3.i(function1) ? 131072 : 65536;
        }
        int i4 = i2;
        if (fetVar3.U(i4 & 1, (74899 & i4) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarD);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), f, f3, f, 0.0f, 8);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarN, 40.0f, 0.0f, 2);
            String str = hplVar.b;
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar3.k(zfnVar2)).getClass();
            f4 = f;
            kc5.N(str, mm40VarG, textPrimary, null, null, 0L, qmk.p, qmk.u, null, null, 0L, gqw0.e, 2, false, 1, 0, false, null, g1t0.q(), 0.0f, fetVar, 0, 1600512, 0, 3055416);
            if (z) {
                fetVar.e0(1721628985);
                mm40 mm40VarL = s5x0.L(o7k0.g(o7k0.d(jm40Var, 1.0f), 14.0f, 0.0f, 2), f4, 0.0f, 2);
                String str2 = hplVar.c;
                if (str2 == null) {
                    str2 = "";
                }
                long textPrimary2 = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
                ((g1t0) fetVar.k(zfnVar2)).getClass();
                i3 = 2;
                f5 = 0.0f;
                v8q0.a(str2, mm40VarL, textPrimary2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, g1t0.g(), fetVar, 0, 384, 125944);
                fetVar2 = fetVar;
                z2 = false;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                i3 = 2;
                f5 = 0.0f;
                z2 = false;
                fetVar2.e0(1722093458);
                fetVar2.r(false);
            }
            mm40 mm40VarE = s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, f2, 5).e(new wkw(xx7Var));
            lh80 lh80VarT = s5x0.t(f4, f5, i3);
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            boolean z3 = (i4 & 896) == 256 ? true : z2;
            if ((i4 & 458752) == 131072) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objP = fetVar2.P();
            if (z4 || objP == ukd.f35823a) {
                objP = new ngh(hplVar, function1, (byte) 27);
                fetVar2.o0(objP);
            }
            fetVar3 = fetVar2;
            b8k0.f(mm40VarE, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar3, 0, 490);
            fetVar3.r(true);
        } else {
            f4 = f;
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zol(mm40Var, z, hplVar, f4, f2, function1, i);
        }
    }

    public static final evq0 q0(boolean z) {
        return z ? evq0.f8484a : evq0.b;
    }

    public static final void r(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        int i2;
        fetVar.g0(597931801);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarK = s5x0.K(o7k0.d(mm40Var, 1.0f), f, f2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 128.0f), 24.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(jm40Var, 198.0f), 14.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 10.0f));
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            ugg0 ugg0Var2 = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(lgb.J(mm40VarN, ugg0Var2), vbc.d0(null, fetVar, 0, 1)));
            qxw.o(fetVar, xbc.c0(lgb.J(o7k0.n(jm40Var, 56.0f), ugg0Var2), vbc.d0(null, fetVar, 0, 1)));
            qxw.o(fetVar, xbc.c0(lgb.J(o7k0.n(jm40Var, 56.0f), ugg0Var2), vbc.d0(null, fetVar, 0, 1)));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wol(mm40Var, f, f2, i, (byte) 1);
        }
    }

    public static final boolean r0(nqq nqqVar) {
        e7z e7zVar;
        s460 s460Var;
        e7z e7zVar2;
        s460 s460Var2 = nqqVar.h;
        return (s460Var2 == null || (e7zVar = s460Var2.u) == null || !e7zVar.J() || (s460Var = nqqVar.h) == null || (e7zVar2 = s460Var.u) == null || !e7zVar2.I()) ? false : true;
    }

    public static final void s(aca acaVar, boolean z, fet fetVar) {
        boolean z2 = acaVar instanceof vba;
        o0n o0nVar = o0n.f24435a;
        jm40 jm40Var = jm40.b;
        if (z2) {
            fetVar.e0(-2044484403);
            vba vbaVar = (vba) acaVar;
            e3c.i(jm40Var, new s0n(K0(vbaVar.f37132a), K0(vbaVar.b), vbaVar.c, vbaVar.d, o0nVar, z), fetVar, 0);
            fetVar.r(false);
            return;
        }
        if (acaVar instanceof zba) {
            fetVar.e0(-2043784051);
            zba zbaVar = (zba) acaVar;
            e3c.i(jm40Var, new s0n(K0(zbaVar.f44106a), K0(zbaVar.b), zbaVar.c, zbaVar.d, o0nVar, z), fetVar, 0);
            fetVar.r(false);
            return;
        }
        if (acaVar instanceof yba) {
            fetVar.e0(-2043079731);
            yba ybaVar = (yba) acaVar;
            e3c.i(jm40Var, new s0n(K0(ybaVar.f42333a), K0(ybaVar.b), ybaVar.c, ybaVar.d, o0nVar, z), fetVar, 0);
            fetVar.r(false);
            return;
        }
        if (acaVar instanceof xba) {
            fetVar.e0(-2042384804);
            xba xbaVar = (xba) acaVar;
            cca ccaVar = xbaVar.f40592a;
            b1n b1nVar = new b1n(0, ccaVar.b, ccaVar.f4100a);
            cca ccaVar2 = xbaVar.b;
            e3c.i(jm40Var, new v0n(b1nVar, new b1n(0, ccaVar2.b, ccaVar2.f4100a), xbaVar.c, z), fetVar, 0);
            fetVar.r(false);
            return;
        }
        if (!(acaVar instanceof wba)) {
            throw b1j.f(-1312877966, fetVar, false);
        }
        fetVar.e0(-2041818093);
        wba wbaVar = (wba) acaVar;
        dca dcaVar = wbaVar.f38866a;
        c1n c1nVar = new c1n(0, dcaVar.b, dcaVar.f5841a);
        dca dcaVar2 = wbaVar.b;
        e3c.i(jm40Var, new w0n(c1nVar, new c1n(0, dcaVar2.b, dcaVar2.f5841a), wbaVar.c, wbaVar.d, "", o0nVar, z), fetVar, 0);
        fetVar.r(false);
    }

    public static final boolean s0(d0t d0tVar) {
        d0tVar.getClass();
        if (d0tVar.v == tvg.d.b) {
            return true;
        }
        boolean z = d0tVar.z;
        if (z) {
            return kpb.j0(d0tVar);
        }
        return (!d0tVar.C || z) ? qzb.B0(d0tVar) : qzb.H0(d0tVar);
    }

    public static final void t(mm40 mm40Var, kzc0 kzc0Var, izc0 izc0Var, Integer num, Function2 function2, fet fetVar, int i) {
        int i2;
        long backgroundContent;
        fet fetVar2 = fetVar;
        kzc0Var.getClass();
        function2.getClass();
        fetVar2.g0(216166624);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar2.g(kzc0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= fetVar2.g(izc0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.g(num) ? 2048 : 1024;
        }
        int i4 = i3 | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i4 & 1, (i4 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (izc0Var instanceof gzc0) {
                fetVar2.e0(1577711943);
                backgroundContent = ((StaticColors) fetVar2.k(m8m0.f21378a)).m125getWhite100d7_KjU();
                fetVar2.r(false);
            } else {
                if (!(izc0Var instanceof hzc0)) {
                    throw b1j.f(1577708803, fetVar2, false);
                }
                fetVar2.e0(1577714737);
                backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                fetVar2.r(false);
            }
            long j = backgroundContent;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(i120.Q(mm40Var, j, vgg0.a(16.0f)), 88.0f);
            boolean z = ((i4 & 112) == 32) | ((57344 & i4) == 16384);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new g8l(function2, kzc0Var, pz40Var, b);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarE, null, null, false, null, (Function0) objP2, 28);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            mm40 mm40VarL = s5x0.L(s5x0.N(jm40Var, 4.0f, 0.0f, 12.0f, 0.0f, 10), 0.0f, 4.0f, 1);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            n0x n0xVar = kzc0Var.d;
            jzc0 jzc0Var = kzc0Var.e;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new wil(pz40Var, (byte) 12);
                fetVar2.o0(objP3);
            }
            Function1 function1 = (Function1) objP3;
            int i5 = i4 & 896;
            J(null, n0xVar, izc0Var, num, function1, fetVar2, i5 | 24576 | (i4 & 7168));
            N(null, kzc0Var.b, izc0Var, kzc0Var.c, fetVar, i5);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (jzc0Var != null) {
                fetVar2.e0(-534627981);
                String str = jzc0Var.f17406a;
                gro0 gro0Var = jzc0Var.b;
                mm40 mm40VarB = jr8.f16991a.b(o7k0.u(jm40Var, 0.0f, 88.0f, 1), zx7Var);
                Object objP4 = fetVar2.P();
                if (objP4 == cl5Var) {
                    objP4 = new aim((byte) 10);
                    fetVar2.o0(objP4);
                }
                j6n.h(str, gro0Var, ffb0.P(mm40VarB, (Function1) objP4), 0, 0, fetVar2, 0, 24);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-534146520);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p00(mm40Var, kzc0Var, izc0Var, num, function2, i, (byte) 1);
        }
    }

    public static final void t0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            V(dpi0Var, te90Var.d, g0(te90Var.e));
            W(dpi0Var, "-");
            V(dpi0Var, te90Var.b, g0(te90Var.c));
            W(dpi0Var, Separators.STAR);
            return;
        }
        W(dpi0Var, Separators.STAR);
        V(dpi0Var, te90Var.b, g0(te90Var.c));
        W(dpi0Var, "-");
        V(dpi0Var, te90Var.d, g0(te90Var.e));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0195  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0126  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:91:0x0152  */
    /* JADX WARN: Code duplicated, block: B:93:0x015a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0160  */
    /* JADX WARN: Code duplicated, block: B:97:0x0183  */
    public static final void u(mm40 mm40Var, final List list, final hzc0 hzc0Var, boolean z, hh80 hh80Var, float f, float f2, Integer num, final Function2 function2, fet fetVar, final int i, final int i2) {
        mm40 mm40Var2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num2;
        int i9;
        int i10;
        Function2 function3;
        boolean z3;
        final hh80 hh80Var2;
        final float f3;
        final mm40 mm40Var3;
        final Integer num3;
        final boolean z4;
        final float f4;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        hh80 hh80Var3;
        float f5;
        int i11;
        float f6;
        float f7;
        hh80 hh80Var4;
        Integer num4;
        int iOrdinal;
        hh80 lh80Var;
        hh80 hh80VarT;
        int i12;
        list.getClass();
        function2.getClass();
        fetVar.g0(-737730039);
        int i13 = i2 & 1;
        if (i13 != 0) {
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
            i3 |= fetVar.g(list) ? 32 : 16;
        }
        int i14 = i2 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                i6 = i3 | 24576;
            } else {
                if (fetVar.g(hh80Var)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 = i3 | i5;
            }
            i7 = 589824 | i6;
            i8 = i2 & 128;
            if (i8 != 0) {
                i10 = i6 | 13172736;
                num2 = num;
            } else {
                num2 = num;
                if (fetVar.g(num2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 = i7 | i9;
            }
            if ((100663296 & i) == 0) {
                function3 = function2;
                if (fetVar.i(function3)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i10 |= i12;
            } else {
                function3 = function2;
            }
            if ((38347923 & i10) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i10 & 1, z3)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    if (i13 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i14 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        hh80Var3 = null;
                    } else {
                        hh80Var3 = hh80Var;
                    }
                    f5 = xfn.a(fetVar).c;
                    zcl zclVar = qmk.f28987a;
                    i11 = i10 & (-4128769);
                    if (i8 != 0) {
                        f6 = f5;
                        z4 = z2;
                        f7 = 8.0f;
                        num4 = null;
                        hh80Var4 = hh80Var3;
                    } else {
                        f6 = f5;
                        z4 = z2;
                        f7 = 8.0f;
                        hh80Var4 = hh80Var3;
                        num4 = num2;
                    }
                } else {
                    fetVar.X();
                    int i15 = i10 & (-4128769);
                    hh80Var4 = hh80Var;
                    f6 = f;
                    f7 = f2;
                    i11 = i15;
                    mm40Var4 = mm40Var2;
                    num4 = num2;
                    z4 = z2;
                }
                fetVar.s();
                iOrdinal = hzc0Var.f13901a.ordinal();
                if (iOrdinal != 0) {
                    fetVar.e0(-367392150);
                    if (hh80Var4 == null) {
                        lh80Var = new lh80(f6, f7, f6, f7);
                    } else {
                        lh80Var = hh80Var4;
                    }
                    int i16 = (i11 & 1022) | ((i11 << 3) & 57344);
                    int i17 = i11 >> 6;
                    O(mm40Var4, list, hzc0Var, lh80Var, z4, num4, function2, fetVar, i16 | (458752 & i17) | (3670016 & i17));
                    fetVar.r(false);
                } else {
                    if (iOrdinal == 1) {
                        throw b1j.f(-288947399, fetVar, false);
                    }
                    fetVar.e0(-366899684);
                    if (hh80Var4 == null) {
                        hh80VarT = s5x0.t(f6, 0.0f, 2);
                    } else {
                        hh80VarT = hh80Var4;
                    }
                    int i18 = (i11 & 1022) | ((i11 << 3) & 57344);
                    int i19 = i11 >> 6;
                    D(mm40Var4, list, hzc0Var, hh80VarT, z4, num4, function3, fetVar, (458752 & i19) | i18 | (3670016 & i19));
                    fetVar.r(false);
                }
                mm40Var3 = mm40Var4;
                num3 = num4;
                hh80Var2 = hh80Var4;
                f4 = f6;
                f3 = f7;
            } else {
                fetVar.X();
                hh80Var2 = hh80Var;
                f3 = f2;
                mm40Var3 = mm40Var2;
                num3 = num2;
                z4 = z2;
                f4 = f;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.znm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uzb.u(mm40Var3, list, hzc0Var, z4, hh80Var2, f4, f3, num3, function2, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            i6 = i3 | 24576;
        } else {
            if (fetVar.g(hh80Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i3 | i5;
        }
        i7 = 589824 | i6;
        i8 = i2 & 128;
        if (i8 != 0) {
            i10 = i6 | 13172736;
            num2 = num;
        } else {
            num2 = num;
            if (fetVar.g(num2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i10 = i7 | i9;
        }
        if ((100663296 & i) == 0) {
            function3 = function2;
            if (fetVar.i(function3)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i10 |= i12;
        } else {
            function3 = function2;
        }
        if ((38347923 & i10) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i10 & 1, z3)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i14 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    hh80Var3 = null;
                } else {
                    hh80Var3 = hh80Var;
                }
                f5 = xfn.a(fetVar).c;
                zcl zclVar2 = qmk.f28987a;
                i11 = i10 & (-4128769);
                if (i8 != 0) {
                    f6 = f5;
                    z4 = z2;
                    f7 = 8.0f;
                    num4 = null;
                    hh80Var4 = hh80Var3;
                } else {
                    f6 = f5;
                    z4 = z2;
                    f7 = 8.0f;
                    hh80Var4 = hh80Var3;
                    num4 = num2;
                }
            } else {
                if (i13 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i14 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    hh80Var3 = null;
                } else {
                    hh80Var3 = hh80Var;
                }
                f5 = xfn.a(fetVar).c;
                zcl zclVar3 = qmk.f28987a;
                i11 = i10 & (-4128769);
                if (i8 != 0) {
                    f6 = f5;
                    z4 = z2;
                    f7 = 8.0f;
                    num4 = null;
                    hh80Var4 = hh80Var3;
                } else {
                    f6 = f5;
                    z4 = z2;
                    f7 = 8.0f;
                    hh80Var4 = hh80Var3;
                    num4 = num2;
                }
            }
            fetVar.s();
            iOrdinal = hzc0Var.f13901a.ordinal();
            if (iOrdinal != 0) {
                fetVar.e0(-367392150);
                if (hh80Var4 == null) {
                    lh80Var = new lh80(f6, f7, f6, f7);
                } else {
                    lh80Var = hh80Var4;
                }
                int i110 = (i11 & 1022) | ((i11 << 3) & 57344);
                int i111 = i11 >> 6;
                O(mm40Var4, list, hzc0Var, lh80Var, z4, num4, function2, fetVar, i110 | (458752 & i111) | (3670016 & i111));
                fetVar.r(false);
            } else {
                if (iOrdinal == 1) {
                    throw b1j.f(-288947399, fetVar, false);
                }
                fetVar.e0(-366899684);
                if (hh80Var4 == null) {
                    hh80VarT = s5x0.t(f6, 0.0f, 2);
                } else {
                    hh80VarT = hh80Var4;
                }
                int i112 = (i11 & 1022) | ((i11 << 3) & 57344);
                int i113 = i11 >> 6;
                D(mm40Var4, list, hzc0Var, hh80VarT, z4, num4, function3, fetVar, (458752 & i113) | i112 | (3670016 & i113));
                fetVar.r(false);
            }
            mm40Var3 = mm40Var4;
            num3 = num4;
            hh80Var2 = hh80Var4;
            f4 = f6;
            f3 = f7;
        } else {
            fetVar.X();
            hh80Var2 = hh80Var;
            f3 = f2;
            mm40Var3 = mm40Var2;
            num3 = num2;
            z4 = z2;
            f4 = f;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.znm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uzb.u(mm40Var3, list, hzc0Var, z4, hh80Var2, f4, f3, num3, function2, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void u0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            V(dpi0Var, te90Var.d, g0(te90Var.e));
            W(dpi0Var, Separators.STAR);
            W(dpi0Var, "-");
            V(dpi0Var, te90Var.b, g0(te90Var.c));
            return;
        }
        V(dpi0Var, te90Var.b, g0(te90Var.c));
        W(dpi0Var, "-");
        W(dpi0Var, Separators.STAR);
        V(dpi0Var, te90Var.d, g0(te90Var.e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void v(mm40 mm40Var, cwm cwmVar, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2;
        k6z k6zVar;
        boolean z;
        fet fetVar3;
        fet fetVar4 = fetVar;
        String str = cwmVar.j;
        String str2 = cwmVar.g;
        fetVar4.g0(-324710963);
        if ((i & 6) == 0) {
            i2 = i | (fetVar4.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar4.g(cwmVar) ? 32 : 16;
        }
        if (fetVar4.U(i2 & 1, (i2 & 19) != 18)) {
            if (cwmVar.k) {
                fetVar4.e0(1485383316);
                k6zVar = (k6z) fetVar4.k(bmd.n);
                fetVar4.r(false);
            } else {
                fetVar4.e0(1485384240);
                fetVar4.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar4, 48);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarN);
            mkd.c0.getClass();
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(e7z.u1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, x5dVarA, gqw0.x);
            jpm0.o(fetVar4, bh90VarM, gqw0.w);
            jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar4);
            jpm0.o(fetVar4, mm40VarC0, gqw0.v);
            if (str2.length() <= 0 && str.length() <= 0) {
                fetVar4.e0(778365759);
                fetVar4.r(false);
            } else {
                fetVar4.e0(778177403);
                M(0, fetVar4, null, str2, str);
                fetVar4.r(false);
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1211556867, new i3l(cwmVar, (byte) 26), fetVar4), fetVar4, 56);
            if (cwmVar.h.length() > 0) {
                fetVar4.e0(779118656);
                String str3 = cwmVar.h;
                long secondary = ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                z = true;
                v8q0.a(str3, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                z = true;
                fetVar4.e0(779373631);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            }
            fetVar3.r(z);
            b = z;
            fetVar2 = fetVar3;
        } else {
            b = 1;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm(b, i, mm40Var, cwmVar);
        }
    }

    public static final void v0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            V(dpi0Var, te90Var.d, g0(te90Var.e));
            W(dpi0Var, "-");
            V(dpi0Var, te90Var.b, g0(te90Var.c));
        } else {
            V(dpi0Var, te90Var.b, g0(te90Var.c));
            W(dpi0Var, "-");
            V(dpi0Var, te90Var.d, g0(te90Var.e));
        }
    }

    public static final void w(mm40 mm40Var, j0n j0nVar, fet fetVar, int i) {
        j0n j0nVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1932149863);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(j0nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 152.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarG);
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
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            String str = j0nVar.c;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.p(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarM = s5x0.M(jm40Var, 8.0f, 10.0f, 8.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
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
            j0nVar2 = j0nVar;
            F(zhg0Var.a(0.33f, jm40Var, true), true, j0nVar2.e, fetVar2, 48);
            E(zhg0Var.a(0.33f, jm40Var, true), j0nVar2, fetVar2, i2 & 112);
            F(zhg0Var.a(0.33f, jm40Var, true), false, j0nVar2.f, fetVar2, 48);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            j0nVar2 = j0nVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 2, i, mm40Var, j0nVar2);
        }
    }

    public static final w2d w0(int i, fet fetVar) {
        boolean z = (i & 1) != 0;
        Object[] objArr = new Object[0];
        v0h0 v0h0Var = x2d.g;
        boolean zD = fetVar.d(-3.4028235E38f) | fetVar.d(0.0f) | fetVar.d(0.0f);
        Object objP = fetVar.P();
        if (zD || objP == ukd.f35823a) {
            objP = new zxb((byte) 25);
            fetVar.o0(objP);
        }
        return new w2d((x2d) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0), wzk0.a(fetVar), z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void x(mm40 mm40Var, htr htrVar, lh80 lh80Var, xcz xczVar, Function2 function2, Function1 function1, fet fetVar, int i, int i2) {
        xcz xczVarA;
        int i3;
        int i4;
        Function2 function3;
        int i5;
        int i6;
        int i7;
        Function1 function4;
        int i8;
        int i9;
        int i10;
        boolean z;
        xcz xczVar2;
        Function2 function5;
        Function1 function6;
        mm40 mm40Var2;
        yfe0 yfe0VarU;
        int i11;
        mm40 mm40Var3;
        Function2 function7;
        Function1 function8;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objP;
        fetVar.g0(1157215231);
        int i12 = i | 6 | (fetVar.g(htrVar) ? 32 : 16) | (fetVar.g(lh80Var) ? 256 : 128);
        if ((i2 & 8) == 0) {
            xczVarA = xczVar;
            int i13 = fetVar.g(xczVarA) ? 2048 : 1024;
            i3 = i12 | i13;
            i4 = i2 & 16;
            if (i4 != 0) {
                i6 = i3 | 24576;
                function3 = function2;
            } else {
                function3 = function2;
                if (fetVar.i(function3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 = i3 | i5;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                i9 = i6 | 196608;
                function4 = function1;
            } else {
                function4 = function1;
                if (fetVar.i(function4)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i6 | i8;
            }
            i10 = i9 | 1572864;
            if ((599187 & i10) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i10 & 1, z)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    if ((i2 & 8) != 0) {
                        xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                        i10 &= -7169;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    }
                    if (i7 != 0) {
                        function4 = null;
                    }
                    i11 = i10;
                    mm40Var3 = jm40.b;
                    xczVar2 = xczVarA;
                    function7 = function3;
                    function8 = function4;
                } else {
                    fetVar.X();
                    if ((i2 & 8) != 0) {
                        i10 &= -7169;
                    }
                    i11 = i10;
                    xczVar2 = xczVarA;
                    function7 = function3;
                    function8 = function4;
                    mm40Var3 = mm40Var;
                }
                fetVar.s();
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var3, 160.0f), 1.0f);
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                if ((i11 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((57344 & i11) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z6 = z2 | z3;
                if ((458752 & i11) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z6 | z4;
                objP = fetVar.P();
                if (z5 || objP == ukd.f35823a) {
                    objP = new f8m((Object) htrVar, (Object) function7, (Object) function8, (byte) 4);
                    fetVar.o0(objP);
                }
                b8k0.f(mm40VarD, xczVar2, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, ((i11 >> 6) & 112) | (i11 & 896), Response.NOT_ACCEPTABLE_HERE);
                function5 = function7;
                function6 = function8;
                mm40Var2 = mm40Var3;
            } else {
                fetVar.X();
                xczVar2 = xczVarA;
                function5 = function3;
                function6 = function4;
                mm40Var2 = mm40Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new tl0(mm40Var2, htrVar, lh80Var, xczVar2, function5, function6, i, i2);
            }
        }
        xczVarA = xczVar;
        i3 = i12 | i13;
        i4 = i2 & 16;
        if (i4 != 0) {
            i6 = i3 | 24576;
            function3 = function2;
        } else {
            function3 = function2;
            if (fetVar.i(function3)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i3 | i5;
        }
        i7 = i2 & 32;
        if (i7 != 0) {
            i9 = i6 | 196608;
            function4 = function1;
        } else {
            function4 = function1;
            if (fetVar.i(function4)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i9 = i6 | i8;
        }
        i10 = i9 | 1572864;
        if ((599187 & i10) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i10 & 1, z)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if ((i2 & 8) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i10 &= -7169;
                }
                if (i4 != 0) {
                    function3 = null;
                }
                if (i7 != 0) {
                    function4 = null;
                }
                i11 = i10;
                mm40Var3 = jm40.b;
                xczVar2 = xczVarA;
                function7 = function3;
                function8 = function4;
            } else {
                if ((i2 & 8) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i10 &= -7169;
                }
                if (i4 != 0) {
                    function3 = null;
                }
                if (i7 != 0) {
                    function4 = null;
                }
                i11 = i10;
                mm40Var3 = jm40.b;
                xczVar2 = xczVarA;
                function7 = function3;
                function8 = function4;
            }
            fetVar.s();
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarD2 = o7k0.d(o7k0.e(mm40Var3, 160.0f), 1.0f);
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            if ((i11 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((57344 & i11) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z2 | z3;
            if ((458752 & i11) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z7 | z4;
            objP = fetVar.P();
            if (z5) {
                objP = new f8m((Object) htrVar, (Object) function7, (Object) function8, (byte) 4);
                fetVar.o0(objP);
            } else {
                objP = new f8m((Object) htrVar, (Object) function7, (Object) function8, (byte) 4);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD2, xczVar2, lh80Var, false, qw3Var2, null, null, false, null, (Function1) objP, fetVar, ((i11 >> 6) & 112) | (i11 & 896), Response.NOT_ACCEPTABLE_HERE);
            function5 = function7;
            function6 = function8;
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            xczVar2 = xczVarA;
            function5 = function3;
            function6 = function4;
            mm40Var2 = mm40Var;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tl0(mm40Var2, htrVar, lh80Var, xczVar2, function5, function6, i, i2);
        }
    }

    public static final String x0(String str) {
        List listT0;
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{" & "}, false, 0, 6, null);
        if (listSplit$default.size() != 2) {
            listSplit$default = null;
        }
        return (listSplit$default == null || (listT0 = CollectionsKt.t0(listSplit$default)) == null) ? str : CollectionsKt.b0(listT0, " & ", null, null, null, 62);
    }

    public static final void y(mm40 mm40Var, htr htrVar, hh80 hh80Var, d9z d9zVar, Function2 function2, Function1 function1, fet fetVar, int i, int i2) {
        Function2 function3;
        int i3;
        Function1 function4;
        int i4;
        Function2 function5;
        Function1 function6;
        fetVar.g0(117717013);
        int i5 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(htrVar) ? 32 : 16) | (fetVar.g(hh80Var) ? 256 : 128) | (fetVar.g(d9zVar) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            function3 = function2;
        } else {
            function3 = function2;
            i3 = i5 | (fetVar.i(function3) ? 16384 : 8192);
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i3 | 196608;
            function4 = function1;
        } else {
            function4 = function1;
            i4 = i3 | (fetVar.i(function4) ? 131072 : 65536);
        }
        int i8 = i4 | 1572864;
        if (fetVar.U(i8 & 1, (599187 & i8) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if (i6 != 0) {
                    function3 = null;
                }
                if (i7 != 0) {
                    function4 = null;
                }
            } else {
                fetVar.X();
            }
            Function1 function7 = function4;
            Function2 function8 = function3;
            fetVar.s();
            gtr gtrVar = htrVar instanceof gtr ? (gtr) htrVar : null;
            boolean z = gtrVar != null ? gtrVar.f11894a : true;
            boolean z2 = ((i8 & 112) == 32) | ((57344 & i8) == 16384) | ((458752 & i8) == 131072);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new d8m((Object) htrVar, (Object) function8, (Object) function7, (byte) 27);
                fetVar.o0(objP);
            }
            int i9 = i8 & 14;
            int i10 = i8 >> 3;
            z(mm40Var, hh80Var, d9zVar, z, (Function2) objP, fetVar, i9 | (i10 & 112) | (i10 & 896), 0);
            function5 = function8;
            function6 = function7;
        } else {
            fetVar.X();
            function5 = function3;
            function6 = function4;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tl0(mm40Var, htrVar, hh80Var, d9zVar, function5, function6, i, i2);
        }
    }

    public static final void y0(a1o0 a1o0Var, tkz tkzVar, zhf zhfVar) {
        SyntheticTimerView syntheticTimerView = a1o0Var.c;
        phf phfVar = zhfVar.g;
        syntheticTimerView.setTimerDescription(phfVar.b);
        SyntheticTimerView.b(syntheticTimerView, phfVar.f26993a, tkzVar, phfVar.d, 4);
        syntheticTimerView.setVisibility(phfVar.c ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[PHI: r3 r4
  0x00a4: PHI (r3v17 int) = (r3v11 int), (r3v8 int), (r3v18 int) binds: [B:64:0x00b2, B:58:0x00a0, B:59:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r4v17 a.d9z) = (r4v6 a.d9z), (r4v3 a.d9z), (r4v3 a.d9z) binds: [B:64:0x00b2, B:58:0x00a0, B:59:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void z(mm40 mm40Var, hh80 hh80Var, d9z d9zVar, boolean z, Function2 function2, fet fetVar, int i, int i2) {
        int i3;
        d9z d9zVarA;
        boolean z2;
        byte b;
        boolean z3;
        boolean z4;
        d9z d9zVar2;
        boolean z5;
        yfe0 yfe0VarU;
        d9z d9zVar3;
        int iI0;
        boolean zE;
        Object objP;
        int i4;
        function2.getClass();
        fetVar.g0(17847613);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(hh80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                d9zVarA = d9zVar;
                int i5 = fetVar.g(d9zVarA) ? 256 : 128;
                i3 |= i5;
            } else {
                d9zVarA = d9zVar;
            }
            i3 |= i5;
        } else {
            d9zVarA = d9zVar;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (fetVar.i(function2)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            b = 0;
            z3 = true;
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                fetVar.Z();
                if ((i & 1) != 0 || fetVar.B()) {
                    if ((i2 & 4) != 0) {
                        d9zVarA = f9z.a(fetVar);
                        i3 &= -897;
                    }
                    if (i6 != 0) {
                        d9zVar3 = d9zVarA;
                    }
                    fetVar.s();
                    iI0 = i0();
                    mm40 mm40VarE0 = o2e.e0(mm40Var, "LAZY_ROW_GAMES_CARD_COLLECTION");
                    ngv ngvVar = new ngv(iI0);
                    zE = ((57344 & i3) == 16384) | fetVar.e(iI0);
                    objP = fetVar.P();
                    if (zE || objP == ukd.f35823a) {
                        objP = new ran(function2, iI0, b);
                        fetVar.o0(objP);
                    }
                    g8x.i(ngvVar, mm40VarE0, d9zVar3, hh80Var, null, null, null, z3, null, (Function1) objP, fetVar, (i3 & 896) | ((i3 << 6) & 7168) | ((i3 << 15) & 234881024), 752);
                    d9zVar2 = d9zVar3;
                    z5 = z3;
                } else {
                    fetVar.X();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                d9zVar3 = d9zVarA;
                z3 = z2;
                fetVar.s();
                iI0 = i0();
                mm40 mm40VarE1 = o2e.e0(mm40Var, "LAZY_ROW_GAMES_CARD_COLLECTION");
                ngv ngvVar2 = new ngv(iI0);
                zE = ((57344 & i3) == 16384) | fetVar.e(iI0);
                objP = fetVar.P();
                if (zE) {
                    objP = new ran(function2, iI0, b);
                    fetVar.o0(objP);
                } else {
                    objP = new ran(function2, iI0, b);
                    fetVar.o0(objP);
                }
                g8x.i(ngvVar2, mm40VarE1, d9zVar3, hh80Var, null, null, null, z3, null, (Function1) objP, fetVar, (i3 & 896) | ((i3 << 6) & 7168) | ((i3 << 15) & 234881024), 752);
                d9zVar2 = d9zVar3;
                z5 = z3;
            } else {
                fetVar.X();
                d9zVar2 = d9zVarA;
                z5 = z2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new x3n(mm40Var, hh80Var, d9zVar2, z5, function2, i, i2);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if (fetVar.i(function2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        b = 0;
        z3 = true;
        if ((i3 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (fetVar.U(i3 & 1, z4)) {
            fetVar.Z();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    d9zVarA = f9z.a(fetVar);
                    i3 &= -897;
                }
                if (i6 != 0) {
                    d9zVar3 = d9zVarA;
                } else {
                    d9zVar3 = d9zVarA;
                    z3 = z2;
                }
            } else {
                if ((i2 & 4) != 0) {
                    d9zVarA = f9z.a(fetVar);
                    i3 &= -897;
                }
                if (i6 != 0) {
                    d9zVar3 = d9zVarA;
                } else {
                    d9zVar3 = d9zVarA;
                    z3 = z2;
                }
            }
            fetVar.s();
            iI0 = i0();
            mm40 mm40VarE2 = o2e.e0(mm40Var, "LAZY_ROW_GAMES_CARD_COLLECTION");
            ngv ngvVar3 = new ngv(iI0);
            zE = ((57344 & i3) == 16384) | fetVar.e(iI0);
            objP = fetVar.P();
            if (zE) {
                objP = new ran(function2, iI0, b);
                fetVar.o0(objP);
            } else {
                objP = new ran(function2, iI0, b);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar3, mm40VarE2, d9zVar3, hh80Var, null, null, null, z3, null, (Function1) objP, fetVar, (i3 & 896) | ((i3 << 6) & 7168) | ((i3 << 15) & 234881024), 752);
            d9zVar2 = d9zVar3;
            z5 = z3;
        } else {
            fetVar.X();
            d9zVar2 = d9zVarA;
            z5 = z2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x3n(mm40Var, hh80Var, d9zVar2, z5, function2, i, i2);
        }
    }

    public static final void z0(a1o0 a1o0Var, zhf zhfVar) {
        TextView textView = a1o0Var.d;
        String str = zhfVar.d;
        if (str.length() > 0) {
            textView.setText(str);
            Iterator it = q3d.j(textView, a1o0Var.b).iterator();
            while (it.hasNext()) {
                ((View) it.next()).animate().alpha(1.0f).setDuration(500L);
            }
        }
    }
}
