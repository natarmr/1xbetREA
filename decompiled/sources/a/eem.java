package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eem implements hem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f7679a;

    public eem(a4x a4xVar) {
        a4xVar.getClass();
        this.f7679a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eem) && Intrinsics.d(this.f7679a, ((eem) obj).f7679a);
    }

    public final int hashCode() {
        return this.f7679a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f7679a, "V1(additionalInfoRows=", Separators.RPAREN);
    }
}
