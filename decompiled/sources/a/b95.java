package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b95 extends Throwable implements alx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2190a;

    public b95(String str) {
        super(str);
        this.f2190a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b95) && this.f2190a.equals(((b95) obj).f2190a);
    }

    public final int hashCode() {
        return this.f2190a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return kng0.l("AvailableValueNotExistsException(error=", this.f2190a, Separators.RPAREN);
    }
}
