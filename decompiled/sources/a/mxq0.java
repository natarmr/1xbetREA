package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mxq0 implements nxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f22571a;

    public mxq0(bem bemVar) {
        bemVar.getClass();
        this.f22571a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxq0) && Intrinsics.d(this.f22571a, ((mxq0) obj).f22571a);
    }

    public final int hashCode() {
        return this.f22571a.hashCode();
    }

    public final String toString() {
        return twn.n("DsGameCardAction(action=", this.f22571a, Separators.RPAREN);
    }
}
