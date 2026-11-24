package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l62 implements s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19485a;

    public l62(long j) {
        this.f19485a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l62) && this.f19485a == ((l62) obj).f19485a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19485a);
    }

    public final String toString() {
        return axq.h(this.f19485a, "OnLongSelectChamp(id=", Separators.RPAREN);
    }
}
