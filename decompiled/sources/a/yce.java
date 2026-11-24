package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yce implements ode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f42381a;

    public yce(mdm mdmVar) {
        this.f42381a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yce) && this.f42381a.equals(((yce) obj).f42381a);
    }

    public final int hashCode() {
        return this.f42381a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f42381a, Separators.RPAREN);
    }
}
