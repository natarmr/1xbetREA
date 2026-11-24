package a;

import android.R;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.javax.sip.message.Response;
import android.os.Build;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cfx0 {
    public static final ugd j;
    public static final ugd l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4286a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final ugd g = new ugd(-969773622, false, new i5b(7));
    public static final ugd h = new ugd(-615230995, false, new bhd(12));
    public static final ugd i = new ugd(-465065466, false, new bhd(13));
    public static final ugd k = new ugd(-1167207170, false, new ehd(21));
    public static final ugd m = new ugd(-870569496, false, new qhd(27));
    public static final ugd n = new ugd(935079697, false, new qhd(28));
    public static final bjk o = new bjk(null, false, false, false);
    public static final meo0 p = new meo0((byte) 9);

    static {
        byte b2 = 14;
        j = new ugd(-1437302743, false, new bhd(b2));
        l = new ugd(-1419998793, false, new mhd(b2));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17891. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static void A(a.l4e r39, a.p900 r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cfx0.A(a.l4e, a.p900, java.util.ArrayList, int):void");
    }

    public static final mm40 B(mm40 mm40Var, d39 d39Var) {
        return mm40Var.e(new b39(d39Var));
    }

    public static final long C(zae0 zae0Var, qg9 qg9Var, int i2, long j2) {
        long j3;
        qg9 qg9Var2;
        qg9Var.getClass();
        int i3 = i2;
        long j4 = i3;
        cy2.x(qg9Var.e(), 0L, j4);
        boolean z = zae0Var.c;
        f99 f99Var = zae0Var.b;
        if (z) {
            jf4.n("closed");
            return 0L;
        }
        long j5 = 0;
        qg9 qg9Var3 = qg9Var;
        while (true) {
            long jA = b.a(f99Var, qg9Var3, j5, j2, i3);
            long j6 = j5;
            long j7 = -1;
            if (jA != -1) {
                return jA;
            }
            long j8 = f99Var.b;
            long j9 = (j8 - j4) + 1;
            if (j9 < j2) {
                if (j8 < j2) {
                    j3 = -1;
                    qg9Var2 = qg9Var;
                } else {
                    int iMax = (int) Math.max(1L, (j8 - j2) + 1);
                    int iMin = ((int) Math.min(j4, (f99Var.b - j6) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            j3 = j7;
                            qg9Var2 = qg9Var;
                            if (f99Var.F(iMin, f99Var.b - ((long) iMin), qg9Var2)) {
                                break;
                            }
                            if (iMin == iMax) {
                                return j3;
                            }
                            iMin--;
                            j7 = j3;
                        }
                    }
                }
                if (zae0Var.f44063a.Y(f99Var, 8192L) == j3) {
                    return j3;
                }
                long jMax = Math.max(j6, j9);
                qg9Var3 = qg9Var2;
                j5 = jMax;
                i3 = i2;
            }
            return -1L;
        }
    }

    public static vx9 D(vx9... vx9VarArr) {
        List listAsList = Arrays.asList(vx9VarArr);
        if (listAsList.isEmpty()) {
            return new xx9();
        }
        return listAsList.size() == 1 ? (vx9) listAsList.get(0) : new wx9(listAsList);
    }

    public static Bitmap E(byte[] bArr, int i2, int i3) throws IOException {
        BitmapFactory.Options options;
        int i4 = 0;
        if (i3 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i2, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i3; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw kq80.a("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            sko skoVar = new sko(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (skoVar.d(1, "Orientation")) {
                case 3:
                case 4:
                    i4 = 180;
                    break;
                case 5:
                case 8:
                    i4 = SubsamplingScaleImageView.ORIENTATION_270;
                    break;
                case 6:
                case 7:
                    i4 = 90;
                    break;
            }
            if (i4 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i4);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static byte[] F(String str, String str2, String str3, byte[] bArr, int i2, boolean z) {
        if (i2 < 16) {
            afn0.j("BaseKeyUtil", "exportLen length must be more than 128bit.");
            return new byte[0];
        }
        if (str == null || str.length() < i2) {
            afn0.j("BaseKeyUtil", "material(first) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        if (str2 == null || str2.length() < i2) {
            afn0.j("BaseKeyUtil", "material(second) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        if (str3 == null || str3.length() < i2) {
            afn0.j("BaseKeyUtil", "material(third) length must be Greater than or equal to export length.");
            return new byte[0];
        }
        byte[] bArrR = obc.R(str);
        byte[] bArrR2 = obc.R(str2);
        byte[] bArrR3 = obc.R(str3);
        int length = bArrR.length;
        int length2 = bArrR2.length;
        int length3 = bArrR3.length;
        if (length2 < length) {
            length = length2;
        }
        if (length3 >= length) {
            length3 = length;
        }
        if (!(bArr.length >= 16) || !(length3 >= 16)) {
            jf4.o("key length must be more than 128bit.");
            return null;
        }
        char[] cArr = new char[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            cArr[i3] = (char) ((bArrR[i3] ^ bArrR2[i3]) ^ bArrR3[i3]);
        }
        if (!z) {
            afn0.k("BaseKeyUtil", "exportRootKey: sha1");
            return n2x.H(cArr, bArr, i2 * 8, false);
        }
        afn0.k("BaseKeyUtil", "exportRootKey: sha256");
        if (Build.VERSION.SDK_INT >= 26) {
            return n2x.H(cArr, bArr, i2 * 8, true);
        }
        afn0.j("BaseKeyUtil", "system version not high than 26");
        return new byte[0];
    }

    public static final i3w G(vw4 vw4Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        lsm0 lsm0Var = ctf0Var.b;
        return new i3w(lsm0Var.a(org.xbet.client1.R.string.feeds_sport_events_count_new, Arrays.copyOf(new Object[0], 0)), String.valueOf(vw4Var.s), lsm0Var.a(org.xbet.client1.R.string.finished_bets, Arrays.copyOf(new Object[]{Integer.valueOf(vw4Var.t), Integer.valueOf(vw4Var.r)}, 2)));
    }

    public static final f3w H(vw4 vw4Var, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(org.xbet.client1.R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(vw4Var.f, p3u0.c), str, e3w.f7156a);
    }

    public static final l3w I(vw4 vw4Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        iy4 iy4Var = vw4Var.g;
        String str = vw4Var.D;
        if (iy4Var != iy4.c || str.length() <= 0) {
            return null;
        }
        return new l3w(kotlin.text.c.r(ctf0Var.b.a(org.xbet.client1.R.string.cancellation_reason, Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false), str, i8x.f14362a);
    }

    public static final g3w J(vw4 vw4Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        return new g3w(ctf0Var.b.a(org.xbet.client1.R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0)), kng0.k("\u200e", vw4Var.i));
    }

    public static final m3w K(vw4 vw4Var, ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        if (!z) {
            return null;
        }
        iy4 iy4Var = vw4Var.g;
        boolean z2 = vw4Var.B;
        iy4 iy4Var2 = iy4.b;
        if (iy4Var == iy4Var2 && z2) {
            lsm0 lsm0Var = ctf0Var.b;
            String strA = lsm0Var.a(org.xbet.client1.R.string.when_score_change, Arrays.copyOf(new Object[0], 0));
            String strA2 = lsm0Var.a(org.xbet.client1.R.string.drop_on, Arrays.copyOf(new Object[0], 0));
            pz40 pz40Var = s6t0.f31722a;
            return new m3w(strA, strA2, s6t0.b().f33626a.getTextPrimary());
        }
        if (iy4Var != iy4Var2 || z2) {
            return null;
        }
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA3 = lsm0Var2.a(org.xbet.client1.R.string.when_score_change, Arrays.copyOf(new Object[0], 0));
        String strA4 = lsm0Var2.a(org.xbet.client1.R.string.not_drop_on, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var2 = s6t0.f31722a;
        return new m3w(strA3, strA4, s6t0.b().f33626a.getTextPrimary());
    }

    public static final String L(vw4 vw4Var, boolean z, boolean z2, ueo ueoVar, String str, boolean z3, boolean z4) {
        List list = vw4Var.T;
        int i2 = list.size() == 1 ? ueoVar != null ? ueoVar.c : 0 : -1;
        return kotlin.text.c.r(list.size() == 1 ? ckb.S((z0w) CollectionsKt.U(list), ueoVar, str, z2, z3, z4) : "", " \n", (!z || i2 == -1) ? ". " : ua80.e(i2, ". [Р :", "]: "), false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    public static final m3w M(vw4 vw4Var, ctf0 ctf0Var) {
        int i2;
        long jM113getRed0d7_KjU;
        ctf0Var.getClass();
        iy4 iy4Var = vw4Var.g;
        int iOrdinal = iy4Var.ordinal();
        if (iOrdinal == 0) {
            i2 = org.xbet.client1.R.string.error;
        } else if (iOrdinal == 1) {
            i2 = org.xbet.client1.R.string.autobet_waiting;
        } else if (iOrdinal == 2) {
            i2 = org.xbet.client1.R.string.autobet_dropped;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            i2 = org.xbet.client1.R.string.accepted;
        }
        int iOrdinal2 = iy4Var.ordinal();
        if (iOrdinal2 == 0) {
            pz40 pz40Var = s6t0.f31722a;
            jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else if (iOrdinal2 == 1) {
            pz40 pz40Var2 = s6t0.f31722a;
            jM113getRed0d7_KjU = s6t0.b().f33626a.getSecondary();
        } else if (iOrdinal2 == 2) {
            pz40 pz40Var3 = s6t0.f31722a;
            jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else {
            if (iOrdinal2 != 3) {
                t9f.b();
                return null;
            }
            pz40 pz40Var4 = s6t0.f31722a;
            jM113getRed0d7_KjU = s6t0.b().f33626a.getPrimary();
        }
        lsm0 lsm0Var = ctf0Var.b;
        return new m3w(lsm0Var.a(org.xbet.client1.R.string.promo_code_status_text, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(i2, Arrays.copyOf(new Object[0], 0)), jM113getRed0d7_KjU);
    }

    public static final a4x N(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z1w z1wVar = (z1w) it.next();
            arrayList.add(new iem(z1wVar.b, z1wVar.c));
        }
        return dyb.o0(arrayList);
    }

    public static final tm3 O(wrd wrdVar) {
        qm3 qm3Var;
        sm3 sm3Var;
        rm3 rm3Var;
        wrdVar.getClass();
        boolean zD = Intrinsics.d(wrdVar.d5.t, Boolean.TRUE);
        String str = wrdVar.g5.w;
        sm3[] sm3VarArrValues = sm3.values();
        int length = sm3VarArrValues.length;
        int i2 = 0;
        while (true) {
            qm3Var = null;
            if (i2 >= length) {
                sm3Var = null;
                break;
            }
            sm3Var = sm3VarArrValues[i2];
            if (sm3Var.f32426a.equals(str)) {
                break;
            }
            i2++;
        }
        if (sm3Var == null) {
            sm3Var = sm3.FLOATING_BUTTONS;
        }
        String str2 = wrdVar.e5.u;
        rm3[] rm3VarArrValues = rm3.values();
        int length2 = rm3VarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                rm3Var = null;
                break;
            }
            rm3Var = rm3VarArrValues[i3];
            if (rm3Var.f30727a.equals(str2)) {
                break;
            }
            i3++;
        }
        if (rm3Var == null) {
            rm3Var = rm3.THICK_LINE;
        }
        String str3 = wrdVar.f5.v;
        for (qm3 qm3Var2 : qm3.values()) {
            if (qm3Var2.f28963a.equals(str3)) {
                qm3Var = qm3Var2;
                break;
            }
        }
        if (qm3Var == null) {
            qm3Var = qm3.IMAGE;
        }
        return new tm3(zD, sm3Var, rm3Var, qm3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final h07 P(dv20 dv20Var, boolean z, long j2, String str, long j3) {
        ?? arrayList;
        dv20Var.getClass();
        str.getClass();
        List<List> list = dv20Var.b;
        Long l2 = dv20Var.f6724a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (List list2 : list) {
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                int i2 = 0;
                for (Object obj : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    arrayList2.add(tke.f0((cv20) obj, i2, z, j2, l2 != null ? l2.longValue() : 0L));
                    i2 = i3;
                }
                arrayList.add(arrayList2);
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new h07(arrayList, l2 != null ? l2.longValue() : 0L, Intrinsics.d(dv20Var.c, Boolean.TRUE), str, z, j2, j3);
    }

    public static final void a(mm40 mm40Var, fyq0 fyq0Var, Function1 function1, fet fetVar, int i2) {
        fyq0Var.getClass();
        function1.getClass();
        fetVar.g0(369177035);
        byte b2 = 2;
        byte b3 = 4;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(fyq0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jml jmlVar = fyq0Var.b;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new h61(function1, b2);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new h61(function1, (byte) 3);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            boolean z3 = i4 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ag0(function1, b3);
                fetVar.o0(objP3);
            }
            gkb.h(mm40Var, jmlVar, function2, function3, (Function2) objP3, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, fyq0Var, function1, i2, (byte) 19);
        }
    }

    public static final void b(mm40 mm40Var, mtl mtlVar, Function1 function1, fet fetVar, int i2) {
        mtl mtlVar2;
        mm40 mm40Var2;
        mtlVar.getClass();
        fetVar.g0(-175864511);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            mtlVar2 = mtlVar;
            i3 |= fetVar.g(mtlVar2) ? 32 : 16;
        } else {
            mtlVar2 = mtlVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i4 = zcm0.i(fetVar).c.e().d - zcm0.i(fetVar).e.e().d;
            if (i4 < 0) {
                i4 = 0;
            }
            float fR0 = w6kVar.r0(i4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 56.0f, 7);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new h61(function1, (byte) 29);
                fetVar.o0(objP);
            }
            int i5 = i3 & 112;
            mm40Var2 = jm40Var;
            bkb.f(null, mtlVar2, null, false, null, (Function1) objP, fetVar, i5, 29);
            zq8.a(0, fetVar, i120.Q(o7k0.d(o7k0.e(mm40Var2, l7x.O(12.0f, 0.0f, l1e0.c((fR0 - 100.0f) / 100.0f, 0.0f, 1.0f))), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vb2(mm40Var2, mtlVar, function1, i2, (byte) 0);
        }
    }

    public static final void c(int i2, int i3, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(1063986109);
        int i4 = i3 | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            pm80 pm80VarF = a8k0.F(i2, (i4 >> 6) & 14, fetVar);
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.b(str, null, h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, ((i4 >> 3) & 14) | 36912, 6, 31712);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str, i2, i3, (byte) 18);
        }
    }

    public static final void d(mm40 mm40Var, final a1m0 a1m0Var, final xcz xczVar, boolean z, long j2, long j3, Function0 function0, ydr ydrVar, Function1 function1, Function1 function2, Function1 function3, xdr xdrVar, fet fetVar, final int i2) {
        final mm40 mm40Var2;
        final boolean z2;
        final long j4;
        final long j5;
        final Function0 function4;
        final ydr ydrVar2;
        final Function1 function5;
        final Function1 function6;
        final Function1 function7;
        final xdr xdrVar2;
        long secondary60;
        long secondary61;
        ydr ydrVar3;
        int i3;
        Object obj;
        Function1 function8;
        int i4;
        mm40 mm40Var3;
        xdr xdrVar3;
        Function1 function9;
        Function1 function10;
        Function0 function11;
        boolean z3;
        tr8 tr8Var;
        boolean z4;
        xczVar.getClass();
        fetVar.g0(-276172830);
        int i5 = i2 | 6 | (fetVar.i(a1m0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 2048 : 1024) | 843276288;
        if (fetVar.U(i5 & 1, (306783379 & i5) != 306783378)) {
            fetVar.Z();
            int i6 = i2 & 1;
            jm40 jm40Var = jm40.b;
            Object obj2 = ukd.f35823a;
            byte b2 = 6;
            if (i6 == 0 || fetVar.B()) {
                androidx.compose.runtime.d dVar = zaq0.b;
                secondary60 = ((ThemeColors) fetVar.k(dVar)).getSecondary60();
                secondary61 = ((ThemeColors) fetVar.k(dVar)).getSecondary60();
                int i7 = i5 & (-264241153);
                Object objP = fetVar.P();
                Object obj3 = objP;
                if (objP == obj2) {
                    Object ej8Var = new ej8((byte) 2);
                    fetVar.o0(ej8Var);
                    obj3 = ej8Var;
                }
                Function0 function12 = (Function0) obj3;
                Object objP2 = fetVar.P();
                Object obj4 = objP2;
                if (objP2 == obj2) {
                    Object wgdVar = new wgd((byte) 14);
                    fetVar.o0(wgdVar);
                    obj4 = wgdVar;
                }
                ydrVar3 = (ydr) obj4;
                Object objP3 = fetVar.P();
                if (objP3 == obj2) {
                    i3 = 0;
                    Object cp8Var = new cp8((byte) 4);
                    fetVar.o0(cp8Var);
                    obj = cp8Var;
                } else {
                    i3 = 0;
                    obj = objP3;
                }
                function8 = (Function1) obj;
                Object objP4 = fetVar.P();
                Object obj5 = objP4;
                if (objP4 == obj2) {
                    Object cp8Var2 = new cp8((byte) 5);
                    fetVar.o0(cp8Var2);
                    obj5 = cp8Var2;
                }
                Function1 function13 = (Function1) obj5;
                Object objP5 = fetVar.P();
                Object obj6 = objP5;
                if (objP5 == obj2) {
                    Object cp8Var3 = new cp8(b2);
                    fetVar.o0(cp8Var3);
                    obj6 = cp8Var3;
                }
                i4 = i7;
                mm40Var3 = jm40Var;
                xdrVar3 = jd8.b;
                function9 = (Function1) obj6;
                function10 = function13;
                function11 = function12;
                z3 = true;
            } else {
                fetVar.X();
                z3 = z;
                secondary60 = j2;
                secondary61 = j3;
                function11 = function0;
                ydrVar3 = ydrVar;
                function8 = function1;
                function10 = function2;
                xdrVar3 = xdrVar;
                i4 = i5 & (-264241153);
                i3 = 0;
                mm40Var3 = mm40Var;
                function9 = function3;
            }
            fetVar.s();
            boolean z5 = z3;
            tr8 tr8Var2 = new tr8();
            long j6 = secondary60;
            Context context = (Context) fetVar.k(dy2.b);
            Object objP6 = fetVar.P();
            Object obj7 = objP6;
            if (objP6 == obj2) {
                Object et8Var = new et8();
                fetVar.o0(et8Var);
                obj7 = et8Var;
            }
            et8 et8Var2 = (et8) obj7;
            Object objP7 = fetVar.P();
            if (objP7 == obj2) {
                int i8 = context.getResources().getDisplayMetrics().widthPixels;
                int i9 = context.getResources().getDisplayMetrics().heightPixels;
                boolean z6 = context.getResources().getBoolean(org.xbet.client1.R.bool.isTablet);
                tr8Var = tr8Var2;
                Object es8Var = new es8(new zr8(et8Var2, new bs8(context, y0x0.L(tr8Var2.f34412a, i8, z6)), i8, i9, z6, context.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.space_8), context.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.space_24), context.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.size_64), y0x0.L(new vr8(0.032f, 0.016f), i8, z6), context.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.space_16), context.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.space_12), context.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.space_24), tr8Var2), et8Var2);
                fetVar.o0(es8Var);
                objP7 = es8Var;
            } else {
                tr8Var = tr8Var2;
            }
            es8 es8Var2 = (es8) objP7;
            es8Var2.getClass();
            zr8 zr8Var = es8Var2.f8317a;
            if (!zr8Var.n.equals(tr8Var)) {
                zr8Var.n = tr8Var;
                vs8 vs8Var = zr8Var.i;
                if (vs8Var != null) {
                    zr8Var.l(vs8Var.f37937a);
                }
            }
            Object objP8 = fetVar.P();
            Object obj8 = objP8;
            if (objP8 == obj2) {
                Object objI = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objI);
                obj8 = objI;
            }
            Object obj9 = (vne) obj8;
            Integer numValueOf = Integer.valueOf(i3);
            int i10 = (fetVar.g(es8Var2) ? 1 : 0) | (((i4 & 112) == 32 || fetVar.i(a1m0Var)) ? 1 : i3);
            Object objP9 = fetVar.P();
            Object obj10 = objP9;
            if (i10 != 0 || objP9 == obj2) {
                Object yp6Var = new yp6(es8Var2, a1m0Var, null, (byte) 17);
                fetVar.o0(yp6Var);
                obj10 = yp6Var;
            }
            m0x0.u(a1m0Var, tju0.f34068a, numValueOf, (Function2) obj10, fetVar);
            zr8Var.k = function11;
            Object objP10 = fetVar.P();
            Object obj11 = objP10;
            if (objP10 == obj2) {
                Object rs8Var = new rs8(ydrVar3, function8, function10, function9);
                fetVar.o0(rs8Var);
                obj11 = rs8Var;
            }
            zr8Var.l = (rs8) obj11;
            x(es8Var2, xczVar, fetVar, ((i4 >> 6) & 112) | 384);
            mm40 mm40Var4 = mm40Var3;
            mm40 mm40VarD = o7k0.d(mm40Var4, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, i3);
            Function0 function14 = function11;
            ydr ydrVar4 = ydrVar3;
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (z5) {
                fetVar.e0(624094889);
                List list = a1m0Var.f77a;
                int i11 = zr8Var.L;
                boolean zI = fetVar.i(obj9) | fetVar.g(es8Var2);
                Object objP11 = fetVar.P();
                Object obj12 = objP11;
                if (zI || objP11 == obj2) {
                    Object op7Var = new op7(obj9, es8Var2, (byte) 13);
                    fetVar.o0(op7Var);
                    obj12 = op7Var;
                }
                aad.g(null, list, i11, (Function1) obj12, fetVar, 0);
                z4 = false;
                fetVar.r(false);
            } else {
                z4 = false;
                fetVar.e0(624618634);
                fetVar.r(false);
            }
            fetVar.e0(624835882);
            fetVar.r(z4);
            long j7 = secondary61;
            xdr xdrVar4 = xdrVar3;
            s5x0.h(o7k0.d(jm40Var, 1.0f).e(jm40Var), es8Var2, false, j6, 0.0f, j7, xdrVar4, fetVar, 14155776);
            fetVar.r(true);
            function7 = function9;
            mm40Var2 = mm40Var4;
            ydrVar2 = ydrVar4;
            function4 = function14;
            xdrVar2 = xdrVar4;
            function5 = function8;
            function6 = function10;
            j5 = j7;
            j4 = j6;
            z2 = z5;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            z2 = z;
            j4 = j2;
            j5 = j3;
            function4 = function0;
            ydrVar2 = ydrVar;
            function5 = function1;
            function6 = function2;
            function7 = function3;
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(a1m0Var, xczVar, z2, j4, j5, function4, ydrVar2, function5, function6, function7, xdrVar2, i2) { // from class: a.ps8
                public final /* synthetic */ a1m0 b;
                public final /* synthetic */ xcz c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ ydr h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ xdr l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj13, Object obj14) {
                    ((Integer) obj14).getClass();
                    int iL = x8x.L(1573313);
                    cfx0.d(this.f27503a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (fet) obj13, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(mm40 mm40Var, aka akaVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2;
        akaVar.getClass();
        function2.getClass();
        fetVar.g0(1253797173);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(akaVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(akaVar.f1012a.b, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean z = ((mmo) pz40VarF.getValue()).c;
            mm40 mm40VarR = jm40.b;
            if (z) {
                mm40VarR = knm0.r(mm40VarR);
            }
            fetVar2 = fetVar;
            ny9.e(mm40VarN.e(mm40VarR), null, u1c.M(1164668136, new n82(akaVar, function1, function2, (byte) 8), fetVar), u1c.M(596695913, new awh(akaVar, (byte) 11), fetVar), fetVar2, 27648, 6);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((Object) mm40Var2, (Object) akaVar, function1, (wdr) function2, i2, (byte) 4);
        }
    }

    public static final void f(zrd0 zrd0Var, Function1 function1, fet fetVar, int i2) {
        Unit unit;
        fetVar.g0(248819179);
        byte b2 = 4;
        int i3 = (fetVar.g(zrd0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            vxl vxlVar = vxl.b;
            fyl fylVar = new fyl(zrd0Var.b, null, null, s5x0.u(8.0f, 0.0f, 8.0f, 0.0f, 10), null, 22);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rpa0(function1, (byte) 29);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarN, fylVar, vxlVar, (Function1) objP, null, fetVar, 384, 40);
            fetVar.r(true);
            qrd0 qrd0Var = zrd0Var.c;
            if (qrd0Var == null) {
                fetVar.e0(-540624025);
                fetVar.r(false);
                unit = null;
            } else {
                fetVar.e0(-540624024);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1662863387, new iob0(qrd0Var, b2), fetVar), fetVar, 56);
                fetVar.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar.e0(-1402872466);
                j(zrd0Var.f44848a, function1, fetVar, i4);
            } else {
                fetVar.e0(-1402913293);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(zrd0Var, function1, i2, b2);
        }
    }

    public static final void g(l7m0 l7m0Var, g5h g5hVar, boolean z, Function1 function1, fet fetVar, int i2) {
        int i3;
        g5h g5hVar2;
        boolean z2;
        fetVar.g0(-1685338720);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(g5hVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            g5hVar2 = g5hVar;
            if (g5hVar2 == g5h.EVENT_FOCUS) {
                fetVar.e0(214264702);
                long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                zcl zclVar = z ? qmk.f28987a : qmk.l;
                zcl zclVar2 = z ? qmk.f28987a : qmk.l;
                zcl zclVar3 = qmk.f28987a;
                z2 = false;
                zq8.a(0, fetVar, i120.Q(n0qVar, background, new ugg0(zclVar, zclVar2, zclVar3, zclVar3)));
                fetVar.r(false);
            } else {
                z2 = false;
                fetVar.e0(214827848);
                fetVar.r(false);
            }
            mm40 mm40VarS = o050.S(n0qVar);
            tj30 tj30VarC2 = zq8.c(gqw0.e, z2);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
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
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 56.0f, 7);
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z4 = (i3 & 7168) == 2048 ? true : z2;
            Object objP = fetVar.P();
            if (z4 || objP == ukd.f35823a) {
                objP = new i8v(function1, (byte) 17);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            g5hVar2 = g5hVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xjg(l7m0Var, g5hVar2, z, function1, i2, (byte) 1);
        }
    }

    public static final void h(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1292139520);
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
                objP = new nas0(function1, (byte) 26);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, (byte) 9);
        }
    }

    public static final void i(int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        fet fetVar2;
        function0.getClass();
        fetVar.g0(1183567111);
        int i3 = (fetVar.i(function0) ? 4 : 2) | i2 | 48;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar, 54);
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
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = aun.f1487a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i3 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new cjl(function0, (byte) 24);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP2, fetVar2, 6, 2);
            fetVar2.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(function0, mm40Var, i2);
        }
    }

    public static final void j(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1191680104);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
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
                objP = new bac0(function1, (byte) 28);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 20);
        }
    }

    public static final void k(jp20 jp20Var, fet fetVar, int i2) {
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1407783150);
        int i3 = i2 | (fetVar2.g(jp20Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 60.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(jp20Var.c, null, jp20Var.e, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 109562);
            v8q0.a(jp20Var.g, null, StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            b2 = 1;
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hp20(jp20Var, i2, b2);
        }
    }

    public static final void l(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i2) {
        pz40 pz40Var;
        int iIndexOf;
        a4x a4xVar;
        a4x a4xVar2;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar2.g0(-1959994749);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024) | (fetVar2.i(function3) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                gkw gkwVar = (gkw) ((kkw) l7m0Var.getValue()).c.getValue();
                objP = Integer.valueOf((gkwVar == null || (a4xVar2 = gkwVar.b) == null) ? 0 : a4xVar2.size());
                fetVar2.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                gkw gkwVar2 = (gkw) ((kkw) l7m0Var.getValue()).c.getValue();
                if (gkwVar2 == null || (a4xVar = gkwVar2.b) == null || (iIndexOf = a4xVar.indexOf(gkwVar2.c)) < 0) {
                    iIndexOf = 0;
                }
                objP2 = Integer.valueOf(iIndexOf);
                fetVar2.o0(objP2);
            }
            int iIntValue2 = ((Number) objP2).intValue();
            Object objP3 = fetVar2.P();
            byte b2 = 6;
            if (objP3 == cl5Var) {
                objP3 = new y02(iIntValue, b2);
                fetVar2.o0(objP3);
            }
            kwj kwjVarB = zk80.b(iIntValue2, (Function0) objP3, fetVar2, 390, 2);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                gkw gkwVar3 = (gkw) ((kkw) l7m0Var.getValue()).c.getValue();
                objP4 = Boolean.valueOf(gkwVar3 != null && gkwVar3.f11464a);
                fetVar2.o0(objP4);
            }
            boolean zBooleanValue = ((Boolean) objP4).booleanValue();
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP5);
            }
            pz40 pz40Var2 = (pz40) objP5;
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, background, ljcVar);
            if (((kkw) l7m0Var.getValue()).f18461a == g5h.EVENT_FOCUS) {
                fetVar2.e0(-651918584);
                mm40VarQ = i120.Q(mm40VarQ, ((IndividualColors) fetVar2.k(j7x.f16059a)).getSplashBackground(), ljcVar);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-651813990);
                fetVar2.r(false);
            }
            mm40 mm40VarE0 = o2e.e0(cjx.V(mm40VarQ, x0x.a0(fetVar2), null), "COLUMN_HOME_SCREEN");
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
            if (zBooleanValue) {
                fetVar2.e0(-774811936);
                int i4 = i3 << 3;
                int i5 = (i4 & 7168) | (i4 & 112) | 384;
                pz40Var = pz40Var2;
                y(kwjVarB, l7m0Var, pz40Var, function1, fetVar2, i5);
                fetVar2.r(false);
            } else {
                pz40Var = pz40Var2;
                fetVar2.e0(-774588023);
                fetVar2.r(false);
            }
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new y9v(pz40Var, (byte) 3);
                fetVar2.o0(objP6);
            }
            Function1 function4 = (Function1) objP6;
            int i6 = i3 << 3;
            n(kwjVarB, l7m0Var, qdzVar, function1, function2, function4, function3, fetVar2, (i6 & 57344) | (i6 & 112) | 196608 | (i6 & 896) | (i6 & 7168) | (3670016 & (i3 << 6)));
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) l7m0Var, (Object) qdzVar, (Object) function1, (Object) function2, (Object) function3, i2, (byte) 0);
        }
    }

    public static final void m(boolean z, xcz xczVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-2124810436);
        byte b2 = 2;
        int i3 = (fetVar.h(z) ? 4 : 2) | i2 | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            if (z) {
                fetVar.e0(-999469055);
                boolean z2 = (i3 & 112) == 32;
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new bjw(vneVar, xczVar);
                    fetVar.o0(objP2);
                }
                bjw bjwVar = (bjw) objP2;
                boolean zG = fetVar.g(bjwVar) | ((i3 & 896) == 256);
                Object objP3 = fetVar.P();
                if (zG || objP3 == cl5Var) {
                    objP3 = new kaw(function1, bjwVar, null, b2);
                    fetVar.o0(objP3);
                }
                m0x0.t(fetVar, bjwVar, (Function2) objP3);
                fetVar.r(false);
            } else {
                fetVar.e0(-998941466);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n(z, xczVar, function1, i2);
        }
    }

    public static final void n(xk80 xk80Var, l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var2;
        qdz qdzVar2;
        Function1 function5;
        fetVar.g0(1298471845);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xk80Var) ? 4 : 2) | i2;
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
            qdzVar2 = qdzVar;
            i3 |= fetVar.g(qdzVar2) ? 256 : 128;
        } else {
            qdzVar2 = qdzVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            function5 = function4;
            i3 |= fetVar.i(function5) ? 1048576 : 524288;
        } else {
            function5 = function4;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(8.0f, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new bkg(xk80Var, pz40Var, null, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, xk80Var, (Function2) objP2);
            q5x.e(xk80Var, o2e.e0(vtb.U(jm40.b, ((Boolean) pz40Var.getValue()).booleanValue()), "HOME_SCREEN_HORIZONTAL_PAGER"), null, null, 2, 32.0f, null, null, false, null, null, null, null, u1c.M(1339483844, new akg(l7m0Var2, qdzVar2, xk80Var, function3, fB, function5, function1, function2), fetVar), fetVar, i4 | 100687872, 24576, 16076);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) xk80Var, (Object) l7m0Var, (Object) qdzVar, (Object) function1, (Object) function2, (Object) function3, (Object) function4, i2, (byte) 16);
        }
    }

    public static final void o(int i2, fet fetVar) {
        fetVar.g0(1928624143);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, backgroundContent, ljcVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            mm40 mm40VarQ2 = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), ljcVar);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 4.0f, 4.0f, 0.0f, 16.0f, 4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            piz.a(jm40Var, fqj0VarD0, fetVar, 6);
            piz.a(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
            zfn zfnVar = zaq0.b;
            piz.y(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            piz.y(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar, 0);
            piz.y(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            piz.y(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar, 0);
            piz.y(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            piz.y(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar, 0);
            piz.y(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksc0(i2, (byte) 15);
        }
    }

    public static final void p(jp20 jp20Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        jp20Var.getClass();
        fetVar2.g0(-88428446);
        int i3 = i2 | (fetVar2.g(jp20Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 88.0f), 4.0f, 4.0f, 4.0f, 0.0f, 8);
            long j2 = ijg.e1;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            n0q n0qVar = o7k0.c;
            c(jp20Var.i, 6, fetVar2, n0qVar, jp20Var.b);
            mm40 mm40VarL = s5x0.L(n0qVar, 16.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i4 = i3 & 14;
            k(jp20Var, fetVar2, i4);
            v8q0.a(jp20Var.f16881a, dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), true), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            v(jp20Var, fetVar2, i4);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hp20(jp20Var, i2, (byte) 0);
        }
    }

    public static final void q(g5h g5hVar, l7m0 l7m0Var, boolean z, boolean z2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-833109397);
        byte b2 = 4;
        int i3 = i2 | (fetVar2.e(g5hVar.ordinal()) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.h(z2) ? 2048 : 1024) | (fetVar2.g(xczVar) ? 16384 : 8192) | (fetVar2.g(qdzVar) ? 131072 : 65536) | (fetVar2.i(function1) ? 1048576 : 524288) | (fetVar2.i(function2) ? 8388608 : 4194304);
        byte b3 = 1;
        if (fetVar2.U(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new ziw(l7m0Var, b2));
                fetVar2.o0(objP);
            }
            yiw yiwVar = (yiw) ((l7m0) objP).getValue();
            if (yiwVar != null) {
                if (yiwVar instanceof wiw) {
                    fetVar2.e0(1454503004);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = jgk0.b(new ziw(l7m0Var, (byte) 5));
                        fetVar2.o0(objP2);
                    }
                    l7m0 l7m0Var2 = (l7m0) objP2;
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = androidx.compose.runtime.e.e(l7m0Var2.getValue());
                        fetVar2.o0(objP3);
                    }
                    pz40 pz40Var = (pz40) objP3;
                    a4x a4xVar = (a4x) l7m0Var2.getValue();
                    if (!a4xVar.isEmpty()) {
                        pz40Var.setValue(a4xVar);
                    }
                    if (((Collection) pz40Var.getValue()).isEmpty()) {
                        fetVar2.e0(1455902871);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1455361828);
                        Object objP4 = fetVar2.P();
                        if (objP4 == cl5Var) {
                            objP4 = jgk0.b(new ziw(l7m0Var, b3));
                            fetVar2.o0(objP4);
                        }
                        int i4 = i3 << 3;
                        u(g5hVar, pz40Var, qdzVar, (l7m0) objP4, z2, z, xczVar, function1, function2, fetVar2, ((i3 << 6) & 3670016) | (i3 & 14) | 3120 | ((i3 >> 9) & 896) | (57344 & i4) | ((i3 << 9) & 458752) | (29360128 & i4) | (234881024 & i4));
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else if (yiwVar instanceof xiw) {
                    fetVar2.e0(1455968684);
                    Object objP5 = fetVar2.P();
                    if (objP5 == cl5Var) {
                        objP5 = jgk0.b(new vjg(yiwVar, b3));
                        fetVar2.o0(objP5);
                    }
                    g((l7m0) objP5, g5hVar, z2, function1, fetVar2, ((i3 << 3) & 112) | 6 | ((i3 >> 3) & 896) | ((i3 >> 9) & 7168));
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-1754197994, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjg(g5hVar, l7m0Var, z, z2, xczVar, qdzVar, function1, function2, i2, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void r(mdm mdmVar, xcz xczVar, hdz hdzVar, jk5 jk5Var, boolean z, Function1 function1, Function1 function2, Function1 function3, Function0 function0, Function0 function4, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        Object obj;
        d9d0 d9d0Var;
        pz40 pz40Var;
        pz40 pz40Var2;
        ?? r3;
        fet fetVar3;
        Object tg4Var;
        d9d0 d9d0Var2;
        int i4;
        fet fetVar4;
        fet fetVar5 = fetVar;
        xczVar.getClass();
        hdzVar.getClass();
        jk5Var.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function0.getClass();
        function4.getClass();
        fetVar5.g0(-1066609618);
        if ((i2 & 6) == 0) {
            i3 = (fetVar5.g(mdmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar5.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar5.g(hdzVar) : fetVar5.i(hdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar5.g(jk5Var) : fetVar5.i(jk5Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar5.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar5.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar5.i(function2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= fetVar5.i(function3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= fetVar5.i(function0) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= fetVar5.i(function4) ? 536870912 : 268435456;
        }
        if (fetVar5.U(i3 & 1, (i3 & 306783379) != 306783378)) {
            Object objP = fetVar5.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar5.o0(objP);
            }
            pz40 pz40Var3 = (pz40) objP;
            d9d0 d9d0VarO = idx.O(fetVar5);
            Object objP2 = fetVar5.P();
            if (objP2 == obj2) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar5);
                fetVar5.o0(objP2);
            }
            Object obj3 = (vne) objP2;
            Object objP3 = fetVar5.P();
            if (objP3 == obj2) {
                objP3 = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar5.o0(objP3);
            }
            pz40 pz40Var4 = (pz40) objP3;
            Object objP4 = fetVar5.P();
            if (objP4 == obj2) {
                objP4 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar5.o0(objP4);
            }
            pz40 pz40Var5 = (pz40) objP4;
            if (jk5Var.equals(jk5.b)) {
                fetVar5.e0(-1198267842);
                Unit unit = Unit.f46060a;
                boolean zI = fetVar5.i(obj3) | fetVar5.g(d9d0VarO);
                obj = obj3;
                Object objP5 = fetVar5.P();
                if (zI || objP5 == obj2) {
                    objP5 = new khx(obj, d9d0VarO, pz40Var3, null, (byte) 23);
                    d9d0Var = d9d0VarO;
                    fetVar5.o0(objP5);
                } else {
                    d9d0Var = d9d0VarO;
                }
                m0x0.t(fetVar5, unit, (Function2) objP5);
                fetVar5.r(false);
            } else {
                obj = obj3;
                d9d0Var = d9d0VarO;
                pz40Var3 = pz40Var3;
                fetVar5.e0(1485374034);
                fetVar5.r(false);
            }
            n0q n0qVar = o7k0.c;
            mm40 mm40VarN = idx.N(n0qVar, ((Boolean) pz40Var3.getValue()).booleanValue(), d9d0Var, z && !((Boolean) pz40Var5.getValue()).booleanValue(), function4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarN);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, tj30VarC, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            mva mvaVar = hdzVar.e().f12569a;
            if (mvaVar != null) {
                if (mvaVar instanceof zo00) {
                    Boolean bool = Boolean.FALSE;
                    pz40Var = pz40Var4;
                    pz40Var.setValue(bool);
                    pz40Var5.setValue(Boolean.TRUE);
                    pz40Var3.setValue(bool);
                    function3.invoke(((zo00) mvaVar).b);
                } else {
                    pz40Var = pz40Var4;
                    if (mvaVar instanceof bp00) {
                        Boolean bool2 = Boolean.FALSE;
                        pz40Var3.setValue(bool2);
                        pz40Var5.setValue(bool2);
                        pz40Var.setValue(bool2);
                    } else if (mvaVar instanceof ap00) {
                        pz40Var3.setValue(Boolean.FALSE);
                    }
                }
                zx7 zx7Var = gqw0.e;
                jr8 jr8Var = jr8.f16991a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
                boolean z2 = (i3 & 234881024) == 67108864;
                Object objP6 = fetVar5.P();
                if (z2 || objP6 == obj2) {
                    objP6 = new a2z(function0, (byte) 24);
                    fetVar5.o0(objP6);
                }
                d9d0 d9d0Var3 = d9d0Var;
                pz40 pz40Var6 = pz40Var;
                pz40 pz40Var7 = pz40Var3;
                jcb.l(mm40VarB, mdmVar, false, (Function0) objP6, fetVar5, (i3 << 3) & 112, 4);
                if (((Boolean) pz40Var5.getValue()).booleanValue() || ((Boolean) pz40Var6.getValue()).booleanValue()) {
                    fet fetVar6 = fetVar5;
                    pz40Var2 = pz40Var6;
                    r3 = 0;
                    fetVar6.e0(728296506);
                    fetVar6.r(false);
                    fetVar3 = fetVar6;
                } else {
                    fetVar5.e0(723309877);
                    zfn zfnVar = zaq0.b;
                    mm40 mm40VarE0 = o2e.e0(s5x0.L(i120.Q(n0qVar, ((ThemeColors) fetVar5.k(zfnVar)).getBackground(), jd8.n), xfn.a(fetVar5).d, 0.0f, 2), "HISTORY_CONTENT_LAZY_COLUMN");
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = knm0.f(s5x0.u(0.0f, 0.0f, 0.0f, 8.0f, 7), fetVar5);
                    boolean zI2 = ((i3 & 896) == 256 || ((i3 & 512) != 0 && fetVar5.i(hdzVar))) | ((458752 & i3) == 131072) | fetVar5.i(obj) | fetVar5.g(d9d0Var3) | ((3670016 & i3) == 1048576);
                    Object objP7 = fetVar5.P();
                    if (zI2 || objP7 == obj2) {
                        Object obj4 = obj;
                        fet fetVar7 = fetVar5;
                        d9d0Var2 = d9d0Var3;
                        i4 = i3;
                        tg4Var = new tg4((Object) hdzVar, obj4, (Object) pz40Var6, (Object) function2, (Object) pz40Var5, (Object) function1, (Object) d9d0Var2, (byte) 9);
                        pz40Var2 = pz40Var6;
                        fetVar7.o0(tg4Var);
                        fetVar4 = fetVar7;
                    } else {
                        fetVar4 = fetVar5;
                        d9d0Var2 = d9d0Var3;
                        i4 = i3;
                        tg4Var = objP7;
                        pz40Var2 = pz40Var6;
                    }
                    fet fetVar8 = fetVar4;
                    b8k0.e(mm40VarE0, xczVar, ch80VarF, null, null, null, false, null, (Function1) tg4Var, fetVar8, i4 & 112, Response.SERVER_TIMEOUT);
                    fet fetVar9 = fetVar8;
                    v8d0.f36977a.a(d9d0Var2, ((Boolean) pz40Var7.getValue()).booleanValue(), jr8Var.b(jm40Var, gqw0.b), ((ThemeColors) fetVar9.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar9.k(zfnVar)).getSecondary(), 0.0f, fetVar8, 1572864, 32);
                    r3 = 0;
                    fetVar9.r(false);
                    fetVar3 = fetVar9;
                }
                if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                    fetVar3.e0(728327413);
                    y0x0.x(r3, fetVar3);
                    fetVar3.r(r3);
                } else {
                    fetVar3.e0(728362970);
                    fetVar3.r(r3);
                }
                fetVar3.r(true);
                fetVar2 = fetVar3;
            }
            t9f.b();
            return;
        }
        fetVar5.X();
        fetVar2 = fetVar5;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bcc(mdmVar, xczVar, hdzVar, jk5Var, z, function1, function2, function3, function0, function4, i2);
        }
    }

    public static final void s(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-2022134010);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 27;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String strW = rsm0.w(org.xbet.client1.R.string.races_result, 0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                pz40 pz40Var = s6t0.f31722a;
                imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strW, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            n0q n0qVar = o7k0.c;
            pz40 pz40Var2 = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            boolean z = i4 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new bac0(function1, b2);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 48, 0, 4085);
            csd0 csd0Var = (csd0) l7m0Var.getValue();
            if (csd0Var instanceof zrd0) {
                fetVar.e0(-1915071401);
                f((zrd0) csd0Var, function1, fetVar, i4);
                fetVar.r(false);
            } else if (csd0Var instanceof asd0) {
                fetVar.e0(-1915067095);
                j(((asd0) csd0Var).f1387a, function1, fetVar, i4);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(csd0Var, bsd0.f3125a)) {
                    throw b1j.f(-1915073632, fetVar, false);
                }
                fetVar.e0(-1915062358);
                o(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 27);
        }
    }

    public static final void t(int i2, fet fetVar, xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2) {
        fetVar.g0(1705295022);
        int i3 = (fetVar.g(xczVar) ? 4 : 2) | i2 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(l7m0Var2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var2.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            int i4 = i3 << 3;
            b8k0.d(n0qVar, xczVar, l7m0Var, new qw3(8.0f, true, new jf4((byte) 14)), h97.f(xfn.a(fetVar).c, 8.0f, xfn.a(fetVar).c, 28.0f, fetVar), z, null, hew0.e, fetVar, (i4 & 112) | 100663302 | (i4 & 896), 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o7p0(xczVar, l7m0Var, l7m0Var2, i2);
        }
    }

    public static final void u(g5h g5hVar, pz40 pz40Var, qdz qdzVar, l7m0 l7m0Var, boolean z, boolean z2, xcz xczVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        boolean z3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-606688346);
        int i3 = (fetVar2.e(g5hVar.ordinal()) ? 4 : 2) | i2;
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 256 : 128;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z3 = z2;
            i3 |= fetVar2.h(z3) ? 131072 : 65536;
        } else {
            z3 = z2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.g(xczVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar2.i(function2) ? 67108864 : 33554432;
        }
        if (fetVar2.U(i3 & 1, (38347923 & i3) != 38347922)) {
            int iOrdinal = g5hVar.ordinal();
            if (iOrdinal == 0) {
                fetVar2.e0(1088066065);
                int i4 = ((i3 >> 12) & 896) | 54 | ((i3 << 3) & 7168);
                int i5 = i3 >> 9;
                wwj.a(pz40Var, l7m0Var, xczVar, qdzVar, function1, function2, fetVar2, i4 | (i5 & 57344) | (i5 & 458752));
                fetVar2.r(false);
            } else if (iOrdinal == 1) {
                fetVar2.e0(-629346313);
                hp4.k(pz40Var, l7m0Var, xczVar, qdzVar, !z, z3, function2, function1, fetVar2, ((i3 >> 6) & 3670016) | ((i3 >> 12) & 896) | 54 | ((i3 << 3) & 7168) | (i3 & 458752) | (i3 & 29360128));
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(1088064962, fetVar2, false);
                }
                fetVar2.e0(1088090996);
                int i6 = i3 >> 12;
                vbw0.t(pz40Var, l7m0Var, xczVar, qdzVar, function2, function1, fetVar2, ((i3 << 3) & 7168) | 54 | (i6 & 896) | (i6 & 57344) | ((i3 >> 6) & 458752));
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yjg(g5hVar, pz40Var, qdzVar, l7m0Var, z, z2, xczVar, function1, function2, i2, (byte) 1);
        }
    }

    public static final void v(jp20 jp20Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1342607566);
        int i3 = i2 | (fetVar2.g(jp20Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 60.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.o, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(jp20Var.d, null, jp20Var.f, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 109562);
            v8q0.a(jp20Var.h, null, StaticColors.INSTANCE.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hp20(jp20Var, i2, (byte) 2);
        }
    }

    public static final void w(int i2, fet fetVar) {
        yjj0 yjj0VarC;
        fetVar.g0(1795350582);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarA0 = wha0.a0(s5x0.L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2), wha0.T(fetVar), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
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
            m8x.A(0, fetVar, null);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
            jm40 jm40Var = jm40.b;
            e9x.z(0, 0, fetVar, i120.Q(jm40Var, backgroundContent, ugg0VarC));
            fetVar.e0(-875701190);
            int i3 = 0;
            while (i3 < 6) {
                boolean z = i3 == 5;
                boolean z2 = !z;
                long backgroundContent2 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                if (z) {
                    zcl zclVar2 = qmk.f28987a;
                    yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                } else {
                    yjj0VarC = jd8.n;
                }
                x8x.h(0, fetVar, i120.Q(jm40Var, backgroundContent2, yjj0VarC), z2);
                i3++;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ogj0(i2, (byte) 8);
        }
    }

    public static final void x(final es8 es8Var, final xcz xczVar, fet fetVar, final int i2) {
        int i3;
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(231366877);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(es8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        final byte b2 = 0;
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(false) ? 256 : 128;
        }
        final byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            yfe0VarU = fetVar.u();
            if (yfe0VarU == null) {
                return;
            } else {
                function2 = new Function2() { // from class: a.qs8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b2;
                        int i4 = i2;
                        xcz xczVar2 = xczVar;
                        es8 es8Var2 = es8Var;
                        fet fetVar2 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b4) {
                            case 0:
                                cfx0.x(es8Var2, xczVar2, fetVar2, x8x.L(i4 | 1));
                                break;
                            default:
                                cfx0.x(es8Var2, xczVar2, fetVar2, x8x.L(i4 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            }
        } else {
            fetVar.X();
            yfe0VarU = fetVar.u();
            if (yfe0VarU == null) {
                return;
            } else {
                function2 = new Function2() { // from class: a.qs8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b3;
                        int i4 = i2;
                        xcz xczVar2 = xczVar;
                        es8 es8Var2 = es8Var;
                        fet fetVar2 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b4) {
                            case 0:
                                cfx0.x(es8Var2, xczVar2, fetVar2, x8x.L(i4 | 1));
                                break;
                            default:
                                cfx0.x(es8Var2, xczVar2, fetVar2, x8x.L(i4 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            }
        }
        yfe0VarU.d = function2;
    }

    public static final void y(xk80 xk80Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1208755711);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xk80Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int iOrdinal = ((kkw) l7m0Var.getValue()).f18461a.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1035322597);
                obc.y(xk80Var, ((kkw) l7m0Var.getValue()).c, function1, fetVar, ((i3 >> 3) & 896) | (i3 & 14));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-1035081572);
                gco.a(xk80Var, ((kkw) l7m0Var.getValue()).c, function1, fetVar, ((i3 >> 3) & 896) | (i3 & 14));
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-1973062083, fetVar, false);
                }
                fetVar.e0(-1034838687);
                frv.a(xk80Var, ((kkw) l7m0Var.getValue()).c, l7m0Var2, function1, fetVar, i3 & 8078);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zjg(xk80Var, l7m0Var, l7m0Var2, function1, i2, (byte) 4);
        }
    }

    public static final void z(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(2036195023);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ojr0(l7m0Var, (byte) 21);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ojr0(l7m0Var, (byte) 22);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            xcz xczVarB = qdzVar.b("UNIVERSAL_CHAMP_PRIZE_POOL_SCREEN_KEY", new i9t0(b2), fetVar, ((i3 << 3) & 896) | 6);
            mm40 mm40VarQ = i120.Q(yyw.X(o7k0.c, null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVar = ((gat0) l7m0VarY.getValue()).f10987a;
            boolean z3 = (i3 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new nas0(function1, (byte) 25);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            sat0 sat0Var = (sat0) l7m0VarY2.getValue();
            if (Intrinsics.d(sat0Var, qat0.f28414a)) {
                fetVar2.e0(-1558859217);
                Object[] objArr3 = new Object[0];
                boolean z4 = i4 == 4;
                Object objP4 = fetVar2.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new ojr0(l7m0Var, (byte) 23);
                    fetVar2.o0(objP4);
                }
                l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP4, fetVar2);
                Object[] objArr4 = new Object[0];
                boolean z5 = i4 == 4;
                Object objP5 = fetVar2.P();
                if (z5 || objP5 == cl5Var) {
                    objP5 = new ojr0(l7m0Var, (byte) 24);
                    fetVar2.o0(objP5);
                }
                t(0, fetVar2, xczVarB, l7m0VarY3, v3c.Y(objArr4, (Function0) objP5, fetVar2));
                fetVar2.r(false);
            } else {
                if (!(sat0Var instanceof rat0)) {
                    throw b1j.f(226805531, fetVar2, false);
                }
                fetVar2.e0(-1558536755);
                Object[] objArr5 = new Object[0];
                boolean zI = fetVar2.i(sat0Var);
                Object objP6 = fetVar2.P();
                if (zI || objP6 == cl5Var) {
                    objP6 = new qir0((rat0) sat0Var, (byte) 29);
                    fetVar2.o0(objP6);
                }
                h(v3c.Y(objArr5, (Function0) objP6, fetVar2), function1, fetVar2, (i3 >> 3) & 112);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function1, i2, (byte) 9);
        }
    }
}
