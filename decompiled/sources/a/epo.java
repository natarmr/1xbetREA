package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class epo implements gpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8199a;

    public final boolean equals(Object obj) {
        if (obj instanceof epo) {
            return Intrinsics.d(this.f8199a, ((epo) obj).f8199a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8199a.hashCode();
    }

    public final String toString() {
        return kng0.l("CoefValueText(value=", this.f8199a, Separators.RPAREN);
    }
}
