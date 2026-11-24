package a;

import android.javax.sip.header.ContentDispositionHeader;
import android.javax.sip.message.Response;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class idm0 implements r9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14593a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    public static r9x0 A(q9x0 q9x0Var) {
        rkt0 rkt0Var = q9x0Var.b;
        t9x0 t9x0Var = new t9x0(((icw0) rkt0Var.b).b());
        try {
            Provider providerA0 = hew0.a0();
            if (providerA0 == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerA0);
            return new hcp0((Object) t9x0Var, (Object) new u9x0(((icw0) rkt0Var.b).b(), providerA0), (byte) 16);
        } catch (GeneralSecurityException unused) {
            return t9x0Var;
        }
    }

    public static byte[] B(byte[] bArr) {
        if (bArr.length != 16) {
            jf4.o("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b2 = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2111496539);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 174.0f);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 24);
        }
    }

    public static final void b(ngm0 ngm0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(508807844);
        int i2 = i | (fetVar2.g(ngm0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            long j = ngm0Var.d;
            String str = ngm0Var.c;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            d(ngm0Var.b, fetVar2, 0);
            v8q0.a(ngm0Var.f23494a, dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), false), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (str.length() > 0) {
                fetVar2.e0(1283622849);
                k(0, fetVar2, null, str);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1283677626);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new edk0(ngm0Var, i, (byte) 23);
        }
    }

    public static final void c(mm40 mm40Var, z77 z77Var, Function1 function1, fet fetVar, int i) {
        Object l57Var;
        xcz xczVar;
        int i2;
        Object m57Var;
        z77 z77Var2;
        Function1 function2;
        z77Var.getClass();
        function1.getClass();
        fetVar.g0(-1366694678);
        int i3 = i | (fetVar.g(z77Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            wom womVarF = mom.f(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            Boolean boolValueOf = Boolean.valueOf(z77Var.e());
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean zI = (i4 == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                xczVar = xczVarA;
                i2 = i5;
                l57Var = new l57(z77Var, w2dVarW0, xczVar, function1, null, (byte) 2);
                fetVar.o0(l57Var);
            } else {
                i2 = i5;
                l57Var = objP2;
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) l57Var);
            Boolean boolValueOf2 = Boolean.valueOf(z77Var.g());
            boolean zI2 = (i4 == 32) | fetVar.i(w2dVarW0) | fetVar.i(vneVar) | fetVar.g(xczVar) | (i2 == 256);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                z77Var2 = z77Var;
                function2 = function1;
                xcz xczVar2 = xczVar;
                m57Var = new m57(z77Var2, w2dVarW0, vneVar, function2, xczVar2, null, (byte) 2);
                xczVar = xczVar2;
                fetVar.o0(m57Var);
            } else {
                function2 = function1;
                m57Var = objP3;
                z77Var2 = z77Var;
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) m57Var);
            v2n0.b(knm0.r(mm40Var), w2dVarW0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0.0f, u1c.M(-243465835, new e57(w2dVarW0, z77Var2, function2, (byte) 2), fetVar), u1c.M(-79741103, new i57(z77Var2, womVarF, w2dVarW0, function2, xczVar, (byte) 2), fetVar), fetVar, 224320, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j57(mm40Var, z77Var, function1, i, (byte) 4);
        }
    }

    public static final void d(String str, fet fetVar, int i) {
        String str2;
        fet fetVar2;
        fetVar.g0(1126798951);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            pge pgeVar = gqw0.B;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            str2 = str;
            fetVar2 = fetVar;
            lgb.v(o7k0.n(jm40Var, 16.0f), o7k0.n(jm40Var, 16.0f), str2, R.drawable.icon_globe_new, jM123getWhite0d7_KjU, pgeVar, fetVar2, ((i2 << 6) & 896) | 196608, 0);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 27, i, str2);
        }
    }

    public static final void f(mm40 mm40Var, float f, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        float f2;
        l7m0 l7m0Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(2136930001);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(56.0f, fetVar);
            float fB2 = pkd.b(4.0f, fetVar);
            float fB3 = pkd.b(f, fetVar);
            Unit unit = Unit.f46060a;
            int i3 = i2 & 896;
            boolean zG = (i3 == 256) | fetVar.g(xczVarA) | fetVar.d(fB) | fetVar.d(fB2) | fetVar.d(fB3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                z = true;
                f2 = 4.0f;
                l7m0Var2 = l7m0Var;
                Object ycg0Var = new ycg0(l7m0Var2, xczVarA, fB, fB2, fB3, null, (byte) 1);
                fetVar.o0(ycg0Var);
                objP = ycg0Var;
            } else {
                z = true;
                f2 = 4.0f;
                l7m0Var2 = l7m0Var;
            }
            m0x0.t(fetVar, unit, (Function2) objP);
            mm40 mm40VarE0 = o2e.e0(o7k0.e(o7k0.d(mm40Var, 1.0f), 64.0f), "TOP_EVENT_SPORT_FILTER_LAZY_ROW");
            qw3 qw3Var = new qw3(f2, z, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            boolean z2 = i3 == 256 ? z : r10;
            if ((i2 & 7168) != 2048) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == obj) {
                objP2 = new ys4(l7m0Var2, function1, (byte) 26);
                fetVar.o0(objP2);
            }
            b8k0.f(mm40VarE0, xczVarA, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) mm40Var, f, (Object) l7m0Var, (wdr) function1, i, (byte) 5);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        int i2;
        l7m0Var.getClass();
        fetVar.g0(790964632);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            vnr0 vnr0Var = (vnr0) l7m0Var.getValue();
            if (vnr0Var instanceof snr0) {
                fetVar.e0(1437020289);
                btm0.h((snr0) vnr0Var, o7k0.d(mm40Var, 1.0f), fetVar, 0);
                fetVar.r(false);
            } else if (vnr0Var instanceof tnr0) {
                fetVar.e0(-92185724);
                j5n0.o(o7k0.d(mm40Var, 1.0f), (tnr0) vnr0Var, fetVar, 0);
                fetVar.r(false);
            } else if (Intrinsics.d(vnr0Var, unr0.f35978a)) {
                fetVar.e0(-92179473);
                a(0, fetVar, o7k0.d(mm40Var, 1.0f));
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(vnr0Var, rnr0.f30803a)) {
                    throw b1j.f(-92195203, fetVar, false);
                }
                fetVar.e0(-92175679);
                zcl zclVar = qmk.f28987a;
                qxw.o(fetVar, o7k0.d(o7k0.e(mm40Var, 174.0f), 1.0f));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf4(mm40Var, l7m0Var, i, (byte) 3);
        }
    }

    public static final void h(final int i, final int i2, final int i3, final long j, final long j2, fet fetVar, final mm40 mm40Var) {
        fetVar.g0(272922376);
        int i4 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.f(j2) ? 256 : 128) | (fetVar.e(i) ? 2048 : 1024) | (fetVar.e(i2) ? 16384 : 8192);
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "TransactionButtonComponentColumn");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, j2, ugg0Var);
            xx7 xx7Var = gqw0.n;
            mm40 mm40VarE = mm40VarQ.e(new wkw(xx7Var));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40VarE, 64.0f, 40.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarP);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, zx7Var);
            int i5 = (i4 >> 9) & 14;
            j0x.b(a8k0.F(i2, (i4 >> 12) & 14, fetVar), null, o2e.e0(mm40VarB, rsm0.w(i, i5, fetVar) + ContentDispositionHeader.ICON), null, null, 0.0f, new m78(j, 5), fetVar, 56, 56);
            fetVar.r(true);
            v8q0.a(rsm0.w(i, i5, fetVar), s5x0.N(new wkw(xx7Var), 2.0f, 8.0f, 2.0f, 0.0f, 8), j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i4 << 3) & 896, 24960, 109560);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(j, j2, i, i2, i3) { // from class: a.uds0
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    idm0.h(this.d, this.e, iL, this.b, this.c, (fet) obj, this.f35494a);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void i(mm40 mm40Var, z8t0 z8t0Var, Function1 function1, fet fetVar, int i, int i2) {
        z8t0Var.getClass();
        function1.getClass();
        boolean z = true;
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        if (!(z8t0Var instanceof x8t0)) {
            if (!z8t0Var.equals(y8t0.f42211a)) {
                throw b1j.f(525934480, fetVar, false);
            }
            fetVar.e0(-875592007);
            fetVar.r(false);
            return;
        }
        fetVar.e0(-875835729);
        cpm cpmVar = ((x8t0) z8t0Var).b;
        if ((((i & 896) ^ 384) <= 256 || !fetVar.g(function1)) && (i & 384) != 256) {
            z = false;
        }
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new xar0(function1, (byte) 27);
            fetVar.o0(objP);
        }
        u1c.i(mm40Var2, cpmVar, (Function1) objP, fetVar, i & 14, 4);
        fetVar.r(false);
    }

    public static final void j(mm40 mm40Var, p6t0 p6t0Var, xdr xdrVar, Function1 function1, Function1 function2, Function2 function3, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        Object obj;
        Object obj2;
        Function1 function4;
        p6t0Var.getClass();
        xdrVar.getClass();
        fetVar.g0(-334414826);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= (i & 64) == 0 ? fetVar.g(p6t0Var) : fetVar.i(p6t0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            obj = function2;
            i5 |= fetVar.i(obj) ? 16384 : 8192;
        } else {
            obj = function2;
        }
        if ((196608 & i) == 0) {
            obj2 = function3;
            i5 |= fetVar.i(obj2) ? 131072 : 65536;
        } else {
            obj2 = function3;
        }
        int i6 = i5;
        if (fetVar.U(i6 & 1, (74899 & i6) != 74898)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (objP == obj3) {
                objP = new d4u0((byte) 11);
                fetVar.o0(objP);
            }
            Function1 function5 = (Function1) objP;
            Object objP2 = fetVar.P();
            Object obj4 = objP2;
            if (objP2 == obj3) {
                ki9 ki9Var = new ki9();
                ki9Var.f18326a = null;
                fetVar.o0(ki9Var);
                obj4 = ki9Var;
            }
            Object obj5 = (ki9) obj4;
            boolean zI = fetVar.i(obj5) | ((i6 & 57344) == 16384) | ((i6 & 112) == 32 || ((i6 & 64) != 0 && fetVar.i(p6t0Var))) | ((458752 & i6) == 131072);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj3) {
                Object l0i0Var = new l0i0(obj5, obj, (Object) p6t0Var, obj2, (byte) 15);
                fetVar.o0(l0i0Var);
                objP3 = l0i0Var;
            }
            mm40Var2 = mm40Var3;
            y860.g(xdrVar, mm40Var2, function5, null, (Function1) objP3, fetVar, ((i6 >> 6) & 14) | ((i6 << 3) & 112) | ((i6 >> 3) & 896), 8);
            function4 = function5;
        } else {
            fetVar.X();
            function4 = function1;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hjl(mm40Var2, p6t0Var, xdrVar, function4, function2, function3, i, i2, (byte) 6);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fetVar.g0(1739327072);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var2, 16.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            j6n.h(str, lso0.f20590a, jr8.f16991a.b(mm40Var2, gqw0.e), 0, 0, fetVar, ((i2 >> 3) & 14) | 48, 24);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str, i, (byte) 23);
        }
    }

    public static final i4 l(ctf0 ctf0Var, List list) {
        int i;
        list.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            eh ehVar = (eh) obj;
            if (ehVar.c.length() > 0 && ehVar.f7786a.length() > 0 && ehVar.e.length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            eh ehVar2 = (eh) next;
            ehVar2.getClass();
            String str = ehVar2.d;
            String strI = f140.i(i2, "ACHIEVEMENT");
            n0x n0xVar = new n0x(ehVar2.b);
            String str2 = ehVar2.f7786a;
            lc00 lc00VarB = kotlin.collections.a.b();
            String str3 = ehVar2.e;
            String str4 = ehVar2.c;
            int i4 = ehVar2.f;
            Iterator it2 = it;
            if (str3.length() != 0) {
                lc00VarB.add(new a4m(1L, new d4m(ctf0Var.b.a(R.string.player_info_position, Arrays.copyOf(new Object[0], 0)), twn.p("[^\\d-]", str3, ""))));
            }
            if (str.length() == 0) {
                i = 0;
            } else {
                i = 0;
                lc00VarB.add(new a4m(2L, new d4m(ctf0Var.b.a(R.string.cyber_tier, Arrays.copyOf(new Object[0], 0)), kotlin.text.c.r(kotlin.text.c.r(str, "-", "", false), "Tier", "", false))));
            }
            if (i4 > 0) {
                String strA = ctf0Var.b.a(R.string.prizes_money_statistic, Arrays.copyOf(new Object[i], i));
                Integer numValueOf = Integer.valueOf(i4);
                boolean z = ehVar2.g;
                DecimalFormat decimalFormat = new DecimalFormat("#,###");
                decimalFormat.setGroupingUsed(true);
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator('.');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                String str5 = decimalFormat.format(numValueOf);
                lc00VarB.add(new a4m(3L, new d4m(strA, z ? kng0.k("$", str5) : ohs0.n(str5, "$"))));
            }
            if (str4.length() != 0) {
                lc00VarB.add(new a4m(4L, new d4m(ctf0Var.b.a(R.string.date, Arrays.copyOf(new Object[0], 0)), str4)));
            }
            arrayList2 = arrayList2;
            arrayList2.add(new q7p0(strI, new h0g(n0xVar, str2, new g4m(dyb.o0(kotlin.collections.a.a(lc00VarB))))));
            it = it2;
            i2 = i3;
        }
        return dyb.r0(arrayList2);
    }

    public static final void m(long j) {
        eaq0[] eaq0VarArr = daq0.b;
        if ((j & 1095216660480L) == 0) {
            zcx.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void n(long j, long j2) {
        eaq0[] eaq0VarArr = daq0.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            zcx.a("Cannot perform operation for Unspecified type.");
        }
        if (eaq0.a(daq0.b(j), daq0.b(j2))) {
            return;
        }
        zcx.a("Cannot perform operation for " + eaq0.b(daq0.b(j)) + " and " + eaq0.b(daq0.b(j2)));
    }

    public static final Pair o(kbo kboVar) {
        kboVar.getClass();
        int i = kboVar.m;
        if (i == 0) {
            hgm hgmVar = hgm.c;
            return new Pair(hgmVar, hgmVar);
        }
        if (i == 1) {
            return new Pair(hgm.f13022a, hgm.b);
        }
        if (i == 2) {
            return new Pair(hgm.b, hgm.f13022a);
        }
        hgm hgmVar2 = hgm.d;
        return new Pair(hgmVar2, hgmVar2);
    }

    public static final String p(boolean z, long j) {
        if (j == 0) {
            return "";
        }
        rdj rdjVar = rdj.f30294a;
        return rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
    }

    public static final h1n q(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new h1n(new c280(str2, R.drawable.ic_glyph_placeholder_player), str);
    }

    public static final mpm r(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        opm opmVar = opm.f25648a;
        return z ? new lpm(opmVar, new hpm(0L, 3)) : new kpm(opmVar, new hpm(0L, 3), d5c.O(str, str2, false, false, new hpm(0L, 3)));
    }

    public static final long s(double d2) {
        return v((float) d2, 4294967296L);
    }

    public static final long t(int i) {
        return v(i, 4294967296L);
    }

    public static final boolean u(le90 le90Var) {
        le90Var.getClass();
        String str = le90Var.f19891a;
        String str2 = le90Var.b;
        if (str.length() <= 0 || str2.length() <= 0 || StringsKt.toIntOrNull(str) == null || StringsKt.toIntOrNull(str2) == null) {
            return false;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null && intOrNull.intValue() == -1) {
            return false;
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(str2);
        if (intOrNull2 != null && intOrNull2.intValue() == -1) {
            return false;
        }
        return ((str.equals("0") && str2.equals("0")) || le90Var.h == zf90.d || le90Var.g.length() <= 0) ? false : true;
    }

    public static final long v(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        eaq0[] eaq0VarArr = daq0.b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0129  */
    /* JADX WARN: Code duplicated, block: B:32:0x0184  */
    /* JADX WARN: Code duplicated, block: B:33:0x0187  */
    /* JADX WARN: Code duplicated, block: B:36:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x020c  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01f1 -> B:40:0x01fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object w(a.xcz r20, int r21, float r22, float r23, float r24, int r25, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.idm0.w(a.xcz, int, float, float, float, int, a.zje):java.lang.Object");
    }

    public static final oe9 x(bu6 bu6Var) {
        int iOrdinal = bu6Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return oe9.f25112a;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return oe9.b;
        }
        t9f.b();
        return null;
    }

    public static final lmp0 y(b5p0 b5p0Var) {
        b5p0Var.getClass();
        Integer num = b5p0Var.f2015a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = b5p0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = b5p0Var.c;
        return new lmp0(iIntValue, iIntValue2, num3 != null ? num3.intValue() : 0);
    }

    public static final void z(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
