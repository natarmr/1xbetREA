package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xce implements nde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40643a;

    public xce(mdm mdmVar) {
        this.f40643a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xce) && this.f40643a.equals(((xce) obj).f40643a);
    }

    public final int hashCode() {
        return this.f40643a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f40643a, Separators.RPAREN);
    }
}
