package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s880 implements w880 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f31791a;

    public s880(d7a d7aVar) {
        this.f31791a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s880) && this.f31791a.equals(((s880) obj).f31791a);
    }

    public final int hashCode() {
        return this.f31791a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f31791a, Separators.RPAREN);
    }
}
