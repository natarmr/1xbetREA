package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jpj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16904a;
    public final boolean b;

    public jpj(boolean z, long j) {
        this.f16904a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpj)) {
            return false;
        }
        jpj jpjVar = (jpj) obj;
        return this.f16904a == jpjVar.f16904a && this.b == jpjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(Long.hashCode(this.f16904a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f16904a, "UfcFight(id=", ", live=", this.b);
        sbR.append(", hasBackStack=false)");
        return sbR.toString();
    }
}
