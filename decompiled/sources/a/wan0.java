package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wan0 implements yan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38838a;
    public final boolean b;

    public wan0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f38838a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wan0)) {
            return false;
        }
        wan0 wan0Var = (wan0) obj;
        return Intrinsics.d(this.f38838a, wan0Var.f38838a) && this.b == wan0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f38838a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSubscriptions(eventCardList=" + this.f38838a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
