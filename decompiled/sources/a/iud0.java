package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iud0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15392a;

    public final boolean equals(Object obj) {
        if (obj instanceof iud0) {
            return Intrinsics.d(this.f15392a, ((iud0) obj).f15392a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15392a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSelectCompositionPlayer(value=", this.f15392a, Separators.RPAREN);
    }
}
