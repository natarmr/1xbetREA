package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29156a;

    public qqa(int i) {
        this.f29156a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqa) && this.f29156a == ((qqa) obj).f29156a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29156a);
    }

    public final String toString() {
        return ua80.e(this.f29156a, "WeatherIconChanged(weatherIcon=", Separators.RPAREN);
    }
}
