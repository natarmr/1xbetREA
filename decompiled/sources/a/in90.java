package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class in90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f15063a;

    public in90(a4x a4xVar) {
        a4xVar.getClass();
        this.f15063a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in90) && Intrinsics.d(this.f15063a, ((in90) obj).f15063a);
    }

    public final int hashCode() {
        return this.f15063a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f15063a, "PickDuelSubGameUiState(items=", Separators.RPAREN);
    }
}
