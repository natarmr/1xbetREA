package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ji4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16557a;

    public final boolean equals(Object obj) {
        if (obj instanceof ji4) {
            return this.f16557a.equals(((ji4) obj).f16557a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16557a.hashCode();
    }

    public final String toString() {
        return "OnPasswordValueChanged(value=" + ((Object) this.f16557a) + Separators.RPAREN;
    }
}
