package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ocm implements qcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f25033a;

    public final boolean equals(Object obj) {
        if (obj instanceof ocm) {
            return this.f25033a.equals(((ocm) obj).f25033a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25033a.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.f25033a + Separators.RPAREN;
    }
}
