package a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
public abstract class unh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile vnh0 f35961a;
    public static final ugd b = new ugd(-1879159631, false, new bhd(3));
    public static final ugd c = new ugd(-379103248, false, new fhd(4));
    public static final ugd d = new ugd(-1900597484, false, new jhd(27));
    public static final ugd e = new ugd(783864805, false, new qhd(15));
    public static final Object f = new Object();
    public static volatile c44 g;

    public static final void A(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1060127750);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new to6(function1, (byte) 23);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, b2);
        }
    }

    public static final void B(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1099680648);
        byte b2 = 2;
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new afd(function1, b3);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, b2);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(2618031);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            hkb.k(i2 & 112, 0, fetVar, s5x0.L(jm40Var, f2, 0.0f, 2), str);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str, i, (byte) 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(final h000 h000Var, final Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        y3d y3dVar;
        final byte b2;
        yjj0 yjj0VarA;
        boolean z;
        y3d y3dVar2;
        fet fetVar3 = fetVar;
        ljc ljcVar = jd8.n;
        fetVar3.g0(-999619763);
        int i2 = (fetVar3.g(h000Var) ? 4 : 2) | i | (fetVar3.i(function1) ? 32 : 16);
        final byte b3 = 0;
        if (fetVar3.U(i2 & 1, (i2 & 19) != 18)) {
            sy syVar = h000Var.f;
            wui0 wui0Var = h000Var.e;
            d4d d4dVar = h000Var.c;
            jm40 jm40Var = jm40.b;
            Object obj = ukd.f35823a;
            if (syVar == null) {
                fetVar3.e0(1631021531);
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar3).d, 0.0f, 2);
                String str = h000Var.d;
                String str2 = h000Var.b;
                if (d4dVar == null) {
                    fetVar3.e0(1631381037);
                    fetVar3.r(false);
                    y3dVar2 = null;
                } else {
                    fetVar3.e0(1438098516);
                    long jY = ibc.Y(d4dVar, fetVar3);
                    fetVar3.r(false);
                    y3dVar2 = new y3d(jY);
                }
                rqm rqmVar = new rqm((vui0) new rui0(str, y3dVar2, str2, null, 56), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objP = fetVar3.P();
                if (z2 || objP == obj) {
                    objP = new Function0() { // from class: a.y000
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            h000 h000Var2 = h000Var;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new szz(h000Var2.f12209a));
                                    break;
                                default:
                                    function2.invoke(new szz(h000Var2.f12209a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar3.o0(objP);
                }
                obc.q(mm40VarL, rqmVar, true, null, (Function0) objP, null, null, null, fetVar, 384, 232);
                fet fetVar4 = fetVar;
                fetVar4.r(false);
                fetVar2 = fetVar4;
            } else {
                fetVar3.e0(1631692433);
                mm40 mm40VarL2 = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar3).d, 0.0f, 2);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                int iHashCode = Long.hashCode(fetVar3.T);
                bh90 bh90VarM = fetVar3.m();
                mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarL2);
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
                String str3 = h000Var.d;
                String str4 = h000Var.b;
                if (d4dVar == null) {
                    fetVar3.e0(1023179027);
                    fetVar3.r(false);
                    y3dVar = null;
                } else {
                    fetVar3.e0(-1075372882);
                    long jY2 = ibc.Y(d4dVar, fetVar3);
                    fetVar3.r(false);
                    y3dVar = new y3d(jY2);
                }
                rqm rqmVar2 = new rqm((vui0) new rui0(str3, y3dVar, str4, null, 56), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                boolean z3 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objP2 = fetVar3.P();
                if (z3 || objP2 == obj) {
                    b2 = 1;
                    objP2 = new Function0() { // from class: a.y000
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b2;
                            h000 h000Var2 = h000Var;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new szz(h000Var2.f12209a));
                                    break;
                                default:
                                    function2.invoke(new szz(h000Var2.f12209a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar3.o0(objP2);
                } else {
                    b2 = 1;
                }
                boolean z4 = b2;
                obc.q(null, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar3, 384, 233);
                fet fetVar5 = fetVar3;
                androidx.compose.runtime.d dVar = zaq0.b;
                long backgroundContent = ((ThemeColors) fetVar5.k(dVar)).getBackgroundContent();
                int iOrdinal = syVar.b.ordinal();
                if (iOrdinal == 0) {
                    zcl zclVar = qmk.f28987a;
                    yjj0VarA = vgg0.a(16.0f);
                } else if (iOrdinal == z4) {
                    zcl zclVar2 = qmk.f28987a;
                    yjj0VarA = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                } else if (iOrdinal == 2) {
                    yjj0VarA = ljcVar;
                } else if (iOrdinal != 3) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    yjj0VarA = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                }
                mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, yjj0VarA);
                zcl zclVar4 = qmk.f28987a;
                H(s5x0.N(mm40VarQ, 16.0f, 0.0f, 16.0f, 12.0f, 2), syVar.f33001a, d4d.SECONDARY, d4d.BACKGROUND, fetVar5, 0);
                if (syVar.b != wui0.d) {
                    fetVar5.e0(1024130077);
                    jcb.v(s5x0.N(i120.Q(jm40Var, ((ThemeColors) fetVar5.k(dVar)).getBackgroundContent(), ljcVar), 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f, ((ThemeColors) fetVar5.k(dVar)).getSeparator(), fetVar5, 0, 0);
                    z = false;
                    fetVar5.r(false);
                } else {
                    z = false;
                    fetVar5.e0(1024466427);
                    fetVar5.r(false);
                }
                fetVar5.r(z4);
                fetVar5.r(z);
                fetVar2 = fetVar5;
            }
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(h000Var, function1, i, (byte) 18);
        }
    }

    public static final void E(yaa yaaVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(121769670);
        int i2 = i | (fetVar2.g(yaaVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                String str = yaaVar.i;
                Object objE = j1t0.f15753a;
                context.getClass();
                str.getClass();
                objE.getClass();
                if (str.length() != 0) {
                    try {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(new File(context.getCacheDir(), str));
                        typefaceCreateFromFile.getClass();
                        objE = lv00.E(typefaceCreateFromFile);
                    } catch (Exception unused) {
                    }
                }
                objP = objE;
                fetVar2.o0(objP);
            }
            nrq nrqVar = (nrq) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "CARD_BASKETBALL_GAME_BOARD");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40VarE0, 156.0f), 42.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            n0q n0qVar = o7k0.c;
            String str2 = yaaVar.h;
            wnq0 wnq0Var = yaaVar.g;
            k7x.a(str2, null, n0qVar, null, null, fetVar, 432, 2040);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
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
            f0(o7k0.s(jm40Var, 36.0f), yaaVar.f42284a, yaaVar.c, nrqVar, "CARD_BASKETBALL_FIRST_PLAYER_TITLE", "CARD_BASKETBALL_FIRST_PLAYER_SCORE", fetVar, 224256);
            long jW0 = ibc.w0(wnq0Var.b, bfn.MILLISECONDS);
            uen uenVar = wen.b;
            bfn bfnVar = bfn.SECONDS;
            yhh.a(wen.l(jW0, bfnVar), !wnq0Var.c, ibc.v0(wnq0Var.d, bfnVar), wnq0Var.e, u1c.M(-1141133231, new rgh(yaaVar, nrqVar, (byte) 17), fetVar), fetVar, 24576, 0);
            fetVar2 = fetVar;
            f0(o7k0.s(jm40Var, 36.0f), yaaVar.d, yaaVar.f, nrqVar, "CARD_BASKETBALL_SECOND_PLAYER_TITLE", "CARD_BASKETBALL_SECOND_PLAYER_SCORE", fetVar2, 224256);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rqr(yaaVar, i, (byte) 0);
        }
    }

    public static final void F(mm40 mm40Var, hjm hjmVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1465777244);
        int i2 = i | 6 | (fetVar.g(hjmVar) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar).e;
            mm40Var2 = jm40.b;
            nkb.h(s5x0.N(mm40Var2, f2, 16.0f, 0.0f, 0.0f, 12), hjmVar, kjm.b, null, null, null, fetVar, (i2 & 112) | 384, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iak0(mm40Var2, hjmVar, i, b2);
        }
    }

    public static final void G(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2;
        String str4;
        fetVar.g0(775468727);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zW = StringsKt.W(str2);
            jm40 jm40Var = jm40.b;
            if (zW) {
                fetVar.e0(-639609670);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                str4 = str2;
                str3 = str;
                fetVar2 = fetVar;
                nkb.h(s5x0.L(s5x0.N(mm40VarD, 16.0f, 4.0f, 0.0f, 0.0f, 12), xfn.a(fetVar).d, 0.0f, 2), new hjm(str, new ojm(127), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8184), kjm.b, null, null, null, fetVar2, 384, 56);
                fetVar2.r(false);
            } else {
                fetVar.e0(-640136515);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD2);
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
                zcl zclVar2 = qmk.f28987a;
                fetVar2 = fetVar;
                nkb.h(s5x0.N(jm40Var, 16.0f, 4.0f, 0.0f, 0.0f, 12), new hjm(str, null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjm.b, null, null, null, fetVar2, 384, 56);
                x(i2 & 112, fetVar2, s5x0.L(jm40Var, xfn.a(fetVar2).d, 0.0f, 2), str2);
                fetVar2.r(true);
                fetVar2.r(false);
                str3 = str;
                str4 = str2;
            }
        } else {
            str3 = str;
            fetVar2 = fetVar;
            str4 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 14, i, str3, str4);
        }
    }

    public static final void H(mm40 mm40Var, String str, d4d d4dVar, d4d d4dVar2, fet fetVar, int i) {
        d4d d4dVar3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-175935347);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.e(d4dVar.ordinal()) ? 256 : 128) | (fetVar2.e(d4dVar2.ordinal()) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long jY = ibc.Y(d4dVar2, fetVar);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, jY, new ugg0(zclVar, zclVar, zclVar, zclVar));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            d4dVar3 = d4dVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, s5x0.M(jm40Var, 12.0f, 12.0f, 8.0f, 12.0f), ibc.Y(d4dVar3, fetVar2), fetVar2, 56, 0);
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 10.0f, 16.0f, 10.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarM, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i2 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            d4dVar3 = d4dVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 16, i, (Object) mm40Var, (Object) str, (Object) d4dVar3, (Object) d4dVar2);
        }
    }

    public static final void I(Function0 function0, xcz xczVar, Function1 function1, a4x a4xVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1404946158);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.g(a4xVar) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarL = s5x0.L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2);
            mw3 mw3Var = uc9.c;
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o74(a4xVar, function0, function1);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, xczVar, null, mw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 112) | 24576, 492);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pr9(function0, xczVar, function1, a4xVar, i);
        }
    }

    public static final void J(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(600934570);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (((h100) l7m0Var.getValue()).h) {
            fetVar.e0(1018306577);
            h(((h100) l7m0Var.getValue()).i, function1, fetVar, i2 & 112);
            fetVar.r(false);
        } else {
            fetVar.e0(1018236889);
            p(l7m0Var, function1, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, b2);
        }
    }

    public static final void K(int i, fet fetVar) {
        fetVar.g0(-1982500446);
        byte b2 = 1;
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new jtz((byte) 5);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyz(i, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v11, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v12, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v14, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v16, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v9, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void L(mm40 mm40Var, cmm cmmVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        ?? r10;
        shd shdVar;
        pcy pcyVar;
        cl5 cl5Var;
        shd shdVar2;
        shd shdVar3;
        jm40 jm40Var;
        ?? r0;
        ?? r4;
        ?? r11;
        jm40 jm40Var2;
        ?? r12;
        byte b2;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.B;
        fetVar2.g0(310494144);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(cmmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar6);
            jpm0.n(fetVar2);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar7);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar4);
            jpm0.o(fetVar, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar, shdVar6, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar7);
            sd sdVar = cmmVar.e;
            bmm bmmVar = cmmVar.b;
            cl5 cl5Var2 = ukd.f35823a;
            jm40 jm40Var3 = jm40.b;
            jr8 jr8Var = jr8.f16991a;
            if (sdVar != null) {
                fetVar.e0(-498281881);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE2 = jr8Var.b(s5x0.N(jm40Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14), gqw0.d).e(function2 != null ? ro4.d0(jm40Var3, function2) : jm40Var3);
                ee eeVar = cmmVar.d;
                sd sdVar2 = cmmVar.e;
                boolean z2 = (i2 & 896) == 256;
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var2) {
                    b2 = 0;
                    objP = new ylm(function1, b2);
                    fetVar.o0(objP);
                } else {
                    b2 = 0;
                }
                Function0 function0 = (Function0) objP;
                shdVar2 = shdVar5;
                shdVar = shdVar4;
                shdVar3 = shdVar7;
                pcyVar = pcyVar2;
                cl5Var = cl5Var2;
                jm40Var = jm40Var3;
                ?? r5 = b2;
                r0 = 1;
                jcb.f(mm40VarE2, eeVar, sdVar2, false, null, function0, fetVar, 0, 24);
                ?? r13 = fetVar;
                r13.r(r5);
                r4 = r5;
                r11 = r13;
            } else {
                shdVar = shdVar4;
                pcyVar = pcyVar2;
                cl5Var = cl5Var2;
                shdVar2 = shdVar5;
                shdVar3 = shdVar7;
                jm40Var = jm40Var3;
                r0 = 1;
                r4 = 0;
                fet fetVar3 = fetVar;
                fetVar3.e0(-497558248);
                fetVar3.r(false);
                r11 = fetVar3;
            }
            r11.r(r0);
            if (bmmVar instanceof zlm) {
                r11.e0(776409516);
                pm80 pm80VarF = a8k0.F(((zlm) bmmVar).f44587a, r4, r11);
                zcl zclVar2 = qmk.f28987a;
                j0x.b(pm80VarF, null, o7k0.e(o7k0.u(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 0.0f, 96.0f, r0), 24.0f), null, pgeVar, 0.0f, null, fetVar, 24632, 104);
                ?? r14 = fetVar;
                r14.r(r4);
                jm40Var2 = jm40Var;
                r12 = r14;
            } else {
                jm40 jm40Var4 = jm40Var;
                if (!(bmmVar instanceof amm)) {
                    throw b1j.f(776407590, r11, r4);
                }
                r11.e0(-1700692138);
                amm ammVar = (amm) bmmVar;
                int i3 = ammVar.b;
                String str = ammVar.f1115a;
                zcl zclVar3 = qmk.f28987a;
                jm40Var2 = jm40Var4;
                k7x.b(str, null, o7k0.e(o7k0.u(s5x0.L(jm40Var4, 8.0f, 0.0f, 2), 0.0f, 96.0f, r0), 24.0f), a8k0.F(i3, r4, r11), a8k0.F(i3, r4, r11), null, null, null, null, null, pgeVar, null, fetVar, 36912, 6, 31712);
                ?? r15 = fetVar;
                r15.r(r4);
                r12 = r15;
            }
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, r0);
            tj30 tj30VarC2 = zq8.c(zx7Var, r4);
            int iHashCode3 = Long.hashCode(r12.T);
            bh90 bh90VarM3 = r12.m();
            mm40 mm40VarC2 = kbc.c0(r12, x7zVar2);
            r12.i0();
            if (r12.S) {
                r12.l(pcyVar);
            } else {
                r12.r0();
            }
            jpm0.o(r12, tj30VarC2, shdVar);
            jpm0.o(r12, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, r12, shdVar6, r12);
            jpm0.o(r12, mm40VarC2, shdVar3);
            if (cmmVar.c) {
                r12.e0(1694163430);
                mm40 mm40VarB = jr8Var.b(o7k0.n(yyw.V(s5x0.N(o2e.e0(jm40Var2, "ICON_SEARCH"), 0.0f, 0.0f, 20.0f, 0.0f, 11), r12.k(bmd.n) == k6z.b ? r0 : r4), 24.0f), gqw0.f);
                ?? r9 = (i2 & 896) == 256 ? r0 : r4;
                Object objP2 = r12.P();
                if (r9 != 0 || objP2 == cl5Var) {
                    objP2 = new ylm(function1, r0);
                    r12.o0(objP2);
                }
                dww.c(a8k0.F(R.drawable.ic_glyph_search, r4, r12), null, y860.W(mm40VarB, null, null, false, null, (Function0) objP2, 28), ((ThemeColors) r12.k(zfnVar)).getSecondary(), r12, 56, 0);
                r12.r(r4);
            } else {
                r12.e0(1695002817);
                r12.r(r4);
            }
            r12.r(r0);
            r12.r(r0);
            r10 = r12;
        } else {
            fetVar2.X();
            r10 = fetVar2;
        }
        yfe0 yfe0VarU = r10.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xlm(mm40Var, cmmVar, function1, function2, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v7, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v9, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void M(mm40 mm40Var, cmm cmmVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        cmm cmmVar2;
        Function1 function3;
        Function1 function4;
        ?? r10;
        int i3;
        boolean z;
        shd shdVar;
        shd shdVar2;
        ?? r0;
        boolean z2;
        jm40 jm40Var;
        shd shdVar3;
        ?? r11;
        int i4;
        jm40 jm40Var2;
        ?? r12;
        mm40 mm40VarD0;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.B;
        fetVar2.g0(1163949966);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(cmmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar6);
            jpm0.n(fetVar2);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar7);
            bmm bmmVar = cmmVar.b;
            boolean z4 = cmmVar.c;
            boolean z5 = bmmVar instanceof zlm;
            jm40 jm40Var3 = jm40.b;
            if (z5) {
                fetVar2.e0(692168490);
                z2 = true;
                shdVar = shdVar7;
                shdVar2 = shdVar6;
                z = z4;
                i3 = i2;
                r0 = 0;
                j0x.b(a8k0.F(((zlm) bmmVar).f44587a, 0, fetVar2), null, o7k0.e(o7k0.u(s5x0.N(jm40Var3, 8.0f, 0.0f, 8.0f, 0.0f, 10), 0.0f, 96.0f, 1), 24.0f), null, pgeVar, 0.0f, null, fetVar, 24632, 104);
                fet fetVar3 = fetVar;
                fetVar3.r(false);
                shdVar3 = shdVar4;
                jm40Var = jm40Var3;
                r11 = fetVar3;
            } else {
                i3 = i2;
                z = z4;
                shdVar = shdVar7;
                shdVar2 = shdVar6;
                r0 = 0;
                z2 = true;
                if (!(bmmVar instanceof amm)) {
                    throw b1j.f(692166580, fetVar2, false);
                }
                fetVar2.e0(-17180776);
                amm ammVar = (amm) bmmVar;
                int i5 = ammVar.b;
                jm40Var = jm40Var3;
                shdVar3 = shdVar4;
                k7x.b(ammVar.f1115a, null, o7k0.e(o7k0.u(s5x0.N(jm40Var3, 8.0f, 0.0f, 8.0f, 0.0f, 10), 0.0f, 96.0f, 1), 24.0f), a8k0.F(i5, 0, fetVar2), a8k0.F(i5, 0, fetVar2), null, null, null, null, null, pgeVar, null, fetVar, 36912, 6, 31712);
                fet fetVar4 = fetVar;
                fetVar4.r(false);
                r11 = fetVar4;
            }
            x7z x7zVar = new x7z(1.0f, z2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, r0);
            int iHashCode2 = Long.hashCode(r11.T);
            bh90 bh90VarM2 = r11.m();
            mm40 mm40VarC1 = kbc.c0(r11, x7zVar);
            r11.i0();
            if (r11.S) {
                r11.l(pcyVar);
            } else {
                r11.r0();
            }
            jpm0.o(r11, tj30VarC, shdVar3);
            jpm0.o(r11, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, r11, shdVar2, r11);
            jpm0.o(r11, mm40VarC1, shdVar);
            cmmVar2 = cmmVar;
            sd sdVar = cmmVar2.e;
            Object obj = ukd.f35823a;
            if (sdVar != null) {
                r11.e0(-1424202222);
                jm40Var2 = jm40Var;
                mm40 mm40VarN2 = s5x0.N(jr8.f16991a.b(jm40Var2, gqw0.c), 0.0f, 0.0f, z ? 4.0f : 8.0f, 0.0f, 11);
                if (function2 != null) {
                    function4 = function2;
                    mm40VarD0 = ro4.d0(jm40Var2, function4);
                } else {
                    function4 = function2;
                    mm40VarD0 = jm40Var2;
                }
                mm40 mm40VarE2 = mm40VarN2.e(mm40VarD0);
                ee eeVar = cmmVar2.d;
                sd sdVar2 = cmmVar2.e;
                i4 = i3;
                ?? r8 = (i4 & 896) == 256 ? z2 : r0;
                Object objP = r11.P();
                if (r8 != 0 || objP == obj) {
                    objP = new p3l(function1, (byte) 28);
                    r11.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                ?? r13 = r11;
                jcb.f(mm40VarE2, eeVar, sdVar2, false, null, function0, r13, 0, 24);
                ?? r14 = r13;
                r14.r(r0);
                r12 = r14;
            } else {
                function4 = function2;
                i4 = i3;
                jm40Var2 = jm40Var;
                r11.e0(-1423441110);
                r11.r(r0);
                r12 = r11;
            }
            r12.r(z2);
            if (z) {
                r12.e0(-15717080);
                mm40 mm40VarV = yyw.V(o7k0.n(s5x0.N(jm40Var2, 12.0f, 0.0f, 20.0f, 0.0f, 10), 24.0f), r12.k(bmd.n) == k6z.b ? z2 : r0);
                ?? r9 = (i4 & 896) == 256 ? z2 : r0;
                Object objP2 = r12.P();
                if (r9 != 0 || objP2 == obj) {
                    function3 = function1;
                    objP2 = new p3l(function3, (byte) 29);
                    r12.o0(objP2);
                } else {
                    function3 = function1;
                }
                dww.c(a8k0.F(R.drawable.ic_glyph_search, r0, r12), null, o2e.e0(y860.W(mm40VarV, null, null, false, null, (Function0) objP2, 28), "LEFT_LOGO_SEARCH_ICON"), ((ThemeColors) r12.k(zfnVar)).getSecondary(), r12, 56, 0);
                r12.r(r0);
            } else {
                function3 = function1;
                r12.e0(-14961424);
                r12.r(r0);
            }
            r12.r(z2);
            r10 = r12;
        } else {
            cmmVar2 = cmmVar;
            function3 = function1;
            function4 = function2;
            fetVar2.X();
            r10 = fetVar2;
        }
        yfe0 yfe0VarU = r10.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xlm(mm40Var, cmmVar2, function3, function4, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v7, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void N(mm40 mm40Var, cmm cmmVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        cmm cmmVar2;
        ?? r10;
        pcy pcyVar;
        jm40 jm40Var;
        shd shdVar;
        shd shdVar2;
        ?? r0;
        ?? r2;
        shd shdVar3;
        ?? r11;
        ?? r12;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.B;
        fetVar2.g0(739559403);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(cmmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar6);
            jpm0.n(fetVar2);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar7);
            x7z x7zVar = new x7z(1.0f, true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar2, shdVar6, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar7);
            sd sdVar = cmmVar.e;
            bmm bmmVar = cmmVar.b;
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var2 = jm40.b;
            if (sdVar != null) {
                fetVar2.e0(1417333899);
                mm40 mm40VarB = jr8.f16991a.b(jm40Var2, gqw0.d);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE2 = s5x0.L(mm40VarB, 8.0f, 0.0f, 2).e(function2 != null ? ro4.d0(jm40Var2, function2) : jm40Var2);
                ee eeVar = cmmVar.d;
                sd sdVar2 = cmmVar.e;
                boolean z2 = (i2 & 896) == 256;
                Object objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    objP = new p3l(function1, (byte) 26);
                    fetVar2.o0(objP);
                }
                shdVar = shdVar6;
                pcyVar = pcyVar2;
                shdVar3 = shdVar5;
                shdVar2 = shdVar4;
                jm40Var = jm40Var2;
                r0 = 0;
                r2 = 1;
                jcb.f(mm40VarE2, eeVar, sdVar2, false, null, (Function0) objP, fetVar, 0, 24);
                fet fetVar3 = fetVar;
                fetVar3.r(false);
                r11 = fetVar3;
            } else {
                pcyVar = pcyVar2;
                jm40Var = jm40Var2;
                shdVar = shdVar6;
                shdVar2 = shdVar4;
                r0 = 0;
                r2 = 1;
                shdVar3 = shdVar5;
                fetVar2.e0(1418062337);
                fetVar2.r(false);
                r11 = fetVar2;
            }
            r11.r(r2);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), ((ThemeColors) r11.k(r19)).getBackground(), vgg0.f37379a), 12.0f);
            thg0 thg0VarA2 = shg0.a(uc9.e, yx7Var, r11, 54);
            int iHashCode3 = Long.hashCode(r11.T);
            bh90 bh90VarM3 = r11.m();
            mm40 mm40VarC2 = kbc.c0(r11, mm40VarJ);
            r11.i0();
            if (r11.S) {
                r11.l(pcyVar);
            } else {
                r11.r0();
            }
            jpm0.o(r11, thg0VarA2, shdVar2);
            jpm0.o(r11, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, r11, shdVar, r11);
            jpm0.o(r11, mm40VarC2, shdVar7);
            cmmVar2 = cmmVar;
            if (cmmVar2.c) {
                r11.e0(21082060);
                mm40 mm40VarN = o7k0.n(yyw.V(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), r11.k(bmd.n) == k6z.b ? r2 : r0), 20.0f);
                ?? r9 = (i2 & 896) == 256 ? r2 : r0;
                Object objP2 = r11.P();
                if (r9 != 0 || objP2 == cl5Var) {
                    objP2 = new p3l(function1, (byte) 27);
                    r11.o0(objP2);
                }
                dww.c(a8k0.F(R.drawable.ic_glyph_search, r0, r11), null, o2e.e0(y860.W(mm40VarN, null, null, false, null, (Function0) objP2, 28), "RIGHT_LOGO_SEARCH_ICON"), ((ThemeColors) r11.k(zfnVar)).getTextPrimary(), r11, 56, 0);
                r11.r(r0);
            } else {
                r11.e0(21883007);
                r11.r(r0);
            }
            if (bmmVar instanceof zlm) {
                r11.e0(-414932607);
                j0x.b(a8k0.F(((zlm) bmmVar).f44587a, r0, r11), null, o2e.e0(o7k0.e(o7k0.u(jm40Var, 0.0f, 64.0f, r2), 16.0f), "RIGHT_LOGO_IMAGE"), null, pgeVar, 0.0f, null, fetVar, 24632, 104);
                ?? r13 = fetVar;
                r13.r(r0);
                r12 = r13;
            } else {
                if (!(bmmVar instanceof amm)) {
                    throw b1j.f(-414934619, r11, r0);
                }
                r11.e0(22433753);
                amm ammVar = (amm) bmmVar;
                int i3 = ammVar.b;
                k7x.b(ammVar.f1115a, null, o2e.e0(o7k0.e(o7k0.u(jm40Var, 0.0f, 64.0f, r2), 16.0f), "RIGHT_LOGO_IMAGE"), a8k0.F(i3, r0, r11), a8k0.F(i3, r0, r11), null, null, null, null, null, pgeVar, null, fetVar, 36912, 6, 31712);
                ?? r14 = fetVar;
                r14.r(r0);
                r12 = r14;
            }
            r12.r(r2);
            r12.r(r2);
            r10 = r12;
        } else {
            cmmVar2 = cmmVar;
            fetVar2.X();
            r10 = fetVar2;
        }
        yfe0 yfe0VarU = r10.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xlm(mm40Var, cmmVar2, function1, function2, i, (byte) 0);
        }
    }

    public static final void O(mm40 mm40Var, m0n0 m0n0Var, rqm rqmVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(364509495);
        byte b2 = 16;
        int i2 = i | 6 | (fetVar.g(m0n0Var) ? 32 : 16) | (fetVar.g(rqmVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            pvi0 pvi0Var = rqmVar.c;
            int i3 = i2 & 112;
            int i4 = i2 & 7168;
            boolean z = (i3 == 32) | (i4 == 2048);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new o0k0(m0n0Var, function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = (i3 == 32) | fetVar.g(pvi0Var) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ck60(m0n0Var, pvi0Var, function1, (byte) 18);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            obc.q(jm40Var, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, ((i2 >> 3) & 112) | 6, 172);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 5, i, mm40Var2, m0n0Var, rqmVar, function1);
        }
    }

    public static final void P(mm40 mm40Var, u2n0 u2n0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1510242176);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(u2n0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            ch80 ch80VarF = knm0.f(s5x0.t(xfn.a(fetVar).d, 0.0f, 2), fetVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0((byte) 23, (Object) u2n0Var, function1);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var2, u2n0Var, function1, i, (byte) 1);
        }
    }

    public static final void Q(mm40 mm40Var, e1n0 e1n0Var, c6q0 c6q0Var, tvi0 tvi0Var, wui0 wui0Var, hh80 hh80Var, Function1 function1, fet fetVar, int i, int i2) {
        hh80 lh80Var;
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        float f2;
        yjj0 yjj0VarA;
        ljc ljcVar = jd8.n;
        fetVar.g0(176878608);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= fetVar.g(e1n0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= fetVar.g(c6q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= fetVar.g(tvi0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= fetVar.e(wui0Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                lh80Var = hh80Var;
                int i5 = fetVar.g(lh80Var) ? 131072 : 65536;
                i4 |= i5;
            } else {
                lh80Var = hh80Var;
            }
            i4 |= i5;
        } else {
            lh80Var = hh80Var;
        }
        if ((1572864 & i) == 0) {
            i4 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                int i6 = i2 & 32;
                jm40 jm40Var = jm40.b;
                if (i6 != 0) {
                    zcl zclVar = qmk.f28987a;
                    lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                    i4 &= -458753;
                }
                i3 = i4;
                mm40Var3 = jm40Var;
            } else {
                fetVar.X();
                if ((i2 & 32) != 0) {
                    i4 &= -458753;
                }
                i3 = i4;
                mm40Var3 = mm40Var;
            }
            fetVar.s();
            mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
            if (tvi0Var.equals(qvi0.f29388a)) {
                zcl zclVar2 = qmk.f28987a;
                f2 = 16.0f;
            } else if (tvi0Var.equals(rvi0.f31169a)) {
                zcl zclVar3 = qmk.f28987a;
                f2 = 360.0f;
            } else if (!tvi0Var.equals(svi0.f32868a)) {
                t9f.b();
                return;
            } else {
                zcl zclVar4 = qmk.f28987a;
                f2 = 8.0f;
            }
            int iOrdinal = wui0Var.ordinal();
            if (iOrdinal == 0) {
                yjj0VarA = vgg0.a(f2);
            } else if (iOrdinal == 1) {
                yjj0VarA = vgg0.c(f2, f2, 0.0f, 0.0f, 12);
            } else if (iOrdinal == 2) {
                yjj0VarA = ljcVar;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                yjj0VarA = vgg0.c(0.0f, 0.0f, f2, f2, 3);
            }
            mm40 mm40VarI = s5x0.I(i120.Q(lgb.J(mm40VarD, yjj0VarA), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar), lh80Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = ((3670016 & i3) == 1048576) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0((Object) function1, (Object) e1n0Var, (byte) 24);
                fetVar.o0(objP);
            }
            wvb.t(null, c6q0Var, 0, null, (Function1) objP, fetVar, (i3 >> 3) & 112, 13);
            fetVar.r(true);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        hh80 hh80Var2 = lh80Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pol(mm40Var2, e1n0Var, c6q0Var, tvi0Var, wui0Var, hh80Var2, function1, i, i2);
        }
    }

    public static final void R(mm40 mm40Var, wul wulVar, e1n0 e1n0Var, c6q0 c6q0Var, g0n0 g0n0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(189193042);
        int i2 = i | 6 | (fetVar.g(wulVar) ? 32 : 16) | (fetVar.g(e1n0Var) ? 256 : 128) | (fetVar.g(c6q0Var) ? 2048 : 1024) | (fetVar.g(g0n0Var) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 16.0f);
            x5d x5dVarA = w5d.a(new qw3(26.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            int i3 = i2 >> 3;
            boolean z = false;
            Q(null, e1n0Var, c6q0Var, qvi0.f29388a, wui0.b, null, function1, fetVar, (i3 & 896) | (i3 & 112) | 27648 | (3670016 & (i2 << 3)), 33);
            boolean z2 = (458752 & i2) == 131072;
            if ((57344 & i2) == 16384) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new o0k0((Object) function1, (Object) g0n0Var, (byte) 15);
                fetVar.o0(objP);
            }
            j(null, wulVar, (Function0) objP, fetVar, i2 & 112);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdl0(mm40Var2, wulVar, e1n0Var, c6q0Var, g0n0Var, function1, i, (byte) 2);
        }
    }

    public static final void S(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1605889726);
        int i2 = i | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            n0q n0qVar = o7k0.c;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, (byte) 9);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i, (byte) 9);
        }
    }

    public static final void T(k3t0 k3t0Var, fet fetVar, int i) {
        k3t0Var.getClass();
        fetVar.g0(-241471390);
        int i2 = i | (fetVar.g(k3t0Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            byte b2 = 14;
            int i3 = i2 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            n0q n0qVar = o7k0.c;
            androidx.compose.runtime.d dVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar.k(dVar)).getBackground(), jd8.n);
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
            mm40 mm40VarW = o050.W(jm40.b);
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(dVar)).getSecondary()), new plm(xsm0.s(R.string.onoboarding_cyber_section_title, fetVar), ha50.TWO_LINES, ((ThemeColors) fetVar.k(dVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), true, null);
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new dbh(i3t0Var, (byte) 11);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            float f2 = xfn.a(fetVar).d;
            lh80 lh80Var = new lh80(f2, 12.0f, f2, 12.0f);
            boolean zG = fetVar.g(pz40VarY) | (i3 == 4);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new dj60(pz40VarY, i3t0Var, (byte) 0);
                fetVar.o0(objP2);
            }
            b8k0.e(n0qVar, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 6, 490);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xcr(k3t0Var, i, (byte) 2);
        }
    }

    public static final void U(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        fetVar.g0(-2052561152);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.d(), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 109560);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r39v0, types: [a.fet] */
    public static final void V(mm40 mm40Var, int i, int i2, fet fetVar, int i3) {
        long secondary60;
        fetVar.g0(-1875102247);
        int i4 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(i) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128);
        int i5 = 0;
        boolean z = true;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
            fetVar.e0(871389263);
            int i6 = 0;
            while (i6 < i) {
                ?? r1 = i6 == i2 % i ? z : i5;
                ?? r11 = i5;
                boolean z2 = z;
                l7m0 l7m0VarB = d43.b(1.0f, ro4.m0(300, i5, null, 6), "AlphaAnimation", null, fetVar, 3126, 20);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.L(jm40.b, 2.0f, 0.0f, 2), r1 != 0 ? 8.0f : 4.0f), r1 != 0 ? 8.0f : 4.0f);
                zcl zclVar3 = qmk.c;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarU = i4w0.U(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), ((Number) l7m0VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048574);
                if (r1 != 0) {
                    fetVar.e0(-1543626444);
                    secondary60 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                } else {
                    fetVar.e0(-1543625448);
                    secondary60 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary60();
                }
                fetVar.r(r11);
                zq8.a(r11 == true ? 1 : 0, fetVar, i120.Q(mm40VarU, secondary60, jd8.n));
                i6++;
                i5 = r11 == true ? 1 : 0;
                z = z2;
            }
            fetVar.r(i5);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s48(mm40Var, i, i2, i3, (byte) 0);
        }
    }

    public static final void W(String str, fet fetVar, int i) {
        fetVar.g0(705245940);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            pm80 pm80VarF = a8k0.F(R.drawable.bio_no_photo_placeholder, 0, fetVar);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.b(str, null, lgb.J(n0qVar, new ugg0(zclVar, zclVar, zclVar, zclVar)), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, (i2 & 14) | 36912, 6, 31712);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 14, i, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x0130  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0236  */
    /* JADX WARN: Code duplicated, block: B:90:0x0267  */
    public static final void X(a4x a4xVar, int i, String str, Function1 function1, fet fetVar, int i2) {
        int i3;
        String str2;
        a4x a4xVar2;
        int i4;
        Integer num;
        Object obj;
        boolean z;
        boolean z2;
        Object objP;
        jm40 jm40Var;
        boolean z3;
        Function0 function0;
        fetVar.g0(919173228);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            Object objP2 = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP2 == cl5Var) {
                objP2 = new os7((byte) 18);
                fetVar.o0(objP2);
            }
            int i6 = i5 >> 3;
            kwj kwjVarB = zk80.b(i, (Function0) objP2, fetVar, (i6 & 14) | 384, 2);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP3);
            }
            Object obj2 = (vne) objP3;
            Integer numValueOf = Integer.valueOf(i);
            int i7 = i5 & 112;
            boolean zG = fetVar.g(kwjVarB) | (i7 == 32) | fetVar.i(obj2);
            Object objP4 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP4 == cl5Var) {
                num = numValueOf;
                i4 = i;
                Object mc0Var = new mc0((Object) kwjVarB, i4, obj2, yjeVar, (byte) 3);
                fetVar.o0(mc0Var);
                objP4 = mc0Var;
            } else {
                num = numValueOf;
                i4 = i;
            }
            m0x0.t(fetVar, num, (Function2) objP4);
            Integer numValueOf2 = Integer.valueOf(kwjVarB.k());
            int i8 = i5 & 7168;
            boolean zG2 = fetVar.g(kwjVarB) | (i7 == 32) | (i8 == 2048);
            Object objP5 = fetVar.P();
            if (zG2) {
                obj = cl5Var;
            } else {
                obj = cl5Var;
                if (objP5 == obj) {
                }
                m0x0.t(fetVar, numValueOf2, (Function2) objP5);
                Boolean boolValueOf = Boolean.valueOf(kwjVarB.k.a());
                boolean zG3 = fetVar.g(kwjVarB);
                if (i8 == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | zG3;
                objP = fetVar.P();
                if (z2 || objP == obj) {
                    objP = new xw5(kwjVarB, function1, yjeVar, (byte) 23);
                    fetVar.o0(objP);
                }
                m0x0.t(fetVar, boolValueOf, (Function2) objP);
                jm40Var = jm40.b;
                mm40 mm40VarJ = s5x0.J(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), xfn.a(fetVar).d);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                mkd.c0.getClass();
                fetVar.i0();
                z3 = fetVar.S;
                function0 = e7z.u1;
                if (z3) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(fetVar, x5dVarA, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar, bh90VarM, shdVar2);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar, numValueOf3, shdVar3);
                jpm0.n(fetVar);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar, mm40VarC0, shdVar4);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 200.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                a4xVar2 = a4xVar;
                obc.d(xf80.f40779a.a(null), u1c.M(229477032, new mz7(kwjVarB, a4xVar2, (byte) 1), fetVar), fetVar, 48);
                fetVar.r(true);
                str2 = str;
                U(i6 & 112, fetVar, o7k0.e(s5x0.L(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).d, 0.0f, 2), 44.0f), str2);
                if (a4xVar2.size() > 1) {
                    fetVar.e0(1520446036);
                    V(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13).e(new wkw(gqw0.n)), a4xVar2.size(), kwjVarB.k(), fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1520713504);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            objP5 = new v48(kwjVarB, i4, function1, (yje) null);
            fetVar.o0(objP5);
            m0x0.t(fetVar, numValueOf2, (Function2) objP5);
            Boolean boolValueOf2 = Boolean.valueOf(kwjVarB.k.a());
            boolean zG4 = fetVar.g(kwjVarB);
            if (i8 == 2048) {
                z = true;
            } else {
                z = false;
            }
            z2 = z | zG4;
            objP = fetVar.P();
            if (z2) {
                objP = new xw5(kwjVarB, function1, yjeVar, (byte) 23);
                fetVar.o0(objP);
            } else {
                objP = new xw5(kwjVarB, function1, yjeVar, (byte) 23);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) objP);
            jm40Var = jm40.b;
            mm40 mm40VarJ2 = s5x0.J(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), xfn.a(fetVar).d);
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarJ2);
            mkd.c0.getClass();
            fetVar.i0();
            z3 = fetVar.S;
            function0 = e7z.u1;
            if (z3) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, x5dVarA2, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM3, shdVar6);
            Integer numValueOf4 = Integer.valueOf(iHashCode3);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf4, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC2, shdVar8);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarD2, 200.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar5);
            jpm0.o(fetVar, bh90VarM4, shdVar6);
            vqd.u(iHashCode4, fetVar, shdVar7, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar8);
            a4xVar2 = a4xVar;
            obc.d(xf80.f40779a.a(null), u1c.M(229477032, new mz7(kwjVarB, a4xVar2, (byte) 1), fetVar), fetVar, 48);
            fetVar.r(true);
            str2 = str;
            U(i6 & 112, fetVar, o7k0.e(s5x0.L(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).d, 0.0f, 2), 44.0f), str2);
            if (a4xVar2.size() > 1) {
                fetVar.e0(1520446036);
                V(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13).e(new wkw(gqw0.n)), a4xVar2.size(), kwjVarB.k(), fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(1520713504);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            str2 = str;
            a4xVar2 = a4xVar;
            i4 = i;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6(a4xVar2, i4, str2, function1, i2);
        }
    }

    public static final void Y(int i, xls xlsVar, fet fetVar, mm40 mm40Var) {
        k6z k6zVar;
        xlsVar.getClass();
        fetVar.g0(620497069);
        int i2 = (fetVar.g(xlsVar) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), StaticColors.INSTANCE.m73getBlack400d7_KjU(), jd8.n), 0.0f), "PREVIOUS_MAPS_ITEM");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            k7x.a(xlsVar.g, null, o2e.e0(lgb.J(o7k0.c, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "PREVIOUS_MAPS_ITEM_BACKGROUND"), gqw0.A, null, fetVar, 1572912, 1976);
            if (xlsVar.k) {
                fetVar.e0(1232258734);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1232259658);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1337492391, new iob0(xlsVar, b2), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fvb0(xlsVar, mm40Var, i);
        }
    }

    public static final void Z(int i, xls xlsVar, fet fetVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        fetVar2.g0(854209418);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(xlsVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            xx7 xx7Var = gqw0.n;
            mm40 mm40VarE0 = o2e.e0(mm40Var, "PREVIOUS_MAPS_ITEM_SCORE_COLUMN");
            x5d x5dVarA = w5d.a(uc9.e, xx7Var, fetVar2, 54);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE1 = o2e.e0(jm40Var, "PREVIOUS_MAPS_ITEM_NAME");
            String str = xlsVar.h;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarE1, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.b(), fetVar, 48, 0, 130040);
            zcl zclVar = qmk.f28987a;
            v8q0.a(xlsVar.i, o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), "PREVIOUS_MAPS_ITEM_SCORE"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.q(), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fvb0(mm40Var, xlsVar, i);
        }
    }

    public static final void a(xv1 xv1Var, fet fetVar, int i) {
        xv1Var.getClass();
        fetVar.g0(-143955385);
        int i2 = (fetVar.g(xv1Var) ? 4 : 2) | i | (fetVar.i(null) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.s(o7k0.e(jm40.b, 104.0f), 128.0f), "CATEGORY_PRIZE_NUMBER");
            if (xv1Var instanceof vv1) {
                fetVar.e0(2097847871);
                b(mm40VarE0, (vv1) xv1Var, fetVar, (i2 << 3) & 1008);
                fetVar.r(false);
            } else {
                if (!xv1Var.equals(wv1.f39817a)) {
                    throw b1j.f(-902161031, fetVar, false);
                }
                fetVar.e0(-902150714);
                c(0, fetVar, mm40VarE0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o00(xv1Var, i, (byte) 22);
        }
    }

    public static final void a0(xx7 xx7Var, mm40 mm40Var, String str, String str2, long j, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-765584608);
        int i2 = i | (fetVar2.g(mm40Var) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.f(j) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "PREVIOUS_MAPS_ITEM_TEAM_COLUMN");
            x5d x5dVarA = w5d.a(uc9.e, xx7Var, fetVar2, 54);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_empty, 0, fetVar2);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i3 = i2 >> 6;
            k7x.b(str, null, o2e.e0(o7k0.n(jm40Var, 36.0f), "PREVIOUS_MAPS_ITEM_TEAM_LOGO"), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar2, (i3 & 14) | 36912, 0, 32736);
            v8q0.a(str2, o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), "PREVIOUS_MAPS_ITEM_TEAM_RESULT"), j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, ((i2 >> 9) & 14) | (i3 & 896), 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new si6(xx7Var, mm40Var, str, str2, j, i);
        }
    }

    public static final void b(mm40 mm40Var, vv1 vv1Var, fet fetVar, int i) {
        int i2;
        byte b2;
        boolean z;
        m78 m78Var;
        jm40 jm40Var;
        zfn zfnVar;
        boolean z2;
        vv1 vv1Var2 = vv1Var;
        fet fetVar2 = fetVar;
        String str = vv1Var2.e;
        n0x n0xVar = vv1Var2.b;
        fetVar2.g0(1339660411);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(vv1Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(null) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zfn zfnVar2 = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar2)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, vgg0.a(12.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new c51(vv1Var2, (byte) 21);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarQ2 = i120.Q(s5x0.N(o7k0.d(o7k0.e(jm40Var2, 36.0f), 1.0f), 4.0f, 4.0f, 4.0f, 0.0f, 8), ((ThemeColors) fetVar2.k(zfnVar2)).getBackground(), vgg0.a(8.0f));
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarJ = s5x0.J(jm40Var2, 4.0f);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarN = o7k0.n(jr8Var.b(mm40VarJ, zx7Var), 28.0f);
            mz3 mz3VarT = lv00.T(n0xVar, new m0x(R.drawable.ic_glyph_favourite_active, null, 6), null, null, fetVar2, 0, 12);
            if (n0xVar.c()) {
                fetVar2.e0(1098675855);
                m78 m78Var2 = new m78(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), 5);
                z = false;
                fetVar2.r(false);
                m78Var = m78Var2;
            } else {
                z = false;
                fetVar2.e0(1098779271);
                fetVar2.r(false);
                m78Var = null;
            }
            j0x.b(mz3VarT, null, mm40VarN, null, gqw0.A, 0.0f, m78Var, fetVar, 24624, 40);
            mm40 mm40VarB = jr8Var.b(s5x0.N(jm40Var2, 38.0f, 0.0f, 8.0f, 0.0f, 10), gqw0.d);
            vv1Var2 = vv1Var;
            v8q0.a(vv1Var2.c, mm40VarB, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            boolean z5 = vv1Var2.d.length() > 0;
            boolean z6 = str.length() > 0;
            boolean z7 = z5 && z6;
            mm40 mm40VarC = o7k0.c(s5x0.M(jm40Var2, 12.0f, 52.0f, 12.0f, 8.0f), 1.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarC);
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
            if (z5) {
                fetVar2.e0(-309894652);
                jm40Var = jm40Var2;
                zfnVar = zfnVar2;
                v8q0.a(vv1Var2.d, null, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.m(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110578);
                fetVar2 = fetVar;
                z2 = false;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                zfnVar = zfnVar2;
                z2 = false;
                fetVar2.e0(-309358941);
                fetVar2.r(false);
            }
            if (z6) {
                fetVar2.e0(-309292477);
                v8q0.a(str, z7 ? s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13) : jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.m(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(z2);
            } else {
                fetVar2.e0(-308663549);
                fetVar2.r(z2);
            }
            b2 = 1;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw1(mm40Var, vv1Var2, i, b2);
        }
    }

    public static final void b0(Function0 function0, Function0 function1, Function0 function2, Function1 function3, l7m0 l7m0Var, l7m0 l7m0Var2, fet fetVar, int i) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        l7m0Var.getClass();
        l7m0Var2.getClass();
        fetVar.g0(1530434625);
        int i2 = i | (fetVar.i(function0) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128) | (fetVar.i(function3) ? 2048 : 1024) | (fetVar.g(l7m0Var) ? 16384 : 8192) | (fetVar.g(l7m0Var2) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            wom womVarF = mom.f(fetVar);
            boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
            mm40 mm40VarE0 = o2e.e0(i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n).e(o7k0.c), "PullToRefreshBox");
            zx7 zx7Var = gqw0.c;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new l3c0(function1, (byte) 8);
                fetVar.o0(objP);
            }
            mom.c(mm40VarE0, zBooleanValue, womVarF, zx7Var, false, null, (Function0) objP, null, u1c.M(917261014, new x2g((Object) l7m0Var, function0, function2, (wdr) function3, (byte) 29), fetVar), fetVar, 100666368, 176);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(function0, function1, function2, function3, l7m0Var, l7m0Var2, i);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1153600509);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 13);
        }
    }

    public static final void c0(mm40 mm40Var, u2n0 u2n0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        u2n0Var.getClass();
        function1.getClass();
        fetVar.g0(-1942944080);
        int i2 = i | 6 | (fetVar.g(u2n0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            imm immVar = u2n0Var.f34955a;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new opm0(function1, (byte) 6);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fetVar2 = fetVar;
            P(null, u2n0Var, function1, fetVar2, i2 & 1008);
            fetVar2.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, u2n0Var, function1, i, (byte) 2);
        }
    }

    public static final void d(mm40 mm40Var, s44 s44Var, Function1 function1, fet fetVar, int i) {
        s44Var.getClass();
        function1.getClass();
        fetVar.g0(-2059452910);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(s44Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = s44Var.f31587a;
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm(new uui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), s44Var.b, null, null, 56), new nui0(Integer.valueOf(R.drawable.ic_glyph_log_out), null, new m0x(R.drawable.ic_glyph_log_out, null, 6), new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary())), 0.0f, 210), (pvi0) null, d4d.BACKGROUND_CONTENT, (tvi0) null, wui0.f39793a, s44Var.c, (e900) null, 300);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new fj4(function1, b2);
                fetVar.o0(objP);
            }
            obc.q(mm40Var, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, i2 & 14, 236);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) mm40Var, (Object) s44Var, (Object) function1, i, (byte) 7);
        }
    }

    public static final void d0(mm40 mm40Var, f100 f100Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        pvi0 jvi0Var;
        fetVar.g0(1396861286);
        int i2 = i | 6 | (fetVar.g(f100Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            String str = f100Var.f8741a;
            String str2 = f100Var.b;
            boolean z2 = f100Var.d;
            tui0 tui0Var = new tui0(str, null);
            if (z2) {
                z = true;
                fetVar.e0(-42843523);
                jvi0Var = new jvi0(str2, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()));
                fetVar.r(false);
            } else {
                fetVar.e0(-43065328);
                zfn zfnVar = zaq0.b;
                z = true;
                jvi0Var = new kvi0(str2, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()));
                fetVar.r(false);
            }
            rqm rqmVar = new rqm(tui0Var, (pui0) null, jvi0Var, (d4d) null, (tvi0) null, f100Var.c, !z2, (e900) null, 314);
            boolean z3 = (i2 & 896) == 256 ? z : false;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new yqz(function1, (byte) 25);
                fetVar.o0(objP);
            }
            obc.q(mm40VarL, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 232);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, f100Var, function1, i, (byte) 4);
        }
    }

    public static final void e(int i, fet fetVar) {
        fetVar.g0(-824534469);
        if (fetVar.U(i & 1, i != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 12.0f), 128.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 16.0f), 324.0f)), vbc.d0(null, fetVar, 0, 1)));
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 16.0f), 288.0f)), vbc.d0(null, fetVar, 0, 1)));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 16.0f), 220.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i87(i, (byte) 19);
        }
    }

    public static final void e0(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1923630059);
        int i2 = i | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, (byte) 8);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i, (byte) 8);
        }
    }

    public static final void f(int i, fet fetVar) {
        fetVar.g0(1902933362);
        if (fetVar.U(i & 1, i != 0)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, f2);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 200.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13).e(new wkw(gqw0.n)), 12.0f), 276.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i87(i, (byte) 20);
        }
    }

    public static final void f0(mm40 mm40Var, String str, String str2, nrq nrqVar, String str3, String str4, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1965662604);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 74899) != 74898)) {
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
            jm40 jm40Var = jm40.b;
            v8q0.a(str, o7k0.d(o2e.e0(jm40Var, str3), 1.0f), StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.o, null, j1t0.b, 0L, null, 0, 0, qmk.B, 16646109), fetVar2, (i2 >> 3) & 14, 24960, 109560);
            mm40 mm40VarD = o7k0.d(o2e.e0(jm40Var, str4), 1.0f);
            long j = ijg.X;
            v8q0.a(str2, mm40VarD, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.u, null, nrqVar, 0L, new ljj0(j, 2), 0, 0, qmk.G, 16637917), fetVar, (i2 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, str, str2, nrqVar, str3, str4, i, (byte) 18);
        }
    }

    public static final void g(c58 c58Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b2;
        int i2;
        fet fetVar2 = fetVar;
        c58Var.getClass();
        function1.getClass();
        fetVar2.g0(1567558568);
        int i3 = i | (fetVar2.g(c58Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, backgroundContent, ljcVar));
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarR);
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
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.biography, 0, fetVar2), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
            int i4 = i3 & 112;
            boolean z5 = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new to6(function1, (byte) 22);
                fetVar2.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mbc.o(zfi0.f44303a, jm40.b, false, fetVar, 54, 4);
            fetVar2 = fetVar;
            if (c58Var instanceof b58) {
                fetVar2.e0(202788881);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                f(0, fetVar2);
                fetVar2.e0(-255589694);
                for (n48 n48Var : ((b58) c58Var).f1989a) {
                    e(0, fetVar2);
                }
                z = true;
                ohs0.x(fetVar2, false, true, false);
            } else {
                z = true;
                if (c58Var instanceof a58) {
                    fetVar2.e0(203130253);
                    A(((a58) c58Var).f257a, function1, fetVar2, i4);
                    fetVar2.r(false);
                } else {
                    if (c58Var instanceof z48) {
                        fetVar2.e0(203320469);
                        z(((z48) c58Var).f43756a, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        if (!(c58Var instanceof y48)) {
                            throw b1j.f(283637309, fetVar2, false);
                        }
                        fetVar2.e0(203549156);
                        y48 y48Var = (y48) c58Var;
                        if (y48Var.f41988a.isEmpty()) {
                            z2 = true;
                            z3 = false;
                            b2 = 2;
                            i2 = 4;
                            fetVar2.e0(203852708);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(203538461);
                            z3 = false;
                            z2 = true;
                            b2 = 2;
                            i2 = 4;
                            X(y48Var.f41988a, y48Var.b, y48Var.c, function1, fetVar2, (i3 << 6) & 7168);
                            fetVar2.r(false);
                        }
                        mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), ljcVar);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                        lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
                        boolean z6 = (i3 & 14) == i2 ? z2 : z3;
                        Object objP2 = fetVar2.P();
                        if (z6 || objP2 == cl5Var) {
                            objP2 = new d38(c58Var, b2);
                            fetVar2.o0(objP2);
                        }
                        b8k0.e(mm40VarN, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
                        fetVar2 = fetVar;
                        fetVar2.r(z3);
                    }
                    fetVar2.r(z2);
                }
            }
            i = i;
            z2 = z;
            fetVar2.r(z2);
        } else {
            i = i;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(c58Var, function1, i, (byte) 10);
        }
    }

    public static final void g0(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(16952140);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "LAZY_COLUMN_TOURNAMENT_PRIZES");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(xfn.a(fetVar).c, 8.0f, xfn.a(fetVar).c, z ? 88.0f : 24.0f, fetVar);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new a7j0(a4xVar, function1, (byte) 7);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vy0(mm40Var2, a4xVar, z, function1, i, (byte) 5);
        }
    }

    public static final void h(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(156102577);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new jtz((byte) 6);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, (Function0) objP, fetVar2, ((i2 << 3) & 112) | 3072, 5);
            wha0.h(jr8.f16991a.b(jm40.b, gqw0.h), u1c.M(-1577200154, new gn(function1, (byte) 28), fetVar2), fetVar2, 48);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar2, function1, i, (byte) 13);
        }
    }

    public static y73 h0(clz clzVar, rrf0 rrf0Var, Function0 function0, int i) {
        Function0 f33Var = rrf0Var;
        if ((i & 1) != 0) {
            f33Var = new f33((byte) 5);
        }
        return new y73(f33Var, new sy2((byte) 14), function0, new sy2((byte) 15), clzVar);
    }

    public static final void i(mm40 mm40Var, ao8 ao8Var, fet fetVar) {
        ao8Var.getClass();
        obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1302937899, new t87(mm40Var, ao8Var, (byte) 18), fetVar), fetVar, 56);
    }

    public static final v12 i0(int i, List list) {
        list.getClass();
        if (list.size() == 1) {
            return v12.d;
        }
        if (i == 0) {
            return v12.f36608a;
        }
        return i == list.size() - 1 ? v12.c : v12.b;
    }

    public static final void j(mm40 mm40Var, wul wulVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(2015749674);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wulVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            qzb.n(o7k0.d(jm40Var, 1.0f), wulVar, function0, fetVar, i2 & 1008, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var2, wulVar, function0, i, (byte) 0);
        }
    }

    public static final int j0(yi5 yi5Var) {
        int iOrdinal = yi5Var.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.ic_glyph_document;
        }
        if (iOrdinal == 1) {
            return R.drawable.ic_glyph_responsible_gambling;
        }
        if (iOrdinal == 2) {
            return R.drawable.ic_glyph_statement;
        }
        if (iOrdinal == 3) {
            return R.drawable.ic_glyph_reward_system;
        }
        if (iOrdinal == 4) {
            return R.drawable.ic_glyph_wallet;
        }
        if (iOrdinal == 5) {
            return R.drawable.ic_glyph_account_number;
        }
        t9f.b();
        return 0;
    }

    public static final void k(mm40 mm40Var, hdj hdjVar, Function1 function1, fet fetVar, int i) {
        SimpleDate simpleDate;
        boolean z;
        Calendar calendar;
        hdjVar.getClass();
        Locale locale = hdjVar.f12873a;
        fetVar.g0(1834702578);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(hdjVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            SimpleDate simpleDate2 = hdjVar.c;
            SimpleDate simpleDate3 = hdjVar.b;
            boolean zG = fetVar.g(locale);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = Calendar.getInstance(locale);
                fetVar.o0(objP);
            }
            Calendar calendar2 = (Calendar) objP;
            boolean zG2 = fetVar.g(hdjVar.a()) | fetVar.g(calendar2);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                SimpleDate simpleDateA = hdjVar.a();
                if (simpleDateA != null) {
                    calendar2.getClass();
                    wdx.J(simpleDateA, calendar2);
                    objP2 = Long.valueOf(calendar2.getTimeInMillis());
                } else {
                    objP2 = null;
                }
                fetVar.o0(objP2);
            }
            Long l = (Long) objP2;
            boolean zG3 = fetVar.g(simpleDate3) | fetVar.g(simpleDate2);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj) {
                objP3 = Boolean.valueOf(bsr0.W(simpleDate3, simpleDate2) <= 0);
                fetVar.o0(objP3);
            }
            boolean zBooleanValue = ((Boolean) objP3).booleanValue();
            boolean zG4 = fetVar.g(simpleDate2) | fetVar.g(simpleDate3) | fetVar.g(hdjVar.a()) | fetVar.h(zBooleanValue);
            Object objP4 = fetVar.P();
            if (zG4 || objP4 == obj) {
                objP4 = jgk0.b(new rd7(zBooleanValue, hdjVar, b2));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var = (l7m0) objP4;
            Boolean bool = (Boolean) l7m0Var.getValue();
            bool.booleanValue();
            int i4 = i3 & 112;
            boolean zG5 = fetVar.g(l7m0Var) | (i4 == 32);
            Object objP5 = fetVar.P();
            if (zG5 || objP5 == obj) {
                objP5 = new yp6(hdjVar, l7m0Var, null, (byte) 22);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, bool, (Function2) objP5);
            SimpleDate simpleDate4 = hdjVar.b;
            SimpleDate simpleDate5 = hdjVar.c;
            calendar2.getClass();
            SimpleDate simpleDateA2 = hdjVar.a();
            boolean zH = fetVar.h(zBooleanValue) | fetVar.i(calendar2) | (i4 == 32) | ((i3 & 896) == 256);
            Object objP6 = fetVar.P();
            if (zH || objP6 == obj) {
                simpleDate = simpleDate5;
                z = zBooleanValue;
                calendar = calendar2;
                Object t13Var = new t13(z, (Object) calendar, (Object) hdjVar, (Object) function1, (byte) 2);
                fetVar.o0(t13Var);
                objP6 = t13Var;
            } else {
                simpleDate = simpleDate5;
                z = zBooleanValue;
                calendar = calendar2;
            }
            Calendar calendar3 = calendar;
            tlb.g(mm40Var, simpleDate4, simpleDate, l, z, calendar3, locale, simpleDateA2, null, (Function1) objP6, fetVar, (i3 & 14) | 16777792, 256);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var, hdjVar, function1, i, (byte) 2);
        }
    }

    public static final int k0(yi5 yi5Var) {
        int iOrdinal = yi5Var.ordinal();
        if (iOrdinal == 0) {
            return R.string.verification;
        }
        if (iOrdinal == 1) {
            return R.string.info_responsible_gaming;
        }
        if (iOrdinal == 2) {
            return R.string.application_for_payout;
        }
        if (iOrdinal == 3) {
            return R.string.reward_system;
        }
        if (iOrdinal == 4) {
            return R.string.payments_consultant;
        }
        if (iOrdinal == 5) {
            return R.string.account_number;
        }
        t9f.b();
        return 0;
    }

    public static final void l(mm40 mm40Var, jej jejVar, String str, String str2, Function1 function1, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        jej jejVar2;
        String str3;
        String str4;
        Function1 function2;
        fet fetVar2;
        jejVar.getClass();
        str.getClass();
        str2.getClass();
        fetVar.g0(1349244995);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jejVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar2 = fetVar;
            sj3.h(mm40Var, jejVar, str, str2, function1, fetVar2, i2 & 65534);
            mm40Var2 = mm40Var;
            jejVar2 = jejVar;
            str3 = str;
            str4 = str2;
            function2 = function1;
        } else {
            mm40Var2 = mm40Var;
            jejVar2 = jejVar;
            str3 = str;
            str4 = str2;
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bl9(mm40Var2, jejVar2, str3, str4, function2, i, (byte) 0);
        }
    }

    public static final st0 l0(mlr mlrVar, ctf0 ctf0Var, boolean z, boolean z2, boolean z3, pt0 pt0Var, Integer num) {
        String strA;
        nur murVar;
        pt0 pt0Var2;
        pt0 pt0Var3;
        pt0 pt0Var4;
        sso0 uqo0Var;
        mlrVar.getClass();
        boolean z4 = mlrVar.k;
        ctf0Var.getClass();
        int i = z2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
        boolean z5 = mlrVar.j;
        int i2 = 0;
        if (z4) {
            strA = ctf0Var.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = z5 ? ctf0Var.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
        }
        long j = mlrVar.f22006a;
        String str = mlrVar.f;
        String str2 = mlrVar.e;
        if (z) {
            i2 = z3 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
        }
        mtr mtrVar = new mtr(i2, z3);
        n0x n0xVar = new n0x(mlrVar.g);
        m0x m0xVar = new m0x(i, null, 6);
        if (strA.length() == 0) {
            murVar = lur.f20686a;
        } else {
            pt0 pt0Var5 = pt0.f27539a;
            if ((pt0Var == pt0Var5 && z4) || ((pt0Var == (pt0Var2 = pt0.c) && z4) || (pt0Var == (pt0Var3 = pt0.d) && z4))) {
                d4d d4dVar = d4d.PRIMARY;
                uqo0Var = new lro0();
            } else if ((pt0Var == pt0Var5 && z5) || ((pt0Var == pt0Var2 && z5) || (pt0Var == pt0Var3 && z5))) {
                d4d d4dVar2 = d4d.PRIMARY;
                uqo0Var = new eqo0();
            } else {
                pt0 pt0Var6 = pt0.b;
                if ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var4 = pt0.e) && z4)) {
                    uqo0Var = kro0.f18776a;
                } else {
                    uqo0Var = ((pt0Var == pt0Var6 && z5) || (pt0Var == pt0Var4 && z5)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                }
            }
            murVar = new mur(strA, uqo0Var);
        }
        return new st0(j, str, str2, mtrVar, n0xVar, m0xVar, num, murVar);
    }

    public static final void m(mm40 mm40Var, String str, String str2, c2 c2Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        Function1 function3;
        str.getClass();
        str2.getClass();
        c2Var.getClass();
        fetVar.g0(-734528835);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        int i3 = i2 | (fetVar.g(c2Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            function3 = function1;
            i3 |= fetVar.i(function3) ? 16384 : 8192;
        } else {
            function3 = function1;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (!fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.X();
        } else if (c2Var instanceof gfj) {
            fetVar.e0(510199410);
            v(mm40Var, str, str2, (gfj) c2Var, function2, fetVar, (i3 & 8190) | ((i3 >> 3) & 57344));
            fetVar.r(false);
        } else {
            if (!(c2Var instanceof ffj)) {
                throw b1j.f(-1507564300, fetVar, false);
            }
            fetVar.e0(510518679);
            w(mm40Var, str, str2, (ffj) c2Var, function3, fetVar, i3 & 65534);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0(mm40Var, (Object) str, (Object) str2, (Object) c2Var, function1, function2, i, (byte) 5);
        }
    }

    public static final yv6 m0(bx6 bx6Var, ctf0 ctf0Var, knb0 knb0Var, boolean z) {
        String strS;
        fx6 fx6Var;
        ctf0Var.getClass();
        tw6 tw6Var = bx6Var.b;
        a8q0 a8q0Var = bx6Var.f3362a;
        String strA = ctf0Var.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0));
        boolean z2 = tw6Var.o;
        boolean z3 = tw6Var.m;
        double d2 = tw6Var.d;
        double d3 = tw6Var.f34633a;
        mx6 mx6Var = new mx6(a8q0Var, strA, z2, true, false);
        String str = tw6Var.f;
        double dB = tw6Var.b();
        if ((d2 <= d3 && d3 <= dB) || d3 == -1.0d || (d3 > dB && z3)) {
            strS = l8x.R(tw6Var.g, tw6Var.d, str, tw6Var.e);
        } else if (d3 < d2) {
            strS = l8x.T(ctf0Var, d2, str);
        } else {
            strS = (d3 <= tw6Var.b() || z3) ? "" : l8x.S(ctf0Var, tw6Var.e, str);
        }
        boolean z4 = false;
        oln0 oln0Var = new oln0(strS, false, z3);
        String str2 = knb0Var.b;
        String str3 = knb0Var.c;
        if (z) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        xnb0 xnb0Var = new xnb0(str2, str3, knb0Var.f18577a);
        boolean z5 = tw6Var.l;
        boolean z6 = d3 > d2 && !z;
        if (d3 < tw6Var.b() && !z) {
            z4 = true;
        }
        jke jkeVar = new jke(z5, z5, z6, z4);
        if (tw6Var.n || z) {
            fx6Var = fx6.c;
        } else {
            double dB2 = tw6Var.b();
            fx6Var = ((d2 > d3 || d3 > dB2) && d3 != -1.0d && (d3 <= dB2 || !z3)) ? fx6.b : fx6.f10293a;
        }
        return new yv6(mx6Var, oln0Var, xnb0Var, jkeVar, fx6Var, str, tw6Var.j);
    }

    public static final void n(x7z x7zVar, o0b o0bVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        o0bVar.getClass();
        fetVar2.g0(-2131253887);
        int i2 = i | (fetVar2.g(x7zVar) ? 4 : 2) | (fetVar2.g(o0bVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            k7x.a(o0bVar.f24414a.a(), null, o2e.e0(o7k0.n(jm40Var, 52.0f), "CASHBACK_STEP_IMAGE"), gqw0.A, null, fetVar2, 1572912, 1976);
            mm40 mm40VarE0 = o2e.e0(o7k0.w(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), null, false, 3), "CASHBACK_STEP_TITLE");
            String str = o0bVar.b;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarE0, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(x7zVar, o0bVar, i, (byte) 9);
        }
    }

    public static final lv7 n0(hv7 hv7Var) {
        Double d2;
        Double d3;
        Double d4;
        Long l;
        Long l2;
        Integer num;
        int iIntValue = (hv7Var == null || (num = hv7Var.f13712a) == null) ? -1 : num.intValue();
        long jLongValue = 0;
        long jLongValue2 = (hv7Var == null || (l2 = hv7Var.b) == null) ? 0L : l2.longValue();
        if (hv7Var != null && (l = hv7Var.c) != null) {
            jLongValue = l.longValue();
        }
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = (hv7Var == null || (d4 = hv7Var.d) == null) ? 0.0d : d4.doubleValue();
        double dDoubleValue3 = (hv7Var == null || (d3 = hv7Var.e) == null) ? 0.0d : d3.doubleValue();
        if (hv7Var != null && (d2 = hv7Var.f) != null) {
            dDoubleValue = d2.doubleValue();
        }
        return new lv7(iIntValue, jLongValue2, jLongValue, dDoubleValue2, dDoubleValue3, dDoubleValue);
    }

    public static final void o(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var2;
        int i2;
        Unit unit;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-270209313);
        int i3 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.completed_matches, 0, fetVar), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dib(function1, (byte) 29);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mdm mdmVar = ((dfd) l7m0Var.getValue()).f5994a;
            if (mdmVar == null) {
                fetVar.e0(-226207444);
                fetVar.r(false);
                unit = null;
                i2 = i4;
            } else {
                fetVar.e0(-226207443);
                i2 = i4;
                B(mdmVar, function1, fetVar, i2);
                fetVar.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar.e0(-700029077);
                boolean z2 = (i2 == 32) | ((i3 & 14) == 4);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    l7m0Var2 = l7m0Var;
                    objP2 = new ys4(l7m0Var2, function1, (byte) 3);
                    fetVar.o0(objP2);
                } else {
                    l7m0Var2 = l7m0Var;
                }
                b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP2, fetVar, 6, 508);
                fetVar.r(false);
            } else {
                l7m0Var2 = l7m0Var;
                fetVar.e0(-700033076);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var2, function1, i, (byte) 27);
        }
    }

    public static final String o0(lf9 lf9Var, gqt0 gqt0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        switch (gqt0Var.ordinal()) {
            case 0:
                return lf9Var.b;
            case 1:
                return lf9Var.e;
            case 2:
                return lf9Var.c;
            case 3:
                return lf9Var.f19942a;
            case 4:
                return lf9Var.f;
            case 5:
                return ctf0Var.b.a(R.string.casino_tournaments_games_title, Arrays.copyOf(new Object[0], 0));
            case 6:
                return ctf0Var.b.a(R.string.tournaments_play_button, Arrays.copyOf(new Object[0], 0));
            case 7:
                return ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
            default:
                t9f.b();
                return null;
        }
    }

    public static final void p(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1032792760);
        byte b2 = 2;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            m8x.y(o7k0.c, u1c.M(1998803972, new s000(function1, l7m0Var, b2), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, i120.m, u1c.M(-486828839, new xs4(l7m0Var, function1, (byte) 6), fetVar), fetVar, 805306422, 188);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, (byte) 3);
        }
    }

    public static final tea p0(afa afaVar, long j, String str) {
        int iF = z1x.F(afaVar.b);
        tna0 tna0Var = afaVar.c;
        return new tea(iF, z1x.F(tna0Var), j, str, afaVar.b.b == tna0Var.b ? "W" : twn.m(afaVar.f769a, "+"));
    }

    public static final void q(int i, fet fetVar, l7m0 l7m0Var, Function0 function0, Function1 function1) {
        fet fetVar2;
        Function0 function2;
        Function1 function3;
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(927301561);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            dph0 dph0Var = (dph0) l7m0Var.getValue();
            if (dph0Var == null) {
                fetVar2 = fetVar;
            } else if (dph0Var instanceof aph0) {
                fetVar.e0(11435129);
                fetVar2 = fetVar;
                function2 = function0;
                function3 = function1;
                I(function2, ddz.a(0, 0, fetVar, 0, 3), function3, ((aph0) dph0Var).b, fetVar2, ((i2 >> 3) & 14) | (i2 & 896));
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                function2 = function0;
                function3 = function1;
                if (dph0Var instanceof bph0) {
                    fetVar2.e0(11749655);
                    zgc.n(((bph0) dph0Var).f2984a, null, fetVar2, 0);
                    fetVar2.r(false);
                } else if (dph0Var instanceof cph0) {
                    fetVar2.e0(11912436);
                    x1x.q(0, fetVar2);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(2078576590, fetVar2, false);
        }
        fetVar2 = fetVar;
        function2 = function0;
        function3 = function1;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hsa0(l7m0Var, function2, function3, i);
        }
    }

    public static final void r(mm40 mm40Var, vpl vplVar, float f2, Function2 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        vpl vplVar2 = vplVar;
        fet fetVar3 = fetVar;
        fetVar3.g0(1278407819);
        int i2 = i | 6 | (fetVar3.g(vplVar2) ? 32 : 16) | (fetVar3.i(function2) ? 2048 : 1024);
        if (fetVar3.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.s(o7k0.e(jm40Var, 138.0f), f2), vgg0.a(16.0f));
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar3.P();
            if (z || objP == ukd.f35823a) {
                objP = new x53(function2, vplVar2, (byte) 3);
                fetVar3.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarJ, null, null, false, null, (Function0) objP, fetVar3, 0, 15);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarF);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z2 = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            n0q n0qVar = o7k0.c;
            k7x.b(vplVar2.f.a(), null, yyw.V(n0qVar, fetVar3.k(bmd.n) == k6z.b), a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar3), a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar3), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            byte b2 = 14;
            mm40 mm40VarJ2 = s5x0.J(i120.P(n0qVar, yk5.n(q3d.j(new y3d(afn0.p(fetVar).m121getTransparent0d7_KjU()), new y3d(afn0.p(fetVar).m78getBlack800d7_KjU())), 0.0f, 0.0f, 14), null, 6), 8.0f);
            nw3 nw3Var = uc9.g;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ2);
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
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b2)), gqw0.j, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            j6n.h(vplVar.e, ghm0.t(vplVar.d), new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 0, 0, fetVar, 0, 24);
            if (vplVar.h == null) {
                fetVar.e0(-1318862713);
                fetVar.r(false);
                fetVar2 = fetVar;
            } else {
                fetVar.e0(-1318862712);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                j6n.h(vplVar.h, qro0.f29220a, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 0, 0, fetVar, 48, 24);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 96.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), xx7Var, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String str = vplVar.b;
            long jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
            afn0.v(fetVar).getClass();
            vplVar2 = vplVar;
            v8q0.a(str, mm40VarN, jM123getWhite0d7_KjU, new n05(qmk.q, qmk.y, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.s(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110576);
            String str2 = vplVar2.c;
            long jM123getWhite0d7_KjU2 = afn0.p(fetVar).m123getWhite0d7_KjU();
            afn0.v(fetVar).getClass();
            v8q0.a(str2, null, jM123getWhite0d7_KjU2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110586);
            String str3 = vplVar2.g;
            long jM123getWhite0d7_KjU3 = afn0.p(fetVar).m123getWhite0d7_KjU();
            afn0.v(fetVar).getClass();
            v8q0.a(str3, null, jM123getWhite0d7_KjU3, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar3 = fetVar;
            ohs0.x(fetVar3, true, true, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a2d(mm40Var2, (Object) vplVar2, f2, (wdr) function2, i, (byte) 5);
        }
    }

    public static final void s(mm40 mm40Var, bql bqlVar, Function0 function0, Function2 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-366343853);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bqlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (bqlVar instanceof zpl) {
            fetVar.e0(130887284);
            t(mm40Var, (zpl) bqlVar, function0, function2, fetVar, i2 & 8190);
            fetVar.r(false);
        } else {
            if (!bqlVar.equals(aql.f1301a)) {
                throw b1j.f(130884818, fetVar, false);
            }
            fetVar.e0(130896406);
            u(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0i(mm40Var, bqlVar, function0, function2, i, (byte) 2);
        }
    }

    public static final void t(mm40 mm40Var, zpl zplVar, Function0 function0, Function2 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-898287838);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(zplVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            float f2 = ((Configuration) fetVar2.k(dy2.f6873a)).screenWidthDp;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(ycl.a(f2, 360.0f) >= 0 ? 320.0f : 280.0f, fetVar2);
            }
            float f3 = ((ycl) objP).f42389a;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            mm40 mm40VarL = s5x0.L(jm40.b, xfn.a(fetVar2).e, 0.0f, 2);
            zcl zclVar2 = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
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
            int i3 = i2;
            nkb.h(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), new hjm(zplVar.f44764a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            wul wulVar = new wul(mul.e, oe9.d, new ue9(zplVar.b), true, false, false);
            boolean z2 = (i3 & 896) == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new pk9(function0, (byte) 24);
                fetVar2.o0(objP2);
            }
            qzb.n(null, wulVar, (Function0) objP2, fetVar2, 0, 1);
            fetVar2.r(true);
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ny2((Object) zplVar, f3, (Object) function2, (byte) 2);
                fetVar2.o0(objP3);
            }
            b8k0.f(null, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, Response.REQUEST_PENDING);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m0i(mm40Var, zplVar, function0, function2, i, (byte) 2);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-51113967);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            qw3 qw3Var = new qw3(10.0f, true, new jf4(b2));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, f2, 0.0f, 0.0f, 0.0f, 14), 128.0f), 20.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            mm40 mm40VarN = s5x0.N(o7k0.z(jm40Var, xx7Var, true), xfn.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.j, fetVar, 0);
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
            fetVar.e0(-1134848076);
            for (int i3 = 0; i3 < 3; i3++) {
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 280.0f), 138.0f);
                zcl zclVar4 = qmk.i;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE2), fqj0VarD0));
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 22);
        }
    }

    public static final void v(mm40 mm40Var, String str, String str2, gfj gfjVar, final Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        final gfj gfjVar2;
        fetVar.g0(1887348192);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(gfjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        int i4 = i2;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            Object obj = gfjVar.c;
            Locale locale = gfjVar.c;
            TimeOfDay23 timeOfDay23 = gfjVar.g;
            SimpleDate simpleDate = gfjVar.e;
            TimeOfDay23 timeOfDay24 = gfjVar.f;
            SimpleDate simpleDate2 = gfjVar.d;
            boolean zG = fetVar.g(obj);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = Calendar.getInstance(locale);
                fetVar.o0(objP);
            }
            Calendar calendar = (Calendar) objP;
            boolean zG2 = fetVar.g(simpleDate2) | fetVar.g(timeOfDay24) | fetVar.g(gfjVar.Q());
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj2) {
                simpleDate2.getClass();
                if (timeOfDay24 == null) {
                    timeOfDay24 = rsr0.f;
                }
                objP2 = new SimpleDateTime(simpleDate2, timeOfDay24);
                fetVar.o0(objP2);
            }
            SimpleDateTime simpleDateTime = (SimpleDateTime) objP2;
            boolean zG3 = fetVar.g(gfjVar.Q()) | fetVar.g(simpleDate) | fetVar.g(timeOfDay23);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj2) {
                simpleDate.getClass();
                if (timeOfDay23 == null) {
                    timeOfDay23 = rsr0.g;
                }
                objP3 = new SimpleDateTime(simpleDate, timeOfDay23);
                fetVar.o0(objP3);
            }
            SimpleDateTime simpleDateTime2 = (SimpleDateTime) objP3;
            boolean zG4 = fetVar.g(simpleDateTime) | fetVar.g(obj);
            Object objP4 = fetVar.P();
            if (zG4 || objP4 == obj2) {
                calendar.getClass();
                objP4 = Long.valueOf(wdx.e0(simpleDateTime, calendar));
                fetVar.o0(objP4);
            }
            long jLongValue = ((Number) objP4).longValue();
            boolean zG5 = fetVar.g(obj) | fetVar.g(simpleDateTime2);
            Object objP5 = fetVar.P();
            if (zG5 || objP5 == obj2) {
                calendar.getClass();
                objP5 = Long.valueOf(wdx.e0(simpleDateTime2, calendar));
                fetVar.o0(objP5);
            }
            long jLongValue2 = ((Number) objP5).longValue();
            boolean zF = fetVar.f(jLongValue) | fetVar.f(jLongValue2);
            Object objP6 = fetVar.P();
            if (zF || objP6 == obj2) {
                objP6 = jgk0.b(new al9((byte) 1, jLongValue, jLongValue2));
                fetVar.o0(objP6);
            }
            final l7m0 l7m0Var = (l7m0) objP6;
            Boolean bool = (Boolean) l7m0Var.getValue();
            bool.booleanValue();
            int i5 = i4 & 7168;
            int i6 = 57344 & i4;
            boolean zG6 = fetVar.g(l7m0Var) | (i5 == 2048) | (i6 == 16384);
            Object objP7 = fetVar.P();
            if (zG6 || objP7 == obj2) {
                i3 = i6;
                gfjVar2 = gfjVar;
                Object ee0Var = new ee0(gfjVar2, function1, l7m0Var, null, (byte) 18);
                fetVar.o0(ee0Var);
                objP7 = ee0Var;
            } else {
                i3 = i6;
                gfjVar2 = gfjVar;
            }
            m0x0.t(fetVar, bool, (Function2) objP7);
            boolean zG7 = fetVar.g(gfjVar2.Q()) | fetVar.g(simpleDateTime);
            Object objP8 = fetVar.P();
            if (zG7 || objP8 == obj2) {
                Object objQ = gfjVar2.Q();
                if (objQ == null) {
                    objQ = new xk9(simpleDateTime, simpleDateTime);
                }
                objP8 = objQ;
                fetVar.o0(objP8);
            }
            xk9 xk9Var = (xk9) objP8;
            SimpleDateTime simpleDateTime3 = xk9Var.f41021a;
            SimpleDateTime simpleDateTime4 = xk9Var.b;
            SimpleDate simpleDate3 = gfjVar2.d;
            SimpleDate simpleDate4 = gfjVar2.e;
            TimeOfDay23 timeOfDay25 = gfjVar2.f;
            TimeOfDay23 timeOfDay26 = gfjVar2.g;
            calendar.getClass();
            boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
            ulq0 ulq0Var = ulq0.f35886a;
            yg40 yg40Var = gfjVar2.h;
            boolean zG8 = fetVar.g(l7m0Var) | (i5 == 2048) | (i3 == 16384);
            Object objP9 = fetVar.P();
            if (zG8 || objP9 == obj2) {
                final byte b2 = 0;
                objP9 = new Function1() { // from class: a.dl9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b3 = b2;
                        l7m0 l7m0Var2 = l7m0Var;
                        Function1 function2 = function1;
                        gfj gfjVar3 = gfjVar2;
                        SimpleDateTime simpleDateTime5 = (SimpleDateTime) obj3;
                        switch (b3) {
                            case 0:
                                simpleDateTime5.getClass();
                                if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                                    xk9 xk9VarQ = gfjVar3.Q();
                                    if (xk9VarQ == null) {
                                        xk9VarQ = new xk9(simpleDateTime5, simpleDateTime5);
                                    }
                                    xk9 xk9Var2 = new xk9(simpleDateTime5, xk9VarQ.b);
                                    if (!xk9Var2.equals(gfjVar3.Q())) {
                                        gfjVar3.i.setValue(xk9Var2);
                                        function2.invoke(xk9Var2);
                                    }
                                }
                                break;
                            default:
                                simpleDateTime5.getClass();
                                if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                                    xk9 xk9VarQ2 = gfjVar3.Q();
                                    if (xk9VarQ2 == null) {
                                        xk9VarQ2 = new xk9(simpleDateTime5, simpleDateTime5);
                                    }
                                    xk9 xk9Var3 = new xk9(xk9VarQ2.f41021a, simpleDateTime5);
                                    if (!xk9Var3.equals(gfjVar3.Q())) {
                                        gfjVar3.i.setValue(xk9Var3);
                                        function2.invoke(xk9Var3);
                                    }
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP9);
            }
            Function1 function2 = (Function1) objP9;
            boolean zG9 = fetVar.g(l7m0Var) | (i5 == 2048) | (i3 == 16384);
            Object objP10 = fetVar.P();
            if (zG9 || objP10 == obj2) {
                final byte b3 = 1;
                objP10 = new Function1() { // from class: a.dl9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b4 = b3;
                        l7m0 l7m0Var2 = l7m0Var;
                        Function1 function3 = function1;
                        gfj gfjVar3 = gfjVar2;
                        SimpleDateTime simpleDateTime5 = (SimpleDateTime) obj3;
                        switch (b4) {
                            case 0:
                                simpleDateTime5.getClass();
                                if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                                    xk9 xk9VarQ = gfjVar3.Q();
                                    if (xk9VarQ == null) {
                                        xk9VarQ = new xk9(simpleDateTime5, simpleDateTime5);
                                    }
                                    xk9 xk9Var2 = new xk9(simpleDateTime5, xk9VarQ.b);
                                    if (!xk9Var2.equals(gfjVar3.Q())) {
                                        gfjVar3.i.setValue(xk9Var2);
                                        function3.invoke(xk9Var2);
                                    }
                                }
                                break;
                            default:
                                simpleDateTime5.getClass();
                                if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                                    xk9 xk9VarQ2 = gfjVar3.Q();
                                    if (xk9VarQ2 == null) {
                                        xk9VarQ2 = new xk9(simpleDateTime5, simpleDateTime5);
                                    }
                                    xk9 xk9Var3 = new xk9(xk9VarQ2.f41021a, simpleDateTime5);
                                    if (!xk9Var3.equals(gfjVar3.Q())) {
                                        gfjVar3.i.setValue(xk9Var3);
                                        function3.invoke(xk9Var3);
                                    }
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP10);
            }
            rsr0.p(mm40Var, str, str2, simpleDateTime3, simpleDateTime4, simpleDate3, simpleDate4, zBooleanValue, ulq0Var, calendar, locale, timeOfDay25, timeOfDay26, yg40Var, function2, (Function1) objP10, fetVar, (i4 & 14) | 100663296 | (i4 & 112) | (i4 & 896) | 2396160, 576, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) str, (Object) str2, (Object) gfjVar, (Object) function1, i, (byte) 6);
        }
    }

    public static final void w(mm40 mm40Var, String str, String str2, ffj ffjVar, Function1 function1, fet fetVar, int i) {
        int i2;
        Object ee0Var;
        int i3;
        final ffj ffjVar2;
        final Function1 function2;
        fetVar.g0(-819643625);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(ffjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        int i4 = i2;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            Object obj = ffjVar.c;
            Locale locale = ffjVar.c;
            SimpleDate simpleDate = ffjVar.e;
            SimpleDate simpleDate2 = ffjVar.d;
            boolean zG = fetVar.g(obj);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = Calendar.getInstance(locale);
                fetVar.o0(objP);
            }
            Calendar calendar = (Calendar) objP;
            int i5 = i4 & 7168;
            boolean zG2 = fetVar.g(simpleDate2) | fetVar.g((TimeOfDay23) ffjVar.f3600a) | (i5 == 2048);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj2) {
                objP2 = new SimpleDate(simpleDate2.f47286a, simpleDate2.b, simpleDate2.c);
                fetVar.o0(objP2);
            }
            SimpleDate simpleDate3 = (SimpleDate) objP2;
            boolean zG3 = fetVar.g((TimeOfDay23) ffjVar.b) | fetVar.g(simpleDate) | (i5 == 2048);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj2) {
                objP3 = new SimpleDate(simpleDate.f47286a, simpleDate.b, simpleDate.c);
                fetVar.o0(objP3);
            }
            SimpleDate simpleDate4 = (SimpleDate) objP3;
            boolean zG4 = fetVar.g(simpleDate3) | fetVar.g(obj);
            Object objP4 = fetVar.P();
            if (zG4 || objP4 == obj2) {
                calendar.getClass();
                objP4 = Long.valueOf(wdx.f0(simpleDate3, calendar));
                fetVar.o0(objP4);
            }
            long jLongValue = ((Number) objP4).longValue();
            boolean zG5 = fetVar.g(obj) | fetVar.g(simpleDate4);
            Object objP5 = fetVar.P();
            if (zG5 || objP5 == obj2) {
                calendar.getClass();
                objP5 = Long.valueOf(wdx.f0(simpleDate4, calendar));
                fetVar.o0(objP5);
            }
            long jLongValue2 = ((Number) objP5).longValue();
            boolean zF = fetVar.f(jLongValue) | fetVar.f(jLongValue2);
            Object objP6 = fetVar.P();
            if (zF || objP6 == obj2) {
                objP6 = jgk0.b(new al9((byte) 0, jLongValue, jLongValue2));
                fetVar.o0(objP6);
            }
            final l7m0 l7m0Var = (l7m0) objP6;
            Boolean bool = (Boolean) l7m0Var.getValue();
            bool.booleanValue();
            int i6 = 57344 & i4;
            boolean zG6 = fetVar.g(l7m0Var) | (i5 == 2048) | (i6 == 16384);
            Object objP7 = fetVar.P();
            if (zG6 || objP7 == obj2) {
                i3 = i5;
                ffjVar2 = ffjVar;
                function2 = function1;
                ee0Var = new ee0(ffjVar2, function2, l7m0Var, null, (byte) 19);
                fetVar.o0(ee0Var);
            } else {
                ee0Var = objP7;
                i3 = i5;
                ffjVar2 = ffjVar;
                function2 = function1;
            }
            m0x0.t(fetVar, bool, (Function2) ee0Var);
            boolean zG7 = fetVar.g(ffjVar2.Q()) | fetVar.g(simpleDate3);
            Object objP8 = fetVar.P();
            if (zG7 || objP8 == obj2) {
                Object objQ = ffjVar2.Q();
                if (objQ == null) {
                    objQ = new wk9(simpleDate3, simpleDate3);
                }
                objP8 = objQ;
                fetVar.o0(objP8);
            }
            wk9 wk9Var = (wk9) objP8;
            SimpleDate simpleDate5 = wk9Var.f39296a;
            TimeOfDay23 timeOfDay23 = rsr0.f;
            SimpleDateTime simpleDateTime = new SimpleDateTime(simpleDate5, timeOfDay23);
            SimpleDateTime simpleDateTime2 = new SimpleDateTime(wk9Var.b, timeOfDay23);
            SimpleDate simpleDate6 = ffjVar2.d;
            SimpleDate simpleDate7 = ffjVar2.e;
            calendar.getClass();
            boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
            ulq0 ulq0Var = ulq0.b;
            boolean zG8 = fetVar.g(l7m0Var) | (i3 == 2048) | (i6 == 16384);
            Object objP9 = fetVar.P();
            if (zG8 || objP9 == obj2) {
                final byte b2 = 0;
                objP9 = new Function1() { // from class: a.cl9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b3 = b2;
                        l7m0 l7m0Var2 = l7m0Var;
                        Function1 function3 = function2;
                        ffj ffjVar3 = ffjVar2;
                        SimpleDateTime simpleDateTime3 = (SimpleDateTime) obj3;
                        switch (b3) {
                            case 0:
                                simpleDateTime3.getClass();
                                SimpleDate simpleDate8 = simpleDateTime3.f47285a;
                                if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                                    wk9 wk9VarQ = ffjVar3.Q();
                                    if (wk9VarQ == null) {
                                        wk9VarQ = new wk9(simpleDate8, simpleDate8);
                                    }
                                    wk9 wk9Var2 = new wk9(simpleDate8, wk9VarQ.b);
                                    if (!wk9Var2.equals(ffjVar3.Q())) {
                                        ffjVar3.f.setValue(wk9Var2);
                                        function3.invoke(wk9Var2);
                                    }
                                }
                                break;
                            default:
                                simpleDateTime3.getClass();
                                SimpleDate simpleDate9 = simpleDateTime3.f47285a;
                                if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                                    wk9 wk9VarQ2 = ffjVar3.Q();
                                    if (wk9VarQ2 == null) {
                                        wk9VarQ2 = new wk9(simpleDate9, simpleDate9);
                                    }
                                    wk9 wk9Var3 = new wk9(wk9VarQ2.f39296a, simpleDate9);
                                    if (!wk9Var3.equals(ffjVar3.Q())) {
                                        ffjVar3.f.setValue(wk9Var3);
                                        function3.invoke(wk9Var3);
                                    }
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP9);
            }
            Function1 function3 = (Function1) objP9;
            boolean zG9 = fetVar.g(l7m0Var) | (i3 == 2048) | (i6 == 16384);
            Object objP10 = fetVar.P();
            if (zG9 || objP10 == obj2) {
                final byte b3 = 1;
                objP10 = new Function1() { // from class: a.cl9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b4 = b3;
                        l7m0 l7m0Var2 = l7m0Var;
                        Function1 function4 = function2;
                        ffj ffjVar3 = ffjVar2;
                        SimpleDateTime simpleDateTime3 = (SimpleDateTime) obj3;
                        switch (b4) {
                            case 0:
                                simpleDateTime3.getClass();
                                SimpleDate simpleDate8 = simpleDateTime3.f47285a;
                                if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                                    wk9 wk9VarQ = ffjVar3.Q();
                                    if (wk9VarQ == null) {
                                        wk9VarQ = new wk9(simpleDate8, simpleDate8);
                                    }
                                    wk9 wk9Var2 = new wk9(simpleDate8, wk9VarQ.b);
                                    if (!wk9Var2.equals(ffjVar3.Q())) {
                                        ffjVar3.f.setValue(wk9Var2);
                                        function4.invoke(wk9Var2);
                                    }
                                }
                                break;
                            default:
                                simpleDateTime3.getClass();
                                SimpleDate simpleDate9 = simpleDateTime3.f47285a;
                                if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                                    wk9 wk9VarQ2 = ffjVar3.Q();
                                    if (wk9VarQ2 == null) {
                                        wk9VarQ2 = new wk9(simpleDate9, simpleDate9);
                                    }
                                    wk9 wk9Var3 = new wk9(wk9VarQ2.f39296a, simpleDate9);
                                    if (!wk9Var3.equals(ffjVar3.Q())) {
                                        ffjVar3.f.setValue(wk9Var3);
                                        function4.invoke(wk9Var3);
                                    }
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP10);
            }
            rsr0.p(mm40Var, str, str2, simpleDateTime, simpleDateTime2, simpleDate6, simpleDate7, zBooleanValue, ulq0Var, calendar, locale, null, null, null, function3, (Function1) objP10, fetVar, (i4 & 14) | 100663296 | (i4 & 112) | (i4 & 896) | 2396160, 432, 8192);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) str, (Object) str2, (Object) ffjVar, (Object) function1, i, (byte) 5);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(882396810);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarN, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, (i2 >> 3) & 14, 0, 131064);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 24);
        }
    }

    public static final void y(mm40 mm40Var, cmm cmmVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        cmmVar.getClass();
        function1.getClass();
        fetVar.g0(-597426729);
        int i2 = (fetVar.g(cmmVar) ? 32 : 16) | i | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 56.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            i1i i1iVar = cmmVar.f4611a;
            if (i1iVar.equals(f1i.f8765a)) {
                fetVar.e0(-1009747251);
                L(o2e.e0(mm40Var, "LOGO_CENTER"), cmmVar, function1, function2, fetVar, i2 & 8176);
                fetVar.r(false);
            } else if (i1iVar.equals(g1i.f10513a)) {
                fetVar.e0(-1009738903);
                M(o2e.e0(mm40Var, "LOGO_LEFT"), cmmVar, function1, function2, fetVar, i2 & 8176);
                fetVar.r(false);
            } else {
                if (!i1iVar.equals(h1i.f12284a)) {
                    throw b1j.f(-1009748987, fetVar, false);
                }
                fetVar.e0(-1009730645);
                N(o2e.e0(mm40Var, "LOGO_RIGHT"), cmmVar, function1, function2, fetVar, i2 & 8176);
                fetVar.r(false);
            }
            fetVar.e0(-1236462715);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((Object) mm40Var, (Object) cmmVar, function1, (wdr) function2, i, (byte) 18);
        }
    }

    public static final void z(mdm mdmVar, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-1948529044);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i;
        byte b2 = 3;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new os7((byte) 17);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(mm40VarB, mdmVar2, false, (Function0) objP, fetVar2, ((i2 << 3) & 112) | 3072, 4);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i, b2);
        }
    }
}
