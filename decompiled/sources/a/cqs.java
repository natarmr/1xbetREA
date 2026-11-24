package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cqs {
    public static final pps Companion = new pps();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4812a;
    public final String b;

    public /* synthetic */ cqs(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f4812a = null;
        } else {
            this.f4812a = num;
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
        if (!(obj instanceof cqs)) {
            return false;
        }
        cqs cqsVar = (cqs) obj;
        return Intrinsics.d(this.f4812a, cqsVar.f4812a) && Intrinsics.d(this.b, cqsVar.b);
    }

    public final int hashCode() {
        Integer num = this.f4812a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f4812a, "GameResponse(gameId=", ", name=", this.b, Separators.RPAREN);
    }
}
