package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ib4 implements lb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f14469a;

    public ib4(d7a d7aVar) {
        this.f14469a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib4) && this.f14469a.equals(((ib4) obj).f14469a);
    }

    public final int hashCode() {
        return this.f14469a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptchaDialog(userActionRequired=", this.f14469a, Separators.RPAREN);
    }
}
