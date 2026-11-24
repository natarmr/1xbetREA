package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ps80 implements qs80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27504a;

    public ps80(String str) {
        str.getClass();
        this.f27504a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ps80) && Intrinsics.d(this.f27504a, ((ps80) obj).f27504a);
    }

    public final int hashCode() {
        return this.f27504a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFavoriteLimitedError(description=", this.f27504a, Separators.RPAREN);
    }
}
