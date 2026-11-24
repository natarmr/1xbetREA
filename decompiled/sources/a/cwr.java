package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cwr implements ewr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5093a;
    public final List b;
    public final String c;

    public cwr(List list, String str, String str2) {
        str.getClass();
        list.getClass();
        this.f5093a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwr)) {
            return false;
        }
        cwr cwrVar = (cwr) obj;
        return Intrinsics.d(this.f5093a, cwrVar.f5093a) && Intrinsics.d(this.b, cwrVar.b) && this.c.equals(cwrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f5093a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(defpackage.c.f("SecondTeam(teamName=", this.f5093a, ", teamCards=", this.b, ", teamCombination="), this.c, Separators.RPAREN);
    }
}
