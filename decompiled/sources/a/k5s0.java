package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k5s0 implements y8b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17736a;

    public k5s0(String str) {
        str.getClass();
        this.f17736a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5s0) && Intrinsics.d(this.f17736a, ((k5s0) obj).f17736a);
    }

    public final int hashCode() {
        return this.f17736a.hashCode();
    }

    public final String toString() {
        return kng0.l("Group(title=", this.f17736a, Separators.RPAREN);
    }
}
