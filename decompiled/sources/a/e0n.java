package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e0n implements g0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6996a;
    public final r7n b;
    public final String c;
    public final boolean d;

    public e0n(long j, r7n r7nVar, String str, boolean z) {
        this.f6996a = j;
        this.b = r7nVar;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0n)) {
            return false;
        }
        e0n e0nVar = (e0n) obj;
        return this.f6996a == e0nVar.f6996a && this.b == e0nVar.b && Intrinsics.d(this.c, e0nVar.c) && this.d == e0nVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b((this.b.hashCode() + (Long.hashCode(this.f6996a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timer(timerTimeMillis=");
        sb.append(this.f6996a);
        sb.append(", timerType=");
        sb.append(this.b);
        w6x.z(", timerCaption=", this.c, ", isTimerRun=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public /* synthetic */ e0n(long j) {
        this(j, r7n.c, "", true);
    }
}
