package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q7m implements wqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28257a;

    public q7m(String str) {
        str.getClass();
        this.f28257a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7m) && Intrinsics.d(this.f28257a, ((q7m) obj).f28257a);
    }

    public final int hashCode() {
        return this.f28257a.hashCode();
    }

    public final String toString() {
        return kng0.l("DsCyberHeaderCellUiModel(title=", this.f28257a, Separators.RPAREN);
    }
}
