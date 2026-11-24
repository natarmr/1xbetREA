package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21097a;

    public m350(long j) {
        this.f21097a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m350) && this.f21097a == ((m350) obj).f21097a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21097a);
    }

    public final String toString() {
        return axq.h(this.f21097a, "OnClickDailyTaskActivate(taskId=", Separators.RPAREN);
    }
}
