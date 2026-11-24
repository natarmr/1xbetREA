package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23134a;

    public n9d0(boolean z) {
        this.f23134a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9d0) && this.f23134a == ((n9d0) obj).f23134a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23134a);
    }

    public final String toString() {
        return defpackage.c.d("Authorization(limitedLogin=", Separators.RPAREN, this.f23134a);
    }
}
