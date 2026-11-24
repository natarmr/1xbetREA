package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12315a;
    public final h0i b;

    public h250(String str, h0i h0iVar) {
        str.getClass();
        this.f12315a = str;
        this.b = h0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h250)) {
            return false;
        }
        h250 h250Var = (h250) obj;
        return Intrinsics.d(this.f12315a, h250Var.f12315a) && this.b.equals(h250Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f12315a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12315a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentsMonthCarousel(key=" + this.f12315a + ", model=" + this.b + Separators.RPAREN;
    }
}
