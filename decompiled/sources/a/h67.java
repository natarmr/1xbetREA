package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12516a;
    public final String b;

    public h67(String str, String str2) {
        str2.getClass();
        this.f12516a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h67)) {
            return false;
        }
        h67 h67Var = (h67) obj;
        return this.f12516a.equals(h67Var.f12516a) && Intrinsics.d(this.b, h67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12516a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OpenDeepLink(deepLink=", this.f12516a, ", winBackAnalytics=", this.b, Separators.RPAREN);
    }
}
