package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bew implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f2471a;
    public final a4x b;

    public bew(hjm hjmVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f2471a = hjmVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bew)) {
            return false;
        }
        bew bewVar = (bew) obj;
        return this.f2471a.equals(bewVar.f2471a) && Intrinsics.d(this.b, bewVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2471a.hashCode() * 31);
    }

    public final String toString() {
        return "HltvAwardsPromotionsUiModel(header=" + this.f2471a + ", promotionList=" + this.b + Separators.RPAREN;
    }
}
