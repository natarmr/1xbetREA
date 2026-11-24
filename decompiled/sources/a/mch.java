package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mch implements och {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f21551a;
    public final short b;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public mch(jkm jkmVar, long j) {
        this.f21551a = jkmVar;
        this.b = (int) j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mch)) {
            return false;
        }
        mch mchVar = (mch) obj;
        return this.f21551a.equals(mchVar.f21551a) && ((long) this.b) == ((long) mchVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f21551a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f21551a + ", countDownTimeMillis=" + this.b + Separators.RPAREN;
    }
}
