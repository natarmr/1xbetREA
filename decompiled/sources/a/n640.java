package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n640 {
    public static final l640 Companion = new l640();
    public static final a8z[] l = {null, null, null, null, maz.a(wez.f39042a, new gj30(22)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22978a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final hlf0 f;
    public final s7d g;
    public final th h;
    public final h640 i;
    public final List j;
    public final Long k;

    public /* synthetic */ n640(int i, Integer num, String str, String str2, String str3, List list, hlf0 hlf0Var, s7d s7dVar, th thVar, h640 h640Var, List list2, Long l2) {
        if ((i & 1) == 0) {
            this.f22978a = null;
        } else {
            this.f22978a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = hlf0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = s7dVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = thVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = h640Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n640)) {
            return false;
        }
        n640 n640Var = (n640) obj;
        return Intrinsics.d(this.f22978a, n640Var.f22978a) && Intrinsics.d(this.b, n640Var.b) && Intrinsics.d(this.c, n640Var.c) && Intrinsics.d(this.d, n640Var.d) && Intrinsics.d(this.e, n640Var.e) && Intrinsics.d(this.f, n640Var.f) && Intrinsics.d(this.g, n640Var.g) && Intrinsics.d(this.h, n640Var.h) && Intrinsics.d(this.i, n640Var.i) && Intrinsics.d(this.j, n640Var.j) && Intrinsics.d(this.k, n640Var.k);
    }

    public final int hashCode() {
        Integer num = this.f22978a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        hlf0 hlf0Var = this.f;
        int iHashCode6 = (iHashCode5 + (hlf0Var == null ? 0 : hlf0Var.hashCode())) * 31;
        s7d s7dVar = this.g;
        int iHashCode7 = (iHashCode6 + (s7dVar == null ? 0 : s7dVar.hashCode())) * 31;
        th thVar = this.h;
        int iHashCode8 = (iHashCode7 + (thVar == null ? 0 : thVar.hashCode())) * 31;
        h640 h640Var = this.i;
        int iHashCode9 = (iHashCode8 + (h640Var == null ? 0 : h640Var.hashCode())) * 31;
        List list2 = this.j;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l2 = this.k;
        return iHashCode10 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f22978a, "MessageResponse(id=", ", type=", this.b, ", fromId=");
        f140.v(sbN, this.c, ", text=", this.d, ", mediaList=");
        sbN.append(this.e);
        sbN.append(", replyMarkup=");
        sbN.append(this.f);
        sbN.append(", command=");
        sbN.append(this.g);
        sbN.append(", action=");
        sbN.append(this.h);
        sbN.append(", messageReplyHeader=");
        sbN.append(this.i);
        sbN.append(", textMarkup=");
        sbN.append(this.j);
        sbN.append(", createdAt=");
        return ohs0.r(sbN, this.k, Separators.RPAREN);
    }

    public n640(Integer num, String str, String str2, String str3, List list, hlf0 hlf0Var, s7d s7dVar, th thVar, h640 h640Var, List list2, Long l2) {
        this.f22978a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = hlf0Var;
        this.g = s7dVar;
        this.h = thVar;
        this.i = h640Var;
        this.j = list2;
        this.k = l2;
    }
}
