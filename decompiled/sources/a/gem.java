package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gem implements hem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f11162a;

    public gem(a4x a4xVar) {
        a4xVar.getClass();
        this.f11162a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gem) && Intrinsics.d(this.f11162a, ((gem) obj).f11162a);
    }

    public final int hashCode() {
        return this.f11162a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f11162a, "V3(additionalInfoRows=", Separators.RPAREN);
    }
}
