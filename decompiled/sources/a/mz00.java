package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mz00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22629a;

    public mz00(int i) {
        this.f22629a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mz00) && this.f22629a == ((mz00) obj).f22629a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22629a);
    }

    public final String toString() {
        return ua80.e(this.f22629a, "LolCompletedCacheState(banPickDrawCount=", Separators.RPAREN);
    }
}
