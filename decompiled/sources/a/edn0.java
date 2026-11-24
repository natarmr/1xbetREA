package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class edn0 implements gdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7627a;

    public edn0(boolean z) {
        this.f7627a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edn0) && this.f7627a == ((edn0) obj).f7627a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7627a);
    }

    public final String toString() {
        return defpackage.c.d("SetBasketButtonEnabled(enabled=", Separators.RPAREN, this.f7627a);
    }
}
