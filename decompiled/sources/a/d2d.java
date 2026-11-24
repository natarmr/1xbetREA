package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d2d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5350a;
    public final boolean b;

    public d2d(String str, boolean z) {
        str.getClass();
        this.f5350a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2d)) {
            return false;
        }
        d2d d2dVar = (d2d) obj;
        return Intrinsics.d(this.f5350a, d2dVar.f5350a) && this.b == d2dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f5350a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ScrollableListState(id=", this.f5350a, ", canScrollBackward=", this.b, Separators.RPAREN);
    }
}
