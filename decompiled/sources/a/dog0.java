package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dog0 implements fog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6414a;

    public dog0(String str) {
        this.f6414a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dog0) && this.f6414a.equals(((dog0) obj).f6414a);
    }

    public final int hashCode() {
        return this.f6414a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendIntentAction(uri=", this.f6414a, Separators.RPAREN);
    }
}
