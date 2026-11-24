package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dzv0 implements hzv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6961a;

    public dzv0(mdm mdmVar) {
        this.f6961a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzv0) && this.f6961a.equals(((dzv0) obj).f6961a);
    }

    public final int hashCode() {
        return this.f6961a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f6961a, Separators.RPAREN);
    }
}
