package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.security.keystore.KeyGenParameterSpec;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.TypedValue;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n2x {
    public static final int A(bnz bnzVar) {
        bnzVar.getClass();
        switch (bnzVar.ordinal()) {
            case 0:
                return R.string.deposit_losses_title;
            case 1:
                return R.string.deposit_limits_title;
            case 2:
                return R.string.deposit_bets_title;
            case 3:
                return R.string.timeout_title;
            case 4:
                return R.string.limit_self_block;
            case 5:
                return R.string.reality_title;
            case 6:
                return R.string.limit_for_session_time;
            case 7:
                return R.string.limit_self_restraint;
            case 8:
            case 9:
                return R.string.empty_str;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final String B(int i) {
        Uri.Builder builderBuildUpon = Uri.parse("").buildUpon();
        builderBuildUpon.getClass();
        builderBuildUpon.appendPath("static");
        builderBuildUpon.appendPath("svg");
        builderBuildUpon.appendPath("sports_v2");
        builderBuildUpon.appendPath(i + ".svg");
        String string = builderBuildUpon.build().toString();
        string.getClass();
        try {
            String strDecode = URLDecoder.decode(string, "UTF-8");
            strDecode.getClass();
            return strDecode;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static final String C(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static final int D(ugi0 ugi0Var, ugi0[] ugi0VarArr) {
        ugi0VarArr.getClass();
        int iHashCode = (ugi0Var.h().hashCode() * 31) + Arrays.hashCode(ugi0VarArr);
        int iD = ugi0Var.d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i2 = iD - 1;
            int i3 = i * 31;
            String strH = ugi0Var.g(ugi0Var.d() - iD).h();
            if (strH != null) {
                iHashCode2 = strH.hashCode();
            }
            i = i3 + iHashCode2;
            iD = i2;
        }
        int iD2 = ugi0Var.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iD2 - 1;
            int i5 = iHashCode3 * 31;
            c3x c3xVarL = ugi0Var.g(ugi0Var.d() - iD2).l();
            iHashCode3 = i5 + (c3xVarL != null ? c3xVarL.hashCode() : 0);
            iD2 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b0 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object E(a.kls0 r10, a.za60 r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n2x.E(a.kls0, a.za60, a.zje):java.lang.Object");
    }

    public static final boolean F(q0f0 q0f0Var) {
        q0f0Var.getClass();
        if ((q0f0Var instanceof f0f0) || (q0f0Var instanceof e0f0) || (q0f0Var instanceof gze0) || (q0f0Var instanceof a0f0) || (q0f0Var instanceof h0f0) || (q0f0Var instanceof b0f0) || (q0f0Var instanceof rze0) || (q0f0Var instanceof c0f0) || (q0f0Var instanceof uze0) || (q0f0Var instanceof k0f0) || (q0f0Var instanceof wze0) || (q0f0Var instanceof sze0)) {
            return true;
        }
        if (!(q0f0Var instanceof zze0) && !(q0f0Var instanceof yze0) && !(q0f0Var instanceof d0f0) && !Intrinsics.d(q0f0Var, ize0.c) && !Intrinsics.d(q0f0Var, vze0.c) && !(q0f0Var instanceof qze0) && !(q0f0Var instanceof kze0) && !(q0f0Var instanceof jze0) && !(q0f0Var instanceof m0f0) && !(q0f0Var instanceof l0f0) && !(q0f0Var instanceof mze0) && !(q0f0Var instanceof xze0) && !(q0f0Var instanceof o0f0) && !(q0f0Var instanceof i0f0) && !(q0f0Var instanceof j0f0) && !(q0f0Var instanceof hze0) && !(q0f0Var instanceof tze0) && !(q0f0Var instanceof oze0) && !(q0f0Var instanceof p0f0) && !(q0f0Var instanceof nze0) && !(q0f0Var instanceof g0f0) && !(q0f0Var instanceof lze0) && !(q0f0Var instanceof n0f0) && !(q0f0Var instanceof pze0)) {
            t9f.b();
        }
        return false;
    }

    public static final ArrayList G(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pxd0 pxd0Var = (pxd0) it.next();
            if (pxd0Var.b.length() == 0) {
                pxd0Var = new pxd0("", "", "", "", new qxd0(null, null, null, null, null));
            }
            arrayList.add(pxd0Var);
        }
        return arrayList;
    }

    public static byte[] H(char[] cArr, byte[] bArr, int i, boolean z) {
        try {
            return (z ? SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256") : SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")).generateSecret(new PBEKeySpec(cArr, bArr, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, i)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            afn0.j("PBKDF2", "pbkdf exception : " + e.getMessage());
            return new byte[0];
        }
    }

    public static Executor I(final Executor executor, final epq epqVar) {
        executor.getClass();
        return executor == ank.f1158a ? executor : new Executor() { // from class: a.cr40
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    epqVar.n(e);
                }
            }
        };
    }

    public static final u6n J(d280 d280Var, w6n w6nVar, fet fetVar) {
        d280Var.getClass();
        boolean zG = fetVar.g(d280Var) | fetVar.e(w6nVar.ordinal());
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new u6n(d4d.SECONDARY60, w6nVar, d280Var);
            fetVar.o0(objP);
        }
        return (u6n) objP;
    }

    public static final int K(t2m0 t2m0Var, Context context) {
        context.getClass();
        Integer numL = L(t2m0Var);
        if (numL == null) {
            TypedValue typedValue = j5d.f15927a;
            return j5d.a(context, R.attr.uikitBackgroundContent, false);
        }
        int iIntValue = numL.intValue();
        TypedValue typedValue2 = j5d.f15927a;
        return context.getColor(iIntValue);
    }

    public static final Integer L(t2m0 t2m0Var) {
        switch (t2m0Var.ordinal()) {
            case 0:
                return null;
            case 1:
                return Integer.valueOf(R.color.static_dark_blue_30);
            case 2:
                return Integer.valueOf(R.color.static_green_40);
            case 3:
                return Integer.valueOf(R.color.static_green_20);
            case 4:
                return Integer.valueOf(R.color.static_yellow_40);
            case 5:
                return Integer.valueOf(R.color.static_yellow_20);
            case 6:
                return Integer.valueOf(R.color.static_red_20);
            case 7:
                return Integer.valueOf(R.color.static_red_40);
            default:
                t9f.b();
                return null;
        }
    }

    public static final wkm M(ia70 ia70Var) {
        long secondary;
        boolean z = ia70Var.g;
        int i = z ? R.drawable.ic_glyph_demo_pause : R.drawable.ic_glyph_demo_play;
        boolean z2 = !ia70Var.e && ia70Var.d && ia70Var.f;
        if (z) {
            pz40 pz40Var = s6t0.f31722a;
            secondary = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getSecondary();
        }
        return new wkm(1, i, z2, ra50.f30118a, secondary);
    }

    public static final long N(long j) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    public static final bj00 O(ej00 ej00Var, long j) {
        ?? arrayList;
        List<vi00> list;
        aj00 xi00Var;
        Integer num;
        Boolean bool;
        boolean zBooleanValue = (ej00Var == null || (bool = ej00Var.f7884a) == null) ? false : bool.booleanValue();
        int iIntValue = (ej00Var == null || (num = ej00Var.b) == null) ? 0 : num.intValue();
        if (ej00Var == null || (list = ej00Var.c) == null) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (vi00 vi00Var : list) {
                Integer num2 = vi00Var.f37454a;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                if (iIntValue2 == 1) {
                    xi00Var = new xi00();
                } else if (iIntValue2 != 2) {
                    xi00Var = iIntValue2 != 3 ? new yi00(iIntValue2) : new wi00();
                } else {
                    xi00Var = new zi00();
                }
                String str = vi00Var.b;
                if (str == null) {
                    str = "";
                }
                Integer num3 = vi00Var.c;
                arrayList.add(new si00(xi00Var, str, num3 != null ? num3.intValue() : 0));
            }
        }
        return new bj00(iIntValue, j, arrayList, zBooleanValue);
    }

    public static final x5l0 P(d0t d0tVar, ctf0 ctf0Var, y78 y78Var, boolean z, boolean z2, String str, int i, boolean z3, boolean z4, v5l0 v5l0Var, String str2, v12 v12Var, boolean z5) {
        d0tVar.getClass();
        ctf0Var.getClass();
        return new x5l0(sre0.f32672a.b(x5l0.class).J() + BundleUtil.UNDERLINE_TAG + d0tVar.f5282a, wwb.V(d0tVar, ctf0Var, y78Var, z, z2, str, false, kotlin.collections.a.c(Integer.valueOf(i)), z3, z4, false, v5l0Var, d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a, str2, z5), v12Var, z5);
    }

    public static final long Q(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final String R(ugi0 ugi0Var) {
        return CollectionsKt.b0(l1e0.o(0, ugi0Var.d()), ", ", ugi0Var.h() + '(', Separators.RPAREN, new yr80(ugi0Var, (byte) 15), 24);
    }

    public static final fqm S(ws50 ws50Var, int i) {
        xyq0 xyq0Var = ws50Var.c;
        boolean z = xyq0Var.f41717a || xyq0Var.b || xyq0Var.c;
        int i2 = ws50Var.b;
        ArrayList arrayList = new ArrayList(i);
        for (int iC = 0; iC < i; iC = w6x.c(5000, iC, 1, arrayList)) {
        }
        return new fqm(i2, arrayList, z);
    }

    public static final void a(mm40 mm40Var, a4x a4xVar, hh80 hh80Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1855510698);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(hh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            k6z k6zVar = k6z.f17794a;
            lh80 lh80VarU = s5x0.u(hh80Var.b(k6zVar), 0.0f, hh80Var.c(k6zVar), 0.0f, 10);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40Var, 96.0f), "PROMO_STORE_CARDS_ROW");
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 24);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, xczVarA, lh80VarU, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, 196608, 456);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 3, i, (Object) mm40Var, (Object) a4xVar, (Object) hh80Var, (Object) function1);
        }
    }

    public static final long b(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final void c(int i, int i2, fet fetVar, Function0 function0) {
        function0.getClass();
        fetVar.g0(-715500021);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 36.0f), StaticColors.INSTANCE.m73getBlack400d7_KjU(), vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3));
            boolean z = (i3 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new a2z(function0, (byte) 0);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarE0 = o2e.e0(jr8.f16991a.b(jm40Var, gqw0.e), "ImageArrowTestTag");
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new dx2(i, (byte) 23);
                fetVar.o0(objP3);
            }
            j0x.b(a8k0.F(i, i4, fetVar), null, pai0.a(mm40VarE0, false, (Function1) objP3), null, null, 0.0f, null, fetVar, 56, 120);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sxf(i, function0, i2);
        }
    }

    public static final void d(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z) {
        fetVar.g0(-1536449414);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
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
            ugdVar.invoke(fetVar, 6);
            b34.e(y5d.f42040a, z, null, kzn.k(ro4.m0(300, 0, null, 6), null, 2).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(300, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(-1270881720, new uis(ugdVar2, b), fetVar), fetVar, 1600518 | (i2 & 112), 18);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(mm40Var, z, ugdVar, ugdVar2, i, (byte) 4);
        }
    }

    public static final void e(int i, fet fetVar) {
        int i2;
        fetVar.g0(-531937919);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 102.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i, (byte) 18);
        }
    }

    public static final void f(of90 of90Var, boolean z, mm40 mm40Var, xdr xdrVar, fet fetVar, int i, int i2) {
        xdr xdrVar2;
        of90Var.getClass();
        fetVar.g0(-951982481);
        int i3 = (fetVar.g(of90Var) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= fetVar.i(xdrVar) ? 2048 : 1024;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            xdr xdrVar3 = i4 != 0 ? null : xdrVar;
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar, 54);
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
            String strL = of90Var.e;
            if (!z) {
                strL = ttm0.L(3, strL);
            }
            xdr xdrVar4 = xdrVar3;
            zcm0.c(strL, gqw0.e, false, xdrVar4, fetVar, (i5 & 7168) | 432, 0);
            int i6 = (i5 << 3) & 57344;
            ycm0.f(ttm0.L(3, of90Var.f25154a), of90Var.c, of90Var.f, null, xdrVar4, fetVar, i6);
            mbc.o(zfi0.f44303a, o7k0.d(jm40.b, 1.0f), false, fetVar, 54, 4);
            xdrVar2 = xdrVar4;
            ycm0.f(ttm0.L(3, of90Var.b), of90Var.d, of90Var.g, null, xdrVar2, fetVar, i6);
            fetVar.r(true);
        } else {
            fetVar.X();
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cim(of90Var, z, mm40Var, xdrVar2, i, i2);
        }
    }

    public static final void g(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            ugdVar2 = null;
        }
        byte b = 1;
        boolean z = (((i & 896) ^ 384) > 256 && fetVar.g(ugdVar2)) || (i & 384) == 256;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new x4a0(ugdVar2, b);
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
        ugdVar.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
        if (ugdVar2 == null) {
            fetVar.e0(759571898);
            fetVar.r(false);
        } else {
            fetVar.e0(-252592345);
            twn.v((i >> 6) & 14, ugdVar2, fetVar, false);
        }
        fetVar.r(true);
    }

    public static final void h(mm40 mm40Var, a4x a4xVar, guc0 guc0Var, hh80 hh80Var, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        guc0Var.getClass();
        function1.getClass();
        fetVar2.g0(670794598);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.e(guc0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (!fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar2.X();
        } else if (guc0Var == guc0.f11922a) {
            fetVar2.e0(-840605217);
            a(mm40Var, a4xVar, hh80Var, function1, fetVar2, (i2 & 126) | ((i2 >> 3) & 896) | ((i2 >> 6) & 7168));
            fetVar2.r(false);
        } else {
            fetVar2.e0(-840410258);
            int i3 = i2 & 126;
            int i4 = i2 >> 3;
            p(mm40Var, a4xVar, hh80Var, z, function1, fetVar2, (i4 & 57344) | i3 | (i4 & 896) | (i4 & 7168));
            fetVar2 = fetVar2;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, (Object) a4xVar, (Object) guc0Var, (Object) hh80Var, z, (wdr) function1, i, (byte) 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(109884975);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        int i3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            float f = 16.0f;
            mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), fqj0Var));
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 16.0f, 0.0f, 10), 70.0f), 16.0f);
            zcl zclVar3 = qmk.f;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), fqj0Var));
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA2 = shg0.a(uc9.g, yx7Var, fetVar, 6);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(460274438);
            int iB = 0;
            while (iB < 10) {
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarN2 = o7k0.n(jm40Var, f);
                zcl zclVar5 = qmk.m;
                mm40 mm40VarE2 = h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarN2);
                float f2 = f;
                int i4 = i3;
                iB = h97.b(mm40VarE2, fqj0Var, fetVar, i4, iB, 1);
                i3 = i4;
                f = f2;
            }
            ohs0.x(fetVar, i3, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 18, i, fqj0Var);
        }
    }

    public static final void j(fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(-610187722);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), fqj0Var));
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 70.0f), 16.0f);
            zcl zclVar3 = qmk.f;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 19, i, fqj0Var);
        }
    }

    public static final void k(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-2048848452);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
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
            i(fqj0VarD0, fetVar, 0);
            fetVar2 = fetVar;
            mbc.o(agi0.f827a, null, false, fetVar2, 6, 6);
            fetVar2.e0(-226971469);
            for (int i2 = 0; i2 < 15; i2++) {
                j(fqj0VarD0, fetVar2, 0);
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ogj0(i, (byte) 12);
        }
    }

    public static final void l(mm40 mm40Var, h5a0 h5a0Var, w6n w6nVar, Function2 function2, fet fetVar, int i, int i2) {
        ugd ugdVarM;
        byte b = 23;
        if ((i2 & 8) != 0) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ogj0(b);
                fetVar.o0(objP);
            }
            function2 = (Function2) objP;
        }
        ugd ugdVarM2 = u1c.M(-1192622179, new kqh0(h5a0Var, w6nVar, (byte) 28), fetVar);
        if (h5a0Var instanceof y4a0) {
            fetVar.e0(-1252666231);
            ugdVarM = u1c.M(-1071353066, new fzi0(w6nVar, h5a0Var, function2, b), fetVar);
            fetVar.r(false);
        } else {
            if (!(h5a0Var instanceof c5a0)) {
                throw b1j.f(1206515178, fetVar, false);
            }
            fetVar.e0(-1252037769);
            fetVar.r(false);
            ugdVarM = null;
        }
        m2x.d(mm40Var, ugdVarM2, ugdVarM, fetVar, (i & 14) | 48, 0);
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-972160836);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(jm40.b, qmk.a(fetVar).e, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ijm();
                fetVar.o0(objP);
            }
            nkb.h(mm40VarN, (ijm) objP, kjm.f18392a, null, null, null, fetVar, 432, 56);
            btm0.k(null, zgc.d, fetVar, 384, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 11);
        }
    }

    public static final void n(mm40 mm40Var, pal0 pal0Var, Function2 function2, fet fetVar, int i, int i2) {
        mm40 mm40Var2 = (i2 & 1) != 0 ? jm40.b : mm40Var;
        Function2 function3 = (i2 & 4) != 0 ? null : function2;
        if (pal0Var instanceof oal0) {
            fetVar.e0(2055748500);
            k7x.u(mm40Var2, (oal0) pal0Var, function3, fetVar, i & 1022);
            fetVar.r(false);
        } else {
            if (pal0Var instanceof gal0) {
                fetVar.e0(2055754740);
                String str = ((gal0) pal0Var).f10973a;
                str.getClass();
                obc.d(eal0.c.a(new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109)), u1c.M(-403417493, new n040(mm40Var2, str), fetVar), fetVar, 56);
                fetVar.r(false);
                return;
            }
            if (!(pal0Var instanceof fal0)) {
                throw b1j.f(2055746678, fetVar, false);
            }
            fetVar.e0(2055758018);
            s0x.x(mm40Var2, (fal0) pal0Var, fetVar);
            fetVar.r(false);
        }
    }

    public static final void o(mm40 mm40Var, a4x a4xVar, String str, String str2, String str3, fet fetVar, int i) {
        fet fetVar2;
        byte b;
        a4xVar.getClass();
        fetVar.g0(1229412146);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str3) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            u23 u23Var = (u23) fetVar.k(bmd.s);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 12.0f, 0.0f, 2);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str3, mm40VarN, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, (i2 >> 12) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.e0(1423405927);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                v8q0.b((j83) it.next(), o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 48, 0, 262140);
                fetVar2 = fetVar;
                qxw.o(fetVar2, o7k0.e(jm40Var, 4.0f));
            }
            fetVar2.r(false);
            if (str == null || str2 == null) {
                fetVar2.e0(1176949434);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1176175829);
                fetVar2.e0(1423415411);
                h83 h83Var = new h83();
                int iG = h83Var.g(new smk0(0L, 0L, psq.f, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65531));
                try {
                    h83Var.c(str2);
                    h83Var.c(": ");
                    h83Var.d(iG);
                    pz40 pz40Var2 = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    long jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m81getDarkBlue0d7_KjU();
                    boolean zI = fetVar2.i(h83Var) | fetVar2.i(u23Var);
                    Object objP = fetVar2.P();
                    if (zI || objP == ukd.f35823a) {
                        b = 0;
                        objP = new svl0(h83Var, u23Var, b);
                        fetVar2.o0(objP);
                    } else {
                        b = 0;
                    }
                    Function1 function1 = (Function1) objP;
                    SpannableString spannableString = new SpannableString(str);
                    Linkify.addLinks(spannableString, 1);
                    Object[] spans = spannableString.getSpans(b, spannableString.length(), URLSpan.class);
                    spans.getClass();
                    Iterator it2 = tx3.Y(spans, new wvl0(spannableString, (byte) 1)).iterator();
                    int spanEnd = 0;
                    while (it2.hasNext()) {
                        URLSpan uRLSpan = (URLSpan) it2.next();
                        qrq qrqVar = j1t0.c;
                        SpannableString spannableString2 = spannableString;
                        int i3 = spanEnd;
                        Iterator it3 = it2;
                        int iG2 = h83Var.g(new smk0(textPrimary, 0L, null, null, null, qrqVar, null, 0L, null, null, null, 0L, null, null, null, 65502));
                        try {
                            h83Var.c(spannableString2.subSequence(i3, spannableString2.getSpanStart(uRLSpan)).toString());
                            h83Var.d(iG2);
                            String url = uRLSpan.getURL();
                            url.getClass();
                            jb00 jb00Var = new jb00(url, new f9q0(new smk0(jM81getDarkBlue0d7_KjU, 0L, null, null, null, qrqVar, null, 0L, null, null, null, 0L, k5q0.c, null, null, 61406), null, null, null), new sa4(function1, (byte) 4));
                            String string = spannableString2.subSequence(spannableString2.getSpanStart(uRLSpan), spannableString2.getSpanEnd(uRLSpan)).toString();
                            int iE = h83Var.e(jb00Var);
                            try {
                                h83Var.c(string);
                                h83Var.d(iE);
                                spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                spannableString = spannableString2;
                                it2 = it3;
                            } catch (Throwable th) {
                                h83Var.d(iE);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            h83Var.d(iG2);
                            throw th2;
                        }
                    }
                    SpannableString spannableString3 = spannableString;
                    int i4 = spanEnd;
                    if (i4 < spannableString3.length()) {
                        int iG3 = h83Var.g(new smk0(textPrimary, 0L, null, null, null, j1t0.c, null, 0L, null, null, null, 0L, null, null, null, 65502));
                        try {
                            h83Var.c(spannableString3.subSequence(i4, spannableString3.length()).toString());
                            h83Var.d(iG3);
                        } catch (Throwable th3) {
                            h83Var.d(iG3);
                            throw th3;
                        }
                    }
                    j83 j83VarH = h83Var.h();
                    fetVar2.r(false);
                    y9q0 y9q0Var2 = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                    pz40 pz40Var3 = s6t0.f31722a;
                    fet fetVar3 = fetVar2;
                    v8q0.b(j83VarH, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y9q0Var2, fetVar3, 0, 0, 262138);
                    fetVar2 = fetVar3;
                    fetVar2.r(false);
                } catch (Throwable th4) {
                    h83Var.d(iG);
                    throw th4;
                }
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvl0((Object) mm40Var, (Object) a4xVar, (Object) str, (Object) str2, (Object) str3, i, (byte) 0);
        }
    }

    public static final void p(mm40 mm40Var, a4x a4xVar, hh80 hh80Var, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(164878240);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(hh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            nnw0.g(o7k0.d(mm40Var, 1.0f), null, false, u1c.M(342640246, new odv(hh80Var, z, (Object) a4xVar, (Object) function1, (byte) 6), fetVar), fetVar, 3072, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var, (Object) a4xVar, (Object) hh80Var, z, (wdr) function1, i, (byte) 1);
        }
    }

    public static final void q(mm40 mm40Var, a4x a4xVar, int i, float f, Function1 function1, fet fetVar, int i2) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(-174331523);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.d(f) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            fetVar.e0(972319571);
            for (List list : CollectionsKt.K(a4xVar, i)) {
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                boolean z2 = false;
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                Iterator itV = kng0.v(fetVar, mm40VarC1, shdVar, -343582914, list);
                while (itV.hasNext()) {
                    nnw0.t(o7k0.s(jm40Var, f), (cuc0) itV.next(), guc0.b, function1, fetVar, ((i3 >> 3) & 7168) | 384, 0);
                    jm40Var = jm40Var;
                    pcyVar = pcyVar;
                    z2 = z2;
                    shdVar = shdVar;
                }
                fetVar.r(z2);
                fetVar.r(true);
                shdVar = shdVar;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new duc0(mm40Var, a4xVar, i, f, function1, i2, (byte) 1);
        }
    }

    public static final void r(mm40 mm40Var, a4x a4xVar, int i, float f, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1531422099);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.d(f) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            ngv ngvVar = new ngv(i);
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b));
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ny2((Object) a4xVar, f, (Object) function1, (byte) 10);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar, mm40Var, null, null, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, (i3 << 3) & 112, 924);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new duc0(mm40Var, a4xVar, i, f, function1, i2, (byte) 0);
        }
    }

    public static final void s(lc00 lc00Var, oxd0 oxd0Var, o4i0 o4i0Var, ctf0 ctf0Var, List list) {
        Object obj;
        Object next;
        oxd0Var.getClass();
        ctf0Var.getClass();
        list.getClass();
        boolean zA0 = x2x.a0(oxd0Var);
        String str = oxd0Var.d;
        String str2 = oxd0Var.f26007a;
        if (zA0) {
            return;
        }
        ArrayList arrayListG = G(oxd0Var.c);
        ArrayList arrayListG2 = G(oxd0Var.f);
        String strY = y(o4i0Var.f24637a, arrayListG);
        String strY2 = y(o4i0Var.b, arrayListG2);
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayListG, arrayListG2);
        if (strY.length() == 0 || strY2.length() == 0) {
            return;
        }
        lc00Var.add(new psv("PLAYERS_COMPOSITION_HEADER", R.string.composition));
        String strK = oxd0Var.b;
        if (strK.length() == 0) {
            strK = zsm0.k(str2, list, iun.f15405a);
        }
        gfa0 gfa0Var = new gfa0(str2, vsm0.t(strK), "");
        String strK2 = oxd0Var.e;
        if (strK2.length() == 0) {
            strK2 = zsm0.k(str, list, iun.f15405a);
        }
        gfa0 gfa0Var2 = new gfa0(str, vsm0.t(strK2), "");
        i4 i4VarM = m2x.m(strY, arrayListG);
        i4 i4VarM2 = m2x.m(strY2, arrayListG2);
        Iterator it = arrayListQ0.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((pxd0) next).f27749a.equals(strY));
        pxd0 pxd0Var = (pxd0) next;
        if (pxd0Var == null) {
            pxd0Var = new pxd0("", "", "", "", new qxd0(null, null, null, null, null));
        }
        for (Object obj2 : arrayListQ0) {
            if (((pxd0) obj2).f27749a.equals(strY2)) {
                obj = obj2;
                break;
            }
        }
        pxd0 pxd0Var2 = (pxd0) obj;
        if (pxd0Var2 == null) {
            pxd0Var2 = new pxd0("", "", "", "", new qxd0(null, null, null, null, null));
        }
        dfa0 dfa0VarJ = z1x.J(pxd0Var, pxd0Var2);
        dfa0 dfa0VarJ2 = z1x.J(pxd0Var2, pxd0Var);
        lsm0 lsm0Var = ctf0Var.b;
        lc00Var.add(new ifa0("PLAYERS_COMPOSITION", gfa0Var, gfa0Var2, i4VarM, i4VarM2, new efa0(dfa0VarJ, dfa0VarJ2, dyb.g0(uvw.u(lsm0Var.a(R.string.rainbow_six_EPS, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.valorant_kills, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.valorant_deaths, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.rainbow_six_kost, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.cs2_maps, Arrays.copyOf(new Object[0], 0)))), lsm0Var.a(R.string.statistic, Arrays.copyOf(new Object[0], 0)))));
    }

    public static final void t(List list, Object obj, kls0 kls0Var, kls0 kls0Var2, int i, int i2) {
        list.getClass();
        int[] iArrK0 = kls0Var != null ? kls0Var.f18507a : null;
        int[] iArr = kls0Var2 != null ? kls0Var2.f18507a : null;
        if (iArrK0 != null && iArr != null) {
            int length = iArrK0.length;
            int length2 = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArrK0, length + length2);
            System.arraycopy(iArr, 0, iArrCopyOf, length, length2);
            LinkedHashSet linkedHashSet = new LinkedHashSet(wp20.a(iArrCopyOf.length));
            for (int i3 : iArrCopyOf) {
                linkedHashSet.add(Integer.valueOf(i3));
            }
            iArrK0 = CollectionsKt.K0(CollectionsKt.z0(CollectionsKt.L0(linkedHashSet)));
        } else if (iArrK0 == null && iArr != null) {
            iArrK0 = iArr;
        } else if (iArrK0 == null || iArr != null) {
            jf4.o("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
            return;
        }
        if (obj == null) {
            return;
        }
        list.add(new kls0(iArrK0, kotlin.collections.a.c(obj), i, kotlin.collections.a.c(Integer.valueOf(i2))));
    }

    public static wul u(sul sulVar, String str) {
        return new wul(sulVar, oe9.f25112a, new ue9(str), true, false, false);
    }

    public static final v2 v(sgy sgyVar) {
        sgyVar.getClass();
        List<miy> listO = y9a.O(sgyVar);
        ArrayList arrayList = new ArrayList(r3d.q(listO, 10));
        for (miy miyVar : listO) {
            arrayList.add(new KTypeProjection(x2x.N(miyVar, null, 7), uiy.f35755a));
        }
        return x2x.P(sgyVar, arrayList, false, null, 14);
    }

    public static final SharedPreferences w(us00 us00Var, String str) {
        str.getClass();
        try {
            y78 y78Var = new y78((byte) 8, false);
            us00Var.getApplicationContext();
            if (hne.E(1) != 0) {
                throw new IllegalArgumentException("Unsupported scheme: AES256_GCM");
            }
            if (((KeyGenParameterSpec) y78Var.c) != null) {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
            y78Var.b = 1;
            return uwn.a(us00Var, str, xvw.v(y78Var));
        } catch (Exception unused) {
            SharedPreferences sharedPreferences = us00Var.getSharedPreferences(str, 0);
            sharedPreferences.getClass();
            return sharedPreferences;
        }
    }

    public static final void x(qpg0 qpg0Var, String str) {
        qpg0Var.getClass();
        str.getClass();
        xpg0 xpg0VarZ0 = qpg0Var.Z0(str);
        try {
            xpg0VarZ0.W0();
            ay3.L(xpg0VarZ0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public static final String y(String str, ArrayList arrayList) {
        Object next;
        Object next2;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((pxd0) next).f27749a.equals(str));
        pxd0 pxd0Var = (pxd0) next;
        String str2 = pxd0Var != null ? pxd0Var.f27749a : null;
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (Intrinsics.d((pxd0) next2, new pxd0("", "", "", "", new qxd0(null, null, null, null, null))));
        pxd0 pxd0Var2 = (pxd0) next2;
        String str3 = pxd0Var2 != null ? pxd0Var2.f27749a : null;
        if (str3 == null) {
            str3 = "";
        }
        return sj3.j0(str2, str3);
    }

    public static final ArrayList z(xgy xgyVar) {
        Collection collectionS = xgyVar.s();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionS) {
            if (obj instanceof jhy) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
