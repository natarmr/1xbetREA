package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class nif {
    public static final mif Companion = new mif();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23584a;
    public final Integer b;
    public final Integer c;
    public final String d;

    public nif(edy edyVar) {
        edyVar.getClass();
        String strL = piz.L(edyVar, "player");
        Integer numValueOf = Integer.valueOf(piz.K(edyVar, "ctPlayers"));
        Integer numValueOf2 = Integer.valueOf(piz.K(edyVar, "tPlayers"));
        String strL2 = piz.L(edyVar, "bombSite");
        this.f23584a = strL;
        this.b = numValueOf;
        this.c = numValueOf2;
        this.d = strL2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nif)) {
            return false;
        }
        nif nifVar = (nif) obj;
        return Intrinsics.d(this.f23584a, nifVar.f23584a) && Intrinsics.d(this.b, nifVar.b) && Intrinsics.d(this.c, nifVar.c) && Intrinsics.d(this.d, nifVar.d);
    }

    public final int hashCode() {
        String str = this.f23584a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "Cs2BombPlantedGameLogResponse(player=", this.f23584a, ", ctPlayers=", ", tPlayers=");
        sbP.append(this.c);
        sbP.append(", bombSite=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    public /* synthetic */ nif(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f23584a = null;
        } else {
            this.f23584a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }
}
