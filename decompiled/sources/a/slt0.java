package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class slt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32415a;

    public slt0(boolean z) {
        this.f32415a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slt0) && this.f32415a == ((slt0) obj).f32415a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32415a);
    }

    public final String toString() {
        return defpackage.c.d("UpdateOperatorInvokeAvailabilityEvent(availability=", Separators.RPAREN, this.f32415a);
    }
}
