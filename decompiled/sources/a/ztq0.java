package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ztq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44974a;

    public ztq0(boolean z) {
        this.f44974a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztq0) && this.f44974a == ((ztq0) obj).f44974a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44974a);
    }

    public final String toString() {
        return defpackage.c.d("AggregatorTestFlagInRequestsModel(enable=", Separators.RPAREN, this.f44974a);
    }
}
