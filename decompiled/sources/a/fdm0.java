package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fdm0 implements hdm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9364a;

    public /* synthetic */ fdm0(long j) {
        this.f9364a = j;
    }

    @Override // a.hdm0
    public final long a() {
        return this.f9364a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fdm0) {
            return this.f9364a == ((fdm0) obj).f9364a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9364a);
    }

    public final String toString() {
        return axq.h(this.f9364a, "Error(globalChampId=", Separators.RPAREN);
    }
}
