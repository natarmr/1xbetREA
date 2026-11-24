package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pf7 implements rf7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26888a;

    public pf7(String str) {
        this.f26888a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf7) && this.f26888a.equals(((pf7) obj).f26888a);
    }

    public final int hashCode() {
        return this.f26888a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(message=", this.f26888a, Separators.RPAREN);
    }
}
