package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class uf4 implements yf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f35561a;

    public uf4(d7a d7aVar) {
        this.f35561a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf4) && this.f35561a.equals(((uf4) obj).f35561a);
    }

    public final int hashCode() {
        return this.f35561a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptchaDialog(userActionRequired=", this.f35561a, Separators.RPAREN);
    }
}
