package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bsm implements dsm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3137a;

    public /* synthetic */ bsm(String str) {
        this.f3137a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bsm) {
            return Intrinsics.d(this.f3137a, ((bsm) obj).f3137a);
        }
        return false;
    }

    @Override // a.dsm
    public final String getKey() {
        return "Filter";
    }

    public final int hashCode() {
        return this.f3137a.hashCode();
    }

    public final String toString() {
        return kng0.l("Filter(label=", this.f3137a, Separators.RPAREN);
    }
}
