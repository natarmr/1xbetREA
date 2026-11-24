package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ix70 implements jx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f15528a;

    public ix70(zpv zpvVar) {
        this.f15528a = zpvVar;
    }

    @Override // a.jx70
    public final zpv a() {
        return this.f15528a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix70) && this.f15528a.equals(((ix70) obj).f15528a);
    }

    public final int hashCode() {
        return this.f15528a.hashCode();
    }

    public final String toString() {
        return "Viewed(headerActionsState=" + this.f15528a + Separators.RPAREN;
    }
}
