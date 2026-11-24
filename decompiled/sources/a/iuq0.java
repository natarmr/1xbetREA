package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iuq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15409a;

    public iuq0(boolean z) {
        this.f15409a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuq0) && this.f15409a == ((iuq0) obj).f15409a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15409a);
    }

    public final String toString() {
        return defpackage.c.d("NewAppStartPartnerVisibility(enable=", Separators.RPAREN, this.f15409a);
    }
}
