package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b3o implements g3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1917a;

    public b3o(int i) {
        this.f1917a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3o) && this.f1917a == ((b3o) obj).f1917a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1917a);
    }

    public final String toString() {
        return ua80.e(this.f1917a, "OnSelectTab(currentTab=", Separators.RPAREN);
    }
}
