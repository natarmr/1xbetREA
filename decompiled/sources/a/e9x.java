package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.RectF;
import android.javax.sip.message.Response;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.CharsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e9x {
    public static final void A(nn5 nn5Var, wul wulVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        boolean z;
        nn5 nn5Var2 = nn5Var;
        Function0 function2 = function0;
        fet fetVar2 = fetVar;
        fetVar2.g0(700285157);
        int i2 = i | (fetVar2.g(nn5Var2) ? 4 : 2) | (fetVar2.g(wulVar) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarH = phu0.H(s5x0.N(mm40VarD, 16.0f, 0.0f, 8.0f, 0.0f, 10), null, 1);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarH);
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
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new dbn(function2, (byte) 23);
                fetVar2.o0(objP);
            }
            qzb.n(null, wulVar, (Function0) objP, fetVar2, i2 & 112, 1);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarK = s5x0.K(o7k0.d(zhg0Var.a(1.0f, jm40Var, true), 1.0f), 8.0f, 2.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            boolean z4 = nn5Var2.e;
            String str = nn5Var2.d;
            String str2 = nn5Var2.c;
            if (z4) {
                fetVar2.e0(999296238);
                mm40 mm40VarD2 = o7k0.d(y860.W(jm40Var, null, null, false, null, function1, 28), 1.0f);
                thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                String str3 = str2 + Separators.SP + str;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarJ = g1t0.j();
                zfn zfnVar = zaq0.b;
                v8q0.a(str3, zhg0Var.a(1.0f, jm40Var, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(y9q0VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, 0, 24960, 110588);
                dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary80(), fetVar2, 56, 0);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                fetVar2.r(false);
                nn5Var2 = nn5Var;
                function2 = function0;
                z = true;
            } else {
                fetVar2.e0(1000630602);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                thg0 thg0VarA3 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarD3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA3, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarA);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar);
                jpm0.o(fetVar2, bh90VarM5, shdVar2);
                vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC4, shdVar4);
                String str4 = nn5Var.f23803a;
                zfn zfnVar2 = j1t0.e;
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                y9q0 y9q0VarG = g1t0.g();
                zfn zfnVar3 = zaq0.b;
                y9q0 y9q0VarA = y9q0.a(y9q0VarG, ((ThemeColors) fetVar2.k(zfnVar3)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                z = true;
                v8q0.a(str4, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0VarA, fetVar, 0, 24576, 114686);
                mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 2.0f, 1);
                String strL = kng0.l(str2, Separators.SP, str);
                ((g1t0) fetVar.k(zfnVar2)).getClass();
                v8q0.a(strL, mm40VarL, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.m(), ((ThemeColors) fetVar.k(zfnVar3)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
                fetVar.r(true);
                mm40 mm40VarH2 = phu0.H(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), null, 1);
                nn5Var2 = nn5Var;
                wul wulVar2 = new wul(qul.e, oe9.b, new we9(nn5Var2.b, R.drawable.ic_glyph_chevron_right_small), true, false, false);
                boolean z5 = i3 == 256;
                Object objP2 = fetVar.P();
                if (z5 || objP2 == cl5Var) {
                    function2 = function0;
                    objP2 = new dbn(function2, (byte) 24);
                    fetVar.o0(objP2);
                } else {
                    function2 = function0;
                }
                fetVar2 = fetVar;
                qzb.n(mm40VarH2, wulVar2, (Function0) objP2, fetVar2, 0, 0);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 11, i, (Object) nn5Var2, (Object) wulVar, (Object) function2, (Object) function1);
        }
    }

    public static final void B(d0s d0sVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(110222041);
        int i2 = i | (fetVar2.g(d0sVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarL, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, x7zVarI);
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
            String str = d0sVar.b;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.j(), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110590);
            String str2 = d0sVar.c;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110588);
            fetVar.r(true);
            String str3 = d0sVar.f5281a;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str3, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.q(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110590);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxv(d0sVar, i, (byte) 22);
        }
    }

    public static final void C(hbz hbzVar, Object obj, int i, Object obj2, fet fetVar, int i2) {
        fetVar.g0(1439843069);
        int i3 = (fetVar.g(hbzVar) ? 4 : 2) | i2 | (fetVar.g(obj) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.g(obj2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            ((bzg0) obj).b(obj2, u1c.M(980966366, new dlw(i, hbzVar, obj2), fetVar), fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o(hbzVar, obj, i, obj2, i2);
        }
    }

    public static final void D(mm40 mm40Var, boolean z, utm utmVar, fet fetVar, int i) {
        k6z k6zVar;
        boolean z2;
        fet fetVar2 = fetVar;
        jwm jwmVar = utmVar.i;
        fetVar2.g0(1030612667);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        int i3 = i2 | (fetVar2.g(utmVar) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar2 = (k6z) fetVar2.k(zfnVar);
            k6z k6zVar3 = z ? k6zVar2 : k6z.f17794a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            k6z k6zVar4 = k6zVar3;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            String str = jwmVar.f17257a;
            if (str == null || str.length() == 0) {
                k6zVar = k6zVar2;
                z2 = true;
                fetVar2.e0(1949849457);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1949326673);
                mm40 mm40VarG = o7k0.g(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), 16.0f, 0.0f, 2);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarG);
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
                z2 = true;
                k6zVar = k6zVar2;
                v8q0.a(jwmVar.f17257a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            n(0, utmVar.e, utmVar.h, fetVar2, utmVar.f36262a, utmVar.b, utmVar.c, utmVar.f, utmVar.d, utmVar.g);
            obc.d(zfnVar.a(k6zVar4), u1c.M(205303793, new a5k0(utmVar, k6zVar, (byte) 16), fetVar2), fetVar2, 56);
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13((byte) 6, i, mm40Var, (Object) utmVar, z);
        }
    }

    public static final void E(mm40 mm40Var, j4n j4nVar, fet fetVar, int i) {
        int i2;
        j4nVar.getClass();
        fetVar.g0(2139337737);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j4nVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-515713207, new x6a0(j4nVar, mm40Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) j4nVar, i, (byte) 10);
        }
    }

    public static final void F(hz40 hz40Var, Object obj, Object obj2) {
        int iF = hz40Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : hz40Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof iz40) {
                ((iz40) obj3).a(obj2);
            } else if (obj3 != obj2) {
                iz40 iz40Var = new iz40();
                iz40Var.a(obj3);
                iz40Var.a(obj2);
                obj2 = iz40Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            hz40Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        hz40Var.b[i] = obj;
        hz40Var.c[i] = obj2;
    }

    public static final void G(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellRightSwitch) ((s3j0) yfu0Var).b.e).setChecked(((x3j0) cpVar.u()).c);
        s3j0 s3j0Var = (s3j0) yfu0Var;
        ((DsCellMiddleTitle) s3j0Var.b.c).setTitle(R.string.bet_settings_coef_from_line_to_live);
        ((DsSettingsCell) s3j0Var.b.d).setFirst(false);
        ((DsSettingsCell) s3j0Var.b.d).setLast(true);
    }

    public static final void H(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellRightSwitch) ((s3j0) yfu0Var).c.e).setChecked(((x3j0) cpVar.u()).b);
        s3j0 s3j0Var = (s3j0) yfu0Var;
        ((DsCellMiddleTitle) s3j0Var.c.c).setTitle(R.string.drop_on_game_score_change);
        ((DsSettingsCell) s3j0Var.c.d).setFirst(true);
        ((DsSettingsCell) s3j0Var.c.d).setLast(false);
    }

    public static final String I(ctf0 ctf0Var, double d, String str) {
        ctf0Var.getClass();
        str.getClass();
        String strF = ctf0Var.f(R.string.one_click_bet_min_value_info, new Object[0]);
        pn40 pn40Var = pn40.f27267a;
        return b1j.k(strF, Separators.SP, pn40.c(d, p3u0.c), Separators.SP, str);
    }

    public static hz40 J() {
        long[] jArr = u1h0.f34903a;
        return new hz40();
    }

    public static final r4m0 K(wm40 wm40Var, wm40 wm40Var2) {
        wm40Var.getClass();
        wm40Var2.getClass();
        wm40Var.M().size();
        wm40Var2.M().size();
        List listM = wm40Var.M();
        listM.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((hzs0) it.next()).h());
        }
        List listM2 = wm40Var2.M();
        listM2.getClass();
        ArrayList arrayList2 = new ArrayList(r3d.q(listM2, 10));
        Iterator it2 = listM2.iterator();
        while (it2.hasNext()) {
            kzj0 kzj0VarI = ((hzs0) it2.next()).I();
            kzj0VarI.getClass();
            arrayList2.add(new q4m0(kzj0VarI));
        }
        Map mapM = xp20.m(CollectionsKt.T0(arrayList, arrayList2));
        mapM.getClass();
        return new r4m0(mapM, (byte) 1);
    }

    public static final String L(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final ugd M(long j, long j2, rs20 rs20Var, mm40 mm40Var) {
        mm40Var.getClass();
        if (rs20Var instanceof qs20) {
            return new ugd(1146890940, true, new aw(j, j2, rs20Var, mm40Var));
        }
        if (rs20Var instanceof ps20) {
            return new ugd(-601702235, true, new ft0(mm40Var, (byte) 13));
        }
        if (rs20Var instanceof ns20) {
            return new ugd(-838320060, true, new iom(mm40Var, j2, (byte) 2));
        }
        if (rs20Var instanceof os20) {
            return null;
        }
        t9f.b();
        return null;
    }

    public static final f3w N(for0 for0Var, ctf0 ctf0Var, String str) {
        hxu hxuVar = for0Var.l;
        if (hxuVar.f.b != 0.0d) {
            String strA = ctf0Var.b.a(R.string.history_your_win, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var = pn40.f27267a;
            return new f3w("", strA, pn40.c(hxuVar.f.b, p3u0.c), str, e3w.b);
        }
        i0w i0wVar = for0Var.g;
        if (i0wVar != i0w.d && i0wVar != i0w.e) {
            return null;
        }
        String strA2 = ctf0Var.b.a(R.string.history_your_win, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var2 = pn40.f27267a;
        return new f3w("", strA2, pn40.c(for0Var.c, p3u0.c), str, e3w.b);
    }

    public static final pz40 O(Object[] objArr, u0h0 u0h0Var, Function0 function0, fet fetVar, int i) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        u0h0Var.getClass();
        return (pz40) P(objArrCopyOf, new v0h0(new eme0(u0h0Var, (byte) 10), new dke0(u0h0Var, (byte) 8)), function0, fetVar, ((i << 3) & 7168) | 384);
    }

    public static final Object P(Object[] objArr, u0h0 u0h0Var, Function0 function0, fet fetVar, int i) {
        Object[] objArr2;
        u0h0 u0h0Var2;
        Object obj;
        Object objF;
        String string = Long.toString(fetVar.T, CharsKt.checkRadix(36));
        string.getClass();
        u0h0Var.getClass();
        fzg0 fzg0Var = (fzg0) fetVar.k(hzg0.f13904a);
        Object objP = fetVar.P();
        Object obj2 = ukd.f35823a;
        if (objP == obj2) {
            Object objB = (fzg0Var == null || (objF = fzg0Var.f(string)) == null) ? null : u0h0Var.b(objF);
            if (objB == null) {
                objB = function0.invoke();
            }
            objArr2 = objArr;
            u0h0Var2 = u0h0Var;
            Object azg0Var = new azg0(u0h0Var2, fzg0Var, string, objB, objArr2);
            fetVar.o0(azg0Var);
            objP = azg0Var;
        } else {
            objArr2 = objArr;
            u0h0Var2 = u0h0Var;
        }
        azg0 azg0Var2 = (azg0) objP;
        Object objInvoke = Arrays.equals(objArr2, azg0Var2.e) ? azg0Var2.d : null;
        if (objInvoke == null) {
            objInvoke = function0.invoke();
        }
        boolean zI = fetVar.i(azg0Var2) | ((((i & 112) ^ 48) > 32 && fetVar.i(u0h0Var2)) || (i & 48) == 32) | fetVar.i(fzg0Var) | fetVar.g(string) | fetVar.i(objInvoke) | fetVar.i(objArr2);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object co0Var = new co0(azg0Var2, u0h0Var2, fzg0Var, string, obj, objArr3);
            fetVar.o0(co0Var);
            objP2 = co0Var;
        } else {
            obj = objInvoke;
        }
        m0x0.D((Function0) objP2, fetVar);
        return obj;
    }

    public static final Object Q(Object[] objArr, Function0 function0, fet fetVar, int i) {
        return P(Arrays.copyOf(objArr, objArr.length), ju70.i, function0, fetVar, ((i << 6) & 7168) | 384);
    }

    public static final Object R(Object[] objArr, u0h0 u0h0Var, Function0 function0, fet fetVar, int i) {
        return P(Arrays.copyOf(objArr, objArr.length), u0h0Var, function0, fetVar, ((i << 3) & 7168) | 384);
    }

    public static final boolean S(hz40 hz40Var, Object obj, Object obj2) {
        Object objG = hz40Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof iz40)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            hz40Var.l(obj);
            return true;
        }
        iz40 iz40Var = (iz40) objG;
        boolean zL = iz40Var.l(obj2);
        if (zL && iz40Var.g()) {
            hz40Var.l(obj);
        }
        return zL;
    }

    public static final void T(hz40 hz40Var, Object obj) {
        boolean zG;
        long[] jArr = hz40Var.f13891a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = hz40Var.b[i4];
                        Object obj3 = hz40Var.c[i4];
                        if (obj3 instanceof iz40) {
                            iz40 iz40Var = (iz40) obj3;
                            iz40Var.l(obj);
                            zG = iz40Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            hz40Var.m(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final Rect U(mkx mkxVar) {
        return new Rect(mkxVar.f21964a, mkxVar.b, mkxVar.c, mkxVar.d);
    }

    public static final Rect V(jge0 jge0Var) {
        return new Rect((int) jge0Var.f16474a, (int) jge0Var.b, (int) jge0Var.c, (int) jge0Var.d);
    }

    public static final RectF W(jge0 jge0Var) {
        return new RectF(jge0Var.f16474a, jge0Var.b, jge0Var.c, jge0Var.d);
    }

    public static final jge0 X(Rect rect) {
        return new jge0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final jge0 Y(RectF rectF) {
        return new jge0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final wim Z(mz60 mz60Var) {
        bjm zimVar;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
        mz60Var.getClass();
        int iD = (int) x1x.D(mz60Var.b);
        boolean z = mz60Var.e;
        hds hdsVar = mz60Var.d;
        if (z) {
            String str = hdsVar.b;
            String str2 = hdsVar.f12884a;
            zimVar = new ajm(new n0x(str), new n0x(azw.R(hdsVar.b)), new n0x(str2), new n0x(azw.R(str2)), numValueOf, Integer.valueOf(R.drawable.ic_glyph_technical_works), 32);
        } else {
            String str3 = hdsVar.b;
            String str4 = hdsVar.f12884a;
            zimVar = new zim(new n0x(str3), new n0x(azw.R(hdsVar.b)), new n0x(str4), new n0x(azw.R(str4)), numValueOf, 32);
        }
        return new wim(iD, zimVar, mz60Var.f22638a);
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(-555840738);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            long secondary80 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary80();
            f2q0 f2q0Var = new f2q0(3);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarL, secondary80, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 0, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 384, 125944);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var2, str2, i, (byte) 8);
        }
    }

    public static final z6c0 a0(dzc0 dzc0Var, ctf0 ctf0Var, boolean z) {
        vyc0 vyc0Var;
        ctf0Var.getClass();
        syc0 syc0Var = dzc0Var.f6938a;
        zyc0 zyc0Var = new zyc0(syc0Var.f33019a, syc0Var.b, syc0Var.c, true, syc0Var.d, syc0Var.e);
        if (z) {
            vyc0Var = vyc0.b;
        } else {
            int iOrdinal = dzc0Var.b.ordinal();
            if (iOrdinal == 0) {
                vyc0Var = vyc0.f38241a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                vyc0Var = vyc0.b;
            }
        }
        olc0 olc0Var = dzc0Var.c;
        double d = olc0Var.f25446a;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        String str = olc0Var.c;
        p3u0 p3u0Var = p3u0.c;
        tlc0 tlc0Var = new tlc0(dyb.r0(tx3.z(new llc0[]{new llc0(strA, cy7.e(pn40.d(d, str, p3u0Var)), false), new llc0(lsm0Var.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), olc0Var.b, false), olc0Var.f ? new llc0(lsm0Var.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(olc0Var.e, str, p3u0Var)), true) : null, olc0Var.g ? new llc0(lsm0Var.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((olc0Var.d - 1.0d) * d, str, p3u0Var)), true) : null})), olc0Var.h);
        boolean z2 = dzc0Var.d;
        String strA2 = lsm0Var.a(R.string.new_bet_promo_info_line, Arrays.copyOf(new Object[0], 0));
        String strConcat = z2 ? Separators.RETURN.concat(lsm0Var.a(R.string.bet_promo_balance_description, Arrays.copyOf(new Object[0], 0))) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return new z6c0(zyc0Var, vyc0Var, tlc0Var, strA2.concat(strConcat));
    }

    public static final void b(mm40 mm40Var, y5y y5yVar, Function1 function1, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        y5yVar.getClass();
        function1.getClass();
        fetVar2.g0(-808230599);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(y5yVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new u9x(function1, (byte) 22);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new u9x(function1, (byte) 23);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            B(y5yVar.f42070a, fetVar, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            nn5 nn5Var = y5yVar.b;
            wul wulVar = y5yVar.d;
            boolean z4 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new u9x(function1, (byte) 24);
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean z5 = i3 == 256;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new u9x(function1, (byte) 25);
                fetVar.o0(objP4);
            }
            A(nn5Var, wulVar, function2, (Function0) objP4, fetVar, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            rx6 rx6Var = y5yVar.c;
            wul wulVar2 = y5yVar.e;
            boolean z6 = i3 == 256;
            Object objP5 = fetVar.P();
            if (z6 || objP5 == cl5Var) {
                objP5 = new i1y(function1, (byte) 4);
                fetVar.o0(objP5);
            }
            Function1 function3 = (Function1) objP5;
            boolean zI = fetVar.i(wpqVar) | (i3 == 256);
            Object objP6 = fetVar.P();
            if (zI || objP6 == cl5Var) {
                z = true;
                objP6 = new qhc(wpqVar, function1, (byte) 1);
                fetVar.o0(objP6);
            } else {
                z = true;
            }
            v(rx6Var, wulVar2, function3, (Function0) objP6, fetVar, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            String str = y5yVar.f;
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40.b, 1.0f), 16.0f, 0.0f, 2);
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            f2q0 f2q0Var = new f2q0(3);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, secondary, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 0, 0, null, y9q0.a(g1t0.k(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 384, 125944);
            fetVar2 = fetVar;
            wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, y5yVar, function1, i, (byte) 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    public static final awj0 b0(pvj0 pvj0Var, ctf0 ctf0Var, boolean z, q4f q4fVar) {
        String upperCase;
        boolean z2;
        ctf0Var.getClass();
        q4fVar.getClass();
        bx6 bx6Var = pvj0Var.f27665a;
        zv6 zv6VarB0 = ccq0.b0(bx6Var, ctf0Var, pvj0Var.b, z);
        iwo0 iwo0Var = pvj0Var.c;
        tw6 tw6Var = bx6Var.b;
        hxo0 hxo0VarA = ktt0.A(iwo0Var, tw6Var.f, z);
        nnd0 nnd0Var = pvj0Var.d;
        String str = tw6Var.f;
        boolean z3 = nnd0Var.e && !z;
        pn40 pn40Var = pn40.f27267a;
        double d = nnd0Var.b;
        p3u0 p3u0Var = p3u0.c;
        String strC = pn40.c(d, p3u0Var);
        String strC2 = pn40.c(nnd0Var.c, p3u0Var);
        String strC3 = pn40.c(nnd0Var.d, p3u0Var);
        if (nnd0Var.f) {
            upperCase = ctf0Var.b.a(R.string.maximum, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
        } else {
            upperCase = null;
        }
        knd0 knd0Var = new knd0(new epd0(strC, strC2, strC3, str, upperCase, z3), nnd0Var.f23816a);
        String str2 = pvj0Var.e;
        f9x f9xVar = new f9x(str2 == null ? "" : str2, !(str2 == null || str2.length() == 0));
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        ue9 ue9Var = new ue9(ctf0Var.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
        boolean z4 = pvj0Var.f;
        boolean z5 = tw6Var.k;
        if (q4fVar == q4f.m || q4fVar == q4f.h) {
            if (z5 || z4) {
                if (!z) {
                    z2 = true;
                }
            }
            return new awj0(zv6VarB0, hxo0VarA, knd0Var, f9xVar, new wul(iulVar, oe9Var, ue9Var, z2, false, true));
        }
        double d2 = tw6Var.f34633a;
        if (z5) {
            if (d2 == -1.0d) {
                if (z4) {
                    if (!z) {
                        z2 = true;
                    }
                }
                return new awj0(zv6VarB0, hxo0VarA, knd0Var, f9xVar, new wul(iulVar, oe9Var, ue9Var, z2, false, true));
            }
            double d3 = tw6Var.d;
            double dB = tw6Var.b();
            if ((d3 > d2 || d2 > dB) && (!tw6Var.m || d2 <= tw6Var.b())) {
                if (z4) {
                    if (!z) {
                        z2 = true;
                    }
                }
            } else if (!z) {
                z2 = true;
            }
            return new awj0(zv6VarB0, hxo0VarA, knd0Var, f9xVar, new wul(iulVar, oe9Var, ue9Var, z2, false, true));
        }
        z2 = false;
        return new awj0(zv6VarB0, hxo0VarA, knd0Var, f9xVar, new wul(iulVar, oe9Var, ue9Var, z2, false, true));
    }

    public static final void c(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        fetVar.g0(-2092141708);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.d(f) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (f > 0.0f && f2 > 0.0f) {
            fetVar.e0(1571981746);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            float f3 = f / (f + f2);
            float f4 = f / f3;
            if (f4 <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            if (f4 > Float.MAX_VALUE) {
                f4 = Float.MAX_VALUE;
            }
            mm40 mm40VarC = o7k0.c(new x7z(f4, true), 1.0f);
            long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarC, primary, new ugg0(pzb.e(50), pzb.e(0), pzb.e(0), pzb.e(50))));
            float f5 = f2 / f3;
            if (f5 <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            zq8.a(0, fetVar, i120.Q(o7k0.c(new x7z(f5 > Float.MAX_VALUE ? Float.MAX_VALUE : f5, true), 1.0f), StaticColors.INSTANCE.m129getWhite400d7_KjU(), new ugg0(pzb.e(0), pzb.e(50), pzb.e(50), pzb.e(0))));
            fetVar.r(true);
            fetVar.r(false);
        } else if (f > 0.0f) {
            fetVar.e0(-503433734);
            long primary2 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
            ugg0 ugg0Var2 = vgg0.f37379a;
            ld90 ld90VarE = pzb.e(50);
            zq8.a(0, fetVar, i120.Q(mm40Var, primary2, new ugg0(ld90VarE, ld90VarE, ld90VarE, ld90VarE)));
            fetVar.r(false);
        } else {
            fetVar.e0(-503428907);
            long jM129getWhite400d7_KjU = StaticColors.INSTANCE.m129getWhite400d7_KjU();
            ugg0 ugg0Var3 = vgg0.f37379a;
            ld90 ld90VarE2 = pzb.e(50);
            zq8.a(0, fetVar, i120.Q(mm40Var, jM129getWhite400d7_KjU, new ugg0(ld90VarE2, ld90VarE2, ld90VarE2, ld90VarE2)));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vil(mm40Var, f, f2, i, (byte) 1);
        }
    }

    public static final void d(mm40 mm40Var, ip00 ip00Var, Function0 function0, fet fetVar, int i) {
        ugd ugdVarM;
        fetVar.g0(-160655489);
        int i2 = i | (fetVar.g(ip00Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            byte b = 3;
            ugd ugdVarM2 = u1c.M(1654073491, new lo30(ip00Var, function0, b), fetVar);
            vcd vcdVar = ip00Var.e;
            ugd ugdVarM3 = null;
            if (vcdVar == null) {
                fetVar.e0(-1493626817);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-1493626816);
                ugdVarM = u1c.M(1898594668, new oo30(vcdVar, b), fetVar);
                fetVar.r(false);
            }
            mx80 mx80Var = ip00Var.d;
            if (mx80Var == null) {
                fetVar.e0(-1493290064);
                fetVar.r(false);
            } else {
                fetVar.e0(-1493290063);
                ugdVarM3 = u1c.M(523666808, new po30(mx80Var, (byte) 2), fetVar);
                fetVar.r(false);
            }
            g7x.d(mm40Var, ugdVarM2, ugdVarM, ugdVarM3, u1c.M(430002646, new mo30(ip00Var, (byte) 5), fetVar), u1c.M(21979031, new mo30(ip00Var, (byte) 6), fetVar), fetVar, 221238);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new no30(mm40Var, ip00Var, function0, i, (byte) 3);
        }
    }

    public static final void e(mm40 mm40Var, ip00 ip00Var, Function0 function0, fet fetVar, int i) {
        ugd ugdVarM;
        fetVar.g0(536481933);
        int i2 = i | (fetVar.g(ip00Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ugd ugdVarM2 = u1c.M(-1607518793, new lo30(ip00Var, function0, b2), fetVar);
            vcd vcdVar = ip00Var.e;
            ugd ugdVarM3 = null;
            if (vcdVar == null) {
                fetVar.e0(760429966);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(760429967);
                ugdVarM = u1c.M(-36166320, new oo30(vcdVar, b), fetVar);
                fetVar.r(false);
            }
            mx80 mx80Var = ip00Var.d;
            if (mx80Var == null) {
                fetVar.e0(760769602);
                fetVar.r(false);
            } else {
                fetVar.e0(760769603);
                ugdVarM3 = u1c.M(725312092, new po30(mx80Var, b), fetVar);
                fetVar.r(false);
            }
            k7x.j(mm40Var, ugdVarM2, ugdVarM, ugdVarM3, u1c.M(-816427718, new mo30(ip00Var, b2), fetVar), u1c.M(-552730693, new mo30(ip00Var, (byte) 2), fetVar), fetVar, 221238);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new no30(mm40Var, ip00Var, function0, i, (byte) 1);
        }
    }

    public static final void f(mm40 mm40Var, ip00 ip00Var, Function0 function0, fet fetVar, int i) {
        ugd ugdVar;
        fetVar.g0(-505752150);
        int i2 = i | (fetVar.g(ip00Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ugd ugdVarM = u1c.M(-893144461, new lo30(ip00Var, function0, b), fetVar);
            vcd vcdVar = ip00Var.e;
            ugd ugdVarM2 = null;
            if (vcdVar == null) {
                fetVar.e0(-116555887);
                fetVar.r(false);
                ugdVar = null;
            } else {
                fetVar.e0(-116555886);
                ugd ugdVarM3 = u1c.M(686142540, new oo30(vcdVar, (byte) 2), fetVar);
                fetVar.r(false);
                ugdVar = ugdVarM3;
            }
            mx80 mx80Var = ip00Var.d;
            if (mx80Var == null) {
                fetVar.e0(-116216251);
                fetVar.r(false);
            } else {
                fetVar.e0(-116216250);
                ugdVarM2 = u1c.M(1942799448, new po30(mx80Var, (byte) 3), fetVar);
                fetVar.r(false);
            }
            l7x.o(mm40Var, ugdVarM, ugdVar, ugdVarM2, u1c.M(-2067738954, new mo30(ip00Var, (byte) 7), fetVar), u1c.M(404041079, new mo30(ip00Var, (byte) 8), fetVar), fetVar, 221238);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new no30(mm40Var, ip00Var, function0, i, (byte) 4);
        }
    }

    public static final void g(mm40 mm40Var, ip00 ip00Var, Function0 function0, fet fetVar, int i) {
        ugd ugdVarM;
        fetVar.g0(531413653);
        int i2 = i | (fetVar.g(ip00Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            byte b2 = 4;
            ugd ugdVarM2 = u1c.M(-882075949, new lo30(ip00Var, function0, b2), fetVar);
            vcd vcdVar = ip00Var.e;
            ugd ugdVarM3 = null;
            if (vcdVar == null) {
                fetVar.e0(95142051);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(95142052);
                ugdVarM = u1c.M(-538454484, new oo30(vcdVar, b2), fetVar);
                fetVar.r(false);
            }
            mx80 mx80Var = ip00Var.d;
            if (mx80Var == null) {
                fetVar.e0(95484570);
                fetVar.r(false);
            } else {
                fetVar.e0(95484571);
                ugdVarM3 = u1c.M(155031608, new po30(mx80Var, b2), fetVar);
                fetVar.r(false);
            }
            m7x.c(mm40Var, ugdVarM2, ugdVarM, ugdVarM3, u1c.M(-2028486762, new mo30(ip00Var, (byte) 9), fetVar), u1c.M(452687831, new mo30(ip00Var, b), fetVar), fetVar, 221238);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new no30(mm40Var, ip00Var, function0, i, (byte) 0);
        }
    }

    public static final void h(mm40 mm40Var, ip00 ip00Var, Function0 function0, fet fetVar, int i) {
        ugd ugdVarM;
        fetVar.g0(1263842615);
        int i2 = i | (fetVar.g(ip00Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ugd ugdVarM2 = u1c.M(-1018261365, new lo30(ip00Var, function0, (byte) 2), fetVar);
            vcd vcdVar = ip00Var.e;
            ugd ugdVarM3 = null;
            if (vcdVar == null) {
                fetVar.e0(1452475672);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(1452475673);
                ugdVarM = u1c.M(664700580, new oo30(vcdVar, b), fetVar);
                fetVar.r(false);
            }
            mx80 mx80Var = ip00Var.d;
            if (mx80Var == null) {
                fetVar.e0(1452703832);
                fetVar.r(false);
            } else {
                fetVar.e0(1452703833);
                ugdVarM3 = u1c.M(1824637360, new po30(mx80Var, b), fetVar);
                fetVar.r(false);
            }
            n7x.c(mm40Var, ugdVarM2, ugdVarM, ugdVarM3, u1c.M(1168918414, new mo30(ip00Var, (byte) 3), fetVar), u1c.M(466322575, new mo30(ip00Var, (byte) 4), fetVar), fetVar, 221238);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new no30(mm40Var, ip00Var, function0, i, (byte) 2);
        }
    }

    public static final void i(final n010 n010Var, mm40 mm40Var, fet fetVar, int i) {
        n010Var.getClass();
        fetVar.g0(1766632372);
        final byte b = 4;
        final byte b2 = 2;
        int i2 = i | (fetVar.g(n010Var) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        final byte b3 = 0;
        final byte b4 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            final byte b5 = 3;
            final byte b6 = 5;
            final byte b7 = 6;
            mbc.f(mm40Var, 0.55f, 0.7f, u1c.M(1103602031, new xdr() { // from class: a.b010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b8 = b3;
                    jm40 jm40Var = jm40.b;
                    n010 n010Var2 = n010Var;
                    switch (b8) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f), n010Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(n010Var2.g, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 28.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                                String str = n010Var2.f;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarW = o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3);
                                String str2 = n010Var2.h;
                                ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarW, ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar5, 0, 24960, 109560);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), n010Var2.i);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        case 5:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar6 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), n010Var2.j);
                            } else {
                                fetVar7.X();
                            }
                            break;
                        default:
                            fet fetVar8 = (fet) obj2;
                            int iIntValue7 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                zcl zclVar7 = qmk.f28987a;
                                x2x.u(0, 0, fetVar8, o7k0.s(jm40Var, 46.0f), n010Var2.k);
                            } else {
                                fetVar8.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(695578416, new xdr() { // from class: a.b010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b8 = b4;
                    jm40 jm40Var = jm40.b;
                    n010 n010Var2 = n010Var;
                    switch (b8) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f), n010Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(n010Var2.g, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 28.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                                String str = n010Var2.f;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarW = o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3);
                                String str2 = n010Var2.h;
                                ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarW, ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar5, 0, 24960, 109560);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), n010Var2.i);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        case 5:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar6 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), n010Var2.j);
                            } else {
                                fetVar7.X();
                            }
                            break;
                        default:
                            fet fetVar8 = (fet) obj2;
                            int iIntValue7 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                zcl zclVar7 = qmk.f28987a;
                                x2x.u(0, 0, fetVar8, o7k0.s(jm40Var, 46.0f), n010Var2.k);
                            } else {
                                fetVar8.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(287554801, new xdr() { // from class: a.b010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b8 = b2;
                    jm40 jm40Var = jm40.b;
                    n010 n010Var2 = n010Var;
                    switch (b8) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f), n010Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(n010Var2.g, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 28.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                                String str = n010Var2.f;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarW = o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3);
                                String str2 = n010Var2.h;
                                ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarW, ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar5, 0, 24960, 109560);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), n010Var2.i);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        case 5:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar6 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), n010Var2.j);
                            } else {
                                fetVar7.X();
                            }
                            break;
                        default:
                            fet fetVar8 = (fet) obj2;
                            int iIntValue7 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                zcl zclVar7 = qmk.f28987a;
                                x2x.u(0, 0, fetVar8, o7k0.s(jm40Var, 46.0f), n010Var2.k);
                            } else {
                                fetVar8.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, u1c.M(-528492429, new xdr() { // from class: a.b010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b8 = b5;
                    jm40 jm40Var = jm40.b;
                    n010 n010Var2 = n010Var;
                    switch (b8) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f), n010Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(n010Var2.g, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 28.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                                String str = n010Var2.f;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarW = o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3);
                                String str2 = n010Var2.h;
                                ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarW, ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar5, 0, 24960, 109560);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), n010Var2.i);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        case 5:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar6 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), n010Var2.j);
                            } else {
                                fetVar7.X();
                            }
                            break;
                        default:
                            fet fetVar8 = (fet) obj2;
                            int iIntValue7 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                zcl zclVar7 = qmk.f28987a;
                                x2x.u(0, 0, fetVar8, o7k0.s(jm40Var, 46.0f), n010Var2.k);
                            } else {
                                fetVar8.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1056455409, new xdr() { // from class: a.b010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b8 = b;
                    jm40 jm40Var = jm40.b;
                    n010 n010Var2 = n010Var;
                    switch (b8) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f), n010Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(n010Var2.g, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 28.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                                String str = n010Var2.f;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarW = o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3);
                                String str2 = n010Var2.h;
                                ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarW, ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar5, 0, 24960, 109560);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), n010Var2.i);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        case 5:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar6 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), n010Var2.j);
                            } else {
                                fetVar7.X();
                            }
                            break;
                        default:
                            fet fetVar8 = (fet) obj2;
                            int iIntValue7 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                zcl zclVar7 = qmk.f28987a;
                                x2x.u(0, 0, fetVar8, o7k0.s(jm40Var, 46.0f), n010Var2.k);
                            } else {
                                fetVar8.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(648431794, new xdr() { // from class: a.b010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b8 = b6;
                    jm40 jm40Var = jm40.b;
                    n010 n010Var2 = n010Var;
                    switch (b8) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f), n010Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(n010Var2.g, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 28.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                                String str = n010Var2.f;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarW = o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3);
                                String str2 = n010Var2.h;
                                ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarW, ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar5, 0, 24960, 109560);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), n010Var2.i);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        case 5:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar6 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), n010Var2.j);
                            } else {
                                fetVar7.X();
                            }
                            break;
                        default:
                            fet fetVar8 = (fet) obj2;
                            int iIntValue7 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                zcl zclVar7 = qmk.f28987a;
                                x2x.u(0, 0, fetVar8, o7k0.s(jm40Var, 46.0f), n010Var2.k);
                            } else {
                                fetVar8.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(240408179, new xdr() { // from class: a.b010
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b8 = b7;
                    jm40 jm40Var = jm40.b;
                    n010 n010Var2 = n010Var;
                    switch (b8) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 24.0f), n010Var2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(n010Var2.g, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 28.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                                String str = n010Var2.f;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        case 3:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarW = o7k0.w(o7k0.p(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f, 28.0f), null, false, 3);
                                String str2 = n010Var2.h;
                                ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                v8q0.a(str2, mm40VarW, ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar5, 0, 24960, 109560);
                            } else {
                                fetVar5.X();
                            }
                            break;
                        case 4:
                            fet fetVar6 = (fet) obj2;
                            int iIntValue5 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                x2x.u(0, 0, fetVar6, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 34.0f), n010Var2.i);
                            } else {
                                fetVar6.X();
                            }
                            break;
                        case 5:
                            fet fetVar7 = (fet) obj2;
                            int iIntValue6 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                zcl zclVar6 = qmk.f28987a;
                                x2x.u(0, 0, fetVar7, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 46.0f), n010Var2.j);
                            } else {
                                fetVar7.X();
                            }
                            break;
                        default:
                            fet fetVar8 = (fet) obj2;
                            int iIntValue7 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                zcl zclVar7 = qmk.f28987a;
                                x2x.u(0, 0, fetVar8, o7k0.s(jm40Var, 46.0f), n010Var2.k);
                            } else {
                                fetVar8.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i2 >> 3) & 14) | 819662208, 438, 274);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(n010Var, mm40Var, i, (byte) 28);
        }
    }

    public static final void j(mm40 mm40Var, kz20 kz20Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        kz20 kz20Var2;
        Function1 function2;
        function1.getClass();
        fetVar.g0(-684110097);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kz20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).d;
            lm6 lm6Var = kz20Var.m;
            boolean z = lm6Var != null && lm6Var.b;
            float f2 = lm6Var != null ? 12.0f : f;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.valueOf(z));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean z2 = lm6Var == null;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zH = fetVar.h(z) | fetVar.h(z2);
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                objP2 = new a220(z, z2, pz40Var, (yje) null);
                fetVar.o0(objP2);
            }
            m0x0.v(boolValueOf, boolValueOf2, (Function2) objP2, fetVar);
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
            boolean z3 = kz20Var.e;
            pzn pznVarA = kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3));
            alo aloVarA = kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3));
            ugd ugdVarM = u1c.M(1630628193, new eec0(f, lm6Var, pz40Var, kz20Var, f2, function1), fetVar);
            y5d y5dVar = y5d.f42040a;
            kz20Var2 = kz20Var;
            b34.e(y5dVar, z3, null, pznVarA, aloVarA, null, ugdVarM, fetVar, 1600518, 18);
            function2 = function1;
            b34.e(y5dVar, kz20Var2.g, null, kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(2038913162, new fz20(f, kz20Var2, function2), fetVar), fetVar, 1600518, 18);
            pz40 pz40Var2 = s6t0.f31722a;
            b34.e(y5dVar, kz20Var2.j != null, s5x0.L(i120.Q(jm40.b, s6t0.b().f33626a.getBackgroundContent(), jd8.n), f, 0.0f, 2), kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(-910299927, new gz20(kz20Var2, function2, (byte) 0), fetVar), fetVar, 1600518, 16);
            ugdVar.F(Long.valueOf(kz20Var2.c), fetVar, Integer.valueOf((i3 >> 6) & 112));
            fetVar.r(true);
        } else {
            kz20Var2 = kz20Var;
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hz20(mm40Var, kz20Var2, function2, ugdVar, i, (byte) 0);
        }
    }

    public static final void k(d280 d280Var, boolean z, fet fetVar, int i) {
        d280Var.getClass();
        fetVar.g0(750367923);
        byte b = 4;
        int i2 = (fetVar.g(d280Var) ? 4 : 2) | i | 16;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                z = pkd.d(fetVar);
            } else {
                fetVar.X();
            }
            int i3 = i2 & (-113);
            fetVar.s();
            w6n w6nVar = z ? w6n.i : w6n.k;
            zcl zclVar = qmk.f28987a;
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.S(jm40.b, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            boolean zE = fetVar.e(w6nVar.ordinal()) | ((i3 & 14) == 4);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new a540(w6nVar, d280Var, b);
                fetVar.o0(objP);
            }
            kkb.p(0, fetVar, mm40VarJ, (Function0) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20((Object) d280Var, z, i, (byte) 5);
        }
    }

    public static final void l(mm40 mm40Var, q5m q5mVar, fet fetVar, int i) {
        fetVar.g0(-1676939075);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(q5mVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 68.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40.b);
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
            fetVar.e0(-1393481114);
            Iterator it = CollectionsKt.D0(q5mVar.b, 3).iterator();
            while (it.hasNext()) {
                k((d280) it.next(), false, fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
            q(0, fetVar, null, q5mVar.f28157a);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var, q5mVar, i, (byte) 16);
        }
    }

    public static final void m(d280 d280Var, String str, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(1788838385);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(d280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 24.0f);
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
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            b = 1;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.m(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r5l0(d280Var, str, i, b);
        }
    }

    public static final void n(int i, long j, long j2, fet fetVar, d280 d280Var, d280 d280Var2, String str, String str2, String str3, String str4) {
        long j3;
        d280 d280Var3;
        long j4 = j2;
        String str5 = str3;
        String str6 = str4;
        fetVar.g0(-537116565);
        int i2 = i | (fetVar.g(d280Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(d280Var2) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str5) ? 16384 : 8192) | (fetVar.f(j) ? 131072 : 65536) | (fetVar.g(str6) ? 1048576 : 524288) | (fetVar.f(j4) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
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
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 52.0f), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
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
            d280Var3 = d280Var;
            m(d280Var3, str, fetVar, i2 & 126);
            m(d280Var2, str2, fetVar, (i2 >> 6) & 126);
            fetVar.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
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
            j3 = j;
            str5 = str3;
            y(str5, j3, fetVar, (i2 >> 12) & 126);
            j4 = j2;
            str6 = str4;
            y(str6, j4, fetVar, (i2 >> 18) & 126);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            j3 = j;
            d280Var3 = d280Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q5l0(d280Var3, str, d280Var2, str2, str5, j3, str6, j4, i, (byte) 1);
        }
    }

    public static final void o(mm40 mm40Var, qr90 qr90Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        function0.getClass();
        fetVar2.g0(2133611889);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(qr90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, null, null, false, null, function0, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.K(mm40VarW, 16.0f, 8.0f), "PHONE_CODE_ROW");
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_circle_keyboard, 0, fetVar2);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = m6m.e;
                fetVar2.o0(objP);
            }
            dww.a(pm80VarF, (n4d) objP, null, fetVar2, 392, 8);
            String str = qr90Var.f29199a;
            y9q0 y9q0Var = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var2, (Object) qr90Var, (Object) function0, i, (byte) 21);
        }
    }

    public static final void p(mm40 mm40Var, u180 u180Var, boolean z, fet fetVar, int i) {
        k6z k6zVar = (k6z) fetVar.k(bmd.n);
        if (u180Var instanceof q180) {
            fetVar.e0(-1835140572);
            m8x.q(mm40Var, (q180) u180Var, z, k6zVar, fetVar, i & 1022);
            fetVar.r(false);
            return;
        }
        if (u180Var instanceof r180) {
            fetVar.e0(1049189405);
            tfx.g(mm40Var, (r180) u180Var, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (u180Var instanceof s180) {
            fetVar.e0(-1834741912);
            zcl zclVar = qmk.f28987a;
            s7n0.f(s5x0.L(mm40Var, 0.0f, 2.0f, 1), (s180) u180Var, z, k6zVar, fetVar, i & 1008);
            fetVar.r(false);
            return;
        }
        if (u180Var instanceof t180) {
            fetVar.e0(-1834438453);
            zcl zclVar2 = qmk.f28987a;
            egm0.d(s5x0.L(mm40Var, 0.0f, 2.0f, 1), (t180) u180Var, z, k6zVar, fetVar, i & 1008);
            fetVar.r(false);
            return;
        }
        if (u180Var instanceof o180) {
            fetVar.e0(1049212697);
            tlb.d(mm40Var, (o180) u180Var, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!u180Var.equals(p180.f26188a)) {
                throw b1j.f(1049179325, fetVar, false);
            }
            fetVar.e0(1049216054);
            fetVar.r(false);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1651151314);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, jM123getWhite0d7_KjU, new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.m(), fetVar2, ((i2 >> 3) & 14) | 48, 24960, 109552);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str2, i, (byte) 5);
        }
    }

    public static final void r(mm40 mm40Var, rx80 rx80Var, qdz qdzVar, boolean z, Function1 function1, Function2 function2, fet fetVar, int i) {
        int i2;
        boolean z2;
        Function1 function3;
        boolean z3;
        fet fetVar2 = fetVar;
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(11746459);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(rx80Var) : fetVar2.i(rx80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(qdzVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= fetVar2.h(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            function3 = function1;
            i2 |= fetVar2.i(function3) ? 16384 : 8192;
        } else {
            function3 = function1;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            boolean z4 = rx80Var instanceof px80;
            jm40 jm40Var = jm40.b;
            if (z4) {
                fetVar2.e0(-1975565189);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                px80 px80Var = (px80) rx80Var;
                t9x.l(o2e.e0(s5x0.L(mm40VarD2, 8.0f, 0.0f, 2), "PARTNER_BOTTOM_INFO_TEXT"), px80Var.f27741a, fetVar2, 0);
                d9x.n(o2e.e0(s5x0.N(o7k0.d(jm40Var, 1.0f), 8.0f, 8.0f, 8.0f, 0.0f, 8), "PARTNER_BOTTOM_INFO_ANOUNCE"), px80Var.b, z2, function3, fetVar2, (i3 >> 3) & 8064);
                fetVar2 = fetVar;
                k9x.k(null, px80Var.c, qdzVar, function2, fetVar2, (i3 & 896) | ((i3 >> 6) & 7168));
                fetVar2.r(false);
                z3 = true;
            } else {
                if (!rx80Var.equals(qx80.f29470a)) {
                    throw b1j.f(351912618, fetVar2, false);
                }
                fetVar2.e0(-1974556821);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(o7k0.e(mm40VarD3, 182.0f), 8.0f);
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                z3 = true;
                h97.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarJ), vbc.d0(null, fetVar2, 0, 1), fetVar2, false);
            }
            fetVar2.r(z3);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var, (Object) rx80Var, (Object) qdzVar, z, function1, (wdr) function2, i, (byte) 21);
        }
    }

    public static final void s(n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(-1416077416);
        int i2 = (fetVar.g(n0xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            uc9.c(lgb.J(o7k0.p(jm40Var, 32.0f, 32.0f), vgg0.a(8.0f)), o7k0.n(jm40Var, 24.0f), n0xVar, Integer.valueOf(R.drawable.ic_glyph_placeholder_player), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), null, null, gqw0.B, dyb.g0(new bef()), fetVar, ((i2 << 6) & 896) | 113246208, 96);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, (byte) 7);
        }
    }

    public static final void t(final my90 my90Var, final mm40 mm40Var, final int i, fet fetVar, final int i2) {
        fetVar.g0(12998269);
        int i3 = (fetVar.i(my90Var) ? 4 : 2) | i2 | (fetVar.g(mm40Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            cl5 cl5Var = ukd.f35823a;
            if (i == 1) {
                fetVar.e0(684642547);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.e(null);
                    fetVar.o0(objP);
                }
                pz40 pz40Var = (pz40) objP;
                Object objP2 = fetVar.P();
                byte b = 26;
                if (objP2 == cl5Var) {
                    objP2 = new y9v(pz40Var, b);
                    fetVar.o0(objP2);
                }
                Function1 function1 = (Function1) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                    fetVar.o0(objP3);
                }
                vne vneVar = (vne) objP3;
                boolean zI = fetVar.i(vneVar);
                Object objP4 = fetVar.P();
                if (zI || objP4 == cl5Var) {
                    objP4 = new ka70(vneVar, pz40Var, b);
                    fetVar.o0(objP4);
                }
                Function1 function2 = (Function1) objP4;
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = kba0.f18005a;
                    fetVar.o0(objP5);
                }
                Function2 function3 = (Function2) ((jhy) objP5);
                Object objP6 = fetVar.P();
                if (objP6 == cl5Var) {
                    objP6 = lba0.f19746a;
                    fetVar.o0(objP6);
                }
                u(my90Var, mm40Var, function1, function3, (Function2) ((jhy) objP6), function2, fetVar, (i3 & 14) | 28032 | (i3 & 112), 0);
                fetVar.r(false);
            } else {
                if (i != 2) {
                    fetVar.e0(-393496186);
                    fetVar.r(false);
                    jf4.o(twn.m(i, "Unrecognized surface type: "));
                    return;
                }
                fetVar.e0(-393503123);
                Object objP7 = fetVar.P();
                if (objP7 == cl5Var) {
                    objP7 = mba0.f21498a;
                    fetVar.o0(objP7);
                }
                Function1 function4 = (Function1) ((jhy) objP7);
                Object objP8 = fetVar.P();
                if (objP8 == cl5Var) {
                    objP8 = nba0.f23232a;
                    fetVar.o0(objP8);
                }
                Function2 function5 = (Function2) ((jhy) objP8);
                Object objP9 = fetVar.P();
                if (objP9 == cl5Var) {
                    objP9 = oba0.f24970a;
                    fetVar.o0(objP9);
                }
                u(my90Var, mm40Var, function4, function5, (Function2) ((jhy) objP9), null, fetVar, (i3 & 14) | 28032 | (i3 & 112), 32);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.jba0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    e9x.t(my90Var, mm40Var, i, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0190  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0144  */
    /* JADX WARN: Code duplicated, block: B:91:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173  */
    /* JADX WARN: Code duplicated, block: B:95:0x0176  */
    /* JADX WARN: Code duplicated, block: B:99:0x017f  */
    public static final void u(my90 my90Var, mm40 mm40Var, Function1 function1, Function2 function2, Function2 function3, Function1 function4, fet fetVar, int i, int i2) {
        int i3;
        Object obj;
        Function1 function5;
        boolean z;
        Function1 function6;
        yfe0 yfe0VarU;
        cl5 cl5Var;
        Function1 function7;
        Object objP;
        pz40 pz40Var;
        boolean z2;
        Object objP2;
        Object objP3;
        Object objP4;
        Function1 function8;
        View view;
        boolean z3;
        boolean zI;
        Object objP5;
        boolean z4;
        boolean z5;
        Object objP6;
        boolean z6;
        View view2;
        Object objP7;
        fetVar.g0(25948461);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(my90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            obj = function2;
            i3 |= fetVar.i(obj) ? 2048 : 1024;
        } else {
            obj = function2;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.i(function3) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                function5 = function4;
                i3 |= fetVar.i(function5) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                cl5Var = ukd.f35823a;
                if (i4 != 0) {
                    objP7 = fetVar.P();
                    if (objP7 == cl5Var) {
                        objP7 = new er90((byte) 17);
                        fetVar.o0(objP7);
                    }
                    function7 = (Function1) objP7;
                } else {
                    function7 = function5;
                }
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.e(null);
                    fetVar.o0(objP);
                }
                pz40Var = (pz40) objP;
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new hs80(function1, (byte) 21);
                    fetVar.o0(objP2);
                }
                Function1 function9 = (Function1) objP2;
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = new er90((byte) 18);
                    fetVar.o0(objP3);
                }
                Function1 function10 = (Function1) objP3;
                objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = new y9v(pz40Var, (byte) 27);
                    fetVar.o0(objP4);
                }
                function8 = function7;
                dwi0.c(function9, mm40Var, function10, null, (Function1) objP4, fetVar, (i3 & 112) | 24960, 8);
                view = (View) pz40Var.getValue();
                if (view == null) {
                    fetVar.e0(-63030198);
                    fetVar.r(false);
                    function8 = function8;
                } else {
                    fetVar.e0(-63030197);
                    boolean zI2 = fetVar.i(my90Var);
                    if ((458752 & i3) == 131072) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zI = zI2 | z3 | fetVar.i(view);
                    objP5 = fetVar.P();
                    if (zI || objP5 == cl5Var) {
                        objP5 = new jl40((Object) my90Var, (Object) function8, (Object) view, (byte) 26);
                        fetVar.o0(objP5);
                    }
                    m0x0.n(view, my90Var, (Function1) objP5, fetVar);
                    boolean zI3 = fetVar.i(my90Var) | fetVar.i(view);
                    if ((57344 & i3) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zI3 | z4 | ((i3 & 7168) == 2048);
                    objP6 = fetVar.P();
                    if (!z5 || objP6 == cl5Var) {
                        z6 = false;
                        view2 = view;
                        wmq wmqVar = new wmq((Object) my90Var, (Object) view2, obj, (Object) function3, (yje) null, (byte) 18);
                        fetVar.o0(wmqVar);
                        objP6 = wmqVar;
                    } else {
                        view2 = view;
                        z6 = false;
                    }
                    m0x0.v(view2, my90Var, (Function2) objP6, fetVar);
                    fetVar.r(z6);
                }
                function6 = function8;
            } else {
                fetVar.X();
                function6 = function5;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(my90Var, mm40Var, function1, function2, function3, function6, i, i2, (byte) 4);
            }
        }
        i3 |= 196608;
        function5 = function4;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            cl5Var = ukd.f35823a;
            if (i4 != 0) {
                objP7 = fetVar.P();
                if (objP7 == cl5Var) {
                    objP7 = new er90((byte) 17);
                    fetVar.o0(objP7);
                }
                function7 = (Function1) objP7;
            } else {
                function7 = function5;
            }
            objP = fetVar.P();
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40Var = (pz40) objP;
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar.P();
            if (z2) {
                objP2 = new hs80(function1, (byte) 21);
                fetVar.o0(objP2);
            } else {
                objP2 = new hs80(function1, (byte) 21);
                fetVar.o0(objP2);
            }
            Function1 function11 = (Function1) objP2;
            objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new er90((byte) 18);
                fetVar.o0(objP3);
            }
            Function1 function12 = (Function1) objP3;
            objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new y9v(pz40Var, (byte) 27);
                fetVar.o0(objP4);
            }
            function8 = function7;
            dwi0.c(function11, mm40Var, function12, null, (Function1) objP4, fetVar, (i3 & 112) | 24960, 8);
            view = (View) pz40Var.getValue();
            if (view == null) {
                fetVar.e0(-63030198);
                fetVar.r(false);
                function8 = function8;
            } else {
                fetVar.e0(-63030197);
                boolean zI4 = fetVar.i(my90Var);
                if ((458752 & i3) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zI = zI4 | z3 | fetVar.i(view);
                objP5 = fetVar.P();
                if (zI) {
                    objP5 = new jl40((Object) my90Var, (Object) function8, (Object) view, (byte) 26);
                    fetVar.o0(objP5);
                } else {
                    objP5 = new jl40((Object) my90Var, (Object) function8, (Object) view, (byte) 26);
                    fetVar.o0(objP5);
                }
                m0x0.n(view, my90Var, (Function1) objP5, fetVar);
                boolean zI5 = fetVar.i(my90Var) | fetVar.i(view);
                if ((57344 & i3) == 16384) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zI5 | z4 | ((i3 & 7168) == 2048);
                objP6 = fetVar.P();
                if (z5) {
                    z6 = false;
                    view2 = view;
                    wmq wmqVar2 = new wmq((Object) my90Var, (Object) view2, obj, (Object) function3, (yje) null, (byte) 18);
                    fetVar.o0(wmqVar2);
                    objP6 = wmqVar2;
                } else {
                    z6 = false;
                    view2 = view;
                    wmq wmqVar3 = new wmq((Object) my90Var, (Object) view2, obj, (Object) function3, (yje) null, (byte) 18);
                    fetVar.o0(wmqVar3);
                    objP6 = wmqVar3;
                }
                m0x0.v(view2, my90Var, (Function2) objP6, fetVar);
                fetVar.r(z6);
            }
            function6 = function8;
        } else {
            fetVar.X();
            function6 = function5;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hjl(my90Var, mm40Var, function1, function2, function3, function6, i, i2, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x023f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0241  */
    /* JADX WARN: Code duplicated, block: B:54:0x024c  */
    /* JADX WARN: Code duplicated, block: B:57:0x026c  */
    /* JADX WARN: Code duplicated, block: B:59:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x02fc  */
    public static final void v(rx6 rx6Var, wul wulVar, Function1 function1, Function0 function0, fet fetVar, int i) {
        long inputBackground60;
        cl5 cl5Var;
        boolean z;
        Object objP;
        boolean z2;
        long secondary;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1385506260);
        int i2 = i | (fetVar2.g(rx6Var) ? 4 : 2) | (fetVar2.g(wulVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP2 == cl5Var2) {
                objP2 = new qgx((byte) 19);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) Q(objArr, (Function0) objP2, fetVar2, 48);
            ux6 ux6Var = rx6Var.f31248a;
            kx6 kx6Var = rx6Var.c;
            pz40 pz40Var2 = ux6Var.f36426a;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
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
            a8q0 a8q0Var = (a8q0) pz40Var2.getValue();
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarJ = g1t0.j();
            zfn zfnVar2 = zaq0.b;
            y9q0 y9q0VarA = y9q0.a(y9q0VarJ, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 5, 0, 0L, null, null, 16744446);
            skk0 skk0Var = new skk0(((ThemeColors) fetVar2.k(zfnVar2)).getPrimary());
            uly ulyVar = new uly(0, null, 9, 0, 123);
            x7z x7zVar = new x7z(1.0f, true);
            if (m5y.f21239a[kx6Var.ordinal()] == 1) {
                fetVar2.e0(358155674);
                inputBackground60 = ((ThemeColors) fetVar2.k(zfnVar2)).getWarningTint();
                fetVar2.r(false);
            } else {
                fetVar2.e0(358157152);
                inputBackground60 = ((ThemeColors) fetVar2.k(zfnVar2)).getInputBackground60();
                fetVar2.r(false);
            }
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(x7zVar, inputBackground60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean zG = fetVar2.g(pz40Var);
            Object objP3 = fetVar2.P();
            if (zG) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP3 == cl5Var) {
                }
                cl5 cl5Var3 = cl5Var;
                z96.a(a8q0Var, function1, s5x0.K(j120.b0(mm40VarQ, (Function1) objP3), 12.0f, 12.0f), false, false, y9q0VarA, ulyVar, null, true, 0, 0, null, null, null, skk0Var, u1c.M(1225966403, new rgh(pz40Var2, rx6Var, (byte) 27), fetVar2), fetVar, ((i2 >> 3) & 112) | 102236160, 196608, 16024);
                mm40 mm40VarH = phu0.H(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), null, 1);
                if ((i2 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var3) {
                    objP = new dbn(function0, (byte) 22);
                    fetVar.o0(objP);
                }
                qzb.n(mm40VarH, wulVar, (Function0) objP, fetVar, i2 & 112, 0);
                fetVar.r(true);
                if (rx6Var.b.length() > 0) {
                    fetVar.e0(-1633603441);
                    String str = rx6Var.b;
                    mm40 mm40VarL2 = s5x0.L(s5x0.N(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 0.0f, 2);
                    ((g1t0) fetVar.k(zfnVar)).getClass();
                    y9q0 y9q0VarG = g1t0.g();
                    if (kx6Var == kx6.b) {
                        fetVar.e0(224410857);
                        secondary = ((ThemeColors) fetVar.k(zfnVar2)).getWarning();
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar.e0(224411851);
                        secondary = ((ThemeColors) fetVar.k(zfnVar2)).getSecondary();
                    }
                    fetVar.r(z2);
                    v8q0.a(str, mm40VarL2, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 110584);
                    fetVar2 = fetVar;
                    fetVar2.r(z2);
                } else {
                    fetVar.e0(-1633046154);
                    wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(true);
            }
            objP3 = new y9v(pz40Var, (byte) 5);
            fetVar2.o0(objP3);
            cl5 cl5Var4 = cl5Var;
            z96.a(a8q0Var, function1, s5x0.K(j120.b0(mm40VarQ, (Function1) objP3), 12.0f, 12.0f), false, false, y9q0VarA, ulyVar, null, true, 0, 0, null, null, null, skk0Var, u1c.M(1225966403, new rgh(pz40Var2, rx6Var, (byte) 27), fetVar2), fetVar, ((i2 >> 3) & 112) | 102236160, 196608, 16024);
            mm40 mm40VarH2 = phu0.H(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), null, 1);
            if ((i2 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                objP = new dbn(function0, (byte) 22);
                fetVar.o0(objP);
            } else {
                objP = new dbn(function0, (byte) 22);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarH2, wulVar, (Function0) objP, fetVar, i2 & 112, 0);
            fetVar.r(true);
            if (rx6Var.b.length() > 0) {
                fetVar.e0(-1633603441);
                String str2 = rx6Var.b;
                mm40 mm40VarL3 = s5x0.L(s5x0.N(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f, 0.0f, 2);
                ((g1t0) fetVar.k(zfnVar)).getClass();
                y9q0 y9q0VarG2 = g1t0.g();
                if (kx6Var == kx6.b) {
                    fetVar.e0(224410857);
                    secondary = ((ThemeColors) fetVar.k(zfnVar2)).getWarning();
                    z2 = false;
                } else {
                    z2 = false;
                    fetVar.e0(224411851);
                    secondary = ((ThemeColors) fetVar.k(zfnVar2)).getSecondary();
                }
                fetVar.r(z2);
                v8q0.a(str2, mm40VarL3, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG2, fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(z2);
            } else {
                fetVar.e0(-1633046154);
                wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((Object) rx6Var, (Object) wulVar, function1, (wdr) function0, i, (byte) 10);
        }
    }

    public static final void w(mm40 mm40Var, r5d0 r5d0Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        r5d0Var.getClass();
        fetVar2.g0(-1042434838);
        int i2 = i | 6 | (fetVar2.g(r5d0Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(16.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(jm40Var, ugg0VarA);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarJ2 = s5x0.J(i120.S(mm40VarJ, 2.0f, s6t0.b().f33626a.getPrimary(), vgg0.a(16.0f)), 2.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = mu90.e;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ2);
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
            jpm0.o(fetVar2, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            k7x.b(r5d0Var.b.a(), null, ny9.O(2.0f, jm40Var, false), a8k0.F(R.drawable.ic_aggregator_placeholder, 0, fetVar2), a8k0.F(R.drawable.ic_aggregator_placeholder, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar, 37296, 6, 31712);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP2;
            boolean z2 = (i2 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new l3c0(function0, (byte) 4);
                fetVar.o0(objP3);
            }
            mm40Var2 = jm40Var;
            mm40 mm40VarL = s5x0.L(y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP3, 28), 8.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar), null, i120.Q(lgb.J(o7k0.n(mm40Var2, 18.0f), vgg0.f37379a), s6t0.b().f33626a.getPrimary(), jd8.n), s6t0.b().f33626a.getBackgroundContent(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, r5d0Var, function0, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x013f  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:66:0x0186  */
    /* JADX WARN: Code duplicated, block: B:69:0x0192  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void x(mm40 mm40Var, hgg0 hgg0Var, qdz qdzVar, Function1 function1, fet fetVar, int i, int i2) {
        Function1 function2;
        boolean z;
        mm40 mm40Var2;
        Function1 function3;
        yfe0 yfe0VarU;
        cl5 cl5Var;
        xcz xczVarB;
        Function1 function4;
        yje yjeVar;
        int i3;
        boolean z2;
        boolean zG;
        Object objP;
        boolean z3;
        boolean z4;
        Object objP2;
        Object objP3;
        hgg0Var.getClass();
        a4x a4xVar = hgg0Var.c;
        qdzVar.getClass();
        fetVar.g0(-1097810681);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= fetVar.g(hgg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function2 = function1;
                i4 |= fetVar.i(function2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                cl5Var = ukd.f35823a;
                if (i5 != 0) {
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new wtf0((byte) 18);
                        fetVar.o0(objP3);
                    }
                    function2 = (Function1) objP3;
                }
                xczVarB = qdzVar.b("STATISTIC_ROUND_STAT", new vtf0((byte) 15), fetVar, i4 & 896);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 96.0f);
                function4 = function2;
                long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 8.0f, 0.0f, 8.0f, 4);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
                k9x.s(0, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), hgg0Var.f13017a, hgg0Var.b);
                yjeVar = null;
                c9x.j(null, a4xVar, xczVarB, fetVar, 64);
                fetVar.r(true);
                Boolean boolValueOf = Boolean.valueOf(hgg0Var.d);
                i3 = i4 & 112;
                if (i3 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zG = z2 | fetVar.g(xczVarB);
                objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new k6d0((Object) hgg0Var, (Object) xczVarB, yjeVar, (byte) 20);
                    fetVar.o0(objP);
                }
                m0x0.t(fetVar, boolValueOf, (Function2) objP);
                Integer numValueOf = Integer.valueOf(a4xVar.size());
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | (i3 == 32);
                objP2 = fetVar.P();
                if (!z4 || objP2 == cl5Var) {
                    function2 = function4;
                    objP2 = new tye0(function2, hgg0Var, yjeVar, (byte) 15);
                    fetVar.o0(objP2);
                } else {
                    function2 = function4;
                }
                m0x0.t(fetVar, numValueOf, (Function2) objP2);
                mm40Var2 = jm40Var;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
            }
            function3 = function2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g13((byte) 6, i, i2, mm40Var2, hgg0Var, qdzVar, function3);
            }
        }
        i4 |= 3072;
        function2 = function1;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            cl5Var = ukd.f35823a;
            if (i5 != 0) {
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = new wtf0((byte) 18);
                    fetVar.o0(objP3);
                }
                function2 = (Function1) objP3;
            }
            xczVarB = qdzVar.b("STATISTIC_ROUND_STAT", new vtf0((byte) 15), fetVar, i4 & 896);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarD2, 96.0f);
            function4 = function2;
            long jM73getBlack400d7_KjU2 = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar4 = qmk.i;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarN2 = s5x0.N(i120.Q(mm40VarE2, jM73getBlack400d7_KjU2, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 8.0f, 8.0f, 0.0f, 8.0f, 4);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
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
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            k9x.s(0, fetVar, s5x0.N(jm40Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), hgg0Var.f13017a, hgg0Var.b);
            yjeVar = null;
            c9x.j(null, a4xVar, xczVarB, fetVar, 64);
            fetVar.r(true);
            Boolean boolValueOf2 = Boolean.valueOf(hgg0Var.d);
            i3 = i4 & 112;
            if (i3 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            zG = z2 | fetVar.g(xczVarB);
            objP = fetVar.P();
            if (zG) {
                objP = new k6d0((Object) hgg0Var, (Object) xczVarB, yjeVar, (byte) 20);
                fetVar.o0(objP);
            } else {
                objP = new k6d0((Object) hgg0Var, (Object) xczVarB, yjeVar, (byte) 20);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) objP);
            Integer numValueOf2 = Integer.valueOf(a4xVar.size());
            if ((i4 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | (i3 == 32);
            objP2 = fetVar.P();
            if (z4) {
                function2 = function4;
                objP2 = new tye0(function2, hgg0Var, yjeVar, (byte) 15);
                fetVar.o0(objP2);
            } else {
                function2 = function4;
                objP2 = new tye0(function2, hgg0Var, yjeVar, (byte) 15);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, numValueOf2, (Function2) objP2);
            mm40Var2 = jm40Var2;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        function3 = function2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g13((byte) 6, i, i2, mm40Var2, hgg0Var, qdzVar, function3);
        }
    }

    public static final void y(String str, long j, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1625663550);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, o7k0.u(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 144.0f, 1), j, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar2, (i2 & 14) | ((i2 << 3) & 896), 24960, 110576);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w9m(str, j, i, (byte) 3);
        }
    }

    public static final void z(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-2075695334);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var = jm40Var;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 12.0f, 10.0f);
            nw3 nw3Var = uc9.g;
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(nw3Var, gqw0.m, fetVar, 6);
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
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            azw.t(new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), null, xf0.m, fetVar, 384);
            qxw.o(fetVar, o7k0.e(jm40Var, 16.0f));
            azw.t(new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), null, xf0.n, fetVar, 384);
            fetVar.r(true);
            zcl zclVar3 = qmk.m;
            azw.t(new ugg0(zclVar3, zclVar3, zclVar3, zclVar3), null, xf0.o, fetVar, 384);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 15);
        }
    }
}
