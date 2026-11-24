package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m8h0 implements f9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21370a;
    public final Set b;
    public final boolean c;

    public m8h0(String str, Set set, boolean z) {
        str.getClass();
        set.getClass();
        this.f21370a = str;
        this.b = set;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8h0)) {
            return false;
        }
        m8h0 m8h0Var = (m8h0) obj;
        return Intrinsics.d(this.f21370a, m8h0Var.f21370a) && Intrinsics.d(this.b, m8h0Var.b) && this.c == m8h0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ohs0.g(this.b, this.f21370a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Games(title=");
        sb.append(this.f21370a);
        sb.append(", countries=");
        sb.append(this.b);
        sb.append(", top=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public m8h0(String str) {
        this(str, xun.f41520a, false);
    }
}
