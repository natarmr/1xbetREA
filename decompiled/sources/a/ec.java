package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7542a;
    public final boolean b;

    public ec(boolean z, boolean z2) {
        this.f7542a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return this.f7542a == ecVar.f7542a && this.b == ecVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f7542a) * 31);
    }

    public final String toString() {
        return hne.n("AccordionUiModel(expanded=", ", visible=", Separators.RPAREN, this.f7542a, this.b);
    }
}
