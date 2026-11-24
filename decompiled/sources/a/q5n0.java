package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q5n0 implements s5n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28160a;

    public q5n0(String str) {
        str.getClass();
        this.f28160a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5n0) && Intrinsics.d(this.f28160a, ((q5n0) obj).f28160a);
    }

    public final int hashCode() {
        return this.f28160a.hashCode();
    }

    public final String toString() {
        return kng0.l("Subgame(subgameText=", this.f28160a, Separators.RPAREN);
    }
}
