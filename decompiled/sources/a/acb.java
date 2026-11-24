package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.CommonCode;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleDicePoker;

/* JADX INFO: loaded from: classes6.dex */
public abstract class acb {
    public static final void A(mm40 mm40Var, aqh aqhVar, int i, fet fetVar, int i2) {
        fetVar.g0(-444617155);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(aqhVar) ? 32 : 16) | (fetVar.e(i) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            String str = aqhVar.f1295a;
            long j = aqhVar.c ? iph.g : iph.h;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40Var, j, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, (i3 << 3) & 112, ((i3 >> 6) & 14) | 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph((byte) 1, i, i2, mm40Var, aqhVar);
        }
    }

    public static final void B(mm40 mm40Var, String str, boolean z, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        mm40 mm40Var2;
        fetVar.g0(164189056);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new LinkedHashSet();
                fetVar.o0(objP);
            }
            Set set = (Set) objP;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = Boolean.valueOf(!set.contains(str));
                fetVar.o0(objP2);
            }
            boolean zBooleanValue = ((Boolean) objP2).booleanValue();
            int i4 = i2 & 896;
            boolean z3 = (i3 == 32) | (i4 == 256);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == obj) {
                objP3 = xf0.c((z && zBooleanValue) ? 1.0f : 0.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var = (t33) objP3;
            boolean zI = fetVar.i(t33Var) | fetVar.d(fB);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                objP4 = new ntf(b, fB, t33Var);
                fetVar.o0(objP4);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = ffb0.P(jm40Var, (Function1) objP4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
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
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar, 6);
            fetVar.r(true);
            boolean zI2 = fetVar.i(set) | (i3 == 32);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == obj) {
                objP5 = new otf(set, str, (byte) 1);
                fetVar.o0(objP5);
            }
            m0x0.D((Function0) objP5, fetVar);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI3 = fetVar.i(t33Var) | (i4 == 256) | fetVar.h(zBooleanValue);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj) {
                Object qtfVar = new qtf(z, t33Var, zBooleanValue, null, (byte) 1);
                fetVar.o0(qtfVar);
                objP6 = qtfVar;
            }
            m0x0.v(str, boolValueOf, (Function2) objP6, fetVar);
            mm40Var2 = jm40Var;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ptf(mm40Var2, str, z, ugdVar2, i, (byte) 1);
        }
    }

    public static final void C(a4x a4xVar, fet fetVar, int i) {
        a4x a4xVar2;
        yje yjeVar;
        fetVar.g0(-675321888);
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(192.0f, fetVar);
            }
            float f = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = twn.j(4.0f, fetVar);
            }
            float f2 = ((ycl) objP2).f42389a;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            gy40 gy40Var = xczVarA.g;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.b(a4xVar.size());
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var = (cgk0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP5);
            }
            pz40 pz40Var2 = (pz40) objP5;
            float fW0 = ((w6k) fetVar.k(bmd.h)).w0(f2 + f);
            boolean zE = fetVar.e(a4xVar.size());
            Object objP6 = fetVar.P();
            if (zE || objP6 == obj) {
                objP6 = Boolean.valueOf((a4xVar.size() <= cgk0Var.l() || ((Boolean) pz40Var.getValue()).booleanValue() || ((Boolean) pz40Var2.getValue()).booleanValue()) ? false : true);
                fetVar.o0(objP6);
            }
            Boolean bool = (Boolean) objP6;
            boolean zBooleanValue = bool.booleanValue();
            boolean zE2 = fetVar.e(a4xVar.size());
            Object objP7 = fetVar.P();
            if (zE2 || objP7 == obj) {
                djv djvVar = (djv) CollectionsKt.f0(a4xVar);
                objP7 = djvVar != null ? djvVar.f6204a : null;
                fetVar.o0(objP7);
            }
            String str = (String) objP7;
            mm40 mm40VarG = aad.G(o7k0.d(jm40.b, 1.0f), xfn.a(fetVar).c, xfn.a(fetVar).c);
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar).c, 0.0f, xfn.a(fetVar).c, 0.0f, 10);
            zcl zclVar3 = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            int i3 = i2 & 14;
            boolean zH = (i3 == 4) | fetVar.h(zBooleanValue) | fetVar.g(str);
            Object objP8 = fetVar.P();
            if (zH || objP8 == obj) {
                objP8 = new xs8(a4xVar, zBooleanValue, str, f);
                fetVar.o0(objP8);
            }
            b8k0.f(mm40VarG, xczVarA, lh80VarU, false, qw3Var, null, null, false, null, (Function1) objP8, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            boolean zG = fetVar.g(gy40Var);
            Object objP9 = fetVar.P();
            if (zG || objP9 == obj) {
                objP9 = new ttf(gy40Var, pz40Var2, null, (byte) 2);
                fetVar.o0(objP9);
            }
            m0x0.t(fetVar, gy40Var, (Function2) objP9);
            Unit unit = Unit.f46060a;
            boolean zG2 = fetVar.g(xczVarA) | (i3 == 4);
            Object objP10 = fetVar.P();
            if (zG2 || objP10 == obj) {
                yjeVar = null;
                a4xVar2 = a4xVar;
                objP10 = new b18(a4xVar2, xczVarA, yjeVar, (byte) 3);
                fetVar.o0(objP10);
            } else {
                yjeVar = null;
                a4xVar2 = a4xVar;
            }
            m0x0.t(fetVar, unit, (Function2) objP10);
            Integer numValueOf = Integer.valueOf(cgk0Var.l());
            boolean zG3 = fetVar.g(xczVarA) | fetVar.d(fW0);
            Object objP11 = fetVar.P();
            if (zG3 || objP11 == obj) {
                objP11 = new utf(xczVarA, fW0, pz40Var2, yjeVar, (byte) 1);
                fetVar.o0(objP11);
            }
            m0x0.v(bool, numValueOf, (Function2) objP11, fetVar);
            boolean z = i3 == 4;
            Object objP12 = fetVar.P();
            if (z || objP12 == obj) {
                objP12 = new mtf(a4xVar2, cgk0Var, pz40Var, (byte) 1);
                fetVar.o0(objP12);
            }
            m0x0.D((Function0) objP12, fetVar);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar2, i, (byte) 14);
        }
    }

    public static final void D(mm40 mm40Var, bye byeVar, boolean z, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1436532023);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= fetVar2.g(byeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i4 != 0 ? jm40Var : mm40Var2;
            if (byeVar instanceof vxe) {
                fetVar2.e0(671640215);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarY = y860.Y(o7k0.e(mm40Var3, 32.0f), false, null, null, function0, 15);
                thg0 thg0VarA = shg0.a(z ? uc9.b : uc9.f35418a, gqw0.k, fetVar2, 48);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
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
                v8q0.a(((vxe) byeVar).f38194a, null, 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.s, null, j1t0.f15753a, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 24960, 109566);
                fetVar2 = fetVar;
                dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                fetVar2.r(true);
                fetVar2.r(false);
            } else if (byeVar.equals(zxe.f45153a)) {
                fetVar2.e0(1822814215);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarP = o7k0.p(jm40Var, 72.0f, 18.0f);
                zcl zclVar3 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarP), vbc.d0(null, fetVar2, 0, 1), fetVar2, false);
            } else {
                fetVar2.e0(1822822203);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ue(mm40Var3, byeVar, z, function0, i, i2);
        }
    }

    public static final void E(mm40 mm40Var, nxe nxeVar, bye byeVar, Function0 function0, fet fetVar, int i) {
        nxe nxeVar2;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        function0.getClass();
        fetVar2.g0(-1774653162);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(nxeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(byeVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 40.0f), 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            if (0.4f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            D(null, byeVar, false, function0, fetVar2, ((i2 >> 3) & 112) | 384 | (i2 & 7168), 1);
            qxw.o(fetVar2, i120.Q(o7k0.e(o7k0.s(jm40Var, 1.0f), 12.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator(), jd8.n));
            mm40Var = jm40Var;
            pcy pcyVar3 = pcyVar;
            int i3 = i2;
            v8q0.a(rsm0.w(R.string.coefficient_with_dots_new, 0, fetVar2), null, 0L, new n05(idm0.t(8), idm0.t(12), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar2, 0, 24960, 109558);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
            if (0.6f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, x7zVar2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            nxeVar2 = nxeVar;
            f(null, nxeVar2, fetVar2, i3 & 112, 1);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            nxeVar2 = nxeVar;
            fetVar2.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 19, i, (Object) mm40Var2, (Object) nxeVar2, (Object) byeVar, (Object) function0);
        }
    }

    public static final void F(String str, bye byeVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        function0.getClass();
        fetVar2.g0(520075502);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(byeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 40.0f), 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            if (0.4f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2;
            v8q0.a(str, new x7z(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true), 0L, new n05(idm0.t(8), idm0.t(12), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, i2 & 14, 24960, 109556);
            if (0.6f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            float f = 0.6f;
            if (0.6f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            fetVar2 = fetVar;
            D(new x7z(f, true), byeVar, true, function0, fetVar2, (i3 & 112) | 384 | ((i3 << 3) & 7168), 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(str, byeVar, function0, i, (byte) 13);
        }
    }

    public static final void G(lc00 lc00Var, int i, omg omgVar, ctf0 ctf0Var, List list) {
        String strA;
        String strA2;
        ctf0 ctf0Var2 = ctf0Var;
        omgVar.getClass();
        ctf0Var2.getClass();
        list.getClass();
        kmg kmgVar = (kmg) CollectionsKt.W(i, omgVar.i);
        if (kmgVar != null) {
            e8h e8hVar = kmgVar.d;
            String str = e8hVar.b;
            e8h e8hVar2 = kmgVar.c;
            String str2 = e8hVar2.b;
            if (str2.length() == 0 || str.length() == 0) {
                return;
            }
            List list2 = kmgVar.n;
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ils ilsVar = (ils) it.next();
                ilsVar.getClass();
                String str3 = ilsVar.f;
                mls mlsVar = ilsVar.f14994a;
                int iOrdinal = mlsVar.ordinal();
                String strL = "";
                Iterator it2 = it;
                if (iOrdinal == 0) {
                    strA = "";
                } else if (iOrdinal == 1) {
                    strA = ctf0Var2.b.a(R.string.dota_rune_activated_title, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal == 2) {
                    strA = ctf0Var2.b.a(R.string.destroy_tower_action_title, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                    strA = ctf0Var2.b.a(R.string.kill_action_title, Arrays.copyOf(new Object[0], 0));
                }
                String str4 = ilsVar.i;
                String strL2 = ilsVar.h;
                String str5 = strA;
                if (rls.f30713a[mlsVar.ordinal()] == 1) {
                    lsm0 lsm0Var = ctf0Var2.b;
                    String strA3 = lsm0Var.a(R.string.dota_rune_title, Arrays.copyOf(new Object[0], 0));
                    switch (strL2) {
                        case "Shield":
                            strA2 = lsm0Var.a(R.string.dota_shield_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Wisdom":
                            strA2 = lsm0Var.a(R.string.dota_wisdom_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Invisibility":
                            strA2 = lsm0Var.a(R.string.dota_invisibility_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Illusion":
                            strA2 = lsm0Var.a(R.string.dota_illusion_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Double Damage":
                            strA2 = lsm0Var.a(R.string.dota_double_damage_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Haste":
                            strA2 = lsm0Var.a(R.string.dota_haste_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Water":
                            strA2 = lsm0Var.a(R.string.dota_water_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Regeneration":
                            strA2 = lsm0Var.a(R.string.dota_regeneration_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Arcane":
                            strA2 = lsm0Var.a(R.string.dota_arcane_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        case "Bounty":
                            strA2 = lsm0Var.a(R.string.dota_bounty_rune, Arrays.copyOf(new Object[0], 0));
                            break;
                        default:
                            strA2 = "";
                            break;
                    }
                    strL2 = kng0.l(strA3, Separators.SP, sj3.N(strA2));
                }
                long j = ilsVar.b;
                if (j >= 0) {
                    rdj rdjVar = rdj.f30294a;
                    strL = kng0.l(Separators.LPAREN, rdj.h(new znq0(j), ykq0.UNIQUE_2, Boolean.TRUE, null, 248), Separators.RPAREN);
                }
                arrayList.add(new sls(str3, str5, str4, strL2, strL, ilsVar.c));
                it = it2;
                ctf0Var2 = ctf0Var;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                sls slsVar = (sls) obj;
                if (slsVar.b.length() > 0 && slsVar.e.length() > 0 && slsVar.d.length() > 0) {
                    arrayList2.add(obj);
                }
            }
            i4 i4VarR0 = dyb.r0(arrayList2);
            if (i4VarR0.isEmpty()) {
                return;
            }
            lc00Var.add(new uls(new tls(tnq0.l(e8hVar2, list), str2), new tls(tnq0.l(e8hVar, list), str), kmgVar.h, i4VarR0));
        }
    }

    public static final void H(FrameLayout frameLayout, List list, List list2) {
        int dimensionPixelSize = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.size_34);
        int dimensionPixelSize2 = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.size_46);
        int dimensionPixelSize3 = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.space_24);
        Iterator it = new ihu0(frameLayout).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            jhu0 jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                for (Object obj : list) {
                    int i3 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    int i4 = ((una0) obj).f35951a;
                    ImageView imageView = (ImageView) CollectionsKt.W(i, list2);
                    if (imageView == null) {
                        imageView = new ImageView(frameLayout.getContext());
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
                        frameLayout.addView(imageView);
                        list2.add(imageView);
                    }
                    ImageView imageView2 = imageView;
                    sj3.L0(imageView2, dimensionPixelSize3 * i, 0, 0, 0, 14);
                    imageView2.setImageResource(i4);
                    i = i3;
                }
                return;
            }
            Object next = jhu0Var.next();
            int i5 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            ((View) next).setVisibility(i2 < list.size() ? 0 : 8);
            i2 = i5;
        }
    }

    public static final void I(e8o0 e8o0Var, cjj0 cjj0Var) {
        TextView textView = e8o0Var.h;
        xij0 xij0Var = cjj0Var.e;
        textView.setText(xij0Var.f40948a);
        textView.setVisibility(xij0Var.b ? 0 : 8);
    }

    public static final void J(e8o0 e8o0Var, tkz tkzVar, cjj0 cjj0Var) {
        SyntheticTimerView syntheticTimerView = e8o0Var.e;
        ajj0 ajj0Var = cjj0Var.g;
        syntheticTimerView.setTimerDescription(ajj0Var.b);
        SyntheticTimerView.b(syntheticTimerView, ajj0Var.f979a, tkzVar, ajj0Var.d, 4);
        syntheticTimerView.setVisibility(ajj0Var.c ? 0 : 8);
    }

    public static final void K(EventCardMiddleDicePoker eventCardMiddleDicePoker, fus fusVar) {
        boolean z = fusVar.b;
        boolean z2 = fusVar.f10180a;
        l7n l7nVar = z ? l7n.f19567a : l7n.b;
        eventCardMiddleDicePoker.setTimerVisibility(z2);
        eventCardMiddleDicePoker.setHideAfterFinished(true);
        eventCardMiddleDicePoker.setTimeDirection(l7nVar);
        eventCardMiddleDicePoker.setTime(TimeUnit.SECONDS.toMillis(dtb.T(fusVar)));
        tbc tbcVar = eventCardMiddleDicePoker.q;
        if (z2) {
            ((DsTimer) tbcVar.h).d();
            return;
        }
        DsTimer dsTimer = (DsTimer) tbcVar.h;
        dsTimer.l = false;
        dsTimer.g.removeCallbacks(dsTimer.w);
    }

    public static final a4x L(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayList<xif> arrayList = new ArrayList(5);
        int i = 0;
        while (i < 5) {
            arrayList.add((xif) ((i < 0 || i >= list.size()) ? new xif("", "", "", "", "", 0L) : list.get(i)));
            i++;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (xif xifVar : arrayList) {
            String str2 = xifVar.f40942a;
            arrayList2.add(new hfa0(ijg.i, str2, xifVar.d, xifVar.e, xifVar.f, str2.equals(str)));
        }
        return dyb.o0(arrayList2);
    }

    public static void M(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static final int N(long j, long j2) {
        boolean zU = U(j);
        if (zU != U(j2)) {
            return zU ? -1 : 1;
        }
        int iSignum = (int) Math.signum(R(j) - R(j2));
        if (Math.min(R(j), R(j2)) >= 0.0f && T(j) != T(j2)) {
            return T(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] O(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static final axe P(Fragment fragment) {
        Fragment fragmentP0 = fragment.p0();
        return fragmentP0 instanceof axe ? (axe) fragmentP0 : P(fragmentP0);
    }

    public static final int Q(n97 n97Var) {
        n97Var.getClass();
        Integer num = n97Var.i;
        List list = n97Var.p;
        int iA = q4f.d.a();
        int i = 0;
        if (num == null || num.intValue() != iA) {
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        if (list != null) {
            if (list.isEmpty()) {
                return 0;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l = ((wgo) it.next()).h;
                if (l == null || l.longValue() != 1) {
                    i++;
                    if (i < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
        }
        return i;
    }

    public static final float R(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean S(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = ((cas) it.next()).c;
            if (list2 != null && (!list2.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean T(long j) {
        return (j & 2) != 0;
    }

    public static final boolean U(long j) {
        return (j & 1) != 0;
    }

    public static final boolean V(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            if (cls.getName().equals(fgy.f9517a.f32934a.f34663a)) {
                return true;
            }
        }
        return false;
    }

    public static final long W(uxm uxmVar) {
        uxmVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = uxmVar.c;
        fgm fgmVar = fgm.f9498a;
        long j = uxmVar.f36447a;
        if (z) {
            long j2 = j - jCurrentTimeMillis;
            if (j2 >= 0) {
                return j2;
            }
        } else {
            long j3 = j - (jCurrentTimeMillis - uxmVar.b);
            if (j3 >= 0) {
                return j3;
            }
        }
        return 0L;
    }

    public static boolean X(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final wkm Y(boolean z) {
        long secondary;
        int i = z ? R.drawable.ic_glyph_video_active : R.drawable.ic_glyph_video_inactive;
        if (z) {
            pz40 pz40Var = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getPrimary();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getSecondary();
        }
        return new wkm(CommonCode.BusInterceptor.PRIVACY_CANCEL, i, true, ra50.f30118a, secondary);
    }

    public static final wkm Z(boolean z) {
        long secondary;
        int i = z ? R.drawable.ic_filter_active : R.drawable.ic_filter_inactive;
        if (z) {
            pz40 pz40Var = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getPrimary();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getSecondary();
        }
        return new wkm(1003, i, true, ra50.f30118a, secondary);
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(448000929);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            b(0, fetVar, null);
            c(0, fetVar, null, rsm0.w(R.string.auto_sub_title, 0, fetVar));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 11);
        }
    }

    public static final ufs a0(mbr mbrVar) {
        mbrVar.getClass();
        return new ufs(mbrVar.f21521a, mbrVar.b, mbrVar.c, mbrVar.e, mbrVar.f, mbrVar.i, mbrVar.h);
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-1228499608);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_move_horizontal_small, 6, fetVar), fetVar), null, i120.Q(o7k0.n(jm40Var, 14.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), vgg0.f37379a), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 10);
        }
    }

    public static final z0w b0(wgo wgoVar) {
        w0w w0wVar;
        List list;
        Integer num;
        String string;
        List list2;
        List list3;
        wgoVar.getClass();
        Long l = wgoVar.h;
        Integer num2 = wgoVar.J;
        Integer num3 = wgoVar.I;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num4 = wgoVar.i;
        int iIntValue = num4 != null ? num4.intValue() : 0;
        String str = wgoVar.g;
        String str2 = str == null ? "" : str;
        Double d = wgoVar.s;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str3 = wgoVar.t;
        if (str3 == null) {
            str3 = "";
        }
        Long l2 = wgoVar.d;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Boolean bool = wgoVar.L;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Long l3 = wgoVar.f39126a;
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        String str4 = wgoVar.b;
        String str5 = str4 == null ? "" : str4;
        svn svnVar = wgoVar.z;
        if (svnVar != null) {
            switch (svnVar) {
                case svn.NONE:
                    w0wVar = w0w.f38369a;
                    break;
                case svn.LOST:
                    w0wVar = w0w.b;
                    break;
                case svn.WIN:
                    w0wVar = w0w.c;
                    break;
                case svn.RETURN_FULL:
                    w0wVar = w0w.d;
                    break;
                case svn.RETURN:
                    w0wVar = w0w.e;
                    break;
                case svn.WIN_RETURN_HALF:
                    w0wVar = w0w.f;
                    break;
                case svn.RETURN_HALF:
                    w0wVar = w0w.g;
                    break;
                case svn.RESULT:
                    w0wVar = w0w.h;
                    break;
                default:
                    t9f.b();
                    return null;
            }
        } else {
            w0wVar = w0w.f38369a;
        }
        w0w w0wVar2 = w0wVar;
        Boolean bool2 = wgoVar.M;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Long l4 = wgoVar.c;
        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
        String str6 = wgoVar.k;
        if (str6 == null) {
            str6 = "";
        }
        Long l5 = wgoVar.l;
        long jLongValue5 = l5 != null ? l5.longValue() : 0L;
        List list4 = wgoVar.m;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        String str7 = wgoVar.n;
        if (str7 == null) {
            str7 = "";
        }
        Long l6 = wgoVar.o;
        long jLongValue6 = l6 != null ? l6.longValue() : 0L;
        String str8 = str3;
        List list5 = wgoVar.p;
        if (list5 == null) {
            list5 = iun.f15405a;
        }
        if (num3 == null || num2 == null) {
            list = list5;
            num = num3;
            string = wgoVar.K;
            if (string == null) {
                string = "";
            }
        } else {
            list = list5;
            StringBuilder sb = new StringBuilder();
            sb.append(num3);
            num = num3;
            sb.append(" : ");
            sb.append(num2);
            string = sb.toString();
        }
        Long l7 = wgoVar.e;
        long jLongValue7 = l7 != null ? l7.longValue() : 0L;
        String str9 = wgoVar.f;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = string;
        Integer num5 = wgoVar.q;
        int iIntValue2 = num5 != null ? num5.intValue() : 0;
        String str11 = wgoVar.v;
        String str12 = str11 == null ? "" : str11;
        Integer num6 = wgoVar.N;
        long jIntValue = num6 != null ? num6.intValue() : 0L;
        Boolean bool3 = wgoVar.A;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        String str13 = wgoVar.B;
        if (str13 == null) {
            str13 = "";
        }
        boolean z = zBooleanValue3;
        String str14 = wgoVar.x;
        String str15 = str14 == null ? "" : str14;
        String str16 = wgoVar.w;
        String str17 = str16 == null ? "" : str16;
        String str18 = wgoVar.C;
        String str19 = str18 == null ? "" : str18;
        String str20 = wgoVar.r;
        String str21 = str20 == null ? "" : str20;
        Long l8 = wgoVar.D;
        long jLongValue8 = l8 != null ? l8.longValue() : 0L;
        Double d2 = wgoVar.E;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Long l9 = wgoVar.G;
        long jLongValue9 = l9 != null ? l9.longValue() : 0L;
        Integer num7 = wgoVar.S;
        int iIntValue3 = num7 != null ? num7.intValue() : 0;
        Double d3 = wgoVar.T;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        Integer num8 = wgoVar.V;
        int iIntValue4 = num8 != null ? num8.intValue() : 0;
        String str22 = wgoVar.H;
        String str23 = str22 == null ? "" : str22;
        String str24 = wgoVar.Q;
        String str25 = str24 == null ? "" : str24;
        String str26 = wgoVar.P;
        String str27 = str26 == null ? "" : str26;
        List list6 = wgoVar.W;
        if (list6 == null) {
            list6 = iun.f15405a;
        }
        List list7 = list6;
        List list8 = wgoVar.X;
        if (list8 == null) {
            list8 = iun.f15405a;
        }
        List list9 = list8;
        String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
        String str28 = strValueOf == null ? "" : strValueOf;
        kga0 kga0Var = wgoVar.F;
        boolean z2 = (kga0Var == null || (list2 = kga0Var.f18229a) == null || list2.isEmpty() || (list3 = kga0Var.b) == null || list3.isEmpty()) ? false : true;
        String strValueOf2 = num2 != 0 ? String.valueOf(num2.intValue()) : null;
        return new z0w(jLongValue, str2, iIntValue, dDoubleValue, str8, jLongValue2, zBooleanValue, jLongValue4, jLongValue3, str5, w0wVar2, zBooleanValue2, str6, jLongValue5, list4, str7, jLongValue6, list, str10, jLongValue7, str9, iIntValue2, str12, str21, jIntValue, z, str13, str15, str17, dDoubleValue2, z2, jLongValue9, jLongValue8, str19, iIntValue4, iIntValue3, dDoubleValue3, str23, str25, str27, list7, list9, str28, strValueOf2 == null ? "" : strValueOf2);
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-633745676);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, (i2 >> 3) & 14, 24960, 110588);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str2, i, (byte) 18);
        }
    }

    public static final ArrayList c0(f5h f5hVar, Map map, boolean z, List list, List list2, boolean z2, boolean z3, String str, boolean z4, boolean z5) {
        List listV;
        Long l;
        Long l2;
        List listV2;
        Long l3;
        Long l4;
        f5hVar.getClass();
        map.getClass();
        list.getClass();
        list2.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        List<cas> list3 = f5hVar.C;
        Long l5 = f5hVar.f8961a;
        gdh gdhVar = f5hVar.x;
        int i = 10;
        if (list3 != null && (!list3.isEmpty())) {
            o530 o530Var = (o530) map.get(l5);
            List list4 = o530Var != null ? o530Var.b : null;
            if (list4 == null) {
                list4 = iun.f15405a;
            }
            List list5 = list4;
            String str2 = f5hVar.g;
            long jLongValue = l5 != null ? l5.longValue() : 0L;
            long jLongValue2 = l5 != null ? l5.longValue() : 0L;
            long jLongValue3 = (gdhVar == null || (l4 = gdhVar.f11103a) == null) ? 0L : l4.longValue();
            boolean z6 = list3 != null && S(list3);
            if (list3 != null) {
                ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                for (cas casVar : list3) {
                    long jLongValue4 = l5 != null ? l5.longValue() : 0L;
                    long jLongValue5 = (gdhVar == null || (l3 = gdhVar.f11103a) == null) ? 0L : l3.longValue();
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(x2x.o0(casVar, z, jLongValue4, jLongValue5, z3, list5, list, list2, str, z2, z4, z5));
                    arrayList2 = arrayList3;
                }
                listV2 = vbc.V(arrayList2, list5);
            } else {
                listV2 = iun.f15405a;
            }
            arrayList.add(new xum0(jLongValue, jLongValue2, jLongValue3, str2, listV2, z6));
        }
        List<zxm0> list6 = f5hVar.J;
        if (list6 != null) {
            ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
            for (zxm0 zxm0Var : list6) {
                long jLongValue6 = l5 != null ? l5.longValue() : 0L;
                long jLongValue7 = (gdhVar == null || (l2 = gdhVar.f11103a) == null) ? 0L : l2.longValue();
                Long l6 = zxm0Var.f45167a;
                List list7 = zxm0Var.d;
                o530 o530Var2 = (o530) map.get(l6);
                List list8 = o530Var2 != null ? o530Var2.b : null;
                if (list8 == null) {
                    list8 = iun.f15405a;
                }
                List list9 = list8;
                String str3 = zxm0Var.b;
                long jLongValue8 = l6 != null ? l6.longValue() : 0L;
                boolean z7 = list7 != null && S(list7);
                if (list7 != null) {
                    ArrayList arrayList5 = new ArrayList(r3d.q(list7, i));
                    Iterator it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(x2x.o0((cas) it.next(), z, l6 != null ? l6.longValue() : 0L, (gdhVar == null || (l = gdhVar.f11103a) == null) ? 0L : l.longValue(), z3, list9, list, list2, str, z2, z4, z5));
                    }
                    listV = vbc.V(arrayList5, list9);
                } else {
                    listV = iun.f15405a;
                }
                arrayList4.add(Boolean.valueOf(arrayList.add(new xum0(jLongValue8, jLongValue6, jLongValue7, str3, listV, z7))));
                i = 10;
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Long.valueOf(((xum0) obj).b))) {
                arrayList6.add(obj);
            }
        }
        return arrayList6;
    }

    public static final void d(mm40 mm40Var, plp plpVar, fet fetVar, int i) {
        plpVar.getClass();
        fetVar.g0(-1110997370);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(plpVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            kjm kjmVar = kjm.b;
            ojm ojmVar = new ojm(127);
            String str = plpVar.b;
            boolean z = plpVar.f;
            p1l0 p1l0Var = p1l0.SPORT_ICON;
            nkb.h(mm40Var, new hjm(str, ojmVar, null, new n0x(plpVar.e), null, new m0x(R.drawable.ic_glyph_category_new, null, 6), false, null, null, z, null, null, 7636), kjmVar, null, null, null, fetVar, (i2 & 14) | 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, plpVar, i, (byte) 13);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1035107843);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        byte b = 14;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b)), gqw0.m, fetVar, 0);
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
            fetVar.e0(926179705);
            for (int i3 = 0; i3 < 8; i3++) {
                z(i3 % 2 == 0 ? 3 : 2, 0, fetVar);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, b);
        }
    }

    public static final void f(mm40 mm40Var, nxe nxeVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(-407913330);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(nxeVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40Var2 = i4 != 0 ? jm40Var : mm40Var;
            tj30 tj30VarC = zq8.c(gqw0.c, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            if (nxeVar.equals(kxe.f19050a)) {
                fetVar.e0(-2095878356);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarP = o7k0.p(jm40Var, 72.0f, 18.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar, 0, 1), fetVar, false);
            } else {
                fetVar.e0(-2095866835);
                plc.d(null, nxeVar.f24279a, new exe(), fetVar, 0, 1);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02(mm40Var2, (Object) nxeVar, i, i2, (byte) 5);
        }
    }

    public static final void g(nxe nxeVar, fet fetVar, int i) {
        nxe nxeVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1292906796);
        int i2 = i | (fetVar2.g(nxeVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 40.0f), 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(rsm0.w(R.string.coefficient_with_dots_new, 0, fetVar2), new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, new n05(idm0.t(8), idm0.t(12), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 109556);
            fetVar2 = fetVar;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            nxeVar2 = nxeVar;
            f(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), nxeVar2, fetVar2, (i2 << 3) & 112, 0);
            fetVar2.r(true);
        } else {
            nxeVar2 = nxeVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cnc(nxeVar2, i, (byte) 19);
        }
    }

    public static final void h(final h9d h9dVar, mm40 mm40Var, fet fetVar, int i) {
        h9dVar.getClass();
        fetVar.g0(1209877379);
        int i2 = i | (fetVar.g(h9dVar) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            final mm40 mm40VarL = s5x0.L(s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 6.0f, 1);
            mbc.f(mm40Var, 0.0f, 0.0f, u1c.M(991942312, new xdr() { // from class: a.x9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    h9d h9dVar2 = h9dVar;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b3) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 4.0f, 6.0f, 1), 24.0f), h9dVar2.f12669a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, s5x0.M(jm40.b, 52.0f, 6.0f, 4.0f, 6.0f), h9dVar2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1183974009, new xdr() { // from class: a.x9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    h9d h9dVar2 = h9dVar;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b3) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 4.0f, 6.0f, 1), 24.0f), h9dVar2.f12669a);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar3 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, s5x0.M(jm40.b, 52.0f, 6.0f, 4.0f, 6.0f), h9dVar2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, null, null, null, u1c.M(97291589, new xdr() { // from class: a.y9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    h9d h9dVar2 = h9dVar;
                    mm40 mm40Var2 = mm40VarL;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b3) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, h9dVar2.c.f17910a), h9dVar2.c.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, h9dVar2.d.f17910a), h9dVar2.d.a());
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-2078624732, new xdr() { // from class: a.y9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    h9d h9dVar2 = h9dVar;
                    mm40 mm40Var2 = mm40VarL;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b3) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, h9dVar2.c.f17910a), h9dVar2.c.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, h9dVar2.d.f17910a), h9dVar2.d.a());
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i2 >> 3) & 14) | 1769472, 432, 1950);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(h9dVar, mm40Var, i);
        }
    }

    public static final void i(mm40 mm40Var, jph jphVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-702460665);
        int i2 = i | 6 | (fetVar2.g(jphVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 48.0f), 0.0f, 8.0f, 1);
            byte b = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarS = o7k0.s(jm40Var, 80.0f);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4(b)), yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            aqh aqhVar = jphVar.b;
            aqh aqhVar2 = jphVar.c;
            vfc.i(aqhVar.b, 0, iph.j, fetVar2, mm40VarN);
            zhg0 zhg0Var = zhg0.f44392a;
            A(zhg0Var.a(1.0f, jm40Var, true), jphVar.b, 5, fetVar2, 0);
            fetVar2.r(true);
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            String str = jphVar.f16900a;
            long j = iph.f;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            mm40Var2 = jm40Var;
            v8q0.a(str, mm40VarA, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarS2 = o7k0.s(mm40Var2, 80.0f);
            thg0 thg0VarA3 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS2);
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
            A(zhg0Var.a(1.0f, mm40Var2, true), aqhVar2, 6, fetVar2, 0);
            vfc.i(aqhVar2.b, 0, iph.k, fetVar2, o7k0.n(mm40Var2, 32.0f));
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var2, jphVar, i, (byte) 12);
        }
    }

    public static final void j(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-158742872);
        byte b = 4;
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ytl ytlVar = ((hwd) l7m0Var.getValue()).f13765a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new afd(function1, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new afd(function1, b);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new afd(function1, (byte) 5);
                fetVar.o0(objP3);
            }
            nkb.f(null, ytlVar, function0, function2, (Function0) objP3, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i, (byte) 28);
        }
    }

    public static final void k(mm40 mm40Var, eye eyeVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        Function0 function2;
        boolean z;
        Function0 function3 = function1;
        k680 k680Var = eyeVar.c;
        fetVar.g0(428154351);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eyeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ugg0Var2), 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarY);
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
            if (k680Var != null) {
                fetVar.e0(-401743606);
                zcl zclVar2 = qmk.g;
                mm40 mm40VarJ2 = s5x0.J(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundGroupSecondary(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f);
                pz40 pz40Var = s6t0.f31722a;
                z = false;
                vvw.d(mm40VarJ2, k680Var, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar), fetVar, 0);
                fetVar.r(false);
                function2 = function0;
            } else {
                z = false;
                fetVar.e0(-401227053);
                function2 = function0;
                y(null, eyeVar.f8624a, function2, fetVar, i3 & 896);
                fetVar.r(false);
            }
            if (eyeVar.d) {
                fetVar.e0(-400989562);
                a(6, fetVar, o7k0.d(jm40Var, 1.0f));
                fetVar.r(z);
            } else {
                fetVar.e0(-400880969);
                fetVar.r(z);
            }
            function3 = function1;
            x(null, eyeVar.b, function3, fetVar, (i3 >> 3) & 896);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            function2 = function0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 18, i, (Object) mm40Var, (Object) eyeVar, (Object) function2, (Object) function3);
        }
    }

    public static final void l(final nqh nqhVar, fet fetVar, final int i) {
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        nqhVar.getClass();
        fetVar.g0(740913403);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nqhVar) ? 32 : 16;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (nqhVar.f23959a.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: a.jqh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    acb.l(nqhVar, fetVar2, x8x.L(i | 1));
                                    break;
                                default:
                                    acb.l(nqhVar, fetVar2, x8x.L(i | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                kr00.a(u1c.M(1486585438, new yfg(nqhVar), fetVar), fetVar, 6);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2() { // from class: a.jqh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            acb.l(nqhVar, fetVar2, x8x.L(i | 1));
                            break;
                        default:
                            acb.l(nqhVar, fetVar2, x8x.L(i | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void m(mm40 mm40Var, final l9n l9nVar, Function2 function2, final Function1 function1, final Function1 function3, fet fetVar, int i) {
        Object obj;
        final byte b;
        fetVar.g0(-1664111262);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l9nVar) ? 32 : 16;
        }
        int i3 = i2 | (fetVar.i(function2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function3) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
            int i4 = i3 & 112;
            boolean z = ((i3 & 896) == 256) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new kk0(function2, l9nVar, pz40Var, (byte) 26);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarQ, null, null, false, null, (Function0) objP2, 28), "DS_WEBGAME_CARD_DEFAULT");
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
            x9n x9nVar = l9nVar.b;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new ca6(pz40Var, (byte) 19);
                fetVar.o0(objP3);
            }
            Function1 function4 = (Function1) objP3;
            boolean z2 = ((57344 & i3) == 16384) | (i4 == 32);
            Object objP4 = fetVar.P();
            if (z2 || objP4 == cl5Var) {
                final byte b2 = 0;
                obj = new Function0() { // from class: a.m5i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        l9n l9nVar2 = l9nVar;
                        Function1 function5 = function3;
                        switch (b3) {
                            case 0:
                                if (function5 != null) {
                                    function5.invoke(l9nVar2);
                                }
                                break;
                            default:
                                if (function5 != null) {
                                    function5.invoke(l9nVar2);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj);
            } else {
                obj = objP4;
            }
            jar0.j(x9nVar, function4, (Function0) obj, fetVar, 1);
            j9n j9nVar = l9nVar.c;
            boolean z3 = ((i3 & 7168) == 2048) | (i4 == 32);
            Object objP5 = fetVar.P();
            if (z3 || objP5 == cl5Var) {
                b = 1;
                objP5 = new Function0() { // from class: a.m5i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b;
                        l9n l9nVar2 = l9nVar;
                        Function1 function5 = function1;
                        switch (b3) {
                            case 0:
                                if (function5 != null) {
                                    function5.invoke(l9nVar2);
                                }
                                break;
                            default:
                                if (function5 != null) {
                                    function5.invoke(l9nVar2);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP5);
            } else {
                b = 1;
            }
            Function0 function0 = (Function0) objP5;
            if ((b & 4) != 0) {
                function0 = null;
            }
            boolean z4 = j9nVar instanceof f9n;
            jm40 jm40Var = jm40.b;
            if (z4) {
                fetVar.e0(25185808);
                obb.b(jm40Var, (f9n) j9nVar, function0, fetVar, 0);
                fetVar.r(false);
            } else if (j9nVar instanceof h9n) {
                fetVar.e0(25391555);
                obb.D(jm40Var, (h9n) j9nVar, fetVar, 0);
                fetVar.r(false);
            } else if (j9nVar instanceof g9n) {
                fetVar.e0(25552786);
                obb.x(jm40Var, (g9n) j9nVar, function0, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!(j9nVar instanceof i9n)) {
                    throw b1j.f(693547667, fetVar, false);
                }
                fetVar.e0(25757014);
                obb.E(jm40Var, (i9n) j9nVar, function0, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(mm40Var, l9nVar, function2, function1, function3, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0200  */
    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:111:0x0244  */
    /* JADX WARN: Code duplicated, block: B:113:0x024d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0257  */
    /* JADX WARN: Code duplicated, block: B:116:0x026e  */
    /* JADX WARN: Code duplicated, block: B:126:0x029d  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x015c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f8  */
    public static final void n(bc bcVar, boolean z, Function0 function0, mm40 mm40Var, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        boolean z2;
        mm40 mm40Var3;
        yfe0 yfe0VarU;
        jm40 jm40Var;
        mm40 mm40Var4;
        Object objP;
        boolean z3;
        boolean z4;
        pcy pcyVar;
        boolean z5;
        float f;
        y3d y3dVarA;
        long j;
        int i4;
        y3d y3dVarC;
        boolean z6;
        long primary;
        String str;
        int iOrdinal;
        boolean z7;
        boolean z8;
        int iOrdinal2;
        long background;
        function0.getClass();
        fetVar.g0(-570686051);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(bcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar.g(mm40Var2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i3 & 1, z2)) {
                jm40Var = jm40.b;
                if (i5 != 0) {
                    mm40Var4 = jm40Var;
                } else {
                    mm40Var4 = mm40Var2;
                }
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP;
                zcl zclVar = qmk.f28987a;
                z3 = false;
                mm40 mm40VarW = y860.W(o2e.e0(o7k0.n(mm40Var4, 40.0f), "ACCORDION_BOX"), gy40Var, null, false, null, function0, 28);
                zx7 zx7Var = gqw0.e;
                tj30 tj30VarC = zq8.c(zx7Var, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                mkd.c0.getClass();
                fetVar.i0();
                z4 = fetVar.S;
                pcyVar = e7z.u1;
                if (z4) {
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
                mm40 mm40VarS = o7k0.s(jm40Var, 24.0f);
                z5 = bcVar instanceof yb;
                if (!z5 || (bcVar instanceof zb)) {
                    f = 24.0f;
                } else {
                    if (bcVar instanceof ac) {
                        t9f.b();
                        return;
                    }
                    f = 18.0f;
                }
                mm40 mm40VarE = o7k0.e(mm40VarS, f);
                y3dVarA = bcVar.a();
                if (y3dVarA == null) {
                    fetVar.e0(-745478939);
                    if (z5) {
                        fetVar.e0(807238154);
                        background = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                        fetVar.r(false);
                    } else {
                        if (!(bcVar instanceof zb) && !(bcVar instanceof ac)) {
                            throw b1j.f(807236285, fetVar, false);
                        }
                        fetVar.e0(-745359961);
                        iOrdinal2 = bcVar.b().ordinal();
                        if (iOrdinal2 != 0) {
                            fetVar.e0(807245321);
                            background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                            fetVar.r(false);
                        } else {
                            if (iOrdinal2 == 1) {
                                throw b1j.f(807240123, fetVar, false);
                            }
                            fetVar.e0(807243174);
                            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
                            z3 = false;
                            fetVar.r(false);
                            background = jM125getWhite100d7_KjU;
                        }
                        fetVar.r(z3);
                    }
                    fetVar.r(z3);
                    j = background;
                } else {
                    fetVar.e0(807235231);
                    fetVar.r(false);
                    j = y3dVarA.f41946a;
                }
                mm40 mm40VarQ = i120.Q(mm40VarE, j, vgg0.f37379a);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                mm40 mm40Var5 = mm40Var4;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
                if (z) {
                    i4 = R.drawable.ic_glyph_chevron_up_small;
                } else {
                    i4 = R.drawable.ic_glyph_chevron_down_small;
                }
                pm80 pm80VarF = a8k0.F(i4, 0, fetVar);
                y3dVarC = bcVar.c();
                if (y3dVarC == null) {
                    fetVar.e0(-1124190837);
                    iOrdinal = bcVar.b().ordinal();
                    if (iOrdinal != 0) {
                        z6 = true;
                        if (iOrdinal == 1) {
                            throw b1j.f(-451906217, fetVar, false);
                        }
                        fetVar.e0(-1124127101);
                        if (z5) {
                            fetVar.e0(-451902021);
                            primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                            z8 = false;
                            fetVar.r(false);
                        } else {
                            if (!(bcVar instanceof zb) && !(bcVar instanceof ac)) {
                                throw b1j.f(-451904161, fetVar, false);
                            }
                            fetVar.e0(-451899335);
                            primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                            z8 = false;
                            fetVar.r(false);
                        }
                        fetVar.r(z8);
                        z7 = z8;
                    } else {
                        z6 = true;
                        fetVar.e0(-1123920021);
                        if (z5) {
                            fetVar.e0(-451895523);
                            primary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                            z7 = false;
                        } else {
                            if (!(bcVar instanceof zb) && !(bcVar instanceof ac)) {
                                throw b1j.f(-451897481, fetVar, false);
                            }
                            fetVar.e0(-451892965);
                            primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            z7 = false;
                            fetVar.r(false);
                        }
                        fetVar.r(z7);
                    }
                    fetVar.r(z7);
                } else {
                    z6 = true;
                    fetVar.e0(-451907085);
                    fetVar.r(false);
                    primary = y3dVarC.f41946a;
                }
                mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
                if (z) {
                    str = "ICON_UP";
                } else {
                    str = "ICON_DOWN";
                }
                boolean z9 = z6;
                dww.c(pm80VarF, null, o2e.e0(mm40VarN, str), primary, fetVar, 56, 0);
                fetVar.r(z9);
                fetVar.r(z9);
                mm40Var3 = mm40Var5;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new kr8(bcVar, z, function0, mm40Var3, i, i2);
            }
        }
        i3 |= 3072;
        mm40Var2 = mm40Var;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i3 & 1, z2)) {
            jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var4 = jm40Var;
            } else {
                mm40Var4 = mm40Var2;
            }
            objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var2 = (gy40) objP;
            zcl zclVar2 = qmk.f28987a;
            z3 = false;
            mm40 mm40VarW2 = y860.W(o2e.e0(o7k0.n(mm40Var4, 40.0f), "ACCORDION_BOX"), gy40Var2, null, false, null, function0, 28);
            zx7 zx7Var2 = gqw0.e;
            tj30 tj30VarC3 = zq8.c(zx7Var2, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarW2);
            mkd.c0.getClass();
            fetVar.i0();
            z4 = fetVar.S;
            pcyVar = e7z.u1;
            if (z4) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, tj30VarC3, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM3, shdVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf2, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC2, shdVar8);
            mm40 mm40VarS2 = o7k0.s(jm40Var, 24.0f);
            z5 = bcVar instanceof yb;
            if (!z5) {
                f = 24.0f;
            } else {
                if (bcVar instanceof ac) {
                    t9f.b();
                    return;
                }
                f = 18.0f;
            }
            mm40 mm40VarE2 = o7k0.e(mm40VarS2, f);
            y3dVarA = bcVar.a();
            if (y3dVarA == null) {
                fetVar.e0(-745478939);
                if (z5) {
                    fetVar.e0(807238154);
                    background = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                    fetVar.r(false);
                } else {
                    if (!(bcVar instanceof zb)) {
                        throw b1j.f(807236285, fetVar, false);
                    }
                    fetVar.e0(-745359961);
                    iOrdinal2 = bcVar.b().ordinal();
                    if (iOrdinal2 != 0) {
                        fetVar.e0(807245321);
                        background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                        fetVar.r(false);
                    } else {
                        if (iOrdinal2 == 1) {
                            throw b1j.f(807240123, fetVar, false);
                        }
                        fetVar.e0(807243174);
                        long jM125getWhite100d7_KjU2 = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
                        z3 = false;
                        fetVar.r(false);
                        background = jM125getWhite100d7_KjU2;
                    }
                    fetVar.r(z3);
                }
                fetVar.r(z3);
                j = background;
            } else {
                fetVar.e0(807235231);
                fetVar.r(false);
                j = y3dVarA.f41946a;
            }
            mm40 mm40VarQ2 = i120.Q(mm40VarE2, j, vgg0.f37379a);
            tj30 tj30VarC4 = zq8.c(zx7Var2, false);
            mm40 mm40Var6 = mm40Var4;
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarQ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, shdVar5);
            jpm0.o(fetVar, bh90VarM4, shdVar6);
            vqd.u(iHashCode4, fetVar, shdVar7, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar8);
            if (z) {
                i4 = R.drawable.ic_glyph_chevron_up_small;
            } else {
                i4 = R.drawable.ic_glyph_chevron_down_small;
            }
            pm80 pm80VarF2 = a8k0.F(i4, 0, fetVar);
            y3dVarC = bcVar.c();
            if (y3dVarC == null) {
                fetVar.e0(-1124190837);
                iOrdinal = bcVar.b().ordinal();
                if (iOrdinal != 0) {
                    z6 = true;
                    if (iOrdinal == 1) {
                        throw b1j.f(-451906217, fetVar, false);
                    }
                    fetVar.e0(-1124127101);
                    if (z5) {
                        fetVar.e0(-451902021);
                        primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                        z8 = false;
                        fetVar.r(false);
                    } else {
                        if (!(bcVar instanceof zb)) {
                            throw b1j.f(-451904161, fetVar, false);
                        }
                        fetVar.e0(-451899335);
                        primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                        z8 = false;
                        fetVar.r(false);
                    }
                    fetVar.r(z8);
                    z7 = z8;
                } else {
                    z6 = true;
                    fetVar.e0(-1123920021);
                    if (z5) {
                        fetVar.e0(-451895523);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                        fetVar.r(false);
                        z7 = false;
                    } else {
                        if (!(bcVar instanceof zb)) {
                            throw b1j.f(-451897481, fetVar, false);
                        }
                        fetVar.e0(-451892965);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                        z7 = false;
                        fetVar.r(false);
                    }
                    fetVar.r(z7);
                }
                fetVar.r(z7);
            } else {
                z6 = true;
                fetVar.e0(-451907085);
                fetVar.r(false);
                primary = y3dVarC.f41946a;
            }
            mm40 mm40VarN2 = o7k0.n(jm40Var, 16.0f);
            if (z) {
                str = "ICON_UP";
            } else {
                str = "ICON_DOWN";
            }
            boolean z10 = z6;
            dww.c(pm80VarF2, null, o2e.e0(mm40VarN2, str), primary, fetVar, 56, 0);
            fetVar.r(z10);
            fetVar.r(z10);
            mm40Var3 = mm40Var6;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr8(bcVar, z, function0, mm40Var3, i, i2);
        }
    }

    public static final void o(mm40 mm40Var, l5i l5iVar, trl trlVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        trlVar.getClass();
        fetVar.g0(-2038460791);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.e(l5iVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(trlVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            int iOrdinal = l5iVar.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1242589788);
                o050.p(mm40Var2, trlVar, fetVar, (i3 & 14) | ((i3 >> 3) & 112));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-1242397371);
                obb.m(mm40Var2, trlVar, fetVar, (i3 & 14) | ((i3 >> 3) & 112));
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(-1242204892);
                jcb.g(mm40Var2, trlVar, fetVar, (i3 & 14) | ((i3 >> 3) & 112));
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(-455726796, fetVar, false);
                }
                fetVar.e0(-1242004322);
                rcb.s(mm40Var2, trlVar, fetVar, (i3 & 14) | ((i3 >> 3) & 112));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var2, (Object) l5iVar, (Object) trlVar, i, i2, (byte) 11);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1171495359);
        int i2 = i | 6;
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(i120.Q(jm40Var, backgroundContent, ugg0Var2), 2.0f, 2.0f);
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
            long jM113getRed0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m113getRed0d7_KjU();
            zcl zclVar2 = qmk.c;
            mm40 mm40VarK2 = s5x0.K(i120.Q(jm40Var, jM113getRed0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 2.0f, 2.0f);
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
            v8q0.a("Soon", null, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.c(), fetVar, 6, 0, 131066);
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
            yfe0VarU.d = new xml(mm40Var2, false, i, (byte) 7);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-1664600834);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            aad.e(str, null, y9q0.a(g1t0.n(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 2, 0, null, new n05(qmk.r, qmk.q, qmk.n), fetVar, ((i2 >> 3) & 14) | 1597440, 426);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str, i, b);
        }
    }

    public static final void r(mm40 mm40Var, fue fueVar, String str, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i) {
        boolean z2;
        Object accVar;
        int i2;
        fetVar.g0(-2044695995);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(fueVar) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288) | (fetVar.i(function3) ? 8388608 : 4194304) | (fetVar.i(function4) ? 67108864 : 33554432);
        if (fetVar.U(i3 & 1, (i3 & 38347923) != 38347922)) {
            int i4 = i3 & 7168;
            boolean z3 = ((i3 & 896) == 256) | (i4 == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                i2 = i3;
                accVar = new acc(str, z, function0, function1, function2, function3, function4);
                fetVar.o0(accVar);
            } else {
                i2 = i3;
                accVar = objP;
            }
            Function1 function5 = (Function1) accVar;
            boolean z4 = ((i2 & 112) == 32) | (i4 == 2048);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new x9((Object) fueVar, z, (byte) 20);
                fetVar.o0(objP2);
            }
            dwi0.b(function5, mm40Var, (Function1) objP2, fetVar, (i2 << 3) & 112, 0);
        } else {
            z2 = z;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ctm(mm40Var, fueVar, str, z2, function0, function1, function2, function3, function4, i);
        }
    }

    public static final void s(mm40 mm40Var, d1g0 d1g0Var, boolean z, fet fetVar, int i) {
        d1g0Var.getClass();
        fetVar.g0(-1394024810);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(d1g0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (d1g0Var instanceof b1g0) {
            fetVar.e0(-1354009485);
            b1g0 b1g0Var = (b1g0) d1g0Var;
            agc.s(mm40Var, z, new rxm(b1g0Var.f1804a, b1g0Var.b, b1g0Var.c, null), fetVar, (i2 & 14) | ((i2 >> 3) & 112));
            fetVar.r(false);
        } else {
            if (!(d1g0Var instanceof c1g0)) {
                throw b1j.f(371961809, fetVar, false);
            }
            fetVar.e0(-1353415215);
            c1g0 c1g0Var = (c1g0) d1g0Var;
            yzm yzmVar = c1g0Var.f3569a;
            yzm yzmVar2 = c1g0Var.b;
            a2m a2mVar = c1g0Var.c;
            String str = c1g0Var.d;
            jwm jwmVar = c1g0Var.e;
            jwm jwmVar2 = c1g0Var.f;
            uso0 uso0Var = uso0.f36223a;
            wvb.s(mm40Var, new szm(yzmVar, yzmVar2, a2mVar, str, jwmVar, jwmVar2, z), fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) d1g0Var, z, i, (byte) 1);
        }
    }

    public static final void t(mm40 mm40Var, jsn jsnVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        jsnVar.getClass();
        fetVar2.g0(-2078505906);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(jsnVar) ? 32 : 16);
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
            String str = jsnVar.f17061a;
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
            yfe0VarU.d = new d0n((byte) 27, i, mm40Var, jsnVar);
        }
    }

    public static final void u(cjj0 cjj0Var, fet fetVar, int i) {
        int i2;
        Object dgVar;
        Context context;
        cjj0 cjj0Var2 = cjj0Var;
        fetVar.g0(1261097486);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(cjj0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context2 = (Context) fetVar.k(dy2.b);
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = twn.s(fetVar);
            }
            List list2 = (List) objP2;
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = h6o.f12539a;
                fetVar.o0(objP3);
            }
            xdr xdrVar = (xdr) ((jhy) objP3);
            int i3 = i2 & 14;
            boolean zI = fetVar.i(context2) | (i3 == 4) | fetVar.i(list) | fetVar.i(list2) | fetVar.i(clzVar);
            Object objP4 = fetVar.P();
            if (zI || objP4 == cl5Var) {
                context = context2;
                dgVar = new dg(context, cjj0Var2, list, list2, clzVar, (byte) 17);
                fetVar.o0(dgVar);
            } else {
                context = context2;
                dgVar = objP4;
            }
            Function1 function1 = (Function1) dgVar;
            boolean zI2 = fetVar.i(context) | (i3 == 4) | fetVar.i(list) | fetVar.i(list2) | fetVar.i(clzVar);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == cl5Var) {
                cqk cqkVar = new cqk((Object) cjj0Var, (Object) context, (Object) list, (Object) list2, (Object) clzVar, (byte) 18);
                fetVar.o0(cqkVar);
                objP5 = cqkVar;
            }
            cjj0Var2 = cjj0Var;
            idm0.j(mm40Var, cjj0Var2, xdrVar, null, function1, (Function2) objP5, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(cjj0Var2, i, (byte) 26);
        }
    }

    public static final void v(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-614183086);
        if (fetVar.U(i & 1, i != 0)) {
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
            fetVar2 = fetVar;
            nkb.h(s5x0.L(jm40Var, xfn.a(fetVar).e, 0.0f, 2), new ijm(), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            tdc.k(s5x0.L(jm40Var, xfn.a(fetVar2).d, 0.0f, 2), g0l0.f10465a, fetVar2, 48);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x6o(i, (byte) 25);
        }
    }

    public static final void w(fjv fjvVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(255307214);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(fjvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
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
            nkb.h(null, fjvVar.f9662a, kjm.b, null, null, null, fetVar, 384, 57);
            C(fjvVar.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(fjvVar, i, (byte) 14);
        }
    }

    public static final void x(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1489709748);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            v8q0.a(rsm0.w(R.string.when_coef_changed, 0, fetVar2), null, 0L, new n05(idm0.t(8), idm0.t(12), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, 0, 24960, 109558);
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, (i2 >> 3) & 14, 0, 131070);
            fetVar.r(true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarY = y860.Y(o7k0.A(o7k0.e(jm40Var, 32.0f), null, 3), false, null, null, function0, 15);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarY);
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
            v8q0.a(rsm0.w(R.string.settings, 0, fetVar), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(g1t0.d(), fetVar), fetVar, 0, 24960, 110590);
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
            yfe0VarU.d = new fg5(mm40Var2, str, function0, i, (byte) 3);
        }
    }

    public static final void y(mm40 mm40Var, ss10 ss10Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1491933779);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ss10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ss10Var instanceof ps10;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-1875949739);
                fetVar.r(false);
            } else {
                fetVar.e0(-1877391239);
                zcl zclVar = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarL = s5x0.L(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroupSecondary(), new ugg0(zclVar, zclVar, zclVar, zclVar)), 12.0f, 0.0f, 2);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                if (ss10Var instanceof os10) {
                    fetVar.e0(58816144);
                    g(new nxe(((os10) ss10Var).f25763a), fetVar, 0);
                    fetVar.r(false);
                } else if (ss10Var instanceof qs10) {
                    fetVar.e0(58826662);
                    qs10 qs10Var = (qs10) ss10Var;
                    F(qs10Var.f29237a, qs10Var.b, function0, fetVar, i2 & 896);
                    fetVar.r(false);
                } else {
                    if (!(ss10Var instanceof rs10)) {
                        throw b1j.f(58813990, fetVar, false);
                    }
                    fetVar.e0(58837257);
                    rs10 rs10Var = (rs10) ss10Var;
                    E(null, new nxe(rs10Var.f31013a.f25763a), rs10Var.b.b, function0, fetVar, (i2 << 3) & 7168);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var2, ss10Var, function0, i, (byte) 12);
        }
    }

    public static final void z(int i, int i2, fet fetVar) {
        fetVar.g0(2033388752);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarQ, 8.0f, 16.0f, 8.0f, 8.0f);
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4(b)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 16.0f), 128.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.j, fetVar, 0);
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
            fetVar.e0(-91050568);
            int iB = 0;
            while (iB < i) {
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 36.0f), true);
                zcl zclVar4 = qmk.f;
                iB = h97.b(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarH), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i, i2, (byte) 6);
        }
    }
}
