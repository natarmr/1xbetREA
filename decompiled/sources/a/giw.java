package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class giw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11368a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final Set f;
    public final List g;

    public giw(long j, String str, String str2, String str3, List list, List list2, Set set) {
        list.getClass();
        set.getClass();
        list2.getClass();
        this.f11368a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = set;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giw)) {
            return false;
        }
        giw giwVar = (giw) obj;
        return this.f11368a == giwVar.f11368a && this.b.equals(giwVar.b) && this.c.equals(giwVar.c) && this.d.equals(giwVar.d) && Intrinsics.d(this.e, giwVar.e) && Intrinsics.d(this.f, giwVar.f) && Intrinsics.d(this.g, giwVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ohs0.g(this.f, dw9.a(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f11368a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f11368a, "HomeEventsRawModel(champId=", ", name=", this.b);
        f140.v(sbO, ", smallImage=", this.c, ", champIcon=", this.d);
        sbO.append(", gameEvents=");
        sbO.append(this.e);
        sbO.append(", mainEventGameIds=");
        sbO.append(this.f);
        return ohs0.s(sbO, ", fighterImages=", this.g, Separators.RPAREN);
    }
}
