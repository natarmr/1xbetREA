package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m5n0 implements n5n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21229a;

    public m5n0(String str) {
        str.getClass();
        this.f21229a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5n0) && Intrinsics.d(this.f21229a, ((m5n0) obj).f21229a);
    }

    public final int hashCode() {
        return this.f21229a.hashCode();
    }

    public final String toString() {
        return kng0.l("Subgame(subgameText=", this.f21229a, Separators.RPAREN);
    }
}
