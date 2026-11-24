package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p32 implements r32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f26278a;

    public p32(mdm mdmVar) {
        this.f26278a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p32) && this.f26278a.equals(((p32) obj).f26278a);
    }

    public final int hashCode() {
        return this.f26278a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f26278a, Separators.RPAREN);
    }
}
