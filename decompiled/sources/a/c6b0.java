package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c6b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pnf0 f3811a;
    public final pdt b;
    public final v5l0 c;
    public final Integer d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final wcb h;
    public final List i;
    public final boolean j;

    public c6b0(pnf0 pnf0Var, pdt pdtVar, v5l0 v5l0Var, Integer num, Boolean bool, Boolean bool2, Boolean bool3, wcb wcbVar, List list, boolean z) {
        this.f3811a = pnf0Var;
        this.b = pdtVar;
        this.c = v5l0Var;
        this.d = num;
        this.e = bool;
        this.f = bool2;
        this.g = bool3;
        this.h = wcbVar;
        this.i = list;
        this.j = z;
    }

    public static c6b0 a(c6b0 c6b0Var, pdt pdtVar, v5l0 v5l0Var, Integer num, Boolean bool, Boolean bool2, Boolean bool3, wcb wcbVar, List list, int i) {
        pnf0 pnf0Var = pnf0.b;
        if ((i & 1) != 0) {
            pnf0Var = c6b0Var.f3811a;
        }
        pnf0 pnf0Var2 = pnf0Var;
        if ((i & 2) != 0) {
            pdtVar = c6b0Var.b;
        }
        pdt pdtVar2 = pdtVar;
        if ((i & 4) != 0) {
            v5l0Var = c6b0Var.c;
        }
        v5l0 v5l0Var2 = v5l0Var;
        Integer num2 = (i & 8) != 0 ? c6b0Var.d : num;
        Boolean bool4 = (i & 16) != 0 ? c6b0Var.e : bool;
        Boolean bool5 = (i & 32) != 0 ? c6b0Var.f : bool2;
        Boolean bool6 = (i & 64) != 0 ? c6b0Var.g : bool3;
        wcb wcbVar2 = (i & 128) != 0 ? c6b0Var.h : wcbVar;
        List list2 = (i & 256) != 0 ? c6b0Var.i : list;
        boolean z = c6b0Var.j;
        c6b0Var.getClass();
        return new c6b0(pnf0Var2, pdtVar2, v5l0Var2, num2, bool4, bool5, bool6, wcbVar2, list2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6b0)) {
            return false;
        }
        c6b0 c6b0Var = (c6b0) obj;
        return this.f3811a == c6b0Var.f3811a && this.b.equals(c6b0Var.b) && this.c == c6b0Var.c && Intrinsics.d(this.d, c6b0Var.d) && Intrinsics.d(this.e, c6b0Var.e) && Intrinsics.d(this.f, c6b0Var.f) && Intrinsics.d(this.g, c6b0Var.g) && Intrinsics.d(this.h, c6b0Var.h) && Intrinsics.d(this.i, c6b0Var.i) && this.j == c6b0Var.j;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3811a.hashCode() * 31)) * 31;
        v5l0 v5l0Var = this.c;
        int iHashCode2 = (iHashCode + (v5l0Var == null ? 0 : v5l0Var.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        wcb wcbVar = this.h;
        int iHashCode7 = (iHashCode6 + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31;
        List list = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode7 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularClassicFeedState(requestType=");
        sb.append(this.f3811a);
        sb.append(", gamesState=");
        sb.append(this.b);
        sb.append(", sportEventCardStyle=");
        sb.append(this.c);
        sb.append(", lottieType=");
        sb.append(this.d);
        sb.append(", hasStream=");
        defpackage.c.j(sb, this.e, ", isNewEventParams=", this.f, ", bettingDisabled=");
        sb.append(this.g);
        sb.append(", champImagesHolder=");
        sb.append(this.h);
        sb.append(", specialEvents=");
        sb.append(this.i);
        sb.append(", supportRtl=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
