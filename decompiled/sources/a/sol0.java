package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sol0 implements vol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw40 f32549a;

    public final boolean equals(Object obj) {
        if (obj instanceof sol0) {
            return Intrinsics.d(this.f32549a, ((sol0) obj).f32549a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32549a.hashCode();
    }

    public final String toString() {
        return "OnHintClick(item=" + this.f32549a + Separators.RPAREN;
    }
}
