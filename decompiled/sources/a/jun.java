package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class jun implements a2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f17163a;
    public final String b = String.valueOf(sre0.f32672a.b(jun.class).J());

    public jun(mdm mdmVar) {
        this.f17163a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jun) && this.f17163a.equals(((jun) obj).f17163a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f17163a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyLottieHeader(lottie=", this.f17163a, Separators.RPAREN);
    }
}
