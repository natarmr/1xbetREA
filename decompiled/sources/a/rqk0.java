package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30936a;

    public rqk0(int i) {
        this.f30936a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqk0) && this.f30936a == ((rqk0) obj).f30936a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30936a);
    }

    public final String toString() {
        return ua80.e(this.f30936a, "OnDateClick(index=", Separators.RPAREN);
    }
}
