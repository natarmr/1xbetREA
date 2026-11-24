package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class sgl0 {
    public static final rgl0 Companion = new rgl0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32168a;
    public final Integer b;

    public /* synthetic */ sgl0(int i, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f32168a = null;
        } else {
            this.f32168a = l;
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
        if (!(obj instanceof sgl0)) {
            return false;
        }
        sgl0 sgl0Var = (sgl0) obj;
        return Intrinsics.d(this.f32168a, sgl0Var.f32168a) && Intrinsics.d(this.b, sgl0Var.b);
    }

    public final int hashCode() {
        Long l = this.f32168a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SportLiveResultsResponse(id=" + this.f32168a + ", gamesCount=" + this.b + Separators.RPAREN;
    }
}
