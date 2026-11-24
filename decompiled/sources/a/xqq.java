package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xqq implements arq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41335a;

    public xqq(float f) {
        this.f41335a = f;
    }

    @Override // a.arq
    public final float a() {
        return this.f41335a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqq) && Float.compare(this.f41335a, ((xqq) obj).f41335a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41335a);
    }

    public final String toString() {
        return rw2.j(this.f41335a, "Flat(ratio=", Separators.RPAREN);
    }
}
