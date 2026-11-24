package a;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class t5v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f33388a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, q5v0 q5v0Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int i2;
        int i3;
        int i4 = q5v0Var.b;
        int length = spannableStringBuilder.length();
        String str2 = q5v0Var.f28173a;
        str2.getClass();
        int i5 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case "c":
                for (String str3 : q5v0Var.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new dvu0(q5v0Var.c), i4, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, q5v0Var);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, p5v0.c);
                int i6 = q5v0Var.b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((p5v0) arrayList.get(i7)).f26424a.f28173a)) {
                        p5v0 p5v0Var = (p5v0) arrayList.get(i7);
                        int iC2 = c(list2, str, p5v0Var.f26424a);
                        if (iC2 == i5) {
                            iC2 = iC != i5 ? iC : 1;
                        }
                        int i8 = p5v0Var.f26424a.b - length2;
                        int i9 = p5v0Var.b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new wkg0(charSequenceSubSequence.toString(), iC2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, q5v0Var);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            n5v0 n5v0Var = ((r5v0) arrayListB.get(i10)).b;
            int i11 = n5v0Var.l;
            if (i11 == -1 && n5v0Var.m == -1) {
                i = -1;
            } else {
                i = (n5v0Var.m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i12 = n5v0Var.l;
                if (i12 == -1 && n5v0Var.m == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i12 == 1 ? 1 : 0) | (n5v0Var.m == 1 ? 2 : 0);
                }
                piz.A(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (n5v0Var.j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (n5v0Var.k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (n5v0Var.g) {
                if (!n5v0Var.g) {
                    jf4.n("Font color not defined");
                    return;
                }
                piz.A(spannableStringBuilder, new ForegroundColorSpan(n5v0Var.f), i4, length);
            }
            if (n5v0Var.i) {
                if (!n5v0Var.i) {
                    jf4.n("Background color not defined.");
                    return;
                }
                piz.A(spannableStringBuilder, new BackgroundColorSpan(n5v0Var.h), i4, length);
            }
            if (n5v0Var.e != null) {
                piz.A(spannableStringBuilder, new TypefaceSpan(n5v0Var.e), i4, length);
            }
            int i13 = n5v0Var.n;
            if (i13 == 1) {
                piz.A(spannableStringBuilder, new AbsoluteSizeSpan((int) n5v0Var.o, true), i4, length);
            } else if (i13 == 2) {
                piz.A(spannableStringBuilder, new RelativeSizeSpan(n5v0Var.o), i4, length);
            } else if (i13 == 3) {
                piz.A(spannableStringBuilder, new RelativeSizeSpan(n5v0Var.o / 100.0f), i4, length);
            }
            if (n5v0Var.q) {
                spannableStringBuilder.setSpan(new bmw(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, q5v0 q5v0Var) {
        ?? size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            n5v0 n5v0Var = (n5v0) list.get(i);
            String str2 = q5v0Var.f28173a;
            Set set = q5v0Var.d;
            String str3 = q5v0Var.c;
            if (n5v0Var.f22964a.isEmpty() && n5v0Var.b.isEmpty() && n5v0Var.c.isEmpty() && n5v0Var.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = n5v0.a(n5v0.a(n5v0.a(0, n5v0Var.f22964a, 1073741824, str), n5v0Var.b, 2, str2), n5v0Var.d, 4, str3);
                size = (iA == -1 || !set.containsAll(n5v0Var.c)) ? 0 : iA + (n5v0Var.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new r5v0(size, n5v0Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, q5v0 q5v0Var) {
        ArrayList arrayListB = b(list, str, q5v0Var);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((r5v0) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static o5v0 d(String str, Matcher matcher, fq80 fq80Var, ArrayList arrayList) {
        s5v0 s5v0Var = new s5v0();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            s5v0Var.f31674a = v5v0.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            s5v0Var.b = v5v0.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, s5v0Var);
            StringBuilder sb = new StringBuilder();
            String strN = fq80Var.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb.length() > 0) {
                    sb.append(Separators.RETURN);
                }
                sb.append(strN.trim());
                strN = fq80Var.n(StandardCharsets.UTF_8);
            }
            s5v0Var.c = f(arrayList, str, sb.toString());
            return new o5v0(s5v0Var.a().a(), s5v0Var.f31674a, s5v0Var.b);
        } catch (IllegalArgumentException unused) {
            f1t0.g0("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, s5v0 s5v0Var) {
        int i;
        int i2;
        int i3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, s5v0Var);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                f1t0.g0("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        s5v0Var.d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i2 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i2 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i2 = 2;
                                    break;
                                default:
                                    f1t0.g0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            s5v0Var.i = i2;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        s5v0Var.h = v5v0.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        s5v0Var.j = v5v0.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i3 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i3 = 1;
                        } else {
                            f1t0.g0("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i3 = Integer.MIN_VALUE;
                        }
                        s5v0Var.k = i3;
                    } else {
                        f1t0.g0("WebvttCueParser", "Unknown cue setting " + strGroup + Separators.COLON + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                f1t0.g0("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(List list, String str, String str2) {
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (q5v0) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new q5v0("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            f1t0.g0("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) Separators.SP);
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        x0x.A(!strTrim2.isEmpty());
                        String str3 = vtt0.f38024a;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        x0x.A(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(Separators.SP);
                                        if (iIndexOf4 == -1) {
                                            c2 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c2 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c2];
                                        HashSet hashSet = new HashSet();
                                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                            hashSet.add(strArrSplit[i4]);
                                        }
                                        arrayDeque.push(new q5v0(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        q5v0 q5v0Var = (q5v0) arrayDeque.pop();
                                        a(str, q5v0Var, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new p5v0(q5v0Var, spannableStringBuilder.length()));
                                        }
                                        if (q5v0Var.f28173a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void g(String str, s5v0 s5v0Var) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    f1t0.g0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            s5v0Var.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith(Separators.PERCENT)) {
            s5v0Var.e = v5v0.b(str);
            s5v0Var.f = false;
        } else {
            s5v0Var.e = Integer.parseInt(str);
            s5v0Var.f = true;
        }
    }
}
