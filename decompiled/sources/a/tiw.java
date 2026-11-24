package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tiw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34025a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final List f;
    public final Set g;

    public tiw(long j, String str, String str2, String str3, List list, List list2, Set set) {
        str.getClass();
        list2.getClass();
        set.getClass();
        this.f34025a = list;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = list2;
        this.g = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tiw)) {
            return false;
        }
        tiw tiwVar = (tiw) obj;
        return this.f34025a.equals(tiwVar.f34025a) && Intrinsics.d(this.b, tiwVar.b) && this.c.equals(tiwVar.c) && this.d == tiwVar.d && this.e.equals(tiwVar.e) && Intrinsics.d(this.f, tiwVar.f) && Intrinsics.d(this.g, tiwVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(ua80.b(rw2.b(ua80.b(ua80.b(this.f34025a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("HomeGameEventsModel(games=", ", champImage=", this.b, this.f34025a, ", champName=");
        defpackage.c.i(sbO, this.d, this.c, ", champId=");
        ua80.t(", champIcon=", this.e, ", fighterImages=", sbO, this.f);
        sbO.append(", mainEventGameIds=");
        sbO.append(this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
