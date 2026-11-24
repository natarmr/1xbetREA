package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kml0 implements rml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aum f18546a;

    public kml0(aum aumVar) {
        this.f18546a = aumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kml0) && this.f18546a.equals(((kml0) obj).f18546a);
    }

    public final int hashCode() {
        return this.f18546a.hashCode();
    }

    public final String toString() {
        return "Cricket(model=" + this.f18546a + Separators.RPAREN;
    }
}
