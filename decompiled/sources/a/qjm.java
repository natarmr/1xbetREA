package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qjm implements rjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqm f28846a = vqm.f37862a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjm) && this.f28846a == ((qjm) obj).f28846a;
    }

    public final int hashCode() {
        return this.f28846a.hashCode();
    }

    public final String toString() {
        return "Theme(skeletonConfigStyle=" + this.f28846a + Separators.RPAREN;
    }
}
