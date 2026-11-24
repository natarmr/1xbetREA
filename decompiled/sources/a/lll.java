package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lll implements oll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20253a;

    public lll(boolean z) {
        this.f20253a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lll) && this.f20253a == ((lll) obj).f20253a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20253a);
    }

    public final String toString() {
        return defpackage.c.d("Past(isCompleted=", Separators.RPAREN, this.f20253a);
    }
}
