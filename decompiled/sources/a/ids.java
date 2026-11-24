package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ids extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14600a;

    public ids(String str) {
        str.getClass();
        this.f14600a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ids) && Intrinsics.d(this.f14600a, ((ids) obj).f14600a);
    }

    public final int hashCode() {
        return this.f14600a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchPeriodChanged(matchPeriodInfo=", this.f14600a, Separators.RPAREN);
    }
}
