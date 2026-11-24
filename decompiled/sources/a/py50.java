package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class py50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qbs0 f27791a;

    public final boolean equals(Object obj) {
        if (obj instanceof py50) {
            return Intrinsics.d(this.f27791a, ((py50) obj).f27791a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27791a.hashCode();
    }

    public final String toString() {
        return "OnCoefClick(model=" + this.f27791a + Separators.RPAREN;
    }
}
