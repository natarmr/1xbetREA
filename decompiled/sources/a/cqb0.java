package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cqb0 implements dqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4785a;
    public final zpb0 b;

    public cqb0(String str, zpb0 zpb0Var) {
        str.getClass();
        this.f4785a = str;
        this.b = zpb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqb0)) {
            return false;
        }
        cqb0 cqb0Var = (cqb0) obj;
        return Intrinsics.d(this.f4785a, cqb0Var.f4785a) && this.b == cqb0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4785a.hashCode() * 31);
    }

    public final String toString() {
        return "Title(title=" + this.f4785a + ", align=" + this.b + Separators.RPAREN;
    }
}
