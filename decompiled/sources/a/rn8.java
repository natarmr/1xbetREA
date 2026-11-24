package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rn8 implements tn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f30776a;
    public final int b;

    public rn8(int i, a4x a4xVar) {
        a4xVar.getClass();
        this.f30776a = a4xVar;
        this.b = i;
    }

    @Override // a.tn8
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn8)) {
            return false;
        }
        rn8 rn8Var = (rn8) obj;
        return Intrinsics.d(this.f30776a, rn8Var.f30776a) && this.b == rn8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f30776a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(players=" + this.f30776a + ", selectedPage=" + this.b + Separators.RPAREN;
    }
}
