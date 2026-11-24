package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kfq0 extends ofq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18208a;

    public kfq0(boolean z) {
        this.f18208a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfq0) && this.f18208a == ((kfq0) obj).f18208a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18208a);
    }

    public final String toString() {
        return defpackage.c.d("EnableCells(enable=", Separators.RPAREN, this.f18208a);
    }
}
