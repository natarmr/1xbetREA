package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class chd0 implements khd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4354a;

    public chd0(boolean z) {
        this.f4354a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chd0) && this.f4354a == ((chd0) obj).f4354a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4354a);
    }

    public final String toString() {
        return defpackage.c.d("SetLoading(loading=", Separators.RPAREN, this.f4354a);
    }
}
