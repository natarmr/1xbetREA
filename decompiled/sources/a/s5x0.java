package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.javax.sip.message.Response;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s5x0 implements dwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f31677a = new ugd(-262644780, false, new wgd(21));
    public static final ugd b = new ugd(-480322963, false, new bhd(11));
    public static final ugd c = new ugd(2037754278, false, new chd(19));
    public static final ugd d = new ugd(-51699941, false, new mhd(13));
    public static final ugd e = new ugd(369311939, false, new qhd(25));
    public static final ugd f = new ugd(-1572866526, false, new qhd(26));
    public static final int[] g = {0, 4, 1, 5};
    public static final int[] h = {6, 2, 7, 3};
    public static final int[] i = {8, 1, 1, 1, 1, 1, 1, 3};
    public static final int[] j = {7, 1, 1, 3, 1, 1, 1, 2, 1};
    public static final int[] k = {0, 180, SubsamplingScaleImageView.ORIENTATION_270, 90};
    public static final ecy l = new ecy((byte) 2);
    public static final String[] m = {"st.attachment", "st.return", "st.redirect_uri", "st.state"};

    public static final float A(hh80 hh80Var, k6z k6zVar) {
        return k6zVar == k6z.f17794a ? hh80Var.c(k6zVar) : hh80Var.b(k6zVar);
    }

    public static final float B(hh80 hh80Var, k6z k6zVar) {
        return k6zVar == k6z.f17794a ? hh80Var.b(k6zVar) : hh80Var.c(k6zVar);
    }

    public static final u15 C(CaptureRequest.Key key) {
        key.getClass();
        return new u15("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final int D(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final mm40 E(mm40 mm40Var, qv2 qv2Var, Function2 function2) {
        ma80 ma80Var = ma80.f21447a;
        return mm40Var.e(new qel(qv2Var, function2));
    }

    public static int[] F(r68 r68Var, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (r68Var.b(i2, i3) && i2 > 0) {
            int i6 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i2--;
            i5 = i6;
        }
        int length = iArr.length;
        int i7 = i2;
        int i8 = 0;
        boolean z = false;
        while (i2 < i4) {
            if (r68Var.b(i2, i3) != z) {
                iArr2[i8] = iArr2[i8] + 1;
            } else {
                if (i8 != length - 1) {
                    i8++;
                } else {
                    if (O(iArr2, iArr) < 0.42f) {
                        return new int[]{i7, i2};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = i8 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i8--;
                }
                iArr2[i8] = 1;
                z = !z;
            }
            i2++;
        }
        if (i8 != length - 1 || O(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i2 - 1};
    }

    public static d3g0[] G(r68 r68Var, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        int i7;
        boolean z;
        int[] iArrF;
        d3g0[] d3g0VarArr = new d3g0[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i8 = i4;
        while (true) {
            if (i8 >= i2) {
                i7 = i8;
                z = false;
                break;
            }
            int[] iArrF2 = F(r68Var, i5, i8, i3, iArr2, iArr3);
            if (iArrF2 != null) {
                int[] iArr4 = iArrF2;
                while (true) {
                    i7 = i8;
                    if (i7 <= 0 || (iArrF = F(r68Var, i5, (i8 = i7 - 1), i3, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = iArrF;
                }
                float f2 = i7;
                d3g0VarArr[0] = new d3g0(iArr4[0], f2);
                d3g0VarArr[1] = new d3g0(iArr4[1], f2);
                z = true;
                break;
            }
            i8 += 5;
            iArr2 = iArr;
        }
        int i9 = i7 + 1;
        if (z) {
            int[] iArr5 = {(int) d3g0VarArr[0].f5402a, (int) d3g0VarArr[1].f5402a};
            int i10 = i9;
            int i11 = 0;
            while (i10 < i2) {
                int[] iArrF3 = F(r68Var, iArr5[0], i10, i3, iArr, iArr3);
                if (iArrF3 != null && Math.abs(iArr5[0] - iArrF3[0]) < 5 && Math.abs(iArr5[1] - iArrF3[1]) < 5) {
                    iArr5 = iArrF3;
                    i11 = 0;
                } else {
                    if (i11 > 25) {
                        break;
                    }
                    i11++;
                }
                i10++;
            }
            i9 = i10 - (i11 + 1);
            float f3 = i9;
            d3g0VarArr[2] = new d3g0(iArr5[0], f3);
            d3g0VarArr[3] = new d3g0(iArr5[1], f3);
        }
        if (i9 - i7 < i6) {
            Arrays.fill(d3g0VarArr, (Object) null);
        }
        return d3g0VarArr;
    }

    public static final mtl H(dc2 dc2Var, ctf0 ctf0Var) {
        dc2Var.getClass();
        ctf0Var.getClass();
        boolean z = dc2Var.c;
        Set set = dc2Var.b;
        if (!z) {
            return null;
        }
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        Set set2 = set;
        Object[] objArr = {Integer.valueOf(set2.size()), 10};
        lsm0 lsm0Var = ctf0Var.b;
        return new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.select_items_max, Arrays.copyOf(objArr, 2))), !set2.isEmpty(), false, false), rk.Y), new itl(new wul(nul.e, oe9Var, new ue9(lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, false), rk.B)));
    }

    public static final mm40 I(mm40 mm40Var, hh80 hh80Var) {
        return mm40Var.e(new kh80(hh80Var, new r580((byte) 12)));
    }

    public static final mm40 J(mm40 mm40Var, float f2) {
        return mm40Var.e(new bh80(f2, f2, f2, f2, true, new r580((byte) 15)));
    }

    public static final mm40 K(mm40 mm40Var, float f2, float f3) {
        return mm40Var.e(new bh80(f2, f3, f2, f3, true, new r580((byte) 13)));
    }

    public static mm40 L(mm40 mm40Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return K(mm40Var, f2, f3);
    }

    public static final mm40 M(mm40 mm40Var, float f2, float f3, float f4, float f5) {
        return mm40Var.e(new bh80(f2, f3, f4, f5, true, new r580((byte) 14)));
    }

    public static mm40 N(mm40 mm40Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return M(mm40Var, f2, f3, f4, f5);
    }

    public static float O(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i2;
        float f3 = f2 / i3;
        float f4 = 0.8f * f3;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            float f6 = iArr2[i5] * f3;
            float f7 = i6;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object P(Function0 function0, Function2 function2, zje zjeVar) {
        vu2 vu2Var;
        if (zjeVar instanceof vu2) {
            vu2Var = (vu2) zjeVar;
            int i2 = vu2Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vu2Var.j = i2 - Integer.MIN_VALUE;
            } else {
                vu2Var = new vu2(zjeVar);
            }
        } else {
            vu2Var = new vu2(zjeVar);
        }
        Object obj = vu2Var.i;
        wne wneVar = wne.f39444a;
        int i3 = vu2Var.j;
        yje yjeVar = null;
        try {
            if (i3 == 0) {
                z1x.P(obj);
                bv2 bv2Var = new bv2(function0, function2, yjeVar, (byte) 0);
                vu2Var.j = 1;
                if (d5c.J(vu2Var, bv2Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
        } catch (lu2 unused) {
        }
        return Unit.f46060a;
    }

    public static final wy6 Q(ly6 ly6Var, ctf0 ctf0Var, boolean z) {
        String str;
        ctf0Var.getClass();
        boolean z2 = ly6Var.g;
        g680 g680Var = ly6Var.f;
        jur jurVar = ly6Var.d;
        String str2 = null;
        if (z2) {
            uf40 uf40VarT = T(ly6Var, jurVar.c, ctf0Var);
            n5n0 n5n0Var = jurVar.b;
            if (!(n5n0Var instanceof l5n0)) {
                if (!(n5n0Var instanceof m5n0)) {
                    t9f.b();
                    return null;
                }
                str2 = ((m5n0) n5n0Var).f21229a;
                str2.getClass();
            }
            return new ty6(uf40VarT, str2, R(ly6Var, ctf0Var, z));
        }
        htv htvVar = ly6Var.b;
        boolean z3 = htvVar.f13653a;
        boolean z4 = htvVar.b;
        String str3 = htvVar.c;
        lsm0 lsm0Var = ctf0Var.b;
        d8r0 d8r0Var = new d8r0(z3, z4, str3, lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), htvVar.e, jurVar.d, htvVar.d);
        uf40 uf40VarT2 = T(ly6Var, g680Var == null ? jurVar.c : null, ctf0Var);
        n5n0 n5n0Var2 = jurVar.b;
        if (n5n0Var2 instanceof l5n0) {
            str = null;
        } else {
            if (!(n5n0Var2 instanceof m5n0)) {
                t9f.b();
                return null;
            }
            str = ((m5n0) n5n0Var2).f21229a;
            str.getClass();
        }
        return new ry6(d8r0Var, uf40VarT2, str, R(ly6Var, ctf0Var, z), jurVar.e == fho.c ? lsm0Var.a(R.string.options_bet_label, Arrays.copyOf(new Object[0], 0)) : null, g680Var != null ? new i680(g680Var.f10750a, g680Var.b) : null);
    }

    public static final eo8 R(ly6 ly6Var, ctf0 ctf0Var, boolean z) {
        gye gyeVar;
        Object g0g0Var;
        f0d f0dVar = ly6Var.e;
        htv htvVar = ly6Var.b;
        if (z) {
            return new do8(f0dVar.f8711a, f0dVar.b, ctf0Var.b.a(R.string.settings, Arrays.copyOf(new Object[0], 0)), f0dVar.c);
        }
        int iOrdinal = htvVar.f.ordinal();
        if (iOrdinal == 0) {
            gyeVar = gye.INVISIBLE;
        } else if (iOrdinal == 1) {
            gyeVar = gye.ADD_TO_COUPON;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            gyeVar = gye.REMOVE_FROM_COUPON;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = ctf0Var.b.a(htvVar.f.f17355a, Arrays.copyOf(new Object[0], 0));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        String str = (String) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        if (str == null) {
            str = "";
        }
        return new co8(gyeVar, str);
    }

    public static final ml3 S(rm3 rm3Var, bb6 bb6Var, ctf0 ctf0Var) {
        bb6Var.getClass();
        ctf0Var.getClass();
        int iOrdinal = rm3Var.ordinal();
        if (iOrdinal == 0) {
            return ll3.f20228a;
        }
        if (iOrdinal == 1) {
            int iA = bb6Var.a(ctf0Var.f(R.string.download_bar_thick_line_icon, new Object[0]), dkq.DRAWABLE);
            if (iA != 0) {
                return new kl3(iA);
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return il3.f14957a;
            }
            t9f.b();
            return null;
        }
        return jl3.f16697a;
    }

    public static final uf40 T(ly6 ly6Var, j43 j43Var, ctf0 ctf0Var) {
        kgs kgsVar;
        d480 a480Var;
        jur jurVar = ly6Var.d;
        vw20 vw20Var = jurVar.f17171a;
        if (vw20Var instanceof tw20) {
            kgsVar = new kgs(((tw20) vw20Var).f34628a);
        } else {
            if (!(vw20Var instanceof uw20)) {
                t9f.b();
                return null;
            }
            uw20 uw20Var = (uw20) vw20Var;
            kgsVar = new kgs(w6x.q(uw20Var.f36375a, Separators.SP, uw20Var.b));
        }
        h580 h580Var = ly6Var.c;
        if (h580Var != null) {
            if (h580Var instanceof d580) {
                d580 d580Var = (d580) h580Var;
                a480Var = new a480(d580Var.f5493a, d580Var.b, d580Var.d);
            } else if (h580Var instanceof e580) {
                e580 e580Var = (e580) h580Var;
                a480Var = new a480(e580Var.f7221a, e580Var.b, e580Var.i);
            } else if (h580Var instanceof f580) {
                a480Var = new z380(((f580) h580Var).f8949a);
            } else if (h580Var instanceof g580) {
                g580 g580Var = (g580) h580Var;
                a480Var = new a480(g580Var.f10706a, g580Var.b, g580Var.h);
            }
            return new uf40(kgsVar, a480Var, j43Var, jurVar.e == fho.b ? ctf0Var.b.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0)) : null);
        }
        t9f.b();
        return null;
    }

    public static final LinkedHashMap U(drd drdVar) {
        Object objD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (u15 u15Var : drdVar.c()) {
            Object obj = u15Var.c;
            CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
            if (key != null && (objD = drdVar.d(u15Var)) != null) {
                linkedHashMap.put(key, objD);
            }
        }
        return linkedHashMap;
    }

    public static final void a(mm40 mm40Var, String str, String str2, smk0 smk0Var, smk0 smk0Var2, fet fetVar, int i2) {
        str.getClass();
        str2.getClass();
        fetVar.g0(655738463);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(smk0Var) ? 2048 : 1024) | (fetVar.g(smk0Var2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            h83 h83Var = new h83();
            if (!StringsKt.W(str)) {
                int iG = h83Var.g(smk0Var);
                try {
                    h83Var.c(str);
                    h83Var.d(iG);
                    int iG2 = h83Var.g(smk0Var2);
                    try {
                        h83Var.c(": ");
                        h83Var.d(iG2);
                    } catch (Throwable th) {
                        h83Var.d(iG2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    h83Var.d(iG);
                    throw th2;
                }
            }
            int iG3 = h83Var.g(new smk0(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), g1t0.n().f42262a.b, null, null, null, g1t0.n().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500));
            try {
                h83Var.c(str2);
                h83Var.d(iG3);
                v8q0.b(h83Var.h(), o7k0.d(mm40Var, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, new y9q0(0L, 0L, null, null, 0L, null, 0, 4, 0L, 16711679), fetVar, 0, 0, 262140);
            } catch (Throwable th3) {
                h83Var.d(iG3);
                throw th3;
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var, (Object) str, (Object) str2, (Object) smk0Var, (Object) smk0Var2, i2, (byte) 3);
        }
    }

    public static final void b(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(995590748);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarE = o7k0.e(N(mm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 110.0f);
            zcl zclVar2 = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var2, i2, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:63:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:71:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:0x014c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    public static final void c(px4 px4Var, Function1 function1, fet fetVar, int i2) {
        cl5 cl5Var;
        Function1 function2;
        boolean z;
        Object objP;
        boolean z2;
        Object objP2;
        boolean z3;
        Object objP3;
        fet fetVar2;
        Function1 function3 = function1;
        px4Var.getClass();
        function3.getClass();
        fetVar.g0(1636916769);
        int i3 = i2 | (fetVar.g(px4Var) ? 32 : 16) | (fetVar.i(function3) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 145) != 144)) {
            yv6 yv6Var = px4Var.f27737a;
            ixo0 ixo0Var = px4Var.c;
            mx6 mx6Var = yv6Var.f43305a;
            oln0 oln0Var = yv6Var.b;
            xnb0 xnb0Var = yv6Var.c;
            jke jkeVar = yv6Var.d;
            fx6 fx6Var = yv6Var.e;
            String str = yv6Var.f;
            int i4 = i3 & 896;
            boolean z4 = i4 == 256;
            Object objP4 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z4 || objP4 == cl5Var2) {
                objP4 = new fj4(function3, (byte) 5);
                fetVar.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean z5 = i4 == 256;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var2) {
                objP5 = new fj4(function3, (byte) 8);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean z6 = i4 == 256;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var2) {
                objP6 = new wc2(function3, (byte) 17);
                fetVar.o0(objP6);
            }
            rsr0.f(null, mx6Var, oln0Var, xnb0Var, jkeVar, fx6Var, str, null, null, function0, function4, (Function1) objP6, null, fetVar, 0, 4481);
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            yv6 yv6Var2 = px4Var.b;
            mx6 mx6Var2 = yv6Var2.f43305a;
            oln0 oln0Var2 = yv6Var2.b;
            xnb0 xnb0Var2 = yv6Var2.c;
            jke jkeVar2 = yv6Var2.d;
            fx6 fx6Var2 = yv6Var2.e;
            String str2 = yv6Var2.f;
            boolean z7 = i4 == 256;
            Object objP7 = fetVar.P();
            if (z7) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP7 != cl5Var) {
                    function2 = function1;
                }
                Function0 function5 = (Function0) objP7;
                if (i4 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new fj4(function2, (byte) 12);
                    fetVar.o0(objP);
                }
                Function0 function6 = (Function0) objP;
                if (i4 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new fj4(function2, (byte) 14);
                    fetVar.o0(objP2);
                }
                Function0 function7 = (Function0) objP2;
                z3 = i4 == 256;
                objP3 = fetVar.P();
                if (z3 || objP3 == cl5Var) {
                    objP3 = new wc2(function2, (byte) 18);
                    fetVar.o0(objP3);
                }
                Function1 function8 = (Function1) objP3;
                function3 = function2;
                rsr0.f(null, mx6Var2, oln0Var2, xnb0Var2, jkeVar2, fx6Var2, str2, null, function5, function6, function7, function8, null, fetVar, 0, 4225);
                fetVar2 = fetVar;
                if (ixo0Var.f15552a) {
                    fetVar2.e0(330706544);
                    wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                    etm0.b(null, ixo0Var.b, ixo0Var.d, ixo0Var.e, ixo0Var.c, null, fetVar, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(331030401);
                    fetVar2.r(false);
                }
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
            }
            function2 = function1;
            objP7 = new fj4(function2, (byte) 10);
            fetVar.o0(objP7);
            Function0 function9 = (Function0) objP7;
            if (i4 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                objP = new fj4(function2, (byte) 12);
                fetVar.o0(objP);
            } else {
                objP = new fj4(function2, (byte) 12);
                fetVar.o0(objP);
            }
            Function0 function10 = (Function0) objP;
            if (i4 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar.P();
            if (z2) {
                objP2 = new fj4(function2, (byte) 14);
                fetVar.o0(objP2);
            } else {
                objP2 = new fj4(function2, (byte) 14);
                fetVar.o0(objP2);
            }
            Function0 function11 = (Function0) objP2;
            if (i4 == 256) {
            }
            objP3 = fetVar.P();
            if (z3) {
                objP3 = new wc2(function2, (byte) 18);
                fetVar.o0(objP3);
            } else {
                objP3 = new wc2(function2, (byte) 18);
                fetVar.o0(objP3);
            }
            Function1 function12 = (Function1) objP3;
            function3 = function2;
            rsr0.f(null, mx6Var2, oln0Var2, xnb0Var2, jkeVar2, fx6Var2, str2, null, function9, function10, function11, function12, null, fetVar, 0, 4225);
            fetVar2 = fetVar;
            if (ixo0Var.f15552a) {
                fetVar2.e0(330706544);
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                etm0.b(null, ixo0Var.b, ixo0Var.d, ixo0Var.e, ixo0Var.c, null, fetVar, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(331030401);
                fetVar2.r(false);
            }
            wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(px4Var, function3, i2, (byte) 19);
        }
    }

    public static final void d(String str, fet fetVar, int i2) {
        fetVar.g0(-359462284);
        byte b2 = 4;
        int i3 = (fetVar.g(str) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            pm80 pm80VarF = a8k0.F(pkd.d(fetVar) ? R.drawable.map_statistic_tablet_placeholder : R.drawable.map_statistic_placeholder, 0, fetVar);
            mz3 mz3VarY = l7x.Y(str, pm80VarF, pm80VarF, null, null, null, fetVar, (i3 & 14) | 576, Response.SERVER_TIMEOUT);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            j0x.b(mz3VarY, null, lgb.J(n0qVar, new ugg0(zclVar, zclVar, zclVar, zclVar)), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20(b2, i2, str);
        }
    }

    public static final void e(String str, Function0 function0, mm40 mm40Var, long j2, long j3, boolean z, fet fetVar, int i2) {
        int i3;
        str.getClass();
        function0.getClass();
        fetVar.g0(-1611121104);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.f(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z) ? 131072 : 65536;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            ymx ymxVar = ymx.INTERVAL_100;
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new tq(function0, (byte) 13);
                fetVar.o0(objP);
            }
            Function0 function0G = phu0.G(6, 0, fetVar, (Function0) objP);
            be9 be9VarA = ee9.a(j3, j2, 0L, 0L, fetVar, 12);
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            lh80 lh80Var = new lh80(12.0f, 10.0f, 12.0f, 10.0f);
            jm40 jm40Var = jm40.b;
            o050.g(function0G, mm40Var.e(z ? o7k0.d(jm40Var, 1.0f) : o7k0.A(jm40Var, null, 3)), false, ugg0Var2, be9VarA, null, lh80Var, u1c.M(97670208, new h0(str, b2), fetVar), fetVar, 805306368, 356);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v5n(str, function0, mm40Var, j2, j3, z, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c78 f(vz2 vz2Var, int i2) {
        c78 c78Var = new c78(vz2Var, (((long) vz2Var.f38278a.getHeight()) & 4294967295L) | (((long) vz2Var.f38278a.getWidth()) << 32));
        c78Var.h = i2;
        return c78Var;
    }

    public static final void g(us8 us8Var, long j2, w6k w6kVar, xdr xdrVar, fet fetVar, int i2) {
        xdr xdrVar2;
        mm40 mm40VarS;
        boolean z;
        ugd ugdVar = ahy.d;
        fetVar.g0(1677707060);
        int i3 = i2 | (fetVar.i(us8Var) ? 4 : 2) | (fetVar.f(j2) ? 32 : 16) | (fetVar.g(w6kVar) ? 256 : 128) | (fetVar.i(ugdVar) ? 2048 : 1024) | (fetVar.i(xdrVar) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Rect rect = us8Var.b;
            float fR0 = w6kVar.r0(rect.width());
            float fR1 = w6kVar.r0(rect.height());
            ts8 ts8Var = us8Var.f36199a.e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS2 = o7k0.s(jm40Var, fR0);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS2);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, fR0), fR1);
            if (us8Var.f) {
                zcl zclVar = qmk.f28987a;
                mm40VarS = i120.S(jm40Var, 1.0f, j2, vgg0.a(16.0f));
            } else {
                mm40VarS = jm40Var;
            }
            mm40 mm40VarK = lgb.K(mm40VarE.e(mm40VarS));
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            int i4 = (i3 >> 6) & 112;
            ugdVar.F(us8Var, fetVar, Integer.valueOf((i3 & 14) | 8 | i4));
            fetVar.r(true);
            if (ts8Var != null) {
                int i5 = ts8Var.b;
                fetVar.e0(-569128183);
                float fR2 = w6kVar.r0(i5);
                zcl zclVar2 = qmk.f28987a;
                qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
                xdrVar2 = xdrVar;
                xdrVar2.F(ts8Var.d, fetVar, Integer.valueOf((i3 >> 9) & 112));
                mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, fR0), fR2);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                int i6 = rect.left;
                int i7 = rect.bottom;
                ugdVar.F(new us8(ts8Var, new Rect(i6, i7, rect.right, i7 + i5), 0.0f, 0.0f, i5, false, qr8.b), fetVar, Integer.valueOf(8 | i4));
                z = true;
                fetVar.r(true);
                fetVar.r(false);
            } else {
                xdrVar2 = xdrVar;
                z = true;
                fetVar.e0(-568098952);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            xdrVar2 = xdrVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds8((Object) us8Var, j2, (Object) w6kVar, (wdr) xdrVar2, i2, (byte) 0);
        }
    }

    public static final void h(mm40 mm40Var, es8 es8Var, boolean z, long j2, float f2, long j3, xdr xdrVar, fet fetVar, int i2) {
        int i3;
        xdr xdrVar2;
        boolean z2;
        float f3;
        int i4;
        float fW0;
        boolean z3;
        ugd ugdVar = ahy.d;
        fetVar.g0(1199865906);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(es8Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= fetVar.f(j3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= fetVar.i(ugdVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            xdrVar2 = xdrVar;
            i5 |= fetVar.i(xdrVar2) ? 8388608 : 4194304;
        } else {
            xdrVar2 = xdrVar;
        }
        if (fetVar.U(i5 & 1, (4793491 & i5) != 4793490)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                w6k w6kVar = (w6k) fetVar.k(bmd.h);
                zcl zclVar = qmk.f28987a;
                i4 = i5 & (-57345);
                fW0 = w6kVar.w0(1.0f);
                z3 = true;
            } else {
                fetVar.X();
                i4 = i5 & (-57345);
                z3 = z;
                fW0 = f2;
            }
            fetVar.s();
            int i6 = i4 >> 3;
            wb.g(es8Var.b, z3, j2, fW0, u1c.M(698588300, new si6((List) ((hgk0) es8Var.f8317a.v).getValue(), mm40Var, j3, (w6k) fetVar.k(bmd.h), xdrVar2), fetVar), fetVar, (i6 & 112) | 24576 | (i6 & 896));
            z2 = z3;
            f3 = fW0;
        } else {
            fetVar.X();
            z2 = z;
            f3 = f2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cs8(mm40Var, es8Var, z2, j2, f3, j3, xdrVar, i2);
        }
    }

    public static final void i(int i2, fet fetVar, d9z d9zVar, l7m0 l7m0Var, Function1 function1) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(164156995);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(d9zVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            g19 g19Var = ((a29) l7m0Var.getValue()).d;
            if (g19Var != null) {
                boolean z = g19Var instanceof e19;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar2.e0(-1566376305);
                    dol dolVar = ((e19) g19Var).f7028a;
                    byte b2 = 3;
                    if (dolVar instanceof bol) {
                        fetVar2.e0(-1566284824);
                        a4x a4xVar = ((bol) dolVar).f2938a;
                        boolean z2 = (i3 & 7168) == 2048;
                        Object objP = fetVar2.P();
                        if (z2 || objP == cl5Var) {
                            objP = new n19(function1, (byte) 7);
                            fetVar2.o0(objP);
                        }
                        Function0 function0 = (Function0) objP;
                        int i4 = ((i3 >> 6) & 14) | 384;
                        boolean zG = ((((i4 & 14) ^ 6) > 4 && fetVar.g(d9zVar)) || (i4 & 6) == 4) | fetVar2.g(function0);
                        Object objP2 = fetVar2.P();
                        if (zG || objP2 == cl5Var) {
                            objP2 = new xi1(d9zVar, function0, null, b2);
                            fetVar2.o0(objP2);
                        }
                        m0x0.t(fetVar2, a4xVar, (Function2) objP2);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1565924449);
                        fetVar2.r(false);
                    }
                    n0q n0qVar = o7k0.c;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = h97.f(qmk.a(fetVar2).c, 8.0f, qmk.a(fetVar2).c, 24.0f, fetVar2);
                    boolean z3 = (i3 & 7168) == 2048;
                    Object objP3 = fetVar2.P();
                    if (z3 || objP3 == cl5Var) {
                        objP3 = new xz8(function1, b2);
                        fetVar2.o0(objP3);
                    }
                    wvb.k(n0qVar, dolVar, d9zVar, ch80VarF, (Function1) objP3, null, fetVar, i3 & 896, 32);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if (g19Var instanceof f19) {
                    fetVar2.e0(-1565164484);
                    mm40 mm40VarE = tfx.E(o7k0.c);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mdm mdmVar = ((f19) g19Var).f8756a;
                    boolean z4 = (i3 & 7168) == 2048;
                    Object objP4 = fetVar2.P();
                    if (z4 || objP4 == cl5Var) {
                        objP4 = new tk8(function1, (byte) 29);
                        fetVar2.o0(objP4);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP4, fetVar2, 0, 5);
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-1158909740, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5(l7m0Var, d9zVar, function1, i2);
        }
    }

    public static final void j(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        float f2;
        cl5 cl5Var;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-177620512);
        int i3 = i2 | 6 | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
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
            b19 b19Var = ((a29) l7m0Var.getValue()).b;
            if (b19Var != null) {
                boolean z = b19Var instanceof z09;
                cl5 cl5Var2 = ukd.f35823a;
                if (z) {
                    fetVar2.e0(-354489823);
                    z09 z09Var = (z09) b19Var;
                    ijl ijlVar = z09Var.b;
                    jjl jjlVar = z09Var.f43554a;
                    int i4 = i3 & 896;
                    boolean z2 = i4 == 256;
                    Object objP = fetVar2.P();
                    if (z2 || objP == cl5Var2) {
                        objP = new n19(function1, b2);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean z3 = i4 == 256;
                    Object objP2 = fetVar2.P();
                    if (z3 || objP2 == cl5Var2) {
                        objP2 = new n19(function1, b3);
                        fetVar2.o0(objP2);
                    }
                    Function0 function2 = (Function0) objP2;
                    boolean z4 = i4 == 256;
                    Object objP3 = fetVar2.P();
                    if (z4 || objP3 == cl5Var2) {
                        objP3 = new n19(function1, (byte) 2);
                        fetVar2.o0(objP3);
                    }
                    f2 = 8.0f;
                    feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar, 0, 4);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                    cl5Var = cl5Var2;
                } else {
                    f2 = 8.0f;
                    if (b19Var instanceof a19) {
                        fetVar2.e0(-353778590);
                        mm40 mm40VarQ = i120.Q(jm40Var2, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarK = K(mm40VarQ, 12.0f, 8.0f);
                        a19 a19Var = (a19) b19Var;
                        String str = a19Var.f61a;
                        String str2 = a19Var.b;
                        int i5 = i3 & 896;
                        boolean z5 = i5 == 256;
                        Object objP4 = fetVar2.P();
                        cl5Var = cl5Var2;
                        if (z5 || objP4 == cl5Var) {
                            objP4 = new n19(function1, (byte) 3);
                            fetVar2.o0(objP4);
                        }
                        Function0 function3 = (Function0) objP4;
                        boolean z6 = i5 == 256;
                        Object objP5 = fetVar2.P();
                        if (z6 || objP5 == cl5Var) {
                            objP5 = new n19(function1, (byte) 4);
                            fetVar2.o0(objP5);
                        }
                        pzb.g(mm40VarK, str, str2, function3, (Function0) objP5, fetVar, 0);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
                mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                c19 c19Var = ((a29) l7m0Var.getValue()).c;
                if (c19Var == null || (c19Var.b.isEmpty() && !c19Var.c)) {
                    jm40Var = jm40Var2;
                    fetVar2.e0(-352241300);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-352675672);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = L(jm40Var2, 0.0f, f2, 1);
                    a4x a4xVar = c19Var.b;
                    lq5 lq5Var = c19Var.f3564a;
                    boolean z7 = c19Var.c;
                    boolean z8 = (i3 & 896) == 256;
                    Object objP6 = fetVar2.P();
                    if (z8 || objP6 == cl5Var) {
                        objP6 = new ag0(function1, (byte) 17);
                        fetVar2.o0(objP6);
                    }
                    jm40Var = jm40Var2;
                    etl.e(mm40VarL, a4xVar, lq5Var, z7, null, 0.0f, 0, null, (Function2) objP6, fetVar, 0, 240);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            }
            throw b1j.f(681298356, fetVar2, false);
        }
        fetVar2.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function1, i2, (byte) 11);
        }
    }

    public static final void k(mm40 mm40Var, l7m0 l7m0Var, d9z d9zVar, nyq0 nyq0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        d9zVar.getClass();
        nyq0Var.getClass();
        fetVar.g0(-35924764);
        byte b2 = 16;
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.g(nyq0Var) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarE0 = o2e.e0(lgb.K(cjx.V(i120.Q(N(o7k0.c, 0.0f, fbc.T(fetVar), 0.0f, 0.0f, 13), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), nyq0Var.a(), null)), "BRANDS_LIST_SCREEN_COLUMN");
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
            ahy.b(null, nyq0Var, ((a29) l7m0Var.getValue()).d instanceof f19, u1c.M(-478347303, new o71(l7m0Var, function1, b2), fetVar), u1c.M(180035576, new o71(l7m0Var, function1, (byte) 17), fetVar), fetVar, ((i3 >> 6) & 112) | 27648, 1);
            i(((i3 >> 3) & 7168) | (i3 & 112) | 6 | (i3 & 896), fetVar, d9zVar, l7m0Var, function1);
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var2, (Object) l7m0Var, (Object) d9zVar, (Object) nyq0Var, (Object) function1, i2, (byte) 16);
        }
    }

    public static final void l(mm40 mm40Var, zja zjaVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        function1.getClass();
        function2.getClass();
        fetVar.g0(-777679655);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(zjaVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            uc9.h(N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, u1c.M(-1611838778, new n82(zjaVar, function1, function2, (byte) 7), fetVar), u1c.M(-2045802459, new awh(zjaVar, (byte) 10), fetVar), fetVar, 27648, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((Object) mm40Var, (Object) zjaVar, function1, (wdr) function2, i2, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0208  */
    /* JADX WARN: Code duplicated, block: B:143:0x024d  */
    public static final void m(final mm40 mm40Var, final String str, final String str2, final long j2, final boolean z, final boolean z2, final k73 k73Var, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final Function0 function0, fet fetVar, final int i2, final int i3) {
        int i4;
        fet fetVar2;
        Object t9bVar;
        fet fetVar3;
        pz40 pz40Var;
        int i5;
        long j3;
        float f2;
        float f3;
        float f4;
        mm40 mm40VarE0;
        k73Var.getClass();
        function0.getClass();
        fetVar.g0(1355689753);
        int i6 = (fetVar.e(k73Var.ordinal()) ? 1048576 : 524288) | i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192) | (fetVar.h(z2) ? 131072 : 65536) | (fetVar.h(z3) ? 8388608 : 4194304) | (fetVar.h(z4) ? 67108864 : 33554432) | (fetVar.h(z5) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (fetVar.h(z6) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.h(z7) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i6 & 1, ((306783379 & i6) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            int i7 = ((i6 >> 27) & 14) | ((i6 >> 6) & 112);
            int i8 = i4 << 3;
            int i9 = i7 | (i8 & 896) | (i8 & 7168);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            Object[] objArr = {Boolean.valueOf(z5), Long.valueOf(j2), function0, Boolean.valueOf(z7)};
            boolean z8 = ((((i9 & 14) ^ 6) > 4 && fetVar.h(z5)) || (i9 & 6) == 4) | ((((i9 & 896) ^ 384) > 256 && fetVar.h(z7)) || (i9 & 384) == 256) | ((((i9 & 112) ^ 48) > 32 && fetVar.f(j2)) || (i9 & 48) == 32) | ((((i9 & 7168) ^ 3072) > 2048 && fetVar.g(function0)) || (i9 & 3072) == 2048);
            Object objP2 = fetVar.P();
            if (z8 || objP2 == cl5Var) {
                fetVar3 = fetVar;
                pz40Var = pz40Var2;
                i5 = 6;
                t9bVar = new t9b(z5, z7, pz40Var, j2, function0, null);
                j3 = j2;
                fetVar3.o0(t9bVar);
            } else {
                j3 = j2;
                fetVar3 = fetVar;
                pz40Var = pz40Var2;
                t9bVar = objP2;
                i5 = 6;
            }
            m0x0.w(objArr, (Function2) t9bVar, fetVar3);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            boolean z9 = str.length() > 0;
            boolean z10 = z4 && z7;
            int i10 = i6 >> 3;
            l7m0 l7m0VarB = d43.b((zBooleanValue && z9) ? 1.0f : 0.0f, ro4.m0(300, z5 ? (int) j3 : 0, null, 4), "show_up_alpha", null, fetVar3, 3072, 20);
            if (z10) {
                if (!zBooleanValue || !z9) {
                    f2 = 1.3636364f;
                } else if (((Number) l7m0VarB.getValue()).floatValue() < 0.5f) {
                    f2 = 1.8636364f;
                } else {
                    f3 = 1.0f;
                }
                f3 = f2;
            } else {
                f3 = 1.0f;
            }
            l7m0 l7m0VarB2 = d43.b(f3, new nul0(0.3f, 1000.0f, Float.valueOf(0.01f)), "scale", null, fetVar, 3120, 20);
            if (z && k73Var == k73.b) {
                if (z3) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
            } else if (!z6 || z2) {
                f4 = 1.0f;
            } else {
                f4 = 0.5f;
            }
            fetVar2 = fetVar;
            l7m0 l7m0VarB3 = d43.b(f4, ro4.m0(150, 0, null, i5), "blink_alpha", null, fetVar2, 3120, 20);
            z8b z8bVar = new z8b(((Number) l7m0VarB2.getValue()).floatValue(), (z && k73Var == k73.b) ? ((Number) l7m0VarB3.getValue()).floatValue() : ((Number) l7m0VarB3.getValue()).floatValue() * ((Number) l7m0VarB.getValue()).floatValue());
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z11 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z11) {
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(ffb0.Q(mm40Var2, 2.0f, 2.0f), 48.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM62getBlack0d7_KjU = staticColors.m62getBlack0d7_KjU();
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar2, i120.S(mm40VarN, 6.0f, jM62getBlack0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            mm40 mm40VarQ = i120.Q(i120.S(o2e.e0(o7k0.n(mm40Var2, 48.0f), "TIC_TAC_TOE_GAME_FIELD_CELL"), 2.0f, staticColors.m62getBlack0d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), staticColors.m123getWhite0d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            if (str.length() > 0) {
                fetVar2.e0(-2014350741);
                mm40 mm40VarA = jr8.f16991a.a(mm40Var2);
                if (str2 != null && (mm40VarE0 = o2e.e0(mm40Var2, str2)) != null) {
                    mm40Var2 = mm40VarE0;
                }
                mm40 mm40VarE = mm40VarA.e(mm40Var2);
                boolean zI = fetVar2.i(z8bVar);
                Object objP3 = fetVar2.P();
                if (zI || objP3 == cl5Var) {
                    objP3 = new lya(z8bVar, (byte) 6);
                    fetVar2.o0(objP3);
                }
                k7x.a(str, null, i4w0.T(mm40VarE, (Function1) objP3), null, null, fetVar, (i10 & 14) | 48, 2040);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2013849626);
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
            yfe0VarU.d = new Function2(str, str2, j2, z, z2, k73Var, z3, z4, z5, z6, z7, function0, i2, i3) { // from class: a.s9b
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ long d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ k73 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ Function0 m;
                public final /* synthetic */ int n;

                {
                    this.n = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    int iL2 = x8x.L(this.n);
                    s5x0.m(this.f31845a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (fet) obj, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void n(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(2124361791);
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
                objP = new nas0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, (byte) 8);
        }
    }

    public static final void o(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-2104683738);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarL = L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 13);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, (byte) 6);
        }
    }

    public static final void p(cjw cjwVar, fet fetVar, int i2) {
        fet fetVar2;
        cjwVar.getClass();
        fetVar.g0(-1746646395);
        int i3 = (fetVar.g(cjwVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            ((ijg) fetVar.k(jjg.f16616a)).getClass();
            zq8.a(0, fetVar, i120.Q(n0qVar, ijg.i, jd8.n));
            fetVar2 = fetVar;
            k7x.a(cjwVar.b.a(), null, n0qVar, gqw0.Z, null, fetVar2, 1769904, 1944);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxv(cjwVar, i2, (byte) 7);
        }
    }

    public static final void q(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        boolean z;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        zx7 zx7Var = gqw0.e;
        zx7 zx7Var2 = gqw0.f11754a;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-1979919458);
        byte b2 = 2;
        byte b3 = 16;
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new i8v(function1, b3);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new i8v(function1, (byte) 18);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f2 = 300.0f + fH0;
            float f3 = fH0 + 56.0f;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new ziw(l7m0Var, b2));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            byte b4 = 3;
            if (objP4 == cl5Var) {
                objP4 = jgk0.b(new ziw(l7m0Var2, b4));
                fetVar.o0(objP4);
            }
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            p(((jkw) l7m0Var.getValue()).f16690a, fetVar, 0);
            ((ijg) fetVar.k(jjg.f16616a)).getClass();
            m0x0.d(null, f2, ijg.i, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), true, 0.0f, new ycl(f3), 0L, 0.0f, (l7m0) objP4, null, u1c.M(2049590539, new axp(l7m0Var, l7m0Var2, f2, f3, function1), fetVar), u1c.M(-1919221103, new mkb(l7m0Var2, xczVarA, qdzVar, function1, l7m0Var), fetVar), fetVar, 805330944, 432, 1409);
            fetVar2 = fetVar;
            gjw gjwVar = (gjw) l7m0Var2.getValue();
            if (gjwVar == null) {
                z = false;
            } else {
                boolean z4 = gjwVar instanceof fjw;
                jm40 jm40Var = jm40.b;
                jr8 jr8Var = jr8.f16991a;
                pcy pcyVar = e7z.u1;
                if (z4) {
                    fetVar2.e0(-992451978);
                    n0q n0qVar = o7k0.c;
                    tj30 tj30VarC = zq8.c(zx7Var2, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar4);
                    jpm0.o(fetVar2, bh90VarM, shdVar3);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), shdVar2);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, shdVar);
                    mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
                    mdm mdmVar = ((fjw) gjwVar).f9664a;
                    boolean z5 = i4 == 256;
                    Object objP5 = fetVar2.P();
                    if (z5 || objP5 == cl5Var) {
                        function2 = function1;
                        objP5 = new i8v(function2, (byte) 19);
                        fetVar2.o0(objP5);
                    } else {
                        function2 = function1;
                    }
                    jcb.l(mm40VarB, mdmVar, false, (Function0) objP5, fetVar2, 0, 4);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else if (gjwVar instanceof ejw) {
                    fetVar2.e0(-992020520);
                    n0q n0qVar2 = o7k0.c;
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar4);
                    jpm0.o(fetVar2, bh90VarM2, shdVar3);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), shdVar2);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar);
                    mm40 mm40VarB2 = jr8Var.b(jm40Var, zx7Var);
                    mdm mdmVar2 = ((ejw) gjwVar).f7927a;
                    boolean z6 = i4 == 256;
                    Object objP6 = fetVar2.P();
                    if (z6 || objP6 == cl5Var) {
                        function2 = function1;
                        objP6 = new i8v(function2, (byte) 20);
                        fetVar2.o0(objP6);
                    } else {
                        function2 = function1;
                    }
                    jcb.l(mm40VarB2, mdmVar2, false, (Function0) objP6, fetVar2, 0, 4);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    z = false;
                }
            }
            function2 = function1;
            fetVar2.e0(-991623038);
            fetVar2.r(z);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function2, i2, (byte) 4);
        }
    }

    public static final void r(ip20 ip20Var, fet fetVar, int i2) {
        ip20Var.getClass();
        fetVar.g0(-1876862381);
        byte b2 = 4;
        byte b3 = 2;
        int i3 = (fetVar.g(ip20Var) ? 4 : 2) | i2;
        byte b4 = 0;
        byte b5 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            s(ip20Var.h, ip20Var.i, u1c.M(1889099488, new gp20(ip20Var, b4), fetVar), u1c.M(1473772671, new gp20(ip20Var, b5), fetVar), u1c.M(1058445854, new gp20(ip20Var, b3), fetVar), u1c.M(643119037, new gp20(ip20Var, (byte) 3), fetVar), u1c.M(227792220, new gp20(ip20Var, b2), fetVar), fetVar, 1797504);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gp20(ip20Var, i2);
        }
    }

    public static final void s(boolean z, boolean z2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, fet fetVar, int i2) {
        ugd ugdVar6;
        ugd ugdVar7;
        yjj0 yjj0VarC;
        lh80 lh80VarU;
        fetVar.g0(652784811);
        int i3 = i2 | (fetVar.h(z) ? 4 : 2) | (fetVar.h(z2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            if (z && z2) {
                zcl zclVar = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                yjj0VarC = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (z) {
                zcl zclVar2 = qmk.f28987a;
                yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
            } else if (z2) {
                zcl zclVar3 = qmk.f28987a;
                yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
            } else {
                yjj0VarC = jd8.n;
            }
            if (z) {
                zcl zclVar4 = qmk.f28987a;
                lh80VarU = new lh80(4.0f, 4.0f, 4.0f, 4.0f);
            } else {
                zcl zclVar5 = qmk.f28987a;
                lh80VarU = u(4.0f, 0.0f, 4.0f, 4.0f, 2);
            }
            float f2 = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(I(i120.Q(o7k0.d(L(jm40Var, f2, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), yjj0VarC), lh80VarU), 88.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            ugdVar.invoke(fetVar, 6);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            y(R.string.cs_ct_label, gqw0.m, N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), ugdVar2, fetVar, 24966);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarC = o7k0.c(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarC);
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
            ugdVar6 = ugdVar4;
            ugdVar6.invoke(fetVar, 6);
            ugdVar7 = ugdVar5;
            ugdVar7.invoke(fetVar, 6);
            fetVar.r(true);
            y(R.string.cs_t_label, gqw0.o, N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), ugdVar3, fetVar, 24966);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            ugdVar6 = ugdVar4;
            ugdVar7 = ugdVar5;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q3o(z, z2, ugdVar, ugdVar2, ugdVar3, ugdVar6, ugdVar7, i2);
        }
    }

    public static lh80 t(float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new lh80(f2, f3, f2, f3);
    }

    public static lh80 u(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new lh80(f2, f3, f4, f5);
    }

    public static final void v(mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i2) {
        xcz xczVar2;
        l7m0 l7m0Var3;
        l7m0 l7m0Var4;
        mm40 mm40Var2;
        fetVar.g0(-1693007759);
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
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(mm40VarQ, xczVar2, l7m0Var3, null, knm0.g(u(0.0f, 8.0f, 0.0f, 28.0f, 5), fetVar), z, null, u1c.M(-1543413901, new nc40(function1, (byte) 22), fetVar), fetVar, (i3 & 112) | 100663296 | (i3 & 896), 152);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bgg(mm40Var2, xczVar, l7m0Var, l7m0Var4, function1, i2, (byte) 2);
        }
    }

    public static final void w(mm40 mm40Var, yno0 yno0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        a4x a4xVar = yno0Var.f42950a;
        function1.getClass();
        fetVar2.g0(-1297741483);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(yno0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = yno0Var.c;
            int i4 = yno0Var.b;
            if (a4xVar.isEmpty()) {
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new o1l0(yno0Var, function1, i2);
                    return;
                }
                return;
            }
            int size = a4xVar.size() - 1;
            if (size < 0) {
                size = 0;
            }
            int iD = l1e0.d(i4, 0, size);
            int i5 = i3 & 112;
            boolean z2 = i5 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new jfm0(yno0Var, (byte) 28);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(iD, (Function0) objP, fetVar2, 0, 2);
            boolean zH = fetVar2.h(z);
            Object objP2 = fetVar2.P();
            if (zH || objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.valueOf(!z));
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Integer numValueOf = Integer.valueOf(i4);
            boolean zG = (i5 == 32) | fetVar2.g(kwjVarB);
            Object objP3 = fetVar2.P();
            yje yjeVar = null;
            if (zG || objP3 == cl5Var) {
                objP3 = new wbl0(kwjVarB, yno0Var, yjeVar, (byte) 7);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP3);
            int i6 = i3 & 896;
            boolean zG2 = fetVar2.g(kwjVarB) | (i6 == 256);
            Object objP4 = fetVar2.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new jno0(kwjVarB, function1, yjeVar, b2);
                fetVar2.o0(objP4);
            }
            m0x0.t(fetVar2, kwjVarB, (Function2) objP4);
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            int iR = kwjVarB.r();
            a4x a4xVar2 = yno0Var.f42950a;
            aoo0 aoo0Var = yno0Var.f;
            boolean z3 = i6 == 256;
            Object objP5 = fetVar2.P();
            if (z3 || objP5 == cl5Var) {
                objP5 = new zbm0(function1, (byte) 29);
                fetVar2.o0(objP5);
            }
            z5n.h(iR, a4xVar2, aoo0Var, null, null, false, (Function1) objP5, fetVar2, 0, 56);
            q5x.e(kwjVarB, n0qVar, null, null, 1, 0.0f, null, null, false, null, null, null, null, u1c.M(-858088770, new g54((Object) yno0Var, (Object) kwjVarB, (Object) pz40Var, (Object) function1, (byte) 2), fetVar2), fetVar, 24624, 24576, 16364);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new s0n0(mm40Var2, yno0Var, function1, i2, (byte) 5);
        }
    }

    public static final void x(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        qdzVar.getClass();
        function2.getClass();
        fetVar2.g0(628708084);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ojr0(l7m0Var, (byte) 17);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z2 = i4 == 4;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ojr0(l7m0Var, (byte) 18);
                fetVar2.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar2);
            xcz xczVarB = qdzVar.b("UNIVERSAL_CHAMP_INFO_SCREEN_KEY", new i9t0(b2), fetVar2, ((i3 << 3) & 896) | 6);
            mm40 mm40VarX = yyw.X(o7k0.c, null, fetVar2, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarX);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVar = ((gat0) l7m0VarY.getValue()).f10987a;
            boolean z3 = (i3 & 896) == 256;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new nas0(function2, (byte) 23);
                fetVar2.o0(objP3);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            w9t0 w9t0Var = (w9t0) l7m0VarY2.getValue();
            if (Intrinsics.d(w9t0Var, u9t0.f35299a)) {
                fetVar2.e0(1179654689);
                Object[] objArr3 = new Object[0];
                boolean z4 = i4 == 4;
                Object objP4 = fetVar2.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new ojr0(l7m0Var, (byte) 19);
                    fetVar2.o0(objP4);
                }
                l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP4, fetVar2);
                Object[] objArr4 = new Object[0];
                boolean z5 = i4 == 4;
                Object objP5 = fetVar2.P();
                if (z5 || objP5 == cl5Var) {
                    objP5 = new ojr0(l7m0Var, (byte) 20);
                    fetVar2.o0(objP5);
                }
                v(null, xczVarB, l7m0VarY3, v3c.Y(objArr4, (Function0) objP5, fetVar2), function1, fetVar2, (i3 << 6) & 57344);
                function2 = function1;
                fetVar2.r(false);
            } else {
                function2 = function1;
                if (!(w9t0Var instanceof v9t0)) {
                    throw b1j.f(38050175, fetVar2, false);
                }
                fetVar2.e0(1180011592);
                Object[] objArr5 = new Object[0];
                boolean zI = fetVar2.i(w9t0Var);
                Object objP6 = fetVar2.P();
                if (zI || objP6 == cl5Var) {
                    objP6 = new qir0((v9t0) w9t0Var, (byte) 28);
                    fetVar2.o0(objP6);
                }
                n(v3c.Y(objArr5, (Function0) objP6, fetVar2), function2, fetVar2, (i3 >> 3) & 112);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function2, i2, (byte) 8);
        }
    }

    public static final void y(int i2, xx7 xx7Var, mm40 mm40Var, ugd ugdVar, fet fetVar, int i3) {
        int i4;
        fet fetVar2;
        fetVar.g0(1832502025);
        int i5 = i3 & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i5 == 0) {
            i4 = (fetVar.g(zhg0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.g(xx7Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            mm40 mm40VarC = o7k0.c(zhg0Var.a(1.0f, mm40Var, true), 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), xx7Var, fetVar, ((i4 & 896) >> 3) & 112);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar.invoke(fetVar, Integer.valueOf((i4 >> 12) & 14));
            v8q0.a(xsm0.s(i2, fetVar), null, ((StaticColors) fetVar.k(m8m0.f21378a)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6(i2, xx7Var, mm40Var, ugdVar, i3);
        }
    }

    public static mm40 z(mm40 mm40Var) {
        return mm40Var.e(new bh80(0.0f, 0.0f, 12.0f, 0.0f, false, new r580((byte) 11)));
    }
}
