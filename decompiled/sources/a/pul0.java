package a;

import android.gov.nist.core.Separators;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class pul0 implements lfn0 {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27623a;
    public final b930 b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final fq80 c = new fq80();

    public pul0(List list) {
        if (list == null || list.isEmpty()) {
            this.f27623a = false;
            this.b = null;
            return;
        }
        this.f27623a = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        x0x.A(str.startsWith("Format:"));
        b930 b930VarA = b930.a(str);
        b930VarA.getClass();
        this.b = b930VarA;
        b(new fq80((byte[]) list.get(1)), charset);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long c(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = vtt0.f38024a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(fq80 fq80Var, Charset charset) {
        int i;
        sul0 sul0Var;
        while (true) {
            String strN = fq80Var.n(charset);
            if (strN == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = fq80Var.n(charset);
                    if (strN2 == null) {
                        break;
                    }
                    if (fq80Var.a() != 0) {
                        int iH = fq80Var.h(charset);
                        if ((iH != 0 ? n6x.s(iH >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strN2.split(Separators.COLON);
                    if (strArrSplit.length == 2) {
                        String strH0 = j47.H0(strArrSplit[0].trim());
                        strH0.getClass();
                        if (strH0.equals("playresx")) {
                            this.e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strH0.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                qul0 qul0Var = null;
                while (true) {
                    String strN3 = fq80Var.n(charset);
                    if (strN3 != null) {
                        if (fq80Var.a() != 0) {
                            int iH2 = fq80Var.h(charset);
                            if ((iH2 != 0 ? n6x.s(iH2 >>> 8) : 1114112) == i3) {
                            }
                        }
                        int i4 = -1;
                        if (strN3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strN3.substring(7), Separators.COMMA);
                            int i5 = -1;
                            int i6 = -1;
                            int i7 = -1;
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = i2; i15 < strArrSplit2.length; i15++) {
                                String strH1 = j47.H0(strArrSplit2[i15].trim());
                                strH1.getClass();
                                switch (strH1.hashCode()) {
                                    case -1178781136:
                                        i = strH1.equals("italic") ? i2 : -1;
                                        break;
                                    case -1026963764:
                                        i = strH1.equals("underline") ? 1 : -1;
                                        break;
                                    case -192095652:
                                        i = strH1.equals("strikeout") ? 2 : -1;
                                        break;
                                    case -70925746:
                                        i = strH1.equals("primarycolour") ? 3 : -1;
                                        break;
                                    case 3029637:
                                        i = strH1.equals("bold") ? 4 : -1;
                                        break;
                                    case 3373707:
                                        i = strH1.equals("name") ? 5 : -1;
                                        break;
                                    case 366554320:
                                        i = strH1.equals("fontsize") ? 6 : -1;
                                        break;
                                    case 767321349:
                                        i = strH1.equals("borderstyle") ? 7 : -1;
                                        break;
                                    case 1767875043:
                                        i = strH1.equals("alignment") ? 8 : -1;
                                        break;
                                    case 1988365454:
                                        i = strH1.equals("outlinecolour") ? 9 : -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                switch (i) {
                                    case 0:
                                        i11 = i15;
                                        break;
                                    case 1:
                                        i12 = i15;
                                        break;
                                    case 2:
                                        i13 = i15;
                                        break;
                                    case 3:
                                        i7 = i15;
                                        break;
                                    case 4:
                                        i10 = i15;
                                        break;
                                    case 5:
                                        i5 = i15;
                                        break;
                                    case 6:
                                        i9 = i15;
                                        break;
                                    case 7:
                                        i14 = i15;
                                        break;
                                    case 8:
                                        i6 = i15;
                                        break;
                                    case 9:
                                        i8 = i15;
                                        break;
                                }
                            }
                            qul0Var = i5 != -1 ? new qul0(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length) : null;
                        } else {
                            if (strN3.startsWith("Style:")) {
                                if (qul0Var == null) {
                                    f1t0.g0("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                                } else {
                                    x0x.A(strN3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strN3.substring(6), Separators.COMMA);
                                    int length = strArrSplit3.length;
                                    int i16 = qul0Var.k;
                                    if (length != i16) {
                                        int length2 = strArrSplit3.length;
                                        String str = vtt0.f38024a;
                                        Locale locale = Locale.US;
                                        StringBuilder sbT = dw9.t("Skipping malformed 'Style:' line (expected ", i16, " values, found ", "): '", length2);
                                        sbT.append(strN3);
                                        sbT.append(Separators.QUOTE);
                                        f1t0.g0("SsaStyle", sbT.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[qul0Var.f29351a].trim();
                                            int i17 = qul0Var.b;
                                            int iA = i17 != -1 ? sul0.a(strArrSplit3[i17].trim()) : -1;
                                            int i18 = qul0Var.c;
                                            Integer numC = i18 != -1 ? sul0.c(strArrSplit3[i18].trim()) : null;
                                            int i19 = qul0Var.d;
                                            Integer numC2 = i19 != -1 ? sul0.c(strArrSplit3[i19].trim()) : null;
                                            int i20 = qul0Var.e;
                                            float f = -3.4028235E38f;
                                            if (i20 != -1) {
                                                String strTrim2 = strArrSplit3[i20].trim();
                                                try {
                                                    f = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e) {
                                                    f1t0.h0("SsaStyle", "Failed to parse font size: '" + strTrim2 + Separators.QUOTE, e);
                                                }
                                            }
                                            float f2 = f;
                                            int i21 = qul0Var.f;
                                            boolean z = i21 != -1 && sul0.b(strArrSplit3[i21].trim());
                                            int i22 = qul0Var.g;
                                            boolean z2 = i22 != -1 && sul0.b(strArrSplit3[i22].trim());
                                            int i23 = qul0Var.h;
                                            boolean z3 = i23 != -1 && sul0.b(strArrSplit3[i23].trim());
                                            int i24 = qul0Var.i;
                                            boolean z4 = i24 != -1 && sul0.b(strArrSplit3[i24].trim());
                                            int i25 = qul0Var.j;
                                            if (i25 != -1) {
                                                String strTrim3 = strArrSplit3[i25].trim();
                                                try {
                                                    int i26 = Integer.parseInt(strTrim3.trim());
                                                    if (i26 == 1 || i26 == 3) {
                                                        i4 = i26;
                                                    } else {
                                                        f1t0.g0("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            sul0Var = new sul0(strTrim, iA, numC, numC2, f2, z, z2, z3, z4, i4);
                                        } catch (RuntimeException e2) {
                                            f1t0.h0("SsaStyle", "Skipping malformed 'Style:' line: '" + strN3 + Separators.QUOTE, e2);
                                            sul0Var = null;
                                        }
                                        if (sul0Var != null) {
                                            linkedHashMap.put(sul0Var.f32827a, sul0Var);
                                        }
                                    }
                                    sul0Var = null;
                                    if (sul0Var != null) {
                                        linkedHashMap.put(sul0Var.f32827a, sul0Var);
                                    }
                                }
                            }
                            i2 = 0;
                            i3 = 91;
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                f1t0.a0("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }

    @Override // a.lfn0
    public final void d(byte[] bArr, int i, int i2, kfn0 kfn0Var, rbe rbeVar) {
        Charset charset;
        fq80 fq80Var;
        long j;
        int i3;
        int i4;
        float f;
        int i5;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i6;
        int i7;
        int i8;
        float f2;
        float f3;
        float f4;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        float f6;
        int i13;
        int iA;
        int i14;
        pul0 pul0Var = this;
        long j2 = kfn0Var.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        fq80 fq80Var2 = pul0Var.c;
        fq80Var2.K(bArr, i + i2);
        fq80Var2.M(i);
        Charset charsetI = fq80Var2.I();
        if (charsetI == null) {
            charsetI = StandardCharsets.UTF_8;
        }
        boolean z = pul0Var.f27623a;
        if (!z) {
            pul0Var.b(fq80Var2, charsetI);
        }
        b930 b930VarA = z ? pul0Var.b : null;
        while (true) {
            String strN = fq80Var2.n(charsetI);
            if (strN == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !kfn0Var.f18204a) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            v4i0.e();
                            return;
                        }
                        long jLongValue = ((Long) arrayList2.get(i15)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        ftf ftfVar = new ftf(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            rbeVar.accept(ftfVar);
                        } else if (arrayList3 != null) {
                            arrayList3.add(ftfVar);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        rbeVar.accept((ftf) it.next());
                    }
                    return;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                b930VarA = b930.a(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (b930VarA == null) {
                        f1t0.g0("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        int i16 = b930VarA.f;
                        x0x.A(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i17 = b930VarA.f2188a;
                        String[] strArrSplit = strSubstring.split(Separators.COMMA, i16);
                        if (strArrSplit.length != i16) {
                            f1t0.g0("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            if (i17 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i17].trim());
                                } catch (RuntimeException unused) {
                                    f1t0.g0("SsaParser", "Fail to parse layer: " + strArrSplit[i17]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jC = c(strArrSplit[b930VarA.b]);
                            charset = charsetI;
                            if (jC == -9223372036854775807L) {
                                f1t0.g0("SsaParser", "Skipping invalid timing: ".concat(strN));
                                j = j2;
                                fq80Var = fq80Var2;
                            } else {
                                j = j2;
                                long jC2 = c(strArrSplit[b930VarA.c]);
                                if (jC2 == -9223372036854775807L || jC2 <= jC) {
                                    fq80Var = fq80Var2;
                                    f1t0.g0("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    LinkedHashMap linkedHashMap = pul0Var.d;
                                    sul0 sul0Var = (linkedHashMap == null || (i14 = b930VarA.d) == -1) ? null : (sul0) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[b930VarA.e];
                                    Matcher matcher = rul0.f31134a.matcher(str);
                                    PointF pointF = null;
                                    int i18 = -1;
                                    while (matcher.find()) {
                                        fq80 fq80Var3 = fq80Var2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = rul0.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = rul0.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = sul0.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i18 = iA;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        fq80Var2 = fq80Var3;
                                    }
                                    fq80Var = fq80Var2;
                                    String strReplace = rul0.f31134a.matcher(str).replaceAll("").replace("\\N", Separators.RETURN).replace("\\n", Separators.RETURN).replace("\\h", " ");
                                    float f7 = pul0Var.e;
                                    float f8 = pul0Var.f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (sul0Var != null) {
                                        boolean z2 = sul0Var.g;
                                        Integer num = sul0Var.d;
                                        Integer num2 = sul0Var.c;
                                        if (num2 != null) {
                                            i9 = 33;
                                            i10 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i9 = 33;
                                            i10 = 0;
                                        }
                                        if (sul0Var.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i10, spannableString.length(), i9);
                                        }
                                        float f9 = sul0Var.e;
                                        if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f9 / f8;
                                            i11 = 1;
                                        }
                                        boolean z3 = sul0Var.f;
                                        if (z3 && z2) {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = i11;
                                            f6 = f5;
                                            i13 = 33;
                                            i4 = 0;
                                            if (z3) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (sul0Var.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i13);
                                        }
                                        if (sul0Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i13);
                                        }
                                        i5 = i12;
                                        f = f6;
                                    } else {
                                        f7 = f7;
                                        f8 = f8;
                                        i4 = 0;
                                        f = -3.4028235E38f;
                                        i5 = Integer.MIN_VALUE;
                                    }
                                    if (i18 == -1) {
                                        i18 = sul0Var != null ? sul0Var.b : -1;
                                    }
                                    switch (i18) {
                                        case 0:
                                        default:
                                            rw2.u(i18, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i19 = Integer.MIN_VALUE;
                                    switch (i18) {
                                        case 0:
                                        default:
                                            rw2.u(i18, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = i4;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    switch (i18) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            rw2.u(i18, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i19 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i19 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i19 = i4;
                                            break;
                                    }
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        float f10 = 0.95f;
                                        if (i6 != 0) {
                                            i7 = 1;
                                            if (i6 != 1) {
                                                i8 = 2;
                                                f2 = i6 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i8 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i7 = 1;
                                            i8 = 2;
                                            f2 = 0.05f;
                                        }
                                        if (i19 == 0) {
                                            f10 = 0.05f;
                                        } else if (i19 == i7) {
                                            f10 = 0.5f;
                                        } else if (i19 != i8) {
                                            f10 = -3.4028235E38f;
                                        }
                                        f3 = f10;
                                        f4 = f2;
                                    } else {
                                        f4 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                    }
                                    ctf ctfVar = new ctf(spannableString, alignment2, null, null, f3, i4, i19, f4, i6, i5, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, i3);
                                    int iA2 = a(jC2, arrayList2, arrayList);
                                    for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                        ((List) arrayList.get(iA3)).add(ctfVar);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetI;
                    j = j2;
                    fq80Var = fq80Var2;
                } else {
                    charset = charsetI;
                    j = j2;
                    fq80Var = fq80Var2;
                }
                pul0Var = this;
                charsetI = charset;
                j2 = j;
                b930VarA = b930VarA;
                fq80Var2 = fq80Var;
            }
        }
    }
}
