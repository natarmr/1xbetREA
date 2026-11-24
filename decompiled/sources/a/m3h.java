package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class m3h {
    public static final l3h Companion = new l3h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21115a;
    public final Long b;

    public /* synthetic */ m3h(int i, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f21115a = null;
        } else {
            this.f21115a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3h)) {
            return false;
        }
        m3h m3hVar = (m3h) obj;
        return Intrinsics.d(this.f21115a, m3hVar.f21115a) && Intrinsics.d(this.b, m3hVar.b);
    }

    public final int hashCode() {
        Integer num = this.f21115a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "CyberLolGoldHistoryResponse(value=" + this.f21115a + ", seconds=" + this.b + Separators.RPAREN;
    }
}
