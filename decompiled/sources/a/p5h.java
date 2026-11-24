package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class p5h {
    public static final o5h Companion = new o5h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f26404a;
    public final String b;

    public /* synthetic */ p5h(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f26404a = null;
        } else {
            this.f26404a = l;
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
        if (!(obj instanceof p5h)) {
            return false;
        }
        p5h p5hVar = (p5h) obj;
        return Intrinsics.d(this.f26404a, p5hVar.f26404a) && Intrinsics.d(this.b, p5hVar.b);
    }

    public final int hashCode() {
        Long l = this.f26404a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f26404a, "CyberMarketCategoryResponse(marketType=", ", name=", this.b, Separators.RPAREN);
    }
}
