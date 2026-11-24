package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wyy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39996a;
    public final bep0 b;
    public final int c;
    public final List d;
    public final ldr0 e;

    public wyy(List list, bep0 bep0Var, int i, List list2, ldr0 ldr0Var) {
        list.getClass();
        bep0Var.getClass();
        list2.getClass();
        ldr0Var.getClass();
        this.f39996a = list;
        this.b = bep0Var;
        this.c = i;
        this.d = list2;
        this.e = ldr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyy)) {
            return false;
        }
        wyy wyyVar = (wyy) obj;
        return Intrinsics.d(this.f39996a, wyyVar.f39996a) && Intrinsics.d(this.b, wyyVar.b) && this.c == wyyVar.c && Intrinsics.d(this.d, wyyVar.d) && Intrinsics.d(this.e, wyyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f39996a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastGameDataModel(players=");
        sb.append(this.f39996a);
        sb.append(", teamGamesModel=");
        sb.append(this.b);
        sb.append(", sportId=");
        ohs0.v(this.c, ", teamModels=", ", topRoundDescriptionModel=", sb, this.d);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
