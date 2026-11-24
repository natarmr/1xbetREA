package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e2l implements h2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7092a;

    public final boolean equals(Object obj) {
        if (obj instanceof e2l) {
            return this.f7092a == ((e2l) obj).f7092a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7092a);
    }

    public final String toString() {
        return defpackage.c.d("TeamLightBan(value=", Separators.RPAREN, this.f7092a);
    }
}
