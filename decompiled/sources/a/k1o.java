package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k1o implements m1o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17536a;

    public final boolean equals(Object obj) {
        if (obj instanceof k1o) {
            return Intrinsics.d(this.f17536a, ((k1o) obj).f17536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17536a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendingMessage(localKey=", this.f17536a, Separators.RPAREN);
    }
}
