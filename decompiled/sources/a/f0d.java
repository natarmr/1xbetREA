package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class f0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8711a;
    public final String b;
    public final boolean c;

    public f0d(String str, String str2, boolean z) {
        this.f8711a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0d)) {
            return false;
        }
        f0d f0dVar = (f0d) obj;
        return this.f8711a.equals(f0dVar.f8711a) && this.b.equals(f0dVar.b) && this.c == f0dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f8711a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("CoefficientSettingsStateModel(titleText=", this.f8711a, ", subTitleText=", this.b, ", isVisible="), this.c, Separators.RPAREN);
    }
}
