package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yz80 implements d090 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f43504a;

    public yz80(d7a d7aVar) {
        this.f43504a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz80) && this.f43504a.equals(((yz80) obj).f43504a);
    }

    public final int hashCode() {
        return this.f43504a.hashCode();
    }

    public final String toString() {
        return kng0.i("CaptchaRequiredStep(userActionRequired=", this.f43504a, Separators.RPAREN);
    }
}
