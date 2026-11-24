package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pg70 extends qg70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26940a;

    public pg70(boolean z) {
        this.f26940a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg70) && this.f26940a == ((pg70) obj).f26940a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26940a);
    }

    public final String toString() {
        return defpackage.c.d("ShowOptions(show=", Separators.RPAREN, this.f26940a);
    }
}
