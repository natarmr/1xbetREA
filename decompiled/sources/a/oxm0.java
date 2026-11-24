package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class oxm0 implements pxm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f26020a;

    public oxm0(mdm mdmVar) {
        this.f26020a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxm0) && this.f26020a.equals(((oxm0) obj).f26020a);
    }

    public final int hashCode() {
        return this.f26020a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f26020a, Separators.RPAREN);
    }
}
