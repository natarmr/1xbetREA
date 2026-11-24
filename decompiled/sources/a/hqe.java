package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13482a;
    public final a4x b;

    public hqe(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f13482a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqe)) {
            return false;
        }
        hqe hqeVar = (hqe) obj;
        return this.f13482a == hqeVar.f13482a && Intrinsics.d(this.b, hqeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f13482a) * 31);
    }

    public final String toString() {
        return "UiState(loading=" + this.f13482a + ", items=" + this.b + Separators.RPAREN;
    }
}
