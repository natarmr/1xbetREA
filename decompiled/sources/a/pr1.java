package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pr1 implements rr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27442a;
    public final unm b;

    public pr1(String str, unm unmVar) {
        str.getClass();
        this.f27442a = str;
        this.b = unmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr1)) {
            return false;
        }
        pr1 pr1Var = (pr1) obj;
        return Intrinsics.d(this.f27442a, pr1Var.f27442a) && this.b.equals(pr1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27442a.hashCode() * 31);
    }

    public final String toString() {
        return "Progress(text=" + this.f27442a + ", progressModel=" + this.b + Separators.RPAREN;
    }
}
