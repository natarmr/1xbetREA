package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ow1 implements qw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f25949a;

    public ow1(m0x m0xVar) {
        this.f25949a = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow1) && this.f25949a.equals(((ow1) obj).f25949a);
    }

    public final int hashCode() {
        return this.f25949a.hashCode();
    }

    public final String toString() {
        return "Image(image=" + this.f25949a + Separators.RPAREN;
    }
}
