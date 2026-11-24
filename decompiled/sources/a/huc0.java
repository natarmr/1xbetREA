package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class huc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13674a;

    public /* synthetic */ huc0(String str) {
        this.f13674a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof huc0) {
            return Intrinsics.d(this.f13674a, ((huc0) obj).f13674a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13674a.hashCode();
    }

    public final String toString() {
        return kng0.l("LabelChanged(label=", this.f13674a, Separators.RPAREN);
    }
}
