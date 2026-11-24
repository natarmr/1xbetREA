package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x4r0 implements z4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f40281a;

    public x4r0(a2n a2nVar) {
        this.f40281a = a2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4r0) && this.f40281a.equals(((x4r0) obj).f40281a);
    }

    public final int hashCode() {
        return this.f40281a.hashCode();
    }

    public final String toString() {
        return "Card(card=" + this.f40281a + Separators.RPAREN;
    }
}
