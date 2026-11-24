package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hxt0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13828a;

    public final boolean equals(Object obj) {
        if (obj instanceof hxt0) {
            return Intrinsics.d(this.f13828a, ((hxt0) obj).f13828a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13828a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSelectCompositionPlayer(value=", this.f13828a, Separators.RPAREN);
    }
}
