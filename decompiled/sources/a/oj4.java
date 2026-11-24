package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class oj4 implements sj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f25343a;

    public oj4(d7a d7aVar) {
        this.f25343a = d7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj4) && this.f25343a.equals(((oj4) obj).f25343a);
    }

    public final int hashCode() {
        return this.f25343a.hashCode();
    }

    public final String toString() {
        return kng0.i("ShowCaptchaDialog(userActionRequired=", this.f25343a, Separators.RPAREN);
    }
}
