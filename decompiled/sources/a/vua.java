package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vua {
    public static final uua Companion = new uua();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f38038a;
    public final Integer b;

    public /* synthetic */ vua(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f38038a = null;
        } else {
            this.f38038a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vua)) {
            return false;
        }
        vua vuaVar = (vua) obj;
        return Intrinsics.d(this.f38038a, vuaVar.f38038a) && Intrinsics.d(this.b, vuaVar.b);
    }

    public final int hashCode() {
        Integer num = this.f38038a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("CardsTeamZipResponse(cardSuite=", this.f38038a, ", cardRank=", this.b, Separators.RPAREN);
    }
}
