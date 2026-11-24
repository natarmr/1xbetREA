package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ckk implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bkk f4510a;
    public final zjk b;
    public final zjk c;
    public final List d;
    public final List e;

    public ckk(bkk bkkVar, zjk zjkVar, zjk zjkVar2, List list, List list2) {
        this.f4510a = bkkVar;
        this.b = zjkVar;
        this.c = zjkVar2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckk)) {
            return false;
        }
        ckk ckkVar = (ckk) obj;
        return this.f4510a == ckkVar.f4510a && this.b == ckkVar.b && this.c == ckkVar.c && this.d.equals(ckkVar.d) && this.e.equals(ckkVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f4510a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiceModel(matchState=");
        sb.append(this.f4510a);
        sb.append(", firstDiceOnTable=");
        sb.append(this.b);
        sb.append(", secondDiceOnTable=");
        sb.append(this.c);
        sb.append(", playerOneRoundScoreModelList=");
        sb.append(this.d);
        sb.append(", playerTwoRoundScoreModelList=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
