package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u6u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35155a;
    public final jkm b;
    public final boolean c;
    public final boolean d;

    public u6u0(List list, jkm jkmVar, boolean z, boolean z2) {
        list.getClass();
        this.f35155a = list;
        this.b = jkmVar;
        this.c = z;
        this.d = z2;
    }

    public static u6u0 a(u6u0 u6u0Var, ArrayList arrayList, boolean z, boolean z2, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = u6u0Var.f35155a;
        }
        jkm jkmVar = u6u0Var.b;
        u6u0Var.getClass();
        list.getClass();
        return new u6u0(list, jkmVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6u0)) {
            return false;
        }
        u6u0 u6u0Var = (u6u0) obj;
        return Intrinsics.d(this.f35155a, u6u0Var.f35155a) && this.b.equals(u6u0Var.b) && this.c == u6u0Var.c && this.d == u6u0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f35155a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VenuesContentStateModel(venues=");
        sb.append(this.f35155a);
        sb.append(", lottieConfig=");
        sb.append(this.b);
        sb.append(", hasError=");
        return ohs0.p(", isLoading=", Separators.RPAREN, sb, this.c, this.d);
    }
}
