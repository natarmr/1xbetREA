package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t150 f33250a;

    public t350(t150 t150Var) {
        this.f33250a = t150Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t350) && this.f33250a == ((t350) obj).f33250a;
    }

    public final int hashCode() {
        return this.f33250a.hashCode();
    }

    public final String toString() {
        return "OnClickRegistration(type=" + this.f33250a + Separators.RPAREN;
    }
}
