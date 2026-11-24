package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class p3h {
    public static final o3h Companion = new o3h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f26300a;
    public final Integer b;

    public /* synthetic */ p3h(int i, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f26300a = null;
        } else {
            this.f26300a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3h)) {
            return false;
        }
        p3h p3hVar = (p3h) obj;
        return Intrinsics.d(this.f26300a, p3hVar.f26300a) && Intrinsics.d(this.b, p3hVar.b);
    }

    public final int hashCode() {
        Long l = this.f26300a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CyberLolHeroItemsResponse(itemId=" + this.f26300a + ", itemCount=" + this.b + Separators.RPAREN;
    }
}
