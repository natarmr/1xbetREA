package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p050 implements v050 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26133a;

    public p050(String str) {
        str.getClass();
        this.f26133a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p050) && Intrinsics.d(this.f26133a, ((p050) obj).f26133a);
    }

    public final int hashCode() {
        return this.f26133a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnCashbackTimerEnd(key=", this.f26133a, Separators.RPAREN);
    }
}
