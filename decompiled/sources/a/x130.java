package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40101a;

    public x130(String str) {
        str.getClass();
        this.f40101a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x130) && Intrinsics.d(this.f40101a, ((x130) obj).f40101a);
    }

    public final int hashCode() {
        return this.f40101a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowQuickBetTryAgainLaterError(message=", this.f40101a, Separators.RPAREN);
    }
}
