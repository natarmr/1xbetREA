package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class d4t {
    public static final c4t Companion = new c4t();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new sqs(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hmz f5472a;
    public final Integer b;
    public final List c;

    public /* synthetic */ d4t(int i, hmz hmzVar, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f5472a = null;
        } else {
            this.f5472a = hmzVar;
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
        if (!(obj instanceof d4t)) {
            return false;
        }
        d4t d4tVar = (d4t) obj;
        return Intrinsics.d(this.f5472a, d4tVar.f5472a) && Intrinsics.d(this.b, d4tVar.b) && Intrinsics.d(this.c, d4tVar.c);
    }

    public final int hashCode() {
        hmz hmzVar = this.f5472a;
        int iHashCode = (hmzVar == null ? 0 : hmzVar.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesByChampLiveResponse(liga=");
        sb.append(this.f5472a);
        sb.append(", gamesCount=");
        sb.append(this.b);
        sb.append(", games=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
