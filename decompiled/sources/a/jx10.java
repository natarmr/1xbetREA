package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17280a;

    public jx10(String str) {
        htz htzVar = iz30.f15618a;
        str.getClass();
        this.f17280a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx10)) {
            return false;
        }
        htz htzVar = iz30.f15618a;
        return Intrinsics.d(this.f17280a, ((jx10) obj).f17280a);
    }

    public final int hashCode() {
        return this.f17280a.hashCode() + (iz30.y.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemCallModel(menuItem=" + iz30.y + ", callDuration=" + this.f17280a + Separators.RPAREN;
    }
}
