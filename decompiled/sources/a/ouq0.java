package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ouq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25889a;

    public ouq0(boolean z) {
        this.f25889a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouq0) && this.f25889a == ((ouq0) obj).f25889a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25889a);
    }

    public final String toString() {
        return defpackage.c.d("SpecialEventModel(enable=", Separators.RPAREN, this.f25889a);
    }
}
