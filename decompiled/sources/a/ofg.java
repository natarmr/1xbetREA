package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ofg implements rfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25167a;

    public ofg(int i) {
        this.f25167a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofg) && this.f25167a == ((ofg) obj).f25167a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25167a);
    }

    public final String toString() {
        return ua80.e(this.f25167a, "OnDateFilterClick(position=", Separators.RPAREN);
    }
}
