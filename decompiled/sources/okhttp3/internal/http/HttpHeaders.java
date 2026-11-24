package okhttp3.internal.http;

import a.f99;
import a.gl5;
import a.iun;
import a.jf4;
import a.lun;
import a.qg9;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HttpHeaders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qg9 f46171a;
    public static final qg9 b;

    static {
        qg9 qg9Var = qg9.d;
        f46171a = gl5.i("\"\\");
        b = gl5.i("\t ,=");
    }

    public static final boolean a(Response response) {
        if (Intrinsics.d(response.f46111a.b, "HEAD")) {
            return false;
        }
        int i = response.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || _UtilJvmKt.e(response) != -1) {
            return true;
        }
        String strB = response.f.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        return "chunked".equalsIgnoreCase(strB);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0106 A[EDGE_INSN: B:76:0x0106->B:64:0x0106 BREAK  A[LOOP:2: B:22:0x0071->B:63:0x0103], SYNTHETIC] */
    public static final void b(f99 f99Var, ArrayList arrayList) {
        String strC;
        while (true) {
            String strC2 = null;
            while (true) {
                if (strC2 == null) {
                    e(f99Var);
                    strC2 = c(f99Var);
                    if (strC2 == null) {
                        return;
                    }
                }
                boolean zE = e(f99Var);
                String strC3 = c(f99Var);
                if (strC3 == null) {
                    if (f99Var.v0()) {
                        lun lunVar = lun.f20680a;
                        lunVar.getClass();
                        arrayList.add(new Challenge(strC2, lunVar));
                        return;
                    }
                    return;
                }
                int iP = _UtilCommonKt.p(f99Var);
                boolean zE2 = e(f99Var);
                if (zE || !(zE2 || f99Var.v0())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iP2 = _UtilCommonKt.p(f99Var) + iP;
                    while (true) {
                        if (strC3 != null) {
                            if (iP2 != 0) {
                                break;
                                break;
                            }
                            if (iP2 <= 1) {
                                return;
                            }
                            if (f99Var.v0()) {
                                strC = c(f99Var);
                            } else {
                                strC = c(f99Var);
                            }
                            if (strC != null) {
                                return;
                            }
                            if (e(f99Var)) {
                            }
                            strC3 = null;
                        } else {
                            strC3 = c(f99Var);
                            if (!e(f99Var)) {
                                iP2 = _UtilCommonKt.p(f99Var);
                                if (iP2 != 0) {
                                    break;
                                }
                                if (iP2 <= 1 || e(f99Var)) {
                                    return;
                                }
                                if (f99Var.v0() || f99Var.n(0L) != 34) {
                                    strC = c(f99Var);
                                } else {
                                    if (f99Var.readByte() != 34) {
                                        jf4.o("Failed requirement.");
                                        return;
                                    }
                                    f99 f99Var2 = new f99();
                                    while (true) {
                                        long jW = f99Var.w(f46171a);
                                        if (jW != -1) {
                                            if (f99Var.n(jW) == 34) {
                                                f99Var2.F0(f99Var, jW);
                                                f99Var.readByte();
                                                strC = f99Var2.O();
                                                break;
                                            } else if (f99Var.b != jW + 1) {
                                                f99Var2.F0(f99Var, jW);
                                                f99Var.readByte();
                                                f99Var2.F0(f99Var, 1L);
                                            }
                                        }
                                        strC = null;
                                        break;
                                    }
                                }
                                if (strC != null || ((String) linkedHashMap.put(strC3, strC)) != null) {
                                    return;
                                }
                                if (e(f99Var) && !f99Var.v0()) {
                                    return;
                                } else {
                                    strC3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList.add(new Challenge(strC2, linkedHashMap));
                    strC2 = strC3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strC3 + c.q(iP, "="));
                    mapSingletonMap.getClass();
                    arrayList.add(new Challenge(strC2, mapSingletonMap));
                }
            }
        }
    }

    public static final String c(f99 f99Var) {
        long jW = f99Var.w(b);
        if (jW == -1) {
            jW = f99Var.b;
        }
        if (jW != 0) {
            return f99Var.L(jW, Charsets.UTF_8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x020a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        int i;
        List listUnmodifiableList;
        List listUnmodifiableList2;
        int i2;
        Cookie cookie;
        long j;
        Cookie cookie2;
        String strSubstring;
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar == CookieJar.f46088a) {
            return;
        }
        Pattern pattern = Cookie.k;
        int size = headers.size();
        int i3 = 0;
        int i4 = 0;
        ArrayList arrayList = null;
        while (true) {
            i = 2;
            if (i4 >= size) {
                break;
            }
            if ("Set-Cookie".equalsIgnoreCase(_HeadersCommonKt.c(headers, i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(_HeadersCommonKt.e(headers, i4));
            }
            i4++;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null) {
            listUnmodifiableList = iun.f15405a;
        }
        List list = listUnmodifiableList;
        int size2 = list.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size2) {
            String str = (String) list.get(i5);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int iG = _UtilCommonKt.g(str, ';', i3, i3, 6);
            char c2 = '=';
            int iG2 = _UtilCommonKt.g(str, '=', i3, iG, i);
            if (iG2 == iG) {
                i2 = i3;
                cookie = null;
            } else {
                int iJ = _UtilCommonKt.j(i3, iG2, str);
                String strSubstring2 = str.substring(iJ, _UtilCommonKt.k(iJ, iG2, str));
                if (strSubstring2.length() != 0 && _UtilCommonKt.i(strSubstring2) == -1) {
                    int iJ2 = _UtilCommonKt.j(iG2 + 1, iG, str);
                    String strSubstring3 = str.substring(iJ2, _UtilCommonKt.k(iJ2, iG, str));
                    if (_UtilCommonKt.i(strSubstring3) == -1) {
                        int i6 = iG + 1;
                        int length = str.length();
                        int i7 = i3;
                        int i8 = i7;
                        int i9 = i8;
                        long j2 = -1;
                        long jB = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z = true;
                        String str4 = null;
                        while (true) {
                            if (i6 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    j = (j3 < jCurrentTimeMillis || j3 > 253402300799999L) ? 253402300799999L : j3;
                                } else {
                                    j = jB;
                                }
                                String str5 = httpUrl.d;
                                if (str3 != null) {
                                    if (!Intrinsics.d(str5, str3) && (!c.n(str5, str3, false) || str5.charAt((str5.length() - str3.length()) - 1) != '.' || _HostnamesCommonKt.f46120a.g(str5))) {
                                        i2 = 0;
                                        cookie2 = null;
                                    }
                                    cookie = cookie2;
                                    break;
                                }
                                str3 = str5;
                                if (str5.length() == str3.length() || PublicSuffixDatabase.d.a(str3) != null) {
                                    String strSubstring4 = Separators.SLASH;
                                    i2 = 0;
                                    if (str2 == null || !c.x(str2, Separators.SLASH, false)) {
                                        String strB = httpUrl.b();
                                        int iX = StringsKt.X('/', 0, 6, strB);
                                        if (iX != 0) {
                                            strSubstring4 = strB.substring(0, iX);
                                        }
                                        str2 = strSubstring4;
                                    }
                                    cookie2 = new Cookie(strSubstring2, strSubstring3, j, str3, str2, i9, i7, i8, z, str4);
                                } else {
                                    i2 = 0;
                                    cookie2 = null;
                                }
                                cookie = cookie2;
                                break;
                            }
                            int iF = _UtilCommonKt.f(str, c, i6, length);
                            int iF2 = _UtilCommonKt.f(str, c2, i6, iF);
                            int iJ3 = _UtilCommonKt.j(i6, iF2, str);
                            String strSubstring5 = str.substring(iJ3, _UtilCommonKt.k(iJ3, iF2, str));
                            if (iF2 < iF) {
                                int iJ4 = _UtilCommonKt.j(iF2 + 1, iF, str);
                                strSubstring = str.substring(iJ4, _UtilCommonKt.k(iJ4, iF, str));
                            } else {
                                strSubstring = "";
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    jB = Cookie.Companion.b(strSubstring.length(), strSubstring);
                                    i8 = 1;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    j2 = Long.parseLong(strSubstring);
                                    if (j2 <= 0) {
                                        j2 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    if (!new Regex("-?\\d+").g(strSubstring)) {
                                        throw e;
                                    }
                                    j2 = c.x(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                i8 = 1;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (c.n(strSubstring, Separators.DOT, false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strB2 = _HostnamesCommonKt.b(StringsKt.d0(Separators.DOT, strSubstring));
                                if (strB2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str3 = strB2;
                                z = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                str2 = strSubstring;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                i9 = 1;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                i7 = 1;
                            } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                str4 = strSubstring;
                            }
                            i6 = iF + 1;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        i2 = i3;
                        cookie = null;
                    }
                } else {
                    i2 = i3;
                    cookie = null;
                }
            }
            if (cookie != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(cookie);
            }
            i5++;
            i3 = i2;
            i = 2;
        }
        if (arrayList2 != null) {
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
            listUnmodifiableList2.getClass();
        } else {
            listUnmodifiableList2 = null;
        }
        if (listUnmodifiableList2 == null) {
            listUnmodifiableList2 = iun.f15405a;
        }
        if (listUnmodifiableList2.isEmpty()) {
            return;
        }
        cookieJar.b(httpUrl, listUnmodifiableList2);
    }

    public static final boolean e(f99 f99Var) {
        boolean z = false;
        while (!f99Var.v0()) {
            byte bN = f99Var.n(0L);
            if (bN != 44) {
                if (bN != 32 && bN != 9) {
                    break;
                }
                f99Var.readByte();
            } else {
                f99Var.readByte();
                z = true;
            }
        }
        return z;
    }
}
