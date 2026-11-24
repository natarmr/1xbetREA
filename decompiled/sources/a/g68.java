package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g68 implements i68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10749a;

    public g68(boolean z) {
        this.f10749a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g68) && this.f10749a == ((g68) obj).f10749a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10749a);
    }

    public final String toString() {
        return defpackage.c.d("CheckPasswordAction(isPasswordEqual=", Separators.RPAREN, this.f10749a);
    }
}
