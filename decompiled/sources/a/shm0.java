package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class shm0 implements mim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32220a = axq.g();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shm0) && this.f32220a.equals(((shm0) obj).f32220a);
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f32220a;
    }

    public final int hashCode() {
        return this.f32220a.hashCode();
    }

    public final String toString() {
        return kng0.l("Empty(id=", this.f32220a, Separators.RPAREN);
    }
}
