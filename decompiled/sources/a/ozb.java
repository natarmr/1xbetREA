package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.javax.sip.message.Response;
import android.util.Rational;
import android.view.View;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ozb {
    public static final void A(pa00 pa00Var, float f, float f2, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        int i3 = pa00Var.e;
        fetVar2.g0(-2020681527);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(pa00Var) ? 4 : 2) | i;
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
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar2.b0(-549722037, pa00Var.f);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ufw(pa00Var, (byte) 0);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(i3, (Function0) objP, fetVar2, 0, 2);
            fetVar2.r(false);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zG = (i4 == 4) | fetVar2.g(kwjVarB);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new xfw(kwjVarB, pa00Var, null, b);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP2);
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, f, 0.0f, f2, 5);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
            ebc.r(null, new fyl(pa00Var.d, null, null, s5x0.t(8.0f, 0.0f, 2), null, 22), null, function2, null, fetVar2, i2 & 57344, 45);
            q5x.e(kwjVarB, new x7z(1.0f, true), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1276349312, new vfw(pa00Var, function1, b), fetVar2), fetVar, 100663296, 24576, 16124);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wfw(pa00Var, f, f2, function1, function2, i, (byte) 0);
        }
    }

    public static final void B(mm40 mm40Var, h0n h0nVar, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1866385852);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(h0nVar) ? 32 : 16;
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 6.0f, 5);
            mpm mpmVar = h0nVar.e;
            g0n g0nVar = h0nVar.b;
            E(mm40VarN, mpmVar, h0nVar.f12244a, fetVar2, 0);
            if (g0nVar instanceof e0n) {
                fetVar2.e0(2041065149);
                e0n e0nVar = (e0n) g0nVar;
                boolean zG = fetVar2.g(e0nVar);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new c8n(e0nVar.b, new w7n(new y7n(), e0nVar.f6996a, e0nVar.d, 0, false, null, 56));
                    fetVar2.o0(objP);
                }
                v7n.c(null, (c8n) objP, null, fetVar2, 5);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str = e0nVar.c;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                z = true;
                v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                if (Intrinsics.d(g0nVar, f0n.f8723a)) {
                    fetVar2.e0(2042070665);
                    j6n.h("VAR", nro0.f24013a, null, 0, 0, fetVar2, 54, 28);
                    fetVar2.r(false);
                } else {
                    if (g0nVar != null) {
                        throw b1j.f(2005500263, fetVar2, false);
                    }
                    fetVar2.e0(2042239026);
                    fetVar2.r(false);
                }
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 26, i, mm40Var, h0nVar);
        }
    }

    public static final void C(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, kpm kpmVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(14688963);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(a4xVar) ? 2048 : 1024) | (fetVar.g(a4xVar2) ? 16384 : 8192) | (fetVar.g(kpmVar) ? 131072 : 65536) | (fetVar.h(z) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            p(null, a4xVar, a4xVar2, kpmVar, z, fetVar, (i2 >> 6) & 65520);
            if (str.length() <= 0 && str2.length() <= 0) {
                fetVar.e0(216915989);
                fetVar.r(false);
            } else {
                fetVar.e0(216724750);
                i(i2 & 1008, fetVar, null, str, str2);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var2, str, str2, (Object) a4xVar, (Object) a4xVar2, kpmVar, z, i, (byte) 6);
        }
    }

    public static final void D(mm40 mm40Var, boolean z, ows0 ows0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        int i2 = ows0Var.b;
        fetVar2.g0(-1664954232);
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
                objP = new b0n(ows0Var, (byte) 0);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            if (i2 > 0) {
                fetVar2.e0(843344175);
                tdc.e(new rpe(i2), ipe.f15159a, ffb0.Q(jr8.f16991a.b(jm40Var, z ? gqw0.i : gqw0.g), z ? 3.0f : -3.0f, 2.0f), fetVar2, 48, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(843965942);
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
            yfe0VarU.d = new c0n(mm40Var, z, ows0Var, i, (byte) 0);
        }
    }

    public static final void E(mm40 mm40Var, mpm mpmVar, boolean z, fet fetVar, int i) {
        fetVar.g0(270155309);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mpmVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n4c.l(mm40Var, mpmVar, z, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwm(mm40Var, mpmVar, z, i, (byte) 1);
        }
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-455259382);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 108.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0g(mm40Var, i, b);
        }
    }

    public static final void G(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        mm40 mm40Var2;
        zfn zfnVar;
        zfn zfnVar2;
        zhg0 zhg0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-682889264);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(str3) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zfn zfnVar3 = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar3)).getTextPrimary();
            zfn zfnVar4 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar4)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            zhg0 zhg0Var2 = zhg0.f44392a;
            v8q0.a(str, zhg0Var2.a(1.0f, jm40Var, true), textPrimary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, y9q0VarD, fetVar2, (i2 >> 3) & 14, 24960, 109560);
            fet fetVar3 = fetVar2;
            if (str3.length() > 0) {
                fetVar3.e0(-514758344);
                long secondary = ((ThemeColors) fetVar3.k(zfnVar3)).getSecondary();
                ((g1t0) fetVar3.k(zfnVar4)).getClass();
                zfnVar = zfnVar3;
                zfnVar2 = zfnVar4;
                zhg0Var = zhg0Var2;
                v8q0.a(str3, zhg0Var2.a(1.0f, jm40Var, true), secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar3, (i2 >> 9) & 14, 24960, 109560);
                fetVar3 = fetVar3;
                fetVar3.r(false);
            } else {
                zfnVar = zfnVar3;
                zfnVar2 = zfnVar4;
                zhg0Var = zhg0Var2;
                fetVar3.e0(-514419762);
                fetVar3.r(false);
            }
            long textPrimary2 = ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar3.k(zfnVar2)).getClass();
            fet fetVar4 = fetVar3;
            v8q0.a(str2, zhg0Var.a(1.0f, jm40Var, true), textPrimary2, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar4, (i2 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar4;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cm5(mm40Var2, str, str2, str3, i, (byte) 1);
        }
    }

    public static final void H(lc00 lc00Var, m9s m9sVar, kgf kgfVar, ctf0 ctf0Var, boolean z) {
        String strA;
        String strA2;
        kff iffVar;
        igg0 igg0Var;
        m9sVar.getClass();
        ctf0Var.getClass();
        Integer num = 2;
        Integer num2 = 1;
        mff mffVar = kgfVar.f18235a;
        ngf ngfVar = kgfVar.d;
        ngf ngfVar2 = kgfVar.c;
        boolean z2 = mffVar == mff.b || mffVar == mff.f21691a;
        Iterator it = ngfVar2.f23482a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((chf) it.next()).e;
        }
        Iterator it2 = ngfVar.f23482a.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            i2 += ((chf) it2.next()).e;
        }
        String strV = V(ngfVar2, 1);
        String strV2 = V(ngfVar2, 2);
        String strV3 = V(ngfVar, 1);
        String strV4 = V(ngfVar, 2);
        long j = m9sVar.f21426a;
        qqs qqsVar = m9sVar.h;
        String str = m9sVar.i;
        String str2 = m9sVar.j;
        int i3 = kgfVar.e;
        String strA3 = "";
        switch (mffVar.ordinal()) {
            case 0:
                num = num;
                num2 = num2;
                strA = ctf0Var.b.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0));
                break;
            case 1:
                strA2 = ctf0Var.b.a(R.string.crystal_waiting_for_bids, Arrays.copyOf(new Object[0], 0));
                strA = strA2;
                break;
            case 2:
            case 3:
            case 4:
                strA2 = ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                strA = strA2;
                break;
            case 5:
                num = num;
                num2 = num2;
                strA = ctf0Var.b.a(R.string.crystal_round_layout_percent, Arrays.copyOf(new Object[]{num2, Integer.valueOf(i3)}, 2));
                break;
            case 6:
                num = num;
                strA = ctf0Var.b.a(R.string.crystal_round_layout_percent, Arrays.copyOf(new Object[]{num, Integer.valueOf(i3)}, 2));
                num2 = num2;
                break;
            default:
                num = num;
                num2 = num2;
                strA = "";
                break;
        }
        shf shfVar = new shf(str, str2, strA, !z2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = kgfVar.b;
        ArrayList<cgf> arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ggf ggfVar = (ggf) it3.next();
            ggfVar.getClass();
            shf shfVar2 = shfVar;
            Iterator it4 = it3;
            nhf nhfVar = (nhf) nhf.d.get(ggfVar.f11251a);
            qqs qqsVar2 = qqsVar;
            arrayList3.add(new cgf(ggfVar.c, ggfVar.b, nhfVar, (mffVar == mff.b || mffVar == mff.f21691a) ? bgf.b : ggfVar.d ? bgf.d : bgf.c));
            it3 = it4;
            shfVar = shfVar2;
            qqsVar = qqsVar2;
        }
        shf shfVar3 = shfVar;
        qqs qqsVar3 = qqsVar;
        for (cgf cgfVar : arrayList3) {
            if (cgfVar.b < 0) {
                arrayList.add(cgfVar);
            } else {
                arrayList2.add(cgfVar);
                if (cgfVar.d == bgf.d) {
                    linkedHashSet.add(Integer.valueOf(cgfVar.f4309a));
                }
            }
        }
        if (!linkedHashSet.isEmpty()) {
            iffVar = new jff(linkedHashSet, arrayList2, arrayList);
        } else if (arrayList.isEmpty()) {
            iffVar = mffVar == mff.b ? gff.f11203a : new iff(arrayList2);
        } else {
            iffVar = new hff(arrayList);
        }
        int iOrdinal = mffVar.ordinal();
        if (iOrdinal == 2) {
            strA3 = ctf0Var.b.a(R.string.crystal_player_win_v2, Arrays.copyOf(new Object[]{num2}, 1));
        } else if (iOrdinal == 3) {
            strA3 = ctf0Var.b.a(R.string.crystal_player_win_v2, Arrays.copyOf(new Object[]{num}, 1));
        } else if (iOrdinal == 4) {
            strA3 = ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[0], 0));
        }
        String str3 = strA3;
        thf thfVar = new thf(dyb.m0(ngfVar2, ctf0Var), strV, strV2, c0(ngfVar2));
        vhf vhfVar = new vhf(dyb.m0(ngfVar, ctf0Var), strV3, strV4, c0(ngfVar));
        long jF = znq0.f(qqsVar3.h);
        String strA4 = mffVar == mff.f21691a ? ctf0Var.b.a(R.string.crystal_time_before_game, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.move_in_time, Arrays.copyOf(new Object[0], 0));
        znq0 znq0Var = qqsVar3.k;
        y3d y3dVar = null;
        phf phfVar = new phf(jF, znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null, strA4, z2);
        Object[] objArr = {Integer.valueOf(i)};
        lsm0 lsm0Var = ctf0Var.b;
        String strA5 = lsm0Var.a(R.string.crystal_short_points, Arrays.copyOf(objArr, 1));
        String strA6 = lsm0Var.a(R.string.crystal_short_points, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        int i4 = kgfVar.f;
        if (i4 == 0) {
            igg0Var = igg0.f14734a;
        } else if (i4 != 1) {
            igg0Var = i4 != 2 ? igg0.c : igg0.c;
        } else {
            igg0Var = igg0.b;
        }
        lc00Var.add(new zhf(j, shfVar3, iffVar, str3, thfVar, vhfVar, phfVar, strA5, strA6, igg0Var, z));
        i4 i4VarG0 = dyb.g0(new lxl(1L, (dyl) new xxl(lsm0Var.a(R.string.crystal_odds_tab, Arrays.copyOf(new Object[0], 0))), false, uxl.b, (cwl) null, 108));
        zcl zclVar = qmk.f28987a;
        lc00Var.add(new boo0("CRYSTAL_TAB_KEY", new fyl(i4VarG0, null, null, s5x0.t(12.0f, 0.0f, 2), new jyl(new y3d(ijg.I), y3dVar, y3dVar, 126), 6), pno0.f27299a));
        lc00Var.add(new mgf());
    }

    public static final void I(String str, StringBuilder sb) {
        if (sb.length() <= 0 || str == null || str.length() == 0) {
            return;
        }
        sb.append(". ".concat(str));
    }

    public static final pb10 J(long j, pb10 pb10Var) {
        if (j == 1) {
            return pb10.l;
        }
        if (j == 46) {
            return pb10.m;
        }
        if (j == 2) {
            return pb10.p;
        }
        if (j == 27) {
            return pb10.t;
        }
        if (j == 15) {
            return pb10.z;
        }
        if (j == 4) {
            return pb10.B;
        }
        if (j == 9 || j == 8) {
            return pb10.k1;
        }
        if (j == 6) {
            return pb10.m1;
        }
        if (j == 21) {
            return pb10.o1;
        }
        return j == 36 ? pb10.q1 : pb10Var;
    }

    public static final pb10 K(long j) {
        if (j == 1) {
            return pb10.k;
        }
        if (j == 46) {
            return pb10.n;
        }
        if (j == 2) {
            return pb10.o;
        }
        if (j == 27) {
            return pb10.s;
        }
        if (j == 15) {
            return pb10.y;
        }
        if (j == 4) {
            return pb10.A;
        }
        if (j == 9 || j == 8) {
            return pb10.j1;
        }
        if (j == 6) {
            return pb10.l1;
        }
        if (j == 21) {
            return pb10.n1;
        }
        return j == 36 ? pb10.p1 : pb10.u;
    }

    public static final pb10 L(long j, pb10 pb10Var) {
        if (j == 85) {
            return pb10.x;
        }
        if (j == 150) {
            return pb10.B;
        }
        if (j == 235) {
            return pb10.Z;
        }
        if (j == 195) {
            return pb10.g1;
        }
        if (j == 146 || j == 153 || j == 167 || j == 210 || j == 236 || j == 257 || j == 274 || j == 284 || j == 311 || j == 312) {
            return pb10.i1;
        }
        return j == 310 ? pb10.k1 : pb10Var;
    }

    public static final boolean M(long j, long j2) {
        return j == j2;
    }

    public static pb10 N(long j, long j2) {
        pb10 pb10Var = pb10.v;
        return j == 40 ? J(j2, pb10Var) : L(j, pb10Var);
    }

    public static final pb10 O(long j, long j2) {
        if (j == 40) {
            return K(j2);
        }
        if (j == 85) {
            return pb10.w;
        }
        if (j == 150) {
            return pb10.A;
        }
        if (j == 235) {
            return pb10.Y;
        }
        if (j == 195) {
            return pb10.f1;
        }
        if (j == 146 || j == 153 || j == 167 || j == 210 || j == 236 || j == 257 || j == 274 || j == 284 || j == 311 || j == 312) {
            return pb10.h1;
        }
        return j == 310 ? pb10.j1 : pb10.u;
    }

    public static final mdm P(long j, g2v g2vVar) {
        g2vVar.getClass();
        return g2v.b(g2vVar, J(j, pb10.v), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    public static final mdm Q(long j, g2v g2vVar) {
        g2vVar.getClass();
        return g2v.b(g2vVar, J(j, pb10.v), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    public static String R() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + Separators.COLON + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String S() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + Separators.COLON + stackTraceElement.getLineNumber() + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String T(int i, Context context) {
        if (i == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            i = context.getResources().getResourceEntryName(i);
            return i;
        } catch (Exception unused) {
            return twn.m(i, Separators.QUESTION);
        }
    }

    public static String U(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public static final String V(ngf ngfVar, int i) {
        List list = ngfVar.f23482a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((chf) obj).f4356a == i) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((chf) it.next()).e;
        }
        return String.valueOf(i2);
    }

    public static final Pair W(l9s l9sVar) {
        String string;
        String string2;
        Object next;
        String str;
        l9sVar.getClass();
        List listSplit$default = null;
        if (l9sVar.getType() == s9s.f31862a) {
            Iterator it = l9sVar.F().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((sem0) next).f32081a != rem0.j);
            sem0 sem0Var = (sem0) next;
            if (sem0Var != null && (str = sem0Var.b) != null) {
                listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.SLASH}, false, 0, 6, null);
            }
        }
        if (listSplit$default == null || (string = (String) CollectionsKt.firstOrNull(listSplit$default)) == null) {
            string = StringsKt.u0(l9sVar.j()).toString();
        }
        if (listSplit$default == null || (string2 = (String) CollectionsKt.f0(listSplit$default)) == null) {
            string2 = StringsKt.u0(l9sVar.g()).toString();
        }
        String str2 = l9sVar.y().e;
        String str3 = l9sVar.y().f;
        if (str2.length() > 0) {
            string = kng0.m(string, " (", str2, Separators.RPAREN);
        }
        if (str3.length() > 0) {
            string2 = kng0.m(string2, " (", str3, Separators.RPAREN);
        }
        return new Pair(string, string2);
    }

    public static final boolean X(m97 m97Var, qu6 qu6Var) {
        m97Var.getClass();
        qu6Var.getClass();
        return m97Var.f21398a == qu6Var.b && m97Var.h == qu6Var.x && m97Var.b == qu6Var.w.f36034a && m97Var.f == qu6Var.d && m97Var.j == qu6Var.t;
    }

    public static final boolean Y(tg7 tg7Var, qu6 qu6Var) {
        tg7Var.getClass();
        qu6Var.getClass();
        return tg7Var.f33895a == qu6Var.b && tg7Var.t == qu6Var.x && tg7Var.s.f36034a == qu6Var.w.f36034a;
    }

    public static List Z(List list, int i, Rect rect, Rational rational, int i2, yd40 yd40Var) {
        PointF pointF;
        list.getClass();
        rect.getClass();
        if (list.isEmpty() || i == 0) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wd40 wd40Var = (wd40) it.next();
            if (arrayList.size() >= i) {
                break;
            }
            float f = wd40Var.f38956a;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = wd40Var.b;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    Rational rational3 = wd40Var.c;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointFE = yd40Var.e(wd40Var, i2);
                    if (rational3.equals(rational2)) {
                        pointF = new PointF(pointFE.x, pointFE.y);
                    } else if (rational3.compareTo(rational2) > 0) {
                        pointF = new PointF(pointFE.x, pointFE.y);
                        float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                        pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                    } else {
                        pointF = new PointF(pointFE.x, pointFE.y);
                        float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                        pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                    }
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth2 = ((int) (rect.width() * 0.15f)) / 2;
                    int iHeight2 = ((int) (0.15f * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    rect2.left = l1e0.d(rect2.left, rect.left, rect.right);
                    rect2.right = l1e0.d(rect2.right, rect.left, rect.right);
                    rect2.top = l1e0.d(rect2.top, rect.top, rect.bottom);
                    rect2.bottom = l1e0.d(rect2.bottom, rect.top, rect.bottom);
                    arrayList.add(new MeteringRectangle(rect2, 1000));
                }
            }
        }
        return arrayList;
    }

    public static final void a(n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(-941664945);
        int i2 = (fetVar.g(n0xVar) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), vgg0.a(12.0f));
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
            uc9.c(lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.a(8.0f)), lgb.J(o7k0.n(jm40Var, 24.0f), vgg0.a(8.0f)), n0xVar, Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), null, null, gqw0.B, null, fetVar, ((i2 << 6) & 896) | 12582912, 352);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, b);
        }
    }

    public static final be9 a0(fet fetVar) {
        lh80 lh80Var = ee9.f7659a;
        zfn zfnVar = zaq0.b;
        return ee9.a(((ThemeColors) fetVar.k(zfnVar)).getPrimary(), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary20(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary40(), fetVar, 0);
    }

    public static final void b(h0g h0gVar, hh80 hh80Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-684075863);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(h0gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hh80Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            g4m g4mVar = h0gVar.c;
            zfn zfnVar = bmd.n;
            jeb.q(mm40VarN, g4mVar, s5x0.u(s5x0.B(hh80Var, (k6z) fetVar.k(zfnVar)), 0.0f, s5x0.A(hh80Var, (k6z) fetVar.k(zfnVar)), 0.0f, 10), fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f0g(h0gVar, hh80Var, i, b);
        }
    }

    public static final l7m0 b0(a4x a4xVar, fet fetVar, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && fetVar.g(a4xVar)) || (i & 6) == 4;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = jgk0.b(new ife(a4xVar, (byte) 2));
            fetVar.o0(objP);
        }
        return (l7m0) objP;
    }

    public static final void c(h0g h0gVar, hh80 hh80Var, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-538935138);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(h0gVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(hh80Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            zfn zfnVar = bmd.n;
            mm40 mm40VarI = s5x0.I(mm40VarE, s5x0.u(s5x0.B(hh80Var, (k6z) fetVar2.k(zfnVar)), 0.0f, s5x0.A(hh80Var, (k6z) fetVar2.k(zfnVar)), 0.0f, 10));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarI);
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
            a(h0gVar.f12233a, fetVar2, 0);
            b = 1;
            v8q0.a(h0gVar.b, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f0g(h0gVar, hh80Var, i, b);
        }
    }

    public static final boolean c0(ngf ngfVar) {
        boolean z;
        boolean z2;
        List list = ngfVar.f23482a;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((chf) it.next()).f4356a == 1) {
                z = true;
                break;
            }
        }
        if (list != null && list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if (((chf) it2.next()).f4356a == 2) {
                z2 = true;
                break;
            }
        }
        return z && z2;
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-463192039);
        int i2 = i | 6 | (fetVar2.g(r2n.f29744a) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        byte b = 11;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 40.0f), 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, b)), gqw0.n, fetVar2, 48);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -1561391385, false);
            if (str2.length() > 0) {
                fetVar2.e0(-1157809127);
                long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                jm40Var = jm40Var2;
                v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 6) & 14, 24960, 109562);
                str2 = str;
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(-1157516673);
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
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 11);
        }
    }

    public static final List d0(c5l c5lVar, boolean z, boolean z2, boolean z3) {
        g9l g9lVar = c5lVar.f3777a;
        long j = g9lVar.f;
        long j2 = g9lVar.e;
        if (z) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        for (b3l b3lVar : b3l.e) {
            lc00VarB.add(new x2l(b3lVar.name(), b3lVar.f1912a, b3lVar.b, b3lVar.c));
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        lc00 lc00VarB2 = kotlin.collections.a.b();
        String binaryString = Integer.toBinaryString((int) j);
        binaryString.getClass();
        char[] charArray = ttm0.M(12, StringsKt.b0(12, binaryString)).toCharArray();
        charArray.getClass();
        for (c3l c3lVar : c3l.f) {
            Object objE = tx3.E(c3lVar.f3681a, charArray);
            if (objE == null) {
                objE = 0;
            }
            lc00VarB2.add(new y2l(objE.equals('1') && j != 0, c3lVar.name(), c3lVar.b, c3lVar.c, c3lVar.d));
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(lc00VarA, kotlin.collections.a.a(lc00VarB2));
        lc00 lc00VarB3 = kotlin.collections.a.b();
        String binaryString2 = Integer.toBinaryString((int) j2);
        binaryString2.getClass();
        char[] charArray2 = ttm0.M(22, StringsKt.b0(22, binaryString2)).toCharArray();
        charArray2.getClass();
        for (d3l d3lVar : d3l.f) {
            Object objE2 = tx3.E(d3lVar.f5407a, charArray2);
            if (objE2 == null) {
                objE2 = 0;
            }
            lc00VarB3.add(new z2l(objE2.equals('1') && j2 != 0, d3lVar.name(), d3lVar.b, d3lVar.c, d3lVar.d));
        }
        return CollectionsKt.q0(CollectionsKt.q0(arrayListQ0, kotlin.collections.a.a(lc00VarB3)), iun.f15405a);
    }

    public static final void e(mm40 mm40Var, final rzb rzbVar, Function1 function1, fet fetVar, int i) {
        rzbVar.getClass();
        function1.getClass();
        fetVar.g0(-139657415);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(rzbVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new hzb(function1, rzbVar, (byte) 0);
                fetVar.o0(objP2);
            }
            f(y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP2, 28), u1c.M(88237116, new ab4((Object) rzbVar, (Object) function1, (byte) 20), fetVar), u1c.M(-148380709, new xdr() { // from class: a.kzb
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    rzb rzbVar2 = rzbVar;
                    switch (b3) {
                        case 0:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(rzbVar2.b, s5x0.N(mm40VarA, 0.0f, 10.0f, 16.0f, 10.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (!fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                fetVar3.X();
                            } else if (rzbVar2.c.c) {
                                fetVar3.e0(-1928565999);
                                zcl zclVar2 = qmk.f28987a;
                                j0x.b(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar3), null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 16.0f), null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getWarning(), 5), fetVar3, 24632, 40);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(-1928130232);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-384998534, new xdr() { // from class: a.kzb
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    rzb rzbVar2 = rzbVar;
                    switch (b3) {
                        case 0:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(rzbVar2.b, s5x0.N(mm40VarA, 0.0f, 10.0f, 16.0f, 10.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (!fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                fetVar3.X();
                            } else if (rzbVar2.c.c) {
                                fetVar3.e0(-1928565999);
                                zcl zclVar2 = qmk.f28987a;
                                j0x.b(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar3), null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 16.0f), null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getWarning(), 5), fetVar3, 24632, 40);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(-1928130232);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 3504);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, rzbVar, function1, i, (byte) 4);
        }
    }

    public static final swp e0(rwp rwpVar) {
        Integer num;
        Boolean bool;
        Integer num2;
        Integer num3;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        long jLongValue = (rwpVar == null || (l4 = rwpVar.f31226a) == null) ? -1L : l4.longValue();
        long jLongValue2 = (rwpVar == null || (l3 = rwpVar.b) == null) ? -1L : l3.longValue();
        long jLongValue3 = (rwpVar == null || (l2 = rwpVar.c) == null) ? -1L : l2.longValue();
        String str = rwpVar != null ? rwpVar.d : null;
        if (str == null) {
            str = "";
        }
        String str2 = rwpVar != null ? rwpVar.e : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = rwpVar != null ? rwpVar.f : null;
        if (str3 == null) {
            str3 = "";
        }
        List list = rwpVar != null ? rwpVar.g : null;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = rwpVar != null ? rwpVar.h : null;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = rwpVar != null ? rwpVar.i : null;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        List list4 = rwpVar != null ? rwpVar.j : null;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        String str4 = rwpVar != null ? rwpVar.k : null;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        String str6 = rwpVar != null ? rwpVar.l : null;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = str6;
        String str8 = rwpVar != null ? rwpVar.m : null;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = str8;
        List list5 = rwpVar != null ? rwpVar.n : null;
        if (list5 == null) {
            list5 = iun.f15405a;
        }
        List list6 = list5;
        long jLongValue4 = (rwpVar == null || (l = rwpVar.o) == null) ? -1L : l.longValue();
        String str10 = rwpVar != null ? rwpVar.p : null;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = str10;
        Map map = rwpVar != null ? rwpVar.q : null;
        if (map == null) {
            map = lun.f20680a;
            map.getClass();
        }
        int iIntValue = -1;
        Map map2 = map;
        int iIntValue2 = (rwpVar == null || (num3 = rwpVar.r) == null) ? -1 : num3.intValue();
        int iIntValue3 = (rwpVar == null || (num2 = rwpVar.s) == null) ? -1 : num2.intValue();
        String str12 = rwpVar != null ? rwpVar.t : null;
        String str13 = str12 != null ? str12 : "";
        boolean zBooleanValue = (rwpVar == null || (bool = rwpVar.u) == null) ? false : bool.booleanValue();
        if (rwpVar != null && (num = rwpVar.v) != null) {
            iIntValue = num.intValue();
        }
        return new swp(jLongValue, jLongValue2, jLongValue3, str, str2, str3, list, list2, list3, list4, str5, str7, str9, list6, jLongValue4, str11, map2, iIntValue2, iIntValue3, str13, zBooleanValue, iIntValue);
    }

    public static final void f(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        fetVar.g0(1126511630);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.g(mm40VarD, 48.0f, 0.0f, 2), null, false, 3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, 54);
            ugdVar2.F(zhg0Var, fetVar, 54);
            ugdVar3.F(zhg0Var, fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nzb(mm40Var, ugdVar, ugdVar2, ugdVar3, i, (byte) 0);
        }
    }

    public static final GameBroadcastingParams f0(fsr fsrVar) {
        bfu0 bfu0Var = fsrVar.f10077a;
        return new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
    }

    public static final void g(mm40 mm40Var, ow3 ow3Var, yx7 yx7Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ow3 ow3Var2;
        yx7 yx7Var2;
        fetVar.g0(36461714);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | 432;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            nw3 nw3Var = uc9.g;
            yx7 yx7Var3 = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var3, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, 54);
            ugdVar2.F(zhg0Var, fetVar, 54);
            ugdVar4 = ugdVar3;
            ugdVar4.F(zhg0Var, fetVar, 54);
            fetVar.r(true);
            ow3Var2 = nw3Var;
            yx7Var2 = yx7Var3;
        } else {
            ugdVar4 = ugdVar3;
            fetVar.X();
            ow3Var2 = ow3Var;
            yx7Var2 = yx7Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, ow3Var2, yx7Var2, ugdVar, ugdVar2, ugdVar4, i, (byte) 10);
        }
    }

    public static String g0(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? kng0.l("CornerRadius.circular(", plc.R(Float.intBitsToFloat(i)), Separators.RPAREN) : b1j.k("CornerRadius.elliptical(", plc.R(Float.intBitsToFloat(i)), ", ", plc.R(Float.intBitsToFloat(i2)), Separators.RPAREN);
    }

    public static final void h(mm40 mm40Var, long j, long j2, long j3, Function0 function0, Function0 function1, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        long j4;
        long j5;
        long j6;
        long jM73getBlack400d7_KjU;
        long jM123getWhite0d7_KjU;
        int i2;
        long secondary;
        long j7;
        Object n2dVar;
        long j8;
        fetVar.g0(-1645083271);
        int i3 = i | 1168 | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                pz40 pz40Var = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
                jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                pz40 pz40Var2 = s6t0.f31722a;
                i2 = i3 & (-8177);
                secondary = s6t0.b().f33626a.getSecondary();
            } else {
                fetVar.X();
                jM73getBlack400d7_KjU = j;
                jM123getWhite0d7_KjU = j2;
                i2 = i3 & (-8177);
                secondary = j3;
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarN = o7k0.n(s5x0.J(mm40Var2, 10.0f), 36.0f);
            int i4 = 57344 & i2;
            boolean zF = (i4 == 16384) | fetVar.f(jM73getBlack400d7_KjU);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new qi4((Object) function0, jM73getBlack400d7_KjU, (byte) 3);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP);
            boolean z = (i2 & 458752) == 131072;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new pk9(function1, (byte) 12);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarK, null, null, false, null, (Function0) objP2, 28), "TOOLBAR_BUTTON");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN2 = o7k0.n(s5x0.J(jm40.b, 6.0f), 24.0f);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new e6c((byte) 28);
                fetVar.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(mm40VarN2, (Function1) objP3);
            boolean zF2 = fetVar.f(jM123getWhite0d7_KjU) | (i4 == 16384) | fetVar.f(secondary);
            Object objP4 = fetVar.P();
            if (zF2 || objP4 == cl5Var) {
                j7 = secondary;
                j8 = jM123getWhite0d7_KjU;
                n2dVar = new n2d(function0, j8, j7, (byte) 0);
                fetVar.o0(n2dVar);
            } else {
                long j9 = secondary;
                n2dVar = objP4;
                j7 = j9;
                j8 = jM123getWhite0d7_KjU;
            }
            ugdVar.F(rq8.M(mm40VarT, (Function1) n2dVar), fetVar, 48);
            fetVar.r(true);
            j6 = j7;
            j5 = j8;
            j4 = jM73getBlack400d7_KjU;
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
            j4 = j;
            j5 = j2;
            j6 = j3;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h15(mm40Var2, j4, j5, j6, function0, function1, ugdVar, i);
        }
    }

    public static final txu h0(hxu hxuVar, double d, int i) {
        hxuVar.getClass();
        return new txu(hxuVar.f13829a, hxuVar.b, hxuVar.c, hxuVar.d, hxuVar.e, hxuVar.f, d == 0.0d ? ivo0.c : new ivo0(String.valueOf(i), d), new ivo0("", hxuVar.f.b + d), hxuVar.g + d);
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        String str3;
        String str4;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1700295529);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= fetVar2.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
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
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2;
            v8q0.a(str3, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), secondary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarG, fetVar2, (i2 >> 3) & 14, 24960, 109560);
            long secondary2 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            y9q0 y9q0VarG2 = g1t0.g();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str4, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), secondary2, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0VarG2, fetVar2, (i3 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var2, str, str2, i, (byte) 5);
        }
    }

    public static final odd j(Object obj) {
        odd oddVar = new odd();
        oddVar.N(obj);
        return oddVar;
    }

    public static final void k(mm40 mm40Var, h0g h0gVar, hh80 hh80Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(795009614);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(h0gVar) ? 32 : 16) | (fetVar.g(hh80Var) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarI = s5x0.I(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), s5x0.u(0.0f, hh80Var.d(), 0.0f, hh80Var.a(), 5));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
            int i4 = (i3 >> 3) & 126;
            c(h0gVar, hh80Var, fetVar, i4);
            b(h0gVar, hh80Var, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) h0gVar, (Object) hh80Var, i, (byte) 4);
        }
    }

    public static final void l(mm40 mm40Var, j0g j0gVar, lh80 lh80Var, fet fetVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            zcl zclVar = qmk.f28987a;
            lh80Var = new lh80(12.0f, 12.0f, 12.0f, 12.0f);
        }
        if (j0gVar instanceof h0g) {
            fetVar.e0(-183130246);
            k(mm40Var, (h0g) j0gVar, lh80Var, fetVar, i & 1022);
            fetVar.r(false);
        } else {
            if (!(j0gVar instanceof i0g)) {
                throw b1j.f(-698646066, fetVar, false);
            }
            fetVar.e0(-182916904);
            F(i & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
    }

    public static final void m(int i, fet fetVar) {
        fetVar.g0(1871457225);
        jm40 jm40Var = jm40.b;
        int i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 138.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i, (byte) 25);
        }
    }

    public static final void n(mm40 mm40Var, wzr0 wzr0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        wzr0 wzr0Var2;
        fet fetVar2 = fetVar;
        wzr0Var.getClass();
        fetVar2.g0(-1202071352);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(wzr0Var) : fetVar2.i(wzr0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zfn zfnVar = m8m0.f21378a;
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            boolean zF = fetVar2.f(jM125getWhite100d7_KjU);
            Object objP = fetVar2.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 8, jM125getWhite100d7_KjU);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
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
            int i3 = i2;
            k7x.b(wzr0Var.d.a(), null, o7k0.n(jm40Var, 16.0f), null, a8k0.F(R.drawable.ic_glyph_quick_bet_inactive, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar, 32816, 6, 31720);
            fetVar.r(true);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
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
            wzr0Var2 = wzr0Var;
            String str = wzr0Var2.b;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, jm40Var, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fxb.i(wzr0Var2.f40034a, new qol(wzr0Var2.c, 14), null, null, sol.f32548a, new iol(((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU(), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), dyb.h0(rol.f30844a, rol.b, rol.c, rol.d), jol.f16863a), function0, fetVar2, ((i3 << 12) & 3670016) | 24576, 12);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            wzr0Var2 = wzr0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, wzr0Var2, function0, i, (byte) 21);
        }
    }

    public static final void o(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, boolean z) {
        int i2;
        fetVar.g0(-1227336059);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            Object objK = fetVar.k(zfnVar);
            k6z k6zVar = k6z.b;
            boolean z2 = objK == k6zVar;
            if (z2 != z) {
                k6zVar = k6z.f17794a;
            }
            obc.d(zfnVar.a(k6zVar), u1c.M(1533565765, new pi4(mm40Var, b0(a4xVar, fetVar, (i2 >> 3) & 14), z2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvm(mm40Var, a4xVar, z, i, (byte) 0);
        }
    }

    public static final void p(mm40 mm40Var, a4x a4xVar, a4x a4xVar2, kpm kpmVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(129787421);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(a4xVar2) : fetVar.i(a4xVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(kpmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
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
            o((i2 & 112) | 384, fetVar, a4xVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true);
            n4c.l(null, kpmVar, z, fetVar, 1);
            if (1.0f <= 0) {
                vcx.a("invalid weight; must be greater than zero");
            }
            o(((i2 >> 3) & 112) | 384, fetVar, a4xVar2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((byte) 9, i, mm40Var2, (Object) a4xVar, (Object) a4xVar2, (Object) kpmVar, z);
        }
    }

    public static final void q(gqk gqkVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        gqkVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(472318917);
        byte b = 16;
        int i2 = i | (fetVar2.g(gqkVar) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(jm40Var, null, false, 3);
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarW, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = false;
            wwb.j(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), gqkVar.b, 16.0f, null, null, fetVar2, 0, 56);
            zvw.k(jm40Var, gqkVar.c, true, qdzVar.b(gqkVar.f11737a, new svj(b), fetVar2, i2 & 896), s5x0.t(8.0f, 0.0f, 2), function1, fetVar2, (458752 & (i2 << 6)) | 390, 0);
            m3g m3gVar = gqkVar.d;
            boolean z2 = (57344 & i2) == 16384;
            if ((i2 & 112) == 32) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new vef(function2, gqkVar, (byte) 28);
                fetVar2.o0(objP);
            }
            e3c.b(null, m3gVar, (Function0) objP, fetVar, 0, 1);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((Object) gqkVar, (Object) qdzVar, function1, (wdr) function2, i, (byte) 1);
        }
    }

    public static final void r(String str, bpl bplVar, Function0 function0, fet fetVar, int i) {
        bplVar.getClass();
        fetVar.g0(-1417499486);
        int i2 = i | (fetVar.g(str) ? 32 : 16) | (fetVar.g(bplVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            uui0 uui0Var = new uui0(bplVar.b, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary()), str == null ? "" : str, null, null, 56);
            n0x n0xVar = new n0x(bplVar.c);
            obc.q(jm40.b, new rqm((vui0) uui0Var, (pui0) new oui0(Integer.valueOf(R.drawable.ic_round_placeholder), (y3d) null, n0xVar, (y3d) null, 26), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508), false, null, function0, null, null, null, fetVar, ((i2 << 3) & 57344) | 6, 236);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(str, bplVar, function0, i, (byte) 19);
        }
    }

    public static final void s(uzb uzbVar, e8m e8mVar, Function1 function1, fet fetVar, int i) {
        long jY;
        boolean z;
        long jM123getWhite0d7_KjU;
        boolean z2;
        y3d y3dVar;
        long textPrimary;
        e8m e8mVar2 = e8mVar;
        fet fetVar2 = fetVar;
        e8mVar2.getClass();
        function1.getClass();
        fetVar2.g0(-750044587);
        int i2 = i | (fetVar2.i(uzbVar) ? 4 : 2) | (fetVar2.g(e8mVar2) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 56.0f);
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new lrk(function1, e8mVar2, (byte) 20);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarS, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            boolean z5 = uzbVar instanceof h8m;
            if (z5) {
                fetVar2.e0(-1029411182);
                fetVar2.r(false);
                jY = StaticColors.INSTANCE.m126getWhite200d7_KjU();
            } else {
                if (!(uzbVar instanceof g8m)) {
                    throw b1j.f(-1029413922, fetVar2, false);
                }
                fetVar2.e0(-1029408302);
                jY = ibc.Y(((g8m) uzbVar).f10871a, fetVar2);
                fetVar2.r(false);
            }
            mm40 mm40VarQ = i120.Q(mm40VarE, jY, jd8.n);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
            mm40 mm40VarN3 = o7k0.n(jm40Var, 24.0f);
            o0x o0xVar = e8mVar2.b;
            if (z5) {
                fetVar2.e0(-759913258);
                z = false;
                fetVar2.r(false);
                jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            } else {
                z = false;
                if (!(uzbVar instanceof g8m)) {
                    throw b1j.f(-759915861, fetVar2, false);
                }
                fetVar2.e0(-759909896);
                long jY2 = ibc.Y(d4d.PRIMARY, fetVar2);
                fetVar2.r(false);
                jM123getWhite0d7_KjU = jY2;
            }
            y3d y3dVar2 = new y3d(jM123getWhite0d7_KjU);
            if (z5) {
                fetVar2.e0(-759905322);
                fetVar2.r(z);
                y3dVar = new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU());
                z2 = false;
            } else {
                if (!(uzbVar instanceof g8m)) {
                    throw b1j.f(-759907946, fetVar2, false);
                }
                fetVar2.e0(-2082145110);
                fetVar2.e0(-2082145111);
                z2 = false;
                fetVar2.r(false);
                fetVar2.r(false);
                y3dVar = null;
            }
            boolean z6 = z2;
            rq8.b(mm40VarN2, mm40VarN3, o0xVar, R.drawable.ic_glyph_cyber_gamepad, y3dVar2, y3dVar, null, gqw0.h1, null, fetVar2, 12582912, 320);
            fetVar2.r(true);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f), 1.0f), "DS_CYBER_ICON_COLLECTION_TEXT_TEG");
            tj30 tj30VarC2 = zq8.c(zx7Var, z6);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE0);
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
            e8mVar2 = e8mVar;
            String str = e8mVar2.c;
            if (z5) {
                fetVar2.e0(182938701);
                fetVar2.r(z6);
                textPrimary = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            } else {
                if (!(uzbVar instanceof g8m)) {
                    throw b1j.f(182936082, fetVar2, z6);
                }
                fetVar2.e0(182941427);
                textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                fetVar2.r(z6);
            }
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar2, 0, 24960, 109562);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(uzbVar, e8mVar2, function1, i, (byte) 0);
        }
    }

    public static final void t(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-614837023);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(lgb.J(o7k0.n(mm40Var, 6.0f), vgg0.f37379a), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 8);
        }
    }

    public static final void u(mm40 mm40Var, awm awmVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(613308438);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(awmVar) ? 32 : 16;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (awmVar.j) {
                fetVar.e0(978895837);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(978896761);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-184333482, new wvm(mm40Var, awmVar, b2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm(b, i, mm40Var, awmVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    public static final void v(mm40 mm40Var, h0n h0nVar, fet fetVar, int i) {
        h0n h0nVar2;
        float f;
        ?? r3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1939664216);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(h0nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 170.0f, 0.0f, 2);
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
            mm40 mm40VarE0 = o2e.e0(s5x0.L(jm40Var, 8.0f, 0.0f, 2), "FINAL_CARD_TITLE_TAG");
            String str = h0nVar.c;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarP = g1t0.p();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, mm40VarE0, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarP, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (h0nVar.d.length() > 0) {
                fetVar2.e0(-1169669590);
                mm40 mm40VarE1 = o2e.e0(s5x0.L(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 8.0f, 0.0f, 2), "FINAL_CARD_DATE_TAG");
                String str2 = h0nVar.d;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                f = 8.0f;
                v8q0.a(str2, mm40VarE1, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.n(), fetVar2, 0, 24960, 109560);
                fetVar2 = fetVar2;
                r3 = 0;
                fetVar2.r(false);
            } else {
                f = 8.0f;
                r3 = 0;
                fetVar2.e0(-1169188780);
                fetVar2.r(false);
            }
            mm40 mm40VarM = s5x0.M(r38, f, 10.0f, f, f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, r3);
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
            h0nVar2 = h0nVar;
            D(zhg0Var.a(0.33f, r38, true), true, h0nVar2.f, fetVar2, 48);
            B(zhg0Var.a(0.33f, r38, true), h0nVar2, fetVar2, i2 & 112);
            D(zhg0Var.a(0.33f, jm40Var, true), r3, h0nVar2.g, fetVar2, 48);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            h0nVar2 = h0nVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, h0nVar2, i, (byte) 29);
        }
    }

    public static final void w(mm40 mm40Var, boolean z, sd sdVar, r2v0 r2v0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        long textPrimary;
        long background;
        long j;
        pcy pcyVar;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        jm40 jm40Var;
        mm40 mm40Var2;
        jm40 jm40Var2;
        int i2;
        zx7 zx7Var;
        long j2;
        yx7 yx7Var;
        fet fetVar2 = fetVar;
        yx7 yx7Var2 = gqw0.k;
        function0.getClass();
        fetVar2.g0(-1215809161);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= fetVar2.h(z) ? 32 : 16;
        }
        int i4 = i3 | (fetVar2.g(sdVar) ? 256 : 128) | (fetVar2.g(r2v0Var) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i4 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        int i5 = i4;
        if (fetVar2.U(i5 & 1, (i5 & 74899) != 74898)) {
            y3d y3dVar = r2v0Var != null ? r2v0Var.c : null;
            if (y3dVar == null) {
                fetVar2.e0(-161489246);
                textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-161490455);
                fetVar2.r(false);
                textPrimary = y3dVar.f41946a;
            }
            long j3 = textPrimary;
            y3d y3dVar2 = r2v0Var != null ? r2v0Var.f29758a : null;
            if (y3dVar2 == null) {
                fetVar2.e0(-161486911);
                background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-161488151);
                fetVar2.r(false);
                background = y3dVar2.f41946a;
            }
            y3d y3dVar3 = r2v0Var != null ? r2v0Var.b : null;
            if (y3dVar3 == null) {
                fetVar2.e0(-161483768);
                long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                fetVar2.r(false);
                j = backgroundContent;
            } else {
                fetVar2.e0(-161485411);
                fetVar2.r(false);
                j = y3dVar3.f41946a;
            }
            mm40 mm40VarW = o7k0.w(o7k0.A(mm40Var, null, 3), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarW, 32.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            zx7 zx7Var2 = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar8);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var3 = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var3, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar5);
            jpm0.o(fetVar2, bh90VarM2, shdVar6);
            vqd.u(iHashCode2, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar8);
            mm40 mm40VarC = o7k0.c(jm40Var3, 1.0f);
            zcl zclVar3 = qmk.e;
            mm40 mm40VarH = dw9.h(1.0f, i120.Q(mm40VarC, j, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), false);
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar2.e0(2119486210);
                boolean z3 = (i5 & 458752) == 131072;
                Object objP = fetVar2.P();
                if (z3 || objP == cl5Var) {
                    objP = new unl(function1, (byte) 26);
                    fetVar2.o0(objP);
                }
                shdVar4 = shdVar7;
                shdVar3 = shdVar8;
                shdVar2 = shdVar6;
                pcyVar = pcyVar2;
                shdVar = shdVar5;
                mm40 mm40VarF = phu0.F(jm40Var3, null, null, false, null, (Function0) objP, fetVar2, 6, 15);
                jm40Var = jm40Var3;
                fetVar2.r(false);
                mm40Var2 = mm40VarF;
            } else {
                pcyVar = pcyVar2;
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                shdVar3 = shdVar8;
                shdVar4 = shdVar7;
                jm40Var = jm40Var3;
                fetVar2.e0(2119487433);
                fetVar2.r(false);
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarE2 = mm40VarH.e(mm40Var2);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var3, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            shd shdVar9 = shdVar4;
            vqd.u(iHashCode3, fetVar2, shdVar9, fetVar2);
            shd shdVar10 = shdVar3;
            jpm0.o(fetVar2, mm40VarC2, shdVar10);
            if (sdVar != null) {
                fetVar2.e0(-1614198243);
                if (z) {
                    fetVar2.e0(-1614158315);
                    yx7Var = yx7Var2;
                    j2 = j3;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14).e(new ecu0(yx7Var)), 14.0f), j2, fetVar, 56, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    j2 = j3;
                    yx7Var = yx7Var2;
                    fetVar2.e0(-1613698275);
                    fetVar2.r(false);
                }
                mm40 mm40VarN = s5x0.N(new ecu0(yx7Var), z ? 2.0f : 8.0f, 0.0f, 8.0f, 0.0f, 10);
                String str = sdVar.f32009a;
                String str2 = sdVar.b;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                jm40Var2 = jm40Var;
                paq0.b(mm40VarN, str, str2, j2, g1t0.i(), qmk.q, qmk.o, 0.0f, fetVar, 0, 128);
                fetVar2 = fetVar;
                fetVar2.r(false);
                i2 = 3;
                zx7Var = null;
            } else {
                jm40Var2 = jm40Var;
                fetVar2.e0(-1612985926);
                i2 = 3;
                zx7Var = null;
                zq8.a(0, fetVar2, o7k0.p(o7k0.y(jm40Var2, null, 3), 40.0f, 24.0f));
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.s(o7k0.y(s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), zx7Var, i2), 32.0f), 24.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getCommerce(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3));
            boolean z4 = (i5 & 57344) == 16384;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new unl(function0, (byte) 27);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarF2 = phu0.F(mm40VarQ, null, null, false, null, (Function0) objP2, fetVar2, 0, 15);
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarF2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar9, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar10);
            j0x.b(a8k0.F(R.drawable.ic_glyph_replenish, 0, fetVar2), null, null, null, null, 0.0f, null, fetVar, 56, 124);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, z, sdVar, r2v0Var, function0, function1, i);
        }
    }

    public static final void x(r0o0 r0o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-983216362);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(r0o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Context context = (Context) fetVar.k(dy2.b);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = t4o.f33330a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4) | fetVar.i(list);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m((Object) context, (Object) r0o0Var, (Object) list, (byte) 6);
                fetVar.o0(objP3);
            }
            y860.f(xdrVar, null, (Function1) objP3, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(r0o0Var, i, (byte) 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void y(mm40 mm40Var, vqr vqrVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        final ?? r0;
        fet fetVar3;
        boolean z;
        fet fetVar4 = fetVar;
        vqrVar.getClass();
        j83 j83Var = vqrVar.f37867a;
        fetVar4.g0(209244910);
        if ((i & 6) == 0) {
            i2 = i | (fetVar4.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar4.g(vqrVar) : fetVar4.i(vqrVar) ? 32 : 16;
        }
        if (fetVar4.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 28.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar4, 54);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarG);
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
            if (j83Var.b.length() > 0) {
                fetVar4.e0(965969305);
                pz40 pz40Var = s6t0.f31722a;
                r0 = 0;
                v8q0.b(j83Var, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 240634);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                r0 = 0;
                fetVar4.e0(966260798);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            }
            final ig30 ig30Var = vqrVar.b;
            if (ig30Var == null) {
                fetVar3.e0(966296044);
                fetVar3.r(r0);
                z = true;
            } else {
                fetVar3.e0(966296045);
                mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                ugd ugdVarM = u1c.M(-885993735, new xdr() { // from class: a.tqr
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b = r0;
                        ig30 ig30Var2 = ig30Var;
                        switch (b) {
                            case 0:
                                ir8 ir8Var = (ir8) obj;
                                fet fetVar6 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ir8Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar6.g(ir8Var) ? 4 : 2;
                                }
                                if (fetVar6.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    rsm0.j(ir8Var, ig30Var2.f14718a, fetVar6, iIntValue & 14);
                                } else {
                                    fetVar6.X();
                                }
                                break;
                            case 1:
                                yhg0 yhg0Var = (yhg0) obj;
                                fet fetVar7 = (fet) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                yhg0Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    rsm0.b(yhg0Var, ig30Var2.b, fetVar7, iIntValue2 & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 2:
                                yhg0 yhg0Var2 = (yhg0) obj;
                                fet fetVar8 = (fet) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                yhg0Var2.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= fetVar8.g(yhg0Var2) ? 4 : 2;
                                }
                                if (fetVar8.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    rsm0.c(yhg0Var2, ig30Var2.c, fetVar8, iIntValue3 & 14);
                                } else {
                                    fetVar8.X();
                                }
                                break;
                            default:
                                yhg0 yhg0Var3 = (yhg0) obj;
                                fet fetVar9 = (fet) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                yhg0Var3.getClass();
                                if ((iIntValue4 & 6) == 0) {
                                    iIntValue4 |= fetVar9.g(yhg0Var3) ? 4 : 2;
                                }
                                if (fetVar9.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                    rsm0.d(yhg0Var3, ig30Var2.d, fetVar9, iIntValue4 & 14);
                                } else {
                                    fetVar9.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3);
                z = true;
                final boolean z2 = true ? 1 : 0;
                final byte b = 2;
                final byte b2 = 3;
                g1x.d(mm40VarN, ugdVarM, u1c.M(-1390880053, new xdr() { // from class: a.tqr
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = z2;
                        ig30 ig30Var2 = ig30Var;
                        switch (b3) {
                            case 0:
                                ir8 ir8Var = (ir8) obj;
                                fet fetVar6 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ir8Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar6.g(ir8Var) ? 4 : 2;
                                }
                                if (fetVar6.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    rsm0.j(ir8Var, ig30Var2.f14718a, fetVar6, iIntValue & 14);
                                } else {
                                    fetVar6.X();
                                }
                                break;
                            case 1:
                                yhg0 yhg0Var = (yhg0) obj;
                                fet fetVar7 = (fet) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                yhg0Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    rsm0.b(yhg0Var, ig30Var2.b, fetVar7, iIntValue2 & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 2:
                                yhg0 yhg0Var2 = (yhg0) obj;
                                fet fetVar8 = (fet) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                yhg0Var2.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= fetVar8.g(yhg0Var2) ? 4 : 2;
                                }
                                if (fetVar8.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    rsm0.c(yhg0Var2, ig30Var2.c, fetVar8, iIntValue3 & 14);
                                } else {
                                    fetVar8.X();
                                }
                                break;
                            default:
                                yhg0 yhg0Var3 = (yhg0) obj;
                                fet fetVar9 = (fet) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                yhg0Var3.getClass();
                                if ((iIntValue4 & 6) == 0) {
                                    iIntValue4 |= fetVar9.g(yhg0Var3) ? 4 : 2;
                                }
                                if (fetVar9.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                    rsm0.d(yhg0Var3, ig30Var2.d, fetVar9, iIntValue4 & 14);
                                } else {
                                    fetVar9.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3), u1c.M(-813684340, new xdr() { // from class: a.tqr
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = b;
                        ig30 ig30Var2 = ig30Var;
                        switch (b3) {
                            case 0:
                                ir8 ir8Var = (ir8) obj;
                                fet fetVar6 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ir8Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar6.g(ir8Var) ? 4 : 2;
                                }
                                if (fetVar6.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    rsm0.j(ir8Var, ig30Var2.f14718a, fetVar6, iIntValue & 14);
                                } else {
                                    fetVar6.X();
                                }
                                break;
                            case 1:
                                yhg0 yhg0Var = (yhg0) obj;
                                fet fetVar7 = (fet) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                yhg0Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    rsm0.b(yhg0Var, ig30Var2.b, fetVar7, iIntValue2 & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 2:
                                yhg0 yhg0Var2 = (yhg0) obj;
                                fet fetVar8 = (fet) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                yhg0Var2.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= fetVar8.g(yhg0Var2) ? 4 : 2;
                                }
                                if (fetVar8.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    rsm0.c(yhg0Var2, ig30Var2.c, fetVar8, iIntValue3 & 14);
                                } else {
                                    fetVar8.X();
                                }
                                break;
                            default:
                                yhg0 yhg0Var3 = (yhg0) obj;
                                fet fetVar9 = (fet) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                yhg0Var3.getClass();
                                if ((iIntValue4 & 6) == 0) {
                                    iIntValue4 |= fetVar9.g(yhg0Var3) ? 4 : 2;
                                }
                                if (fetVar9.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                    rsm0.d(yhg0Var3, ig30Var2.d, fetVar9, iIntValue4 & 14);
                                } else {
                                    fetVar9.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3), u1c.M(-236488627, new xdr() { // from class: a.tqr
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = b2;
                        ig30 ig30Var2 = ig30Var;
                        switch (b3) {
                            case 0:
                                ir8 ir8Var = (ir8) obj;
                                fet fetVar6 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ir8Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar6.g(ir8Var) ? 4 : 2;
                                }
                                if (fetVar6.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    rsm0.j(ir8Var, ig30Var2.f14718a, fetVar6, iIntValue & 14);
                                } else {
                                    fetVar6.X();
                                }
                                break;
                            case 1:
                                yhg0 yhg0Var = (yhg0) obj;
                                fet fetVar7 = (fet) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                yhg0Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    rsm0.b(yhg0Var, ig30Var2.b, fetVar7, iIntValue2 & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 2:
                                yhg0 yhg0Var2 = (yhg0) obj;
                                fet fetVar8 = (fet) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                yhg0Var2.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= fetVar8.g(yhg0Var2) ? 4 : 2;
                                }
                                if (fetVar8.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    rsm0.c(yhg0Var2, ig30Var2.c, fetVar8, iIntValue3 & 14);
                                } else {
                                    fetVar8.X();
                                }
                                break;
                            default:
                                yhg0 yhg0Var3 = (yhg0) obj;
                                fet fetVar9 = (fet) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                yhg0Var3.getClass();
                                if ((iIntValue4 & 6) == 0) {
                                    iIntValue4 |= fetVar9.g(yhg0Var3) ? 4 : 2;
                                }
                                if (fetVar9.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                    rsm0.d(yhg0Var3, ig30Var2.d, fetVar9, iIntValue4 & 14);
                                } else {
                                    fetVar9.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3), fetVar3, 28080);
                fetVar3.r(r0);
            }
            fetVar3.r(z);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) vqrVar, i, (byte) 16);
        }
    }

    public static final void z(psv psvVar, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        psvVar.getClass();
        fetVar.g0(-2050445341);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(psvVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            v8q0.a(rsm0.w(psvVar.b, 0, fetVar), o2e.e0(s5x0.L(s5x0.N(mm40VarD, 0.0f, 16.0f, 0.0f, 8.0f, 5), 8.0f, 0.0f, 2), "HeaderTestTag"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((p6t0) psvVar, mm40Var2, i, (byte) 23);
        }
    }
}
