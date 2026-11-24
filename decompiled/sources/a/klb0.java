package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class klb0 implements llb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f18479a;

    public klb0(mdm mdmVar) {
        this.f18479a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klb0) && this.f18479a.equals(((klb0) obj).f18479a);
    }

    public final int hashCode() {
        return this.f18479a.hashCode();
    }

    public final String toString() {
        return b1j.j("NoInternetConnection(config=", this.f18479a, Separators.RPAREN);
    }
}
