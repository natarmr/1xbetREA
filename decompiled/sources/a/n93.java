package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n93 implements o93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23118a;

    public n93(long j) {
        this.f23118a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n93) && this.f23118a == ((n93) obj).f23118a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23118a);
    }

    public final String toString() {
        return axq.h(this.f23118a, "OnSendParams(selectedCategoryId=", Separators.RPAREN);
    }
}
