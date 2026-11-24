package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yib0 implements kjb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ckv f42680a;

    public yib0(ckv ckvVar) {
        this.f42680a = ckvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yib0) && this.f42680a.equals(((yib0) obj).f42680a);
    }

    public final int hashCode() {
        return 2058033574;
    }

    public final String toString() {
        return "HandShakeSideEffect(nestedEffect=" + this.f42680a + Separators.RPAREN;
    }
}
