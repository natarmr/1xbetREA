package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eb40 implements fb40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f7502a;

    public eb40(mdm mdmVar) {
        this.f7502a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb40) && this.f7502a.equals(((eb40) obj).f7502a);
    }

    public final int hashCode() {
        return this.f7502a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f7502a, Separators.RPAREN);
    }
}
