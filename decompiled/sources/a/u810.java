package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u810 implements x810 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35214a;

    public u810(boolean z) {
        this.f35214a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u810) && this.f35214a == ((u810) obj).f35214a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35214a);
    }

    public final String toString() {
        return defpackage.c.d("EnableTickets(enable=", Separators.RPAREN, this.f35214a);
    }
}
