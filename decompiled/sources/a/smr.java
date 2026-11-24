package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class smr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32460a;

    public smr(String str) {
        this.f32460a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smr) && this.f32460a.equals(((smr) obj).f32460a);
    }

    public final int hashCode() {
        return this.f32460a.hashCode();
    }

    public final String toString() {
        return kng0.l("StatisticGameClick(statGameId=", this.f32460a, Separators.RPAREN);
    }
}
