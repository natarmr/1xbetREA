package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j8b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16074a;
    public final String b;
    public final List c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;

    public j8b(long j, String str, List list, long j2, long j3, long j4) {
        str.getClass();
        list.getClass();
        this.f16074a = j;
        this.b = str;
        this.c = list;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = list.isEmpty();
    }

    public static j8b a(j8b j8bVar, List list) {
        long j = j8bVar.f16074a;
        String str = j8bVar.b;
        long j2 = j8bVar.d;
        long j3 = j8bVar.e;
        long j4 = j8bVar.f;
        str.getClass();
        list.getClass();
        return new j8b(j, str, list, j2, j3, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8b)) {
            return false;
        }
        j8b j8bVar = (j8b) obj;
        return this.f16074a == j8bVar.f16074a && Intrinsics.d(this.b, j8bVar.b) && Intrinsics.d(this.c, j8bVar.c) && this.d == j8bVar.d && this.e == j8bVar.e && this.f == j8bVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + rw2.b(rw2.b(dw9.a(ua80.b(Long.hashCode(this.f16074a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f16074a, "CategoryWithGamesModel(id=", ", title=", this.b);
        sbO.append(", games=");
        sbO.append(this.c);
        sbO.append(", partId=");
        sbO.append(this.d);
        kng0.A(sbO, ", partType=", this.e, ", categoryIds=");
        return brm0.k(this.f, Separators.RPAREN, sbO);
    }
}
