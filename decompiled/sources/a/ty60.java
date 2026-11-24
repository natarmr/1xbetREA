package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ty60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34739a;
    public final List b;
    public final int c;
    public final urs d;
    public final m4s e;
    public final int f;
    public final List g;

    public ty60(boolean z, List list, int i, urs ursVar, m4s m4sVar, int i2, List list2) {
        list.getClass();
        ursVar.getClass();
        m4sVar.getClass();
        list2.getClass();
        this.f34739a = z;
        this.b = list;
        this.c = i;
        this.d = ursVar;
        this.e = m4sVar;
        this.f = i2;
        this.g = list2;
    }

    public static ty60 a(ty60 ty60Var, ArrayList arrayList, int i, urs ursVar, m4s m4sVar, int i2, List list, int i3) {
        List list2 = arrayList;
        boolean z = ty60Var.f34739a;
        if ((i3 & 2) != 0) {
            list2 = ty60Var.b;
        }
        if ((i3 & 4) != 0) {
            i = ty60Var.c;
        }
        if ((i3 & 8) != 0) {
            ursVar = ty60Var.d;
        }
        if ((i3 & 16) != 0) {
            m4sVar = ty60Var.e;
        }
        if ((i3 & 32) != 0) {
            i2 = ty60Var.f;
        }
        if ((i3 & 64) != 0) {
            list = ty60Var.g;
        }
        List list3 = list;
        ty60Var.getClass();
        list2.getClass();
        ursVar.getClass();
        m4sVar.getClass();
        list3.getClass();
        int i4 = i2;
        m4s m4sVar2 = m4sVar;
        urs ursVar2 = ursVar;
        return new ty60(z, list2, i, ursVar2, m4sVar2, i4, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty60)) {
            return false;
        }
        ty60 ty60Var = (ty60) obj;
        return this.f34739a == ty60Var.f34739a && Intrinsics.d(this.b, ty60Var.b) && this.c == ty60Var.c && this.d == ty60Var.d && this.e == ty60Var.e && this.f == ty60Var.f && Intrinsics.d(this.g, ty60Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + twn.a(this.c, dw9.a(Boolean.hashCode(this.f34739a) * 31, 31, this.b), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesFilterStateModel(showGamesCount=");
        sb.append(this.f34739a);
        sb.append(", chipsItems=");
        sb.append(this.b);
        sb.append(", selectedCategory=");
        sb.append(this.c);
        sb.append(", selectedSortType=");
        sb.append(this.d);
        sb.append(", selectedCoefficient=");
        sb.append(this.e);
        sb.append(", counter=");
        sb.append(this.f);
        sb.append(", gameList=");
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
