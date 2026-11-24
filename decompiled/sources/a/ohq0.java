package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.common.Feature;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ohq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f25277a = new ugd(838865759, false, new wgd(15));
    public static final ugd b = new ugd(-907516998, false, new bhd(5));
    public static final ugd c = new ugd(1202062576, false, new fhd(6));
    public static final ugd d = new ugd(1075788124, false, new jhd(28));
    public static final ugd e = new ugd(-1609105605, false, new lhd(26));
    public static final byte[] f = {112, 114, 111, 0};
    public static final byte[] g = {112, 114, 109, 0};
    public static final Feature h;
    public static final Feature[] i;

    static {
        Feature feature = new Feature(-1, 2L, "sms_code_autofill", true);
        Feature feature2 = new Feature(-1, 2L, "sms_code_browser", true);
        Feature feature3 = new Feature(-1, 1L, "sms_retrieve", true);
        h = feature3;
        i = new Feature[]{feature, feature2, feature3, new Feature(-1, 3L, "user_consent", true), new Feature(-1, 2L, "missed_call_retriever", true), new Feature(-1, 1L, "missed_call_retriever_user_consent", true)};
    }

    public static final void A(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(282818433);
        int i3 = (i2 & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i2 : i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(10.0f, true, new jf4((byte) 14));
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
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            fetVar.e0(157179172);
            for (int i4 = 0; i4 < 3; i4++) {
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 280.0f), 256.0f);
                zcl zclVar4 = qmk.i;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE2), fqj0VarD0));
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, (byte) 24);
        }
    }

    public static final void B(mm40 mm40Var, gvm gvmVar, gvm gvmVar2, mpm mpmVar, String str, String str2, String str3, a4x a4xVar, zum zumVar, boolean z, fet fetVar, int i2) {
        int i3;
        gvm gvmVar3;
        gvm gvmVar4;
        mpm mpmVar2;
        String str4;
        String str5;
        a4x a4xVar2;
        zum zumVar2;
        k6z k6zVar;
        str.getClass();
        a4xVar.getClass();
        fetVar.g0(-151282621);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            gvmVar3 = gvmVar;
            i3 |= fetVar.g(gvmVar3) ? 32 : 16;
        } else {
            gvmVar3 = gvmVar;
        }
        if ((i2 & 384) == 0) {
            gvmVar4 = gvmVar2;
            i3 |= fetVar.g(gvmVar4) ? 256 : 128;
        } else {
            gvmVar4 = gvmVar2;
        }
        if ((i2 & 3072) == 0) {
            mpmVar2 = mpmVar;
            i3 |= fetVar.g(mpmVar2) ? 2048 : 1024;
        } else {
            mpmVar2 = mpmVar;
        }
        if ((i2 & 24576) == 0) {
            str4 = str;
            i3 |= fetVar.g(str4) ? 16384 : 8192;
        } else {
            str4 = str;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            str5 = str3;
            i3 |= fetVar.g(str5) ? 1048576 : 524288;
        } else {
            str5 = str3;
        }
        if ((12582912 & i2) == 0) {
            a4xVar2 = a4xVar;
            i3 |= fetVar.g(a4xVar2) ? 8388608 : 4194304;
        } else {
            a4xVar2 = a4xVar;
        }
        if ((100663296 & i2) == 0) {
            zumVar2 = zumVar;
            i3 |= fetVar.g(zumVar2) ? 67108864 : 33554432;
        } else {
            zumVar2 = zumVar;
        }
        if ((805306368 & i2) == 0) {
            i3 |= fetVar.h(z) ? 536870912 : 268435456;
        }
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            if (z) {
                fetVar.e0(646305770);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(646306694);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1177874557, new wum(mm40Var, gvmVar3, gvmVar4, str4, mpmVar2, z, a4xVar2, str5, zumVar2, str2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bcc(mm40Var, gvmVar, gvmVar2, mpmVar, str, str2, str3, a4xVar, zumVar, z, i2);
        }
    }

    public static final void C(final mm40 mm40Var, final n930 n930Var, final l7m0 l7m0Var, final xcz xczVar, final xcz xczVar2, final nek nekVar, final xak xakVar, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function2 function5, final Function2 function6, final Function1 function7, final Function1 function8, fet fetVar, final int i2) {
        fet fetVar2;
        boolean z;
        boolean z2;
        n930Var.getClass();
        m930 m930Var = n930Var.f;
        l7m0Var.getClass();
        nekVar.getClass();
        xakVar.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        fetVar.g0(-1912766216);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(n930Var) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.g(xczVar) ? 2048 : 1024) | (fetVar.g(xczVar2) ? 16384 : 8192) | (fetVar.g(nekVar) ? 131072 : 65536) | (fetVar.g(xakVar) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304) | (fetVar.i(function2) ? 67108864 : 33554432) | (fetVar.i(function3) ? 536870912 : 268435456);
        int i4 = (fetVar.i(function4) ? 4 : 2) | (fetVar.i(function5) ? 32 : 16) | (fetVar.i(function6) ? 256 : 128) | (fetVar.i(function7) ? 2048 : 1024) | (fetVar.i(function8) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 9363) == 9362) ? false : true)) {
            boolean z3 = m930Var instanceof k930;
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zH = ((i3 & 29360128) == 8388608) | fetVar.h(z3);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new a2f(function1, z3, null, (byte) 1);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            if (m930Var != null) {
                if (m930Var instanceof l930) {
                    fetVar.e0(1401102813);
                    zcl zclVar = qmk.f28987a;
                    int i5 = ((i3 >> 6) & 112) | (i3 & 896);
                    int i6 = i3 >> 9;
                    int i7 = (i6 & 3670016) | i5 | (i6 & 458752);
                    int i8 = i4 << 18;
                    z2 = true;
                    vtb.z(s5x0.L(n0qVar, 8.0f, 0.0f, 2), xczVar, l7m0Var, n930Var.d, n930Var.c, function2, function3, function5, function6, function7, function8, fetVar, i7 | (i8 & 29360128) | (234881024 & i8) | (i8 & 1879048192), (i4 >> 12) & 14);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2 = fetVar;
                    z = false;
                    z2 = true;
                    if (m930Var instanceof k930) {
                        fetVar2.e0(485244264);
                        a4x a4xVar = n930Var.b;
                        if (a4xVar == null) {
                            fetVar2.e0(485244263);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(485244264);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarJ = s5x0.J(n0qVar, 4.0f);
                            zcl zclVar3 = qmk.i;
                            ugg0 ugg0Var = vgg0.f37379a;
                            int i9 = (i3 >> 9) & 112;
                            int i10 = i3 >> 3;
                            dtb.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarJ), xczVar2, a4xVar, n930Var.e, nekVar, xakVar, function4, fetVar2, (i10 & 458752) | i9 | (57344 & i10) | ((i4 << 18) & 3670016));
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(z2);
            } else {
                fetVar2 = fetVar;
                z = false;
            }
            throw b1j.f(1401101293, fetVar2, z);
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(n930Var, l7m0Var, xczVar, xczVar2, nekVar, xakVar, function1, function2, function3, function4, function5, function6, function7, function8, i2) { // from class: a.q2s
                public final /* synthetic */ n930 b;
                public final /* synthetic */ l7m0 c;
                public final /* synthetic */ xcz d;
                public final /* synthetic */ xcz e;
                public final /* synthetic */ nek f;
                public final /* synthetic */ xak g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function2 l;
                public final /* synthetic */ Function2 m;
                public final /* synthetic */ Function1 n;
                public final /* synthetic */ Function1 o;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    ohq0.C(this.f28017a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void D(ef8 ef8Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-458336098);
        byte b2 = 2;
        int i3 = (fetVar.g(ef8Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            d9z d9zVarA = f9z.a(fetVar);
            htr htrVar = ef8Var.b;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 24.0f, fetVar);
            boolean zG = fetVar.g(htrVar) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new eya(htrVar, function1, b2);
                fetVar.o0(objP);
            }
            uzb.z(n0qVar, ch80VarF, d9zVarA, false, (Function2) objP, fetVar, 6, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fm60(ef8Var, function1, i2, b3);
        }
    }

    public static final void E(l7m0 l7m0Var, a4x a4xVar, boolean z, boolean z2, Function1 function1, Function1 function2, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        int i3;
        fetVar.g0(318541034);
        if ((i2 & 6) == 0) {
            l7m0Var2 = l7m0Var;
            i3 = (fetVar.g(l7m0Var2) ? 4 : 2) | i2;
        } else {
            l7m0Var2 = l7m0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            wom womVarF = mom.f(fetVar);
            mm40 mm40VarQ = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
            boolean z3 = (i3 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new opm0(function2, (byte) 8);
                fetVar.o0(objP);
            }
            mom.c(mm40VarQ, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(1360601269, new hbn0((byte) 0, a4xVar, function1, z, z2), fetVar), fetVar, 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ibn0(l7m0Var2, a4xVar, z, z2, function1, function2, i2, (byte) 0);
        }
    }

    public static final void F(mm40 mm40Var, pz40 pz40Var, final Function0 function0, final Function0 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(1581455405);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(pz40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = xf0.c(1.0f);
                fetVar2.o0(objP3);
            }
            t33 t33Var = (t33) objP3;
            final rw7 rw7Var = (rw7) pz40Var.getValue();
            Unit unit = Unit.f46060a;
            boolean zI = ((i3 & 112) == 32) | fetVar2.i(vneVar) | fetVar2.i(t33Var);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var) {
                objP4 = new ow7(pz40Var, vneVar, t33Var, pz40Var2, null, (byte) 1);
                fetVar2.o0(objP4);
            }
            m0x0.t(fetVar2, unit, (Function2) objP4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = epv0.N(o7k0.e(mm40Var, 32.0f), rw7Var.d ? 0.2f : 1.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean zI2 = fetVar2.i(t33Var);
            Object objP5 = fetVar2.P();
            if (zI2 || objP5 == cl5Var) {
                objP5 = new m53(t33Var, (byte) 6);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarT = i4w0.T(mm40VarN2, (Function1) objP5);
            wul wulVar = new wul(iul.e, oe9.d, new se9(R.drawable.ic_glyph_plus_small), true, false, false);
            boolean zG = ((i3 & 896) == 256) | fetVar2.g(rw7Var);
            Object objP6 = fetVar2.P();
            if (zG || objP6 == cl5Var) {
                final byte b2 = 0;
                objP6 = new Function0() { // from class: a.fw7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        Function0 function2 = function0;
                        rw7 rw7Var2 = rw7Var;
                        switch (b3) {
                            case 0:
                                if (!rw7Var2.d) {
                                    function2.invoke();
                                }
                                break;
                            default:
                                if (!rw7Var2.d) {
                                    function2.invoke();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP6);
            }
            qzb.n(mm40VarT, wulVar, (Function0) objP6, fetVar, 0, 0);
            fetVar2 = fetVar;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            boolean zG2 = ((i3 & 7168) == 2048) | fetVar2.g(rw7Var);
            Object objP7 = fetVar2.P();
            if (zG2 || objP7 == cl5Var) {
                z = true;
                final char c2 = 1 == true ? 1 : 0;
                objP7 = new Function0() { // from class: a.fw7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = c2;
                        Function0 function2 = function1;
                        rw7 rw7Var2 = rw7Var;
                        switch (b3) {
                            case 0:
                                if (!rw7Var2.d) {
                                    function2.invoke();
                                }
                                break;
                            default:
                                if (!rw7Var2.d) {
                                    function2.invoke();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP7);
            } else {
                z = true;
            }
            mm40 mm40VarW = y860.W(mm40VarC, null, null, false, null, (Function0) objP7, 28);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1168761509, new m87(rw7Var, (byte) 9), fetVar2), fetVar2, 56);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o7k0.n(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 16.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(z);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw7(mm40Var, pz40Var, function0, function1, i2, (byte) 1);
        }
    }

    public static final void G(mm40 mm40Var, ppj0 ppj0Var, bb00 bb00Var, kwj kwjVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        bb00 bb00Var2;
        Function1 function2;
        a4x a4xVar;
        fet fetVar2 = fetVar;
        ppj0Var.getClass();
        bb00Var.getClass();
        function1.getClass();
        fetVar2.g0(-274388938);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(ppj0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(bb00Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(kwjVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar = (k6z) fetVar2.k(zfnVar);
            k6z k6zVar2 = bb00Var.g ? k6zVar : k6z.f17794a;
            WeakHashMap weakHashMap = djv0.w;
            float fD = i120.O(zcm0.i(fetVar2).f, fetVar2).d();
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(s5x0.N(mm40VarE, 0.0f, 0.0f, 0.0f, fD + 56.0f, 7), vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            int i4 = i3;
            if (bb00Var.d.size() == bb00Var.f.size()) {
                fetVar2.e0(1272021145);
                k6z k6zVar3 = k6zVar2;
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
                P(ppj0Var, u1c.M(206774535, new eyn(bb00Var, kwjVar, function1, (byte) 16), fetVar2), fetVar2, ((i4 >> 3) & 14) | 48);
                mbc.o(zfi0.f44303a, o7k0.d(s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), false, fetVar2, 6, 4);
                bb00Var2 = bb00Var;
                function2 = function1;
                obc.d(zfnVar.a(k6zVar3), u1c.M(394257151, new ba00((Object) kwjVar, (Object) bb00Var, (Object) k6zVar, (Object) ppj0Var, (Object) function1, (byte) 0), fetVar2), fetVar2, 56);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                bb00Var2 = bb00Var;
                function2 = function1;
                fetVar2.e0(1274046189);
                ynp0 ynp0Var = (ynp0) CollectionsKt.firstOrNull(bb00Var2.e);
                if (ynp0Var == null || (a4xVar = ynp0Var.b) == null) {
                    a4xVar = lak0.c;
                }
                a4x a4xVar2 = a4xVar;
                boolean z2 = bb00Var2.g;
                boolean z3 = (i4 & 57344) == 16384;
                Object objP = fetVar2.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new i1y(function2, (byte) 26);
                    fetVar2.o0(objP);
                }
                j0x.i(n0qVar, a4xVar2, ppj0Var, z2, 16.0f, (Function1) objP, fetVar2, ((i4 << 3) & 896) | 6, 0);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            bb00Var2 = bb00Var;
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) ppj0Var, (Object) bb00Var2, (Object) kwjVar, (Object) function2, i2, (byte) 6);
        }
    }

    public static final void H(int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(462443622);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.M(mm40Var, 16.0f, 16.0f, 16.0f, 8.0f), 128.0f), 14.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            n0q n0qVar = o7k0.c;
            ch80 ch80VarF = h97.f(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 24.0f, fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new rj50((byte) 28);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            uzb.z(n0qVar, ch80VarF, null, false, (Function2) objP, fetVar2, 24576, 12);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i2, (byte) 6);
        }
    }

    public static final void I(id50 id50Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(2082447499);
        int i3 = i2 | (fetVar.g(id50Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarY = o7k0.y(jm40.b, null, 3);
            imm immVar = id50Var.f14567a;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xv50(function1, (byte) 20);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarY, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(id50Var, function1, i2, (byte) 10);
        }
    }

    public static final void J(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-333784439);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            hf8 hf8Var = (hf8) l7m0Var.getValue();
            id50 id50VarA = ((hf8) l7m0Var.getValue()).a();
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), "BONUS_GAMES_SCREEN");
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
            int i4 = i3 & 112;
            I(id50VarA, function1, fetVar, i4);
            if (hf8Var != null) {
                if (hf8Var instanceof gf8) {
                    fetVar.e0(-1545922159);
                    H(0, fetVar, null);
                    fetVar.r(false);
                } else if (hf8Var instanceof ef8) {
                    fetVar.e0(-1545920683);
                    Q((ef8) hf8Var, function1, fetVar, i4);
                    fetVar.r(false);
                } else if (hf8Var instanceof ff8) {
                    fetVar.e0(-1545918157);
                    R((ff8) hf8Var, function1, fetVar, i4);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-1545923479, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 25);
        }
    }

    public static final void K(mm40 mm40Var, gvm gvmVar, boolean z, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        String str = gvmVar.d;
        fetVar2.g0(-1169523582);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(gvmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar2, 0);
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
            String str2 = gvmVar.f11982a;
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar2, 0, 24960, 110586);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-40483016, new i3l(gvmVar, (byte) 22), fetVar2), fetVar2, 56);
            if (str.length() > 0) {
                fetVar2.e0(-140393546);
                y9q0 y9q0VarG = g1t0.g();
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                zcl zclVar = qmk.f28987a;
                v8q0.a(str, s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar2, 0, 24960, 110584);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(-140056886);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 13, i2, mm40Var, (Object) gvmVar, z);
        }
    }

    public static final void L(mm40 mm40Var, gvm gvmVar, gvm gvmVar2, String str, mpm mpmVar, boolean z, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1768330555);
        int i3 = i2 | 6 | (fetVar.g(gvmVar) ? 32 : 16) | (fetVar.g(gvmVar2) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024) | (fetVar.g(mpmVar) ? 16384 : 8192) | (fetVar.h(z) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarK0 = q8a.k0(o7k0.d(mm40Var2, 1.0f), enx.b);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
            K(zhg0Var.a(1.0f, mm40Var2, true), gvmVar, true, fetVar, (i3 & 112) | 384);
            v(zhg0Var.a(1.0f, mm40Var2, true), str, mpmVar, z, fetVar, (i3 >> 6) & 8176);
            K(zhg0Var.a(1.0f, mm40Var2, true), gvmVar2, false, fetVar, ((i3 >> 3) & 112) | 384);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var2, (Object) gvmVar, (Object) gvmVar2, str, (Object) mpmVar, z, i2, (byte) 4);
        }
    }

    public static final void M(mm40 mm40Var, pz40 pz40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-713402446);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 32.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar, 54);
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
            N(pz40Var, function0, fetVar, (i3 & 896) | (i3 & 112) | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dw7(mm40Var, pz40Var, function0, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x017a  */
    public static final void N(pz40 pz40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        String strA;
        String str;
        androidx.compose.runtime.d dVar;
        long textPrimary;
        long secondary;
        Function0 function1 = function0;
        fetVar.g0(-836895973);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(zhg0.f44392a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            androidx.compose.runtime.d dVar2 = bmd.n;
            Object objK = fetVar.k(dVar2);
            Object obj = k6z.f17794a;
            boolean z = objK == obj;
            if ((pz40Var.getValue() instanceof j30) || (pz40Var.getValue() instanceof a30)) {
                strA = ((v30) pz40Var.getValue()).a();
            } else {
                strA = z ? ohs0.n(((v30) pz40Var.getValue()).a(), ": ") : kng0.k(" :", ((v30) pz40Var.getValue()).a());
            }
            String str2 = strA;
            v30 v30Var = (v30) pz40Var.getValue();
            String str3 = "";
            if (v30Var == null) {
                str = "";
            } else if (v30Var instanceof p30) {
                str = ((p30) v30Var).c;
            } else if (v30Var instanceof m30) {
                str = ((m30) v30Var).c;
            } else if (v30Var instanceof s30) {
                str = ((s30) v30Var).c;
            } else {
                str = "";
            }
            v30 v30Var2 = (v30) pz40Var.getValue();
            if (v30Var2 != null) {
                if (v30Var2 instanceof p30) {
                    str3 = ((p30) v30Var2).b;
                } else if (v30Var2 instanceof m30) {
                    str3 = ((m30) v30Var2).b;
                } else if (v30Var2 instanceof s30) {
                    str3 = ((s30) v30Var2).b;
                }
            }
            v30 v30Var3 = (v30) pz40Var.getValue();
            if (v30Var3 == null) {
                fetVar.e0(278530535);
                dVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(dVar)).getTextPrimary();
                fetVar.r(false);
            } else if ((v30Var3 instanceof a30) || (v30Var3 instanceof s30)) {
                fetVar.e0(278526789);
                dVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
                fetVar.r(false);
            } else if (v30Var3 instanceof d30) {
                fetVar.e0(278529063);
                dVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(dVar)).getSecondary20();
                fetVar.r(false);
            } else {
                fetVar.e0(278530535);
                dVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(dVar)).getTextPrimary();
                fetVar.r(false);
            }
            v30 v30Var4 = (v30) pz40Var.getValue();
            if (v30Var4 == null) {
                fetVar.e0(-1433613300);
                secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
                fetVar.r(false);
            } else if (v30Var4 instanceof p30) {
                fetVar.e0(-1433617106);
                secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary40();
                fetVar.r(false);
            } else if (v30Var4 instanceof d30) {
                fetVar.e0(-1433614770);
                secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary20();
                fetVar.r(false);
            } else {
                fetVar.e0(-1433613300);
                secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
                fetVar.r(false);
            }
            v30 v30Var5 = (v30) pz40Var.getValue();
            boolean z2 = v30Var5 != null && ((v30Var5 instanceof a30) || (v30Var5 instanceof s30));
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var = (t33) objP;
            boolean z3 = (pz40Var.getValue() instanceof j30) || (pz40Var.getValue() instanceof m30);
            boolean z4 = z;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = fetVar.h(z2) | fetVar.i(t33Var);
            Object objP2 = fetVar.P();
            if (zH || objP2 == obj2) {
                objP2 = new pw7((byte) 1, t33Var, null, z2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            function1 = function0;
            boolean z5 = z3;
            obc.d(dVar2.a(obj), u1c.M(476786651, new hw7(z5, function1, z4, str3, str, t33Var, secondary, str2, textPrimary, (byte) 1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iw7(pz40Var, function1, i2, (byte) 1);
        }
    }

    public static final void O(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        fetVar.g0(-1800433871);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            n0q n0qVar = o7k0.c;
            float f2 = xfn.a(fetVar).c;
            float f3 = xfn.a(fetVar).c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 28.0f, fetVar);
            boolean zG = ((i3 & 14) == 4) | fetVar.g(xczVarA) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new zlb0(l7m0Var, xczVarA, function1, (byte) 25);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 6, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i2, (byte) 26);
        }
    }

    public static final void P(ppj0 ppj0Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1357971638);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ppj0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new zy2(ppj0Var, (byte) 3);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = fnn0.a(mm40VarE, ppj0Var, (PointerInputEventHandler) objP);
            int i4 = ((i3 << 6) & 7168) | 48;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            ua80.p(((i4 >> 6) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(ppj0Var, ugdVar, i2, (byte) 11);
        }
    }

    public static final void Q(ef8 ef8Var, Function1 function1, fet fetVar, int i2) {
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(843634497);
        int i3 = i2 | (fetVar2.g(ef8Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = jgk0.b(new pu50(ef8Var, (byte) 15));
                fetVar2.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD2, 16.0f, 16.0f, 16.0f, 8.0f);
            String strW = rsm0.w(R.string.promo_bonus_games_description, 0, fetVar2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            b2 = 1;
            v8q0.a(strW, mm40VarM, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
            D((ef8) l7m0Var.getValue(), function1, fetVar2, i3 & 112);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fm60(ef8Var, function1, i2, b2);
        }
    }

    public static final void R(ff8 ff8Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-441798685);
        int i3 = (fetVar.g(ff8Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mdm mdmVar = ff8Var.b;
            fetVar.e0(-1844728519);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new xv50(function1, (byte) 21);
                fetVar.o0(objP);
            }
            w(null, mdmVar, (Function0) objP, fetVar, 0, 1);
            fetVar.r(false);
            if (Unit.f46060a == null) {
                fetVar.e0(-1844541868);
                mdm mdmVar2 = ff8Var.c;
                if (mdmVar2 == null) {
                    fetVar.e0(-1844541869);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1844541868);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 100.0f, 7);
                    boolean z2 = (i3 & 112) == 32;
                    Object objP2 = fetVar.P();
                    if (z2 || objP2 == cl5Var) {
                        objP2 = new xv50(function1, (byte) 22);
                        fetVar.o0(objP2);
                    }
                    w(mm40VarN, mdmVar2, (Function0) objP2, fetVar, 0, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                fetVar.e0(633229110);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(ff8Var, function1, i2, (byte) 11);
        }
    }

    public static final void S(l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        Function1 function3;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        l7m0Var2.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(-1008915513);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            yan0 yan0Var = (yan0) l7m0Var.getValue();
            if (yan0Var != null) {
                if (yan0Var instanceof wan0) {
                    fetVar2.e0(-420560259);
                    wan0 wan0Var = (wan0) yan0Var;
                    E(l7m0Var2, wan0Var.f38838a, false, wan0Var.b, function2, function1, fetVar2, ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 57344) | ((i3 << 9) & 458752));
                    fetVar2.r(false);
                    function3 = function1;
                } else if (yan0Var instanceof xan0) {
                    fetVar2.e0(-420161506);
                    xan0 xan0Var = (xan0) yan0Var;
                    E(l7m0Var2, xan0Var.b, true, xan0Var.c, function2, function1, fetVar2, ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 57344) | ((i3 << 9) & 458752));
                    function3 = function1;
                    fetVar2.r(false);
                } else {
                    function3 = function1;
                    boolean z = yan0Var instanceof uan0;
                    cl5 cl5Var = ukd.f35823a;
                    if (z) {
                        fetVar2.e0(-419781694);
                        mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, 0.0f, 0.0f, 24.0f, 7);
                        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                        jpm0.o(fetVar2, tj30VarC, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                        mdm mdmVar = ((uan0) yan0Var).f35339a;
                        boolean z2 = (i3 & 896) == 256;
                        Object objP = fetVar2.P();
                        if (z2 || objP == cl5Var) {
                            objP = new opm0(function3, (byte) 7);
                            fetVar2.o0(objP);
                        }
                        jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
                        fetVar2 = fetVar;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    } else if (yan0Var instanceof van0) {
                        fetVar2.e0(-419208008);
                        a4x a4xVar = ((van0) yan0Var).f37099a;
                        Object objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new f8l0((byte) 23);
                            fetVar2.o0(objP2);
                        }
                        ccq0.L(null, a4xVar, false, false, (Function1) objP2, fetVar, 28032);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
            }
            throw b1j.f(1094809944, fetVar2, false);
        }
        function3 = function1;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90(l7m0Var, l7m0Var2, function3, function2, i2);
        }
    }

    public static final void T(mm40 mm40Var, String str, zum zumVar, fet fetVar, int i2) {
        fet fetVar2;
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z;
        fetVar.g0(1033044493);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(zumVar) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.g(mm40VarD, 40.0f, 0.0f, 2), 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
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
            if (zumVar instanceof yum) {
                fetVar.e0(1023701237);
                boolean z2 = (i3 & 896) == 256;
                Object objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new c8n(nsm0.y(fgm.b), new w7n(new a8n(), ((yum) zumVar).f43275a, true, 0, false, null, 56));
                    fetVar.o0(objP);
                }
                v7n.c(null, (c8n) objP, null, fetVar, 5);
                fetVar.r(false);
            } else {
                fetVar.e0(1024183659);
                fetVar.r(false);
            }
            if (str.length() > 0) {
                fetVar.e0(1024241598);
                z = true;
                jm40Var = jm40Var2;
                v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i3 >> 3) & 14, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                jm40Var = jm40Var2;
                z = true;
                fetVar2.e0(1024479275);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var2, str, zumVar, i2, (byte) 15);
        }
    }

    public static final void U(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1898244982);
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
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            boolean z2 = false;
            lh80 lh80Var = new lh80(xfn.a(fetVar).c, 8.0f, xfn.a(fetVar).c, z ? 88.0f : 24.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 7168) == 2048) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objP = fetVar.P();
            if (z4 || objP == ukd.f35823a) {
                objP = new a7j0(a4xVar, function1, (byte) 8);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vy0(mm40Var2, a4xVar, z, function1, i2, (byte) 6);
        }
    }

    public static final boolean V(xyc xycVar) {
        BigDecimal bigDecimal = xycVar.d;
        BigDecimal bigDecimal2 = xycVar.e;
        BigDecimal bigDecimal3 = xycVar.f41701a;
        return !((bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0) || (bigDecimal3.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0)) || xycVar.f;
    }

    public static final rln0 W(xyc xycVar, ctf0 ctf0Var) {
        if (xycVar.g) {
            String strA = ctf0Var.b.a(R.string.min_coef_v2, Arrays.copyOf(new Object[]{""}, 1));
            pn40 pn40Var = pn40.f27267a;
            return new mln0(strA, pn40.g(xycVar.d));
        }
        if (!xycVar.f) {
            return new jln0(ctf0Var.b.a(R.string.bet_settings_coef_container_title, Arrays.copyOf(new Object[0], 0)));
        }
        String strA2 = ctf0Var.b.a(R.string.max_coef_v2, Arrays.copyOf(new Object[]{""}, 1));
        pn40 pn40Var2 = pn40.f27267a;
        return new mln0(strA2, pn40.g(xycVar.e));
    }

    public static byte[] X(cik[] cikVarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (cik cikVar : cikVarArr) {
            length += ((((cikVar.g * 2) + 7) & (-8)) / 8) + (cikVar.e * 2) + Z(cikVar.f4419a, cikVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cikVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, jiq0.o)) {
            int length2 = cikVarArr.length;
            while (i2 < length2) {
                cik cikVar2 = cikVarArr[i2];
                s0(byteArrayOutputStream, cikVar2, Z(cikVar2.f4419a, cikVar2.b, bArr));
                r0(byteArrayOutputStream, cikVar2);
                i2++;
            }
        } else {
            for (cik cikVar3 : cikVarArr) {
                s0(byteArrayOutputStream, cikVar3, Z(cikVar3.f4419a, cikVar3.b, bArr));
            }
            int length3 = cikVarArr.length;
            while (i2 < length3) {
                r0(byteArrayOutputStream, cikVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final rln0 Y(vw6 vw6Var, ctf0 ctf0Var, String str) {
        double d2 = vw6Var.f38133a;
        double d3 = vw6Var.d;
        if (d2 < d3) {
            String strA = ctf0Var.b.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
            int i2 = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            return new mln0(strA, cy7.e(pn40.d(d3, str, p3u0.c)));
        }
        if (d2 <= vw6Var.b() || vw6Var.m) {
            return new jln0("");
        }
        String strA2 = ctf0Var.b.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
        int i3 = cy7.f5159a;
        pn40 pn40Var2 = pn40.f27267a;
        return new mln0(strA2, cy7.e(pn40.d(vw6Var.e, str, p3u0.c)));
    }

    public static String Z(String str, String str2, byte[] bArr) {
        byte[] bArr2 = jiq0.p;
        byte[] bArr3 = jiq0.q;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? Separators.COLON : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(Separators.COLON, "!");
            }
            if (Separators.COLON.equals(obj)) {
                return str2.replace("!", Separators.COLON);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(Separators.COLON)) {
                if ("!".equals(obj)) {
                    return str2.replace(Separators.COLON, "!");
                }
                if (Separators.COLON.equals(obj)) {
                    return str2.replace("!", Separators.COLON);
                }
            } else if (!str2.endsWith(".apk")) {
                return axq.n(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? Separators.COLON : "!", str2);
            }
        }
        return str2;
    }

    public static final void a(mm40 mm40Var, imm immVar, Function0 function0, Function1 function1, Function0 function2, fet fetVar, int i2) {
        immVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(476407832);
        int i3 = i2 | (fetVar.g(immVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 7168;
            boolean z = ((i3 & 896) == 256) | (i4 == 2048);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new mn(function1, function0);
                fetVar.o0(objP);
            }
            Function0 function3 = (Function0) objP;
            boolean z2 = (57344 & i3) == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new y(function2, (byte) 4);
                fetVar.o0(objP2);
            }
            Function1 function4 = (Function1) objP2;
            boolean z3 = i4 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new y7(function1, (byte) 12);
                fetVar.o0(objP3);
            }
            hlm.c(mm40Var, immVar, null, function3, null, function4, (Function1) objP3, null, null, null, null, null, fetVar, i3 & 126, 0, 3988);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00(mm40Var, (Object) immVar, function0, function1, (wdr) function2, i2, (byte) 2);
        }
    }

    public static final lx6 a0(vw6 vw6Var, boolean z) {
        if (vw6Var.n || z) {
            return lx6.c;
        }
        double d2 = vw6Var.f38133a;
        double d3 = vw6Var.d;
        double dB = vw6Var.b();
        return ((d3 > d2 || d2 > dB) && d2 != -1.0d && (d2 <= dB || !vw6Var.m)) ? lx6.b : lx6.f20799a;
    }

    public static final void b(mm40 mm40Var, pe0 pe0Var, float f2, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i2) {
        Function1 function4;
        Function1 function5;
        mm40 mm40Var2;
        mm40 mm40VarE;
        pe0Var.getClass();
        fetVar.g0(-766779596);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(pe0Var) : fetVar.i(pe0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function4 = function2;
            i3 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i2) == 0) {
            function5 = function3;
            i3 |= fetVar.i(function5) ? 131072 : 65536;
        } else {
            function5 = function3;
        }
        boolean z = true;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            zcl zclVar = qmk.f28987a;
            boolean zIsNaN = Float.isNaN(f2);
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var = jm40.b;
            if (zIsNaN) {
                fetVar.e0(1800559806);
                boolean zD = fetVar.d(48.0f);
                Object objP = fetVar.P();
                if (zD || objP == cl5Var) {
                    objP = new ahd((byte) 20);
                    fetVar.o0(objP);
                }
                mm40VarE = knx.Q(jm40Var, (xdr) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(1801138421);
                fetVar.r(false);
                mm40VarE = o7k0.e(o7k0.s(jm40Var, f2), (f2 / 1.6666666f) + 48.0f);
            }
            mm40 mm40Var3 = mm40VarE;
            if (pe0Var instanceof st0) {
                fetVar.e0(1801325754);
                int i4 = i3 & 112;
                int i5 = i3 >> 6;
                d(mm40Var3, (st0) pe0Var, function4, function5, fetVar, i4 | (i5 & 896) | (i5 & 7168));
                fetVar.r(false);
            } else if (pe0Var instanceof ra0) {
                fetVar.e0(1801614240);
                boolean z2 = (i3 & 7168) == 2048;
                int i6 = i3 & 112;
                if (i6 != 32 && ((i3 & 64) == 0 || !fetVar.i(pe0Var))) {
                    z = false;
                }
                boolean z3 = z2 | z;
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new ct0(function1, pe0Var, (byte) 4);
                    fetVar.o0(objP2);
                }
                c(y860.W(mm40Var3, null, null, false, null, (Function0) objP2, 28), (ra0) pe0Var, fetVar, i6);
                fetVar.r(false);
            } else if (pe0Var instanceof fp1) {
                fetVar.e0(1801983481);
                e(0, fetVar, mm40Var3);
                fetVar.r(false);
            } else {
                fetVar.e0(1802101870);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ht0(mm40Var2, pe0Var, f2, function1, function2, function3, i2, (byte) 3);
        }
    }

    public static final rqm b0(wui0 wui0Var, String str, String str2, boolean z) {
        pz40 pz40Var = s6t0.f31722a;
        return new rqm((vui0) new tui0(str, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, z ? new kvi0(str2, new y3d(s6t0.b().f33626a.getSecondary()), new y3d(s6t0.b().f33626a.getSecondary())) : new jvi0(str2, new y3d(s6t0.b().f33626a.getSecondary())), d4d.BACKGROUND, (tvi0) null, wui0Var, false, (e900) null, 426);
    }

    public static final void c(mm40 mm40Var, ra0 ra0Var, fet fetVar, int i2) {
        int i3;
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-844237693);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(ra0Var) : fetVar2.i(ra0Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, 48.0f, 7), vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8.f16991a.b(s5x0.J(o7k0.y(jm40Var, null, 3), 8.0f), gqw0.e);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
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
            ra0Var.getClass();
            dww.c(a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar2), null, null, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 4);
            b2 = 4;
            v8q0.a(ra0Var.f30110a, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b2 = 4;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new et0(mm40Var, ra0Var, i2, b2);
        }
    }

    public static final rqm c0(ygq0 ygq0Var, String str, int i2, wui0 wui0Var) {
        pz40 pz40Var = s6t0.f31722a;
        return new rqm((vui0) new tui0(str, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new nvi0(ygq0Var.f42598a == i2), (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 442);
    }

    public static final void d(mm40 mm40Var, st0 st0Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        st0 st0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-281650277);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(st0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            mtr mtrVar = st0Var.d;
            boolean z = mtrVar != null && mtrVar.f22382a > 0;
            zcl zclVar = qmk.f28987a;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            int i4 = i3 & 112;
            boolean z2 = ((i3 & 7168) == 2048) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dt0(function2, st0Var, (byte) 8);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            mm40 mm40VarO = ny9.O(1.6666666f, o7k0.d(jm40Var, 1.0f), false);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarJ = lgb.J(jr8Var.b(mm40VarO, zx7Var), vgg0.a(16.0f));
            boolean z4 = z;
            int i5 = i3;
            j0x.b(lv00.T(st0Var.e, st0Var.f, null, null, fetVar, 0, 12), null, mm40VarJ, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            mm40 mm40VarB = jr8Var.b(s5x0.N(o7k0.e(jm40Var, 48.0f), 8.0f, 6.0f, 8.0f, 0.0f, 8), gqw0.h);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
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
            mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            st0Var2 = st0Var;
            String str = st0Var2.b;
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarW2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 48, 24960, 110584);
            v8q0.a(st0Var2.c, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            f(null, st0Var2.h, z4, fetVar2, 0);
            if (z4) {
                fetVar2.e0(1966912199);
                mm40 mm40VarQ = ffb0.Q(jr8Var.b(jm40Var, gqw0.c), -4.0f, 4.0f);
                zcl zclVar2 = qmk.g;
                mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarQ);
                StaticColors staticColors = StaticColors.INSTANCE;
                mm40 mm40VarQ2 = i120.Q(mm40VarE, staticColors.m75getBlack600d7_KjU(), jd8.n);
                boolean z5 = (i4 == 32) | ((i5 & 896) == 256);
                Object objP3 = fetVar2.P();
                if (z5 || objP3 == cl5Var) {
                    objP3 = new dt0(function1, st0Var2, (byte) 9);
                    fetVar2.o0(objP3);
                }
                dww.c(a8k0.F(st0Var2.d.f22382a, 0, fetVar2), null, s5x0.J(y860.W(mm40VarQ2, null, null, true, null, (Function0) objP3, 24), 6.0f), staticColors.m123getWhite0d7_KjU(), fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1967654401);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            st0Var2 = st0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new it0(mm40Var, st0Var2, function1, function2, i2, (byte) 4);
        }
    }

    public static int[] d0(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iG0 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iG0 += (int) bkb.g0(byteArrayInputStream, 2);
            iArr[i3] = iG0;
        }
        return iArr;
    }

    public static final void e(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(33842406);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, rw2.d(ny9.O(1.6666666f, h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), false), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            qxw.o(fetVar, rw2.d(h97.e(zclVar, zclVar, zclVar, zclVar, o7k0.e(o7k0.s(jm40Var, 108.0f), 14.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 4.0f));
            h97.s(h97.e(zclVar, zclVar, zclVar, zclVar, o7k0.e(o7k0.s(jm40Var, 64.0f), 14.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 9);
        }
    }

    public static cik[] e0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, cik[] cikVarArr) throws IOException {
        byte[] bArr3 = jiq0.r;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, jiq0.s)) {
                jf4.n("Unsupported meta version");
                return null;
            }
            int iG0 = (int) bkb.g0(fileInputStream, 2);
            byte[] bArrF0 = bkb.f0(fileInputStream, (int) bkb.g0(fileInputStream, 4), (int) bkb.g0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                jf4.n("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrF0);
            try {
                cik[] cikVarArrG0 = g0(byteArrayInputStream, bArr2, iG0, cikVarArr);
                byteArrayInputStream.close();
                return cikVarArrG0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(jiq0.m, bArr2)) {
            jf4.n("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            jf4.n("Unsupported meta version");
            return null;
        }
        int iG1 = (int) bkb.g0(fileInputStream, 1);
        byte[] bArrF1 = bkb.f0(fileInputStream, (int) bkb.g0(fileInputStream, 4), (int) bkb.g0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            jf4.n("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrF1);
        try {
            cik[] cikVarArrF0 = f0(byteArrayInputStream2, iG1, cikVarArr);
            byteArrayInputStream2.close();
            return cikVarArrF0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void f(mm40 mm40Var, nur nurVar, boolean z, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(426486411);
        int i3 = i2 | 6 | (fetVar.g(nurVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = nurVar instanceof mur;
            mm40Var2 = jm40.b;
            if (z2) {
                fetVar.e0(943632696);
                mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(ffb0.Q(mm40VarD, -1.0f, -1.0f), 0.0f, 0.0f, z ? 42.0f : 0.0f, 0.0f, 11);
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
                mur murVar = (mur) nurVar;
                j6n.h(murVar.f22425a, murVar.b, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false), 0, 0, fetVar, 0, 24);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(nurVar, lur.f20686a)) {
                    throw b1j.f(1831554355, fetVar, false);
                }
                fetVar.e0(945116821);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mt0(mm40Var2, nurVar, z, i2, (byte) 2);
        }
    }

    public static cik[] f0(ByteArrayInputStream byteArrayInputStream, int i2, cik[] cikVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new cik[0];
        }
        if (i2 != cikVarArr.length) {
            jf4.n("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG0 = (int) bkb.g0(byteArrayInputStream, 2);
            iArr[i3] = (int) bkb.g0(byteArrayInputStream, 2);
            strArr[i3] = new String(bkb.e0(byteArrayInputStream, iG0), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            cik cikVar = cikVarArr[i4];
            if (!cikVar.b.equals(strArr[i4])) {
                jf4.n("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            cikVar.e = i5;
            cikVar.h = d0(byteArrayInputStream, i5);
        }
        return cikVarArr;
    }

    public static final void g(mm40 mm40Var, ax0 ax0Var, fet fetVar, int i2) {
        fetVar.g0(76987045);
        int i3 = (fetVar.g(ax0Var) ? 32 : 16) | i2;
        byte b2 = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
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
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            int i4 = i3 & 112;
            boolean zI = (i4 == 32) | fetVar.i(clzVar);
            Object objP3 = fetVar.P();
            byte b3 = 9;
            if (zI || objP3 == cl5Var) {
                objP3 = new df1(clzVar, ax0Var, b3);
                fetVar.o0(objP3);
            }
            m0x0.o(clzVar, (Function1) objP3, fetVar);
            n0q n0qVar = o7k0.c;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new dj1((byte) 17);
                fetVar.o0(objP4);
            }
            Function1 function1 = (Function1) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new dj1(b2);
                fetVar.o0(objP5);
            }
            Function1 function2 = (Function1) objP5;
            boolean z = i4 == 32;
            Object objP6 = fetVar.P();
            if (z || objP6 == cl5Var) {
                objP6 = new on(ax0Var, pz40Var, pz40Var2, b3);
                fetVar.o0(objP6);
            }
            dwi0.c(function1, n0qVar, null, function2, (Function1) objP6, fetVar, 3126, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(mm40Var, ax0Var, i2, (byte) 2);
        }
    }

    public static cik[] g0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, cik[] cikVarArr) throws IOException {
        cik cikVar;
        if (byteArrayInputStream.available() == 0) {
            return new cik[0];
        }
        if (i2 != cikVarArr.length) {
            jf4.n("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            bkb.g0(byteArrayInputStream, 2);
            String str = new String(bkb.e0(byteArrayInputStream, (int) bkb.g0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jG0 = bkb.g0(byteArrayInputStream, 4);
            int iG0 = (int) bkb.g0(byteArrayInputStream, 2);
            if (cikVarArr.length <= 0) {
                cikVar = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(Separators.COLON);
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= cikVarArr.length) {
                    cikVar = null;
                    break;
                }
                if (cikVarArr[i4].b.equals(strSubstring)) {
                    cikVar = cikVarArr[i4];
                    break;
                }
                i4++;
            }
            if (cikVar == null) {
                jf4.n("Missing profile key: ".concat(str));
                return null;
            }
            cikVar.d = jG0;
            int[] iArrD0 = d0(byteArrayInputStream, iG0);
            if (Arrays.equals(bArr, jiq0.q)) {
                cikVar.e = iG0;
                cikVar.h = iArrD0;
            }
        }
        return cikVarArr;
    }

    public static final void h(mm40 mm40Var, a32 a32Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        a32Var.getClass();
        fetVar.g0(-594645529);
        int i3 = i2 | 6 | (fetVar.g(a32Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).c;
            mm40Var2 = jm40.b;
            nkb.h(s5x0.N(o7k0.d(s5x0.L(mm40Var2, f2, 0.0f, 2), 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), a32Var.f151a, kjm.f18392a, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(mm40Var2, a32Var, i2, (byte) 4);
        }
    }

    public static cik[] h0(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, jiq0.n)) {
            jf4.n("Unsupported version");
            return null;
        }
        int iG0 = (int) bkb.g0(fileInputStream, 1);
        byte[] bArrF0 = bkb.f0(fileInputStream, (int) bkb.g0(fileInputStream, 4), (int) bkb.g0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            jf4.n("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrF0);
        try {
            cik[] cikVarArrI0 = i0(byteArrayInputStream, str, iG0);
            byteArrayInputStream.close();
            return cikVarArrI0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void i(int i2, fet fetVar, mm40 mm40Var, List list, Function1 function1) {
        mm40 mm40Var2;
        list.getClass();
        function1.getClass();
        fetVar.g0(-1423938760);
        byte b2 = 2;
        int i3 = (fetVar.g(list) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16) | 384;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var2 = jm40.b;
            jwb.p(o7k0.d(mm40Var2, 1.0f), null, null, null, 0, 0, u1c.M(363692211, new ab4(list, function1, b2), fetVar), fetVar, 1572864, 62);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tp4(list, function1, mm40Var2, i2);
        }
    }

    public static cik[] i0(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new cik[0];
        }
        cik[] cikVarArr = new cik[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iG0 = (int) bkb.g0(byteArrayInputStream, 2);
            int iG1 = (int) bkb.g0(byteArrayInputStream, 2);
            cikVarArr[i4] = new cik(str, new String(bkb.e0(byteArrayInputStream, iG0), StandardCharsets.UTF_8), bkb.g0(byteArrayInputStream, 4), iG1, (int) bkb.g0(byteArrayInputStream, 4), (int) bkb.g0(byteArrayInputStream, 4), new int[iG1], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            cik cikVar = cikVarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = cikVar.f;
            int i7 = cikVar.g;
            TreeMap treeMap = cikVar.i;
            int i8 = iAvailable - i6;
            int iG2 = i3;
            while (byteArrayInputStream.available() > i8) {
                iG2 += (int) bkb.g0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iG2), 1);
                int iG3 = (int) bkb.g0(byteArrayInputStream, 2);
                while (iG3 > 0) {
                    bkb.g0(byteArrayInputStream, 2);
                    int iG4 = (int) bkb.g0(byteArrayInputStream, 1);
                    if (iG4 != 6 && iG4 != 7) {
                        while (iG4 > 0) {
                            bkb.g0(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iG5 = (int) bkb.g0(byteArrayInputStream, 1); iG5 > 0; iG5--) {
                                bkb.g0(byteArrayInputStream, 2);
                            }
                            iG4--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iG3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                jf4.n("Read too much data during profile line parse");
                return null;
            }
            cikVar.h = d0(byteArrayInputStream, cikVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(bkb.e0(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return cikVarArr;
    }

    public static final void j(int i2, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        String str4;
        String str5;
        fet fetVar2 = fetVar;
        brm0.B(str, str2, str3);
        fetVar2.g0(2056916836);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(str3) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(new daq0(qmk.q));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            mm40 mm40VarI = hne.i(1.0f, false, "WALLET_TITLE");
            qrq qrqVar = j1t0.c;
            long j = qmk.q;
            y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646109);
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarI, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary80(), new n05(qmk.o, j, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i3 >> 3) & 14, 24960, 110576);
            fetVar2 = fetVar;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
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
            str4 = str2;
            str5 = str3;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1286198390, new sg5(str4, str5, pz40Var, (byte) 1), fetVar2), fetVar2, 56);
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, o2e.e0(s5x0.N(o7k0.n(jm40Var, 14.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), "ICON_ALL_ACCOUNTS"), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            str4 = str2;
            str5 = str3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cm5(mm40Var, str, str4, str5, i2, (byte) 0);
        }
    }

    public static final aw6 j0(vw6 vw6Var, po7 po7Var, ctf0 ctf0Var, mnb0 mnb0Var, String str, boolean z) {
        String str2;
        rln0 rln0VarY;
        ctf0Var.getClass();
        str.getClass();
        lx6 lx6VarA0 = a0(vw6Var, z);
        boolean z2 = vw6Var.j;
        sx6 sx6Var = new sx6(po7Var, ctf0Var.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), vw6Var.o, true, vw6Var.p);
        if (!mnb0Var.f22081a || lx6VarA0 == lx6.b) {
            str2 = str;
            rln0VarY = Y(vw6Var, ctf0Var, str2);
        } else {
            String str3 = mnb0Var.b;
            String str4 = mnb0Var.c;
            if (z) {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            rln0VarY = new nln0(str3, str4);
            str2 = str;
        }
        double d2 = vw6Var.f38133a;
        return new aw6(sx6Var, rln0VarY, new nke(false, false, d2 > vw6Var.d && z2 && !z, d2 < vw6Var.b() && z2 && !z), lx6VarA0, o0(vw6Var), str2);
    }

    public static final void k(mm40 mm40Var, pz40 pz40Var, pz40 pz40Var2, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-283688197);
        int i3 = i2 | 6 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.g(pz40Var2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.h;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i4 = i3 >> 3;
            F(mrv.k0(jm40Var, "LEFT_SECTION_ID"), pz40Var2, function0, function1, fetVar, (i4 & 112) | 6 | (i4 & 896) | (i4 & 7168));
            if (pz40Var.getValue() instanceof g30) {
                fetVar.e0(-2034668578);
                fetVar.r(false);
            } else {
                fetVar.e0(-2034911711);
                M(mrv.k0(jm40Var, "RIGHT_SECTION_ID"), pz40Var, function2, fetVar, ((i3 >> 9) & 896) | (i3 & 112) | 6);
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
            yfe0VarU.d = new aw7(mm40Var2, pz40Var, pz40Var2, function0, function1, function2, i2, (byte) 0);
        }
    }

    public static final aw6 k0(dx6 dx6Var, ctf0 ctf0Var, mnb0 mnb0Var, String str, boolean z) {
        String str2;
        rln0 rln0VarY;
        ctf0Var.getClass();
        str.getClass();
        vw6 vw6Var = dx6Var.b;
        lx6 lx6VarA0 = a0(vw6Var, z);
        boolean z2 = vw6Var.j;
        sx6 sx6Var = new sx6(androidx.compose.runtime.e.e(dx6Var.f6832a), ctf0Var.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), vw6Var.o, true, vw6Var.p);
        if (!mnb0Var.f22081a || lx6VarA0 == lx6.b) {
            str2 = str;
            rln0VarY = Y(vw6Var, ctf0Var, str2);
        } else {
            String str3 = mnb0Var.b;
            String str4 = mnb0Var.c;
            if (z) {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            rln0VarY = new nln0(str3, str4);
            str2 = str;
        }
        double d2 = vw6Var.f38133a;
        return new aw6(sx6Var, rln0VarY, new nke(false, false, d2 > vw6Var.d && z2 && !z, d2 < vw6Var.b() && z2 && !z), lx6VarA0, o0(vw6Var), str2);
    }

    public static final void l(id8 id8Var, Function1 function1, fet fetVar, int i2) {
        Object obj = id8Var;
        Object obj2 = function1;
        obj.getClass();
        obj2.getClass();
        fetVar.g0(1124204244);
        int i3 = (fetVar.g(obj) ? 4 : 2) | i2 | (fetVar.i(obj2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            wfn wfnVarA = xfn.a(fetVar);
            String strW = rsm0.w(R.string.bonus_title, 0, fetVar);
            androidx.compose.runtime.d dVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            boolean zG = fetVar.g(strW) | fetVar.f(secondary);
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (zG || objP == obj3) {
                Object hjmVar = new hjm(strW, null, new y3d(secondary), null, null, null, false, null, null, false, null, null, 8186);
                fetVar.o0(hjmVar);
                objP = hjmVar;
            }
            Object obj4 = (hjm) objP;
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(dVar)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            float f2 = wfnVarA.d;
            mm40 mm40VarN = s5x0.N(mm40VarQ, f2, 8.0f, f2, 0.0f, 8);
            boolean zG2 = ((i3 & 14) == 4) | fetVar.g(wfnVarA) | fetVar.g(obj4) | ((i3 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj3) {
                Object dc0Var = new dc0(obj, (Object) wfnVarA, obj4, obj2, (byte) 14);
                fetVar.o0(dc0Var);
                objP2 = dc0Var;
            }
            b8k0.e(mm40VarN, null, null, null, null, null, false, null, (Function1) objP2, fetVar, 0, 510);
        } else {
            obj = obj;
            obj2 = obj2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(obj, obj2, i2, (byte) 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.ArrayList] */
    public static final fn9 l0(pn9 pn9Var, vby vbyVar) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        pn9Var.getClass();
        vbyVar.getClass();
        Long l = pn9Var.f27276a;
        List list = pn9Var.t;
        long jLongValue = l != null ? l.longValue() : -1L;
        Long l2 = pn9Var.b;
        long jLongValue2 = l2 != null ? l2.longValue() : -1L;
        Long l3 = pn9Var.c;
        long jLongValue3 = l3 != null ? l3.longValue() : -1L;
        Long l4 = pn9Var.d;
        long jLongValue4 = l4 != null ? l4.longValue() : -1L;
        String str = pn9Var.e;
        String str2 = "";
        String str3 = str == null ? "" : str;
        String str4 = pn9Var.f;
        String str5 = str4 == null ? "" : str4;
        String str6 = pn9Var.g;
        String str7 = str6 == null ? "" : str6;
        String str8 = pn9Var.h;
        String str9 = str8 == null ? "" : str8;
        Long l5 = pn9Var.i;
        long jLongValue5 = l5 != null ? l5.longValue() : -1L;
        List list2 = pn9Var.j;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                kn9 kn9Var = (kn9) it.next();
                kn9Var.getClass();
                String str10 = kn9Var.f18573a;
                if (str10 == null) {
                    str10 = str2;
                }
                Long l6 = kn9Var.b;
                long jLongValue6 = l6 != null ? l6.longValue() : -1L;
                List list3 = kn9Var.c;
                String str11 = str2;
                if (list3 != null) {
                    arrayList4 = new ArrayList(r3d.q(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(jar0.a0((so9) it2.next()));
                    }
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = iun.f15405a;
                }
                arrayList.add(new hn9(jLongValue6, str10, arrayList4));
                it = it;
                str2 = str11;
                list = list;
                jLongValue = jLongValue;
            }
        } else {
            arrayList = null;
        }
        List list4 = list;
        String str12 = str2;
        long j = jLongValue;
        List list5 = arrayList;
        if (arrayList == null) {
            list5 = iun.f15405a;
        }
        Integer num = pn9Var.k;
        int iIntValue = num != null ? num.intValue() : -1;
        List list6 = pn9Var.l;
        if (list6 != null) {
            arrayList2 = new ArrayList(r3d.q(list6, 10));
            Iterator it3 = list6.iterator();
            while (it3.hasNext()) {
                arrayList2.add(jar0.a0((so9) it3.next()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        String strE = lmc.E(pn9Var.m);
        String str13 = pn9Var.n;
        String str14 = str13 == null ? str12 : str13;
        String str15 = pn9Var.o;
        if (str15 == null) {
            str15 = str12;
        }
        Long l7 = pn9Var.p;
        long jLongValue7 = l7 != null ? l7.longValue() : -1L;
        Long l8 = pn9Var.q;
        long jLongValue8 = l8 != null ? l8.longValue() : -1L;
        List list7 = list4 == null ? iun.f15405a : list4;
        kie0 kie0Var = new kie0();
        int i2 = iIntValue;
        Iterable iterable = pn9Var.r;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        List list8 = list5;
        ?? r34 = arrayList2;
        List listT = pgi0.t(pgi0.q(CollectionsKt.I(iterable), new gn9(vbyVar, list7, kie0Var, false ? 1 : 0)));
        Boolean bool = pn9Var.s;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        List list9 = list4 == null ? iun.f15405a : list4;
        String strE2 = lmc.E(pn9Var.u);
        List<sm9> list10 = pn9Var.v;
        if (list10 != null) {
            arrayList3 = new ArrayList(r3d.q(list10, 10));
            for (sm9 sm9Var : list10) {
                sm9Var.getClass();
                String str16 = sm9Var.f32433a;
                String str17 = str16 == null ? str12 : str16;
                String str18 = sm9Var.b;
                String str19 = str18 == null ? str12 : str18;
                Float f2 = sm9Var.c;
                float fFloatValue = 0.0f;
                float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
                Float f3 = sm9Var.d;
                float fFloatValue3 = f3 != null ? f3.floatValue() : 0.0f;
                Float f4 = sm9Var.e;
                if (f4 != null) {
                    fFloatValue = f4.floatValue();
                }
                arrayList3.add(new pm9(str17, str19, fFloatValue2, fFloatValue3, fFloatValue));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        return new fn9(j, jLongValue2, jLongValue3, jLongValue4, str3, str5, str7, str9, jLongValue5, list8, i2, r34, strE, str14, str15, jLongValue7, jLongValue8, listT, zBooleanValue, list9, strE2, arrayList3);
    }

    public static final void m(int i2, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        yfe0 yfe0VarU;
        hx1 hx1Var;
        String str2 = str;
        fetVar.g0(727817058);
        int i3 = i2 | 6 | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            l7m0 l7m0Var = (l7m0) fetVar.k(fka.f9681a);
            Object[] objArr = {l7m0Var};
            boolean zG = fetVar.g(l7m0Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new kk7(l7m0Var, (byte) 19);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = {l7m0Var};
            boolean zG2 = fetVar.g(l7m0Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new kk7(l7m0Var, (byte) 20);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = {l7m0Var};
            boolean zG3 = fetVar.g(l7m0Var);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj) {
                objP3 = new kk7(l7m0Var, (byte) 21);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar);
            Object[] objArr4 = {l7m0Var};
            boolean zG4 = fetVar.g(l7m0Var);
            Object objP4 = fetVar.P();
            if (zG4 || objP4 == obj) {
                objP4 = new kk7(l7m0Var, (byte) 22);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP4, fetVar);
            Object[] objArr5 = {l7m0Var};
            boolean zG5 = fetVar.g(l7m0Var);
            Object objP5 = fetVar.P();
            if (zG5 || objP5 == obj) {
                objP5 = new kk7(l7m0Var, (byte) 23);
                fetVar.o0(objP5);
            }
            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP5, fetVar);
            boolean zBooleanValue = ((Boolean) l7m0VarY.getValue()).booleanValue();
            jm40 jm40Var = jm40.b;
            if (zBooleanValue) {
                mm40Var2 = jm40Var;
                str2 = str;
                fetVar.e0(1403982272);
                fetVar.r(false);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                jiq0.f(0, fetVar, null, l7m0VarY2);
                jiq0.f(0, fetVar, null, l7m0VarY3);
                jiq0.f(0, fetVar, null, l7m0VarY4);
                jiq0.f(0, fetVar, null, l7m0VarY5);
                fetVar.r(true);
            } else {
                fetVar.e0(1403776618);
                v8q0.a(str, jm40Var, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, ((i3 >> 3) & 14) | 48, 0, 131064);
                fetVar.r(false);
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    hx1Var = new hx1(jm40Var, str, i2, (byte) 8);
                }
            }
            yfe0VarU.d = hx1Var;
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            hx1Var = new hx1(mm40Var2, str2, i2, (byte) 9);
            yfe0VarU.d = hx1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    public static final wea m0(zea zeaVar) {
        ?? arrayList;
        ?? arrayList2;
        zeaVar.getClass();
        uea ueaVar = uea.f35515a;
        uea ueaVar2 = (uea) xp20.f(new Pair(0, ueaVar), new Pair(1, uea.b), new Pair(2, uea.d), new Pair(3, uea.c), new Pair(4, uea.e), new Pair(5, uea.g), new Pair(6, uea.f)).get(zeaVar.f44241a);
        uea ueaVar3 = ueaVar2 == null ? ueaVar : ueaVar2;
        Integer num = zeaVar.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = zeaVar.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = zeaVar.d;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Integer num4 = zeaVar.e;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        List list = zeaVar.h;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n0((dfa) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r9 = arrayList;
        List list2 = zeaVar.i;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(n0((dfa) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        return new wea(ueaVar3, iIntValue, iIntValue2, iIntValue3, iIntValue4, r9, arrayList2);
    }

    public static final void n(mm40 mm40Var, String str, String str2, xx7 xx7Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-356621477);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            int i4 = i3 >> 3;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
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
            zfn zfnVar = m8m0.f21378a;
            long jM131getWhite800d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, jM131getWhite800d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar2, i4 & 14, 24960, 110586);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.i(), fetVar2, (i3 >> 6) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r0i(mm40Var, str, str2, xx7Var, i2, (byte) 1);
        }
    }

    public static final afa n0(dfa dfaVar) {
        Integer num = dfaVar.c;
        return new afa(num != null ? num.intValue() : 0, x1x.Q(dfaVar.f5990a), x1x.Q(dfaVar.b), Intrinsics.d(dfaVar.d, Boolean.TRUE));
    }

    public static final void o(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(415996545);
        int i3 = i2 | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
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
            if (a4xVar.isEmpty()) {
                fetVar2.e0(-2010609397);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2011333030);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(627210770, new eup(a4xVar, (byte) 9), fetVar2), fetVar2, 56);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(-2010551427);
                jm40Var = jm40Var2;
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i3 >> 6) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(-2010312789);
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
            yfe0VarU.d = new pea(mm40Var2, a4xVar, str, i2, (byte) 1);
        }
    }

    public static final prm o0(vw6 vw6Var) {
        lrm jrmVar;
        double d2 = vw6Var.e;
        boolean z = vw6Var.n;
        boolean z2 = vw6Var.g;
        double d3 = vw6Var.d;
        Float fValueOf = Float.valueOf(d2 > d3 ? l1e0.c((float) (((vw6Var.f38133a - d3) / (d2 - d3)) * 100.0d), 0.0f, 100.0f) : 0.0f);
        if (z2) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        String str = vw6Var.f;
        if (z) {
            jrmVar = krm.f18772a;
        } else {
            int i2 = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0 p3u0Var = p3u0.c;
            jrmVar = new jrm(new g8k0(6, cy7.e(pn40.d(d3, str, p3u0Var)), null), new g8k0(6, z2 ? "∞" : cy7.e(pn40.d(d2, str, p3u0Var)), null));
        }
        return new prm(fFloatValue, jrmVar, null, null, (z2 || z) ? false : true, 118);
    }

    public static final void p(x0b x0bVar, fet fetVar, int i2) {
        fetVar.g0(-1022667468);
        int i3 = (fetVar.g(x0bVar) ? 32 : 16) | i2;
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (x0bVar instanceof w0b) {
            fetVar.e0(764078772);
            u(6, fetVar);
            fetVar.r(false);
        } else {
            if (!(x0bVar instanceof v0b)) {
                throw b1j.f(764077058, fetVar, false);
            }
            fetVar.e0(764081330);
            q((v0b) x0bVar, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(x0bVar, i2, (byte) 13);
        }
    }

    public static boolean p0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, cik[] cikVarArr) throws IOException {
        int i2;
        int i3;
        int length;
        byte[] bArr2 = jiq0.q;
        byte[] bArr3 = jiq0.p;
        byte[] bArr4 = jiq0.m;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = jiq0.n;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrX = X(cikVarArr, bArr5);
                bkb.u0(byteArrayOutputStream, cikVarArr.length, 1);
                bkb.u0(byteArrayOutputStream, bArrX.length, 4);
                byte[] bArrF = bkb.F(bArrX);
                bkb.u0(byteArrayOutputStream, bArrF.length, 4);
                byteArrayOutputStream.write(bArrF);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                bkb.u0(byteArrayOutputStream, cikVarArr.length, 1);
                for (cik cikVar : cikVarArr) {
                    int size = cikVar.i.size() * 4;
                    String strZ = Z(cikVar.f4419a, cikVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    bkb.v0(byteArrayOutputStream, strZ.getBytes(charset).length);
                    bkb.v0(byteArrayOutputStream, cikVar.h.length);
                    bkb.u0(byteArrayOutputStream, size, 4);
                    bkb.u0(byteArrayOutputStream, cikVar.c, 4);
                    byteArrayOutputStream.write(strZ.getBytes(charset));
                    Iterator it = cikVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        bkb.v0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        bkb.v0(byteArrayOutputStream, 0);
                    }
                    for (int i5 : cikVar.h) {
                        bkb.v0(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr6 = jiq0.o;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrX2 = X(cikVarArr, bArr6);
                bkb.u0(byteArrayOutputStream, cikVarArr.length, 1);
                bkb.u0(byteArrayOutputStream, bArrX2.length, 4);
                byte[] bArrF2 = bkb.F(bArrX2);
                bkb.u0(byteArrayOutputStream, bArrF2.length, 4);
                byteArrayOutputStream.write(bArrF2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            bkb.v0(byteArrayOutputStream, cikVarArr.length);
            for (cik cikVar2 : cikVarArr) {
                String str = cikVar2.f4419a;
                TreeMap treeMap = cikVar2.i;
                String strZ2 = Z(str, cikVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                bkb.v0(byteArrayOutputStream, strZ2.getBytes(charset2).length);
                bkb.v0(byteArrayOutputStream, treeMap.size());
                bkb.v0(byteArrayOutputStream, cikVar2.h.length);
                bkb.u0(byteArrayOutputStream, cikVar2.c, 4);
                byteArrayOutputStream.write(strZ2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    bkb.v0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : cikVar2.h) {
                    bkb.v0(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            bkb.v0(byteArrayOutputStream2, cikVarArr.length);
            int i7 = 2;
            int i8 = 2;
            for (cik cikVar3 : cikVarArr) {
                bkb.u0(byteArrayOutputStream2, cikVar3.c, 4);
                bkb.u0(byteArrayOutputStream2, cikVar3.d, 4);
                bkb.u0(byteArrayOutputStream2, cikVar3.g, 4);
                String strZ3 = Z(cikVar3.f4419a, cikVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strZ3.getBytes(charset3).length;
                bkb.v0(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(strZ3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            irv0 irv0Var = new irv0(byteArray, false, 1);
            byteArrayOutputStream2.close();
            arrayList.add(irv0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < cikVarArr.length) {
                try {
                    cik cikVar4 = cikVarArr[i9];
                    bkb.v0(byteArrayOutputStream3, i9);
                    bkb.v0(byteArrayOutputStream3, cikVar4.e);
                    i10 = i10 + 4 + (cikVar4.e * i7);
                    int[] iArr = cikVar4.h;
                    int length3 = iArr.length;
                    int i11 = i4;
                    while (i4 < length3) {
                        int i12 = iArr[i4];
                        bkb.v0(byteArrayOutputStream3, i12 - i11);
                        i4++;
                        i7 = i7;
                        i11 = i12;
                    }
                    i9++;
                    i4 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i13 = i7;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            irv0 irv0Var2 = new irv0(byteArray2, true, 3);
            byteArrayOutputStream3.close();
            arrayList.add(irv0Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i14 = 0;
            for (int i15 = 0; i15 < cikVarArr.length; i15++) {
                try {
                    cik cikVar5 = cikVarArr[i15];
                    Iterator it3 = cikVar5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        t0(byteArrayOutputStream5, iIntValue, cikVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            u0(byteArrayOutputStream6, cikVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            bkb.v0(byteArrayOutputStream4, i15);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i14 + 6;
                            bkb.u0(byteArrayOutputStream4, length4, 4);
                            bkb.v0(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i14 = i16 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            irv0 irv0Var3 = new irv0(byteArray5, true, 4);
            byteArrayOutputStream4.close();
            arrayList.add(irv0Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            bkb.u0(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                irv0 irv0Var4 = (irv0) arrayList.get(i17);
                int i18 = irv0Var4.f15277a;
                byte[] bArr7 = irv0Var4.b;
                if (i18 != 1) {
                    i2 = i13;
                    if (i18 == i2) {
                        i3 = 1;
                    } else if (i18 == 3) {
                        i3 = i2;
                    } else if (i18 == 4) {
                        i3 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        i3 = 4;
                    }
                } else {
                    i2 = i13;
                    i3 = 0;
                }
                bkb.u0(byteArrayOutputStream, i3, 4);
                bkb.u0(byteArrayOutputStream, size2, 4);
                if (irv0Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrF3 = bkb.F(bArr7);
                    arrayList2.add(bArrF3);
                    bkb.u0(byteArrayOutputStream, bArrF3.length, 4);
                    bkb.u0(byteArrayOutputStream, length5, 4);
                    length = bArrF3.length;
                } else {
                    arrayList2.add(bArr7);
                    bkb.u0(byteArrayOutputStream, bArr7.length, 4);
                    bkb.u0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i17++;
                i13 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static final void q(v0b v0bVar, fet fetVar, int i2) {
        v0b v0bVar2 = v0bVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(809075511);
        int i3 = i2 | (fetVar2.g(v0bVar2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = lgb.J(jm40Var, ugg0Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ugg0Var), 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarJ2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            k7x.b(v0bVar2.f36573a.a(), null, o7k0.n(jm40Var, 48.0f), a8k0.F(R.drawable.ic_glyph_color_status_unknown, 0, fetVar2), a8k0.F(R.drawable.ic_glyph_color_status_unknown, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            fetVar.r(true);
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 48);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, x7zVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), "CASHBACK_SUMMARY_CONTENT_TITLE");
            long j = qmk.s;
            v0bVar2 = v0bVar;
            v8q0.a(v0bVar.b, mm40VarE0, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, j, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110568);
            fetVar2 = fetVar;
            j6n.h(v0bVar2.c, dqo0.f6527a, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 4.0f, 5), 0, 0, fetVar2, 48, 24);
            j6n.h(v0bVar2.d, pso0.f27524a, null, 0, 0, fetVar2, 48, 28);
            fetVar2.r(true);
            fetVar2.r(true);
            r(v0bVar2.e, fetVar2, 6);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(v0bVar2, i2, (byte) 14);
        }
    }

    public static final j83 q0(j83 j83Var) {
        String str = j83Var.b;
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (!CharsKt.d(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        int length2 = str.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i3 = length2 - 1;
            if (!CharsKt.d(str.charAt(length2))) {
                break;
            }
            if (i3 < 0) {
                length2 = -1;
                break;
            }
            length2 = i3;
        }
        return (i2 == -1 || length2 == -1) ? new j83("") : j83Var.subSequence(i2, length2 + 1);
    }

    public static final void r(u0b u0bVar, fet fetVar, int i2) {
        fetVar.g0(-1094612006);
        int i3 = (fetVar.g(u0bVar) ? 32 : 16) | i2;
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (u0bVar instanceof s0b) {
            fetVar.e0(344855264);
            s(((s0b) u0bVar).f31403a, fetVar, i3 & 126);
            fetVar.r(false);
        } else {
            if (!(u0bVar instanceof t0b)) {
                throw b1j.f(344853444, fetVar, false);
            }
            fetVar.e0(344860227);
            t((t0b) u0bVar, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(u0bVar, i2, (byte) 15);
        }
    }

    public static void r0(ByteArrayOutputStream byteArrayOutputStream, cik cikVar) throws IOException {
        u0(byteArrayOutputStream, cikVar);
        int i2 = cikVar.g;
        int[] iArr = cikVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            bkb.v0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cikVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void s(String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1248215988);
        int i3 = i2 | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f, 10.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarB = jr8.f16991a.b(o7k0.w(o7k0.g(o7k0.d(jm40Var, 1.0f), 60.0f, 0.0f, 2), null, false, 3), gqw0.e);
            long secondary = s6t0.b().f33626a.getSecondary();
            qrq qrqVar = j1t0.c;
            long j = qmk.s;
            v8q0.a(str, mm40VarB, secondary, new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 16, i2, str);
        }
    }

    public static void s0(ByteArrayOutputStream byteArrayOutputStream, cik cikVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        bkb.v0(byteArrayOutputStream, str.getBytes(charset).length);
        bkb.v0(byteArrayOutputStream, cikVar.e);
        bkb.u0(byteArrayOutputStream, cikVar.f, 4);
        bkb.u0(byteArrayOutputStream, cikVar.c, 4);
        bkb.u0(byteArrayOutputStream, cikVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final void t(t0b t0bVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1920262408);
        int i3 = i2 | (fetVar2.g(t0bVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            v8q0.a(t0bVar.f33111a, o2e.e0(o7k0.d(jm40Var, 1.0f), "CASHBACK_EXPERIENCE_TITLE"), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 48, 24960, 109560);
            mm40 mm40VarN = s5x0.N(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), 0.0f, 6.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE0 = o2e.e0(mm40VarD2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), "CASHBACK_EXPERIENCE_CURRENT_LEVEL");
            String str = t0bVar.b;
            long textPrimary = s6t0.b().f33626a.getTextPrimary();
            y9q0 y9q0VarU = g1t0.u();
            long j = qmk.q;
            long j2 = qmk.u;
            long j3 = qmk.n;
            v8q0.a(str, mm40VarE0, textPrimary, new n05(j, j2, j3), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarU, fetVar, 0, 24960, 109552);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(t0bVar.c, o2e.e0(mm40VarD3.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), "CASHBACK_EXPERIENCE_SUMMARY_LEVEL"), s6t0.b().f33626a.getSecondary(), new n05(j, qmk.r, j3), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 0, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40 mm40VarE1 = o2e.e0(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 6.0f, 0.0f, 0.0f, 13), "CASHBACK_PROGRESS_INDICATOR");
            tnm tnmVar = tnm.f34243a;
            StaticColors staticColors = StaticColors.INSTANCE;
            snm.b(mm40VarE1, new unm(tnmVar, staticColors.m132getYellow0d7_KjU(), staticColors.m87getDarkOrange0d7_KjU(), s6t0.b().f33626a.getBackground(), 6.0f, 360.0f, t0bVar.d, t0bVar.e, true, 512), fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(t0bVar, i2, (byte) 16);
        }
    }

    public static void t0(ByteArrayOutputStream byteArrayOutputStream, int i2, cik cikVar) throws IOException {
        int i3 = cikVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : cikVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void u(int i2, fet fetVar) {
        fetVar.g0(-1510008884);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 180.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pua(i2, (byte) 6);
        }
    }

    public static void u0(ByteArrayOutputStream byteArrayOutputStream, cik cikVar) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : cikVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                bkb.v0(byteArrayOutputStream, iIntValue - i2);
                bkb.v0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static final void v(mm40 mm40Var, String str, mpm mpmVar, boolean z, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(1610548653);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mpmVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarD, 28.0f);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
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
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i3 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            n4c.l(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), mpmVar, z, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var, str, mpmVar, z, i2);
        }
    }

    public static final void w(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        fetVar.g0(402894251);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i6 = i4 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i6 & 1, (i6 & 147) != 146)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarE = mm40Var3.e(o7k0.c);
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
            jcb.l(null, mdmVar, false, function0, fetVar, (i6 & 112) | ((i6 << 3) & 7168), 5);
            fetVar.r(true);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n(mm40Var2, (Object) mdmVar, (Object) function0, i2, i3, (byte) 24);
        }
    }

    public static final void x(mm40 mm40Var, vpl vplVar, int i2, Function2 function2, fet fetVar, int i3) {
        int i4;
        vpl vplVar2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(491204103);
        int i5 = i3 | 6;
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? fetVar2.g(vplVar) : fetVar2.i(vplVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 = i2;
            i5 |= fetVar2.e(i4) ? 256 : 128;
        } else {
            i4 = i2;
        }
        if ((i3 & 3072) == 0) {
            i5 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            boolean z = (i5 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                upl.f36071a.getClass();
                objP = androidx.compose.runtime.e.e(bek.o(i4));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.s(o7k0.e(jm40Var, 256.0f), 280.0f), vgg0.a(16.0f)), xsm0.u((upl) pz40Var.getValue(), fetVar2), jd8.n);
            boolean z2 = ((i5 & 112) == 32 || ((i5 & 64) != 0 && fetVar2.i(vplVar))) | ((i5 & 7168) == 2048);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new x53(function2, vplVar, (byte) 4);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarF = phu0.F(mm40VarQ, null, null, false, null, (Function0) objP2, fetVar, 0, 15);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 168.0f), 1.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            n0q n0qVar = o7k0.c;
            mm40 mm40VarV = yyw.V(n0qVar, fetVar.k(bmd.n) == k6z.b);
            n0x n0xVar = vplVar.f;
            wpl wplVar = vplVar.i;
            k7x.b(n0xVar.a(), null, mm40VarV, a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar), a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            zq8.a(0, fetVar, i120.P(jr8.f16991a.b(o7k0.d(o7k0.e(jm40Var, 96.0f), 1.0f), gqw0.h), xsm0.v((upl) pz40Var.getValue(), fetVar), null, 6));
            fetVar.r(true);
            mm40 mm40VarJ = s5x0.J(n0qVar, 8.0f);
            nw3 nw3Var = uc9.g;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarJ);
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
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            jwb.p(null, new qw3(4.0f, true, new jf4((byte) 14)), new qw3(4.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(-1499867764, new n0i(vplVar, (byte) 3), fetVar), fetVar, 1572864, 57);
            fetVar.r(true);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String str = vplVar.b;
            zfn zfnVar = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            vplVar2 = vplVar;
            v8q0.a(str, mm40VarN, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(g1t0.q(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110584);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str2 = vplVar2.c;
            long jM123getWhite0d7_KjU2 = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarN2, jM123getWhite0d7_KjU2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110584);
            long jM126getWhite200d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m126getWhite200d7_KjU();
            fetVar.e0(-284009706);
            boolean zF = fetVar.f(jM126getWhite200d7_KjU);
            Object objP3 = fetVar.P();
            if (zF || objP3 == cl5Var) {
                objP3 = new nme((byte) 7, jM126getWhite200d7_KjU);
                fetVar.o0(objP3);
            }
            mm40 mm40VarJ2 = s5x0.J(rq8.K(jm40Var, (Function1) objP3), 8.0f);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarJ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            n(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), wplVar.f39550a, wplVar.b, xx7Var, fetVar, 3072);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            n(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), wplVar.c, wplVar.d, gqw0.o, fetVar2, 3072);
            fetVar2.r(true);
            fetVar2.r(false);
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            vplVar2 = vplVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6((Object) mm40Var2, (Object) vplVar2, i2, (Object) function2, i3, (byte) 3);
        }
    }

    public static final void y(mm40 mm40Var, bql bqlVar, Function0 function0, Function2 function2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(463269823);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bqlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (bqlVar instanceof zpl) {
            fetVar.e0(-1474287071);
            z(mm40Var, (zpl) bqlVar, function0, function2, fetVar, i3 & 8190);
            fetVar.r(false);
        } else {
            if (!bqlVar.equals(aql.f1301a)) {
                throw b1j.f(-1474289536, fetVar, false);
            }
            fetVar.e0(-1474277917);
            A(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0i(mm40Var, bqlVar, function0, function2, i2, (byte) 4);
        }
    }

    public static final void z(mm40 mm40Var, zpl zplVar, Function0 function0, Function2 function2, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(204044240);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(zplVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
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
            zcl zclVar = qmk.f28987a;
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
            int i4 = i3;
            nkb.h(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), new hjm(zplVar.f44764a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            wul wulVar = new wul(mul.e, oe9.d, new ue9(zplVar.b), true, false, false);
            boolean z2 = (i4 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new pk9(function0, (byte) 26);
                fetVar2.o0(objP);
            }
            qzb.n(null, wulVar, (Function0) objP, fetVar2, 0, 1);
            fetVar2.r(true);
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new l0i(zplVar, function2, (byte) 2);
                fetVar2.o0(objP2);
            }
            b8k0.f(null, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.REQUEST_PENDING);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m0i(mm40Var, zplVar, function0, function2, i2, (byte) 4);
        }
    }
}
