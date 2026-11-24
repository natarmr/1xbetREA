package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dov implements jov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6429a;

    public final boolean equals(Object obj) {
        if (obj instanceof dov) {
            return Intrinsics.d(this.f6429a, ((dov) obj).f6429a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6429a.hashCode();
    }

    public final String toString() {
        return kng0.l("AdditionalTitle(value=", this.f6429a, Separators.RPAREN);
    }
}
