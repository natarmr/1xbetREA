package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n86 implements r86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23074a;

    public n86(String str) {
        str.getClass();
        this.f23074a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n86) && Intrinsics.d(this.f23074a, ((n86) obj).f23074a);
    }

    public final int hashCode() {
        return this.f23074a.hashCode();
    }

    public final String toString() {
        return kng0.l("OneOpponent(opponentName=", this.f23074a, Separators.RPAREN);
    }
}
