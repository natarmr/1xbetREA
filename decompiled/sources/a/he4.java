package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class he4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12903a;

    public final boolean equals(Object obj) {
        if (obj instanceof he4) {
            return this.f12903a.equals(((he4) obj).f12903a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12903a.hashCode();
    }

    public final String toString() {
        return "OnPasswordValueChanged(value=" + ((Object) this.f12903a) + Separators.RPAREN;
    }
}
