package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jfo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfo0 f16439a;
    public final String b;
    public final boolean c;

    public jfo0(bfo0 bfo0Var, String str, boolean z) {
        str.getClass();
        this.f16439a = bfo0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfo0)) {
            return false;
        }
        jfo0 jfo0Var = (jfo0) obj;
        return this.f16439a == jfo0Var.f16439a && Intrinsics.d(this.b, jfo0Var.b) && this.c == jfo0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f16439a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabUiModel(type=");
        sb.append(this.f16439a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", selected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
