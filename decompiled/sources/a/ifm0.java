package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ifm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14695a;

    public ifm0(String str) {
        this.f14695a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifm0) && this.f14695a.equals(((ifm0) obj).f14695a);
    }

    public final int hashCode() {
        return this.f14695a.hashCode();
    }

    public final String toString() {
        return kng0.l("StatisticRatingChartTipModel(imagePath=", this.f14695a, Separators.RPAREN);
    }
}
