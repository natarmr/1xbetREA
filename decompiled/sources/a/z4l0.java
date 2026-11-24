package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z4l0 implements b5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43776a;

    public z4l0(int i) {
        this.f43776a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4l0) && this.f43776a == ((z4l0) obj).f43776a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43776a);
    }

    public final String toString() {
        return ua80.e(this.f43776a, "ItemClick(sportId=", Separators.RPAREN);
    }
}
