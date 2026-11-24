package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class aq40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1280a;

    public aq40(String str) {
        this.f1280a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq40) && this.f1280a.equals(((aq40) obj).f1280a);
    }

    public final int hashCode() {
        return this.f1280a.hashCode();
    }

    public final String toString() {
        return kng0.l("MoneyTransferModel(message=", this.f1280a, Separators.RPAREN);
    }
}
