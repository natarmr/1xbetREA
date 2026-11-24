package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pap0 implements qap0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f26665a;

    public pap0(mdm mdmVar) {
        this.f26665a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pap0) && this.f26665a.equals(((pap0) obj).f26665a);
    }

    public final int hashCode() {
        return this.f26665a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f26665a, Separators.RPAREN);
    }
}
