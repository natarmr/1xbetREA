package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pxr implements rxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27766a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public pxr(long j, String str, String str2, String str3, boolean z) {
        str.getClass();
        this.f27766a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxr)) {
            return false;
        }
        pxr pxrVar = (pxr) obj;
        return this.f27766a == pxrVar.f27766a && Intrinsics.d(this.b, pxrVar.b) && this.c.equals(pxrVar.c) && this.d.equals(pxrVar.d) && this.e == pxrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f27766a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f27766a, "TeamFirst(id=", ", name=", this.b);
        f140.v(sbO, ", firstPlayer=", this.c, ", secondPlayer=", this.d);
        return f140.n(sbO, ", secondPlayerVisible=", this.e, Separators.RPAREN);
    }
}
