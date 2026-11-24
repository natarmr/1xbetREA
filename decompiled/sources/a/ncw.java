package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ncw implements scw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uew f23313a;

    public ncw(uew uewVar) {
        this.f23313a = uewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncw) && this.f23313a.equals(((ncw) obj).f23313a);
    }

    public final int hashCode() {
        return this.f23313a.hashCode();
    }

    public final String toString() {
        return "OnChipsClick(item=" + this.f23313a + Separators.RPAREN;
    }
}
