package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tmo implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34203a;
    public final pwe b;

    public tmo(long j, pwe pweVar) {
        this.f34203a = j;
        this.b = pweVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmo)) {
            return false;
        }
        tmo tmoVar = (tmo) obj;
        return this.f34203a == tmoVar.f34203a && this.b.equals(tmoVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f34203a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f34203a) * 31);
    }

    public final String toString() {
        return "ExpandableCardHeaderUiItem(id=" + this.f34203a + ", model=" + this.b + Separators.RPAREN;
    }
}
