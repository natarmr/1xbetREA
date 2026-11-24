package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jwd0 implements owd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17245a;

    public final boolean equals(Object obj) {
        if (obj instanceof jwd0) {
            return Intrinsics.d(this.f17245a, ((jwd0) obj).f17245a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17245a.hashCode();
    }

    public final String toString() {
        return kng0.l("SelectCompositionPlayer(value=", this.f17245a, Separators.RPAREN);
    }
}
