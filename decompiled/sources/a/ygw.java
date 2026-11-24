package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ygw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final exf f42606a;

    public ygw(exf exfVar) {
        this.f42606a = exfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygw) && this.f42606a == ((ygw) obj).f42606a;
    }

    public final int hashCode() {
        return this.f42606a.hashCode();
    }

    public final String toString() {
        return "OnCustomButtonClick(buttonType=" + this.f42606a + Separators.RPAREN;
    }
}
