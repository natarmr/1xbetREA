package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class f4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lc00 f8919a;

    public final boolean equals(Object obj) {
        if (obj instanceof f4l) {
            return this.f8919a.equals(((f4l) obj).f8919a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8919a.hashCode();
    }

    public final String toString() {
        return "AdditionalItems(value=" + this.f8919a + Separators.RPAREN;
    }
}
