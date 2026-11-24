package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bzh0 implements ezh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3467a;

    public bzh0(String str) {
        str.getClass();
        this.f3467a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzh0) && Intrinsics.d(this.f3467a, ((bzh0) obj).f3467a);
    }

    public final int hashCode() {
        return this.f3467a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnNominantClick(awardId=", this.f3467a, Separators.RPAREN);
    }
}
