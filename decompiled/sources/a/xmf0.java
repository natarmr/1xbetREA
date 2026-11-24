package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xmf0 implements dnf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f41121a;

    public xmf0(mdm mdmVar) {
        this.f41121a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmf0) && this.f41121a.equals(((xmf0) obj).f41121a);
    }

    public final int hashCode() {
        return this.f41121a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f41121a, Separators.RPAREN);
    }
}
