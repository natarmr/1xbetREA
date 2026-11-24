package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qjh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f28839a;

    public qjh0(i4 i4Var) {
        i4Var.getClass();
        this.f28839a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjh0) && Intrinsics.d(this.f28839a, ((qjh0) obj).f28839a);
    }

    public final int hashCode() {
        return this.f28839a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f28839a, "SeasonsUiState(seasons=", Separators.RPAREN);
    }
}
