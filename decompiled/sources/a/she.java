package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class she implements eie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f32206a;

    public she(mdm mdmVar) {
        this.f32206a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof she) && this.f32206a.equals(((she) obj).f32206a);
    }

    public final int hashCode() {
        return this.f32206a.hashCode();
    }

    public final String toString() {
        return b1j.j("Lottie(config=", this.f32206a, Separators.RPAREN);
    }
}
