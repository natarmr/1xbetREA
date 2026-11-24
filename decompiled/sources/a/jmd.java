package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jmd extends lmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16758a;

    public jmd(String str) {
        this.f16758a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmd) && this.f16758a.equals(((jmd) obj).f16758a);
    }

    public final int hashCode() {
        return this.f16758a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoLogoChanged(url=", this.f16758a, Separators.RPAREN);
    }
}
