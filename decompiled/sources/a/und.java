package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class und implements ynd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35954a;

    public und(String str) {
        str.getClass();
        this.f35954a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof und) && Intrinsics.d(this.f35954a, ((und) obj).f35954a);
    }

    public final int hashCode() {
        return this.f35954a.hashCode();
    }

    public final String toString() {
        return kng0.l("CompressedCardErrorUiModel(description=", this.f35954a, Separators.RPAREN);
    }
}
