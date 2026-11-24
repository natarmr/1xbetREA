package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vg10 implements wg10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0b f37361a;

    public vg10(r0b r0bVar) {
        this.f37361a = r0bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg10) && this.f37361a.equals(((vg10) obj).f37361a);
    }

    public final int hashCode() {
        return this.f37361a.hashCode();
    }

    public final String toString() {
        return "CashbackSteps(model=" + this.f37361a + Separators.RPAREN;
    }
}
