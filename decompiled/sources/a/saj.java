package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.javax.sip.message.Response;
import android.view.ViewGroup;
import android.view.Window;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.math.BigDecimal;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class saj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f31890a = new ugd(980258181, false, new zgd(1));
    public static final ugd b = new ugd(-2062134958, false, new bhd(20));
    public static final ugd c = new ugd(-1864876613, false, new bhd(21));
    public static final ugd d = new ugd(-776035179, false, new ihd(15));
    public static final ugd e;
    public static final String[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final Object m;
    public static final Object n;
    public static final Object o;
    public static final Object p;
    public static final Object q;
    public static final String[] r;

    static {
        new ugd(-1728799069, false, new chd((byte) 27));
        e = new ugd(564780813, false, new ohd((byte) 8));
        f = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        g = new int[]{44100, 48000, 32000};
        h = new int[]{32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
        i = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
        j = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
        k = new int[]{32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
        l = new int[]{JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
        m = new Object();
        n = new Object();
        o = new Object();
        p = new Object();
        q = new Object();
        r = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    }

    public static final void A(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(1806331204);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fetVar.b0(717501003, Integer.valueOf(mdmVar.f21603a));
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarH = o7k0.h(mm40VarD, 220.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarH);
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
            jcb.l(null, mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 13);
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, b2);
        }
    }

    public static final void B(int i2, fet fetVar) {
        int i3;
        fetVar.g0(1510703241);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            L(knx.f18606a, fetVar, (i3 & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i2, (byte) 3);
        }
    }

    public static final void C(int i2, fet fetVar) {
        int i3;
        fetVar.g0(-884921955);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            L(knx.b, fetVar, (i3 & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i2, (byte) 5);
        }
    }

    public static final ucs0 D() {
        return new ucs0(new Paint(7));
    }

    public static final void E(ir8 ir8Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(874154082);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ir8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i3 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            z5a0 z5a0Var = (z5a0) l7m0Var2.getValue();
            if (z5a0Var != null) {
                if (z5a0Var instanceof y5a0) {
                    fetVar.e0(-1751510736);
                    z(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = z5a0Var instanceof x5a0;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(1537800159);
                        v(ir8Var.b(jm40Var, gqw0.e), ((x5a0) z5a0Var).d, function1, fetVar, i3 & 896);
                        fetVar.r(false);
                    } else if (z5a0Var instanceof w5a0) {
                        fetVar.e0(1538085762);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        boolean zG = fetVar.g(z5a0Var) | ((i3 & 896) == 256);
                        Object objP = fetVar.P();
                        if (zG || objP == ukd.f35823a) {
                            objP = new ka70(z5a0Var, function1, (byte) 24);
                            fetVar.o0(objP);
                        }
                        b8k0.e(mm40VarD, null, null, null, null, null, false, null, (Function1) objP, fetVar, 6, 510);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(-1751510833, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuh(ir8Var, l7m0Var, function1, i2, (byte) 3);
        }
    }

    public static final void F(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1532581680);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String strA = ((z5a0) l7m0Var.getValue()).a();
            u5a0 u5a0VarC = ((z5a0) l7m0Var.getValue()).c();
            j9m0 j9m0VarB = ((z5a0) l7m0Var.getValue()).b();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i0a0(function1, (byte) 5);
                fetVar.o0(objP);
            }
            rq8.h(null, strA, u5a0VarC, j9m0VarB, (Function0) objP, u1c.M(1617733719, new dqz(l7m0Var, function1, (byte) 7), fetVar), fetVar, 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 9);
        }
    }

    public static final void G(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1073997949);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            m8x.y(n0qVar, u1c.M(973745473, new t5e0(l7m0Var, function1, (byte) 15), fetVar), null, null, null, 0, background, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(1974411276, new dqz(l7m0Var, function1, (byte) 12), fetVar), fetVar, 805306422, 188);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i2, (byte) 16);
        }
    }

    public static final void H(mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i2) {
        xcz xczVar2;
        l7m0 l7m0Var3;
        l7m0 l7m0Var4;
        mm40 mm40Var2;
        fetVar.g0(-1402700478);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            xczVar2 = xczVar;
            i3 |= fetVar.g(xczVar2) ? 32 : 16;
        } else {
            xczVar2 = xczVar;
        }
        if ((i2 & 384) == 0) {
            l7m0Var3 = l7m0Var;
            i3 |= fetVar.g(l7m0Var3) ? 256 : 128;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i2 & 3072) == 0) {
            l7m0Var4 = l7m0Var2;
            i3 |= fetVar.g(l7m0Var4) ? 2048 : 1024;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar2, l7m0Var3, new qw3(8.0f, true, new jf4((byte) 14)), knm0.g(s5x0.u(xfn.a(fetVar).c, 0.0f, xfn.a(fetVar).c, 28.0f, 2), fetVar), z, null, u1c.M(-1253106620, new gn(function1, (byte) 15), fetVar), fetVar, (i3 & 112) | 100663296 | (i3 & 896), 136);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bgg(mm40Var2, xczVar, l7m0Var, l7m0Var4, function1, i2, (byte) 0);
        }
    }

    public static final void I(mm40 mm40Var, wlp wlpVar, fet fetVar, int i2) {
        fetVar.g0(1871849504);
        int i3 = i2 | 6 | (fetVar.g(wlpVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = wlpVar.b.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-743910802);
                C(6, fetVar);
                fetVar.r(false);
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                fetVar.e0(-743914702);
                B(6, fetVar);
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(-743907030);
                y(wlpVar, fetVar, i3 & 126);
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(-743919740, fetVar, false);
                }
                fetVar.e0(-743901487);
                P(6, fetVar);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, wlpVar, i2, (byte) 14);
        }
    }

    public static final void J(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1139112375);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 48.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i2, (byte) 13);
        }
    }

    public static final void K(mm40 mm40Var, zeb zebVar, fet fetVar, int i2) {
        fetVar.g0(-1839689226);
        int i3 = i2 | 6 | (fetVar.g(zebVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(f2, 12.0f, f3, 32.0f);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new vwy(zebVar, b2);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            b8k0.e(jm40Var, null, lh80Var, null, null, null, false, null, (Function1) objP, fetVar, 12582918, 378);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywy(mm40Var, zebVar, i2, b2);
        }
    }

    public static final void L(ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1028590074);
        int i4 = i2 & 6;
        byte b2 = 4;
        mm40 mm40VarV = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(mm40VarV) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b3 = 0;
        byte b4 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            rah0 rah0VarT = wha0.T(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(rah0VarT);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new pdb(rah0VarT, b3);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            e2d e2dVar = (e2d) fetVar.k(nip.f23600a);
            if (e2dVar != null) {
                fetVar.e0(1865149246);
                boolean zG2 = fetVar.g(l7m0VarY);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new eka(l7m0VarY, b2);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(1865307780);
                fetVar.r(false);
            }
            mm40 mm40VarQ = i120.Q(wha0.a0(mm40VarV.e(o7k0.c), rah0VarT, false, 14), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarQ, f2, 0.0f, f3, 20.0f, 2);
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
            vqd.t((i3 & 112) | 6, ugdVar, y5d.f42040a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b0(ugdVar, i2, b4);
        }
    }

    public static final void M(mm40 mm40Var, ly0 ly0Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1562374720);
        int i3 = i2 | 6 | (fetVar2.g(ly0Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var2);
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
            nkb.h(s5x0.N(mm40Var2, xfn.a(fetVar2).e, 0.0f, xfn.a(fetVar2).e, 0.0f, 10), new ijm(), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            ckb.f(o7k0.d(mm40Var2, 1.0f), ly0Var.f20841a, null, s5x0.u(xfn.a(fetVar).c, 0.0f, xfn.a(fetVar).c, 0.0f, 10), null, null, null, null, fetVar, 6, 244);
            fetVar2 = fetVar;
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar2, o7k0.n(mm40Var2, 12.0f));
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(mm40Var2, ly0Var, i2, (byte) 25);
        }
    }

    public static final void N(mm40 mm40Var, float f2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1417451577);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ejk0((byte) 26);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805306368, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f2, i2, (byte) 6);
        }
    }

    public static final void O(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(646104316);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 84.0f), 72.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarC0 = xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
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
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i2, (byte) 16);
        }
    }

    public static final void P(int i2, fet fetVar) {
        int i3;
        fetVar.g0(358140755);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            L(knx.c, fetVar, (i3 & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i2, b2);
        }
    }

    public static final void Q(mm40 mm40Var, msm msmVar, float f2, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i2, int i3) {
        msmVar.getClass();
        if ((i3 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        if ((i3 & 16) != 0) {
            function0 = null;
        }
        if ((i3 & 32) != 0) {
            function2 = null;
        }
        if (!(msmVar instanceof ksm)) {
            mm40 mm40Var2 = mm40Var;
            if (!(msmVar instanceof lsm)) {
                throw b1j.f(1611130518, fetVar, false);
            }
            fetVar.e0(-1594094632);
            N(mm40Var2, f2, fetVar, (i2 & 14) | ((i2 >> 3) & 112));
            fetVar.r(false);
            return;
        }
        fetVar.e0(-1594498097);
        Function0 function3 = function2;
        mm40 mm40Var3 = mm40Var;
        q(mm40Var3, (ksm) msmVar, f2, function1, function0, function3, xdrVar, fetVar, 4194302 & i2);
        fetVar.r(false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:32:0x0105  */
    /* JADX WARN: Code duplicated, block: B:35:0x0130  */
    /* JADX WARN: Code duplicated, block: B:36:0x0132  */
    /* JADX WARN: Code duplicated, block: B:39:0x0137  */
    /* JADX WARN: Code duplicated, block: B:40:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x0145  */
    /* JADX WARN: Code duplicated, block: B:47:0x0151  */
    /* JADX WARN: Code duplicated, block: B:48:0x0153  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:55:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x0178  */
    /* JADX WARN: Code duplicated, block: B:66:0x0182  */
    public static final void R(mm40 mm40Var, fql0 fql0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarN;
        mm40 mm40Var3;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        Object objP;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objP2;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objP3;
        fetVar.g0(1710535328);
        int i5 = i2 | 6 | (fetVar.g(fql0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            int iOrdinal = fql0Var.g.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0 || iOrdinal == 2) {
                fetVar.e0(-1228777470);
                fetVar.r(false);
                zcl zclVar = qmk.f28987a;
                mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    fetVar.e0(-1228126718);
                    fetVar.r(false);
                    mm40Var3 = jm40Var;
                } else {
                    fetVar.e0(-1228663607);
                    zcl zclVar2 = qmk.f28987a;
                    mm40VarN = s5x0.N(i120.Q(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(0.0f, 0.0f, 12.0f, 12.0f, 3)), 20.0f, 0.0f, 0.0f, 0.0f, 14);
                    fetVar.r(false);
                }
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                b8l0 b8l0Var = fql0Var.d;
                d4d d4dVar = fql0Var.e;
                n3l0 n3l0Var = fql0Var.f;
                boolean z10 = fql0Var.h;
                i3 = i5 & 112;
                if (i3 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                i4 = i5 & 896;
                if (i4 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z | z2;
                objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z3 || objP == cl5Var) {
                    objP = new qwy(fql0Var, function1, b2);
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                if (i3 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i4 == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objP2 = fetVar.P();
                if (z6 || objP2 == cl5Var) {
                    objP2 = new qwy(fql0Var, function1, b3);
                    fetVar.o0(objP2);
                }
                Function0 function2 = (Function0) objP2;
                if (i3 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i4 == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | z7;
                objP3 = fetVar.P();
                if (z9 || objP3 == cl5Var) {
                    objP3 = new rwy(fql0Var, function1, (byte) 0);
                    fetVar.o0(objP3);
                }
                xbc.o(null, b8l0Var, n3l0Var, d4dVar, z10, function0, function2, null, (Function1) objP3, fetVar, 0, 129);
                fetVar.r(true);
                mm40Var2 = jm40Var;
            } else {
                fetVar.e0(-1228292568);
                mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar3 = qmk.f28987a;
                mm40VarN = s5x0.N(mm40VarQ, 20.0f, 0.0f, 0.0f, 0.0f, 14);
                fetVar.r(false);
            }
            mm40Var3 = mm40VarN;
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var3);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            b8l0 b8l0Var2 = fql0Var.d;
            d4d d4dVar2 = fql0Var.e;
            n3l0 n3l0Var2 = fql0Var.f;
            boolean z11 = fql0Var.h;
            i3 = i5 & 112;
            if (i3 == 32) {
                z = true;
            } else {
                z = false;
            }
            i4 = i5 & 896;
            if (i4 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z | z2;
            objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z3) {
                objP = new qwy(fql0Var, function1, b2);
                fetVar.o0(objP);
            } else {
                objP = new qwy(fql0Var, function1, b2);
                fetVar.o0(objP);
            }
            Function0 function3 = (Function0) objP;
            if (i3 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i4 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z4 | z5;
            objP2 = fetVar.P();
            if (z6) {
                objP2 = new qwy(fql0Var, function1, b3);
                fetVar.o0(objP2);
            } else {
                objP2 = new qwy(fql0Var, function1, b3);
                fetVar.o0(objP2);
            }
            Function0 function4 = (Function0) objP2;
            if (i3 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i4 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z8 | z7;
            objP3 = fetVar.P();
            if (z9) {
                objP3 = new rwy(fql0Var, function1, (byte) 0);
                fetVar.o0(objP3);
            } else {
                objP3 = new rwy(fql0Var, function1, (byte) 0);
                fetVar.o0(objP3);
            }
            xbc.o(null, b8l0Var2, n3l0Var2, d4dVar2, z11, function3, function4, null, (Function1) objP3, fetVar, 0, 129);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new swy(mm40Var2, fql0Var, function1, i2, (byte) 0);
        }
    }

    public static int S(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = g[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? h[i5 - 1] : i[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? j[i5 - 1] : k[i5 - 1];
        } else {
            i7 = l[i5 - 1];
        }
        if (i3 == 3) {
            return ua80.a(i7, 144, i8, i9);
        }
        return ua80.a(i4 == 1 ? 72 : 144, i7, i8, i9);
    }

    public static final String T(c2w c2wVar, ctf0 ctf0Var) {
        c2wVar.getClass();
        ctf0Var.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long j2 = c2wVar.l;
        return rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
    }

    public static final String U(c2w c2wVar, boolean z) {
        if (cy7.c() && z) {
            return "";
        }
        String str = c2wVar.q;
        return str.length() == 0 ? c2wVar.j : str;
    }

    public static final Paint V(ucs0 ucs0Var) {
        if (ucs0Var == null) {
            wcx.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + sre0.f32672a.b(ucs0Var.getClass()).v());
        }
        return (Paint) ucs0Var.c;
    }

    public static int X(mns0 mns0Var, int i2) {
        int[] iArr;
        if (mns0Var == null || (iArr = (int[]) mns0Var.f22105a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i2];
    }

    public static final boolean Y(Throwable th) {
        th.getClass();
        return hic.C(th) || (th instanceof ConnectException);
    }

    public static final String Z(String str, String str2) {
        if (kotlin.text.c.x(str2, "http", false)) {
            return str2;
        }
        if (!kotlin.text.c.x(str2, Separators.SLASH, false)) {
            str2 = Separators.SLASH.concat(str2);
        }
        return ohs0.n(str, str2);
    }

    public static final void a(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(1729884629);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            boolean zG = fetVar.g(xczVarA) | fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new bz0(xczVarA, pz40VarF, null, b2);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "LAZY_COLUMN_SEARCH");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7), fetVar);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new uy0(a4xVar, z, function1, b2);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarG, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vy0(mm40Var2, a4xVar, z, function1, i2, (byte) 0);
        }
    }

    public static final mm40 a0(mm40 mm40Var, final jd6 jd6Var, final Function1 function1, final Function1 function2, fet fetVar, int i2) {
        mm40Var.getClass();
        final byte b2 = 0;
        if (!(jd6Var instanceof hd6) || function1 == null || function2 == null) {
            fetVar.e0(685256438);
            fetVar.r(false);
            return mm40Var;
        }
        fetVar.e0(685012685);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = dw9.j(fetVar);
        }
        gy40 gy40Var = (gy40) objP;
        final byte b3 = 1;
        int i3 = (i2 & 112) ^ 48;
        boolean z = ((((i2 & 7168) ^ 3072) > 2048 && fetVar.g(function2)) || (i2 & 3072) == 2048) | ((i3 > 32 && fetVar.i(jd6Var)) || (i2 & 48) == 32);
        Object objP2 = fetVar.P();
        if (z || objP2 == cl5Var) {
            objP2 = new Function0() { // from class: a.zm6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b4 = b2;
                    jd6 jd6Var2 = jd6Var;
                    Function1 function3 = function2;
                    switch (b4) {
                        case 0:
                            function3.invoke(Long.valueOf(((hd6) jd6Var2).e));
                            break;
                        default:
                            function3.invoke(Long.valueOf(((hd6) jd6Var2).e));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(objP2);
        }
        Function0 function0 = (Function0) objP2;
        boolean z2 = ((((i2 & 896) ^ 384) > 256 && fetVar.g(function1)) || (i2 & 384) == 256) | ((i3 > 32 && fetVar.i(jd6Var)) || (i2 & 48) == 32);
        Object objP3 = fetVar.P();
        if (z2 || objP3 == cl5Var) {
            objP3 = new Function0() { // from class: a.zm6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b4 = b3;
                    jd6 jd6Var2 = jd6Var;
                    Function1 function3 = function1;
                    switch (b4) {
                        case 0:
                            function3.invoke(Long.valueOf(((hd6) jd6Var2).e));
                            break;
                        default:
                            function3.invoke(Long.valueOf(((hd6) jd6Var2).e));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(objP3);
        }
        mm40 mm40VarZ = y860.Z(mm40Var, gy40Var, false, function0, (Function0) objP3, 444);
        fetVar.r(false);
        return mm40VarZ;
    }

    public static final void b(mm40 mm40Var, lz0 lz0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        lz0Var.getClass();
        function1.getClass();
        fetVar.g0(1723574325);
        int i3 = i2 | 6 | (fetVar.g(lz0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            if (lz0Var instanceof kz0) {
                fetVar.e0(-873317476);
                a(((i3 << 3) & 7168) | 384, fetVar, ((kz0) lz0Var).f19130a, null, function1, true);
                fetVar.r(false);
            } else if (lz0Var instanceof iz0) {
                fetVar.e0(-873310531);
                a(((i3 << 3) & 7168) | 384, fetVar, ((iz0) lz0Var).f15612a, null, function1, false);
                fetVar.r(false);
            } else {
                if (!(lz0Var instanceof jz0)) {
                    throw b1j.f(-873319261, fetVar, false);
                }
                fetVar.e0(-873303678);
                u(null, ((jz0) lz0Var).f17384a, function1, fetVar, i3 & 896);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var2, lz0Var, function1, i2, (byte) 15);
        }
    }

    public static Object b0(Function2 function2) {
        return eeq.U(kotlin.coroutines.g.f46065a, function2);
    }

    public static final void c(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(-41177738);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(d9zVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(xczVar2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(xczVar3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            float fT = fbc.T(fetVar);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = phu0.H(i120.Q(jm40Var, background, ljcVar), null, 1);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = m8m0.f21378a;
            y0x0.e(mm40VarH, 228.0f + fT, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 16.0f, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 24.0f, u1c.M(2023895439, new qt1(fT, l7m0Var, function1, (byte) 3), fetVar), u1c.M(899553259, new rt1((byte) 3, d9zVar, xczVar, xczVar2, xczVar3, l7m0Var, function1), fetVar), fetVar, 905994240, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new st1(mm40Var2, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i2, (byte) 3);
        }
    }

    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [a.bzw, a.y3d] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34, types: [a.bzw, a.y3d] */
    /* JADX WARN: Type inference failed for: r15v35 */
    public static final tno0 c0(d140 d140Var, ctf0 ctf0Var, qho qhoVar, String str) {
        String str2;
        Iterable iterableA0;
        bzw bzwVar;
        nw30 nw30Var;
        gy30 gy30Var;
        gy30 gy30Var2;
        gy30 gy30Var3;
        gy30 gy30Var4;
        int i2;
        ?? r15;
        wx30 ux30Var;
        bzw bzwVar2;
        miz kizVar;
        int i3;
        ?? r16;
        wx30 ux30Var2;
        bzw bzwVar3;
        miz kizVar2;
        my30 ky30Var;
        ctf0Var.getClass();
        str.getClass();
        Map map = d140Var.q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        Iterator it = map.entrySet().iterator();
        while (true) {
            bzw bzwVar4 = null;
            if (!it.hasNext()) {
                String str3 = d140Var.u;
                List listL0 = CollectionsKt.L0(d140Var.r);
                Set<r040> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList();
                for (r040 r040Var : setKeySet) {
                    List list = (List) linkedHashMap.get(r040Var);
                    if (list != null) {
                        str2 = str3;
                        iterableA0 = xww.a0(list, listL0, r040Var, ctf0Var, qhoVar, str2, new tr20((byte) 25));
                    } else {
                        str2 = str3;
                        iterableA0 = null;
                    }
                    if (iterableA0 == null) {
                        iterableA0 = iun.f15405a;
                    }
                    w3d.u(arrayList, CollectionsKt.N(iterableA0));
                    str3 = str2;
                }
                return new tno0(dyb.o0(arrayList), d140Var.l);
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            r040 r040Var2 = (r040) entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                nw30 nw30VarK0 = yyw.k0((yx10) it2.next(), ctf0Var, qhoVar, d140Var.x, r040Var2, d140Var.w, d140Var.y, str);
                boolean z = (nw30VarK0 instanceof fw30) || (nw30VarK0 instanceof pv30);
                if (nw30VarK0 instanceof kw30) {
                    ky30Var = xww.V((kw30) nw30VarK0, z);
                    it = it;
                    it2 = it2;
                    bzwVar = bzwVar4;
                    key = key;
                } else {
                    iz30 iz30VarM = nw30VarK0.m();
                    r040 r040VarN = nw30VarK0.n();
                    int iF = hne.F(nw30VarK0);
                    ey30 ey30Var = ey30.f8608a;
                    liz lizVar = liz.f20129a;
                    switch (iF) {
                        case 0:
                            it = it;
                            it2 = it2;
                            bzwVar = bzwVar4;
                            key = key;
                            nw30Var = nw30VarK0;
                            gy30Var = ((pv30) nw30Var).b;
                            break;
                        case 1:
                            nw30Var = nw30VarK0;
                            ew30 ew30Var = (ew30) nw30Var;
                            ux30 ux30Var3 = new ux30(10, 0L, ew30Var.e, ew30Var.f);
                            int i4 = ew30Var.d;
                            bzwVar = null;
                            qx30 qx30Var = new qx30(new m0x(i4, null, 6), 0L, ew30Var.b ? new kiz(new rf5(3, null)) : lizVar, i4, 0.0f, 50);
                            pz40 pz40Var = s6t0.f31722a;
                            gy30Var2 = new gy30(ux30Var3, qx30Var, ey30Var, s6t0.a().getBackground(), null, null, 240);
                            gy30Var = gy30Var2;
                            break;
                        case 2:
                            it = it;
                            key = key;
                            nw30Var = nw30VarK0;
                            mw30 mw30Var = (mw30) nw30Var;
                            ux30 ux30Var4 = new ux30(10, 0L, mw30Var.e, mw30Var.f);
                            int i5 = mw30Var.d;
                            qx30 qx30Var2 = new qx30(new m0x(i5, null, 6), 0L, mw30Var.f22484a ? new kiz(new rf5(3, null)) : lizVar, i5, 0.0f, 50);
                            pz40 pz40Var2 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var4, qx30Var2, ey30Var, s6t0.a().getBackground(), null, null, 240);
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 3:
                            it = it;
                            key = key;
                            nw30Var = nw30VarK0;
                            fw30 fw30Var = (fw30) nw30Var;
                            ux30 ux30Var5 = new ux30(10, 0L, fw30Var.h, "");
                            pz40 pz40Var3 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var5, new rx30(new n0x(fw30Var.e), 0L, fw30Var.f10240a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.sport_new, 0L, new qc5(null, new n0x(fw30Var.f), y3d.a(s6t0.a().getBackground())), 434), new zx30(new n0x(fw30Var.i), 3), 0L, null, null, 248);
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 4:
                            it = it;
                            it2 = it2;
                            key = key;
                            nw30Var = nw30VarK0;
                            iw30 iw30Var = (iw30) nw30Var;
                            ux30 ux30Var6 = new ux30(10, 0L, iw30Var.e, iw30Var.f);
                            int i6 = iw30Var.d;
                            qx30 qx30Var3 = new qx30(new m0x(i6, null, 6), 0L, iw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i6, 0.0f, 50);
                            pz40 pz40Var4 = s6t0.f31722a;
                            long background = s6t0.a().getBackground();
                            rpe rpeVar = new rpe(iw30Var.g);
                            StaticColors staticColors = StaticColors.INSTANCE;
                            gy30Var = new gy30(ux30Var6, qx30Var3, new dy30(rpeVar, new kpe(staticColors.m113getRed0d7_KjU(), staticColors.m123getWhite0d7_KjU())), background, null, null, 240);
                            bzwVar = null;
                            break;
                        case 5:
                            it = it;
                            it2 = it2;
                            key = key;
                            nw30Var = nw30VarK0;
                            qv30 qv30Var = (qv30) nw30Var;
                            ux30 ux30Var7 = new ux30(10, 0L, qv30Var.e, qv30Var.f);
                            int i7 = qv30Var.d;
                            qx30 qx30Var4 = new qx30(new m0x(i7, null, 6), 0L, qv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i7, 0.0f, 50);
                            pz40 pz40Var5 = s6t0.f31722a;
                            gy30Var = new gy30(ux30Var7, qx30Var4, new zx30(new n0x(qv30Var.g), 3), s6t0.a().getBackground(), null, null, 240);
                            bzwVar = null;
                            break;
                        case 6:
                            it = it;
                            it2 = it2;
                            key = key;
                            nw30Var = nw30VarK0;
                            jw30 jw30Var = (jw30) nw30Var;
                            ux30 ux30Var8 = new ux30(10, 0L, jw30Var.e, jw30Var.f);
                            int i8 = jw30Var.d;
                            qx30 qx30Var5 = new qx30(new m0x(i8, null, 6), 0L, jw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i8, 0.0f, 50);
                            pz40 pz40Var6 = s6t0.f31722a;
                            gy30Var = new gy30(ux30Var8, qx30Var5, new zx30(new n0x(jw30Var.g), 3), s6t0.a().getBackground(), null, null, 240);
                            bzwVar = null;
                            break;
                        case 7:
                            it = it;
                            it2 = it2;
                            key = key;
                            nw30Var = nw30VarK0;
                            dw30 dw30Var = (dw30) nw30Var;
                            ux30 ux30Var9 = new ux30(10, 0L, dw30Var.e, dw30Var.f);
                            int i9 = dw30Var.d;
                            qx30 qx30Var6 = new qx30(new m0x(i9, null, 6), 0L, dw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i9, 0.0f, 50);
                            pz40 pz40Var7 = s6t0.f31722a;
                            gy30Var = new gy30(ux30Var9, qx30Var6, new zx30(new n0x(dw30Var.g), 3), s6t0.a().getBackground(), null, null, 240);
                            bzwVar = null;
                            break;
                        case 8:
                            nw30Var = nw30VarK0;
                            uv30 uv30Var = (uv30) nw30Var;
                            ux30 ux30Var10 = new ux30(10, 0L, uv30Var.e, uv30Var.f);
                            int i10 = uv30Var.d;
                            qx30 qx30Var7 = new qx30(new m0x(i10, null, 6), 0L, uv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i10, 0.0f, 50);
                            pz40 pz40Var8 = s6t0.f31722a;
                            gy30Var4 = new gy30(ux30Var10, qx30Var7, new zx30(new m0x(uv30Var.g, null, 6), 3), s6t0.a().getBackground(), null, null, 240);
                            gy30Var = gy30Var4;
                            bzwVar = null;
                            break;
                        case 9:
                            it = it;
                            key = key;
                            nw30Var = nw30VarK0;
                            ov30 ov30Var = (ov30) nw30Var;
                            ux30 ux30Var11 = new ux30(10, 0L, ov30Var.i, ov30Var.j);
                            pc5 pc5Var = new pc5(new y3d(ov30Var.f));
                            rx30 rx30Var = new rx30(new n0x(ov30Var.d), ov30Var.e, ov30Var.f25907a ? new kiz(new rf5(3, null)) : lizVar, ov30Var.g, ov30Var.h, pc5Var, Response.UNSUPPORTED_URI_SCHEME);
                            pz40 pz40Var9 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var11, rx30Var, ey30Var, s6t0.a().getBackground(), null, null, 240);
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 10:
                            nw30Var = nw30VarK0;
                            rv30 rv30Var = (rv30) nw30Var;
                            List list3 = rv30Var.k;
                            String str4 = rv30Var.h;
                            pz40 pz40Var10 = s6t0.f31722a;
                            StaticColors staticColors2 = StaticColors.INSTANCE;
                            ux30 ux30Var12 = new ux30(staticColors2.m123getWhite0d7_KjU(), staticColors2.m131getWhite800d7_KjU(), str4, rv30Var.i);
                            pc5 pc5Var2 = new pc5(new y3d(staticColors2.m121getTransparent0d7_KjU()));
                            gy30Var4 = new gy30(ux30Var12, new rx30(new m0x(rv30Var.e, null, 6), staticColors2.m123getWhite0d7_KjU(), rv30Var.b ? new kiz(new rf5(3, null)) : lizVar, rv30Var.e, 0L, pc5Var2, 432), new zx30(new m0x(rv30Var.j, rv30Var.l, 4), 3), 0L, list3, null, 216);
                            gy30Var = gy30Var4;
                            bzwVar = null;
                            break;
                        case 11:
                            nw30Var = nw30VarK0;
                            sv30 sv30Var = (sv30) nw30Var;
                            long j2 = sv30Var.j;
                            String str5 = sv30Var.g;
                            pz40 pz40Var11 = s6t0.f31722a;
                            StaticColors staticColors3 = StaticColors.INSTANCE;
                            gy30Var4 = new gy30(new ux30(staticColors3.m123getWhite0d7_KjU(), staticColors3.m131getWhite800d7_KjU(), str5, sv30Var.h), new qx30(new m0x(sv30Var.d, null, 6), staticColors3.m123getWhite0d7_KjU(), sv30Var.b ? new kiz(new rf5(3, null)) : lizVar, sv30Var.d, 0.0f, 48), new zx30(new m0x(sv30Var.i, null, 6), 3), j2, null, null, 240);
                            gy30Var = gy30Var4;
                            bzwVar = null;
                            break;
                        case 12:
                            it = it;
                            key = key;
                            nw30Var = nw30VarK0;
                            nv30 nv30Var = (nv30) nw30Var;
                            boolean z2 = nv30Var.g;
                            String str6 = nv30Var.e;
                            String str7 = nv30Var.f;
                            if (z2) {
                                i2 = 6;
                                r15 = 0;
                                ux30Var = new vx30(str6, str7, new m0x(R.drawable.ic_status_green_check_circle, null, 6));
                            } else {
                                i2 = 6;
                                r15 = 0;
                                ux30Var = new ux30(10, 0L, str6, str7);
                            }
                            int i11 = nv30Var.d;
                            qx30 qx30Var8 = new qx30(new m0x(i11, r15, i2), 0L, nv30Var.b ? new kiz(new rf5(3, r15)) : lizVar, i11, 0.0f, 50);
                            pz40 pz40Var12 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var, qx30Var8, ey30Var, s6t0.b().f33626a.getBackground(), null, null, 240);
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 13:
                            nw30Var = nw30VarK0;
                            tv30 tv30Var = (tv30) nw30Var;
                            long j3 = tv30Var.i;
                            String str8 = tv30Var.f;
                            pz40 pz40Var13 = s6t0.f31722a;
                            StaticColors staticColors4 = StaticColors.INSTANCE;
                            ux30 ux30Var13 = new ux30(staticColors4.m123getWhite0d7_KjU(), staticColors4.m131getWhite800d7_KjU(), str8, tv30Var.g);
                            int i12 = tv30Var.c;
                            long j4 = tv30Var.d;
                            m0x m0xVar = new m0x(i12, null, 6);
                            pc5 pc5Var3 = new pc5(new y3d(tv30Var.e));
                            if (tv30Var.f34580a) {
                                bzwVar2 = null;
                                kizVar = new kiz(new rf5(3, null));
                            } else {
                                bzwVar2 = null;
                                kizVar = lizVar;
                            }
                            gy30Var4 = new gy30(ux30Var13, new rx30(m0xVar, j4, kizVar, i12, 0L, pc5Var3, 432), new zx30(new m0x(tv30Var.h, bzwVar2, 6), 3), j3, null, null, 240);
                            gy30Var = gy30Var4;
                            bzwVar = null;
                            break;
                        case 14:
                            it = it;
                            key = key;
                            nw30Var = nw30VarK0;
                            lw30 lw30Var = (lw30) nw30Var;
                            ux30 ux30Var14 = new ux30(14, 0L, lw30Var.g, (String) null);
                            rx30 rx30Var2 = new rx30(new n0x(lw30Var.f), 0L, lw30Var.f20744a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.ic_glyph_language, 0L, null, 498);
                            pz40 pz40Var14 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var14, rx30Var2, ey30Var, s6t0.b().f33626a.getBackground(), null, null, 240);
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 15:
                            it = it;
                            key = key;
                            nw30Var = nw30VarK0;
                            vv30 vv30Var = (vv30) nw30Var;
                            boolean z3 = vv30Var.g;
                            String str9 = vv30Var.e;
                            String str10 = vv30Var.f;
                            if (z3) {
                                i3 = 6;
                                r16 = 0;
                                ux30Var2 = new vx30(str9, str10, new m0x(R.drawable.ic_status_green_check_circle, null, 6));
                            } else {
                                i3 = 6;
                                r16 = 0;
                                ux30Var2 = new ux30(10, 0L, str9, str10);
                            }
                            int i13 = vv30Var.d;
                            rx30 rx30Var3 = new rx30(new m0x(i13, r16, i3), 0L, vv30Var.b ? new kiz(new rf5(3, r16)) : lizVar, i13, 0L, null, 498);
                            pz40 pz40Var15 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var2, rx30Var3, ey30Var, s6t0.b().f33626a.getBackground(), null, null, 240);
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 16:
                            it = it;
                            key = key;
                            nw30Var = nw30VarK0;
                            wv30 wv30Var = (wv30) nw30Var;
                            ux30 ux30Var15 = new ux30(10, 0L, wv30Var.f, wv30Var.g);
                            rx30 rx30Var4 = new rx30(new n0x(wv30Var.d), 0L, wv30Var.f39822a ? new kiz(new rf5(3, null)) : lizVar, wv30Var.e, 0L, null, 498);
                            pz40 pz40Var16 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var15, rx30Var4, ey30Var, s6t0.b().f33626a.getBackground(), null, null, 240);
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 17:
                            nw30Var = nw30VarK0;
                            xv30 xv30Var = (xv30) nw30Var;
                            List list4 = xv30Var.k;
                            String str11 = xv30Var.h;
                            pz40 pz40Var17 = s6t0.f31722a;
                            StaticColors staticColors5 = StaticColors.INSTANCE;
                            ux30 ux30Var16 = new ux30(staticColors5.m123getWhite0d7_KjU(), staticColors5.m131getWhite800d7_KjU(), str11, xv30Var.i);
                            pc5 pc5Var4 = new pc5(new y3d(staticColors5.m121getTransparent0d7_KjU()));
                            gy30Var4 = new gy30(ux30Var16, new rx30(new m0x(xv30Var.e, null, 6), staticColors5.m123getWhite0d7_KjU(), xv30Var.b ? new kiz(new rf5(3, null)) : lizVar, xv30Var.e, 0L, pc5Var4, 432), new zx30(new m0x(xv30Var.j, xv30Var.l, 4), 3), 0L, list4, null, 216);
                            gy30Var = gy30Var4;
                            bzwVar = null;
                            break;
                        case 18:
                            yv30 yv30Var = (yv30) nw30VarK0;
                            long j5 = yv30Var.j;
                            String str12 = yv30Var.g;
                            pz40 pz40Var18 = s6t0.f31722a;
                            StaticColors staticColors6 = StaticColors.INSTANCE;
                            ux30 ux30Var17 = new ux30(staticColors6.m123getWhite0d7_KjU(), staticColors6.m131getWhite800d7_KjU(), str12, yv30Var.h);
                            int i14 = yv30Var.d;
                            long j6 = yv30Var.e;
                            m0x m0xVar2 = new m0x(i14, null, 6);
                            nw30Var = nw30VarK0;
                            pc5 pc5Var5 = new pc5(new y3d(yv30Var.f));
                            if (yv30Var.b) {
                                bzwVar3 = null;
                                kizVar2 = new kiz(new rf5(3, null));
                            } else {
                                bzwVar3 = null;
                                kizVar2 = lizVar;
                            }
                            gy30Var4 = new gy30(ux30Var17, new rx30(m0xVar2, j6, kizVar2, i14, 0L, pc5Var5, 432), new zx30(new m0x(yv30Var.i, bzwVar3, 6), 3), j5, null, null, 240);
                            gy30Var = gy30Var4;
                            bzwVar = null;
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            it = it;
                            key = key;
                            zv30 zv30Var = (zv30) nw30VarK0;
                            ux30 ux30Var18 = new ux30(10, 0L, zv30Var.e, zv30Var.f);
                            int i15 = zv30Var.d;
                            rx30 rx30Var5 = new rx30(new m0x(i15, null, 6), 0L, zv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i15, 0L, null, 498);
                            pz40 pz40Var19 = s6t0.f31722a;
                            nw30Var = nw30VarK0;
                            gy30Var = new gy30(ux30Var18, rx30Var5, new zx30(new m0x(zv30Var.g, null, 6), 3), s6t0.b().f33626a.getBackground(), null, null, 240);
                            bzwVar = null;
                            break;
                        case 20:
                            aw30 aw30Var = (aw30) nw30VarK0;
                            ux30 ux30Var19 = new ux30(10, 0L, aw30Var.e, aw30Var.f);
                            int i16 = aw30Var.d;
                            rx30 rx30Var6 = new rx30(new m0x(i16, null, 6), 0L, aw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i16, 0L, null, 498);
                            pz40 pz40Var20 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var19, rx30Var6, ey30Var, s6t0.b().f33626a.getBackground(), null, null, 240);
                            nw30Var = nw30VarK0;
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 21:
                            bw30 bw30Var = (bw30) nw30VarK0;
                            ux30 ux30Var20 = new ux30(14, 0L, bw30Var.g, (String) null);
                            rx30 rx30Var7 = new rx30(new n0x(bw30Var.f), 0L, bw30Var.f3307a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.ic_glyph_language, 0L, null, 498);
                            pz40 pz40Var21 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var20, rx30Var7, ey30Var, s6t0.b().f33626a.getBackground(), null, null, 240);
                            nw30Var = nw30VarK0;
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 22:
                            cw30 cw30Var = (cw30) nw30VarK0;
                            ux30 ux30Var21 = new ux30(10, 0L, cw30Var.e, cw30Var.f);
                            int i17 = cw30Var.d;
                            rx30 rx30Var8 = new rx30(new m0x(i17, null, 6), 0L, cw30Var.f5062a ? new kiz(new rf5(3, null)) : lizVar, i17, 0L, null, 498);
                            pz40 pz40Var22 = s6t0.f31722a;
                            gy30Var3 = new gy30(ux30Var21, rx30Var8, ey30Var, s6t0.b().f33626a.getBackground(), null, null, 240);
                            nw30Var = nw30VarK0;
                            gy30Var = gy30Var3;
                            bzwVar = null;
                            break;
                        case 23:
                            gw30 gw30Var = (gw30) nw30VarK0;
                            ux30 ux30Var22 = new ux30(10, 0L, gw30Var.h, "");
                            pz40 pz40Var23 = s6t0.f31722a;
                            key = key;
                            it = it;
                            gy30 gy30Var5 = new gy30(ux30Var22, new rx30(new n0x(gw30Var.e), 0L, gw30Var.f12006a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.sport_new, 0L, new qc5(null, new n0x(gw30Var.f), new y3d(s6t0.b().f33626a.getBackground())), 434), new zx30(new n0x(gw30Var.i), 3), 0L, null, null, 248);
                            it2 = it2;
                            gy30Var = gy30Var5;
                            bzwVar = null;
                            nw30Var = nw30VarK0;
                            break;
                        default:
                            ux30 ux30Var23 = new ux30(10, 0L, "", "");
                            zcl zclVar = qmk.f28987a;
                            m0x m0xVar3 = new m0x(0, bzwVar4, 6);
                            pz40 pz40Var24 = s6t0.f31722a;
                            gy30Var2 = new gy30(ux30Var23, new qx30(m0xVar3, s6t0.b().f33626a.getPrimary(), lizVar, R.drawable.ic_glyph_language, 40.0f, 16), ey30Var, 0L, null, null, 248);
                            bzwVar = bzwVar4;
                            nw30Var = nw30VarK0;
                            gy30Var = gy30Var2;
                            break;
                    }
                    ky30Var = new ky30(iz30VarM, r040VarN, gy30Var, z, yyw.g0(nw30Var), yyw.h0(nw30Var));
                }
                arrayList2.add(ky30Var);
                bzwVar4 = bzwVar;
                it2 = it2;
                key = key;
                it = it;
            }
            linkedHashMap.put(key, xww.T(arrayList2));
            it = it;
        }
    }

    public static final void d(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        fetVar.g0(1167281041);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1110400721, new g15(mm40Var, str2, str, (byte) 18), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i2, (byte) 19);
        }
    }

    public static final g5a0 d0(String str, long j2, List list, boolean z, z9p z9pVar) {
        zfp zfpVar;
        c280 c280Var = new c280(vsm0.s(j2, str), R.drawable.ic_glyph_placeholder_player);
        if (z) {
            zfpVar = null;
        } else {
            boolean z2 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((xcp) it.next()).f40657a == j2) {
                        z2 = true;
                        break;
                    }
                }
            }
            zfpVar = new zfp(j2, z2, z9pVar);
        }
        return new g5a0(c280Var, zfpVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void e(mm40 mm40Var, pm80 pm80Var, qge qgeVar, hh80 hh80Var, Function0 function0, fet fetVar, int i2, int i3) {
        int i4;
        qge qgeVar2;
        int i5;
        hh80 hh80Var2;
        int i6;
        boolean z;
        qge qgeVar3;
        hh80 hh80Var3;
        yfe0 yfe0VarU;
        int i7;
        qge qgeVar4;
        hh80 hh80VarT;
        int i8;
        pm80Var.getClass();
        function0.getClass();
        fetVar.g0(525036267);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? fetVar.g(pm80Var) : fetVar.i(pm80Var) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                qgeVar2 = qgeVar;
                i4 |= fetVar.g(qgeVar2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    hh80Var2 = hh80Var;
                    if (fetVar.g(hh80Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i2 & 24576) == 0) {
                    if (fetVar.i(function0)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i9 != 0) {
                        qgeVar4 = gqw0.B;
                        i7 = i5;
                    } else {
                        i7 = i5;
                        qgeVar4 = qgeVar2;
                    }
                    if (i7 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var2;
                    }
                    mm40 mm40VarY = y860.Y(lgb.J(mm40Var, vgg0.f37379a), false, null, new ucg0(0), function0, 11);
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
                    j0x.b(pm80Var, null, s5x0.I(o7k0.c, hh80VarT), null, qgeVar4, 0.0f, null, fetVar, ((i4 >> 3) & 14) | 56 | ((i4 << 6) & 57344), 104);
                    fetVar.r(true);
                    qgeVar3 = qgeVar4;
                    hh80Var3 = hh80VarT;
                } else {
                    fetVar.X();
                    qgeVar3 = qgeVar2;
                    hh80Var3 = hh80Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a33(mm40Var, (Object) pm80Var, (Object) qgeVar3, (Object) hh80Var3, (Object) function0, i2, i3, (byte) 3);
                }
            }
            i4 |= 3072;
            hh80Var2 = hh80Var;
            if ((i2 & 24576) == 0) {
                if (fetVar.i(function0)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i9 != 0) {
                    qgeVar4 = gqw0.B;
                    i7 = i5;
                } else {
                    i7 = i5;
                    qgeVar4 = qgeVar2;
                }
                if (i7 != 0) {
                    hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT = hh80Var2;
                }
                mm40 mm40VarY2 = y860.Y(lgb.J(mm40Var, vgg0.f37379a), false, null, new ucg0(0), function0, 11);
                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarY2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, gqw0.x);
                jpm0.o(fetVar, bh90VarM2, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, gqw0.v);
                j0x.b(pm80Var, null, s5x0.I(o7k0.c, hh80VarT), null, qgeVar4, 0.0f, null, fetVar, ((i4 >> 3) & 14) | 56 | ((i4 << 6) & 57344), 104);
                fetVar.r(true);
                qgeVar3 = qgeVar4;
                hh80Var3 = hh80VarT;
            } else {
                fetVar.X();
                qgeVar3 = qgeVar2;
                hh80Var3 = hh80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(mm40Var, (Object) pm80Var, (Object) qgeVar3, (Object) hh80Var3, (Object) function0, i2, i3, (byte) 3);
            }
        }
        i4 |= 384;
        qgeVar2 = qgeVar;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                hh80Var2 = hh80Var;
                if (fetVar.g(hh80Var2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                if (fetVar.i(function0)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i9 != 0) {
                    qgeVar4 = gqw0.B;
                    i7 = i5;
                } else {
                    i7 = i5;
                    qgeVar4 = qgeVar2;
                }
                if (i7 != 0) {
                    hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT = hh80Var2;
                }
                mm40 mm40VarY3 = y860.Y(lgb.J(mm40Var, vgg0.f37379a), false, null, new ucg0(0), function0, 11);
                tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarY3);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC3, gqw0.x);
                jpm0.o(fetVar, bh90VarM3, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC2, gqw0.v);
                j0x.b(pm80Var, null, s5x0.I(o7k0.c, hh80VarT), null, qgeVar4, 0.0f, null, fetVar, ((i4 >> 3) & 14) | 56 | ((i4 << 6) & 57344), 104);
                fetVar.r(true);
                qgeVar3 = qgeVar4;
                hh80Var3 = hh80VarT;
            } else {
                fetVar.X();
                qgeVar3 = qgeVar2;
                hh80Var3 = hh80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(mm40Var, (Object) pm80Var, (Object) qgeVar3, (Object) hh80Var3, (Object) function0, i2, i3, (byte) 3);
            }
        }
        i4 |= 3072;
        hh80Var2 = hh80Var;
        if ((i2 & 24576) == 0) {
            if (fetVar.i(function0)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i4 |= i8;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            if (i9 != 0) {
                qgeVar4 = gqw0.B;
                i7 = i5;
            } else {
                i7 = i5;
                qgeVar4 = qgeVar2;
            }
            if (i7 != 0) {
                hh80VarT = s5x0.t(0.0f, 0.0f, 3);
            } else {
                hh80VarT = hh80Var2;
            }
            mm40 mm40VarY4 = y860.Y(lgb.J(mm40Var, vgg0.f37379a), false, null, new ucg0(0), function0, 11);
            tj30 tj30VarC4 = zq8.c(gqw0.e, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarY4);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, gqw0.x);
            jpm0.o(fetVar, bh90VarM4, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC3, gqw0.v);
            j0x.b(pm80Var, null, s5x0.I(o7k0.c, hh80VarT), null, qgeVar4, 0.0f, null, fetVar, ((i4 >> 3) & 14) | 56 | ((i4 << 6) & 57344), 104);
            fetVar.r(true);
            qgeVar3 = qgeVar4;
            hh80Var3 = hh80VarT;
        } else {
            fetVar.X();
            qgeVar3 = qgeVar2;
            hh80Var3 = hh80Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a33(mm40Var, (Object) pm80Var, (Object) qgeVar3, (Object) hh80Var3, (Object) function0, i2, i3, (byte) 3);
        }
    }

    public static final q84 e0(c84 c84Var, ctf0 ctf0Var, wui0 wui0Var, boolean z) {
        String strG;
        int i2;
        int i3;
        c84Var.getClass();
        String str = c84Var.e;
        ctf0Var.getClass();
        String str2 = c84Var.b;
        boolean z2 = c84Var.g;
        va80 va80Var = c84Var.d;
        boolean z3 = c84Var.f;
        int length = str2.length();
        String strI = c84Var.f3895a;
        if (length != 0) {
            strI = ua80.i(strI, " (", str2, Separators.RPAREN);
        }
        String strE = cy7.e(strI);
        if (z3) {
            strG = ctf0Var.b.a(R.string.current_session, Arrays.copyOf(new Object[0], 0));
        } else {
            rdj rdjVar = rdj.f30294a;
            strG = rdj.g(new znq0(c84Var.c), efj.UNIVERSAL, null, false, 60);
        }
        String strA = ctf0Var.b.a(R.string.authenticator_connected, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        pc5 pc5Var = new pc5(new y3d(z3 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getBackground()));
        switch (va80Var.ordinal()) {
            case 0:
            case 1:
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
            case 16:
            case 17:
                i2 = R.drawable.ic_glyph_device_placeholder;
                break;
            case 2:
                i2 = R.drawable.ic_glyph_windows;
                break;
            case 3:
                i2 = R.drawable.ic_glyph_mac;
                break;
            case 4:
                i2 = R.drawable.ic_glyph_android;
                break;
            case 5:
                i2 = R.drawable.ic_glyph_apple;
                break;
            default:
                t9f.b();
                return null;
        }
        nui0 nui0Var = new nui0(null, null, new m0x(i2, null, 6), new y3d(z3 ? s6t0.b().f33626a.getPrimaryForeground() : s6t0.b().f33626a.getPrimary()), null, pc5Var, 0.0f, 211);
        Integer numValueOf = (z && z2) ? Integer.valueOf(R.drawable.ic_status_green_check_circle) : null;
        if (z && z2) {
            strG = w6x.q(strG, " \n", strA);
        }
        rqm rqmVar = new rqm((vui0) new uui0(strE, null, strG, null, numValueOf, 42), (pui0) nui0Var, (pvi0) (str.length() > 0 ? new dvi0(new m0x(R.drawable.ic_glyph_cancel, null, 6), new y3d(s6t0.b().f33626a.getPrimary()), 0) : null), (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 440);
        switch (va80Var.ordinal()) {
            case 0:
            case 1:
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
            case 16:
            case 17:
                i3 = R.drawable.ic_glyph_device_placeholder;
                break;
            case 2:
                i3 = R.drawable.ic_glyph_windows;
                break;
            case 3:
                i3 = R.drawable.ic_glyph_mac;
                break;
            case 4:
                i3 = R.drawable.ic_glyph_android;
                break;
            case 5:
                i3 = R.drawable.ic_glyph_apple;
                break;
            default:
                t9f.b();
                return null;
        }
        return new q84(str, rqmVar, strE, c84Var.c, i3, c84Var.g, c84Var.f);
    }

    public static final void f(cpm cpmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(2121321895);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(cpmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 8.0f, 1);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new omf(function1, (byte) 6);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            byte b3 = 3;
            int i4 = i3 << 3;
            function2.getClass();
            boolean zG = fetVar.g(function2);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new omf(function2, b3);
                fetVar.o0(objP2);
            }
            u1c.i(mm40VarL, cpmVar, (Function1) objP2, fetVar, i4 & 112, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgg(cpmVar, function1, i2, b2);
        }
    }

    public static final tg7 f0(zg7 zg7Var, List list, List list2, boolean z, boolean z2, boolean z3) {
        Object next;
        Object next2;
        Pair pair;
        Long l2;
        daa0 daa0Var;
        daa0 daa0Var2;
        Long l3;
        Double d2;
        Long l4;
        Double d3;
        List list3;
        k180 k180Var;
        String str;
        List list4;
        k180 k180Var2;
        String str2;
        List list5;
        k180 k180Var3;
        String str3;
        List list6;
        k180 k180Var4;
        String str4;
        Long l5;
        Long l6;
        Long l7;
        daa0 daa0Var3;
        Double d4;
        d8p d8pVar;
        d8p d8pVar2;
        zg7Var.getClass();
        qkl0 qkl0Var = zg7Var.n;
        e8p e8pVar = zg7Var.r;
        list.getClass();
        list2.getClass();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            xco xcoVar = (xco) next;
            if (e8pVar != null) {
                long j2 = xcoVar.f40655a;
                Long l8 = e8pVar.d;
                if (l8 != null && j2 == l8.longValue()) {
                    break;
                }
            }
        }
        xco xcoVar2 = (xco) next;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            ueo ueoVar = (ueo) next2;
            if (e8pVar != null) {
                long j3 = ueoVar.f35538a;
                Long l9 = e8pVar.f7385a;
                if (l9 != null && j3 == l9.longValue()) {
                    break;
                }
            }
        }
        ueo ueoVar2 = (ueo) next2;
        long jLongValue = 0;
        if (xcoVar2 == null || ueoVar2 == null || ueoVar2.b.length() == 0) {
            pair = new Pair("", "");
        } else {
            String str5 = ueoVar2.b;
            List list7 = (e8pVar == null || (d8pVar2 = e8pVar.g) == null) ? null : d8pVar2.f5662a;
            if (list7 == null) {
                list7 = iun.f15405a;
            }
            List list8 = list7;
            List list9 = (e8pVar == null || (d8pVar = e8pVar.g) == null) ? null : d8pVar.b;
            if (list9 == null) {
                list9 = iun.f15405a;
            }
            List list10 = list9;
            Integer numValueOf = Integer.valueOf(ueoVar2.c);
            BigDecimal bigDecimalH = kotlin.text.b.h(String.valueOf((e8pVar == null || (d4 = e8pVar.e) == null) ? 0.0d : d4.doubleValue()));
            String str6 = (e8pVar == null || (daa0Var3 = e8pVar.f) == null) ? null : daa0Var3.b;
            pair = new Pair(dii0.a(str5, list8, list10, numValueOf, z, bigDecimalH, str6 == null ? "" : str6, Long.valueOf((qkl0Var == null || (l7 = qkl0Var.f28891a) == null) ? 0L : l7.longValue()), ueoVar2.f35538a, nt20.i, z2, z3), xcoVar2.b);
        }
        String str7 = (String) pair.f46059a;
        String str8 = (String) pair.b;
        Long l10 = zg7Var.f44330a;
        c380 c380Var = zg7Var.q;
        c380 c380Var2 = zg7Var.p;
        long jLongValue2 = l10 != null ? l10.longValue() : 0L;
        Long l11 = zg7Var.c;
        long jLongValue3 = l11 != null ? l11.longValue() : 0L;
        long jLongValue4 = (qkl0Var == null || (l6 = qkl0Var.f28891a) == null) ? 0L : l6.longValue();
        t3n0 t3n0Var = zg7Var.o;
        long jLongValue5 = (t3n0Var == null || (l5 = t3n0Var.f33277a) == null) ? 0L : l5.longValue();
        String strM0 = (c380Var2 == null || (list6 = c380Var2.c) == null || (k180Var4 = (k180) CollectionsKt.W(0, list6)) == null || (str4 = k180Var4.c) == null) ? "" : StringsKt.m0(str4, "/sfiles/logo_teams/", str4);
        String strM1 = (c380Var2 == null || (list5 = c380Var2.c) == null || (k180Var3 = (k180) CollectionsKt.W(1, list5)) == null || (str3 = k180Var3.c) == null) ? "" : StringsKt.m0(str3, "/sfiles/logo_teams/", str3);
        String strM2 = (c380Var == null || (list4 = c380Var.c) == null || (k180Var2 = (k180) CollectionsKt.W(0, list4)) == null || (str2 = k180Var2.c) == null) ? "" : StringsKt.m0(str2, "/sfiles/logo_teams/", str2);
        String strM3 = (c380Var == null || (list3 = c380Var.c) == null || (k180Var = (k180) CollectionsKt.W(1, list3)) == null || (str = k180Var.c) == null) ? "" : StringsKt.m0(str, "/sfiles/logo_teams/", str);
        dmz dmzVar = zg7Var.m;
        String str9 = dmzVar != null ? dmzVar.b : null;
        String str10 = str9 == null ? "" : str9;
        double dDoubleValue = (e8pVar == null || (d3 = e8pVar.b) == null) ? 0.0d : d3.doubleValue();
        String str11 = e8pVar != null ? e8pVar.c : null;
        String str12 = str11 == null ? "" : str11;
        tqt tqtVar = uoy.b;
        Integer num = zg7Var.k;
        int iIntValue = num != null ? num.intValue() : 0;
        tqtVar.getClass();
        uoy uoyVarJ = tqt.j(iIntValue);
        long jLongValue6 = (e8pVar == null || (l4 = e8pVar.f7385a) == null) ? 0L : l4.longValue();
        Long l12 = zg7Var.f;
        long jLongValue7 = l12 != null ? l12.longValue() : 0L;
        String str13 = zg7Var.e;
        String str14 = str13 == null ? "" : str13;
        String str15 = zg7Var.h;
        String str16 = str15 == null ? "" : str15;
        String str17 = c380Var2 != null ? c380Var2.f3661a : null;
        if (str17 == null) {
            str17 = "";
        }
        String str18 = c380Var != null ? c380Var.f3661a : null;
        String str19 = str18 == null ? "" : str18;
        double dDoubleValue2 = (e8pVar == null || (d2 = e8pVar.e) == null) ? 0.0d : d2.doubleValue();
        long jLongValue8 = (e8pVar == null || (daa0Var2 = e8pVar.f) == null || (l3 = daa0Var2.f5738a) == null) ? 0L : l3.longValue();
        String str20 = (e8pVar == null || (daa0Var = e8pVar.f) == null) ? null : daa0Var.b;
        String str21 = str20 == null ? "" : str20;
        if (e8pVar != null && (l2 = e8pVar.d) != null) {
            jLongValue = l2.longValue();
        }
        return new tg7(jLongValue2, jLongValue3, jLongValue4, jLongValue5, str14, strM0, strM1, str17, strM2, strM3, str19, str8, str10, str16, dDoubleValue, str12, jLongValue7, str7, uoyVarJ, jLongValue6, dDoubleValue2, jLongValue8, str21, jLongValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(mm40 mm40Var, final ly0 ly0Var, final Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        ue9 ue9Var;
        final byte b2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1591927455);
        int i3 = i2 | 6 | (fetVar2.g(ly0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar2, o7k0.n(jm40Var, 12.0f));
            mm40 mm40VarN = s5x0.N(jm40Var, xfn.a(fetVar2).e, 0.0f, xfn.a(fetVar2).e, 0.0f, 10);
            mm40Var2 = jm40Var;
            j8b j8bVar = ly0Var.d;
            String str = j8bVar.b;
            byte b3 = 10;
            if (ly0Var.b || j8bVar.c.size() >= 10) {
                fetVar2.e0(155820015);
                ue9Var = new ue9(xsm0.s(R.string.all, fetVar2));
                fetVar2.r(false);
            } else {
                fetVar2.e0(155768927);
                fetVar2.r(false);
                ue9Var = null;
            }
            hjm hjmVar = new hjm(str, null, null, null, null, null, false, null, null, false, ue9Var, null, 7166);
            kjm kjmVar = kjm.f18392a;
            int i4 = i3 & 896;
            int i5 = i3 & 112;
            boolean z2 = (i4 == 256) | (i5 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new mc(function1, ly0Var, b3);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarN, hjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            fetVar2 = fetVar;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var2, 1.0f), "GAME_CARD_COLLECTION");
            zll zllVar = ly0Var.f20841a;
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar2).c, 0.0f, xfn.a(fetVar2).c, 0.0f, 10);
            boolean z3 = (i4 == 256) | (i5 == 32);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                b2 = 0;
                objP2 = new Function1() { // from class: a.xy0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b2;
                        ly0 ly0Var2 = ly0Var;
                        Function1 function2 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b4) {
                            case 0:
                                st0Var.getClass();
                                long j2 = st0Var.f32750a;
                                long j3 = ly0Var2.d.f16074a;
                                mtr mtrVar = st0Var.d;
                                function2.invoke(new fy0(j2, mtrVar != null ? mtrVar.b : false, j3));
                                break;
                            default:
                                st0Var.getClass();
                                function2.invoke(new gy0(st0Var.f32750a, ly0Var2.d.f16074a, st0Var.b));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP2);
            } else {
                b2 = 0;
            }
            Function1 function2 = (Function1) objP2;
            boolean z4 = (i4 == 256 ? (byte) 1 : b2) | (i5 == 32 ? (byte) 1 : b2);
            Object objP3 = fetVar2.P();
            if (z4 != 0 || objP3 == cl5Var) {
                z = true;
                final char c2 = 1 == true ? 1 : 0;
                objP3 = new Function1() { // from class: a.xy0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = c2;
                        ly0 ly0Var2 = ly0Var;
                        Function1 function3 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b4) {
                            case 0:
                                st0Var.getClass();
                                long j2 = st0Var.f32750a;
                                long j3 = ly0Var2.d.f16074a;
                                mtr mtrVar = st0Var.d;
                                function3.invoke(new fy0(j2, mtrVar != null ? mtrVar.b : false, j3));
                                break;
                            default:
                                st0Var.getClass();
                                function3.invoke(new gy0(st0Var.f32750a, ly0Var2.d.f16074a, st0Var.b));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            } else {
                z = true;
            }
            ckb.f(mm40VarE0, zllVar, null, lh80VarU, null, null, function2, (Function1) objP3, fetVar2, 6, 52);
            fetVar2.r(z);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var2, ly0Var, function1, i2, (byte) 16);
        }
    }

    public static final mlr g0(ys0 ys0Var, String str) {
        String strZ;
        String strZ2;
        ys0Var.getClass();
        str.getClass();
        Long l2 = ys0Var.f43145a;
        String str2 = ys0Var.k;
        String str3 = ys0Var.i;
        List list = ys0Var.g;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        Long l3 = ys0Var.c;
        long jLongValue2 = l3 != null ? l3.longValue() : 0L;
        Long l4 = ys0Var.b;
        long jLongValue3 = l4 != null ? l4.longValue() : 0L;
        Long l5 = ys0Var.d;
        long jLongValue4 = l5 != null ? l5.longValue() : 0L;
        String str4 = ys0Var.e;
        String str5 = str4 == null ? "" : str4;
        String str6 = ys0Var.f;
        String str7 = str6 == null ? "" : str6;
        if (str3 == null || str3.length() == 0) {
            String str8 = ys0Var.h;
            if (str8 == null) {
                str8 = "";
            }
            strZ = Z(str, str8);
        } else {
            strZ = Z(str, str3);
        }
        String str9 = strZ;
        if (str2 == null || str2.length() == 0) {
            String str10 = ys0Var.j;
            strZ2 = Z(str, str10 != null ? str10 : "");
        } else {
            strZ2 = Z(str, str2);
        }
        String str11 = strZ2;
        boolean zContains = list != null ? list.contains("popular") : false;
        boolean zContains2 = list != null ? list.contains("new") : false;
        boolean zContains3 = list != null ? list.contains("promo") : false;
        boolean zContains4 = list != null ? list.contains("hot") : false;
        Boolean bool = ys0Var.o;
        Boolean bool2 = Boolean.TRUE;
        boolean zD = Intrinsics.d(bool, bool2);
        boolean zD2 = Intrinsics.d(ys0Var.n, bool2);
        boolean zD3 = Intrinsics.d(ys0Var.m, bool2);
        List list2 = ys0Var.l;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new mlr(jLongValue, jLongValue2, jLongValue3, jLongValue4, str5, str7, str9, str11, zContains, zContains2, zContains3, zD, zD2, zD3, zContains4, list2, false, 131072);
    }

    public static final void h(mm40 mm40Var, dsm dsmVar, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i2) {
        dsm dsmVar2;
        Object m0xVar;
        String str;
        fetVar.g0(2051701506);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(dsmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var, 84.0f), 72.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, ljcVar);
            int i4 = i3 & 112;
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | (i4 == 32) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                dsmVar2 = dsmVar;
                r3l0 r3l0Var = new r3l0(dsmVar2, function0, function2, function1, (byte) 2);
                fetVar.o0(r3l0Var);
                objP = r3l0Var;
            } else {
                dsmVar2 = dsmVar;
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS2 = o7k0.s(o7k0.e(s5x0.L(jm40Var, 0.0f, 4.0f, 1), 48.0f), 64.0f);
            zcl zclVar3 = qmk.f;
            mm40 mm40VarQ2 = i120.Q(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarS2), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ljcVar);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
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
            boolean z3 = i4 == 32;
            Object objP2 = fetVar.P();
            byte b2 = 6;
            if (z3 || objP2 == cl5Var) {
                if (dsmVar2 instanceof asm) {
                    m0xVar = new m0x(R.drawable.ic_glyph_all, null, 6);
                } else if (dsmVar2 instanceof bsm) {
                    m0xVar = new m0x(R.drawable.ic_glyph_filter_line_inactive, null, 6);
                } else {
                    if (!(dsmVar2 instanceof csm)) {
                        t9f.b();
                        return;
                    }
                    m0xVar = ((csm) dsmVar2).f4897a.b;
                }
                objP2 = m0xVar;
                fetVar.o0(objP2);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(581837894, new o9b((o0x) objP2, b2), fetVar), fetVar, 56);
            fetVar.r(true);
            boolean z4 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                if (dsmVar2 instanceof asm) {
                    str = ((asm) dsmVar2).f1397a;
                } else if (dsmVar2 instanceof bsm) {
                    str = ((bsm) dsmVar2).f3137a;
                } else {
                    if (!(dsmVar2 instanceof csm)) {
                        t9f.b();
                        return;
                    }
                    str = ((csm) dsmVar2).f4897a.c;
                }
                objP3 = str;
                fetVar.o0(objP3);
            }
            String str2 = (String) objP3;
            mm40 mm40VarE2 = s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2).e(o7k0.c);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), fetVar, 0, 24960, 110586);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s3l0(mm40Var, dsmVar, function1, function0, function2, i2, (byte) 2);
        }
    }

    public static final mlr h0(bw0 bw0Var, String str) {
        String strZ;
        String strZ2;
        Long l2;
        Long l3;
        bw0Var.getClass();
        str.getClass();
        Long l4 = bw0Var.f3301a;
        ex0 ex0Var = bw0Var.l;
        List list = bw0Var.e;
        lx0 lx0Var = bw0Var.f;
        long jLongValue = 0;
        long jLongValue2 = l4 != null ? l4.longValue() : 0L;
        rx0 rx0Var = bw0Var.c;
        long jLongValue3 = (rx0Var == null || (l3 = rx0Var.f31239a) == null) ? 0L : l3.longValue();
        Long l5 = bw0Var.b;
        long jLongValue4 = l5 != null ? l5.longValue() : 0L;
        if (ex0Var != null && (l2 = ex0Var.f8552a) != null) {
            jLongValue = l2.longValue();
        }
        long j2 = jLongValue;
        String str2 = ex0Var != null ? ex0Var.b : null;
        String str3 = str2 == null ? "" : str2;
        String str4 = bw0Var.d;
        String str5 = str4 == null ? "" : str4;
        String str6 = lx0Var != null ? lx0Var.f : null;
        if (str6 == null || str6.length() == 0) {
            String str7 = lx0Var != null ? lx0Var.c : null;
            if (str7 == null) {
                str7 = "";
            }
            strZ = Z(str, str7);
        } else {
            strZ = Z(str, lx0Var.f);
        }
        String str8 = strZ;
        String str9 = lx0Var != null ? lx0Var.h : null;
        if (str9 == null || str9.length() == 0) {
            String str10 = lx0Var != null ? lx0Var.g : null;
            strZ2 = Z(str, str10 != null ? str10 : "");
        } else {
            strZ2 = Z(str, lx0Var.h);
        }
        String str11 = strZ2;
        boolean zContains = list != null ? list.contains("popular") : false;
        boolean zContains2 = list != null ? list.contains("new") : false;
        boolean zContains3 = list != null ? list.contains("promo") : false;
        boolean zContains4 = list != null ? list.contains("hot") : false;
        Boolean bool = bw0Var.j;
        Boolean bool2 = Boolean.TRUE;
        boolean zD = Intrinsics.d(bool, bool2);
        boolean zD2 = Intrinsics.d(bw0Var.k, bool2);
        boolean zD3 = Intrinsics.d(bw0Var.i, bool2);
        List list2 = bw0Var.h;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = list2;
        Long l6 = bw0Var.p;
        return new mlr(jLongValue2, jLongValue3, jLongValue4, j2, str3, str5, str8, str11, zContains, zContains2, zContains3, zD, zD2, zD3, zContains4, list3, false, l6 != null ? Long.valueOf(TimeUnit.SECONDS.toMillis(l6.longValue())) : null);
    }

    public static final void i(hn8 hn8Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-847744887);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(hn8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 0;
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (hn8Var.f13337a) {
            fetVar.e0(-760053171);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
            mtl mtlVar = hn8Var.b;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xz8(function1, (byte) 26);
                fetVar.o0(objP);
            }
            y860.n(null, mtlVar, lh80VarU, (Function1) objP, fetVar, 1);
            fetVar.r(false);
        } else {
            fetVar.e0(-759605159);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sdb(hn8Var, function1, i2, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    public static final n85 i0(r85 r85Var) {
        huo0 huo0Var;
        suo0 suo0Var;
        Object next;
        r85Var.getClass();
        Long l2 = r85Var.f30009a;
        Integer num = r85Var.h;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        Long l3 = r85Var.b;
        long jLongValue2 = l3 != null ? l3.longValue() : 0L;
        String str = r85Var.c;
        String str2 = str == null ? "" : str;
        String str3 = r85Var.d;
        String str4 = str3 == null ? "" : str3;
        Long l4 = r85Var.e;
        Object obj = null;
        if (l4 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue3 = l4.longValue();
        String str5 = r85Var.f;
        String str6 = str5 == null ? "" : str5;
        s9m0 s9m0Var = wuo0.f39800a;
        Integer num2 = r85Var.g;
        s9m0Var.getClass();
        wuo0 wuo0VarE = s9m0.e(num2);
        sba0.b.getClass();
        sba0 sba0VarF = jh70.f(num);
        nh70 nh70Var = tba0.f33654a;
        Integer num3 = r85Var.i;
        nh70Var.getClass();
        tba0 tba0Var = (num3 != null && num3.intValue() == 1) ? tba0.b : (num3 != null && num3.intValue() == 2) ? tba0.c : tba0.d;
        Double d2 = r85Var.j;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        List<luo0> list = r85Var.k;
        if (list != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (luo0 luo0Var : list) {
                sba0.b.getClass();
                arrayList.add(qim0.q(luo0Var, jh70.f(num)));
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((huo0) next) instanceof guo0);
            huo0Var = (huo0) next;
            if (huo0Var == null) {
                huo0Var = guo0.f11940a;
            }
        } else {
            huo0Var = guo0.f11940a;
        }
        huo0 huo0Var2 = huo0Var;
        List list2 = r85Var.l;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(l7x.g0((vuo0) it2.next()));
            }
            for (Object obj2 : arrayList2) {
                if (!(((suo0) obj2) instanceof quo0)) {
                    obj = obj2;
                    break;
                }
            }
            suo0Var = (suo0) obj;
            if (suo0Var == null) {
                suo0Var = quo0.f29355a;
            }
        } else {
            suo0Var = quo0.f29355a;
        }
        return new n85(jLongValue, jLongValue2, str2, str4, jLongValue3, str6, wuo0VarE, sba0VarF, tba0Var, dDoubleValue, huo0Var2, suo0Var);
    }

    public static final void j(mm40 mm40Var, mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-282385648);
        int i3 = i2 | 6 | (fetVar.g(mdmVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, i3 & 112, 13);
            fetVar2.r(true);
            mm40Var = jm40.b;
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rdb(mm40Var, mdmVar2, i2, b2);
        }
    }

    public static final void k(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-172421925);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new n19(function1, (byte) 27);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 6);
        }
    }

    public static final void l(mm40 mm40Var, l7m0 l7m0Var, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        boolean z;
        l7m0Var.getClass();
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(-253267248);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(j700Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(zczVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = 57344 & i4;
            boolean z2 = i5 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new n19(function1, (byte) 25);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i5 == 16384;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new n19(function1, (byte) 26);
                fetVar.o0(objP2);
            }
            v3c.A(function0, (Function0) objP2, null, fetVar, 0, 4);
            ymp ympVar = (ymp) l7m0Var.getValue();
            mm40 mm40VarR = knm0.r(mm40Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = j120.K(mm40VarR, s5x0.u(0.0f, 0.0f, 0.0f, 56.0f, 7));
            hn8 hn8Var = ympVar.b;
            mm40 mm40VarP = o050.P(j120.K(mm40VarK, s5x0.u(0.0f, 0.0f, 0.0f, hn8Var.f13337a ? 12.0f : 0.0f, 7)));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40.b, 1.0f), true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
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
            xlp xlpVar = ympVar.f42901a;
            if (xlpVar instanceof vlp) {
                fetVar.e0(1667788980);
                fetVar.r(false);
            } else {
                if (xlpVar instanceof wlp) {
                    fetVar.e0(1716369750);
                    I(null, (wlp) xlpVar, fetVar, 0);
                    fetVar.r(false);
                } else if (xlpVar instanceof slp) {
                    fetVar.e0(1716374204);
                    fetVar2 = fetVar;
                    z = true;
                    b34.p(null, (slp) xlpVar, hn8Var.f13337a, j700Var, zczVar, function1, fetVar2, (i4 << 3) & 523264);
                    fetVar2.r(false);
                } else {
                    fetVar2 = fetVar;
                    z = true;
                    if (xlpVar instanceof tlp) {
                        fetVar2.e0(1716385733);
                        j(null, ((tlp) xlpVar).f34157a, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        if (!(xlpVar instanceof ulp)) {
                            throw b1j.f(1716365314, fetVar2, false);
                        }
                        fetVar2.e0(1716391588);
                        k(null, ((ulp) xlpVar).f35884a, function1, fetVar2, (i4 >> 6) & 896);
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(z);
                i(hn8Var, function1, fetVar2, (i4 >> 9) & 112);
                fetVar2.r(z);
            }
            fetVar2 = fetVar;
            z = true;
            fetVar2.r(z);
            i(hn8Var, function1, fetVar2, (i4 >> 9) & 112);
            fetVar2.r(z);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qdb(mm40Var, l7m0Var, j700Var, zczVar, function1, i2, (byte) 0);
        }
    }

    public static final void m(mm40 mm40Var, xeb xebVar, boolean z, boolean z2, e2d e2dVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        byte b2;
        jm40 jm40Var;
        xeb xebVar2 = xebVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1079780883);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(xebVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(e2dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            xcz xczVarB = qdzVar.b("ALT_CHAMP_RESULTS_SCREEN", new hvy((byte) 3), fetVar2, ((i4 >> 9) & 896) | 6);
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i5 = zcm0.i(fetVar2).c.e().d - zcm0.i(fetVar2).e.e().d;
            if (i5 < 0) {
                i5 = 0;
            }
            float fR0 = w6kVar.r0(i5);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            wom womVarF = mom.f(fetVar2);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zG = ((i4 & 7168) == 2048) | fetVar2.g(xczVarB);
            Object objP = fetVar2.P();
            byte b3 = 5;
            cl5 cl5Var = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP == cl5Var) {
                objP = new qa2(z2, xczVarB, yjeVar, b3);
                fetVar2.o0(objP);
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP);
            if (z2) {
                function1.invoke(n62.f22974a);
            }
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new j6g0((byte) 17);
                fetVar2.o0(objP2);
            }
            azl azlVarB = e2d.b(e2dVar, (Function0) objP2);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var2, azlVarB, null);
            mm40 mm40VarN = s5x0.N(o7k0.c, 0.0f, 0.0f, 0.0f, fMax, 7);
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
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true);
            int i6 = i4 & 3670016;
            boolean z3 = i6 == 1048576;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                b2 = 5;
                objP3 = new xwy(function1, b2);
                fetVar2.o0(objP3);
            } else {
                b2 = 5;
            }
            axy axyVar = new axy(mm40VarV, function1, xczVarB, xebVar2, (byte) 0);
            xebVar2 = xebVar2;
            byte b4 = b2;
            mom.c(x7zVarI, z, womVarF, null, false, null, (Function0) objP3, null, u1c.M(2099081548, axyVar, fetVar2), fetVar2, ((i4 >> 3) & 112) | 100663296, 184);
            fetVar2 = fetVar2;
            if (xebVar2.b != null) {
                fetVar2.e0(-236377678);
                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 56.0f, 7);
                mtl mtlVar = xebVar2.b;
                boolean z4 = i6 == 1048576;
                Object objP4 = fetVar2.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new i1y(function1, (byte) 13);
                    fetVar2.o0(objP4);
                }
                Function1 function2 = (Function1) objP4;
                jm40Var = jm40Var2;
                bkb.f(mm40VarN2, mtlVar, null, false, null, function2, fetVar2, 0, 28);
                boolean zD = fetVar2.d(fR0);
                Object objP5 = fetVar2.P();
                if (zD || objP5 == cl5Var) {
                    objP5 = jgk0.b(new rt2(fR0, b4));
                    fetVar2.o0(objP5);
                }
                zq8.a(0, fetVar2, i120.Q(o7k0.d(o7k0.e(jm40Var, l7x.O(12.0f, 0.0f, ((Number) ((l7m0) objP5).getValue()).floatValue())), 1.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n));
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(-235523349);
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
            yfe0VarU.d = new owy(mm40Var2, xebVar2, z, z2, e2dVar, qdzVar, function1, i2, (byte) 0);
        }
    }

    public static final void n(hh80 hh80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1283751428);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(hh80Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarP = o050.P(s5x0.I(o7k0.c, hh80Var));
            ch80 ch80VarF = knm0.f(s5x0.t(xfn.a(fetVar).d, 0.0f, 2), fetVar);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ys4(l7m0Var, function1, (byte) 21);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarP, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new soz(hh80Var, l7m0Var, function1, i2, (byte) 6);
        }
    }

    public static final void o(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1880298224);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new afd(function1, (byte) 15);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, (byte) 3);
        }
    }

    public static final void p(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        a4x a4xVar;
        Function1 function2 = function1;
        l7m0Var.getClass();
        qdzVar.getClass();
        function2.getClass();
        fetVar.g0(614150587);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new eka(l7m0Var, (byte) 17);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new eka(l7m0Var, (byte) 18);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            ((tfg) l7m0VarY.getValue()).getClass();
            xcz xczVarB = qdzVar.b("CALENDAR", new jyf((byte) 21), fetVar, (i3 << 3) & 896);
            mm40 mm40VarV = cjx.V(o7k0.c, x0x.a0(fetVar), null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
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
            wfg wfgVar = (wfg) l7m0VarY2.getValue();
            if (Intrinsics.d(wfgVar, ufg.f35575a)) {
                fetVar.e0(-2101162578);
                f(((tfg) l7m0VarY.getValue()).f33863a, function2, fetVar, (i3 >> 3) & 112);
                Object[] objArr3 = new Object[0];
                boolean z3 = i4 == 4;
                Object objP3 = fetVar.P();
                if (z3 || objP3 == cl5Var) {
                    objP3 = new eka(l7m0Var, (byte) 19);
                    fetVar.o0(objP3);
                }
                l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar);
                Object[] objArr4 = new Object[0];
                boolean z4 = i4 == 4;
                Object objP4 = fetVar.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new eka(l7m0Var, (byte) 20);
                    fetVar.o0(objP4);
                }
                H(null, xczVarB, l7m0VarY3, v3c.Y(objArr4, (Function0) objP4, fetVar), function1, fetVar, (i3 << 6) & 57344);
                function2 = function1;
                fetVar.r(false);
            } else {
                if (!(wfgVar instanceof vfg)) {
                    throw b1j.f(-2145992028, fetVar, false);
                }
                fetVar.e0(-2100641189);
                cpm cpmVar = ((tfg) l7m0VarY.getValue()).f33863a;
                apm apmVar = cpmVar instanceof apm ? (apm) cpmVar : null;
                if (apmVar == null || (a4xVar = apmVar.f1259a) == null || !(!a4xVar.isEmpty())) {
                    fetVar.e0(-2100424995);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-2100593170);
                    f(((tfg) l7m0VarY.getValue()).f33863a, function2, fetVar, (i3 >> 3) & 112);
                    fetVar.r(false);
                }
                Object[] objArr5 = new Object[0];
                boolean zI = fetVar.i(wfgVar);
                Object objP5 = fetVar.P();
                if (zI || objP5 == cl5Var) {
                    objP5 = new e8g((vfg) wfgVar, (byte) 7);
                    fetVar.o0(objP5);
                }
                o(v3c.Y(objArr5, (Function0) objP5, fetVar), function2, fetVar, (i3 >> 3) & 112);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function2, i2, (byte) 2);
        }
    }

    public static final void q(mm40 mm40Var, ksm ksmVar, float f2, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i2) {
        ngk0 ngk0Var;
        pz40 pz40Var;
        int i3;
        int i4;
        qw3 qw3Var;
        Object v3l0Var;
        fetVar.g0(748865250);
        int i5 = (i2 & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= fetVar.g(ksmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= fetVar.i(xdrVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            boolean z = (i5 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                lc00 lc00VarB = kotlin.collections.a.b();
                String str = ksmVar.b;
                str.getClass();
                lc00VarB.add(new asm(str));
                a4x<usm> a4xVar = ksmVar.c;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                for (usm usmVar : a4xVar) {
                    usmVar.getClass();
                    arrayList.add(new csm(usmVar));
                }
                lc00VarB.addAll(arrayList);
                String str2 = ksmVar.f18820a;
                str2.getClass();
                lc00VarB.add(new bsm(str2));
                objP = dyb.o0(kotlin.collections.a.a(lc00VarB));
                fetVar.o0(objP);
            }
            a4x a4xVar2 = (a4x) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ngk0();
                fetVar.o0(objP2);
            }
            ngk0 ngk0Var2 = (ngk0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(0L);
                fetVar.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            if (xdrVar != null) {
                i4 = 3670016;
                fetVar.e0(1385463404);
                boolean zG = ((i5 & 3670016) == 1048576) | fetVar.g(xczVarA);
                Object objP4 = fetVar.P();
                if (zG || objP4 == cl5Var) {
                    ngk0Var = ngk0Var2;
                    pz40Var = pz40Var2;
                    i3 = 131072;
                    v3l0Var = new v3l0(pz40Var, xczVarA, ngk0Var, xdrVar, null, (byte) 2);
                    fetVar.o0(v3l0Var);
                } else {
                    ngk0Var = ngk0Var2;
                    pz40Var = pz40Var2;
                    i3 = 131072;
                    v3l0Var = objP4;
                }
                m0x0.t(fetVar, xczVarA, (Function2) v3l0Var);
                fetVar.r(false);
            } else {
                i5 = i5;
                xczVarA = xczVarA;
                ngk0Var = ngk0Var2;
                cl5Var = cl5Var;
                pz40Var = pz40Var2;
                i3 = 131072;
                i4 = 3670016;
                fetVar.e0(1385820896);
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 84.0f), 1.0f);
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
            boolean zG2 = fetVar.g(a4xVar2) | ((i5 & i4) == 1048576) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | ((i5 & 458752) == i3);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == cl5Var) {
                qw3Var = qw3Var2;
                Object q3l0Var = new q3l0(a4xVar2, xdrVar, function1, function0, function2, ngk0Var, pz40Var, (byte) 2);
                fetVar.o0(q3l0Var);
                objP5 = q3l0Var;
            } else {
                qw3Var = qw3Var2;
            }
            b8k0.f(mm40VarD, xczVarA, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP5, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kb3(mm40Var, ksmVar, f2, function1, function0, function2, xdrVar, i2, (byte) 4);
        }
    }

    public static final void r(mm40 mm40Var, jll jllVar, Function0 function0, Function0 function1, fet fetVar, int i2, int i3) {
        int i4;
        int i5;
        Function0 function2;
        Function0 function3;
        fetVar.g0(245951537);
        int i6 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i6 |= fetVar.g(jllVar) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
        } else {
            i4 = i6 | (fetVar.i(function0) ? 256 : 128);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 = i4 | 3072;
        } else {
            i5 = i4 | (fetVar.i(function1) ? 2048 : 1024);
        }
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            Function0 function4 = i7 != 0 ? null : function0;
            Function0 function5 = i8 != 0 ? null : function1;
            if (jllVar instanceof hll) {
                fetVar.e0(-71674420);
                s(mm40Var, (hll) jllVar, function4, function5, fetVar, i5 & 8190);
                fetVar.r(false);
            } else {
                if (!jllVar.equals(ill.f14985a)) {
                    throw b1j.f(136233450, fetVar, false);
                }
                fetVar.e0(-71360545);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 304.0f), 404.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, false);
            }
            function3 = function5;
            function2 = function4;
        } else {
            fetVar.X();
            function2 = function0;
            function3 = function1;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lph(mm40Var, jllVar, function2, function3, i2, i3, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0573  */
    /* JADX WARN: Code duplicated, block: B:74:0x020f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0211  */
    /* JADX WARN: Code duplicated, block: B:81:0x0220  */
    public static final void s(mm40 mm40Var, hll hllVar, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        hll hllVar2;
        fet fetVar2;
        h4d h4dVar;
        Object obj;
        cl5 cl5Var;
        hll hllVar3;
        boolean z;
        boolean z2;
        jm40 jm40Var;
        float f2;
        jm40 jm40Var2;
        fet fetVar3;
        cl5 cl5Var2;
        boolean z3;
        Object objP;
        Function0 function2 = function0;
        fet fetVar4 = fetVar;
        String str = hllVar.b;
        fetVar4.g0(1802442047);
        if ((i2 & 6) == 0) {
            i3 = (fetVar4.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar4.g(hllVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar4.i(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar4.i(function1) ? 2048 : 1024;
        }
        if (fetVar4.U(i3 & 1, (i3 & 1171) != 1170)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var);
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
            jpm0.o(fetVar4, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var3, 304.0f), 224.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarE);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            oll ollVar = hllVar.f;
            String str2 = hllVar.h;
            String str3 = hllVar.i;
            boolean zG = fetVar4.g(ollVar);
            Object objP2 = fetVar4.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (zG || objP2 == cl5Var3) {
                if (!(ollVar instanceof lll) || ((lll) ollVar).f20253a) {
                    h4dVar = null;
                } else {
                    float[] fArrA = g4d.a();
                    g4d.b(fArrA);
                    h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA));
                    h4dVar2.b = fArrA;
                    h4dVar = h4dVar2;
                }
                fetVar4.o0(h4dVar);
                obj = h4dVar;
            } else {
                mw3Var = mw3Var;
                obj = objP2;
            }
            n0q n0qVar = o7k0.c;
            int i4 = i3;
            mw3 mw3Var2 = mw3Var;
            j0x.b(l7x.Y(hllVar.l, null, a8k0.F(R.drawable.aggregator_daily_missions_image_placeholder, 0, fetVar4), null, null, null, fetVar, 512, 506), null, n0qVar, null, gqw0.A, 0.0f, (a4d) obj, fetVar, 25008, 40);
            fet fetVar5 = fetVar;
            mm40 mm40VarM = s5x0.M(n0qVar, 12.0f, 40.0f, 12.0f, 16.0f);
            x5d x5dVarA2 = w5d.a(uc9.d, xx7Var, fetVar5, 6);
            int iHashCode3 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM3 = fetVar5.m();
            mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarM);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(pcyVar);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, x5dVarA2, shdVar);
            jpm0.o(fetVar5, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC2, shdVar4);
            boolean z5 = ollVar instanceof kll;
            if (!z5 || ((kll) ollVar).f18495a) {
                z5 = z5;
                cl5Var = cl5Var3;
                fetVar5.e0(1432579921);
                fetVar5.r(false);
            } else {
                fetVar5.e0(1431807277);
                wkw wkwVar = new wkw(gqw0.o);
                boolean zG2 = fetVar5.g(str2);
                Object objP3 = fetVar5.P();
                if (zG2) {
                    cl5Var2 = cl5Var3;
                } else {
                    cl5Var2 = cl5Var3;
                    if (objP3 == cl5Var2) {
                    }
                    wul wulVar = (wul) objP3;
                    if ((i4 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objP = fetVar5.P();
                    if (z3 || objP == cl5Var2) {
                        objP = new b1i(function1, (byte) 20);
                        fetVar5.o0(objP);
                    }
                    i4 = i4;
                    cl5Var = cl5Var2;
                    qzb.n(wkwVar, wulVar, (Function0) objP, fetVar5, 0, 0);
                    fetVar5.r(false);
                }
                objP3 = new wul(mul.e, oe9.d, new ue9(str2), true, false, false);
                fetVar5.o0(objP3);
                wul wulVar2 = (wul) objP3;
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP = fetVar5.P();
                if (z3) {
                    objP = new b1i(function1, (byte) 20);
                    fetVar5.o0(objP);
                } else {
                    objP = new b1i(function1, (byte) 20);
                    fetVar5.o0(objP);
                }
                i4 = i4;
                cl5Var = cl5Var2;
                qzb.n(wkwVar, wulVar2, (Function0) objP, fetVar5, 0, 0);
                fetVar5.r(false);
            }
            boolean z6 = ollVar instanceof lll;
            if ((z6 || z5) && str != null) {
                hllVar3 = hllVar;
                d(0, fetVar5, rz4.f(fetVar5, 1432665667, 1.0f, true), str, hllVar3.c);
                fetVar5.r(false);
            } else {
                hllVar3 = hllVar;
                fetVar5.e0(1432925137);
                fetVar5.r(false);
            }
            if (ollVar instanceof mll) {
                z = z6;
                z2 = true;
                fetVar5.e0(1434008401);
                fetVar5.r(false);
            } else {
                fetVar5.e0(1433019935);
                z = z6;
                z2 = true;
                jwb.p(s5x0.N(o7k0.d(jm40Var3, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), new qw3(8.0f, true, new jf4((byte) 14)), new qw3(8.0f, true, new jf4((byte) 14)), null, 0, 2, u1c.M(1455523497, new sd8(hllVar3, (byte) 26), fetVar5), fetVar, 1769472, 24);
                fetVar5 = fetVar;
                fetVar5.r(false);
            }
            fetVar5.r(z2);
            fetVar5.r(z2);
            mm40 mm40VarJ = lgb.J(o7k0.e(o7k0.s(jm40Var3, 304.0f), 180.0f), vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarM2 = s5x0.M(i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f, 16.0f, 12.0f, 12.0f);
            x5d x5dVarA3 = w5d.a(mw3Var2, xx7Var, fetVar5, 0);
            int iHashCode4 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM4 = fetVar5.m();
            mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarM2);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(pcyVar);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, x5dVarA3, shdVar);
            jpm0.o(fetVar5, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC3, shdVar4);
            hllVar2 = hllVar;
            if (hllVar2.d != null) {
                fetVar5.e0(651872437);
                mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var3, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                String str4 = hllVar2.d;
                qrq qrqVar = j1t0.b;
                long j2 = qmk.w;
                jm40Var = jm40Var3;
                f2 = 1.0f;
                v8q0.a(str4, mm40VarN, s6t0.b().f33626a.getTextPrimary(), new n05(qmk.r, j2, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.I, 16646109), fetVar, 0, 24960, 110576);
                fetVar.r(false);
            } else {
                jm40Var = jm40Var3;
                f2 = 1.0f;
                fetVar5.e0(652503287);
                fetVar5.r(false);
            }
            v8q0.a(hllVar2.e, s5x0.N(dw9.h(f2, o7k0.d(jm40Var, f2), true), 0.0f, 0.0f, 0.0f, 16.0f, 7), s6t0.b().f33626a.getTextPrimary(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, g1t0.n(), fetVar, 0, 384, 126960);
            fet fetVar6 = fetVar;
            if (z5 != 0) {
                kll kllVar = (kll) ollVar;
                if (!kllVar.b || kllVar.f18495a) {
                    jm40Var2 = jm40Var;
                    fetVar6.e0(655158871);
                    fetVar6.r(false);
                    fetVar3 = fetVar6;
                } else {
                    fetVar6.e0(653298375);
                    mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, f2), 0.0f, 0.0f, 0.0f, 6.0f, 7);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar6, 0);
                    int iHashCode5 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM5 = fetVar6.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar6, mm40VarN2);
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA, shdVar);
                    jpm0.o(fetVar6, bh90VarM5, shdVar2);
                    vqd.u(iHashCode5, fetVar6, shdVar3, fetVar6);
                    jpm0.o(fetVar6, mm40VarC4, shdVar4);
                    v8q0.a(kllVar.d, yyw.U(jm40Var, 0.5f), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar6, 0, 24960, 110584);
                    jm40 jm40Var4 = jm40Var;
                    jm40Var2 = jm40Var4;
                    v8q0.a(kllVar.e, dw9.h(f2, s5x0.N(jm40Var4, 4.0f, 0.0f, 0.0f, 0.0f, 14), true), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
                    fet fetVar7 = fetVar;
                    fetVar7.r(true);
                    snm.b(s5x0.N(o7k0.d(jm40Var2, f2), 0.0f, 0.0f, 0.0f, 16.0f, 7), new unm(tnm.f34243a, s6t0.b().f33626a.getCommerce(), s6t0.b().f33626a.getCommerce(), s6t0.b().f33626a.getBackground(), 6.0f, 6.0f, kllVar.c, 100, true, 512), fetVar7, 0);
                    fetVar7.r(false);
                    fetVar3 = fetVar7;
                }
            } else {
                jm40Var2 = jm40Var;
                fetVar6.e0(655158871);
                fetVar6.r(false);
                fetVar3 = fetVar6;
            }
            if ((ollVar instanceof nll) || ((z && !((lll) ollVar).f20253a) || str3 == null)) {
                function2 = function0;
                fetVar3.e0(656039767);
                fetVar3.r(false);
            } else {
                fetVar3.e0(655261357);
                sul sulVar = ((z && ((lll) ollVar).f20253a) || (z5 && ((kll) ollVar).f18495a)) ? nul.e : lul.e;
                mm40 mm40VarD = o7k0.d(jm40Var2, f2);
                boolean zG3 = fetVar3.g(str3) | fetVar3.g(sulVar);
                Object objP4 = fetVar3.P();
                cl5 cl5Var4 = cl5Var;
                if (zG3 || objP4 == cl5Var4) {
                    wul wulVar3 = new wul(sulVar, oe9.f25112a, new ue9(str3), true, false, true);
                    fetVar3.o0(wulVar3);
                    objP4 = wulVar3;
                }
                wul wulVar4 = (wul) objP4;
                boolean z7 = (i4 & 896) == 256;
                Object objP5 = fetVar3.P();
                if (z7 || objP5 == cl5Var4) {
                    function2 = function0;
                    objP5 = new b1i(function2, (byte) 21);
                    fetVar3.o0(objP5);
                } else {
                    function2 = function0;
                }
                qzb.n(mm40VarD, wulVar4, (Function0) objP5, fetVar3, 6, 0);
                fetVar3.r(false);
            }
            fetVar3.r(true);
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            hllVar2 = hllVar;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 5, i2, (Object) mm40Var, (Object) hllVar2, (Object) function2, (Object) function1);
        }
    }

    public static final void t(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-920728415);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(o7k0.c);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwy(function1, (byte) 2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 15);
        }
    }

    public static final void u(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(3681249);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = ufx.E(fetVar, o7k0.c);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nr0(function1, (byte) 5);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 0);
        }
    }

    public static final void v(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-960919695);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i0a0(function1, (byte) 6);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i3 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 24);
        }
    }

    public static final void w(mm40 mm40Var, l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(-1742809048);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(qdzVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVarA, l7m0Var, null, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 26.0f, 7), fetVar), false, null, u1c.M(-1487231898, new rkb(function1, qdzVar, (byte) 2), fetVar), fetVar, ((i3 << 3) & 896) | 113246208, 88);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 28, i2, (Object) mm40Var2, (Object) l7m0Var, (Object) qdzVar, (Object) function1);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 a.fet, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void x(mm40 mm40Var, h72 h72Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(2021574378);
        int i3 = i2 | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.g(h72Var) ? 32 : 16) | (fetVar3.g(qdzVar) ? 256 : 128) | (fetVar3.i(function1) ? 2048 : 1024);
        if (fetVar3.U(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) fetVar3.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar3);
            e2d e2dVarD = nip.d(null, null, fetVar3, 7);
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zI = fetVar3.i(window) | fetVar3.i(context) | fetVar3.h(zC);
            Object objP = fetVar3.P();
            byte b2 = 3;
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new la2(window, context, zC, b2);
                fetVar3.o0(objP);
            }
            s0x.d(boolValueOf, null, (Function1) objP, fetVar3, 0);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            mm40 mm40VarX = yyw.X(jm40.b, null, fetVar3, 1);
            qim qimVar = h72Var.f12555a;
            boolean z2 = (i3 & 7168) == 2048;
            Object objP2 = fetVar3.P();
            if (z2 || objP2 == obj) {
                objP2 = new i1y(function1, (byte) 14);
                fetVar3.o0(objP2);
            }
            ckb.k(mm40VarX, qimVar, true, e2dVarD, null, (Function1) objP2, fetVar3, 24960, 0);
            fet fetVar4 = fetVar3;
            mm40 mm40VarC = nip.c(i120.Q(n0qVar, ((ThemeColors) fetVar4.k(zaq0.b)).getBackground(), jd8.n), e2dVarD, fetVar4, 0);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarC);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            afb afbVar = h72Var.b;
            if (afbVar instanceof yeb) {
                fetVar4.e0(266760164);
                t(null, ((yeb) afbVar).f42477a, function1, fetVar4, (i3 >> 3) & 896);
                fetVar4.r(false);
            } else {
                if (afbVar instanceof zeb) {
                    fetVar4.e0(-545579775);
                    K(null, (zeb) afbVar, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    if (!(afbVar instanceof xeb)) {
                        throw b1j.f(-545586568, fetVar4, false);
                    }
                    fetVar4.e0(266983054);
                    m(null, (xeb) afbVar, h72Var.c, h72Var.d, e2dVarD, qdzVar, function1, fetVar4, (i3 << 9) & 4128768);
                    fetVar4.r(false);
                }
                fetVar4.r(r21);
                fetVar4.r(true);
                fetVar2 = fetVar4;
            }
            fetVar4.r(r21);
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 12, i2, (Object) mm40Var, (Object) h72Var, (Object) qdzVar, (Object) function1);
        }
    }

    public static final void y(wlp wlpVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-739625991);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(wlpVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            L(u1c.M(1349278953, new sd8(wlpVar, (byte) 10), fetVar), fetVar, (i3 & 14) | 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(wlpVar, i2);
        }
    }

    public static final void z(int i2, fet fetVar) {
        fetVar.g0(-2009352235);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            xdx.h(0, fetVar, s5x0.N(jm40.b, xfn.a(fetVar).e, 12.0f, xfn.a(fetVar).e, 0.0f, 8).e(o7k0.c));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i2, (byte) 21);
        }
    }

    public abstract long W(ViewGroup viewGroup, gms0 gms0Var, mns0 mns0Var, mns0 mns0Var2);
}
