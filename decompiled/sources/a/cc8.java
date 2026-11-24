package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cc8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f4097a;

    public cc8(a4x a4xVar) {
        a4xVar.getClass();
        this.f4097a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc8) && Intrinsics.d(this.f4097a, ((cc8) obj).f4097a);
    }

    public final int hashCode() {
        return this.f4097a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f4097a, "BonusAccountState(accounts=", Separators.RPAREN);
    }
}
