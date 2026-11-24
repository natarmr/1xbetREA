package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class x6a {
    public static final w6a Companion = new w6a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40353a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public x6a(int i, int i2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, v6a.b);
            throw null;
        }
        this.f40353a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6a)) {
            return false;
        }
        x6a x6aVar = (x6a) obj;
        return Intrinsics.d(this.f40353a, x6aVar.f40353a) && Intrinsics.d(this.b, x6aVar.b) && Intrinsics.d(this.c, x6aVar.c) && this.d == x6aVar.d && Intrinsics.d(this.e, x6aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f40353a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CaptchaRequest(appGuid=", this.f40353a, ", language=", this.b, ", method=");
        twn.w(this.d, this.c, ", versionGen=", ", login=", sbN);
        return axq.n(sbN, this.e, Separators.RPAREN);
    }

    public x6a(int i, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f40353a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }
}
