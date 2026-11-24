package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tk2 implements xk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qbs0 f34073a;

    public final boolean equals(Object obj) {
        if (obj instanceof tk2) {
            return Intrinsics.d(this.f34073a, ((tk2) obj).f34073a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34073a.hashCode();
    }

    public final String toString() {
        return "OnRemoveCoefClick(model=" + this.f34073a + Separators.RPAREN;
    }
}
