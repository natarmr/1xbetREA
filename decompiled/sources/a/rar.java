package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30150a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public rar(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f30150a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public static rar a(rar rarVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 2) != 0) {
            z2 = rarVar.b;
        }
        if ((i & 4) != 0) {
            z3 = rarVar.c;
        }
        List list = rarVar.d;
        rarVar.getClass();
        list.getClass();
        return new rar(list, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rar)) {
            return false;
        }
        rar rarVar = (rar) obj;
        return this.f30150a == rarVar.f30150a && this.b == rarVar.b && this.c == rarVar.c && Intrinsics.d(this.d, rarVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f30150a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FullDescriptionState(isLoading=", ", isError=", ", isEmpty=", this.f30150a, this.b);
        sbQ.append(this.c);
        sbQ.append(", fullDescription=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
