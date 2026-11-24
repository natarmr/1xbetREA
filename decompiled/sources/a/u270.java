package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u270 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34933a;
    public final List b;
    public final zd70 c;
    public final w270 d;

    public u270(String str, List list, zd70 zd70Var, w270 w270Var) {
        this.f34933a = str;
        this.b = list;
        this.c = zd70Var;
        this.d = w270Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u270)) {
            return false;
        }
        u270 u270Var = (u270) obj;
        return Intrinsics.d(this.f34933a, u270Var.f34933a) && Intrinsics.d(this.b, u270Var.b) && this.c == u270Var.c && this.d == u270Var.d;
    }

    public final int hashCode() {
        String str = this.f34933a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        zd70 zd70Var = this.c;
        int iHashCode3 = (iHashCode2 + (zd70Var == null ? 0 : zd70Var.hashCode())) * 31;
        w270 w270Var = this.d;
        return iHashCode3 + (w270Var != null ? w270Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("OneXGamesSearchQuery(nameSubstr=", this.f34933a, ", categoryIds=", this.b, ", winCoeffFilter=");
        sbF.append(this.c);
        sbF.append(", sort=");
        sbF.append(this.d);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
