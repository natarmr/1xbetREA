package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gib implements jib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11336a;

    public gib(boolean z) {
        this.f11336a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gib) && this.f11336a == ((gib) obj).f11336a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11336a);
    }

    public final String toString() {
        return defpackage.c.d("EnableDebugMode(enabled=", Separators.RPAREN, this.f11336a);
    }
}
