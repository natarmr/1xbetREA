package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g1b implements h1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10504a;

    public final boolean equals(Object obj) {
        if (obj instanceof g1b) {
            return Intrinsics.d(this.f10504a, ((g1b) obj).f10504a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10504a.hashCode();
    }

    public final String toString() {
        return kng0.l("MaxCoef(value=", this.f10504a, Separators.RPAREN);
    }
}
