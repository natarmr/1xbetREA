package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tm2 implements vm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0t f34173a;

    public final boolean equals(Object obj) {
        if (obj instanceof tm2) {
            return Intrinsics.d(this.f34173a, ((tm2) obj).f34173a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34173a.hashCode();
    }

    public final String toString() {
        return "ViewedSportClicked(value=" + this.f34173a + Separators.RPAREN;
    }
}
