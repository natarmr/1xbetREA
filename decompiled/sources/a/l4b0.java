package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l4b0 implements n4b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19396a;

    public l4b0(boolean z) {
        this.f19396a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4b0) && this.f19396a == ((l4b0) obj).f19396a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19396a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(showShimmers=", Separators.RPAREN, this.f19396a);
    }
}
