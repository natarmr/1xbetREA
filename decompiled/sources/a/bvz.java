package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bvz implements ivz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3299a;

    public bvz(String str) {
        str.getClass();
        this.f3299a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvz) && Intrinsics.d(this.f3299a, ((bvz) obj).f3299a);
    }

    public final int hashCode() {
        return this.f3299a.hashCode();
    }

    public final String toString() {
        return kng0.l("LimitsEeHeaderWithDescriptionUiModel(title=", this.f3299a, Separators.RPAREN);
    }
}
