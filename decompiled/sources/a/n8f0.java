package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n8f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23084a;

    public n8f0(long j) {
        this.f23084a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8f0) && this.f23084a == ((n8f0) obj).f23084a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23084a);
    }

    public final String toString() {
        return axq.h(this.f23084a, "OnAppBarChipClick(chipId=", Separators.RPAREN);
    }
}
