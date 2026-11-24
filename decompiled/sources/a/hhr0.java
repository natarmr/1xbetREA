package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hhr0 implements lhr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okr0 f13079a;

    public final boolean equals(Object obj) {
        if (obj instanceof hhr0) {
            return Intrinsics.d(this.f13079a, ((hhr0) obj).f13079a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13079a.hashCode();
    }

    public final String toString() {
        return "Data(totoBetModel=" + this.f13079a + Separators.RPAREN;
    }
}
