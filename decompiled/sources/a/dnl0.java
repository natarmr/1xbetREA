package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dnl0 implements hnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6376a;

    public dnl0(String str) {
        str.getClass();
        this.f6376a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnl0) && Intrinsics.d(this.f6376a, ((dnl0) obj).f6376a);
    }

    public final int hashCode() {
        return this.f6376a.hashCode();
    }

    public final String toString() {
        return kng0.l("OneOpponent(opponentName=", this.f6376a, Separators.RPAREN);
    }
}
