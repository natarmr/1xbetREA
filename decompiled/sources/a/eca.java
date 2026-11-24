package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eca implements jca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1i f7555a;

    public final boolean equals(Object obj) {
        if (obj instanceof eca) {
            return this.f7555a.equals(((eca) obj).f7555a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7555a.hashCode();
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(model=" + this.f7555a + Separators.RPAREN;
    }
}
