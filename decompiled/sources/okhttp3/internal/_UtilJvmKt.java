package okhttp3.internal;

import a.c99;
import a.emk0;
import a.f99;
import a.hne;
import a.iun;
import a.qx3;
import a.u99;
import android.gov.nist.core.Separators;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _UtilJvmKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f46122a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f46122a = timeZone;
        b = StringsKt.e0(StringsKt.d0("okhttp3.", OkHttpClient.class.getName()), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        return Intrinsics.d(httpUrl.d, httpUrl2.d) && httpUrl.e == httpUrl2.e && Intrinsics.d(httpUrl.f46100a, httpUrl2.f46100a);
    }

    public static final int b(long j, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        if (j < 0) {
            c99.v(str.concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            c99.s(str.concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        c99.s(str.concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.d(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(Response response) {
        String strB = response.f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        byte[] bArr = _UtilCommonKt.f46121a;
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(u99 u99Var, Charset charset) {
        u99Var.getClass();
        charset.getClass();
        int iO0 = u99Var.o0(_UtilCommonKt.b);
        if (iO0 == -1) {
            return charset;
        }
        if (iO0 == 0) {
            return Charsets.UTF_8;
        }
        if (iO0 == 1) {
            return Charsets.b;
        }
        if (iO0 == 2) {
            Charsets.f46070a.getClass();
            Charset charset2 = Charsets.e;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            Charsets.e = charsetForName;
            return charsetForName;
        }
        if (iO0 == 3) {
            return Charsets.c;
        }
        if (iO0 != 4) {
            throw new AssertionError();
        }
        Charsets.f46070a.getClass();
        Charset charset3 = Charsets.f;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        Charsets.f = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(emk0 emk0Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = emk0Var.h().e() ? emk0Var.h().c() - jNanoTime : Long.MAX_VALUE;
        emk0Var.h().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            f99 f99Var = new f99();
            while (emk0Var.Y(f99Var, 8192L) != -1) {
                f99Var.a();
            }
            if (jC == Long.MAX_VALUE) {
                emk0Var.h().a();
                return true;
            }
            emk0Var.h().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                emk0Var.h().a();
                return false;
            }
            emk0Var.h().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                emk0Var.h().a();
            } else {
                emk0Var.h().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final Headers h(List list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            _HeadersCommonKt.a(builder, header.f46181a.x(), header.b.x());
        }
        return _HeadersCommonKt.b(builder);
    }

    public static final String i(HttpUrl httpUrl, boolean z) {
        httpUrl.getClass();
        String strL = httpUrl.d;
        int i = httpUrl.e;
        if (StringsKt.O(strL, Separators.COLON, false)) {
            strL = hne.l(']', "[", strL);
        }
        if (!z && i == HttpUrl.Companion.a(httpUrl.f46100a)) {
            return strL;
        }
        return strL + ':' + i;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(qx3.c(array));
        listUnmodifiableList.getClass();
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return iun.f15405a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(qx3.c((Object[]) objArr.clone()));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
