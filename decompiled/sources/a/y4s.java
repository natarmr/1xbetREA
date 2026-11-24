package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42019a;

    public /* synthetic */ y4s(String str) {
        this.f42019a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y4s) {
            return Intrinsics.d(this.f42019a, ((y4s) obj).f42019a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42019a.hashCode();
    }

    public final String toString() {
        return kng0.l("LabelChanged(label=", this.f42019a, Separators.RPAREN);
    }
}
