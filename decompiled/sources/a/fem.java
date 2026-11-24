package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fem implements hem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9414a;

    public fem(a4x a4xVar) {
        a4xVar.getClass();
        this.f9414a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fem) && Intrinsics.d(this.f9414a, ((fem) obj).f9414a);
    }

    public final int hashCode() {
        return this.f9414a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f9414a, "V2(additionalInfoRows=", Separators.RPAREN);
    }
}
