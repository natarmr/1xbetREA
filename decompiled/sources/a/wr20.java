package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39619a;
    public final long b;
    public final String c;

    public wr20(long j, String str, ArrayList arrayList) {
        this.f39619a = arrayList;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr20)) {
            return false;
        }
        wr20 wr20Var = (wr20) obj;
        return this.f39619a.equals(wr20Var.f39619a) && this.b == wr20Var.b && Intrinsics.d(this.c, wr20Var.c);
    }

    public final int hashCode() {
        int iB = rw2.b(this.f39619a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketBetSubGameModel(betGroups=");
        sb.append(this.f39619a);
        sb.append(", subGameId=");
        sb.append(this.b);
        return rw2.o(sb, ", subGameName=", this.c, Separators.RPAREN);
    }
}
