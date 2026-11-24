package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hmd extends lmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13299a;

    public hmd(String str) {
        this.f13299a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmd) && this.f13299a.equals(((hmd) obj).f13299a);
    }

    public final int hashCode() {
        return this.f13299a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneLogoChanged(url=", this.f13299a, Separators.RPAREN);
    }
}
