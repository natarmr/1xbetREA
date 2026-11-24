package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class dfa {
    public static final cfa Companion = new cfa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ooa f5990a;
    public final ooa b;
    public final Integer c;
    public final Boolean d;

    public /* synthetic */ dfa(int i, ooa ooaVar, ooa ooaVar2, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.f5990a = null;
        } else {
            this.f5990a = ooaVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ooaVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfa)) {
            return false;
        }
        dfa dfaVar = (dfa) obj;
        return Intrinsics.d(this.f5990a, dfaVar.f5990a) && Intrinsics.d(this.b, dfaVar.b) && Intrinsics.d(this.c, dfaVar.c) && Intrinsics.d(this.d, dfaVar.d);
    }

    public final int hashCode() {
        ooa ooaVar = this.f5990a;
        int iHashCode = (ooaVar == null ? 0 : ooaVar.hashCode()) * 31;
        ooa ooaVar2 = this.b;
        int iHashCode2 = (iHashCode + (ooaVar2 == null ? 0 : ooaVar2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CardCricketRoundResponse(batsman=" + this.f5990a + ", bowler=" + this.b + ", points=" + this.c + ", hasWickets=" + this.d + Separators.RPAREN;
    }
}
