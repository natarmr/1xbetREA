package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oy80 extends py80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f26050a;

    public oy80(mdm mdmVar) {
        this.f26050a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy80) && this.f26050a.equals(((oy80) obj).f26050a);
    }

    public final int hashCode() {
        return this.f26050a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f26050a, Separators.RPAREN);
    }
}
