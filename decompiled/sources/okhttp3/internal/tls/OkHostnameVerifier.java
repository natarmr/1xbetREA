package okhttp3.internal.tls;

import a.b1j;
import a.c99;
import a.iun;
import a.jf4;
import a.ua80;
import android.gov.nist.core.Separators;
import java.io.EOFException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._HostnamesCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkHostnameVerifier implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OkHostnameVerifier f46222a = new OkHostnameVerifier();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return iun.f15405a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.d(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return iun.f15405a;
        }
    }

    public static boolean b(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            c99.s(ua80.e(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            jf4.h(str.length(), b1j.m(length2, "endIndex > string.length: ", " > "));
            return false;
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    public static boolean c(X509Certificate x509Certificate, String str) throws EOFException {
        boolean zEquals;
        int length;
        List listA;
        str.getClass();
        if (_HostnamesCommonKt.f46120a.g(str)) {
            String strB = _HostnamesCommonKt.b(str);
            if (strB != null && ((listA = a(x509Certificate, 7)) == null || !listA.isEmpty())) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (strB.equals(_HostnamesCommonKt.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (listA2 == null || !listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                if (str.length() == 0 || c.x(str, Separators.DOT, false) || c.n(str, "..", false) || lowerCase == null || lowerCase.length() == 0 || c.x(lowerCase, Separators.DOT, false) || c.n(lowerCase, "..", false)) {
                    zEquals = false;
                } else {
                    String strConcat = !c.n(str, Separators.DOT, false) ? str.concat(Separators.DOT) : str;
                    if (!c.n(lowerCase, Separators.DOT, false)) {
                        lowerCase = lowerCase.concat(Separators.DOT);
                    }
                    if (b(lowerCase)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        lowerCase = lowerCase.toLowerCase(locale2);
                        lowerCase.getClass();
                    }
                    if (!StringsKt.O(lowerCase, Separators.STAR, false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!c.x(lowerCase, "*.", false) || StringsKt.U('*', 1, 4, lowerCase) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (c.n(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || StringsKt.X('.', length - 1, 4, strConcat) == -1)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return c((X509Certificate) certificate, str);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
