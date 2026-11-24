package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k2g {
    public static final j2g Companion = new j2g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f17569a;
    public final String b;

    public /* synthetic */ k2g(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f17569a = null;
        } else {
            this.f17569a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2g)) {
            return false;
        }
        k2g k2gVar = (k2g) obj;
        return Intrinsics.d(this.f17569a, k2gVar.f17569a) && Intrinsics.d(this.b, k2gVar.b);
    }

    public final int hashCode() {
        Long l = this.f17569a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f17569a, "CyberBaseSportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
