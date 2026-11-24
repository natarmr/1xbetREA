package a;

import android.content.Context;
import android.database.SQLException;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.camera.core.ImageProcessingUtil;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m2x {
    public static final gbn A(String str, Function1 function1) {
        byte b = 3;
        return new gbn(new ksc0(b), new o5c0(b, (byte) 12), new oac0(function1, str, (byte) 11), x4c0.o);
    }

    public static final u6n B(d280 d280Var, w6n w6nVar, fet fetVar) {
        d280Var.getClass();
        boolean zG = fetVar.g(d280Var) | fetVar.e(w6nVar.ordinal());
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new u6n(d4d.STATIC_WHITE60, w6nVar, d280Var);
            fetVar.o0(objP);
        }
        return (u6n) objP;
    }

    public static final mkx C(jge0 jge0Var) {
        return new mkx(Math.round(jge0Var.f16474a), Math.round(jge0Var.b), Math.round(jge0Var.c), Math.round(jge0Var.d));
    }

    public static final Collection D(Collection collection, Function1 function1) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        nbk0 nbk0Var = new nbk0();
        while (!linkedList.isEmpty()) {
            Object objU = CollectionsKt.U(linkedList);
            nbk0 nbk0Var2 = new nbk0();
            ArrayList arrayListG = sf80.g(objU, linkedList, function1, new caz(nbk0Var2, (byte) 9));
            if (arrayListG.size() == 1 && nbk0Var2.isEmpty()) {
                Object objU0 = CollectionsKt.u0(arrayListG);
                objU0.getClass();
                nbk0Var.add(objU0);
            } else {
                Object objS = sf80.s(arrayListG, function1);
                kp9 kp9Var = (kp9) function1.invoke(objS);
                for (Object obj : arrayListG) {
                    obj.getClass();
                    if (!sf80.k(kp9Var, (kp9) function1.invoke(obj))) {
                        nbk0Var2.add(obj);
                    }
                }
                if (!nbk0Var2.isEmpty()) {
                    nbk0Var.addAll(nbk0Var2);
                }
                nbk0Var.add(objS);
            }
        }
        return nbk0Var;
    }

    public static final void E(cp cpVar) {
        o0x o0xVar = ((ptc0) cpVar.u()).f;
        yfu0 yfu0Var = cpVar.u;
        if (o0xVar == null) {
            ((x2k) yfu0Var).d.setVisibility(8);
            return;
        }
        x2k x2kVar = (x2k) yfu0Var;
        hxm0.w(x2kVar.d);
        x2kVar.d.setVisibility(0);
        List list = u0d.f34849a;
        u0d.j(x2kVar.d, ((n0x) o0xVar).f22722a, ((m0x) ((ptc0) cpVar.u()).g).f20977a, 0, null, null, null, 508);
    }

    public static final void F(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((x2k) yfu0Var).b.setIconTint(m5d.b(R.attr.uikitPrimary, cpVar.w));
        x2k x2kVar = (x2k) yfu0Var;
        x2kVar.b.setIconBackgroundTint(((ptc0) cpVar.u()).f27558a == zuc0.PLAIN_LIST ? R.attr.uikitBackground : R.attr.uikitBackgroundLight60);
        x2kVar.b.a(((ptc0) cpVar.u()).e, null, new w800((byte) 17), new w800((byte) 15));
    }

    public static final void G(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((x2k) yfu0Var).c.setSubtitle(((ptc0) cpVar.u()).c);
        if (((ptc0) cpVar.u()).c.length() > 0) {
            x2k x2kVar = (x2k) yfu0Var;
            x2kVar.c.setTitleMaxLines(1);
            x2kVar.c.setSubtitleMaxLines(2);
        }
    }

    public static final void H(cp cpVar, String str) {
        gtc0 gtc0Var = ((ptc0) cpVar.u()).b;
        gtc0 gtc0Var2 = gtc0.CHAMPIONS_CLUB;
        yfu0 yfu0Var = cpVar.u;
        if (gtc0Var == gtc0Var2) {
            ((x2k) yfu0Var).c.setTitle(str);
        } else {
            ((x2k) yfu0Var).c.setTitle(((ptc0) cpVar.u()).d);
        }
    }

    public static final void I(int i, int i2, ugi0 ugi0Var) {
        ugi0Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(ugi0Var.e(i4));
            }
            i3 >>>= 1;
        }
        throw new bh40(ugi0Var.h(), arrayList);
    }

    public static final void J(int i, String str) {
        throw new SQLException(twn.m(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final wkm K(ia70 ia70Var) {
        int i;
        int iOrdinal = ia70Var.c.f4905a.f3145a.ordinal();
        if (iOrdinal == 1) {
            i = R.drawable.ic_glyph_x2;
        } else if (iOrdinal == 2) {
            i = R.drawable.ic_glyph_refund;
        } else if (iOrdinal != 3) {
            i = iOrdinal != 5 ? R.drawable.ic_glyph_add_bonus : R.drawable.ic_glyph_wild_freebet;
        } else {
            i = R.drawable.ic_glyph_free_games;
        }
        boolean z = !ia70Var.e && ia70Var.d && ia70Var.f && !ia70Var.g;
        pz40 pz40Var = s6t0.f31722a;
        return new wkm(2, i, z, ra50.f30118a, s6t0.b().f33626a.getSecondary());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    public static final pn8 L(a820 a820Var) {
        boolean z;
        boolean z2;
        ko7 ko7Var = a820Var.c;
        pvj0 pvj0Var = a820Var.e;
        boolean z3 = false;
        if (ko7Var.equals(jo7.b)) {
            bx6 bx6Var = pvj0Var.f27665a;
            boolean z4 = pvj0Var.f;
            tw6 tw6Var = bx6Var.b;
            boolean z5 = tw6Var.k;
            q4f q4fVar = a820Var.j;
            if (q4fVar != q4f.m && q4fVar != q4f.h) {
                double d = tw6Var.f34633a;
                if (z5) {
                    if (d != -1.0d) {
                        double d2 = tw6Var.d;
                        double dB = tw6Var.b();
                        if ((d2 > d || d > dB) && (!tw6Var.m || d <= tw6Var.b())) {
                            if (z4) {
                            }
                        }
                    } else if (z4) {
                    }
                    z2 = true;
                }
                z2 = false;
            } else if (z5 || z4) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (ko7Var.equals(io7.b)) {
            z2 = a820Var.f.e;
        } else {
            if (!ko7Var.equals(ho7.b)) {
                t9f.b();
                return null;
            }
            hx4 hx4Var = a820Var.g;
            tw6 tw6Var2 = hx4Var.c.b;
            double d3 = tw6Var2.f34633a;
            if (d3 == -1.0d) {
                z = false;
            } else {
                double d4 = tw6Var2.d;
                double d5 = tw6Var2.e;
                if (d4 > d3 || d3 > d5) {
                    z = false;
                } else {
                    z = true;
                }
            }
            yyc yycVar = hx4Var.b;
            BigDecimal bigDecimal = yycVar.f43459a;
            boolean z6 = !bigDecimal.equals(new BigDecimal(String.valueOf(-1.0d))) && bigDecimal.compareTo(yycVar.d) >= 0;
            if (z && z6) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2 && !a820Var.q) {
            z3 = true;
        }
        return new pn8(z3);
    }

    public static final c0d M(m0d m0dVar) {
        int i = lh00.f20032a[m0dVar.e.ordinal()];
        if (i == 1) {
            return c0d.f3518a;
        }
        if (i == 2) {
            return c0d.b;
        }
        if (i == 3) {
            return c0d.c;
        }
        if (i == 4 && m0dVar.f20948a != m0dVar.c) {
            return c0d.e;
        }
        if (i == 4) {
            return c0d.d;
        }
        t9f.b();
        return null;
    }

    public static final cye N(txe txeVar, ctf0 ctf0Var, boolean z, boolean z2) {
        pxe lxeVar;
        ctf0Var.getClass();
        m0d m0dVar = txeVar.d;
        h680 h680Var = txeVar.g;
        int iOrdinal = m0dVar.g.ordinal();
        i680 i680Var = null;
        if (iOrdinal == 0) {
            lxeVar = jxe.f17303a;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            lxeVar = new lxe(new j43(m0dVar.b, m0dVar.d, M(m0dVar), z2));
        }
        pxe pxeVar = lxeVar;
        String str = txeVar.e;
        String strA = (txeVar.f && h680Var == null) ? ctf0Var.b.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0)) : null;
        if (h680Var != null) {
            m0d m0dVar2 = h680Var.f12519a;
            j43 j43Var = new j43(m0dVar2.b, m0dVar2.d, M(m0dVar2), z2);
            m0d m0dVar3 = h680Var.b;
            i680Var = new i680(j43Var, new j43(m0dVar3.b, m0dVar3.d, M(m0dVar3), z2));
        }
        return new cye(pxeVar, str, z, strA, i680Var);
    }

    public static final jal0 O(eh50 eh50Var, List list, boolean z) {
        cap capVar = cap.f4022a;
        eh50Var.getClass();
        List list2 = eh50Var.d;
        int size = list2.size();
        String str = eh50Var.b;
        if (size >= 2) {
            return new hal0(str, x2x.r0((ah50) list2.get(0), list, z, cap.b), x2x.r0((ah50) list2.get(1), list, z, capVar));
        }
        ah50 ah50Var = (ah50) CollectionsKt.firstOrNull(list2);
        return new ial0(str, ah50Var != null ? x2x.r0(ah50Var, list, z, capVar) : new e5a0(new c280("", R.drawable.ic_glyph_placeholder_player)));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    public static final f1z P(List list, ctf0 ctf0Var, String str, String str2) {
        String strA;
        String str3;
        hkv0 hkv0Var;
        String strA2;
        list.getClass();
        ctf0Var.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        List listA0 = CollectionsKt.A0(list, new wpv((byte) 10));
        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
        int i = 0;
        for (Object obj : listA0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            aq30 aq30Var = (aq30) obj;
            zp30 zp30Var = aq30Var.c;
            fe30 fe30Var = aq30Var.e;
            lcp0 lcp0Var = new lcp0(zp30Var.c, qep0.f28595a, new f5a0(new c280(zp30Var.b, R.drawable.ic_glyph_placeholder_player)));
            zp30 zp30Var2 = aq30Var.d;
            lcp0 lcp0Var2 = new lcp0(zp30Var2.c, qep0.b, new f5a0(new c280(zp30Var2.b, R.drawable.ic_glyph_placeholder_player)));
            rdj rdjVar = rdj.f30294a;
            String strF = rdj.f(new znq0(aq30Var.b), sdj.UNIVERSAL, null, 60);
            if (str2 != null) {
                if (fe30Var instanceof ee30) {
                    ee30 ee30Var = (ee30) fe30Var;
                    strA2 = ctf0Var.b.a(R.string.placeholder_score_two_teams, Arrays.copyOf(new Object[]{Integer.valueOf(ee30Var.f7650a), Integer.valueOf(ee30Var.b)}, 2));
                } else {
                    if (!(fe30Var instanceof de30)) {
                        t9f.b();
                        return null;
                    }
                    zg30 zg30Var = ((de30) fe30Var).f5928a;
                    if (zg30Var.equals(vg30.f37363a)) {
                        strA2 = ctf0Var.b.a(R.string.draw_game, Arrays.copyOf(new Object[0], 0));
                    } else if (zg30Var instanceof wg30) {
                        strA2 = ctf0Var.b.a(((wg30) zg30Var).f39094a.equals(str2) ? R.string.dt_prizes : R.string.lose, Arrays.copyOf(new Object[0], 0));
                    } else if (zg30Var instanceof xg30) {
                        strA2 = ctf0Var.b.a(((xg30) zg30Var).f40821a.equals(str2) ? R.string.dt_prizes : R.string.lose, Arrays.copyOf(new Object[0], 0));
                    } else {
                        if (!zg30Var.equals(yg30.f42568a)) {
                            t9f.b();
                            return null;
                        }
                        strA2 = ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    }
                }
                str3 = strA2;
            } else {
                if (fe30Var instanceof ee30) {
                    ee30 ee30Var2 = (ee30) fe30Var;
                    strA = ctf0Var.b.a(R.string.placeholder_score_two_teams, Arrays.copyOf(new Object[]{Integer.valueOf(ee30Var2.f7650a), Integer.valueOf(ee30Var2.b)}, 2));
                } else {
                    strA = ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                }
                str3 = strA;
            }
            String str4 = aq30Var.f1279a;
            zg30 zg30VarA = fe30Var.a();
            if (zg30VarA == null) {
                hkv0Var = hkv0.c;
            } else if (zg30VarA instanceof wg30) {
                hkv0Var = hkv0.f13226a;
            } else if (zg30VarA instanceof xg30) {
                hkv0Var = hkv0.b;
            } else {
                hkv0Var = hkv0.c;
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(new fzy(lcp0Var, lcp0Var2, strF, str3, str4, hkv0Var))));
            i = i2;
        }
        return new f1z(dyb.o0(arrayList), str);
    }

    public static final zd90 Q(ih50 ih50Var, zi50 zi50Var, zi50 zi50Var2) {
        ih50Var.getClass();
        zi50Var.getClass();
        zi50Var2.getClass();
        long jM = x1x.M(zi50Var);
        long jM2 = x1x.M(zi50Var2);
        h83 h83Var = new h83();
        h83 h83Var2 = new h83();
        String strValueOf = String.valueOf(ih50Var.b);
        strValueOf.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        j56 j56Var = new j56(0.0f);
        k5q0 k5q0Var = k5q0.b;
        smk0 smk0Var = new smk0(jM, j2, null, null, null, null, null, j2, j56Var, null, null, j, k5q0Var, null, null, 17424);
        h83Var2.c(strValueOf);
        StringBuilder sb = h83Var2.f12607a;
        h83Var2.a(smk0Var, 0, sb.length());
        sb.length();
        h83Var.b(h83Var2.h());
        j83 j83VarH = h83Var.h();
        h83 h83Var3 = new h83();
        h83 h83Var4 = new h83();
        String strValueOf2 = String.valueOf(ih50Var.c);
        strValueOf2.getClass();
        smk0 smk0Var2 = new smk0(jM2, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
        h83Var4.c(strValueOf2);
        StringBuilder sb2 = h83Var4.f12607a;
        h83Var4.a(smk0Var2, 0, sb2.length());
        sb2.length();
        h83Var3.b(h83Var4.h());
        return new zd90(j83VarH, h83Var3.h(), String.valueOf(ih50Var.f14766a));
    }

    public static final rei0 R(oei0 oei0Var) {
        h8d h8dVar;
        oei0Var.getClass();
        if (oei0Var instanceof nei0) {
            nei0 nei0Var = (nei0) oei0Var;
            String str = nei0Var.b;
            if (str == null || str.length() == 0) {
                e9d0.o();
                return null;
            }
            String str2 = nei0Var.b;
            Date date = nei0Var.d;
            if (date == null) {
                date = new Date();
            }
            Date date2 = date;
            String str3 = nei0Var.e;
            b8d b8dVar = nei0Var.c;
            if (b8dVar != null) {
                j8d j8dVar = j8d.f16077a;
                h8dVar = new h8d(b8dVar.b);
            } else {
                h8dVar = h8d.b;
            }
            return new qei0(str2, h8dVar, date2, str3, Intrinsics.d(nei0Var.f, Boolean.TRUE));
        }
        if (!(oei0Var instanceof kei0)) {
            t9f.b();
            return null;
        }
        kei0 kei0Var = (kei0) oei0Var;
        String str4 = kei0Var.b;
        String str5 = str4 == null ? "" : str4;
        List list = kei0Var.c;
        if (list == null) {
            e9d0.o();
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new File((String) it.next()));
        }
        Date date3 = kei0Var.d;
        if (date3 == null) {
            date3 = new Date();
        }
        Date date4 = date3;
        String str6 = kei0Var.e;
        return new pei0(str5, arrayList, date4, str6 == null ? "" : str6, Intrinsics.d(kei0Var.f, Boolean.TRUE));
    }

    public static byte[] S(b1x b1xVar, Rect rect, int i, int i2) throws l2x {
        if (b1xVar.getFormat() != 35) {
            ohq.h(b1xVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        wsf0 wsf0Var = b1xVar.l0()[0];
        wsf0 wsf0Var2 = b1xVar.l0()[1];
        int i3 = 2;
        wsf0 wsf0Var3 = b1xVar.l0()[2];
        ByteBuffer byteBufferI = wsf0Var.i();
        ByteBuffer byteBufferI2 = wsf0Var2.i();
        ByteBuffer byteBufferI3 = wsf0Var3.i();
        byteBufferI.rewind();
        byteBufferI2.rewind();
        byteBufferI3.rewind();
        int iRemaining = byteBufferI.remaining();
        byte[] bArr = new byte[((b1xVar.f() * b1xVar.j()) / 2) + iRemaining];
        int iJ = 0;
        for (int i4 = 0; i4 < b1xVar.f(); i4++) {
            byteBufferI.get(bArr, iJ, b1xVar.j());
            iJ += b1xVar.j();
            byteBufferI.position(Math.min(iRemaining, wsf0Var.k() + (byteBufferI.position() - b1xVar.j())));
        }
        int iF = b1xVar.f() / 2;
        int iJ2 = b1xVar.j() / 2;
        int iK = wsf0Var3.k();
        int iK2 = wsf0Var2.k();
        int iJ3 = wsf0Var3.j();
        int iJ4 = wsf0Var2.j();
        byte[] bArr2 = new byte[iK];
        byte[] bArr3 = new byte[iK2];
        int i5 = 0;
        while (i5 < iF) {
            int i6 = i3;
            byteBufferI3.get(bArr2, 0, Math.min(iK, byteBufferI3.remaining()));
            byteBufferI2.get(bArr3, 0, Math.min(iK2, byteBufferI2.remaining()));
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < iJ2; i9++) {
                int i10 = iJ + 1;
                bArr[iJ] = bArr2[i7];
                iJ += 2;
                bArr[i10] = bArr3[i8];
                i7 += iJ3;
                i8 += iJ4;
            }
            i5++;
            i3 = i6;
        }
        int i11 = i3;
        YuvImage yuvImage = new YuvImage(bArr, 17, b1xVar.j(), b1xVar.f(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wko[] wkoVarArr = lko.b;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        jko jkoVar = new jko();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = jkoVar.f16680a;
        jkoVar.c(arrayList, "Orientation", strValueOf);
        jkoVar.c(arrayList, "XResolution", "72/1");
        jkoVar.c(arrayList, "YResolution", "72/1");
        jkoVar.c(arrayList, "ResolutionUnit", String.valueOf(i11));
        jkoVar.c(arrayList, "YCbCrPositioning", String.valueOf(1));
        jkoVar.c(arrayList, "Make", Build.MANUFACTURER);
        jkoVar.c(arrayList, "Model", Build.MODEL);
        if (b1xVar.K0() != null) {
            b1xVar.K0().g(jkoVar);
        }
        jkoVar.d(i2);
        jkoVar.c(arrayList, "ImageWidth", String.valueOf(b1xVar.j()));
        jkoVar.c(arrayList, "ImageLength", String.valueOf(b1xVar.f()));
        ArrayList list = Collections.list(new iko(jkoVar));
        if (!((Map) list.get(1)).isEmpty()) {
            jkoVar.b("ExposureProgram", String.valueOf(0), list);
            jkoVar.b("ExifVersion", "0230", list);
            jkoVar.b("ComponentsConfiguration", lko.e, list);
            jkoVar.b("MeteringMode", String.valueOf(0), list);
            jkoVar.b("LightSource", String.valueOf(0), list);
            jkoVar.b("FlashpixVersion", "0100", list);
            jkoVar.b("FocalPlaneResolutionUnit", String.valueOf(i11), list);
            jkoVar.b("FileSource", String.valueOf(3), list);
            jkoVar.b("SceneType", String.valueOf(1), list);
            jkoVar.b("CustomRendered", String.valueOf(0), list);
            jkoVar.b("SceneCaptureType", String.valueOf(0), list);
            jkoVar.b("Contrast", String.valueOf(0), list);
            jkoVar.b("Saturation", String.valueOf(0), list);
            jkoVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i11)).isEmpty()) {
            jkoVar.b("GPSVersionID", "2300", list);
            jkoVar.b("GPSSpeedRef", TokenNames.K, list);
            jkoVar.b("GPSTrackRef", TokenNames.T, list);
            jkoVar.b("GPSImgDirectionRef", TokenNames.T, list);
            jkoVar.b("GPSDestBearingRef", TokenNames.T, list);
            jkoVar.b("GPSDestDistanceRef", TokenNames.K, list);
        }
        if (yuvImage.compressToJpeg(rect, i, new vko(byteArrayOutputStream, new lko(list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new l2x("YuvImage failed to encode jpeg.");
    }

    public static final void a(mm40 mm40Var, final anz anzVar, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-1961969509);
        byte b = 16;
        int i2 = i | 6 | (fetVar.g(anzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwy(function1, b);
                fetVar.o0(objP);
            }
            ugd ugdVar = hmw0.e;
            ugd ugdVarM = u1c.M(-610108452, new xdr() { // from class: a.zmz
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b2;
                    cl5 cl5Var = ukd.f35823a;
                    jm40 jm40Var = jm40.b;
                    Function1 function2 = function1;
                    anz anzVar2 = anzVar;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                                wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.confirm, fetVar2)), anzVar2.f, anzVar2.g, false);
                                boolean zG = fetVar2.g(function2);
                                Object objP2 = fetVar2.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new xwy(function2, (byte) 17);
                                    fetVar2.o0(objP2);
                                }
                                qzb.n(mm40VarK, wulVar, (Function0) objP2, fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (!fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                fetVar3.X();
                            } else if (anzVar2.d) {
                                fetVar3.e0(-620954726);
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarK2 = s5x0.K(jm40Var, 16.0f, 8.0f);
                                c6q0 c6q0Var = new c6q0(anzVar2.b, e6q0.f7299a, o6q0.f24750a, new s7q0(""), !anzVar2.g, false, new y5q0(3, null, null, 6), xsm0.t(R.string.limits_enter_sum_with_currency_v2, new Object[]{anzVar2.c}, fetVar3), null, false, 0, null, 261120);
                                boolean zG2 = fetVar3.g(function2);
                                Object objP3 = fetVar3.P();
                                if (zG2 || objP3 == cl5Var) {
                                    objP3 = new i1y(function2, (byte) 22);
                                    fetVar3.o0(objP3);
                                }
                                wvb.t(mm40VarK2, c6q0Var, 0, null, (Function1) objP3, fetVar3, 0, 12);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(-619730412);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            ugd ugdVarM2 = u1c.M(-1334458002, new xdr() { // from class: a.zmz
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b3;
                    cl5 cl5Var = ukd.f35823a;
                    jm40 jm40Var = jm40.b;
                    Function1 function2 = function1;
                    anz anzVar2 = anzVar;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                                wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.confirm, fetVar2)), anzVar2.f, anzVar2.g, false);
                                boolean zG = fetVar2.g(function2);
                                Object objP2 = fetVar2.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new xwy(function2, (byte) 17);
                                    fetVar2.o0(objP2);
                                }
                                qzb.n(mm40VarK, wulVar, (Function0) objP2, fetVar2, 0, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (!fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                fetVar3.X();
                            } else if (anzVar2.d) {
                                fetVar3.e0(-620954726);
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarK2 = s5x0.K(jm40Var, 16.0f, 8.0f);
                                c6q0 c6q0Var = new c6q0(anzVar2.b, e6q0.f7299a, o6q0.f24750a, new s7q0(""), !anzVar2.g, false, new y5q0(3, null, null, 6), xsm0.t(R.string.limits_enter_sum_with_currency_v2, new Object[]{anzVar2.c}, fetVar3), null, false, 0, null, 261120);
                                boolean zG2 = fetVar3.g(function2);
                                Object objP3 = fetVar3.P();
                                if (zG2 || objP3 == cl5Var) {
                                    objP3 = new i1y(function2, (byte) 22);
                                    fetVar3.o0(objP3);
                                }
                                wvb.t(mm40VarK2, c6q0Var, 0, null, (Function1) objP3, fetVar3, 0, 12);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(-619730412);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            jm40 jm40Var = jm40.b;
            ulb.i((Function0) objP, jm40Var, false, null, null, null, null, ugdVar, ugdVarM, ugdVarM2, fetVar, 905969712, 252);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var2, anzVar, function1, i, (byte) 29);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(1019489019);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarK = s5x0.K(i120.S(mm40VarD, 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), ugg0Var2), 8.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, x7zVar, secondary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.g(), fetVar2, (i2 >> 3) & 14, 0, 130040);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            long secondary2 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, x7zVar2, secondary2, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar2, (i2 >> 6) & 14, 0, 130040);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 11);
        }
    }

    public static final void c(mm40 mm40Var, w2d w2dVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(460809229);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(w2dVar) : fetVar.i(w2dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarK = lgb.K(mm40Var);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !fetVar.i(w2dVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new j2d(ugdVar2, ugdVar, w2dVar, b);
                fetVar.o0(objP);
            }
            x4n0.a(mm40VarK, (Function2) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qo50(mm40Var, w2dVar, ugdVar, ugdVar2, i, (byte) 1);
        }
    }

    public static final void d(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, fet fetVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            ugdVar2 = null;
        }
        byte b = 0;
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
            fetVar.e0(1851530386);
            fetVar.r(false);
        } else {
            fetVar.e0(475368783);
            twn.v((i >> 6) & 14, ugdVar2, fetVar, false);
        }
        fetVar.r(true);
    }

    public static final void e(int i, fet fetVar, Function2 function2, boolean z) {
        fetVar.g0(-642000585);
        byte b = 2;
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.i(function2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objA = qr00.a(fetVar);
            if (objA == null) {
                fetVar.e0(1512740606);
                objA = tr00.a(fetVar);
            } else {
                fetVar.e0(1512737723);
            }
            fetVar.r(false);
            if (objA == null) {
                jf4.n("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zG = fetVar.g(objA);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                ze50 ze50Var = objA instanceof ze50 ? (ze50) objA : null;
                ye50 ye50VarB = ze50Var != null ? ze50Var.b() : null;
                kg60 kg60Var = objA instanceof kg60 ? (kg60) objA : null;
                objP = new rb5(ye50VarB, kg60Var != null ? kg60Var.k() : null);
                fetVar.o0(objP);
            }
            rb5 rb5Var = (rb5) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            long j = fetVar.T;
            boolean zG2 = fetVar.g(rb5Var) | fetVar.f(j);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new ckd(vneVar, new ssb0(objA, j));
                fetVar.o0(objP3);
            }
            ckd ckdVar = (ckd) objP3;
            fetVar.e0(-348514256);
            boolean zI = fetVar.i(ckdVar) | fetVar.i(function2);
            Object objP4 = fetVar.P();
            if (zI || objP4 == cl5Var) {
                objP4 = new qw80((Object) ckdVar, (Object) function2, (byte) 28);
                fetVar.o0(objP4);
            }
            m0x0.D((Function0) objP4, fetVar);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean zI2 = fetVar.i(ckdVar) | (i3 == 4);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == cl5Var) {
                objP5 = new ij90(ckdVar, z, b);
                fetVar.o0(objP5);
            }
            s0x.h(boolValueOf, ckdVar, null, (Function1) objP5, fetVar, i3, 4);
            boolean zI3 = fetVar.i(rb5Var) | fetVar.i(ckdVar);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == cl5Var) {
                objP6 = new zga0((Object) rb5Var, (Object) ckdVar, (byte) 20);
                fetVar.o0(objP6);
            }
            m0x0.n(rb5Var, ckdVar, (Function1) objP6, fetVar);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20(z, (Object) function2, i, (byte) 13);
        }
    }

    public static final void f(mm40 mm40Var, qwe0 qwe0Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        byte b;
        Object obj;
        pkk0 pkk0Var;
        byte b2;
        Object obj2;
        cqqVar.getClass();
        function1.getClass();
        fetVar.g0(-1644508674);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(qwe0Var) ? 32 : 16) | (fetVar.i(function1) ? 2048 : 1024);
        int i3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float f = xfn.a(fetVar).d;
            q7f0 q7f0Var = qwe0Var.f29432a;
            boolean zE = fetVar.e(q7f0Var == null ? -1 : q7f0Var.ordinal());
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            Object obj4 = objP;
            if (zE || objP == obj3) {
                Object xczVar = new xcz(i3, 3, i3);
                fetVar.o0(xczVar);
                obj4 = xczVar;
            }
            xcz xczVar2 = (xcz) obj4;
            pz40 pz40VarD = vcc.D(xczVar2.g, fetVar);
            pkk0 pkk0Var2 = (pkk0) fetVar.k(bmd.q);
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objP2 = fetVar.P();
            Object obj5 = objP2;
            if (z || objP2 == obj3) {
                Object objE = androidx.compose.runtime.e.e(qwe0Var.c);
                fetVar.o0(objE);
                obj5 = objE;
            }
            pz40 pz40Var = (pz40) obj5;
            boolean zG = fetVar.g((a4x) pz40Var.getValue());
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj3) {
                a4x a4xVar = (a4x) pz40Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : a4xVar) {
                    if (((y0f0) obj6) instanceof sqq) {
                        arrayList.add(obj6);
                    }
                }
                int iA = wp20.a(r3d.q(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((y0f0) it.next()).getKey(), new cqq());
                }
                fetVar.o0(linkedHashMap);
                objP3 = linkedHashMap;
            }
            Map map = (Map) objP3;
            Object objF = androidx.compose.runtime.e.f(function1, fetVar);
            boolean zG2 = fetVar.g(xczVar2) | fetVar.g(pkk0Var2);
            Object objP4 = fetVar.P();
            yje yjeVar = null;
            if (zG2 || objP4 == obj3) {
                b = 1;
                Object pigVar = new pig(xczVar2, pkk0Var2, yjeVar, b);
                fetVar.o0(pigVar);
                obj = pigVar;
            } else {
                b = 1;
                obj = objP4;
            }
            m0x0.t(fetVar, q7f0Var, (Function2) obj);
            byte b3 = b;
            u0f0 u0f0Var = qwe0Var.b;
            if (u0f0Var == null) {
                fetVar.e0(1135126873);
                fetVar.r(false);
                b2 = 0;
                xczVar2 = xczVar2;
                pkk0Var = pkk0Var2;
                i2 = i2;
                pz40VarD = pz40VarD;
                wpqVar = wpqVar;
                b3 = b3;
            } else {
                fetVar.e0(1135126874);
                boolean z2 = (((i4 == 32 ? b3 : (byte) 0) | (fetVar.e(u0f0Var.ordinal()) ? 1 : 0)) == true ? 1 : 0) | (fetVar.g(xczVar2) ? 1 : 0) | (fetVar.g(objF) ? 1 : 0);
                Object objP5 = fetVar.P();
                if (z2 || objP5 == obj3) {
                    pkk0Var = pkk0Var2;
                    Object wmqVar = new wmq((Object) qwe0Var, (Object) xczVar2, (Object) u0f0Var, objF, (yje) null, (byte) 22);
                    fetVar.o0(wmqVar);
                    objP5 = wmqVar;
                } else {
                    pkk0Var = pkk0Var2;
                }
                m0x0.t(fetVar, u0f0Var, (Function2) objP5);
                b2 = 0;
                fetVar.r(false);
            }
            boolean zG3 = fetVar.g(pz40VarD) | fetVar.i(wpqVar) | fetVar.g(pkk0Var);
            Object objP6 = fetVar.P();
            if (zG3 || objP6 == obj3) {
                objP6 = new nwe0(pz40VarD, cqqVar, wpqVar, pkk0Var, null, (byte) 0);
                fetVar.o0(objP6);
            }
            m0x0.t(fetVar, xczVar2, (Function2) objP6);
            a4x a4xVar2 = (a4x) pz40Var.getValue();
            boolean zG4 = fetVar.g(pz40Var) | fetVar.g(xczVar2) | fetVar.i(map);
            Object objP7 = fetVar.P();
            if (zG4 || objP7 == obj3) {
                objP7 = new owe0(xczVar2, map, pz40Var, null, (byte) 0);
                fetVar.o0(objP7);
            }
            m0x0.t(fetVar, a4xVar2, (Function2) objP7);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "REGISTRATION_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = knm0.f(s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7), fetVar);
            boolean z3 = (fetVar.g(pz40Var) ? 1 : 0) | (fetVar.d(f) ? 1 : 0) | (fetVar.i(map) ? 1 : 0);
            if ((i2 & 7168) != 2048) {
                b3 = b2;
            }
            int i5 = (z3 ? 1 : 0) | b3;
            Object objP8 = fetVar.P();
            if (i5 != 0 || objP8 == obj3) {
                function2 = function1;
                Object gomVar = new gom(pz40Var, f, map, function2);
                fetVar.o0(gomVar);
                obj2 = gomVar;
            } else {
                function2 = function1;
                obj2 = objP8;
            }
            b8k0.e(mm40VarE0, xczVar2, ch80VarF, null, null, null, false, null, (Function1) obj2, fetVar, 100663296, 248);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) qwe0Var, (Object) cqqVar, function2, i, (byte) 10);
        }
    }

    public static final void g(int i, fet fetVar) {
        fetVar.g0(2047847159);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40.b, xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 8.0f, 2), 232.0f), 1.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ogj0(i, (byte) 11);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1007561454);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new thj0((byte) 7);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, null, null, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | 817889280, 382);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0g(mm40Var, i, b);
        }
    }

    public static final void i(mm40 mm40Var, g5a0 g5a0Var, w6n w6nVar, rpe rpeVar, Function2 function2, fet fetVar, int i, int i2) {
        z9p z9pVar;
        ugd ugdVarM;
        zfp zfpVar = g5a0Var.b;
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        ugd ugdVarM2 = null;
        z9p z9pVar2 = zfpVar != null ? zfpVar.c : null;
        int i3 = z9pVar2 == null ? -1 : f1k0.f8768a[z9pVar2.ordinal()];
        byte b = 2;
        if (i3 == -1 || i3 == 1) {
            z9pVar = z9p.f44030a;
        } else {
            if (i3 != 2) {
                t9f.b();
                return;
            }
            z9pVar = z9p.b;
        }
        ugd ugdVarM3 = u1c.M(-2115339984, new an80(g5a0Var, w6nVar, b), fetVar);
        if (zfpVar == null) {
            fetVar.e0(-1003572675);
            fetVar.r(false);
            ugdVarM = null;
        } else {
            fetVar.e0(-1003572674);
            ugdVarM = u1c.M(393953252, new bn80(w6nVar, zfpVar, function2, b), fetVar);
            fetVar.r(false);
        }
        if (rpeVar == null) {
            fetVar.e0(-1002984791);
            fetVar.r(false);
        } else {
            fetVar.e0(-1002984790);
            ugdVarM2 = u1c.M(-1039680965, new fzi0((Object) w6nVar, (Object) z9pVar, (Object) rpeVar, (byte) 22), fetVar);
            fetVar.r(false);
        }
        z1x.h(mm40Var, ugdVarM3, ugdVarM, ugdVarM2, fetVar, (i & 14) | 48, 0);
    }

    public static final void j(mm40 mm40Var, wnk0 wnk0Var, f3d f3dVar, fet fetVar, int i) {
        int i2;
        f3d f3dVar2;
        y9q0 y9q0VarC0;
        fet fetVar2 = fetVar;
        wnk0Var.getClass();
        fetVar2.g0(131098664);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(wnk0Var) : fetVar2.i(wnk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f3dVar2 = f3dVar;
            i2 |= fetVar2.g(f3dVar2) ? 256 : 128;
        } else {
            f3dVar2 = f3dVar;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            float fD = 1.0f - f3dVar2.d();
            if (fD < 0.0f) {
                fD = 0.0f;
            }
            vnq0 vnq0Var = wnk0Var.c;
            boolean z = vnq0Var != null;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = epv0.N(s5x0.L(jm40.b, qmk.a(fetVar2).e, 0.0f, 2), fD);
            x5d x5dVarA = w5d.a(uc9.d, gqw0.m, fetVar2, 6);
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
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f, 7), "SPECIAL_EVENT_HEADER_TAG");
            String str = wnk0Var.f39454a;
            if (vnk0.f37722a[wnk0Var.b.ordinal()] == 1) {
                pz40 pz40Var = s6t0.f31722a;
                y9q0VarC0 = r8x.c0(g1t0.p());
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                y9q0VarC0 = r8x.c0(g1t0.s());
            }
            y9q0 y9q0Var = y9q0VarC0;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarE0, staticColors.m123getWhite0d7_KjU(), new n05(qmk.u, qmk.y, idm0.t(2)), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var, fetVar2, 0, 24960, 110576);
            if (z) {
                fetVar2.e0(-355274202);
                v8q0.a(vnq0Var.b, mm40VarN, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 0, 24960, 110584);
                v8q0.a(vnq0Var.f37732a, s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 24.0f, 7), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(-354618800);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) wnk0Var, (Object) f3dVar, i, (byte) 24);
        }
    }

    public static final void k(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, String str) {
        a4x a4xVar2;
        mm40 mm40Var2;
        a4xVar.getClass();
        fetVar.g0(523982412);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(str) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            u23 u23Var = (u23) fetVar.k(bmd.s);
            boolean zI = ((i2 & 896) == 256) | ((i2 & 112) == 32) | fetVar.i(u23Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new rvl0(a4xVar2, str, u23Var, b);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            jm40 jm40Var = jm40.b;
            b8k0.e(jm40Var, null, null, null, null, null, false, null, (Function1) objP, fetVar, 6, 510);
            mm40Var2 = jm40Var;
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pea(mm40Var2, a4xVar2, str, i, (byte) 6);
        }
    }

    public static final wul l(ctf0 ctf0Var) {
        return new wul(iul.e, oe9.f25112a, new ue9(ctf0Var.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), true, false, true);
    }

    public static final i4 m(String str, ArrayList arrayList) {
        ArrayList<pxd0> arrayListU = ohs0.u(str);
        Iterator it = new IntRange(0, 4, 1).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            arrayListU.add((pxd0) ((iNextInt < 0 || iNextInt >= arrayList.size()) ? new pxd0("", "", "", "", new qxd0(null, null, null, null, null)) : arrayList.get(iNextInt)));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListU, 10));
        for (pxd0 pxd0Var : arrayListU) {
            String str2 = pxd0Var.f27749a;
            arrayList2.add(new hfa0(kkg.j, str2, pxd0Var.b, "", pxd0Var.d, str2.equals(str)));
        }
        return dyb.r0(arrayList2);
    }

    public static final List n(List list, int i, ctf0 ctf0Var, Set set, boolean z, boolean z2, String str, v5l0 v5l0Var, wcb wcbVar, boolean z3) {
        list.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d2w d2wVar = (d2w) it.next();
            boolean zContains = set.contains(Long.valueOf(d2wVar.b()));
            String strA = wcbVar != null ? wcbVar.a(d2wVar.d(), d2wVar.g()) : null;
            if (strA == null) {
                strA = "";
            }
            lla llaVarG0 = s0x.g0(d2wVar, i, ctf0Var, zContains, z, z2, v5l0Var, strA, str, z3);
            if (llaVarG0 != null) {
                arrayList.add(llaVarG0);
            }
        }
        if (arrayList.isEmpty()) {
            return iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            nla nlaVar = (nla) obj;
            vvs vvsVar = vvs.f38117a;
            arrayList2.add(new vll0(w6x.q(sre0.f32672a.b(vll0.class).J(), BundleUtil.UNDERLINE_TAG, nlaVar.getKey()), nlaVar, unh0.i0(i2, arrayList), z3));
            i2 = i3;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new agh0(new hjm(ctf0Var.f(R.string.results, new Object[0]), null, null, null, null, null, false, null, null, false, null, null, 8126)));
        lc00VarB.addAll(arrayList2);
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final List o(List list) {
        String str = (String) CollectionsKt.f0(list);
        if (str == null) {
            str = "";
        }
        return StringsKt__StringsKt.split$default(kotlin.text.c.r(str, Separators.STAR, "", false), new String[]{"-"}, false, 0, 6, null);
    }

    public static Bitmap p(int i, Context context, List list) {
        int i2;
        context.getClass();
        list.getClass();
        if (list.isEmpty() || i <= 0) {
            return null;
        }
        float size = 360.0f / list.size();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i3 = i / 2;
        float f = i3 * 0.73f;
        int iB = si30.b(f);
        double dTan = Math.tan(Math.toRadians(((double) (360.0f / list.size())) / 2.0d));
        int iA = si30.a(((((double) (si30.b(f) * 2)) * dTan) / (1.0d + dTan)) * 0.8999999761581421d);
        int i4 = iA / 2;
        int i5 = i3 - i4;
        int i6 = (i3 - iB) - i4;
        Rect rect = new Rect(i5, i6, i5 + iA, iA + i6);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iav0 iav0Var = (iav0) it.next();
            switch (iav0Var.b.ordinal()) {
                case 0:
                    i2 = R.drawable.ic_wheel_nothing;
                    break;
                case 1:
                    i2 = R.drawable.ic_wheel_double_bonus;
                    break;
                case 2:
                    i2 = R.drawable.ic_wheel_return_half;
                    break;
                case 3:
                    i2 = R.drawable.ic_wheel_free_bet;
                    break;
                case 4:
                    i2 = R.drawable.ic_wheel_free_spin;
                    break;
                case 5:
                    i2 = R.drawable.ic_wheel_wild_free_bet;
                    break;
                case 6:
                    i2 = R.drawable.ic_wheel_special_bonus;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            Drawable drawable = context.getDrawable(i2);
            if (drawable != null) {
                drawable.setBounds(rect);
                float f2 = iav0Var.b == esr.FREE_SPIN ? 0.0f : -90.0f;
                canvas.save();
                canvas.rotate(f2, rect.centerX(), rect.centerY());
                drawable.draw(canvas);
                canvas.restore();
                float f3 = i / 2.0f;
                canvas.rotate(size, f3, f3);
            }
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap q(b1x b1xVar) {
        int format = b1xVar.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(b1xVar.j(), b1xVar.f(), Bitmap.Config.ARGB_8888);
            b1xVar.l0()[0].i().rewind();
            ImageProcessingUtil.d(bitmapCreateBitmap, b1xVar.l0()[0].i(), b1xVar.l0()[0].k());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.b(b1xVar);
        }
        if (format != 256 && format != 4101) {
            c99.k(b1xVar.getFormat(), "Incorrect image format of the input image proxy: ", ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            return null;
        }
        if (!x(b1xVar.getFormat())) {
            ohq.h(b1xVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer byteBufferI = b1xVar.l0()[0].i();
        int iCapacity = byteBufferI.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferI.rewind();
        byteBufferI.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        v4i0.p("Decode jpeg byte array failed");
        return null;
    }

    public static final double r(a820 a820Var) {
        ko7 ko7Var = a820Var.c;
        if (ko7Var.equals(ho7.b)) {
            return a820Var.g.c.b.f34633a;
        }
        if (ko7Var.equals(jo7.b)) {
            return a820Var.e.f27665a.b.f34633a;
        }
        if (ko7Var.equals(io7.b)) {
            return 0.0d;
        }
        t9f.b();
        return 0.0d;
    }

    public static final double s(int i, List list) {
        String str = (String) CollectionsKt.W(i, list);
        if (str != null) {
            return Double.parseDouble(str);
        }
        return 0.0d;
    }

    public static final br40 t(ctf0 ctf0Var, int i, ar40 ar40Var, Object obj) {
        ctf0Var.getClass();
        return new br40(obj, new wul(lul.e, oe9.f25112a, new ue9(ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0))), true, false, false), ar40Var);
    }

    public static final String u(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static final boolean v(List list, vr20 vr20Var, long j) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ru6 ru6Var = (ru6) it.next();
            if (ru6Var.d == j && ru6Var.h == vr20Var.b && ru6Var.g == vr20Var.m.f30476a && ru6Var.f == vr20Var.f) {
                return true;
            }
        }
        return false;
    }

    public static final boolean w(ire0 ire0Var) {
        if (ire0Var instanceof uhy) {
            Field fieldY = uvw.y(ire0Var);
            if (!(fieldY != null ? fieldY.isAccessible() : true)) {
                return false;
            }
            Method methodZ = uvw.z(ire0Var.d());
            if (!(methodZ != null ? methodZ.isAccessible() : true)) {
                return false;
            }
            Method methodZ2 = uvw.z(((uhy) ire0Var).e());
            if (!(methodZ2 != null ? methodZ2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldY2 = uvw.y(ire0Var);
            if (!(fieldY2 != null ? fieldY2.isAccessible() : true)) {
                return false;
            }
            Method methodZ3 = uvw.z(ire0Var.d());
            if (!(methodZ3 != null ? methodZ3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static boolean x(int i) {
        return i == 256 || i == 4101;
    }

    public static final boolean y(y0f0 y0f0Var) {
        return (y0f0Var instanceof izj0) || (y0f0Var instanceof jsn) || (y0f0Var instanceof l9q0) || (y0f0Var instanceof wl90) || (y0f0Var instanceof qfc0) || (y0f0Var instanceof l090) || (y0f0Var instanceof q090) || (y0f0Var instanceof egt) || (y0f0Var instanceof he8) || (y0f0Var instanceof tpa0);
    }

    public static final Date z(Set set) {
        Object next;
        Object next2;
        Object next3;
        set.getClass();
        Date date = new Date();
        Set set2 = set;
        Iterator it = set2.iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it.next();
        } while (!ntb.W((Date) next2));
        Date date2 = (Date) next2;
        if (date2 == null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set2) {
                if (((Date) obj).after(date)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next3 = it2.next();
                if (it2.hasNext()) {
                    long jAbs = Math.abs(((Date) next3).getTime() - date.getTime());
                    do {
                        Object next4 = it2.next();
                        long jAbs2 = Math.abs(((Date) next4).getTime() - date.getTime());
                        if (jAbs > jAbs2) {
                            next3 = next4;
                            jAbs = jAbs2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next3 = null;
            }
            date2 = (Date) next3;
            if (date2 == null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : set2) {
                    if (((Date) obj2).before(date)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        long jAbs3 = Math.abs(((Date) next).getTime() - date.getTime());
                        do {
                            Object next5 = it3.next();
                            long jAbs4 = Math.abs(((Date) next5).getTime() - date.getTime());
                            if (jAbs3 > jAbs4) {
                                next = next5;
                                jAbs3 = jAbs4;
                            }
                        } while (it3.hasNext());
                    }
                }
                return (Date) next;
            }
        }
        return date2;
    }
}
