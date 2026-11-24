package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import android.javax.sip.message.Response;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y860 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f42182a = new ugd(1241904755, false, new i5b(28));
    public static final ugd b = new ugd(-1428842703, false, new i5b(29));
    public static final ugd c = new ugd(-490453853, false, new ehd(13));
    public static final ugd d = new ugd(1142443876, false, new ehd(14));
    public static final ugd e = new ugd(413473450, false, new lhd(1));
    public static final ugd f = new ugd(536377387, false, new lhd(5));
    public static final ugd g = new ugd(659281324, false, new lhd(9));
    public static final ugd h = new ugd(694617761, false, new qhd(4));
    public static final String[] i = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};
    public static final String[] j = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", DigestServerAuthenticationHelper.DEFAULT_ALGORITHM, "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};
    public static final itt0 k = new itt0();

    public static final void A(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(447470095);
        byte b2 = 4;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(i120.Q(yyw.X(o7k0.c, null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), "LEADERBOARD_SCREEN_COLUMN");
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
            xww.f(((yhz) l7m0Var.getValue()).f42660a, ((yhz) l7m0Var.getValue()).d, function1, fetVar, (i3 << 3) & 896);
            P(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, b2);
        }
    }

    public static final void B(int i2, fet fetVar) {
        fetVar.g0(-360787575);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            g7x.n(s5x0.N(jm40Var, f2, 12.0f, f3, 0.0f, 8), wui0.b, fetVar, 48);
            mm40 mm40VarN = s5x0.N(jm40Var, xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 0.0f, 10);
            wui0 wui0Var = wui0.c;
            g7x.n(mm40VarN, wui0Var, fetVar, 48);
            g7x.n(s5x0.N(jm40Var, xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 0.0f, 10), wui0Var, fetVar, 48);
            g7x.n(s5x0.N(jm40Var, xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 0.0f, 10), wui0.d, fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuh(i2, b2);
        }
    }

    public static final void C(int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        fetVar.g0(845498217);
        int i3 = i2 | 6 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(xsm0.s(R.string.news_catalog, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            int i4 = 6 | ((i3 << 6) & 7168);
            mm40Var2 = jm40.b;
            hlm.c(mm40Var2, immVar, null, function0, null, null, null, null, null, null, null, null, fetVar, i4, 0, 4084);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var2, function0, i2, (byte) 11);
        }
    }

    public static final void D(final ArrayList arrayList, final ArrayList arrayList2, final fqm fqmVar, final xdr xdrVar, final Function1 function1, final Function2 function2, final Function0 function0, final Function1 function3, Function1 function4, fet fetVar, int i2) {
        xcz xczVar;
        fetVar.g0(1936923360);
        int i3 = i2 | (fetVar.g(arrayList) ? 32 : 16) | (fetVar.g(arrayList2) ? 256 : 128) | (fetVar.i(fqmVar) ? 2048 : 1024) | (fetVar.i(xdrVar) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288) | (fetVar.i(function0) ? 8388608 : 4194304) | (fetVar.i(function3) ? 67108864 : 33554432) | (fetVar.i(function4) ? 536870912 : 268435456);
        if (fetVar.U(i3 & 1, (i3 & 306783379) != 306783378)) {
            rhv0 rhv0Var = (rhv0) fetVar.k(bmd.u);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            float fB = (((int) (((yez) rhv0Var).b() >> 32)) - (xfn.a(fetVar).c * 2.0f)) / 2.7692308f;
            boolean zC = pkd.c(fetVar);
            boolean zH = fetVar.h(zC);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = Integer.valueOf(zC ? R.drawable.news_catalog_placeholder_dark : R.drawable.news_catalog_placeholder);
                fetVar.o0(objP);
            }
            final int iIntValue = ((Number) objP).intValue();
            boolean zH2 = fetVar.h(zC);
            Object objP2 = fetVar.P();
            if (zH2 || objP2 == cl5Var) {
                objP2 = Integer.valueOf(zC ? R.drawable.news_catalog_placeholder_square_dark : R.drawable.news_catalog_placeholder_square);
                fetVar.o0(objP2);
            }
            final int iIntValue2 = ((Number) objP2).intValue();
            boolean zG = ((i3 & 1879048192) == 536870912) | fetVar.g(xczVarA) | fetVar.d(fB);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new ep8((byte) 4, fB, null, xczVarA, function4);
                xczVar = xczVarA;
                fetVar.o0(objP3);
            } else {
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, xczVar, (Function2) objP3);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarG = knm0.g(s5x0.t(0.0f, 0.0f, 3), fetVar);
            boolean zE = ((i3 & 896) == 256) | ((i3 & 7168) == 2048 || fetVar.i(fqmVar)) | fetVar.e(iIntValue) | ((57344 & i3) == 16384) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((i3 & 112) == 32) | fetVar.e(iIntValue2) | ((i3 & 458752) == 131072);
            Object objP4 = fetVar.P();
            if (zE || objP4 == cl5Var) {
                Function1 function5 = new Function1() { // from class: a.ss50
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        hcz hczVar = (hcz) obj;
                        hczVar.getClass();
                        ArrayList arrayList3 = arrayList2;
                        fqm fqmVar2 = fqmVar;
                        int i4 = iIntValue;
                        xdr xdrVar2 = xdrVar;
                        hcz.e(hczVar, null, null, new ugd(1752947829, true, new rbg(arrayList3, fqmVar2, i4, xdrVar2, function2, function0, function3)), 3);
                        ArrayList arrayList4 = arrayList;
                        hcz.g(hczVar, arrayList4.size(), null, null, new ugd(-40626818, true, new y1l(arrayList4, iIntValue2, xdrVar2, function1, (byte) 1)), 6);
                        hcz.e(hczVar, null, null, eeq.i, 3);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(function5);
                objP4 = function5;
            }
            b8k0.e(n0qVar, xczVar, ch80VarG, qw3Var, null, null, false, null, (Function1) objP4, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0a0(arrayList, arrayList2, fqmVar, xdrVar, function1, function2, function0, function3, function4, i2, (byte) 5);
        }
    }

    public static final void E(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(-1919356978);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jcb.l(mm40Var, mdmVar, false, function0, fetVar, (i3 & 126) | ((i3 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 6);
        }
    }

    public static final void F(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-842135070);
        int i3 = i2 | 6;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new mb50((byte) 9);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, null, null, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805306368, 494);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var2, i2, b2);
        }
    }

    public static final void G(mm40 mm40Var, at50 at50Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        at50Var.getClass();
        function1.getClass();
        fetVar.g0(-1315312703);
        int i3 = i2 | (fetVar.g(at50Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(mm40Var.e(n0qVar), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new w250(function1, (byte) 21);
                fetVar.o0(objP);
            }
            C(0, fetVar, null, (Function0) objP);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
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
            if (at50Var instanceof xs50) {
                fetVar.e0(-2049233441);
                xs50 xs50Var = (xs50) at50Var;
                ArrayList arrayList = xs50Var.b;
                ArrayList arrayList2 = xs50Var.c;
                fqm fqmVar = xs50Var.f41400a;
                boolean z4 = i4 == 256;
                Object objP2 = fetVar.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new nc40(function1, (byte) 5);
                    fetVar.o0(objP2);
                }
                xdr xdrVar = (xdr) objP2;
                boolean z5 = i4 == 256;
                Object objP3 = fetVar.P();
                if (z5 || objP3 == cl5Var) {
                    objP3 = new rp30(function1, (byte) 24);
                    fetVar.o0(objP3);
                }
                Function1 function2 = (Function1) objP3;
                boolean z6 = i4 == 256;
                Object objP4 = fetVar.P();
                if (z6 || objP4 == cl5Var) {
                    objP4 = new x6s(function1, (byte) 20);
                    fetVar.o0(objP4);
                }
                Function2 function3 = (Function2) objP4;
                boolean z7 = i4 == 256;
                Object objP5 = fetVar.P();
                if (z7 || objP5 == cl5Var) {
                    objP5 = new w250(function1, (byte) 22);
                    fetVar.o0(objP5);
                }
                Function0 function0 = (Function0) objP5;
                boolean z8 = i4 == 256;
                Object objP6 = fetVar.P();
                if (z8 || objP6 == cl5Var) {
                    objP6 = new rp30(function1, (byte) 25);
                    fetVar.o0(objP6);
                }
                Function1 function4 = (Function1) objP6;
                boolean z9 = i4 == 256;
                Object objP7 = fetVar.P();
                if (z9 || objP7 == cl5Var) {
                    objP7 = new rp30(function1, (byte) 26);
                    fetVar.o0(objP7);
                }
                z = true;
                D(arrayList2, arrayList, fqmVar, xdrVar, function2, function3, function0, function4, (Function1) objP7, fetVar, 4102);
                fetVar.r(false);
            } else {
                z = true;
                if (at50Var instanceof ys50) {
                    fetVar.e0(-481675016);
                    mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
                    mdm mdmVar = ((ys50) at50Var).f43154a;
                    boolean z10 = i4 == 256;
                    Object objP8 = fetVar.P();
                    if (z10 || objP8 == cl5Var) {
                        objP8 = new w250(function1, (byte) 23);
                        fetVar.o0(objP8);
                    }
                    E(mm40VarB, mdmVar, (Function0) objP8, fetVar, 0);
                    fetVar.r(false);
                } else if (at50Var instanceof zs50) {
                    fetVar.e0(-481665731);
                    F(0, fetVar, null);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-2046698819);
                    fetVar.r(false);
                }
            }
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var, at50Var, function1, i2, (byte) 2);
        }
    }

    public static final void H(ewh ewhVar, xk80 xk80Var, fet fetVar, int i2) {
        fetVar.g0(212270857);
        int i3 = i2 | (fetVar.g(ewhVar) ? 4 : 2) | (fetVar.g(xk80Var) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            q5x.e(xk80Var, o7k0.c, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1877045016, new awh(ewhVar, b2), fetVar), fetVar, ((i3 >> 3) & 14) | 100663344, 24576, 16124);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(ewhVar, xk80Var, i2, (byte) 15);
        }
    }

    public static final void I(mm40 mm40Var, bra0 bra0Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2;
        fetVar.g0(309445585);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(bra0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            nkb.h(mm40Var2, bra0Var.f3070a, kjm.b, null, null, null, fetVar2, (i3 & 14) | 384, 56);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mm40Var2, bra0Var, i2, (byte) 10);
        }
    }

    public static final void J(ara0 ara0Var, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        ugg0 ugg0Var;
        fetVar.g0(-1142096755);
        int i3 = i2 | (fetVar.g(ara0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (!z2 || ara0Var.f) {
                zcl zclVar4 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar4, zclVar4, zclVar4, zclVar4);
            } else {
                zcl zclVar5 = qmk.i;
                zcl zclVar6 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar6, zclVar6, zclVar5, zclVar5);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarM = s5x0.M(o2e.e0(jm40Var, "POLYBET_SPORT_CELL"), 4.0f, z ? 8.0f : 0.0f, 4.0f, (!z2 || ara0Var.f) ? 0.0f : 8.0f);
            k7l0 k7l0Var = ara0Var.e;
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z3 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new qw80((Object) function1, (Object) ara0Var, (byte) 23);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i5 == 4) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new zga0(function1, (era0) ara0Var, (byte) 5);
                fetVar.o0(objP2);
            }
            xbc.o(mm40VarM, k7l0Var, null, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 220);
            if (ara0Var.f || z2) {
                fetVar.e0(-1987150837);
                fetVar.r(false);
            } else {
                fetVar.e0(-1987369294);
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yw((era0) ara0Var, z, z2, function1, i2, (byte) 4);
        }
    }

    public static final void K(mm40 mm40Var, gra0 gra0Var, a4x a4xVar, boolean z, zcz zczVar, Function1 function1, fet fetVar, int i2) {
        gra0 gra0Var2;
        mm40 mm40Var2;
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(1210478446);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            gra0Var2 = gra0Var;
            i3 |= fetVar.g(gra0Var2) ? 32 : 16;
        } else {
            gra0Var2 = gra0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(zczVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 24.0f);
            boolean z2 = ((i3 & 896) == 256) | ((458752 & i3) == 131072) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new uy0(a4xVar, function1, z);
                fetVar.o0(objP);
            }
            int i4 = i3 & 112;
            int i5 = i3 >> 3;
            n7x.g(mm40VarQ, gra0Var2, lh80Var, zczVar, function1, (Function1) objP, fetVar, i4 | (i5 & 7168) | (i5 & 57344));
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var2, (Object) gra0Var, (Object) a4xVar, z, (Object) zczVar, (wdr) function1, i2, (byte) 24);
        }
    }

    public static final void L(final cra0 cra0Var, boolean z, boolean z2, final Function1 function1, fet fetVar, int i2) {
        ugg0 ugg0Var;
        final byte b2;
        final byte b3;
        fetVar.g0(215994603);
        int i3 = i2 | (fetVar.g(cra0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (z2) {
                zcl zclVar4 = qmk.i;
                zcl zclVar5 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar5, zclVar5, zclVar4, zclVar4);
            } else {
                zcl zclVar6 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar6, zclVar6, zclVar6, zclVar6);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, z ? 8.0f : 0.0f, 4.0f, z2 ? 8.0f : 0.0f);
            s7l0 s7l0Var = cra0Var.e;
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z3 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                b2 = 0;
                objP = new Function0() { // from class: a.hta0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b2) {
                            case 0:
                                function1.invoke(new bqa0(cra0Var.f4836a));
                                break;
                            default:
                                function1.invoke(new jqa0(cra0Var.f4836a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            } else {
                b2 = 0;
            }
            Function0 function0 = (Function0) objP;
            int i6 = (i4 == 2048 ? (byte) 1 : b2) | (i5 == 4 ? (byte) 1 : b2);
            Object objP2 = fetVar.P();
            if (i6 != 0 || objP2 == cl5Var) {
                b3 = 1;
                objP2 = new Function0() { // from class: a.hta0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b3) {
                            case 0:
                                function1.invoke(new bqa0(cra0Var.f4836a));
                                break;
                            default:
                                function1.invoke(new jqa0(cra0Var.f4836a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            } else {
                b3 = 1;
            }
            Function0 function2 = (Function0) objP2;
            int i7 = (i4 == 2048 ? b3 : (byte) 0) | (i5 == 4 ? b3 : (byte) 0);
            Object objP3 = fetVar.P();
            if (i7 != 0 || objP3 == cl5Var) {
                objP3 = new zga0(function1, (era0) cra0Var, (byte) 6);
                fetVar.o0(objP3);
            }
            xbc.o(mm40VarM, s7l0Var, null, null, false, function0, function2, null, (Function1) objP3, fetVar, 0, 156);
            if (z2) {
                fetVar.e0(2109092205);
                fetVar.r(false);
            } else {
                fetVar.e0(2108873748);
                mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yw((era0) cra0Var, z, z2, function1, i2, (byte) 5);
        }
    }

    public static final void M(final dra0 dra0Var, boolean z, boolean z2, final Function1 function1, fet fetVar, int i2) {
        ugg0 ugg0Var;
        final byte b2;
        fetVar.g0(1687741933);
        byte b3 = 4;
        int i3 = i2 | (fetVar.g(dra0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        final byte b4 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(jm40Var, ugg0Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 24.0f, 0.0f, 4.0f, z ? 8.0f : 0.0f);
            s7l0 s7l0Var = dra0Var.e;
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean z3 = (i4 == 2048) | (i5 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new Function0() { // from class: a.ita0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b4;
                        dra0 dra0Var2 = dra0Var;
                        Function1 function2 = function1;
                        switch (b5) {
                            case 0:
                                function2.invoke(new xqa0(dra0Var2.f6550a, dra0Var2.c, dra0Var2.h, dra0Var2.b));
                                break;
                            default:
                                function2.invoke(new jqa0(dra0Var2.f6550a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i4 == 2048) | (i5 == 4);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                b2 = 1;
                objP2 = new Function0() { // from class: a.ita0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b2;
                        dra0 dra0Var2 = dra0Var;
                        Function1 function2 = function1;
                        switch (b5) {
                            case 0:
                                function2.invoke(new xqa0(dra0Var2.f6550a, dra0Var2.c, dra0Var2.h, dra0Var2.b));
                                break;
                            default:
                                function2.invoke(new jqa0(dra0Var2.f6550a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            } else {
                b2 = 1;
            }
            Function0 function2 = (Function0) objP2;
            int i6 = (i5 == 4 ? b2 : (byte) 0) | (i4 == 2048 ? b2 : (byte) 0);
            Object objP3 = fetVar.P();
            if (i6 != 0 || objP3 == cl5Var) {
                objP3 = new zga0(function1, (era0) dra0Var, b3);
                fetVar.o0(objP3);
            }
            xbc.o(mm40VarM, s7l0Var, null, null, false, function0, function2, null, (Function1) objP3, fetVar, 0, 156);
            if (z) {
                fetVar.e0(-18640501);
                fetVar.r(false);
            } else {
                fetVar.e0(-18981966);
                mbc.o(zfi0.f44303a, s5x0.N(o7k0.d(jm40Var, 1.0f), !z2 ? 70.0f : 16.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yw((era0) dra0Var, z, z2, function1, i2, (byte) 3);
        }
    }

    public static final void N(mm40 mm40Var, final ArrayList arrayList, fqm fqmVar, final int i2, final xdr xdrVar, Function2 function2, Function0 function0, Function1 function1, fet fetVar, int i3) {
        mm40 mm40Var2;
        fet fetVar2;
        kwj kwjVar;
        int i4;
        fet fetVar3 = fetVar;
        ArrayList arrayList2 = fqmVar.c;
        fetVar3.g0(-1526580303);
        int i5 = i3 | 6 | (fetVar3.g(arrayList) ? 32 : 16) | (fetVar3.i(fqmVar) ? 256 : 128) | (fetVar3.e(i2) ? 2048 : 1024) | (fetVar3.i(xdrVar) ? 16384 : 8192) | (fetVar3.i(function2) ? 131072 : 65536) | (fetVar3.i(function0) ? 1048576 : 524288) | (fetVar3.i(function1) ? 8388608 : 4194304);
        if (fetVar3.U(i5 & 1, (4793491 & i5) != 4793490)) {
            int i6 = fqmVar.b;
            boolean zG = fetVar3.g(arrayList2);
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = Integer.valueOf(arrayList2.size());
                fetVar3.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            boolean zE = fetVar3.e(iIntValue);
            Object objP2 = fetVar3.P();
            if (zE || objP2 == cl5Var) {
                objP2 = Integer.valueOf(iIntValue > 1 ? Integer.MAX_VALUE : 1);
                fetVar3.o0(objP2);
            }
            int iIntValue2 = ((Number) objP2).intValue();
            int i7 = iIntValue2 / 2;
            int i8 = iIntValue == 0 ? 0 : ((i7 % iIntValue) + iIntValue) % iIntValue;
            int i9 = i7 + (i6 >= i8 ? i6 - i8 : (iIntValue - i8) + i6);
            boolean zE2 = fetVar3.e(iIntValue2);
            Object objP3 = fetVar3.P();
            if (zE2 || objP3 == cl5Var) {
                objP3 = new y02(iIntValue2, (byte) 6);
                fetVar3.o0(objP3);
            }
            kwj kwjVarB = zk80.b(i9, (Function0) objP3, fetVar3, 0, 2);
            pz40 pz40VarE = ydx.E(kwjVarB.p.f12108a, new mel(new nel()), null, fetVar3, 0, 2);
            Integer numValueOf = Integer.valueOf(i6);
            boolean zG2 = fetVar3.g(kwjVarB) | ((i5 & 896) == 256 || fetVar3.i(fqmVar)) | fetVar3.e(iIntValue);
            Object objP4 = fetVar3.P();
            if (zG2 || objP4 == cl5Var) {
                fetVar2 = fetVar3;
                kwjVar = kwjVarB;
                i4 = iIntValue;
                d21 d21Var = new d21((Object) kwjVar, (Object) fqmVar, i4, (yje) null, (byte) 11);
                fetVar2.o0(d21Var);
                objP4 = d21Var;
            } else {
                fetVar2 = fetVar3;
                kwjVar = kwjVarB;
                i4 = iIntValue;
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP4);
            boolean zG3 = fetVar2.g(kwjVar) | ((3670016 & i5) == 1048576);
            int i10 = 29360128 & i5;
            boolean zE3 = zG3 | (i10 == 8388608) | fetVar2.e(i4);
            Object objP5 = fetVar2.P();
            if (zE3 || objP5 == cl5Var) {
                fs fsVar = new fs(kwjVar, function0, function1, i4, (yje) null);
                fetVar2.o0(fsVar);
                objP5 = fsVar;
            }
            m0x0.t(fetVar2, kwjVar, (Function2) objP5);
            Integer numValueOf2 = Integer.valueOf(kwjVar.k());
            boolean zG4 = (i10 == 8388608) | fetVar2.g(pz40VarE) | fetVar2.g(kwjVar) | fetVar2.e(i4);
            Object objP6 = fetVar2.P();
            if (zG4 || objP6 == cl5Var) {
                l21 l21Var = new l21(pz40VarE, function1, kwjVar, i4, (yje) null);
                fetVar2.o0(l21Var);
                objP6 = l21Var;
            }
            m0x0.t(fetVar2, numValueOf2, (Function2) objP6);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
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
            mm40Var2 = jm40Var;
            q5x.e(kwjVar, o7k0.d(jm40Var, 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(301082778, new ydr() { // from class: a.ts50
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    pm80 pm80VarF;
                    boolean z;
                    int iIntValue3 = ((Integer) obj2).intValue();
                    fet fetVar4 = (fet) obj3;
                    int iIntValue4 = ((Integer) obj4).intValue();
                    ((rk80) obj).getClass();
                    if ((iIntValue4 & 48) == 0) {
                        iIntValue4 |= fetVar4.e(iIntValue3) ? 32 : 16;
                    }
                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                        ArrayList arrayList3 = arrayList;
                        int size = arrayList3.size();
                        ht50 ht50Var = (ht50) CollectionsKt.W(size == 0 ? 0 : ((iIntValue3 % size) + size) % size, arrayList3);
                        if (ht50Var == null) {
                            fetVar4.e0(1665631755);
                            fetVar4.r(false);
                        } else {
                            fetVar4.e0(1665631756);
                            final int i11 = ht50Var.f13617a;
                            final int i12 = ht50Var.b;
                            String str = ht50Var.c;
                            String str2 = ht50Var.d;
                            String str3 = ht50Var.e;
                            n0x n0xVar = ht50Var.f;
                            int i13 = iIntValue4 & 112;
                            boolean z2 = i13 == 32;
                            Object objP7 = fetVar4.P();
                            cl5 cl5Var2 = ukd.f35823a;
                            if (z2 || objP7 == cl5Var2) {
                                objP7 = androidx.compose.runtime.e.e(hz3.f13888a);
                                fetVar4.o0(objP7);
                            }
                            pz40 pz40Var = (pz40) objP7;
                            boolean z3 = i13 == 32;
                            Object objP8 = fetVar4.P();
                            if (z3 || objP8 == cl5Var2) {
                                objP8 = androidx.compose.runtime.e.e(null);
                                fetVar4.o0(objP8);
                            }
                            final pz40 pz40Var2 = (pz40) objP8;
                            Object objA = n0xVar.a();
                            boolean zG5 = fetVar4.g(pz40Var) | fetVar4.g(pz40Var2) | fetVar4.g(n0xVar);
                            Object objP9 = fetVar4.P();
                            if (zG5 || objP9 == cl5Var2) {
                                objP9 = new jl40((Object) n0xVar, (Object) pz40Var, (Object) pz40Var2, (byte) 8);
                                fetVar4.o0(objP9);
                            }
                            mz3 mz3VarX = l7x.X(objA, (Function1) objP9, null, fetVar4, 0, 26);
                            final xdr xdrVar2 = xdrVar;
                            boolean zG6 = fetVar4.g(xdrVar2) | fetVar4.e(i11) | fetVar4.e(i12) | fetVar4.g(pz40Var2);
                            Object objP10 = fetVar4.P();
                            if (zG6 || objP10 == cl5Var2) {
                                objP10 = new Function0() { // from class: a.us50
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        xdrVar2.F(Integer.valueOf(i11), Integer.valueOf(i12), (String) pz40Var2.getValue());
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar4.o0(objP10);
                            }
                            jm40 jm40Var2 = jm40.b;
                            mm40 mm40VarW = y860.W(jm40Var2, null, null, false, null, (Function0) objP10, 28);
                            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.n, fetVar4, 48);
                            int iHashCode2 = Long.hashCode(fetVar4.T);
                            bh90 bh90VarM2 = fetVar4.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarW);
                            mkd.c0.getClass();
                            fetVar4.i0();
                            boolean z4 = fetVar4.S;
                            pcy pcyVar = e7z.u1;
                            if (z4) {
                                fetVar4.l(pcyVar);
                            } else {
                                fetVar4.r0();
                            }
                            shd shdVar = gqw0.x;
                            jpm0.o(fetVar4, x5dVarA2, shdVar);
                            shd shdVar2 = gqw0.w;
                            jpm0.o(fetVar4, bh90VarM2, shdVar2);
                            Integer numValueOf3 = Integer.valueOf(iHashCode2);
                            shd shdVar3 = gqw0.y;
                            jpm0.o(fetVar4, numValueOf3, shdVar3);
                            jpm0.n(fetVar4);
                            shd shdVar4 = gqw0.v;
                            jpm0.o(fetVar4, mm40VarC1, shdVar4);
                            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                            int iHashCode3 = Long.hashCode(fetVar4.T);
                            bh90 bh90VarM3 = fetVar4.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar4, jm40Var2);
                            fetVar4.i0();
                            if (fetVar4.S) {
                                fetVar4.l(pcyVar);
                            } else {
                                fetVar4.r0();
                            }
                            jpm0.o(fetVar4, tj30VarC, shdVar);
                            jpm0.o(fetVar4, bh90VarM3, shdVar2);
                            vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
                            jpm0.o(fetVar4, mm40VarC2, shdVar4);
                            float f2 = xfn.a(fetVar4).c;
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarO = ny9.O(2.7692308f, o7k0.d(s5x0.K(jm40Var2, f2, 8.0f), 1.0f), false);
                            zcl zclVar2 = qmk.i;
                            ugg0 ugg0Var = vgg0.f37379a;
                            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO);
                            pge pgeVar = gqw0.A;
                            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                                fetVar4.e0(113108037);
                                fetVar4.r(false);
                                pm80VarF = mz3VarX;
                            } else {
                                fetVar4.e0(113198061);
                                pm80VarF = a8k0.F(i2, 0, fetVar4);
                                fetVar4.r(false);
                            }
                            j0x.b(pm80VarF, null, mm40VarE, null, pgeVar, 0.0f, null, fetVar4, 24632, 104);
                            fet fetVar5 = fetVar4;
                            if (str3.length() > 0) {
                                fetVar5.e0(113495785);
                                j6n.h(str3, new iro0(d4d.BACKGROUND), s5x0.N(s5x0.L(jm40Var2, xfn.a(fetVar5).c - 1.0f, 0.0f, 2), 0.0f, 7.0f, 0.0f, 0.0f, 13), 0, 0, fetVar5, 0, 24);
                                fetVar5 = fetVar5;
                                z = false;
                                fetVar5.r(false);
                            } else {
                                z = false;
                                fetVar5.e0(114063705);
                                fetVar5.r(false);
                            }
                            fetVar5.r(true);
                            mm40 mm40VarD2 = o7k0.d(s5x0.L(o7k0.e(jm40Var2, 20.0f), xfn.a(fetVar5).e, 0.0f, 2), 1.0f);
                            zfn zfnVar = j1t0.e;
                            ((g1t0) fetVar5.k(zfnVar)).getClass();
                            fet fetVar6 = fetVar5;
                            v8q0.a(str, mm40VarD2, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.j(), fetVar5), fetVar6, 0, 28032, 102396);
                            qxw.o(fetVar6, o7k0.e(jm40Var2, 4.0f));
                            mm40 mm40VarD3 = o7k0.d(s5x0.L(o7k0.e(jm40Var2, 14.0f), xfn.a(fetVar6).e, 0.0f, 2), 1.0f);
                            ((g1t0) fetVar6.k(zfnVar)).getClass();
                            v8q0.a(str2, mm40VarD3, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar6), fetVar6, 0, 28032, 102396);
                            qxw.o(fetVar6, o7k0.e(jm40Var2, 4.0f));
                            fetVar6.r(true);
                            fetVar6.r(false);
                        }
                    } else {
                        fetVar4.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), fetVar, 48, 24576, 16380);
            mm40 mm40VarL = s5x0.L(o7k0.d(mm40Var2, 1.0f), xfn.a(fetVar).e, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            int i11 = i5 >> 3;
            fetVar3 = fetVar;
            kbc.m(s5x0.N(mm40VarL, 0.0f, 8.0f, 0.0f, 4.0f, 5), fqmVar, jxh0.f17307a, function2, fetVar3, (i11 & 112) | 448 | (i11 & 57344));
            fetVar3.r(true);
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49(mm40Var2, arrayList, fqmVar, i2, xdrVar, function2, function0, function1, i3);
        }
    }

    public static final void O(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-8220846);
        int i3 = i2 | 6;
        byte b2 = 2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            float f2 = xfn.a(fetVar).c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.K(jm40Var, f2, 8.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(ny9.O(2.7692308f, h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), false), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.L(jm40Var, xfn.a(fetVar).e, 0.0f, 2), 1.0f), 20.0f)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(s5x0.L(jm40Var, xfn.a(fetVar).e, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 14.0f)), vbc.d0(null, fetVar, 0, 1)));
            rz4.t(jm40Var, 16.0f, fetVar, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var2, i2, b2);
        }
    }

    public static final void P(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        Function1 function2 = function1;
        fetVar.g0(1314177331);
        byte b2 = 4;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new ziw(l7m0Var, (byte) 19));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new ziw(l7m0Var, (byte) 20));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var3 = (l7m0) objP2;
            Boolean boolValueOf = Boolean.valueOf(((yhz) l7m0Var.getValue()).c);
            int i4 = i3 & 112;
            boolean zG = ((i3 & 14) == 4) | fetVar.g(xczVarA) | (i4 == 32);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                ygz ygzVar = new ygz(l7m0Var, xczVarA, function2, null, (byte) 0);
                fetVar.o0(ygzVar);
                objP3 = ygzVar;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            wgz wgzVar = (wgz) l7m0Var2.getValue();
            if (Intrinsics.d(wgzVar, ugz.f35650a)) {
                fetVar.e0(2030626199);
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = jgk0.b(new ziw(l7m0Var, (byte) 21));
                    fetVar.o0(objP4);
                }
                function2 = function1;
                fetVar2 = fetVar;
                Q((l7m0) objP4, l7m0Var3, xczVarA, function2, fetVar2, ((i3 << 6) & 7168) | 54);
                fetVar2.r(false);
            } else {
                function2 = function1;
                fetVar2 = fetVar;
                if (!(wgzVar instanceof vgz)) {
                    throw b1j.f(204049098, fetVar2, false);
                }
                fetVar2.e0(2030987008);
                vgz vgzVar = (vgz) wgzVar;
                boolean zF = fetVar2.f(vgzVar.f37406a);
                Object objP5 = fetVar2.P();
                if (zF || objP5 == cl5Var) {
                    objP5 = jgk0.b(new rcz(vgzVar, b2));
                    fetVar2.o0(objP5);
                }
                r((l7m0) objP5, function2, fetVar2, i4);
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function2, i2, (byte) 5);
        }
    }

    public static final void Q(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var3;
        int i3;
        l7m0 l7m0Var4;
        fetVar.g0(-680761520);
        if ((i2 & 6) == 0) {
            l7m0Var3 = l7m0Var;
            i3 = (fetVar.g(l7m0Var3) ? 4 : 2) | i2;
        } else {
            l7m0Var3 = l7m0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var4 = l7m0Var2;
            i3 |= fetVar.g(l7m0Var4) ? 32 : 16;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = xfn.a(fetVar).c;
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var3, new qw3(8.0f, true, new jf4((byte) 14)), h97.f(f2, 8.0f, f2, 28.0f, fetVar), z, null, u1c.M(884168718, new gn(function1, (byte) 22), fetVar), fetVar, ((i3 >> 3) & 112) | 100663302 | ((i3 << 6) & 896), 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgz(l7m0Var, l7m0Var4, xczVar, function1, i2, (byte) 0);
        }
    }

    public static final void R(float f2, int i2, fet fetVar, mm40 mm40Var, String str, boolean z) {
        mm40 mm40Var2;
        pge pgeVar = gqw0.A;
        fetVar.g0(-1302199576);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        int i4 = i3 | (fetVar.g(str) ? 256 : 128) | (fetVar.d(f2) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            fetVar.e0(z ? -1578303428 : -1578301576);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_stadium, 0, fetVar);
            fetVar.r(false);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ryc0(pz40Var, (byte) 23);
                fetVar.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(str, (Function1) objP2, null, fetVar, ((i4 >> 6) & 14) | 384, 26);
            zcl zclVar = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40Var2 = mm40Var;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var2), ((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), jd8.n);
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
            lz3 lz3Var = (lz3) pz40Var.getValue();
            jm40 jm40Var = jm40.b;
            jr8 jr8Var = jr8.f16991a;
            if (lz3Var != null && ((lz3Var instanceof jz3) || (lz3Var instanceof iz3))) {
                fetVar.e0(2074426671);
                mm40 mm40VarN = z ? o7k0.n(jm40Var, f2) : jr8Var.a(jm40Var);
                if (z) {
                    pgeVar = gqw0.B;
                }
                j0x.b(pm80VarF, null, mm40VarN, null, pgeVar, 0.0f, null, fetVar, 56, 104);
                fetVar.r(false);
            } else {
                fetVar.e0(2074798454);
                j0x.b(mz3VarX, null, jr8Var.a(jm40Var), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new axl0((byte) 0, f2, i2, mm40Var2, str, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02d2  */
    public static final void S(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        pcy pcyVar;
        jm40 jm40Var;
        mm40 mm40VarW;
        cl5 cl5Var;
        boolean z;
        boolean z2;
        pcy pcyVar2;
        boolean z3;
        int i3;
        cl5 cl5Var2;
        cl5 cl5Var3;
        fet fetVar2 = fetVar;
        Function1 function2 = function1;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        a4xVar.getClass();
        function2.getClass();
        fetVar2.g0(127362458);
        int i4 = i2 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar);
            int size = a4xVar.size();
            boolean zE = fetVar2.e(size);
            Object objP = fetVar2.P();
            cl5 cl5Var4 = ukd.f35823a;
            if (zE || objP == cl5Var4) {
                objP = Boolean.valueOf(size > 4);
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            boolean zIsEmpty = a4xVar.isEmpty();
            boolean z5 = !zIsEmpty;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarO = ny9.O(1.6f, o7k0.d(jm40Var2, 1.0f), false);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarO);
            fetVar2.i0();
            int i5 = size;
            if (fetVar2.S) {
                pcyVar = pcyVar3;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar3;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar);
            n0q n0qVar = o7k0.c;
            if (zIsEmpty) {
                jm40Var = jm40Var2;
                fetVar2.e0(78012518);
                fetVar2.r(false);
                mm40VarW = jm40Var;
            } else {
                fetVar2.e0(78005994);
                boolean z6 = (i4 & 896) == 256;
                Object objP2 = fetVar2.P();
                if (z6 || objP2 == cl5Var4) {
                    objP2 = new yhl0(function2, (byte) 11);
                    fetVar2.o0(objP2);
                }
                mm40VarW = W(jm40Var2, null, null, false, null, (Function0) objP2, 28);
                jm40Var = jm40Var2;
                fetVar2.r(false);
            }
            pcy pcyVar4 = pcyVar;
            R(44.0f, 0, fetVar2, n0qVar.e(mm40VarW), (String) CollectionsKt.firstOrNull(a4xVar), z5);
            if (zIsEmpty) {
                cl5Var = cl5Var4;
                z = true;
                z2 = false;
                fetVar2.e0(-1875938652);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1876334057);
                z2 = false;
                cl5Var = cl5Var4;
                z = true;
                dww.c(a8k0.F(R.drawable.ic_glyph_zoom, 0, fetVar2), null, o2e.e0(s5x0.J(jr8.f16991a.b(jm40Var, gqw0.i), 8.0f), "STADIUM_ICON_TAG"), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 56, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(z);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, z, new jf4((byte) 14)), gqw0.j, fetVar2, z2 ? 1 : 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar2 = pcyVar4;
                fetVar2.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar4;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar);
            fetVar2.e0(1002792786);
            Iterator it = l1e0.o(z2 ? 1 : 0, 3).iterator();
            while (((kkx) it).c) {
                int iNextInt = ((bkx) it).nextInt();
                x7z x7zVar = new x7z(1.0f, z);
                tj30 tj30VarC2 = zq8.c(gqw0.e, z2);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, x7zVar);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar2);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar4);
                jpm0.o(fetVar2, bh90VarM4, shdVar3);
                vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar);
                String str = (String) CollectionsKt.W(iNextInt + 1, a4xVar);
                if (str != null) {
                    fetVar2.e0(-1852029832);
                    n0q n0qVar2 = o7k0.c;
                    boolean z7 = ((i4 & 896) == 256 ? z : z2) | (fetVar2.e(iNextInt) ? 1 : 0);
                    Object objP3 = fetVar2.P();
                    if (z7 == 0) {
                        cl5Var3 = cl5Var;
                        if (objP3 == cl5Var3) {
                        }
                        mm40 mm40VarW2 = W(n0qVar2, null, null, false, null, (Function0) objP3, 28);
                        zcl zclVar2 = qmk.f28987a;
                        cl5Var2 = cl5Var3;
                        R(20.0f, 48, fetVar2, mm40VarW2, str, true);
                        if (iNextInt == 2 || !zBooleanValue) {
                            i3 = i5;
                            z3 = false;
                            fetVar2.e0(-1851367424);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-1851453914);
                            i3 = i5;
                            z3 = false;
                            b(i3, 0, fetVar2);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z3);
                    } else {
                        cl5Var3 = cl5Var;
                    }
                    objP3 = new re1(function1, iNextInt, (byte) 16);
                    fetVar2.o0(objP3);
                    mm40 mm40VarW3 = W(n0qVar2, null, null, false, null, (Function0) objP3, 28);
                    zcl zclVar3 = qmk.f28987a;
                    cl5Var2 = cl5Var3;
                    R(20.0f, 48, fetVar2, mm40VarW3, str, true);
                    if (iNextInt == 2) {
                        i3 = i5;
                        z3 = false;
                        fetVar2.e0(-1851367424);
                        fetVar2.r(false);
                    } else {
                        i3 = i5;
                        z3 = false;
                        fetVar2.e0(-1851367424);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z3);
                } else {
                    z3 = z2;
                    i3 = i5;
                    cl5Var2 = cl5Var;
                    fetVar2.e0(-1851345600);
                    fetVar2.r(z3);
                }
                fetVar2.r(true);
                i5 = i3;
                z = true;
                z2 = z3;
                cl5Var = cl5Var2;
            }
            boolean z8 = z;
            function2 = function1;
            ohs0.x(fetVar2, z2, z8, z8);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar, function2, i2, (byte) 7);
        }
    }

    public static final void T(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1526447273);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) fetVar.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar);
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new g7o0(l7m0Var, (byte) 24);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Boolean bool = (Boolean) l7m0VarY.getValue();
            bool.booleanValue();
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zG = fetVar.g(l7m0VarY) | fetVar.i(window) | fetVar.i(context) | fetVar.h(zC);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                Object h5bVar = new h5b(window, context, zC, l7m0VarY, (byte) 3);
                fetVar.o0(h5bVar);
                objP2 = h5bVar;
            }
            s0x.e(bool, boolValueOf, null, (Function1) objP2, fetVar, 0, 4);
            Object objD = nip.d(ob3.d(0, 7, fetVar), wzk0.a(fetVar), fetVar, 4);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(objD) | (i4 == 4);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                objP3 = new yip0((Object) l7m0Var, objD, (byte) 19);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP3, fetVar);
            n0q n0qVar = o7k0.c;
            androidx.compose.runtime.d dVar = zaq0.b;
            byte b2 = 17;
            m8x.y(n0qVar, u1c.M(-1714353819, new stl0(l7m0Var, l7m0VarY2, objD, function1, b2), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(dVar)).getBackground(), ((ThemeColors) fetVar.k(dVar)).getBackground(), null, u1c.M(-1438488390, new sqc0(b2, l7m0Var, objD, function1), fetVar), fetVar, 805306422, 316);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, (byte) 3);
        }
    }

    public static final void U(int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(-899027572);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            dww.c(a8k0.F(R.drawable.ic_glyph_show, 0, fetVar), null, mm40Var2, StaticColors.INSTANCE.m123getWhite0d7_KjU(), fetVar2, 56 | ((i3 << 6) & 896), 0);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var2, i2, (byte) 21);
        }
    }

    public static final mm40 V(mm40 mm40Var, gy40 gy40Var, d6x d6xVar, boolean z, ucg0 ucg0Var, Function0 function0) {
        mm40 mm40VarE;
        if (d6xVar != null) {
            mm40VarE = new dtc(gy40Var, d6xVar, false, z, null, ucg0Var, function0);
        } else if (d6xVar == null) {
            mm40VarE = new dtc(gy40Var, null, false, z, null, ucg0Var, function0);
        } else {
            jm40 jm40Var = jm40.b;
            mm40VarE = gy40Var != null ? a6x.a(jm40Var, gy40Var, d6xVar).e(new dtc(gy40Var, null, false, z, null, ucg0Var, function0)) : kbc.O(jm40Var, new gtc(d6xVar, z, ucg0Var, function0));
        }
        return mm40Var.e(mm40VarE);
    }

    public static /* synthetic */ mm40 W(mm40 mm40Var, gy40 gy40Var, d6x d6xVar, boolean z, ucg0 ucg0Var, Function0 function0, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            ucg0Var = null;
        }
        return V(mm40Var, gy40Var, d6xVar, z2, ucg0Var, function0);
    }

    public static mm40 X(Function0 function0) {
        return kbc.O(jm40.b, new ftc(function0, (byte) 0));
    }

    public static mm40 Y(mm40 mm40Var, boolean z, String str, ucg0 ucg0Var, Function0 function0, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return mm40Var.e(new dtc(null, null, true, z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : ucg0Var, function0));
    }

    public static mm40 Z(mm40 mm40Var, gy40 gy40Var, boolean z, Function0 function0, Function0 function1, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 64) != 0) {
            function0 = null;
        }
        return mm40Var.e(new w6d(gy40Var, function1, function0, z));
    }

    public static final void a(mm40 mm40Var, ad adVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        adVar.getClass();
        function1.getClass();
        fetVar2.g0(2025896884);
        int i3 = i2 | 6 | (fetVar2.g(adVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = adVar instanceof wc;
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (z2) {
                fetVar2.e0(613858897);
                wc wcVar = (wc) adVar;
                ijl ijlVar = wcVar.b;
                jjl jjlVar = wcVar.f38902a;
                int i4 = i3 & 896;
                boolean z3 = i4 == 256;
                Object objP = fetVar2.P();
                if (z3 || objP == cl5Var) {
                    objP = new e0(function1, (byte) 11);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z4 = i4 == 256;
                Object objP2 = fetVar2.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new e0(function1, (byte) 13);
                    fetVar2.o0(objP2);
                }
                Function0 function2 = (Function0) objP2;
                z = i4 == 256;
                Object objP3 = fetVar2.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new e0(function1, (byte) 15);
                    fetVar2.o0(objP3);
                }
                feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar2, 0, 4);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                if (!(adVar instanceof yc)) {
                    throw b1j.f(1266726552, fetVar2, false);
                }
                fetVar2.e0(614452485);
                mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarQ, 12.0f, 8.0f);
                yc ycVar = (yc) adVar;
                String str = ycVar.f42363a;
                String str2 = ycVar.b;
                int i5 = i3 & 896;
                boolean z5 = i5 == 256;
                Object objP4 = fetVar2.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new e0(function1, (byte) 17);
                    fetVar2.o0(objP4);
                }
                Function0 function3 = (Function0) objP4;
                z = i5 == 256;
                Object objP5 = fetVar2.P();
                if (z || objP5 == cl5Var) {
                    objP5 = new e0(function1, (byte) 19);
                    fetVar2.o0(objP5);
                }
                pzb.g(mm40VarK, str, str2, function3, (Function0) objP5, fetVar2, 0);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var2, adVar, function1, i2, (byte) 8);
        }
    }

    public static BetZip a0() {
        BetPlayerZip betPlayerZip = new BetPlayerZip(0L, "");
        uoy uoyVar = uoy.LINE;
        iun iunVar = iun.f15405a;
        return new BetZip(0L, 0.0d, 0L, 0.0d, "", false, "", "", betPlayerZip, 0, 0L, uoyVar, 0L, 0, 0L, false, 0L, false, new PlayersDuelZip(iunVar, iunVar), "", "", izc.d, false, false, false, false, "", false, false, "", false, false, false, new EventParams(iunVar, iunVar));
    }

    public static final void b(int i2, int i3, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1258200615);
        int i4 = (fetVar2.e(i2) ? 4 : 2) | i3;
        if (fetVar2.U(i4 & 1, (i4 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 24.0f);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarN, ((StaticColors) fetVar2.k(zfnVar)).m73getBlack400d7_KjU(), vgg0.f37379a), 0.0f, 4.0f, 1);
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
            v8q0.a(twn.m(i2 - 4, "+"), null, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 130042);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i2, i3, (byte) 27);
        }
    }

    public static final mm40 b0(mm40 mm40Var, cqq cqqVar) {
        return mm40Var.e(new dqq(cqqVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        byte b2;
        int i4;
        int i5;
        Object obj;
        boolean z;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-395275123);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xn0 xn0Var = (xn0) l7m0Var.getValue();
            pz40 pz40Var = s6t0.f31722a;
            long jM139getBackgroundContent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(i120.Q(jm40Var, jM139getBackgroundContent0d7_KjU, ljcVar), 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar.l(function0);
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
            int i6 = i3;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            imm immVarA = xn0Var.a();
            int i7 = i6 & 112;
            boolean z3 = i7 == 32;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z3 || objP == obj2) {
                objP = new dn(function1, (byte) 26);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            boolean z4 = i7 == 32;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == obj2) {
                objP2 = new y7(function1, (byte) 22);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarD2, immVarA, null, function2, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 6, 0, 4052);
            wdp wdpVarB = xn0Var.b();
            if (wdpVarB == null) {
                fetVar.e0(-1989387448);
                fetVar.r(false);
                i4 = i7;
                obj = obj2;
                i5 = 32;
            } else {
                fetVar.e0(-1989387447);
                ijl ijlVar = wdpVarB.b;
                jjl jjlVar = wdpVarB.f38985a;
                i4 = i7;
                i5 = 32;
                boolean z5 = i4 == 32;
                Object objP3 = fetVar.P();
                obj = obj2;
                if (z5 || objP3 == obj) {
                    objP3 = new dn(function1, (byte) 27);
                    fetVar.o0(objP3);
                }
                Function0 function3 = (Function0) objP3;
                boolean z6 = i4 == 32;
                Object objP4 = fetVar.P();
                if (z6 || objP4 == obj) {
                    objP4 = new dn(function1, (byte) 28);
                    fetVar.o0(objP4);
                }
                Function0 function4 = (Function0) objP4;
                boolean z7 = i4 == 32;
                Object objP5 = fetVar.P();
                if (z7 || objP5 == obj) {
                    objP5 = new dn(function1, (byte) 29);
                    fetVar.o0(objP5);
                }
                feb.k(ijlVar, jjlVar, null, function3, function4, (Function0) objP5, fetVar, 0, 4);
                fetVar.r(false);
            }
            if (xn0Var instanceof vn0) {
                fetVar.e0(-1988682538);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                float f2 = xfn.a(fetVar).c;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarD3, f2, 8.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK);
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
                mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                vn0 vn0Var = (vn0) xn0Var;
                a4x a4xVar = vn0Var.b;
                dxh0 dxh0Var = vn0Var.e;
                boolean zG = fetVar.g(xn0Var);
                Object objP6 = fetVar.P();
                if (zG || objP6 == obj) {
                    objP6 = new nc((Object) xn0Var, (byte) 11);
                    fetVar.o0(objP6);
                }
                Function0 function5 = (Function0) objP6;
                boolean z8 = i4 == i5;
                Object objP7 = fetVar.P();
                if (z8 || objP7 == obj) {
                    objP7 = new y7(function1, (byte) 23);
                    fetVar.o0(objP7);
                }
                ibc.n(mm40VarD4, a4xVar, gxh0.f12078a, dxh0Var, false, function5, (Function1) objP7, fetVar, 390, 16);
                z = true;
                fetVar.r(true);
                mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
                fetVar.r(false);
            } else {
                z = true;
                fetVar.e0(-1987770549);
                fetVar.r(false);
            }
            fetVar.r(z);
            b2 = z;
        } else {
            b2 = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, b2);
        }
    }

    public static final void c0(ViewGroup viewGroup, b33 b33Var) {
        if (viewGroup instanceof FragmentContainerView) {
            b33Var.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.getClass();
            if (childAt instanceof ViewGroup) {
                c0((ViewGroup) childAt, b33Var);
            }
        }
    }

    public static final void d(mm40 mm40Var, a4x a4xVar, mtl mtlVar, xcz xczVar, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        byte b2;
        boolean z;
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar2.g0(1883873628);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        int i6 = i4 | (fetVar2.g(a4xVar) ? 32 : 16) | (fetVar2.g(mtlVar) ? 256 : 128) | (fetVar2.g(xczVar) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i5 != 0 ? jm40Var : mm40Var2;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(mm40Var4.e(n0qVar), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
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
            mm40 mm40VarE0 = o2e.e0(n0qVar, "FULL_INFO_DESCRIPTION_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, mtlVar != null ? 100.0f : 24.0f, 5), fetVar2);
            int i7 = 57344 & i6;
            boolean z2 = ((i6 & 112) == 32) | (i7 == 16384);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                b2 = 1;
                objP = new or0(a4xVar, function1, b2);
                fetVar2.o0(objP);
            } else {
                b2 = 1;
            }
            mm40 mm40Var5 = mm40Var4;
            b8k0.e(mm40VarE0, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, ((i6 >> 6) & 112) | 6, Response.SERVER_TIMEOUT);
            fetVar2 = fetVar;
            if (mtlVar == null) {
                fetVar2.e0(1992486328);
                fetVar2.r(false);
                z = true;
            } else {
                fetVar2.e0(1992486329);
                mm40 mm40VarE1 = o2e.e0(s5x0.N(o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), 1.0f), 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7), "FULL_INFO_DESCRIPTION_BOTTOM_BAR");
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                boolean z3 = i7 == 16384;
                Object objP2 = fetVar2.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new h61(function1, (byte) 18);
                    fetVar2.o0(objP2);
                }
                z = true;
                bkb.f(mm40VarE1, mtlVar, null, false, lh80VarU, (Function1) objP2, fetVar2, 3072, 4);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var3 = mm40Var5;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vs1(mm40Var3, (Object) a4xVar, mtlVar, (bch0) xczVar, function1, i2, i3, (byte) 1);
        }
    }

    public static final boolean d0(KeyEvent keyEvent) {
        long jC = n7x.C(keyEvent);
        int i2 = qjy.O;
        return qjy.a(jC, qjy.h) || qjy.a(jC, qjy.r) || qjy.a(jC, qjy.E) || qjy.a(jC, qjy.q);
    }

    public static final void e(mm40 mm40Var, jyq0 jyq0Var, Function1 function1, fet fetVar, int i2) {
        jyq0Var.getClass();
        function1.getClass();
        fetVar.g0(1038082968);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(jyq0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            gql gqlVar = jyq0Var.f17373a;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ag0(function1, (byte) 9);
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new si1(function1, (byte) 27);
                fetVar.o0(objP2);
            }
            aac.l(mm40Var, gqlVar, 0.0f, function2, (Function0) objP2, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, jyq0Var, function1, i2, (byte) 24);
        }
    }

    public static void e0(SSLSocket sSLSocket) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
        }
        if (i2 < 29) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
        }
    }

    public static final void f(xdr xdrVar, mm40 mm40Var, Function1 function1, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        Function1 function2;
        Function1 function3;
        fetVar.g0(-1985291610);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.i(xdrVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var;
            byte b2 = 6;
            if (i6 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new sy2(b2);
                    fetVar.o0(objP);
                }
                function3 = (Function1) objP;
            } else {
                function3 = function1;
            }
            g(xdrVar, mm40Var3, null, null, function3, fetVar, (i4 & 14) | 384 | (i4 & 112) | ((i4 << 6) & 57344), 8);
            mm40Var2 = mm40Var3;
            function2 = function3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            function2 = function1;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23((wdr) xdrVar, (Object) mm40Var2, (Object) function2, i2, i3, (byte) 0);
        }
    }

    public static final void f0(NumberPicker numberPicker, z860 z860Var) {
        numberPicker.getClass();
        z860Var.getClass();
        if (z860Var.c.isEmpty()) {
            return;
        }
        numberPicker.setMinValue(z860Var.f43952a);
        numberPicker.setMaxValue(z860Var.b);
        numberPicker.setDisplayedValues((String[]) z860Var.c.toArray(new String[0]));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x013e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Code duplicated, block: B:91:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void g(xdr xdrVar, mm40 mm40Var, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        int i5;
        boolean z;
        Function1 function4;
        mm40 mm40Var3;
        yfe0 yfe0VarU;
        Object objP;
        Object obj;
        Function1 function5;
        View view;
        boolean zG;
        Object objP2;
        Object obj2;
        Object obj3;
        boolean z2;
        boolean z3;
        Object objP3;
        boolean zG2;
        Object objP4;
        Function1 function6;
        boolean z4;
        boolean zI;
        Object objP5;
        boolean z5;
        Object objP6;
        int i6;
        int i7;
        fetVar.g0(509101952);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i4 = (fetVar.i(xdrVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 == 0) {
            if ((i2 & 48) == 0) {
                mm40Var2 = mm40Var;
                i4 |= fetVar.g(mm40Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (fetVar.i(function1)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i4 |= i7;
            }
            i5 = i4 | 3072;
            if ((i2 & 24576) == 0) {
                if (fetVar.i(function3)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i5 |= i6;
            }
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                if (i8 != 0) {
                    mm40Var2 = jm40.b;
                }
                objP = fetVar.P();
                obj = ukd.f35823a;
                if (objP == obj) {
                    objP = new sy2((byte) 7);
                    fetVar.o0(objP);
                }
                function5 = (Function1) objP;
                view = (View) fetVar.k(dy2.f);
                zG = fetVar.g(view);
                objP2 = fetVar.P();
                if (zG || objP2 == obj) {
                    try {
                        view.getClass();
                        objP2 = androidx.fragment.app.e.H(view);
                    } catch (IllegalStateException unused) {
                        objP2 = null;
                    }
                    fetVar.o0(objP2);
                }
                obj2 = (Fragment) objP2;
                obj3 = (Context) fetVar.k(dy2.b);
                boolean zI2 = fetVar.i(obj2);
                if ((i5 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zI2 | z2;
                objP3 = fetVar.P();
                if (z3 || objP3 == obj) {
                    objP3 = new df1(obj2, xdrVar, (byte) 25);
                    fetVar.o0(objP3);
                }
                Function1 function7 = (Function1) objP3;
                if (function1 == null) {
                    fetVar.e0(1128074792);
                    fetVar.r(false);
                    function6 = null;
                } else {
                    fetVar.e0(1128074793);
                    zG2 = fetVar.g(function1);
                    objP4 = fetVar.P();
                    if (zG2 || objP4 == obj) {
                        objP4 = new wc2(function1, b2);
                        fetVar.o0(objP4);
                    }
                    function6 = (Function1) objP4;
                    fetVar.r(false);
                }
                if ((i5 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zI = z4 | fetVar.i(obj2) | fetVar.i(obj3);
                objP5 = fetVar.P();
                if (zI || objP5 == obj) {
                    objP5 = new on((Object) function5, obj2, obj3, (byte) 13);
                    fetVar.o0(objP5);
                }
                Function1 function8 = (Function1) objP5;
                z5 = (57344 & i5) == 16384;
                objP6 = fetVar.P();
                if (z5 || objP6 == obj) {
                    objP6 = new wc2(function3, (byte) 5);
                    fetVar.o0(objP6);
                }
                dwi0.c(function7, mm40Var2, function6, function8, (Function1) objP6, fetVar, i5 & 112, 0);
                function4 = function5;
            } else {
                fetVar.X();
                function4 = function2;
            }
            mm40Var3 = mm40Var2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(xdrVar, mm40Var3, function1, function4, function3, i2, i3);
            }
        }
        i4 |= 48;
        mm40Var2 = mm40Var;
        if ((i2 & 384) == 0) {
            if (fetVar.i(function1)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        i5 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            if (fetVar.i(function3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i5 |= i6;
        }
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i5 & 1, z)) {
            if (i8 != 0) {
                mm40Var2 = jm40.b;
            }
            objP = fetVar.P();
            obj = ukd.f35823a;
            if (objP == obj) {
                objP = new sy2((byte) 7);
                fetVar.o0(objP);
            }
            function5 = (Function1) objP;
            view = (View) fetVar.k(dy2.f);
            zG = fetVar.g(view);
            objP2 = fetVar.P();
            if (zG) {
                view.getClass();
                objP2 = androidx.fragment.app.e.H(view);
                fetVar.o0(objP2);
            } else {
                view.getClass();
                objP2 = androidx.fragment.app.e.H(view);
                fetVar.o0(objP2);
            }
            obj2 = (Fragment) objP2;
            obj3 = (Context) fetVar.k(dy2.b);
            boolean zI3 = fetVar.i(obj2);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zI3 | z2;
            objP3 = fetVar.P();
            if (z3) {
                objP3 = new df1(obj2, xdrVar, (byte) 25);
                fetVar.o0(objP3);
            } else {
                objP3 = new df1(obj2, xdrVar, (byte) 25);
                fetVar.o0(objP3);
            }
            Function1 function9 = (Function1) objP3;
            if (function1 == null) {
                fetVar.e0(1128074792);
                fetVar.r(false);
                function6 = null;
            } else {
                fetVar.e0(1128074793);
                zG2 = fetVar.g(function1);
                objP4 = fetVar.P();
                if (zG2) {
                    objP4 = new wc2(function1, b2);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new wc2(function1, b2);
                    fetVar.o0(objP4);
                }
                function6 = (Function1) objP4;
                fetVar.r(false);
            }
            if ((i5 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zI = z4 | fetVar.i(obj2) | fetVar.i(obj3);
            objP5 = fetVar.P();
            if (zI) {
                objP5 = new on((Object) function5, obj2, obj3, (byte) 13);
                fetVar.o0(objP5);
            } else {
                objP5 = new on((Object) function5, obj2, obj3, (byte) 13);
                fetVar.o0(objP5);
            }
            Function1 function10 = (Function1) objP5;
            if ((57344 & i5) == 16384) {
            }
            objP6 = fetVar.P();
            if (z5) {
                objP6 = new wc2(function3, (byte) 5);
                fetVar.o0(objP6);
            } else {
                objP6 = new wc2(function3, (byte) 5);
                fetVar.o0(objP6);
            }
            dwi0.c(function9, mm40Var2, function6, function10, (Function1) objP6, fetVar, i5 & 112, 0);
            function4 = function5;
        } else {
            fetVar.X();
            function4 = function2;
        }
        mm40Var3 = mm40Var2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a33(xdrVar, mm40Var3, function1, function4, function3, i2, i3);
        }
    }

    public static final qu6 g0(m97 m97Var) {
        m97Var.getClass();
        long j2 = m97Var.f21398a;
        long j3 = m97Var.f;
        String strValueOf = String.valueOf(m97Var.l);
        double d2 = m97Var.j;
        tv6 tv6Var = new tv6("", "", "", "", 0L);
        String str = m97Var.o;
        tqt tqtVar = uoy.b;
        int i2 = m97Var.b;
        tqtVar.getClass();
        return new qu6(0L, j2, 0L, j3, 0L, "", "", "", "", "", "", "", "", "", "", "", "", 0L, strValueOf, d2, tv6Var, str, tqt.j(i2), m97Var.h, m97Var.w, gwe.DEFAULT, 0, m97Var.i, m97Var.y, m97Var.z, q4f.b.a(), new ic9(0, 0, 0, uyc.IDLE));
    }

    public static final void h(int i2, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1319103949);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.g;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            ugdVar2.F(mrv.k0(jm40Var, "AUTH_LOGIN_VISUAL_CONTENT"), fetVar, 54);
            ugdVar.F(mrv.k0(jm40Var, "AUTH_LOGIN_VISUAL_BACKGROUND"), fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p71(mm40Var, ugdVar, ugdVar2, i2, (byte) 2);
        }
    }

    public static final tca h0(l9s l9sVar) {
        return new tca(ihm0.l(l9sVar), l9sVar.G(), l9sVar.v(), l9sVar.y().f21442a, l9sVar.y().d, l9sVar.y().c, l9sVar.y().g, l9sVar.L(), l9sVar.getType() == s9s.f31862a, l9sVar.y().j);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    /* JADX WARN: Code duplicated, block: B:104:0x0238  */
    /* JADX WARN: Code duplicated, block: B:107:0x0248  */
    /* JADX WARN: Code duplicated, block: B:109:0x0278  */
    /* JADX WARN: Code duplicated, block: B:111:0x028e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0299  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    public static final void i(mm40 mm40Var, jd6 jd6Var, float f2, Function1 function1, Function1 function2, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        Function1 function3;
        int i5;
        Function1 function4;
        int i6;
        boolean z;
        Function1 function5;
        Function1 function6;
        yfe0 yfe0VarU;
        dd6 dd6Var;
        jm40 jm40Var;
        Function1 function7;
        int i7;
        Function1 function8;
        int i8;
        boolean z2;
        pcy pcyVar;
        int i9;
        fetVar.g0(387595430);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? fetVar.g(jd6Var) : fetVar.i(jd6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.d(f2) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 == 0) {
            if ((i2 & 3072) == 0) {
                function3 = function1;
                i4 |= fetVar.i(function3) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    function4 = function2;
                    if (fetVar.i(function4)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    jm40Var = jm40.b;
                    if (i10 != 0) {
                        mm40Var2 = jm40Var;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    i7 = i4;
                    if (i5 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (jd6Var instanceof gd6) {
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            return;
                        } else {
                            dd6Var = new dd6(mm40Var2, jd6Var, f2, function7, function8, i2, i3, (byte) 0);
                        }
                    } else {
                        mm40 mm40Var3 = mm40Var2;
                        Function1 function9 = function7;
                        Function1 function10 = function8;
                        mm40 mm40VarE = o7k0.e(mm40Var3, f2);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarS = o7k0.s(mm40VarE, 120.0f);
                        long j2 = ijg.i;
                        zcl zclVar2 = qmk.g;
                        ugg0 ugg0Var = vgg0.f37379a;
                        mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarS, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
                        i8 = i7 & 112;
                        int i12 = i7 >> 3;
                        mm40 mm40VarA0 = saj.a0(mm40VarJ, jd6Var, function9, function10, fetVar, (i12 & 896) | i8 | (i12 & 7168));
                        zx7 zx7Var = gqw0.f11754a;
                        tj30 tj30VarC = zq8.c(zx7Var, false);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
                        mkd.c0.getClass();
                        fetVar.i0();
                        z2 = fetVar.S;
                        pcyVar = e7z.u1;
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
                        n0q n0qVar = o7k0.c;
                        thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
                        if (jd6Var instanceof id6) {
                            fetVar.e0(1661771574);
                            l(null, (id6) jd6Var, fetVar, i8);
                            i9 = 0;
                            fetVar.r(false);
                        } else {
                            i9 = 0;
                            if (jd6Var instanceof hd6) {
                                fetVar.e0(1661775206);
                                m((hd6) jd6Var, fetVar, 6 | i8);
                                fetVar.r(false);
                            } else if (jd6Var instanceof fd6) {
                                fetVar.e0(1661777449);
                                k((fd6) jd6Var, fetVar, 6 | i8);
                                fetVar.r(false);
                            } else if (jd6Var instanceof ed6) {
                                fetVar.e0(1661779877);
                                j(0, fetVar);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(-24384894);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(true);
                        mm40 mm40VarQ = ffb0.Q(jr8.f16991a.b(jm40Var, zx7Var), -4.0f, -10.0f);
                        thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar, i9);
                        int iHashCode3 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM3 = fetVar.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA2, shdVar);
                        jpm0.o(fetVar, bh90VarM3, shdVar2);
                        vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                        jpm0.o(fetVar, mm40VarC2, shdVar4);
                        if (jd6Var.a()) {
                            fetVar.e0(1457521473);
                            s(0, fetVar, o7k0.n(jm40Var, 16.0f));
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1457638715);
                            fetVar.r(false);
                        }
                        if (jd6Var.b()) {
                            fetVar.e0(1457694577);
                            U(0, fetVar, s5x0.J(i120.Q(o7k0.n(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), ijg.l, vgg0.f37379a), 2.0f));
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1458103963);
                            fetVar.r(false);
                        }
                        fetVar.r(true);
                        fetVar.r(true);
                        function5 = function9;
                        function6 = function10;
                        mm40Var2 = mm40Var3;
                    }
                    yfe0VarU.d = dd6Var;
                }
                fetVar.X();
                function5 = function3;
                function6 = function4;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    dd6Var = new dd6(mm40Var2, jd6Var, f2, function5, function6, i2, i3, (byte) 1);
                    yfe0VarU.d = dd6Var;
                }
            }
            i4 |= 24576;
            function4 = function2;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                jm40Var = jm40.b;
                if (i10 != 0) {
                    mm40Var2 = jm40Var;
                }
                if (i11 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                i7 = i4;
                if (i5 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (jd6Var instanceof gd6) {
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        return;
                    } else {
                        dd6Var = new dd6(mm40Var2, jd6Var, f2, function7, function8, i2, i3, (byte) 0);
                    }
                } else {
                    mm40 mm40Var4 = mm40Var2;
                    Function1 function11 = function7;
                    Function1 function12 = function8;
                    mm40 mm40VarE2 = o7k0.e(mm40Var4, f2);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarS2 = o7k0.s(mm40VarE2, 120.0f);
                    long j3 = ijg.i;
                    zcl zclVar4 = qmk.g;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarS2, j3, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 4.0f);
                    i8 = i7 & 112;
                    int i13 = i7 >> 3;
                    mm40 mm40VarA1 = saj.a0(mm40VarJ2, jd6Var, function11, function12, fetVar, (i13 & 896) | i8 | (i13 & 7168));
                    zx7 zx7Var2 = gqw0.f11754a;
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarA1);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z2 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar, tj30VarC2, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM4, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar, numValueOf2, shdVar7);
                    jpm0.n(fetVar);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC3, shdVar8);
                    n0q n0qVar2 = o7k0.c;
                    thg0 thg0VarA3 = shg0.a(uc9.e, gqw0.k, fetVar, 54);
                    int iHashCode5 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM5 = fetVar.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar, n0qVar2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA3, shdVar5);
                    jpm0.o(fetVar, bh90VarM5, shdVar6);
                    vqd.u(iHashCode5, fetVar, shdVar7, fetVar);
                    jpm0.o(fetVar, mm40VarC4, shdVar8);
                    if (jd6Var instanceof id6) {
                        fetVar.e0(1661771574);
                        l(null, (id6) jd6Var, fetVar, i8);
                        i9 = 0;
                        fetVar.r(false);
                    } else {
                        i9 = 0;
                        if (jd6Var instanceof hd6) {
                            fetVar.e0(1661775206);
                            m((hd6) jd6Var, fetVar, 6 | i8);
                            fetVar.r(false);
                        } else if (jd6Var instanceof fd6) {
                            fetVar.e0(1661777449);
                            k((fd6) jd6Var, fetVar, 6 | i8);
                            fetVar.r(false);
                        } else if (jd6Var instanceof ed6) {
                            fetVar.e0(1661779877);
                            j(0, fetVar);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-24384894);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                    mm40 mm40VarQ2 = ffb0.Q(jr8.f16991a.b(jm40Var, zx7Var2), -4.0f, -10.0f);
                    thg0 thg0VarA4 = shg0.a(uc9.f35418a, gqw0.j, fetVar, i9);
                    int iHashCode6 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM6 = fetVar.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarQ2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA4, shdVar5);
                    jpm0.o(fetVar, bh90VarM6, shdVar6);
                    vqd.u(iHashCode6, fetVar, shdVar7, fetVar);
                    jpm0.o(fetVar, mm40VarC5, shdVar8);
                    if (jd6Var.a()) {
                        fetVar.e0(1457521473);
                        s(0, fetVar, o7k0.n(jm40Var, 16.0f));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1457638715);
                        fetVar.r(false);
                    }
                    if (jd6Var.b()) {
                        fetVar.e0(1457694577);
                        U(0, fetVar, s5x0.J(i120.Q(o7k0.n(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), ijg.l, vgg0.f37379a), 2.0f));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1458103963);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    fetVar.r(true);
                    function5 = function11;
                    function6 = function12;
                    mm40Var2 = mm40Var4;
                }
                yfe0VarU.d = dd6Var;
            }
            fetVar.X();
            function5 = function3;
            function6 = function4;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                dd6Var = new dd6(mm40Var2, jd6Var, f2, function5, function6, i2, i3, (byte) 1);
                yfe0VarU.d = dd6Var;
            }
        }
        i4 |= 3072;
        function3 = function1;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                function4 = function2;
                if (fetVar.i(function4)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                jm40Var = jm40.b;
                if (i10 != 0) {
                    mm40Var2 = jm40Var;
                }
                if (i11 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                i7 = i4;
                if (i5 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (jd6Var instanceof gd6) {
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        return;
                    } else {
                        dd6Var = new dd6(mm40Var2, jd6Var, f2, function7, function8, i2, i3, (byte) 0);
                    }
                } else {
                    mm40 mm40Var5 = mm40Var2;
                    Function1 function13 = function7;
                    Function1 function14 = function8;
                    mm40 mm40VarE3 = o7k0.e(mm40Var5, f2);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarS3 = o7k0.s(mm40VarE3, 120.0f);
                    long j4 = ijg.i;
                    zcl zclVar6 = qmk.g;
                    ugg0 ugg0Var3 = vgg0.f37379a;
                    mm40 mm40VarJ3 = s5x0.J(i120.Q(mm40VarS3, j4, new ugg0(zclVar6, zclVar6, zclVar6, zclVar6)), 4.0f);
                    i8 = i7 & 112;
                    int i14 = i7 >> 3;
                    mm40 mm40VarA2 = saj.a0(mm40VarJ3, jd6Var, function13, function14, fetVar, (i14 & 896) | i8 | (i14 & 7168));
                    zx7 zx7Var3 = gqw0.f11754a;
                    tj30 tj30VarC3 = zq8.c(zx7Var3, false);
                    int iHashCode7 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM7 = fetVar.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarA2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z2 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar9 = gqw0.x;
                    jpm0.o(fetVar, tj30VarC3, shdVar9);
                    shd shdVar10 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM7, shdVar10);
                    Integer numValueOf3 = Integer.valueOf(iHashCode7);
                    shd shdVar11 = gqw0.y;
                    jpm0.o(fetVar, numValueOf3, shdVar11);
                    jpm0.n(fetVar);
                    shd shdVar12 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC6, shdVar12);
                    n0q n0qVar3 = o7k0.c;
                    thg0 thg0VarA5 = shg0.a(uc9.e, gqw0.k, fetVar, 54);
                    int iHashCode8 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM8 = fetVar.m();
                    mm40 mm40VarC7 = kbc.c0(fetVar, n0qVar3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA5, shdVar9);
                    jpm0.o(fetVar, bh90VarM8, shdVar10);
                    vqd.u(iHashCode8, fetVar, shdVar11, fetVar);
                    jpm0.o(fetVar, mm40VarC7, shdVar12);
                    if (jd6Var instanceof id6) {
                        fetVar.e0(1661771574);
                        l(null, (id6) jd6Var, fetVar, i8);
                        i9 = 0;
                        fetVar.r(false);
                    } else {
                        i9 = 0;
                        if (jd6Var instanceof hd6) {
                            fetVar.e0(1661775206);
                            m((hd6) jd6Var, fetVar, 6 | i8);
                            fetVar.r(false);
                        } else if (jd6Var instanceof fd6) {
                            fetVar.e0(1661777449);
                            k((fd6) jd6Var, fetVar, 6 | i8);
                            fetVar.r(false);
                        } else if (jd6Var instanceof ed6) {
                            fetVar.e0(1661779877);
                            j(0, fetVar);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-24384894);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                    mm40 mm40VarQ3 = ffb0.Q(jr8.f16991a.b(jm40Var, zx7Var3), -4.0f, -10.0f);
                    thg0 thg0VarA6 = shg0.a(uc9.f35418a, gqw0.j, fetVar, i9);
                    int iHashCode9 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM9 = fetVar.m();
                    mm40 mm40VarC8 = kbc.c0(fetVar, mm40VarQ3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA6, shdVar9);
                    jpm0.o(fetVar, bh90VarM9, shdVar10);
                    vqd.u(iHashCode9, fetVar, shdVar11, fetVar);
                    jpm0.o(fetVar, mm40VarC8, shdVar12);
                    if (jd6Var.a()) {
                        fetVar.e0(1457521473);
                        s(0, fetVar, o7k0.n(jm40Var, 16.0f));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1457638715);
                        fetVar.r(false);
                    }
                    if (jd6Var.b()) {
                        fetVar.e0(1457694577);
                        U(0, fetVar, s5x0.J(i120.Q(o7k0.n(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), ijg.l, vgg0.f37379a), 2.0f));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1458103963);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    fetVar.r(true);
                    function5 = function13;
                    function6 = function14;
                    mm40Var2 = mm40Var5;
                }
                yfe0VarU.d = dd6Var;
            }
            fetVar.X();
            function5 = function3;
            function6 = function4;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                dd6Var = new dd6(mm40Var2, jd6Var, f2, function5, function6, i2, i3, (byte) 1);
                yfe0VarU.d = dd6Var;
            }
        }
        i4 |= 24576;
        function4 = function2;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            jm40Var = jm40.b;
            if (i10 != 0) {
                mm40Var2 = jm40Var;
            }
            if (i11 != 0) {
                function7 = null;
            } else {
                function7 = function3;
            }
            i7 = i4;
            if (i5 != 0) {
                function8 = null;
            } else {
                function8 = function4;
            }
            if (jd6Var instanceof gd6) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    return;
                } else {
                    dd6Var = new dd6(mm40Var2, jd6Var, f2, function7, function8, i2, i3, (byte) 0);
                }
            } else {
                mm40 mm40Var6 = mm40Var2;
                Function1 function15 = function7;
                Function1 function16 = function8;
                mm40 mm40VarE4 = o7k0.e(mm40Var6, f2);
                zcl zclVar7 = qmk.f28987a;
                mm40 mm40VarS4 = o7k0.s(mm40VarE4, 120.0f);
                long j5 = ijg.i;
                zcl zclVar8 = qmk.g;
                ugg0 ugg0Var4 = vgg0.f37379a;
                mm40 mm40VarJ4 = s5x0.J(i120.Q(mm40VarS4, j5, new ugg0(zclVar8, zclVar8, zclVar8, zclVar8)), 4.0f);
                i8 = i7 & 112;
                int i15 = i7 >> 3;
                mm40 mm40VarA3 = saj.a0(mm40VarJ4, jd6Var, function15, function16, fetVar, (i15 & 896) | i8 | (i15 & 7168));
                zx7 zx7Var4 = gqw0.f11754a;
                tj30 tj30VarC4 = zq8.c(zx7Var4, false);
                int iHashCode10 = Long.hashCode(fetVar.T);
                bh90 bh90VarM10 = fetVar.m();
                mm40 mm40VarC9 = kbc.c0(fetVar, mm40VarA3);
                mkd.c0.getClass();
                fetVar.i0();
                z2 = fetVar.S;
                pcyVar = e7z.u1;
                if (z2) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar13 = gqw0.x;
                jpm0.o(fetVar, tj30VarC4, shdVar13);
                shd shdVar14 = gqw0.w;
                jpm0.o(fetVar, bh90VarM10, shdVar14);
                Integer numValueOf4 = Integer.valueOf(iHashCode10);
                shd shdVar15 = gqw0.y;
                jpm0.o(fetVar, numValueOf4, shdVar15);
                jpm0.n(fetVar);
                shd shdVar16 = gqw0.v;
                jpm0.o(fetVar, mm40VarC9, shdVar16);
                n0q n0qVar4 = o7k0.c;
                thg0 thg0VarA7 = shg0.a(uc9.e, gqw0.k, fetVar, 54);
                int iHashCode11 = Long.hashCode(fetVar.T);
                bh90 bh90VarM11 = fetVar.m();
                mm40 mm40VarC10 = kbc.c0(fetVar, n0qVar4);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA7, shdVar13);
                jpm0.o(fetVar, bh90VarM11, shdVar14);
                vqd.u(iHashCode11, fetVar, shdVar15, fetVar);
                jpm0.o(fetVar, mm40VarC10, shdVar16);
                if (jd6Var instanceof id6) {
                    fetVar.e0(1661771574);
                    l(null, (id6) jd6Var, fetVar, i8);
                    i9 = 0;
                    fetVar.r(false);
                } else {
                    i9 = 0;
                    if (jd6Var instanceof hd6) {
                        fetVar.e0(1661775206);
                        m((hd6) jd6Var, fetVar, 6 | i8);
                        fetVar.r(false);
                    } else if (jd6Var instanceof fd6) {
                        fetVar.e0(1661777449);
                        k((fd6) jd6Var, fetVar, 6 | i8);
                        fetVar.r(false);
                    } else if (jd6Var instanceof ed6) {
                        fetVar.e0(1661779877);
                        j(0, fetVar);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-24384894);
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
                mm40 mm40VarQ4 = ffb0.Q(jr8.f16991a.b(jm40Var, zx7Var4), -4.0f, -10.0f);
                thg0 thg0VarA8 = shg0.a(uc9.f35418a, gqw0.j, fetVar, i9);
                int iHashCode12 = Long.hashCode(fetVar.T);
                bh90 bh90VarM12 = fetVar.m();
                mm40 mm40VarC11 = kbc.c0(fetVar, mm40VarQ4);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA8, shdVar13);
                jpm0.o(fetVar, bh90VarM12, shdVar14);
                vqd.u(iHashCode12, fetVar, shdVar15, fetVar);
                jpm0.o(fetVar, mm40VarC11, shdVar16);
                if (jd6Var.a()) {
                    fetVar.e0(1457521473);
                    s(0, fetVar, o7k0.n(jm40Var, 16.0f));
                    fetVar.r(false);
                } else {
                    fetVar.e0(1457638715);
                    fetVar.r(false);
                }
                if (jd6Var.b()) {
                    fetVar.e0(1457694577);
                    U(0, fetVar, s5x0.J(i120.Q(o7k0.n(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), ijg.l, vgg0.f37379a), 2.0f));
                    fetVar.r(false);
                } else {
                    fetVar.e0(1458103963);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(true);
                function5 = function15;
                function6 = function16;
                mm40Var2 = mm40Var6;
            }
            yfe0VarU.d = dd6Var;
        }
        fetVar.X();
        function5 = function3;
        function6 = function4;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            dd6Var = new dd6(mm40Var2, jd6Var, f2, function5, function6, i2, i3, (byte) 1);
            yfe0VarU.d = dd6Var;
        }
    }

    public static final String i0(String str) {
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(ujn.h);
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
        return sb.toString();
    }

    public static final void j(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-854199744);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(o7k0.d(jm40Var, 1.0f), 1.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarC, jM125getWhite100d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_lock, 0, fetVar), null, o7k0.n(jm40Var, 16.0f), staticColors.m130getWhite600d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gh5(i2, (byte) 11);
        }
    }

    public static final mm40 j0(mm40 mm40Var, q33 q33Var) {
        return mm40Var.e(new ubk(q33Var));
    }

    public static final void k(fd6 fd6Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1663085899);
        int i4 = i2 & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i4 == 0) {
            i3 = i2 | (fetVar2.g(zhg0Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(fd6Var) : fetVar2.i(fd6Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            String str = fd6Var.c;
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            jm40 jm40Var = jm40.b;
            v8q0.a(str, o7k0.s(s5x0.N(o7k0.w(zhg0Var.a(1.0f, jm40Var, true), null, false, 3), 0.0f, 0.0f, 2.0f, 0.0f, 11), 54.0f), jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarN = s5x0.N(zhg0Var.a(1.0f, o7k0.c(o7k0.s(jm40Var, 54.0f), 1.0f), true), 2.0f, 0.0f, 0.0f, 0.0f, 14);
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, jM125getWhite100d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_lock, 0, fetVar2), null, o7k0.n(jm40Var, 16.0f), staticColors.m130getWhite600d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(fd6Var, i2, (byte) 3);
        }
    }

    public static final void l(mm40 mm40Var, id6 id6Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1787861622);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(id6Var) : fetVar.i(id6Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String str = id6Var.f14568a;
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            f2q0 f2q0Var = new f2q0(3);
            int i4 = (i3 << 3) & 112;
            mm40Var2 = jm40.b;
            v8q0.a(str, mm40Var2, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, i4, 24960, 109560);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) mm40Var2, (Object) id6Var, i2, (byte) 23);
        }
    }

    public static final void m(hd6 hd6Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        cd6 cd6Var = hd6Var.d;
        fetVar2.g0(-347787017);
        int i4 = i2 & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i4 == 0) {
            i3 = i2 | (fetVar2.g(zhg0Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(hd6Var) : fetVar2.i(hd6Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            long jO = obc.O(cd6Var.f4146a, fetVar2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new y3d(jM123getWhite0d7_KjU));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean zF = fetVar2.f(jO) | fetVar2.f(jM123getWhite0d7_KjU);
            Object objP2 = fetVar2.P();
            if (zF || objP2 == cl5Var) {
                tr trVar = new tr(jO, jM123getWhite0d7_KjU, pz40Var, (yje) null);
                fetVar2.o0(trVar);
                objP2 = trVar;
            }
            m0x0.t(fetVar2, cd6Var, (Function2) objP2);
            String str = hd6Var.c;
            y9q0 y9q0VarD = g1t0.d();
            long j2 = ((y3d) pz40Var.getValue()).f41946a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(zhg0Var.a(1.0f, jm40Var, true), null, false, 3);
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, s5x0.N(o7k0.s(mm40VarW, 54.0f), 0.0f, 0.0f, 2.0f, 0.0f, 11), j2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, 0, 24960, 109560);
            mm40 mm40VarN = s5x0.N(zhg0Var.a(1.0f, o7k0.c(o7k0.s(jm40Var, 54.0f), 1.0f), true), 2.0f, 0.0f, 0.0f, 0.0f, 14);
            long j3 = ijg.A0;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, j3, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            v8q0.a(rsm0.w(R.string.bet_caps, 0, fetVar), null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(hd6Var, i2, (byte) 2);
        }
    }

    public static final void n(mm40 mm40Var, mtl mtlVar, lh80 lh80Var, Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        bkb.f(o7k0.d(mm40Var, 1.0f), mtlVar, null, false, lh80Var, function1, fetVar, 3072, 4);
    }

    public static final void o(int i2, fet fetVar, mm40 mm40Var, List list, Function1 function1) {
        int i3;
        yfe0 yfe0VarU;
        nt8 nt8Var;
        list.getClass();
        function1.getClass();
        fetVar.g0(277153168);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (list.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    nt8Var = new nt8(mm40Var, list, function1, i2, (byte) 1);
                }
            } else {
                x5d x5dVarA = w5d.a(uc9.d, gqw0.m, fetVar, 6);
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
                Iterator itV = kng0.v(fetVar, mm40VarC0, gqw0.v, 1462792074, list);
                int i4 = 0;
                while (itV.hasNext()) {
                    Object next = itV.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    hdv0 hdv0Var = (hdv0) next;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = jm40.b;
                    if (i4 != 0) {
                        mm40VarN = s5x0.N(mm40VarN, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    }
                    pvm0.l(mm40VarN, hdv0Var, function1, fetVar, (i3 << 3) & 7168);
                    i4 = i5;
                }
                fetVar.r(false);
                fetVar.r(true);
            }
            yfe0VarU.d = nt8Var;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            nt8Var = new nt8(mm40Var, list, function1, i2, (byte) 2);
            yfe0VarU.d = nt8Var;
        }
    }

    public static final void p(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-30011986);
        byte b2 = 4;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 16.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            fetVar.e0(571584229);
            for (int i4 = 0; i4 < 8; i4++) {
                mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40VarD2, 48.0f), vgg0.a(16.0f)), fqj0VarD0));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i2, b2);
        }
    }

    public static final void q(ewh ewhVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2078958693);
        int i3 = i2 | (fetVar2.g(ewhVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            int i4 = (int) ewhVar.e;
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new e8g(ewhVar, (byte) 20);
                fetVar2.o0(objP2);
            }
            kwj kwjVarB = zk80.b(i4, (Function0) objP2, fetVar2, 0, 2);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 16.0f, 16.0f, 0.0f, 0.0f, 12);
            String strW = rsm0.w(R.string.results, 0, fetVar2);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(strW, mm40VarN, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.f15753a, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 8.0f, 6);
            vxl vxlVar = vxl.b;
            fyl fylVar = new fyl(ewhVar.c, null, null, s5x0.u(8.0f, 0.0f, 8.0f, 0.0f, 10), null, 22);
            boolean zI = fetVar2.i(vneVar) | ((i3 & 112) == 32) | fetVar2.g(kwjVarB);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                function2 = function1;
                objP3 = new bwh(function2, vneVar, kwjVarB, (byte) 0);
                fetVar2.o0(objP3);
            } else {
                function2 = function1;
            }
            ebc.r(mm40VarN2, fylVar, vxlVar, (Function1) objP3, null, fetVar2, 384, 40);
            H(ewhVar, kwjVarB, fetVar2, i5);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(ewhVar, function2, i2, (byte) 16);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1246188145);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarS = o050.S(o7k0.c);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 56.0f, 7);
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwy(function1, (byte) 14);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 6);
        }
    }

    public static final void s(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(694521588);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new h26((byte) 8);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, (i3 & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 20);
        }
    }

    public static final void t(mm40 mm40Var, xo5 xo5Var, int i2, xdr xdrVar, Function1 function1, fet fetVar, int i3) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1482138334);
        int i4 = i3 | 6 | (fetVar2.i(xo5Var) ? 32 : 16) | (fetVar2.e(i2) ? 256 : 128) | (fetVar2.i(xdrVar) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i4 & 1, (i4 & 9363) != 9362)) {
            float f2 = xfn.a(fetVar2).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f2, 0.0f, 2), 1.0f);
            long jM139getBackgroundContent0d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarD, jM139getBackgroundContent0d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL2);
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
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), false);
            String str = xo5Var.b;
            ArrayList<fr5> arrayList = xo5Var.d;
            nkb.h(mm40VarH, new hjm(str, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar, 384, 56);
            int size = arrayList.size();
            byte b2 = 10;
            cl5 cl5Var = ukd.f35823a;
            if (size >= 4) {
                fetVar.e0(-1010032626);
                mm40 mm40VarA = o7k0.A(jm40Var, null, 3);
                wul wulVar = new wul(nul.e, oe9.d, new ue9(xo5Var.c), true, false, false);
                boolean z2 = ((i4 & 112) == 32 || fetVar.i(xo5Var)) | ((57344 & i4) == 16384);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new a540(b2, xo5Var, function1);
                    fetVar.o0(objP);
                }
                qzb.n(mm40VarA, wulVar, (Function0) objP, fetVar, 6, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1009467558);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            for (fr5 fr5Var : arrayList) {
                er5 er5Var = fr5Var.f;
                er5 er5VarA = er5Var != null ? er5.a(er5Var, new gro0(foo0.f9892a, d4d.BACKGROUND_CONTENT)) : null;
                int i5 = fr5Var.f10004a;
                o0x o0xVar = fr5Var.b;
                o0x o0xVar2 = fr5Var.c;
                String str2 = fr5Var.d;
                String str3 = fr5Var.e;
                o0x o0xVar3 = fr5Var.g;
                o0xVar.getClass();
                o0xVar2.getClass();
                str2.getClass();
                arrayList2.add(new fr5(i5, o0xVar, o0xVar2, str2, str3, er5VarA, o0xVar3));
            }
            a4x a4xVarO0 = dyb.o0(arrayList2);
            jq5 jq5Var = new jq5(cp5.f4728a);
            Integer numValueOf2 = Integer.valueOf(i2);
            boolean z3 = ((i4 & 7168) == 2048) | ((i4 & 112) == 32 || fetVar.i(xo5Var));
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new ba30(xdrVar, xo5Var, (byte) 29);
                fetVar.o0(objP2);
            }
            int i6 = ((i4 << 15) & 29360128) | 3078;
            mm40Var2 = jm40Var;
            etl.e(mm40VarD2, a4xVarO0, jq5Var, false, null, 0.0f, 0, numValueOf2, (Function2) objP2, fetVar, i6, 112);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho(mm40Var2, xo5Var, i2, xdrVar, function1, i3, (byte) 19);
        }
    }

    public static final void u(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-629078641);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            float f2 = xfn.a(fetVar).c;
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(mm40Var2, f2, 0.0f, 2), 1.0f);
            long jM139getBackgroundContent0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarD, jM139getBackgroundContent0d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 1);
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
            nkb.h(s5x0.L(mm40Var2, xfn.a(fetVar).e, 0.0f, 2), new ijm(), kjm.f18392a, null, null, null, fetVar, 384, 56);
            mm40 mm40VarD2 = o7k0.d(mm40Var2, 1.0f);
            lak0 lak0Var = lak0.c;
            jq5 jq5Var = new jq5(cp5.f4728a);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new rj50((byte) 5);
                fetVar.o0(objP);
            }
            etl.e(mm40VarD2, lak0Var, jq5Var, true, null, 0.0f, 0, null, (Function2) objP, fetVar, 100666422, 240);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var2, i2, (byte) 3);
        }
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        byte b2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1825022125);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String strW = rsm0.w(R.string.player_info_statistic, 0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                pz40 pz40Var = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                imm immVar = new imm(new ilm(staticColors.m123getWhite0d7_KjU()), new plm(strW, staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarR = knm0.r(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            int i4 = i3 & 14;
            y(l7m0Var, fetVar, i4);
            mm40 mm40VarE = o050.W(jm40.b).e(n0qVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
            int i5 = i3 & 112;
            boolean z2 = i5 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ouh(function1, (byte) 4);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 48, 0, 4085);
            z(l7m0Var, fetVar, i4);
            pz40 pz40Var2 = s6t0.f31722a;
            long jM139getBackgroundContent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.l;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(n0qVar, jM139getBackgroundContent0d7_KjU, new ugg0(zclVar, zclVar, zclVar2, zclVar2));
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
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
            hwh hwhVar = (hwh) l7m0Var.getValue();
            if (hwhVar != null) {
                if (hwhVar instanceof ewh) {
                    fetVar.e0(-1781966700);
                    function2 = function1;
                    q((ewh) hwhVar, function2, fetVar, i5);
                    fetVar.r(false);
                } else {
                    function2 = function1;
                    if (hwhVar instanceof fwh) {
                        fetVar.e0(-1781960955);
                        x(((fwh) hwhVar).c, function2, fetVar, i5);
                        fetVar.r(false);
                    } else if (hwhVar instanceof gwh) {
                        fetVar.e0(-1781954737);
                        B(0, fetVar);
                        fetVar.r(false);
                    }
                }
                b2 = 1;
                ohs0.x(fetVar, true, true, true);
            }
            throw b1j.f(-1781969506, fetVar, false);
        }
        function2 = function1;
        b2 = 1;
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function2, i2, b2);
        }
    }

    public static final void w(mm40 mm40Var, xtl xtlVar, String str, String str2, String str3, String str4, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        xtlVar.getClass();
        if ((i2 & 4) != 0) {
            str = "";
        }
        String str5 = (i2 & 8) != 0 ? "" : str2;
        String str6 = (i2 & 16) != 0 ? "" : str3;
        String str7 = (i2 & 32) == 0 ? str4 : "";
        int i3 = i2 & 64;
        cl5 cl5Var = ukd.f35823a;
        if (i3 != 0) {
            Object objP = fetVar.P();
            if (objP == cl5Var) {
                objP = new xjl((byte) 5);
                fetVar.o0(objP);
            }
            function2 = (Function1) objP;
        } else {
            function2 = function1;
        }
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = new xjl((byte) 6);
            fetVar.o0(objP2);
        }
        Function1 function3 = (Function1) objP2;
        Object objP3 = fetVar.P();
        if (objP3 == cl5Var) {
            objP3 = new xjl((byte) 7);
            fetVar.o0(objP3);
        }
        Function1 function4 = (Function1) objP3;
        Object objP4 = fetVar.P();
        if (objP4 == cl5Var) {
            objP4 = new xjl((byte) 8);
            fetVar.o0(objP4);
        }
        Function1 function5 = (Function1) objP4;
        if (xtlVar instanceof vtl) {
            fetVar.e0(-370201478);
            unh0.m(mm40Var, str, str5, ((vtl) xtlVar).f38012a, function3, function4, fetVar, 0);
            fetVar.r(false);
        } else if (xtlVar instanceof utl) {
            fetVar.e0(-370190575);
            unh0.l(mm40Var.e(o7k0.c), ((utl) xtlVar).f36260a, str6, str7, function5, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!(xtlVar instanceof wtl)) {
                throw b1j.f(-370203551, fetVar, false);
            }
            fetVar.e0(-370181051);
            unh0.k(mm40Var, ((wtl) xtlVar).f39746a, function2, fetVar, 0);
            fetVar.r(false);
        }
    }

    public static final void x(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-100161070);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 3;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ouh(function1, (byte) 5);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, b2);
        }
    }

    public static final void y(l7m0 l7m0Var, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-732571780);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            WeakHashMap weakHashMap = djv0.w;
            fetVar2 = fetVar;
            p8a.e(o7k0.d(o7k0.e(jm40.b, i120.O(zcm0.i(fetVar).f, fetVar).d() + 256.0f), 1.0f), ((hwh) l7m0Var.getValue()).b().f45056a, new gfm0(a8k0.F(R.drawable.default_background, 0, fetVar), null), new gfm0(a8k0.F(R.drawable.default_background, 0, fetVar), null), gqw0.A, fetVar2, 196992, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cw0(l7m0Var, i2, (byte) 6);
        }
    }

    public static final void z(l7m0 l7m0Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1848322790);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.g(s5x0.J(jm40Var, 8.0f), 46.0f, 0.0f, 2), 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            long jM40getDarkBlueBackground650d7_KjU = CustomColors.INSTANCE.m40getDarkBlueBackground650d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, jM40getDarkBlueBackground650d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            if (((hwh) l7m0Var.getValue()).a()) {
                fetVar2.e0(2016111483);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
                mm40 mm40VarN = o7k0.n(s5x0.K(jm40Var, 16.0f, 12.0f), 76.0f);
                ugg0 ugg0Var2 = vgg0.f37379a;
                mm40 mm40VarJ = lgb.J(mm40VarN, ugg0Var2);
                StaticColors staticColors = StaticColors.INSTANCE;
                long jM127getWhite300d7_KjU = staticColors.m127getWhite300d7_KjU();
                ljc ljcVar = jd8.n;
                k7x.b(((hwh) l7m0Var.getValue()).b().b, null, i120.Q(mm40VarJ, jM127getWhite300d7_KjU, ljcVar), a8k0.F(R.drawable.ic_statistic_profile, 0, fetVar2), a8k0.F(R.drawable.ic_statistic_profile, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, 36912, 0, 32736);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN2);
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
                v8q0.a(((hwh) l7m0Var.getValue()).b().d, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.j(), fetVar, 0, 24960, 110586);
                v8q0.a(((hwh) l7m0Var.getValue()).b().e, null, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(true);
                k7x.b(((hwh) l7m0Var.getValue()).b().c, null, s5x0.J(i120.Q(lgb.J(o7k0.n(s5x0.N(jm40Var, 58.0f, 58.0f, 0.0f, 0.0f, 12), 40.0f), ugg0Var2), staticColors.m75getBlack600d7_KjU(), ljcVar), 4.0f), a8k0.F(R.drawable.ic_no_country, 0, fetVar2), a8k0.F(R.drawable.ic_no_country, 0, fetVar2), null, null, null, null, null, null, null, fetVar2, 36912, 0, 32736);
                fetVar2.r(false);
            } else {
                fetVar2.e0(2018332354);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cw0(l7m0Var, i2, (byte) 5);
        }
    }
}
