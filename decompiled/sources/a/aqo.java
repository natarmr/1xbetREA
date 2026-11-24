package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aqo implements hqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1306a;

    public aqo(long j) {
        this.f1306a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqo) && this.f1306a == ((aqo) obj).f1306a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1306a);
    }

    public final String toString() {
        return axq.h(this.f1306a, "OnMakeBetClick(couponId=", Separators.RPAREN);
    }
}
