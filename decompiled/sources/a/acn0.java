package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class acn0 implements ecn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f637a;

    public acn0(boolean z) {
        this.f637a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acn0) && this.f637a == ((acn0) obj).f637a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f637a);
    }

    public final String toString() {
        return defpackage.c.d("SetBasketButtonEnabled(enabled=", Separators.RPAREN, this.f637a);
    }
}
