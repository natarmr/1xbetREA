package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t8m implements u8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33517a;

    public t8m(String str) {
        this.f33517a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8m) && this.f33517a.equals(((t8m) obj).f33517a);
    }

    public final int hashCode() {
        return this.f33517a.hashCode();
    }

    public final String toString() {
        return kng0.l("Win(value=", this.f33517a, Separators.RPAREN);
    }
}
