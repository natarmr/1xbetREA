package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class psc0 implements qsc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27510a;

    public psc0(String str) {
        str.getClass();
        this.f27510a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psc0) && Intrinsics.d(this.f27510a, ((psc0) obj).f27510a);
    }

    public final int hashCode() {
        return this.f27510a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateSubtitle(subtitle=", this.f27510a, Separators.RPAREN);
    }
}
