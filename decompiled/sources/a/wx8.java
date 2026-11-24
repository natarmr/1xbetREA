package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wx8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39919a;
    public final boolean b;
    public final List c;
    public final Set d;

    public wx8(boolean z, boolean z2, List list, Set set) {
        list.getClass();
        set.getClass();
        this.f39919a = z;
        this.b = z2;
        this.c = list;
        this.d = set;
    }

    public static wx8 a(wx8 wx8Var, boolean z, boolean z2, List list, int i) {
        if ((i & 4) != 0) {
            list = wx8Var.c;
        }
        Set set = wx8Var.d;
        list.getClass();
        set.getClass();
        return new wx8(z, z2, list, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx8)) {
            return false;
        }
        wx8 wx8Var = (wx8) obj;
        return this.f39919a == wx8Var.f39919a && this.b == wx8Var.b && Intrinsics.d(this.c, wx8Var.c) && Intrinsics.d(this.d, wx8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(brm0.e(Boolean.hashCode(this.f39919a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ContentState(isError=", ", isLoading=", ", games=", this.f39919a, this.b);
        sbQ.append(this.c);
        sbQ.append(", favoriteGames=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
