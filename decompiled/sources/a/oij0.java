package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oij0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nij0 f25315a;
    public final List b;
    public final List c;
    public final float d;
    public final float e;
    public final long f;
    public final mij0 g;

    public oij0(nij0 nij0Var, List list, List list2, float f, float f2, long j, mij0 mij0Var) {
        list.getClass();
        list2.getClass();
        this.f25315a = nij0Var;
        this.b = list;
        this.c = list2;
        this.d = f;
        this.e = f2;
        this.f = j;
        this.g = mij0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oij0)) {
            return false;
        }
        oij0 oij0Var = (oij0) obj;
        return this.f25315a == oij0Var.f25315a && Intrinsics.d(this.b, oij0Var.b) && Intrinsics.d(this.c, oij0Var.c) && Float.compare(this.d, oij0Var.d) == 0 && Float.compare(this.e, oij0Var.e) == 0 && this.f == oij0Var.f && this.g == oij0Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + rw2.b(defpackage.c.a(defpackage.c.a(dw9.a(dw9.a(this.f25315a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), 31, this.f);
    }

    public final String toString() {
        return "SettoeMezzoModel(matchState=" + this.f25315a + ", playerCardList=" + this.b + ", dealerCardList=" + this.c + ", playerScore=" + this.d + ", dealerScore=" + this.e + ", timeSec=" + this.f + ", champType=" + this.g + Separators.RPAREN;
    }
}
