package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m2h implements o2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2h f21059a;

    public m2h(i2h i2hVar) {
        this.f21059a = i2hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2h) && this.f21059a.equals(((m2h) obj).f21059a);
    }

    public final int hashCode() {
        return this.f21059a.hashCode();
    }

    public final String toString() {
        return "Content(value=" + this.f21059a + Separators.RPAREN;
    }
}
