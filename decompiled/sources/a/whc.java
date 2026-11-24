package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class whc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39160a;
    public final long b;
    public final long c;
    public final String d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public whc(long j, long j2, long j3, String str, List list, boolean z, boolean z2, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.f39160a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = str2;
    }

    public static whc a(whc whcVar, long j, String str, ArrayList arrayList, boolean z, int i) {
        long j2 = whcVar.f39160a;
        long j3 = whcVar.b;
        if ((i & 4) != 0) {
            j = whcVar.c;
        }
        long j4 = j;
        if ((i & 8) != 0) {
            str = whcVar.d;
        }
        String str2 = str;
        List list = (i & 16) != 0 ? whcVar.e : arrayList;
        boolean z2 = (i & 32) != 0 ? whcVar.f : z;
        boolean z3 = whcVar.g;
        String str3 = whcVar.h;
        whcVar.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        return new whc(j2, j3, j4, str2, list, z2, z3, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whc)) {
            return false;
        }
        whc whcVar = (whc) obj;
        return this.f39160a == whcVar.f39160a && this.b == whcVar.b && this.c == whcVar.c && Intrinsics.d(this.d, whcVar.d) && Intrinsics.d(this.e, whcVar.e) && this.f == whcVar.f && this.g == whcVar.g && Intrinsics.d(this.h, whcVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(brm0.e(dw9.a(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f39160a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f39160a, "ChooseLossLimitEeState(pendingValue=", ", initialValue=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", chosenLimitValue=", this.c, ", enteredLimitValue=");
        cs0.y(this.d, ", availableList=", ", isLoading=", sbQ, this.e);
        ua80.u(", freeValue=", ", currency=", sbQ, this.f, this.g);
        return axq.n(sbQ, this.h, Separators.RPAREN);
    }
}
