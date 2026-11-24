package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xso0 implements ato0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41427a;

    public xso0(String str) {
        str.getClass();
        this.f41427a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xso0) && Intrinsics.d(this.f41427a, ((xso0) obj).f41427a);
    }

    public final int hashCode() {
        return this.f41427a.hashCode();
    }

    public final String toString() {
        return kng0.l("TakeAll(title=", this.f41427a, Separators.RPAREN);
    }
}
