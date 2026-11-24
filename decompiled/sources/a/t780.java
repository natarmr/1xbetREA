package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t780 implements x780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f33454a;

    public t780(d7a d7aVar) {
        this.f33454a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t780) && this.f33454a.equals(((t780) obj).f33454a);
    }

    public final int hashCode() {
        return this.f33454a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptcha(userActionRequired=", this.f33454a, Separators.RPAREN);
    }
}
