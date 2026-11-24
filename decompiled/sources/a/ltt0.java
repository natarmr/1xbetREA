package a;

import android.javax.sip.message.Response;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class ltt0 {
    public static String[] b;
    public static svs0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20642a;

    public /* synthetic */ ltt0(byte b2) {
        this.f20642a = b2;
    }

    public static final void a(mm40 mm40Var, String str, String str2, y9q0 y9q0Var, y9q0 y9q0Var2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1441725726);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(y9q0Var) ? 2048 : 1024) | (fetVar2.g(y9q0Var2) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = mu90.i;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, mrv.k0(jm40Var, "title"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar2, ((i2 >> 3) & 14) | 48, ((i2 << 12) & 29360128) | 28032, 102396);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
            v8q0.a(str2, mrv.k0(jm40Var, "value"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0Var2, fetVar2, ((i2 >> 6) & 14) | 48, ((i2 << 9) & 29360128) | 24576, 114684);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvl0(mm40Var, str, str2, (Object) y9q0Var, (Object) y9q0Var2, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(mm40 mm40Var, awr0 awr0Var, boolean z, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z2;
        fetVar.g0(495324349);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(awr0Var) : fetVar.i(awr0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(rsm0.w(R.string.params_tirage, 0, fetVar)), true, false, true);
            int i3 = i2 & 112;
            boolean z4 = ((i2 & 7168) == 2048) | (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(awr0Var)));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new aqq0(function1, awr0Var, (byte) 1);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarD, wulVar, (Function0) objP, fetVar, 6, 0);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD2 = ua80.d(jm40Var, 8.0f, fetVar, jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true);
            nul nulVar = nul.e;
            wul wulVar2 = new wul(nulVar, oe9Var, new ue9(rsm0.w(R.string.layout_by_category, 0, fetVar)), true, false, true);
            boolean z5 = (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(awr0Var))) | ((57344 & i2) == 16384);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new aqq0(function2, awr0Var, (byte) 2);
                fetVar.o0(objP2);
            }
            qzb.n(x7zVarI, wulVar2, (Function0) objP2, fetVar, 0, 0);
            if (z) {
                fetVar.e0(-1001417644);
                qxw.o(fetVar, o7k0.s(jm40Var, 8.0f));
                mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                wul wulVar3 = new wul(nulVar, oe9Var, new te9(R.drawable.ic_glyph_download), true, false, false);
                boolean z6 = (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(awr0Var))) | ((458752 & i2) == 131072);
                Object objP3 = fetVar.P();
                if (z6 || objP3 == cl5Var) {
                    z2 = false;
                    objP3 = new bqq0(xdrVar, awr0Var, 0 == true ? 1 : 0);
                    fetVar.o0(objP3);
                } else {
                    z2 = false;
                }
                qzb.n(mm40VarY, wulVar3, (Function0) objP3, fetVar, 6, 0);
                fetVar.r(z2);
            } else {
                fetVar.e0(-1000330753);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgh0(mm40Var2, awr0Var, z, function1, function2, xdrVar, i);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1550946760);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, xbc.c0(lgb.J(o7k0.p(mm40Var, 48.0f, 36.0f), vgg0.a(14.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 23);
        }
    }

    public static final void d(mm40 mm40Var, hao0 hao0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-807329448);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(hao0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.a(14.0f)), 8.0f);
            ymx ymxVar = ymx.INTERVAL_500;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new xhl0(function0, (byte) 8);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarJ, ymxVar, null, false, null, (Function0) objP, fetVar, 25008, 4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            v8q0.a(hao0Var.f12734a, null, 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar), fetVar, 0, 24960, 109566);
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o7k0.n(s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, hao0Var, function0, i, (byte) 3);
        }
    }

    public static final void e(mm40 mm40Var, hao0 hao0Var, Function0 function0, fet fetVar, int i) {
        hao0Var.getClass();
        function0.getClass();
        fetVar.g0(1089261199);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(hao0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (hao0Var.b) {
            fetVar.e0(1702822443);
            c(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else {
            fetVar.e0(1702644193);
            d(mm40Var, hao0Var, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, hao0Var, function0, i, (byte) 5);
        }
    }

    public static final void f(awr0 awr0Var, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i) {
        int i2;
        Function1 function3;
        xdr xdrVar2;
        fetVar.g0(-1000256303);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(awr0Var) : fetVar.i(awr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function2;
            i2 |= fetVar.i(function3) ? 256 : 128;
        } else {
            function3 = function2;
        }
        if ((i & 3072) == 0) {
            xdrVar2 = xdrVar;
            i2 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        } else {
            xdrVar2 = xdrVar;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, backgroundContent, ugg0Var2), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            g(o7k0.d(jm40Var, 1.0f), awr0Var.g, fetVar, 6);
            if (awr0Var.d) {
                fetVar.e0(1057482357);
                qxw.o(fetVar, o7k0.e(jm40Var, 12.0f));
                int i3 = (i2 << 3) & 112;
                int i4 = i2 << 6;
                b(null, awr0Var, awr0Var.e, function1, function3, xdrVar2, fetVar, i3 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                fetVar.r(false);
            } else {
                fetVar.e0(1057868679);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(awr0Var, function1, function2, xdrVar, i);
        }
    }

    public static final void g(mm40 mm40Var, lrq0 lrq0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-845724770);
        byte b2 = 16;
        int i2 = (fetVar2.g(lrq0Var) ? 32 : 16) | i;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            if (lrq0Var instanceof krq0) {
                fetVar2.e0(-1086271089);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                String strW = rsm0.w(R.string.toto_jackpot_new, 0, fetVar2);
                String str = ((krq0) lrq0Var).f18780a;
                y9q0 y9q0VarJ = g1t0.j();
                zfn zfnVar = zaq0.b;
                a(mm40VarD, strW, str, y9q0.a(y9q0VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.j(), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, 6);
                fetVar2 = fetVar2;
                zcl zclVar = qmk.f28987a;
                rz4.t(jm40Var, 12.0f, fetVar2, false);
            } else {
                fetVar2.e0(-1085718514);
                fetVar2.r(false);
            }
            y9q0 y9q0VarG = g1t0.g();
            zfn zfnVar2 = zaq0.b;
            etm0.c(null, lrq0Var, y9q0.a(y9q0VarG, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.d(), ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, i2 & 112, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0(mm40Var, lrq0Var, i, b2);
        }
    }

    public static final void h(mm40 mm40Var, String str, String str2, zpq0 zpq0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(894927357);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(zpq0Var) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 4.0f, 12.0f, 0.0f, 8.0f, 4);
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
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            y9q0 y9q0VarM = g1t0.m();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarD, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(y9q0VarM, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, ((i2 >> 3) & 14) | 48, 24960, 110588);
            v8q0.a(str2, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.d(), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, ((i2 >> 6) & 14) | 48, 24960, 110588);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            kpb.l(zpq0Var.b, 0, fetVar2, o7k0.y(new ecu0(gqw0.k), null, 3), zpq0Var.f44772a);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 16, i, mm40Var, str, str2, zpq0Var);
        }
    }

    public static final void i(mm40 mm40Var, awr0 awr0Var, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i) {
        awr0Var.getClass();
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(-1390474728);
        int i2 = (fetVar.g(awr0Var) ? 32 : 16) | i | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024) | (fetVar.i(xdrVar) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            h(o7k0.d(jm40.b, 1.0f), awr0Var.b, awr0Var.c, awr0Var.f, fetVar, 6);
            f(awr0Var, function1, function2, xdrVar, fetVar, (i2 >> 3) & 8190);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvl0((Object) mm40Var, (Object) awr0Var, (Object) function1, (Object) function2, (Object) xdrVar, i, (byte) 5);
        }
    }

    public static final void j(mm40 mm40Var, l7m0 l7m0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var2;
        Object dmmVar;
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(-142600120);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
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
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            boolean zH = fetVar.h(((mtr0) l7m0Var2.getValue()).c) | fetVar.h(((mtr0) l7m0Var2.getValue()).d);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                if (((mtr0) l7m0Var2.getValue()).c) {
                    boolean z = ((mtr0) l7m0Var2.getValue()).d;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                    ra50 ra50Var = ra50.f30118a;
                    dmmVar = new dmm(new va50(new wkm(0, R.drawable.ic_glyph_clear, z, ra50Var, jM123getWhite0d7_KjU), new wkm(1, R.drawable.ic_glyph_toto, true, ra50Var, staticColors.m123getWhite0d7_KjU())));
                } else {
                    dmmVar = fmm.f9790a;
                }
                objP = dmmVar;
                fetVar.o0(objP);
            }
            gmm gmmVar = (gmm) objP;
            boolean zH2 = fetVar.h(((mtr0) l7m0Var2.getValue()).c);
            Object objP2 = fetVar.P();
            if (zH2 || objP2 == cl5Var) {
                objP2 = ((mtr0) l7m0Var2.getValue()).c ? new ea50(StaticColors.INSTANCE.m123getWhite0d7_KjU()) : fa50.f9191a;
                fetVar.o0(objP2);
            }
            ga50 ga50Var = (ga50) objP2;
            StaticColors staticColors2 = StaticColors.INSTANCE;
            imm immVar = new imm(new ilm(staticColors2.m123getWhite0d7_KjU()), new plm(((mtr0) l7m0Var2.getValue()).b, ha50.TWO_LINES, staticColors2.m123getWhite0d7_KjU(), ga50Var), gmmVar, staticColors2.m121getTransparent0d7_KjU(), false, null);
            boolean z2 = (i2 & 7168) == 2048;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new xhl0(function1, (byte) 18);
                fetVar.o0(objP3);
            }
            Function0 function4 = (Function0) objP3;
            boolean z3 = (i2 & 896) == 256;
            Object objP4 = fetVar.P();
            if (z3 || objP4 == cl5Var) {
                objP4 = new xhl0(function0, (byte) 19);
                fetVar.o0(objP4);
            }
            Function0 function5 = (Function0) objP4;
            boolean z4 = ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objP5 = fetVar.P();
            if (z4 || objP5 == cl5Var) {
                objP5 = new yhd(function2, function3, (byte) 5);
                fetVar.o0(objP5);
            }
            hlm.c(mm40Var, immVar, null, function4, function5, (Function1) objP5, null, null, null, null, null, null, fetVar, i2 & 14, 0, 4036);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(mm40Var, (Object) l7m0Var, (wdr) function0, (wdr) function1, (wdr) function2, (wdr) function3, i, (byte) 1);
        }
    }

    public static final void k(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2146787167);
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            ugdVar.F(v2n0.v(o7k0.d(i120.Q(jm40.b, backgroundContent, ljcVar), 1.0f), new j0w0[]{h0w0.f12254a}, fetVar), fetVar, 48);
            ugdVar2.F(i120.Q(new x7z(1.0f, true), s6t0.b().f33626a.getBackground(), ljcVar), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p71(mm40Var, ugdVar, ugdVar2, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    public static final lc00 l(List list, List list2) {
        Object next;
        list.getClass();
        list2.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            q1h q1hVar = (q1h) obj;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((f2h) next).f8812a.equals(q1hVar.c));
            f2h f2hVar = (f2h) next;
            if (f2hVar != null) {
                boolean z2 = (list2.size() > 5 || i != list2.size() - 1) ? z : true;
                q1hVar.getClass();
                String str = q1hVar.f27952a;
                int i3 = q1hVar.e;
                int i4 = q1hVar.d;
                String str2 = f2hVar.d;
                str2.getClass();
                if (!kotlin.text.c.x(str2, ujn.h, z)) {
                    if (str2.length() == 0) {
                        str2 = "";
                    } else {
                        List list3 = u0d.f34849a;
                        if (u0d.c(str2)) {
                            str2 = "";
                        } else {
                            str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                        }
                    }
                }
                String str3 = str2;
                String str4 = f2hVar.c;
                String str5 = q1hVar.g;
                String str6 = q1hVar.h;
                rdj rdjVar = rdj.f30294a;
                arrayList.add(new x1z(str, str3, str4, new jb30(str5, str6, rdj.f(new znq0(q1hVar.f), sdj.UNIVERSAL, null, 60)), String.valueOf(i4), String.valueOf(i3), i4 > i3 ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : i4 < i3 ? StaticColors.INSTANCE.m113getRed0d7_KjU() : StaticColors.INSTANCE.m132getYellow0d7_KjU(), z2));
            }
            i = i2;
            z = false;
        }
        lc00VarB.addAll(arrayList);
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final s0r o(Fragment fragment, Function1 function1) {
        fragment.getClass();
        function1.getClass();
        return new s0r(fragment, function1, (byte) 1);
    }

    public static final nae0 p(Fragment fragment, Function1 function1) {
        fragment.getClass();
        function1.getClass();
        return fragment instanceof sik ? new ali((sik) fragment, function1) : new s0r(fragment, function1, (byte) 0);
    }

    public static final boolean q(int i, KeyEvent keyEvent) {
        return ((int) (n7x.C(keyEvent) >> 32)) == i;
    }

    public static long r(fq80 fq80Var, int i, int i2) {
        fq80Var.M(i);
        if (fq80Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = fq80Var.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || fq80Var.z() < 7 || fq80Var.a() < 7 || (fq80Var.z() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        fq80Var.k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static final mum0 s(wrd wrdVar) {
        bq6 bq6Var;
        c4l0 c4l0Var;
        m12 m12Var;
        bu6 bu6Var;
        au6 au6Var;
        kg kgVar;
        ay10 ay10Var;
        l9x l9xVar;
        nek0 nek0Var;
        he heVar;
        phb0 phb0Var;
        rjn0 rjn0Var;
        rhb0 rhb0Var;
        ohb0 ohb0Var;
        aeo0 aeo0Var;
        j8l0 j8l0Var;
        i8l0 i8l0Var;
        ye yeVar;
        tsh0 tsh0Var;
        daj0 daj0Var;
        llm0 llm0Var;
        k77 k77Var;
        vzc0 vzc0Var;
        v5l0 v5l0Var;
        zvh0 zvh0Var;
        h8l0 h8l0Var;
        g8l0 g8l0Var;
        r6l0 r6l0Var;
        vcp vcpVar;
        wrdVar.getClass();
        String str = wrdVar.R4.h;
        c4l0[] c4l0VarArrValues = c4l0.values();
        int length = c4l0VarArrValues.length;
        int i = 0;
        while (true) {
            bq6Var = null;
            if (i >= length) {
                c4l0Var = null;
                break;
            }
            c4l0Var = c4l0VarArrValues[i];
            if (c4l0Var.f3731a.equals(str)) {
                break;
            }
            i++;
        }
        if (c4l0Var == null) {
            c4l0Var = c4l0.RECTANGLE_S;
        }
        c4l0 c4l0Var2 = c4l0Var;
        String str2 = wrdVar.P4.f;
        m12[] m12VarArrValues = m12.values();
        int length2 = m12VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                m12Var = null;
                break;
            }
            m12Var = m12VarArrValues[i2];
            if (m12Var.f20982a.equals(str2)) {
                break;
            }
            i2++;
        }
        if (m12Var == null) {
            m12Var = m12.NATIVE;
        }
        m12 m12Var2 = m12Var;
        String str3 = wrdVar.S4.i;
        bu6[] bu6VarArrValues = bu6.values();
        int length3 = bu6VarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                bu6Var = null;
                break;
            }
            bu6Var = bu6VarArrValues[i3];
            if (bu6Var.f3215a.equals(str3)) {
                break;
            }
            i3++;
        }
        if (bu6Var == null) {
            bu6Var = bu6.SNACKBAR;
        }
        bu6 bu6Var2 = bu6Var;
        String str4 = wrdVar.T4.j;
        au6[] au6VarArrValues = au6.values();
        int length4 = au6VarArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length4) {
                au6Var = null;
                break;
            }
            au6Var = au6VarArrValues[i4];
            if (au6Var.f1462a.equals(str4)) {
                break;
            }
            i4++;
        }
        if (au6Var == null) {
            au6Var = au6.NONE;
        }
        au6 au6Var2 = au6Var;
        String str5 = wrdVar.V4.l;
        kg[] kgVarArrValues = kg.values();
        int length5 = kgVarArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length5) {
                kgVar = null;
                break;
            }
            kgVar = kgVarArrValues[i5];
            if (kgVar.f18216a.equals(str5)) {
                break;
            }
            i5++;
        }
        if (kgVar == null) {
            kgVar = kg.PRIMARY;
        }
        kg kgVar2 = kgVar;
        String str6 = wrdVar.W4.m;
        ay10[] ay10VarArrValues = ay10.values();
        int length6 = ay10VarArrValues.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length6) {
                ay10Var = null;
                break;
            }
            ay10Var = ay10VarArrValues[i6];
            if (ay10Var.f1650a.equals(str6)) {
                break;
            }
            i6++;
        }
        if (ay10Var == null) {
            ay10Var = ay10.TABS_LINE_ITEMS;
        }
        ay10 ay10Var2 = ay10Var;
        String str7 = wrdVar.X4.n;
        l9x[] l9xVarArrValues = l9x.values();
        int length7 = l9xVarArrValues.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length7) {
                l9xVar = null;
                break;
            }
            l9xVar = l9xVarArrValues[i7];
            if (l9xVar.f19678a.equals(str7)) {
                break;
            }
            i7++;
        }
        if (l9xVar == null) {
            l9xVar = l9x.PLAIN_LIST_ITEMS;
        }
        l9x l9xVar2 = l9xVar;
        String str8 = wrdVar.Z4.p;
        nek0[] nek0VarArrValues = nek0.values();
        int length8 = nek0VarArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length8) {
                nek0Var = null;
                break;
            }
            nek0Var = nek0VarArrValues[i8];
            if (nek0Var.f23390a.equals(str8)) {
                break;
            }
            i8++;
        }
        if (nek0Var == null) {
            nek0Var = nek0.MONOCHROME_WITH_WHITE_ICON;
        }
        nek0 nek0Var2 = nek0Var;
        String str9 = wrdVar.j5.z;
        he[] heVarArrValues = he.values();
        int length9 = heVarArrValues.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length9) {
                heVar = null;
                break;
            }
            heVar = heVarArrValues[i9];
            if (heVar.f12896a.equals(str9)) {
                break;
            }
            i9++;
        }
        if (heVar == null) {
            heVar = he.PRIMARY;
        }
        he heVar2 = heVar;
        String str10 = wrdVar.k5.A;
        phb0[] phb0VarArrValues = phb0.values();
        int length10 = phb0VarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length10) {
                phb0Var = null;
                break;
            }
            phb0Var = phb0VarArrValues[i10];
            if (phb0Var.f26988a.equals(str10)) {
                break;
            }
            i10++;
        }
        if (phb0Var == null) {
            phb0Var = phb0.LOGO_CENTER;
        }
        phb0 phb0Var2 = phb0Var;
        String str11 = wrdVar.Y4.o;
        rjn0[] rjn0VarArrValues = rjn0.values();
        int length11 = rjn0VarArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length11) {
                rjn0Var = null;
                break;
            }
            rjn0Var = rjn0VarArrValues[i11];
            if (rjn0Var.f30603a.equals(str11)) {
                break;
            }
            i11++;
        }
        if (rjn0Var == null) {
            rjn0Var = rjn0.PLAIN_LIST_ITEMS;
        }
        rjn0 rjn0Var2 = rjn0Var;
        String str12 = wrdVar.a5.q;
        rhb0[] rhb0VarArrValues = rhb0.values();
        int length12 = rhb0VarArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length12) {
                rhb0Var = null;
                break;
            }
            rhb0Var = rhb0VarArrValues[i12];
            if (rhb0Var.f30482a.equals(str12)) {
                break;
            }
            i12++;
        }
        if (rhb0Var == null) {
            rhb0Var = rhb0.POPULAR_DASHBOARD;
        }
        rhb0 rhb0Var2 = rhb0Var;
        String str13 = wrdVar.c5.s;
        ohb0[] ohb0VarArrValues = ohb0.values();
        int length13 = ohb0VarArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length13) {
                ohb0Var = null;
                break;
            }
            ohb0Var = ohb0VarArrValues[i13];
            if (ohb0Var.f25258a.equals(str13)) {
                break;
            }
            i13++;
        }
        if (ohb0Var == null) {
            ohb0Var = ohb0.SMALL_CIRCLES;
        }
        ohb0 ohb0Var2 = ohb0Var;
        String str14 = wrdVar.l5.C;
        aeo0[] aeo0VarArrValues = aeo0.values();
        int length14 = aeo0VarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length14) {
                aeo0Var = null;
                break;
            }
            aeo0Var = aeo0VarArrValues[i14];
            if (aeo0Var.f739a.equals(str14)) {
                break;
            }
            i14++;
        }
        if (aeo0Var == null) {
            aeo0Var = aeo0.COLOR_SELECTION_ICONS;
        }
        aeo0 aeo0Var2 = aeo0Var;
        String str15 = wrdVar.H5.Y;
        j8l0[] j8l0VarArrValues = j8l0.values();
        int length15 = j8l0VarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length15) {
                j8l0Var = null;
                break;
            }
            j8l0Var = j8l0VarArrValues[i15];
            if (j8l0Var.f16089a.equals(str15)) {
                break;
            }
            i15++;
        }
        if (j8l0Var == null) {
            j8l0Var = j8l0.MEDIUM_ITEMS_SPACE_SEPARATOR;
        }
        j8l0 j8l0Var2 = j8l0Var;
        String str16 = wrdVar.I5.Z;
        i8l0[] i8l0VarArrValues = i8l0.values();
        int length16 = i8l0VarArrValues.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length16) {
                i8l0Var = null;
                break;
            }
            i8l0Var = i8l0VarArrValues[i16];
            if (i8l0Var.f14345a.equals(str16)) {
                break;
            }
            i16++;
        }
        if (i8l0Var == null) {
            i8l0Var = i8l0.MONOCHROME;
        }
        i8l0 i8l0Var2 = i8l0Var;
        String str17 = wrdVar.M5.d0;
        ye[] yeVarArrValues = ye.values();
        int length17 = yeVarArrValues.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length17) {
                yeVar = null;
                break;
            }
            yeVar = yeVarArrValues[i17];
            if (yeVar.f42464a.equals(str17)) {
                break;
            }
            i17++;
        }
        if (yeVar == null) {
            yeVar = ye.SINGLE_PAGE;
        }
        ye yeVar2 = yeVar;
        String str18 = wrdVar.N5.e0;
        tsh0[] tsh0VarArrValues = tsh0.values();
        int length18 = tsh0VarArrValues.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length18) {
                tsh0Var = null;
                break;
            }
            tsh0Var = tsh0VarArrValues[i18];
            if (tsh0Var.f34461a.equals(str18)) {
                break;
            }
            i18++;
        }
        if (tsh0Var == null) {
            tsh0Var = tsh0.CLASSIC;
        }
        tsh0 tsh0Var2 = tsh0Var;
        String str19 = wrdVar.O5.f0;
        daj0[] daj0VarArrValues = daj0.values();
        int length19 = daj0VarArrValues.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length19) {
                daj0Var = null;
                break;
            }
            daj0Var = daj0VarArrValues[i19];
            if (daj0Var.f5751a.equals(str19)) {
                break;
            }
            i19++;
        }
        if (daj0Var == null) {
            daj0Var = daj0.LIST;
        }
        daj0 daj0Var2 = daj0Var;
        String str20 = wrdVar.Q5.h0;
        llm0[] llm0VarArrValues = llm0.values();
        int length20 = llm0VarArrValues.length;
        int i20 = 0;
        while (true) {
            if (i20 >= length20) {
                llm0Var = null;
                break;
            }
            llm0Var = llm0VarArrValues[i20];
            if (llm0Var.f20254a.equals(str20)) {
                break;
            }
            i20++;
        }
        if (llm0Var == null) {
            llm0Var = llm0.PLAIN_LIST;
        }
        llm0 llm0Var2 = llm0Var;
        String str21 = wrdVar.R5.i0;
        k77[] k77VarArrValues = k77.values();
        int length21 = k77VarArrValues.length;
        int i21 = 0;
        while (true) {
            if (i21 >= length21) {
                k77Var = null;
                break;
            }
            k77Var = k77VarArrValues[i21];
            if (k77Var.f17805a.equals(str21)) {
                break;
            }
            i21++;
        }
        if (k77Var == null) {
            k77Var = k77.OLD_HISTORY;
        }
        k77 k77Var2 = k77Var;
        String str22 = wrdVar.U5.l0;
        vzc0[] vzc0VarArrValues = vzc0.values();
        int length22 = vzc0VarArrValues.length;
        int i22 = 0;
        while (true) {
            if (i22 >= length22) {
                vzc0Var = null;
                break;
            }
            vzc0Var = vzc0VarArrValues[i22];
            if (vzc0Var.f38291a.equals(str22)) {
                break;
            }
            i22++;
        }
        if (vzc0Var == null) {
            vzc0Var = vzc0.CLASSIC;
        }
        vzc0 vzc0Var2 = vzc0Var;
        String str23 = wrdVar.X5.o0;
        v5l0[] v5l0VarArrValues = v5l0.values();
        int length23 = v5l0VarArrValues.length;
        int i23 = 0;
        while (true) {
            if (i23 >= length23) {
                v5l0Var = null;
                break;
            }
            v5l0Var = v5l0VarArrValues[i23];
            if (v5l0Var.f36831a.equals(str23)) {
                break;
            }
            i23++;
        }
        if (v5l0Var == null) {
            v5l0Var = v5l0.LARGE_CARD_LARGE_SPORT_ICON;
        }
        v5l0 v5l0Var2 = v5l0Var;
        String str24 = wrdVar.b6.s0;
        zvh0[] zvh0VarArrValues = zvh0.values();
        int length24 = zvh0VarArrValues.length;
        int i24 = 0;
        while (true) {
            if (i24 >= length24) {
                zvh0Var = null;
                break;
            }
            zvh0Var = zvh0VarArrValues[i24];
            if (zvh0Var.f45057a.equals(str24)) {
                break;
            }
            i24++;
        }
        if (zvh0Var == null) {
            zvh0Var = zvh0.CONTROL_WITH_DIVIDERS;
        }
        zvh0 zvh0Var2 = zvh0Var;
        String str25 = wrdVar.Y5.p0;
        h8l0[] h8l0VarArrValues = h8l0.values();
        int length25 = h8l0VarArrValues.length;
        int i25 = 0;
        while (true) {
            if (i25 >= length25) {
                h8l0Var = null;
                break;
            }
            h8l0Var = h8l0VarArrValues[i25];
            if (h8l0Var.f12632a.equals(str25)) {
                break;
            }
            i25++;
        }
        if (h8l0Var == null) {
            h8l0Var = h8l0.SMALL_HEADER_SEGMENTS;
        }
        h8l0 h8l0Var2 = h8l0Var;
        String str26 = wrdVar.d6.u0;
        g8l0[] g8l0VarArrValues = g8l0.values();
        int length26 = g8l0VarArrValues.length;
        int i26 = 0;
        while (true) {
            if (i26 >= length26) {
                g8l0Var = null;
                break;
            }
            g8l0Var = g8l0VarArrValues[i26];
            if (g8l0Var.f10870a.equals(str26)) {
                break;
            }
            i26++;
        }
        if (g8l0Var == null) {
            g8l0Var = g8l0.BOTTOM_SHEET;
        }
        g8l0 g8l0Var2 = g8l0Var;
        String str27 = wrdVar.Z5.q0;
        r6l0[] r6l0VarArrValues = r6l0.values();
        int length27 = r6l0VarArrValues.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length27) {
                r6l0Var = null;
                break;
            }
            r6l0Var = r6l0VarArrValues[i27];
            if (r6l0Var.f29939a.equals(str27)) {
                break;
            }
            i27++;
        }
        if (r6l0Var == null) {
            r6l0Var = r6l0.CLASSIC_CARD_SPORT_ICON;
        }
        r6l0 r6l0Var2 = r6l0Var;
        String str28 = wrdVar.f6.w0;
        vcp[] vcpVarArrValues = vcp.values();
        int length28 = vcpVarArrValues.length;
        int i28 = 0;
        while (true) {
            if (i28 >= length28) {
                vcpVar = null;
                break;
            }
            vcpVar = vcpVarArrValues[i28];
            if (vcpVar.f37196a.equals(str28)) {
                break;
            }
            i28++;
        }
        if (vcpVar == null) {
            vcpVar = vcp.Classic;
        }
        vcp vcpVar2 = vcpVar;
        String str29 = wrdVar.C1.q1;
        for (bq6 bq6Var2 : bq6.values()) {
            if (bq6Var2.f3013a.equals(str29)) {
                bq6Var = bq6Var2;
                break;
            }
        }
        if (bq6Var == null) {
            bq6Var = bq6.LARGE_CARD_LARGE_SPORT_ICON;
        }
        return new mum0(c4l0Var2, m12Var2, bu6Var2, au6Var2, kgVar2, ay10Var2, l9xVar2, nek0Var2, heVar2, phb0Var2, rjn0Var2, rhb0Var2, ohb0Var2, aeo0Var2, j8l0Var2, i8l0Var2, yeVar2, tsh0Var2, daj0Var2, llm0Var2, k77Var2, h8l0Var2, vzc0Var2, zvh0Var2, v5l0Var2, g8l0Var2, r6l0Var2, vcpVar2, bq6Var);
    }

    public static final gxo0 t(kwo0 kwo0Var, String str, boolean z) {
        kwo0Var.getClass();
        str.getClass();
        boolean z2 = kwo0Var.f19012a;
        boolean z3 = kwo0Var.b;
        gmk emkVar = null;
        if (!z2) {
            return null;
        }
        String str2 = kwo0Var.c;
        String str3 = kwo0Var.e;
        if (!z3 && !z) {
            double d = kwo0Var.d;
            if (d > 0.0d) {
                pn40 pn40Var = pn40.f27267a;
                emkVar = new fmk(pn40.c(d, p3u0.c), str);
            } else if (d < 0.0d) {
                pn40 pn40Var2 = pn40.f27267a;
                emkVar = new emk(pn40.c(d, p3u0.c), str);
            }
        }
        gmk gmkVar = emkVar;
        boolean z4 = z3 || z;
        List<mvo0> list = kwo0Var.f;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (mvo0 mvo0Var : list) {
            arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
        }
        return new gxo0(str2, str3, gmkVar, z4, dyb.r0(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public static final h2s0 u(o2s0 o2s0Var) {
        ?? arrayList;
        o2s0Var.getClass();
        Long l = o2s0Var.f24548a;
        long jLongValue = l != null ? l.longValue() : 0L;
        List<l2s0> list = o2s0Var.b;
        ?? arrayList2 = 0;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (l2s0 l2s0Var : list) {
                l2s0Var.getClass();
                Long l2 = l2s0Var.f19328a;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                String str = l2s0Var.b;
                String str2 = str == null ? "" : str;
                String str3 = l2s0Var.c;
                String str4 = str3 == null ? "" : str3;
                d2s0 d2s0Var = l2s0Var.d;
                b2s0 b2s0VarC = d2s0Var != null ? ktt0.C(d2s0Var) : b2s0.f;
                Integer num = l2s0Var.e;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = l2s0Var.f;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Float f = l2s0Var.g;
                float fFloatValue = f != null ? f.floatValue() : 0.0f;
                Float f2 = l2s0Var.h;
                float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
                String str5 = l2s0Var.i;
                String str6 = str5 == null ? "" : str5;
                String str7 = l2s0Var.j;
                arrayList.add(new i2s0(jLongValue2, str2, str4, b2s0VarC, iIntValue, iIntValue2, fFloatValue, fFloatValue2, str6, str7 == null ? "" : str7));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List<g2s0> list2 = o2s0Var.c;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            for (g2s0 g2s0Var : list2) {
                g2s0Var.getClass();
                String str8 = g2s0Var.f10576a;
                String str9 = str8 == null ? "" : str8;
                String str10 = g2s0Var.b;
                String str11 = str10 == null ? "" : str10;
                Integer num3 = g2s0Var.c;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Float f3 = g2s0Var.d;
                float fFloatValue3 = f3 != null ? f3.floatValue() : 0.0f;
                Integer num4 = g2s0Var.e;
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                d2s0 d2s0Var2 = g2s0Var.f;
                b2s0 b2s0VarC2 = d2s0Var2 != null ? ktt0.C(d2s0Var2) : b2s0.f;
                Integer num5 = g2s0Var.g;
                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                Integer num6 = g2s0Var.h;
                int iIntValue6 = num6 != null ? num6.intValue() : 0;
                Integer num7 = g2s0Var.i;
                int iIntValue7 = num7 != null ? num7.intValue() : 0;
                Float f4 = g2s0Var.j;
                arrayList2.add(new a2s0(str9, str11, iIntValue3, fFloatValue3, iIntValue4, b2s0VarC2, iIntValue5, iIntValue6, iIntValue7, f4 != null ? f4.floatValue() : 0.0f));
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new h2s0(jLongValue, arrayList, arrayList2);
    }

    public static final kvv0 v(Fragment fragment) {
        fragment.getClass();
        piu0 piu0VarG = fragment.g();
        miu0 miu0VarP = u4n0.p(fragment);
        wbf wbfVarO = u4n0.o(fragment);
        miu0VarP.getClass();
        wbfVarO.getClass();
        h0q0 h0q0Var = new h0q0(piu0VarG, miu0VarP, wbfVarO);
        sgy sgyVarB = sre0.f32672a.b(kvv0.class);
        String strV = sgyVarB.v();
        if (strV != null) {
            return (kvv0) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strV));
        }
        jf4.o("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    public final String m(byte[] bArr, int i, int i2) throws box {
        int i3;
        byte b2;
        int i4;
        byte b3;
        byte b4;
        byte b5;
        switch (this.f20642a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b6 = bArr[i];
                    if (b6 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b2 = bArr[i];
                            if (b2 < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b2;
                                while (i3 < i5) {
                                    b3 = bArr[i3];
                                    if (b3 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b3;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b2 < -32) {
                                if (i3 < i5) {
                                    throw box.a();
                                }
                                i += 2;
                                byte b7 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b2 >= -62 || jtm0.o(b7)) {
                                    throw box.a();
                                }
                                cArr[i6] = (char) ((b7 & 63) | ((b2 & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw box.a();
                                    }
                                    b5 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b8 = bArr[i + 2];
                                    i += 4;
                                    byte b9 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!jtm0.o(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) != 0 && !jtm0.o(b8) && !jtm0.o(b9)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw box.a();
                                }
                                if (i3 < i5 - 1) {
                                    throw box.a();
                                }
                                int i11 = i + 2;
                                b4 = bArr[i3];
                                i += 3;
                                byte b10 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!jtm0.o(b4) || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || jtm0.o(b10)))) {
                                    throw box.a();
                                }
                                cArr[i6] = (char) (((b4 & 63) << 6) | ((b2 & 15) << 12) | (b10 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b6;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b2 = bArr[i];
                    if (b2 < 0) {
                        if (b2 < -32) {
                            if (i3 < i5) {
                                throw box.a();
                            }
                            i += 2;
                            byte b11 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b2 >= -62) {
                            }
                            throw box.a();
                        }
                        if (b2 >= -16) {
                            if (i3 < i5 - 1) {
                                throw box.a();
                            }
                            int i14 = i + 2;
                            b4 = bArr[i3];
                            i += 3;
                            byte b12 = bArr[i14];
                            int i15 = i6 + 1;
                            if (jtm0.o(b4)) {
                            }
                            throw box.a();
                        }
                        if (i3 < i5 - 2) {
                            throw box.a();
                        }
                        b5 = bArr[i3];
                        int i16 = i + 3;
                        byte b13 = bArr[i + 2];
                        i += 4;
                        byte b14 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!jtm0.o(b5)) {
                            if ((((b5 + 112) + (b2 << 28)) >> 30) != 0) {
                            }
                        }
                        throw box.a();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b2;
                    while (i3 < i5) {
                        b3 = bArr[i3];
                        if (b3 >= 0) {
                            i3++;
                            cArr[i4] = (char) b3;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = fmx.f9806a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw box.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    public final int n(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        long j2;
        int i5;
        char cCharAt3;
        char c2 = 2048;
        char c3 = 57343;
        switch (this.f20642a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new ott0(i7, length);
                                        }
                                        itt0.e(cCharAt, i3);
                                        return 0;
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new ott0(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j3 = i;
                long j4 = ((long) i2) + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i20 = 0;
                    while (true) {
                        j = 1;
                        if (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                            jft0.j(bArr, j3, (byte) cCharAt3);
                            i20++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char cCharAt5 = str.charAt(i20);
                            if (cCharAt5 < 128 && j3 < j4) {
                                jft0.j(bArr, j3, (byte) cCharAt5);
                                j2 = j;
                                j3 += j;
                            } else if (cCharAt5 >= c2 || j3 > j4 - 2) {
                                j2 = j;
                                if ((cCharAt5 < 55296 || c3 < cCharAt5) && j3 <= j4 - 3) {
                                    jft0.j(bArr, j3, (byte) ((cCharAt5 >>> '\f') | Response.TEMPORARILY_UNAVAILABLE));
                                    long j5 = j3 + 2;
                                    jft0.j(bArr, j3 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                    j3 += 3;
                                    jft0.j(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char cCharAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                                jft0.j(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                                jft0.j(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j6 = j3 + 3;
                                                jft0.j(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j3 += 4;
                                                jft0.j(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new ott0(i20 - 1, length2);
                                    }
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i20 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new ott0(i20, length2);
                                    }
                                    itt0.h(cCharAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                jft0.j(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                                j3 += 2;
                                jft0.j(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                            }
                            i20++;
                            j = j2;
                            c2 = 2048;
                            c3 = 57343;
                        }
                    }
                    return (int) j3;
                }
                itt0.q(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }
}
