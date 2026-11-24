package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rsv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31051a;

    public rsv(String str) {
        str.getClass();
        this.f31051a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsv) && Intrinsics.d(this.f31051a, ((rsv) obj).f31051a);
    }

    public final int hashCode() {
        return this.f31051a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeaderUiModel(header=", this.f31051a, Separators.RPAREN);
    }
}
