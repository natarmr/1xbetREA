package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fh70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9527a;

    public fh70(boolean z) {
        this.f9527a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh70) && this.f9527a == ((fh70) obj).f9527a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9527a);
    }

    public final String toString() {
        return defpackage.c.d("BlockBetButton(block=", Separators.RPAREN, this.f9527a);
    }
}
