package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class men implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final len f21654a;
    public final tna0 b;
    public final int c;
    public final int d;
    public final int e;
    public final nen f;
    public final nen g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;

    public men(len lenVar, tna0 tna0Var, int i, int i2, int i3, nen nenVar, nen nenVar2, List list, List list2, List list3, List list4) {
        nenVar.getClass();
        nenVar2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f21654a = lenVar;
        this.b = tna0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = nenVar;
        this.g = nenVar2;
        this.h = list;
        this.i = list2;
        this.j = list3;
        this.k = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof men)) {
            return false;
        }
        men menVar = (men) obj;
        return this.f21654a == menVar.f21654a && this.b.equals(menVar.b) && this.c == menVar.c && this.d == menVar.d && this.e == menVar.e && this.f == menVar.f && this.g == menVar.g && Intrinsics.d(this.h, menVar.h) && Intrinsics.d(this.i, menVar.i) && Intrinsics.d(this.j, menVar.j) && Intrinsics.d(this.k, menVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + dw9.a(dw9.a(dw9.a((this.g.hashCode() + ((this.f.hashCode() + twn.a(this.e, twn.a(this.d, twn.a(this.c, (this.b.hashCode() + (this.f21654a.hashCode() * 31)) * 31, 31), 31), 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DurakModel(matchState=");
        sb.append(this.f21654a);
        sb.append(", trumpCard=");
        sb.append(this.b);
        sb.append(", countCardInDeck=");
        axq.r(this.c, this.d, ", countRoundRebounded=", ", countRoundTaken=", sb);
        sb.append(this.e);
        sb.append(", firstPlayerStatus=");
        sb.append(this.f);
        sb.append(", secondPlayerStatus=");
        sb.append(this.g);
        sb.append(", firstPlayerHandCardList=");
        sb.append(this.h);
        sb.append(", secondPlayerHandCardList=");
        b1j.y(", attackerTableCardList=", ", defenderTableCardList=", sb, this.i, this.j);
        return dw9.r(sb, this.k, Separators.RPAREN);
    }
}
