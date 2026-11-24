package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aam0 implements cam0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f534a;
    public final List b;
    public final boolean c;

    public aam0(List list, boolean z, boolean z2) {
        list.getClass();
        this.f534a = z;
        this.b = list;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aam0)) {
            return false;
        }
        aam0 aam0Var = (aam0) obj;
        return this.f534a == aam0Var.f534a && Intrinsics.d(this.b, aam0Var.b) && this.c == aam0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dw9.a(Boolean.hashCode(this.f534a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(buttonEnable=");
        sb.append(this.f534a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", forceUpdateAdapter=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
