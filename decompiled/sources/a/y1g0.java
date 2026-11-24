package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y1g0 implements c2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41853a;

    public final boolean equals(Object obj) {
        if (obj instanceof y1g0) {
            return this.f41853a == ((y1g0) obj).f41853a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41853a);
    }

    public final String toString() {
        return axq.h(this.f41853a, "OnAccordionBtnClick(gameId=", Separators.RPAREN);
    }
}
