package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26601a;

    public p9d0(boolean z) {
        this.f26601a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9d0) && this.f26601a == ((p9d0) obj).f26601a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26601a);
    }

    public final String toString() {
        return defpackage.c.d("B2bConfig(launchFromDeepLink=", Separators.RPAREN, this.f26601a);
    }
}
