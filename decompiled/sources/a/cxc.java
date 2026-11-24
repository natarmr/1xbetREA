package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cxc implements exc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f5117a;
    public final long b;

    public cxc(jkm jkmVar, long j) {
        jkmVar.getClass();
        this.f5117a = jkmVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxc)) {
            return false;
        }
        cxc cxcVar = (cxc) obj;
        return Intrinsics.d(this.f5117a, cxcVar.f5117a) && this.b == cxcVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f5117a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f5117a + ", lottieCountdownTime=" + this.b + Separators.RPAREN;
    }
}
