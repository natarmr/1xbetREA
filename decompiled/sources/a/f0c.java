package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f0c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f8710a;
    public final List b;
    public final List c;

    public f0c(swp0 swp0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f8710a = swp0Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0c)) {
            return false;
        }
        f0c f0cVar = (f0c) obj;
        return this.f8710a.equals(f0cVar.f8710a) && Intrinsics.d(this.b, f0cVar.b) && Intrinsics.d(this.c, f0cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f8710a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckCurrentPasswordModel(token=");
        sb.append(this.f8710a);
        sb.append(", activationTypes=");
        sb.append(this.b);
        sb.append(", activationTypesRepeat=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
