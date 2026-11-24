package a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.icu.util.ULocale;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.Window;
import com.google.android.gms.common.Feature;
import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.internal.WebViewLoginActivity;
import java.math.BigDecimal;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bsr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f3146a = new ugd(1136078149, false, new qbd((byte) 8));
    public static final ugd b = new ugd(-689116213, false, new bhd(7));
    public static final ugd c = new ugd(955027704, false, new ehd(17));
    public static final ugd d = new ugd(1590499694, false, new wgd(2));
    public static final ugd e = new ugd(-1676839831, false, new qhd(17));
    public static final Feature f;
    public static final Feature[] g;

    static {
        Feature feature = new Feature("GET_CREDENTIAL", 1L);
        f = feature;
        g = new Feature[]{feature, new Feature("CREDENTIAL_REGISTRY", 1L), new Feature("CLEAR_REGISTRY", 2L), new Feature("CLEAR_CREATION_OPTIONS", 1L), new Feature("CLEAR_CREDENTIAL_STATE", 1L), new Feature("CREATE_CREDENTIAL", 3L), new Feature("REGISTER_CREATION_OPTIONS", 1L), new Feature("REGISTER_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS", 1L), new Feature("SIGNAL_CREDENTIAL_STATE", 1L), new Feature("CLEAR_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new Feature("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new Feature("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }

    public static final void A(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1183609092);
        int i2 = i | 6 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            jcb.l(null, mdmVar, false, function0, fetVar, (i2 & 112) | ((i2 << 3) & 7168), 5);
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var2, mdmVar, function0, i, (byte) 10);
        }
    }

    public static final void B(mm40 mm40Var, w170 w170Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1858650984);
        int i2 = i | 6 | (fetVar.g(w170Var) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            w170Var.getClass();
            fqj0 fqj0VarD0 = vbc.d0(vqm.f37862a, fetVar, 0, 0);
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            float f2 = qmk.a(fetVar).d;
            lh80 lh80Var = new lh80(f2, 8.0f, f2, 8.0f);
            boolean zG = fetVar.g(fqj0VarD0) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new rw40(w170Var, fqj0VarD0, (byte) 26);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarD, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var2, w170Var, i, b2);
        }
    }

    public static final void C(mm40 mm40Var, r170 r170Var, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1482984331);
        int i2 = i | (fetVar2.g(r170Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            gy30 gy30Var = r170Var.b;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new a540((Object) r170Var, (Object) function0, (byte) 23);
                fetVar2.o0(objP);
            }
            jiq0.y(mm40VarW, gy30Var, (Function0) objP, null, null, fetVar, 6, 24);
            fetVar2 = fetVar;
            if (r170Var.c) {
                fetVar2.e0(88390813);
                jr8 jr8Var = jr8.f16991a;
                mm40 mm40VarA = jr8Var.a(jm40Var);
                zfn zfnVar = zaq0.b;
                long backgroundLight60 = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundLight60();
                zcl zclVar = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                zq8.a(0, fetVar2, i120.Q(mm40VarA, backgroundLight60, new ugg0(zclVar, zclVar, zclVar, zclVar)));
                j0x.b(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar2), null, jr8Var.b(s5x0.J(i120.Q(o7k0.n(jm40Var, 40.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.f37379a), 8.0f), gqw0.e), null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 5), fetVar2, 56, 56);
                fetVar2.r(false);
            } else {
                fetVar2.e0(89169223);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var, r170Var, function0, i, (byte) 13);
        }
    }

    public static final void D(mm40 mm40Var, e270 e270Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        e270Var.getClass();
        function1.getClass();
        fetVar2.g0(1471193490);
        int i2 = i | (fetVar2.g(e270Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar2), fetVar2, 24576);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = e270Var.f7072a;
                fetVar2.o0(objP);
            }
            imm immVar = (imm) objP;
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = e270Var.b;
                fetVar2.o0(objP2);
            }
            q070 q070Var = (q070) objP2;
            boolean z4 = i3 == 32;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = e270Var.c;
                fetVar2.o0(objP3);
            }
            y170 y170Var = (y170) objP3;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE0 = o2e.e0(cjx.V(i120.Q(mm40Var, s6t0.b().f33626a.getBackground(), jd8.n).e(o7k0.c), cloVarB.e, null), "ONE_X_GAME_PROMO_SCREEN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            q0x.p(null, cloVarB, u1c.M(1427650323, new r560(immVar, function1, (byte) 1), fetVar2), u1c.M(-807394476, new s170(q070Var, function1), fetVar2), fetVar2, 3456);
            fetVar2 = fetVar;
            mbc.o(zfi0.f44303a, o7k0.d(jm40.b, 1.0f), false, fetVar2, 54, 4);
            if (y170Var != null) {
                if (y170Var instanceof u170) {
                    fetVar2.e0(-1742147494);
                    z(null, (u170) y170Var, function1, fetVar2, i2 & 896);
                    fetVar2.r(false);
                } else if (y170Var instanceof v170) {
                    fetVar2.e0(-1742142083);
                    mdm mdmVar = ((v170) y170Var).f36616a;
                    boolean z5 = (i2 & 896) == 256;
                    Object objP4 = fetVar2.P();
                    if (z5 || objP4 == cl5Var) {
                        objP4 = new ju60(function1, (byte) 12);
                        fetVar2.o0(objP4);
                    }
                    A(null, mdmVar, (Function0) objP4, fetVar2, 0);
                    fetVar2.r(false);
                } else if (y170Var instanceof x170) {
                    fetVar2.e0(-1742134241);
                    mdm mdmVar2 = ((x170) y170Var).f40107a;
                    boolean z6 = (i2 & 896) == 256;
                    Object objP5 = fetVar2.P();
                    if (z6 || objP5 == cl5Var) {
                        objP5 = new ju60(function1, (byte) 13);
                        fetVar2.o0(objP5);
                    }
                    A(null, mdmVar2, (Function0) objP5, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    z = false;
                    if (y170Var instanceof w170) {
                        fetVar2.e0(-1742126731);
                        B(null, (w170) y170Var, fetVar2, 0);
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(true);
            } else {
                z = false;
            }
            throw b1j.f(-1742149258, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var, e270Var, function1, i, (byte) 14);
        }
    }

    public static final void E(mm40 mm40Var, fqj0 fqj0Var, a270 a270Var, fet fetVar, int i) {
        float f2;
        fetVar.g0(1854140583);
        int i2 = (fetVar.g(fqj0Var) ? 32 : 16) | i | (fetVar.g(a270Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(o7k0.e(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 64.0f), 12.0f);
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                int iOrdinal = a270Var.f111a.ordinal();
                if (iOrdinal == 0) {
                    f2 = 128.0f;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    f2 = 96.0f;
                }
                objP = twn.j(f2, fetVar);
            }
            float f3 = ((ycl) objP).f42389a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.n(jm40Var, 40.0f), vgg0.f37379a), fqj0Var));
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, f3), 16.0f);
            zcl zclVar2 = qmk.e;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var, fqj0Var, a270Var, i);
        }
    }

    public static final void F(mm40 mm40Var, c1n c1nVar, boolean z, fet fetVar, int i) {
        int i2;
        int i3;
        shd shdVar;
        boolean z2;
        c1n c1nVar2 = c1nVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-853320458);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(c1nVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zx7 zx7Var = z ? gqw0.i : gqw0.g;
            zcl zclVar = qmk.f28987a;
            float f2 = z ? 6.0f : -6.0f;
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.j, (byte) 11)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar4);
            jpm0.n(fetVar2);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar5);
            d280 d280Var = c1nVar2.c;
            int i4 = c1nVar2.b;
            fetVar2.e0(2081701312);
            boolean zG = fetVar2.g(d280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.f, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            float f3 = f2;
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar2);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar4, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar5);
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                i3 = 1;
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            } else {
                i3 = 1;
            }
            kkb.p(i3, fetVar2, null, (Function0) objP2);
            if (i4 != 0) {
                fetVar2.e0(1002546389);
                rpe rpeVar = new rpe(i4);
                mm40 mm40VarQ = ffb0.Q(jr8.f16991a.b(jm40Var, zx7Var), f3, 2.0f);
                shdVar = shdVar3;
                tdc.e(rpeVar, ipe.f15159a, mm40VarQ, fetVar2, 48, 0);
                z2 = false;
                fetVar2.r(false);
            } else {
                shdVar = shdVar3;
                z2 = false;
                fetVar2.e0(1003007669);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(z2);
            mm40 mm40VarG = o7k0.g(jm40Var, 28.0f, 0.0f, 2);
            tj30 tj30VarC2 = zq8.c(gqw0.e, z2);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarG);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar2);
            jpm0.o(fetVar2, bh90VarM3, shdVar);
            vqd.u(iHashCode3, fetVar2, shdVar4, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar5);
            c1nVar2 = c1nVar;
            v8q0.a(c1nVar2.f3580a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, 0, 24960, 109562);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 25, i, mm40Var, (Object) c1nVar2, z);
        }
    }

    public static final void G(mm40 mm40Var, c1n c1nVar, c1n c1nVar2, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-906277806);
        int i2 = i | 6 | (fetVar.g(c1nVar) ? 32 : 16) | (fetVar.g(c1nVar2) ? 256 : 128) | (fetVar.g(a2mVar) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            F(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c1nVar, true, fetVar, (i2 & 112) | 384);
            obb.q(null, a2mVar, z, fetVar, (i2 >> 6) & 1008, 1);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            F(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c1nVar2, false, fetVar, ((i2 >> 3) & 112) | 384);
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 21, i, mm40Var2, (Object) c1nVar, (Object) c1nVar2, (Object) a2mVar, z);
        }
    }

    public static final void H(int i, fet fetVar, mm40 mm40Var, boolean z) {
        yfe0 yfe0VarU;
        s84 s84Var;
        fetVar.g0(-830659996);
        byte b2 = 4;
        int i2 = (fetVar.h(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                mm40 mm40VarQ = i120.Q(mm40Var.e(o7k0.c), ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), jd8.n);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new npa0((byte) 23);
                    fetVar.o0(objP);
                }
                mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP, 14);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
                t(0, fetVar);
                fetVar.r(true);
            } else {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    s84Var = new s84(z, mm40Var, i, b2);
                }
            }
            yfe0VarU.d = s84Var;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            s84Var = new s84(z, mm40Var, i, (byte) 6);
            yfe0VarU.d = s84Var;
        }
    }

    public static final void I(pec pecVar, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2;
        fet fetVar2;
        fetVar.g0(-572573354);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pecVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
        } else if (pecVar instanceof mec) {
            fetVar.e0(2077545680);
            mec mecVar = (mec) pecVar;
            function2 = function1;
            fetVar2 = fetVar;
            l(jm40Var, mecVar.f21637a, mecVar.b, mecVar.c, function2, fetVar2, (i2 & 14) | ((i2 << 6) & 57344));
            fetVar2.r(false);
        } else {
            function2 = function1;
            fetVar2 = fetVar;
            if (pecVar instanceof nec) {
                fetVar2.e0(2077871180);
                p(((nec) pecVar).f23379a, fetVar2, i2 & 14);
                fetVar2.r(false);
            } else {
                if (!(pecVar instanceof oec)) {
                    throw b1j.f(-487173785, fetVar2, false);
                }
                fetVar2.e0(2078074602);
                fetVar2.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680(pecVar, function2, i);
        }
    }

    public static final void J(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-497329148);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dng0(function1, (byte) 23);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dng0(function1, (byte) 24);
                fetVar.o0(objP2);
            }
            v3c.A(function0, (Function0) objP2, null, fetVar, 0, 4);
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            imm immVar = ((uec) l7m0Var.getValue()).f35519a;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new dng0(function1, (byte) 25);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean z4 = i3 == 256;
            Object objP4 = fetVar.P();
            byte b2 = 6;
            if (z4 || objP4 == cl5Var) {
                objP4 = new abh0(function1, b2);
                fetVar.o0(objP4);
            }
            Function1 function4 = (Function1) objP4;
            boolean z5 = i3 == 256;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new abh0(function1, (byte) 7);
                fetVar.o0(objP5);
            }
            Function1 function5 = (Function1) objP5;
            boolean z6 = i3 == 256;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var) {
                objP6 = new dng0(function1, (byte) 26);
                fetVar.o0(objP6);
            }
            hlm.c(null, immVar, null, function3, null, function4, function5, null, (Function0) objP6, null, null, null, fetVar, 0, 0, 3733);
            function2 = function1;
            I(((uec) l7m0Var.getValue()).b, function2, fetVar, i3 | 6);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function2, i, (byte) 6);
        }
    }

    public static final void K(GameBroadcastingParams gameBroadcastingParams, GameVideoUiConfig gameVideoUiConfig, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(929247860);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(gameBroadcastingParams) : fetVar.i(gameBroadcastingParams) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(gameVideoUiConfig) : fetVar.i(gameVideoUiConfig) ? 32 : 16;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.g(gameBroadcastingParams));
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.g(gameVideoUiConfig))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = i120.V(new Pair("VIDEO_PARAMS", gameBroadcastingParams), new Pair("UI_CONFIG", gameVideoUiConfig));
                fetVar.o0(objP);
            }
            Bundle bundle = (Bundle) objP;
            n0q n0qVar = o7k0.c;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new vls(b2);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            nz2.a(wws.class, n0qVar, g5r.a(fetVar), bundle, (lkz) ydx.F(vtb.N(((clz) fetVar.k(or00.f25714a)).x().j), fetVar).getValue(), (Function1) objP2, fetVar2, 196656);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) gameBroadcastingParams, (Object) gameVideoUiConfig, i, (byte) 21);
        }
    }

    public static final void L(mm40 mm40Var, a4x a4xVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i) {
        boolean z3;
        Function1 function2;
        mm40 mm40Var2;
        mm40 mm40VarV;
        qw3 qw3Var;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1857139664);
        byte b2 = 16;
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= fetVar.h(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            function2 = function1;
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        } else {
            function2 = function1;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = pkd.d(fetVar) ? 2 : 1;
            d9z d9zVarA = f9z.a(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(d9zVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new md0(d9zVarA, b2);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            e2d e2dVar = (e2d) fetVar.k(nip.f23600a);
            jm40 jm40Var = jm40.b;
            if (e2dVar != null) {
                fetVar.e0(-1720319212);
                boolean zG2 = fetVar.g(l7m0VarY);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new f7f0(l7m0VarY, (byte) 28);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(jm40Var, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1720160678);
                fetVar.r(false);
                mm40VarV = jm40Var;
            }
            mm40 mm40VarE = mm40VarV.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarE, qmk.a(fetVar).c, 0.0f, 2), "LAZY_VERTICAL_GRID_GAMES");
            ngv ngvVar = new ngv(i3);
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var3 = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 32.0f, 5), fetVar);
            boolean z4 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object objP3 = fetVar.P();
            if (z4 || objP3 == obj) {
                Function1 function3 = function2;
                qw3Var = qw3Var3;
                objP3 = new fbn0((byte) 1, a4xVar, function3, z, z3);
                fetVar.o0(objP3);
            } else {
                qw3Var = qw3Var3;
            }
            g8x.i(ngvVar, mm40VarE0, d9zVarA, ch80VarG, qw3Var2, qw3Var, null, false, null, (Function1) objP3, fetVar, 0, 912);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gbn0(mm40Var2, a4xVar, z, z2, function1, i, (byte) 1);
        }
    }

    public static final void M(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        function0.getClass();
        fetVar.g0(1603057236);
        int i2 = (fetVar.i(function0) ? 32 : 16) | i;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "ICON_BUTTON");
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new tq(function0, (byte) 3);
                fetVar.o0(objP);
            }
            zvw.d((Function0) objP, mm40VarE0, false, null, null, jar0.f16205a, fetVar, 1572864, 60);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, function0, i, b2);
        }
    }

    public static final void N(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        function0.getClass();
        fetVar.g0(246440697);
        int i2 = (fetVar.i(function0) ? 32 : 16) | i;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new tq(function0, (byte) 2);
                fetVar.o0(objP);
            }
            zvw.d((Function0) objP, mm40Var, false, null, null, jar0.b, fetVar, 1572912, 60);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, function0, i, b2);
        }
    }

    public static final void O(mm40 mm40Var, f7s0 f7s0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1764927179);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(f7s0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            a4x a4xVar = f7s0Var.b;
            ci ciVar = f7s0Var.c;
            jar0.N(0, fetVar, a4xVar, null, ciVar != null);
            if (ciVar == null) {
                fetVar.e0(465412914);
                fetVar.r(false);
            } else {
                fetVar.e0(465412915);
                mm40 mm40VarN = s5x0.N(jr8.f16991a.b(phu0.H(jm40.b, null, 1), gqw0.h), 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
                mtl mtlVar = ciVar.f4387a;
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new b8q0((Object) function1, (Object) f7s0Var, (byte) 27);
                    fetVar.o0(objP);
                }
                bkb.f(mm40VarN, mtlVar, null, false, lh80VarU, (Function1) objP, fetVar, 3072, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, f7s0Var, function1, i, (byte) 15);
        }
    }

    public static final void P(mm40 mm40Var, h7s0 h7s0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1020329528);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(h7s0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (h7s0Var != null) {
                boolean z = h7s0Var instanceof f7s0;
                mm40Var2 = jm40.b;
                if (z) {
                    fetVar.e0(1153654240);
                    O(mm40Var2, (f7s0) h7s0Var, function1, fetVar, i2 & 1022);
                    fetVar.r(false);
                } else if (h7s0Var instanceof g7s0) {
                    fetVar.e0(1153865226);
                    Q((g7s0) h7s0Var, function1, fetVar, (i2 >> 3) & 126);
                    fetVar.r(false);
                }
            }
            throw b1j.f(1284138805, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var2, h7s0Var, function1, i, (byte) 14);
        }
    }

    public static final void Q(g7s0 g7s0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1332297874);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(g7s0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
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
            mm40 mm40VarH = phu0.H(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7), null, 1);
            mdm mdmVar = g7s0Var.b;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, (byte) 27);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarH, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) g7s0Var, (Object) function1, i, (byte) 6);
        }
    }

    public static final void R(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        l7m0Var.getClass();
        fetVar.g0(1433668478);
        int i2 = i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(i120.Q(yyw.X(mm40Var, null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), "TOURNAMENT_STAGES_SCREEN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            mm40 mm40VarH = phu0.H(jm40.b, null, 1);
            imm immVarA = ((h7s0) l7m0Var.getValue()).a();
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, (byte) 26);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarH, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
            function2 = function1;
            P(null, (h7s0) l7m0Var.getValue(), function2, fetVar, i3);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function2, i, (byte) 15);
        }
    }

    public static final il9 S(int i, int i2, Locale locale) {
        Calendar calendar = Calendar.getInstance(locale);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, 1);
        U(calendar);
        int i3 = 7;
        calendar.add(5, -(((calendar.get(7) - calendar.getFirstDayOfWeek()) + 7) % 7));
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < 6) {
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (i5 < i3) {
                arrayList2.add(new yk9(calendar.get(5), calendar.getTimeInMillis(), calendar.get(2) == i2));
                calendar.add(5, 1);
                i5++;
                i3 = 7;
            }
            arrayList.add(arrayList2);
            i4++;
            i3 = 7;
        }
        return new il9(arrayList, i, i2);
    }

    public static final boolean T(yyc yycVar) {
        BigDecimal bigDecimal = yycVar.d;
        BigDecimal bigDecimal2 = yycVar.e;
        BigDecimal bigDecimal3 = yycVar.f43459a;
        return !((bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0) || (bigDecimal3.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0)) || yycVar.f;
    }

    public static final void U(Calendar calendar) {
        calendar.getClass();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static final SimpleDate V(SimpleDate simpleDate, SimpleDate simpleDate2, SimpleDate simpleDate3) {
        simpleDate.getClass();
        simpleDate2.getClass();
        simpleDate3.getClass();
        if (W(simpleDate, simpleDate2) < 0) {
            return simpleDate2;
        }
        return W(simpleDate, simpleDate3) > 0 ? simpleDate3 : simpleDate;
    }

    public static final int W(SimpleDate simpleDate, SimpleDate simpleDate2) {
        simpleDate.getClass();
        simpleDate2.getClass();
        int i = simpleDate.f47286a;
        int i2 = simpleDate2.f47286a;
        if (i != i2) {
            return i - i2;
        }
        int i3 = simpleDate.b;
        int i4 = simpleDate2.b;
        return i3 != i4 ? i3 - i4 : simpleDate.c - simpleDate2.c;
    }

    public static final rln0 X(yyc yycVar, ctf0 ctf0Var) {
        if (yycVar.g) {
            String strA = ctf0Var.b.a(R.string.min_coef_v2, Arrays.copyOf(new Object[]{""}, 1));
            pn40 pn40Var = pn40.f27267a;
            return new mln0(strA, pn40.g(yycVar.d));
        }
        if (!yycVar.f) {
            return new jln0(ctf0Var.b.a(R.string.bet_settings_coef_container_title, Arrays.copyOf(new Object[0], 0)));
        }
        String strA2 = ctf0Var.b.a(R.string.max_coef_v2, Arrays.copyOf(new Object[]{""}, 1));
        pn40 pn40Var2 = pn40.f27267a;
        return new mln0(strA2, pn40.g(yycVar.e));
    }

    public static final rln0 Y(tw6 tw6Var, ctf0 ctf0Var, String str) {
        double d2 = tw6Var.f34633a;
        double d3 = tw6Var.d;
        if (d2 < d3) {
            String strA = ctf0Var.b.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            return new mln0(strA, cy7.e(pn40.d(d3, str, p3u0.c)));
        }
        if (d2 <= tw6Var.b() || tw6Var.m) {
            return new jln0("");
        }
        String strA2 = ctf0Var.b.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
        int i2 = cy7.f5159a;
        pn40 pn40Var2 = pn40.f27267a;
        return new mln0(strA2, cy7.e(pn40.d(tw6Var.e, str, p3u0.c)));
    }

    public static final void a(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1661010555);
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
            yfe0VarU.d = new p71(mm40Var, ugdVar, ugdVar2, i, (byte) 1);
        }
    }

    public static final lx6 a0(tw6 tw6Var, boolean z) {
        if (tw6Var.n || z) {
            return lx6.c;
        }
        return f0(tw6Var.f34633a, tw6Var.d, tw6Var.b(), tw6Var.m) ? lx6.f20799a : lx6.b;
    }

    public static final void b(mm40 mm40Var, bb2 bb2Var, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        Object obj;
        fet fetVar2 = fetVar;
        bb2Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-1967063075);
        int i2 = i | 6 | (fetVar2.g(bb2Var) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar2);
            e2d e2dVarD = nip.d(null, null, fetVar2, 7);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ja2(function1, b2);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ja2(function1, (byte) 3);
                fetVar2.o0(objP2);
            }
            Window window2 = window;
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zI = fetVar2.i(window2) | fetVar2.i(context) | fetVar2.h(zC);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new la2(window2, context, zC, b2);
                fetVar2.o0(objP3);
            }
            s0x.d(boolValueOf, null, (Function1) objP3, fetVar2, 0);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = yyw.X(jm40Var, null, fetVar2, 1);
            qim qimVar = bb2Var.f2287a;
            boolean z4 = i3 == 2048;
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new h61(function1, (byte) 28);
                fetVar2.o0(objP4);
            }
            ckb.k(mm40VarX, qimVar, true, e2dVarD, null, (Function1) objP4, fetVar2, 24960, 0);
            fetVar2 = fetVar2;
            mm40 mm40VarC = nip.c(i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n), e2dVarD, fetVar2, 0);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarC);
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
            z4g0 z4g0Var = bb2Var.c;
            boolean z5 = bb2Var.b;
            boolean z6 = bb2Var.e;
            int i4 = (i2 << 9) & 4128768;
            if (z4g0Var instanceof n4g0) {
                fetVar2.e0(1208496805);
                o(jm40Var, ((n4g0) z4g0Var).f22897a, function1, fetVar2, (i4 >> 12) & 896);
                fetVar2.r(false);
            } else {
                if (z4g0Var instanceof q4g0) {
                    fetVar2.e0(1208501765);
                    q(jm40Var, ((q4g0) z4g0Var).f28096a, function1, fetVar2, (i4 >> 12) & 896);
                    fetVar2.r(false);
                } else if (z4g0Var instanceof w4g0) {
                    fetVar2.e0(-1190983981);
                    v(null, e2dVarD, qdzVar, ((w4g0) z4g0Var).f38542a, true, z5, false, z6, function1, fetVar2, ((i4 >> 9) & 896) | 1597440 | ((i4 << 6) & 234881024));
                    fetVar2.r(false);
                } else {
                    jm40Var = jm40Var;
                    if (!(z4g0Var instanceof t4g0)) {
                        throw b1j.f(1208496372, fetVar2, false);
                    }
                    fetVar2.e0(-1190564892);
                    t4g0 t4g0Var = (t4g0) z4g0Var;
                    v(null, e2dVarD, qdzVar, t4g0Var.f33318a, false, z5, t4g0Var.b, z6, function1, fetVar2, ((i4 >> 9) & 896) | 24576 | ((i4 << 6) & 234881024));
                    fetVar2.r(false);
                }
                fetVar2.r(r24);
                fetVar2.r(true);
                obj = jm40Var;
            }
            fetVar2.r(r24);
            fetVar2.r(true);
            obj = jm40Var;
        } else {
            fetVar2.X();
            obj = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 11, i, obj, bb2Var, qdzVar, function1);
        }
    }

    public static final void c(t93 t93Var, Function1 function1, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        t93Var.getClass();
        function1.getClass();
        function0.getClass();
        fetVar2.g0(60536416);
        int i2 = i | (fetVar2.g(t93Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
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
            mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
            ljm ljmVar = new ljm();
            nkb.h(mm40VarL, new hjm(rsm0.w(R.string.hltv_another_awards_title, 0, fetVar2), ljmVar, new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), null, null, null, false, null, null, false, new ue9(rsm0.w(R.string.all, 0, fetVar2)), null, 7160), kjm.f18392a, null, function0, null, fetVar2, (57344 & (i2 << 6)) | 384, 40);
            mm40 mm40VarL2 = s5x0.L(jm40Var, 0.0f, 0.0f, 3);
            a4x a4xVar = t93Var.f33541a;
            jq5 jq5Var = new jq5(cp5.b);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new ag0(function1, (byte) 10);
                fetVar2.o0(objP);
            }
            fetVar2 = fetVar;
            etl.e(mm40VarL2, a4xVar, jq5Var, false, null, 0.0f, 0, null, (Function2) objP, fetVar2, 6, 248);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) t93Var, (Object) function1, function0, i, (byte) 4);
        }
    }

    public static final String c0(List list, rem0 rem0Var) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((sem0) next).f32081a != rem0Var);
        sem0 sem0Var = (sem0) next;
        if (sem0Var != null) {
            return sem0Var.b;
        }
        return null;
    }

    public static final void d(iq4 iq4Var, mm40 mm40Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        iq4Var.getClass();
        fetVar2.g0(235723643);
        int i2 = i | (fetVar2.g(iq4Var) ? 4 : 2) | (fetVar2.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(s5x0.L(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 12.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13);
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
            Date date = iq4Var.h;
            Context context = (Context) fetVar2.k(dy2.b);
            rdj rdjVar = rdj.f30294a;
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
            v8q0.a(rdj.g(new znq0(date.getTime() / 1000), efj.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), false, 56), o7k0.w(o7k0.e(jm40.b, 24.0f), gqw0.k, false, 2), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            m(iq4Var, null, fetVar2, i2 & 14);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(iq4Var, mm40Var, i, (byte) 16);
        }
    }

    public static final w2w0 d0(int i) {
        return new w2w0(i / 12, i % 12);
    }

    public static final void e(a4x a4xVar, d9z d9zVar, mm40 mm40Var, fet fetVar, int i) {
        a4xVar.getClass();
        d9zVar.getClass();
        fetVar.g0(-1540865424);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.g(d9zVar) ? 32 : 16) | 384;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new rfv();
                fetVar.o0(objP);
            }
            obc.d(xf80.f40779a.a(null), u1c.M(99050928, new ry2(d9zVar, a4xVar, (rfv) objP), fetVar), fetVar, 48);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) a4xVar, (Object) d9zVar, (Object) mm40Var2, i, (byte) 16);
        }
    }

    public static final boolean e0(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static final void f(a4x a4xVar, a4x a4xVar2, fet fetVar, int i) {
        fet fetVar2;
        a4xVar.getClass();
        a4xVar2.getClass();
        fetVar.g0(-71682868);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.g(a4xVar2) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            nnw0.g(o7k0.c(jm40.b, 1.0f), null, false, u1c.M(1304230050, new qx7(a4xVar, a4xVar2, b2), fetVar), fetVar2, 3078, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(a4xVar, a4xVar2, i, (byte) 9);
        }
    }

    public static final boolean f0(double d2, double d3, double d4, boolean z) {
        if ((d3 > d2 || d2 > d4) && d2 != -1.0d) {
            return d2 > d4 && z;
        }
        return true;
    }

    public static final void g(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        mdmVar.getClass();
        function0.getClass();
        fetVar.g0(-119597173);
        int i2 = i | 6 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            jcb.l(null, mdmVar, false, function0, fetVar, (i2 & 112) | ((i2 << 3) & 7168), 5);
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var2, mdmVar, function0, i, (byte) 0);
        }
    }

    public static final SimpleDate g0(long j, Calendar calendar) {
        calendar.getClass();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return new SimpleDate(calendar2.get(1), calendar2.get(2) + 1, calendar2.get(5));
    }

    public static final void h(kec kecVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(404101043);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(kecVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            fetVar2.X();
        } else if (kecVar.f18147a) {
            fetVar.e0(-218992296);
            mm40 mm40VarR = knm0.r(jm40.b);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
            mtl mtlVar = kecVar.b;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new abh0(function1, (byte) 5);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            y860.n(mm40VarR, mtlVar, lh80VarU, (Function1) objP, fetVar2, 0);
            fetVar2.r(false);
        } else {
            fetVar2 = fetVar;
            fetVar2.e0(-218595217);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) kecVar, (Object) function1, i, (byte) 25);
        }
    }

    public static final SimpleDateTime h0(long j, Calendar calendar) {
        calendar.getClass();
        calendar.setTimeInMillis(j);
        return new SimpleDateTime(new SimpleDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5)), new TimeOfDay23(calendar.get(11), calendar.get(12)));
    }

    public static final void i(mm40 mm40Var, eo8 eo8Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1413858834);
        int i2 = i | 6 | (fetVar.g(eo8Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar, 6);
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
            kkb.j(0, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60(), fetVar, null);
            if (eo8Var instanceof do8) {
                fetVar.e0(-1441848339);
                sac.x(jm40Var, (do8) eo8Var, function0, fetVar, (i2 & 896) | (i2 & 112) | 6);
                fetVar.r(false);
            } else {
                if (!(eo8Var instanceof co8)) {
                    throw b1j.f(-1441850447, fetVar, false);
                }
                fetVar.e0(-1441840537);
                jcb.c(o7k0.w(jm40Var, null, false, 3), (co8) eo8Var, function1, fetVar, ((i2 >> 3) & 896) | 6 | (i2 & 112));
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
            yfe0VarU.d = new iop((byte) 29, i, mm40Var2, eo8Var, function0, function1);
        }
    }

    public static final void j(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(-1401146694);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarQ = i120.Q(mm40Var3, StaticColors.INSTANCE.m64getBlack100d7_KjU(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, 0.0f, 8.0f, 1);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).d, 0.0f, 2);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new m1b(b2);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarL, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 817889280, 362);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s84(mm40Var2, i, i2, b2);
        }
    }

    public static final aw6 j0(tw6 tw6Var, po7 po7Var, ctf0 ctf0Var, knb0 knb0Var, String str, boolean z) {
        String str2;
        rln0 rln0VarY;
        lx6 lx6Var;
        ctf0Var.getClass();
        str.getClass();
        lx6 lx6VarA0 = a0(tw6Var, z);
        sx6 sx6Var = new sx6(po7Var, ctf0Var.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), tw6Var.o, true, false);
        if (!knb0Var.f18577a || lx6VarA0 == lx6.b) {
            str2 = str;
            rln0VarY = Y(tw6Var, ctf0Var, str2);
        } else {
            String str3 = knb0Var.b;
            String str4 = knb0Var.c;
            if (z) {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            rln0VarY = new nln0(str3, str4);
            str2 = str;
        }
        rln0 rln0Var = rln0VarY;
        double d2 = tw6Var.f34633a;
        nke nkeVar = new nke(false, false, d2 > tw6Var.d && !z, d2 < tw6Var.b() && !z);
        if (tw6Var.n || z) {
            lx6Var = lx6.c;
        } else {
            lx6Var = f0(tw6Var.f34633a, tw6Var.d, tw6Var.b(), tw6Var.m) ? lx6.f20799a : lx6.b;
        }
        return new aw6(sx6Var, rln0Var, nkeVar, lx6Var, l0(tw6Var), str2);
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        l7m0 l7m0Var2;
        mm40 mm40Var2;
        l7m0Var.getClass();
        fetVar.g0(1479495922);
        int i2 = i | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            imm immVar = ((o5j) l7m0Var.getValue()).f24689a;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ouh(function1, (byte) 8);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mm40 mm40VarQ = i120.Q(new x7z(1.0f, true), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, qmk.a(fetVar).e, 0.0f, 2);
            ch80 ch80VarF = knm0.f(s5x0.t(0.0f, 16.0f, 1), fetVar);
            qw3 qw3Var = new qw3(24.0f, true, new jf4((byte) 14));
            boolean z2 = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                l7m0Var2 = l7m0Var;
                objP2 = new x1d(l7m0Var2, (byte) 12);
                fetVar.o0(objP2);
            } else {
                l7m0Var2 = l7m0Var;
            }
            b8k0.e(mm40VarL, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, 490);
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var2, function1, i, (byte) 13);
        }
    }

    public static final aw6 k0(bx6 bx6Var, ctf0 ctf0Var, knb0 knb0Var, String str, boolean z) {
        String str2;
        rln0 rln0VarY;
        lx6 lx6Var;
        ctf0Var.getClass();
        str.getClass();
        tw6 tw6Var = bx6Var.b;
        lx6 lx6VarA0 = a0(tw6Var, z);
        sx6 sx6Var = new sx6(androidx.compose.runtime.e.e(bx6Var.f3362a), ctf0Var.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), tw6Var.o, true, false);
        if (!knb0Var.f18577a || lx6VarA0 == lx6.b) {
            str2 = str;
            rln0VarY = Y(tw6Var, ctf0Var, str2);
        } else {
            String str3 = knb0Var.b;
            String str4 = knb0Var.c;
            if (z) {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            rln0VarY = new nln0(str3, str4);
            str2 = str;
        }
        rln0 rln0Var = rln0VarY;
        double d2 = tw6Var.f34633a;
        nke nkeVar = new nke(false, false, d2 > tw6Var.d && !z, d2 < tw6Var.b() && !z);
        if (tw6Var.n || z) {
            lx6Var = lx6.c;
        } else {
            lx6Var = f0(tw6Var.f34633a, tw6Var.d, tw6Var.b(), tw6Var.m) ? lx6.f20799a : lx6.b;
        }
        return new aw6(sx6Var, rln0Var, nkeVar, lx6Var, l0(tw6Var), str2);
    }

    public static final void l(mm40 mm40Var, boolean z, a4x a4xVar, kec kecVar, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z2;
        xcz xczVar;
        Function1 function2;
        boolean z3;
        fetVar.g0(484158371);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(kecVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
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
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i3 = i2 & 57344;
            boolean zG = ((i2 & 112) == 32) | fetVar.g(xczVarA) | (i3 == 16384);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                xczVar = xczVarA;
                c2p c2pVar = new c2p(z2, xczVar, function1, null, (byte) 5);
                function2 = function1;
                fetVar.o0(c2pVar);
                objP = c2pVar;
            } else {
                function2 = function1;
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            mm40 mm40VarE = o7k0.d(jm40.b, 1.0f).e(new x7z(1.0f, true));
            fetVar.e0(1692638947);
            zcl zclVar = qmk.f28987a;
            hh80 lh80Var = new lh80(qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 12.0f);
            if (kecVar.f18147a) {
                fetVar.e0(-1967331978);
                z3 = false;
            } else {
                z3 = false;
                fetVar.e0(-1967271466);
                lh80Var = knm0.g(new ch80(lh80Var, s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7)), fetVar);
            }
            fetVar.r(z3);
            fetVar.r(z3);
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            boolean z4 = ((i2 & 896) == 256) | (i3 == 16384);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new or0(a4xVar, function2, (byte) 28);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE, xczVar, lh80Var, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            h(kecVar, function1, fetVar, (i2 >> 9) & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var, z, a4xVar, kecVar, function1, i);
        }
    }

    public static final prm l0(tw6 tw6Var) {
        lrm jrmVar;
        double d2 = tw6Var.e;
        boolean z = tw6Var.n;
        boolean z2 = tw6Var.g;
        double d3 = tw6Var.d;
        Float fValueOf = Float.valueOf(d2 > d3 ? l1e0.c((float) (((tw6Var.f34633a - d3) / (d2 - d3)) * 100.0d), 0.0f, 100.0f) : 0.0f);
        if (z2) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        String str = tw6Var.f;
        if (z) {
            jrmVar = krm.f18772a;
        } else {
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0 p3u0Var = p3u0.c;
            jrmVar = new jrm(new g8k0(6, cy7.e(pn40.d(d3, str, p3u0Var)), null), new g8k0(6, z2 ? "∞" : cy7.e(pn40.d(d2, str, p3u0Var)), null));
        }
        return new prm(fFloatValue, jrmVar, null, null, (z2 || z) ? false : true, 118);
    }

    public static final void m(iq4 iq4Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        int i3;
        pcy pcyVar;
        iq4 iq4Var2 = iq4Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(1825495499);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(iq4Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (fetVar2.U(i4 & 1, (i4 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 12.0f, 1);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
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
            zfn zfnVar = zaq0.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.f37379a), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            va80 va80Var = iq4Var2.g;
            a860 a860Var = iq4Var2.j;
            switch (va80Var.ordinal()) {
                case 0:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    i3 = R.drawable.ic_os_unknown_phone;
                    break;
                case 1:
                case 16:
                case 17:
                    i3 = R.drawable.ic_os_unknown_device;
                    break;
                case 2:
                    i3 = R.drawable.ic_os_windows;
                    break;
                case 3:
                    i3 = R.drawable.ic_os_mac_os;
                    break;
                case 4:
                    i3 = R.drawable.ic_os_android_new;
                    break;
                case 5:
                    i3 = R.drawable.ic_os_apple;
                    break;
                default:
                    t9f.b();
                    return;
            }
            dww.c(a8k0.F(i3, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
            fetVar2.r(true);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            thg0 thg0VarA2 = shg0.a(lw3Var, gqw0.j, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            int iOrdinal = a860Var.ordinal();
            int i5 = R.drawable.ic_auth_status_rejected;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i5 = R.drawable.ic_auth_status_approved;
                } else if (iOrdinal != 3 && iOrdinal == 4) {
                    i5 = R.drawable.ic_auth_status_expired;
                }
            }
            pm80 pm80VarF = a8k0.F(i5, 0, fetVar2);
            int iOrdinal2 = a860Var.ordinal();
            int i6 = R.color.static_red;
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    i6 = R.color.static_green;
                } else if (iOrdinal2 != 3 && iOrdinal2 == 4) {
                    i6 = R.color.static_gray;
                }
            }
            dww.c(pm80VarF, null, o7k0.n(jm40Var, 14.0f), obc.O(i6, fetVar2), fetVar2, 56, 0);
            v8q0.a(wwb.I(iq4Var2.c, fetVar2), s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131064);
            fetVar.r(true);
            iq4Var2 = iq4Var;
            v8q0.a(iq4Var.k, s5x0.L(jm40Var, 0.0f, 4.0f, 1), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, 0, 0, 131064);
            v8q0.a(xsm0.t(R.string.ip_title_v2, new Object[]{iq4Var2.d}, fetVar), null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) iq4Var2, (Object) mm40Var2, i, (byte) 19);
        }
    }

    public static final int m0(w2w0 w2w0Var) {
        w2w0Var.getClass();
        return (w2w0Var.f38472a * 12) + w2w0Var.b;
    }

    public static final void n(mm40 mm40Var, c1n c1nVar, c1n c1nVar2, a2m a2mVar, String str, String str2, r0n r0nVar, boolean z, fet fetVar, int i) {
        int i2;
        Object obj;
        Object obj2;
        k6z k6zVar;
        a2mVar.getClass();
        str.getClass();
        str2.getClass();
        fetVar.g0(346441047);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = c1nVar;
            i2 |= fetVar.g(obj) ? 32 : 16;
        } else {
            obj = c1nVar;
        }
        if ((i & 384) == 0) {
            obj2 = c1nVar2;
            i2 |= fetVar.g(obj2) ? 256 : 128;
        } else {
            obj2 = c1nVar2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a2mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(r0nVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            if (z) {
                fetVar.e0(-2077588450);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-2077587526);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            k6z k6zVar2 = k6zVar;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 100.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int i3 = i2;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            u(null, str2, r0nVar, str, fetVar, ((i3 >> 12) & 1008) | ((i3 >> 3) & 7168));
            obc.d(bmd.n.a(k6zVar2), u1c.M(441895053, new i4a0(obj, obj2, (Object) a2mVar, z, (byte) 29), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, (Object) c1nVar, (Object) c1nVar2, a2mVar, str, str2, (Object) r0nVar, z, i, (byte) 8);
        }
    }

    public static final ArrayList n0(Locale locale) {
        int firstDayOfWeek = Calendar.getInstance(locale).getFirstDayOfWeek();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        IntRange intRangeO = l1e0.o(0, 7);
        ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it = intRangeO.iterator();
        while (((kkx) it).c) {
            int iNextInt = (((((bkx) it).nextInt() + firstDayOfWeek) - 1) % 7) + 1;
            String str = shortWeekdays[iNextInt];
            str.getClass();
            arrayList.add(new b6v0(iNextInt, str));
        }
        return arrayList;
    }

    public static final void o(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1816066204);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ja2(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i2 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i, (byte) 2);
        }
    }

    public static final Set o0(Locale locale) {
        String country = ULocale.forLocale(locale).getCountry();
        country.getClass();
        if (country.length() <= 0) {
            country = null;
        }
        if (country == null) {
            return xun.f41520a;
        }
        android.icu.util.Calendar.WeekData weekDataForRegion = android.icu.util.Calendar.getWeekDataForRegion(country);
        weekDataForRegion.getClass();
        int i = weekDataForRegion.weekendOnset;
        int i2 = weekDataForRegion.weekendCease;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            linkedHashSet.add(Integer.valueOf(i));
            if (i == i2) {
                return linkedHashSet;
            }
            i++;
            if (i > 7) {
                i = 1;
            }
        }
    }

    public static final void p(mdm mdmVar, fet fetVar, int i) {
        int i2;
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(1205333503);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(knm0.r(jr8.f16991a.b(jm40Var, gqw0.e)), mdmVar2, false, null, fetVar2, i2 & 112, 12);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new duv(mdmVar2, i);
        }
    }

    public static final void q(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1959538369);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ja2(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i2 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i, (byte) 3);
        }
    }

    public static final void r(k9q k9qVar, float f2, fet fetVar, int i) {
        long secondary;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1482127607);
        int i2 = i | (fetVar2.g(k9qVar) ? 4 : 2) | (fetVar2.d(f2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE = o7k0.e(jm40.b, f2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarE, 56.0f);
            eho ehoVar = k9qVar.d;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
            int iOrdinal = ehoVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    pz40 pz40Var = s6t0.f31722a;
                    mm40VarS = i120.Q(mm40VarS, s6t0.b().f33626a.getPrimary(), ugg0Var2);
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    mm40VarS = i120.S(i120.Q(mm40VarS, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), ugg0Var2), 1.0f, s6t0.b().f33626a.getPrimary(), ugg0Var2);
                }
            }
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            String str = k9qVar.f17927a;
            y9q0 y9q0VarH = g1t0.h();
            long j = g1t0.h().f42262a.b;
            if (k9qVar.d == eho.b) {
                pz40 pz40Var3 = s6t0.f31722a;
                secondary = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            } else {
                pz40 pz40Var4 = s6t0.f31722a;
                secondary = s6t0.b().f33626a.getSecondary();
            }
            v8q0.a(str, null, secondary, null, j, null, null, null, 0L, new f2q0(3), 0L, 2, false, k9qVar.e ? 2 : 1, 0, null, y9q0VarH, fetVar, 0, 384, 109546);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rx7((byte) 0, f2, i, k9qVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    public static final void s(ko5 ko5Var, rfv rfvVar, mm40 mm40Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        ?? r4;
        int i2;
        fet fetVar3 = fetVar;
        fetVar3.g0(-1493538429);
        int i3 = i | (fetVar3.g(ko5Var) ? 4 : 2) | 384;
        if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_cyber_lol_hero_placeholder, 0, fetVar3);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 58.0f, 32.0f);
            long j = kkg.f;
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(mm40VarP, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 2.0f), "BAN_PICKS_HERO_TEST_TAG");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE0);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
            zcl zclVar3 = qmk.c;
            mm40 mm40VarE = h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN);
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE1 = o2e.e0(jr8Var.b(mm40VarE, zx7Var), "BAN_PICKS_HERO_IMAGE_TEST_TAG");
            k1x k1xVar = new k1x((Context) fetVar3.k(dy2.b));
            String str = ko5Var.b;
            boolean z = ko5Var.d;
            k1xVar.c = str;
            if (z) {
                kuo kuoVar = q1x.f27974a;
                q1x.b(k1xVar, tx3.g0(new lls0[]{rfvVar}));
            }
            k7x.b(k1xVar.a(), null, mm40VarE1, pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
            mm40 mm40VarP2 = o7k0.p(s5x0.N(jm40Var, 0.0f, 2.0f, 4.0f, 0.0f, 9), 16.0f, 14.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM75getBlack600d7_KjU = staticColors.m75getBlack600d7_KjU();
            zcl zclVar4 = qmk.b;
            v8q0.a(ko5Var.c, o2e.e0(jr8Var.b(o7k0.y(i120.Q(mm40VarP2, jM75getBlack600d7_KjU, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), null, 3), gqw0.c), "BAN_PICKS_HERO_NUMBER_TEST_TAG"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.f(), fetVar, 0, 24576, 113656);
            mm40 mm40VarE2 = o2e.e0(jr8Var.b(o7k0.y(o7k0.p(jm40Var, 24.0f, 10.0f), null, 3), gqw0.i), "BAN_PICKS_HERO_TYPE_TEST_TAG");
            y9q0 y9q0VarC = g1t0.c();
            if (z) {
                fetVar.e0(845159354);
                i2 = R.string.lol_ban;
                r4 = 0;
            } else {
                r4 = 0;
                fetVar.e0(845160475);
                i2 = R.string.lol_pick;
            }
            String strW = rsm0.w(i2, r4, fetVar);
            fetVar.r(r4);
            v8q0.a(strW, mm40VarE2, z ? kkg.d : kkg.e, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarC, fetVar, 0, 24576, 113656);
            fet fetVar4 = fetVar;
            fetVar4.r(true);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) ko5Var, (Object) rfvVar, (Object) mm40Var2, i, (byte) 17);
        }
    }

    public static final void t(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1789308206);
        if (fetVar.U(i & 1, i != 0)) {
            zfn zfnVar = m8m0.f21378a;
            fetVar2 = fetVar;
            p3c0.a(null, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), 0.0f, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 0, 0.0f, fetVar2, 0, 53);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j3b0(i, (byte) 25);
        }
    }

    public static final void u(mm40 mm40Var, String str, r0n r0nVar, String str2, fet fetVar, int i) {
        String str3;
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-297930824);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(r0nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str3 = str2;
            i2 |= fetVar2.g(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var2, 16.0f);
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
            if (str.length() > 0) {
                fetVar2.e0(-1114238735);
                jm40Var = jm40Var2;
                j6n.h(str, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 3) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(-1114095546);
                fetVar2.r(false);
            }
            if (r0nVar instanceof o0n) {
                fetVar2.e0(-2114145472);
                fetVar2.r(false);
                z = true;
            } else if (r0nVar instanceof p0n) {
                fetVar2.e0(-1113914227);
                p0n p0nVar = (p0n) r0nVar;
                z = true;
                rcb.x(null, u1c.O(p0nVar), h2m.c, nsm0.y(p0nVar.b), true, null, fetVar, 384);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                if (!(r0nVar instanceof q0n)) {
                    throw b1j.f(-2114147516, fetVar2, false);
                }
                fetVar2.e0(-1113508406);
                j6n.h("VAR", kro0.f18776a, null, 0, 0, fetVar2, 54, 28);
                fetVar2.r(false);
            }
            v8q0.a(str3, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 9) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 24, i, (Object) mm40Var2, (Object) str, (Object) r0nVar, (Object) str2);
        }
    }

    public static final void v(mm40 mm40Var, e2d e2dVar, qdz qdzVar, a4x a4xVar, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, fet fetVar, int i) {
        boolean z5;
        mm40 mm40Var2;
        byte b2;
        fetVar.g0(-132049113);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(e2dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            z5 = z4;
            i2 |= fetVar.h(z5) ? 8388608 : 4194304;
        } else {
            z5 = z4;
        }
        if ((i & 100663296) == 0) {
            i2 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        byte b3 = 0;
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean z6 = (57344 & i2) == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z6 || objP == cl5Var) {
                objP = z ? "KEY_LAZY_LIST_HISTORY_SHIMMERS" : "KEY_LAZY_LIST_HISTORY";
                fetVar.o0(objP);
            }
            xcz xczVarB = qdzVar.b((String) objP, new ma2(b3), fetVar, i2 & 896);
            fetVar.e0(315569375);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new j6g0((byte) 17);
                fetVar.o0(objP2);
            }
            azl azlVarB = e2d.b(e2dVar, (Function0) objP2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, azlVarB, null);
            fetVar.r(false);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarV.e(n0qVar);
            int i3 = i2 & 234881024;
            boolean z7 = i3 == 67108864;
            Object objP3 = fetVar.P();
            if (z7 || objP3 == cl5Var) {
                objP3 = new ja2(function1, (byte) 4);
                fetVar.o0(objP3);
            }
            mm40 mm40VarA = pzw.A(0, fetVar, mm40VarE, (Function0) objP3);
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG = fetVar.g(xczVarB) | ((i2 & 3670016) == 1048576);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var) {
                b2 = 0;
                objP4 = new qa2(z3, xczVarB, null, b2);
                fetVar.o0(objP4);
            } else {
                b2 = 0;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP4);
            if (z3) {
                function1.invoke(z92.f43996a);
            }
            byte b4 = i3 == 67108864 ? (byte) 1 : b2;
            Object objP5 = fetVar.P();
            if (b4 != 0 || objP5 == cl5Var) {
                objP5 = new ja2(function1, (byte) 5);
                fetVar.o0(objP5);
            }
            mm40Var2 = jm40Var;
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP5, null, u1c.M(-1746137732, new na2(mm40VarA, z, xczVarB, pz40VarF, z5, function1), fetVar), fetVar, ((i2 >> 12) & 112) | 100663296, 184);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oa2(mm40Var2, e2dVar, qdzVar, a4xVar, z, z2, z3, z4, function1, i, (byte) 0);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2053786410);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarQ = i120.Q(mm40VarE, staticColors.m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(staticColors.m131getWhite800d7_KjU()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 19);
        }
    }

    public static final void x(q070 q070Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        fetVar.g0(266037183);
        byte b2 = 16;
        int i2 = (fetVar.g(q070Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = q070Var.f27883a;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar.e0(1299234428);
                ijl ijlVar = q070Var.b;
                jjl jjlVar = q070Var.c;
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objP = fetVar.P();
                if (z3 || objP == cl5Var) {
                    objP = new ju60(function1, (byte) 15);
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z4 = i3 == 32;
                Object objP2 = fetVar.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new ju60(function1, b2);
                    fetVar.o0(objP2);
                }
                Function0 function2 = (Function0) objP2;
                z = i3 == 32;
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new ju60(function1, (byte) 17);
                    fetVar.o0(objP3);
                }
                feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar, 0, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(1299669296);
                mm40 mm40VarQ = i120.Q(o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarQ, xfn.a(fetVar).d, 8.0f);
                String strW = rsm0.w(R.string.button_login, 0, fetVar);
                String strW2 = rsm0.w(R.string.registration, 0, fetVar);
                int i4 = i2 & 112;
                boolean z5 = i4 == 32;
                Object objP4 = fetVar.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new ju60(function1, (byte) 10);
                    fetVar.o0(objP4);
                }
                Function0 function3 = (Function0) objP4;
                z = i4 == 32;
                Object objP5 = fetVar.P();
                if (z || objP5 == cl5Var) {
                    objP5 = new ju60(function1, (byte) 11);
                    fetVar.o0(objP5);
                }
                pzb.g(mm40VarK, strW, strW2, function3, (Function0) objP5, fetVar, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s170(q070Var, function1, i);
        }
    }

    public static final void y(mm40 mm40Var, imm immVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1222954646);
        int i2 = i | 6 | (fetVar.g(immVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ju60(function1, (byte) 14);
                fetVar.o0(objP);
            }
            int i3 = i2 & 112;
            mm40Var2 = jm40Var;
            hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, i3, 0, 4084);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ymn(mm40Var2, immVar, function1, i, (byte) 1);
        }
    }

    public static final void z(mm40 mm40Var, u170 u170Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(92837637);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(u170Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), "ONE_X_GAMES_PROMO_CONTENT");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            float f2 = qmk.a(fetVar).d;
            ch80 ch80VarF = h97.f(f2, 8.0f, f2, 8.0f, fetVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rw40(u170Var, function1, (byte) 25);
                fetVar.o0(objP);
            }
            mm40Var2 = jm40Var;
            b8k0.e(mm40VarE0, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var2, (Object) u170Var, (Object) function1, i, (byte) 28);
        }
    }

    public Intent Z(Context context, Object obj) {
        k2w0 k2w0Var = (k2w0) obj;
        k2w0Var.getClass();
        Intent intent = new Intent(context, (Class<?>) WebViewLoginActivity.class);
        YandexAuthOptions yandexAuthOptions = k2w0Var.f17592a;
        YandexAuthLoginOptions yandexAuthLoginOptions = k2w0Var.b;
        String str = k2w0Var.c;
        yandexAuthOptions.getClass();
        yandexAuthLoginOptions.getClass();
        str.getClass();
        intent.putExtra("com.yandex.authsdk.EXTRA_OPTIONS", yandexAuthOptions);
        intent.putExtra("com.yandex.authsdk.EXTRA_LOGIN_OPTIONS", yandexAuthLoginOptions);
        intent.putExtra("com.yandex.authsdk.EXTRA_STATE", str);
        return intent;
    }

    public r7v b0(Context context, Object obj) {
        return null;
    }

    public abstract Object i0(int i, Intent intent);
}
