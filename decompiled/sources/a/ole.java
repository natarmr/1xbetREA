package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ole extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25449a;

    public ole(boolean z) {
        this.f25449a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ole) && this.f25449a == ((ole) obj).f25449a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25449a);
    }

    public final String toString() {
        return defpackage.c.d("InstantBetAllowed(allowed=", Separators.RPAREN, this.f25449a);
    }
}
