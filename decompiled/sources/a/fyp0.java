package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fyp0 implements gyp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10371a;

    public fyp0(String str) {
        this.f10371a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyp0) && this.f10371a.equals(((fyp0) obj).f10371a);
    }

    public final int hashCode() {
        return this.f10371a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSurfaceFilterSelected(surfaceType=", this.f10371a, Separators.RPAREN);
    }
}
