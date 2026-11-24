package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class imd extends lmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15018a;

    public imd(String str) {
        this.f15018a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof imd) && this.f15018a.equals(((imd) obj).f15018a);
    }

    public final int hashCode() {
        return this.f15018a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneSecondPlayerLogoChanged(id=", this.f15018a, Separators.RPAREN);
    }
}
