package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vnd implements znd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37714a;

    public vnd(String str) {
        str.getClass();
        this.f37714a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vnd) && Intrinsics.d(this.f37714a, ((vnd) obj).f37714a);
    }

    public final int hashCode() {
        return this.f37714a.hashCode();
    }

    public final String toString() {
        return kng0.l("CompressedCardErrorUiModel(description=", this.f37714a, Separators.RPAREN);
    }
}
