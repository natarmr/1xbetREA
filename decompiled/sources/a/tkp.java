package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skp f34107a;

    public final boolean equals(Object obj) {
        if (obj instanceof tkp) {
            return Intrinsics.d(this.f34107a, ((tkp) obj).f34107a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34107a.hashCode();
    }

    public final String toString() {
        return "Feedback(feedback=" + this.f34107a + Separators.RPAREN;
    }
}
