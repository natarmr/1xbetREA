package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class odw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25096a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final List f;

    public odw(int i, long j, long j2, String str, String str2, List list) {
        list.getClass();
        this.f25096a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odw)) {
            return false;
        }
        odw odwVar = (odw) obj;
        return this.f25096a == odwVar.f25096a && this.b.equals(odwVar.b) && this.c.equals(odwVar.c) && this.d == odwVar.d && this.e == odwVar.e && Intrinsics.d(this.f, odwVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, rw2.b(ua80.b(ua80.b(Long.hashCode(this.f25096a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f25096a, "HltvAwardsNomineesModel(id=", ", name=", this.b);
        hne.B(sbO, ", playerImage=", this.c, ", playerFeedId=");
        ua80.v(sbO, this.d, ", place=", this.e);
        return ohs0.s(sbO, ", statInfo=", this.f, Separators.RPAREN);
    }
}
