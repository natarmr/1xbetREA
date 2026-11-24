package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class prs0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27482a;
    public final Object b;
    public final Object c;

    public prs0(Object obj, Object obj2, Object obj3) {
        this.f27482a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prs0)) {
            return false;
        }
        prs0 prs0Var = (prs0) obj;
        return Intrinsics.d(this.f27482a, prs0Var.f27482a) && Intrinsics.d(this.b, prs0Var.b) && Intrinsics.d(this.c, prs0Var.c);
    }

    public final int hashCode() {
        Object obj = this.f27482a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return Separators.LPAREN + this.f27482a + ", " + this.b + ", " + this.c + ')';
    }
}
