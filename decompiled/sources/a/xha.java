package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class xha implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40880a;
    public final ArrayList b;
    public final fha c;

    public xha(ArrayList arrayList, ArrayList arrayList2, fha fhaVar) {
        this.f40880a = arrayList;
        this.b = arrayList2;
        this.c = fhaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xha)) {
            return false;
        }
        xha xhaVar = (xha) obj;
        return this.f40880a.equals(xhaVar.f40880a) && this.b.equals(xhaVar.b) && this.c == xhaVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, this.f40880a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CardFootballTeamsAttackUiModel(firstTeamAttack=" + this.f40880a + ", secondTeamAttack=" + this.b + ", attackState=" + this.c + Separators.RPAREN;
    }
}
