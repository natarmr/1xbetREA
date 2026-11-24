package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ten implements iqg {
    public static final sen Companion = new sen();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qen f33829a;
    public final ooa b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final String k;

    static {
        wez wezVar = wez.f39042a;
        l = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new dcn((byte) 4)), maz.a(wezVar, new dcn((byte) 5)), maz.a(wezVar, new dcn((byte) 6)), maz.a(wezVar, new dcn((byte) 7)), null};
    }

    public /* synthetic */ ten(int i, qen qenVar, ooa ooaVar, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, String str5) {
        if ((i & 1) == 0) {
            this.f33829a = null;
        } else {
            this.f33829a = qenVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ooaVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ten)) {
            return false;
        }
        ten tenVar = (ten) obj;
        return Intrinsics.d(this.f33829a, tenVar.f33829a) && Intrinsics.d(this.b, tenVar.b) && Intrinsics.d(this.c, tenVar.c) && Intrinsics.d(this.d, tenVar.d) && Intrinsics.d(this.e, tenVar.e) && Intrinsics.d(this.f, tenVar.f) && Intrinsics.d(this.g, tenVar.g) && Intrinsics.d(this.h, tenVar.h) && Intrinsics.d(this.i, tenVar.i) && Intrinsics.d(this.j, tenVar.j) && Intrinsics.d(this.k, tenVar.k);
    }

    public final int hashCode() {
        qen qenVar = this.f33829a;
        int iHashCode = (qenVar == null ? 0 : qenVar.hashCode()) * 31;
        ooa ooaVar = this.b;
        int iHashCode2 = (iHashCode + (ooaVar == null ? 0 : ooaVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.i;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.j;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str5 = this.k;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DurakResponse(playerState=");
        sb.append(this.f33829a);
        sb.append(", trumpCard=");
        sb.append(this.b);
        sb.append(", matchState=");
        f140.v(sb, this.c, ", countCardInDeck=", this.d, ", countRoundRebounded=");
        f140.v(sb, this.e, ", countRoundTaken=", this.f, ", playerOneHandCard=");
        b1j.y(", playerTwoHandCard=", ", attackerTableCard=", sb, this.g, this.h);
        b1j.y(", defenderTableCard=", ", finishedState=", sb, this.i, this.j);
        return axq.n(sb, this.k, Separators.RPAREN);
    }

    public ten() {
        this.f33829a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }
}
