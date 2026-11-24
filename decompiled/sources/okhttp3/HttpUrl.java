package okhttp3;

import a.axq;
import a.dw9;
import a.hne;
import a.jf4;
import a.l1e0;
import a.ohq;
import a.q3d;
import a.r3d;
import a.ttm0;
import a.twn;
import android.gov.nist.core.Separators;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/HttpUrl;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpUrl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46100a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46101a;
        public String d;
        public ArrayList g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;
        public final ArrayList f = q3d.l("");

        public static ArrayList c(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iU = StringsKt.U('&', i, 4, str);
                if (iU == -1) {
                    iU = str.length();
                }
                int iU2 = StringsKt.U('=', i, 4, str);
                if (iU2 == -1 || iU2 > iU) {
                    arrayList.add(str.substring(i, iU));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, iU2));
                    arrayList.add(str.substring(iU2 + 1, iU));
                }
                i = iU + 1;
            }
            return arrayList;
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.f46101a;
            if (str == null) {
                jf4.n("scheme == null");
                return null;
            }
            String strD = _UrlKt.d(0, 0, 7, this.b);
            String strD2 = _UrlKt.d(0, 0, 7, this.c);
            String str2 = this.d;
            if (str2 == null) {
                jf4.n("host == null");
                return null;
            }
            int iA = this.e;
            if (iA == -1) {
                String str3 = this.f46101a;
                str3.getClass();
                iA = Companion.a(str3);
            }
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(_UrlKt.d(0, 0, 7, (String) it.next()));
            }
            ArrayList<String> arrayList4 = this.g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(r3d.q(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 != null ? _UrlKt.d(0, 0, 3, str4) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.h;
            return new HttpUrl(str, strD, strD2, str2, iA, arrayList3, arrayList, str5 != null ? _UrlKt.d(0, 0, 7, str5) : null, toString());
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0028  */
        public final void b(HttpUrl httpUrl, String str) {
            int i;
            char c;
            char c2;
            int iE;
            int i2;
            char cCharAt;
            str.getClass();
            byte[] bArr = _UtilCommonKt.f46121a;
            int iJ = _UtilCommonKt.j(0, str.length(), str);
            int iK = _UtilCommonKt.k(iJ, str.length(), str);
            if (iK - iJ >= 2) {
                char cCharAt2 = str.charAt(iJ);
                if ((Intrinsics.e(cCharAt2, 97) >= 0 && Intrinsics.e(cCharAt2, 122) <= 0) || (Intrinsics.e(cCharAt2, 65) >= 0 && Intrinsics.e(cCharAt2, 90) <= 0)) {
                    i = iJ + 1;
                    while (true) {
                        if (i < iK) {
                            char cCharAt3 = str.charAt(i);
                            if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                                if (cCharAt3 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            }
                            i++;
                        }
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
            if (i != -1) {
                if (c.w(iJ, str, "https:", true)) {
                    this.f46101a = "https";
                    iJ += 6;
                } else {
                    if (!c.w(iJ, str, "http:", true)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                    }
                    this.f46101a = "http";
                    iJ += 5;
                }
            } else {
                if (httpUrl == null) {
                    jf4.o("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? ttm0.L(6, str).concat("...") : str));
                    return;
                }
                this.f46101a = httpUrl.f46100a;
            }
            int i3 = iJ;
            int i4 = 0;
            while (true) {
                c = '\\';
                c2 = '/';
                if (i3 >= iK || !((cCharAt = str.charAt(i3)) == '/' || cCharAt == '\\')) {
                    break;
                }
                i4++;
                i3++;
            }
            ArrayList arrayList = this.f;
            char c3 = '#';
            if (i4 >= 2 || httpUrl == null || !Intrinsics.d(httpUrl.f46100a, this.f46101a)) {
                int i5 = iJ + i4;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iE = _UtilCommonKt.e(i5, str, iK, "@/\\?#");
                    byte bCharAt = iE != iK ? str.charAt(iE) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c3 || bCharAt == c2 || bCharAt == c || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            this.c += "%40" + _UrlKt.a(str, i5, iE, 112, " \"':;<=>@[]^`{}|/\\?#");
                        } else {
                            int iF = _UtilCommonKt.f(str, ':', i5, iE);
                            String strA = _UrlKt.a(str, i5, iF, 112, " \"':;<=>@[]^`{}|/\\?#");
                            if (z2) {
                                strA = axq.n(new StringBuilder(this.b), "%40", strA);
                            }
                            this.b = strA;
                            if (iF != iE) {
                                this.c = _UrlKt.a(str, iF + 1, iE, 112, " \"':;<=>@[]^`{}|/\\?#");
                                z = true;
                            }
                            z2 = true;
                        }
                        i5 = iE + 1;
                        c3 = '#';
                        c = '\\';
                        c2 = '/';
                    }
                }
                int i6 = i5;
                while (true) {
                    if (i6 < iE) {
                        char cCharAt4 = str.charAt(i6);
                        if (cCharAt4 == ':') {
                            break;
                        }
                        if (cCharAt4 == '[') {
                            do {
                                i6++;
                                if (i6 >= iE) {
                                    break;
                                }
                            } while (str.charAt(i6) != ']');
                        }
                        i6++;
                    } else {
                        i6 = iE;
                        break;
                    }
                }
                int i7 = i6 + 1;
                if (i7 < iE) {
                    this.d = _HostnamesCommonKt.b(_UrlKt.d(i5, i6, 4, str));
                    try {
                        i2 = Integer.parseInt(_UrlKt.a(str, i7, iE, 120, ""));
                        if (1 > i2 || i2 >= 65536) {
                            i2 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.e = i2;
                    if (i2 == -1) {
                        ohq.i(34, "Invalid URL port: \"", str.substring(i7, iE));
                        return;
                    }
                } else {
                    this.d = _HostnamesCommonKt.b(_UrlKt.d(i5, i6, 4, str));
                    String str2 = this.f46101a;
                    str2.getClass();
                    this.e = Companion.a(str2);
                }
                if (this.d == null) {
                    ohq.i(34, "Invalid URL host: \"", str.substring(i5, i6));
                    return;
                }
                iJ = iE;
            } else {
                this.b = httpUrl.e();
                this.c = httpUrl.a();
                this.d = httpUrl.d;
                this.e = httpUrl.e;
                arrayList.clear();
                arrayList.addAll(httpUrl.c());
                if (iJ == iK || str.charAt(iJ) == '#') {
                    String strD = httpUrl.d();
                    this.g = strD != null ? c(_UrlKt.a(strD, 0, 0, 83, " \"'<>#")) : null;
                }
            }
            int iE2 = _UtilCommonKt.e(iJ, str, iK, "?#");
            if (iJ != iE2) {
                char cCharAt5 = str.charAt(iJ);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList.clear();
                    arrayList.add("");
                    iJ++;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                }
                while (iJ < iE2) {
                    int iE3 = _UtilCommonKt.e(iJ, str, iE2, "/\\");
                    boolean z3 = iE3 < iE2;
                    String strA2 = _UrlKt.a(str, iJ, iE3, 112, " \"<>^`{}|/\\?#");
                    if (!strA2.equals(Separators.DOT) && !strA2.equalsIgnoreCase("%2e")) {
                        if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                            if (((CharSequence) dw9.l(1, arrayList)).length() == 0) {
                                arrayList.set(arrayList.size() - 1, strA2);
                            } else {
                                arrayList.add(strA2);
                            }
                            if (z3) {
                                arrayList.add("");
                            }
                        } else if (((String) hne.k(1, arrayList)).length() != 0 || arrayList.isEmpty()) {
                            arrayList.add("");
                        } else {
                            arrayList.set(arrayList.size() - 1, "");
                        }
                    }
                    iJ = z3 ? iE3 + 1 : iE3;
                }
            }
            if (iE2 < iK && str.charAt(iE2) == '?') {
                int iF2 = _UtilCommonKt.f(str, '#', iE2, iK);
                this.g = c(_UrlKt.a(str, iE2 + 1, iF2, 80, " \"'<>#"));
                iE2 = iF2;
            }
            if (iE2 >= iK || str.charAt(iE2) != '#') {
                return;
            }
            this.h = _UrlKt.a(str, iE2 + 1, iK, 48, "");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f46101a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.b.length() > 0 || this.c.length() > 0) {
                sb.append(this.b);
                if (this.c.length() > 0) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (StringsKt.P(str2, ':')) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int iA = this.e;
            if (iA != -1 || this.f46101a != null) {
                if (iA == -1) {
                    String str3 = this.f46101a;
                    str3.getClass();
                    iA = Companion.a(str3);
                }
                String str4 = this.f46101a;
                if (str4 == null || iA != Companion.a(str4)) {
                    sb.append(':');
                    sb.append(iA);
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) arrayList.get(i));
            }
            if (this.g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.g;
                arrayList2.getClass();
                a aVarM = l1e0.m(2, l1e0.o(0, arrayList2.size()));
                int i2 = aVarM.f46068a;
                int i3 = aVarM.b;
                int i4 = aVarM.c;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    while (true) {
                        String str5 = (String) arrayList2.get(i2);
                        String str6 = (String) arrayList2.get(i2 + 1);
                        if (i2 > 0) {
                            sb.append('&');
                        }
                        sb.append(str5);
                        if (str6 != null) {
                            sb.append('=');
                            sb.append(str6);
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static int a(String str) {
            str.getClass();
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        public static HttpUrl b(String str) {
            str.getClass();
            Builder builder = new Builder();
            builder.b(null, str);
            return builder.a();
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f46100a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.f46100a.length() + 3;
        String str = this.i;
        return str.substring(StringsKt.U(':', length, 4, str) + 1, StringsKt.U('@', 0, 6, str));
    }

    public final String b() {
        int length = this.f46100a.length() + 3;
        String str = this.i;
        int iU = StringsKt.U('/', length, 4, str);
        return str.substring(iU, _UtilCommonKt.e(iU, str, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.f46100a.length() + 3;
        String str = this.i;
        int iU = StringsKt.U('/', length, 4, str);
        int iE = _UtilCommonKt.e(iU, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iU < iE) {
            int i = iU + 1;
            int iF = _UtilCommonKt.f(str, '/', i, iE);
            arrayList.add(str.substring(i, iF));
            iU = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iU = StringsKt.U('?', 0, 6, str) + 1;
        return str.substring(iU, _UtilCommonKt.f(str, '#', iU, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.f46100a.length() + 3;
        String str = this.i;
        return str.substring(length, _UtilCommonKt.e(length, str, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).i.equals(this.i);
    }

    public final boolean f() {
        return Intrinsics.d(this.f46100a, "https");
    }

    public final Builder g() {
        Builder builder = new Builder();
        String str = this.f46100a;
        builder.f46101a = str;
        builder.b = e();
        builder.c = a();
        builder.d = this.d;
        int iA = Companion.a(str);
        int i = this.e;
        if (i == iA) {
            i = -1;
        }
        builder.e = i;
        ArrayList arrayList = builder.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        builder.g = strD != null ? Builder.c(_UrlKt.a(strD, 0, 0, 83, " \"'<>#")) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(StringsKt.U('#', 0, 6, str2) + 1);
        }
        builder.h = strSubstring;
        return builder;
    }

    public final String h() {
        Builder builder;
        try {
            builder = new Builder();
            builder.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        builder.getClass();
        builder.b = _UrlKt.a("", 0, 0, 123, " \"':;<=>@[]^`{}|/\\?#");
        builder.c = _UrlKt.a("", 0, 0, 123, " \"':;<=>@[]^`{}|/\\?#");
        return builder.a().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        Builder builderG = g();
        ArrayList arrayList = builderG.f;
        String str = builderG.d;
        builderG.d = str != null ? twn.p("[\"<>^`{|}]", str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, _UrlKt.a((String) arrayList.get(i), 0, 0, 99, "[]"));
        }
        ArrayList arrayList2 = builderG.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? _UrlKt.a(str2, 0, 0, 67, "\\^`{|}") : null);
            }
        }
        String str3 = builderG.h;
        builderG.h = str3 != null ? _UrlKt.a(str3, 0, 0, 35, " \"#<>\\^`{|}") : null;
        String string = builderG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                ohq.p(e);
                return null;
            }
        }
    }

    public final URL j() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            ohq.p(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getI() {
        return this.i;
    }
}
