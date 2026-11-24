package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qml0 implements rml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hzm f28989a;

    public qml0(hzm hzmVar) {
        this.f28989a = hzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qml0) && this.f28989a.equals(((qml0) obj).f28989a);
    }

    public final int hashCode() {
        return this.f28989a.hashCode();
    }

    public final String toString() {
        return "TwoPairs(model=" + this.f28989a + Separators.RPAREN;
    }
}
