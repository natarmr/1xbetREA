package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gpg0 implements mpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uog0 f11683a;

    public final boolean equals(Object obj) {
        if (obj instanceof gpg0) {
            return this.f11683a.equals(((gpg0) obj).f11683a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11683a.hashCode();
    }

    public final String toString() {
        return "FirstPlayerCounterfoilParams(value=" + this.f11683a + Separators.RPAREN;
    }
}
