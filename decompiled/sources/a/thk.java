package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class thk implements zhk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33966a;

    public thk(boolean z) {
        this.f33966a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thk) && this.f33966a == ((thk) obj).f33966a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33966a);
    }

    public final String toString() {
        return defpackage.c.d("Foldable(isFolded=", Separators.RPAREN, this.f33966a);
    }
}
