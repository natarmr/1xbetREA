package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ulr implements amr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f35887a;

    public ulr(ims imsVar) {
        this.f35887a = imsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulr) && this.f35887a.equals(((ulr) obj).f35887a);
    }

    public final int hashCode() {
        return this.f35887a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f35887a + Separators.RPAREN;
    }
}
