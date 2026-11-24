package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j5l0 implements m5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15938a;

    public j5l0(boolean z) {
        this.f15938a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5l0) && this.f15938a == ((j5l0) obj).f15938a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15938a);
    }

    public final String toString() {
        return defpackage.c.d("Expandable(expanded=", Separators.RPAREN, this.f15938a);
    }
}
