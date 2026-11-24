package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y4t0 implements d5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f42021a;

    public y4t0(ims imsVar) {
        this.f42021a = imsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4t0) && this.f42021a.equals(((y4t0) obj).f42021a);
    }

    public final int hashCode() {
        return this.f42021a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f42021a + Separators.RPAREN;
    }
}
