package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sxl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32983a;

    public sxl0(String str) {
        this.f32983a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxl0) && this.f32983a.equals(((sxl0) obj).f32983a);
    }

    public final int hashCode() {
        return this.f32983a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowImageDialog(image=", this.f32983a, Separators.RPAREN);
    }
}
