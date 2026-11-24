package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j30 implements v30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15806a;

    public j30(String str) {
        str.getClass();
        this.f15806a = str;
    }

    @Override // a.v30
    public final String a() {
        return this.f15806a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j30) && Intrinsics.d(this.f15806a, ((j30) obj).f15806a);
    }

    public final int hashCode() {
        return this.f15806a.hashCode();
    }

    public final String toString() {
        return kng0.l("Primary(advanceTitle=", this.f15806a, Separators.RPAREN);
    }
}
