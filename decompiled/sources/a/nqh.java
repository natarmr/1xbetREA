package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nqh implements oqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23959a;

    public nqh(a4x a4xVar) {
        a4xVar.getClass();
        this.f23959a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqh) && Intrinsics.d(this.f23959a, ((nqh) obj).f23959a);
    }

    public final int hashCode() {
        return this.f23959a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f23959a, "ComparativeStatisticsRadial(items=", Separators.RPAREN);
    }
}
