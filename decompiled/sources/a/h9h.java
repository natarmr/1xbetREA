package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class h9h {
    public static final g9h Companion = new g9h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12676a;
    public final Integer b;

    public /* synthetic */ h9h(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f12676a = null;
        } else {
            this.f12676a = num;
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
        if (!(obj instanceof h9h)) {
            return false;
        }
        h9h h9hVar = (h9h) obj;
        return Intrinsics.d(this.f12676a, h9hVar.f12676a) && Intrinsics.d(this.b, h9hVar.b);
    }

    public final int hashCode() {
        Integer num = this.f12676a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("CyberMlbbGoldHistoryResponse(value=", this.f12676a, ", seconds=", this.b, Separators.RPAREN);
    }
}
