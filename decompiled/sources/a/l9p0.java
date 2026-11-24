package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19667a;
    public final List b;
    public final List c;

    public l9p0(String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f19667a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9p0)) {
            return false;
        }
        l9p0 l9p0Var = (l9p0) obj;
        return this.f19667a.equals(l9p0Var.f19667a) && Intrinsics.d(this.b, l9p0Var.b) && Intrinsics.d(this.c, l9p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f19667a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(defpackage.c.f("TeamDetailsGameTeamModel(name=", this.f19667a, ", imageList=", this.b, ", idList="), this.c, Separators.RPAREN);
    }
}
