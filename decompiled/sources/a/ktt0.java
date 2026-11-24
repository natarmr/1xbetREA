package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.CornerPathEffect;
import android.javax.sip.message.Response;
import android.widget.TextView;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class ktt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18883a;

    public /* synthetic */ ktt0(byte b) {
        this.f18883a = b;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    public static final hxo0 A(iwo0 iwo0Var, String str, boolean z) {
        wwo0 wwo0Var;
        axo0 ywo0Var;
        tn7 sn7Var;
        boolean z2 = iwo0Var.f15501a;
        double d = iwo0Var.d;
        String str2 = iwo0Var.c;
        boolean z3 = iwo0Var.b;
        if (!z3 && !z) {
            if (d == 0.0d) {
                wwo0Var = null;
            } else {
                int i = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                ywo0Var = new ywo0(cy7.e(pn40.p(str, d)), d > 0.0d ? d4d.COMMERCE : d4d.TEXT_PRIMARY);
            }
            String str3 = iwo0Var.e;
            if (!z3 || z) {
                sn7Var = rn7.f30774a;
            } else {
                List<mvo0> list = iwo0Var.f;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (mvo0 mvo0Var : list) {
                    arrayList.add(new fuy(mvo0Var.f22468a, mvo0Var.b));
                }
                sn7Var = new sn7(dyb.r0(arrayList));
            }
            return new hxo0(z2, str2, ywo0Var, str3, sn7Var);
        }
        wwo0Var = wwo0.f39894a;
        ywo0Var = wwo0Var;
        String str4 = iwo0Var.e;
        if (z3) {
            sn7Var = rn7.f30774a;
        } else {
            sn7Var = rn7.f30774a;
        }
        return new hxo0(z2, str2, ywo0Var, str4, sn7Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r46v0, types: [java.util.List] */
    public static final okr0 B(clr0 clr0Var, String str, String str2) {
        String plainString;
        List list;
        ?? arrayList;
        ?? arrayList2;
        str.getClass();
        str2.getClass();
        Long l = clr0Var.f4574a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = clr0Var.b;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Double d = clr0Var.d;
        if (d != null) {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(d.doubleValue()));
            BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
            if (bigDecimal2 != null) {
                plainString = bigDecimal2.toPlainString();
            } else {
                plainString = null;
            }
        } else {
            plainString = null;
        }
        String str3 = "";
        String str4 = plainString == null ? "" : plainString;
        String str5 = clr0Var.e;
        String str6 = str5 == null ? "" : str5;
        Long l3 = clr0Var.f;
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        Double d2 = clr0Var.g;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = clr0Var.h;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
        List list2 = clr0Var.i;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                kir0 kir0Var = (kir0) it.next();
                kir0Var.getClass();
                Long l4 = kir0Var.f18350a;
                String str7 = kir0Var.b;
                long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                String str8 = str7 == null ? str3 : str7;
                List list3 = kir0Var.c;
                Iterator it2 = it;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        dkr0 dkr0Var = (dkr0) it3.next();
                        String str9 = kir0Var.d;
                        String str10 = str9 == null ? str3 : str9;
                        String str11 = kir0Var.e;
                        String str12 = str11 == null ? str3 : str11;
                        Integer num = kir0Var.f;
                        int iIntValue = num != null ? num.intValue() : 0;
                        long jLongValue5 = l4 != null ? l4.longValue() : 0L;
                        String str13 = str7 == null ? str3 : str7;
                        dkr0Var.getClass();
                        Integer num2 = dkr0Var.f6247a;
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        Long l5 = dkr0Var.b;
                        long jLongValue6 = l5 != null ? l5.longValue() : 0L;
                        String str14 = dkr0Var.e;
                        String str15 = str14 == null ? str3 : str14;
                        String str16 = dkr0Var.f;
                        String str17 = str16 == null ? str3 : str16;
                        Long l6 = dkr0Var.g;
                        long jLongValue7 = l6 != null ? l6.longValue() : 0L;
                        Integer num3 = dkr0Var.h;
                        int iIntValue3 = num3 != null ? num3.intValue() : 0;
                        String str18 = dkr0Var.i;
                        String str19 = str18 == null ? str3 : str18;
                        String str20 = dkr0Var.j;
                        String str21 = str20 == null ? str3 : str20;
                        String str22 = dkr0Var.k;
                        String str23 = str22 == null ? str3 : str22;
                        List list4 = dkr0Var.l;
                        Iterator it4 = it3;
                        if (list4 != null) {
                            arrayList2 = new ArrayList(r3d.q(list4, 10));
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                akr0 akr0Var = (akr0) it5.next();
                                akr0Var.getClass();
                                Iterator it6 = it5;
                                Integer num4 = akr0Var.f1036a;
                                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                                Integer num5 = akr0Var.b;
                                arrayList2.add(new qkr0(iIntValue4, num5 != null ? num5.intValue() : 0));
                                it5 = it6;
                            }
                        } else {
                            arrayList2 = 0;
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = iun.f15405a;
                        }
                        ?? r46 = arrayList2;
                        Double d4 = dkr0Var.m;
                        arrayList.add(new ujr0(iIntValue2, jLongValue6, jLongValue5, str13, str10, str12, iIntValue, str15, str17, jLongValue7, iIntValue3, str19, str21, str23, r46, d4 != null ? d4.doubleValue() : 0.0d));
                        it3 = it4;
                        kir0Var = kir0Var;
                        str3 = str3;
                    }
                } else {
                    arrayList = 0;
                }
                String str24 = str3;
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                arrayList3.add(new hir0(jLongValue4, str8, arrayList));
                it = it2;
                str3 = str24;
            }
            list = arrayList3;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        return new okr0(str, str2, jLongValue, jLongValue2, str4, str6, jLongValue3, dDoubleValue, dDoubleValue2, list);
    }

    public static final b2s0 C(d2s0 d2s0Var) {
        d2s0Var.getClass();
        int iOrdinal = d2s0Var.ordinal();
        if (iOrdinal == 0) {
            return b2s0.b;
        }
        if (iOrdinal == 1) {
            return b2s0.c;
        }
        if (iOrdinal == 2) {
            return b2s0.f1870a;
        }
        if (iOrdinal == 3) {
            return b2s0.d;
        }
        if (iOrdinal == 4) {
            return b2s0.e;
        }
        t9f.b();
        return null;
    }

    public static int D(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            ktt0 ktt0Var = qtt0.f29315a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return qtt0.b(i, ift0.e(bArr, j));
        }
        if (i2 == 2) {
            return qtt0.c(i, ift0.e(bArr, j), ift0.e(bArr, j + 1));
        }
        throw new AssertionError();
    }

    public static fpw0 E(byte[] bArr) throws GeneralSecurityException {
        try {
            bfx0 bfx0VarV = bfx0.v(bArr, dkw0.b);
            k6x0 k6x0Var = k6x0.b;
            x4w0 x4w0VarD = x4w0.d(bfx0VarV.C(), bcm0.G(bfx0VarV.A()), bfx0VarV.B());
            return !((u7x0) k6x0Var.f17793a.get()).d.containsKey((String) x4w0VarD.b) ? new t5x0(x4w0VarD) : k6x0Var.b(x4w0VarD);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] F(fpw0 fpw0Var) {
        x4w0 x4w0VarA = fpw0Var instanceof t5x0 ? ((t5x0) fpw0Var).f33391a : k6x0.b.a(fpw0Var);
        zex0 zex0VarT = bfx0.t();
        zex0VarT.g((String) x4w0VarA.b);
        zex0VarT.f((sjw0) x4w0VarA.f40287a);
        zex0VarT.h(bcm0.D((lpw0) x4w0VarA.c));
        return ((bfx0) zex0VarT.c()).c();
    }

    public static final void a(int i, int i2, int i3, long j, long j2, long j3, fet fetVar, mm40 mm40Var, boolean z) {
        boolean z2;
        float f;
        Object n8nVar;
        x03 x03Var;
        float f2;
        float f3;
        boolean z3;
        int i4;
        float f4;
        int i5 = i2;
        fetVar.g0(-1742320223);
        long j4 = j3;
        int i6 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(i) ? 32 : 16) | (fetVar.e(i5) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.f(j) ? 16384 : 8192) | (fetVar.f(j2) ? 131072 : 65536) | (fetVar.f(j4) ? 1048576 : 524288);
        if (fetVar.U(i6 & 1, (599187 & i6) != 599186)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            float fW0 = w6kVar.w0(2.0f);
            float fW1 = w6kVar.w0(1.0f);
            float fW2 = w6kVar.w0(2.0f);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object obj2 = objP;
            if (objP == obj) {
                Object x03Var2 = new x03(new CornerPathEffect(fW2));
                fetVar.o0(x03Var2);
                obj2 = x03Var2;
            }
            x03 x03Var3 = (x03) obj2;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), z ? gqw0.o : gqw0.m, fetVar, 0);
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
            fetVar.e0(-1556035402);
            if (1 <= i) {
                int i7 = 1;
                while (true) {
                    boolean z4 = i7 <= i5;
                    fetVar.b0(-1556032746, Integer.valueOf(i7));
                    long j5 = z4 ? j4 : j;
                    if (!z4) {
                        j4 = j2;
                    }
                    if (i7 != 2) {
                        if (i7 == 3) {
                            zcl zclVar2 = qmk.f28987a;
                            f4 = 4.0f;
                        } else if (i7 != 4) {
                            zcl zclVar3 = qmk.f28987a;
                            f = 0.0f;
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            f4 = 6.0f;
                        }
                        f = f4;
                    } else {
                        zcl zclVar5 = qmk.f28987a;
                        f = 2.0f;
                    }
                    boolean zB = ycl.b(f, 0.0f);
                    mm40 mm40VarN = jm40.b;
                    if (!zB) {
                        mm40VarN = z ? s5x0.N(mm40VarN, 0.0f, 0.0f, f, 0.0f, 11) : s5x0.N(mm40VarN, f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    mm40 mm40VarN2 = o7k0.n(mm40VarN, 10.0f);
                    int i8 = i6;
                    boolean zD = ((i6 & 7168) == 2048) | fetVar.d(fW0) | fetVar.f(j5) | fetVar.i(x03Var3) | fetVar.d(fW1) | fetVar.f(j4);
                    Object objP2 = fetVar.P();
                    if (zD || objP2 == obj) {
                        boolean z5 = z4;
                        x03Var = x03Var3;
                        f2 = fW1;
                        f3 = fW0;
                        z3 = z5;
                        i4 = i7;
                        z2 = false;
                        n8nVar = new n8n(z, f3, j5, x03Var, f2, j4, (byte) 1);
                        fetVar.o0(n8nVar);
                    } else {
                        i4 = i7;
                        f2 = fW1;
                        f3 = fW0;
                        n8nVar = objP2;
                        z3 = z4;
                        x03Var = x03Var3;
                        z2 = false;
                    }
                    mm40 mm40VarL = rq8.L(mm40VarN2, (Function1) n8nVar);
                    boolean zH = fetVar.h(z3);
                    Object objP3 = fetVar.P();
                    Object obj3 = objP3;
                    if (zH || objP3 == obj) {
                        Object jnoVar = new jno((byte) 8, z3);
                        fetVar.o0(jnoVar);
                        obj3 = jnoVar;
                    }
                    zq8.a(z2 ? 1 : 0, fetVar, o2e.e0(pai0.a(mm40VarL, z2, (Function1) obj3), "CellItem"));
                    fetVar.r(z2);
                    int i9 = i4;
                    if (i9 == i) {
                        break;
                    }
                    i7 = i9 + 1;
                    i5 = i2;
                    j4 = j3;
                    fW0 = f3;
                    x03Var3 = x03Var;
                    fW1 = f2;
                    i6 = i8;
                }
            } else {
                z2 = false;
            }
            fetVar.r(z2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qcd(mm40Var, i, i2, z, j, j2, j3, i3, (byte) 2);
        }
    }

    public static final void b(n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(-134098306);
        int i2 = (fetVar.g(n0xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), vgg0.a(12.0f));
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
            long separator60 = ((ThemeColors) fetVar.k(zfnVar)).getSeparator60();
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS2 = i120.S(mm40VarN2, 1.0f, separator60, ugg0Var);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS2);
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
            uc9.c(lgb.J(o7k0.n(jm40Var, 22.0f), ugg0Var), lgb.J(o7k0.n(jm40Var, 20.0f), ugg0Var), n0xVar, Integer.valueOf(R.drawable.ic_glyph_circle_globe), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), null, null, gqw0.B, null, fetVar, ((i2 << 6) & 896) | 12582912, 352);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, (byte) 10);
        }
    }

    public static final void c(String str, long j, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-679935035);
        int i2 = i | (fetVar.g(str) ? 32 : 16) | (fetVar.f(j) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarY, j, new ugg0(zclVar, zclVar, zclVar, zclVar)), "ColorBlockTestTag");
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new r2a0((byte) 17, j);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            v8q0.a(str, o2e.e0(s5x0.K(jm40Var, 10.0f, 4.0f), "ScoreTestTag"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i2 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bs0(str, j, i, (byte) 8);
        }
    }

    public static final void d(mm40 mm40Var, voh vohVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        String str = vohVar.c;
        fetVar2.g0(-1005454881);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(vohVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            byte b = 14;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            b(vohVar.f37766a, fetVar2, 0);
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40.b, 1.0f), 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
            String str2 = vohVar.b;
            y9q0 y9q0VarL = g1t0.l();
            zfn zfnVar = zaq0.b;
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarL, fetVar, 0, 24960, 109554);
            fetVar2 = fetVar;
            if (str.length() > 0) {
                fetVar2.e0(-125531385);
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 109562);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-125208055);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, vohVar, i, (byte) 21);
        }
    }

    public static final void e(mm40 mm40Var, ieu0 ieu0Var, boolean z, fet fetVar, int i) {
        fetVar.g0(1621953045);
        int i2 = (fetVar.g(ieu0Var) ? 32 : 16) | i | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1970847445, new ium(l1e0.d(ieu0Var.f14654a, 1, 4), l1e0.d(ieu0Var.b, 0, 4), mm40Var, z), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) ieu0Var, z, i, (byte) 27);
        }
    }

    public static final void f(mm40 mm40Var, pz40 pz40Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(178217167);
        byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new jxr0(pz40Var, (byte) 13);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            byte b2 = 14;
            if (z2 || objP2 == cl5Var) {
                objP2 = new jxr0(pz40Var, b2);
                fetVar.o0(objP2);
            }
            z1x.m(mm40Var, null, null, u1c.M(-1270181564, new e280(v3c.Y(objArr2, (Function0) objP2, fetVar), function1, pz40Var, b), fetVar), u1c.M(1328762373, new qjr0(l7m0VarY, (byte) 9), fetVar), null, fetVar, (i2 & 14) | 27648, 38);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ugv(mm40Var, pz40Var, function1, i, (byte) 5);
        }
    }

    public static final int g(cvv0 cvv0Var, lxv0 lxv0Var) {
        lxv0Var.getClass();
        if (lxv0Var.equals(jxv0.f17330a)) {
            return 0;
        }
        if (lxv0Var.equals(kxv0.f19078a)) {
            return r(cvv0Var);
        }
        if (lxv0Var.equals(ixv0.f15562a)) {
            Integer numO = o(cvv0Var);
            return numO != null ? numO.intValue() : r(cvv0Var);
        }
        t9f.b();
        return 0;
    }

    public static final void h(TypedArray typedArray, TextView textView, int i) {
        typedArray.getClass();
        cem0.n(typedArray.getResourceId(i, 0), textView);
    }

    public static final String j(double d, DecimalFormat decimalFormat, ctf0 ctf0Var) {
        if (d == -1.0d) {
            return ctf0Var.f(R.string.figure_dash, new Object[0]);
        }
        String str = decimalFormat.format(d);
        str.getClass();
        return str;
    }

    public static final int k(cvv0 cvv0Var) {
        int i = cvv0Var.f5049a - cvv0Var.b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static final Integer l(TypedArray typedArray, Integer num) {
        Object g0g0Var;
        typedArray.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            int iIntValue = num.intValue();
            tnq0.i(typedArray, iIntValue);
            g0g0Var = Integer.valueOf(typedArray.getColor(iIntValue, 0));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        return (Integer) g0g0Var;
    }

    public static final ColorStateList m(int i, Context context, TypedArray typedArray) {
        typedArray.getClass();
        context.getClass();
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId > 0) {
            return jiq0.n0(resourceId, context);
        }
        return null;
    }

    public static final int n(cvv0 cvv0Var) {
        esv0 esv0Var = cvv0Var.g.f3152a;
        if (esv0Var instanceof dsv0) {
            return si30.b(cvv0Var.f5049a * ((dsv0) esv0Var).f6633a);
        }
        if (esv0Var.equals(csv0.f4909a)) {
            return Math.min(cvv0Var.f, k(cvv0Var));
        }
        t9f.b();
        return 0;
    }

    public static final Integer o(cvv0 cvv0Var) {
        int iMin;
        esv0 esv0Var = cvv0Var.g.b;
        if (esv0Var != null) {
            if (esv0Var instanceof dsv0) {
                iMin = si30.b(cvv0Var.f5049a * ((dsv0) esv0Var).f6633a);
            } else {
                if (!esv0Var.equals(csv0.f4909a)) {
                    t9f.b();
                    return null;
                }
                iMin = Math.min(cvv0Var.f, k(cvv0Var));
            }
            int iK = k(cvv0Var);
            if (iMin > iK) {
                iMin = iK;
            }
            if (iMin > r(cvv0Var) + 1) {
                return Integer.valueOf(iMin);
            }
        }
        return null;
    }

    public static final String p(TypedArray typedArray, Context context, Integer num) {
        Object g0g0Var;
        typedArray.getClass();
        context.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            int iIntValue = num.intValue();
            tnq0.i(typedArray, iIntValue);
            g0g0Var = context.getString(typedArray.getResourceId(iIntValue, 0));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        return (String) g0g0Var;
    }

    public static final int q(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelSize(i, 0) * (typedArray.getBoolean(i2, false) ? -1 : 1);
    }

    public static final int r(cvv0 cvv0Var) {
        return l1e0.d(Math.min(cvv0Var.f, n(cvv0Var)), 0, k(cvv0Var));
    }

    public static final int s(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] t(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        qx3.i(0, i, 6, objArr, objArr2);
        qx3.e(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static void u(a8q0 a8q0Var, hhk hhkVar, a9q0 a9q0Var, j6z j6zVar, r8q0 r8q0Var, boolean z, qe60 qe60Var) {
        jge0 jge0VarB;
        if (z) {
            int iS = qe60Var.s(o9q0.e(a8q0Var.b));
            String str = r6q0.f29947a;
            if (iS < a9q0Var.f491a.f43981a.b.length()) {
                jge0VarB = a9q0Var.b(iS);
            } else {
                jge0VarB = iS != 0 ? a9q0Var.b(iS - 1) : new jge0(0.0f, 0.0f, 1.0f, (int) (r6q0.a((y9q0) hhkVar.c, (w6k) hhkVar.d, (mrq) hhkVar.e) & 4294967295L));
            }
            float f = jge0VarB.b;
            float f2 = jge0VarB.f16474a;
            long jY = j6zVar.Y((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            jge0 jge0VarR = k9x.r((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jY & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jY >> 32)))) << 32), (((long) Float.floatToRawIntBits(jge0VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(jge0VarB.d - f)) & 4294967295L));
            if (Intrinsics.d((r8q0) r8q0Var.f30040a.b.get(), r8q0Var)) {
                r8q0Var.b.e(jge0VarR);
            }
        }
    }

    public static final Object[] w(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        qx3.i(0, i, 6, objArr, objArr2);
        qx3.e(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] x(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        qx3.i(0, i, 6, objArr, objArr2);
        qx3.e(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final long y(long j, long j2, long j3, String str) {
        String property;
        int i = bao0.f2270a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lT0 = StringsKt.t0(property);
        if (lT0 == null) {
            ohq.n("System property '", str, "' has unrecognized value '", property);
            return 0L;
        }
        long jLongValue = lT0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sbO = f140.o(j2, "System property '", str, "' should be in range ");
        kng0.A(sbO, "..", j3, ", but is '");
        sbO.append(jLongValue);
        sbO.append('\'');
        throw new IllegalStateException(sbO.toString().toString());
    }

    public static int z(int i, int i2, String str) {
        return (int) y(i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    public final int i(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        long j2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 57343;
        switch (this.f18883a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new ntt0(i7, length);
                                        }
                                        itt0.e(cCharAt, i3);
                                        return 0;
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new ntt0(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j3 = i;
                long j4 = ((long) i2) + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i20 = 0;
                    while (true) {
                        j = 1;
                        if (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                            ift0.l(bArr, j3, (byte) cCharAt3);
                            i20++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char cCharAt5 = str.charAt(i20);
                            if (cCharAt5 < 128 && j3 < j4) {
                                ift0.l(bArr, j3, (byte) cCharAt5);
                                j2 = j;
                                j3 += j;
                            } else if (cCharAt5 >= c || j3 > j4 - 2) {
                                j2 = j;
                                if ((cCharAt5 < 55296 || c2 < cCharAt5) && j3 <= j4 - 3) {
                                    ift0.l(bArr, j3, (byte) ((cCharAt5 >>> '\f') | Response.TEMPORARILY_UNAVAILABLE));
                                    long j5 = j3 + 2;
                                    ift0.l(bArr, j3 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                    j3 += 3;
                                    ift0.l(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char cCharAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                                ift0.l(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                                ift0.l(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j6 = j3 + 3;
                                                ift0.l(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j3 += 4;
                                                ift0.l(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new ntt0(i20 - 1, length2);
                                    }
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i20 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new ntt0(i20, length2);
                                    }
                                    itt0.h(cCharAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                ift0.l(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                                j3 += 2;
                                ift0.l(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                            }
                            i20++;
                            j = j2;
                            c = 2048;
                            c2 = 57343;
                        }
                    }
                    return (int) j3;
                }
                itt0.q(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    public final int v(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        long j3;
        byte bE;
        long j4;
        byte bE2;
        long j5;
        int i5 = i;
        switch (this.f18883a) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j6 = i5;
                int i6 = (int) (((long) i2) - j6);
                if (i6 < 16) {
                    j = 1;
                    i3 = 0;
                } else {
                    int i7 = 8 - (((int) j6) & 7);
                    long j7 = j6;
                    j = 1;
                    i3 = 0;
                    while (true) {
                        if (i3 < i7) {
                            long j8 = j7 + 1;
                            if (ift0.e(bArr, j7) >= 0) {
                                i3++;
                                j7 = j8;
                            }
                        } else {
                            while (true) {
                                int i8 = i3 + 8;
                                if (i8 <= i6 && (ift0.i(bArr, ift0.f + j7) & (-9187201950435737472L)) == 0) {
                                    j7 += 8;
                                    i3 = i8;
                                }
                            }
                            while (true) {
                                if (i3 < i6) {
                                    long j9 = j7 + 1;
                                    if (ift0.e(bArr, j7) >= 0) {
                                        i3++;
                                        j7 = j9;
                                    }
                                } else {
                                    i3 = i6;
                                }
                            }
                        }
                    }
                }
                int i9 = i6 - i3;
                long j10 = j6 + ((long) i3);
                while (true) {
                    byte b = 0;
                    while (i9 > 0) {
                        long j11 = j10 + j;
                        byte bE3 = ift0.e(bArr, j10);
                        if (bE3 >= 0) {
                            i9--;
                            b = bE3;
                            j10 = j11;
                        } else {
                            b = bE3;
                            j10 = j11;
                            if (i9 == 0) {
                                return 0;
                            }
                            i4 = i9 - 1;
                            if (b < -32) {
                                if (i4 == 0) {
                                    return b;
                                }
                                i9 -= 2;
                                if (b >= -62) {
                                    return -1;
                                }
                                j2 = j10 + j;
                                if (ift0.e(bArr, j10) > -65) {
                                    return -1;
                                }
                                j10 = j2;
                            } else if (b < -16) {
                                if (i4 < 2) {
                                    return D(j10, bArr, b, i4);
                                }
                                i9 -= 3;
                                j3 = j10 + j;
                                bE = ift0.e(bArr, j10);
                                if (bE <= -65) {
                                    return -1;
                                }
                                if (b != -32 && bE < -96) {
                                    return -1;
                                }
                                if (b != -19 && bE >= -96) {
                                    return -1;
                                }
                                j10 += 2;
                                if (ift0.e(bArr, j3) > -65) {
                                    return -1;
                                }
                            } else {
                                if (i4 < 3) {
                                    return D(j10, bArr, b, i4);
                                }
                                i9 -= 4;
                                j4 = j10 + j;
                                bE2 = ift0.e(bArr, j10);
                                if (bE2 <= -65) {
                                    return -1;
                                }
                                if ((((bE2 + 112) + (b << 28)) >> 30) == 0) {
                                    return -1;
                                }
                                j5 = j10 + 2;
                                if (ift0.e(bArr, j4) <= -65) {
                                    return -1;
                                }
                                j10 += 3;
                                if (ift0.e(bArr, j5) > -65) {
                                    return -1;
                                }
                            }
                        }
                    }
                    if (i9 == 0) {
                        return 0;
                    }
                    i4 = i9 - 1;
                    if (b < -32) {
                        if (i4 == 0) {
                            return b;
                        }
                        i9 -= 2;
                        if (b >= -62) {
                            return -1;
                        }
                        j2 = j10 + j;
                        if (ift0.e(bArr, j10) > -65) {
                            return -1;
                        }
                        j10 = j2;
                    } else if (b < -16) {
                        if (i4 < 2) {
                            return D(j10, bArr, b, i4);
                        }
                        i9 -= 3;
                        j3 = j10 + j;
                        bE = ift0.e(bArr, j10);
                        if (bE <= -65) {
                            return -1;
                        }
                        if (b != -32) {
                        }
                        if (b != -19) {
                        }
                        j10 += 2;
                        if (ift0.e(bArr, j3) > -65) {
                            return -1;
                        }
                    } else {
                        if (i4 < 3) {
                            return D(j10, bArr, b, i4);
                        }
                        i9 -= 4;
                        j4 = j10 + j;
                        bE2 = ift0.e(bArr, j10);
                        if (bE2 <= -65) {
                            return -1;
                        }
                        if ((((bE2 + 112) + (b << 28)) >> 30) == 0) {
                            return -1;
                        }
                        j5 = j10 + 2;
                        if (ift0.e(bArr, j4) <= -65) {
                            return -1;
                        }
                        j10 += 3;
                        if (ift0.e(bArr, j5) > -65) {
                            return -1;
                        }
                    }
                }
                break;
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i2) {
            while (i5 < i2) {
                int i10 = i5 + 1;
                byte b2 = bArr[i5];
                if (b2 >= 0) {
                    i5 = i10;
                } else if (b2 < -32) {
                    if (i10 >= i2) {
                        return b2;
                    }
                    if (b2 < -62) {
                        return -1;
                    }
                    i5 += 2;
                    if (bArr[i10] > -65) {
                        return -1;
                    }
                } else if (b2 < -16) {
                    if (i10 >= i2 - 1) {
                        return qtt0.d(bArr, i10, i2);
                    }
                    int i11 = i5 + 2;
                    byte b3 = bArr[i10];
                    if (b3 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b3 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b3 >= -96) {
                        return -1;
                    }
                    i5 += 3;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                } else {
                    if (i10 >= i2 - 2) {
                        return qtt0.d(bArr, i10, i2);
                    }
                    int i12 = i5 + 2;
                    byte b4 = bArr[i10];
                    if (b4 > -65) {
                        return -1;
                    }
                    if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i13 = i5 + 3;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                    i5 += 4;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
