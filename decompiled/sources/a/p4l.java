package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lc00 f26358a;

    public final boolean equals(Object obj) {
        if (obj instanceof p4l) {
            return this.f26358a.equals(((p4l) obj).f26358a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26358a.hashCode();
    }

    public final String toString() {
        return "AdditionalItems(value=" + this.f26358a + Separators.RPAREN;
    }
}
