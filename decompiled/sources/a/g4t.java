package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class g4t {
    public static final f4t Companion = new f4t();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new sqs(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hmz f10685a;
    public final Integer b;
    public final List c;

    public /* synthetic */ g4t(int i, hmz hmzVar, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f10685a = null;
        } else {
            this.f10685a = hmzVar;
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
        if (!(obj instanceof g4t)) {
            return false;
        }
        g4t g4tVar = (g4t) obj;
        return Intrinsics.d(this.f10685a, g4tVar.f10685a) && Intrinsics.d(this.b, g4tVar.b) && Intrinsics.d(this.c, g4tVar.c);
    }

    public final int hashCode() {
        hmz hmzVar = this.f10685a;
        int iHashCode = (hmzVar == null ? 0 : hmzVar.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesByChampResponse(liga=");
        sb.append(this.f10685a);
        sb.append(", gamesCount=");
        sb.append(this.b);
        sb.append(", games=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
