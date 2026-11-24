package okhttp3;

import a.g8x;
import a.jf4;
import a.khy;
import a.y2;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, khy {
    public static final Headers b = new Headers(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f46098a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Headers$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f46099a = new ArrayList(20);

        public final void a(String str, String str2) {
            str.getClass();
            str2.getClass();
            _HeadersCommonKt.f(str);
            _HeadersCommonKt.g(str2, str);
            _HeadersCommonKt.a(this, str, str2);
        }

        public final void b(Headers headers) {
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                _HeadersCommonKt.a(this, _HeadersCommonKt.c(headers, i), _HeadersCommonKt.e(headers, i));
            }
        }

        public final void c(String str, String str2) {
            str.getClass();
            str2.getClass();
            _HeadersCommonKt.f(str);
            _HeadersCommonKt.a(this, str, str2);
        }

        public final void d(String str) {
            str.getClass();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f46099a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }

        public final void e(String str, String str2) {
            str.getClass();
            str2.getClass();
            _HeadersCommonKt.f(str);
            _HeadersCommonKt.g(str2, str);
            d(str);
            _HeadersCommonKt.a(this, str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/Headers$Companion;", "", "Lokhttp3/Headers;", "EMPTY", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Headers a(String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (strArr2.length % 2 != 0) {
                jf4.o("Expected alternating header names and values");
                return null;
            }
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            int length = strArr3.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (strArr3[i2] == null) {
                    jf4.o("Headers cannot be null");
                    return null;
                }
                strArr3[i2] = StringsKt.u0(strArr2[i2]).toString();
            }
            int iJ = g8x.J(0, strArr3.length - 1, 2);
            if (iJ >= 0) {
                while (true) {
                    String str = strArr3[i];
                    String str2 = strArr3[i + 1];
                    _HeadersCommonKt.f(str);
                    _HeadersCommonKt.g(str2, str);
                    if (i == iJ) {
                        break;
                    }
                    i += 2;
                }
            }
            return new Headers(strArr3);
        }
    }

    public Headers(String[] strArr) {
        strArr.getClass();
        this.f46098a = strArr;
    }

    public final String b(String str) {
        String[] strArr = this.f46098a;
        strArr.getClass();
        int length = strArr.length - 2;
        int iJ = g8x.J(length, 0, -2);
        if (iJ > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iJ) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.f46098a, ((Headers) obj).f46098a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46098a);
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(_HeadersCommonKt.c(this, i), _HeadersCommonKt.e(this, i));
        }
        return new y2(pairArr);
    }

    public final int size() {
        return this.f46098a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = _HeadersCommonKt.c(this, i);
            String strE = _HeadersCommonKt.e(this, i);
            sb.append(strC);
            sb.append(": ");
            if (_UtilCommonKt.m(strC)) {
                strE = "██";
            }
            sb.append(strE);
            sb.append(Separators.RETURN);
        }
        return sb.toString();
    }
}
