package a;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class egm0 {
    public static final byte[] A(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return z(bArr, 0, bArr.length, bArr2);
        }
        jf4.o("The lengths of x and y should match.");
        return null;
    }

    public static byte[] B(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                hny.o("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final void a(k3t0 k3t0Var, fet fetVar, int i) {
        k3t0Var.getClass();
        fetVar.g0(-1528766758);
        byte b = 2;
        int i2 = (fetVar.g(k3t0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            f9m0 f9m0Var = new f9m0(R.string.statistic, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0VarC = ((drd0) pz40VarY.getValue()).c();
            j9m0 j9m0VarB = ((drd0) pz40VarY.getValue()).b();
            boolean zA = ((drd0) pz40VarY.getValue()).a();
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbh(i3t0Var, (byte) 27);
                fetVar.o0(objP);
            }
            ffb0.D(jm40.b, f9m0Var, zdm0VarC, j9m0VarB, zA, (Function0) objP, null, null, u1c.M(-905065368, new fg00(pz40VarY, i3t0Var, b), fetVar), fetVar, 100663302, 192);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xcr(k3t0Var, i, (byte) 6);
        }
    }

    public static final void b(z77 z77Var, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        zfn zfnVar;
        jm40 jm40Var;
        float f;
        int i2;
        zfn zfnVar2;
        cl5 cl5Var;
        boolean z;
        cl5 cl5Var2;
        z77Var.getClass();
        function1.getClass();
        fetVar.g0(1108086889);
        int i3 = i | (fetVar.g(z77Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zfn zfnVar3 = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar3)).getBackgroundContent();
            String str = z77Var.f().e.c;
            String str2 = z77Var.f().e.b;
            boolean z2 = z77Var.f().f.b;
            boolean z3 = z77Var instanceof y77;
            jm40 jm40Var2 = jm40.b;
            cl5 cl5Var3 = ukd.f35823a;
            if (z3) {
                fetVar.e0(-101552270);
                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                boolean zF = fetVar.f(backgroundContent);
                Object objP = fetVar.P();
                if (zF || objP == cl5Var3) {
                    objP = new r2a0(b, backgroundContent);
                    fetVar.o0(objP);
                }
                mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP);
                zcl zclVar = qmk.f28987a;
                xcm0.f(s5x0.K(mm40VarK, qmk.a(fetVar).d, 8.0f), ((y77) z77Var).g, function1, fetVar, (i3 << 3) & 896, 0);
                function2 = function1;
                fetVar.r(false);
            } else {
                function2 = function1;
                fetVar.e0(-100907656);
                mm40 mm40VarQ = i120.Q(jm40Var2, backgroundContent, jd8.n);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarD2 = o7k0.d(s5x0.L(jm40Var2, qmk.a(fetVar).d, 0.0f, 2), 1.0f);
                on5 on5VarB = z77Var.b();
                int i4 = i3 & 112;
                boolean z5 = i4 == 32;
                Object objP2 = fetVar.P();
                if (z5 || objP2 == cl5Var3) {
                    objP2 = new o0q0(function2, (byte) 6);
                    fetVar.o0(objP2);
                }
                boolean z6 = false;
                ffb0.c(mm40VarD2, on5VarB, (Function0) objP2, fetVar, 0);
                if (z2 || str.length() > 0 || str2.length() > 0) {
                    fetVar.e0(547038092);
                    mm40 mm40VarD3 = o7k0.d(s5x0.M(jm40Var2, qmk.a(fetVar).d, 8.0f, qmk.a(fetVar).d, 12.0f), 1.0f);
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD3);
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
                    int length = str.length();
                    zhg0 zhg0Var = zhg0.f44392a;
                    if (length > 0) {
                        fetVar.e0(-1069737234);
                        mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var2, true);
                        long commerceTint = ((ThemeColors) fetVar.k(zfnVar3)).getCommerceTint();
                        long commerce = ((ThemeColors) fetVar.k(zfnVar3)).getCommerce();
                        boolean z7 = i4 == 32;
                        Object objP3 = fetVar.P();
                        if (z7 || objP3 == cl5Var3) {
                            objP3 = new o0q0(function2, (byte) 7);
                            fetVar.o0(objP3);
                        }
                        zfnVar = zfnVar3;
                        jm40Var = jm40Var2;
                        f = 1.0f;
                        z6 = false;
                        idx.m(mm40VarA, str, commerceTint, commerce, R.drawable.ic_glyph_replenish_account, false, true, (Function0) objP3, fetVar, 1769472);
                        fetVar.r(false);
                    } else {
                        zfnVar = zfnVar3;
                        jm40Var = jm40Var2;
                        z6 = false;
                        f = 1.0f;
                        fetVar.e0(-1068936721);
                        fetVar.r(false);
                    }
                    if (str2.length() > 0) {
                        fetVar.e0(-1068858880);
                        mm40 mm40VarA2 = zhg0Var.a(f, jm40Var, true);
                        zfn zfnVar4 = zfnVar;
                        long background = ((ThemeColors) fetVar.k(zfnVar4)).getBackground();
                        long primary = ((ThemeColors) fetVar.k(zfnVar4)).getPrimary();
                        boolean z8 = i4 == 32 ? true : z6;
                        Object objP4 = fetVar.P();
                        if (z8) {
                            cl5Var2 = cl5Var3;
                        } else {
                            cl5Var2 = cl5Var3;
                            if (objP4 == cl5Var2) {
                            }
                            zfnVar2 = zfnVar4;
                            i2 = i4;
                            cl5Var = cl5Var2;
                            idx.m(mm40VarA2, str2, background, primary, R.drawable.ic_glyph_sell, false, true, (Function0) objP4, fetVar, 1769472);
                            fetVar.r(z6);
                        }
                        objP4 = new o0q0(function1, (byte) 8);
                        fetVar.o0(objP4);
                        zfnVar2 = zfnVar4;
                        i2 = i4;
                        cl5Var = cl5Var2;
                        idx.m(mm40VarA2, str2, background, primary, R.drawable.ic_glyph_sell, false, true, (Function0) objP4, fetVar, 1769472);
                        fetVar.r(z6);
                    } else {
                        i2 = i4;
                        zfnVar2 = zfnVar;
                        cl5Var = cl5Var3;
                        fetVar.e0(-1068075665);
                        fetVar.r(z6);
                    }
                    if (z77Var.f().f.b) {
                        fetVar.e0(-1067933561);
                        mm40 mm40VarA3 = zhg0Var.a(f, jm40Var, true);
                        String str3 = z77Var.f().f.f38463a;
                        zfn zfnVar5 = zfnVar2;
                        long background2 = ((ThemeColors) fetVar.k(zfnVar5)).getBackground();
                        long primary2 = ((ThemeColors) fetVar.k(zfnVar5)).getPrimary();
                        boolean z9 = z77Var.f().f.c;
                        boolean z10 = z77Var.f().f.d;
                        boolean z11 = i2 == 32 ? true : z6;
                        Object objP5 = fetVar.P();
                        if (z11 || objP5 == cl5Var) {
                            function2 = function1;
                            objP5 = new o0q0(function2, (byte) 9);
                            fetVar.o0(objP5);
                        } else {
                            function2 = function1;
                        }
                        idx.m(mm40VarA3, str3, background2, primary2, R.drawable.ic_glyph_filter_inactive, z9, z10, (Function0) objP5, fetVar, 0);
                        fetVar.r(z6);
                    } else {
                        function2 = function1;
                        fetVar.e0(-1066941809);
                        fetVar.r(z6);
                    }
                    z = true;
                    fetVar.r(true);
                    fetVar.r(z6);
                } else {
                    fetVar.e0(550402181);
                    zq8.a(0, fetVar, o7k0.e(jm40Var2, 8.0f));
                    fetVar.r(false);
                    z = true;
                }
                fetVar.r(z);
                fetVar.r(z6);
            }
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k57(z77Var, function2, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x014c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0155  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public static final void c(float f, fet fetVar, final int i, final int i2) {
        final float f2;
        int i3;
        int i4;
        boolean z;
        yfe0 yfe0VarU;
        fet fetVar2 = fetVar;
        fetVar2.g0(1286477551);
        if ((i2 & 1) == 0) {
            f2 = f;
            if (fetVar2.d(f2)) {
                i3 = 4;
            }
            i4 = i | i3;
            if ((i4 & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i4 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) == 0 && !fetVar2.B()) {
                    fetVar2.X();
                    int i5 = i2 & 1;
                } else if ((i2 & 1) != 0) {
                    zcl zclVar = qmk.f28987a;
                    f2 = 48.0f;
                }
                float f3 = f2;
                fetVar2.s();
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, f3, 0.0f, 0.0f, 13);
                zcl zclVar2 = qmk.f28987a;
                j0x.b(a8k0.F(R.drawable.ic_glyph_circle_dollar, 0, fetVar2), "", o2e.e0(o7k0.n(mm40VarN, 56.0f), "TransactionEmptyComponentImageTestTag"), gqw0.e, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60(), 5), fetVar2, 3128, 48);
                v8q0.a(rsm0.w(R.string.transaction_history_empty_lets_play_top_up_account, 0, fetVar2), o2e.e0(s5x0.L(jm40Var, 0.0f, 16.0f, 1), "TransactionEmptyComponentTextTestTag"), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 0, 130044);
                fetVar2 = fetVar;
                fetVar2.r(true);
                f2 = f3;
            } else {
                fetVar2.X();
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2(i, f2, i2) { // from class: a.ees0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ float f7688a;
                    public final /* synthetic */ boolean b;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.f7688a = f2;
                        this.b = i2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(1);
                        egm0.c(this.f7688a, (fet) obj, iL, this.b ? 1 : 0);
                        return Unit.f46060a;
                    }
                };
            }
        }
        f2 = f;
        i3 = 2;
        i4 = i | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i4 & 1, z)) {
            fetVar2.Z();
            if ((i & 1) == 0) {
                if ((i2 & 1) != 0) {
                    zcl zclVar3 = qmk.f28987a;
                    f2 = 48.0f;
                }
            } else if ((i2 & 1) != 0) {
                zcl zclVar4 = qmk.f28987a;
                f2 = 48.0f;
            }
            float f4 = f2;
            fetVar2.s();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, gqw0.x);
            jpm0.o(fetVar2, bh90VarM2, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC1, gqw0.v);
            mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, f4, 0.0f, 0.0f, 13);
            zcl zclVar5 = qmk.f28987a;
            j0x.b(a8k0.F(R.drawable.ic_glyph_circle_dollar, 0, fetVar2), "", o2e.e0(o7k0.n(mm40VarN2, 56.0f), "TransactionEmptyComponentImageTestTag"), gqw0.e, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60(), 5), fetVar2, 3128, 48);
            v8q0.a(rsm0.w(R.string.transaction_history_empty_lets_play_top_up_account, 0, fetVar2), o2e.e0(s5x0.L(jm40Var2, 0.0f, 16.0f, 1), "TransactionEmptyComponentTextTestTag"), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 0, 130044);
            fetVar2 = fetVar;
            fetVar2.r(true);
            f2 = f4;
        } else {
            fetVar2.X();
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(i, f2, i2) { // from class: a.ees0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f7688a;
                public final /* synthetic */ boolean b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f7688a = f2;
                    this.b = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    egm0.c(this.f7688a, (fet) obj, iL, this.b ? 1 : 0);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(mm40 mm40Var, final t180 t180Var, boolean z, k6z k6zVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        final byte b;
        k6zVar.getClass();
        fetVar.g0(900321833);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(t180Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(k6zVar.ordinal()) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            byte b2 = 12;
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new kp2(b2, z);
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
            v8q0.a(t180Var.f33159a, null, 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(qzb.y0(6, k6zVar, z)), 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 109558);
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                b = 0;
                objP2 = new Function0() { // from class: a.cxs0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b;
                        t180 t180Var2 = t180Var;
                        switch (b3) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.b);
                            case 1:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.c);
                            case 2:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.e);
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.f);
                        }
                    }
                };
                fetVar.o0(objP2);
            } else {
                b = 0;
            }
            final byte b3 = 1;
            kkb.p(1, fetVar, null, (Function0) objP2);
            byte b4 = i3 == 32 ? (byte) 1 : b;
            Object objP3 = fetVar.P();
            if (b4 != 0 || objP3 == cl5Var) {
                objP3 = new Function0() { // from class: a.cxs0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b3;
                        t180 t180Var2 = t180Var;
                        switch (b5) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.b);
                            case 1:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.c);
                            case 2:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.e);
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.f);
                        }
                    }
                };
                fetVar.o0(objP3);
            }
            kkb.p(1, fetVar, null, (Function0) objP3);
            n4c.l(null, t180Var.g, z, fetVar, 1);
            byte b5 = i3 == 32 ? (byte) 1 : b;
            Object objP4 = fetVar.P();
            if (b5 != 0 || objP4 == cl5Var) {
                final byte b6 = 2;
                objP4 = new Function0() { // from class: a.cxs0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b7 = b6;
                        t180 t180Var2 = t180Var;
                        switch (b7) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.b);
                            case 1:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.c);
                            case 2:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.e);
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.f);
                        }
                    }
                };
                fetVar.o0(objP4);
            }
            kkb.p(1, fetVar, null, (Function0) objP4);
            if (i3 == 32) {
                b = 1;
            }
            Object objP5 = fetVar.P();
            if (b != 0 || objP5 == cl5Var) {
                final byte b7 = 3;
                objP5 = new Function0() { // from class: a.cxs0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b8 = b7;
                        t180 t180Var2 = t180Var;
                        switch (b8) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.b);
                            case 1:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.c);
                            case 2:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.e);
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.j, t180Var2.f);
                        }
                    }
                };
                fetVar.o0(objP5);
            }
            kkb.p(1, fetVar, null, (Function0) objP5);
            v8q0.a(t180Var.d, null, 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(qzb.y0(5, k6zVar, z)), 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 109558);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 18, i, (Object) mm40Var, (Object) t180Var, (Object) k6zVar, z);
        }
    }

    public static final ank0 e(int i, boolean z) {
        int i2;
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        String strValueOf = String.valueOf(i);
        if (i > 25 || !z) {
            i2 = !z ? R.color.static_white_60 : R.color.static_white;
        } else {
            i2 = R.color.static_red;
        }
        pzw.E(bnk0Var, strValueOf, 0, i2, 0, 0, 54);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final ank0 f(String str, boolean z) {
        ArrayList arrayListU = ohs0.u(str);
        bnk0 bnk0Var = new bnk0();
        pzw.E(bnk0Var, str, 0, z ? R.color.static_white : R.color.static_white_60, 0, 0, 54);
        return w6x.l(arrayListU, bnk0Var.f2888a, arrayListU);
    }

    public static final jo20 g(lnf0 lnf0Var, int i, int i2, boolean z) {
        jo20 jo20Var = new jo20();
        if (i2 > 0) {
            jo20Var.put(Payload.TYPE, Integer.valueOf(i2));
        }
        jo20Var.put("gr", 1357);
        jo20Var.put("lng", lnf0Var.f20342a);
        qbt.l(jo20Var);
        qbt.c(i, jo20Var);
        jo20Var.put("top", Boolean.valueOf(z));
        qbt.p(jo20Var);
        return jo20Var.b();
    }

    public static final i4 h(d0t d0tVar, ctf0 ctf0Var, boolean z) {
        geu0 geu0VarV = v(d0tVar);
        ArrayList arrayListN0 = CollectionsKt.N0(StringsKt__StringsKt.split$default(kotlin.text.c.r(kotlin.text.c.r(z ? geu0VarV.c : geu0VarV.d, "[", "", false), "]", "", false), new String[]{Separators.COMMA}, false, 0, 6, null));
        if (arrayListN0.size() < 3) {
            int size = 3 - arrayListN0.size();
            for (int i = 0; i < size; i++) {
                arrayListN0.add("");
            }
        }
        lsm0 lsm0Var = ctf0Var.b;
        lsm0 lsm0Var2 = ctf0Var.b;
        return dyb.g0(new j2n(lsm0Var.a(R.string.synthetic_victory_formula_first_lowercase_value, Arrays.copyOf(new Object[0], 0)), (String) arrayListN0.get(0)), new j2n(lsm0Var2.a(R.string.synthetic_victory_formula_second_lowercase_value, Arrays.copyOf(new Object[0], 0)), (String) arrayListN0.get(1)), new j2n(lsm0Var2.a(R.string.synthetic_victory_formula_third_lowercase_value, Arrays.copyOf(new Object[0], 0)), (String) arrayListN0.get(2)));
    }

    public static final gbn i(Function1 function1) {
        return new gbn(new acm0((byte) 9), new asj0(3, (byte) 14), new zbm0(function1, (byte) 12), wjj0.v);
    }

    public static final ArrayList j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            while (it.hasNext()) {
                qct0 qct0Var = (qct0) it.next();
                String str2 = qct0Var.f28500a;
                tct0 tct0Var = qct0Var.b;
                if (str2 != null) {
                    str = str2;
                } else if (tct0Var != null && str != null) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String str3 = tct0Var.b;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (str3.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
                        sb.setLength(0);
                        sb.append(str3);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(str3, '/'));
                    }
                    String string = sb.toString();
                    String str5 = tct0Var.f33735a;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    arrayList.add(new phk0(str, string, str4));
                }
            }
            return arrayList;
        }
    }

    public static long k(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static final q9p0 l(skg skgVar) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        skgVar.getClass();
        Long l = skgVar.f32346a;
        vkg vkgVar = skgVar.j;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = skgVar.d;
        if (str == null) {
            str = "";
        }
        String str2 = skgVar.c;
        if (str2 == null) {
            str2 = "";
        }
        String strE = lmc.E(skgVar.h);
        String str3 = skgVar.f;
        String str4 = str3 != null ? str3 : "";
        String strE2 = lmc.E(skgVar.g);
        float fFloatValue = -1.0f;
        float fFloatValue2 = (vkgVar == null || (f4 = vkgVar.f37570a) == null) ? -1.0f : f4.floatValue();
        Integer num = skgVar.e;
        int iIntValue = num != null ? num.intValue() : -1;
        float fFloatValue3 = (vkgVar == null || (f3 = vkgVar.b) == null) ? -1.0f : f3.floatValue();
        float fFloatValue4 = (vkgVar == null || (f2 = vkgVar.c) == null) ? -1.0f : f2.floatValue();
        if (vkgVar != null && (f = vkgVar.d) != null) {
            fFloatValue = f.floatValue();
        }
        Integer num2 = skgVar.i;
        return new q9p0(jLongValue, str, str2, strE, str4, strE2, fFloatValue2, iIntValue, fFloatValue3, fFloatValue4, fFloatValue, num2 != null ? num2.intValue() : -1);
    }

    public static final r9p0 m(zmg zmgVar) {
        w9p0 w9p0Var;
        List list;
        zmgVar.getClass();
        Integer num = zmgVar.f44625a;
        long jIntValue = num != null ? num.intValue() : -1L;
        String str = zmgVar.b;
        String str2 = str == null ? "" : str;
        String str3 = zmgVar.c;
        String str4 = str3 == null ? "" : str3;
        String strE = lmc.E(zmgVar.f);
        String str5 = zmgVar.d;
        String str6 = str5 == null ? "" : str5;
        String strE2 = lmc.E(zmgVar.p);
        Integer num2 = zmgVar.m;
        if (num2 != null && num2.intValue() == 1) {
            w9p0Var = w9p0.b;
        } else if (num2 != null && num2.intValue() == 2) {
            w9p0Var = w9p0.c;
        } else if (num2 != null && num2.intValue() == 3) {
            w9p0Var = w9p0.d;
        } else if (num2 != null && num2.intValue() == 4) {
            w9p0Var = w9p0.e;
        } else {
            w9p0Var = (num2 != null && num2.intValue() == 5) ? w9p0.f : w9p0.f38791a;
        }
        w9p0 w9p0Var2 = w9p0Var;
        Float f = zmgVar.k;
        float fFloatValue = f != null ? f.floatValue() : -1.0f;
        Integer num3 = zmgVar.i;
        int iIntValue = num3 != null ? num3.intValue() : -1;
        Integer num4 = zmgVar.j;
        int iIntValue2 = num4 != null ? num4.intValue() : -1;
        List list2 = zmgVar.n;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                vmg vmgVar = (vmg) next;
                vmgVar.getClass();
                Iterator it2 = it;
                int i3 = iIntValue;
                long j = i;
                String str7 = vmgVar.f37673a;
                String str8 = str7 == null ? "" : str7;
                Integer num5 = vmgVar.e;
                int iIntValue3 = num5 != null ? num5.intValue() : -1;
                Double d = vmgVar.d;
                arrayList.add(new p8p0(j, str8, iIntValue3, d != null ? (float) d.doubleValue() : -1.0f, lmc.E(vmgVar.c)));
                iIntValue = i3;
                i = i2;
                it = it2;
            }
            list = arrayList;
        } else {
            list = null;
        }
        int i4 = iIntValue;
        if (list == null) {
            list = iun.f15405a;
        }
        return new r9p0(jIntValue, str2, str4, strE, str6, strE2, w9p0Var2, fFloatValue, i4, iIntValue2, list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    public static final s9p0 n(i4h i4hVar) {
        abp0 abp0Var;
        List list;
        i4hVar.getClass();
        Long l = i4hVar.f14145a;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = i4hVar.c;
        String str2 = str == null ? "" : str;
        String str3 = i4hVar.d;
        String str4 = str3 == null ? "" : str3;
        String strE = lmc.E(i4hVar.n);
        String str5 = i4hVar.e;
        String str6 = str5 == null ? "" : str5;
        String strE2 = lmc.E(i4hVar.f);
        String str7 = i4hVar.g;
        if (str7 != null) {
            switch (str7) {
                case "adc":
                    abp0Var = abp0.f;
                    break;
                case "jun":
                    abp0Var = abp0.e;
                    break;
                case "mid":
                    abp0Var = abp0.c;
                    break;
                case "sup":
                    abp0Var = abp0.b;
                    break;
                case "top":
                    abp0Var = abp0.d;
                    break;
                default:
                    abp0Var = abp0.f591a;
                    break;
            }
        } else {
            abp0Var = abp0.f591a;
        }
        abp0 abp0Var2 = abp0Var;
        Float f = i4hVar.h;
        float fFloatValue = f != null ? f.floatValue() : -1.0f;
        Integer num = i4hVar.o;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = i4hVar.p;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        List list2 = i4hVar.q;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                b4h b4hVar = (b4h) next;
                b4hVar.getClass();
                Iterator it2 = it;
                int i3 = iIntValue;
                long j = i;
                String str8 = b4hVar.f1957a;
                String str9 = str8 == null ? "" : str8;
                Integer num3 = b4hVar.f;
                int iIntValue3 = num3 != null ? num3.intValue() : -1;
                Double d = b4hVar.d;
                arrayList.add(new p8p0(j, str9, iIntValue3, d != null ? (float) d.doubleValue() : -1.0f, lmc.E(b4hVar.c)));
                iIntValue = i3;
                i = i2;
                it = it2;
            }
            list = arrayList;
        } else {
            list = null;
        }
        int i4 = iIntValue;
        if (list == null) {
            list = iun.f15405a;
        }
        return new s9p0(jLongValue, str2, str4, strE, str6, strE2, abp0Var2, fFloatValue, i4, iIntValue2, list);
    }

    public static final t9p0 o(wxd0 wxd0Var) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        wxd0Var.getClass();
        Long l = wxd0Var.f39927a;
        zxd0 zxd0Var = wxd0Var.g;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = wxd0Var.b;
        if (str == null) {
            str = "";
        }
        String str2 = wxd0Var.c;
        if (str2 == null) {
            str2 = "";
        }
        String strE = lmc.E(wxd0Var.d);
        String str3 = wxd0Var.e;
        String str4 = str3 != null ? str3 : "";
        String strE2 = lmc.E(wxd0Var.f);
        int iIntValue = -1;
        int iIntValue2 = (zxd0Var == null || (num4 = zxd0Var.f45152a) == null) ? -1 : num4.intValue();
        int iIntValue3 = (zxd0Var == null || (num3 = zxd0Var.b) == null) ? -1 : num3.intValue();
        int iIntValue4 = (zxd0Var == null || (num2 = zxd0Var.c) == null) ? -1 : num2.intValue();
        if (zxd0Var != null && (num = zxd0Var.d) != null) {
            iIntValue = num.intValue();
        }
        return new t9p0(jLongValue, str, str2, strE, str4, strE2, iIntValue2, iIntValue3, iIntValue4, iIntValue);
    }

    public static final u9p0 p(urh urhVar) {
        urhVar.getClass();
        Long l = urhVar.f36162a;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = urhVar.b;
        if (str == null) {
            str = "";
        }
        String str2 = urhVar.c;
        if (str2 == null) {
            str2 = "";
        }
        String strE = lmc.E(urhVar.f);
        String str3 = urhVar.d;
        String str4 = str3 != null ? str3 : "";
        String strE2 = lmc.E(urhVar.m);
        Long l2 = urhVar.g;
        long jLongValue2 = l2 != null ? l2.longValue() : -1L;
        Float f = urhVar.h;
        float fFloatValue = f != null ? f.floatValue() : -1.0f;
        Float f2 = urhVar.i;
        float fFloatValue2 = f2 != null ? f2.floatValue() : -1.0f;
        Float f3 = urhVar.j;
        return new u9p0(jLongValue, str, str2, strE, str4, strE2, jLongValue2, fFloatValue, fFloatValue2, f3 != null ? f3.floatValue() : -1.0f);
    }

    public static final ArrayList q(List list, vby vbyVar) {
        Iterable iterableJ;
        List list2;
        kct0 kct0Var;
        List list3;
        list.getClass();
        vbyVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                String str = ((xct0) it.next()).b;
                if (str == null) {
                    str = "";
                }
                nct0 nct0Var = ((wct0) vbyVar.b(wct0.Companion.serializer(), str)).f38941a;
                iterableJ = (nct0Var == null || (list2 = nct0Var.f23310a) == null || (kct0Var = (kct0) CollectionsKt.firstOrNull(list2)) == null || (list3 = kct0Var.f18078a) == null) ? iun.f15405a : j(list3);
            } catch (Exception e) {
                e.printStackTrace();
                iterableJ = iun.f15405a;
            }
            w3d.u(arrayList, iterableJ);
        }
        return arrayList;
    }

    public static final String r(eeu0 eeu0Var, ctf0 ctf0Var) {
        int iOrdinal = eeu0Var.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 1) {
            return ctf0Var.b.a(R.string.sum_sum_victory_formula, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 2) {
            return ctf0Var.b.a(R.string.sum_mult_victory_formula, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 3) {
            return ctf0Var.b.a(R.string.mult_sum_victory_formula, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 4) {
            return ctf0Var.b.a(R.string.mult_mult_victory_formula, Arrays.copyOf(new Object[0], 0));
        }
        t9f.b();
        return null;
    }

    public static final cpp0 s(h22 h22Var) {
        List list;
        Object objPrevious;
        Object objPrevious2;
        dwb fuqVar;
        fpp0 fpp0Var = h22Var.f12311a;
        List list2 = h22Var.c;
        List list3 = null;
        if (fpp0Var == null || (list = fpp0Var.b) == null || list.size() != 2) {
            jf4.k(null);
            return null;
        }
        x5p0 x5p0Var = (x5p0) fpp0Var.b.get(0);
        x5p0 x5p0Var2 = (x5p0) fpp0Var.b.get(1);
        if (list2 != null) {
            ListIterator listIterator = list2.listIterator(list2.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!Intrinsics.d(x5p0Var.c, ((gip0) objPrevious).f11360a));
            gip0 gip0Var = (gip0) objPrevious;
            if (gip0Var != null) {
                ListIterator listIterator2 = list2.listIterator(list2.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious2 = null;
                        break;
                    }
                    objPrevious2 = listIterator2.previous();
                } while (!Intrinsics.d(x5p0Var2.c, ((gip0) objPrevious2).f11360a));
                gip0 gip0Var2 = (gip0) objPrevious2;
                if (gip0Var2 == null) {
                    jf4.k(null);
                    return null;
                }
                m5p0 m5p0Var = new m5p0(dnm0.q(gip0Var), jwb.U(x5p0Var));
                m5p0 m5p0Var2 = new m5p0(dnm0.q(gip0Var2), jwb.U(x5p0Var2));
                List<gwb> list4 = fpp0Var.f9940a;
                if (list4 != null) {
                    ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
                    for (gwb gwbVar : list4) {
                        gwbVar.getClass();
                        String str = gwbVar.c;
                        String str2 = gwbVar.b;
                        if (str == null) {
                            jf4.k(null);
                            return null;
                        }
                        Integer num = gwbVar.f12018a;
                        if (num != null && num.intValue() == 1) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            fuqVar = new guq(str2);
                        } else if (num != null && num.intValue() == 2) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            fuqVar = new iuq(str2);
                        } else if (num != null && num.intValue() == 3) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            fuqVar = new fuq(str2);
                        } else {
                            fuqVar = huq.b;
                        }
                        arrayList.add(new juq(str, fuqVar));
                    }
                    list3 = arrayList;
                }
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                return new cpp0(m5p0Var, m5p0Var2, list3);
            }
        }
        jf4.k(null);
        return null;
    }

    public static final c8r0 t(w7r0 w7r0Var, int i, Function1 function1, ctf0 ctf0Var) {
        w7r0Var.getClass();
        ctf0Var.getClass();
        if (w7r0Var.equals(u7r0.f35200a)) {
            lsm0 lsm0Var = ctf0Var.b;
            return new b8r0(lsm0Var.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
        }
        if (!(w7r0Var instanceof v7r0)) {
            t9f.b();
            return null;
        }
        vbj vbjVar = ((v7r0) w7r0Var).f36944a;
        if (vbjVar.equals(obj.f24982a)) {
            return new z7r0(i);
        }
        if (!(vbjVar instanceof qbj)) {
            return new y7r0(i);
        }
        Object obj = ((qbj) vbjVar).f28448a;
        String str = (String) function1.invoke(obj);
        ql5 ql5Var = (ql5) obj;
        return new x7r0(ql5Var.b, i, str, ql5Var.f, ctf0Var.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public static final d0u0 u(g0u0 g0u0Var) {
        i1u0 i1u0Var;
        n1u0 n1u0Var;
        ?? arrayList;
        if (g0u0Var == null || (n1u0Var = g0u0Var.f10478a) == null) {
            i1u0Var = new i1u0("", iun.f15405a, 0);
        } else {
            Integer num = n1u0Var.f22770a;
            int iIntValue = num != null ? num.intValue() : 0;
            String str = n1u0Var.c;
            if (str == null) {
                str = "";
            }
            List<ayt0> list = n1u0Var.d;
            if (list != null) {
                arrayList = new ArrayList(r3d.q(list, 10));
                for (ayt0 ayt0Var : list) {
                    ayt0Var.getClass();
                    String str2 = ayt0Var.f1686a;
                    String str3 = str2 == null ? "" : str2;
                    Integer num2 = ayt0Var.b;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    Integer num3 = ayt0Var.c;
                    int iIntValue3 = num3 != null ? num3.intValue() : 0;
                    Integer num4 = ayt0Var.d;
                    int iIntValue4 = num4 != null ? num4.intValue() : 0;
                    Integer num5 = ayt0Var.e;
                    int iIntValue5 = num5 != null ? num5.intValue() : 0;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(new xxt0(iIntValue2, iIntValue3, iIntValue4, iIntValue5, str3, zcm0.f(str2)));
                }
            } else {
                arrayList = iun.f15405a;
            }
            i1u0Var = new i1u0(str, arrayList, iIntValue);
        }
        return new d0u0(i1u0Var, ihm0.q(g0u0Var != null ? g0u0Var.b : null), ihm0.q(g0u0Var != null ? g0u0Var.c : null), (g0u0Var != null ? g0u0Var.f10478a : null) != null, zcm0.f(i1u0Var.b));
    }

    public static final geu0 v(d0t d0tVar) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        rqs rqsVar = d0tVar.p;
        List list = rqsVar.n;
        Iterator it = rqsVar.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmr.x);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        if (str == null) {
            str = "";
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((cmr) next2).f4620a != dmr.y);
        cmr cmrVar2 = (cmr) next2;
        String str2 = cmrVar2 != null ? cmrVar2.b : null;
        if (str2 == null) {
            str2 = "";
        }
        Iterator it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (((cmr) next3).f4620a != dmr.r);
        cmr cmrVar3 = (cmr) next3;
        String str3 = cmrVar3 != null ? cmrVar3.b : null;
        if (str3 == null) {
            str3 = "";
        }
        Iterator it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (((cmr) next4).f4620a != dmr.s);
        cmr cmrVar4 = (cmr) next4;
        String str4 = cmrVar4 != null ? cmrVar4.b : null;
        String str5 = str4 != null ? str4 : "";
        wcy wcyVarC = vdx.f37253a;
        byte b = 15;
        if (wcyVarC == null) {
            wcyVarC = qxw.c(new f8l0(b));
            vdx.f37253a = wcyVarC;
        }
        deu0 deu0Var = eeu0.Companion;
        eeu0 eeu0Var = (eeu0) wcyVarC.b(mrv.j0(deu0Var.serializer()), str);
        if (eeu0Var == null) {
            eeu0Var = eeu0.b;
        }
        wcy wcyVarC2 = vdx.f37253a;
        if (wcyVarC2 == null) {
            wcyVarC2 = qxw.c(new f8l0(b));
            vdx.f37253a = wcyVarC2;
        }
        eeu0 eeu0Var2 = (eeu0) wcyVarC2.b(mrv.j0(deu0Var.serializer()), str2);
        if (eeu0Var2 == null) {
            eeu0Var2 = eeu0.b;
        }
        return new geu0(eeu0Var, eeu0Var2, str3, str5);
    }

    public static xfw0 w(String str, xfw0 xfw0Var) throws udw0 {
        try {
            return xfw0Var.zza(str);
        } catch (Exception e) {
            throw new udw0(kng0.k("Json conversion failed! ", e.getMessage()), e);
        }
    }

    public static String x(String str) throws udw0 {
        if (str.isEmpty()) {
            return null;
        }
        try {
            m60 m60Var = new m60();
            m60Var.zza(str);
            if (TextUtils.isEmpty(m60Var.b)) {
                throw new udw0("No error message: ".concat(str));
            }
            return m60Var.b;
        } catch (Exception e) {
            throw new udw0(kng0.k("Json conversion failed! ", e.getMessage()), e);
        }
    }

    public static final void y(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            jf4.o("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] z(byte[] bArr, int i, int i2, byte[] bArr2) {
        if (i2 < 0 || bArr.length - i2 < i || bArr2.length - i2 < 0) {
            jf4.o("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
        }
        return bArr3;
    }
}
