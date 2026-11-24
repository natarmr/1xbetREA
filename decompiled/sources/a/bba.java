package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bba implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zaa f2298a;
    public final int b;
    public final int c;
    public final List d;
    public final List e;

    public bba(zaa zaaVar, int i, int i2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f2298a = zaaVar;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bba)) {
            return false;
        }
        bba bbaVar = (bba) obj;
        return this.f2298a == bbaVar.f2298a && this.b == bbaVar.b && this.c == bbaVar.c && Intrinsics.d(this.d, bbaVar.d) && Intrinsics.d(this.e, bbaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(twn.a(this.c, twn.a(this.b, this.f2298a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardBasketballModel(gameState=");
        sb.append(this.f2298a);
        sb.append(", firstPlayerCards=");
        sb.append(this.b);
        sb.append(", secondPlayerCards=");
        ohs0.v(this.c, ", firstPlayerInfo=", ", secondPlayerInfo=", sb, this.d);
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
