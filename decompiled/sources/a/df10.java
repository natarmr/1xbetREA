package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class df10 implements ff10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0b f5978a;

    public df10(x0b x0bVar) {
        this.f5978a = x0bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df10) && this.f5978a.equals(((df10) obj).f5978a);
    }

    public final int hashCode() {
        return this.f5978a.hashCode();
    }

    public final String toString() {
        return "CashbackSummary(model=" + this.f5978a + Separators.RPAREN;
    }
}
