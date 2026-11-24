package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jtc0 implements otc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f17092a;

    public final boolean equals(Object obj) {
        if (obj instanceof jtc0) {
            return this.f17092a.equals(((jtc0) obj).f17092a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17092a.hashCode();
    }

    public final String toString() {
        return "StartIcon(value=" + this.f17092a + Separators.RPAREN;
    }
}
