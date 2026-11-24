package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yqq implements arq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43087a;

    public yqq(float f) {
        this.f43087a = f;
    }

    @Override // a.arq
    public final float a() {
        return this.f43087a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqq) && Float.compare(this.f43087a, ((yqq) obj).f43087a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43087a);
    }

    public final String toString() {
        return rw2.j(this.f43087a, "Folded(ratio=", Separators.RPAREN);
    }
}
