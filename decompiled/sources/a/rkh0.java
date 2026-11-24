package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rkh0 implements ukh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30649a;

    public rkh0(int i) {
        this.f30649a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkh0) && this.f30649a == ((rkh0) obj).f30649a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30649a);
    }

    public final String toString() {
        return ua80.e(this.f30649a, "OnSecretQuestionClicked(id=", Separators.RPAREN);
    }
}
