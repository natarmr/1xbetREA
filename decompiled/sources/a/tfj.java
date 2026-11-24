package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tfj implements xfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33868a;

    public tfj(boolean z) {
        this.f33868a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfj) && this.f33868a == ((tfj) obj).f33868a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33868a);
    }

    public final String toString() {
        return defpackage.c.d("OnAllClick(live=", Separators.RPAREN, this.f33868a);
    }
}
