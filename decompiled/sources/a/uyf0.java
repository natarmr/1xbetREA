package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uyf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f36485a;
    public final List b;
    public final List c;

    public uyf0(swp0 swp0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f36485a = swp0Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyf0)) {
            return false;
        }
        uyf0 uyf0Var = (uyf0) obj;
        return this.f36485a.equals(uyf0Var.f36485a) && Intrinsics.d(this.b, uyf0Var.b) && Intrinsics.d(this.c, uyf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f36485a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestorePasswordModel(temporaryToken=");
        sb.append(this.f36485a);
        sb.append(", availableCodeTypes=");
        sb.append(this.b);
        sb.append(", availableRepeatCodeTypes=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
