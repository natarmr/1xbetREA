package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ndc0 implements wdc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aec0 f23334a;

    public ndc0(aec0 aec0Var) {
        this.f23334a = aec0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndc0) && this.f23334a.equals(((ndc0) obj).f23334a);
    }

    public final int hashCode() {
        return this.f23334a.hashCode();
    }

    public final String toString() {
        return "OnCopyClick(item=" + this.f23334a + Separators.RPAREN;
    }
}
