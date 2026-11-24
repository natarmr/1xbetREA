package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class whv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39185a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;

    public whv(int i, int i2, long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f39185a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whv)) {
            return false;
        }
        whv whvVar = (whv) obj;
        return this.f39185a == whvVar.f39185a && this.b == whvVar.b && this.c == whvVar.c && Intrinsics.d(this.d, whvVar.d) && Intrinsics.d(this.e, whvVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, rw2.b(Integer.hashCode(this.f39185a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f39185a, this.b, "GroupStageScreenParams(eventId=", ", sportId=");
        w6x.w(this.c, ", champId=", ", selectedGroup=", this.d, sbQ);
        return rw2.o(sbQ, ", screenName=", this.e, Separators.RPAREN);
    }
}
