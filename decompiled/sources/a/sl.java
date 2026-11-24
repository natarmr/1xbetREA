package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class sl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32374a;
    public final String b;
    public final String c;

    public sl(long j, String str, String str2) {
        str2.getClass();
        this.f32374a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl)) {
            return false;
        }
        sl slVar = (sl) obj;
        return this.f32374a == slVar.f32374a && this.b.equals(slVar.b) && Intrinsics.d(this.c, slVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f32374a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f32374a, "ActiveLimitValueModel(value=", ", measure=", this.b), ", valueView=", this.c, Separators.RPAREN);
    }
}
