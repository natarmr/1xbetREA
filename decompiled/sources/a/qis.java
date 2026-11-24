package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qis implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28806a;

    public qis(String str) {
        this.f28806a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qis) && this.f28806a.equals(((qis) obj).f28806a);
    }

    public final int hashCode() {
        return this.f28806a.hashCode();
    }

    public final String toString() {
        return kng0.l("StatisticGameClick(statGameId=", this.f28806a, Separators.RPAREN);
    }
}
