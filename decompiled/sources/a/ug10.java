package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ug10 implements wg10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qza f35601a;

    public ug10(qza qzaVar) {
        this.f35601a = qzaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug10) && this.f35601a.equals(((ug10) obj).f35601a);
    }

    public final int hashCode() {
        return this.f35601a.hashCode();
    }

    public final String toString() {
        return "CashbackProgress(model=" + this.f35601a + Separators.RPAREN;
    }
}
