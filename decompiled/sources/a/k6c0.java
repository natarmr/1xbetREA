package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k6c0 implements r6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17762a;

    public k6c0(String str) {
        this.f17762a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6c0) && this.f17762a.equals(((k6c0) obj).f17762a);
    }

    public final int hashCode() {
        return this.f17762a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(errorMessage=", this.f17762a, Separators.RPAREN);
    }
}
