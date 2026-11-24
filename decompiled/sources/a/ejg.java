package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ejg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f7908a;
    public final String b;
    public final boolean c;

    public ejg(ygq0 ygq0Var, String str, boolean z) {
        str.getClass();
        this.f7908a = ygq0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejg)) {
            return false;
        }
        ejg ejgVar = (ejg) obj;
        return this.f7908a == ejgVar.f7908a && Intrinsics.d(this.b, ejgVar.b) && this.c == ejgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f7908a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampsTimeFilterItem(filter=");
        sb.append(this.f7908a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", selected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
