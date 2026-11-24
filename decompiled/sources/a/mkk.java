package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mkk implements iqg {
    public static final lkk Companion = new lkk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21947a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Integer e;
    public final String f;
    public final String g;

    public /* synthetic */ mkk(int i, Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21947a = null;
        } else {
            this.f21947a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkk)) {
            return false;
        }
        mkk mkkVar = (mkk) obj;
        return Intrinsics.d(this.f21947a, mkkVar.f21947a) && Intrinsics.d(this.b, mkkVar.b) && Intrinsics.d(this.c, mkkVar.c) && Intrinsics.d(this.d, mkkVar.d) && Intrinsics.d(this.e, mkkVar.e) && Intrinsics.d(this.f, mkkVar.f) && Intrinsics.d(this.g, mkkVar.g);
    }

    public final int hashCode() {
        Long l = this.f21947a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f21947a, this.b, "DicePokerResponse(playerOneDice=", ", playerOneCombination=", ", playerTwoDice=");
        cs0.A(sbO, this.c, ", playerTwoCombination=", this.d, ", gameState=");
        b1j.u(this.e, ", playerOneResult=", this.f, ", playerTwoResult=", sbO);
        return axq.n(sbO, this.g, Separators.RPAREN);
    }

    public mkk() {
        this.f21947a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
