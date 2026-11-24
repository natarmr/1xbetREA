package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ozu0 implements pzu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26116a;

    public ozu0(long j) {
        this.f26116a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozu0) && this.f26116a == ((ozu0) obj).f26116a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26116a);
    }

    public final String toString() {
        return axq.h(this.f26116a, "OnRemoveActionSelected(balanceId=", Separators.RPAREN);
    }
}
