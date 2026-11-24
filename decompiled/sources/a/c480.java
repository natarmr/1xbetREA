package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c480 implements d480 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3713a;

    public c480(String str) {
        str.getClass();
        this.f3713a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c480) && Intrinsics.d(this.f3713a, ((c480) obj).f3713a);
    }

    public final int hashCode() {
        return this.f3713a.hashCode();
    }

    public final String toString() {
        return kng0.l("TypeLabelUiModel(label=", this.f3713a, Separators.RPAREN);
    }
}
