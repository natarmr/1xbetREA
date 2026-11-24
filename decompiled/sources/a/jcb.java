package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLException;
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
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleRoulette;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jcb {
    public static final void A(long j, sd sdVar, rd rdVar, fet fetVar, int i) {
        fetVar.g0(565558476);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(sdVar) ? 32 : 16) | (fetVar.g(rdVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.u(jm40Var, 48.0f, 0.0f, 2), 24.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 0.0f, 0.0f, 4.0f, 0.0f, 11);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
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
            t(s5x0.N(jm40Var, 2.0f, 2.0f, 0.0f, 2.0f, 4), 360.0f, 20.0f, fetVar, 0);
            if (sdVar == null) {
                fetVar.e0(1064038650);
                fetVar.r(false);
            } else {
                fetVar.e0(1064038651);
                ecu0 ecu0Var = new ecu0(yx7Var);
                y3d y3dVar = rdVar != null ? rdVar.f30265a : null;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                G(ecu0Var, sdVar, g1t0.d(), qmk.q, y3dVar, fetVar, i2 & 112);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yil(j, sdVar, rdVar, i, (byte) 0);
        }
    }

    public static final void B(long j, sd sdVar, rd rdVar, fet fetVar, int i) {
        fet fetVar2;
        long j2;
        long j3;
        boolean z;
        fetVar.g0(1897245156);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(sdVar) ? 32 : 16) | (fetVar.g(rdVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = o7k0.u(o7k0.e(jm40Var, 24.0f), 48.0f, 0.0f, 2);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarU, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 0.0f, 0.0f, 6.0f, 0.0f, 11);
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
            t(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 360.0f, 24.0f, fetVar, 0);
            if (sdVar == null) {
                fetVar.e0(-329985508);
                fetVar.r(false);
                fetVar2 = fetVar;
                z = true;
            } else {
                fetVar.e0(-329985507);
                mm40 mm40VarN2 = s5x0.N(new ecu0(gqw0.k), 0.0f, 0.0f, 6.0f, 0.0f, 11);
                String str = sdVar.f32009a;
                String str2 = sdVar.b;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarI = g1t0.i();
                long j4 = qmk.s;
                long j5 = qmk.q;
                y3d y3dVar = rdVar != null ? rdVar.f30265a : null;
                if (y3dVar == null) {
                    fetVar.e0(1494544166);
                    long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                    fetVar.r(false);
                    j3 = j4;
                    j2 = textPrimary;
                } else {
                    fetVar.e0(1494542957);
                    fetVar.r(false);
                    j2 = y3dVar.f41946a;
                    j3 = j4;
                }
                paq0.b(mm40VarN2, str, str2, j2, y9q0VarI, j3, j5, 0.0f, fetVar, 0, 128);
                fetVar2 = fetVar;
                fetVar2.r(false);
                z = true;
            }
            fetVar2.r(z);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yil(j, sdVar, rdVar, i, (byte) 2);
        }
    }

    public static final void C(long j, sd sdVar, rd rdVar, fet fetVar, int i) {
        long j2;
        shd shdVar;
        pcy pcyVar;
        jr8 jr8Var;
        jm40 jm40Var;
        boolean z;
        long backgroundContent;
        pcy pcyVar2;
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.e;
        fetVar2.g0(-396218871);
        int i2 = i | (fetVar2.f(j) ? 4 : 2) | (fetVar2.g(sdVar) ? 32 : 16) | (fetVar2.g(rdVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar4);
            jpm0.n(fetVar2);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar5);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(o7k0.e(s5x0.N(jm40Var2, 0.0f, 6.0f, 8.0f, 0.0f, 9), 28.0f), 48.0f, 0.0f, 2);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = o7k0.e(i120.Q(mm40VarU, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 28.0f);
            zx7 zx7Var3 = gqw0.d;
            jr8 jr8Var2 = jr8.f16991a;
            mm40 mm40VarB = jr8Var2.b(mm40VarE, zx7Var3);
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar2);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar4, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar5);
            if (sdVar == null) {
                fetVar2.e0(1663753875);
                fetVar2.r(false);
                z = false;
                shdVar = shdVar3;
                pcyVar = pcyVar3;
                jm40Var = jm40Var2;
                jr8Var = jr8Var2;
            } else {
                fetVar2.e0(1663753876);
                mm40 mm40VarN = s5x0.N(jr8Var2.b(jm40Var2, zx7Var), 10.0f, 0.0f, 10.0f, 0.0f, 10);
                String str = sdVar.f32009a;
                String str2 = sdVar.b;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarL = g1t0.l();
                long j3 = qmk.q;
                long j4 = qmk.r;
                y3d y3dVar = rdVar != null ? rdVar.f30265a : null;
                if (y3dVar == null) {
                    fetVar2.e0(72242725);
                    long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                    fetVar2.r(false);
                    j2 = textPrimary;
                } else {
                    fetVar2.e0(72241516);
                    fetVar2.r(false);
                    j2 = y3dVar.f41946a;
                }
                shdVar = shdVar3;
                pcyVar = pcyVar3;
                long j5 = j2;
                jr8Var = jr8Var2;
                jm40Var = jm40Var2;
                z = false;
                paq0.b(mm40VarN, str, str2, j5, y9q0VarL, j4, j3, 0.0f, fetVar2, 0, 128);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            y3d y3dVar2 = rdVar != null ? rdVar.b : null;
            if (y3dVar2 == null) {
                fetVar2.e0(56506304);
                backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                fetVar2.r(z);
            } else {
                fetVar2.e0(56505033);
                fetVar2.r(z);
                backgroundContent = y3dVar2.f41946a;
            }
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarB2 = jr8Var.b(o7k0.n(i120.Q(jm40Var, backgroundContent, ugg0Var2), 20.0f), gqw0.c);
            tj30 tj30VarC3 = zq8.c(zx7Var2, z);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarB2);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar2 = pcyVar;
                fetVar2.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar2);
            shd shdVar6 = shdVar;
            jpm0.o(fetVar2, bh90VarM3, shdVar6);
            vqd.u(iHashCode3, fetVar2, shdVar4, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar5);
            mm40 mm40VarB3 = jr8Var.b(jm40Var, zx7Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarN2 = o7k0.n(i120.Q(mm40VarB3, ((ThemeColors) fetVar2.k(zfnVar)).getCommerce(), ugg0Var2), 16.0f);
            tj30 tj30VarC4 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC4, shdVar2);
            jpm0.o(fetVar2, bh90VarM4, shdVar6);
            vqd.u(iHashCode4, fetVar2, shdVar4, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar5);
            fetVar2.r(true);
            dww.c(a8k0.F(R.drawable.ic_glyph_replenish, 0, fetVar2), null, o7k0.e(jr8Var.b(jm40Var, zx7Var), 20.0f), ((ThemeColors) fetVar2.k(zfnVar)).getCommerceForeground(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yil(j, sdVar, rdVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void D(long j, sd sdVar, rd rdVar, fet fetVar, int i) {
        fet fetVar2;
        boolean z;
        long textPrimary;
        jm40 jm40Var;
        jr8 jr8Var;
        boolean z2;
        fet fetVar3;
        ?? r2;
        fetVar.g0(37051710);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(sdVar) ? 32 : 16) | (fetVar.g(rdVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
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
            mm40 mm40VarE = o7k0.e(o7k0.u(jm40Var2, 48.0f, 0.0f, 2), 20.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            zx7 zx7Var2 = gqw0.d;
            jr8 jr8Var2 = jr8.f16991a;
            mm40 mm40VarB = jr8Var2.b(mm40VarQ, zx7Var2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
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
            if (sdVar == null) {
                fetVar.e0(-1365148936);
                fetVar.r(false);
                fetVar3 = fetVar;
                r2 = 0;
                jm40Var = jm40Var2;
                jr8Var = jr8Var2;
                z2 = true;
            } else {
                fetVar.e0(-1365148935);
                mm40 mm40VarN = s5x0.N(jr8Var2.b(jm40Var2, gqw0.e), 28.0f, 0.0f, 6.0f, 0.0f, 10);
                String str = sdVar.f32009a;
                String str2 = sdVar.b;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarL = g1t0.l();
                jm40 jm40Var3 = jm40Var2;
                long j2 = qmk.r;
                long j3 = qmk.q;
                y3d y3dVar = rdVar != null ? rdVar.f30265a : null;
                if (y3dVar == null) {
                    fetVar.e0(55968922);
                    textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                    z = false;
                    fetVar.r(false);
                } else {
                    z = false;
                    fetVar.e0(55967713);
                    fetVar.r(false);
                    textPrimary = y3dVar.f41946a;
                    jm40Var3 = jm40Var3;
                }
                jm40Var = jm40Var3;
                jr8Var = jr8Var2;
                boolean z4 = z;
                z2 = true;
                paq0.b(mm40VarN, str, str2, textPrimary, y9q0VarL, j2, j3, 0.0f, fetVar, 0, 128);
                fet fetVar4 = fetVar;
                fetVar4.r(z4);
                r2 = z4;
                fetVar3 = fetVar4;
            }
            fetVar3.r(z2);
            t(jr8Var.b(jm40Var, zx7Var2), 8.0f, 24.0f, fetVar3, r2);
            fetVar3.r(z2);
            fetVar2 = fetVar3;
        } else {
            fet fetVar5 = fetVar;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yil(j, sdVar, rdVar, i, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(sd sdVar, rd rdVar, fet fetVar, int i) {
        byte b;
        fet fetVar2;
        long commerce;
        boolean z;
        long commerceForeground;
        fet fetVar3;
        boolean z2;
        long commerceForeground2;
        fet fetVar4;
        boolean z3;
        fet fetVar5 = fetVar;
        fetVar5.g0(133183963);
        int i2 = i | (fetVar5.g(sdVar) ? 4 : 2) | (fetVar5.g(rdVar) ? 32 : 16);
        if (fetVar5.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.u(jm40Var, 48.0f, 0.0f, 2), 28.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            y3d y3dVar = rdVar != null ? rdVar.c : null;
            if (y3dVar == null) {
                fetVar5.e0(-859219005);
                commerce = ((ThemeColors) fetVar5.k(zaq0.b)).getCommerce();
                fetVar5.r(false);
            } else {
                fetVar5.e0(-859220400);
                fetVar5.r(false);
                commerce = y3dVar.f41946a;
            }
            mm40 mm40VarE2 = o7k0.e(i120.Q(mm40VarE, commerce, ugg0Var2), 28.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar5, 48);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarE2);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            I(0, fetVar5, s5x0.J(jm40Var, 4.0f).e(new ecu0(yx7Var)));
            if (sdVar == null) {
                fetVar5.e0(-1009342142);
                fetVar5.r(false);
                z2 = true;
                z3 = false;
                fetVar4 = fetVar5;
            } else {
                String str = sdVar.f32009a;
                fetVar5.e0(-1009342141);
                if (str.length() <= 0 || !Intrinsics.c(kotlin.text.b.i(str), 0.0d)) {
                    z = false;
                    fetVar5.e0(-1381973764);
                    mm40 mm40VarN = s5x0.N(new ecu0(yx7Var), 0.0f, 0.0f, 6.0f, 0.0f, 11);
                    String str2 = sdVar.f32009a;
                    y3d y3dVar2 = null;
                    String str3 = sdVar.b;
                    ((g1t0) fetVar5.k(j1t0.e)).getClass();
                    y9q0 y9q0VarL = g1t0.l();
                    long j = qmk.q;
                    long j2 = qmk.r;
                    if (rdVar != null) {
                        y3dVar2 = rdVar.f30265a;
                    }
                    if (y3dVar2 == null) {
                        fetVar5.e0(925266852);
                        commerceForeground = ((ThemeColors) fetVar5.k(zaq0.b)).getCommerceForeground();
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(925265643);
                        fetVar5.r(false);
                        commerceForeground = y3dVar2.f41946a;
                    }
                    paq0.b(mm40VarN, str2, str3, commerceForeground, y9q0VarL, j2, j, 0.0f, fetVar5, 0, 128);
                    fetVar5.r(false);
                    fetVar3 = fetVar5;
                } else {
                    fetVar5.e0(-1381405224);
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
                    String str4 = sdVar.c;
                    ((g1t0) fetVar5.k(j1t0.e)).getClass();
                    y9q0 y9q0VarL2 = g1t0.l();
                    y3d y3dVar3 = rdVar != null ? rdVar.f30265a : null;
                    if (y3dVar3 == null) {
                        fetVar5.e0(925278084);
                        commerceForeground2 = ((ThemeColors) fetVar5.k(zaq0.b)).getCommerceForeground();
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(925276875);
                        fetVar5.r(false);
                        commerceForeground2 = y3dVar3.f41946a;
                    }
                    z = false;
                    v8q0.a(str4, mm40VarN2, commerceForeground2, new n05(qmk.p, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarL2, fetVar, 0, 24960, 110576);
                    fet fetVar6 = fetVar;
                    fetVar6.r(false);
                    fetVar3 = fetVar6;
                }
                fetVar3.r(z);
                z2 = true;
                z3 = z;
                fetVar4 = fetVar3;
            }
            fetVar4.r(z2);
            b = z3;
            fetVar2 = fetVar4;
        } else {
            b = 0;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zil(sdVar, rdVar, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(sd sdVar, rd rdVar, fet fetVar, int i) {
        byte b;
        long textPrimary;
        boolean z;
        fetVar.g0(1863183137);
        int i2 = i | (fetVar.g(sdVar) ? 4 : 2) | (fetVar.g(rdVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = o7k0.u(jm40Var, 48.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            t(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 360.0f, 20.0f, fetVar, 0);
            if (sdVar == null) {
                fetVar.e0(1962690559);
                fetVar.r(false);
                z = true;
            } else {
                fetVar.e0(1962690560);
                ecu0 ecu0Var = new ecu0(gqw0.k);
                String str = sdVar.f32009a;
                String str2 = sdVar.b;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarI = g1t0.i();
                long j = qmk.s;
                long j2 = qmk.q;
                y3d y3dVar = rdVar != null ? rdVar.f30265a : null;
                if (y3dVar == null) {
                    fetVar.e0(707613731);
                    textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                    fetVar.r(false);
                } else {
                    fetVar.e0(707612522);
                    fetVar.r(false);
                    textPrimary = y3dVar.f41946a;
                }
                paq0.b(ecu0Var, str, str2, textPrimary, y9q0VarI, j, j2, 0.0f, fetVar, 0, 128);
                fetVar.r(false);
                z = true;
            }
            fetVar.r(z);
            b = z;
        } else {
            b = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zil(sdVar, rdVar, i, b);
        }
    }

    public static final void G(mm40 mm40Var, sd sdVar, y9q0 y9q0Var, long j, y3d y3dVar, fet fetVar, int i) {
        fetVar.g0(-1379926068);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(sdVar) ? 32 : 16) | (fetVar.g(y9q0Var) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024) | (fetVar.g(y3dVar) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (sdVar != null) {
                fetVar.e0(2049776921);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1000193369, new jx1((byte) 2, j, (Object) mm40Var, (Object) sdVar, (Object) y9q0Var, (Object) y3dVar, (Object) pz40Var), fetVar), fetVar, 56);
                fetVar.r(false);
            } else {
                fetVar.e0(2051291147);
                zcl zclVar = qmk.f28987a;
                zq8.a(0, fetVar, o7k0.e(o7k0.s(mm40Var, 34.0f), 14.0f));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new si6(mm40Var, sdVar, y9q0Var, j, y3dVar, i, (byte) 3);
        }
    }

    public static final void H(mm40 mm40Var, float f, long j, fet fetVar, int i, int i2) {
        int i3;
        fetVar.g0(-1534852205);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        byte b = 0;
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            } else if (i4 != 0) {
                f = swk.f32925a;
            }
            fetVar.s();
            mm40 mm40VarS = o7k0.s(o7k0.c(mm40Var, 1.0f), f);
            boolean z2 = (i3 & 112) == 32;
            if ((((i3 & 896) ^ 384) <= 256 || !fetVar.f(j)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new wwk(f, j, b);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarS, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        float f2 = f;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xwk(mm40Var, f2, j, i, i2, (byte) 0);
        }
    }

    public static final void I(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-600375046);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.d(8.0f) ? 32 : 16) | (fetVar.d(20.0f) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ugg0 ugg0VarA = vgg0.a(8.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.n(i120.Q(mm40Var, ((ThemeColors) fetVar.k(zfnVar)).getCommerceForeground(), ugg0VarA), 20.0f), "GREEN_PLUS_ICON");
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_replenish, 0, fetVar), null, o7k0.e(jr8.f16991a.b(jm40.b, zx7Var), 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getCommerce(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 22);
        }
    }

    public static final void J(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((o7b0) yfu0Var).d.setAccordionExpanded(((fcb) cpVar.u()).c);
        ((o7b0) yfu0Var).f24779a.setRoundedBottom(!((fcb) cpVar.u()).c);
    }

    public static final void K(EventCardMiddleRoulette eventCardMiddleRoulette, ywr ywrVar) {
        String str = ywrVar.f43385a;
        int i = ywrVar.b;
        str.getClass();
        jg jgVar = eventCardMiddleRoulette.q;
        ((TextView) jgVar.i).setText(str);
        ((TextView) jgVar.i).setBackground(eventCardMiddleRoulette.getContext().getDrawable(i));
    }

    public static final void L(EventCardMiddleRoulette eventCardMiddleRoulette, axr axrVar) {
        eventCardMiddleRoulette.setPlayerOneName(axrVar.f1635a);
        if (axrVar.d) {
            eventCardMiddleRoulette.setFirstTeamLogo(R.drawable.ic_home);
            return;
        }
        Context context = eventCardMiddleRoulette.getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(R.drawable.no_photo_new);
        String str = axrVar.c;
        jg jgVar = eventCardMiddleRoulette.q;
        if (str.length() > 0) {
            ((DsTeamLogo) jgVar.e).setImageTintList(null);
        }
        LoadableShapeableImageView.i((DsTeamLogo) jgVar.e, str, drawable, 12);
    }

    public static final void M(EventCardMiddleRoulette eventCardMiddleRoulette, ywr ywrVar) {
        String str = ywrVar.f43385a;
        int i = ywrVar.b;
        str.getClass();
        jg jgVar = eventCardMiddleRoulette.q;
        ((TextView) jgVar.j).setText(str);
        ((TextView) jgVar.j).setBackground(eventCardMiddleRoulette.getContext().getDrawable(i));
    }

    public static final void N(EventCardMiddleRoulette eventCardMiddleRoulette, ywr ywrVar) {
        String str = ywrVar.f43385a;
        int i = ywrVar.b;
        str.getClass();
        jg jgVar = eventCardMiddleRoulette.q;
        ((TextView) jgVar.k).setText(str);
        ((TextView) jgVar.k).setBackground(eventCardMiddleRoulette.getContext().getDrawable(i));
    }

    public static final void O(EventCardMiddleRoulette eventCardMiddleRoulette, fxr fxrVar) {
        if (fxrVar.d) {
            eventCardMiddleRoulette.setSecondTeamLogo(R.drawable.ic_home);
        } else {
            Context context = eventCardMiddleRoulette.getContext();
            context.getClass();
            Drawable drawable = context.getDrawable(R.drawable.no_photo_new);
            String str = fxrVar.c;
            jg jgVar = eventCardMiddleRoulette.q;
            if (str.length() > 0) {
                ((DsTeamLogo) jgVar.g).setImageTintList(null);
            }
            LoadableShapeableImageView.i((DsTeamLogo) jgVar.g, str, drawable, 12);
        }
        eventCardMiddleRoulette.setPlayerTwoName(fxrVar.f10323a);
    }

    public static final void P(EventCardMiddleRoulette eventCardMiddleRoulette, ywr ywrVar) {
        String str = ywrVar.f43385a;
        int i = ywrVar.b;
        str.getClass();
        jg jgVar = eventCardMiddleRoulette.q;
        ((TextView) jgVar.l).setText(str);
        ((TextView) jgVar.l).setBackground(eventCardMiddleRoulette.getContext().getDrawable(i));
    }

    public static final void Q(EventCardMiddleRoulette eventCardMiddleRoulette, ywr ywrVar) {
        String str = ywrVar.f43385a;
        int i = ywrVar.b;
        str.getClass();
        jg jgVar = eventCardMiddleRoulette.q;
        ((TextView) jgVar.m).setText(str);
        ((TextView) jgVar.m).setBackground(eventCardMiddleRoulette.getContext().getDrawable(i));
    }

    public static final a4x R(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q8h q8hVar = (q8h) it.next();
            arrayList.add(new hfa0(kkg.j, String.valueOf(q8hVar.f28299a), q8hVar.b, q8hVar.e, q8hVar.f, Intrinsics.d(String.valueOf(q8hVar.f28299a), str)));
        }
        return dyb.o0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    public static final qgm0 S(long j, ctf0 ctf0Var, String str, String str2) {
        ctf0Var.getClass();
        str.getClass();
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        ngm0 ngm0Var = new ngm0(j, str, str2, "");
        lsm0 lsm0Var = ctf0Var.b;
        return new qgm0(ngm0Var, dyb.g0(new uem0(lsm0Var.a(R.string.valorant_gun, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_k, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_a, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_d, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_plus_minus, Arrays.copyOf(new Object[0], 0)), new eko0(j))));
    }

    public static final boolean T(gx4 gx4Var) {
        dx6 dx6Var = gx4Var.c;
        xyc xycVar = gx4Var.b;
        BigDecimal bigDecimal = xycVar.d;
        BigDecimal bigDecimal2 = xycVar.f41701a;
        vw6 vw6Var = dx6Var.b;
        if (!vw6Var.j) {
            return vw6Var.k && !bigDecimal2.equals(new BigDecimal(String.valueOf(-1.0d))) && bigDecimal2.compareTo(bigDecimal) >= 0;
        }
        double d = vw6Var.f38133a;
        if (d == -1.0d) {
            return false;
        }
        return vw6Var.d <= d && d <= vw6Var.e && !bigDecimal2.equals(new BigDecimal(String.valueOf(-1.0d))) && bigDecimal2.compareTo(bigDecimal) >= 0;
    }

    public static final boolean U(vw6 vw6Var) {
        boolean z = vw6Var.j;
        double d = vw6Var.f38133a;
        if (!z) {
            return vw6Var.k;
        }
        if (d == -1.0d) {
            return false;
        }
        double d2 = vw6Var.d;
        double dB = vw6Var.b();
        if (d2 > d || d > dB) {
            return vw6Var.m && d > vw6Var.b();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    public static final bv9 V(cdk cdkVar, boolean z) {
        bfy bfyVar;
        Method method;
        bv9 ov9Var;
        vfy vfyVar;
        bv9 qv9Var;
        Field fieldY;
        g950 g950Var;
        wm40 wm40Var;
        if (ihy.f14802a.g(cdkVar.B().j)) {
            return ddq0.f5908a;
        }
        qlc qlcVar = sog0.f32540a;
        g1x g1xVarB = sog0.b(cdkVar.B().z());
        Class clsQ = null;
        if (g1xVarB instanceof qfy) {
            qfy qfyVar = (qfy) g1xVarB;
            h950 h950Var = qfyVar.d;
            xfy xfyVar = qfyVar.c;
            if (z) {
                if (xfyVar.j()) {
                    vfyVar = xfyVar.e;
                } else {
                    vfyVar = null;
                }
            } else if ((xfyVar.b & 8) == 8) {
                vfyVar = xfyVar.f;
            } else {
                vfyVar = null;
            }
            Method methodB = vfyVar != null ? cdkVar.B().h.B(h950Var.getString(vfyVar.c), h950Var.getString(vfyVar.d)) : null;
            if (methodB == null) {
                d0d0 d0d0VarZ = cdkVar.B().z();
                int i = ddx.f5919a;
                d0d0VarZ.getClass();
                if (d0d0VarZ.F() == null && d0d0VarZ.W().isEmpty()) {
                    vjj vjjVarJ = d0d0VarZ.j();
                    wm40 wm40Var2 = vjjVarJ instanceof wm40 ? (wm40) vjjVarJ : null;
                    if (wm40Var2 != null) {
                        int i2 = rek.f30339a;
                        k2u0 k2u0VarN0 = wm40Var2.n0();
                        cdx cdxVar = k2u0VarN0 instanceof cdx ? (cdx) k2u0VarN0 : null;
                        if (cdxVar != null) {
                            g950Var = cdxVar.f4185a;
                        } else {
                            g950Var = null;
                        }
                    } else {
                        g950Var = null;
                    }
                    if (Intrinsics.d(g950Var, d0d0VarZ.getName()) && Intrinsics.d(cdkVar.B().z().getVisibility(), uek.d)) {
                        vjj vjjVarJ2 = cdkVar.B().z().j();
                        if ((vjjVarJ2 instanceof wm40) && ddx.a(vjjVarJ2) && (clsQ = xtt0.q((wm40Var = (wm40) vjjVarJ2))) == null) {
                            StringBuilder sb = new StringBuilder("Class object for the class ");
                            sb.append(wm40Var.getName());
                            qlc qlcVarF = rek.f((foc) vjjVarJ2);
                            sb.append(" cannot be found (classId=");
                            sb.append(qlcVarF);
                            sb.append(')');
                            throw new poe(sb.toString());
                        }
                        if (clsQ == null) {
                            throw new poe("Underlying property of inline class " + cdkVar.B() + " should have a field");
                        }
                        Method methodL = gnm0.l(clsQ, cdkVar.B());
                        ov9Var = fre0.W(cdkVar) ? new rmx(methodL, fre0.P(cdkVar.B())) : new smx(methodL);
                    } else {
                        fieldY = cdkVar.B().y();
                        if (fieldY != null) {
                            ohq.t(cdkVar.B(), "No accessors or field is found for property ");
                            return null;
                        }
                        ov9Var = W(cdkVar, z, fieldY);
                    }
                } else {
                    fieldY = cdkVar.B().y();
                    if (fieldY != null) {
                        ohq.t(cdkVar.B(), "No accessors or field is found for property ");
                        return null;
                    }
                    ov9Var = W(cdkVar, z, fieldY);
                }
            } else {
                if (!Modifier.isStatic(methodB.getModifiers())) {
                    qv9Var = fre0.W(cdkVar) ? new ov9(methodB, fre0.P(cdkVar.B())) : new rv9((byte) 0, 6, methodB, false);
                } else if (cdkVar.B().z().getAnnotations().z0(xtt0.f41480a)) {
                    qv9Var = fre0.W(cdkVar) ? new pv9(methodB, false, 4) : new rv9((byte) 1, 4, methodB, true);
                } else {
                    qv9Var = fre0.W(cdkVar) ? new qv9(methodB, false, fre0.P(cdkVar.B())) : new rv9((byte) 2, 6, methodB, false);
                }
                ov9Var = qv9Var;
            }
        } else if (g1xVarB instanceof ofy) {
            ov9Var = W(cdkVar, z, ((ofy) g1xVarB).f25190a);
        } else {
            if (!(g1xVarB instanceof pfy)) {
                if (!(g1xVarB instanceof rfy)) {
                    t9f.b();
                    return null;
                }
                if (z) {
                    bfyVar = ((rfy) g1xVarB).f30408a;
                } else {
                    bfyVar = ((rfy) g1xVarB).b;
                    if (bfyVar == null) {
                        ohq.t(cdkVar.B(), "No setter found for property ");
                        return null;
                    }
                }
                ihy ihyVar = cdkVar.B().h;
                dfy dfyVar = bfyVar.f2527a;
                Method methodB2 = ihyVar.B(dfyVar.b, dfyVar.c);
                if (methodB2 != null) {
                    Modifier.isStatic(methodB2.getModifiers());
                    return fre0.W(cdkVar) ? new ov9(methodB2, fre0.P(cdkVar.B())) : new rv9((byte) 0, 6, methodB2, false);
                }
                ohq.t(cdkVar.B(), "No accessor found for property ");
                return null;
            }
            if (z) {
                method = ((pfy) g1xVarB).f26927a;
            } else {
                pfy pfyVar = (pfy) g1xVarB;
                method = pfyVar.b;
                if (method == null) {
                    ohq.t(pfyVar.f26927a, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            ov9Var = fre0.W(cdkVar) ? new ov9(method, fre0.P(cdkVar.B())) : new rv9((byte) 0, 6, method, false);
        }
        return gnm0.j(ov9Var, cdkVar, iun.f15405a, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    public static final sv9 W(cdk cdkVar, boolean z, Field field) {
        d0d0 d0d0VarZ = cdkVar.B().z();
        vjj vjjVarJ = d0d0VarZ.j();
        vjjVarJ.getClass();
        if (oek.l(vjjVarJ)) {
            vjj vjjVarJ2 = vjjVarJ.j();
            if ((oek.m(vjjVarJ2, slc.b) || oek.m(vjjVarJ2, slc.e)) && (!(d0d0VarZ instanceof rfk) || !egy.d(((rfk) d0d0VarZ).B))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (cdkVar.B().z().getAnnotations().z0(xtt0.f41480a)) {
                        if (z) {
                        }
                    }
                    if (z) {
                        if (fre0.W(cdkVar)) {
                        }
                    }
                    if (fre0.W(cdkVar)) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (cdkVar.B().z().getAnnotations().z0(xtt0.f41480a)) {
                return z ? new iv9(field, false, (byte) 2) : new mv9(field, X(cdkVar), false, (byte) 2);
            }
            if (z) {
                return fre0.W(cdkVar) ? new hv9(field, false) : new iv9(field, true, (byte) 1);
            }
            return fre0.W(cdkVar) ? new lv9(field, X(cdkVar), false) : new mv9(field, X(cdkVar), true, (byte) 1);
        }
        if (z) {
            return fre0.W(cdkVar) ? new gv9(field, fre0.P(cdkVar.B())) : new iv9(field, true, (byte) 0);
        }
        return fre0.W(cdkVar) ? new kv9(field, X(cdkVar), fre0.P(cdkVar.B())) : new mv9(field, X(cdkVar), true, (byte) 0);
    }

    public static final boolean X(cdk cdkVar) {
        return !e0t0.e(cdkVar.B().z().getType());
    }

    public static gys0 Y(boolean z, gqw0 gqw0Var, bty btyVar, int i) {
        cty ctyVar = cty.b0;
        if ((i & 4) != 0) {
            gqw0Var = gqw0.C1;
        }
        gqw0 gqw0Var2 = gqw0Var;
        if ((i & 8) != 0) {
            btyVar = bty.g;
        }
        return new gys0(z, true, true, gqw0Var2, btyVar, ctyVar);
    }

    public static final mtl Z(ctf0 ctf0Var) {
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
    }

    public static final void a(mm40 mm40Var, f3w f3wVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        long textPrimary;
        f3wVar.getClass();
        fetVar.g0(439086706);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (fetVar.g(f3wVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            ThemeColors themeColors = (ThemeColors) fetVar.k(zaq0.b);
            StaticColors staticColors = (StaticColors) fetVar.k(m8m0.f21378a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                int iOrdinal = f3wVar.e.ordinal();
                if (iOrdinal == 0) {
                    textPrimary = themeColors.getTextPrimary();
                } else if (iOrdinal == 1) {
                    textPrimary = staticColors.m98getGreen0d7_KjU();
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    textPrimary = staticColors.m113getRed0d7_KjU();
                }
                objP = dw9.e(textPrimary, fetVar);
            }
            long j = ((y3d) objP).f41946a;
            boolean zG = fetVar.g(f3wVar.b);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ugd(477636578, true, new op2(f3wVar, b));
                fetVar.o0(objP2);
            }
            Function2 function2 = (Function2) objP2;
            boolean zG2 = fetVar.g(f3wVar.c);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new ugd(727737857, true, new pp2(f3wVar, j, b));
                fetVar.o0(objP3);
            }
            hmw0.j(mm40Var2, function2, (Function2) objP3, fetVar, i5 & 14);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm(mm40Var2, (Object) f3wVar, i, i2, (byte) 6);
        }
    }

    public static final HistoryTypeModel a0(int i) {
        Object next;
        c0o c0oVar = HistoryTypeModel.k;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((HistoryTypeModel) next).f46393a != i);
        HistoryTypeModel historyTypeModel = (HistoryTypeModel) next;
        return historyTypeModel == null ? HistoryTypeModel.EVENTS : historyTypeModel;
    }

    public static final void b(mm40 mm40Var, rv50 rv50Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        rv50Var.getClass();
        String str = rv50Var.b;
        function0.getClass();
        function1.getClass();
        fetVar2.g0(1967488039);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(rv50Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = fetVar2.g(str);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(str), true, false, false);
                fetVar2.o0(wulVar);
                objP = wulVar;
            }
            wul wulVar2 = (wul) objP;
            mm40 mm40VarP = i120.P(mm40Var, yk5.n(q3d.j(new y3d(y3d.f), new y3d(y3d.b)), 0.0f, 0.0f, 14), null, 6);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarR = knm0.r(s5x0.N(s5x0.L(mm40VarP, 8.0f, 0.0f, 2), 0.0f, 36.0f, 0.0f, 24.0f, 5));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarR);
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
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            ugg0 ugg0VarA = vgg0.a(8.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ugg0VarA);
            zx7 zx7Var = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarQ, zx7Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
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
            v8q0.a(rv50Var.f31155a, o7k0.d(s5x0.J(jm40Var, 16.0f), 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 0, 130044);
            qzb.n(o7k0.d(s5x0.N(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), wulVar2, function1, fetVar, (i2 >> 3) & 896, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (rv50Var instanceof pv50) {
                fetVar2.e0(528244853);
                fetVar2.r(false);
            } else {
                fetVar2.e0(527794795);
                j0x.b(a8k0.F(R.drawable.ic_close_button, 0, fetVar2), null, y860.W(jr8Var.b(s5x0.J(jm40Var, 8.0f), gqw0.c), null, null, false, null, function0, 28), null, null, 0.0f, null, fetVar2, 56, 120);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 13, i, (Object) mm40Var, (Object) rv50Var, (Object) function0, (Object) function1);
        }
    }

    public static final double b0(b820 b820Var) {
        fo7 fo7Var = b820Var.b;
        if (fo7Var.equals(xn7.b)) {
            gx4 gx4Var = b820Var.f;
            if (gx4Var != null) {
                return gx4Var.c.b.f38133a;
            }
        } else {
            if (fo7Var.equals(co7.b)) {
                return b820Var.d.f31171a.b.f38133a;
            }
            if (!fo7Var.equals(zn7.b)) {
                t9f.b();
                return 0.0d;
            }
        }
        return 0.0d;
    }

    public static final void c(mm40 mm40Var, co8 co8Var, Function0 function0, fet fetVar, int i) {
        int i2;
        Function0 function1;
        boolean z;
        fet fetVar2;
        fet fetVar3 = fetVar;
        gye gyeVar = co8Var.f4687a;
        function0.getClass();
        fetVar3.g0(-1964619964);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(co8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= fetVar3.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(o7k0.d(o7k0.e(mm40Var, 48.0f), 1.0f), null, null, false, null, function1, 28);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar3, 54);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarW);
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
            gye gyeVar2 = gye.INVISIBLE;
            jm40 jm40Var = jm40.b;
            if (gyeVar != gyeVar2) {
                fetVar3.e0(-821246688);
                z = true;
                j0x.b(iom0.r(jpm0.t(gyeVar.f12123a, 6, fetVar3), fetVar3), null, o7k0.n(jm40Var, 20.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getPrimary(), 5), fetVar3, 56, 56);
                fetVar2 = fetVar3;
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2 = fetVar3;
                fetVar2.e0(-820865822);
                fetVar2.r(false);
            }
            boolean z2 = z;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = co8Var.b;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.l(g1t0.m(), fetVar2), fetVar, 0, 0, 131068);
            fetVar3 = fetVar;
            fetVar3.r(z2);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, co8Var, function0, i, (byte) 14);
        }
    }

    public static final mtl c0(ctf0 ctf0Var, boolean z) {
        return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z, false, true), ybr.f42352a)));
    }

    public static final void d(mm40 mm40Var, oqh oqhVar, fet fetVar, int i) {
        oqhVar.getClass();
        fetVar.g0(590854562);
        int i2 = i | 6 | (fetVar.g(oqhVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = oqhVar instanceof lqh;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(875556838);
                lmc.h(jm40Var, (lqh) oqhVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (oqhVar instanceof kqh) {
                fetVar.e0(875561736);
                plc.f(jm40Var, (kqh) oqhVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (oqhVar instanceof mqh) {
                fetVar.e0(875567059);
                obb.l((mqh) oqhVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!(oqhVar instanceof nqh)) {
                    throw b1j.f(875555325, fetVar, false);
                }
                fetVar.e0(875573020);
                acb.l((nqh) oqhVar, fetVar, i2 & 126);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, oqhVar, i, (byte) 13);
        }
    }

    public static final boolean d0(Throwable th) {
        th.getClass();
        return (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof SocketException) || (th instanceof SSLException) || (th instanceof el50);
    }

    public static final void e(mm40 mm40Var, o9n o9nVar, Function2 function2, Function1 function1, Function1 function3, fet fetVar, int i, int i2) {
        o9nVar.getClass();
        if ((i2 & 4) != 0) {
            function2 = null;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        if ((i2 & 16) != 0) {
            function3 = null;
        }
        if (o9nVar instanceof l9n) {
            fetVar.e0(-1133426610);
            acb.m(mm40Var, (l9n) o9nVar, function2, function1, function3, fetVar, i & 65534);
            fetVar.r(false);
        } else if (o9nVar instanceof k9n) {
            fetVar.e0(-1133136233);
            lmc.i(mm40Var, (k9n) o9nVar, function1, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!o9nVar.equals(n9n.f23149a)) {
                throw b1j.f(794720225, fetVar, false);
            }
            fetVar.e0(-1132927293);
            rcb.o(0, fetVar, mm40Var);
            fetVar.r(false);
        }
    }

    public static final af6 e0(b820 b820Var) {
        an5 an5Var = b820Var.c;
        return new af6(an5Var, b820Var.b, b0(b820Var) > an5Var.c.b, b820Var.l);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0101  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void f(final mm40 mm40Var, final ee eeVar, final sd sdVar, boolean z, rd rdVar, final Function0 function0, fet fetVar, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        final rd rdVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        final boolean z4;
        yfe0 yfe0VarU;
        rd rdVar3;
        y3d y3dVar;
        long background;
        k6z k6zVar;
        int iOrdinal;
        eeVar.getClass();
        fetVar.g0(474719668);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i3 | (fetVar.g(eeVar) ? 32 : 16) | (fetVar.g(sdVar) ? 256 : 128);
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i9 |= fetVar.h(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                i6 = i9 | 24576;
                rdVar2 = rdVar;
            } else {
                rdVar2 = rdVar;
                if (fetVar.g(rdVar2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 = i9 | i5;
            }
            if (fetVar.i(function0)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i8 = i6 | i7;
            if ((74899 & i8) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i8 & 1, z3)) {
                if (i10 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    rdVar3 = null;
                } else {
                    rdVar3 = rdVar2;
                }
                y3dVar = rdVar3 != null ? rdVar3.c : null;
                if (y3dVar == null) {
                    fetVar.e0(939077246);
                    background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                    fetVar.r(false);
                } else {
                    fetVar.e0(939075851);
                    fetVar.r(false);
                    background = y3dVar.f41946a;
                }
                androidx.compose.runtime.d dVar = bmd.n;
                k6zVar = (k6z) fetVar.k(dVar);
                if (z2) {
                    iOrdinal = k6zVar.ordinal();
                    if (iOrdinal != 0) {
                        k6zVar = k6z.b;
                    } else {
                        if (iOrdinal == 1) {
                            t9f.b();
                            return;
                        }
                        k6zVar = k6z.f17794a;
                    }
                }
                obc.d(dVar.a(k6zVar), u1c.M(1003178612, new jx1(mm40Var, function0, eeVar, background, sdVar, rdVar3), fetVar), fetVar, 56);
                rdVar2 = rdVar3;
            } else {
                fetVar.X();
            }
            z4 = z2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.xil
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jcb.f(mm40Var, eeVar, sdVar, z4, rdVar2, function0, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i9 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            i6 = i9 | 24576;
            rdVar2 = rdVar;
        } else {
            rdVar2 = rdVar;
            if (fetVar.g(rdVar2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i9 | i5;
        }
        if (fetVar.i(function0)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        i8 = i6 | i7;
        if ((74899 & i8) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i8 & 1, z3)) {
            if (i10 != 0) {
                z2 = false;
            }
            if (i4 != 0) {
                rdVar3 = null;
            } else {
                rdVar3 = rdVar2;
            }
            if (rdVar3 != null) {
            }
            if (y3dVar == null) {
                fetVar.e0(939077246);
                background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                fetVar.r(false);
            } else {
                fetVar.e0(939075851);
                fetVar.r(false);
                background = y3dVar.f41946a;
            }
            androidx.compose.runtime.d dVar2 = bmd.n;
            k6zVar = (k6z) fetVar.k(dVar2);
            if (z2) {
                iOrdinal = k6zVar.ordinal();
                if (iOrdinal != 0) {
                    k6zVar = k6z.b;
                } else {
                    if (iOrdinal == 1) {
                        t9f.b();
                        return;
                    }
                    k6zVar = k6z.f17794a;
                }
            }
            obc.d(dVar2.a(k6zVar), u1c.M(1003178612, new jx1(mm40Var, function0, eeVar, background, sdVar, rdVar3), fetVar), fetVar, 56);
            rdVar2 = rdVar3;
        } else {
            fetVar.X();
        }
        z4 = z2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.xil
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jcb.f(mm40Var, eeVar, sdVar, z4, rdVar2, function0, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final en8 f0(b820 b820Var) {
        boolean z = b820Var.h;
        fo7 fo7Var = b820Var.b;
        boolean z2 = b820Var.l;
        boolean z3 = false;
        if (fo7Var instanceof co7) {
            if (U(b820Var.d.f31171a.b) && !z2) {
                z3 = true;
            }
        } else if (fo7Var instanceof xn7) {
            gx4 gx4Var = b820Var.f;
            if (gx4Var != null && T(gx4Var) && !z2) {
                z3 = true;
            }
        } else {
            if (!(fo7Var instanceof zn7)) {
                t9f.b();
                return null;
            }
            czc0 czc0Var = b820Var.e;
            if (czc0Var != null && czc0Var.e && !z2) {
                z3 = true;
            }
        }
        return new en8(z, z3);
    }

    public static final void g(mm40 mm40Var, trl trlVar, fet fetVar, int i) {
        int i2;
        trlVar.getClass();
        fetVar.g0(-79445244);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(trlVar) ? 32 : 16;
        }
        byte b = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (trlVar instanceof rrl) {
            fetVar.e0(-226024188);
            rrl rrlVar = (rrl) trlVar;
            xrl xrlVar = rrlVar.d;
            if (xrlVar.equals(url.f36169a)) {
                fetVar.e0(-225955399);
                h(mm40Var, rrlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (xrlVar.equals(vrl.f37904a)) {
                fetVar.e0(-225690504);
                i(mm40Var, rrlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!(xrlVar instanceof wrl)) {
                    throw b1j.f(962540222, fetVar, false);
                }
                fetVar.e0(-225419192);
                j(mm40Var, rrlVar, (wrl) xrlVar, fetVar, i2 & 126);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            if (!trlVar.equals(srl.f32682a)) {
                throw b1j.f(962537705, fetVar, false);
            }
            fetVar.e0(-225090468);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new orl(mm40Var, trlVar, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:293:0x045c  */
    /* JADX WARN: Code duplicated, block: B:754:0x0aa2 A[PHI: r3
  0x0aa2: PHI (r3v23 java.lang.Integer) = (r3v3 java.lang.Integer), (r3v26 java.lang.Integer) binds: [B:758:0x0aaf, B:753:0x0aa0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:893:0x0c59  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v20, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v25, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v28, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v31, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v70, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v52, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v54, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r44v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r44v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r45v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v107 */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v109 */
    /* JADX WARN: Type inference failed for: r4v110, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v111, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v48, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v29, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.util.ArrayList] */
    public static final cqg g0(iqg iqgVar, vby vbyVar, long j, f5h f5hVar, boolean z) {
        bmk0 bmk0Var;
        Integer num;
        int iIntValue;
        kz7 kz7Var;
        Integer num2;
        ?? arrayList;
        Integer num3;
        Integer num4;
        c08 c08Var;
        Integer num5;
        Integer num6;
        Integer num7;
        c08 c08Var2;
        nig0 nig0Var;
        tig0 tig0Var;
        ?? arrayList2;
        ?? arrayList3;
        a1p a1pVar;
        ?? arrayList4;
        ?? arrayList5;
        ?? arrayList6;
        List listSplit$default;
        List listD0;
        List listSplit$default2;
        tha thaVar;
        tha thaVar2;
        List<fah> list;
        String strValueOf;
        String strValueOf2;
        bih bihVar;
        Integer num8;
        bih bihVar2;
        Long l;
        zaa zaaVar;
        ?? arrayList7;
        kfg0 kfg0Var;
        int i;
        List listSplit$default3;
        ?? arrayList8;
        g9l g9lVar;
        y9l y9lVar;
        y9l y9lVar2;
        ?? arrayList9;
        ?? arrayList10;
        List list2;
        List list3;
        List list4;
        List list5;
        String string;
        Long l2;
        iqgVar.getClass();
        vbyVar.getClass();
        f5hVar.getClass();
        h2g h2gVar = f5hVar.A;
        jch jchVar = f5hVar.I;
        ?? r11 = 0;
        ?? arrayList11 = 0;
        ?? arrayList12 = 0;
         = 0;
        ?? r12 = 0;
        ?? arrayList13 = 0;
        ?? arrayList14 = 0;
        int iIntValue2 = 0;
        if (iqgVar instanceof w9l) {
            w9l w9lVar = (w9l) iqgVar;
            z9l z9lVar = z9l.c;
            cng cngVar = w9lVar.f38785a;
            phh phhVar = w9lVar.c;
            phh phhVar2 = w9lVar.b;
            n6l n6lVar = n6l.f23001a;
            if (cngVar != null) {
                bgh bghVar = cngVar.f4653a;
                Integer num9 = bghVar != null ? bghVar.f2556a : null;
                if (num9 != null && num9.intValue() == 1) {
                    z9lVar = z9l.b;
                } else if (num9 != null && num9.intValue() == 2) {
                    z9lVar = z9l.d;
                } else if (num9 != null && num9.intValue() == 3) {
                    Long l3 = bghVar.b;
                    z9lVar = new z9l();
                } else if (num9 != null && num9.intValue() == 4) {
                    z9lVar = z9l.f44025a;
                }
                z9l z9lVar2 = z9lVar;
                long jLongValue = (bghVar == null || (l2 = bghVar.b) == null) ? 0L : l2.longValue();
                Long l4 = cngVar.b;
                long jLongValue2 = l4 != null ? l4.longValue() : 0L;
                Long l5 = cngVar.d;
                jwb m6lVar = l5 != null ? new m6l(l5.longValue()) : n6lVar;
                Long l6 = cngVar.c;
                long jLongValue3 = l6 != null ? l6.longValue() : 0L;
                Long l7 = cngVar.e;
                long jLongValue4 = l7 != null ? l7.longValue() : 0L;
                Iterable iterable = cngVar.f;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                ArrayList arrayList15 = new ArrayList();
                for (Object obj : iterable) {
                    egh eghVar = (egh) obj;
                    if (eghVar.f7765a == null || eghVar.b == null || eghVar.c == null) {
                        arrayList15.add(obj);
                    }
                }
                if (arrayList15.isEmpty()) {
                    ArrayList arrayList16 = new ArrayList(r3d.q(iterable, 10));
                    int i2 = 0;
                    for (Object obj2 : iterable) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        egh eghVar2 = (egh) obj2;
                        eghVar2.getClass();
                        Long l8 = eghVar2.b;
                        if (l8 != null) {
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String str = "/sfiles/dota2/128/" + l8 + ".jpg";
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
                            string = sb.toString();
                        } else {
                            string = "";
                        }
                        Boolean bool = eghVar2.f7765a;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                        long jLongValue5 = l8 != null ? l8.longValue() : 0L;
                        Integer num10 = eghVar2.c;
                        arrayList16.add(new gah(num10 != null ? num10.intValue() : 0, i3, jLongValue5, string, zBooleanValue));
                        i2 = i3;
                    }
                    list5 = arrayList16;
                } else {
                    list5 = iun.f15405a;
                }
                g9lVar = new g9l(z9lVar2, jLongValue, jLongValue2, m6lVar, jLongValue3, jLongValue4, list5);
            } else {
                g9lVar = new g9l(z9lVar, 0L, 0L, n6lVar, 0L, 0L, iun.f15405a);
            }
            if (phhVar2 != null) {
                y9lVar = ebc.l0(phhVar2);
            } else {
                i6l i6lVar = i6l.f14245a;
                iun iunVar = iun.f15405a;
                y9lVar = new y9l(i6lVar, iunVar, iunVar, 0, 0, 0, 0);
            }
            if (phhVar != null) {
                y9lVar2 = ebc.l0(phhVar);
            } else {
                i6l i6lVar2 = i6l.f14245a;
                iun iunVar2 = iun.f15405a;
                y9lVar2 = new y9l(i6lVar2, iunVar2, iunVar2, 0, 0, 0, 0);
            }
            if (phhVar2 == null || (list4 = phhVar2.b) == null) {
                arrayList9 = iun.f15405a;
            } else {
                arrayList9 = new ArrayList(r3d.q(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList9.add(ulb.e0((e1h) it.next(), phhVar2.f26996a));
                }
            }
            if (phhVar == null || (list3 = phhVar.b) == null) {
                arrayList10 = iun.f15405a;
            } else {
                arrayList10 = new ArrayList(r3d.q(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(ulb.e0((e1h) it2.next(), phhVar.f26996a));
                }
            }
            ArrayList arrayListQ0 = CollectionsKt.q0(arrayList9, arrayList10);
            ArrayList arrayList17 = new ArrayList();
            for (Object obj3 : arrayListQ0) {
                if (((z4l) obj3).f43775a > 0) {
                    arrayList17.add(obj3);
                }
            }
            return new c5l(g9lVar, y9lVar, y9lVar2, arrayList17, (jchVar == null || (list2 = jchVar.b) == null) ? iun.f15405a : nkb.L(list2));
        }
        if (iqgVar instanceof lrf) {
            return vfc.N((lrf) iqgVar);
        }
        if (iqgVar instanceof a110) {
            return gfx.S((a110) iqgVar, jchVar);
        }
        if (iqgVar instanceof bj40) {
            return efx.M((bj40) iqgVar, jchVar);
        }
        if (iqgVar instanceof g0u0) {
            return egm0.u((g0u0) iqgVar);
        }
        if (iqgVar instanceof hvd0) {
            return pzw.Y((hvd0) iqgVar, f5hVar);
        }
        if (iqgVar instanceof ag5) {
            return wha0.X((ag5) iqgVar);
        }
        if (iqgVar instanceof clk) {
            return tlb.g0((clk) iqgVar);
        }
        if (iqgVar instanceof ten) {
            return fbc.Z((ten) iqgVar);
        }
        if (iqgVar instanceof txv) {
            txv txvVar = (txv) iqgVar;
            Integer num11 = txvVar.f34722a;
            int iIntValue3 = num11 != null ? num11.intValue() : 0;
            Integer num12 = txvVar.b;
            iIntValue2 = num12 != null ? num12.intValue() : 0;
            uxv uxvVarQ = xbc.Q(txvVar.c);
            uxv uxvVarQ2 = xbc.Q(txvVar.d);
            Boolean bool2 = txvVar.e;
            return new qxv(iIntValue3, iIntValue2, uxvVarQ, uxvVarQ2, bool2 != null ? bool2.booleanValue() : true);
        }
        if (iqgVar instanceof xq20) {
            return ucx.j0(f5hVar);
        }
        if (iqgVar instanceof lr40) {
            return c3x.J((lr40) iqgVar);
        }
        if (iqgVar instanceof qpa0) {
            return n6x.p0((qpa0) iqgVar);
        }
        if (iqgVar instanceof ayh0) {
            return uvw.X((ayh0) iqgVar, jchVar);
        }
        if (iqgVar instanceof myh0) {
            myh0 myh0Var = (myh0) iqgVar;
            myh0Var.getClass();
            List<qyh0> list6 = myh0Var.f22603a;
            if (list6 != null) {
                arrayList8 = new ArrayList(r3d.q(list6, 10));
                for (qyh0 qyh0Var : list6) {
                    Integer num13 = qyh0Var.f29534a;
                    int iIntValue4 = num13 != null ? num13.intValue() : 0;
                    String str2 = qyh0Var.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Integer num14 = qyh0Var.c;
                    int iIntValue5 = num14 != null ? num14.intValue() : 0;
                    Integer num15 = qyh0Var.d;
                    arrayList8.add(new nyh0(iIntValue4, iIntValue5, num15 != null ? num15.intValue() : 0, str2));
                }
            } else {
                arrayList8 = iun.f15405a;
            }
            return new jyh0(arrayList8);
        }
        if (iqgVar instanceof rij0) {
            return xvw.a0((rij0) iqgVar, jchVar);
        }
        if (iqgVar instanceof nus0) {
            return o5n0.u((nus0) iqgVar);
        }
        if (iqgVar instanceof d6t0) {
            return k7n0.F((d6t0) iqgVar);
        }
        if (iqgVar instanceof ceu0) {
            return jtm0.u((ceu0) iqgVar, vbyVar);
        }
        if (iqgVar instanceof epg0) {
            return pzw.a0((epg0) iqgVar);
        }
        if (iqgVar instanceof kdh0) {
            return j0x.T((kdh0) iqgVar);
        }
        if (iqgVar instanceof jdu0) {
            return etm0.r((jdu0) iqgVar);
        }
        if (iqgVar instanceof m8j) {
            return bkb.m0((m8j) iqgVar);
        }
        if (iqgVar instanceof ahf) {
            return fxb.K((ahf) iqgVar);
        }
        if (iqgVar instanceof mkk) {
            return hkb.Q((mkk) iqgVar);
        }
        int i4 = -1;
        if (iqgVar instanceof bfg0) {
            bfg0 bfg0Var = (bfg0) iqgVar;
            mfg0 mfg0Var = bfg0Var.f2501a;
            if (mfg0Var != null) {
                int iOrdinal = mfg0Var.ordinal();
                if (iOrdinal == 0) {
                    kfg0Var = kfg0.f18194a;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    kfg0Var = kfg0.b;
                }
            } else {
                kfg0Var = kfg0.c;
            }
            String str3 = bfg0Var.b;
            int i5 = -2;
            if (str3 == null) {
                i = -2;
            } else if (Intrinsics.d(str3, "00")) {
                i = -1;
            } else {
                int iX = wvb.X(str3);
                if (iX < 0 || iX >= 37) {
                    i = -2;
                } else {
                    i = Integer.parseInt(str3);
                }
            }
            String str4 = bfg0Var.c;
            if (str4 == null || (listSplit$default3 = StringsKt__StringsKt.split$default(str4, new String[]{Separators.COMMA}, false, 0, 6, null)) == null) {
                listSplit$default3 = iun.f15405a;
            }
            String str5 = bfg0Var.d;
            if (str5 != null) {
                if (!Intrinsics.d(str5, "00")) {
                    int iX2 = wvb.X(str5);
                    i4 = (iX2 < 0 || iX2 >= 37) ? -2 : Integer.parseInt(str5);
                }
                i5 = i4;
            }
            return new xeg0(kfg0Var, i, listSplit$default3, i5);
        }
        if (iqgVar instanceof p5x) {
            return q5x.S((p5x) iqgVar);
        }
        if (iqgVar instanceof hoy) {
            return q8x.L((hoy) iqgVar);
        }
        if (iqgVar instanceof hqb0) {
            return azw.Z((hqb0) iqgVar, jchVar);
        }
        if (iqgVar instanceof jav) {
            return mbc.f0((jav) iqgVar);
        }
        if (iqgVar instanceof zea) {
            return ohq0.m0((zea) iqgVar);
        }
        if (iqgVar instanceof bsp) {
            bsp bspVar = (bsp) iqgVar;
            Long l9 = bspVar.f3142a;
            long jLongValue6 = l9 != null ? l9.longValue() : 0L;
            Integer num16 = bspVar.b;
            return new yrp(jLongValue6, num16 != null ? num16.intValue() : 0);
        }
        if (iqgVar instanceof nba) {
            nba nbaVar = (nba) iqgVar;
            Integer num17 = nbaVar.f23231a;
            if (num17 != null && num17.intValue() == 0) {
                zaaVar = zaa.f44057a;
            } else if (num17 != null && num17.intValue() == 1) {
                zaaVar = zaa.b;
            } else if (num17 != null && num17.intValue() == 2) {
                zaaVar = zaa.c;
            } else if (num17 != null && num17.intValue() == 3) {
                zaaVar = zaa.d;
            } else {
                zaaVar = (num17 != null && num17.intValue() == 4) ? zaa.e : zaa.f;
            }
            Integer num18 = nbaVar.b;
            int iIntValue6 = num18 != null ? num18.intValue() : 0;
            Integer num19 = nbaVar.c;
            iIntValue2 = num19 != null ? num19.intValue() : 0;
            List list7 = nbaVar.d;
            if (list7 != null) {
                arrayList7 = new ArrayList(r3d.q(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(mrv.p0((iba) it3.next()));
                }
            } else {
                arrayList7 = 0;
            }
            if (arrayList7 == 0) {
                arrayList7 = iun.f15405a;
            }
            List list8 = nbaVar.e;
            if (list8 != null) {
                arrayList11 = new ArrayList(r3d.q(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList11.add(mrv.p0((iba) it4.next()));
                }
            }
            if (arrayList11 == 0) {
                arrayList11 = iun.f15405a;
            }
            return new bba(zaaVar, iIntValue6, iIntValue2, arrayList7, arrayList11);
        }
        if (iqgVar instanceof kjg) {
            if (j == jxg.d.b) {
                return pek0.c;
            }
            if (j == ltg.d.b || j == fvg.d.b) {
                return evu0.f8491a;
            }
            if (j == xug.d.b || j == rvg.d.b || j == gwg.d.b) {
                return btq.f3194a;
            }
            if (j == avg.d.b) {
                return yq20.f43055a;
            }
            if (j == qug.d.b) {
                return gq20.f11710a;
            }
            if (j == ixg.d.b) {
                return k8o0.f17882a;
            }
            if (j == irg.d.b) {
                return ly3.f20846a;
            }
        } else {
            if (iqgVar instanceof xtp0) {
                xtp0 xtp0Var = (xtp0) iqgVar;
                h2g h2gVar2 = f5hVar.B;
                String str6 = h2gVar != null ? h2gVar.f12331a : null;
                if (str6 == null) {
                    str6 = "";
                }
                String string2 = StringsKt.u0(str6).toString();
                String str7 = h2gVar2 != null ? h2gVar2.f12331a : null;
                if (str7 == null) {
                    str7 = "";
                }
                String string3 = StringsKt.u0(str7).toString();
                String str8 = (String) CollectionsKt.firstOrNull(d5c.P(h2gVar));
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = (String) CollectionsKt.firstOrNull(d5c.P(h2gVar2));
                if (str9 == null) {
                    str9 = "";
                }
                string2.getClass();
                string3.getClass();
                List<bup0> list9 = xtp0Var.f41474a;
                if (list9 != null) {
                    arrayList12 = new ArrayList(r3d.q(list9, 10));
                    for (bup0 bup0Var : list9) {
                        Integer num20 = bup0Var.f3243a;
                        int iIntValue7 = num20 != null ? num20.intValue() : 0;
                        Long l10 = bup0Var.b;
                        long jLongValue7 = l10 != null ? l10.longValue() : 0L;
                        String str10 = bup0Var.c;
                        if (str10 == null) {
                            str10 = "";
                        }
                        arrayList12.add(new ytp0(str10, iIntValue7, jLongValue7));
                    }
                }
                if (arrayList12 == 0) {
                    arrayList12 = iun.f15405a;
                }
                return new utp0(string2, string3, str8, arrayList12, str9);
            }
            if (iqgVar instanceof pha) {
                pha phaVar = (pha) iqgVar;
                String str11 = phaVar.f26986a;
                int i6 = str11 != null ? Integer.parseInt(str11) : 0;
                wha whaVar = phaVar.b;
                if (whaVar != null) {
                    thaVar = cwr0.T(whaVar);
                } else {
                    iun iunVar3 = iun.f15405a;
                    thaVar = new tha(iunVar3, iunVar3);
                }
                tha thaVar3 = thaVar;
                wha whaVar2 = phaVar.c;
                if (whaVar2 != null) {
                    thaVar2 = cwr0.T(whaVar2);
                } else {
                    iun iunVar4 = iun.f15405a;
                    thaVar2 = new tha(iunVar4, iunVar4);
                }
                tha thaVar4 = thaVar2;
                Boolean bool3 = phaVar.d;
                boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = phaVar.e;
                boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
                long jLongValue8 = (jchVar == null || (bihVar2 = jchVar.j) == null || (l = bihVar2.f2659a) == null) ? 0L : l.longValue();
                if (jchVar != null && (bihVar = jchVar.j) != null && (num8 = bihVar.b) != null) {
                    iIntValue2 = num8.intValue();
                }
                int i7 = iIntValue2;
                if (jchVar != null && (list = jchVar.b) != null) {
                    ArrayList arrayList18 = new ArrayList(r3d.q(list, 10));
                    for (fah fahVar : list) {
                        Integer num21 = fahVar.f9207a;
                        String strValueOf3 = num21 != null ? String.valueOf(num21.intValue()) : null;
                        if (strValueOf3 == null) {
                            strValueOf3 = "";
                        }
                        Integer num22 = fahVar.b;
                        String str12 = "0";
                        if (num22 == null || (strValueOf = String.valueOf(num22.intValue())) == null) {
                            strValueOf = "0";
                        }
                        Integer num23 = fahVar.c;
                        if (num23 != null && (strValueOf2 = String.valueOf(num23.intValue())) != null) {
                            str12 = strValueOf2;
                        }
                        arrayList18.add(new ve90(strValueOf3, strValueOf, str12));
                    }
                    r12 = arrayList18;
                }
                if (r12 == 0) {
                    r12 = iun.f15405a;
                }
                return new kha(i6, thaVar3, thaVar4, zBooleanValue2, zBooleanValue3, jLongValue8, i7, r12, z);
            }
            if (iqgVar instanceof odq0) {
                odq0 odq0Var = (odq0) iqgVar;
                String str13 = odq0Var.f25089a;
                if (str13 == null || (listSplit$default2 = StringsKt__StringsKt.split$default(str13, new String[]{Separators.COMMA}, false, 0, 6, null)) == null) {
                    arrayList5 = iun.f15405a;
                } else {
                    arrayList5 = new ArrayList(r3d.q(listSplit$default2, 10));
                    Iterator it5 = listSplit$default2.iterator();
                    while (it5.hasNext()) {
                        Integer intOrNull = StringsKt.toIntOrNull((String) it5.next());
                        arrayList5.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0));
                    }
                }
                LinkedHashMap linkedHashMapR = hhm0.r(hhm0.w(arrayList5));
                String str14 = odq0Var.b;
                if (str14 == null || (listSplit$default = StringsKt__StringsKt.split$default(str14, new String[]{Separators.SEMICOLON}, false, 0, 6, null)) == null || (listD0 = CollectionsKt.D0(listSplit$default, 3)) == null) {
                    arrayList6 = iun.f15405a;
                } else {
                    arrayList6 = new ArrayList(r3d.q(listD0, 10));
                    Iterator it6 = listD0.iterator();
                    while (it6.hasNext()) {
                        List listSplit$default4 = StringsKt__StringsKt.split$default((String) it6.next(), new String[]{Separators.COMMA}, false, 0, 6, null);
                        ArrayList arrayList19 = new ArrayList(r3d.q(listSplit$default4, 10));
                        Iterator it7 = listSplit$default4.iterator();
                        while (it7.hasNext()) {
                            Integer intOrNull2 = StringsKt.toIntOrNull((String) it7.next());
                            arrayList19.add(Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0));
                        }
                        arrayList6.add(hhm0.r(hhm0.w(arrayList19)));
                    }
                }
                ArrayList arrayList20 = new ArrayList(9);
                for (int iC = 0; iC < 9; iC = w6x.c(0, iC, 1, arrayList20)) {
                }
                LinkedHashMap linkedHashMapR2 = hhm0.r(arrayList20);
                ArrayList arrayList21 = new ArrayList(3);
                while (iIntValue2 < 3) {
                    arrayList21.add((Map) ((iIntValue2 < 0 || iIntValue2 >= arrayList6.size()) ? linkedHashMapR2 : arrayList6.get(iIntValue2)));
                    iIntValue2++;
                }
                return new pdq0(arrayList21, linkedHashMapR);
            }
            if (iqgVar instanceof xiv) {
                List<cjv> list10 = ((xiv) iqgVar).f40965a;
                if (list10 != null) {
                    arrayList4 = new ArrayList(r3d.q(list10, 10));
                    for (cjv cjvVar : list10) {
                        String str15 = cjvVar.f4477a;
                        if (str15 == null) {
                            str15 = "";
                        }
                        Integer num24 = cjvVar.b;
                        int iIntValue8 = num24 != null ? num24.intValue() : 0;
                        Long l11 = cjvVar.c;
                        long jLongValue9 = l11 != null ? l11.longValue() : 0L;
                        String str16 = cjvVar.d;
                        if (str16 == null) {
                            str16 = "";
                        }
                        String str17 = cjvVar.e;
                        if (str17 == null) {
                            str17 = "";
                        }
                        arrayList4.add(new ziv(str15, iIntValue8, jLongValue9, str16, str17, cjvVar.f));
                    }
                } else {
                    arrayList4 = iun.f15405a;
                }
                return new uiv(arrayList4);
            }
            if (iqgVar instanceof p0p) {
                List<t0p> list11 = ((p0p) iqgVar).f26163a;
                if (list11 != null) {
                    arrayList3 = new ArrayList(r3d.q(list11, 10));
                    for (t0p t0pVar : list11) {
                        t0pVar.getClass();
                        Integer num25 = t0pVar.f33129a;
                        int iIntValue9 = num25 != null ? num25.intValue() : 0;
                        Integer num26 = t0pVar.b;
                        int iIntValue10 = num26 != null ? num26.intValue() : 0;
                        String str18 = t0pVar.c;
                        if (str18 == null) {
                            str18 = "";
                        }
                        String str19 = t0pVar.d;
                        if (str19 == null) {
                            a1pVar = a1p.d;
                        } else if (str19.length() == 0) {
                            a1pVar = a1p.c;
                        } else if (str19.equals("Perfect win")) {
                            a1pVar = a1p.f82a;
                        } else {
                            a1pVar = str19.equals("Time win") ? a1p.b : a1p.d;
                        }
                        arrayList3.add(new q0p(iIntValue9, iIntValue10, str18, a1pVar));
                    }
                } else {
                    arrayList3 = iun.f15405a;
                }
                return new v0p(arrayList3);
            }
            if (iqgVar instanceof ytf) {
                List<euf> list12 = ((ytf) iqgVar).f43215a;
                if (list12 != null) {
                    arrayList2 = new ArrayList(r3d.q(list12, 10));
                    for (euf eufVar : list12) {
                        Integer num27 = eufVar.f8417a;
                        int iIntValue11 = num27 != null ? num27.intValue() : 0;
                        Long l12 = eufVar.b;
                        long jLongValue10 = l12 != null ? l12.longValue() : 0L;
                        Integer num28 = eufVar.c;
                        Integer num29 = eufVar.d;
                        boolean zD = Intrinsics.d(eufVar.e, Boolean.TRUE);
                        Integer num30 = eufVar.f;
                        arrayList2.add(new iuf(iIntValue11, jLongValue10, num28, num29, num30 != null ? num30.intValue() : 0, zD));
                    }
                } else {
                    arrayList2 = iun.f15405a;
                }
                return new huf(arrayList2);
            }
            if (iqgVar instanceof l960) {
                l960 l960Var = (l960) iqgVar;
                String str20 = l960Var.f19636a;
                if (str20 == null) {
                    str20 = "";
                }
                String str21 = l960Var.b;
                return new i960(str20, str21 != null ? str21 : "");
            }
            if (iqgVar instanceof akg0) {
                akg0 akg0Var = (akg0) iqgVar;
                Integer num31 = akg0Var.f1021a;
                int iIntValue12 = num31 != null ? num31.intValue() : 0;
                qig0 qig0Var = akg0Var.b;
                if (qig0Var != null) {
                    tjg0 tjg0Var = qig0Var.f28791a;
                    qjg0 qjg0VarQ = tjg0Var != null ? efx.Q(tjg0Var) : new qjg0(-1, -1, "", false);
                    tjg0 tjg0Var2 = qig0Var.b;
                    qjg0 qjg0VarQ2 = tjg0Var2 != null ? efx.Q(tjg0Var2) : new qjg0(-1, -1, "", false);
                    tjg0 tjg0Var3 = qig0Var.c;
                    qjg0 qjg0VarQ3 = tjg0Var3 != null ? efx.Q(tjg0Var3) : new qjg0(-1, -1, "", false);
                    Integer num32 = qig0Var.d;
                    if (num32 != null && num32.intValue() == 0) {
                        tig0Var = tig0.f34009a;
                    } else if (num32 != null && num32.intValue() == 1) {
                        tig0Var = tig0.b;
                    } else if (num32 != null && num32.intValue() == 2) {
                        tig0Var = tig0.c;
                    } else {
                        tig0Var = (num32 != null && num32.intValue() == 3) ? tig0.d : tig0.e;
                    }
                    nig0Var = new nig0(qjg0VarQ, qjg0VarQ2, qjg0VarQ3, tig0Var);
                } else {
                    nig0Var = new nig0(new qjg0(-1, -1, "", false), new qjg0(-1, -1, "", false), new qjg0(-1, -1, "", false), tig0.e);
                }
                wjg0 wjg0Var = akg0Var.c;
                xjg0 xjg0VarD0 = wjg0Var != null ? zvw.d0(wjg0Var) : null;
                List list13 = akg0Var.d;
                if (list13 != null) {
                    arrayList13 = new ArrayList(r3d.q(list13, 10));
                    Iterator it8 = list13.iterator();
                    while (it8.hasNext()) {
                        arrayList13.add(zvw.d0((wjg0) it8.next()));
                    }
                }
                if (arrayList13 == 0) {
                    arrayList13 = iun.f15405a;
                }
                return new cjg0(iIntValue12, nig0Var, xjg0VarD0, arrayList13);
            }
            if (iqgVar instanceof g08) {
                g08 g08Var = (g08) iqgVar;
                dz7 dz7Var = g08Var.c;
                gz7 gz7Var = g08Var.b;
                if (dz7Var == null || (c08Var2 = dz7Var.g) == null || (num = c08Var2.b) == null) {
                    num = gz7Var != null ? gz7Var.e : null;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = num.intValue();
                }
                Integer num33 = g08Var.f10446a;
                if (num33 != null && num33.intValue() == 0) {
                    kz7Var = kz7.f19141a;
                } else if (num33 != null && num33.intValue() == 1) {
                    kz7Var = kz7.b;
                } else if (num33 != null && num33.intValue() == 2) {
                    kz7Var = kz7.c;
                } else {
                    kz7Var = (num33 != null && num33.intValue() == 3) ? kz7.d : kz7.e;
                }
                kz7 kz7Var2 = kz7Var;
                if (dz7Var == null || (num2 = dz7Var.c) == null) {
                    num2 = gz7Var != null ? gz7Var.f12167a : null;
                }
                uz7 uz7Var = (num2 != null && num2.intValue() == 1) ? uz7.FIRST_PLAYER : (num2 != null && num2.intValue() == 2) ? uz7.SECOND_PLAYER : uz7.UNKNOWN;
                int iIntValue13 = (dz7Var == null || (num7 = dz7Var.d) == null) ? 0 : num7.intValue();
                int iIntValue14 = (dz7Var == null || (num6 = dz7Var.e) == null) ? 0 : num6.intValue();
                int iIntValue15 = (dz7Var == null || (c08Var = dz7Var.g) == null || (num5 = c08Var.f3511a) == null) ? iIntValue : num5.intValue();
                boolean zD2 = dz7Var != null ? Intrinsics.d(dz7Var.j, Boolean.TRUE) : false;
                int iIntValue16 = (dz7Var == null || (num4 = dz7Var.h) == null) ? 0 : num4.intValue();
                if (dz7Var != null && (num3 = dz7Var.i) != null) {
                    iIntValue2 = num3.intValue();
                }
                int i8 = iIntValue2;
                List list14 = g08Var.d;
                if (list14 != null) {
                    arrayList = new ArrayList(r3d.q(list14, 10));
                    Iterator it9 = list14.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(i4w0.W((q08) it9.next()));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                ?? r25 = arrayList;
                List list15 = g08Var.e;
                if (list15 != null) {
                    arrayList14 = new ArrayList(r3d.q(list15, 10));
                    Iterator it10 = list15.iterator();
                    while (it10.hasNext()) {
                        arrayList14.add(i4w0.W((q08) it10.next()));
                    }
                }
                if (arrayList14 == 0) {
                    arrayList14 = iun.f15405a;
                }
                return new qz7(kz7Var2, uz7Var, iIntValue13, iIntValue14, iIntValue, iIntValue15, zD2, iIntValue16, i8, r25, arrayList14);
            }
            if (iqgVar instanceof wlk0) {
                List<amk0> list16 = ((wlk0) iqgVar).f39358a;
                if (list16 != null) {
                    ArrayList arrayList22 = new ArrayList(r3d.q(list16, 10));
                    for (amk0 amk0Var : list16) {
                        Integer num34 = amk0Var.f1112a;
                        int iIntValue17 = num34 != null ? num34.intValue() : 0;
                        Long l13 = amk0Var.b;
                        long jLongValue11 = l13 != null ? l13.longValue() : 0L;
                        String str22 = amk0Var.c;
                        if (str22 == null) {
                            str22 = "";
                        }
                        String str23 = amk0Var.d;
                        String string4 = str23 != null ? StringsKt.u0(str23).toString() : null;
                        if (string4 == null) {
                            bmk0Var = bmk0.d;
                        } else {
                            int iHashCode = string4.hashCode();
                            if (iHashCode != -2014257111) {
                                if (iHashCode != -522522327) {
                                    if (iHashCode == 2281026 && string4.equals("K.O.")) {
                                        bmk0Var = bmk0.c;
                                    } else {
                                        bmk0Var = bmk0.d;
                                    }
                                } else if (string4.equals("Perfect win")) {
                                    bmk0Var = bmk0.f2840a;
                                } else {
                                    bmk0Var = bmk0.d;
                                }
                            } else if (string4.equals("Time win")) {
                                bmk0Var = bmk0.b;
                            } else {
                                bmk0Var = bmk0.d;
                            }
                        }
                        arrayList22.add(new xlk0(iIntValue17, jLongValue11, str22, bmk0Var));
                    }
                    r11 = arrayList22;
                }
                if (r11 == 0) {
                    r11 = iun.f15405a;
                }
                return new tlk0(r11);
            }
        }
        return bqg.f3028a;
    }

    public static final void h(mm40 mm40Var, rrl rrlVar, fet fetVar, int i) {
        int i2;
        rrl rrlVar2 = rrlVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1965881356);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(rrlVar2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarL = s5x0.L(piz.R(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarL2 = s5x0.L(o7k0.s(jm40.b, 40.0f), 6.0f, 0.0f, 2);
            String strL = ttm0.L(3, rrlVar2.f30990a);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(strL, mm40VarL2, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), gfk0.b(qmk.s, qmk.w), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.t(), fetVar, 0, 24576, 113648);
            mm40 mm40VarE2 = new x7z(1.0f, true).e(new ecu0(yx7Var));
            rrlVar2 = rrlVar;
            String str = rrlVar2.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), gfk0.b(qmk.q, qmk.r), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new prl(mm40Var, rrlVar2, i, (byte) 4);
        }
    }

    public static final m5p h0(i5p i5pVar, wcb wcbVar) {
        i5pVar.getClass();
        wcbVar.getClass();
        long j = i5pVar.f14203a;
        long j2 = i5pVar.b;
        long j3 = i5pVar.c;
        sgb sgbVar = i5pVar.d;
        String str = i5pVar.g;
        long j4 = i5pVar.h;
        String str2 = i5pVar.e;
        boolean z = i5pVar.i;
        h5p h5pVar = i5pVar.j;
        return new m5p(i5pVar.k, i5pVar.l, j, j2, j3, i5pVar.m, j4, sgbVar, h5pVar, str2, str, wcbVar.a(j2, j3), z);
    }

    public static final void i(mm40 mm40Var, rrl rrlVar, fet fetVar, int i) {
        int i2;
        rrl rrlVar2 = rrlVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(943766645);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(rrlVar2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarN = s5x0.N(piz.R(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 16.0f, 0.0f, 10);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.s(jm40Var, 40.0f), 6.0f, 0.0f, 2);
            String strL = ttm0.L(3, rrlVar2.f30990a);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            y9q0 y9q0VarT = g1t0.t();
            zfn zfnVar3 = m8m0.f21378a;
            v8q0.a(strL, mm40VarL, ((StaticColors) fetVar2.k(zfnVar3)).m98getGreen0d7_KjU(), gfk0.b(qmk.s, qmk.w), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarT, fetVar, 0, 24576, 113648);
            mm40 mm40VarE2 = new x7z(1.0f, true).e(new ecu0(yx7Var));
            rrlVar2 = rrlVar;
            String str = rrlVar2.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), gfk0.b(qmk.q, qmk.r), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_checkmark, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((StaticColors) fetVar2.k(zfnVar3)).m98getGreen0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new prl(mm40Var, rrlVar2, i, (byte) 3);
        }
    }

    public static final cdq i0(fdq fdqVar) {
        fdqVar.getClass();
        Integer num = fdqVar.f9369a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = fdqVar.b;
        if (str == null) {
            str = "";
        }
        return new cdq(iIntValue, str);
    }

    public static final void j(mm40 mm40Var, rrl rrlVar, wrl wrlVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(1210614994);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(rrlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(wrlVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(piz.R(o7k0.e(mm40VarD, 60.0f), afn0.m(fetVar).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 40.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
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
            mm40 mm40VarS2 = o7k0.s(jm40Var, 28.0f);
            String strL = ttm0.L(3, rrlVar.f30990a);
            afn0.v(fetVar).getClass();
            int i3 = i2;
            v8q0.a(strL, mm40VarS2, afn0.m(fetVar).getPrimary(), gfk0.b(qmk.s, qmk.w), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.p(), fetVar, 0, 24576, 113648);
            long primary = afn0.m(fetVar).getPrimary();
            long background = afn0.m(fetVar).getBackground();
            mm40 mm40VarS3 = o7k0.s(jm40Var, 32.0f);
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                unm unmVar = new unm(tnm.f34243a, primary, primary, background, 6.0f, 6.0f, wrlVar.f39649a, wrlVar.b, true, 512);
                fetVar.o0(unmVar);
                objP = unmVar;
            }
            snm.b(mm40VarS3, (unm) objP, fetVar, 0);
            fetVar.r(true);
            mm40 mm40VarE = new x7z(1.0f, true).e(new ecu0(yx7Var));
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            String str = rrlVar.b;
            afn0.v(fetVar).getClass();
            y9q0 y9q0VarL = g1t0.l();
            long textPrimary = afn0.m(fetVar).getTextPrimary();
            long j = qmk.q;
            v8q0.a(str, null, textPrimary, gfk0.b(j, qmk.r), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarL, fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            String str2 = rrlVar.c;
            if (str2 == null || str2.length() == 0) {
                fetVar2.e0(1435923679);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1435461004);
                String str3 = rrlVar.c;
                afn0.v(fetVar).getClass();
                v8q0.a(str3, null, afn0.m(fetVar).getSecondary(), gfk0.b(qmk.p, j), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110578);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qrl(mm40Var, rrlVar, wrlVar, i, (byte) 0);
        }
    }

    public static final void k(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2090623457);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var3 = i4 != 0 ? jm40Var : mm40Var;
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40Var3, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 2.0f, 2.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            zfn zfnVar = m8m0.f21378a;
            long jM98getGreen0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m98getGreen0d7_KjU();
            zcl zclVar2 = qmk.c;
            mm40 mm40VarK2 = s5x0.K(i120.Q(jm40Var, jM98getGreen0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 2.0f, 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK2);
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
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a("WIN", jm40Var, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.c(), fetVar, 54, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = mm40Var3;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var2, i, i2, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:81:0x015c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:88:0x019b  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void l(mm40 mm40Var, mdm mdmVar, boolean z, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        boolean z2;
        int i4;
        Function0 function1;
        int i5;
        int i6;
        byte b;
        boolean z3;
        mm40 mm40Var3;
        boolean z4;
        Function0 function2;
        yfe0 yfe0VarU;
        boolean z5;
        cl5 cl5Var;
        float fB;
        float fB2;
        int iB;
        int i7;
        int iC;
        boolean z6;
        boolean z7;
        boolean zE;
        Object objP;
        Object objP2;
        mdm mdmVar2 = mdmVar;
        mdmVar2.getClass();
        fetVar.g0(-1553638733);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
            i3 |= fetVar.g(mdmVar2) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function1 = function0;
                    if (fetVar.i(function1)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                b = 0;
                if ((i6 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i6 & 1, z3)) {
                    if (i8 != 0) {
                        mm40Var3 = jm40.b;
                    } else {
                        mm40Var3 = mm40Var2;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i4 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm(b);
                            fetVar.o0(objP2);
                        }
                        function1 = (Function0) objP2;
                    }
                    zcl zclVar = qmk.f28987a;
                    fB = pkd.b(108.0f, fetVar);
                    fB2 = pkd.b(256.0f, fetVar);
                    iB = (int) pkd.b(8.0f, fetVar);
                    int i10 = (i6 >> 3) & 14;
                    fetVar.e0(1396528625);
                    if (mdmVar2.b != pdm.f26814a) {
                        fetVar.r(false);
                        iC = 0;
                        i7 = 32;
                    } else {
                        i7 = 32;
                        iC = (int) l1e0.c(((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32)) / 2.1f, fB, fB2);
                        fetVar.r(false);
                    }
                    mm40 mm40VarE0 = o2e.e0(mm40Var3, "EMPTY_UI_CONTENT");
                    if ((i6 & 112) == i7) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((i6 & 896) == 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zE = z6 | z7 | fetVar.e(iC) | fetVar.d(fB) | fetVar.d(fB2) | fetVar.e(iB);
                    objP = fetVar.P();
                    if (!zE || objP == cl5Var) {
                        mdmVar2 = mdmVar;
                        odm odmVar = new odm(mdmVar2, z5, iC, fB, fB2, iB);
                        fetVar.o0(odmVar);
                        objP = odmVar;
                    } else {
                        mdmVar2 = mdmVar;
                    }
                    tj30 tj30Var = (tj30) objP;
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
                    q(mdmVar2, function1, fetVar, ((i6 >> 6) & 112) | i10);
                    fetVar.r(true);
                    z4 = z5;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    z4 = z2;
                }
                function2 = function1;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new ut8(mm40Var3, mdmVar2, z4, function2, i, i2, (byte) 1);
                }
            }
            i3 |= 3072;
            function1 = function0;
            i6 = i3;
            b = 0;
            if ((i6 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i6 & 1, z3)) {
                if (i8 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                cl5Var = ukd.f35823a;
                if (i4 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new ndm(b);
                        fetVar.o0(objP2);
                    }
                    function1 = (Function0) objP2;
                }
                zcl zclVar2 = qmk.f28987a;
                fB = pkd.b(108.0f, fetVar);
                fB2 = pkd.b(256.0f, fetVar);
                iB = (int) pkd.b(8.0f, fetVar);
                int i11 = (i6 >> 3) & 14;
                fetVar.e0(1396528625);
                if (mdmVar2.b != pdm.f26814a) {
                    fetVar.r(false);
                    iC = 0;
                    i7 = 32;
                } else {
                    i7 = 32;
                    iC = (int) l1e0.c(((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32)) / 2.1f, fB, fB2);
                    fetVar.r(false);
                }
                mm40 mm40VarE1 = o2e.e0(mm40Var3, "EMPTY_UI_CONTENT");
                if ((i6 & 112) == i7) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i6 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zE = z6 | z7 | fetVar.e(iC) | fetVar.d(fB) | fetVar.d(fB2) | fetVar.e(iB);
                objP = fetVar.P();
                if (zE) {
                    mdmVar2 = mdmVar;
                    odm odmVar2 = new odm(mdmVar2, z5, iC, fB, fB2, iB);
                    fetVar.o0(odmVar2);
                    objP = odmVar2;
                } else {
                    mdmVar2 = mdmVar;
                    odm odmVar3 = new odm(mdmVar2, z5, iC, fB, fB2, iB);
                    fetVar.o0(odmVar3);
                    objP = odmVar3;
                }
                tj30 tj30Var2 = (tj30) objP;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var2, gqw0.x);
                jpm0.o(fetVar, bh90VarM2, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, gqw0.v);
                q(mdmVar2, function1, fetVar, ((i6 >> 6) & 112) | i11);
                fetVar.r(true);
                z4 = z5;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                z4 = z2;
            }
            function2 = function1;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ut8(mm40Var3, mdmVar2, z4, function2, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                if (fetVar.i(function1)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3;
            b = 0;
            if ((i6 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i6 & 1, z3)) {
                if (i8 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                cl5Var = ukd.f35823a;
                if (i4 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new ndm(b);
                        fetVar.o0(objP2);
                    }
                    function1 = (Function0) objP2;
                }
                zcl zclVar3 = qmk.f28987a;
                fB = pkd.b(108.0f, fetVar);
                fB2 = pkd.b(256.0f, fetVar);
                iB = (int) pkd.b(8.0f, fetVar);
                int i12 = (i6 >> 3) & 14;
                fetVar.e0(1396528625);
                if (mdmVar2.b != pdm.f26814a) {
                    fetVar.r(false);
                    iC = 0;
                    i7 = 32;
                } else {
                    i7 = 32;
                    iC = (int) l1e0.c(((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32)) / 2.1f, fB, fB2);
                    fetVar.r(false);
                }
                mm40 mm40VarE2 = o2e.e0(mm40Var3, "EMPTY_UI_CONTENT");
                if ((i6 & 112) == i7) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i6 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zE = z6 | z7 | fetVar.e(iC) | fetVar.d(fB) | fetVar.d(fB2) | fetVar.e(iB);
                objP = fetVar.P();
                if (zE) {
                    mdmVar2 = mdmVar;
                    odm odmVar4 = new odm(mdmVar2, z5, iC, fB, fB2, iB);
                    fetVar.o0(odmVar4);
                    objP = odmVar4;
                } else {
                    mdmVar2 = mdmVar;
                    odm odmVar5 = new odm(mdmVar2, z5, iC, fB, fB2, iB);
                    fetVar.o0(odmVar5);
                    objP = odmVar5;
                }
                tj30 tj30Var3 = (tj30) objP;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var3, gqw0.x);
                jpm0.o(fetVar, bh90VarM3, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC2, gqw0.v);
                q(mdmVar2, function1, fetVar, ((i6 >> 6) & 112) | i12);
                fetVar.r(true);
                z4 = z5;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                z4 = z2;
            }
            function2 = function1;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ut8(mm40Var3, mdmVar2, z4, function2, i, i2, (byte) 1);
            }
        }
        i3 |= 3072;
        function1 = function0;
        i6 = i3;
        b = 0;
        if ((i6 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i6 & 1, z3)) {
            if (i8 != 0) {
                mm40Var3 = jm40.b;
            } else {
                mm40Var3 = mm40Var2;
            }
            if (i9 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            cl5Var = ukd.f35823a;
            if (i4 != 0) {
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new ndm(b);
                    fetVar.o0(objP2);
                }
                function1 = (Function0) objP2;
            }
            zcl zclVar4 = qmk.f28987a;
            fB = pkd.b(108.0f, fetVar);
            fB2 = pkd.b(256.0f, fetVar);
            iB = (int) pkd.b(8.0f, fetVar);
            int i13 = (i6 >> 3) & 14;
            fetVar.e0(1396528625);
            if (mdmVar2.b != pdm.f26814a) {
                fetVar.r(false);
                iC = 0;
                i7 = 32;
            } else {
                i7 = 32;
                iC = (int) l1e0.c(((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32)) / 2.1f, fB, fB2);
                fetVar.r(false);
            }
            mm40 mm40VarE3 = o2e.e0(mm40Var3, "EMPTY_UI_CONTENT");
            if ((i6 & 112) == i7) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i6 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            zE = z6 | z7 | fetVar.e(iC) | fetVar.d(fB) | fetVar.d(fB2) | fetVar.e(iB);
            objP = fetVar.P();
            if (zE) {
                mdmVar2 = mdmVar;
                odm odmVar6 = new odm(mdmVar2, z5, iC, fB, fB2, iB);
                fetVar.o0(odmVar6);
                objP = odmVar6;
            } else {
                mdmVar2 = mdmVar;
                odm odmVar7 = new odm(mdmVar2, z5, iC, fB, fB2, iB);
                fetVar.o0(odmVar7);
                objP = odmVar7;
            }
            tj30 tj30Var4 = (tj30) objP;
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE3);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var4, gqw0.x);
            jpm0.o(fetVar, bh90VarM4, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC3, gqw0.v);
            q(mdmVar2, function1, fetVar, ((i6 >> 6) & 112) | i13);
            fetVar.r(true);
            z4 = z5;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            z4 = z2;
        }
        function2 = function1;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ut8(mm40Var3, mdmVar2, z4, function2, i, i2, (byte) 1);
        }
    }

    public static final void m(mm40 mm40Var, q1n q1nVar, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-48223015);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(q1nVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (q1nVar.g) {
                fetVar.e0(902329280);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(902330204);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(994681241, new vsm(mm40Var, q1nVar), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vsm(mm40Var, q1nVar, i);
        }
    }

    public static final void n(mm40 mm40Var, yxm yxmVar, fet fetVar, int i) {
        fet fetVar2;
        String str = yxmVar.e;
        String str2 = yxmVar.d;
        fetVar.g0(-1582634613);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(yxmVar) ? 32 : 16);
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
            x(0, fetVar, null, yxmVar.b, yxmVar.f43429a);
            if (str2.length() <= 0 && str.length() <= 0 && yxmVar.c.length() <= 0) {
                fetVar2 = fetVar;
                fetVar2.e0(-310707507);
                fetVar2.r(false);
            } else {
                fetVar.e0(-310935264);
                fetVar2 = fetVar;
                sj3.p(6, 0, fetVar2, jm40.b, yxmVar.c, str2, str);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, yxmVar, i, (byte) 14);
        }
    }

    public static final void o(mm40 mm40Var, g1g0 g1g0Var, boolean z, fet fetVar, int i) {
        g1g0Var.getClass();
        fetVar.g0(-1963628653);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(g1g0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (g1g0Var instanceof e1g0) {
            fetVar.e0(-1006322915);
            e1g0 e1g0Var = (e1g0) g1g0Var;
            agc.s(mm40Var, z, new qxm(e1g0Var.f7034a, e1g0Var.b, e1g0Var.c), fetVar, (i2 & 14) | ((i2 >> 3) & 112));
            fetVar.r(false);
        } else {
            if (!(g1g0Var instanceof f1g0)) {
                throw b1j.f(-1556485025, fetVar, false);
            }
            fetVar.e0(-1005770092);
            f1g0 f1g0Var = (f1g0) g1g0Var;
            xzm xzmVar = f1g0Var.f8763a;
            xzm xzmVar2 = f1g0Var.b;
            a2m a2mVar = f1g0Var.c;
            jwm jwmVar = f1g0Var.d;
            jwm jwmVar2 = f1g0Var.e;
            jwm jwmVar3 = f1g0Var.f;
            uso0 uso0Var = uso0.f36223a;
            wvb.s(mm40Var, new rzm(xzmVar, xzmVar2, a2mVar, jwmVar, jwmVar2, jwmVar3, z), fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) g1g0Var, z, i, (byte) 2);
        }
    }

    public static final void p(mm40 mm40Var, ksn ksnVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        ksnVar.getClass();
        fetVar2.g0(-1821513910);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ksnVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, background, vgg0.a(16.0f)), 12.0f, 10.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 10.0f, 0.0f, 0.0f, 0.0f, 14), true);
            String str = ksnVar.f18822a;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarH, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 28, i, mm40Var, ksnVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r21v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r21v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r21v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1 */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r3v17, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v18, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v19, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v20, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v21, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v22, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v23, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v24, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v25, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v27, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v29, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v6, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r66v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    public static final void q(mdm mdmVar, Function0 function0, fet fetVar, int i) {
        int i2;
        ?? r3;
        pz40 pz40Var;
        Object maVar;
        Long l;
        cl5 cl5Var;
        pz40 pz40Var2;
        boolean z;
        ?? r13;
        mdm mdmVar2;
        Function0 pg1Var;
        int i3;
        prs0 prs0Var;
        long j;
        long j2;
        ?? r4;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        jm40 jm40Var;
        xx7 xx7Var;
        ?? r5;
        ?? r0;
        jm40 jm40Var2;
        ?? r7;
        ?? r6;
        int i4;
        mdm mdmVar3;
        ?? r8;
        ?? r9;
        ?? r10;
        ?? r1;
        long secondary60;
        shd shdVar5 = gqw0.v;
        shd shdVar6 = gqw0.y;
        shd shdVar7 = gqw0.w;
        shd shdVar8 = gqw0.x;
        xx7 xx7Var2 = gqw0.n;
        fetVar.g0(-581766222);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mdmVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            long j3 = mdmVar.i;
            ldm ldmVar = mdmVar.c;
            long j4 = mdmVar.j;
            boolean zF = fetVar.f(j3);
            Object objP = fetVar.P();
            ldm ldmVar2 = ldmVar;
            cl5 cl5Var2 = ukd.f35823a;
            Object obj = objP;
            if (zF || objP == cl5Var2) {
                Boolean boolValueOf = Boolean.valueOf(j3 == 0);
                fetVar.o0(boolValueOf);
                obj = boolValueOf;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object objP2 = fetVar.P();
            Object obj2 = objP2;
            if (objP2 == cl5Var2) {
                vne vneVarI = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(vneVarI);
                obj2 = vneVarI;
            }
            vne vneVar = (vne) obj2;
            boolean zF2 = fetVar.f(j4) | fetVar.f(j3);
            int i5 = i2;
            Object objP3 = fetVar.P();
            Object obj3 = objP3;
            if (zF2 || objP3 == cl5Var2) {
                pz40 pz40VarE = androidx.compose.runtime.e.e(Boolean.valueOf(j4 - System.currentTimeMillis() <= 0 && j3 <= 0));
                fetVar.o0(pz40VarE);
                obj3 = pz40VarE;
            }
            pz40 pz40Var3 = (pz40) obj3;
            long j5 = j3;
            String strW = rsm0.w(R.string.update_again_after_v2, 0, fetVar);
            Object objP4 = fetVar.P();
            Object obj4 = objP4;
            if (objP4 == cl5Var2) {
                pz40 pz40VarE2 = androidx.compose.runtime.e.e(strW);
                fetVar.o0(pz40VarE2);
                obj4 = pz40VarE2;
            }
            pz40 pz40Var4 = (pz40) obj4;
            Object objP5 = fetVar.P();
            Object obj5 = objP5;
            if (objP5 == cl5Var2) {
                pz40 pz40VarE3 = androidx.compose.runtime.e.e(null);
                fetVar.o0(pz40VarE3);
                obj5 = pz40VarE3;
            }
            pz40 pz40Var5 = (pz40) obj5;
            if (j4 > 0 || j5 > 0) {
                fetVar.e0(-1203676100);
                Long lValueOf = Long.valueOf(j4);
                Long lValueOf2 = Long.valueOf(j5);
                boolean zI = ((i5 & 14) == 4) | fetVar.i(vneVar) | fetVar.g(pz40Var3) | fetVar.g(strW);
                Object objP6 = fetVar.P();
                if (zI || objP6 == cl5Var2) {
                    pz40Var = pz40Var3;
                    l = lValueOf2;
                    cl5Var = cl5Var2;
                    pz40Var2 = pz40Var4;
                    z = false;
                    maVar = new ma(mdmVar, vneVar, pz40Var5, strW, pz40Var, pz40Var2, (yje) null);
                    fetVar.o0(maVar);
                } else {
                    l = lValueOf2;
                    pz40Var = pz40Var3;
                    maVar = objP6;
                    cl5Var = cl5Var2;
                    pz40Var2 = pz40Var4;
                    z = false;
                }
                m0x0.v(lValueOf, l, (Function2) maVar, fetVar);
                fetVar.r(z);
                r13 = z;
            } else {
                fetVar.e0(-1202334544);
                fetVar.r(false);
                pz40Var2 = pz40Var4;
                shdVar5 = shdVar5;
                shdVar6 = shdVar6;
                shdVar7 = shdVar7;
                j5 = j5;
                cl5Var = cl5Var2;
                ldmVar2 = ldmVar2;
                shdVar8 = shdVar8;
                r13 = 0;
                pz40Var = pz40Var3;
            }
            boolean zF3 = fetVar.f(j5);
            Object objP7 = fetVar.P();
            if (zF3 || objP7 == cl5Var) {
                if (zBooleanValue) {
                    mdmVar2 = mdmVar;
                    pg1Var = function0;
                } else {
                    mdmVar2 = mdmVar;
                    pg1Var = new pg1((Object) function0, (Object) mdmVar, (Object) vneVar, (Object) strW, (Object) pz40Var, (Object) pz40Var2, (Object) pz40Var5, (byte) 9);
                }
                fetVar.o0(pg1Var);
                objP7 = pg1Var;
            } else {
                mdmVar2 = mdmVar;
            }
            Function0 function1 = (Function0) objP7;
            int iOrdinal = ldmVar2.ordinal();
            if (iOrdinal != 0) {
                i3 = 1;
                if (iOrdinal != 1) {
                    throw b1j.f(-731484080, fetVar, r13);
                }
                long jB = twn.B(fetVar, -1200863749, fetVar);
                prs0Var = new prs0(new y3d(jB), new y3d(jB), new y3d(jB));
                fetVar.r(r13);
            } else {
                i3 = 1;
                fetVar.e0(-1201113857);
                long textPrimary = afn0.m(fetVar).getTextPrimary();
                long secondary = afn0.m(fetVar).getSecondary();
                prs0 prs0Var2 = new prs0(new y3d(textPrimary), new y3d(secondary), new y3d(secondary));
                fetVar.r(r13);
                prs0Var = prs0Var2;
            }
            long j6 = ((y3d) prs0Var.f27482a).f41946a;
            long j7 = ((y3d) prs0Var.b).f41946a;
            long j8 = ((y3d) prs0Var.c).f41946a;
            int iOrdinal2 = mdmVar2.b.ordinal();
            jm40 jm40Var3 = jm40.b;
            if (iOrdinal2 == 0) {
                j = j7;
                j2 = j8;
                ?? r11 = fetVar;
                r11.e0(-1200673688);
                qxw.f(mdmVar2.f21603a, r13, r11, null);
                r11.r(r13);
                r4 = r11;
            } else if (iOrdinal2 != i3) {
                fetVar.e0(-1200069746);
                fetVar.r(r13);
                j = j7;
                j2 = j8;
                r4 = fetVar;
            } else {
                fetVar.e0(-1200555640);
                int iOrdinal3 = ldmVar2.ordinal();
                if (iOrdinal3 == 0) {
                    fetVar.e0(-731461027);
                    secondary60 = afn0.m(fetVar).getSecondary60();
                    fetVar.r(r13);
                } else {
                    if (iOrdinal3 != i3) {
                        throw b1j.f(-731463600, fetVar, r13);
                    }
                    fetVar.e0(-731458313);
                    secondary60 = afn0.p(fetVar).m123getWhite0d7_KjU();
                    fetVar.r(r13);
                }
                zcl zclVar = qmk.f28987a;
                j = j7;
                j2 = j8;
                j0x.b(a8k0.F(mdmVar2.d, r13, fetVar), null, o7k0.n(jm40Var3, 56.0f), null, null, 0.0f, new m78(secondary60, 5), fetVar, 56, 56);
                ?? r12 = fetVar;
                r12.r(r13);
                r4 = r12;
            }
            String strW2 = rsm0.w(mdmVar2.e, r13, r4);
            ?? r14 = strW2.length() > 0 ? i3 : r13;
            String strW3 = rsm0.w(mdmVar2.f, r13, r4);
            ?? r36 = strW3.length() > 0 ? i3 : r13;
            pcy pcyVar = e7z.u1;
            if (r14 == 0 && r36 == 0) {
                r4.e0(-1198780208);
                r4.r(r13);
                pcyVar = pcyVar;
                mdmVar3 = mdmVar2;
                i4 = i3;
                jm40Var2 = jm40Var3;
                r8 = r13;
                xx7Var = xx7Var2;
                shdVar = shdVar5;
                shdVar2 = shdVar6;
                shdVar3 = shdVar7;
                shdVar4 = shdVar8;
                r9 = r4;
            } else {
                r4.e0(-1199784639);
                zcl zclVar2 = qmk.f28987a;
                x5d x5dVarA = w5d.a(new qw3(8.0f, r13, null), xx7Var2, r4, 48);
                ?? r22 = r14;
                int iHashCode = Long.hashCode(r4.T);
                bh90 bh90VarM = r4.m();
                mm40 mm40VarC0 = kbc.c0(r4, jm40Var3);
                mkd.c0.getClass();
                r4.i0();
                if (r4.S) {
                    r4.l(pcyVar);
                } else {
                    r4.r0();
                }
                shd shdVar9 = shdVar8;
                jpm0.o(r4, x5dVarA, shdVar9);
                shd shdVar10 = shdVar7;
                jpm0.o(r4, bh90VarM, shdVar10);
                shd shdVar11 = shdVar6;
                vqd.u(iHashCode, r4, shdVar11, r4);
                shd shdVar12 = shdVar5;
                jpm0.o(r4, mm40VarC0, shdVar12);
                if (r22 != 0) {
                    r4.e0(-1433996989);
                    ?? r21 = r4;
                    shdVar2 = shdVar11;
                    shdVar3 = shdVar10;
                    shdVar4 = shdVar9;
                    xx7Var = xx7Var2;
                    jm40Var = jm40Var3;
                    shdVar = shdVar12;
                    v8q0.a(strW2, o2e.e0(s5x0.L(jm40Var3, 16.0f, 0.0f, 2), "DsEmptyTitleTextTestTag"), j6, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), r21, 0, 0, 130040);
                    ?? r15 = r21;
                    r0 = 0;
                    r15.r(false);
                    r5 = r15;
                } else {
                    shdVar = shdVar12;
                    shdVar2 = shdVar11;
                    shdVar3 = shdVar10;
                    shdVar4 = shdVar9;
                    jm40Var = jm40Var3;
                    ?? r2 = r13;
                    xx7Var = xx7Var2;
                    r4.e0(-1433624648);
                    r4.r(r2);
                    r0 = r2;
                    r5 = r4;
                }
                if (r36 != 0) {
                    r5.e0(-1433561129);
                    jm40 jm40Var4 = jm40Var;
                    ?? r23 = r5;
                    jm40Var2 = jm40Var4;
                    v8q0.a(strW3, o2e.e0(s5x0.L(jm40Var4, 16.0f, 0.0f, 2), "DsEmptySubtitleTextTestTag"), j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), r23, 0, 0, 130040);
                    ?? r16 = r23;
                    r7 = 0;
                    r16.r(false);
                    r6 = r16;
                } else {
                    ?? r17 = r0;
                    jm40Var2 = jm40Var;
                    r5.e0(-1433177256);
                    r5.r(r17);
                    r6 = r5;
                    r7 = r17;
                }
                i4 = 1;
                r6.r(true);
                r6.r(r7);
                mdmVar3 = mdmVar;
                r9 = r6;
                r8 = r7;
            }
            String strW4 = rsm0.w(mdmVar3.h, r8, r9);
            if (strW4.length() > 0) {
                r9.e0(-1198653883);
                wul wulVar = new wul(ldmVar2 == ldm.b ? oul.e : lul.e, oe9.f25112a, new ue9(strW4), ((Boolean) pz40Var.getValue()).booleanValue(), false, false);
                zcl zclVar3 = qmk.f28987a;
                x5d x5dVarA2 = w5d.a(new qw3(8.0f, r8, null), xx7Var, r9, 48);
                int iHashCode2 = Long.hashCode(r9.T);
                bh90 bh90VarM2 = r9.m();
                jm40 jm40Var5 = jm40Var2;
                mm40 mm40VarC1 = kbc.c0(r9, jm40Var5);
                mkd.c0.getClass();
                r9.i0();
                if (r9.S) {
                    r9.l(pcyVar);
                } else {
                    r9.r0();
                }
                jpm0.o(r9, x5dVarA2, shdVar4);
                jpm0.o(r9, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, r9, shdVar2, r9);
                jpm0.o(r9, mm40VarC1, shdVar);
                qzb.n(s5x0.L(jm40Var5, 16.0f, 0.0f, 2), wulVar, function1, r9, 0, 0);
                v8q0.a((String) pz40Var2.getValue(), o2e.e0(s5x0.L(epv0.N(jm40Var5, ((Number) d43.b(!((Boolean) pz40Var.getValue()).booleanValue() ? 1.0f : 0.0f, null, null, null, fetVar, 0, 30).getValue()).floatValue()), 16.0f, 0.0f, 2), "DsEmptyTimerTextTestTag"), j2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 130040);
                ?? r18 = fetVar;
                r18.r(true);
                r18.r(false);
                r3 = r18;
            } else {
                ?? r19 = r8;
                jm40 jm40Var6 = jm40Var2;
                r9.e0(-1197210771);
                String strW5 = rsm0.w(mdmVar.g, r19 == true ? 1 : 0, r9);
                if (strW5.length() > 0) {
                    r9.e0(-1197108440);
                    ?? r24 = r9;
                    v8q0.a(strW5, s5x0.L(jm40Var6, 16.0f, 0.0f, 2), j2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), r24, 0, 0, 130040);
                    ?? r20 = r24;
                    r1 = 0;
                    r20.r(false);
                    r10 = r20;
                } else {
                    r9.e0(-1196844816);
                    r9.r(r19);
                    r1 = r19;
                    r10 = r9;
                }
                r10.r(r1);
                r3 = r10;
            }
        } else {
            ?? r25 = fetVar;
            r25.X();
            r3 = r25;
        }
        yfe0 yfe0VarU = r3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mdmVar, (Object) function0, i, (byte) 26);
        }
    }

    public static final void r(cmk0 cmk0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-2024163888);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(cmk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            kbc.l(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), cmk0Var.f4609a, 0L, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(cmk0Var, i, (byte) 27);
        }
    }

    public static final void s(mm40 mm40Var, imo imoVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        imo imoVar2;
        mm40 mm40Var3;
        pz40 pz40Var;
        int i4;
        t33 t33Var;
        int i5;
        fet fetVar2 = fetVar;
        imoVar.getClass();
        function1.getClass();
        fetVar2.g0(1777346022);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            i3 |= fetVar2.g(imoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (i6 != 0) {
                mm40Var2 = jm40Var;
            }
            boolean z = imoVar.c;
            boolean z2 = false;
            l7m0 l7m0VarB = d43.b(z ? 180.0f : 0.0f, ro4.m0(Response.OK, 0, null, 6), null, null, fetVar2, 48, 28);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(1.0f);
                fetVar2.o0(objP);
            }
            t33 t33Var2 = (t33) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(z ? imoVar.b : imoVar.f15036a);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.valueOf(z));
                fetVar2.o0(objP3);
            }
            pz40 pz40Var3 = (pz40) objP3;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i7 = i3 & 112;
            boolean zI = (i7 == 32) | fetVar2.i(t33Var2);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var) {
                pz40Var = pz40Var2;
                i4 = 256;
                t33Var = t33Var2;
                i5 = i7;
                xb2 xb2Var = new xb2(imoVar, t33Var, pz40Var3, pz40Var, null, (byte) 16);
                fetVar2.o0(xb2Var);
                objP4 = xb2Var;
            } else {
                i5 = i7;
                i4 = 256;
                pz40Var = pz40Var2;
                t33Var = t33Var2;
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP4);
            mm40 mm40VarY = o7k0.y(mm40Var2, null, 3);
            zfn zfnVar = m8m0.f21378a;
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU();
            zcl zclVar = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarY, jM125getWhite100d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
            boolean z3 = (i3 & 896) == i4;
            if (i5 == 32) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objP5 = fetVar2.P();
            if (z4 || objP5 == cl5Var) {
                imoVar2 = imoVar;
                objP5 = new gnm(function1, imoVar2, (byte) 29);
                fetVar2.o0(objP5);
            } else {
                imoVar2 = imoVar;
            }
            mm40 mm40VarK = s5x0.K(y860.W(mm40VarQ, null, null, false, null, (Function0) objP5, 28), 16.0f, 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            m78 m78Var = new m78(StaticColors.INSTANCE.m123getWhite0d7_KjU(), 5);
            mm40 mm40VarN = o7k0.n(jm40Var, 12.0f);
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP6 = fetVar2.P();
            if (zG || objP6 == cl5Var) {
                objP6 = new x1d(l7m0VarB, (byte) 26);
                fetVar2.o0(objP6);
            }
            mm40 mm40Var4 = mm40Var2;
            k7x.a(Integer.valueOf(R.drawable.ic_glyph_chevron_down_small), null, i4w0.T(mm40VarN, (Function1) objP6), null, m78Var, fetVar, 48, 1784);
            boolean zI2 = fetVar.i(t33Var);
            Object objP7 = fetVar.P();
            if (zI2 || objP7 == cl5Var) {
                objP7 = new m53(t33Var, (byte) 14);
                fetVar.o0(objP7);
            }
            mm40 mm40VarT = i4w0.T(jm40Var, (Function1) objP7);
            String upperCase = ((String) pz40Var.getValue()).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            v8q0.a(upperCase, mm40VarT, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.o, null, j1t0.f15753a, 0L, null, 0, 0, qmk.B, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var3 = mm40Var4;
        } else {
            imoVar2 = imoVar;
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) imoVar2, (Object) function1, i, i2, (byte) 25);
        }
    }

    public static final void t(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        fetVar.g0(412571604);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ugg0 ugg0VarA = vgg0.a(f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.n(i120.Q(mm40Var, ((ThemeColors) fetVar.k(zfnVar)).getCommerce(), ugg0VarA), f2), "GREEN_PLUS_ICON");
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_replenish, 0, fetVar), null, o7k0.e(jr8.f16991a.b(jm40.b, zx7Var), f2), ((ThemeColors) fetVar.k(zfnVar)).getCommerceForeground(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vil(mm40Var, f, f2, i, (byte) 0);
        }
    }

    public static final void u(mm40 mm40Var, ejv ejvVar, zx7 zx7Var, fet fetVar, int i) {
        fetVar.g0(269824564);
        int i2 = i | 6 | (fetVar.g(ejvVar) ? 32 : 16);
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                float[] fArrA = g4d.a();
                g4d.b(fArrA);
                g4d g4dVar = new g4d(fArrA);
                fetVar.o0(g4dVar);
                objP = g4dVar;
            }
            float[] fArr = ((g4d) objP).f10660a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                if (ejvVar.b && ejvVar.c) {
                    z = true;
                }
                objP2 = Boolean.valueOf(z);
                fetVar.o0(objP2);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(172545396, new p2n(zx7Var, ejvVar, ((Boolean) objP2).booleanValue(), fArr), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var2, ejvVar, zx7Var, i, (byte) 11);
        }
    }

    public static final void v(mm40 mm40Var, float f, long j, fet fetVar, int i, int i2) {
        int i3;
        long jD;
        float f2;
        mm40 mm40Var2;
        long j2;
        float f3;
        fetVar.g0(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            jD = j;
            i3 |= ((i2 & 4) == 0 && fetVar.f(jD)) ? 256 : 128;
        } else {
            jD = j;
        }
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if (i4 != 0) {
                    mm40Var = jm40.b;
                }
                f3 = i5 != 0 ? swk.f32925a : f;
                if ((i2 & 4) != 0) {
                    float f4 = swk.f32925a;
                    i3 &= -897;
                    jD = v4d.d(ywk.f43373a, fetVar);
                }
            } else {
                fetVar.X();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                f3 = f;
            }
            fetVar.s();
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var, 1.0f), f3);
            boolean z = ((((i3 & 896) ^ 384) > 256 && fetVar.f(jD)) || (i3 & 384) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new wwk(f3, jD, b);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarE, (Function1) objP, fetVar, 0);
            f2 = f3;
            j2 = jD;
            mm40Var2 = mm40Var;
        } else {
            fetVar.X();
            f2 = f;
            mm40Var2 = mm40Var;
            j2 = jD;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xwk(mm40Var2, f2, j2, i, i2, (byte) 1);
        }
    }

    public static final void w(mm40 mm40Var, kgg kggVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        function0.getClass();
        function1.getClass();
        fetVar2.g0(1395337041);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(kggVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (!fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar2.X();
        } else if (kggVar.f18237a) {
            fetVar2.e0(1792550178);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "CYBER_CHAMPS_MULTISELECT_BOTTOM_BAR");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(bww.U(mm40VarE0, 8.0f, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12), 0L, 0L, 24), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundContent(), jd8.n), xfn.a(fetVar2).d, 12.0f, xfn.a(fetVar2).d, 28.0f);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
            jm40 jm40Var = jm40.b;
            qzb.n(o7k0.d(jm40Var, 1.0f), kggVar.b, function1, fetVar2, ((i2 >> 3) & 896) | 6, 0);
            fetVar2 = fetVar;
            qzb.n(o7k0.d(jm40Var, 1.0f), kggVar.c, function0, fetVar2, (i2 & 896) | 6, 0);
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            fetVar2.e0(1793763921);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 20, i, (Object) mm40Var, (Object) kggVar, (Object) function0, (Object) function1);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, c280 c280Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2037466915);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(c280Var) ? 256 : 128) | (fetVar2.g(null) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 52.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
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
            fetVar2.e0(-44601588);
            boolean zG = fetVar2.g(c280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.h, c280Var);
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
            fetVar2.e0(-44157111);
            fetVar2.r(false);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, y9q0VarM, fetVar2, (i2 >> 3) & 14, 24960, 109552);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxm(mm40Var2, str, c280Var, i, (byte) 0);
        }
    }

    public static final void y(mm40 mm40Var, w1n w1nVar, fet fetVar, int i) {
        byte b;
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(267518804);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(w1nVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarN = s5x0.N(new x7z(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            String str = w1nVar.f38410a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            zx7 zx7Var = gqw0.f;
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            kc5.N(str, mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.m().f42262a.b, null, null, 0L, zx7Var, 2, false, 3, 0, false, null, y9q0VarM, 0.0f, fetVar, 0, 1600512, 0, 3055416);
            fetVar2 = fetVar;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40.b);
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
            d280 d280Var = w1nVar.b;
            cl5 cl5Var = ukd.f35823a;
            if (d280Var != null) {
                fetVar2.e0(1290963838);
                i2 = 32;
                boolean z3 = (i3 & 112) == 32;
                Object objP = fetVar2.P();
                if (z3 || objP == cl5Var) {
                    z = false;
                    objP = new wsm(w1nVar, (byte) 0);
                    fetVar2.o0(objP);
                } else {
                    z = false;
                }
                kkb.p(1, fetVar2, null, (Function0) objP);
                fetVar2.r(z);
            } else {
                i2 = 32;
                fetVar2.e0(1291292500);
                fetVar2.r(false);
            }
            if (w1nVar.c != null) {
                fetVar2.e0(1291341790);
                boolean z4 = (i3 & 112) == i2;
                Object objP2 = fetVar2.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new wsm(w1nVar, (byte) 1);
                    fetVar2.o0(objP2);
                }
                kkb.p(1, fetVar2, null, (Function0) objP2);
                b = 0;
                fetVar2.r(false);
            } else {
                b = 0;
                fetVar2.e0(1291670452);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xsm(mm40Var, w1nVar, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(mm40 mm40Var, w1n w1nVar, fet fetVar, int i) {
        byte b;
        fet fetVar2;
        boolean z;
        fet fetVar3 = fetVar;
        fetVar3.g0(845882426);
        int i2 = i | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.g(w1nVar) ? 32 : 16);
        if (fetVar3.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
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
            jpm0.o(fetVar3, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar3, jm40Var);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            d280 d280Var = w1nVar.b;
            cl5 cl5Var = ukd.f35823a;
            if (d280Var != null) {
                fetVar3.e0(-87164712);
                boolean z3 = (i2 & 112) == 32;
                Object objP = fetVar3.P();
                if (z3 || objP == cl5Var) {
                    objP = new wsm(w1nVar, (byte) 2);
                    fetVar3.o0(objP);
                }
                kkb.p(1, fetVar3, null, (Function0) objP);
                fetVar3.r(false);
            } else {
                fetVar3.e0(-86836050);
                fetVar3.r(false);
            }
            if (w1nVar.c != null) {
                fetVar3.e0(-86786760);
                boolean z4 = (i2 & 112) == 32;
                Object objP2 = fetVar3.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new wsm(w1nVar, (byte) 3);
                    fetVar3.o0(objP2);
                }
                z = true;
                kkb.p(1, fetVar3, null, (Function0) objP2);
                fetVar3.r(false);
            } else {
                z = true;
                fetVar3.e0(-86458098);
                fetVar3.r(false);
            }
            fetVar3.r(z);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), z);
            String str = w1nVar.f38410a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar3.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long j = qmk.q;
            ((g1t0) fetVar3.k(zfnVar)).getClass();
            boolean z5 = z;
            kc5.N(str, mm40VarH, ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.m().f42262a.b, null, null, 0L, null, 2, false, 3, 0, false, null, y9q0VarM, 0.0f, fetVar, 0, 1597440, 0, 3063608);
            fet fetVar4 = fetVar;
            fetVar4.r(z5);
            b = z5;
            fetVar2 = fetVar4;
        } else {
            b = 1;
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xsm(mm40Var, w1nVar, i, b);
        }
    }
}
