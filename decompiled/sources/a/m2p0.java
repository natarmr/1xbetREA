package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m2p0 implements n2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21074a;

    public m2p0(String str) {
        str.getClass();
        this.f21074a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2p0) && Intrinsics.d(this.f21074a, ((m2p0) obj).f21074a);
    }

    public final int hashCode() {
        return this.f21074a.hashCode();
    }

    public final String toString() {
        return kng0.l("SportStatisticsEventCardClick(id=", this.f21074a, Separators.RPAREN);
    }
}
