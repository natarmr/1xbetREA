package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class buq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3245a;

    public buq0(boolean z) {
        this.f3245a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof buq0) && this.f3245a == ((buq0) obj).f3245a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3245a);
    }

    public final String toString() {
        return defpackage.c.d("CheckGeoModel(enable=", Separators.RPAREN, this.f3245a);
    }
}
