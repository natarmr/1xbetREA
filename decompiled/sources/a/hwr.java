package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hwr implements mwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13778a;
    public final List b;
    public final ArrayList c;

    public hwr(String str, ArrayList arrayList, List list) {
        str.getClass();
        list.getClass();
        this.f13778a = str;
        this.b = list;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwr)) {
            return false;
        }
        hwr hwrVar = (hwr) obj;
        return Intrinsics.d(this.f13778a, hwrVar.f13778a) && Intrinsics.d(this.b, hwrVar.b) && this.c.equals(hwrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f13778a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.n(defpackage.c.f("FirstTeam(playerName=", this.f13778a, ", firstRowPlayerCards=", this.b, ", secondRowPlayerCards="), this.c, Separators.RPAREN);
    }
}
