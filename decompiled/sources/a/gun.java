package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gun implements s8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f11938a;
    public final String b = String.valueOf(sre0.f32672a.b(gun.class).J());

    public gun(mdm mdmVar) {
        this.f11938a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gun) && this.f11938a.equals(((gun) obj).f11938a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f11938a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyGamesLottieHeader(lottie=", this.f11938a, Separators.RPAREN);
    }
}
