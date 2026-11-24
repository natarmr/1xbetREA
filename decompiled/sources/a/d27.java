package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5343a;

    public final boolean equals(Object obj) {
        if (obj instanceof d27) {
            return Intrinsics.d(this.f5343a, ((d27) obj).f5343a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5343a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnAccordionClick(betId=", this.f5343a, Separators.RPAREN);
    }
}
