package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qfq0 extends rfq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28649a;

    public qfq0(boolean z) {
        this.f28649a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfq0) && this.f28649a == ((qfq0) obj).f28649a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28649a);
    }

    public final String toString() {
        return defpackage.c.d("ShowStartScreen(show=", Separators.RPAREN, this.f28649a);
    }
}
