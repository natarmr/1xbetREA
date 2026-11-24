package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class or1 implements rr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f25715a;

    public or1(o0x o0xVar) {
        this.f25715a = o0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof or1) && this.f25715a.equals(((or1) obj).f25715a);
    }

    public final int hashCode() {
        return this.f25715a.hashCode();
    }

    public final String toString() {
        return "Image(image=" + this.f25715a + Separators.RPAREN;
    }
}
