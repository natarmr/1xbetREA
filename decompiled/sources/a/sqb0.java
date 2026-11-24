package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sqb0 implements uqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32621a;

    public final boolean equals(Object obj) {
        if (obj instanceof sqb0) {
            return this.f32621a == ((sqb0) obj).f32621a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32621a);
    }

    public final String toString() {
        return axq.h(this.f32621a, "Time(value=", Separators.RPAREN);
    }
}
