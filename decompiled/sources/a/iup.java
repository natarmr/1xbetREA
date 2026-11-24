package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15407a;
    public final String b;
    public final jup c;
    public final jup d;

    public iup(long j, String str, jup jupVar, jup jupVar2) {
        str.getClass();
        this.f15407a = j;
        this.b = str;
        this.c = jupVar;
        this.d = jupVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iup)) {
            return false;
        }
        iup iupVar = (iup) obj;
        return this.f15407a == iupVar.f15407a && Intrinsics.d(this.b, iupVar.b) && this.c.equals(iupVar.c) && this.d.equals(iupVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f15407a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f15407a, "FightStatisticTab(id=", ", title=", this.b);
        sbO.append(", first=");
        sbO.append(this.c);
        sbO.append(", second=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
