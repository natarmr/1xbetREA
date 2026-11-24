package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.Log;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q5w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f28174a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final String[] b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", ParameterNames.INFO, "lg", "ne", "net", "or", "org"};
        b = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:175:0x030f  */
    /* JADX WARN: Code duplicated, block: B:178:0x031c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0327  */
    /* JADX WARN: Code duplicated, block: B:183:0x0330  */
    /* JADX WARN: Code duplicated, block: B:185:0x0336  */
    /* JADX WARN: Code duplicated, block: B:190:0x0344  */
    /* JADX WARN: Code duplicated, block: B:192:0x034a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0351  */
    /* JADX WARN: Code duplicated, block: B:196:0x0353  */
    /* JADX WARN: Code duplicated, block: B:217:0x035f A[EDGE_INSN: B:217:0x035f->B:200:0x035f BREAK  A[LOOP:2: B:156:0x02b0->B:223:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:? A[LOOP:2: B:156:0x02b0->B:223:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x034c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final void a(X509Certificate x509Certificate, String str) throws SSLException {
        int i;
        int i2;
        String str2;
        char[] cArr;
        char c;
        int i3;
        char c2;
        String[] strArr;
        Collection<List<?>> subjectAlternativeNames;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        r4w0 r4w0Var = new r4w0(x509Certificate.getSubjectX500Principal());
        r4w0Var.c = 0;
        r4w0Var.d = 0;
        r4w0Var.e = 0;
        r4w0Var.f = 0;
        String str3 = r4w0Var.f29859a;
        r4w0Var.g = str3.toCharArray();
        List arrayList = Collections.EMPTY_LIST;
        String strC = r4w0Var.c();
        if (strC == null) {
            i = 1;
            i2 = 2;
            break;
        }
        while (true) {
            int i9 = r4w0Var.c;
            int i10 = r4w0Var.b;
            if (i9 >= i10) {
                i = 1;
                i2 = 2;
                break;
            }
            char c3 = r4w0Var.g[i9];
            i = 1;
            i2 = 2;
            if (c3 == '\"') {
                int i11 = i9 + 1;
                r4w0Var.c = i11;
                r4w0Var.d = i11;
                r4w0Var.e = i11;
                while (true) {
                    int i12 = r4w0Var.c;
                    if (i12 == i10) {
                        jf4.n("Unexpected end of DN: ".concat(str3));
                        return;
                    }
                    char[] cArr2 = r4w0Var.g;
                    char c4 = cArr2[i12];
                    if (c4 == '\"') {
                        r4w0Var.c = i12 + 1;
                        while (true) {
                            int i13 = r4w0Var.c;
                            if (i13 >= i10 || r4w0Var.g[i13] != ' ') {
                                break;
                            } else {
                                r4w0Var.c = i13 + 1;
                            }
                        }
                        char[] cArr3 = r4w0Var.g;
                        int i14 = r4w0Var.d;
                        str2 = new String(cArr3, i14, r4w0Var.e - i14);
                        break;
                    }
                    int i15 = r4w0Var.e;
                    if (c4 == '\\') {
                        cArr2[i15] = r4w0Var.b();
                    } else {
                        cArr2[i15] = c4;
                    }
                    r4w0Var.c++;
                    r4w0Var.e++;
                }
            } else if (c3 == '#') {
                if (i9 + 4 >= i10) {
                    jf4.n("Unexpected end of DN: ".concat(str3));
                    return;
                }
                r4w0Var.d = i9;
                r4w0Var.c = i9 + 1;
                while (true) {
                    int i16 = r4w0Var.c;
                    if (i16 == i10 || (c = (cArr = r4w0Var.g)[i16]) == '+' || c == ',' || c == ';') {
                        r4w0Var.e = i16;
                        break;
                    }
                    if (c == ' ') {
                        r4w0Var.e = i16;
                        r4w0Var.c = i16 + 1;
                        while (true) {
                            int i17 = r4w0Var.c;
                            if (i17 >= i10 || r4w0Var.g[i17] != ' ') {
                                break;
                            } else {
                                r4w0Var.c = i17 + 1;
                            }
                        }
                    } else {
                        if (c >= 'A' && c <= 'F') {
                            cArr[i16] = (char) (c + ' ');
                        }
                        r4w0Var.c = i16 + 1;
                    }
                }
                int i18 = r4w0Var.e;
                int i19 = r4w0Var.d;
                int i20 = i18 - i19;
                if (i20 < 5 || (i20 & 1) == 0) {
                    jf4.n("Unexpected end of DN: ".concat(str3));
                    return;
                }
                int i21 = i20 / 2;
                byte[] bArr = new byte[i21];
                int i22 = i19 + 1;
                for (int i23 = 0; i23 < i21; i23++) {
                    bArr[i23] = (byte) r4w0Var.a(i22);
                    i22 += 2;
                }
                str2 = new String(r4w0Var.g, r4w0Var.d, i20);
            } else if (c3 != '+' && c3 != ',' && c3 != ';') {
                r4w0Var.d = i9;
                r4w0Var.e = i9;
                while (true) {
                    int i24 = r4w0Var.c;
                    char[] cArr4 = r4w0Var.g;
                    if (i24 >= i10) {
                        int i25 = r4w0Var.d;
                        str2 = new String(cArr4, i25, r4w0Var.e - i25);
                        break;
                    }
                    char c5 = cArr4[i24];
                    if (c5 != ' ') {
                        if (c5 != ';') {
                            if (c5 == '\\') {
                                int i26 = r4w0Var.e;
                                r4w0Var.e = i26 + 1;
                                cArr4[i26] = r4w0Var.b();
                                r4w0Var.c++;
                            } else if (c5 != '+' && c5 != ',') {
                                int i27 = r4w0Var.e;
                                r4w0Var.e = i27 + 1;
                                cArr4[i27] = c5;
                                r4w0Var.c = i24 + 1;
                            }
                        }
                        int i28 = r4w0Var.d;
                        str2 = new String(cArr4, i28, r4w0Var.e - i28);
                        break;
                    }
                    int i29 = r4w0Var.e;
                    r4w0Var.f = i29;
                    r4w0Var.c = i24 + 1;
                    r4w0Var.e = i29 + 1;
                    cArr4[i29] = ' ';
                    while (true) {
                        i3 = r4w0Var.c;
                        if (i3 >= i10) {
                            break;
                        }
                        char[] cArr5 = r4w0Var.g;
                        if (cArr5[i3] != ' ') {
                            break;
                        }
                        int i30 = r4w0Var.e;
                        r4w0Var.e = i30 + 1;
                        cArr5[i30] = ' ';
                        r4w0Var.c = i3 + 1;
                    }
                    if (i3 == i10 || (c2 = r4w0Var.g[i3]) == ',' || c2 == '+' || c2 == ';') {
                        char[] cArr6 = r4w0Var.g;
                        int i31 = r4w0Var.d;
                        str2 = new String(cArr6, i31, r4w0Var.f - i31);
                        break;
                    }
                }
            } else {
                str2 = "";
            }
            if ("cn".equalsIgnoreCase(strC)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                arrayList.add(str2);
            }
            int i32 = r4w0Var.c;
            if (i32 >= i10) {
                break;
            }
            char c6 = r4w0Var.g[i32];
            if (c6 != ',' && c6 != ';' && c6 != '+') {
                jf4.n("Malformed DN: ".concat(str3));
                return;
            }
            r4w0Var.c = i32 + 1;
            strC = r4w0Var.c();
            if (strC == null) {
                jf4.n("Malformed DN: ".concat(str3));
                return;
            }
        }
        String[] strArr2 = null;
        if (arrayList.isEmpty()) {
            strArr = null;
        } else {
            String[] strArr3 = new String[arrayList.size()];
            arrayList.toArray(strArr3);
            strArr = strArr3;
        }
        LinkedList linkedList = new LinkedList();
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Log.e("SecurityComp20000302: ", "Error parsing certificate.", e);
            subjectAlternativeNames = null;
        }
        if (subjectAlternativeNames != null) {
            for (List<?> list : subjectAlternativeNames) {
                int i33 = i2;
                if (((Integer) list.get(0)).intValue() == i33) {
                    linkedList.add((String) list.get(i));
                    i = 1;
                    i2 = 2;
                } else {
                    i2 = i33;
                    i = 1;
                }
            }
        }
        if (!linkedList.isEmpty()) {
            strArr2 = new String[linkedList.size()];
            linkedList.toArray(strArr2);
        }
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        LinkedList linkedList2 = new LinkedList();
        if (strArr == null || strArr.length <= 0) {
            i4 = 0;
        } else {
            i4 = 0;
            String str4 = strArr[0];
            if (str4 != null) {
                linkedList2.add(str4);
            }
        }
        if (strArr2 != null) {
            int length = strArr2.length;
            for (int i34 = i4; i34 < length; i34++) {
                String str5 = strArr2[i34];
                if (str5 != null) {
                    linkedList2.add(str5);
                }
            }
        }
        if (linkedList2.isEmpty()) {
            throw new SSLException(kng0.l("Certificate for <", str, "> doesn't contain CN or DNS subjectAlt"));
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList2.iterator();
        ?? Equals = i4;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append('>');
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(46, 2) != -1) {
                int length2 = lowerCase2.length();
                if (length2 >= 7 && length2 <= 9) {
                    int i35 = length2 - 3;
                    if (lowerCase2.charAt(i35) == '.') {
                        if (Arrays.binarySearch(b, lowerCase2.substring(2, i35)) < 0) {
                        }
                        if (Equals != 0) {
                            break;
                            break;
                        }
                    }
                    if (!f28174a.matcher(str).matches()) {
                        Equals = lowerCase.endsWith(lowerCase2.substring(1));
                        if (Equals != 0) {
                            i5 = i4;
                            i6 = i5;
                            while (i5 < lowerCase.length()) {
                                if (lowerCase.charAt(i5) == '.') {
                                    i6++;
                                }
                                i5++;
                            }
                            i7 = i4;
                            i8 = i7;
                            while (i7 < lowerCase2.length()) {
                                if (lowerCase2.charAt(i7) == '.') {
                                    i8++;
                                }
                                i7++;
                            }
                            if (i6 == i8) {
                                Equals = 1;
                            } else {
                                Equals = i4;
                            }
                        }
                    }
                    if (Equals != 0) {
                        break;
                        break;
                    }
                } else {
                    if (!f28174a.matcher(str).matches()) {
                        Equals = lowerCase.endsWith(lowerCase2.substring(1));
                        if (Equals != 0) {
                            i5 = i4;
                            i6 = i5;
                            while (i5 < lowerCase.length()) {
                                if (lowerCase.charAt(i5) == '.') {
                                    i6++;
                                }
                                i5++;
                            }
                            i7 = i4;
                            i8 = i7;
                            while (i7 < lowerCase2.length()) {
                                if (lowerCase2.charAt(i7) == '.') {
                                    i8++;
                                }
                                i7++;
                            }
                            if (i6 == i8) {
                                Equals = 1;
                            } else {
                                Equals = i4;
                            }
                        }
                    }
                    if (Equals != 0) {
                        break;
                    }
                }
            }
            Equals = lowerCase.equals(lowerCase2);
            if (Equals != 0) {
                break;
                break;
            }
        }
        if (Equals != 0) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
    }
}
