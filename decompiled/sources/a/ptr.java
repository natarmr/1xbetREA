package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ptr implements hur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27578a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final byte e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public ptr(int i, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.f27578a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = i;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptr)) {
            return false;
        }
        ptr ptrVar = (ptr) obj;
        return this.f27578a == ptrVar.f27578a && this.b == ptrVar.b && this.c == ptrVar.c && Intrinsics.d(this.d, ptrVar.d) && this.e == ptrVar.e && this.f == ptrVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f27578a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BetGroup(multiline=", ", blockAvailable=", ", visible=", this.f27578a, this.b);
        vqd.y(sbQ, ", betGroupList=", this.d, ", maxRow=", this.c);
        return ohs0.k(this.e, ", showMoreAvailable=", Separators.RPAREN, sbQ, this.f);
    }
}
