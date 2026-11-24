package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zlr implements amr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nus f44594a;

    public zlr(nus nusVar) {
        this.f44594a = nusVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlr) && this.f44594a.equals(((zlr) obj).f44594a);
    }

    public final int hashCode() {
        return this.f44594a.hashCode();
    }

    public final String toString() {
        return "OnToolbarAction(value=" + this.f44594a + Separators.RPAREN;
    }
}
