package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sy30 implements wy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33007a;
    public final String b;

    public sy30(int i, String str) {
        htz htzVar = iz30.f15618a;
        str.getClass();
        this.f33007a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy30)) {
            return false;
        }
        sy30 sy30Var = (sy30) obj;
        htz htzVar = iz30.f15618a;
        return this.f33007a == sy30Var.f33007a && Intrinsics.d(this.b, sy30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + twn.a(this.f33007a, iz30.c.hashCode() * 31, 31);
    }

    @Override // a.wy30
    public final iz30 m() {
        return iz30.c;
    }

    public final String toString() {
        iz30 iz30Var = iz30.c;
        StringBuilder sb = new StringBuilder("SpecialEventClicked(menuItemModel=");
        sb.append(iz30Var);
        sb.append(", eventId=");
        sb.append(this.f33007a);
        sb.append(", title=");
        return axq.n(sb, this.b, Separators.RPAREN);
    }
}
