package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k3w implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17639a;

    public k3w(String str) {
        str.getClass();
        this.f17639a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3w) && Intrinsics.d(this.f17639a, ((k3w) obj).f17639a);
    }

    public final int hashCode() {
        return this.f17639a.hashCode();
    }

    public final String toString() {
        return kng0.l("HistoryItemFreeTotoInfoBlockUiModel(title=", this.f17639a, Separators.RPAREN);
    }
}
