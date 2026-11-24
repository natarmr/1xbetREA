package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wcs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38939a;
    public final Map b;

    public wcs0(List list, Map map) {
        list.getClass();
        map.getClass();
        this.f38939a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcs0)) {
            return false;
        }
        wcs0 wcs0Var = (wcs0) obj;
        return Intrinsics.d(this.f38939a, wcs0Var.f38939a) && Intrinsics.d(this.b, wcs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38939a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackedCoefsUiModel(coefList=" + this.f38939a + ", specialTypeMap=" + this.b + Separators.RPAREN;
    }
}
