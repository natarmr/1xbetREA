package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jpa extends kpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f16891a;

    public jpa(a4x a4xVar) {
        a4xVar.getClass();
        this.f16891a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpa) && Intrinsics.d(this.f16891a, ((jpa) obj).f16891a);
    }

    public final int hashCode() {
        return this.f16891a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f16891a, "GameEventsChanged(events=", Separators.RPAREN);
    }
}
