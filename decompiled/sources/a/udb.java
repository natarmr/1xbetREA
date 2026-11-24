package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class udb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35469a;
    public final String b;
    public final List c;

    public udb(String str, List list, int i) {
        list.getClass();
        this.f35469a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udb)) {
            return false;
        }
        udb udbVar = (udb) obj;
        return this.f35469a == udbVar.f35469a && this.b.equals(udbVar.b) && Intrinsics.d(this.c, udbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f35469a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(vqd.r(this.f35469a, "ChampMenuModel(type=", ", name=", this.b, ", selectors="), this.c, Separators.RPAREN);
    }
}
