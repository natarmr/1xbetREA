package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvw f12253a;
    public final boolean b;

    public h0w(jvw jvwVar, boolean z) {
        jvwVar.getClass();
        this.f12253a = jvwVar;
        this.b = z;
    }

    public static h0w a(h0w h0wVar, boolean z) {
        jvw jvwVar = h0wVar.f12253a;
        h0wVar.getClass();
        jvwVar.getClass();
        return new h0w(jvwVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0w)) {
            return false;
        }
        h0w h0wVar = (h0w) obj;
        return Intrinsics.d(this.f12253a, h0wVar.f12253a) && this.b == h0wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12253a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryCouponStatusFilterModel(historyCouponStatusModel=" + this.f12253a + ", isSelected=" + this.b + Separators.RPAREN;
    }
}
