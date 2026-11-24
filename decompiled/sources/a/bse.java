package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bse implements ise {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3126a;

    public final boolean equals(Object obj) {
        if (obj instanceof bse) {
            return Intrinsics.d(this.f3126a, ((bse) obj).f3126a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3126a.hashCode();
    }

    public final String toString() {
        return kng0.l("CoefTextValue(value=", this.f3126a, Separators.RPAREN);
    }
}
