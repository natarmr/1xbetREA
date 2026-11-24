package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gng0 implements ing0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11585a;

    public gng0(String str) {
        this.f11585a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gng0) && this.f11585a.equals(((gng0) obj).f11585a);
    }

    public final int hashCode() {
        return this.f11585a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendIntentAction(uri=", this.f11585a, Separators.RPAREN);
    }
}
