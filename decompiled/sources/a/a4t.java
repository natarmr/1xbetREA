package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class a4t {
    public static final z3t Companion = new z3t();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new sqs(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hmz f239a;
    public final Integer b;
    public final List c;

    public /* synthetic */ a4t(int i, hmz hmzVar, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f239a = null;
        } else {
            this.f239a = hmzVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4t)) {
            return false;
        }
        a4t a4tVar = (a4t) obj;
        return Intrinsics.d(this.f239a, a4tVar.f239a) && Intrinsics.d(this.b, a4tVar.b) && Intrinsics.d(this.c, a4tVar.c);
    }

    public final int hashCode() {
        hmz hmzVar = this.f239a;
        int iHashCode = (hmzVar == null ? 0 : hmzVar.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesByChampLineResponse(liga=");
        sb.append(this.f239a);
        sb.append(", gamesCount=");
        sb.append(this.b);
        sb.append(", games=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
