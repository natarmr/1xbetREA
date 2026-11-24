package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class shm implements thm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32219a;

    public shm(String str) {
        this.f32219a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shm) && this.f32219a.equals(((shm) obj).f32219a);
    }

    public final int hashCode() {
        return this.f32219a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnTabSelect(tab=", this.f32219a, Separators.RPAREN);
    }
}
