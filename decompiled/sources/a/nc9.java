package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nc9 implements oc9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23281a;

    public nc9(long j) {
        this.f23281a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc9) && this.f23281a == ((nc9) obj).f23281a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23281a);
    }

    public final String toString() {
        return axq.h(this.f23281a, "OnItemClick(builderId=", Separators.RPAREN);
    }
}
