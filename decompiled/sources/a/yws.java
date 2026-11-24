package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43387a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public yws(boolean z, boolean z2, String str, int i) {
        this.f43387a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yws)) {
            return false;
        }
        yws ywsVar = (yws) obj;
        return Intrinsics.d(this.f43387a, ywsVar.f43387a) && this.b == ywsVar.b && this.c == ywsVar.c && this.d == ywsVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, this.f43387a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", authRequired=", Separators.RPAREN, kng0.p(this.b, "GameVideoModel(videoUrl=", this.f43387a, ", zoneId=", ", visible="), this.c, this.d);
    }
}
