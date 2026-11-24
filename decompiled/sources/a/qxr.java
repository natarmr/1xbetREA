package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qxr implements rxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29500a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public qxr(long j, String str, String str2, String str3, boolean z) {
        str.getClass();
        this.f29500a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxr)) {
            return false;
        }
        qxr qxrVar = (qxr) obj;
        return this.f29500a == qxrVar.f29500a && Intrinsics.d(this.b, qxrVar.b) && this.c.equals(qxrVar.c) && this.d.equals(qxrVar.d) && this.e == qxrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f29500a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29500a, "TeamSecond(id=", ", name=", this.b);
        f140.v(sbO, ", firstPlayer=", this.c, ", secondPlayer=", this.d);
        return f140.n(sbO, ", secondPlayerVisible=", this.e, Separators.RPAREN);
    }
}
