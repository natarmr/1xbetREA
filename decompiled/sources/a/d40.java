package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class d40 {
    public static final c40 Companion = new c40();
    public static final a8z[] d = {maz.a(wez.f39042a, new q8(20)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5429a;
    public final Long b;
    public final Long c;

    public /* synthetic */ d40(int i, Long l, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f5429a = null;
        } else {
            this.f5429a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d40)) {
            return false;
        }
        d40 d40Var = (d40) obj;
        return Intrinsics.d(this.f5429a, d40Var.f5429a) && Intrinsics.d(this.b, d40Var.b) && Intrinsics.d(this.c, d40Var.c);
    }

    public final int hashCode() {
        List list = this.f5429a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvanceRequest(events=");
        sb.append(this.f5429a);
        sb.append(", userIdBonus=");
        sb.append(this.b);
        sb.append(", userId=");
        return ohs0.r(sb, this.c, Separators.RPAREN);
    }

    public d40(ArrayList arrayList, Long l, Long l2) {
        this.f5429a = arrayList;
        this.b = l;
        this.c = l2;
    }
}
