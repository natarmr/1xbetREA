package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kwr implements mwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5h0 f19016a;

    public final boolean equals(Object obj) {
        if (obj instanceof kwr) {
            return this.f19016a.equals(((kwr) obj).f19016a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19016a.hashCode();
    }

    public final String toString() {
        return axq.j("Score(value=", this.f19016a, Separators.RPAREN);
    }
}
