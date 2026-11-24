package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f11667a;

    public gp5(m0x m0xVar) {
        this.f11667a = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp5) && this.f11667a.equals(((gp5) obj).f11667a);
    }

    public final int hashCode() {
        return this.f11667a.hashCode();
    }

    public final String toString() {
        return "IconPlaceholder(icon=" + this.f11667a + Separators.RPAREN;
    }
}
