package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gna f43090a;
    public final anq0 b;
    public final bg30 c;
    public final ui9 d;
    public final y930 e;
    public final List f;

    public yqs(gna gnaVar, anq0 anq0Var, bg30 bg30Var, ui9 ui9Var, y930 y930Var, List list) {
        list.getClass();
        this.f43090a = gnaVar;
        this.b = anq0Var;
        this.c = bg30Var;
        this.d = ui9Var;
        this.e = y930Var;
        this.f = list;
    }

    public static yqs a(yqs yqsVar, gna gnaVar, anq0 anq0Var, bg30 bg30Var, ui9 ui9Var, y930 y930Var, List list, int i) {
        if ((i & 1) != 0) {
            gnaVar = yqsVar.f43090a;
        }
        gna gnaVar2 = gnaVar;
        if ((i & 2) != 0) {
            anq0Var = yqsVar.b;
        }
        anq0 anq0Var2 = anq0Var;
        if ((i & 4) != 0) {
            bg30Var = yqsVar.c;
        }
        bg30 bg30Var2 = bg30Var;
        if ((i & 8) != 0) {
            ui9Var = yqsVar.d;
        }
        ui9 ui9Var2 = ui9Var;
        if ((i & 16) != 0) {
            y930Var = yqsVar.e;
        }
        y930 y930Var2 = y930Var;
        if ((i & 32) != 0) {
            list = yqsVar.f;
        }
        List list2 = list;
        yqsVar.getClass();
        list2.getClass();
        return new yqs(gnaVar2, anq0Var2, bg30Var2, ui9Var2, y930Var2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqs)) {
            return false;
        }
        yqs yqsVar = (yqs) obj;
        return Intrinsics.d(this.f43090a, yqsVar.f43090a) && Intrinsics.d(this.b, yqsVar.b) && Intrinsics.d(this.c, yqsVar.c) && Intrinsics.d(this.d, yqsVar.d) && this.e == yqsVar.e && Intrinsics.d(this.f, yqsVar.f);
    }

    public final int hashCode() {
        gna gnaVar = this.f43090a;
        int iHashCode = (gnaVar == null ? 0 : gnaVar.hashCode()) * 31;
        anq0 anq0Var = this.b;
        int iHashCode2 = (iHashCode + (anq0Var == null ? 0 : anq0Var.hashCode())) * 31;
        bg30 bg30Var = this.c;
        int iHashCode3 = (iHashCode2 + (bg30Var == null ? 0 : bg30Var.hashCode())) * 31;
        ui9 ui9Var = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode3 + (ui9Var != null ? ui9Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "GameScreenCardsContentState(cardSectionModel=" + this.f43090a + ", timerModel=" + this.b + ", matchCacheScoreModel=" + this.c + ", cachePenaltyModel=" + this.d + ", matchInfoContainerState=" + this.e + ", favoriteTeamModelList=" + this.f + Separators.RPAREN;
    }
}
