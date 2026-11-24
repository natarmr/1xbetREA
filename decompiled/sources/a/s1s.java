package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31471a;

    public s1s(String str) {
        this.f31471a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1s) && this.f31471a.equals(((s1s) obj).f31471a);
    }

    public final int hashCode() {
        return this.f31471a.hashCode();
    }

    public final String toString() {
        return kng0.l("StatisticGameClick(statGameId=", this.f31471a, Separators.RPAREN);
    }
}
