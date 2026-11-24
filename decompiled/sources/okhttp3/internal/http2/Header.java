package okhttp3.internal.http2;

import a.gl5;
import a.qg9;
import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Header {
    public static final qg9 d;
    public static final qg9 e;
    public static final qg9 f;
    public static final qg9 g;
    public static final qg9 h;
    public static final qg9 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg9 f46181a;
    public final qg9 b;
    public final int c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "La/qg9;", "PSEUDO_PREFIX", "La/qg9;", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_METHOD_UTF8", "TARGET_PATH_UTF8", "TARGET_SCHEME_UTF8", "TARGET_AUTHORITY_UTF8", "RESPONSE_STATUS", "TARGET_METHOD", "TARGET_PATH", "TARGET_SCHEME", "TARGET_AUTHORITY", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        qg9 qg9Var = qg9.d;
        d = gl5.i(Separators.COLON);
        e = gl5.i(":status");
        f = gl5.i(":method");
        g = gl5.i(":path");
        h = gl5.i(":scheme");
        i = gl5.i(":authority");
    }

    public Header(qg9 qg9Var, qg9 qg9Var2) {
        qg9Var.getClass();
        qg9Var2.getClass();
        this.f46181a = qg9Var;
        this.b = qg9Var2;
        this.c = qg9Var2.e() + qg9Var.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.d(this.f46181a, header.f46181a) && Intrinsics.d(this.b, header.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46181a.hashCode() * 31);
    }

    public final String toString() {
        return this.f46181a.x() + ": " + this.b.x();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(gl5.i(str), gl5.i(str2));
        str.getClass();
        qg9 qg9Var = qg9.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(qg9 qg9Var, String str) {
        this(qg9Var, gl5.i(str));
        qg9Var.getClass();
        str.getClass();
        qg9 qg9Var2 = qg9.d;
    }
}
