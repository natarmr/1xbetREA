package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dzu0 implements pzu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6959a;

    public dzu0(boolean z) {
        this.f6959a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzu0) && this.f6959a == ((dzu0) obj).f6959a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6959a);
    }

    public final String toString() {
        return defpackage.c.d("ConnectionChanged(isNetworkAvailable=", Separators.RPAREN, this.f6959a);
    }
}
