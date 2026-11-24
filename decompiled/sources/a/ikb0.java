package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ikb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14918a;

    public /* synthetic */ ikb0(long j) {
        this.f14918a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ikb0) {
            return this.f14918a == ((ikb0) obj).f14918a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14918a);
    }

    public final String toString() {
        return axq.h(this.f14918a, "OnPopularChampClick(champId=", Separators.RPAREN);
    }
}
