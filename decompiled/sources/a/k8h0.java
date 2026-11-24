package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k8h0 implements g9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17871a;

    public k8h0(boolean z) {
        this.f17871a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8h0) && this.f17871a == ((k8h0) obj).f17871a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17871a);
    }

    public final String toString() {
        return defpackage.c.d("Error(isCountryBlocking=", Separators.RPAREN, this.f17871a);
    }
}
