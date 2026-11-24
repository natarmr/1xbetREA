package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eam0 implements ham0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7474a;

    public final boolean equals(Object obj) {
        if (obj instanceof eam0) {
            return this.f7474a == ((eam0) obj).f7474a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7474a);
    }

    public final String toString() {
        return defpackage.c.d("Disable(value=", Separators.RPAREN, this.f7474a);
    }
}
