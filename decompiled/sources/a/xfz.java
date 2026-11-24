package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xfz extends yfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40816a;

    public xfz(mdm mdmVar) {
        mdmVar.getClass();
        this.f40816a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfz) && Intrinsics.d(this.f40816a, ((xfz) obj).f40816a);
    }

    public final int hashCode() {
        return this.f40816a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f40816a, Separators.RPAREN);
    }
}
