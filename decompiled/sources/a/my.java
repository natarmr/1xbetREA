package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22581a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public my(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f22581a = z;
        this.b = list;
        this.c = z2;
        this.d = z3;
    }

    public static my a(my myVar, List list, boolean z, int i) {
        if ((i & 2) != 0) {
            list = myVar.b;
        }
        boolean z2 = myVar.d;
        myVar.getClass();
        list.getClass();
        return new my(list, false, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my)) {
            return false;
        }
        my myVar = (my) obj;
        return this.f22581a == myVar.f22581a && Intrinsics.d(this.b, myVar.b) && this.c == myVar.c && this.d == myVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(dw9.a(Boolean.hashCode(this.f22581a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalInfoState(isLoading=");
        sb.append(this.f22581a);
        sb.append(", additionalInfo=");
        sb.append(this.b);
        sb.append(", isError=");
        return ohs0.p(", rtlSupport=", Separators.RPAREN, sb, this.c, this.d);
    }
}
