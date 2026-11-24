package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ptu0 implements rtu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f27582a;

    public ptu0(mdm mdmVar) {
        this.f27582a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ptu0) && this.f27582a.equals(((ptu0) obj).f27582a);
    }

    public final int hashCode() {
        return this.f27582a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f27582a, Separators.RPAREN);
    }
}
