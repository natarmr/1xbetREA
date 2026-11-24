package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f23845a;
    public static final ugd d;
    public static final ugd h;
    public static final ugd i;
    public static final ugd b = new ugd(1008254592, false, new zgd(24));
    public static final ugd c = new ugd(1180668673, false, new zgd(25));
    public static final ugd e = new ugd(1525496835, false, new zgd(27));
    public static final ugd f = new ugd(1697910916, false, new zgd(28));
    public static final ugd g = new ugd(629081636, false, new fhd(16));
    public static final String[] j = new String[0];
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] m = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] n = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] o = {67108863, 33554431};
    public static final int[] p = {26, 25};

    static {
        byte b2 = 4;
        f23845a = new ugd(-968832070, false, new i5b(b2));
        byte b3 = 26;
        d = new ugd(1353082754, false, new zgd(b3));
        h = new ugd(1299946728, false, new ihd(b3));
        i = new ugd(1961802382, false, new shd(b2));
    }

    public static final void A(int i2, int i3, fet fetVar, mm40 mm40Var) {
        int i4;
        fetVar.g0(-1536055213);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        }
        if (fetVar.U(i4 & 1, (i4 & 3) != 2)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 138.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i2, i3, (byte) 11);
        }
    }

    public static final void B(mm40 mm40Var, a4x a4xVar, float f2, lh80 lh80Var, fet fetVar, int i2) {
        int i3;
        a4xVar.getClass();
        fetVar.g0(-1849329230);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(lh80Var) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarK = lgb.K(o7k0.d(mm40Var, 1.0f));
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean zI = fetVar.i(a4xVar) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new sfz(a4xVar, f2, b2);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarK, xczVarA, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 >> 3) & 896, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) mm40Var, (Object) a4xVar, f2, (Object) lh80Var, i2, (byte) 10);
        }
    }

    public static String C(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (bArr[i2] & 240) >>> 4;
            char[] cArr = k;
            sb.append(cArr[i3]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    public static void D(long j2, fq80 fq80Var, ncs0[] ncs0VarArr) {
        int i2;
        int iZ;
        while (true) {
            if (fq80Var.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (fq80Var.a() == 0) {
                    i2 = -1;
                    break;
                }
                int iZ2 = fq80Var.z();
                i3 += iZ2;
                if (iZ2 != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            do {
                if (fq80Var.a() == 0) {
                    i4 = -1;
                    break;
                } else {
                    iZ = fq80Var.z();
                    i4 += iZ;
                }
            } while (iZ == 255);
            int i5 = fq80Var.b + i4;
            if (i4 == -1 || i4 > fq80Var.a()) {
                f1t0.g0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = fq80Var.c;
            } else if (i2 == 4 && i4 >= 8) {
                int iZ3 = fq80Var.z();
                int iG = fq80Var.G();
                int iM = iG == 49 ? fq80Var.m() : 0;
                int iZ4 = fq80Var.z();
                if (iG == 47) {
                    fq80Var.N(1);
                }
                boolean z = iZ3 == 181 && (iG == 49 || iG == 47) && iZ4 == 3;
                if (iG == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    E(j2, fq80Var, ncs0VarArr);
                }
            }
            fq80Var.M(i5);
        }
    }

    public static void E(long j2, fq80 fq80Var, ncs0[] ncs0VarArr) {
        int iZ = fq80Var.z();
        if ((iZ & 64) != 0) {
            fq80Var.N(1);
            int i2 = (iZ & 31) * 3;
            int i3 = fq80Var.b;
            for (ncs0 ncs0Var : ncs0VarArr) {
                fq80Var.M(i3);
                ncs0Var.a(i2, fq80Var);
                x0x.K(j2 != -9223372036854775807L);
                ncs0Var.b(j2, 1, i2, 0, null);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final cl F(String str) {
        switch (str.hashCode()) {
            case -1907891481:
                if (str.equals("VoiceSms")) {
                    return cl.c;
                }
                return null;
            case -1295823583:
                if (str.equals("Telegram")) {
                    return cl.d;
                }
                return null;
            case 83257:
                if (str.equals("Sms")) {
                    return cl.b;
                }
                return null;
            case 67066748:
                if (str.equals("Email")) {
                    return cl.f4533a;
                }
                return null;
            case 856196686:
                if (str.equals("FlashCall")) {
                    return cl.e;
                }
                return null;
            default:
                return null;
        }
    }

    public static void H(EditorInfo editorInfo, CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            e7.n(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i2 >= 30) {
            e7.n(editorInfo, charSequence);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i5 < 0 || i3 > length) {
            I(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            I(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            I(editorInfo, charSequence, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(charSequence.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        I(editorInfo, i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + iMin2), charSequence.subSequence(i3, iMin + i3)) : charSequence.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    public static void I(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final ph3 J(ne5 ne5Var, iy3 iy3Var) {
        String str;
        String str2;
        ne5Var.getClass();
        String str3 = ne5Var.f;
        String str4 = ne5Var.e;
        iy3Var.getClass();
        if (iy3Var instanceof ey3) {
            String str5 = ne5Var.c;
            if (str5 != null && (str2 = ne5Var.d) != null) {
                return new ph3(str5, str2);
            }
        } else {
            if (iy3Var instanceof fy3) {
                if (str4 == null || str3 == null) {
                    return null;
                }
                return new ph3(str4, str3);
            }
            if (!(iy3Var instanceof gy3)) {
                if (!(iy3Var instanceof hy3)) {
                    t9f.b();
                    return null;
                }
                if (str4 == null || str3 == null) {
                    return null;
                }
                return new ph3(str4, str3);
            }
            String str6 = ne5Var.f23367a;
            if (str6 != null && (str = ne5Var.b) != null) {
                return new ph3(str6, str);
            }
        }
        return null;
    }

    public static final qu4 K(dn4 dn4Var) {
        String str;
        p94 p94Var = dn4Var.f6349a;
        if (p94Var == null || (str = p94Var.f26589a) == null) {
            jf4.k(null);
            return null;
        }
        String str2 = p94Var.b;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        String str3 = p94Var.c;
        if (str3 == null) {
            str3 = "";
        }
        cl clVarF = F(str3);
        if (clVarF == null) {
            clVarF = cl.f;
        }
        cl clVar = clVarF;
        Iterable iterable = dn4Var.b;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            cl clVarF2 = F((String) it.next());
            if (clVarF2 != null) {
                arrayList.add(clVarF2);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = kotlin.collections.a.c(cl.b);
        }
        List list = listC;
        Iterable iterable2 = dn4Var.c;
        if (iterable2 == null) {
            iterable2 = iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            cl clVarF3 = F((String) it2.next());
            if (clVarF3 != null) {
                arrayList2.add(clVarF3);
            }
        }
        boolean zIsEmpty2 = arrayList2.isEmpty();
        List listC2 = arrayList2;
        if (zIsEmpty2) {
            listC2 = kotlin.collections.a.c(cl.b);
        }
        return new qu4(str, str2, clVar, list, listC2);
    }

    public static final BigDecimal L(q41 q41Var, long j2) {
        Object next;
        BigDecimal bigDecimalH;
        List list = q41Var.f28075a;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Long l2 = ((r31) next).f29764a;
                if (l2 != null && l2.longValue() == j2) {
                    break;
                }
            }
            r31 r31Var = (r31) next;
            if (r31Var != null) {
                String str = r31Var.b;
                if (str != null && (bigDecimalH = kotlin.text.b.h(str)) != null) {
                    return bigDecimalH;
                }
                jf4.k(null);
                return null;
            }
        }
        jf4.k(null);
        return null;
    }

    public static final j72 M(g72 g72Var, ctf0 ctf0Var) {
        qim qimVar;
        afb zebVar;
        List list;
        List list2;
        Iterator it;
        Set set;
        List listC;
        long j2;
        boolean z;
        char c2;
        b8l0 d7l0Var;
        int i2;
        char c3;
        int i3;
        char c4;
        n3l0 l3l0Var;
        hhv hhvVar;
        hhv hhvVar2;
        Set set2;
        hhv hhvVar3;
        hhv hhvVar4;
        long j3;
        boolean z2;
        char c5;
        b8l0 d7l0Var2;
        n3l0 k3l0Var;
        int i4;
        char c6;
        String string;
        ctf0Var.getClass();
        qim qimVarX = hew0.X(g72Var, ctf0Var);
        boolean z3 = g72Var.k;
        f72 f72Var = g72Var.d;
        int i5 = g72Var.m;
        boolean z4 = f72Var instanceof d72;
        List listP = z4 ? vbw0.P(g72Var.f10792a, ((d72) f72Var).f5574a) : iun.f15405a;
        if (f72Var instanceof e72) {
            zebVar = new zeb(14);
        } else if (f72Var instanceof c72) {
            xuz xuzVar = pb10.c;
            pb10 pb10Var = pb10.g;
            xuzVar.getClass();
            zebVar = new yeb(new mdm(xuz.a(pb10Var, i5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        } else {
            if (!z4 || !((d72) f72Var).f5574a.isEmpty()) {
                if (z4 && listP.isEmpty()) {
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.e;
                    xuzVar2.getClass();
                    zebVar = new yeb(new mdm(xuz.a(pb10Var2, i5), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                } else if (z4) {
                    boolean z5 = g72Var.o;
                    Set set3 = g72Var.p;
                    Set set4 = g72Var.r;
                    List list3 = g72Var.q;
                    i8l0 i8l0Var = g72Var.h;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listP.iterator();
                    int i6 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            q3d.p();
                            throw null;
                        }
                        odb odbVar = (odb) next;
                        hhv hhvVarX = vbw0.X((odb) CollectionsKt.W(i6 - 1, listP), (odb) CollectionsKt.W(i7, listP));
                        if (odbVar != null) {
                            boolean z6 = z5;
                            if (odbVar instanceof ndb) {
                                ndb ndbVar = (ndb) odbVar;
                                long j4 = ndbVar.f23331a;
                                list = listP;
                                String strValueOf = String.valueOf(j4);
                                String str = ndbVar.b;
                                list2 = list3;
                                it = it2;
                                String str2 = i8l0Var.f14345a;
                                if (j4 != 0) {
                                    bzu bzuVarE = rz4.e("static", "svg", "sports_v3", str2);
                                    rz4.s(j4, ".svg", bzuVarE);
                                    string = ((StringBuilder) bzuVarE.b).toString();
                                } else {
                                    string = "";
                                }
                                listC = kotlin.collections.a.c(new gsv(new hjm(str, new ojm(127), null, new n0x(string), null, new m0x(R.drawable.ic_glyph_category_new, null, 6), false, null, null, i8l0Var == i8l0.MONOCHROME, null, null, 7636), strValueOf));
                                set = set3;
                            } else {
                                qimVarX = qimVarX;
                                list = listP;
                                list2 = list3;
                                it = it2;
                                i7 = i7;
                                if (odbVar instanceof kdb) {
                                    kdb kdbVar = (kdb) odbVar;
                                    long j5 = kdbVar.f18097a;
                                    List list4 = kdbVar.g;
                                    boolean zContains = set4.contains(Long.valueOf(j5));
                                    long j6 = kdbVar.f18097a;
                                    long j7 = kdbVar.c;
                                    long j8 = kdbVar.d;
                                    Set set5 = set3;
                                    Integer intOrNull = StringsKt.toIntOrNull(kdbVar.f);
                                    int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                                    int size = list4.size();
                                    String str3 = kdbVar.b;
                                    pz40 pz40Var = s6t0.f31722a;
                                    a2l0 a2l0Var = new a2l0(str3, s6t0.b().f33626a.getTextPrimary());
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str4 = kdbVar.e;
                                    if (str4.length() == 0) {
                                        sb.setLength(0);
                                    } else {
                                        if (StringsKt.O(str4, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str4, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                c4 = '/';
                                            } else {
                                                c4 = '/';
                                                sb.append('/');
                                            }
                                            sb.append(StringsKt.y0(str4, c4));
                                        }
                                        sb.setLength(i3);
                                        sb.append(str4);
                                    }
                                    c7l0 c7l0Var = new c7l0(a2l0Var, iIntValue, sb.toString(), null, null, zContains, Integer.valueOf(size), 56);
                                    if (zContains) {
                                        zcl zclVar = qmk.f28987a;
                                        l3l0Var = new m3l0();
                                    } else {
                                        zcl zclVar2 = qmk.f28987a;
                                        l3l0Var = new l3l0(16.0f);
                                    }
                                    n3l0 n3l0Var = l3l0Var;
                                    d4d d4dVar = d4d.BACKGROUND_CONTENT;
                                    sfl0 sfl0Var = zContains ? sfl0.b : sfl0.c;
                                    if (zContains) {
                                        hhv hhvVar5 = hhv.f13084a;
                                        hhvVar = hhvVarX;
                                        if (hhvVar != hhvVar5 && hhvVar != hhv.d) {
                                            hhvVar5 = hhv.b;
                                        }
                                        hhvVar2 = hhvVar5;
                                    } else {
                                        hhvVar = hhvVarX;
                                        hhvVar2 = hhvVar;
                                    }
                                    fql0 fql0Var = new fql0(j6, j7, j8, c7l0Var, d4dVar, n3l0Var, sfl0Var, false, hhvVar2);
                                    if (zContains) {
                                        List listC2 = kotlin.collections.a.c(fql0Var);
                                        ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                                        Iterator it3 = list4.iterator();
                                        int i8 = 0;
                                        while (it3.hasNext()) {
                                            Object next2 = it3.next();
                                            int i9 = i8 + 1;
                                            if (i8 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            mdb mdbVar = (mdb) next2;
                                            boolean z7 = i8 == list4.size() + (-1);
                                            if (z7) {
                                                hhvVar3 = hhv.c;
                                                if (hhvVar != hhvVar3 && hhvVar != hhv.d) {
                                                    hhvVar3 = hhv.b;
                                                }
                                            } else {
                                                hhvVar3 = hhv.b;
                                            }
                                            Iterator it4 = it3;
                                            hhv hhvVar6 = hhvVar3;
                                            List list5 = list4;
                                            long j9 = mdbVar.f21587a;
                                            long j10 = mdbVar.c;
                                            long j11 = mdbVar.d;
                                            if (list2 != null && list2.isEmpty()) {
                                                hhvVar4 = hhvVar;
                                                j3 = j11;
                                                z2 = false;
                                                break;
                                            }
                                            Iterator it5 = list2.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    hhvVar4 = hhvVar;
                                                    j3 = j11;
                                                    z2 = false;
                                                    break;
                                                }
                                                hhvVar4 = hhvVar;
                                                i5p i5pVar = (i5p) it5.next();
                                                j3 = j11;
                                                if (i5pVar.f14203a == j9 && i5pVar.b == mdbVar.c && i5pVar.c == mdbVar.d) {
                                                    z2 = true;
                                                    break;
                                                }
                                                j11 = j3;
                                                hhvVar = hhvVar4;
                                            }
                                            String str5 = mdbVar.g;
                                            String str6 = mdbVar.f;
                                            Integer intOrNull2 = StringsKt.toIntOrNull(str5);
                                            int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
                                            boolean z8 = z2;
                                            Set set6 = set5;
                                            boolean zContains2 = set6.contains(Long.valueOf(j9));
                                            String str7 = mdbVar.b;
                                            if (z6) {
                                                pz40 pz40Var2 = s6t0.f31722a;
                                                a2l0 a2l0Var2 = new a2l0(str7, s6t0.b().f33626a.getTextPrimary());
                                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                                if (str6.length() == 0) {
                                                    sb2.setLength(0);
                                                } else {
                                                    if (StringsKt.O(str6, ujn.h, false)) {
                                                        i4 = 0;
                                                    } else if (kotlin.text.c.x(str6, "https://", false)) {
                                                        i4 = 0;
                                                    } else {
                                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                            c6 = '/';
                                                        } else {
                                                            c6 = '/';
                                                            sb2.append('/');
                                                        }
                                                        sb2.append(StringsKt.y0(str6, c6));
                                                    }
                                                    sb2.setLength(i4);
                                                    sb2.append(str6);
                                                }
                                                d7l0Var2 = new e7l0(a2l0Var2, iIntValue2, sb2.toString(), null, zContains2, zContains2 || set6.size() < 10, 56);
                                            } else {
                                                pz40 pz40Var3 = s6t0.f31722a;
                                                a2l0 a2l0Var3 = new a2l0(str7, s6t0.b().f33626a.getTextPrimary());
                                                StringBuilder sb3 = new StringBuilder(ujn.h);
                                                if (str6.length() == 0) {
                                                    sb3.setLength(0);
                                                } else {
                                                    int i10 = 0;
                                                    if (StringsKt.O(str6, ujn.h, false)) {
                                                        sb3.setLength(i10);
                                                        sb3.append(str6);
                                                    } else if (kotlin.text.c.x(str6, "https://", false)) {
                                                        i10 = 0;
                                                        sb3.setLength(i10);
                                                        sb3.append(str6);
                                                    } else {
                                                        if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                            c5 = '/';
                                                        } else {
                                                            c5 = '/';
                                                            sb3.append('/');
                                                        }
                                                        sb3.append(StringsKt.y0(str6, c5));
                                                    }
                                                }
                                                d7l0Var2 = new d7l0(a2l0Var3, iIntValue2, z8 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, sb3.toString(), null, 112);
                                            }
                                            b8l0 b8l0Var = d7l0Var2;
                                            boolean z9 = !z7;
                                            if (z7 != 0) {
                                                zcl zclVar3 = qmk.f28987a;
                                                k3l0Var = new k3l0();
                                            } else {
                                                k3l0Var = j3l0.f15840a;
                                            }
                                            arrayList2.add(new fql0(j9, j10, j3, b8l0Var, d4d.BACKGROUND_GROUP_SECONDARY, k3l0Var, z7 ? sfl0.e : sfl0.d, z9, hhvVar6));
                                            it3 = it4;
                                            i8 = i9;
                                            list4 = list5;
                                            set5 = set6;
                                            hhvVar = hhvVar4;
                                        }
                                        set2 = set5;
                                        listC = CollectionsKt.q0(listC2, arrayList2);
                                    } else {
                                        set2 = set5;
                                        listC = kotlin.collections.a.c(fql0Var);
                                    }
                                    set = set2;
                                } else {
                                    Set set7 = set3;
                                    set4 = set4;
                                    i8l0Var = i8l0Var;
                                    if (odbVar instanceof ldb) {
                                        ldb ldbVar = (ldb) odbVar;
                                        long j12 = ldbVar.f19842a;
                                        long j13 = ldbVar.c;
                                        long j14 = ldbVar.d;
                                        String str8 = ldbVar.f;
                                        String str9 = ldbVar.e;
                                        Integer intOrNull3 = StringsKt.toIntOrNull(str8);
                                        int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                                        boolean zContains3 = set7.contains(Long.valueOf(j12));
                                        if (list2 != null && list2.isEmpty()) {
                                            set = set7;
                                            j2 = j12;
                                            z = false;
                                            break;
                                        }
                                        Iterator it6 = list2.iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                set = set7;
                                                j2 = j12;
                                                z = false;
                                                break;
                                            }
                                            Iterator it7 = it6;
                                            i5p i5pVar2 = (i5p) it6.next();
                                            set = set7;
                                            j2 = j12;
                                            if (i5pVar2.f14203a == j2 && i5pVar2.b == ldbVar.c && i5pVar2.c == ldbVar.d) {
                                                z = true;
                                                break;
                                            }
                                            it6 = it7;
                                            j12 = j2;
                                            set7 = set;
                                        }
                                        String str10 = ldbVar.b;
                                        if (z6) {
                                            pz40 pz40Var4 = s6t0.f31722a;
                                            a2l0 a2l0Var4 = new a2l0(str10, s6t0.b().f33626a.getTextPrimary());
                                            StringBuilder sb4 = new StringBuilder(ujn.h);
                                            if (str9.length() == 0) {
                                                sb4.setLength(0);
                                            } else {
                                                if (StringsKt.O(str9, ujn.h, false)) {
                                                    i2 = 0;
                                                } else if (kotlin.text.c.x(str9, "https://", false)) {
                                                    i2 = 0;
                                                } else {
                                                    if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                                        c3 = '/';
                                                    } else {
                                                        c3 = '/';
                                                        sb4.append('/');
                                                    }
                                                    sb4.append(StringsKt.y0(str9, c3));
                                                }
                                                sb4.setLength(i2);
                                                sb4.append(str9);
                                            }
                                            d7l0Var = new e7l0(a2l0Var4, iIntValue3, sb4.toString(), null, zContains3, zContains3 || set.size() < 10, 56);
                                        } else {
                                            pz40 pz40Var5 = s6t0.f31722a;
                                            a2l0 a2l0Var5 = new a2l0(str10, s6t0.b().f33626a.getTextPrimary());
                                            StringBuilder sb5 = new StringBuilder(ujn.h);
                                            if (str9.length() == 0) {
                                                sb5.setLength(0);
                                            } else {
                                                int i11 = 0;
                                                if (StringsKt.O(str9, ujn.h, false)) {
                                                    sb5.setLength(i11);
                                                    sb5.append(str9);
                                                } else if (kotlin.text.c.x(str9, "https://", false)) {
                                                    i11 = 0;
                                                    sb5.setLength(i11);
                                                    sb5.append(str9);
                                                } else {
                                                    if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                                        c2 = '/';
                                                    } else {
                                                        c2 = '/';
                                                        sb5.append('/');
                                                    }
                                                    sb5.append(StringsKt.y0(str9, c2));
                                                }
                                            }
                                            d7l0Var = new d7l0(a2l0Var5, iIntValue3, z ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, sb5.toString(), null, 112);
                                        }
                                        b8l0 b8l0Var2 = d7l0Var;
                                        zcl zclVar4 = qmk.f28987a;
                                        listC = kotlin.collections.a.c(new fql0(j2, j13, j14, b8l0Var2, d4d.BACKGROUND_CONTENT, new l3l0(16.0f), sfl0.f32124a, false, hhvVarX));
                                    } else {
                                        set = set7;
                                        if (odbVar instanceof mdb) {
                                            listC = iun.f15405a;
                                        }
                                    }
                                }
                                w3d.u(arrayList, listC);
                                z5 = z6;
                                listP = list;
                                i8l0Var = i8l0Var;
                                list3 = list2;
                                it2 = it;
                                i6 = i7;
                                qimVarX = qimVarX;
                                set3 = set;
                                set4 = set4;
                            }
                            w3d.u(arrayList, listC);
                            z5 = z6;
                            listP = list;
                            i8l0Var = i8l0Var;
                            list3 = list2;
                            it2 = it;
                            i6 = i7;
                            qimVarX = qimVarX;
                            set3 = set;
                            set4 = set4;
                        }
                        t9f.b();
                        return null;
                    }
                    qimVar = qimVarX;
                    zebVar = new xeb(dyb.o0(arrayList), i4w0.Q(g72Var, ctf0Var));
                } else {
                    qimVar = qimVarX;
                    zebVar = new zeb(14);
                }
                return new j72(qimVar, zebVar, z3, g72Var.l);
            }
            xuz xuzVar3 = pb10.c;
            pb10 pb10Var3 = pb10.g;
            xuzVar3.getClass();
            zebVar = new yeb(new mdm(xuz.a(pb10Var3, i5), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        qimVar = qimVarX;
        return new j72(qimVar, zebVar, z3, g72Var.l);
    }

    public static void N(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2];
            long j3 = j2 / 67108864;
            jArr[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = jArr[i3] + j3;
            jArr[i3] = j4;
            long j5 = j4 / 33554432;
            jArr[i3] = j4 - (j5 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j5;
        }
        long j6 = jArr[0];
        long j7 = jArr[10];
        long j8 = j6 + (j7 << 4);
        jArr[0] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[0] = j9;
        long j10 = j9 + j7;
        jArr[0] = j10;
        jArr[10] = 0;
        long j11 = j10 / 67108864;
        jArr[0] = j10 - (j11 << 26);
        jArr[1] = jArr[1] + j11;
    }

    public static void O(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        R(jArr4, jArr2, jArr3);
        P(jArr4);
        N(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static void P(long[] jArr) {
        long j2 = jArr[8];
        long j3 = jArr[18];
        long j4 = j2 + (j3 << 4);
        jArr[8] = j4;
        long j5 = j4 + (j3 << 1);
        jArr[8] = j5;
        jArr[8] = j5 + j3;
        long j6 = jArr[7];
        long j7 = jArr[17];
        long j8 = j6 + (j7 << 4);
        jArr[7] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[7] = j9;
        jArr[7] = j9 + j7;
        long j10 = jArr[6];
        long j11 = jArr[16];
        long j12 = j10 + (j11 << 4);
        jArr[6] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[6] = j13;
        jArr[6] = j13 + j11;
        long j14 = jArr[5];
        long j15 = jArr[15];
        long j16 = j14 + (j15 << 4);
        jArr[5] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[5] = j17;
        jArr[5] = j17 + j15;
        long j18 = jArr[4];
        long j19 = jArr[14];
        long j20 = j18 + (j19 << 4);
        jArr[4] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[4] = j21;
        jArr[4] = j21 + j19;
        long j22 = jArr[3];
        long j23 = jArr[13];
        long j24 = j22 + (j23 << 4);
        jArr[3] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[3] = j25;
        jArr[3] = j25 + j23;
        long j26 = jArr[2];
        long j27 = jArr[12];
        long j28 = j26 + (j27 << 4);
        jArr[2] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[2] = j29;
        jArr[2] = j29 + j27;
        long j30 = jArr[1];
        long j31 = jArr[11];
        long j32 = j30 + (j31 << 4);
        jArr[1] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[1] = j33;
        jArr[1] = j33 + j31;
        long j34 = jArr[0];
        long j35 = jArr[10];
        long j36 = j34 + (j35 << 4);
        jArr[0] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[0] = j37;
        jArr[0] = j37 + j35;
    }

    public static void Q(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j3 = j2 * 2;
        long j4 = jArr2[1];
        long j5 = jArr2[2];
        long j6 = jArr2[3];
        long j7 = jArr2[4];
        long j8 = jArr2[5];
        long j9 = jArr2[6];
        long j10 = jArr2[7];
        long j11 = jArr2[8];
        long j12 = jArr2[9];
        long[] jArr3 = {j2 * j2, j3 * j4, ((j2 * j5) + (j4 * j4)) * 2, ((j2 * j6) + (j4 * j5)) * 2, (j3 * j7) + (j4 * 4 * j6) + (j5 * j5), ((j2 * j8) + (j4 * j7) + (j5 * j6)) * 2, ((j4 * 2 * j8) + (j2 * j9) + (j5 * j7) + (j6 * j6)) * 2, ((j2 * j10) + (j4 * j9) + (j5 * j8) + (j6 * j7)) * 2, (((((j6 * j8) + (j4 * j10)) * 2) + (j2 * j11) + (j5 * j9)) * 2) + (j7 * j7), ((j2 * j12) + (j4 * j11) + (j5 * j10) + (j6 * j9) + (j7 * j8)) * 2, ((((j4 * j12) + (j6 * j10)) * 2) + (j5 * j11) + (j7 * j9) + (j8 * j8)) * 2, ((j5 * j12) + (j6 * j11) + (j7 * j10) + (j8 * j9)) * 2, (((((j6 * j12) + (j8 * j10)) * 2) + (j7 * j11)) * 2) + (j9 * j9), ((j7 * j12) + (j8 * j11) + (j9 * j10)) * 2, ((j8 * 2 * j12) + (j9 * j11) + (j10 * j10)) * 2, ((j9 * j12) + (j10 * j11)) * 2, (j10 * 4 * j12) + (j11 * j11), j11 * 2 * j12, 2 * j12 * j12};
        P(jArr3);
        N(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void R(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j2 = jArr2[0];
        long j3 = jArr3[1] * j2;
        long j4 = jArr2[1];
        long j5 = jArr3[0];
        jArr[1] = (j4 * j5) + j3;
        long j6 = jArr2[1];
        long j7 = jArr3[1];
        jArr[2] = (jArr2[2] * j5) + (jArr3[2] * j2) + (j6 * 2 * j7);
        long j8 = jArr3[2];
        long j9 = jArr2[2];
        jArr[3] = (jArr2[3] * j5) + (jArr3[3] * j2) + (j9 * j7) + (j6 * j8);
        long j10 = jArr3[3];
        long j11 = jArr2[3];
        jArr[4] = (jArr2[4] * j5) + (jArr3[4] * j2) + (((j11 * j7) + (j6 * j10)) * 2) + (j9 * j8);
        long j12 = jArr3[4];
        long j13 = (j6 * j12) + (j11 * j8) + (j9 * j10);
        long j14 = jArr2[4];
        jArr[5] = (jArr2[5] * j5) + (jArr3[5] * j2) + (j14 * j7) + j13;
        long j15 = jArr3[5];
        long j16 = jArr2[5];
        jArr[6] = (jArr2[6] * j5) + (jArr3[6] * j2) + (j14 * j8) + (j9 * j12) + (((j16 * j7) + (j6 * j15) + (j11 * j10)) * 2);
        long j17 = (j16 * j8) + (j9 * j15) + (j14 * j10) + (j11 * j12);
        long j18 = jArr3[6];
        long j19 = (j6 * j18) + j17;
        long j20 = jArr2[6];
        jArr[7] = (jArr2[7] * j5) + (jArr3[7] * j2) + (j20 * j7) + j19;
        long j21 = jArr3[7];
        long j22 = (j6 * j21) + (j16 * j10) + (j11 * j15);
        long j23 = jArr2[7];
        long j24 = (((j23 * j7) + j22) * 2) + (j14 * j12);
        jArr[8] = (jArr2[8] * j5) + (jArr3[8] * j2) + (j20 * j8) + (j9 * j18) + j24;
        long j25 = (j23 * j8) + (j9 * j21) + (j20 * j10) + (j11 * j18) + (j16 * j12) + (j14 * j15);
        long j26 = jArr3[8];
        long j27 = (j6 * j26) + j25;
        long j28 = jArr2[8];
        jArr[9] = (jArr2[9] * j5) + (j2 * jArr3[9]) + (j28 * j7) + j27;
        long j29 = (j23 * j10) + (j11 * j21) + (j16 * j15);
        long j30 = jArr3[9];
        long j31 = jArr2[9];
        long j32 = j14 * j18;
        jArr[10] = (j28 * j8) + (j9 * j26) + (j20 * j12) + j32 + (((j7 * j31) + (j6 * j30) + j29) * 2);
        long j33 = j9 * j30;
        long j34 = j8 * j31;
        jArr[11] = j34 + j33 + (j28 * j10) + (j11 * j26) + (j23 * j12) + (j14 * j21) + (j20 * j15) + (j16 * j18);
        long j35 = j11 * j30;
        long j36 = j10 * j31;
        long j37 = j28 * j12;
        jArr[12] = j37 + (j14 * j26) + ((j36 + j35 + (j23 * j15) + (j16 * j21)) * 2) + (j20 * j18);
        long j38 = j14 * j30;
        long j39 = j12 * j31;
        jArr[13] = j39 + j38 + (j28 * j15) + (j16 * j26) + (j23 * j18) + (j20 * j21);
        long j40 = j15 * j31;
        long j41 = j28 * j18;
        jArr[14] = j41 + (j20 * j26) + ((j40 + (j16 * j30) + (j23 * j21)) * 2);
        long j42 = j20 * j30;
        long j43 = j18 * j31;
        jArr[15] = j43 + j42 + (j28 * j21) + (j23 * j26);
        jArr[16] = (((j21 * j31) + (j23 * j30)) * 2) + (j28 * j26);
        jArr[17] = (j26 * j31) + (j28 * j30);
        jArr[18] = j31 * 2 * j30;
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static byte[] T(long[] jArr) {
        long j2;
        int[] iArr;
        int i2;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j2 = 19;
            iArr = p;
            if (i4 >= 2) {
                break;
            }
            int i5 = 0;
            while (i5 < 9) {
                long j3 = jArrCopyOf[i5];
                int i6 = iArr[i5 & 1];
                int i7 = -((int) (((j3 >> 31) & j3) >> i6));
                jArrCopyOf[i5] = j3 + ((long) (i7 << i6));
                i5++;
                jArrCopyOf[i5] = jArrCopyOf[i5] - ((long) i7);
            }
            long j4 = jArrCopyOf[9];
            int i8 = -((int) (((j4 >> 31) & j4) >> 25));
            jArrCopyOf[9] = j4 + ((long) (i8 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i8) * 19);
            i4++;
        }
        long j5 = jArrCopyOf[0];
        int i9 = -((int) (((j5 >> 31) & j5) >> 26));
        jArrCopyOf[0] = j5 + ((long) (i9 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i9);
        int i10 = 0;
        while (true) {
            iArr2 = o;
            if (i10 >= 2) {
                break;
            }
            int i11 = i3;
            while (i11 < 9) {
                long j6 = jArrCopyOf[i11];
                int i12 = i11 & 1;
                int i13 = i3;
                int i14 = i10;
                int i15 = (int) (j6 >> iArr[i12]);
                jArrCopyOf[i11] = j6 & ((long) iArr2[i12]);
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] + ((long) i15);
                i3 = i13;
                j2 = j2;
                i10 = i14;
            }
            i10++;
        }
        int i16 = i3;
        long j7 = jArrCopyOf[9];
        jArrCopyOf[9] = j7 & 33554431;
        long j8 = (((long) ((int) (j7 >> 25))) * j2) + jArrCopyOf[i16];
        jArrCopyOf[i16] = j8;
        int i17 = ~((((int) j8) - 67108845) >> 31);
        for (int i18 = 1; i18 < 10; i18++) {
            int i19 = ~(((int) jArrCopyOf[i18]) ^ iArr2[i18 & 1]);
            int i20 = i19 & (i19 << 16);
            int i21 = i20 & (i20 << 8);
            int i22 = i21 & (i21 << 4);
            int i23 = i22 & (i22 << 2);
            i17 &= (i23 & (i23 << 1)) >> 31;
        }
        jArrCopyOf[i16] = jArrCopyOf[i16] - ((long) (67108845 & i17));
        long j9 = 33554431 & i17;
        jArrCopyOf[1] = jArrCopyOf[1] - j9;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - ((long) (67108863 & i17));
            int i24 = i2 + 1;
            jArrCopyOf[i24] = jArrCopyOf[i24] - j9;
        }
        for (int i25 = i16; i25 < 10; i25++) {
            jArrCopyOf[i25] = jArrCopyOf[i25] << n[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = i16; i26 < 10; i26++) {
            int i27 = m[i26];
            long j10 = bArr[i27];
            long j11 = jArrCopyOf[i26];
            bArr[i27] = (byte) (j10 | (j11 & 255));
            int i28 = i27 + 1;
            bArr[i28] = (byte) (((long) bArr[i28]) | ((j11 >> 8) & 255));
            int i29 = i27 + 2;
            bArr[i29] = (byte) (((long) bArr[i29]) | ((j11 >> 16) & 255));
            int i30 = i27 + 3;
            bArr[i30] = (byte) (((long) bArr[i30]) | ((j11 >> 24) & 255));
        }
        return bArr;
    }

    public static void U(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static final void a(mm40 mm40Var, zy zyVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1432048043);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(zyVar) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.f17794a;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 36.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zH = fetVar.h(z) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new x9(zyVar, z, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, i3 & 14, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x(mm40Var, zyVar, i2, b2);
        }
    }

    public static final void b(mm40 mm40Var, xy6 xy6Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        xy6Var.getClass();
        td5 td5Var = xy6Var.f41693a;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar2.g0(521109951);
        int i3 = i2 | 6 | (fetVar2.g(xy6Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192) | (fetVar2.i(function3) ? 131072 : 65536);
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            pm80 pm80VarF = a8k0.F(td5Var.b, 0, fetVar2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jr8 jr8Var = jr8.f16991a;
            k7x.b(td5Var.f33749a, null, jr8Var.a(jm40Var), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            fetVar2 = fetVar;
            c(null, xy6Var.b, xy6Var.c, xy6Var.d, xy6Var.e, xy6Var.f, function0, function1, function2, function3, fetVar2, (i3 << 12) & 2146959360);
            efx.h(0, 0, fetVar2, jr8Var.b(jm40Var, gqw0.h));
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var2, xy6Var, function0, function1, function2, function3, i2, (byte) 5);
        }
    }

    public static final void c(mm40 mm40Var, itv itvVar, p580 p580Var, c0s c0sVar, g0d g0dVar, j680 j680Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i2) {
        c0s c0sVar2;
        Function0 function4;
        mm40 mm40Var2;
        float f2;
        boolean z;
        k6z k6zVar;
        Function0 function5 = function2;
        fetVar.g0(1592397379);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(itvVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(p580Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            c0sVar2 = c0sVar;
            i3 |= fetVar.g(c0sVar2) ? 2048 : 1024;
        } else {
            c0sVar2 = c0sVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(g0dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(j680Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function5) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            function4 = function3;
            i3 |= fetVar.i(function4) ? 536870912 : 268435456;
        } else {
            function4 = function3;
        }
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            if (itvVar == null || itvVar.f15370a || p580Var != null) {
                zcl zclVar = qmk.f28987a;
                f2 = 8.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f2 = 0.0f;
            }
            float f3 = f2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.M(o7k0.w(jm40Var, null, false, 3), 16.0f, 20.0f, 16.0f, 34.0f), "BET_GAME_INFO_CONTENT_COLUMN_TAG");
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
            if (itvVar == null || !itvVar.f15370a) {
                fetVar.e0(1472902613);
                fetVar.r(false);
            } else {
                fetVar.e0(1472698881);
                v3c.w(jm40Var, itvVar, function0, fetVar, (i3 & 112) | 6 | ((i3 >> 12) & 896));
                fetVar.r(false);
            }
            if (p580Var != null) {
                fetVar.e0(1472954352);
                if (p580Var.a()) {
                    fetVar.e0(1710085684);
                    k6zVar = (k6z) fetVar.k(bmd.n);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1710086608);
                    fetVar.r(false);
                    k6zVar = k6z.f17794a;
                }
                obc.d(bmd.n.a(k6zVar), u1c.M(1219081019, new fa2((Object) p580Var, (byte) 29), fetVar), fetVar, 56);
                z = false;
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(1473358933);
                fetVar.r(false);
            }
            int i4 = i3 >> 18;
            boolean z2 = z;
            fur.a(s5x0.N(jm40Var, 0.0f, f3, 0.0f, 0.0f, 13), c0sVar2, function1, function4, fetVar, ((i3 >> 6) & 112) | ((i3 >> 15) & 896) | (i4 & 7168));
            if (j680Var != null) {
                fetVar.e0(1473650209);
                uvw.h(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), j680Var, fetVar, (i3 >> 12) & 112);
                fetVar.r(z2);
            } else {
                fetVar.e0(1473823189);
                fetVar.r(z2);
            }
            if (g0dVar == null || !g0dVar.c) {
                function5 = function2;
                fetVar.e0(1474179317);
                fetVar.r(z2);
            } else {
                fetVar.e0(1473919847);
                int i5 = ((i3 >> 9) & 112) | (i4 & 896);
                function5 = function2;
                sj3.b(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), g0dVar, function5, fetVar, i5);
                fetVar.r(z2);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ej4(mm40Var2, itvVar, p580Var, c0sVar, g0dVar, j680Var, function0, function1, function5, function3, i2);
        }
    }

    public static final void d(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2, int i3) {
        int i4;
        Function0 function1;
        Function0 function2;
        fetVar.g0(-1382700435);
        int i5 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16);
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
        } else {
            i4 = i5 | (fetVar.i(function0) ? 256 : 128);
        }
        byte b2 = 1;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            if (i6 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new fno0(b2);
                    fetVar.o0(objP);
                }
                function2 = (Function0) objP;
            } else {
                function2 = function0;
            }
            jcb.l(mm40Var, mdmVar, false, function2, fetVar, (i4 & 126) | ((i4 << 3) & 7168), 4);
            function1 = function2;
        } else {
            fetVar.X();
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dpn(mm40Var, mdmVar, function1, i2, i3, (byte) 1);
        }
    }

    public static final void e(int i2, o8w o8wVar, x77 x77Var, Function1 function1, fet fetVar, int i3) {
        int i4;
        fetVar.g0(-1032683982);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? fetVar.g(o8wVar) : fetVar.i(o8wVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.g(x77Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i5 = i4;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            if (i2 != 1 || x77Var.i == null) {
                fetVar.e0(163405040);
                fetVar.r(false);
            } else {
                fetVar.e0(162506505);
                qgv0 qgv0Var = x77Var.i;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                String str = qgv0Var.b;
                pz40 pz40Var = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                gy30 gy30Var = new gy30(new ux30(staticColors.m123getWhite0d7_KjU(), staticColors.m131getWhite800d7_KjU(), str, qgv0Var.c), null, new zx30(new n0x(qgv0Var.d), 3), qgv0Var.e, null, null, 242);
                boolean zG = fetVar.g(qgv0Var) | ((i5 & 7168) == 2048);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new o0k0((Object) function1, (Object) qgv0Var, (byte) 25);
                    fetVar.o0(objP);
                }
                jiq0.y(mm40VarN, gy30Var, (Function0) objP, null, null, fetVar, 0, 24);
                fetVar.r(false);
            }
            if (o8wVar instanceof qp30) {
                fetVar.e0(163465676);
                t9x.i(null, (qp30) o8wVar, function1, fetVar, (i5 & 112) | ((i5 >> 3) & 896));
                fetVar.r(false);
            } else {
                fetVar.e0(163592528);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vo6(i2, o8wVar, x77Var, function1, i3);
        }
    }

    public static final void f(xcz xczVar, x77 x77Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1616816628);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xczVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(x77Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            q0x.m(xczVar, x77Var, function1, fetVar, i3 & 1022);
            obc.d(xf80.f40779a.a(null), u1c.M(1024923980, new znk(xczVar, x77Var, function1, (byte) 3), fetVar), fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kq40(xczVar, x77Var, function1, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0085  */
    /* JADX WARN: Code duplicated, block: B:57:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void g(mm40 mm40Var, u12 u12Var, boolean z, ugd ugdVar, fet fetVar, int i2, int i3) {
        int i4;
        boolean z2;
        boolean z3;
        u12 u12Var2;
        mm40 mm40Var2;
        boolean z4;
        yfe0 yfe0VarU;
        u12 u12Var3;
        tj30 tj30VarC;
        boolean zG;
        Object objP;
        int i5;
        fetVar.g0(380139498);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= fetVar.g(u12Var) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= fetVar.h(z2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if (fetVar.i(ugdVar)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i4 & 1, z3)) {
                if (i6 != 0) {
                    mm40Var = jm40.b;
                }
                if (i7 != 0) {
                    u12Var3 = gqw0.f11754a;
                } else {
                    u12Var3 = u12Var;
                }
                if (i8 != 0) {
                    z2 = false;
                }
                tj30VarC = zq8.c(u12Var3, z2);
                zG = fetVar.g(tj30VarC) | ((i4 & 7168) == 2048);
                objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new t87(tj30VarC, ugdVar, (byte) 22);
                    fetVar.o0(objP);
                }
                x4n0.a(mm40Var, (Function2) objP, fetVar, i4 & 14, 0);
                u12Var2 = u12Var3;
                z4 = z2;
                mm40Var2 = mm40Var;
            } else {
                fetVar.X();
                u12Var2 = u12Var;
                mm40Var2 = mm40Var;
                z4 = z2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new kr8(mm40Var2, u12Var2, z4, ugdVar, i2, i3, (byte) 0);
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 3072) == 0) {
            if (fetVar.i(ugdVar)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i4 & 1, z3)) {
            if (i6 != 0) {
                mm40Var = jm40.b;
            }
            if (i7 != 0) {
                u12Var3 = gqw0.f11754a;
            } else {
                u12Var3 = u12Var;
            }
            if (i8 != 0) {
                z2 = false;
            }
            tj30VarC = zq8.c(u12Var3, z2);
            zG = fetVar.g(tj30VarC) | ((i4 & 7168) == 2048);
            objP = fetVar.P();
            if (zG) {
                objP = new t87(tj30VarC, ugdVar, (byte) 22);
                fetVar.o0(objP);
            } else {
                objP = new t87(tj30VarC, ugdVar, (byte) 22);
                fetVar.o0(objP);
            }
            x4n0.a(mm40Var, (Function2) objP, fetVar, i4 & 14, 0);
            u12Var2 = u12Var3;
            z4 = z2;
            mm40Var2 = mm40Var;
        } else {
            fetVar.X();
            u12Var2 = u12Var;
            mm40Var2 = mm40Var;
            z4 = z2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr8(mm40Var2, u12Var2, z4, ugdVar, i2, i3, (byte) 0);
        }
    }

    public static final void h(mm40 mm40Var, mdm mdmVar, boolean z, Function0 function0, fet fetVar, int i2, int i3) {
        int i4;
        Function0 function1;
        Function0 function2;
        fetVar.g0(2036423844);
        int i5 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(mdmVar) ? 32 : 16);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
        } else {
            i4 = i5 | (fetVar.i(function0) ? 2048 : 1024);
        }
        if (fetVar.U(i4 & 1, (i4 & 1043) != 1042)) {
            if (i6 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new ej8((byte) 5);
                    fetVar.o0(objP);
                }
                function2 = (Function0) objP;
            } else {
                function2 = function0;
            }
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
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
            jcb.l(null, mdmVar, false, function2, fetVar, i4 & 7280, 5);
            fetVar.r(true);
            function1 = function2;
        } else {
            fetVar.X();
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bx8(mm40Var, mdmVar, z, function1, i2, i3, (byte) 1);
        }
    }

    public static final void i(final mm40 mm40Var, final dy8 dy8Var, final d9z d9zVar, final boolean z, final Function1 function1, fet fetVar, final int i2) {
        yfe0 yfe0VarU;
        Function2 function2;
        boolean z2;
        float f2;
        fetVar.g0(-816699243);
        int i3 = i2 | (fetVar.g(dy8Var) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            float fT = fbc.T(fetVar);
            if (fT == 0.0f) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function2 = new Function2(mm40Var, dy8Var, d9zVar, z, function1, i2, b2) { // from class: a.ex8

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f8565a;
                    public final /* synthetic */ mm40 b;
                    public final /* synthetic */ dy8 c;
                    public final /* synthetic */ d9z d;
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ Function1 f;

                    {
                        this.f8565a = b2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f8565a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(7);
                                nnw0.i(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL2 = x8x.L(7);
                                nnw0.i(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                zcl zclVar = qmk.f28987a;
                float f3 = 180.0f + fT;
                float fB = pkd.b(f3, fetVar);
                float f4 = 56.0f + fT;
                boolean z3 = dy8Var.c.b instanceof nlm;
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    pel pelVar = new pel();
                    qt2 qt2Var = qt2.f29279a;
                    pelVar.a(qt2Var, fB);
                    pelVar.a(qt2.b, 0.0f);
                    float[] fArr = pelVar.b;
                    ArrayList arrayList = pelVar.f26860a;
                    int size = arrayList.size();
                    nx3.a(size, fArr.length);
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    fArrCopyOfRange.getClass();
                    objP = new rv2(new vtj(arrayList, fArrCopyOfRange), qt2Var);
                    fetVar.o0(objP);
                }
                rv2 rv2Var = (rv2) objP;
                Context context = (Context) fetVar.k(dy2.b);
                yje yjeVar = null;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                Window window = activity != null ? activity.getWindow() : null;
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zI = ((i3 & 7168) == 2048) | fetVar.i(window);
                Object objP2 = fetVar.P();
                if (zI || objP2 == obj) {
                    objP2 = new vt8(window, z, (byte) 1);
                    fetVar.o0(objP2);
                }
                s0x.d(boolValueOf, null, (Function1) objP2, fetVar, (i3 >> 9) & 14);
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                boolean zH = fetVar.h(z3) | fetVar.d(fB);
                Object objP3 = fetVar.P();
                if (zH || objP3 == obj) {
                    z2 = z3;
                    f2 = fB;
                    Object cx8Var = new cx8(rv2Var, z2, f2, yjeVar, (byte) 1);
                    fetVar.o0(cx8Var);
                    objP3 = cx8Var;
                } else {
                    z2 = z3;
                    f2 = fB;
                }
                m0x0.v(rv2Var, boolValueOf2, (Function2) objP3, fetVar);
                androidx.compose.runtime.d dVar = zaq0.b;
                y0x0.d(mm40Var, f2, ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(dVar)).getBackground(), 0L, 0.0f, !z2, rv2Var, u1c.M(-336833087, new yw8(dy8Var, f3, f4, function1, z, (byte) 1), fetVar), u1c.M(678270535, new ax8(dy8Var, function1, d9zVar, z), fetVar), fetVar, 805330950, 192);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            function2 = new Function2(mm40Var, dy8Var, d9zVar, z, function1, i2, b3) { // from class: a.ex8

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f8565a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ dy8 c;
                public final /* synthetic */ d9z d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function1 f;

                {
                    this.f8565a = b3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (this.f8565a) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iL = x8x.L(7);
                            nnw0.i(this.b, this.c, this.d, this.e, this.f, (fet) obj2, iL);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iL2 = x8x.L(7);
                            nnw0.i(this.b, this.c, this.d, this.e, this.f, (fet) obj2, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void j(int i2, fet fetVar) {
        fetVar.g0(1554466510);
        if (fetVar.U(i2 & 1, i2 != 0)) {
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 12.0f, 5), 96.0f), 12.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            A(0, 0, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7));
            A(0, 1, fetVar, null);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zc70(i2, (byte) 15);
        }
    }

    public static final void k(hh80 hh80Var, l7m0 l7m0Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(275240212);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(hh80Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            ibk ibkVar = (ibk) l7m0Var.getValue();
            mm40 mm40VarL = s5x0.L(s5x0.I(o7k0.c, hh80Var), xfn.a(fetVar2).d, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            j0x.a(jpm0.t(R.drawable.limits_approve, 6, fetVar2), s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0.0f, fetVar2, 120);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            String str = ibkVar.f14491a;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 109560);
            v8q0.a(ibkVar.b, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 130042);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fbk(hh80Var, l7m0Var, i2, (byte) 0);
        }
    }

    public static final void l(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-600883494);
        byte b2 = 4;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            m8x.y(n0qVar, u1c.M(-1976920674, new quh(l7m0Var, function1, b2), fetVar), u1c.M(-2054910945, new quh(l7m0Var, function1, (byte) 5), fetVar), null, null, 0, backgroundContent, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(1727173097, new v7i0(l7m0Var, (byte) 23), fetVar), fetVar, 805306806, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i2, (byte) 6);
        }
    }

    public static final void m(mm40 mm40Var, Drawable drawable, fet fetVar, int i2) {
        fetVar.g0(1867827884);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.i(drawable) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.S(o7k0.e(mm40Var, 190.0f), 1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60(), vgg0.a(16.0f)), 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            j0x.b(u7x.v(drawable), null, lgb.J(o7k0.c, vgg0.a(14.0f)), null, gqw0.A, 0.0f, null, fetVar, 24632, 104);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, drawable, i2, (byte) 20);
        }
    }

    public static final void n(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1321836650);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            l(l7m0Var, function1, fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i2, (byte) 3);
        }
    }

    public static final void o(mm40 mm40Var, bzl bzlVar, bdz bdzVar, pn2 pn2Var, float f2, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        fet fetVar2 = fetVar;
        bdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-461543831);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar2.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar2.g(bzlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar2.g(bdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar2.g(pn2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        int i6 = i4;
        if (fetVar2.U(i6 & 1, (i6 & 74899) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i5 != 0 ? jm40Var : mm40Var2;
            int i7 = i6 & 458752;
            boolean z = i7 == 131072;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new zk2(function1, (byte) 8);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i7 == 131072;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new zk2(function1, (byte) 10);
                fetVar2.o0(objP2);
            }
            mm40 mm40Var5 = mm40Var4;
            boolean z3 = true;
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            fie fieVar = pn2Var.c;
            if (fieVar instanceof sge) {
                fetVar2.e0(-1661410184);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7);
                mdm mdmVar = ((sge) fieVar).f32156a;
                if (i7 != 131072) {
                    z3 = false;
                }
                Object objP3 = fetVar2.P();
                if (z3 || objP3 == cl5Var) {
                    objP3 = new zk2(function1, (byte) 11);
                    fetVar2.o0(objP3);
                }
                jcb.l(mm40VarN, mdmVar, false, (Function0) objP3, fetVar, 0, 4);
                fetVar2 = fetVar;
                fetVar2.r(false);
                mm40Var3 = mm40Var5;
            } else if (fieVar instanceof xge) {
                fetVar2.e0(-1661073214);
                u(s5x0.N(mm40Var5, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7), ((xge) fieVar).b, function1, u1c.M(605940279, new ri1(mm40Var5, fieVar, (byte) 3), fetVar2), fetVar2, ((i6 >> 9) & 896) | 3072);
                fetVar2.r(false);
                fetVar2 = fetVar2;
                mm40Var3 = mm40Var5;
            } else if (fieVar instanceof nhe) {
                fetVar2.e0(-1660405195);
                fetVar2 = fetVar2;
                mm40Var3 = mm40Var5;
                u(mm40Var3, ((nhe) fieVar).c, function1, u1c.M(2096508984, new bn2(fieVar, pn2Var, bdzVar, f2, bzlVar, function1), fetVar2), fetVar2, (i6 & 14) | 3072 | ((i6 >> 9) & 896));
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                mm40Var3 = mm40Var5;
                if (fieVar instanceof whe) {
                    fetVar2.e0(-1659698519);
                    w(mm40Var3, (whe) fieVar, f2, bzlVar, fetVar2, (i6 & 14) | ((i6 >> 6) & 896) | ((i6 << 6) & 7168));
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1659482759);
                    fetVar2.r(false);
                }
            }
            mm40Var2 = mm40Var3;
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn2(mm40Var2, bzlVar, bdzVar, pn2Var, f2, function1, i2, i3);
        }
    }

    public static final void p(mm40 mm40Var, nhe nheVar, boolean z, bdz bdzVar, float f2, bzl bzlVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        fetVar.g0(426226446);
        int i3 = i2 | (fetVar.g(nheVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(bdzVar) ? 2048 : 1024) | (fetVar.d(f2) ? 16384 : 8192) | (fetVar.g(bzlVar) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            d9z d9zVarA = bdzVar.a("FAVORITES_VIEWED_LIST", fetVar);
            yje yjeVar = null;
            mm40 mm40VarV = bzlVar == null ? mm40Var : cjx.V(mm40Var, bzlVar.a(new j6g0((byte) 17)), null);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new md0(d9zVarA, (byte) 3));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            int i4 = 3670016 & i3;
            boolean z2 = i4 == 1048576;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dl2(b2, yjeVar, l7m0Var, function1);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, d9zVarA, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = ((i3 & 896) == 256) | fetVar.g(d9zVarA) | (i4 == 1048576);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                en2 en2Var = new en2(z, d9zVarA, function1, null, (byte) 0);
                function2 = function1;
                fetVar.o0(en2Var);
                objP3 = en2Var;
            } else {
                function2 = function1;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            ngv ngvVar = nheVar.b ? new ngv(2) : new ngv(1);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, f2, xfn.a(fetVar).d, 24.0f, fetVar);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            int i5 = ((i3 & 112) == 32 ? (byte) 1 : (byte) 0) | (i4 != 1048576 ? (byte) 0 : (byte) 1);
            Object objP4 = fetVar.P();
            if (i5 != 0 || objP4 == cl5Var) {
                objP4 = new df1(nheVar, function2, (byte) 19);
                fetVar.o0(objP4);
            }
            g8x.i(ngvVar, mm40VarV, d9zVarA, ch80VarF, null, qw3Var, null, false, null, (Function1) objP4, fetVar, 0, 944);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t72(mm40Var, nheVar, z, bdzVar, f2, bzlVar, function1, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, byte, int] */
    public static final void q(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        fet fetVar3;
        boolean z;
        Function0 function0;
        Function0 function2;
        Object obj;
        shd shdVar;
        shd shdVar2;
        zx7 zx7Var;
        shd shdVar3;
        ?? r9;
        fet fetVar4;
        Object obj2;
        zx7 zx7Var2 = gqw0.e;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-731781487);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 10;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float fT = fbc.T(fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, fT, 0.0f, 0.0f, 13);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarN, background, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function3 = e7z.u1;
            if (z2) {
                fetVar.l(function3);
            } else {
                fetVar.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar6);
            jpm0.n(fetVar);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar7);
            imm immVar = ((mf10) l7m0Var.getValue()).f21676a;
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (z3 || objP == obj3) {
                objP = new pd10(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function4 = (Function0) objP;
            boolean z4 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == obj3) {
                objP2 = new lj00(function1, b3);
                fetVar.o0(objP2);
            }
            hlm.c(jm40Var, immVar, null, function4, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 6, 0, 4052);
            jm40 jm40Var2 = jm40Var;
            Object obj4 = ((mf10) l7m0Var.getValue()).b;
            if (obj4 != null) {
                if (obj4 instanceof qe10) {
                    fetVar.e0(-303148411);
                    mm40 mm40VarE0 = o2e.e0(jm40Var2, "LOYALTY_PROGRAM_LAZY_COLUMN_ALTERNATIVE");
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = h97.f(qmk.a(fetVar).c, 16.0f, qmk.a(fetVar).c, 32.0f, fetVar);
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    boolean zG = fetVar.g(obj4) | (i4 == 32);
                    Object objP3 = fetVar.P();
                    if (zG) {
                        obj2 = obj3;
                    } else {
                        obj2 = obj3;
                        if (objP3 == obj2) {
                        }
                        Object obj5 = obj2;
                        b8k0.e(mm40VarE0, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 6, 490);
                        fet fetVar5 = fetVar;
                        r9 = 0;
                        fetVar5.r(false);
                        obj = obj5;
                        zx7Var = zx7Var2;
                        shdVar2 = shdVar4;
                        shdVar3 = shdVar5;
                        shdVar = shdVar6;
                        function2 = function3;
                        fetVar4 = fetVar5;
                    }
                    objP3 = new u400(obj4, function1, (byte) 15);
                    fetVar.o0(objP3);
                    Object obj6 = obj2;
                    b8k0.e(mm40VarE0, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 6, 490);
                    fet fetVar6 = fetVar;
                    r9 = 0;
                    fetVar6.r(false);
                    obj = obj6;
                    zx7Var = zx7Var2;
                    shdVar2 = shdVar4;
                    shdVar3 = shdVar5;
                    shdVar = shdVar6;
                    function2 = function3;
                    fetVar4 = fetVar6;
                } else {
                    fet fetVar7 = fetVar;
                    z = false;
                    r9 = 0;
                    fetVar3 = fetVar7;
                    if (obj4 instanceof re10) {
                        fetVar7.e0(-300739587);
                        n0q n0qVar = o7k0.c;
                        tj30 tj30VarC = zq8.c(zx7Var2, false);
                        int iHashCode2 = Long.hashCode(fetVar7.T);
                        bh90 bh90VarM2 = fetVar7.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar7, n0qVar);
                        fetVar7.i0();
                        if (fetVar7.S) {
                            function0 = function3;
                            fetVar7.l(function0);
                        } else {
                            function0 = function3;
                            fetVar7.r0();
                        }
                        jpm0.o(fetVar7, tj30VarC, shdVar4);
                        jpm0.o(fetVar7, bh90VarM2, shdVar5);
                        vqd.u(iHashCode2, fetVar7, shdVar6, fetVar7);
                        jpm0.o(fetVar7, mm40VarC1, shdVar7);
                        function2 = function0;
                        mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar7, false), 7);
                        jm40Var2 = jm40Var2;
                        mdm mdmVar = ((re10) obj4).f30314a;
                        boolean z5 = i4 == 32;
                        Object objP4 = fetVar7.P();
                        if (z5 || objP4 == obj3) {
                            objP4 = new pd10(function1, (byte) 3);
                            fetVar7.o0(objP4);
                        }
                        obj = obj3;
                        shdVar = shdVar6;
                        shdVar2 = shdVar4;
                        zx7Var = zx7Var2;
                        shdVar3 = shdVar5;
                        jcb.l(mm40VarN2, mdmVar, false, (Function0) objP4, fetVar7, 0, 4);
                        fetVar7.r(true);
                        fetVar7.r(false);
                        fetVar4 = fetVar7;
                    }
                }
                fetVar4.r(true);
                if (((mf10) l7m0Var.getValue()).c) {
                    fetVar4.e0(755586065);
                    n0q n0qVar2 = o7k0.c;
                    Object objP5 = fetVar4.P();
                    if (objP5 == obj) {
                        objP5 = new gf10(r9);
                        fetVar4.o0(objP5);
                    }
                    mm40 mm40VarQ2 = i120.Q(y860.W(n0qVar2, null, null, false, null, (Function0) objP5, 28), ((StaticColors) fetVar4.k(m8m0.f21378a)).m70getBlack200d7_KjU(), ljcVar);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, r9);
                    int iHashCode3 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM3 = fetVar4.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarQ2);
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(function2);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC2, shdVar2);
                    jpm0.o(fetVar4, bh90VarM3, shdVar3);
                    vqd.u(iHashCode3, fetVar4, shdVar, fetVar4);
                    jpm0.o(fetVar4, mm40VarC2, shdVar7);
                    kpb.j(jr8.f16991a.b(jm40Var2, zx7Var), null, fetVar4, r9, 2);
                    fetVar4.r(true);
                    fetVar4.r(r9);
                    fetVar2 = fetVar4;
                } else {
                    fetVar4.e0(755985841);
                    fetVar4.r(r9);
                    fetVar2 = fetVar4;
                }
            } else {
                fetVar3 = fetVar;
                z = false;
            }
            throw b1j.f(-2087992097, fetVar3, z);
        }
        fet fetVar8 = fetVar;
        fetVar8.X();
        fetVar2 = fetVar8;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 10);
        }
    }

    public static final void r(int i2, fet fetVar) {
        fetVar.g0(1926906231);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 28.0f, 0L, fetVar, 0, 5);
            v8q0.a(rsm0.w(R.string.operator_rating_title, 0, fetVar), o7k0.d(s5x0.L(jm40.b, 16.0f, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 0, 130040);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new im8(i2, (byte) 14);
        }
    }

    public static final void s(int i2, int i3, fet fetVar, mm40 mm40Var) {
        int i4;
        fetVar.g0(-722894611);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if (fetVar.U(i4 & 1, (i4 & 3) != 2)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            g1x.l(s5x0.L(mm40Var.e(o7k0.c), xfn.a(fetVar).d, 0.0f, 2), ahy.c, fetVar, 48, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s84(mm40Var, i2, i3, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    public static final void t(mm40 mm40Var, cuc0 cuc0Var, guc0 guc0Var, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        fet fetVar2;
        pm80 pm80Var;
        mm40 mm40VarO;
        shd shdVar;
        shd shdVar2;
        zx7 zx7Var;
        shd shdVar3;
        shd shdVar4;
        n0q n0qVar;
        ?? r1;
        boolean z;
        yjj0 yjj0Var;
        fet fetVar3;
        shd shdVar5;
        shd shdVar6;
        fet fetVar4;
        fet fetVar5;
        boolean z2;
        fet fetVar6;
        fet fetVar7 = fetVar;
        cuc0Var.getClass();
        function1.getClass();
        fetVar7.g0(-2050179144);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar7.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar7.g(cuc0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar7.e(guc0Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar7.i(function1) ? 2048 : 1024;
        }
        if (fetVar7.U(i4 & 1, (i4 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i5 != 0 ? jm40Var : mm40Var2;
            boolean zF = fetVar7.f(cuc0Var.getId());
            Object objP = fetVar7.P();
            Object obj = ukd.f35823a;
            if (zF || objP == obj) {
                objP = new gvb0(function1, cuc0Var, (byte) 7);
                fetVar7.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            Integer numB = cuc0Var.b();
            if (numB == null) {
                fetVar7.e0(1843356131);
                fetVar7.r(false);
                pm80Var = null;
            } else {
                fetVar7.e0(1843356132);
                pm80 pm80VarF = a8k0.F(numB.intValue(), 0, fetVar7);
                fetVar7.r(false);
                pm80Var = pm80VarF;
            }
            if (guc0Var == guc0.f11922a) {
                zcl zclVar = qmk.f28987a;
                mm40VarO = o7k0.e(o7k0.s(jm40Var, 144.0f), 96.0f);
            } else {
                mm40VarO = ny9.O(1.5f, o7k0.d(jm40Var, 1.0f), false);
            }
            mm40 mm40VarE = mm40Var4.e(mm40VarO);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            jm40 jm40Var2 = jm40Var;
            int iHashCode = Long.hashCode(fetVar7.T);
            bh90 bh90VarM = fetVar7.m();
            mm40 mm40VarC0 = kbc.c0(fetVar7, mm40VarE);
            mkd.c0.getClass();
            fetVar7.i0();
            boolean z3 = fetVar7.S;
            Function0 function2 = e7z.u1;
            if (z3) {
                fetVar7.l(function2);
            } else {
                fetVar7.r0();
            }
            shd shdVar7 = gqw0.x;
            jpm0.o(fetVar7, tj30VarC, shdVar7);
            shd shdVar8 = gqw0.w;
            jpm0.o(fetVar7, bh90VarM, shdVar8);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar9 = gqw0.y;
            jpm0.o(fetVar7, numValueOf, shdVar9);
            jpm0.n(fetVar7);
            shd shdVar10 = gqw0.v;
            jpm0.o(fetVar7, mm40VarC0, shdVar10);
            n0q n0qVar2 = o7k0.c;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(y860.Y(lgb.J(n0qVar2, vgg0.a(16.0f)), false, null, null, function0, 15), "PROMO_STORE_CARD_BOX");
            mm40 mm40Var5 = mm40Var4;
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            pm80 pm80Var2 = pm80Var;
            int iHashCode2 = Long.hashCode(fetVar7.T);
            bh90 bh90VarM2 = fetVar7.m();
            mm40 mm40VarC1 = kbc.c0(fetVar7, mm40VarE0);
            fetVar7.i0();
            if (fetVar7.S) {
                fetVar7.l(function2);
            } else {
                fetVar7.r0();
            }
            jpm0.o(fetVar7, tj30VarC2, shdVar7);
            jpm0.o(fetVar7, bh90VarM2, shdVar8);
            vqd.u(iHashCode2, fetVar7, shdVar9, fetVar7);
            jpm0.o(fetVar7, mm40VarC1, shdVar10);
            if (cuc0Var instanceof auc0) {
                fetVar7.e0(-1587132980);
                o0x o0xVar = ((auc0) cuc0Var).e;
                if (o0xVar instanceof m0x) {
                    fetVar7.e0(-1587065183);
                    shdVar = shdVar8;
                    shdVar2 = shdVar7;
                    dww.c(a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar7), null, n0qVar2, y3d.g, fetVar7, 3512, 0);
                    fetVar7.r(false);
                    zx7Var = zx7Var2;
                    z2 = false;
                    n0qVar = n0qVar2;
                    shdVar3 = shdVar10;
                    shdVar4 = shdVar9;
                    z = true;
                    fetVar6 = fetVar7;
                } else {
                    shdVar = shdVar8;
                    n0qVar = n0qVar2;
                    if (o0xVar instanceof n0x) {
                        fetVar7.e0(-1586698980);
                        z2 = false;
                        zx7Var = zx7Var2;
                        shdVar3 = shdVar10;
                        shdVar4 = shdVar9;
                        z = true;
                        k7x.b(((n0x) o0xVar).f22722a, null, n0qVar, pm80Var2, pm80Var2, null, null, null, null, null, gqw0.A, null, fetVar, 37296, 6, 31712);
                        fet fetVar8 = fetVar;
                        fetVar8.r(false);
                        shdVar2 = shdVar7;
                        n0qVar = n0qVar;
                        fetVar6 = fetVar8;
                    } else {
                        z2 = false;
                        zx7Var = zx7Var2;
                        shdVar2 = shdVar7;
                        shdVar3 = shdVar10;
                        shdVar4 = shdVar9;
                        z = true;
                        if (!(o0xVar instanceof l0x)) {
                            throw b1j.f(87349494, fetVar7, false);
                        }
                        fetVar7.e0(-1586209738);
                        Drawable drawable = ((l0x) o0xVar).f19222a;
                        if (drawable == null) {
                            fetVar7.e0(-1586209739);
                            fetVar7.r(false);
                        } else {
                            fetVar7.e0(-1586209738);
                            dww.c(u7x.v(drawable), null, n0qVar, y3d.g, fetVar7, 3512, 0);
                            fetVar7.r(false);
                        }
                        fetVar7.r(false);
                        fetVar6 = fetVar7;
                    }
                }
                fetVar6.r(z2);
                yjj0Var = null;
                r1 = z2;
                fetVar3 = fetVar6;
            } else {
                shdVar = shdVar8;
                shdVar2 = shdVar7;
                zx7Var = zx7Var2;
                shdVar3 = shdVar10;
                shdVar4 = shdVar9;
                n0qVar = n0qVar2;
                jm40Var2 = jm40Var2;
                r1 = 0;
                z = true;
                if (!(cuc0Var instanceof buc0)) {
                    throw b1j.f(87348236, fetVar7, false);
                }
                fetVar7.e0(-1585740522);
                buc0 buc0Var = (buc0) cuc0Var;
                Integer num = buc0Var.d;
                String str = buc0Var.e.f12884a;
                boolean zG = fetVar7.g(str);
                Object objP2 = fetVar7.P();
                if (zG || objP2 == obj) {
                    Object pair = new Pair(new n0x(str), new n0x(azw.R(str)));
                    fetVar7.o0(pair);
                    objP2 = pair;
                }
                Pair pair2 = (Pair) objP2;
                n0x n0xVar = (n0x) pair2.f46059a;
                n0x n0xVar2 = (n0x) pair2.b;
                boolean zG2 = fetVar7.g(num);
                Object objP3 = fetVar7.P();
                if (zG2 || objP3 == obj) {
                    yjj0Var = null;
                    objP3 = new m0x(num != null ? num.intValue() : R.drawable.promo_shop_placeholder, null, 6);
                    fetVar7.o0(objP3);
                } else {
                    yjj0Var = null;
                }
                y9a.f(n0xVar, n0xVar2, (m0x) objP3, null, bsr0.d, fetVar7, 24576, 8);
                fetVar7.r(false);
                fetVar3 = fetVar7;
            }
            if (cuc0Var.a() != null) {
                fetVar3.e0(-1584750723);
                zfn zfnVar = m8m0.f21378a;
                zq8.a(r1, fetVar3, i120.P(n0qVar, yk5.n(q3d.j(new y3d(((StaticColors) fetVar3.k(zfnVar)).m63getBlack00d7_KjU()), new y3d(((StaticColors) fetVar3.k(zfnVar)).m78getBlack800d7_KjU())), 0.0f, 0.0f, 14), yjj0Var, 6));
                fetVar3.r(r1);
            } else {
                fetVar3.e0(-1584265418);
                fetVar3.r(r1);
            }
            String strA = cuc0Var.a();
            if (strA == null) {
                fetVar3.e0(-1584216656);
                fetVar3.r(r1);
                shdVar5 = shdVar2;
                shdVar6 = shdVar4;
                fetVar4 = fetVar3;
            } else {
                fetVar3.e0(-1584216655);
                mm40 mm40VarJ = s5x0.J(n0qVar, 12.0f);
                tj30 tj30VarC3 = zq8.c(gqw0.g, r1);
                int iHashCode3 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM3 = fetVar3.m();
                mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarJ);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(function2);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, tj30VarC3, shdVar2);
                jpm0.o(fetVar3, bh90VarM3, shdVar);
                shd shdVar11 = shdVar4;
                vqd.u(iHashCode3, fetVar3, shdVar11, fetVar3);
                jpm0.o(fetVar3, mm40VarC2, shdVar3);
                mm40 mm40VarE1 = o2e.e0(jm40Var2, "PROMO_STORE_CARD_TEXT");
                ((g1t0) fetVar3.k(j1t0.e)).getClass();
                shdVar5 = shdVar2;
                shdVar6 = shdVar11;
                v8q0.a(strA, mm40VarE1, ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.l(), fetVar, 48, 24960, 109560);
                fet fetVar9 = fetVar;
                fetVar9.r(z);
                fetVar9.r(r1);
                fetVar4 = fetVar9;
            }
            fetVar4.r(z);
            tda tdaVarC = cuc0Var.c();
            if (tdaVarC == null) {
                fetVar4.e0(71431813);
                fetVar4.r(r1);
                fetVar5 = fetVar4;
            } else {
                fetVar4.e0(71431814);
                zx7 zx7Var3 = zx7Var;
                jm40 jm40Var3 = jm40Var2;
                mm40 mm40VarQ = ffb0.Q(jr8.f16991a.b(jm40Var3, zx7Var3), -1.0f, -1.0f);
                tj30 tj30VarC4 = zq8.c(zx7Var3, r1);
                int iHashCode4 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM4 = fetVar4.m();
                mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarQ);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(function2);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, tj30VarC4, shdVar5);
                jpm0.o(fetVar4, bh90VarM4, shdVar);
                vqd.u(iHashCode4, fetVar4, shdVar6, fetVar4);
                jpm0.o(fetVar4, mm40VarC3, shdVar3);
                mm40 mm40VarR = ffb0.R(jm40Var3, 1.0f, 0.0f, 2);
                rpe rpeVar = tdaVarC.f33758a;
                zfn zfnVar2 = zaq0.b;
                tdc.e(rpeVar, new jpe(((ThemeColors) fetVar4.k(zfnVar2)).getPrimaryForeground(), ((StaticColors) fetVar4.k(m8m0.f21378a)).m98getGreen0d7_KjU(), ((ThemeColors) fetVar4.k(zfnVar2)).getBackground(), tdaVarC.b), mm40VarR, fetVar, 0, 0);
                fet fetVar10 = fetVar;
                fetVar10.r(z);
                fetVar10.r(r1);
                fetVar5 = fetVar10;
            }
            fetVar5.r(z);
            mm40Var3 = mm40Var5;
            fetVar2 = fetVar5;
        } else {
            fetVar7.X();
            mm40Var3 = mm40Var2;
            fetVar2 = fetVar7;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var3, (Object) cuc0Var, (Object) guc0Var, (Object) function1, i2, i3, (byte) 0);
        }
    }

    public static final void u(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1719679605);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new zk2(function1, (byte) 9);
                fetVar.o0(objP);
            }
            mom.c(mm40VarE, z, womVarF, null, false, null, (Function0) objP, null, ugdVar, fetVar, (i3 & 112) | ((i3 << 15) & 234881024), 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new an2(mm40Var, z, function1, ugdVar, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0178  */
    /* JADX WARN: Code duplicated, block: B:48:0x017a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:73:0x0208  */
    /* JADX WARN: Code duplicated, block: B:74:0x020a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0213  */
    /* JADX WARN: Code duplicated, block: B:81:0x0222  */
    /* JADX WARN: Code duplicated, block: B:82:0x0224  */
    /* JADX WARN: Code duplicated, block: B:86:0x022d  */
    /* JADX WARN: Code duplicated, block: B:88:0x024e  */
    public static final void v(mm40 mm40Var, t6j0 t6j0Var, Function1 function1, fet fetVar, int i2) {
        cl5 cl5Var;
        Function1 function2;
        boolean z;
        Object objP;
        boolean z2;
        Object objP2;
        boolean z3;
        Object objP3;
        boolean z4;
        boolean z5;
        Object objP4;
        boolean z6;
        Object objP5;
        t6j0 t6j0Var2 = t6j0Var;
        fet fetVar2 = fetVar;
        t6j0Var2.getClass();
        function1.getClass();
        fetVar2.g0(469226217);
        int i3 = i2 | (fetVar2.g(t6j0Var2) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE = i120.Q(mm40Var, s6t0.b().f33626a.getBackground(), jd8.n).e(o7k0.c);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z7 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z7) {
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
            imm immVar = t6j0Var2.f33419a;
            int i4 = i3 & 896;
            boolean z8 = i4 == 256;
            Object objP6 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z8 || objP6 == cl5Var2) {
                objP6 = new w7i0(function1, (byte) 13);
                fetVar2.o0(objP6);
            }
            hlm.c(null, immVar, null, (Function0) objP6, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fetVar2 = fetVar;
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar2).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, f2, 16.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarE0 = o2e.e0(jm40Var, "SETTING_PIN_CODE_ACTIVATE_PIN_SWITCH");
            t6j0Var2 = t6j0Var;
            rqm rqmVar = t6j0Var2.b;
            boolean z9 = i4 == 256;
            Object objP7 = fetVar2.P();
            if (z9) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP7 != cl5Var) {
                    function2 = function1;
                }
                Function0 function0 = (Function0) objP7;
                if (i4 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (z || objP == cl5Var) {
                    objP = new w7i0(function2, (byte) 15);
                    fetVar2.o0(objP);
                }
                cl5 cl5Var3 = cl5Var;
                obc.q(mm40VarE0, rqmVar, false, null, function0, null, (Function0) objP, null, fetVar2, 6, 172);
                rqm rqmVar2 = t6j0Var2.c;
                if (i4 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var3) {
                    objP2 = new w7i0(function1, (byte) 16);
                    fetVar2.o0(objP2);
                }
                Function0 function3 = (Function0) objP2;
                if (i4 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP3 = fetVar2.P();
                if (z3 || objP3 == cl5Var3) {
                    objP3 = new w7i0(function1, (byte) 17);
                    fetVar2.o0(objP3);
                }
                obc.q(null, rqmVar2, false, null, function3, null, (Function0) objP3, null, fetVar2, 0, 173);
                hkb.k(0, 1, fetVar2, null, t6j0Var2.e);
                qxw.o(fetVar2, o7k0.e(jm40Var, 16.0f));
                if (t6j0Var2.f) {
                    fetVar2.e0(1113414945);
                    rqm rqmVar3 = t6j0Var2.d;
                    if (i4 == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP4 = fetVar2.P();
                    if (z5 || objP4 == cl5Var3) {
                        objP4 = new w7i0(function1, (byte) 18);
                        fetVar2.o0(objP4);
                    }
                    Function0 function4 = (Function0) objP4;
                    if (i4 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objP5 = fetVar2.P();
                    if (z6 || objP5 == cl5Var3) {
                        objP5 = new w7i0(function1, (byte) 19);
                        fetVar2.o0(objP5);
                    }
                    z4 = true;
                    obc.q(null, rqmVar3, false, null, function4, null, (Function0) objP5, null, fetVar2, 0, 173);
                    fetVar2.r(false);
                } else {
                    z4 = true;
                    fetVar2.e0(1113733997);
                    fetVar2.r(false);
                }
                fetVar2.r(z4);
                fetVar2.r(z4);
            }
            function2 = function1;
            objP7 = new w7i0(function2, (byte) 14);
            fetVar2.o0(objP7);
            Function0 function5 = (Function0) objP7;
            if (i4 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            if (z) {
                objP = new w7i0(function2, (byte) 15);
                fetVar2.o0(objP);
            } else {
                objP = new w7i0(function2, (byte) 15);
                fetVar2.o0(objP);
            }
            cl5 cl5Var4 = cl5Var;
            obc.q(mm40VarE0, rqmVar, false, null, function5, null, (Function0) objP, null, fetVar2, 6, 172);
            rqm rqmVar4 = t6j0Var2.c;
            if (i4 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar2.P();
            if (z2) {
                objP2 = new w7i0(function1, (byte) 16);
                fetVar2.o0(objP2);
            } else {
                objP2 = new w7i0(function1, (byte) 16);
                fetVar2.o0(objP2);
            }
            Function0 function6 = (Function0) objP2;
            if (i4 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP3 = fetVar2.P();
            if (z3) {
                objP3 = new w7i0(function1, (byte) 17);
                fetVar2.o0(objP3);
            } else {
                objP3 = new w7i0(function1, (byte) 17);
                fetVar2.o0(objP3);
            }
            obc.q(null, rqmVar4, false, null, function6, null, (Function0) objP3, null, fetVar2, 0, 173);
            hkb.k(0, 1, fetVar2, null, t6j0Var2.e);
            qxw.o(fetVar2, o7k0.e(jm40Var, 16.0f));
            if (t6j0Var2.f) {
                fetVar2.e0(1113414945);
                rqm rqmVar5 = t6j0Var2.d;
                if (i4 == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objP4 = fetVar2.P();
                if (z5) {
                    objP4 = new w7i0(function1, (byte) 18);
                    fetVar2.o0(objP4);
                } else {
                    objP4 = new w7i0(function1, (byte) 18);
                    fetVar2.o0(objP4);
                }
                Function0 function7 = (Function0) objP4;
                if (i4 == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objP5 = fetVar2.P();
                if (z6) {
                    objP5 = new w7i0(function1, (byte) 19);
                    fetVar2.o0(objP5);
                } else {
                    objP5 = new w7i0(function1, (byte) 19);
                    fetVar2.o0(objP5);
                }
                z4 = true;
                obc.q(null, rqmVar5, false, null, function7, null, (Function0) objP5, null, fetVar2, 0, 173);
                fetVar2.r(false);
            } else {
                z4 = true;
                fetVar2.e0(1113733997);
                fetVar2.r(false);
            }
            fetVar2.r(z4);
            fetVar2.r(z4);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(mm40Var, (Object) t6j0Var2, function1, i2, (byte) 5);
        }
    }

    public static final void w(mm40 mm40Var, whe wheVar, float f2, bzl bzlVar, fet fetVar, int i2) {
        int i3;
        mm40 mm40VarV;
        fetVar.g0(290746192);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(wheVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(bzlVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            cl5 cl5Var = ukd.f35823a;
            if (bzlVar == null) {
                fetVar.e0(-1328999270);
                fetVar.r(false);
                mm40VarV = mm40Var;
            } else {
                fetVar.e0(-1328966410);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new ago((byte) 28);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40Var, bzlVar.a((Function0) objP), null);
                fetVar.r(false);
            }
            mm40 mm40VarQ = i120.Q(mm40VarV, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            ngv ngvVar = wheVar.b ? new ngv(2) : new ngv(1);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, f2, xfn.a(fetVar).d, 32.0f);
            byte b2 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b2));
            boolean z = (i3 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new m51(wheVar, (byte) 21);
                fetVar.o0(objP2);
            }
            g8x.i(ngvVar, mm40VarQ, null, lh80Var, qw3Var2, qw3Var, null, false, null, (Function1) objP2, fetVar, 100663296, 660);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) mm40Var, (Object) wheVar, f2, (Object) bzlVar, i2, (byte) 0);
        }
    }

    public static final void x(ir8 ir8Var, xcz xczVar, z77 z77Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        zx7 zx7Var = gqw0.e;
        fetVar.g0(318345410);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ir8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(z77Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b2 = 1;
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z77Var != null) {
                boolean z = z77Var instanceof u77;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar.e0(987268357);
                    mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                    mdm mdmVar = ((u77) z77Var).f;
                    b2 = (i3 & 7168) != 2048 ? (byte) 0 : (byte) 1;
                    Object objP = fetVar.P();
                    if (b2 != 0 || objP == cl5Var) {
                        objP = new gno0(function1, b3);
                        fetVar.o0(objP);
                    }
                    d(mm40VarN, mdmVar, (Function0) objP, fetVar, 0, 0);
                    fetVar.r(false);
                } else if (z77Var instanceof v77) {
                    fetVar.e0(987277916);
                    mm40 mm40VarB2 = ir8Var.b(jm40Var, zx7Var);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarB2, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                    mdm mdmVar2 = ((v77) z77Var).f;
                    boolean z2 = (i3 & 7168) == 2048;
                    Object objP2 = fetVar.P();
                    if (z2 || objP2 == cl5Var) {
                        objP2 = new gno0(function1, b2);
                        fetVar.o0(objP2);
                    }
                    d(mm40VarN2, mdmVar2, (Function0) objP2, fetVar, 0, 0);
                    fetVar.r(false);
                } else if (z77Var instanceof w77) {
                    fetVar.e0(987287095);
                    xcm0.b(0, fetVar, ((w77) z77Var).b.b);
                    fetVar.r(false);
                } else if (z77Var instanceof x77) {
                    fetVar.e0(987291195);
                    f(xczVar, (x77) z77Var, function1, fetVar, (i3 >> 3) & 1022);
                    fetVar.r(false);
                } else if (z77Var instanceof y77) {
                    fetVar.e0(987297904);
                    d(ir8Var.b(jm40Var, zx7Var), ((y77) z77Var).f, null, fetVar, 0, 4);
                    fetVar.r(false);
                }
            }
            throw b1j.f(987267158, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 9, i2, (Object) ir8Var, (Object) xczVar, (Object) z77Var, (Object) function1);
        }
    }

    public static final void y(mm40 mm40Var, z77 z77Var, Function1 function1, fet fetVar, int i2) {
        Object hno0Var;
        z77 z77Var2;
        Function1 function2;
        boolean z;
        z77Var.getClass();
        function1.getClass();
        fetVar.g0(1711027004);
        int i3 = i2 | (fetVar.g(z77Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            wom womVarF = mom.f(fetVar);
            int i4 = 3;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(z77Var.e());
            int i5 = i3 & 112;
            int i6 = i3 & 896;
            boolean zG = (i5 == 32) | fetVar.g(xczVarA) | (i6 == 256);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP == obj) {
                Object hno0Var2 = new hno0(z77Var, xczVarA, function1, yjeVar, (byte) 0);
                fetVar.o0(hno0Var2);
                objP = hno0Var2;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            Boolean boolValueOf2 = Boolean.valueOf(z77Var.g());
            boolean zG2 = (i5 == 32) | fetVar.g(xczVarA) | (r17 == 256);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                hno0Var = new hno0(z77Var, xczVarA, function1, yjeVar, (byte) 1);
                z77Var2 = z77Var;
                function2 = function1;
                fetVar.o0(hno0Var);
            } else {
                z77Var2 = z77Var;
                hno0Var = objP2;
                function2 = function1;
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) hno0Var);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarR = knm0.r(mm40Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarR);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ycm0.d(z77Var2, function2, fetVar, (i3 >> 3) & 126);
            x7z x7zVar = new x7z(1.0f, true);
            boolean zD = z77Var2.d();
            boolean z3 = !z77Var2.d();
            boolean z4 = i6 == 256;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == obj) {
                objP3 = new opm0(function2, (byte) 28);
                fetVar.o0(objP3);
            }
            bdx.A(x7zVar, zD, z3, womVarF, null, (Function0) objP3, null, u1c.M(-1092159780, new sbd(xczVarA, z77Var2, function2), fetVar), fetVar, 12582912);
            fetVar.r(true);
            if (z77Var.c()) {
                fetVar.e0(135249967);
                n0q n0qVar = o7k0.c;
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new fno0((byte) 0);
                    fetVar.o0(objP4);
                }
                mm40 mm40VarY = y860.Y(n0qVar, false, null, null, (Function0) objP4, 14);
                androidx.compose.runtime.d dVar = m8m0.f21378a;
                mm40 mm40VarQ = i120.Q(mm40VarY, ((StaticColors) fetVar.k(dVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
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
                kpb.j(jr8.f16991a.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(dVar)).m131getWhite800d7_KjU()), i4), fetVar, 0, 0);
                z = true;
                fetVar.r(true);
                fetVar.r(false);
            } else {
                z = true;
                fetVar.e0(135708364);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j57(mm40Var, z77Var, function1, i2, (byte) 3);
        }
    }

    public static final void z(gdp0 gdp0Var, mm40 mm40Var, l7m0 l7m0Var, Function2 function2, fet fetVar, int i2) {
        l7m0Var.getClass();
        fetVar.g0(-1058936999);
        int i3 = (fetVar.g(gdp0Var) ? 4 : 2) | i2 | (fetVar.g(mm40Var) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new kk7(l7m0Var, (byte) 27);
                fetVar.o0(objP);
            }
            obc.d(dgp0.d.a(v3c.Y(objArr, (Function0) objP, fetVar).getValue()), u1c.M(1409289241, new zb8((Object) mm40Var, (Object) gdp0Var, (Object) function2, (byte) 22), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9(gdp0Var, mm40Var, l7m0Var, function2, i2);
        }
    }

    public void G(p58 p58Var) {
    }
}
