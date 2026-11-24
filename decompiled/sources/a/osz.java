package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class osz implements usz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trz f25805a;

    public final boolean equals(Object obj) {
        if (obj instanceof osz) {
            return this.f25805a.equals(((osz) obj).f25805a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25805a.hashCode();
    }

    public final String toString() {
        return "OnMoneyLimitClick(limitType=" + this.f25805a + Separators.RPAREN;
    }
}
