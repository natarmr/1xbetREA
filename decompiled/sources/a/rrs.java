package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rrs implements trs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wus f30999a;

    public rrs(wus wusVar) {
        this.f30999a = wusVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrs) && this.f30999a.equals(((rrs) obj).f30999a);
    }

    public final int hashCode() {
        return this.f30999a.hashCode();
    }

    public final String toString() {
        return "SendGameToolbarSideEffect(value=" + this.f30999a + Separators.RPAREN;
    }
}
