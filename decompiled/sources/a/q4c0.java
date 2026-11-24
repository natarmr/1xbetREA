package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q4c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28091a;

    public /* synthetic */ q4c0(String str) {
        this.f28091a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q4c0) {
            return Intrinsics.d(this.f28091a, ((q4c0) obj).f28091a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28091a.hashCode();
    }

    public final String toString() {
        return kng0.l("LabelChanged(label=", this.f28091a, Separators.RPAREN);
    }
}
