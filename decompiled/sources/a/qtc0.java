package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qtc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29293a;
    public final String b;
    public final String c;

    public qtc0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f29293a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtc0)) {
            return false;
        }
        qtc0 qtc0Var = (qtc0) obj;
        return Intrinsics.d(this.f29293a, qtc0Var.f29293a) && this.b.equals(qtc0Var.b) && Intrinsics.d(this.c, qtc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f29293a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("PromoContent(link=", this.f29293a, ", title=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
