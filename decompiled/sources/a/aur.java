package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aur implements cur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1492a;

    public final boolean equals(Object obj) {
        if (obj instanceof aur) {
            return this.f1492a == ((aur) obj).f1492a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1492a);
    }

    public final String toString() {
        return defpackage.c.d("StreamVisible(value=", Separators.RPAREN, this.f1492a);
    }
}
