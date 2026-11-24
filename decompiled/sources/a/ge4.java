package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ge4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11133a;

    public final boolean equals(Object obj) {
        if (obj instanceof ge4) {
            return this.f11133a.equals(((ge4) obj).f11133a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11133a.hashCode();
    }

    public final String toString() {
        return "OnLoginValueChanged(value=" + ((Object) this.f11133a) + Separators.RPAREN;
    }
}
