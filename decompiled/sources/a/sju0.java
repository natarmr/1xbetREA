package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sju0 implements uju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32319a;

    public sju0(boolean z) {
        this.f32319a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sju0) && this.f32319a == ((sju0) obj).f32319a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32319a);
    }

    public final String toString() {
        return defpackage.c.d("Double(isUpper=", Separators.RPAREN, this.f32319a);
    }
}
