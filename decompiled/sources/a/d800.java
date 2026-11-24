package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d800 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5620a;
    public final List b;
    public final List c;

    public d800(String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f5620a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d800)) {
            return false;
        }
        d800 d800Var = (d800) obj;
        return this.f5620a.equals(d800Var.f5620a) && Intrinsics.d(this.b, d800Var.b) && Intrinsics.d(this.c, d800Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f5620a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(defpackage.c.f("LineUpInfoModel(teamId=", this.f5620a, ", lineUps=", this.b, ", missingPlayers="), this.c, Separators.RPAREN);
    }
}
