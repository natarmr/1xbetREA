package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l4l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19411a;
    public final String b;
    public final String c;

    public l4l(String str, String str2, String str3) {
        str3.getClass();
        this.f19411a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4l)) {
            return false;
        }
        l4l l4lVar = (l4l) obj;
        return this.f19411a.equals(l4lVar.f19411a) && this.b.equals(l4lVar.b) && Intrinsics.d(this.c, l4lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f19411a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("DotaHeroParamsUiModel(image=", this.f19411a, ", playerName=", this.b, ", heroName="), this.c, Separators.RPAREN);
    }
}
