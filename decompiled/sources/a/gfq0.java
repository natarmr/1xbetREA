package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gfq0 extends hfq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11218a;

    public gfq0(boolean z) {
        this.f11218a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfq0) && this.f11218a == ((gfq0) obj).f11218a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11218a);
    }

    public final String toString() {
        return defpackage.c.d("ShowCombinationView(show=", Separators.RPAREN, this.f11218a);
    }
}
