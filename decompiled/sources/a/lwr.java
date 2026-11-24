package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lwr implements mwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20778a;
    public final List b;
    public final ArrayList c;

    public lwr(String str, ArrayList arrayList, List list) {
        str.getClass();
        list.getClass();
        this.f20778a = str;
        this.b = list;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwr)) {
            return false;
        }
        lwr lwrVar = (lwr) obj;
        return Intrinsics.d(this.f20778a, lwrVar.f20778a) && Intrinsics.d(this.b, lwrVar.b) && this.c.equals(lwrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f20778a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.n(defpackage.c.f("SecondTeam(playerName=", this.f20778a, ", firstRowPlayerCards=", this.b, ", secondRowPlayerCards="), this.c, Separators.RPAREN);
    }
}
